package K2;

import F2.b;
import H2.e;
import H2.f;
import H2.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.r;
import kotlinx.serialization.json.internal.x;

public final class E implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final E f810a = new E();

    /* renamed from: b  reason: collision with root package name */
    private static final f f811b = l.e("kotlinx.serialization.json.JsonPrimitive", e.i.f552a, new f[0], (u2.l) null, 8, (Object) null);

    private E() {
    }

    public f a() {
        return f811b;
    }

    /* renamed from: f */
    public D b(I2.e eVar) {
        o.e(eVar, "decoder");
        h s4 = q.d(eVar).s();
        if (s4 instanceof D) {
            return (D) s4;
        }
        throw x.e(-1, "Unexpected JSON element, expected JsonPrimitive, had " + r.b(s4.getClass()), s4.toString());
    }

    /* renamed from: g */
    public void e(I2.f fVar, D d4) {
        o.e(fVar, "encoder");
        o.e(d4, "value");
        q.h(fVar);
        if (d4 instanceof y) {
            fVar.k(z.f865a, y.INSTANCE);
        } else {
            fVar.k(v.f862a, (u) d4);
        }
    }
}
