package y1;

import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import v1.C0923b;

/* renamed from: y1.r  reason: case insensitive filesystem */
final class C0964r extends C0950d {

    /* renamed from: a  reason: collision with root package name */
    private final Object f16487a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final C0961o f16488b = new C0961o();

    /* renamed from: c  reason: collision with root package name */
    private boolean f16489c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f16490d;

    /* renamed from: e  reason: collision with root package name */
    private Object f16491e;

    /* renamed from: f  reason: collision with root package name */
    private Exception f16492f;

    C0964r() {
    }

    private final void o() {
        C0923b.c(this.f16489c, "Task is not yet complete");
    }

    private final void p() {
        if (this.f16490d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void q() {
        if (this.f16489c) {
            throw DuplicateTaskCompletionException.of(this);
        }
    }

    private final void r() {
        synchronized (this.f16487a) {
            try {
                if (this.f16489c) {
                    this.f16488b.b(this);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final C0950d a(C0947a aVar) {
        this.f16488b.a(new C0955i(C0952f.f16466a, aVar));
        r();
        return this;
    }

    public final C0950d b(C0948b bVar) {
        i(C0952f.f16466a, bVar);
        return this;
    }

    public final C0950d c(C0949c cVar) {
        j(C0952f.f16466a, cVar);
        return this;
    }

    public final Exception d() {
        Exception exc;
        synchronized (this.f16487a) {
            exc = this.f16492f;
        }
        return exc;
    }

    public final Object e() {
        Object obj;
        synchronized (this.f16487a) {
            try {
                o();
                p();
                Exception exc = this.f16492f;
                if (exc == null) {
                    obj = this.f16491e;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean f() {
        return this.f16490d;
    }

    public final boolean g() {
        boolean z3;
        synchronized (this.f16487a) {
            z3 = this.f16489c;
        }
        return z3;
    }

    public final boolean h() {
        boolean z3;
        synchronized (this.f16487a) {
            try {
                z3 = false;
                if (this.f16489c && !this.f16490d && this.f16492f == null) {
                    z3 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    public final C0950d i(Executor executor, C0948b bVar) {
        this.f16488b.a(new C0957k(executor, bVar));
        r();
        return this;
    }

    public final C0950d j(Executor executor, C0949c cVar) {
        this.f16488b.a(new C0959m(executor, cVar));
        r();
        return this;
    }

    public final void k(Exception exc) {
        C0923b.b(exc, "Exception must not be null");
        synchronized (this.f16487a) {
            q();
            this.f16489c = true;
            this.f16492f = exc;
        }
        this.f16488b.b(this);
    }

    public final void l(Object obj) {
        synchronized (this.f16487a) {
            q();
            this.f16489c = true;
            this.f16491e = obj;
        }
        this.f16488b.b(this);
    }

    public final boolean m(Exception exc) {
        C0923b.b(exc, "Exception must not be null");
        synchronized (this.f16487a) {
            try {
                if (this.f16489c) {
                    return false;
                }
                this.f16489c = true;
                this.f16492f = exc;
                this.f16488b.b(this);
                return true;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final boolean n(Object obj) {
        synchronized (this.f16487a) {
            try {
                if (this.f16489c) {
                    return false;
                }
                this.f16489c = true;
                this.f16491e = obj;
                this.f16488b.b(this);
                return true;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
