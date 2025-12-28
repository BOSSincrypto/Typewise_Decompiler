package com.getcapacitor;

import com.getcapacitor.util.JSONUtils;
import org.json.JSONObject;

public class PluginConfig {
    private final JSONObject config;

    PluginConfig(JSONObject jSONObject) {
        this.config = jSONObject;
    }

    public String[] getArray(String str) {
        return getArray(str, (String[]) null);
    }

    public boolean getBoolean(String str, boolean z3) {
        return JSONUtils.getBoolean(this.config, str, z3);
    }

    public JSONObject getConfigJSON() {
        return this.config;
    }

    public int getInt(String str, int i4) {
        return JSONUtils.getInt(this.config, str, i4);
    }

    public JSONObject getObject(String str) {
        return JSONUtils.getObject(this.config, str);
    }

    public String getString(String str) {
        return getString(str, (String) null);
    }

    public boolean isEmpty() {
        if (this.config.length() == 0) {
            return true;
        }
        return false;
    }

    public String[] getArray(String str, String[] strArr) {
        return JSONUtils.getArray(this.config, str, strArr);
    }

    public String getString(String str, String str2) {
        return JSONUtils.getString(this.config, str, str2);
    }
}
