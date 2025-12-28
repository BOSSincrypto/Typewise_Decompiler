package com.getcapacitor;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class JSObject extends JSONObject {
    public JSObject() {
    }

    public static JSObject fromJSONObject(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        ArrayList arrayList = new ArrayList();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        return new JSObject(jSONObject, (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public Boolean getBool(String str) {
        return getBoolean(str, (Boolean) null);
    }

    public Boolean getBoolean(String str, Boolean bool) {
        try {
            return Boolean.valueOf(super.getBoolean(str));
        } catch (JSONException unused) {
            return bool;
        }
    }

    public Integer getInteger(String str) {
        return getInteger(str, (Integer) null);
    }

    public JSObject getJSObject(String str) {
        try {
            return getJSObject(str, (JSObject) null);
        } catch (JSONException unused) {
            return null;
        }
    }

    public String getString(String str) {
        return getString(str, (String) null);
    }

    public JSObject putSafe(String str, Object obj) {
        return (JSObject) super.put(str, obj);
    }

    public JSObject(String str) {
        super(str);
    }

    public Integer getInteger(String str, Integer num) {
        try {
            return Integer.valueOf(super.getInt(str));
        } catch (JSONException unused) {
            return num;
        }
    }

    public JSObject getJSObject(String str, JSObject jSObject) {
        try {
            Object obj = get(str);
            if (obj instanceof JSONObject) {
                Iterator<String> keys = ((JSONObject) obj).keys();
                ArrayList arrayList = new ArrayList();
                while (keys.hasNext()) {
                    arrayList.add(keys.next());
                }
                return new JSObject((JSONObject) obj, (String[]) arrayList.toArray(new String[arrayList.size()]));
            }
        } catch (JSONException unused) {
        }
        return jSObject;
    }

    public String getString(String str, String str2) {
        try {
            return !super.isNull(str) ? super.getString(str) : str2;
        } catch (JSONException unused) {
        }
    }

    public JSObject(JSONObject jSONObject, String[] strArr) {
        super(jSONObject, strArr);
    }

    public JSObject put(String str, boolean z3) {
        try {
            super.put(str, z3);
        } catch (JSONException unused) {
        }
        return this;
    }

    public JSObject put(String str, int i4) {
        try {
            super.put(str, i4);
        } catch (JSONException unused) {
        }
        return this;
    }

    public JSObject put(String str, long j4) {
        try {
            super.put(str, j4);
        } catch (JSONException unused) {
        }
        return this;
    }

    public JSObject put(String str, double d4) {
        try {
            super.put(str, d4);
        } catch (JSONException unused) {
        }
        return this;
    }

    public JSObject put(String str, Object obj) {
        try {
            super.put(str, obj);
        } catch (JSONException unused) {
        }
        return this;
    }

    public JSObject put(String str, String str2) {
        try {
            super.put(str, str2);
        } catch (JSONException unused) {
        }
        return this;
    }
}
