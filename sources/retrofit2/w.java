package retrofit2;

import c3.C0500b;
import c3.d;
import c3.k;
import java.io.IOException;
import java.util.Objects;
import okhttp3.A;
import okhttp3.B;
import okhttp3.e;
import okhttp3.f;
import okhttp3.v;
import okhttp3.y;

final class w implements C0877d {

    /* renamed from: a  reason: collision with root package name */
    private final I f16237a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f16238b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f16239c;

    /* renamed from: d  reason: collision with root package name */
    private final e.a f16240d;

    /* renamed from: e  reason: collision with root package name */
    private final C0884k f16241e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f16242f;

    /* renamed from: g  reason: collision with root package name */
    private e f16243g;

    /* renamed from: h  reason: collision with root package name */
    private Throwable f16244h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f16245i;

    class a implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0879f f16246a;

        a(C0879f fVar) {
            this.f16246a = fVar;
        }

        private void c(Throwable th) {
            try {
                this.f16246a.b(w.this, th);
            } catch (Throwable th2) {
                O.t(th2);
                th2.printStackTrace();
            }
        }

        public void a(e eVar, A a4) {
            try {
                try {
                    this.f16246a.a(w.this, w.this.g(a4));
                } catch (Throwable th) {
                    O.t(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                O.t(th2);
                c(th2);
            }
        }

        public void b(e eVar, IOException iOException) {
            c(iOException);
        }
    }

    static final class b extends B {

        /* renamed from: b  reason: collision with root package name */
        private final B f16248b;

        /* renamed from: c  reason: collision with root package name */
        private final d f16249c;

        /* renamed from: d  reason: collision with root package name */
        IOException f16250d;

        class a extends c3.f {
            a(c3.w wVar) {
                super(wVar);
            }

            public long N(C0500b bVar, long j4) {
                try {
                    return super.N(bVar, j4);
                } catch (IOException e4) {
                    b.this.f16250d = e4;
                    throw e4;
                }
            }
        }

        b(B b4) {
            this.f16248b = b4;
            this.f16249c = k.b(new a(b4.m()));
        }

        public void close() {
            this.f16248b.close();
        }

        public long e() {
            return this.f16248b.e();
        }

        public v f() {
            return this.f16248b.f();
        }

        public d m() {
            return this.f16249c;
        }

        /* access modifiers changed from: package-private */
        public void v() {
            IOException iOException = this.f16250d;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    static final class c extends B {

        /* renamed from: b  reason: collision with root package name */
        private final v f16252b;

        /* renamed from: c  reason: collision with root package name */
        private final long f16253c;

        c(v vVar, long j4) {
            this.f16252b = vVar;
            this.f16253c = j4;
        }

        public long e() {
            return this.f16253c;
        }

        public v f() {
            return this.f16252b;
        }

        public d m() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    w(I i4, Object obj, Object[] objArr, e.a aVar, C0884k kVar) {
        this.f16237a = i4;
        this.f16238b = obj;
        this.f16239c = objArr;
        this.f16240d = aVar;
        this.f16241e = kVar;
    }

    private e c() {
        e b4 = this.f16240d.b(this.f16237a.a(this.f16238b, this.f16239c));
        if (b4 != null) {
            return b4;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    private e d() {
        e eVar = this.f16243g;
        if (eVar != null) {
            return eVar;
        }
        Throwable th = this.f16244h;
        if (th == null) {
            try {
                e c4 = c();
                this.f16243g = c4;
                return c4;
            } catch (IOException | Error | RuntimeException e4) {
                O.t(e4);
                this.f16244h = e4;
                throw e4;
            }
        } else if (th instanceof IOException) {
            throw ((IOException) th);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else {
            throw ((Error) th);
        }
    }

    public synchronized y a() {
        try {
        } catch (IOException e4) {
            throw new RuntimeException("Unable to create request.", e4);
        }
        return d().a();
    }

    /* renamed from: b */
    public w f() {
        return new w(this.f16237a, this.f16238b, this.f16239c, this.f16240d, this.f16241e);
    }

    public void cancel() {
        e eVar;
        this.f16242f = true;
        synchronized (this) {
            eVar = this.f16243g;
        }
        if (eVar != null) {
            eVar.cancel();
        }
    }

    public boolean e() {
        boolean z3 = true;
        if (this.f16242f) {
            return true;
        }
        synchronized (this) {
            try {
                e eVar = this.f16243g;
                if (eVar == null || !eVar.e()) {
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    /* access modifiers changed from: package-private */
    public J g(A a4) {
        B a5 = a4.a();
        A c4 = a4.b0().b(new c(a5.f(), a5.e())).c();
        int m4 = c4.m();
        if (m4 < 200 || m4 >= 300) {
            try {
                return J.c(O.a(a5), c4);
            } finally {
                a5.close();
            }
        } else if (m4 == 204 || m4 == 205) {
            a5.close();
            return J.i((Object) null, c4);
        } else {
            b bVar = new b(a5);
            try {
                return J.i(this.f16241e.a(bVar), c4);
            } catch (RuntimeException e4) {
                bVar.v();
                throw e4;
            }
        }
    }

    public void m(C0879f fVar) {
        e eVar;
        Throwable th;
        Objects.requireNonNull(fVar, "callback == null");
        synchronized (this) {
            try {
                if (!this.f16245i) {
                    this.f16245i = true;
                    eVar = this.f16243g;
                    th = this.f16244h;
                    if (eVar == null && th == null) {
                        e c4 = c();
                        this.f16243g = c4;
                        eVar = c4;
                    }
                } else {
                    throw new IllegalStateException("Already executed.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (th != null) {
            fVar.b(this, th);
            return;
        }
        if (this.f16242f) {
            eVar.cancel();
        }
        eVar.h(new a(fVar));
    }
}
