package J2;

import F2.b;
import H2.e;
import H2.f;
import kotlin.jvm.internal.o;

public final class K implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final K f636a = new K();

    /* renamed from: b  reason: collision with root package name */
    private static final f f637b = new C0338y0("kotlin.Int", e.f.f549a);

    private K() {
    }

    public f a() {
        return f637b;
    }

    public /* bridge */ /* synthetic */ void e(I2.f fVar, Object obj) {
        g(fVar, ((Number) obj).intValue());
    }

    /* renamed from: f */
    public Integer b(I2.e eVar) {
        o.e(eVar, "decoder");
        return Integer.valueOf(eVar.t());
    }

    public void g(I2.f fVar, int i4) {
        o.e(fVar, "encoder");
        fVar.u(i4);
    }
}
