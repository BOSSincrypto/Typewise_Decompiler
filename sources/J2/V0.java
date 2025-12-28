package J2;

import F2.b;
import G2.a;
import H2.f;
import I2.e;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.p;
import l2.l;

public final class V0 implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final V0 f668a = new V0();

    /* renamed from: b  reason: collision with root package name */
    private static final f f669b = H.a("kotlin.ULong", a.C(p.f13906a));

    private V0() {
    }

    public f a() {
        return f669b;
    }

    public /* bridge */ /* synthetic */ Object b(e eVar) {
        return l.a(f(eVar));
    }

    public /* bridge */ /* synthetic */ void e(I2.f fVar, Object obj) {
        g(fVar, ((l) obj).f());
    }

    public long f(e eVar) {
        o.e(eVar, "decoder");
        return l.b(eVar.g(a()).f());
    }

    public void g(I2.f fVar, long j4) {
        o.e(fVar, "encoder");
        fVar.s(a()).B(j4);
    }
}
