package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.o;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.m;
import m0.y;

public class SystemAlarmService extends o implements g.c {

    /* renamed from: d  reason: collision with root package name */
    private static final String f7242d = m.i("SystemAlarmService");

    /* renamed from: b  reason: collision with root package name */
    private g f7243b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7244c;

    private void e() {
        g gVar = new g(this);
        this.f7243b = gVar;
        gVar.l(this);
    }

    public void a() {
        this.f7244c = true;
        m.e().a(f7242d, "All commands completed in dispatcher");
        y.a();
        stopSelf();
    }

    public void onCreate() {
        super.onCreate();
        e();
        this.f7244c = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f7244c = true;
        this.f7243b.j();
    }

    public int onStartCommand(Intent intent, int i4, int i5) {
        super.onStartCommand(intent, i4, i5);
        if (this.f7244c) {
            m.e().f(f7242d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.f7243b.j();
            e();
            this.f7244c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f7243b.a(intent, i5);
        return 3;
    }
}
