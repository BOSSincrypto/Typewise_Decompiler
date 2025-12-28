package kotlin.coroutines;

import kotlin.Result;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.o;
import l2.q;
import u2.l;
import u2.p;

public abstract class e {
    public static final void a(l lVar, c cVar) {
        o.e(lVar, "<this>");
        o.e(cVar, "completion");
        c d4 = a.d(a.a(lVar, cVar));
        Result.a aVar = Result.Companion;
        d4.resumeWith(Result.m1constructorimpl(q.f14567a));
    }

    public static final void b(p pVar, Object obj, c cVar) {
        o.e(pVar, "<this>");
        o.e(cVar, "completion");
        c d4 = a.d(a.b(pVar, obj, cVar));
        Result.a aVar = Result.Companion;
        d4.resumeWith(Result.m1constructorimpl(q.f14567a));
    }
}
