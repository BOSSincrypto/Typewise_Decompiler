package kotlinx.coroutines;

import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.internal.f;
import l2.q;

public abstract class O {
    public static final void a(N n4, int i4) {
        boolean z3;
        c d4 = n4.d();
        if (i4 == 4) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 || !(d4 instanceof f) || b(i4) != b(n4.f14001c)) {
            d(n4, d4, z3);
            return;
        }
        CoroutineDispatcher coroutineDispatcher = ((f) d4).f14172d;
        CoroutineContext context = d4.getContext();
        if (coroutineDispatcher.q0(context)) {
            coroutineDispatcher.p0(context, n4);
        } else {
            e(n4);
        }
    }

    public static final boolean b(int i4) {
        return i4 == 1 || i4 == 2;
    }

    public static final boolean c(int i4) {
        return i4 == 2;
    }

    public static final void d(N n4, c cVar, boolean z3) {
        Object g4;
        D0 d02;
        Object i4 = n4.i();
        Throwable e4 = n4.e(i4);
        if (e4 != null) {
            Result.a aVar = Result.Companion;
            g4 = kotlin.f.a(e4);
        } else {
            Result.a aVar2 = Result.Companion;
            g4 = n4.g(i4);
        }
        Object r32 = Result.m1constructorimpl(g4);
        if (z3) {
            f fVar = (f) cVar;
            c cVar2 = fVar.f14173e;
            Object obj = fVar.f14175g;
            CoroutineContext context = cVar2.getContext();
            Object c4 = ThreadContextKt.c(context, obj);
            if (c4 != ThreadContextKt.f14159a) {
                d02 = CoroutineContextKt.g(cVar2, context, c4);
            } else {
                d02 = null;
            }
            try {
                fVar.f14173e.resumeWith(r32);
                q qVar = q.f14567a;
            } finally {
                if (d02 == null || d02.L0()) {
                    ThreadContextKt.a(context, c4);
                }
            }
        } else {
            cVar.resumeWith(r32);
        }
    }

    private static final void e(N n4) {
        U a4 = B0.f13984a.a();
        if (a4.y0()) {
            a4.u0(n4);
            return;
        }
        a4.w0(true);
        try {
            d(n4, n4.d(), true);
            do {
            } while (a4.A0());
        } catch (Throwable th) {
            a4.s0(true);
            throw th;
        }
        a4.s0(true);
    }
}
