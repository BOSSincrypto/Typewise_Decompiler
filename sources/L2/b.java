package L2;

import A2.c;
import F2.a;
import F2.n;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlinx.serialization.modules.d;

public abstract class b {
    public /* synthetic */ b(i iVar) {
        this();
    }

    public static /* synthetic */ F2.b c(b bVar, c cVar, List list, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                list = C0718m.j();
            }
            return bVar.b(cVar, list);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
    }

    public abstract void a(d dVar);

    public abstract F2.b b(c cVar, List list);

    public abstract a d(c cVar, String str);

    public abstract n e(c cVar, Object obj);

    private b() {
    }
}
