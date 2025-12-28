package y1;

import v1.C0923b;

/* renamed from: y1.j  reason: case insensitive filesystem */
final class C0956j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0950d f16473a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C0957k f16474b;

    C0956j(C0957k kVar, C0950d dVar) {
        this.f16474b = kVar;
        this.f16473a = dVar;
    }

    public final void run() {
        synchronized (this.f16474b.f16476b) {
            try {
                C0957k kVar = this.f16474b;
                if (kVar.f16477c != null) {
                    kVar.f16477c.onFailure((Exception) C0923b.a(this.f16473a.d()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
