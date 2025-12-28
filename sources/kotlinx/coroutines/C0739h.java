package kotlinx.coroutines;

import E2.a;
import E2.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.internal.w;
import u2.l;
import u2.p;

/* renamed from: kotlinx.coroutines.h  reason: case insensitive filesystem */
abstract /* synthetic */ class C0739h {
    public static final I a(D d4, CoroutineContext coroutineContext, CoroutineStart coroutineStart, p pVar) {
        J j4;
        CoroutineContext e4 = CoroutineContextKt.e(d4, coroutineContext);
        if (coroutineStart.isLazy()) {
            j4 = new o0(e4, pVar);
        } else {
            j4 = new J(e4, true);
        }
        j4.J0(coroutineStart, j4, pVar);
        return j4;
    }

    public static /* synthetic */ I b(D d4, CoroutineContext coroutineContext, CoroutineStart coroutineStart, p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i4 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return C0738g.a(d4, coroutineContext, coroutineStart, pVar);
    }

    public static final g0 c(D d4, CoroutineContext coroutineContext, CoroutineStart coroutineStart, p pVar) {
        C0726a aVar;
        CoroutineContext e4 = CoroutineContextKt.e(d4, coroutineContext);
        if (coroutineStart.isLazy()) {
            aVar = new p0(e4, pVar);
        } else {
            aVar = new x0(e4, true);
        }
        aVar.J0(coroutineStart, aVar, pVar);
        return aVar;
    }

    public static /* synthetic */ g0 d(D d4, CoroutineContext coroutineContext, CoroutineStart coroutineStart, p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i4 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return C0738g.c(d4, coroutineContext, coroutineStart, pVar);
    }

    /* JADX INFO: finally extract failed */
    public static final Object e(CoroutineContext coroutineContext, p pVar, c cVar) {
        Object obj;
        CoroutineContext context = cVar.getContext();
        CoroutineContext d4 = CoroutineContextKt.d(context, coroutineContext);
        j0.e(d4);
        if (d4 == context) {
            w wVar = new w(d4, cVar);
            obj = b.e(wVar, wVar, pVar);
        } else {
            d.b bVar = d.f13873r;
            if (o.a(d4.get(bVar), context.get(bVar))) {
                D0 d02 = new D0(d4, cVar);
                Object c4 = ThreadContextKt.c(d4, (Object) null);
                try {
                    Object e4 = b.e(d02, d02, pVar);
                    ThreadContextKt.a(d4, c4);
                    obj = e4;
                } catch (Throwable th) {
                    ThreadContextKt.a(d4, c4);
                    throw th;
                }
            } else {
                M m4 = new M(d4, cVar);
                a.e(pVar, m4, m4, (l) null, 4, (Object) null);
                obj = m4.L0();
            }
        }
        if (obj == kotlin.coroutines.intrinsics.a.f()) {
            f.c(cVar);
        }
        return obj;
    }
}
