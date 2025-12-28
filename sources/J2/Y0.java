package J2;

import F2.b;
import G2.a;
import H2.f;
import I2.e;
import kotlin.jvm.internal.t;
import l2.o;

public final class Y0 implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final Y0 f682a = new Y0();

    /* renamed from: b  reason: collision with root package name */
    private static final f f683b = H.a("kotlin.UShort", a.D(t.f13911a));

    private Y0() {
    }

    public f a() {
        return f683b;
    }

    public /* bridge */ /* synthetic */ Object b(e eVar) {
        return o.a(f(eVar));
    }

    public /* bridge */ /* synthetic */ void e(I2.f fVar, Object obj) {
        g(fVar, ((o) obj).f());
    }

    public short f(e eVar) {
        kotlin.jvm.internal.o.e(eVar, "decoder");
        return o.b(eVar.g(a()).B());
    }

    public void g(I2.f fVar, short s4) {
        kotlin.jvm.internal.o.e(fVar, "encoder");
        fVar.s(a()).m(s4);
    }
}
