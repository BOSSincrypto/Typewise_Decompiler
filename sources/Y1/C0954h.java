package y1;

/* renamed from: y1.h  reason: case insensitive filesystem */
final class C0954h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0950d f16468a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C0955i f16469b;

    C0954h(C0955i iVar, C0950d dVar) {
        this.f16469b = iVar;
        this.f16468a = dVar;
    }

    public final void run() {
        synchronized (this.f16469b.f16471b) {
            try {
                C0955i iVar = this.f16469b;
                if (iVar.f16472c != null) {
                    iVar.f16472c.onComplete(this.f16468a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
