package U1;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import y1.C0951e;

final class f extends ResultReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0951e f1492a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    f(g gVar, Handler handler, C0951e eVar) {
        super(handler);
        this.f1492a = eVar;
    }

    public final void onReceiveResult(int i4, Bundle bundle) {
        this.f1492a.c((Object) null);
    }
}
