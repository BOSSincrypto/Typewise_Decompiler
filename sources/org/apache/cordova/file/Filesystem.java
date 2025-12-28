package org.apache.cordova.file;

import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.apache.cordova.CordovaPreferences;
import org.apache.cordova.CordovaResourceApi;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class Filesystem {
    static String DEFAULT_HOSTNAME = "localhost";
    static String SCHEME_HTTPS = "https";
    public final String name;
    protected final CordovaPreferences preferences;
    protected final CordovaResourceApi resourceApi;
    private JSONObject rootEntry;
    protected final Uri rootUri;

    public interface ReadFileCallback {
        void handleData(InputStream inputStream, String str);
    }

    public Filesystem(Uri uri, String str, CordovaResourceApi cordovaResourceApi, CordovaPreferences cordovaPreferences) {
        this.rootUri = uri;
        this.name = str;
        this.resourceApi = cordovaResourceApi;
        this.preferences = cordovaPreferences;
    }

    public static JSONObject makeEntryForURL(LocalFilesystemURL localFilesystemURL, Uri uri) {
        try {
            String str = localFilesystemURL.path;
            String[] split = str.substring(0, str.length() - (str.endsWith("/") ? 1 : 0)).split("/+");
            String str2 = split[split.length - 1];
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isFile", !localFilesystemURL.isDirectory);
            jSONObject.put("isDirectory", localFilesystemURL.isDirectory);
            jSONObject.put("name", str2);
            jSONObject.put("fullPath", str);
            jSONObject.put("filesystemName", localFilesystemURL.fsName);
            jSONObject.put("filesystem", "temporary".equals(localFilesystemURL.fsName) ^ true ? 1 : 0);
            String uri2 = uri.toString();
            if (localFilesystemURL.isDirectory && !uri2.endsWith("/")) {
                uri2 = uri2 + "/";
            }
            jSONObject.put("nativeURL", uri2);
            return jSONObject;
        } catch (JSONException e4) {
            e4.printStackTrace();
            throw new RuntimeException(e4);
        }
    }

    protected static String normalizePath(String str) {
        boolean startsWith = str.startsWith("/");
        if (startsWith) {
            str = str.replaceFirst("/+", "");
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(str.split("/+")));
        int i4 = 0;
        while (i4 < arrayList.size()) {
            if (((String) arrayList.get(i4)).equals("..")) {
                arrayList.remove(i4);
                if (i4 > 0) {
                    arrayList.remove(i4 - 1);
                    i4--;
                }
            }
            i4++;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append("/");
            sb.append((String) it.next());
        }
        if (startsWith) {
            return sb.toString();
        }
        return sb.toString().substring(1);
    }

    /* access modifiers changed from: package-private */
    public abstract LocalFilesystemURL URLforFilesystemPath(String str);

    /* access modifiers changed from: package-private */
    public abstract boolean canRemoveFileAtLocalURL(LocalFilesystemURL localFilesystemURL);

    public JSONObject copyFileToURL(LocalFilesystemURL localFilesystemURL, String str, Filesystem filesystem, LocalFilesystemURL localFilesystemURL2, boolean z3) {
        if (!z3 || filesystem.canRemoveFileAtLocalURL(localFilesystemURL2)) {
            LocalFilesystemURL makeDestinationURL = makeDestinationURL(str, localFilesystemURL2, localFilesystemURL, localFilesystemURL2.isDirectory);
            CordovaResourceApi.OpenForReadResult openForRead = this.resourceApi.openForRead(filesystem.toNativeUri(localFilesystemURL2));
            try {
                this.resourceApi.copyResource(openForRead, getOutputStreamForURL(makeDestinationURL));
                if (z3) {
                    filesystem.removeFileAtLocalURL(localFilesystemURL2);
                }
                return getEntryForLocalURL(makeDestinationURL);
            } catch (IOException e4) {
                openForRead.inputStream.close();
                throw e4;
            }
        } else {
            throw new NoModificationAllowedException("Cannot move file at source URL");
        }
    }

    /* access modifiers changed from: protected */
    public Uri.Builder createLocalUriBuilder() {
        String lowerCase = this.preferences.getString("scheme", SCHEME_HTTPS).toLowerCase();
        String lowerCase2 = this.preferences.getString("hostname", DEFAULT_HOSTNAME).toLowerCase();
        return new Uri.Builder().scheme(lowerCase).authority(lowerCase2).path(LocalFilesystemURL.fsNameToCdvKeyword(this.name));
    }

    public boolean exists(LocalFilesystemURL localFilesystemURL) {
        try {
            getFileMetadataForLocalURL(localFilesystemURL);
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract String filesystemPathForURL(LocalFilesystemURL localFilesystemURL);

    public JSONObject getEntryForLocalURL(LocalFilesystemURL localFilesystemURL) {
        return makeEntryForURL(localFilesystemURL);
    }

    /* access modifiers changed from: package-private */
    public abstract JSONObject getFileForLocalURL(LocalFilesystemURL localFilesystemURL, String str, JSONObject jSONObject, boolean z3);

    /* access modifiers changed from: package-private */
    public abstract JSONObject getFileMetadataForLocalURL(LocalFilesystemURL localFilesystemURL);

    public long getFreeSpaceInBytes() {
        return 0;
    }

    public OutputStream getOutputStreamForURL(LocalFilesystemURL localFilesystemURL) {
        return this.resourceApi.openOutputStream(toNativeUri(localFilesystemURL));
    }

    public JSONObject getParentForLocalURL(LocalFilesystemURL localFilesystemURL) {
        Uri uri = localFilesystemURL.uri;
        String parent = new File(localFilesystemURL.uri.getPath()).getParent();
        if (!"/".equals(parent)) {
            Uri.Builder buildUpon = localFilesystemURL.uri.buildUpon();
            uri = buildUpon.path(parent + '/').build();
        }
        return getEntryForLocalURL(LocalFilesystemURL.parse(uri));
    }

    public JSONObject getRootEntry() {
        if (this.rootEntry == null) {
            this.rootEntry = makeEntryForNativeUri(this.rootUri);
        }
        return this.rootEntry;
    }

    public Uri getRootUri() {
        return this.rootUri;
    }

    /* access modifiers changed from: package-private */
    public abstract LocalFilesystemURL[] listChildren(LocalFilesystemURL localFilesystemURL);

    public LocalFilesystemURL localUrlforFullPath(String str) {
        Uri nativeUriForFullPath = nativeUriForFullPath(str);
        if (nativeUriForFullPath != null) {
            return toLocalUri(nativeUriForFullPath);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public LocalFilesystemURL makeDestinationURL(String str, LocalFilesystemURL localFilesystemURL, LocalFilesystemURL localFilesystemURL2, boolean z3) {
        String str2;
        if ("null".equals(str) || "".equals(str)) {
            str = localFilesystemURL.uri.getLastPathSegment();
        }
        String uri = localFilesystemURL2.uri.toString();
        if (uri.endsWith("/")) {
            str2 = uri + str;
        } else {
            str2 = uri + "/" + str;
        }
        if (z3) {
            str2 = str2 + '/';
        }
        return LocalFilesystemURL.parse(str2);
    }

    public JSONObject makeEntryForFile(File file) {
        return makeEntryForNativeUri(Uri.fromFile(file));
    }

    public JSONObject makeEntryForNativeUri(Uri uri) {
        LocalFilesystemURL localUri = toLocalUri(uri);
        if (localUri == null) {
            return null;
        }
        return makeEntryForURL(localUri, uri);
    }

    public Uri nativeUriForFullPath(String str) {
        if (str == null) {
            return null;
        }
        String encodedPath = Uri.fromFile(new File(str)).getEncodedPath();
        if (encodedPath.startsWith("/")) {
            encodedPath = encodedPath.substring(1);
        }
        return this.rootUri.buildUpon().appendEncodedPath(encodedPath).build();
    }

    public final JSONArray readEntriesAtLocalURL(LocalFilesystemURL localFilesystemURL) {
        LocalFilesystemURL[] listChildren = listChildren(localFilesystemURL);
        JSONArray jSONArray = new JSONArray();
        if (listChildren != null) {
            for (LocalFilesystemURL makeEntryForURL : listChildren) {
                jSONArray.put(makeEntryForURL(makeEntryForURL));
            }
        }
        return jSONArray;
    }

    public void readFileAtURL(LocalFilesystemURL localFilesystemURL, long j4, long j5, ReadFileCallback readFileCallback) {
        CordovaResourceApi.OpenForReadResult openForRead = this.resourceApi.openForRead(toNativeUri(localFilesystemURL));
        if (j5 < 0) {
            j5 = openForRead.length;
        }
        long j6 = j5 - j4;
        if (j4 > 0) {
            try {
                openForRead.inputStream.skip(j4);
            } catch (Throwable th) {
                openForRead.inputStream.close();
                throw th;
            }
        }
        InputStream inputStream = openForRead.inputStream;
        if (j5 < openForRead.length) {
            inputStream = new LimitedInputStream(inputStream, j6);
        }
        readFileCallback.handleData(inputStream, openForRead.mimeType);
        openForRead.inputStream.close();
    }

    /* access modifiers changed from: package-private */
    public abstract boolean recursiveRemoveFileAtLocalURL(LocalFilesystemURL localFilesystemURL);

    /* access modifiers changed from: package-private */
    public abstract boolean removeFileAtLocalURL(LocalFilesystemURL localFilesystemURL);

    public abstract LocalFilesystemURL toLocalUri(Uri uri);

    public abstract Uri toNativeUri(LocalFilesystemURL localFilesystemURL);

    /* access modifiers changed from: package-private */
    public abstract long truncateFileAtURL(LocalFilesystemURL localFilesystemURL, long j4);

    /* access modifiers changed from: package-private */
    public abstract long writeToFileAtURL(LocalFilesystemURL localFilesystemURL, String str, int i4, boolean z3);

    protected class LimitedInputStream extends FilterInputStream {
        long numBytesToRead;

        public LimitedInputStream(InputStream inputStream, long j4) {
            super(inputStream);
            this.numBytesToRead = j4;
        }

        public int read() {
            long j4 = this.numBytesToRead;
            if (j4 <= 0) {
                return -1;
            }
            this.numBytesToRead = j4 - 1;
            return this.in.read();
        }

        public int read(byte[] bArr, int i4, int i5) {
            long j4 = this.numBytesToRead;
            if (j4 <= 0) {
                return -1;
            }
            if (((long) i5) > j4) {
                i5 = (int) j4;
            }
            int read = this.in.read(bArr, i4, i5);
            this.numBytesToRead -= (long) read;
            return read;
        }
    }

    public JSONObject makeEntryForURL(LocalFilesystemURL localFilesystemURL) {
        Uri nativeUri = toNativeUri(localFilesystemURL);
        if (nativeUri == null) {
            return null;
        }
        return makeEntryForURL(localFilesystemURL, nativeUri);
    }
}
