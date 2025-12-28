package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C0734e;
import kotlinx.coroutines.C0747k;
import kotlinx.coroutines.C0748l;
import kotlinx.coroutines.C0749m;
import kotlinx.coroutines.C0750n;
import kotlinx.coroutines.F;
import kotlinx.coroutines.Q;
import kotlinx.coroutines.channels.g;
import kotlinx.coroutines.internal.C0743c;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.h;
import kotlinx.coroutines.internal.k;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.x;
import kotlinx.coroutines.internal.y;
import l2.q;
import u2.l;
import u2.p;

public abstract class AbstractChannel extends b implements d {

    private static class a extends o {

        /* renamed from: d  reason: collision with root package name */
        public final C0747k f14033d;

        /* renamed from: e  reason: collision with root package name */
        public final int f14034e;

        public a(C0747k kVar, int i4) {
            this.f14033d = kVar;
            this.f14034e = i4;
        }

        public void T(j jVar) {
            if (this.f14034e == 1) {
                this.f14033d.resumeWith(Result.m1constructorimpl(g.b(g.f14066b.a(jVar.f14070d))));
                return;
            }
            C0747k kVar = this.f14033d;
            Result.a aVar = Result.Companion;
            kVar.resumeWith(Result.m1constructorimpl(kotlin.f.a(jVar.Y())));
        }

        public final Object U(Object obj) {
            if (this.f14034e == 1) {
                return g.b(g.f14066b.c(obj));
            }
            return obj;
        }

        public void h(Object obj) {
            this.f14033d.w(C0749m.f14209a);
        }

        public y s(Object obj, LockFreeLinkedListNode.c cVar) {
            LockFreeLinkedListNode.a aVar;
            C0747k kVar = this.f14033d;
            Object U3 = U(obj);
            if (cVar != null) {
                aVar = cVar.f14155c;
            } else {
                aVar = null;
            }
            if (kVar.p(U3, aVar, S(obj)) == null) {
                return null;
            }
            if (cVar != null) {
                cVar.d();
            }
            return C0749m.f14209a;
        }

        public String toString() {
            return "ReceiveElement@" + F.b(this) + "[receiveMode=" + this.f14034e + ']';
        }
    }

    private static final class b extends a {

        /* renamed from: f  reason: collision with root package name */
        public final l f14035f;

        public b(C0747k kVar, int i4, l lVar) {
            super(kVar, i4);
            this.f14035f = lVar;
        }

        public l S(Object obj) {
            return OnUndeliveredElementKt.a(this.f14035f, obj, this.f14033d.getContext());
        }
    }

    private static final class c extends o implements Q {

        /* renamed from: d  reason: collision with root package name */
        public final AbstractChannel f14036d;

        /* renamed from: e  reason: collision with root package name */
        public final kotlinx.coroutines.selects.d f14037e;

        /* renamed from: f  reason: collision with root package name */
        public final p f14038f;

        /* renamed from: g  reason: collision with root package name */
        public final int f14039g;

        public c(AbstractChannel abstractChannel, kotlinx.coroutines.selects.d dVar, p pVar, int i4) {
            this.f14036d = abstractChannel;
            this.f14037e = dVar;
            this.f14038f = pVar;
            this.f14039g = i4;
        }

        public l S(Object obj) {
            l lVar = this.f14036d.f14052a;
            if (lVar != null) {
                return OnUndeliveredElementKt.a(lVar, obj, this.f14037e.e().getContext());
            }
            return null;
        }

        public void T(j jVar) {
            if (this.f14037e.q()) {
                int i4 = this.f14039g;
                if (i4 == 0) {
                    this.f14037e.k(jVar.Y());
                } else if (i4 == 1) {
                    E2.a.e(this.f14038f, g.b(g.f14066b.a(jVar.f14070d)), this.f14037e.e(), (l) null, 4, (Object) null);
                }
            }
        }

        public void d() {
            if (M()) {
                this.f14036d.S();
            }
        }

        public void h(Object obj) {
            Object obj2;
            p pVar = this.f14038f;
            if (this.f14039g == 1) {
                obj2 = g.b(g.f14066b.c(obj));
            } else {
                obj2 = obj;
            }
            E2.a.d(pVar, obj2, this.f14037e.e(), S(obj));
        }

        public y s(Object obj, LockFreeLinkedListNode.c cVar) {
            return (y) this.f14037e.n(cVar);
        }

        public String toString() {
            return "ReceiveSelect@" + F.b(this) + '[' + this.f14037e + ",receiveMode=" + this.f14039g + ']';
        }
    }

