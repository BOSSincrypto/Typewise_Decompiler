package kotlinx.coroutines.internal;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.q0;

public abstract class r {
    private static final s a(Throwable th, String str) {
        if (th != null) {
            throw th;
        }
        d();
        throw new KotlinNothingValueException();
    }

    static /* synthetic */ s b(Throwable th, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            th = null;
        }
        if ((i4 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(q0 q0Var) {
        return q0Var.s0() instanceof s;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final q0 e(p pVar, List list) {
        try {
            return pVar.b(list);
        } catch (Throwable th) {
            return a(th, pVar.a());
        }
    }
}
