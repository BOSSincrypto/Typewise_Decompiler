package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.f;
import kotlinx.coroutines.C0747k;
import kotlinx.coroutines.C0748l;
import kotlinx.coroutines.C0749m;
import kotlinx.coroutines.C0750n;
import kotlinx.coroutines.Q;
import kotlinx.coroutines.internal.C0744d;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.k;
import kotlinx.coroutines.internal.t;
import l2.q;

public final class MutexImpl implements b {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f14296a = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "_state");
    volatile /* synthetic */ Object _state;

    private final class LockCont extends a {

        /* renamed from: g  reason: collision with root package name */
        private final C0747k f14297g;

        public LockCont(Object obj, C0747k kVar) {
            super(obj);
            this.f14297g = kVar;
        }

        public void R() {
            this.f14297g.w(C0749m.f14209a);
        }

        public boolean T() {
            if (S() && this.f14297g.p(q.f14567a, (Object) null, new MutexImpl$LockCont$tryResumeLockWaiter$1(MutexImpl.this, this)) != null) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "LockCont[" + this.f14300d + ", " + this.f14297g + "] for " + MutexImpl.this;
        }
    }

    private abstract class a extends LockFreeLinkedListNode implements Q {

        /* renamed from: f  reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f14299f = AtomicIntegerFieldUpdater.newUpdater(a.class, "isTaken");

        /* renamed from: d  reason: collision with root package name */
        public final Object f14300d;
        private volatile /* synthetic */ int isTaken = 0;

        public a(Object obj) {
            this.f14300d = obj;
        }

        public abstract void R();

        public final boolean S() {
            return f14299f.compareAndSet(this, 0, 1);
        }

        public abstract boolean T();

        public final void d() {
            M();
        }
    }

    private static final class b extends k {
        public volatile Object owner;

        public b(Object obj) {
            this.owner = obj;
        }

        public String toString() {
            return "LockedQueue[" + this.owner + ']';
        }
    }

    private static final class c extends C0744d {

        /* renamed from: b  reason: collision with root package name */
        public final b f14302b;

        public c(b bVar) {
            this.f14302b = bVar;
        }

        /* renamed from: j */
        public void d(MutexImpl mutexImpl, Object obj) {
            Object obj2;
            if (obj == null) {
                obj2 = c.f14309f;
            } else {
                obj2 = this.f14302b;
            }
            androidx.concurrent.futures.b.a(MutexImpl.f14296a, mutexImpl, this, obj2);
        }

        /* renamed from: k */
        public Object i(MutexImpl mutexImpl) {
            if (this.f14302b.R()) {
                return null;
            }
            return c.f14305b;
        }
    }

    public MutexImpl(boolean z3) {
        a aVar;
        if (z3) {
            aVar = c.f14308e;
        } else {
            aVar = c.f14309f;
        }
        this._state = aVar;
    }

    private final Object c(Object obj, kotlin.coroutines.c cVar) {
        a aVar;
        C0748l b4 = C0750n.b(kotlin.coroutines.intrinsics.a.d(cVar));
        LockCont lockCont = new LockCont(obj, b4);
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof a) {
                a aVar2 = (a) obj2;
                if (aVar2.f14303a != c.f14307d) {
                    androidx.concurrent.futures.b.a(f14296a, this, obj2, new b(aVar2.f14303a));
                } else {
                    if (obj == null) {
                        aVar = c.f14308e;
                    } else {
                        aVar = new a(obj);
                    }
                    if (androidx.concurrent.futures.b.a(f14296a, this, obj2, aVar)) {
                        b4.b(q.f14567a, new MutexImpl$lockSuspend$2$1$1(this, obj));
                        break;
                    }
                }
            } else if (obj2 instanceof b) {
                b bVar = (b) obj2;
                if (bVar.owner != obj) {
                    bVar.A(lockCont);
                    if (this._state == obj2 || !lockCont.S()) {
                        C0750n.c(b4, lockCont);
                    } else {
                        lockCont = new LockCont(obj, b4);
                    }
                } else {
                    throw new IllegalStateException(("Already locked by " + obj).toString());
                }
            } else if (obj2 instanceof t) {
                ((t) obj2).c(this);
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
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

    public Object a(Object obj, kotlin.coroutines.c cVar) {
        if (d(obj)) {
            return q.f14567a;
        }
        Object c4 = c(obj, cVar);
        if (c4 == kotlin.coroutines.intrinsics.a.f()) {
            return c4;
        }
        return q.f14567a;
    }

    public void b(Object obj) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof a) {
                if (obj != null) {
                    a aVar = (a) obj2;
                    if (aVar.f14303a != obj) {
                        throw new IllegalStateException(("Mutex is locked by " + aVar.f14303a + " but expected " + obj).toString());
                    }
                } else if (((a) obj2).f14303a == c.f14307d) {
                    throw new IllegalStateException("Mutex is not locked");
                }
                if (androidx.concurrent.futures.b.a(f14296a, this, obj2, c.f14309f)) {
                    return;
                }
            } else if (obj2 instanceof t) {
                ((t) obj2).c(this);
            } else if (obj2 instanceof b) {
                if (obj != null) {
                    b bVar = (b) obj2;
                    if (bVar.owner != obj) {
                        throw new IllegalStateException(("Mutex is locked by " + bVar.owner + " but expected " + obj).toString());
                    }
                }
                b bVar2 = (b) obj2;
                LockFreeLinkedListNode N3 = bVar2.N();
                if (N3 == null) {
                    c cVar = new c(bVar2);
                    if (androidx.concurrent.futures.b.a(f14296a, this, obj2, cVar) && cVar.c(this) == null) {
                        return;
                    }
                } else {
                    a aVar2 = (a) N3;
                    if (aVar2.T()) {
                        Object obj3 = aVar2.f14300d;
                        if (obj3 == null) {
                            obj3 = c.f14306c;
                        }
                        bVar2.owner = obj3;
                        aVar2.R();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    public boolean d(Object obj) {
        a aVar;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof a) {
                if (((a) obj2).f14303a != c.f14307d) {
                    return false;
                }
                if (obj == null) {
                    aVar = c.f14308e;
                } else {
                    aVar = new a(obj);
                }
                if (androidx.concurrent.futures.b.a(f14296a, this, obj2, aVar)) {
                    return true;
                }
            } else if (obj2 instanceof b) {
                if (((b) obj2).owner != obj) {
                    return false;
                }
                throw new IllegalStateException(("Already locked by " + obj).toString());
            } else if (obj2 instanceof t) {
                ((t) obj2).c(this);
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    public String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof a) {
                return "Mutex[" + ((a) obj).f14303a + ']';
            } else if (obj instanceof t) {
                ((t) obj).c(this);
            } else if (obj instanceof b) {
                return "Mutex[" + ((b) obj).owner + ']';
            } else {
                throw new IllegalStateException(("Illegal state " + obj).toString());
            }
        }
    }
}
