package kotlinx.serialization.modules;

import A2.c;
import F2.b;
import java.util.List;
import kotlin.jvm.internal.o;
import u2.l;

public interface d {

    public static final class a {
        public static void b(d dVar, c cVar, b bVar) {
            o.e(cVar, "kClass");
            o.e(bVar, "serializer");
            dVar.b(cVar, new L2.d(bVar));
        }

        /* access modifiers changed from: private */
        public static b c(b bVar, List list) {
            o.e(list, "it");
            return bVar;
        }
    }

    void a(c cVar, b bVar);

    void b(c cVar, l lVar);

    void c(c cVar, l lVar);

    void d(c cVar, c cVar2, b bVar);

    void e(c cVar, l lVar);
}
