package z2;

import kotlin.jvm.internal.i;

public final class c extends C0973a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f16750e = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final c f16751f = new c(1, 0);

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final c a() {
            return c.f16751f;
        }

        private a() {
        }
    }

    public c(int i4, int i5) {
        super(i4, i5, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (!(b() == cVar.b() && c() == cVar.c())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public Integer g() {
        return Integer.valueOf(c());
    }

    public Integer h() {
        return Integer.valueOf(b());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (b() * 31) + c();
    }

    public boolean isEmpty() {
        if (b() > c()) {
            return true;
        }
        return false;
    }

    public String toString() {
        return b() + ".." + c();
    }
}
