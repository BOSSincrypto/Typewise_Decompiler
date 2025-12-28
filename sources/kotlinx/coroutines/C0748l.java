package kotlinx.coroutines;

import androidx.concurrent.futures.b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.c;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.g0;
import kotlinx.coroutines.internal.f;
import kotlinx.coroutines.internal.y;
import u2.l;

/* renamed from: kotlinx.coroutines.l  reason: case insensitive filesystem */
public class C0748l extends N implements C0747k, c {

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f14203g;

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f14204h;
    private volatile /* synthetic */ int _decision = 0;
    private volatile /* synthetic */ Object _state = C0732d.f14076a;

    /* renamed from: d  reason: collision with root package name */
    private final kotlin.coroutines.c f14205d;

    /* renamed from: e  reason: collision with root package name */
    private final CoroutineContext f14206e;

    /* renamed from: f  reason: collision with root package name */
    private Q f14207f;

    static {
        Class<C0748l> cls = C0748l.class;
        f14203g = AtomicIntegerFieldUpdater.newUpdater(cls, "_decision");
        f14204h = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_state");
    }

    public C0748l(kotlin.coroutines.c cVar, int i4) {
        super(i4);
        this.f14205d = cVar;
        this.f14206e = cVar.getContext();
    }

    private final Q A() {
        g0 g0Var = (g0) getContext().get(g0.f14139t);
        if (g0Var == null) {
            return null;
        }
        Q d4 = g0.a.d(g0Var, true, false, new C0752p(this), 2, (Object) null);
        this.f14207f = d4;
        return d4;
    }

    private final boolean C() {
        if (!O.c(this.f14001c) || !((f) this.f14205d).o()) {
            return false;
        }
        return true;
    }

    private final C0740i D(l lVar) {
        if (lVar instanceof C0740i) {
            return (C0740i) lVar;
        }
        return new C0733d0(lVar);
    }

