package B2;

import java.util.Iterator;
import kotlin.jvm.internal.o;
import u2.C0906a;
import u2.l;

abstract class k extends j {

    public static final class a implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterator f206a;

        public a(Iterator it) {
            this.f206a = it;
        }

        public Iterator iterator() {
            return this.f206a;
        }
    }

    public static e c(Iterator it) {
        o.e(it, "<this>");
        return d(new a(it));
    }

    public static final e d(e eVar) {
        o.e(eVar, "<this>");
        if (eVar instanceof a) {
            return eVar;
        }
        return new a(eVar);
    }

    public static e e(C0906a aVar, l lVar) {
        o.e(aVar, "seedFunction");
        o.e(lVar, "nextFunction");
        return new d(aVar, lVar);
    }
}
