package kotlinx.coroutines;

import kotlin.Result;
import kotlin.coroutines.c;
import kotlin.f;
import kotlin.jvm.internal.i;
import u2.l;

/* renamed from: kotlinx.coroutines.y  reason: case insensitive filesystem */
public abstract class C0760y {
    public static final Object a(Object obj, c cVar) {
        if (!(obj instanceof C0757v)) {
            return Result.m1constructorimpl(obj);
        }
        Result.a aVar = Result.Companion;
        return Result.m1constructorimpl(f.a(((C0757v) obj).f14316a));
    }

    public static final Object b(Object obj, C0747k kVar) {
        Throwable r4 = Result.m4exceptionOrNullimpl(obj);
        if (r4 == null) {
            return obj;
        }
        return new C0757v(r4, false, 2, (i) null);
    }

    public static final Object c(Object obj, l lVar) {
        Throwable r02 = Result.m4exceptionOrNullimpl(obj);
        if (r02 != null) {
            return new C0757v(r02, false, 2, (i) null);
        }
        if (lVar != null) {
            return new C0758w(obj, lVar);
        }
        return obj;
    }

    public static /* synthetic */ Object d(Object obj, l lVar, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            lVar = null;
        }
        return c(obj, lVar);
    }
}
