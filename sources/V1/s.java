package V1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class s implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ t f1602a;

    /* synthetic */ s(t tVar, r rVar) {
        this.f1602a = tVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f1602a.f1605b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        t tVar = this.f1602a;
        tVar.c().post(new p(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f1602a.f1605b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        t tVar = this.f1602a;
        tVar.c().post(new q(this));
    }
}
