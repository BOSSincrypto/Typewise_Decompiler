package B2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;
import u2.C0906a;
import u2.l;
import v2.C0925a;

final class d implements e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C0906a f196a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final l f197b;

    public static final class a implements Iterator, C0925a {

        /* renamed from: a  reason: collision with root package name */
        private Object f198a;

        /* renamed from: b  reason: collision with root package name */
        private int f199b = -2;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f200c;

        a(d dVar) {
            this.f200c = dVar;
        }

        private final void b() {
            Object obj;
            int i4;
            if (this.f199b == -2) {
                obj = this.f200c.f196a.invoke();
            } else {
                l c4 = this.f200c.f197b;
                Object obj2 = this.f198a;
                o.b(obj2);
                obj = c4.invoke(obj2);
            }
            this.f198a = obj;
            if (obj == null) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            this.f199b = i4;
        }

        public boolean hasNext() {
            if (this.f199b < 0) {
                b();
            }
            if (this.f199b == 1) {
                return true;
            }
            return false;
        }

        public Object next() {
            if (this.f199b < 0) {
                b();
            }
            if (this.f199b != 0) {
                Object obj = this.f198a;
                o.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f199b = -1;
                return obj;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(C0906a aVar, l lVar) {
        o.e(aVar, "getInitialValue");
        o.e(lVar, "getNextValue");
        this.f196a = aVar;
        this.f197b = lVar;
    }

    public Iterator iterator() {
        return new a(this);
    }
}
