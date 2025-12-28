package com.silkimen.cordovahttp;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.silkimen.http.HttpRequest;
import com.silkimen.http.TLSConfiguration;
import java.io.File;
import java.io.InputStream;
import java.net.URI;
import org.json.JSONArray;
import org.json.JSONObject;

class CordovaHttpUpload extends CordovaHttpBase {
    private Context applicationContext;
    private JSONArray filePaths;
    private JSONArray uploadNames;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CordovaHttpUpload(String str, JSONObject jSONObject, JSONArray jSONArray, JSONArray jSONArray2, int i4, int i5, boolean z3, String str2, TLSConfiguration tLSConfiguration, Context context, CordovaObservableCallbackContext cordovaObservableCallbackContext) {
        super(HttpRequest.METHOD_POST, str, jSONObject, i4, i5, z3, str2, tLSConfiguration, cordovaObservableCallbackContext);
        this.filePaths = jSONArray;
        this.uploadNames = jSONArray2;
        this.applicationContext = context;
    }

    private String getFileNameFromContentScheme(Uri uri, Context context) {
        Cursor query = context.getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
        if (query == null || !query.moveToFirst()) {
            return null;
        }
        String string = query.getString(query.getColumnIndex("_display_name"));
        query.close();
        return string;
    }

    private String getMimeTypeFromFileName(String str) {
        if (str == null || !str.contains(".")) {
            return null;
        }
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(str.lastIndexOf(46) + 1).toLowerCase());
    }

    /* access modifiers changed from: protected */
    public void sendBody(HttpRequest httpRequest) {
        for (int i4 = 0; i4 < this.filePaths.length(); i4++) {
            String string = this.uploadNames.getString(i4);
            String string2 = this.filePaths.getString(i4);
            Uri parse = Uri.parse(string2);
            if ("file".equals(parse.getScheme())) {
                File file = new File(new URI(string2));
                String trim = file.getName().trim();
                httpRequest.part(string, trim, getMimeTypeFromFileName(trim), file);
            }
            if ("content".equals(parse.getScheme())) {
                InputStream openInputStream = this.applicationContext.getContentResolver().openInputStream(parse);
                String trim2 = getFileNameFromContentScheme(parse, this.applicationContext).trim();
                httpRequest.part(string, trim2, getMimeTypeFromFileName(trim2), openInputStream);
            }
        }
    }
}
