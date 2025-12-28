package kotlinx.coroutines.internal;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class n {

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f14186a = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public n(boolean z3) {
        this._cur = new o(8, z3);
    }

    public final boolean a(Object obj) {
        while (true) {
            o oVar = (o) this._cur;
            int a4 = oVar.a(obj);
            if (a4 == 0) {
                return true;
            }
            if (a4 == 1) {
                b.a(f14186a, this, oVar, oVar.i());
            } else if (a4 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            o oVar = (o) this._cur;
            if (!oVar.d()) {
                b.a(f14186a, this, oVar, oVar.i());
            } else {
                return;
            }
        }
    }

    public final int c() {
        return ((o) this._cur).f();
    }

    public final Object d() {
        while (true) {
            o oVar = (o) this._cur;
            Object j4 = oVar.j();
            if (j4 != o.f14190h) {
                return j4;
            }
            b.a(f14186a, this, oVar, oVar.i());
        }
    }
}
