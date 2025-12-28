package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

class x0 extends C0726a {
    public x0(CoroutineContext coroutineContext, boolean z3) {
        super(coroutineContext, true, z3);
    }

    /* access modifiers changed from: protected */
    public boolean X(Throwable th) {
        B.a(getContext(), th);
        return true;
    }
}
