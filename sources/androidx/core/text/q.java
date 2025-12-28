package androidx.core.text;

import android.text.TextUtils;
import java.util.Locale;

public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    private static final Locale f5156a = new Locale("", "");

    static class a {
        static int a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    public static int a(Locale locale) {
        return a.a(locale);
    }
}
