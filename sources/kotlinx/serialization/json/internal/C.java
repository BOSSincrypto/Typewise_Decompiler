package kotlinx.serialization.json.internal;

import F2.n;
import K2.C0341a;
import K2.r;
import kotlin.jvm.internal.o;

public abstract class C {
    public static final void a(C0341a aVar, v vVar, n nVar, Object obj) {
        o.e(aVar, "json");
        o.e(vVar, "writer");
        o.e(nVar, "serializer");
        new K(vVar, aVar, WriteMode.OBJ, new r[WriteMode.getEntries().size()]).k(nVar, obj);
    }
}
