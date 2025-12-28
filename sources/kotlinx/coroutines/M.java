package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.internal.g;
import kotlinx.coroutines.internal.w;
import u2.l;

public final class M extends w {

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f14000d = AtomicIntegerFieldUpdater.newUpdater(M.class, "_decision");
    private volatile /* synthetic */ int _decision = 0;

    public M(CoroutineContext coroutineContext, c cVar) {
        super(coroutineContext, cVar);
    }

    private final boolean M0() {
        do {
            int i4 = this._decision;
            if (i4 != 0) {
                if (i4 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f14000d.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean N0() {
        do {
            int i4 = this._decision;
            if (i4 != 0) {
                if (i4 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f14000d.compareAndSet(this, 0, 1));
        return true;
    }

    /* access modifiers changed from: protected */
    public void G0(Object obj) {
        if (!M0()) {
            g.c(a.d(this.f14199c), C0760y.a(obj, this.f14199c), (l) null, 2, (Object) null);
        }
    }

    public final Object L0() {
        if (N0()) {
            return a.f();
        }
        Object h4 = n0.h(W());
        if (!(h4 instanceof C0757v)) {
            return h4;
        }
        throw ((C0757v) h4).f14316a;
    }

    /* access modifiers changed from: protected */
    public void z(Object obj) {
        G0(obj);
    }
}
