package kotlinx.coroutines.selects;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.f;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.B;
import kotlinx.coroutines.C0749m;
import kotlinx.coroutines.C0757v;
import kotlinx.coroutines.C0760y;
import kotlinx.coroutines.L;
import kotlinx.coroutines.Q;
import kotlinx.coroutines.g0;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.internal.C0742b;
import kotlinx.coroutines.internal.C0743c;
import kotlinx.coroutines.internal.C0744d;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.k;
import kotlinx.coroutines.internal.t;
import l2.q;
import u2.l;
import u2.p;

public final class b extends k implements a, d, kotlin.coroutines.c, kotlin.coroutines.jvm.internal.c {

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f14279e;

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f14280f;
    private volatile /* synthetic */ Object _parentHandle = null;
    private volatile /* synthetic */ Object _result = e.f14292c;
    volatile /* synthetic */ Object _state = e.e();

    /* renamed from: d  reason: collision with root package name */
    private final kotlin.coroutines.c f14281d;

    private static final class a extends C0744d {

        /* renamed from: b  reason: collision with root package name */
        public final b f14282b;

        /* renamed from: c  reason: collision with root package name */
        public final C0742b f14283c;

        /* renamed from: d  reason: collision with root package name */
        private final long f14284d = e.f14294e.a();

        public a(b bVar, C0742b bVar2) {
            this.f14282b = bVar;
            this.f14283c = bVar2;
            bVar2.d(this);
        }

        private final void j(Object obj) {
            boolean z3;
            Object obj2;
            if (obj == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                obj2 = null;
            } else {
                obj2 = e.e();
            }
            if (androidx.concurrent.futures.b.a(b.f14279e, this.f14282b, this, obj2) && z3) {
                this.f14282b.U();
            }
        }

        private final Object k() {
            b bVar = this.f14282b;
            while (true) {
                Object obj = bVar._state;
                if (obj == this) {
                    return null;
                }
                if (obj instanceof t) {
                    ((t) obj).c(this.f14282b);
                } else if (obj != e.e()) {
                    return e.d();
                } else {
                    if (androidx.concurrent.futures.b.a(b.f14279e, this.f14282b, e.e(), this)) {
                        return null;
                    }
                }
            }
        }

        private final void l() {
            androidx.concurrent.futures.b.a(b.f14279e, this.f14282b, this, e.e());
        }

        public void d(Object obj, Object obj2) {
            j(obj2);
            this.f14283c.a(this, obj2);
        }

        public long g() {
            return this.f14284d;
        }

        public Object i(Object obj) {
            Object k4;
            if (obj == null && (k4 = k()) != null) {
                return k4;
            }
            try {
                return this.f14283c.c(this);
            } catch (Throwable th) {
                if (obj == null) {
                    l();
                }
                throw th;
            }
        }

        public String toString() {
            return "AtomicSelectOp(sequence=" + g() + ')';
        }
    }

    /* renamed from: kotlinx.coroutines.selects.b$b  reason: collision with other inner class name */
    private static final class C0203b extends LockFreeLinkedListNode {

        /* renamed from: d  reason: collision with root package name */
        public final Q f14285d;

        public C0203b(Q q4) {
            this.f14285d = q4;
        }
    }

    private static final class c extends t {

        /* renamed from: a  reason: collision with root package name */
        public final LockFreeLinkedListNode.c f14286a;

        public c(LockFreeLinkedListNode.c cVar) {
            this.f14286a = cVar;
        }

        public C0744d a() {
            return this.f14286a.a();
        }

        public Object c(Object obj) {
            Object obj2;
            if (obj != null) {
                b bVar = (b) obj;
                this.f14286a.d();
                Object e4 = this.f14286a.a().e((Object) null);
                if (e4 == null) {
                    obj2 = this.f14286a.f14155c;
                } else {
                    obj2 = e.e();
                }
                androidx.concurrent.futures.b.a(b.f14279e, bVar, this, obj2);
                return e4;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>");
        }
    }

    private final class d extends h0 {
        public d() {
        }

        public void R(Throwable th) {
            if (b.this.q()) {
                b.this.k(S().R());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            R((Throwable) obj);
            return q.f14567a;
        }
    }

    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f14288a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f14289b;

        public e(b bVar, l lVar) {
            this.f14288a = bVar;
            this.f14289b = lVar;
        }

        public final void run() {
            if (this.f14288a.q()) {
                E2.a.c(this.f14289b, this.f14288a.e());
            }
        }
    }

    static {
        Class<b> cls = b.class;
        Class<Object> cls2 = Object.class;
        f14279e = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state");
        f14280f = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_result");
    }

    public b(kotlin.coroutines.c cVar) {
        this.f14281d = cVar;
    }

