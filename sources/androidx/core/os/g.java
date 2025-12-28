package androidx.core.os;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

public final class g {

    /* renamed from: b  reason: collision with root package name */
    private static final g f5012b = a(new Locale[0]);

    /* renamed from: a  reason: collision with root package name */
    private final i f5013a;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final Locale[] f5014a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        private static boolean b(Locale locale) {
            for (Locale equals : f5014a) {
                if (equals.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        static boolean c(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || b(locale) || b(locale2)) {
                return false;
            }
            String a4 = androidx.core.text.b.a(locale);
            if (!a4.isEmpty()) {
                return a4.equals(androidx.core.text.b.a(locale2));
            }
            String country = locale.getCountry();
            if (country.isEmpty() || country.equals(locale2.getCountry())) {
                return true;
            }
            return false;
        }
    }

    static class b {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private g(i iVar) {
        this.f5013a = iVar;
    }

    public static g a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return i(b.a(localeArr));
        }
        return new g(new h(localeArr));
    }

    static Locale b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains("_")) {
            return new Locale(str);
        } else {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public static g c(String str) {
        if (str == null || str.isEmpty()) {
            return e();
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i4 = 0; i4 < length; i4++) {
            localeArr[i4] = a.a(split[i4]);
        }
        return a(localeArr);
    }

    public static g e() {
        return f5012b;
    }

    public static g i(LocaleList localeList) {
        return new g(new p(localeList));
    }

    public Locale d(int i4) {
        return this.f5013a.get(i4);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g) || !this.f5013a.equals(((g) obj).f5013a)) {
            return false;
        }
        return true;
    }

    public boolean f() {
        return this.f5013a.isEmpty();
    }

    public int g() {
        return this.f5013a.size();
    }

    public String h() {
        return this.f5013a.a();
    }

    public int hashCode() {
        return this.f5013a.hashCode();
    }

    public String toString() {
        return this.f5013a.toString();
    }
}
