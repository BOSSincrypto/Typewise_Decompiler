package kotlinx.coroutines.internal;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.f;

public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    private static final String f14200a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f14201b;

    static {
        Object obj;
        Object obj2;
        try {
            Result.a aVar = Result.Companion;
            obj = Result.m1constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            obj = Result.m1constructorimpl(f.a(th));
        }
        if (Result.m4exceptionOrNullimpl(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f14200a = (String) obj;
        try {
            obj2 = Result.m1constructorimpl(x.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.a aVar3 = Result.Companion;
            obj2 = Result.m1constructorimpl(f.a(th2));
        }
        if (Result.m4exceptionOrNullimpl(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f14201b = (String) obj2;
    }

    public static final Throwable a(Throwable th) {
        return th;
    }
}
