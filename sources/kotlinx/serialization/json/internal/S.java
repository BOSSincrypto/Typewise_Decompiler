package kotlinx.serialization.json.internal;

import H2.d;
import H2.e;
import H2.f;
import H2.m;
import H2.n;
import K2.C0341a;
import L2.b;
import kotlin.jvm.internal.o;

public abstract class S {
    public static final f a(f fVar, b bVar) {
        f a4;
        o.e(fVar, "<this>");
        o.e(bVar, "module");
        if (o.a(fVar.c(), m.a.f573a)) {
            f b4 = H2.b.b(bVar, fVar);
            if (b4 == null || (a4 = a(b4, bVar)) == null) {
                return fVar;
            }
            return a4;
        } else if (fVar.isInline()) {
            return a(fVar.i(0), bVar);
        } else {
            return fVar;
        }
    }

    public static final WriteMode b(C0341a aVar, f fVar) {
        o.e(aVar, "<this>");
        o.e(fVar, "desc");
        m c4 = fVar.c();
        if (c4 instanceof d) {
            return WriteMode.POLY_OBJ;
        }
        if (o.a(c4, n.b.f576a)) {
            return WriteMode.LIST;
        }
        if (!o.a(c4, n.c.f577a)) {
            return WriteMode.OBJ;
        }
        f a4 = a(fVar.i(0), aVar.a());
        m c5 = a4.c();
        if ((c5 instanceof e) || o.a(c5, m.b.f574a)) {
            return WriteMode.MAP;
        }
        if (aVar.d().c()) {
            return WriteMode.LIST;
        }
        throw x.c(a4);
    }
}
