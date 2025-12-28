package X0;

import java.security.MessageDigest;
import p1.k;

public final class c {

    /* renamed from: e  reason: collision with root package name */
    private static final b f1935e = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Object f1936a;

    /* renamed from: b  reason: collision with root package name */
    private final b f1937b;

    /* renamed from: c  reason: collision with root package name */
    private final String f1938c;

    /* renamed from: d  reason: collision with root package name */
    private volatile byte[] f1939d;

    class a implements b {
        a() {
        }

        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    public interface b {
        void a(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    private c(String str, Object obj, b bVar) {
        this.f1938c = k.b(str);
        this.f1936a = obj;
        this.f1937b = (b) k.d(bVar);
    }

    public static c a(String str, Object obj, b bVar) {
        return new c(str, obj, bVar);
    }

    private static b b() {
        return f1935e;
    }

    private byte[] d() {
        if (this.f1939d == null) {
            this.f1939d = this.f1938c.getBytes(b.f1934a);
        }
        return this.f1939d;
    }

    public static c e(String str) {
        return new c(str, (Object) null, b());
    }

    public static c f(String str, Object obj) {
        return new c(str, obj, b());
    }

    public Object c() {
        return this.f1936a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f1938c.equals(((c) obj).f1938c);
        }
        return false;
    }

    public void g(Object obj, MessageDigest messageDigest) {
        this.f1937b.a(d(), obj, messageDigest);
    }

    public int hashCode() {
        return this.f1938c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f1938c + '\'' + '}';
    }
}
