package org.apache.cordova;

import android.util.Base64;
import org.json.JSONArray;
import org.json.JSONObject;

public class CordovaArgs {
    private JSONArray baseArgs;

    public CordovaArgs(JSONArray jSONArray) {
        this.baseArgs = jSONArray;
    }

    public Object get(int i4) {
        return this.baseArgs.get(i4);
    }

    public byte[] getArrayBuffer(int i4) {
        return Base64.decode(this.baseArgs.getString(i4), 0);
    }

    public boolean getBoolean(int i4) {
        return this.baseArgs.getBoolean(i4);
    }

    public double getDouble(int i4) {
        return this.baseArgs.getDouble(i4);
    }

    public int getInt(int i4) {
        return this.baseArgs.getInt(i4);
    }

    public JSONArray getJSONArray(int i4) {
        return this.baseArgs.getJSONArray(i4);
    }

    public JSONObject getJSONObject(int i4) {
        return this.baseArgs.getJSONObject(i4);
    }

    public long getLong(int i4) {
        return this.baseArgs.getLong(i4);
    }

    public String getString(int i4) {
        return this.baseArgs.getString(i4);
    }

    public boolean isNull(int i4) {
        return this.baseArgs.isNull(i4);
    }

    public Object opt(int i4) {
        return this.baseArgs.opt(i4);
    }

    public boolean optBoolean(int i4) {
        return this.baseArgs.optBoolean(i4);
    }

    public double optDouble(int i4) {
        return this.baseArgs.optDouble(i4);
    }

    public int optInt(int i4) {
        return this.baseArgs.optInt(i4);
    }

    public JSONArray optJSONArray(int i4) {
        return this.baseArgs.optJSONArray(i4);
    }

    public JSONObject optJSONObject(int i4) {
        return this.baseArgs.optJSONObject(i4);
    }

    public long optLong(int i4) {
        return this.baseArgs.optLong(i4);
    }

    public String optString(int i4) {
        return this.baseArgs.optString(i4);
    }
}
