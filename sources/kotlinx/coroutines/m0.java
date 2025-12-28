package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.g0;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.l;
import kotlinx.coroutines.internal.t;
import kotlinx.coroutines.selects.d;
import l2.C0793c;
import l2.q;
import u2.p;

public class m0 implements g0, C0754s, u0 {

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f14210a = AtomicReferenceFieldUpdater.newUpdater(m0.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    private static final class a extends l0 {

        /* renamed from: e  reason: collision with root package name */
        private final m0 f14211e;

        /* renamed from: f  reason: collision with root package name */
        private final b f14212f;

        /* renamed from: g  reason: collision with root package name */
        private final r f14213g;

        /* renamed from: h  reason: collision with root package name */
        private final Object f14214h;

        public a(m0 m0Var, b bVar, r rVar, Object obj) {
            this.f14211e = m0Var;
            this.f14212f = bVar;
            this.f14213g = rVar;
            this.f14214h = obj;
        }

        public void R(Throwable th) {
            this.f14211e.K(this.f14212f, this.f14213g, this.f14214h);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            R((Throwable) obj);
            return q.f14567a;
        }
    }

    private static final class b implements C0729b0 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: a  reason: collision with root package name */
        private final r0 f14215a;

        public b(r0 r0Var, boolean z3, Throwable th) {
            this.f14215a = r0Var;
            this._isCompleting = z3 ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList c() {
            return new ArrayList(4);
        }

        private final Object d() {
            return this._exceptionsHolder;
        }

        private final void k(Object obj) {
            this._exceptionsHolder = obj;
        }

        public boolean a() {
            if (e() == null) {
                return true;
            }
            return false;
        }

        public final void b(Throwable th) {
            Throwable e4 = e();
            if (e4 == null) {
                l(th);
            } else if (th != e4) {
                Object d4 = d();
                if (d4 == null) {
                    k(th);
                } else if (d4 instanceof Throwable) {
                    if (th != d4) {
                        ArrayList c4 = c();
                        c4.add(d4);
                        c4.add(th);
                        k(c4);
                    }
                } else if (d4 instanceof ArrayList) {
                    ((ArrayList) d4).add(th);
                } else {
                    throw new IllegalStateException(("State is " + d4).toString());
                }
            }
        }

        public final Throwable e() {
            return (Throwable) this._rootCause;
        }

        public final boolean f() {
            if (e() != null) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
        public final boolean g() {
            return this._isCompleting;
        }

        public final boolean h() {
            if (d() == n0.f14222e) {
                return true;
            }
            return false;
        }

        public final List i(Throwable th) {
            ArrayList arrayList;
            Object d4 = d();
            if (d4 == null) {
                arrayList = c();
            } else if (d4 instanceof Throwable) {
                ArrayList c4 = c();
                c4.add(d4);
                arrayList = c4;
            } else if (d4 instanceof ArrayList) {
                arrayList = (ArrayList) d4;
            } else {
                throw new IllegalStateException(("State is " + d4).toString());
            }
            Throwable e4 = e();
            if (e4 != null) {
                arrayList.add(0, e4);
            }
            if (th != null && !o.a(th, e4)) {
                arrayList.add(th);
            }
            k(n0.f14222e);
            return arrayList;
        }

        public final void j(boolean z3) {
            this._isCompleting = z3 ? 1 : 0;
        }

        public final void l(Throwable th) {
            this._rootCause = th;
        }

        public String toString() {
            return "Finishing[cancelling=" + f() + ", completing=" + g() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + u() + ']';
        }

        public r0 u() {
            return this.f14215a;
        }
    }

    public static final class c extends LockFreeLinkedListNode.b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m0 f14216d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f14217e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(LockFreeLinkedListNode lockFreeLinkedListNode, m0 m0Var, Object obj) {
            super(lockFreeLinkedListNode);
            this.f14216d = m0Var;
            this.f14217e = obj;
        }

        /* renamed from: k */
        public Object i(LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (this.f14216d.W() == this.f14217e) {
                return null;
            }
            return l.a();
        }
    }

    public m0(boolean z3) {
        T t4;
        if (z3) {
            t4 = n0.f14224g;
        } else {
            t4 = n0.f14223f;
        }
        this._state = t4;
        this._parentHandle = null;
    }

    private final boolean B0(C0729b0 b0Var, Object obj) {
        if (!androidx.concurrent.futures.b.a(f14210a, this, b0Var, n0.g(obj))) {
            return false;
        }
        m0((Throwable) null);
        n0(obj);
        J(b0Var, obj);
        return true;
    }

    private final boolean C0(C0729b0 b0Var, Throwable th) {
        r0 U3 = U(b0Var);
        if (U3 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f14210a, this, b0Var, new b(U3, false, th))) {
            return false;
        }
        k0(U3, th);
        return true;
    }