    private final class d extends C0734e {

        /* renamed from: a  reason: collision with root package name */
        private final o f14040a;

        public d(o oVar) {
            this.f14040a = oVar;
        }

        public void a(Throwable th) {
            if (this.f14040a.M()) {
                AbstractChannel.this.S();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return q.f14567a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f14040a + ']';
        }
    }

    protected static final class e extends LockFreeLinkedListNode.d {
        public e(k kVar) {
            super(kVar);
        }

        /* access modifiers changed from: protected */
        public Object e(LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (lockFreeLinkedListNode instanceof j) {
                return lockFreeLinkedListNode;
            }
            if (!(lockFreeLinkedListNode instanceof s)) {
                return a.f14048d;
            }
            return null;
        }

        public Object j(LockFreeLinkedListNode.c cVar) {
            y U3 = ((s) cVar.f14153a).U(cVar);
            if (U3 == null) {
                return m.f14185a;
            }
            Object obj = C0743c.f14168b;
            if (U3 == obj) {
                return obj;
            }
            return null;
        }

        public void k(LockFreeLinkedListNode lockFreeLinkedListNode) {
            ((s) lockFreeLinkedListNode).V();
        }
    }

    public static final class f extends LockFreeLinkedListNode.b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AbstractChannel f14042d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(LockFreeLinkedListNode lockFreeLinkedListNode, AbstractChannel abstractChannel) {
            super(lockFreeLinkedListNode);
            this.f14042d = abstractChannel;
        }

        /* renamed from: k */
        public Object i(LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (this.f14042d.N()) {
                return null;
            }
            return kotlinx.coroutines.internal.l.a();
        }
    }

    public static final class g implements kotlinx.coroutines.selects.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AbstractChannel f14043a;

        g(AbstractChannel abstractChannel) {
            this.f14043a = abstractChannel;
        }

