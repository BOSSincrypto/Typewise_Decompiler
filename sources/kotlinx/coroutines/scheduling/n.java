package kotlinx.coroutines.scheduling;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.uuid.Uuid;

public final class n {

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f14274b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f14275c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f14276d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f14277e;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReferenceArray f14278a = new AtomicReferenceArray(Uuid.SIZE_BITS);
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;

    static {
        Class<n> cls = n.class;
        f14274b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f14275c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f14276d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f14277e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    public static /* synthetic */ g b(n nVar, g gVar, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return nVar.a(gVar, z3);
    }

    private final g c(g gVar) {
        if (gVar.f14263b.b() == 1) {
            f14277e.incrementAndGet(this);
        }
        if (e() == 127) {
            return gVar;
        }
        int i4 = this.producerIndex & 127;
        while (this.f14278a.get(i4) != null) {
            Thread.yield();
        }
        this.f14278a.lazySet(i4, gVar);
        f14275c.incrementAndGet(this);
        return null;
    }

    private final void d(g gVar) {
        if (gVar != null && gVar.f14263b.b() == 1) {
            f14277e.decrementAndGet(this);
        }
    }

    private final g i() {
        g gVar;
        while (true) {
            int i4 = this.consumerIndex;
            if (i4 - this.producerIndex == 0) {
                return null;
            }
            int i5 = i4 & 127;
            if (f14276d.compareAndSet(this, i4, i4 + 1) && (gVar = (g) this.f14278a.getAndSet(i5, (Object) null)) != null) {
                d(gVar);
                return gVar;
            }
        }
    }

    private final boolean j(c cVar) {
        g i4 = i();
        if (i4 == null) {
            return false;
        }
        cVar.a(i4);
        return true;
    }

    private final long m(n nVar, boolean z3) {
        g gVar;
        do {
            gVar = (g) nVar.lastScheduledTask;
            if (gVar == null) {
                return -2;
            }
            if (z3 && gVar.f14263b.b() != 1) {
                return -2;
            }
            long a4 = k.f14270e.a() - gVar.f14262a;
            long j4 = k.f14266a;
            if (a4 < j4) {
                return j4 - a4;
            }
        } while (!b.a(f14274b, nVar, gVar, (Object) null));
        b(this, gVar, false, 2, (Object) null);
        return -1;
    }

    public final g a(g gVar, boolean z3) {
        if (z3) {
            return c(gVar);
        }
        g gVar2 = (g) f14274b.getAndSet(this, gVar);
        if (gVar2 == null) {
            return null;
        }
        return c(gVar2);
    }

    public final int e() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int f() {
        if (this.lastScheduledTask != null) {
            return e() + 1;
        }
        return e();
    }

    public final void g(c cVar) {
        g gVar = (g) f14274b.getAndSet(this, (Object) null);
        if (gVar != null) {
            cVar.a(gVar);
        }
        do {
        } while (j(cVar));
    }

    public final g h() {
        g gVar = (g) f14274b.getAndSet(this, (Object) null);
        if (gVar == null) {
            return i();
        }
        return gVar;
    }

    public final long k(n nVar) {
        int i4 = nVar.consumerIndex;
        int i5 = nVar.producerIndex;
        AtomicReferenceArray atomicReferenceArray = nVar.f14278a;
        while (i4 != i5) {
            int i6 = i4 & 127;
            if (nVar.blockingTasksInBuffer == 0) {
                break;
            }
            g gVar = (g) atomicReferenceArray.get(i6);
            if (gVar == null || gVar.f14263b.b() != 1 || !m.a(atomicReferenceArray, i6, gVar, (Object) null)) {
                i4++;
            } else {
                f14277e.decrementAndGet(nVar);
                b(this, gVar, false, 2, (Object) null);
                return -1;
            }
        }
        return m(nVar, true);
    }

    public final long l(n nVar) {
        g i4 = nVar.i();
        if (i4 == null) {
            return m(nVar, false);
        }
        b(this, i4, false, 2, (Object) null);
        return -1;
    }
}