    private final Object D0(Object obj, Object obj2) {
        if (!(obj instanceof C0729b0)) {
            return n0.f14218a;
        }
        if ((!(obj instanceof T) && !(obj instanceof l0)) || (obj instanceof r) || (obj2 instanceof C0757v)) {
            return E0((C0729b0) obj, obj2);
        }
        if (B0((C0729b0) obj, obj2)) {
            return obj2;
        }
        return n0.f14220c;
    }

    private final Object E(Object obj) {
        Object D02;
        do {
            Object W3 = W();
            if (!(W3 instanceof C0729b0) || ((W3 instanceof b) && ((b) W3).g())) {
                return n0.f14218a;
            }
            D02 = D0(W3, new C0757v(L(obj), false, 2, (i) null));
        } while (D02 == n0.f14220c);
        return D02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0065, code lost:
        if (r2 == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0067, code lost:
        k0(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006a, code lost:
        r7 = N(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006e, code lost:
        if (r7 == null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0074, code lost:
        if (F0(r1, r7, r8) == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0078, code lost:
        return kotlinx.coroutines.n0.f14219b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x007d, code lost:
        return M(r1, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object E0(kotlinx.coroutines.C0729b0 r7, java.lang.Object r8) {
        /*
            r6 = this;
            kotlinx.coroutines.r0 r0 = r6.U(r7)
            if (r0 != 0) goto L_0x000b
            kotlinx.coroutines.internal.y r7 = kotlinx.coroutines.n0.f14220c
            return r7
        L_0x000b:
            boolean r1 = r7 instanceof kotlinx.coroutines.m0.b
            r2 = 0
            if (r1 == 0) goto L_0x0014
            r1 = r7
            kotlinx.coroutines.m0$b r1 = (kotlinx.coroutines.m0.b) r1
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r3 = 0
            if (r1 != 0) goto L_0x001d
            kotlinx.coroutines.m0$b r1 = new kotlinx.coroutines.m0$b
            r1.<init>(r0, r3, r2)
        L_0x001d:
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
            r3.<init>()
            monitor-enter(r1)
            boolean r4 = r1.g()     // Catch:{ all -> 0x002f }
            if (r4 == 0) goto L_0x0031
            kotlinx.coroutines.internal.y r7 = kotlinx.coroutines.n0.f14218a     // Catch:{ all -> 0x002f }
            monitor-exit(r1)
            return r7
        L_0x002f:
            r7 = move-exception
            goto L_0x007e
        L_0x0031:
            r4 = 1
            r1.j(r4)     // Catch:{ all -> 0x002f }
            if (r1 == r7) goto L_0x0045
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f14210a     // Catch:{ all -> 0x002f }
            boolean r4 = androidx.concurrent.futures.b.a(r4, r6, r7, r1)     // Catch:{ all -> 0x002f }
            if (r4 != 0) goto L_0x0045
            kotlinx.coroutines.internal.y r7 = kotlinx.coroutines.n0.f14220c     // Catch:{ all -> 0x002f }
            monitor-exit(r1)
            return r7
        L_0x0045:
            boolean r4 = r1.f()     // Catch:{ all -> 0x002f }
            boolean r5 = r8 instanceof kotlinx.coroutines.C0757v     // Catch:{ all -> 0x002f }
            if (r5 == 0) goto L_0x0051
            r5 = r8
            kotlinx.coroutines.v r5 = (kotlinx.coroutines.C0757v) r5     // Catch:{ all -> 0x002f }
            goto L_0x0052
        L_0x0051:
            r5 = r2
        L_0x0052:
            if (r5 == 0) goto L_0x0059
            java.lang.Throwable r5 = r5.f14316a     // Catch:{ all -> 0x002f }
            r1.b(r5)     // Catch:{ all -> 0x002f }
        L_0x0059:
            java.lang.Throwable r5 = r1.e()     // Catch:{ all -> 0x002f }
            if (r4 != 0) goto L_0x0060
            r2 = r5
        L_0x0060:
            r3.element = r2     // Catch:{ all -> 0x002f }
            l2.q r3 = l2.q.f14567a     // Catch:{ all -> 0x002f }
            monitor-exit(r1)
            if (r2 == 0) goto L_0x006a
            r6.k0(r0, r2)
        L_0x006a:
            kotlinx.coroutines.r r7 = r6.N(r7)
            if (r7 == 0) goto L_0x0079
            boolean r7 = r6.F0(r1, r7, r8)
            if (r7 == 0) goto L_0x0079
            kotlinx.coroutines.internal.y r7 = kotlinx.coroutines.n0.f14219b
            return r7
        L_0x0079:
            java.lang.Object r7 = r6.M(r1, r8)
            return r7
        L_0x007e:
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.m0.E0(kotlinx.coroutines.b0, java.lang.Object):java.lang.Object");
    }

    private final boolean F(Throwable th) {
        if (c0()) {
            return true;
        }
        boolean z3 = th instanceof CancellationException;
        C0753q V3 = V();
        if (V3 == null || V3 == s0.f14230a) {
            return z3;
        }
        if (V3.r(th) || z3) {
            return true;
        }
        return false;
    }

    private final boolean F0(b bVar, r rVar, Object obj) {
        while (g0.a.d(rVar.f14229e, false, false, new a(this, bVar, rVar, obj), 1, (Object) null) == s0.f14230a) {
            rVar = i0(rVar);
            if (rVar == null) {
                return false;
            }
        }
        return true;
    }

    private final void J(C0729b0 b0Var, Object obj) {
        C0757v vVar;
        C0753q V3 = V();
        if (V3 != null) {
            V3.d();
            v0(s0.f14230a);
        }
        Throwable th = null;
        if (obj instanceof C0757v) {
            vVar = (C0757v) obj;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            th = vVar.f14316a;
        }
        if (b0Var instanceof l0) {
            try {
                ((l0) b0Var).R(th);
            } catch (Throwable th2) {
                Y(new CompletionHandlerException("Exception in completion handler " + b0Var + " for " + this, th2));
            }
        } else {
            r0 u3 = b0Var.u();
            if (u3 != null) {
                l0(u3, th);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void K(b bVar, r rVar, Object obj) {
        r i02 = i0(rVar);
        if (i02 == null || !F0(bVar, i02, obj)) {
            z(M(bVar, obj));
        }
    }

    private final Throwable L(Object obj) {
        boolean z3;
        if (obj == null) {
            z3 = true;
        } else {
            z3 = obj instanceof Throwable;
        }
        if (z3) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new JobCancellationException(H(), (Throwable) null, this);
            }
            return th;
        } else if (obj != null) {
            return ((u0) obj).Q();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    private final Object M(b bVar, Object obj) {
        C0757v vVar;
        Throwable th;
        boolean f4;
        Throwable P3;
        if (obj instanceof C0757v) {
            vVar = (C0757v) obj;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            th = vVar.f14316a;
        } else {
            th = null;
        }
        synchronized (bVar) {
            f4 = bVar.f();
            List i4 = bVar.i(th);
            P3 = P(bVar, i4);
            if (P3 != null) {
                y(P3, i4);
            }
        }
        if (!(P3 == null || P3 == th)) {
            obj = new C0757v(P3, false, 2, (i) null);
        }
        if (P3 != null && (F(P3) || X(P3))) {
            if (obj != null) {
                ((C0757v) obj).b();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            }
        }
        if (!f4) {
            m0(P3);
        }
        n0(obj);
        androidx.concurrent.futures.b.a(f14210a, this, bVar, n0.g(obj));
        J(bVar, obj);
        return obj;
    }

    private final r N(C0729b0 b0Var) {
        r rVar;
        if (b0Var instanceof r) {
            rVar = (r) b0Var;
        } else {
            rVar = null;
        }
        if (rVar != null) {
            return rVar;
        }
        r0 u3 = b0Var.u();
        if (u3 != null) {
            return i0(u3);
        }
        return null;
    }

    private final Throwable O(Object obj) {
        C0757v vVar;
        if (obj instanceof C0757v) {
            vVar = (C0757v) obj;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            return vVar.f14316a;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Throwable P(kotlinx.coroutines.m0.b r5, java.util.List r6) {
        /*
            r4 = this;
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            boolean r5 = r5.f()
            if (r5 == 0) goto L_0x0017
            kotlinx.coroutines.JobCancellationException r5 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r6 = r4.H()
            r5.<init>(r6, r1, r4)
            return r5
        L_0x0017:
            return r1
        L_0x0018:
            r5 = r6
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r0 = r5.iterator()
        L_0x001f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0031
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            boolean r3 = r3 instanceof java.util.concurrent.CancellationException
            if (r3 != 0) goto L_0x001f
            goto L_0x0032
        L_0x0031:
            r2 = r1
        L_0x0032:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 == 0) goto L_0x0037
            return r2
        L_0x0037:
            r0 = 0
            java.lang.Object r6 = r6.get(r0)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            boolean r0 = r6 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r0 == 0) goto L_0x005f
            java.util.Iterator r5 = r5.iterator()
        L_0x0046:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r5.next()
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 == r6) goto L_0x0046
            boolean r2 = r2 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r2 == 0) goto L_0x0046
            r1 = r0
        L_0x005a:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x005f
            return r1
        L_0x005f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.m0.P(kotlinx.coroutines.m0$b, java.util.List):java.lang.Throwable");
    }

    private final r0 U(C0729b0 b0Var) {
        r0 u3 = b0Var.u();
        if (u3 != null) {
            return u3;
        }
        if (b0Var instanceof T) {
            return new r0();
        }
        if (b0Var instanceof l0) {
            r0((l0) b0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + b0Var).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r0 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        k0(((kotlinx.coroutines.m0.b) r2).u(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        return kotlinx.coroutines.n0.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object d0(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r6.W()
            boolean r3 = r2 instanceof kotlinx.coroutines.m0.b
            if (r3 == 0) goto L_0x0050
            monitor-enter(r2)
            r3 = r2
            kotlinx.coroutines.m0$b r3 = (kotlinx.coroutines.m0.b) r3     // Catch:{ all -> 0x001a }
            boolean r3 = r3.h()     // Catch:{ all -> 0x001a }
            if (r3 == 0) goto L_0x001c
            kotlinx.coroutines.internal.y r7 = kotlinx.coroutines.n0.f14221d     // Catch:{ all -> 0x001a }
            monitor-exit(r2)
            return r7
        L_0x001a:
            r7 = move-exception
            goto L_0x004e
        L_0x001c:
            r3 = r2
            kotlinx.coroutines.m0$b r3 = (kotlinx.coroutines.m0.b) r3     // Catch:{ all -> 0x001a }
            boolean r3 = r3.f()     // Catch:{ all -> 0x001a }
            if (r7 != 0) goto L_0x0027
            if (r3 != 0) goto L_0x0033
        L_0x0027:
            if (r1 != 0) goto L_0x002d
            java.lang.Throwable r1 = r6.L(r7)     // Catch:{ all -> 0x001a }
        L_0x002d:
            r7 = r2
            kotlinx.coroutines.m0$b r7 = (kotlinx.coroutines.m0.b) r7     // Catch:{ all -> 0x001a }
            r7.b(r1)     // Catch:{ all -> 0x001a }
        L_0x0033:
            r7 = r2
            kotlinx.coroutines.m0$b r7 = (kotlinx.coroutines.m0.b) r7     // Catch:{ all -> 0x001a }
            java.lang.Throwable r7 = r7.e()     // Catch:{ all -> 0x001a }
            if (r3 != 0) goto L_0x003d
            r0 = r7
        L_0x003d:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0049
            kotlinx.coroutines.m0$b r2 = (kotlinx.coroutines.m0.b) r2
            kotlinx.coroutines.r0 r7 = r2.u()
            r6.k0(r7, r0)
        L_0x0049:
            kotlinx.coroutines.internal.y r7 = kotlinx.coroutines.n0.f14218a
            return r7
        L_0x004e:
            monitor-exit(r2)
            throw r7
        L_0x0050:
            boolean r3 = r2 instanceof kotlinx.coroutines.C0729b0
            if (r3 == 0) goto L_0x00a1
            if (r1 != 0) goto L_0x005a
            java.lang.Throwable r1 = r6.L(r7)
        L_0x005a:
            r3 = r2
            kotlinx.coroutines.b0 r3 = (kotlinx.coroutines.C0729b0) r3
            boolean r4 = r3.a()
            if (r4 == 0) goto L_0x006e
            boolean r2 = r6.C0(r3, r1)
            if (r2 == 0) goto L_0x0002
            kotlinx.coroutines.internal.y r7 = kotlinx.coroutines.n0.f14218a
            return r7
        L_0x006e:
            kotlinx.coroutines.v r3 = new kotlinx.coroutines.v
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.D0(r2, r3)
            kotlinx.coroutines.internal.y r4 = kotlinx.coroutines.n0.f14218a
            if (r3 == r4) goto L_0x0086
            kotlinx.coroutines.internal.y r2 = kotlinx.coroutines.n0.f14220c
            if (r3 == r2) goto L_0x0002
            return r3
        L_0x0086:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot happen in "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x00a1:
            kotlinx.coroutines.internal.y r7 = kotlinx.coroutines.n0.f14221d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.m0.d0(java.lang.Object):java.lang.Object");
    }

    private final l0 g0(u2.l lVar, boolean z3) {
        l0 l0Var = null;
        if (z3) {
            if (lVar instanceof h0) {
                l0Var = (h0) lVar;
            }
            if (l0Var == null) {
                l0Var = new C0735e0(lVar);
            }
        } else {
            if (lVar instanceof l0) {
                l0Var = (l0) lVar;
            }
            if (l0Var == null) {
                l0Var = new C0737f0(lVar);
            }
        }
        l0Var.T(this);
        return l0Var;
    }

    private final r i0(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.L()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.I();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.H();
            if (!lockFreeLinkedListNode.L()) {
                if (lockFreeLinkedListNode instanceof r) {
                    return (r) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof r0) {
                    return null;
                }
            }
        }
    }

    private final void k0(r0 r0Var, Throwable th) {
        m0(th);
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) r0Var.G(); !o.a(lockFreeLinkedListNode, r0Var); lockFreeLinkedListNode = lockFreeLinkedListNode.H()) {
            if (lockFreeLinkedListNode instanceof h0) {
                l0 l0Var = (l0) lockFreeLinkedListNode;
                try {
                    l0Var.R(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        C0793c.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + l0Var + " for " + this, th2);
                        q qVar = q.f14567a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            Y(completionHandlerException);
        }
        F(th);
    }

    private final void l0(r0 r0Var, Throwable th) {
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) r0Var.G(); !o.a(lockFreeLinkedListNode, r0Var); lockFreeLinkedListNode = lockFreeLinkedListNode.H()) {
            if (lockFreeLinkedListNode instanceof l0) {
                l0 l0Var = (l0) lockFreeLinkedListNode;
                try {
                    l0Var.R(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        C0793c.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + l0Var + " for " + this, th2);
                        q qVar = q.f14567a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            Y(completionHandlerException);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [kotlinx.coroutines.a0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void q0(kotlinx.coroutines.T r3) {
        /*
            r2 = this;
            kotlinx.coroutines.r0 r0 = new kotlinx.coroutines.r0
            r0.<init>()
            boolean r1 = r3.a()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            kotlinx.coroutines.a0 r1 = new kotlinx.coroutines.a0
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f14210a
            androidx.concurrent.futures.b.a(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.m0.q0(kotlinx.coroutines.T):void");
    }

    private final void r0(l0 l0Var) {
        l0Var.C(new r0());
        androidx.concurrent.futures.b.a(f14210a, this, l0Var, l0Var.H());
    }

    private final int w0(Object obj) {
        if (obj instanceof T) {
            if (((T) obj).a()) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f14210a, this, obj, n0.f14224g)) {
                return -1;
            }
            p0();
            return 1;
        } else if (!(obj instanceof C0727a0)) {
            return 0;
        } else {
            if (!androidx.concurrent.futures.b.a(f14210a, this, obj, ((C0727a0) obj).u())) {
                return -1;
            }
            p0();
            return 1;
        }
    }

    private final boolean x(Object obj, r0 r0Var, l0 l0Var) {
        int Q3;
        c cVar = new c(l0Var, this, obj);
        do {
            Q3 = r0Var.I().Q(l0Var, r0Var, cVar);
            if (Q3 == 1) {
                return true;
            }
        } while (Q3 != 2);
        return false;
    }

    private final String x0(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (bVar.f()) {
                return "Cancelling";
            }
            if (bVar.g()) {
                return "Completing";
            }
            return "Active";
        } else if (obj instanceof C0729b0) {
            if (((C0729b0) obj).a()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof C0757v) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    private final void y(Throwable th, List list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th2 = (Throwable) it.next();
                if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    C0793c.a(th, th2);
                }
            }
        }
    }

    public static /* synthetic */ CancellationException z0(m0 m0Var, Throwable th, String str, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                str = null;
            }
            return m0Var.y0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    public final boolean A(Throwable th) {
        return B(th);
    }

    public final String A0() {
        return h0() + '{' + x0(W()) + '}';
    }

    public final boolean B(Object obj) {
        Object a4 = n0.f14218a;
        if (T() && (a4 = E(obj)) == n0.f14219b) {
            return true;
        }
        if (a4 == n0.f14218a) {
            a4 = d0(obj);
        }
        if (a4 == n0.f14218a || a4 == n0.f14219b) {
            return true;
        }
        if (a4 == n0.f14221d) {
            return false;
        }
        z(a4);
        return true;
    }

    public void C(Throwable th) {
        B(th);
    }

    public final Q G(u2.l lVar) {
        return m(false, true, lVar);
    }

    /* access modifiers changed from: protected */
    public String H() {
        return "Job was cancelled";
    }

    public boolean I(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (!B(th) || !S()) {
            return false;
        }
        return true;
    }

    public CancellationException Q() {
        Throwable th;
        Object W3 = W();
        CancellationException cancellationException = null;
        if (W3 instanceof b) {
            th = ((b) W3).e();
        } else if (W3 instanceof C0757v) {
            th = ((C0757v) W3).f14316a;
        } else if (!(W3 instanceof C0729b0)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + W3).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        if (cancellationException != null) {
            return cancellationException;
        }
        return new JobCancellationException("Parent job is " + x0(W3), th, this);
    }

    public final CancellationException R() {
        Object W3 = W();
        if (W3 instanceof b) {
            Throwable e4 = ((b) W3).e();
            if (e4 != null) {
                CancellationException y02 = y0(e4, F.a(this) + " is cancelling");
                if (y02 != null) {
                    return y02;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (W3 instanceof C0729b0) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (W3 instanceof C0757v) {
            return z0(this, ((C0757v) W3).f14316a, (String) null, 1, (Object) null);
        } else {
            return new JobCancellationException(F.a(this) + " has completed normally", (Throwable) null, this);
        }
    }

    public boolean S() {
        return true;
    }

    public boolean T() {
        return false;
    }

    public final C0753q V() {
        return (C0753q) this._parentHandle;
    }

    public final Object W() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof t)) {
                return obj;
            }
            ((t) obj).c(this);
        }
    }

    /* access modifiers changed from: protected */
    public boolean X(Throwable th) {
        return false;
    }

    public void Y(Throwable th) {
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void Z(g0 g0Var) {
        if (g0Var == null) {
            v0(s0.f14230a);
            return;
        }
        g0Var.start();
        C0753q o02 = g0Var.o0(this);
        v0(o02);
        if (a0()) {
            o02.d();
            v0(s0.f14230a);
        }
    }

    public boolean a() {
        Object W3 = W();
        if (!(W3 instanceof C0729b0) || !((C0729b0) W3).a()) {
            return false;
        }
        return true;
    }

    public final boolean a0() {
        return !(W() instanceof C0729b0);
    }

    public final void b0(u0 u0Var) {
        B(u0Var);
    }

    /* access modifiers changed from: protected */
    public boolean c0() {
        return false;
    }

    public void e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(H(), (Throwable) null, this);
        }
        C(cancellationException);
    }

    public final Object f0(Object obj) {
        Object D02;
        do {
            D02 = D0(W(), obj);
            if (D02 == n0.f14218a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, O(obj));
            }
        } while (D02 == n0.f14220c);
        return D02;
    }

    public Object fold(Object obj, p pVar) {
        return g0.a.b(this, obj, pVar);
    }

    public CoroutineContext.a get(CoroutineContext.b bVar) {
        return g0.a.c(this, bVar);
    }

    public final CoroutineContext.b getKey() {
        return g0.f14139t;
    }

    public String h0() {
        return F.a(this);
    }

    public final boolean isCancelled() {
        Object W3 = W();
        if ((W3 instanceof C0757v) || ((W3 instanceof b) && ((b) W3).f())) {
            return true;
        }
        return false;
    }

    public final Q m(boolean z3, boolean z4, u2.l lVar) {
        C0757v vVar;
        l0 g02 = g0(lVar, z3);
        while (true) {
            Object W3 = W();
            if (W3 instanceof T) {
                T t4 = (T) W3;
                if (!t4.a()) {
                    q0(t4);
                } else if (androidx.concurrent.futures.b.a(f14210a, this, W3, g02)) {
                    return g02;
                }
            } else {
                Throwable th = null;
                if (W3 instanceof C0729b0) {
                    r0 u3 = ((C0729b0) W3).u();
                    if (u3 != null) {
                        Q q4 = s0.f14230a;
                        if (z3 && (W3 instanceof b)) {
                            synchronized (W3) {
                                try {
                                    th = ((b) W3).e();
                                    if (th != null) {
                                        if ((lVar instanceof r) && !((b) W3).g()) {
                                        }
                                        q qVar = q.f14567a;
                                    }
                                    if (x(W3, u3, g02)) {
                                        if (th == null) {
                                            return g02;
                                        }
                                        q4 = g02;
                                        q qVar2 = q.f14567a;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        if (th != null) {
                            if (z4) {
                                lVar.invoke(th);
                            }
                            return q4;
                        } else if (x(W3, u3, g02)) {
                            return g02;
                        }
                    } else if (W3 != null) {
                        r0((l0) W3);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                } else {
                    if (z4) {
                        if (W3 instanceof C0757v) {
                            vVar = (C0757v) W3;
                        } else {
                            vVar = null;
                        }
                        if (vVar != null) {
                            th = vVar.f14316a;
                        }
                        lVar.invoke(th);
                    }
                    return s0.f14230a;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void m0(Throwable th) {
    }

    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return g0.a.e(this, bVar);
    }

    /* access modifiers changed from: protected */
    public void n0(Object obj) {
    }

    public final C0753q o0(C0754s sVar) {
        return (C0753q) g0.a.d(this, true, false, new r(sVar), 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void p0() {
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return g0.a.f(this, coroutineContext);
    }

    public final void s0(d dVar, p pVar) {
        Object W3;
        do {
            W3 = W();
            if (!dVar.v()) {
                if (!(W3 instanceof C0729b0)) {
                    if (!dVar.q()) {
                        return;
                    }
                    if (W3 instanceof C0757v) {
                        dVar.k(((C0757v) W3).f14316a);
                        return;
                    } else {
                        E2.b.d(pVar, n0.h(W3), dVar.e());
                        return;
                    }
                }
            } else {
                return;
            }
        } while (w0(W3) != 0);
        dVar.t(G(new w0(dVar, pVar)));
    }

    public final boolean start() {
        int w02;
        do {
            w02 = w0(W());
            if (w02 == 0) {
                return false;
            }
        } while (w02 != 1);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t0(kotlinx.coroutines.l0 r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.W()
            boolean r1 = r0 instanceof kotlinx.coroutines.l0
            if (r1 == 0) goto L_0x0018
            if (r0 == r4) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f14210a
            kotlinx.coroutines.T r2 = kotlinx.coroutines.n0.f14224g
            boolean r0 = androidx.concurrent.futures.b.a(r1, r3, r0, r2)
            if (r0 == 0) goto L_0x0000
            return
        L_0x0018:
            boolean r1 = r0 instanceof kotlinx.coroutines.C0729b0
            if (r1 == 0) goto L_0x0027
            kotlinx.coroutines.b0 r0 = (kotlinx.coroutines.C0729b0) r0
            kotlinx.coroutines.r0 r0 = r0.u()
            if (r0 == 0) goto L_0x0027
            r4.M()
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.m0.t0(kotlinx.coroutines.l0):void");
    }

    public String toString() {
        return A0() + '@' + F.b(this);
    }

    public final void u0(d dVar, p pVar) {
        Object W3 = W();
        if (W3 instanceof C0757v) {
            dVar.k(((C0757v) W3).f14316a);
            return;
        }
        E2.a.e(pVar, n0.h(W3), dVar.e(), (u2.l) null, 4, (Object) null);
    }

    public final void v0(C0753q qVar) {
        this._parentHandle = qVar;
    }

    /* access modifiers changed from: protected */
    public final CancellationException y0(Throwable th, String str) {
        CancellationException cancellationException;
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            if (str == null) {
                str = H();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    /* access modifiers changed from: protected */
    public void z(Object obj) {
    }
}
