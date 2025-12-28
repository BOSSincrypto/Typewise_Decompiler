package kotlinx.serialization.json.internal;

import G2.a;
import H2.f;
import K2.i;
import java.util.Set;
import l2.h;
import l2.j;
import l2.l;
import l2.o;

public abstract class L {

    /* renamed from: a  reason: collision with root package name */
    private static final Set f14373a = kotlin.collections.L.h(a.H(j.f14551b).a(), a.I(l.f14556b).a(), a.G(h.f14546b).a(), a.J(o.f14562b).a());

    public static final boolean a(f fVar) {
        kotlin.jvm.internal.o.e(fVar, "<this>");
        if (!fVar.isInline() || !kotlin.jvm.internal.o.a(fVar, i.i())) {
            return false;
        }
        return true;
    }

    public static final boolean b(f fVar) {
        kotlin.jvm.internal.o.e(fVar, "<this>");
        if (!fVar.isInline() || !f14373a.contains(fVar)) {
            return false;
        }
        return true;
    }
}
