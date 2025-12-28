package com.google.android.material.internal;

import android.os.Build;
import java.util.Locale;

public abstract class e {
    private static String a() {
        String str = Build.MANUFACTURER;
        if (str != null) {
            return str.toLowerCase(Locale.ENGLISH);
        }
        return "";
    }

    public static boolean b() {
        return a().equals("meizu");
    }
}
