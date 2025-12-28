package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;
import kotlin.jvm.internal.o;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5000a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final int f5001b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f5002c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f5003d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f5004e;

    /* renamed from: androidx.core.os.a$a  reason: collision with other inner class name */
    private static final class C0074a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0074a f5005a = new C0074a();

        private C0074a() {
        }

        public final int a(int i4) {
            return SdkExtensions.getExtensionVersion(i4);
        }
    }

    static {
        int i4;
        int i5;
        int i6;
        int i7 = Build.VERSION.SDK_INT;
        int i8 = 0;
        if (i7 >= 30) {
            i4 = C0074a.f5005a.a(30);
        } else {
            i4 = 0;
        }
        f5001b = i4;
        if (i7 >= 30) {
            i5 = C0074a.f5005a.a(31);
        } else {
            i5 = 0;
        }
        f5002c = i5;
        if (i7 >= 30) {
            i6 = C0074a.f5005a.a(33);
        } else {
            i6 = 0;
        }
        f5003d = i6;
        if (i7 >= 30) {
            i8 = C0074a.f5005a.a(1000000);
        }
        f5004e = i8;
    }

    private a() {
    }

    public static final boolean a(String str, String str2) {
        o.e(str, "codename");
        o.e(str2, "buildCodename");
        if (o.a("REL", str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str2.toUpperCase(locale);
        o.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = str.toUpperCase(locale);
        o.d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (upperCase.compareTo(upperCase2) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean b() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 33) {
            if (i4 >= 32) {
                String str = Build.VERSION.CODENAME;
                o.d(str, "CODENAME");
                if (a("Tiramisu", str)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}
