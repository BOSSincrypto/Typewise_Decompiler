package kotlin;

import kotlin.Result;
import kotlin.jvm.internal.o;

public abstract class f {
    public static final Object a(Throwable th) {
        o.e(th, "exception");
        return new Result.Failure(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
    }
}
