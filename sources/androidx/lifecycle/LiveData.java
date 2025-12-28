package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData.c;
import java.util.Map;
import s.C0890b;

public abstract class LiveData {

    /* renamed from: k  reason: collision with root package name */
    static final Object f6018k = new Object();

    /* renamed from: a  reason: collision with root package name */
    final Object f6019a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private C0890b f6020b = new C0890b();

    /* renamed from: c  reason: collision with root package name */
    int f6021c = 0;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6022d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Object f6023e;

    /* renamed from: f  reason: collision with root package name */
    volatile Object f6024f;

    /* renamed from: g  reason: collision with root package name */
    private int f6025g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6026h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f6027i;

    /* renamed from: j  reason: collision with root package name */
    private final Runnable f6028j;

    class LifecycleBoundObserver extends c implements C0461k {

        /* renamed from: e  reason: collision with root package name */
        final m f6029e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ LiveData f6030f;

        /* JADX WARNING: type inference failed for: r1v0, types: [androidx.lifecycle.LiveData$LifecycleBoundObserver, androidx.lifecycle.LiveData$c] */
        public void c(m mVar, Lifecycle.Event event) {
            Lifecycle.State b4 = this.f6029e.getLifecycle().b();
            if (b4 == Lifecycle.State.DESTROYED) {
                this.f6030f.i(this.f6033a);
                return;
            }
            Lifecycle.State state = null;
            while (state != b4) {
                e(g());
                state = b4;
                b4 = this.f6029e.getLifecycle().b();
            }
        }

        /* access modifiers changed from: package-private */
        public void f() {
            this.f6029e.getLifecycle().c(this);
        }

        /* access modifiers changed from: package-private */
        public boolean g() {
            return this.f6029e.getLifecycle().b().isAtLeast(Lifecycle.State.STARTED);
        }
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.f6019a) {
                obj = LiveData.this.f6024f;
                LiveData.this.f6024f = LiveData.f6018k;
            }
            LiveData.this.j(obj);
        }
    }

    private class b extends c {
        b(s sVar) {
            super(sVar);
        }

        /* access modifiers changed from: package-private */
        public boolean g() {
            return true;
        }
    }

    private abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final s f6033a;

        /* renamed from: b  reason: collision with root package name */
        boolean f6034b;

        /* renamed from: c  reason: collision with root package name */
        int f6035c = -1;

        c(s sVar) {
            this.f6033a = sVar;
        }

        /* access modifiers changed from: package-private */
        public void e(boolean z3) {
            int i4;
            if (z3 != this.f6034b) {
                this.f6034b = z3;
                LiveData liveData = LiveData.this;
                if (z3) {
                    i4 = 1;
                } else {
                    i4 = -1;
                }
                liveData.b(i4);
                if (this.f6034b) {
                    LiveData.this.d(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void f() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean g();
    }

    public LiveData() {
        Object obj = f6018k;
        this.f6024f = obj;
        this.f6028j = new a();
        this.f6023e = obj;
        this.f6025g = -1;
    }

    static void a(String str) {
        if (!r.c.g().b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    private void c(c cVar) {
        if (cVar.f6034b) {
            if (!cVar.g()) {
                cVar.e(false);
                return;
            }
            int i4 = cVar.f6035c;
            int i5 = this.f6025g;
            if (i4 < i5) {
                cVar.f6035c = i5;
                cVar.f6033a.a(this.f6023e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int i4) {
        boolean z3;
        boolean z4;
        int i5 = this.f6021c;
        this.f6021c = i4 + i5;
        if (!this.f6022d) {
            this.f6022d = true;
            while (true) {
                try {
                    int i6 = this.f6021c;
                    if (i5 != i6) {
                        if (i5 != 0 || i6 <= 0) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (i5 <= 0 || i6 != 0) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (z3) {
                            f();
                        } else if (z4) {
                            g();
                        }
                        i5 = i6;
                    } else {
                        this.f6022d = false;
                        return;
                    }
                } catch (Throwable th) {
                    this.f6022d = false;
                    throw th;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(c cVar) {
        if (this.f6026h) {
            this.f6027i = true;
            return;
        }
        this.f6026h = true;
        do {
            this.f6027i = false;
            if (cVar == null) {
                C0890b.d d4 = this.f6020b.d();
                while (d4.hasNext()) {
                    c((c) ((Map.Entry) d4.next()).getValue());
                    if (this.f6027i) {
                        break;
                    }
                }
            } else {
                c(cVar);
                cVar = null;
            }
        } while (this.f6027i);
        this.f6026h = false;
    }

    public void e(s sVar) {
        a("observeForever");
        b bVar = new b(sVar);
        c cVar = (c) this.f6020b.g(sVar, bVar);
        if (cVar instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (cVar == null) {
            bVar.e(true);
        }
    }

    /* access modifiers changed from: protected */
    public void f() {
    }

    /* access modifiers changed from: protected */
    public void g() {
    }

    /* access modifiers changed from: protected */
    public void h(Object obj) {
        boolean z3;
        synchronized (this.f6019a) {
            if (this.f6024f == f6018k) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f6024f = obj;
        }
        if (z3) {
            r.c.g().c(this.f6028j);
        }
    }

    public void i(s sVar) {
        a("removeObserver");
        c cVar = (c) this.f6020b.h(sVar);
        if (cVar != null) {
            cVar.f();
            cVar.e(false);
        }
    }

    /* access modifiers changed from: protected */
    public void j(Object obj) {
        a("setValue");
        this.f6025g++;
        this.f6023e = obj;
        d((c) null);
    }
}
