package r3;

import kotlin.jvm.internal.o;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private String f16052a;

    /* renamed from: b  reason: collision with root package name */
    private double f16053b;

    public a(String str, double d4) {
        o.e(str, "language");
        this.f16052a = str;
        this.f16053b = d4;
    }

    public final double a() {
        return this.f16053b;
    }

    public final void b(double d4) {
        this.f16053b = d4;
    }

    public final String c() {
        return this.f16052a;
    }

    public final String d() {
        return this.f16052a;
    }

    public String toString() {
        return "{language='" + this.f16052a + "', count=" + this.f16053b + '}';
    }
}
