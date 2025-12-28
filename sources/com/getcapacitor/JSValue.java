package com.getcapacitor;

import org.json.JSONException;

public class JSValue {
    private final Object value;

    public JSValue(PluginCall pluginCall, String str) {
        this.value = toValue(pluginCall, str);
    }

    private Object toValue(PluginCall pluginCall, String str) {
        JSArray array = pluginCall.getArray(str, (JSArray) null);
        if (array != null) {
            return array;
        }
        JSObject object = pluginCall.getObject(str, (JSObject) null);
        if (object != null) {
            return object;
        }
        String string = pluginCall.getString(str, (String) null);
        if (string != null) {
            return string;
        }
        return pluginCall.getData().opt(str);
    }

    public Object getValue() {
        return this.value;
    }

    public JSArray toJSArray() {
        Object obj = this.value;
        if (obj instanceof JSArray) {
            return (JSArray) obj;
        }
        throw new JSONException("JSValue could not be coerced to JSArray.");
    }

    public JSObject toJSObject() {
        Object obj = this.value;
        if (obj instanceof JSObject) {
            return (JSObject) obj;
        }
        throw new JSONException("JSValue could not be coerced to JSObject.");
    }

    public String toString() {
        return getValue().toString();
    }
}
