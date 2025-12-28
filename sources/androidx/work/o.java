package androidx.work;

public interface o {

    /* renamed from: a  reason: collision with root package name */
    public static final b.c f7433a = new b.c();

    /* renamed from: b  reason: collision with root package name */
    public static final b.C0118b f7434b = new b.C0118b();

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f7435a;

            public a(Throwable th) {
                this.f7435a = th;
            }

            public Throwable a() {
                return this.f7435a;
            }

            public String toString() {
                return "FAILURE (" + this.f7435a.getMessage() + ")";
            }
        }

        /* renamed from: androidx.work.o$b$b  reason: collision with other inner class name */
        public static final class C0118b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0118b() {
            }
        }

        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        b() {
        }
    }
}
