package y1;

import java.util.concurrent.Executor;

/* renamed from: y1.k  reason: case insensitive filesystem */
final class C0957k implements C0960n {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f16475a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f16476b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public C0948b f16477c;

    public C0957k(Executor executor, C0948b bVar) {
        this.f16475a = executor;
        this.f16477c = bVar;
    }

    public final void a(C0950d dVar) {
        if (!dVar.h() && !dVar.f()) {
            synchronized (this.f16476b) {
                try {
                    if (this.f16477c != null) {
                        this.f16475a.execute(new C0956j(this, dVar));
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }
}
