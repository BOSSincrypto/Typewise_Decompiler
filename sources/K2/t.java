package K2;

import kotlin.jvm.internal.o;
import u2.l;

public abstract class t {
    public static final C0341a a(C0341a aVar, l lVar) {
        o.e(aVar, "from");
        o.e(lVar, "builderAction");
        C0344d dVar = new C0344d(aVar);
        lVar.invoke(dVar);
        return new s(dVar.a(), dVar.b());
    }

    public static /* synthetic */ C0341a b(C0341a aVar, l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aVar = C0341a.f812d;
        }
        return a(aVar, lVar);
    }
}
