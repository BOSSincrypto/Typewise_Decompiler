package J2;

import F2.b;
import H2.e;
import H2.f;
import kotlin.jvm.internal.o;

public final class F0 implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final F0 f619a = new F0();

    /* renamed from: b  reason: collision with root package name */
    private static final f f620b = new C0338y0("kotlin.Short", e.h.f551a);

    private F0() {
    }

    public f a() {
        return f620b;
    }

    public /* bridge */ /* synthetic */ void e(I2.f fVar, Object obj) {
        g(fVar, ((Number) obj).shortValue());
    }

    /* renamed from: f */
    public Short b(I2.e eVar) {
        o.e(eVar, "decoder");
        return Short.valueOf(eVar.B());
    }

    public void g(I2.f fVar, short s4) {
        o.e(fVar, "encoder");
        fVar.m(s4);
    }
}
