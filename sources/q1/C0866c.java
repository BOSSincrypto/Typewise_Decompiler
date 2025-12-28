package q1;

/* renamed from: q1.c  reason: case insensitive filesystem */
public abstract class C0866c {

    /* renamed from: q1.c$b */
    private static class b extends C0866c {

        /* renamed from: a  reason: collision with root package name */
        private volatile boolean f15963a;

        b() {
            super();
        }

        public void b(boolean z3) {
            this.f15963a = z3;
        }

        public void c() {
            if (this.f15963a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public static C0866c a() {
        return new b();
    }

    /* access modifiers changed from: package-private */
    public abstract void b(boolean z3);

    public abstract void c();

    private C0866c() {
    }
}
