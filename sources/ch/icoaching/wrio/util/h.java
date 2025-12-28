package ch.icoaching.wrio.util;

import X1.a;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.f;
import kotlinx.coroutines.C0747k;

public final class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0747k f10696a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f10697b;

    public h(C0747k kVar, a aVar) {
        this.f10696a = kVar;
        this.f10697b = aVar;
    }

    public final void run() {
        try {
            C0747k kVar = this.f10696a;
            Result.a aVar = Result.Companion;
            kVar.resumeWith(Result.m1constructorimpl(this.f10697b.get()));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                this.f10696a.l(cause);
                return;
            }
            C0747k kVar2 = this.f10696a;
            Result.a aVar2 = Result.Companion;
            kVar2.resumeWith(Result.m1constructorimpl(f.a(cause)));
        }
    }
}
