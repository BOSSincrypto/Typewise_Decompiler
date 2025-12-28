package kotlinx.coroutines.flow;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.C0748l;
import kotlinx.coroutines.flow.internal.c;
import l2.q;

final class s extends c {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f14138a = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_state");
    volatile /* synthetic */ Object _state = null;

    /* renamed from: c */
    public boolean a(StateFlowImpl stateFlowImpl) {
        if (this._state != null) {
            return false;
        }
        this._state = r.f14136a;
        return true;
    }

    public final Object d(kotlin.coroutines.c cVar) {
        C0748l lVar = new C0748l(a.d(cVar), 1);
        lVar.z();
        if (!b.a(f14138a, this, r.f14136a, lVar)) {
            Result.a aVar = Result.Companion;
            lVar.resumeWith(Result.m1constructorimpl(q.f14567a));
        }
        Object v3 = lVar.v();
        if (v3 == a.f()) {
            f.c(cVar);
        }
        if (v3 == a.f()) {
            return v3;
        }
        return q.f14567a;
    }

    /* renamed from: e */
    public kotlin.coroutines.c[] b(StateFlowImpl stateFlowImpl) {
        this._state = null;
        return kotlinx.coroutines.flow.internal.b.f14118a;
    }

    public final void f() {
        while (true) {
            Object obj = this._state;
            if (obj != null && obj != r.f14137b) {
                if (obj == r.f14136a) {
                    if (b.a(f14138a, this, obj, r.f14137b)) {
                        return;
                    }
                } else if (b.a(f14138a, this, obj, r.f14136a)) {
                    Result.a aVar = Result.Companion;
                    ((C0748l) obj).resumeWith(Result.m1constructorimpl(q.f14567a));
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean g() {
        Object andSet = f14138a.getAndSet(this, r.f14136a);
        o.b(andSet);
        if (andSet == r.f14137b) {
            return true;
        }
        return false;
    }
}
