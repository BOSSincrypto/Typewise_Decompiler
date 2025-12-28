package H2;

import java.util.Iterator;
import kotlin.jvm.internal.o;
import v2.C0925a;

public abstract class j {

    public static final class a implements Iterator, C0925a {

        /* renamed from: a  reason: collision with root package name */
        private int f567a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f568b;

        a(f fVar) {
            this.f568b = fVar;
            this.f567a = fVar.d();
        }

        /* renamed from: b */
        public f next() {
            f fVar = this.f568b;
            int d4 = fVar.d();
            int i4 = this.f567a;
            this.f567a = i4 - 1;
            return fVar.i(d4 - i4);
        }

        public boolean hasNext() {
            if (this.f567a > 0) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class b implements Iterator, C0925a {

        /* renamed from: a  reason: collision with root package name */
        private int f569a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f570b;

        b(f fVar) {
            this.f570b = fVar;
            this.f569a = fVar.d();
        }

        /* renamed from: b */
        public String next() {
            f fVar = this.f570b;
            int d4 = fVar.d();
            int i4 = this.f569a;
            this.f569a = i4 - 1;
            return fVar.e(d4 - i4);
        }

        public boolean hasNext() {
            if (this.f569a > 0) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class c implements Iterable, C0925a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f571a;

        public c(f fVar) {
            this.f571a = fVar;
        }

        public Iterator iterator() {
            return new a(this.f571a);
        }
    }

    public static final class d implements Iterable, C0925a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f572a;

        public d(f fVar) {
            this.f572a = fVar;
        }

        public Iterator iterator() {
            return new b(this.f572a);
        }
    }

    public static final Iterable a(f fVar) {
        o.e(fVar, "<this>");
        return new c(fVar);
    }

    public static final Iterable b(f fVar) {
        o.e(fVar, "<this>");
        return new d(fVar);
    }
}
