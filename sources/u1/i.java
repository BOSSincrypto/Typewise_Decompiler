package U1;

import V1.j;
import android.os.Bundle;
import android.os.RemoteException;
import y1.C0951e;

final class i extends j {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C0951e f1496b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l f1497c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    i(l lVar, C0951e eVar, C0951e eVar2) {
        super(eVar);
        this.f1497c = lVar;
        this.f1496b = eVar2;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [V1.f, android.os.IInterface] */
    /* access modifiers changed from: protected */
    public final void a() {
        try {
            ? e4 = this.f1497c.f1503a.e();
            String c4 = this.f1497c.f1504b;
            Bundle a4 = m.a();
            l lVar = this.f1497c;
            e4.b(c4, a4, new k(lVar, this.f1496b, lVar.f1504b));
        } catch (RemoteException e5) {
            l.f1502c.c(e5, "error requesting in-app review for %s", this.f1497c.f1504b);
            this.f1496b.b(new RuntimeException(e5));
        }
    }
}
