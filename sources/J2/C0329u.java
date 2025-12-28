package J2;

import F2.b;
import H2.e;
import H2.f;
import kotlin.jvm.internal.o;

/* renamed from: J2.u  reason: case insensitive filesystem */
public final class C0329u implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0329u f745a = new C0329u();

    /* renamed from: b  reason: collision with root package name */
    private static final f f746b = new C0338y0("kotlin.Double", e.d.f547a);

    private C0329u() {
    }

    public f a() {
        return f746b;
    }

    public /* bridge */ /* synthetic */ void e(I2.f fVar, Object obj) {
        g(fVar, ((Number) obj).doubleValue());
    }

    /* renamed from: f */
    public Double b(I2.e eVar) {
        o.e(eVar, "decoder");
        return Double.valueOf(eVar.G());
    }

    public void g(I2.f fVar, double d4) {
        o.e(fVar, "encoder");
        fVar.l(d4);
    }
}
