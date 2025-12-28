package c1;

import java.util.Queue;
import p1.h;
import p1.l;

public class m {

    /* renamed from: a  reason: collision with root package name */
    private final h f7571a;

    class a extends h {
        a(long j4) {
            super(j4);
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public void j(b bVar, Object obj) {
            bVar.c();
        }
    }

    static final class b {

        /* renamed from: d  reason: collision with root package name */
        private static final Queue f7573d = l.e(0);

        /* renamed from: a  reason: collision with root package name */
        private int f7574a;

        /* renamed from: b  reason: collision with root package name */
        private int f7575b;

        /* renamed from: c  reason: collision with root package name */
        private Object f7576c;

        private b() {
        }

        static b a(Object obj, int i4, int i5) {
            b bVar;
            Queue queue = f7573d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b();
            }
            bVar.b(obj, i4, i5);
            return bVar;
        }

        private void b(Object obj, int i4, int i5) {
            this.f7576c = obj;
            this.f7575b = i4;
            this.f7574a = i5;
        }

        public void c() {
            Queue queue = f7573d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f7575b == bVar.f7575b && this.f7574a == bVar.f7574a && this.f7576c.equals(bVar.f7576c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f7574a * 31) + this.f7575b) * 31) + this.f7576c.hashCode();
        }
    }

    public m(long j4) {
        this.f7571a = new a(j4);
    }

    public Object a(Object obj, int i4, int i5) {
        b a4 = b.a(obj, i4, i5);
        Object g4 = this.f7571a.g(a4);
        a4.c();
        return g4;
    }

    public void b(Object obj, int i4, int i5, Object obj2) {
        this.f7571a.k(b.a(obj, i4, i5), obj2);
    }
}
