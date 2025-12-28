package com.getcapacitor.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONUtils {
    public static String[] getArray(JSONObject jSONObject, String str, String[] strArr) {
        try {
            JSONArray jSONArray = getDeepestObject(jSONObject, str).getJSONArray(getDeepestKey(str));
            if (jSONArray == null) {
                return strArr;
            }
            int length = jSONArray.length();
            String[] strArr2 = new String[length];
            for (int i4 = 0; i4 < length; i4++) {
                strArr2[i4] = (String) jSONArray.get(i4);
            }
            return strArr2;
        } catch (JSONException unused) {
            return strArr;
        }
    }

    public static boolean getBoolean(JSONObject jSONObject, String str, boolean z3) {
        try {
            return getDeepestObject(jSONObject, str).getBoolean(getDeepestKey(str));
        } catch (JSONException unused) {
            return z3;
        }
    }

    private static String getDeepestKey(String str) {
        String[] split = str.split("\\.");
        if (split.length > 0) {
            return split[split.length - 1];
        }
        return null;
    }

    private static JSONObject getDeepestObject(JSONObject jSONObject, String str) {
        String[] split = str.split("\\.");
        for (int i4 = 0; i4 < split.length - 1; i4++) {
            jSONObject = jSONObject.getJSONObject(split[i4]);
        }
        return jSONObject;
    }

    public static int getInt(JSONObject jSONObject, String str, int i4) {
        try {
            return getDeepestObject(jSONObject, str).getInt(getDeepestKey(str));
        } catch (JSONException unused) {
            return i4;
        }
    }

    public static JSONObject getObject(JSONObject jSONObject, String str) {
        try {
            return getDeepestObject(jSONObject, str).getJSONObject(getDeepestKey(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String getString(JSONObject jSONObject, String str, String str2) {
        try {
            String string = getDeepestObject(jSONObject, str).getString(getDeepestKey(str));
            if (string == null) {
                return str2;
            }
            return string;
        } catch (JSONException unused) {
            return str2;
        }
    }
}
