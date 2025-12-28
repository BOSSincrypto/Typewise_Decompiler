package androidx.work;

import X1.a;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.f;
import kotlinx.coroutines.C0747k;

public final class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0747k f7420a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f7421b;

    public k(C0747k kVar, a aVar) {
        this.f7420a = kVar;
        this.f7421b = aVar;
    }

    public final void run() {
        try {
            C0747k kVar = this.f7420a;
            Result.a aVar = Result.Companion;
            kVar.resumeWith(Result.m1constructorimpl(this.f7421b.get()));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                this.f7420a.l(cause);
                return;
            }
            C0747k kVar2 = this.f7420a;
            Result.a aVar2 = Result.Companion;
            kVar2.resumeWith(Result.m1constructorimpl(f.a(cause)));
        }
    }
}
