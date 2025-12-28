package org.apache.cordova.file;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import org.apache.cordova.CordovaPreferences;
import org.apache.cordova.CordovaResourceApi;
import org.json.JSONException;
import org.json.JSONObject;

public class LocalFilesystem extends Filesystem {
    private final Context context;

    public LocalFilesystem(String str, Context context2, CordovaResourceApi cordovaResourceApi, File file, CordovaPreferences cordovaPreferences) {
        super(Uri.fromFile(file).buildUpon().appendEncodedPath("").build(), str, cordovaResourceApi, cordovaPreferences);
        this.context = context2;
    }

    private void broadcastNewFile(Uri uri) {
        this.context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
    }

    private void copyDirectory(Filesystem filesystem, LocalFilesystemURL localFilesystemURL, File file, boolean z3) {
        String filesystemPathForURL;
        if (z3 && (filesystemPathForURL = filesystem.filesystemPathForURL(localFilesystemURL)) != null) {
            File file2 = new File(filesystemPathForURL);
            if (file.exists()) {
                if (file.list().length <= 0) {
                    file.delete();
                } else {
                    throw new InvalidModificationException("directory is not empty");
                }
            }
            if (file2.renameTo(file)) {
                return;
            }
        }
        if (file.exists()) {
            if (file.list().length > 0) {
                throw new InvalidModificationException("directory is not empty");
            }
        } else if (!file.mkdir()) {
            throw new NoModificationAllowedException("Couldn't create the destination directory");
        }
        for (LocalFilesystemURL localFilesystemURL2 : filesystem.listChildren(localFilesystemURL)) {
            File file3 = new File(file, new File(localFilesystemURL2.path).getName());
            if (localFilesystemURL2.isDirectory) {
                copyDirectory(filesystem, localFilesystemURL2, file3, false);
            } else {
                copyFile(filesystem, localFilesystemURL2, file3, false);
            }
        }
        if (z3) {
            filesystem.recursiveRemoveFileAtLocalURL(localFilesystemURL);
        }
    }

    private void copyFile(Filesystem filesystem, LocalFilesystemURL localFilesystemURL, File file, boolean z3) {
        String filesystemPathForURL;
        if (!z3 || (filesystemPathForURL = filesystem.filesystemPathForURL(localFilesystemURL)) == null || !new File(filesystemPathForURL).renameTo(file)) {
            this.resourceApi.copyResource(this.resourceApi.openForRead(filesystem.toNativeUri(localFilesystemURL)), (OutputStream) new FileOutputStream(file));
            if (z3) {
                filesystem.removeFileAtLocalURL(localFilesystemURL);
            }
        }
    }

    private String fullPathForFilesystemPath(String str) {
        if (str == null || !str.startsWith(this.rootUri.getPath())) {
            return null;
        }
        return str.substring(this.rootUri.getPath().length() - 1);
    }

    private boolean isPublicDirectory(String str) {
        for (File file : this.context.getExternalMediaDirs()) {
            if (file != null && str.startsWith(file.getAbsolutePath())) {
                return true;
            }
        }
        return str.startsWith(Environment.getExternalStorageDirectory().getAbsolutePath());
    }

    public LocalFilesystemURL URLforFilesystemPath(String str) {
        return localUrlforFullPath(fullPathForFilesystemPath(str));
    }

    public boolean canRemoveFileAtLocalURL(LocalFilesystemURL localFilesystemURL) {
        return new File(filesystemPathForURL(localFilesystemURL)).exists();
    }

