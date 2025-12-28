package org.apache.cordova;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CordovaPreferences {
    private Bundle preferencesBundleExtras;
    private HashMap<String, String> prefs = new HashMap<>(20);

    public boolean contains(String str) {
        if (getString(str, (String) null) != null) {
            return true;
        }
        return false;
    }

    public Map<String, String> getAll() {
        return this.prefs;
    }

    public boolean getBoolean(String str, boolean z3) {
        String str2 = this.prefs.get(str.toLowerCase(Locale.ENGLISH));
        if (str2 != null) {
            return Boolean.parseBoolean(str2);
        }
        return z3;
    }

    public double getDouble(String str, double d4) {
        String str2 = this.prefs.get(str.toLowerCase(Locale.ENGLISH));
        if (str2 != null) {
            return Double.valueOf(str2).doubleValue();
        }
        return d4;
    }

    public int getInteger(String str, int i4) {
        String str2 = this.prefs.get(str.toLowerCase(Locale.ENGLISH));
        if (str2 != null) {
            return (int) Long.decode(str2).longValue();
        }
        return i4;
    }

    public String getString(String str, String str2) {
        String str3 = this.prefs.get(str.toLowerCase(Locale.ENGLISH));
        if (str3 != null) {
            return str3;
        }
        return str2;
    }

    public void set(String str, String str2) {
        this.prefs.put(str.toLowerCase(Locale.ENGLISH), str2);
    }

    public void setPreferencesBundle(Bundle bundle) {
        this.preferencesBundleExtras = bundle;
    }

    public void set(String str, boolean z3) {
        set(str, "" + z3);
    }

    public void set(String str, int i4) {
        set(str, "" + i4);
    }

    public void set(String str, double d4) {
        set(str, "" + d4);
    }
}