        public void t(kotlinx.coroutines.selects.d dVar, p pVar) {
            this.f14043a.X(dVar, 1, pVar);
        }
    }

    public AbstractChannel(l lVar) {
        super(lVar);
    }

    /* access modifiers changed from: private */
    public final boolean J(o oVar) {
        boolean K3 = K(oVar);
        if (K3) {
            T();
        }
        return K3;
    }

    private final boolean L(kotlinx.coroutines.selects.d dVar, p pVar, int i4) {
        c cVar = new c(this, dVar, pVar, i4);
        boolean J3 = J(cVar);
        if (J3) {
            dVar.t(cVar);
        }
        return J3;
    }

    private final Object W(int i4, kotlin.coroutines.c cVar) {
        a aVar;
        C0748l b4 = C0750n.b(kotlin.coroutines.intrinsics.a.d(cVar));
        if (this.f14052a == null) {
            aVar = new a(b4, i4);
        } else {
            aVar = new b(b4, i4, this.f14052a);
        }
        while (true) {
            if (!J(aVar)) {
                Object U3 = U();
                if (!(U3 instanceof j)) {
                    if (U3 != a.f14048d) {
                        b4.b(aVar.U(U3), aVar.S(U3));
                        break;
                    }
                } else {
                    aVar.T((j) U3);
                    break;
                }
            } else {
                Y(b4, aVar);
                break;
            }
        }
        Object v3 = b4.v();
        if (v3 == kotlin.coroutines.intrinsics.a.f()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return v3;
    }

    /* access modifiers changed from: private */
    public final void X(kotlinx.coroutines.selects.d dVar, int i4, p pVar) {
        while (!dVar.v()) {
            if (!P()) {
                Object V3 = V(dVar);
                if (V3 != kotlinx.coroutines.selects.e.d()) {
                    if (!(V3 == a.f14048d || V3 == C0743c.f14168b)) {
                        Z(pVar, dVar, i4, V3);
                    }
                } else {
                    return;
                }
            } else if (L(dVar, pVar, i4)) {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void Y(C0747k kVar, o oVar) {
        kVar.j(new d(oVar));
    }

    private final void Z(p pVar, kotlinx.coroutines.selects.d dVar, int i4, Object obj) {
        Object obj2;
        boolean z3 = obj instanceof j;
        if (z3) {
            if (i4 == 0) {
                throw x.a(((j) obj).Y());
            } else if (i4 == 1 && dVar.q()) {
                E2.b.d(pVar, g.b(g.f14066b.a(((j) obj).f14070d)), dVar.e());
            }
        } else if (i4 == 1) {
            g.b bVar = g.f14066b;
            if (z3) {
                obj2 = bVar.a(((j) obj).f14070d);
            } else {
                obj2 = bVar.c(obj);
            }
            E2.b.d(pVar, g.b(obj2), dVar.e());
        } else {
            E2.b.d(pVar, obj, dVar.e());
        }
    }

    /* access modifiers changed from: protected */
    public q C() {
        q C3 = super.C();
        if (C3 != null && !(C3 instanceof j)) {
            S();
        }
        return C3;
    }

    public final boolean H(Throwable th) {
        boolean d4 = d(th);
        Q(d4);
        return d4;
    }

    /* access modifiers changed from: protected */
    public final e I() {
        return new e(l());
    }

    /* access modifiers changed from: protected */
    public boolean K(o oVar) {
        int Q3;
        LockFreeLinkedListNode I3;
        if (!M()) {
            k l4 = l();
            f fVar = new f(oVar, this);
            do {
                LockFreeLinkedListNode I4 = l4.I();
                if (I4 instanceof s) {
                    break;
                }
                Q3 = I4.Q(oVar, l4, fVar);
                if (Q3 == 1) {
                    return true;
                }
            } while (Q3 != 2);
        } else {
            k l5 = l();
            do {
                I3 = l5.I();
                if (I3 instanceof s) {
                }
            } while (!I3.B(oVar, l5));
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract boolean M();

    /* access modifiers changed from: protected */
    public abstract boolean N();

    public boolean O() {
        if (h() == null || !N()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean P() {
        if ((l().H() instanceof s) || !N()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void Q(boolean z3) {
        j j4 = j();
        if (j4 != null) {
            Object b4 = h.b((Object) null, 1, (i) null);
            while (true) {
                LockFreeLinkedListNode I3 = j4.I();
                if (I3 instanceof k) {
                    R(b4, j4);
                    return;
                } else if (!I3.M()) {
                    I3.J();
                } else {
                    b4 = h.c(b4, (s) I3);
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen");
        }
    }

    /* access modifiers changed from: protected */
    public void R(Object obj, j jVar) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((s) obj).T(jVar);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 < size) {
                ((s) arrayList.get(size)).T(jVar);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void S() {
    }

    /* access modifiers changed from: protected */
    public void T() {
    }

    /* access modifiers changed from: protected */
    public Object U() {
        while (true) {
            s D3 = D();
            if (D3 == null) {
                return a.f14048d;
            }
            if (D3.U((LockFreeLinkedListNode.c) null) != null) {
                D3.R();
                return D3.S();
            }
            D3.V();
        }
    }

    /* access modifiers changed from: protected */
    public Object V(kotlinx.coroutines.selects.d dVar) {
        e I3 = I();
        Object m4 = dVar.m(I3);
        if (m4 != null) {
            return m4;
        }
        ((s) I3.o()).R();
        return ((s) I3.o()).S();
    }

    public final void e(CancellationException cancellationException) {
        if (!O()) {
            if (cancellationException == null) {
                cancellationException = new CancellationException(F.a(this) + " was cancelled");
            }
            H(cancellationException);
        }
    }

    public final kotlinx.coroutines.selects.c i() {
        return new g(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object q(kotlin.coroutines.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1 r0 = (kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1 r0 = new kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.f.b(r5)
            goto L_0x005b
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.f.b(r5)
            java.lang.Object r5 = r4.U()
            kotlinx.coroutines.internal.y r2 = kotlinx.coroutines.channels.a.f14048d
            if (r5 == r2) goto L_0x0052
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.j
            if (r0 == 0) goto L_0x004b
            kotlinx.coroutines.channels.g$b r0 = kotlinx.coroutines.channels.g.f14066b
            kotlinx.coroutines.channels.j r5 = (kotlinx.coroutines.channels.j) r5
            java.lang.Throwable r5 = r5.f14070d
            java.lang.Object r5 = r0.a(r5)
            goto L_0x0051
        L_0x004b:
            kotlinx.coroutines.channels.g$b r0 = kotlinx.coroutines.channels.g.f14066b
            java.lang.Object r5 = r0.c(r5)
        L_0x0051:
            return r5
        L_0x0052:
            r0.label = r3
            java.lang.Object r5 = r4.W(r3, r0)
            if (r5 != r1) goto L_0x005b
            return r1
        L_0x005b:
            kotlinx.coroutines.channels.g r5 = (kotlinx.coroutines.channels.g) r5
            java.lang.Object r5 = r5.j()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.AbstractChannel.q(kotlin.coroutines.c):java.lang.Object");
    }
}
