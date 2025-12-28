package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.C0726a;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.selects.c;
import u2.l;

public abstract class e extends C0726a implements d {

    /* renamed from: c  reason: collision with root package name */
    private final d f14065c;

    public e(CoroutineContext coroutineContext, d dVar, boolean z3, boolean z4) {
        super(coroutineContext, z3, z4);
        this.f14065c = dVar;
    }

    public void C(Throwable th) {
        CancellationException z02 = m0.z0(this, th, (String) null, 1, (Object) null);
        this.f14065c.e(z02);
        A(z02);
    }

    /* access modifiers changed from: protected */
    public final d K0() {
        return this.f14065c;
    }

    public boolean d(Throwable th) {
        return this.f14065c.d(th);
    }

    public final void e(CancellationException cancellationException) {
        if (!isCancelled()) {
            if (cancellationException == null) {
                cancellationException = new JobCancellationException(H(), (Throwable) null, this);
            }
            C(cancellationException);
        }
    }

    public c i() {
        return this.f14065c.i();
    }

    public Object k(Object obj) {
        return this.f14065c.k(obj);
    }

    public Object n(Object obj, kotlin.coroutines.c cVar) {
        return this.f14065c.n(obj, cVar);
    }

    public Object q(kotlin.coroutines.c cVar) {
        Object q4 = this.f14065c.q(cVar);
        a.f();
        return q4;
    }

    public boolean r() {
        return this.f14065c.r();
    }

    public void s(l lVar) {
        this.f14065c.s(lVar);
    }
}
