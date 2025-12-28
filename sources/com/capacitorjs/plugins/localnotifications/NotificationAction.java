package com.capacitorjs.plugins.localnotifications;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.Logger;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class NotificationAction {
    private String id;
    private Boolean input;
    private String title;

    public NotificationAction() {
    }

    public static Map<String, NotificationAction[]> buildTypes(JSArray jSArray) {
        HashMap hashMap = new HashMap();
        try {
            for (JSONObject fromJSONObject : jSArray.toList()) {
                JSObject fromJSONObject2 = JSObject.fromJSONObject(fromJSONObject);
                String string = fromJSONObject2.getString("id");
                if (string == null) {
                    return null;
                }
                JSONArray jSONArray = fromJSONObject2.getJSONArray("actions");
                if (jSONArray != null) {
                    int length = jSONArray.length();
                    NotificationAction[] notificationActionArr = new NotificationAction[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        NotificationAction notificationAction = new NotificationAction();
                        JSObject fromJSONObject3 = JSObject.fromJSONObject(jSONArray.getJSONObject(i4));
                        notificationAction.setId(fromJSONObject3.getString("id"));
                        notificationAction.setTitle(fromJSONObject3.getString("title"));
                        notificationAction.setInput(fromJSONObject3.getBool("input"));
                        notificationActionArr[i4] = notificationAction;
                    }
                    hashMap.put(string, notificationActionArr);
                }
            }
        } catch (Exception e4) {
            Logger.error(Logger.tags("LN"), "Error when building action types", e4);
        }
        return hashMap;
    }

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isInput() {
        return Boolean.TRUE.equals(this.input);
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setInput(Boolean bool) {
        this.input = bool;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public NotificationAction(String str, String str2, Boolean bool) {
        this.id = str;
        this.title = str2;
        this.input = bool;
    }
}
