package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.o;

/* renamed from: kotlinx.serialization.json.internal.h  reason: case insensitive filesystem */
public class C0769h {

    /* renamed from: a  reason: collision with root package name */
    public final v f14394a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f14395b = true;

    public C0769h(v vVar) {
        o.e(vVar, "writer");
        this.f14394a = vVar;
    }

    public final boolean a() {
        return this.f14395b;
    }

    public void b() {
        this.f14395b = true;
    }

    public void c() {
        this.f14395b = false;
    }

    public void d() {
        this.f14395b = false;
    }

    public void e(byte b4) {
        this.f14394a.c((long) b4);
    }

    public final void f(char c4) {
        this.f14394a.a(c4);
    }

    public void g(double d4) {
        this.f14394a.d(String.valueOf(d4));
    }

    public void h(float f4) {
        this.f14394a.d(String.valueOf(f4));
    }

    public void i(int i4) {
        this.f14394a.c((long) i4);
    }

    public void j(long j4) {
        this.f14394a.c(j4);
    }

    public final void k(String str) {
        o.e(str, "v");
        this.f14394a.d(str);
    }

    public void l(short s4) {
        this.f14394a.c((long) s4);
    }

    public void m(boolean z3) {
        this.f14394a.d(String.valueOf(z3));
    }

    public void n(String str) {
        o.e(str, "value");
        this.f14394a.b(str);
    }

    /* access modifiers changed from: protected */
    public final void o(boolean z3) {
        this.f14395b = z3;
    }

    public void p() {
    }

    public void q() {
    }
}