    /* access modifiers changed from: private */
    public final void U() {
        Q V3 = V();
        if (V3 != null) {
            V3.d();
        }
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) G(); !o.a(lockFreeLinkedListNode, this); lockFreeLinkedListNode = lockFreeLinkedListNode.H()) {
            if (lockFreeLinkedListNode instanceof C0203b) {
                ((C0203b) lockFreeLinkedListNode).f14285d.d();
            }
        }
    }

    private final Q V() {
        return (Q) this._parentHandle;
    }

    private final void Y() {
        g0 g0Var = (g0) getContext().get(g0.f14139t);
        if (g0Var != null) {
            Q d4 = g0.a.d(g0Var, true, false, new d(), 2, (Object) null);
            Z(d4);
            if (v()) {
                d4.d();
            }
        }
    }

    private final void Z(Q q4) {
        this._parentHandle = q4;
    }

    public final Object W() {
        if (!v()) {
            Y();
        }
        Object obj = this._result;
        if (obj == e.f14292c) {
            if (androidx.concurrent.futures.b.a(f14280f, this, e.f14292c, kotlin.coroutines.intrinsics.a.f())) {
                return kotlin.coroutines.intrinsics.a.f();
            }
            obj = this._result;
        }
        if (obj == e.f14293d) {
            throw new IllegalStateException("Already resumed");
        } else if (!(obj instanceof C0757v)) {
            return obj;
        } else {
            throw ((C0757v) obj).f14316a;
        }
    }

    public final void X(Throwable th) {
        if (q()) {
            Result.a aVar = Result.Companion;
            resumeWith(Result.m1constructorimpl(f.a(th)));
        } else if (!(th instanceof CancellationException)) {
            Object W3 = W();
            if (!(W3 instanceof C0757v) || ((C0757v) W3).f14316a != th) {
                B.a(getContext(), th);
            }
        }
    }

    public kotlin.coroutines.c e() {
        return this;
    }

    public void g(c cVar, p pVar) {
        cVar.t(this, pVar);
    }

    public kotlin.coroutines.jvm.internal.c getCallerFrame() {
        kotlin.coroutines.c cVar = this.f14281d;
        if (cVar instanceof kotlin.coroutines.jvm.internal.c) {
            return (kotlin.coroutines.jvm.internal.c) cVar;
        }
        return null;
    }

    public CoroutineContext getContext() {
        return this.f14281d.getContext();
    }

    public void i(long j4, l lVar) {
        if (j4 > 0) {
            t(L.b(getContext()).v(j4, new e(this, lVar), getContext()));
        } else if (q()) {
            E2.b.c(lVar, e());
        }
    }

    public void k(Throwable th) {
        while (true) {
            Object obj = this._result;
            if (obj == e.f14292c) {
                if (androidx.concurrent.futures.b.a(f14280f, this, e.f14292c, new C0757v(th, false, 2, (i) null))) {
                    return;
                }
            } else if (obj != kotlin.coroutines.intrinsics.a.f()) {
                throw new IllegalStateException("Already resumed");
            } else if (androidx.concurrent.futures.b.a(f14280f, this, kotlin.coroutines.intrinsics.a.f(), e.f14293d)) {
                kotlin.coroutines.c d4 = kotlin.coroutines.intrinsics.a.d(this.f14281d);
                Result.a aVar = Result.Companion;
                d4.resumeWith(Result.m1constructorimpl(f.a(th)));
                return;
            }
        }
    }

    public Object m(C0742b bVar) {
        return new a(this, bVar).c((Object) null);
    }

    public Object n(LockFreeLinkedListNode.c cVar) {
        while (true) {
            Object obj = this._state;
            if (obj == e.e()) {
                if (cVar == null) {
                    if (androidx.concurrent.futures.b.a(f14279e, this, e.e(), (Object) null)) {
                        break;
                    }
                } else {
                    c cVar2 = new c(cVar);
                    if (androidx.concurrent.futures.b.a(f14279e, this, e.e(), cVar2)) {
                        Object c4 = cVar2.c(this);
                        if (c4 != null) {
                            return c4;
                        }
                    }
                }
            } else if (obj instanceof t) {
                if (cVar != null) {
                    C0744d a4 = cVar.a();
                    if ((a4 instanceof a) && ((a) a4).f14282b == this) {
                        throw new IllegalStateException("Cannot use matching select clauses on the same object");
                    } else if (a4.b((t) obj)) {
                        return C0743c.f14168b;
                    }
                }
                ((t) obj).c(this);
            } else if (cVar != null && obj == cVar.f14155c) {
                return C0749m.f14209a;
            } else {
                return null;
            }
        }
        U();
        return C0749m.f14209a;
    }

    public boolean q() {
        Object n4 = n((LockFreeLinkedListNode.c) null);
        if (n4 == C0749m.f14209a) {
            return true;
        }
        if (n4 == null) {
            return false;
        }
        throw new IllegalStateException(("Unexpected trySelectIdempotent result " + n4).toString());
    }

    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this._result;
            if (obj2 == e.f14292c) {
                if (androidx.concurrent.futures.b.a(f14280f, this, e.f14292c, C0760y.d(obj, (l) null, 1, (Object) null))) {
                    return;
                }
            } else if (obj2 != kotlin.coroutines.intrinsics.a.f()) {
                throw new IllegalStateException("Already resumed");
            } else if (androidx.concurrent.futures.b.a(f14280f, this, kotlin.coroutines.intrinsics.a.f(), e.f14293d)) {
                if (Result.m7isFailureimpl(obj)) {
                    kotlin.coroutines.c cVar = this.f14281d;
                    Throwable r4 = Result.m4exceptionOrNullimpl(obj);
                    o.b(r4);
                    cVar.resumeWith(Result.m1constructorimpl(f.a(r4)));
                    return;
                }
                this.f14281d.resumeWith(obj);
                return;
            }
        }
    }

    public void t(Q q4) {
        C0203b bVar = new C0203b(q4);
        if (!v()) {
            A(bVar);
            if (!v()) {
                return;
            }
        }
        q4.d();
    }

    public String toString() {
        return "SelectInstance(state=" + this._state + ", result=" + this._result + ')';
    }

    public boolean v() {
        while (true) {
            Object obj = this._state;
            if (obj == e.e()) {
                return false;
            }
            if (!(obj instanceof t)) {
                return true;
            }
            ((t) obj).c(this);
        }
    }
}
