package y1;

/* renamed from: y1.l  reason: case insensitive filesystem */
final class C0958l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0950d f16478a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C0959m f16479b;

    C0958l(C0959m mVar, C0950d dVar) {
        this.f16479b = mVar;
        this.f16478a = dVar;
    }

    public final void run() {
        synchronized (this.f16479b.f16481b) {
            try {
                C0959m mVar = this.f16479b;
                if (mVar.f16482c != null) {
                    mVar.f16482c.onSuccess(this.f16478a.e());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
