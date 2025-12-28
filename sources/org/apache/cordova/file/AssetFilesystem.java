package org.apache.cordova.file;

import android.content.res.AssetManager;
import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import org.apache.cordova.CordovaPreferences;
import org.apache.cordova.CordovaResourceApi;
import org.apache.cordova.LOG;
import org.json.JSONException;
import org.json.JSONObject;

public class AssetFilesystem extends Filesystem {
    private static final String LOG_TAG = "AssetFilesystem";
    private static Map<String, Long> lengthCache;
    private static Map<String, String[]> listCache;
    private static boolean listCacheFromFile;
    private static Object listCacheLock = new Object();
    private final AssetManager assetManager;

    public AssetFilesystem(AssetManager assetManager2, CordovaResourceApi cordovaResourceApi, CordovaPreferences cordovaPreferences) {
        super(Uri.parse("file:///android_asset/"), "assets", cordovaResourceApi, cordovaPreferences);
        this.assetManager = assetManager2;
    }

    private long getAssetSize(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        lazyInitCaches();
        Map<String, Long> map = lengthCache;
        if (map != null) {
            Long l4 = map.get(str);
            if (l4 != null) {
                return l4.longValue();
            }
            throw new FileNotFoundException("Asset not found: " + str);
        }
        try {
            CordovaResourceApi.OpenForReadResult openForRead = this.resourceApi.openForRead(nativeUriForFullPath(str));
            long j4 = openForRead.length;
            if (j4 < 0) {
                j4 = (long) openForRead.inputStream.available();
            }
            try {
                openForRead.inputStream.close();
            } catch (IOException e4) {
                LOG.d(LOG_TAG, e4.getLocalizedMessage());
            }
            return j4;
        } catch (IOException e5) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("File not found: " + str);
            fileNotFoundException.initCause(e5);
            throw fileNotFoundException;
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    null.inputStream.close();
                } catch (IOException e6) {
                    LOG.d(LOG_TAG, e6.getLocalizedMessage());
                }
            }
            throw th;
        }
    }

    private boolean isDirectory(String str) {
        try {
            if (listAssets(str).length != 0) {
                return true;
            }
            return false;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x004c A[SYNTHETIC, Splitter:B:28:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x005d A[SYNTHETIC, Splitter:B:37:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x006d A[Catch:{ IOException -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x007e A[SYNTHETIC, Splitter:B:47:0x007e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void lazyInitCaches() {
        /*
            r6 = this;
            java.lang.Object r0 = listCacheLock
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.String[]> r1 = listCache     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x008d
            r1 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ ClassNotFoundException -> 0x0045, IOException -> 0x004a, all -> 0x0040 }
            android.content.res.AssetManager r3 = r6.assetManager     // Catch:{ ClassNotFoundException -> 0x0045, IOException -> 0x004a, all -> 0x0040 }
            java.lang.String r4 = "cdvasset.manifest"
            java.io.InputStream r3 = r3.open(r4)     // Catch:{ ClassNotFoundException -> 0x0045, IOException -> 0x004a, all -> 0x0040 }
            r2.<init>(r3)     // Catch:{ ClassNotFoundException -> 0x0045, IOException -> 0x004a, all -> 0x0040 }
            java.lang.Object r1 = r2.readObject()     // Catch:{ ClassNotFoundException -> 0x003e, IOException -> 0x003c }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ ClassNotFoundException -> 0x003e, IOException -> 0x003c }
            listCache = r1     // Catch:{ ClassNotFoundException -> 0x003e, IOException -> 0x003c }
            java.lang.Object r1 = r2.readObject()     // Catch:{ ClassNotFoundException -> 0x003e, IOException -> 0x003c }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ ClassNotFoundException -> 0x003e, IOException -> 0x003c }
            lengthCache = r1     // Catch:{ ClassNotFoundException -> 0x003e, IOException -> 0x003c }
            r1 = 1
            listCacheFromFile = r1     // Catch:{ ClassNotFoundException -> 0x003e, IOException -> 0x003c }
            r2.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0069
        L_0x002c:
            r1 = move-exception
            goto L_0x008f
        L_0x002f:
            r1 = move-exception
            java.lang.String r2 = "AssetFilesystem"
            java.lang.String r1 = r1.getLocalizedMessage()     // Catch:{ all -> 0x002c }
        L_0x0036:
            org.apache.cordova.LOG.d(r2, r1)     // Catch:{ all -> 0x002c }
            goto L_0x0069
        L_0x003a:
            r1 = move-exception
            goto L_0x007c
        L_0x003c:
            r1 = r2
            goto L_0x004a
        L_0x003e:
            r1 = move-exception
            goto L_0x0058
        L_0x0040:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
            goto L_0x007c
        L_0x0045:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
            goto L_0x0058
        L_0x004a:
            if (r1 == 0) goto L_0x0069
            r1.close()     // Catch:{ IOException -> 0x0050 }
            goto L_0x0069
        L_0x0050:
            r1 = move-exception
            java.lang.String r2 = "AssetFilesystem"
            java.lang.String r1 = r1.getLocalizedMessage()     // Catch:{ all -> 0x002c }
            goto L_0x0036
        L_0x0058:
            r1.printStackTrace()     // Catch:{ all -> 0x003a }
            if (r2 == 0) goto L_0x0069
            r2.close()     // Catch:{ IOException -> 0x0061 }
            goto L_0x0069
        L_0x0061:
            r1 = move-exception
            java.lang.String r2 = "AssetFilesystem"
            java.lang.String r1 = r1.getLocalizedMessage()     // Catch:{ all -> 0x002c }
            goto L_0x0036
        L_0x0069:
            java.util.Map<java.lang.String, java.lang.String[]> r1 = listCache     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x008d
            java.lang.String r1 = "AssetFilesystem"
            java.lang.String r2 = "Asset manifest not found. Recursive copies and directory listing will be slow."
            org.apache.cordova.LOG.w((java.lang.String) r1, (java.lang.String) r2)     // Catch:{ all -> 0x002c }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x002c }
            r1.<init>()     // Catch:{ all -> 0x002c }
            listCache = r1     // Catch:{ all -> 0x002c }
            goto L_0x008d
        L_0x007c:
            if (r2 == 0) goto L_0x008c
            r2.close()     // Catch:{ IOException -> 0x0082 }
            goto L_0x008c
        L_0x0082:
            r2 = move-exception
            java.lang.String r3 = "AssetFilesystem"
            java.lang.String r2 = r2.getLocalizedMessage()     // Catch:{ all -> 0x002c }
            org.apache.cordova.LOG.d(r3, r2)     // Catch:{ all -> 0x002c }
        L_0x008c:
            throw r1     // Catch:{ all -> 0x002c }
        L_0x008d:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x008f:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.cordova.file.AssetFilesystem.lazyInitCaches():void");
    }

    private String[] listAssets(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        lazyInitCaches();
        String[] strArr = listCache.get(str);
        if (strArr != null) {
            return strArr;
        }
        if (listCacheFromFile) {
            return new String[0];
        }
        String[] list = this.assetManager.list(str);
        listCache.put(str, list);
        return list;
    }

    /* access modifiers changed from: package-private */
    public LocalFilesystemURL URLforFilesystemPath(String str) {
        return null;
    }

    public boolean canRemoveFileAtLocalURL(LocalFilesystemURL localFilesystemURL) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public String filesystemPathForURL(LocalFilesystemURL localFilesystemURL) {
        return new File(this.rootUri.getPath(), localFilesystemURL.path).toString();
    }

    public JSONObject getFileForLocalURL(LocalFilesystemURL localFilesystemURL, String str, JSONObject jSONObject, boolean z3) {
        LocalFilesystemURL localFilesystemURL2;
        if (jSONObject == null || !jSONObject.optBoolean("create")) {
            if (z3 && !str.endsWith("/")) {
                str = str + "/";
            }
            if (str.startsWith("/")) {
                localFilesystemURL2 = localUrlforFullPath(Filesystem.normalizePath(str));
            } else {
                localFilesystemURL2 = localUrlforFullPath(Filesystem.normalizePath(localFilesystemURL.path + "/" + str));
            }
            getFileMetadataForLocalURL(localFilesystemURL2);
            boolean isDirectory = isDirectory(localFilesystemURL2.path);
            if (z3 && !isDirectory) {
                throw new TypeMismatchException("path doesn't exist or is file");
            } else if (z3 || !isDirectory) {
                return makeEntryForURL(localFilesystemURL2);
            } else {
                throw new TypeMismatchException("path doesn't exist or is directory");
            }
        } else {
            throw new UnsupportedOperationException("Assets are read-only");
        }
    }

    public JSONObject getFileMetadataForLocalURL(LocalFilesystemURL localFilesystemURL) {
        long j4;
        String str;
        JSONObject jSONObject = new JSONObject();
        if (localFilesystemURL.isDirectory) {
            j4 = 0;
        } else {
            j4 = getAssetSize(localFilesystemURL.path);
        }
        try {
            jSONObject.put("size", j4);
            if (localFilesystemURL.isDirectory) {
                str = "text/directory";
            } else {
                str = this.resourceApi.getMimeType(toNativeUri(localFilesystemURL));
            }
            jSONObject.put("type", str);
            jSONObject.put("name", new File(localFilesystemURL.path).getName());
            jSONObject.put("fullPath", localFilesystemURL.path);
            jSONObject.put("lastModifiedDate", 0);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public LocalFilesystemURL[] listChildren(LocalFilesystemURL localFilesystemURL) {
        String substring = localFilesystemURL.path.substring(1);
        if (substring.endsWith("/")) {
            substring = substring.substring(0, substring.length() - 1);
        }
        try {
            String[] listAssets = listAssets(substring);
            LocalFilesystemURL[] localFilesystemURLArr = new LocalFilesystemURL[listAssets.length];
            for (int i4 = 0; i4 < listAssets.length; i4++) {
                localFilesystemURLArr[i4] = localUrlforFullPath(new File(localFilesystemURL.path, listAssets[i4]).getPath());
            }
            return localFilesystemURLArr;
        } catch (IOException e4) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException();
            fileNotFoundException.initCause(e4);
            throw fileNotFoundException;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean recursiveRemoveFileAtLocalURL(LocalFilesystemURL localFilesystemURL) {
        throw new NoModificationAllowedException("Assets are read-only");
    }

    /* access modifiers changed from: package-private */
    public boolean removeFileAtLocalURL(LocalFilesystemURL localFilesystemURL) {
        throw new NoModificationAllowedException("Assets are read-only");
    }

    public LocalFilesystemURL toLocalUri(Uri uri) {
        if (!"file".equals(uri.getScheme())) {
            return null;
        }
        Uri fromFile = Uri.fromFile(new File(uri.getPath()));
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
        if (isDirectory(substring2) || uri.getPath().endsWith("/")) {
            createLocalUriBuilder.appendEncodedPath("");
        }
        return LocalFilesystemURL.parse(createLocalUriBuilder.build());
    }

    public Uri toNativeUri(LocalFilesystemURL localFilesystemURL) {
        return nativeUriForFullPath(localFilesystemURL.path);
    }

    /* access modifiers changed from: package-private */
    public long truncateFileAtURL(LocalFilesystemURL localFilesystemURL, long j4) {
        throw new NoModificationAllowedException("Assets are read-only");
    }

    /* access modifiers changed from: package-private */
    public long writeToFileAtURL(LocalFilesystemURL localFilesystemURL, String str, int i4, boolean z3) {
        throw new NoModificationAllowedException("Assets are read-only");
    }
}
