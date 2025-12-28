package androidx.work;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.Executor;
import n0.c;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    private Context f7422a;

    /* renamed from: b  reason: collision with root package name */
    private WorkerParameters f7423b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f7424c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7425d;

    public static abstract class a {

        /* renamed from: androidx.work.l$a$a  reason: collision with other inner class name */
        public static final class C0117a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final e f7426a;

            public C0117a() {
                this(e.f7150c);
            }

            public e e() {
                return this.f7426a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0117a.class != obj.getClass()) {
                    return false;
                }
                return this.f7426a.equals(((C0117a) obj).f7426a);
            }

            public int hashCode() {
                return (C0117a.class.getName().hashCode() * 31) + this.f7426a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f7426a + '}';
            }

            public C0117a(e eVar) {
                this.f7426a = eVar;
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || b.class != obj.getClass()) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            private final e f7427a;

            public c() {
                this(e.f7150c);
            }

            public e e() {
                return this.f7427a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f7427a.equals(((c) obj).f7427a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f7427a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f7427a + '}';
            }

            public c(e eVar) {
                this.f7427a = eVar;
            }
        }

        a() {
        }

        public static a a() {
            return new C0117a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new c();
        }

        public static a d(e eVar) {
            return new c(eVar);
        }
    }

    public l(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.f7422a = context;
            this.f7423b = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public final Context a() {
        return this.f7422a;
    }

    public Executor b() {
        return this.f7423b.a();
    }

    public X1.a d() {
        androidx.work.impl.utils.futures.a t4 = androidx.work.impl.utils.futures.a.t();
        t4.q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return t4;
    }

    public final UUID f() {
        return this.f7423b.c();
    }

    public final e g() {
        return this.f7423b.d();
    }

    public c h() {
        return this.f7423b.e();
    }

    public v i() {
        return this.f7423b.f();
    }

    public final boolean j() {
        return this.f7424c;
    }

    public final boolean k() {
        return this.f7425d;
    }

    public void l() {
    }

    public final X1.a m(g gVar) {
        return this.f7423b.b().a(a(), f(), gVar);
    }

    public final void n() {
        this.f7425d = true;
    }

    public abstract X1.a o();

    public final void p() {
        this.f7424c = true;
        l();
    }
}
