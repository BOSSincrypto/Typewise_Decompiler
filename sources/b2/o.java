package B2;

import java.util.Iterator;
import u2.l;
import v2.C0925a;

public final class o implements e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final e f213a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final l f214b;

    public static final class a implements Iterator, C0925a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator f215a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o f216b;

        a(o oVar) {
            this.f216b = oVar;
            this.f215a = oVar.f213a.iterator();
        }

        public boolean hasNext() {
            return this.f215a.hasNext();
        }

        public Object next() {
            return this.f216b.f214b.invoke(this.f215a.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public o(e eVar, l lVar) {
        kotlin.jvm.internal.o.e(eVar, "sequence");
        kotlin.jvm.internal.o.e(lVar, "transformer");
        this.f213a = eVar;
        this.f214b = lVar;
    }

    public Iterator iterator() {
        return new a(this);
    }
}
