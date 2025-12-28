package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.c;
import kotlinx.coroutines.C0726a;
import kotlinx.coroutines.C0753q;
import kotlinx.coroutines.C0760y;
import kotlinx.coroutines.g0;
import u2.l;

public class w extends C0726a implements c {

    /* renamed from: c  reason: collision with root package name */
    public final kotlin.coroutines.c f14199c;

    public w(CoroutineContext coroutineContext, kotlin.coroutines.c cVar) {
        super(coroutineContext, true, true);
        this.f14199c = cVar;
    }

    /* access modifiers changed from: protected */
    public void G0(Object obj) {
        kotlin.coroutines.c cVar = this.f14199c;
        cVar.resumeWith(C0760y.a(obj, cVar));
    }

    public final g0 K0() {
        C0753q V3 = V();
        if (V3 != null) {
            return V3.getParent();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean c0() {
        return true;
    }

    public final c getCallerFrame() {
        kotlin.coroutines.c cVar = this.f14199c;
        if (cVar instanceof c) {
            return (c) cVar;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void z(Object obj) {
        g.c(a.d(this.f14199c), C0760y.a(obj, this.f14199c), (l) null, 2, (Object) null);
    }
}
