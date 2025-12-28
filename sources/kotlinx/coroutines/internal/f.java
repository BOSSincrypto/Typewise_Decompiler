package kotlinx.coroutines.internal;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.c;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.B0;
import kotlinx.coroutines.C0747k;
import kotlinx.coroutines.C0748l;
import kotlinx.coroutines.C0758w;
import kotlinx.coroutines.C0760y;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.F;
import kotlinx.coroutines.N;
import kotlinx.coroutines.U;
import l2.q;
import u2.l;

public final class f extends N implements c, kotlin.coroutines.c {

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f14171h = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation = null;

    /* renamed from: d  reason: collision with root package name */
    public final CoroutineDispatcher f14172d;

    /* renamed from: e  reason: collision with root package name */
    public final kotlin.coroutines.c f14173e;

    /* renamed from: f  reason: collision with root package name */
    public Object f14174f = g.f14176a;

    /* renamed from: g  reason: collision with root package name */
    public final Object f14175g = ThreadContextKt.b(getContext());

    public f(CoroutineDispatcher coroutineDispatcher, kotlin.coroutines.c cVar) {
        super(-1);
        this.f14172d = coroutineDispatcher;
        this.f14173e = cVar;
    }

    private final C0748l n() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof C0748l) {
            return (C0748l) obj;
        }
        return null;
    }

    public void a(Object obj, Throwable th) {
        if (obj instanceof C0758w) {
            ((C0758w) obj).f14319b.invoke(th);
        }
    }

    public kotlin.coroutines.c d() {
        return this;
    }

    public c getCallerFrame() {
        kotlin.coroutines.c cVar = this.f14173e;
        if (cVar instanceof c) {
            return (c) cVar;
        }
        return null;
    }

    public CoroutineContext getContext() {
        return this.f14173e.getContext();
    }

    public Object i() {
        Object obj = this.f14174f;
        this.f14174f = g.f14176a;
        return obj;
    }

    public final void k() {
        do {
        } while (this._reusableCancellableContinuation == g.f14177b);
    }

    public final C0748l m() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = g.f14177b;
                return null;
            } else if (obj instanceof C0748l) {
                if (b.a(f14171h, this, obj, g.f14177b)) {
                    return (C0748l) obj;
                }
            } else if (obj != g.f14177b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final boolean o() {
        if (this._reusableCancellableContinuation != null) {
            return true;
        }
        return false;
    }

    public final boolean q(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            y yVar = g.f14177b;
            if (o.a(obj, yVar)) {
                if (b.a(f14171h, this, yVar, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (b.a(f14171h, this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    public final void r() {
        k();
        C0748l n4 = n();
        if (n4 != null) {
            n4.r();
        }
    }

    public void resumeWith(Object obj) {
        CoroutineContext context;
        Object c4;
        CoroutineContext context2 = this.f14173e.getContext();
        Object d4 = C0760y.d(obj, (l) null, 1, (Object) null);
        if (this.f14172d.q0(context2)) {
            this.f14174f = d4;
            this.f14001c = 0;
            this.f14172d.p0(context2, this);
            return;
        }
        U a4 = B0.f13984a.a();
        if (a4.y0()) {
            this.f14174f = d4;
            this.f14001c = 0;
            a4.u0(this);
            return;
        }
        a4.w0(true);
        try {
            context = getContext();
            c4 = ThreadContextKt.c(context, this.f14175g);
            this.f14173e.resumeWith(obj);
            q qVar = q.f14567a;
            ThreadContextKt.a(context, c4);
            do {
            } while (a4.A0());
        } catch (Throwable th) {
            a4.s0(true);
            throw th;
        }
        a4.s0(true);
    }

    public final Throwable s(C0747k kVar) {
        y yVar;
        do {
            Object obj = this._reusableCancellableContinuation;
            yVar = g.f14177b;
            if (obj != yVar) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                } else if (b.a(f14171h, this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
        } while (!b.a(f14171h, this, yVar, kVar));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f14172d + ", " + F.c(this.f14173e) + ']';
    }
}
