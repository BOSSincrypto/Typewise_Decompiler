package J2;

import F2.b;
import H2.e;
import H2.f;
import kotlin.jvm.internal.o;

/* renamed from: J2.i  reason: case insensitive filesystem */
public final class C0306i implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0306i f706a = new C0306i();

    /* renamed from: b  reason: collision with root package name */
    private static final f f707b = new C0338y0("kotlin.Boolean", e.a.f544a);

    private C0306i() {
    }

    public f a() {
        return f707b;
    }

    public /* bridge */ /* synthetic */ void e(I2.f fVar, Object obj) {
        g(fVar, ((Boolean) obj).booleanValue());
    }

    /* renamed from: f */
    public Boolean b(I2.e eVar) {
        o.e(eVar, "decoder");
        return Boolean.valueOf(eVar.h());
    }

    public void g(I2.f fVar, boolean z3) {
        o.e(fVar, "encoder");
        fVar.r(z3);
    }
}
