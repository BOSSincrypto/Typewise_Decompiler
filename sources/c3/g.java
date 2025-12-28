package c3;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

public class g extends x {

    /* renamed from: f  reason: collision with root package name */
    private x f7658f;

    public g(x xVar) {
        o.e(xVar, "delegate");
        this.f7658f = xVar;
    }

    public x a() {
        return this.f7658f.a();
    }

    public x b() {
        return this.f7658f.b();
    }

    public long c() {
        return this.f7658f.c();
    }

    public x d(long j4) {
        return this.f7658f.d(j4);
    }

    public boolean e() {
        return this.f7658f.e();
    }

    public void f() {
        this.f7658f.f();
    }

    public x g(long j4, TimeUnit timeUnit) {
        o.e(timeUnit, "unit");
        return this.f7658f.g(j4, timeUnit);
    }

    public final x i() {
        return this.f7658f;
    }

    public final g j(x xVar) {
        o.e(xVar, "delegate");
        this.f7658f = xVar;
        return this;
    }
}
