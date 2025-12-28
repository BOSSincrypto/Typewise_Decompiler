package com.ibm.icu.impl;

import Y1.n;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;

public abstract class h {
    public static String a(ICUResourceBundle iCUResourceBundle, String str, String str2, String str3, String str4) {
        ICUResourceBundle iCUResourceBundle2;
        String str5;
        String str6 = null;
        while (true) {
            try {
                ICUResourceBundle V3 = iCUResourceBundle.V(str);
                if (V3 != null) {
                    if (str2 != null) {
                        iCUResourceBundle2 = V3.V(str2);
                    } else {
                        iCUResourceBundle2 = V3;
                    }
                    if (iCUResourceBundle2 != null && (str6 = iCUResourceBundle2.S(str3)) != null) {
                        break;
                    }
                    if (str2 == null) {
                        if (str.equals("Countries")) {
                            str5 = n.b(str3);
                        } else if (str.equals("Languages")) {
                            str5 = n.c(str3);
                        } else {
                            str5 = null;
                        }
                        if (!(str5 == null || (str6 = V3.S(str5)) == null)) {
                            break;
                        }
                    }
                    String S3 = V3.S("Fallback");
                    if (S3 == null) {
                        return str4;
                    }
                    if (S3.length() == 0) {
                        S3 = "root";
                    }
                    if (S3.equals(V3.u().getName())) {
                        return str4;
                    }
                    iCUResourceBundle = (ICUResourceBundle) UResourceBundle.f(iCUResourceBundle.d(), S3);
                } else {
                    return str4;
                }
            } catch (Exception unused) {
            }
        }
        if (str6 == null || str6.length() <= 0) {
            return str4;
        }
        return str6;
    }

    public static String b(String str, ULocale uLocale, String str2, String str3, String str4) {
        return a((ICUResourceBundle) UResourceBundle.f(str, uLocale.getBaseName()), str2, (String) null, str3, str4);
    }
}
