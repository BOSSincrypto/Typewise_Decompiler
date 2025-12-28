package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.F;

public class LockFreeLinkedListNode {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f14148a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f14149b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f14150c;
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    public static abstract class a extends C0742b {
        public final void a(C0744d dVar, Object obj) {
            boolean z3;
            LockFreeLinkedListNode i4;
            Object obj2;
            if (obj == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            LockFreeLinkedListNode h4 = h();
            if (h4 != null && (i4 = i()) != null) {
                if (z3) {
                    obj2 = n(h4, i4);
                } else {
                    obj2 = i4;
                }
                if (androidx.concurrent.futures.b.a(LockFreeLinkedListNode.f14148a, h4, dVar, obj2) && z3) {
                    f(h4, i4);
                }
            }
        }

        public final Object c(C0744d dVar) {
            while (true) {
                LockFreeLinkedListNode m4 = m(dVar);
                if (m4 == null) {
                    return C0743c.f14168b;
                }
                Object obj = m4._next;
                if (obj == dVar || dVar.h()) {
                    return null;
                }
                if (obj instanceof t) {
                    t tVar = (t) obj;
                    if (dVar.b(tVar)) {
                        return C0743c.f14168b;
                    }
                    tVar.c(m4);
                } else {
                    Object e4 = e(m4);
                    if (e4 != null) {
                        return e4;
                    }
                    if (!l(m4, obj)) {
                        c cVar = new c(m4, (LockFreeLinkedListNode) obj, this);
                        if (androidx.concurrent.futures.b.a(LockFreeLinkedListNode.f14148a, m4, obj, cVar)) {
                            try {
                                if (cVar.c(m4) != m.f14185a) {
                                    return null;
                                }
                            } catch (Throwable th) {
                                androidx.concurrent.futures.b.a(LockFreeLinkedListNode.f14148a, m4, cVar, obj);
                                throw th;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public abstract Object e(LockFreeLinkedListNode lockFreeLinkedListNode);

        /* access modifiers changed from: protected */
        public abstract void f(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2);

        public abstract void g(c cVar);

        /* access modifiers changed from: protected */
        public abstract LockFreeLinkedListNode h();

        /* access modifiers changed from: protected */
        public abstract LockFreeLinkedListNode i();

        public Object j(c cVar) {
            g(cVar);
            return null;
        }

        public void k(LockFreeLinkedListNode lockFreeLinkedListNode) {
        }

        /* access modifiers changed from: protected */
        public abstract boolean l(LockFreeLinkedListNode lockFreeLinkedListNode, Object obj);

        /* access modifiers changed from: protected */
        public abstract LockFreeLinkedListNode m(t tVar);

        public abstract Object n(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2);
    }

    public static abstract class b extends C0744d {

        /* renamed from: b  reason: collision with root package name */
        public final LockFreeLinkedListNode f14151b;

        /* renamed from: c  reason: collision with root package name */
        public LockFreeLinkedListNode f14152c;

        public b(LockFreeLinkedListNode lockFreeLinkedListNode) {
            this.f14151b = lockFreeLinkedListNode;
        }

        /* renamed from: j */
        public void d(LockFreeLinkedListNode lockFreeLinkedListNode, Object obj) {
            boolean z3;
            LockFreeLinkedListNode lockFreeLinkedListNode2;
            if (obj == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                lockFreeLinkedListNode2 = this.f14151b;
            } else {
                lockFreeLinkedListNode2 = this.f14152c;
            }
            if (lockFreeLinkedListNode2 != null && androidx.concurrent.futures.b.a(LockFreeLinkedListNode.f14148a, lockFreeLinkedListNode, this, lockFreeLinkedListNode2) && z3) {
                LockFreeLinkedListNode lockFreeLinkedListNode3 = this.f14151b;
                LockFreeLinkedListNode lockFreeLinkedListNode4 = this.f14152c;
                o.b(lockFreeLinkedListNode4);
                lockFreeLinkedListNode3.F(lockFreeLinkedListNode4);
            }
        }
    }

    public static final class c extends t {

        /* renamed from: a  reason: collision with root package name */
        public final LockFreeLinkedListNode f14153a;

        /* renamed from: b  reason: collision with root package name */
        public final LockFreeLinkedListNode f14154b;

        /* renamed from: c  reason: collision with root package name */
        public final a f14155c;

        public c(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2, a aVar) {
            this.f14153a = lockFreeLinkedListNode;
            this.f14154b = lockFreeLinkedListNode2;
            this.f14155c = aVar;
        }

        public C0744d a() {
            return this.f14155c.b();
        }

        public Object c(Object obj) {
            Object obj2;
            Object obj3;
            if (obj != null) {
                LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
                Object j4 = this.f14155c.j(this);
                Object obj4 = m.f14185a;
                if (j4 == obj4) {
                    LockFreeLinkedListNode lockFreeLinkedListNode2 = this.f14154b;
                    if (androidx.concurrent.futures.b.a(LockFreeLinkedListNode.f14148a, lockFreeLinkedListNode, this, lockFreeLinkedListNode2.P())) {
                        this.f14155c.k(lockFreeLinkedListNode);
                        LockFreeLinkedListNode unused = lockFreeLinkedListNode2.D((t) null);
                    }
                    return obj4;
                }
                if (j4 != null) {
                    obj2 = a().e(j4);
                } else {
                    obj2 = a().f();
                }
                if (obj2 == C0743c.f14167a) {
                    obj3 = a();
                } else if (obj2 == null) {
                    obj3 = this.f14155c.n(lockFreeLinkedListNode, this.f14154b);
                } else {
                    obj3 = this.f14154b;
                }
                androidx.concurrent.futures.b.a(LockFreeLinkedListNode.f14148a, lockFreeLinkedListNode, this, obj3);
                return null;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        }

        public final void d() {
            this.f14155c.g(this);
        }

        public String toString() {
            return "PrepareOp(op=" + a() + ')';
        }
    }

    public static class d extends a {

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f14156c;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f14157d;
        private volatile /* synthetic */ Object _affectedNode = null;
        private volatile /* synthetic */ Object _originalNext = null;

        /* renamed from: b  reason: collision with root package name */
        public final LockFreeLinkedListNode f14158b;

        static {
            Class<d> cls = d.class;
            Class<Object> cls2 = Object.class;
            f14156c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_affectedNode");
            f14157d = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_originalNext");
        }

        public d(LockFreeLinkedListNode lockFreeLinkedListNode) {
            this.f14158b = lockFreeLinkedListNode;
        }

        /* access modifiers changed from: protected */
        public Object e(LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (lockFreeLinkedListNode == this.f14158b) {
                return l.b();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public final void f(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2) {
            LockFreeLinkedListNode unused = lockFreeLinkedListNode2.D((t) null);
        }

        public void g(c cVar) {
            androidx.concurrent.futures.b.a(f14156c, this, (Object) null, cVar.f14153a);
            androidx.concurrent.futures.b.a(f14157d, this, (Object) null, cVar.f14154b);
        }

        /* access modifiers changed from: protected */
        public final LockFreeLinkedListNode h() {
            return (LockFreeLinkedListNode) this._affectedNode;
        }

        /* access modifiers changed from: protected */
        public final LockFreeLinkedListNode i() {
            return (LockFreeLinkedListNode) this._originalNext;
        }

        /* access modifiers changed from: protected */
        public final boolean l(LockFreeLinkedListNode lockFreeLinkedListNode, Object obj) {
            if (!(obj instanceof u)) {
                return false;
            }
            ((u) obj).f14198a.K();
            return true;
        }

        /* access modifiers changed from: protected */
        public final LockFreeLinkedListNode m(t tVar) {
            LockFreeLinkedListNode lockFreeLinkedListNode = this.f14158b;
            while (true) {
                Object obj = lockFreeLinkedListNode._next;
                if (!(obj instanceof t)) {
                    return (LockFreeLinkedListNode) obj;
                }
                t tVar2 = (t) obj;
                if (tVar.b(tVar2)) {
                    return null;
                }
                tVar2.c(this.f14158b);
            }
        }

        public final Object n(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2) {
            return lockFreeLinkedListNode2.P();
        }

        public final Object o() {
            LockFreeLinkedListNode h4 = h();
            o.b(h4);
            return h4;
        }
    }

    static {
        Class<LockFreeLinkedListNode> cls = LockFreeLinkedListNode.class;
        Class<Object> cls2 = Object.class;
        f14148a = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next");
        f14149b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev");
        f14150c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_removedRef");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: kotlinx.coroutines.internal.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: kotlinx.coroutines.internal.LockFreeLinkedListNode} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (androidx.concurrent.futures.b.a(f14148a, r3, r2, ((kotlinx.coroutines.internal.u) r4).f14198a) != false) goto L_0x004b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.internal.LockFreeLinkedListNode D(kotlinx.coroutines.internal.t r8) {
        /*
            r7 = this;
        L_0x0000:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
            r2 = r0
        L_0x0006:
            r3 = r1
        L_0x0007:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L_0x0018
            if (r0 != r2) goto L_0x000e
            return r2
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f14149b
            boolean r0 = androidx.concurrent.futures.b.a(r1, r7, r0, r2)
            if (r0 != 0) goto L_0x0017
            goto L_0x0000
        L_0x0017:
            return r2
        L_0x0018:
            boolean r5 = r7.L()
            if (r5 == 0) goto L_0x001f
            return r1
        L_0x001f:
            if (r4 != r8) goto L_0x0022
            return r2
        L_0x0022:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.t
            if (r5 == 0) goto L_0x0038
            if (r8 == 0) goto L_0x0032
            r0 = r4
            kotlinx.coroutines.internal.t r0 = (kotlinx.coroutines.internal.t) r0
            boolean r0 = r8.b(r0)
            if (r0 == 0) goto L_0x0032
            return r1
        L_0x0032:
            kotlinx.coroutines.internal.t r4 = (kotlinx.coroutines.internal.t) r4
            r4.c(r2)
            goto L_0x0000
        L_0x0038:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.u
            if (r5 == 0) goto L_0x0052
            if (r3 == 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f14148a
            kotlinx.coroutines.internal.u r4 = (kotlinx.coroutines.internal.u) r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r4.f14198a
            boolean r2 = androidx.concurrent.futures.b.a(r5, r3, r2, r4)
            if (r2 != 0) goto L_0x004b
            goto L_0x0000
        L_0x004b:
            r2 = r3
            goto L_0x0006
        L_0x004d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            goto L_0x0007
        L_0x0052:
            r3 = r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeLinkedListNode.D(kotlinx.coroutines.internal.t):kotlinx.coroutines.internal.LockFreeLinkedListNode");
    }

    private final LockFreeLinkedListNode E(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.L()) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) lockFreeLinkedListNode._prev;
        }
        return lockFreeLinkedListNode;
    }

    /* access modifiers changed from: private */
    public final void F(LockFreeLinkedListNode lockFreeLinkedListNode) {
        LockFreeLinkedListNode lockFreeLinkedListNode2;
        do {
            lockFreeLinkedListNode2 = (LockFreeLinkedListNode) lockFreeLinkedListNode._prev;
            if (G() != lockFreeLinkedListNode) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f14149b, lockFreeLinkedListNode, lockFreeLinkedListNode2, this));
        if (L()) {
            lockFreeLinkedListNode.D((t) null);
        }
    }

    /* access modifiers changed from: private */
    public final u P() {
        u uVar = (u) this._removedRef;
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(this);
        f14150c.lazySet(this, uVar2);
        return uVar2;
    }

    public final void A(LockFreeLinkedListNode lockFreeLinkedListNode) {
        do {
        } while (!I().B(lockFreeLinkedListNode, this));
    }

    public final boolean B(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2) {
        f14149b.lazySet(lockFreeLinkedListNode, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14148a;
        atomicReferenceFieldUpdater.lazySet(lockFreeLinkedListNode, lockFreeLinkedListNode2);
        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, lockFreeLinkedListNode2, lockFreeLinkedListNode)) {
            return false;
        }
        lockFreeLinkedListNode.F(lockFreeLinkedListNode2);
        return true;
    }

    public final boolean C(LockFreeLinkedListNode lockFreeLinkedListNode) {
        f14149b.lazySet(lockFreeLinkedListNode, this);
        f14148a.lazySet(lockFreeLinkedListNode, this);
        while (G() == this) {
            if (androidx.concurrent.futures.b.a(f14148a, this, this, lockFreeLinkedListNode)) {
                lockFreeLinkedListNode.F(this);
                return true;
            }
        }
        return false;
    }

    public final Object G() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof t)) {
                return obj;
            }
            ((t) obj).c(this);
        }
    }

    public final LockFreeLinkedListNode H() {
        return l.c(G());
    }

    public final LockFreeLinkedListNode I() {
        LockFreeLinkedListNode D3 = D((t) null);
        if (D3 == null) {
            return E((LockFreeLinkedListNode) this._prev);
        }
        return D3;
    }

    public final void J() {
        ((u) G()).f14198a.K();
    }

    public final void K() {
        LockFreeLinkedListNode lockFreeLinkedListNode = this;
        while (true) {
            Object G3 = lockFreeLinkedListNode.G();
            if (G3 instanceof u) {
                lockFreeLinkedListNode = ((u) G3).f14198a;
            } else {
                lockFreeLinkedListNode.D((t) null);
                return;
            }
        }
    }

    public boolean L() {
        return G() instanceof u;
    }

    public boolean M() {
        if (O() == null) {
            return true;
        }
        return false;
    }

    public final LockFreeLinkedListNode N() {
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) G();
            if (lockFreeLinkedListNode == this) {
                return null;
            }
            if (lockFreeLinkedListNode.M()) {
                return lockFreeLinkedListNode;
            }
            lockFreeLinkedListNode.J();
        }
    }

    public final LockFreeLinkedListNode O() {
        Object G3;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        do {
            G3 = G();
            if (G3 instanceof u) {
                return ((u) G3).f14198a;
            }
            if (G3 == this) {
                return (LockFreeLinkedListNode) G3;
            }
            lockFreeLinkedListNode = (LockFreeLinkedListNode) G3;
        } while (!androidx.concurrent.futures.b.a(f14148a, this, G3, lockFreeLinkedListNode.P()));
        lockFreeLinkedListNode.D((t) null);
        return null;
    }

    public final int Q(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2, b bVar) {
        f14149b.lazySet(lockFreeLinkedListNode, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14148a;
        atomicReferenceFieldUpdater.lazySet(lockFreeLinkedListNode, lockFreeLinkedListNode2);
        bVar.f14152c = lockFreeLinkedListNode2;
        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, lockFreeLinkedListNode2, bVar)) {
            return 0;
        }
        if (bVar.c(this) == null) {
            return 1;
        }
        return 2;
    }

    public String toString() {
        return new LockFreeLinkedListNode$toString$1(this) + '@' + F.b(this);
    }
}