    public JSONObject copyFileToURL(LocalFilesystemURL localFilesystemURL, String str, Filesystem filesystem, LocalFilesystemURL localFilesystemURL2, boolean z3) {
        if (new File(filesystemPathForURL(localFilesystemURL)).exists()) {
            LocalFilesystemURL makeDestinationURL = makeDestinationURL(str, localFilesystemURL2, localFilesystemURL, localFilesystemURL2.isDirectory);
            Uri nativeUri = toNativeUri(makeDestinationURL);
            Uri nativeUri2 = filesystem.toNativeUri(localFilesystemURL2);
            if (nativeUri.equals(nativeUri2)) {
                throw new InvalidModificationException("Can't copy onto itself");
            } else if (!z3 || filesystem.canRemoveFileAtLocalURL(localFilesystemURL2)) {
                File file = new File(nativeUri.getPath());
                if (file.exists()) {
                    if (!localFilesystemURL2.isDirectory && file.isDirectory()) {
                        throw new InvalidModificationException("Can't copy/move a file to an existing directory");
                    } else if (localFilesystemURL2.isDirectory && file.isFile()) {
                        throw new InvalidModificationException("Can't copy/move a directory to an existing file");
                    }
                }
                if (localFilesystemURL2.isDirectory) {
                    String uri = nativeUri.toString();
                    if (!uri.startsWith(nativeUri2.toString() + '/')) {
                        copyDirectory(filesystem, localFilesystemURL2, file, z3);
                    } else {
                        throw new InvalidModificationException("Can't copy directory into itself");
                    }
                } else {
                    copyFile(filesystem, localFilesystemURL2, file, z3);
                }
                return makeEntryForURL(makeDestinationURL);
            } else {
                throw new InvalidModificationException("Source URL is read-only (cannot move)");
            }
        } else {
            throw new FileNotFoundException("The source does not exist");
        }
    }

    public boolean exists(LocalFilesystemURL localFilesystemURL) {
        return new File(filesystemPathForURL(localFilesystemURL)).exists();
    }

    public String filesystemPathForFullPath(String str) {
        return new File(this.rootUri.getPath(), str).toString();
    }

    public String filesystemPathForURL(LocalFilesystemURL localFilesystemURL) {
        return filesystemPathForFullPath(localFilesystemURL.path);
    }

    public JSONObject getFileForLocalURL(LocalFilesystemURL localFilesystemURL, String str, JSONObject jSONObject, boolean z3) {
        boolean z4;
        LocalFilesystemURL localFilesystemURL2;
        boolean z5 = false;
        if (jSONObject != null) {
            boolean optBoolean = jSONObject.optBoolean("create");
            if (optBoolean) {
                z5 = jSONObject.optBoolean("exclusive");
            }
            z4 = z5;
            z5 = optBoolean;
        } else {
            z4 = false;
        }
        if (!str.contains(":")) {
            if (z3 && !str.endsWith("/")) {
                str = str + "/";
            }
            if (str.startsWith("/")) {
                localFilesystemURL2 = localUrlforFullPath(Filesystem.normalizePath(str));
            } else {
                localFilesystemURL2 = localUrlforFullPath(Filesystem.normalizePath(localFilesystemURL.path + "/" + str));
            }
            File file = new File(filesystemPathForURL(localFilesystemURL2));
            if (z5) {
                if (!z4 || !file.exists()) {
                    if (z3) {
                        file.mkdir();
                    } else {
                        file.createNewFile();
                    }
                    if (!file.exists()) {
                        throw new FileExistsException("create fails");
                    }
                } else {
                    throw new FileExistsException("create/exclusive fails");
                }
            } else if (!file.exists()) {
                throw new FileNotFoundException("path does not exist");
            } else if (z3) {
                if (file.isFile()) {
                    throw new TypeMismatchException("path doesn't exist or is file");
                }
            } else if (file.isDirectory()) {
                throw new TypeMismatchException("path doesn't exist or is directory");
            }
            return makeEntryForURL(localFilesystemURL2);
        }
        throw new EncodingException("This path has an invalid \":\" in it.");
    }

