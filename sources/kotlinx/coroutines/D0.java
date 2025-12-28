package kotlinx.coroutines;

import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.internal.w;
import l2.g;
import l2.q;

public final class D0 extends w {

    /* renamed from: d  reason: collision with root package name */
    private ThreadLocal f13992d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public D0(kotlin.coroutines.CoroutineContext r3, kotlin.coroutines.c r4) {
        /*
            r2 = this;
            kotlinx.coroutines.E0 r0 = kotlinx.coroutines.E0.f13993a
            kotlin.coroutines.CoroutineContext$a r1 = r3.get(r0)
            if (r1 != 0) goto L_0x000d
            kotlin.coroutines.CoroutineContext r0 = r3.plus(r0)
            goto L_0x000e
        L_0x000d:
            r0 = r3
        L_0x000e:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f13992d = r0
            kotlin.coroutines.CoroutineContext r4 = r4.getContext()
            kotlin.coroutines.d$b r0 = kotlin.coroutines.d.f13873r
            kotlin.coroutines.CoroutineContext$a r4 = r4.get(r0)
            boolean r4 = r4 instanceof kotlinx.coroutines.CoroutineDispatcher
            if (r4 != 0) goto L_0x0031
            r4 = 0
            java.lang.Object r4 = kotlinx.coroutines.internal.ThreadContextKt.c(r3, r4)
            kotlinx.coroutines.internal.ThreadContextKt.a(r3, r4)
            r2.M0(r3, r4)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.D0.<init>(kotlin.coroutines.CoroutineContext, kotlin.coroutines.c):void");
    }

    /* access modifiers changed from: protected */
    public void G0(Object obj) {
        Pair pair = (Pair) this.f13992d.get();
        D0 d02 = null;
        if (pair != null) {
            ThreadContextKt.a((CoroutineContext) pair.component1(), pair.component2());
            this.f13992d.set(d02);
        }
        Object a4 = C0760y.a(obj, this.f14199c);
        c cVar = this.f14199c;
        CoroutineContext context = cVar.getContext();
        Object c4 = ThreadContextKt.c(context, d02);
        if (c4 != ThreadContextKt.f14159a) {
            d02 = CoroutineContextKt.g(cVar, context, c4);
        }
        try {
            this.f14199c.resumeWith(a4);
            q qVar = q.f14567a;
        } finally {
            if (d02 == null || d02.L0()) {
                ThreadContextKt.a(context, c4);
            }
        }
    }

    public final boolean L0() {
        if (this.f13992d.get() == null) {
            return false;
        }
        this.f13992d.set((Object) null);
        return true;
    }

    public final void M0(CoroutineContext coroutineContext, Object obj) {
        this.f13992d.set(g.a(coroutineContext, obj));
    }
}
