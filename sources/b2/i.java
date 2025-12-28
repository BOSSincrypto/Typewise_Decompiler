package B2;

import java.util.Iterator;
import kotlin.jvm.internal.o;
import u2.p;

abstract class i {

    public static final class a implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f205a;

        public a(p pVar) {
            this.f205a = pVar;
        }

        public Iterator iterator() {
            return h.a(this.f205a);
        }
    }

    public static Iterator a(p pVar) {
        o.e(pVar, "block");
        f fVar = new f();
        fVar.k(kotlin.coroutines.intrinsics.a.b(pVar, fVar, fVar));
        return fVar;
    }

    public static e b(p pVar) {
        o.e(pVar, "block");
        return new a(pVar);
    }
}
