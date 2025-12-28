package B2;

import java.util.Iterator;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import u2.p;
import v2.C0925a;

public final class n implements e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final e f208a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final p f209b;

    public static final class a implements Iterator, C0925a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator f210a;

        /* renamed from: b  reason: collision with root package name */
        private int f211b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n f212c;

        a(n nVar) {
            this.f212c = nVar;
            this.f210a = nVar.f208a.iterator();
        }

        public boolean hasNext() {
            return this.f210a.hasNext();
        }

        public Object next() {
            p c4 = this.f212c.f209b;
            int i4 = this.f211b;
            this.f211b = i4 + 1;
            if (i4 < 0) {
                C0718m.s();
            }
            return c4.invoke(Integer.valueOf(i4), this.f210a.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public n(e eVar, p pVar) {
        o.e(eVar, "sequence");
        o.e(pVar, "transformer");
        this.f208a = eVar;
        this.f209b = pVar;
    }

    public Iterator iterator() {
        return new a(this);
    }
}
