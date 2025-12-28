package B2;

import java.util.Iterator;
import kotlin.jvm.internal.o;
import v2.C0925a;

public final class b implements e, c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final e f192a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int f193b;

    public static final class a implements Iterator, C0925a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator f194a;

        /* renamed from: b  reason: collision with root package name */
        private int f195b;

        a(b bVar) {
            this.f194a = bVar.f192a.iterator();
            this.f195b = bVar.f193b;
        }

        private final void b() {
            while (this.f195b > 0 && this.f194a.hasNext()) {
                this.f194a.next();
                this.f195b--;
            }
        }

        public boolean hasNext() {
            b();
            return this.f194a.hasNext();
        }

        public Object next() {
            b();
            return this.f194a.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(e eVar, int i4) {
        o.e(eVar, "sequence");
        this.f192a = eVar;
        this.f193b = i4;
        if (i4 < 0) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i4 + '.').toString());
        }
    }

    public e a(int i4) {
        int i5 = this.f193b + i4;
        if (i5 < 0) {
            return new b(this, i4);
        }
        return new b(this.f192a, i5);
    }

    public Iterator iterator() {
        return new a(this);
    }
}
