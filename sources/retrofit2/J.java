package retrofit2;

import java.util.Objects;
import okhttp3.A;
import okhttp3.B;
import okhttp3.Protocol;
import okhttp3.y;

public final class J<T> {

    /* renamed from: a  reason: collision with root package name */
    private final A f16161a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f16162b;

    /* renamed from: c  reason: collision with root package name */
    private final B f16163c;

    private J(A a4, Object obj, B b4) {
        this.f16161a = a4;
        this.f16162b = obj;
        this.f16163c = b4;
    }

    public static J c(B b4, A a4) {
        Objects.requireNonNull(b4, "body == null");
        Objects.requireNonNull(a4, "rawResponse == null");
        if (!a4.G()) {
            return new J(a4, (Object) null, b4);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static J g(int i4, Object obj) {
        if (i4 >= 200 && i4 < 300) {
            return i(obj, new A.a().g(i4).n("Response.success()").q(Protocol.HTTP_1_1).s(new y.a().o("http://localhost/").b()).c());
        }
        throw new IllegalArgumentException("code < 200 or >= 300: " + i4);
    }

    public static J h(Object obj) {
        return i(obj, new A.a().g(200).n("OK").q(Protocol.HTTP_1_1).s(new y.a().o("http://localhost/").b()).c());
    }

    public static J i(Object obj, A a4) {
        Objects.requireNonNull(a4, "rawResponse == null");
        if (a4.G()) {
            return new J(a4, obj, (B) null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public Object a() {
        return this.f16162b;
    }

    public int b() {
        return this.f16161a.m();
    }

    public B d() {
        return this.f16163c;
    }

    public boolean e() {
        return this.f16161a.G();
    }

    public String f() {
        return this.f16161a.Q();
    }

    public String toString() {
        return this.f16161a.toString();
    }
}
