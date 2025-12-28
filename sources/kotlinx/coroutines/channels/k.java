package kotlinx.coroutines.channels;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.y;
import kotlinx.coroutines.selects.d;
import kotlinx.coroutines.selects.e;
import l2.q;
import u2.l;

public class k extends AbstractChannel {

    /* renamed from: d  reason: collision with root package name */
    private final ReentrantLock f14071d = new ReentrantLock();

    /* renamed from: e  reason: collision with root package name */
    private Object f14072e = a.f14045a;

    public k(l lVar) {
        super(lVar);
    }

    private final UndeliveredElementException a0(Object obj) {
        l lVar;
        Object obj2 = this.f14072e;
        UndeliveredElementException undeliveredElementException = null;
        if (!(obj2 == a.f14045a || (lVar = this.f14052a) == null)) {
            undeliveredElementException = OnUndeliveredElementKt.d(lVar, obj2, (UndeliveredElementException) null, 2, (Object) null);
        }
        this.f14072e = obj;
        return undeliveredElementException;
    }

    /* access modifiers changed from: protected */
    public boolean K(o oVar) {
        ReentrantLock reentrantLock = this.f14071d;
        reentrantLock.lock();
        try {
            return super.K(oVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean M() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean N() {
        boolean z3;
        ReentrantLock reentrantLock = this.f14071d;
        reentrantLock.lock();
        try {
            if (this.f14072e == a.f14045a) {
                z3 = true;
            } else {
                z3 = false;
            }
            return z3;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public void Q(boolean z3) {
        ReentrantLock reentrantLock = this.f14071d;
        reentrantLock.lock();
        try {
            UndeliveredElementException a02 = a0(a.f14045a);
            q qVar = q.f14567a;
            reentrantLock.unlock();
            super.Q(z3);
            if (a02 != null) {
                throw a02;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public Object U() {
        ReentrantLock reentrantLock = this.f14071d;
        reentrantLock.lock();
        try {
            Object obj = this.f14072e;
            y yVar = a.f14045a;
            if (obj == yVar) {
                Object j4 = j();
                if (j4 == null) {
                    j4 = a.f14048d;
                }
                return j4;
            }
            this.f14072e = yVar;
            q qVar = q.f14567a;
            reentrantLock.unlock();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public Object V(d dVar) {
        ReentrantLock reentrantLock = this.f14071d;
        reentrantLock.lock();
        try {
            Object obj = this.f14072e;
            y yVar = a.f14045a;
            if (obj == yVar) {
                Object j4 = j();
                if (j4 == null) {
                    j4 = a.f14048d;
                }
                return j4;
            } else if (!dVar.q()) {
                Object d4 = e.d();
                reentrantLock.unlock();
                return d4;
            } else {
                Object obj2 = this.f14072e;
                this.f14072e = yVar;
                q qVar = q.f14567a;
                reentrantLock.unlock();
                return obj2;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public String g() {
        ReentrantLock reentrantLock = this.f14071d;
        reentrantLock.lock();
        try {
            return "(value=" + this.f14072e + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean v() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean w() {
        return false;
    }

    /* access modifiers changed from: protected */
    public Object y(Object obj) {
        q C3;
        ReentrantLock reentrantLock = this.f14071d;
        reentrantLock.lock();
        try {
            j j4 = j();
            if (j4 != null) {
                return j4;
            }
            if (this.f14072e == a.f14045a) {
                do {
                    C3 = C();
                    if (C3 != null) {
                        if (C3 instanceof j) {
                            reentrantLock.unlock();
                            return C3;
                        }
                        o.b(C3);
                    }
                } while (C3.s(obj, (LockFreeLinkedListNode.c) null) == null);
                q qVar = q.f14567a;
                reentrantLock.unlock();
                C3.h(obj);
                return C3.o();
            }
            UndeliveredElementException a02 = a0(obj);
            if (a02 == null) {
                y yVar = a.f14046b;
                reentrantLock.unlock();
                return yVar;
            }
            throw a02;
        } finally {
            reentrantLock.unlock();
        }
    }
}
