package E2;

import kotlin.Result;
import kotlin.coroutines.c;
import kotlin.f;
import kotlinx.coroutines.internal.g;
import l2.q;
import u2.l;
import u2.p;

public abstract class a {
    private static final void a(c cVar, Throwable th) {
        Result.a aVar = Result.Companion;
        cVar.resumeWith(Result.m1constructorimpl(f.a(th)));
        throw th;
    }

    public static final void b(c cVar, c cVar2) {
        try {
            c d4 = kotlin.coroutines.intrinsics.a.d(cVar);
            Result.a aVar = Result.Companion;
            g.c(d4, Result.m1constructorimpl(q.f14567a), (l) null, 2, (Object) null);
        } catch (Throwable th) {
            a(cVar2, th);
        }
    }

    public static final void c(l lVar, c cVar) {
        try {
            c d4 = kotlin.coroutines.intrinsics.a.d(kotlin.coroutines.intrinsics.a.a(lVar, cVar));
            Result.a aVar = Result.Companion;
            g.c(d4, Result.m1constructorimpl(q.f14567a), (l) null, 2, (Object) null);
        } catch (Throwable th) {
            a(cVar, th);
        }
    }

    public static final void d(p pVar, Object obj, c cVar, l lVar) {
        try {
            c d4 = kotlin.coroutines.intrinsics.a.d(kotlin.coroutines.intrinsics.a.b(pVar, obj, cVar));
            Result.a aVar = Result.Companion;
            g.b(d4, Result.m1constructorimpl(q.f14567a), lVar);
        } catch (Throwable th) {
            a(cVar, th);
        }
    }

    public static /* synthetic */ void e(p pVar, Object obj, c cVar, l lVar, int i4, Object obj2) {
        if ((i4 & 4) != 0) {
            lVar = null;
        }
        d(pVar, obj, cVar, lVar);
    }
}
