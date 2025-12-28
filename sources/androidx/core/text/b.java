package androidx.core.text;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static Method f5134a;

    static class a {
        static String a(Locale locale) {
            return locale.getScript();
        }
    }

    /* renamed from: androidx.core.text.b$b  reason: collision with other inner class name */
    static class C0079b {
        static ULocale a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        static ULocale b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        static String c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f5134a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e4) {
                throw new IllegalStateException(e4);
            }
        }
    }

    public static String a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0079b.c(C0079b.a(C0079b.b(locale)));
        }
        try {
            return a.a((Locale) f5134a.invoke((Object) null, new Object[]{locale}));
        } catch (InvocationTargetException e4) {
            Log.w("ICUCompat", e4);
            return a.a(locale);
        } catch (IllegalAccessException e5) {
            Log.w("ICUCompat", e5);
            return a.a(locale);
        }
    }
}
