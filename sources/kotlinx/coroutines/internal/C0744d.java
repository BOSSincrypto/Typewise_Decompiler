package kotlinx.coroutines.internal;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: kotlinx.coroutines.internal.d  reason: case insensitive filesystem */
public abstract class C0744d extends t {

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f14169a = AtomicReferenceFieldUpdater.newUpdater(C0744d.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = C0743c.f14167a;

    public C0744d a() {
        return this;
    }

    public final Object c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == C0743c.f14167a) {
            obj2 = e(i(obj));
        }
        d(obj, obj2);
        return obj2;
    }

    public abstract void d(Object obj, Object obj2);

    public final Object e(Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = C0743c.f14167a;
        if (obj2 != obj3) {
            return obj2;
        }
        if (b.a(f14169a, this, obj3, obj)) {
            return obj;
        }
        return this._consensus;
    }

    public final Object f() {
        return this._consensus;
    }

    public long g() {
        return 0;
    }

    public final boolean h() {
        if (this._consensus != C0743c.f14167a) {
            return true;
        }
        return false;
    }

    public abstract Object i(Object obj);
}
