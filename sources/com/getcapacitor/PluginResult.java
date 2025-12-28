package com.getcapacitor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class PluginResult {
    private final JSObject json;

    public PluginResult() {
        this(new JSObject());
    }

    public JSObject getWrappedResult() {
        JSObject jSObject = new JSObject();
        jSObject.put("pluginId", this.json.getString("pluginId"));
        jSObject.put("methodName", this.json.getString("methodName"));
        jSObject.put("success", (Object) this.json.getBoolean("success", Boolean.FALSE));
        jSObject.put("data", (Object) this.json.getJSObject("data"));
        jSObject.put("error", (Object) this.json.getJSObject("error"));
        return jSObject;
    }

    /* access modifiers changed from: package-private */
    public PluginResult jsonPut(String str, Object obj) {
        try {
            this.json.put(str, obj);
        } catch (Exception e4) {
            Logger.error(Logger.tags("Plugin"), "", e4);
        }
        return this;
    }

    public PluginResult put(String str, boolean z3) {
        return jsonPut(str, Boolean.valueOf(z3));
    }

    public String toString() {
        return this.json.toString();
    }

    public PluginResult(JSObject jSObject) {
        this.json = jSObject;
    }

    public PluginResult put(String str, double d4) {
        return jsonPut(str, Double.valueOf(d4));
    }

    public PluginResult put(String str, int i4) {
        return jsonPut(str, Integer.valueOf(i4));
    }

    public PluginResult put(String str, long j4) {
        return jsonPut(str, Long.valueOf(j4));
    }

    public PluginResult put(String str, Date date) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        return jsonPut(str, simpleDateFormat.format(date));
    }

    public PluginResult put(String str, Object obj) {
        return jsonPut(str, obj);
    }

    public PluginResult put(String str, PluginResult pluginResult) {
        return jsonPut(str, pluginResult.json);
    }
}
