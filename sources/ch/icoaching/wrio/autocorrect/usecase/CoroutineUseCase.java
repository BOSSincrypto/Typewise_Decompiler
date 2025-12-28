package ch.icoaching.wrio.autocorrect.usecase;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D;
import kotlinx.coroutines.g0;
import u2.l;

public abstract class CoroutineUseCase {

    /* renamed from: a  reason: collision with root package name */
    private final D f9314a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final CoroutineDispatcher f9315b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final CoroutineDispatcher f9316c;

    /* renamed from: d  reason: collision with root package name */
    private g0 f9317d;

    public CoroutineUseCase(D d4, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2) {
        o.e(d4, "coroutineScope");
        o.e(coroutineDispatcher, "mainDispatcher");
        o.e(coroutineDispatcher2, "backgroundDispatcher");
        this.f9314a = d4;
        this.f9315b = coroutineDispatcher;
        this.f9316c = coroutineDispatcher2;
    }

    public abstract Object a(Object obj, c cVar);

    public final void c() {
        g0 g0Var = this.f9317d;
        if (g0Var != null) {
            g0.a.a(g0Var, (CancellationException) null, 1, (Object) null);
        }
    }

    public final void d(Object obj, l lVar) {
        o.e(lVar, "onResult");
        this.f9317d = C0739h.d(this.f9314a, (CoroutineContext) null, (CoroutineStart) null, new CoroutineUseCase$execute$1(this, obj, lVar, (c<? super CoroutineUseCase$execute$1>) null), 3, (Object) null);
    }
}
