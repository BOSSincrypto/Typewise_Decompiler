package J2;

import F2.b;
import G2.a;
import H2.f;
import I2.e;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.o;
import l2.h;

public final class P0 implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final P0 f650a = new P0();

    /* renamed from: b  reason: collision with root package name */
    private static final f f651b = H.a("kotlin.UByte", a.x(d.f13893a));

    private P0() {
    }

    public f a() {
        return f651b;
    }

    public /* bridge */ /* synthetic */ Object b(e eVar) {
        return h.a(f(eVar));
    }

    public /* bridge */ /* synthetic */ void e(I2.f fVar, Object obj) {
        g(fVar, ((h) obj).f());
    }

    public byte f(e eVar) {
        o.e(eVar, "decoder");
        return h.b(eVar.g(a()).y());
    }

    public void g(I2.f fVar, byte b4) {
        o.e(fVar, "encoder");
        fVar.s(a()).q(b4);
    }
}
