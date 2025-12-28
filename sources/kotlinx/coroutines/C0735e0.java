package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import l2.q;
import u2.l;

/* renamed from: kotlinx.coroutines.e0  reason: case insensitive filesystem */
final class C0735e0 extends h0 {

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f14078f = AtomicIntegerFieldUpdater.newUpdater(C0735e0.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: e  reason: collision with root package name */
    private final l f14079e;

    public C0735e0(l lVar) {
        this.f14079e = lVar;
    }

    public void R(Throwable th) {
        if (f14078f.compareAndSet(this, 0, 1)) {
            this.f14079e.invoke(th);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        R((Throwable) obj);
        return q.f14567a;
    }
}
