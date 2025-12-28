package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.C0748l;
import kotlinx.coroutines.C0749m;
import kotlinx.coroutines.C0750n;
import kotlinx.coroutines.F;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.h;
import kotlinx.coroutines.internal.k;
import kotlinx.coroutines.internal.y;
import l2.C0793c;
import l2.q;
import u2.l;

public abstract class b implements t {

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f14051c = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "onCloseHandler");

    /* renamed from: a  reason: collision with root package name */
    protected final l f14052a;

    /* renamed from: b  reason: collision with root package name */
    private final k f14053b = new k();
    private volatile /* synthetic */ Object onCloseHandler = null;

    public static final class a extends s {

        /* renamed from: d  reason: collision with root package name */
        public final Object f14054d;

        public a(Object obj) {
            this.f14054d = obj;
        }

        public void R() {
        }

        public Object S() {
            return this.f14054d;
        }

        public void T(j jVar) {
        }

        public y U(LockFreeLinkedListNode.c cVar) {
            y yVar = C0749m.f14209a;
            if (cVar != null) {
                cVar.d();
            }
            return yVar;
        }

        public String toString() {
            return "SendBuffered@" + F.b(this) + '(' + this.f14054d + ')';
        }
    }

    /* renamed from: kotlinx.coroutines.channels.b$b  reason: collision with other inner class name */
    public static final class C0202b extends LockFreeLinkedListNode.b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f14055d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0202b(LockFreeLinkedListNode lockFreeLinkedListNode, b bVar) {
            super(lockFreeLinkedListNode);
            this.f14055d = bVar;
        }

        /* renamed from: k */
        public Object i(LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (this.f14055d.w()) {
                return null;
            }
            return kotlinx.coroutines.internal.l.a();
        }
    }

    public b(l lVar) {
        this.f14052a = lVar;
    }

    private final Object B(Object obj, c cVar) {
        s sVar;
        C0748l b4 = C0750n.b(kotlin.coroutines.intrinsics.a.d(cVar));
        while (true) {
            if (x()) {
                if (this.f14052a == null) {
                    sVar = new u(obj, b4);
                } else {
                    sVar = new v(obj, b4, this.f14052a);
                }
                Object f4 = f(sVar);
                if (f4 == null) {
                    C0750n.c(b4, sVar);
                    break;
                } else if (f4 instanceof j) {
                    t(b4, obj, (j) f4);
                    break;
                } else if (f4 != a.f14049e && !(f4 instanceof o)) {
                    throw new IllegalStateException(("enqueueSend returned " + f4).toString());
                }
            }
            Object y3 = y(obj);
            if (y3 == a.f14046b) {
                Result.a aVar = Result.Companion;
                b4.resumeWith(Result.m1constructorimpl(q.f14567a));
                break;
            } else if (y3 != a.f14047c) {
                if (y3 instanceof j) {
                    t(b4, obj, (j) y3);
                } else {
                    throw new IllegalStateException(("offerInternal returned " + y3).toString());
                }
            }
        }
        Object v3 = b4.v();
        if (v3 == kotlin.coroutines.intrinsics.a.f()) {
            f.c(cVar);
        }
        if (v3 == kotlin.coroutines.intrinsics.a.f()) {
            return v3;
        }
        return q.f14567a;
    }

    private final int c() {
        k kVar = this.f14053b;
        int i4 = 0;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) kVar.G(); !o.a(lockFreeLinkedListNode, kVar); lockFreeLinkedListNode = lockFreeLinkedListNode.H()) {
            if (lockFreeLinkedListNode instanceof LockFreeLinkedListNode) {
                i4++;
            }
        }
        return i4;
    }

    private final String m() {
        String str;
        LockFreeLinkedListNode H3 = this.f14053b.H();
        if (H3 == this.f14053b) {
            return "EmptyQueue";
        }
        if (H3 instanceof j) {
            str = H3.toString();
        } else if (H3 instanceof o) {
            str = "ReceiveQueued";
        } else if (H3 instanceof s) {
            str = "SendQueued";
        } else {
            str = "UNEXPECTED:" + H3;
        }
        LockFreeLinkedListNode I3 = this.f14053b.I();
        if (I3 == H3) {
            return str;
        }
        String str2 = str + ",queueSize=" + c();
        if (!(I3 instanceof j)) {
            return str2;
        }
        return str2 + ",closedForSend=" + I3;
    }

    private final void o(j jVar) {
        o oVar;
        Object b4 = h.b((Object) null, 1, (i) null);
        while (true) {
            LockFreeLinkedListNode I3 = jVar.I();
            if (I3 instanceof o) {
                oVar = (o) I3;
            } else {
                oVar = null;
            }
            if (oVar == null) {
                break;
            } else if (!oVar.M()) {
                oVar.J();
            } else {
                b4 = h.c(b4, oVar);
            }
        }
        if (b4 != null) {
            if (!(b4 instanceof ArrayList)) {
                ((o) b4).T(jVar);
            } else {
                ArrayList arrayList = (ArrayList) b4;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    ((o) arrayList.get(size)).T(jVar);
                }
            }
        }
        z(jVar);
    }

    private final Throwable p(j jVar) {
        o(jVar);
        return jVar.Z();
    }

    /* access modifiers changed from: private */
    public final void t(c cVar, Object obj, j jVar) {
        UndeliveredElementException d4;
        o(jVar);
        Throwable Z3 = jVar.Z();
        l lVar = this.f14052a;
        if (lVar == null || (d4 = OnUndeliveredElementKt.d(lVar, obj, (UndeliveredElementException) null, 2, (Object) null)) == null) {
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m1constructorimpl(kotlin.f.a(Z3)));
            return;
        }
        C0793c.a(d4, Z3);
        Result.a aVar2 = Result.Companion;
        cVar.resumeWith(Result.m1constructorimpl(kotlin.f.a(d4)));
    }

    private final void u(Throwable th) {
        y yVar;
        Object obj = this.onCloseHandler;
        if (obj != null && obj != (yVar = a.f14050f) && androidx.concurrent.futures.b.a(f14051c, this, obj, yVar)) {
            ((l) v.c(obj, 1)).invoke(th);
        }
    }

    /* access modifiers changed from: private */
    public final boolean x() {
        if ((this.f14053b.H() instanceof q) || !w()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final q A(Object obj) {
        LockFreeLinkedListNode I3;
        k kVar = this.f14053b;
        a aVar = new a(obj);
        do {
            I3 = kVar.I();
            if (I3 instanceof q) {
                return (q) I3;
            }
        } while (!I3.B(aVar, kVar));
        return null;
    }

    /* access modifiers changed from: protected */
    public q C() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        LockFreeLinkedListNode O3;
        k kVar = this.f14053b;
        while (true) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) kVar.G();
            if (lockFreeLinkedListNode != kVar && (lockFreeLinkedListNode instanceof q)) {
                if (((((q) lockFreeLinkedListNode) instanceof j) && !lockFreeLinkedListNode.L()) || (O3 = lockFreeLinkedListNode.O()) == null) {
                    break;
                }
                O3.K();
            }
        }
        lockFreeLinkedListNode = null;
        return (q) lockFreeLinkedListNode;
    }

    /* access modifiers changed from: protected */
    public final s D() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        LockFreeLinkedListNode O3;
        k kVar = this.f14053b;
        while (true) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) kVar.G();
            if (lockFreeLinkedListNode != kVar && (lockFreeLinkedListNode instanceof s)) {
                if (((((s) lockFreeLinkedListNode) instanceof j) && !lockFreeLinkedListNode.L()) || (O3 = lockFreeLinkedListNode.O()) == null) {
                    break;
                }
                O3.K();
            }
        }
        lockFreeLinkedListNode = null;
        return (s) lockFreeLinkedListNode;
    }

    public boolean d(Throwable th) {
        boolean z3;
        j jVar = new j(th);
        k kVar = this.f14053b;
        while (true) {
            LockFreeLinkedListNode I3 = kVar.I();
            if (!(I3 instanceof j)) {
                if (I3.B(jVar, kVar)) {
                    z3 = true;
                    break;
                }
            } else {
                z3 = false;
                break;
            }
        }
        if (!z3) {
            jVar = (j) this.f14053b.I();
        }
        o(jVar);
        if (z3) {
            u(th);
        }
        return z3;
    }

    /* access modifiers changed from: protected */
    public Object f(s sVar) {
        int Q3;
        LockFreeLinkedListNode I3;
        if (v()) {
            k kVar = this.f14053b;
            do {
                I3 = kVar.I();
                if (I3 instanceof q) {
                    return I3;
                }
            } while (!I3.B(sVar, kVar));
            return null;
        }
        k kVar2 = this.f14053b;
        C0202b bVar = new C0202b(sVar, this);
        do {
            LockFreeLinkedListNode I4 = kVar2.I();
            if (I4 instanceof q) {
                return I4;
            }
            Q3 = I4.Q(sVar, kVar2, bVar);
            if (Q3 == 1) {
                return null;
            }
        } while (Q3 != 2);
        return a.f14049e;
    }

    /* access modifiers changed from: protected */
    public String g() {
        return "";
    }

    /* access modifiers changed from: protected */
    public final j h() {
        j jVar;
        LockFreeLinkedListNode H3 = this.f14053b.H();
        if (H3 instanceof j) {
            jVar = (j) H3;
        } else {
            jVar = null;
        }
        if (jVar == null) {
            return null;
        }
        o(jVar);
        return jVar;
    }

    /* access modifiers changed from: protected */
    public final j j() {
        j jVar;
        LockFreeLinkedListNode I3 = this.f14053b.I();
        if (I3 instanceof j) {
            jVar = (j) I3;
        } else {
            jVar = null;
        }
        if (jVar == null) {
            return null;
        }
        o(jVar);
        return jVar;
    }

    public final Object k(Object obj) {
        Object y3 = y(obj);
        if (y3 == a.f14046b) {
            return g.f14066b.c(q.f14567a);
        }
        if (y3 == a.f14047c) {
            j j4 = j();
            if (j4 == null) {
                return g.f14066b.b();
            }
            return g.f14066b.a(p(j4));
        } else if (y3 instanceof j) {
            return g.f14066b.a(p((j) y3));
        } else {
            throw new IllegalStateException(("trySend returned " + y3).toString());
        }
    }

    /* access modifiers changed from: protected */
    public final k l() {
        return this.f14053b;
    }

    public final Object n(Object obj, c cVar) {
        if (y(obj) == a.f14046b) {
            return q.f14567a;
        }
        Object B3 = B(obj, cVar);
        if (B3 == kotlin.coroutines.intrinsics.a.f()) {
            return B3;
        }
        return q.f14567a;
    }

    public final boolean r() {
        if (j() != null) {
            return true;
        }
        return false;
    }

    public void s(l lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14051c;
        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, (Object) null, lVar)) {
            Object obj = this.onCloseHandler;
            if (obj == a.f14050f) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException("Another handler was already registered: " + obj);
        }
        j j4 = j();
        if (j4 != null && androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, lVar, a.f14050f)) {
            lVar.invoke(j4.f14070d);
        }
    }

    public String toString() {
        return F.a(this) + '@' + F.b(this) + '{' + m() + '}' + g();
    }

    /* access modifiers changed from: protected */
    public abstract boolean v();

    /* access modifiers changed from: protected */
    public abstract boolean w();

    /* access modifiers changed from: protected */
    public Object y(Object obj) {
        q C3;
        do {
            C3 = C();
            if (C3 == null) {
                return a.f14047c;
            }
        } while (C3.s(obj, (LockFreeLinkedListNode.c) null) == null);
        C3.h(obj);
        return C3.o();
    }

    /* access modifiers changed from: protected */
    public void z(LockFreeLinkedListNode lockFreeLinkedListNode) {
    }
}