    private final void E(l lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    private final void H() {
        f fVar;
        Throwable s4;
        kotlin.coroutines.c cVar = this.f14205d;
        if (cVar instanceof f) {
            fVar = (f) cVar;
        } else {
            fVar = null;
        }
        if (fVar != null && (s4 = fVar.s(this)) != null) {
            r();
            l(s4);
        }
    }

    private final void J(Object obj, int i4, l lVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof t0) {
            } else {
                if (obj2 instanceof C0751o) {
                    C0751o oVar = (C0751o) obj2;
                    if (oVar.c()) {
                        if (lVar != null) {
                            o(lVar, oVar.f14316a);
                            return;
                        }
                        return;
                    }
                }
                k(obj);
                throw new KotlinNothingValueException();
            }
        } while (!b.a(f14204h, this, obj2, L((t0) obj2, obj, i4, lVar, (Object) null)));
        s();
        t(i4);
    }

    static /* synthetic */ void K(C0748l lVar, Object obj, int i4, l lVar2, int i5, Object obj2) {
        if (obj2 == null) {
            if ((i5 & 4) != 0) {
                lVar2 = null;
            }
            lVar.J(obj, i4, lVar2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    private final Object L(t0 t0Var, Object obj, int i4, l lVar, Object obj2) {
        C0740i iVar;
        if (obj instanceof C0757v) {
            return obj;
        }
        if (!O.b(i4) && obj2 == null) {
            return obj;
        }
        if (lVar == null && ((!(t0Var instanceof C0740i) || (t0Var instanceof C0734e)) && obj2 == null)) {
            return obj;
        }
        if (t0Var instanceof C0740i) {
            iVar = (C0740i) t0Var;
        } else {
            iVar = null;
        }
        return new C0756u(obj, iVar, lVar, obj2, (Throwable) null, 16, (i) null);
    }

    private final boolean M() {
        do {
            int i4 = this._decision;
            if (i4 != 0) {
                if (i4 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f14203g.compareAndSet(this, 0, 2));
        return true;
    }

    private final y N(Object obj, Object obj2, l lVar) {
        Object obj3;
        do {
            obj3 = this._state;
            if (obj3 instanceof t0) {
            } else if (!(obj3 instanceof C0756u) || obj2 == null || ((C0756u) obj3).f14313d != obj2) {
                return null;
            } else {
                return C0749m.f14209a;
            }
        } while (!b.a(f14204h, this, obj3, L((t0) obj3, obj, this.f14001c, lVar, obj2)));
        s();
        return C0749m.f14209a;
    }

    private final boolean O() {
        do {
            int i4 = this._decision;
            if (i4 != 0) {
                if (i4 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f14203g.compareAndSet(this, 0, 1));
        return true;
    }

    private final Void k(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void n(l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            CoroutineContext context = getContext();
            B.a(context, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final boolean q(Throwable th) {
        if (!C()) {
            return false;
        }
        return ((f) this.f14205d).q(th);
    }

    private final void s() {
        if (!C()) {
            r();
        }
    }

    private final void t(int i4) {
        if (!M()) {
            O.a(this, i4);
        }
    }

    private final String y() {
        Object x3 = x();
        if (x3 instanceof t0) {
            return "Active";
        }
        if (x3 instanceof C0751o) {
            return "Cancelled";
        }
        return "Completed";
    }

    public boolean B() {
        return !(x() instanceof t0);
    }

    /* access modifiers changed from: protected */
    public String F() {
        return "CancellableContinuation";
    }

    public final void G(Throwable th) {
        if (!q(th)) {
            l(th);
            s();
        }
    }

    public final boolean I() {
        Object obj = this._state;
        if (!(obj instanceof C0756u) || ((C0756u) obj).f14313d == null) {
            this._decision = 0;
            this._state = C0732d.f14076a;
            return true;
        }
        r();
        return false;
    }

    public void a(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof t0) {
                throw new IllegalStateException("Not completed");
            } else if (!(obj2 instanceof C0757v)) {
                if (obj2 instanceof C0756u) {
                    C0756u uVar = (C0756u) obj2;
                    if (!uVar.c()) {
                        if (b.a(f14204h, this, obj2, C0756u.b(uVar, (Object) null, (C0740i) null, (l) null, (Object) null, th, 15, (Object) null))) {
                            uVar.d(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once");
                    }
                } else if (b.a(f14204h, this, obj2, new C0756u(obj2, (C0740i) null, (l) null, (Object) null, th, 14, (i) null))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public void b(Object obj, l lVar) {
        J(obj, this.f14001c, lVar);
    }

    public Object c(Object obj, Object obj2) {
        return N(obj, obj2, (l) null);
    }

    public final kotlin.coroutines.c d() {
        return this.f14205d;
    }

    public Throwable e(Object obj) {
        Throwable e4 = super.e(obj);
        if (e4 != null) {
            return e4;
        }
        return null;
    }

    public void f(CoroutineDispatcher coroutineDispatcher, Object obj) {
        f fVar;
        int i4;
        kotlin.coroutines.c cVar = this.f14205d;
        CoroutineDispatcher coroutineDispatcher2 = null;
        if (cVar instanceof f) {
            fVar = (f) cVar;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            coroutineDispatcher2 = fVar.f14172d;
        }
        if (coroutineDispatcher2 == coroutineDispatcher) {
            i4 = 4;
        } else {
            i4 = this.f14001c;
        }
        K(this, obj, i4, (l) null, 4, (Object) null);
    }

    public Object g(Object obj) {
        if (obj instanceof C0756u) {
            return ((C0756u) obj).f14310a;
        }
        return obj;
    }

    public c getCallerFrame() {
        kotlin.coroutines.c cVar = this.f14205d;
        if (cVar instanceof c) {
            return (c) cVar;
        }
        return null;
    }

    public CoroutineContext getContext() {
        return this.f14206e;
    }

    public Object i() {
        return x();
    }

    public void j(l lVar) {
        C0740i D3 = D(lVar);
        while (true) {
            Object obj = this._state;
            if (obj instanceof C0732d) {
                if (b.a(f14204h, this, obj, D3)) {
                    return;
                }
            } else if (obj instanceof C0740i) {
                E(lVar, obj);
            } else if (obj instanceof C0757v) {
                C0757v vVar = (C0757v) obj;
                if (!vVar.b()) {
                    E(lVar, obj);
                }
                if (obj instanceof C0751o) {
                    Throwable th = null;
                    if (!(obj instanceof C0757v)) {
                        vVar = null;
                    }
                    if (vVar != null) {
                        th = vVar.f14316a;
                    }
                    n(lVar, th);
                    return;
                }
                return;
            } else if (obj instanceof C0756u) {
                C0756u uVar = (C0756u) obj;
                if (uVar.f14311b != null) {
                    E(lVar, obj);
                }
                if (!(D3 instanceof C0734e)) {
                    if (uVar.c()) {
                        n(lVar, uVar.f14314e);
                        return;
                    }
                    if (b.a(f14204h, this, obj, C0756u.b(uVar, (Object) null, D3, (l) null, (Object) null, (Throwable) null, 29, (Object) null))) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (!(D3 instanceof C0734e)) {
                if (b.a(f14204h, this, obj, new C0756u(obj, D3, (l) null, (Object) null, (Throwable) null, 28, (i) null))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public boolean l(Throwable th) {
        Object obj;
        boolean z3;
        C0740i iVar;
        do {
            obj = this._state;
            if (!(obj instanceof t0)) {
                return false;
            }
            z3 = obj instanceof C0740i;
        } while (!b.a(f14204h, this, obj, new C0751o(this, th, z3)));
        if (z3) {
            iVar = (C0740i) obj;
        } else {
            iVar = null;
        }
        if (iVar != null) {
            m(iVar, th);
        }
        s();
        t(this.f14001c);
        return true;
    }

    public final void m(C0740i iVar, Throwable th) {
        try {
            iVar.a(th);
        } catch (Throwable th2) {
            CoroutineContext context = getContext();
            B.a(context, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void o(l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            CoroutineContext context = getContext();
            B.a(context, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public Object p(Object obj, Object obj2, l lVar) {
        return N(obj, obj2, lVar);
    }

    public final void r() {
        Q q4 = this.f14207f;
        if (q4 != null) {
            q4.d();
            this.f14207f = s0.f14230a;
        }
    }

    public void resumeWith(Object obj) {
        K(this, C0760y.b(obj, this), this.f14001c, (l) null, 4, (Object) null);
    }

    public String toString() {
        return F() + '(' + F.c(this.f14205d) + "){" + y() + "}@" + F.b(this);
    }

    public Throwable u(g0 g0Var) {
        return g0Var.R();
    }

    public final Object v() {
        g0 g0Var;
        boolean C3 = C();
        if (O()) {
            if (this.f14207f == null) {
                A();
            }
            if (C3) {
                H();
            }
            return a.f();
        }
        if (C3) {
            H();
        }
        Object x3 = x();
        if (x3 instanceof C0757v) {
            throw ((C0757v) x3).f14316a;
        } else if (!O.b(this.f14001c) || (g0Var = (g0) getContext().get(g0.f14139t)) == null || g0Var.a()) {
            return g(x3);
        } else {
            CancellationException R3 = g0Var.R();
            a(x3, R3);
            throw R3;
        }
    }

    public void w(Object obj) {
        t(this.f14001c);
    }

    public final Object x() {
        return this._state;
    }

    public void z() {
        Q A3 = A();
        if (A3 != null && B()) {
            A3.d();
            this.f14207f = s0.f14230a;
        }
    }
}
