package J2;

import F2.b;
import H2.e;
import H2.f;
import kotlin.jvm.internal.o;

/* renamed from: J2.l  reason: case insensitive filesystem */
public final class C0312l implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0312l f717a = new C0312l();

    /* renamed from: b  reason: collision with root package name */
    private static final f f718b = new C0338y0("kotlin.Byte", e.b.f545a);

    private C0312l() {
    }

    public f a() {
        return f718b;
    }

    public /* bridge */ /* synthetic */ void e(I2.f fVar, Object obj) {
        g(fVar, ((Number) obj).byteValue());
    }

    /* renamed from: f */
    public Byte b(I2.e eVar) {
        o.e(eVar, "decoder");
        return Byte.valueOf(eVar.y());
    }

    public void g(I2.f fVar, byte b4) {
        o.e(fVar, "encoder");
        fVar.q(b4);
    }
}
