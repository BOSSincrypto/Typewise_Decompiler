package J2;

import F2.b;
import H2.e;
import H2.f;
import kotlin.jvm.internal.o;

public final class V implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final V f666a = new V();

    /* renamed from: b  reason: collision with root package name */
    private static final f f667b = new C0338y0("kotlin.Long", e.g.f550a);

    private V() {
    }

    public f a() {
        return f667b;
    }

    public /* bridge */ /* synthetic */ void e(I2.f fVar, Object obj) {
        g(fVar, ((Number) obj).longValue());
    }

    /* renamed from: f */
    public Long b(I2.e eVar) {
        o.e(eVar, "decoder");
        return Long.valueOf(eVar.f());
    }

    public void g(I2.f fVar, long j4) {
        o.e(fVar, "encoder");
        fVar.B(j4);
    }
}
