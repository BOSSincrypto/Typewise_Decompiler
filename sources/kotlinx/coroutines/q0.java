package kotlinx.coroutines;

public abstract class q0 extends CoroutineDispatcher {
    public abstract q0 s0();

    /* access modifiers changed from: protected */
    public final String t0() {
        q0 q0Var;
        q0 c4 = P.c();
        if (this == c4) {
            return "Dispatchers.Main";
        }
        try {
            q0Var = c4.s0();
        } catch (UnsupportedOperationException unused) {
            q0Var = null;
        }
        if (this == q0Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
