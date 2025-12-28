package kotlin.text;

import com.silkimen.http.HttpRequest;
import java.nio.charset.Charset;
import kotlin.jvm.internal.o;

/* renamed from: kotlin.text.d  reason: case insensitive filesystem */
public final class C0724d {

    /* renamed from: a  reason: collision with root package name */
    public static final C0724d f13926a = new C0724d();

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f13927b;

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f13928c;

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f13929d;

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f13930e;

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f13931f;

    /* renamed from: g  reason: collision with root package name */
    public static final Charset f13932g;

    /* renamed from: h  reason: collision with root package name */
    private static volatile Charset f13933h;

    /* renamed from: i  reason: collision with root package name */
    private static volatile Charset f13934i;

    static {
        Charset forName = Charset.forName(HttpRequest.CHARSET_UTF8);
        o.d(forName, "forName(...)");
        f13927b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        o.d(forName2, "forName(...)");
        f13928c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        o.d(forName3, "forName(...)");
        f13929d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        o.d(forName4, "forName(...)");
        f13930e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        o.d(forName5, "forName(...)");
        f13931f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        o.d(forName6, "forName(...)");
        f13932g = forName6;
    }

    private C0724d() {
    }

    public final Charset a() {
        Charset charset = f13934i;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        o.d(forName, "forName(...)");
        f13934i = forName;
        return forName;
    }

    public final Charset b() {
        Charset charset = f13933h;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        o.d(forName, "forName(...)");
        f13933h = forName;
        return forName;
    }
}
