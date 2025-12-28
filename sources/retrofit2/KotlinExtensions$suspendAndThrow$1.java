package retrofit2;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {119}, m = "suspendAndThrow")
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
final class KotlinExtensions$suspendAndThrow$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    KotlinExtensions$suspendAndThrow$1(c<? super KotlinExtensions$suspendAndThrow$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return KotlinExtensions.e((Throwable) null, this);
    }
}
