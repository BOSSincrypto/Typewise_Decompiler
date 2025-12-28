package H2;

import A2.c;
import J2.B0;
import java.util.List;
import kotlin.jvm.internal.o;

public abstract class b {
    public static final c a(f fVar) {
        o.e(fVar, "<this>");
        if (fVar instanceof c) {
            return ((c) fVar).f540b;
        }
        if (fVar instanceof B0) {
            return a(((B0) fVar).k());
        }
        return null;
    }

    public static final f b(L2.b bVar, f fVar) {
        F2.b c4;
        o.e(bVar, "<this>");
        o.e(fVar, "descriptor");
        c a4 = a(fVar);
        if (a4 == null || (c4 = L2.b.c(bVar, a4, (List) null, 2, (Object) null)) == null) {
            return null;
        }
        return c4.a();
    }

    public static final f c(f fVar, c cVar) {
        o.e(fVar, "<this>");
        o.e(cVar, "context");
        return new c(fVar, cVar);
    }
}
