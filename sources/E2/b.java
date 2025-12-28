package E2;

import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.C0757v;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.internal.w;
import kotlinx.coroutines.n0;
import u2.l;
import u2.p;

public abstract class b {
    public static final void a(l lVar, c cVar) {
        CoroutineContext context;
        Object c4;
        c a4 = f.a(cVar);
        try {
            context = cVar.getContext();
            c4 = ThreadContextKt.c(context, (Object) null);
            Object invoke = ((l) v.c(lVar, 1)).invoke(a4);
            ThreadContextKt.a(context, c4);
            if (invoke != a.f()) {
                a4.resumeWith(Result.m1constructorimpl(invoke));
            }
        } catch (Throwable th) {
            Result.a aVar = Result.Companion;
            a4.resumeWith(Result.m1constructorimpl(kotlin.f.a(th)));
        }
    }

    public static final void b(p pVar, Object obj, c cVar) {
        CoroutineContext context;
        Object c4;
        c a4 = f.a(cVar);
        try {
            context = cVar.getContext();
            c4 = ThreadContextKt.c(context, (Object) null);
            Object invoke = ((p) v.c(pVar, 2)).invoke(obj, a4);
            ThreadContextKt.a(context, c4);
            if (invoke != a.f()) {
                a4.resumeWith(Result.m1constructorimpl(invoke));
            }
        } catch (Throwable th) {
            Result.a aVar = Result.Companion;
            a4.resumeWith(Result.m1constructorimpl(kotlin.f.a(th)));
        }
    }

    public static final void c(l lVar, c cVar) {
        c a4 = f.a(cVar);
        try {
            Object invoke = ((l) v.c(lVar, 1)).invoke(a4);
            if (invoke != a.f()) {
                a4.resumeWith(Result.m1constructorimpl(invoke));
            }
        } catch (Throwable th) {
            Result.a aVar = Result.Companion;
            a4.resumeWith(Result.m1constructorimpl(kotlin.f.a(th)));
        }
    }

    public static final void d(p pVar, Object obj, c cVar) {
        c a4 = f.a(cVar);
        try {
            Object invoke = ((p) v.c(pVar, 2)).invoke(obj, a4);
            if (invoke != a.f()) {
                a4.resumeWith(Result.m1constructorimpl(invoke));
            }
        } catch (Throwable th) {
            Result.a aVar = Result.Companion;
            a4.resumeWith(Result.m1constructorimpl(kotlin.f.a(th)));
        }
    }

    public static final Object e(w wVar, Object obj, p pVar) {
        Object obj2;
        try {
            obj2 = ((p) v.c(pVar, 2)).invoke(obj, wVar);
        } catch (Throwable th) {
            obj2 = new C0757v(th, false, 2, (i) null);
        }
        if (obj2 == a.f()) {
            return a.f();
        }
        Object f02 = wVar.f0(obj2);
        if (f02 == n0.f14219b) {
            return a.f();
        }
        if (!(f02 instanceof C0757v)) {
            return n0.h(f02);
        }
        throw ((C0757v) f02).f14316a;
    }
}
