package com.capacitorjs.plugins.localnotifications;

import com.getcapacitor.JSObject;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LocalNotificationAttachment {
    private String id;
    private JSONObject options;
    private String url;

    public static List<LocalNotificationAttachment> getAttachments(JSObject jSObject) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSObject jSObject2;
        ArrayList arrayList = new ArrayList();
        try {
            jSONArray = jSObject.getJSONArray("attachments");
        } catch (Exception unused) {
            jSONArray = null;
        }
        if (jSONArray != null) {
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                LocalNotificationAttachment localNotificationAttachment = new LocalNotificationAttachment();
                try {
                    jSONObject = jSONArray.getJSONObject(i4);
                } catch (JSONException unused2) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    try {
                        jSObject2 = JSObject.fromJSONObject(jSONObject);
                    } catch (JSONException unused3) {
                        jSObject2 = null;
                    }
                    localNotificationAttachment.setId(jSObject2.getString("id"));
                    localNotificationAttachment.setUrl(jSObject2.getString("url"));
                    try {
                        localNotificationAttachment.setOptions(jSObject2.getJSONObject("options"));
                    } catch (JSONException unused4) {
                    }
                    arrayList.add(localNotificationAttachment);
                }
            }
        }
        return arrayList;
    }

    public String getId() {
        return this.id;
    }

    public JSONObject getOptions() {
        return this.options;
    }

    public String getUrl() {
        return this.url;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setOptions(JSONObject jSONObject) {
        this.options = jSONObject;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
