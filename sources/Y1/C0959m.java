package y1;

import java.util.concurrent.Executor;

/* renamed from: y1.m  reason: case insensitive filesystem */
final class C0959m implements C0960n {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f16480a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f16481b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public C0949c f16482c;

    public C0959m(Executor executor, C0949c cVar) {
        this.f16480a = executor;
        this.f16482c = cVar;
    }

    public final void a(C0950d dVar) {
        if (dVar.h()) {
            synchronized (this.f16481b) {
                try {
                    if (this.f16482c != null) {
                        this.f16480a.execute(new C0958l(this, dVar));
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
