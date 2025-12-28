package com.bumptech.glide.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.manager.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import p1.f;
import p1.l;

final class u {

    /* renamed from: d  reason: collision with root package name */
    private static volatile u f11201d;

    /* renamed from: a  reason: collision with root package name */
    private final c f11202a;

    /* renamed from: b  reason: collision with root package name */
    final Set f11203b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private boolean f11204c;

    class a implements f.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f11205a;

        a(Context context) {
            this.f11205a = context;
        }

        /* renamed from: a */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f11205a.getSystemService("connectivity");
        }
    }

    class b implements c.a {
        b() {
        }

        public void a(boolean z3) {
            ArrayList<c.a> arrayList;
            l.a();
            synchronized (u.this) {
                arrayList = new ArrayList<>(u.this.f11203b);
            }
            for (c.a a4 : arrayList) {
                a4.a(z3);
            }
        }
    }

    private interface c {
        void a();

        boolean b();
    }

    private static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        boolean f11208a;

        /* renamed from: b  reason: collision with root package name */
        final c.a f11209b;

        /* renamed from: c  reason: collision with root package name */
        private final f.b f11210c;

        /* renamed from: d  reason: collision with root package name */
        private final ConnectivityManager.NetworkCallback f11211d = new a();

        class a extends ConnectivityManager.NetworkCallback {

            /* renamed from: com.bumptech.glide.manager.u$d$a$a  reason: collision with other inner class name */
            class C0164a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ boolean f11213a;

                C0164a(boolean z3) {
                    this.f11213a = z3;
                }

                public void run() {
                    a.this.a(this.f11213a);
                }
            }

            a() {
            }

            private void b(boolean z3) {
                l.t(new C0164a(z3));
            }

            /* access modifiers changed from: package-private */
            public void a(boolean z3) {
                l.a();
                d dVar = d.this;
                boolean z4 = dVar.f11208a;
                dVar.f11208a = z3;
                if (z4 != z3) {
                    dVar.f11209b.a(z3);
                }
            }

            public void onAvailable(Network network) {
                b(true);
            }

            public void onLost(Network network) {
                b(false);
            }
        }

        d(f.b bVar, c.a aVar) {
            this.f11210c = bVar;
            this.f11209b = aVar;
        }

        public void a() {
            ((ConnectivityManager) this.f11210c.get()).unregisterNetworkCallback(this.f11211d);
        }

        public boolean b() {
            boolean z3;
            if (((ConnectivityManager) this.f11210c.get()).getActiveNetwork() != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f11208a = z3;
            try {
                ((ConnectivityManager) this.f11210c.get()).registerDefaultNetworkCallback(this.f11211d);
                return true;
            } catch (RuntimeException e4) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e4);
                }
                return false;
            }
        }
    }

    private static final class e implements c {

        /* renamed from: g  reason: collision with root package name */
        static final Executor f11215g = AsyncTask.SERIAL_EXECUTOR;

        /* renamed from: a  reason: collision with root package name */
        final Context f11216a;

        /* renamed from: b  reason: collision with root package name */
        final c.a f11217b;

        /* renamed from: c  reason: collision with root package name */
        private final f.b f11218c;

        /* renamed from: d  reason: collision with root package name */
        volatile boolean f11219d;

        /* renamed from: e  reason: collision with root package name */
        volatile boolean f11220e;

        /* renamed from: f  reason: collision with root package name */
        final BroadcastReceiver f11221f = new a();

        class a extends BroadcastReceiver {
            a() {
            }

            public void onReceive(Context context, Intent intent) {
                e.this.e();
            }
        }

        class b implements Runnable {
            b() {
            }

            public void run() {
                e eVar = e.this;
                eVar.f11219d = eVar.c();
                try {
                    e eVar2 = e.this;
                    eVar2.f11216a.registerReceiver(eVar2.f11221f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    e.this.f11220e = true;
                } catch (SecurityException e4) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e4);
                    }
                    e.this.f11220e = false;
                }
            }
        }

        class c implements Runnable {
            c() {
            }

            public void run() {
                if (e.this.f11220e) {
                    e.this.f11220e = false;
                    e eVar = e.this;
                    eVar.f11216a.unregisterReceiver(eVar.f11221f);
                }
            }
        }

        class d implements Runnable {
            d() {
            }

            public void run() {
                boolean z3 = e.this.f11219d;
                e eVar = e.this;
                eVar.f11219d = eVar.c();
                if (z3 != e.this.f11219d) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("connectivity changed, isConnected: ");
                        sb.append(e.this.f11219d);
                    }
                    e eVar2 = e.this;
                    eVar2.d(eVar2.f11219d);
                }
            }
        }

        /* renamed from: com.bumptech.glide.manager.u$e$e  reason: collision with other inner class name */
        class C0165e implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ boolean f11226a;

            C0165e(boolean z3) {
                this.f11226a = z3;
            }

            public void run() {
                e.this.f11217b.a(this.f11226a);
            }
        }

        e(Context context, f.b bVar, c.a aVar) {
            this.f11216a = context.getApplicationContext();
            this.f11218c = bVar;
            this.f11217b = aVar;
        }

        public void a() {
            f11215g.execute(new c());
        }

        public boolean b() {
            f11215g.execute(new b());
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f11218c.get()).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    return false;
                }
                return true;
            } catch (RuntimeException e4) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e4);
                }
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public void d(boolean z3) {
            l.t(new C0165e(z3));
        }

        /* access modifiers changed from: package-private */
        public void e() {
            f11215g.execute(new d());
        }
    }

    private u(Context context) {
        c cVar;
        f.b a4 = f.a(new a(context));
        b bVar = new b();
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new d(a4, bVar);
        } else {
            cVar = new e(context, a4, bVar);
        }
        this.f11202a = cVar;
    }

    static u a(Context context) {
        if (f11201d == null) {
            synchronized (u.class) {
                try {
                    if (f11201d == null) {
                        f11201d = new u(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11201d;
    }

    private void b() {
        if (!this.f11204c && !this.f11203b.isEmpty()) {
            this.f11204c = this.f11202a.b();
        }
    }

    private void c() {
        if (this.f11204c && this.f11203b.isEmpty()) {
            this.f11202a.a();
            this.f11204c = false;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void d(c.a aVar) {
        this.f11203b.add(aVar);
        b();
    }

    /* access modifiers changed from: package-private */
    public synchronized void e(c.a aVar) {
        this.f11203b.remove(aVar);
        c();
    }
}