    public JSONObject getFileMetadataForLocalURL(LocalFilesystemURL localFilesystemURL) {
        long j4;
        File file = new File(filesystemPathForURL(localFilesystemURL));
        if (file.exists()) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (file.isDirectory()) {
                    j4 = 0;
                } else {
                    j4 = file.length();
                }
                jSONObject.put("size", j4);
                jSONObject.put("type", this.resourceApi.getMimeType(Uri.fromFile(file)));
                jSONObject.put("name", file.getName());
                jSONObject.put("fullPath", localFilesystemURL.path);
                jSONObject.put("lastModifiedDate", file.lastModified());
                return jSONObject;
            } catch (JSONException unused) {
                return null;
            }
        } else {
            throw new FileNotFoundException("File at " + localFilesystemURL.uri + " does not exist.");
        }
    }

    public long getFreeSpaceInBytes() {
        return DirectoryManager.getFreeSpaceInBytes(this.rootUri.getPath());
    }

    public LocalFilesystemURL[] listChildren(LocalFilesystemURL localFilesystemURL) {
        File file = new File(filesystemPathForURL(localFilesystemURL));
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return null;
            }
            LocalFilesystemURL[] localFilesystemURLArr = new LocalFilesystemURL[listFiles.length];
            for (int i4 = 0; i4 < listFiles.length; i4++) {
                localFilesystemURLArr[i4] = URLforFilesystemPath(listFiles[i4].getPath());
            }
            return localFilesystemURLArr;
        }
        throw new FileNotFoundException();
    }

    public boolean recursiveRemoveFileAtLocalURL(LocalFilesystemURL localFilesystemURL) {
        return removeDirRecursively(new File(filesystemPathForURL(localFilesystemURL)));
    }

    /* access modifiers changed from: protected */
    public boolean removeDirRecursively(File file) {
        if (file.isDirectory()) {
            for (File removeDirRecursively : file.listFiles()) {
                removeDirRecursively(removeDirRecursively);
            }
        }
        if (file.delete()) {
            return true;
        }
        throw new FileExistsException("could not delete: " + file.getName());
    }

    public boolean removeFileAtLocalURL(LocalFilesystemURL localFilesystemURL) {
        File file = new File(filesystemPathForURL(localFilesystemURL));
        if (!file.isDirectory() || file.list().length <= 0) {
            return file.delete();
        }
        throw new InvalidModificationException("You can't delete a directory that is not empty.");
    }

    public LocalFilesystemURL toLocalUri(Uri uri) {
        if (!"file".equals(uri.getScheme())) {
            return null;
        }
        File file = new File(uri.getPath());
        Uri fromFile = Uri.fromFile(file);
        String encodedPath = this.rootUri.getEncodedPath();
        String substring = encodedPath.substring(0, encodedPath.length() - 1);
        if (!fromFile.getEncodedPath().startsWith(substring)) {
            return null;
        }
        String substring2 = fromFile.getEncodedPath().substring(substring.length());
        if (!substring2.isEmpty()) {
            substring2 = substring2.substring(1);
        }
        Uri.Builder createLocalUriBuilder = createLocalUriBuilder();
        if (!substring2.isEmpty()) {
            createLocalUriBuilder.appendEncodedPath(substring2);
        }
        if (file.isDirectory()) {
            createLocalUriBuilder.appendEncodedPath("");
        }
        return LocalFilesystemURL.parse(createLocalUriBuilder.build());
    }

    public Uri toNativeUri(LocalFilesystemURL localFilesystemURL) {
        return nativeUriForFullPath(localFilesystemURL.path);
    }

    public long truncateFileAtURL(LocalFilesystemURL localFilesystemURL, long j4) {
        if (new File(filesystemPathForURL(localFilesystemURL)).exists()) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(filesystemPathForURL(localFilesystemURL), "rw");
            try {
                if (randomAccessFile.length() >= j4) {
                    randomAccessFile.getChannel().truncate(j4);
                    return j4;
                }
                long length = randomAccessFile.length();
                randomAccessFile.close();
                return length;
            } finally {
                randomAccessFile.close();
            }
        } else {
            throw new FileNotFoundException("File at " + localFilesystemURL.uri + " does not exist.");
        }
    }

    public long writeToFileAtURL(LocalFilesystemURL localFilesystemURL, String str, int i4, boolean z3) {
        boolean z4;
        byte[] bArr;
        FileOutputStream fileOutputStream;
        if (i4 > 0) {
            truncateFileAtURL(localFilesystemURL, (long) i4);
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3) {
            bArr = Base64.decode(str, 0);
        } else {
            bArr = str.getBytes(Charset.defaultCharset());
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            String filesystemPathForURL = filesystemPathForURL(localFilesystemURL);
            fileOutputStream = new FileOutputStream(filesystemPathForURL, z4);
            byteArrayInputStream.read(bArr2, 0, length);
            fileOutputStream.write(bArr2, 0, bArr.length);
            fileOutputStream.flush();
            fileOutputStream.close();
            if (isPublicDirectory(filesystemPathForURL)) {
                broadcastNewFile(Uri.fromFile(new File(filesystemPathForURL)));
            }
            return (long) bArr.length;
        } catch (NullPointerException e4) {
            NoModificationAllowedException noModificationAllowedException = new NoModificationAllowedException(localFilesystemURL.toString());
            noModificationAllowedException.initCause(e4);
            throw noModificationAllowedException;
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }
}
