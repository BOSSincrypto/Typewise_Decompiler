package J2;

import F2.b;
import G2.a;
import H2.f;
import I2.e;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import l2.j;

public final class S0 implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final S0 f658a = new S0();

    /* renamed from: b  reason: collision with root package name */
    private static final f f659b = H.a("kotlin.UInt", a.B(n.f13905a));

    private S0() {
    }

    public f a() {
        return f659b;
    }

    public /* bridge */ /* synthetic */ Object b(e eVar) {
        return j.a(f(eVar));
    }

    public /* bridge */ /* synthetic */ void e(I2.f fVar, Object obj) {
        g(fVar, ((j) obj).f());
    }

    public int f(e eVar) {
        o.e(eVar, "decoder");
        return j.b(eVar.g(a()).t());
    }

    public void g(I2.f fVar, int i4) {
        o.e(fVar, "encoder");
        fVar.s(a()).u(i4);
    }
}
