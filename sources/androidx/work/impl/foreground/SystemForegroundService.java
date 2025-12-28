package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.o;
import androidx.work.impl.foreground.b;
import androidx.work.m;

public class SystemForegroundService extends o implements b.C0116b {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final String f7303f = m.i("SystemFgService");

    /* renamed from: g  reason: collision with root package name */
    private static SystemForegroundService f7304g = null;

    /* renamed from: b  reason: collision with root package name */
    private Handler f7305b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7306c;

    /* renamed from: d  reason: collision with root package name */
    b f7307d;

    /* renamed from: e  reason: collision with root package name */
    NotificationManager f7308e;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f7309a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Notification f7310b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f7311c;

        a(int i4, Notification notification, int i5) {
            this.f7309a = i4;
            this.f7310b = notification;
            this.f7311c = i5;
        }

        public void run() {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 31) {
                e.a(SystemForegroundService.this, this.f7309a, this.f7310b, this.f7311c);
            } else if (i4 >= 29) {
                d.a(SystemForegroundService.this, this.f7309a, this.f7310b, this.f7311c);
            } else {
                SystemForegroundService.this.startForeground(this.f7309a, this.f7310b);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f7313a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Notification f7314b;

        b(int i4, Notification notification) {
            this.f7313a = i4;
            this.f7314b = notification;
        }

        public void run() {
            SystemForegroundService.this.f7308e.notify(this.f7313a, this.f7314b);
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f7316a;

        c(int i4) {
            this.f7316a = i4;
        }

        public void run() {
            SystemForegroundService.this.f7308e.cancel(this.f7316a);
        }
    }

    static class d {
        static void a(Service service, int i4, Notification notification, int i5) {
            service.startForeground(i4, notification, i5);
        }
    }

    static class e {
        static void a(Service service, int i4, Notification notification, int i5) {
            try {
                service.startForeground(i4, notification, i5);
            } catch (ForegroundServiceStartNotAllowedException e4) {
                m.e().l(SystemForegroundService.f7303f, "Unable to start foreground service", e4);
            }
        }
    }

    private void f() {
        this.f7305b = new Handler(Looper.getMainLooper());
        this.f7308e = (NotificationManager) getApplicationContext().getSystemService("notification");
        b bVar = new b(getApplicationContext());
        this.f7307d = bVar;
        bVar.n(this);
    }

    public void b(int i4) {
        this.f7305b.post(new c(i4));
    }

    public void c(int i4, int i5, Notification notification) {
        this.f7305b.post(new a(i4, notification, i5));
    }

    public void d(int i4, Notification notification) {
        this.f7305b.post(new b(i4, notification));
    }

    public void onCreate() {
        super.onCreate();
        f7304g = this;
        f();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f7307d.l();
    }

    public int onStartCommand(Intent intent, int i4, int i5) {
        super.onStartCommand(intent, i4, i5);
        if (this.f7306c) {
            m.e().f(f7303f, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f7307d.l();
            f();
            this.f7306c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f7307d.m(intent);
        return 3;
    }

    public void stop() {
        this.f7306c = true;
        m.e().a(f7303f, "All commands completed.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f7304g = null;
        stopSelf();
    }
}
