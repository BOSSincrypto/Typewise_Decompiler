package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import u2.l;
import u2.p;

public interface g0 extends CoroutineContext.a {

    /* renamed from: t  reason: collision with root package name */
    public static final b f14139t = b.f14140a;

    public static final class a {
        public static /* synthetic */ void a(g0 g0Var, CancellationException cancellationException, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 1) != 0) {
                    cancellationException = null;
                }
                g0Var.e(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static Object b(g0 g0Var, Object obj, p pVar) {
            return CoroutineContext.a.C0200a.a(g0Var, obj, pVar);
        }

        public static CoroutineContext.a c(g0 g0Var, CoroutineContext.b bVar) {
            return CoroutineContext.a.C0200a.b(g0Var, bVar);
        }

        public static /* synthetic */ Q d(g0 g0Var, boolean z3, boolean z4, l lVar, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 1) != 0) {
                    z3 = false;
                }
                if ((i4 & 2) != 0) {
                    z4 = true;
                }
                return g0Var.m(z3, z4, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        public static CoroutineContext e(g0 g0Var, CoroutineContext.b bVar) {
            return CoroutineContext.a.C0200a.c(g0Var, bVar);
        }

        public static CoroutineContext f(g0 g0Var, CoroutineContext coroutineContext) {
            return CoroutineContext.a.C0200a.d(g0Var, coroutineContext);
        }
    }

    public static final class b implements CoroutineContext.b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ b f14140a = new b();

        private b() {
        }
    }

    Q G(l lVar);

    CancellationException R();

    boolean a();

    void e(CancellationException cancellationException);

    boolean isCancelled();

    Q m(boolean z3, boolean z4, l lVar);

    C0753q o0(C0754s sVar);

    boolean start();
}
