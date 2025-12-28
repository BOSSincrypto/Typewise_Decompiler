package com.silkimen.cordovahttp;

import android.text.TextUtils;
import android.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

class CordovaHttpResponse {
    private String body;
    private String error;
    private JSONObject fileEntry;
    private boolean hasFailed;
    private Map<String, List<String>> headers;
    private boolean isFileOperation;
    private boolean isRawResponse;
    private byte[] rawData;
    private int status;
    private String url;

    CordovaHttpResponse() {
    }

    private Map<String, String> getFilteredHeaders() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.headers.entrySet()) {
            String str = (String) next.getKey();
            List list = (List) next.getValue();
            if (str != null && !list.isEmpty()) {
                hashMap.put(str.toLowerCase(), TextUtils.join(", ", list));
            }
        }
        return hashMap;
    }

    public boolean hasFailed() {
        return this.hasFailed;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setData(byte[] bArr) {
        this.isRawResponse = true;
        this.rawData = bArr;
    }

    public void setErrorMessage(String str) {
        this.hasFailed = true;
        this.error = str;
    }

    public void setFileEntry(JSONObject jSONObject) {
        this.isFileOperation = true;
        this.fileEntry = jSONObject;
    }

    public void setHeaders(Map<String, List<String>> map) {
        this.headers = map;
    }

    public void setStatus(int i4) {
        this.status = i4;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", this.status);
        jSONObject.put("url", this.url);
        Map<String, List<String>> map = this.headers;
        if (map != null && !map.isEmpty()) {
            jSONObject.put("headers", new JSONObject(getFilteredHeaders()));
        }
        if (this.hasFailed) {
            jSONObject.put("error", this.error);
        } else if (this.isFileOperation) {
            jSONObject.put("file", this.fileEntry);
        } else if (this.isRawResponse) {
            jSONObject.put("data", Base64.encodeToString(this.rawData, 0));
        } else {
            jSONObject.put("data", this.body);
        }
        return jSONObject;
    }
}
