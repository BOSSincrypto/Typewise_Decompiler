package kotlinx.coroutines.channels;

import kotlinx.coroutines.C0747k;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import u2.l;

public final class v extends u {

    /* renamed from: f  reason: collision with root package name */
    public final l f14075f;

    public v(Object obj, C0747k kVar, l lVar) {
        super(obj, kVar);
        this.f14075f = lVar;
    }

    public boolean M() {
        if (!super.M()) {
            return false;
        }
        V();
        return true;
    }

    public void V() {
        OnUndeliveredElementKt.b(this.f14075f, S(), this.f14074e.getContext());
    }
}
