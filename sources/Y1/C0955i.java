package y1;

import java.util.concurrent.Executor;

/* renamed from: y1.i  reason: case insensitive filesystem */
final class C0955i implements C0960n {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f16470a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f16471b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public C0947a f16472c;

    public C0955i(Executor executor, C0947a aVar) {
        this.f16470a = executor;
        this.f16472c = aVar;
    }

    public final void a(C0950d dVar) {
        synchronized (this.f16471b) {
            try {
                if (this.f16472c != null) {
                    this.f16470a.execute(new C0954h(this, dVar));
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
