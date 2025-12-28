package org.apache.cordova.file;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.File;
import org.apache.cordova.CordovaPreferences;
import org.apache.cordova.CordovaResourceApi;
import org.json.JSONObject;

public class ContentFilesystem extends Filesystem {
    private final Context context;

    public ContentFilesystem(Context context2, CordovaResourceApi cordovaResourceApi, CordovaPreferences cordovaPreferences) {
        super(Uri.parse("content://"), "content", cordovaResourceApi, cordovaPreferences);
        this.context = context2;
    }

    private Long resourceSizeForCursor(Cursor cursor) {
        String string;
        int columnIndex = cursor.getColumnIndex("_size");
        if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(string));
    }

    public LocalFilesystemURL URLforFilesystemPath(String str) {
        return null;
    }

    public boolean canRemoveFileAtLocalURL(LocalFilesystemURL localFilesystemURL) {
        return true;
    }

    public String filesystemPathForURL(LocalFilesystemURL localFilesystemURL) {
        File mapUriToFile = this.resourceApi.mapUriToFile(toNativeUri(localFilesystemURL));
        if (mapUriToFile == null) {
            return null;
        }
        return mapUriToFile.getAbsolutePath();
    }

    public JSONObject getFileForLocalURL(LocalFilesystemURL localFilesystemURL, String str, JSONObject jSONObject, boolean z3) {
        throw new UnsupportedOperationException("getFile() not supported for content:. Use resolveLocalFileSystemURL instead.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject getFileMetadataForLocalURL(org.apache.cordova.file.LocalFilesystemURL r8) {
        /*
            r7 = this;
            android.net.Uri r0 = r7.toNativeUri(r8)
            org.apache.cordova.CordovaResourceApi r1 = r7.resourceApi
            java.lang.String r1 = r1.getMimeType(r0)
            android.database.Cursor r2 = r7.openCursorForURL(r0)
            r3 = 0
            if (r2 == 0) goto L_0x0034
            boolean r5 = r2.moveToFirst()     // Catch:{ IOException -> 0x0025 }
            if (r5 == 0) goto L_0x0034
            java.lang.Long r0 = r7.resourceSizeForCursor(r2)     // Catch:{ IOException -> 0x0025 }
            if (r0 == 0) goto L_0x0027
            long r5 = r0.longValue()     // Catch:{ IOException -> 0x0025 }
            goto L_0x0029
        L_0x0023:
            r8 = move-exception
            goto L_0x006f
        L_0x0025:
            r8 = move-exception
            goto L_0x0066
        L_0x0027:
            r5 = -1
        L_0x0029:
            java.lang.Long r0 = r7.lastModifiedDateForCursor(r2)     // Catch:{ IOException -> 0x0025 }
            if (r0 == 0) goto L_0x003c
            long r3 = r0.longValue()     // Catch:{ IOException -> 0x0025 }
            goto L_0x003c
        L_0x0034:
            org.apache.cordova.CordovaResourceApi r5 = r7.resourceApi     // Catch:{ IOException -> 0x0025 }
            org.apache.cordova.CordovaResourceApi$OpenForReadResult r0 = r5.openForRead(r0)     // Catch:{ IOException -> 0x0025 }
            long r5 = r0.length     // Catch:{ IOException -> 0x0025 }
        L_0x003c:
            if (r2 == 0) goto L_0x0041
            r2.close()
        L_0x0041:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r2 = "size"
            r0.put(r2, r5)     // Catch:{ JSONException -> 0x0064 }
            java.lang.String r2 = "type"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x0064 }
            java.lang.String r1 = "name"
            java.lang.String r2 = r7.name     // Catch:{ JSONException -> 0x0064 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0064 }
            java.lang.String r1 = "fullPath"
            java.lang.String r8 = r8.path     // Catch:{ JSONException -> 0x0064 }
            r0.put(r1, r8)     // Catch:{ JSONException -> 0x0064 }
            java.lang.String r8 = "lastModifiedDate"
            r0.put(r8, r3)     // Catch:{ JSONException -> 0x0064 }
            return r0
        L_0x0064:
            r8 = 0
            return r8
        L_0x0066:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0023 }
            r0.<init>()     // Catch:{ all -> 0x0023 }
            r0.initCause(r8)     // Catch:{ all -> 0x0023 }
            throw r0     // Catch:{ all -> 0x0023 }
        L_0x006f:
            if (r2 == 0) goto L_0x0074
            r2.close()
        L_0x0074:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.cordova.file.ContentFilesystem.getFileMetadataForLocalURL(org.apache.cordova.file.LocalFilesystemURL):org.json.JSONObject");
    }

    /* access modifiers changed from: protected */
    public Long lastModifiedDateForCursor(Cursor cursor) {
        String string;
        int columnIndex = cursor.getColumnIndex("date_modified");
        if (columnIndex == -1) {
            columnIndex = cursor.getColumnIndex("last_modified");
        }
        if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(string));
    }

    public LocalFilesystemURL[] listChildren(LocalFilesystemURL localFilesystemURL) {
        throw new UnsupportedOperationException("readEntriesAtLocalURL() not supported for content:. Use resolveLocalFileSystemURL instead.");
    }

    /* access modifiers changed from: protected */
    public Cursor openCursorForURL(Uri uri) {
        try {
            return this.context.getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    public boolean recursiveRemoveFileAtLocalURL(LocalFilesystemURL localFilesystemURL) {
        throw new NoModificationAllowedException("Cannot remove content url");
    }

    public boolean removeFileAtLocalURL(LocalFilesystemURL localFilesystemURL) {
        Uri nativeUri = toNativeUri(localFilesystemURL);
        try {
            this.context.getContentResolver().delete(nativeUri, (String) null, (String[]) null);
            return true;
        } catch (UnsupportedOperationException e4) {
            NoModificationAllowedException noModificationAllowedException = new NoModificationAllowedException("Deleting not supported for content uri: " + nativeUri);
            noModificationAllowedException.initCause(e4);
            throw noModificationAllowedException;
        }
    }

    public LocalFilesystemURL toLocalUri(Uri uri) {
        if (!"content".equals(uri.getScheme())) {
            return null;
        }
        String encodedPath = uri.getEncodedPath();
        if (encodedPath.length() > 0) {
            encodedPath = encodedPath.substring(1);
        }
        Uri.Builder appendPath = createLocalUriBuilder().appendPath(uri.getAuthority());
        if (encodedPath.length() > 0) {
            appendPath.appendEncodedPath(encodedPath);
        }
        return LocalFilesystemURL.parse(appendPath.encodedQuery(uri.getEncodedQuery()).encodedFragment(uri.getEncodedFragment()).build());
    }

    public Uri toNativeUri(LocalFilesystemURL localFilesystemURL) {
        String substring = localFilesystemURL.uri.getEncodedPath().substring(this.name.length() + 2);
        if (substring.length() < 2) {
            return null;
        }
        String str = "content://" + substring;
        String encodedQuery = localFilesystemURL.uri.getEncodedQuery();
        if (encodedQuery != null) {
            str = str + '?' + encodedQuery;
        }
        String encodedFragment = localFilesystemURL.uri.getEncodedFragment();
        if (encodedFragment != null) {
            str = str + '#' + encodedFragment;
        }
        return Uri.parse(str);
    }

    public long truncateFileAtURL(LocalFilesystemURL localFilesystemURL, long j4) {
        throw new NoModificationAllowedException("Couldn't truncate file given its content URI");
    }

    public long writeToFileAtURL(LocalFilesystemURL localFilesystemURL, String str, int i4, boolean z3) {
        throw new NoModificationAllowedException("Couldn't write to file given its content URI");
    }
}
