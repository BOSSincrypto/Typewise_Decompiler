package U;

import U.a;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class d extends a {
    public d() {
        this((a) null, 1, (i) null);
    }

    public Object a(a.b bVar) {
        o.e(bVar, "key");
        return b().get(bVar);
    }

    public final void c(a.b bVar, Object obj) {
        o.e(bVar, "key");
        b().put(bVar, obj);
    }

    public d(a aVar) {
        o.e(aVar, "initialExtras");
        b().putAll(aVar.b());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(a aVar, int i4, i iVar) {
        this((i4 & 1) != 0 ? a.C0027a.f1484b : aVar);
    }
}
