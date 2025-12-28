package K2;

import F2.b;
import G2.a;
import H2.e;
import H2.f;
import H2.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.r;
import kotlin.text.D;
import kotlinx.serialization.json.internal.x;

final class v implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final v f862a = new v();

    /* renamed from: b  reason: collision with root package name */
    private static final f f863b = l.b("kotlinx.serialization.json.JsonLiteral", e.i.f552a);

    private v() {
    }

    public f a() {
        return f863b;
    }

    /* renamed from: f */
    public u b(I2.e eVar) {
        o.e(eVar, "decoder");
        h s4 = q.d(eVar).s();
        if (s4 instanceof u) {
            return (u) s4;
        }
        throw x.e(-1, "Unexpected JSON element, expected JsonLiteral, had " + r.b(s4.getClass()), s4.toString());
    }

    /* renamed from: g */
    public void e(I2.f fVar, u uVar) {
        o.e(fVar, "encoder");
        o.e(uVar, "value");
        q.h(fVar);
        if (uVar.d()) {
            fVar.F(uVar.b());
        } else if (uVar.c() != null) {
            fVar.s(uVar.c()).F(uVar.b());
        } else {
            Long o4 = kotlin.text.o.o(uVar.b());
            if (o4 != null) {
                fVar.B(o4.longValue());
                return;
            }
            l2.l h4 = D.h(uVar.b());
            if (h4 != null) {
                fVar.s(a.I(l2.l.f14556b).a()).B(h4.f());
                return;
            }
            Double j4 = kotlin.text.o.j(uVar.b());
            if (j4 != null) {
                fVar.l(j4.doubleValue());
                return;
            }
            Boolean L02 = kotlin.text.o.L0(uVar.b());
            if (L02 != null) {
                fVar.r(L02.booleanValue());
            } else {
                fVar.F(uVar.b());
            }
        }
    }
}
