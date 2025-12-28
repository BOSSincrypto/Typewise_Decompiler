package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public abstract class o extends Service implements m {

    /* renamed from: a  reason: collision with root package name */
    private final D f6070a = new D(this);

    public Lifecycle getLifecycle() {
        return this.f6070a.a();
    }

    public IBinder onBind(Intent intent) {
        kotlin.jvm.internal.o.e(intent, "intent");
        this.f6070a.b();
        return null;
    }

    public void onCreate() {
        this.f6070a.c();
        super.onCreate();
    }

    public void onDestroy() {
        this.f6070a.d();
        super.onDestroy();
    }

    public void onStart(Intent intent, int i4) {
        this.f6070a.e();
        super.onStart(intent, i4);
    }

    public int onStartCommand(Intent intent, int i4, int i5) {
        return super.onStartCommand(intent, i4, i5);
    }
}
