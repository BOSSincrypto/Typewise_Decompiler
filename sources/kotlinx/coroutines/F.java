package kotlinx.coroutines;

import kotlin.Result;
import kotlin.coroutines.c;
import kotlinx.coroutines.internal.f;

public abstract class F {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(c cVar) {
        Object obj;
        if (cVar instanceof f) {
            return cVar.toString();
        }
        try {
            Result.a aVar = Result.Companion;
            obj = Result.m1constructorimpl(cVar + '@' + b(cVar));
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            obj = Result.m1constructorimpl(kotlin.f.a(th));
        }
        Throwable r22 = Result.m4exceptionOrNullimpl(obj);
        String str = obj;
        if (r22 != null) {
            str = cVar.getClass().getName() + '@' + b(cVar);
        }
        return (String) str;
    }
}
