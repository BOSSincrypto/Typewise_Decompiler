package V1;

import android.os.IBinder;

public final /* synthetic */ class l implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f1595a;

    public /* synthetic */ l(t tVar) {
        this.f1595a = tVar;
    }

    public final void binderDied() {
        t.h(this.f1595a);
    }
}
