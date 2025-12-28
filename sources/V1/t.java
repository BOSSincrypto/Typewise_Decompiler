package V1;

import U1.h;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.appcompat.app.F;
import com.google.android.play.core.review.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import y1.C0950d;
import y1.C0951e;

public final class t {

    /* renamed from: o  reason: collision with root package name */
    private static final Map f1603o = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f1604a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final i f1605b;

    /* renamed from: c  reason: collision with root package name */
    private final String f1606c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final List f1607d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final Set f1608e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private final Object f1609f = new Object();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f1610g;

    /* renamed from: h  reason: collision with root package name */
    private final Intent f1611h;

    /* renamed from: i  reason: collision with root package name */
    private final WeakReference f1612i;

    /* renamed from: j  reason: collision with root package name */
    private final IBinder.DeathRecipient f1613j = new l(this);

    /* renamed from: k  reason: collision with root package name */
    private final AtomicInteger f1614k = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public ServiceConnection f1615l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public IInterface f1616m;

    /* renamed from: n  reason: collision with root package name */
    private final h f1617n;

    public t(Context context, i iVar, String str, Intent intent, h hVar, o oVar, byte[] bArr) {
        this.f1604a = context;
        this.f1605b = iVar;
        this.f1606c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
        this.f1611h = intent;
        this.f1617n = hVar;
        this.f1612i = new WeakReference((Object) null);
    }

    public static /* synthetic */ void h(t tVar) {
        tVar.f1605b.d("reportBinderDeath", new Object[0]);
        F.a(tVar.f1612i.get());
        tVar.f1605b.d("%s : Binder has died.", tVar.f1606c);
        for (j c4 : tVar.f1607d) {
            c4.c(tVar.s());
        }
        tVar.f1607d.clear();
        tVar.t();
    }

    static /* bridge */ /* synthetic */ void m(t tVar, j jVar) {
        if (tVar.f1616m == null && !tVar.f1610g) {
            tVar.f1605b.d("Initiate binding to the service.", new Object[0]);
            tVar.f1607d.add(jVar);
            s sVar = new s(tVar, (r) null);
            tVar.f1615l = sVar;
            tVar.f1610g = true;
            if (!tVar.f1604a.bindService(tVar.f1611h, sVar, 1)) {
                tVar.f1605b.d("Failed to bind to the service.", new Object[0]);
                tVar.f1610g = false;
                for (j c4 : tVar.f1607d) {
                    c4.c(new zzu());
                }
                tVar.f1607d.clear();
            }
        } else if (tVar.f1610g) {
            tVar.f1605b.d("Waiting to bind to the service.", new Object[0]);
            tVar.f1607d.add(jVar);
        } else {
            jVar.run();
        }
    }

    static /* bridge */ /* synthetic */ void n(t tVar) {
        tVar.f1605b.d("linkToDeath", new Object[0]);
        try {
            tVar.f1616m.asBinder().linkToDeath(tVar.f1613j, 0);
        } catch (RemoteException e4) {
            tVar.f1605b.c(e4, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void o(t tVar) {
        tVar.f1605b.d("unlinkToDeath", new Object[0]);
        tVar.f1616m.asBinder().unlinkToDeath(tVar.f1613j, 0);
    }

    private final RemoteException s() {
        return new RemoteException(String.valueOf(this.f1606c).concat(" : Binder has died."));
    }

    /* access modifiers changed from: private */
    public final void t() {
        synchronized (this.f1609f) {
            try {
                for (C0951e b4 : this.f1608e) {
                    b4.b(s());
                }
                this.f1608e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Handler c() {
        Handler handler;
        Map map = f1603o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f1606c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f1606c, 10);
                    handlerThread.start();
                    map.put(this.f1606c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f1606c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f1616m;
    }

    public final void p(j jVar, C0951e eVar) {
        synchronized (this.f1609f) {
            this.f1608e.add(eVar);
            eVar.a().a(new k(this, eVar));
        }
        synchronized (this.f1609f) {
            try {
                if (this.f1614k.getAndIncrement() > 0) {
                    this.f1605b.a("Already connected to the service.", new Object[0]);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        c().post(new m(this, jVar.b(), jVar));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void q(C0951e eVar, C0950d dVar) {
        synchronized (this.f1609f) {
            this.f1608e.remove(eVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        c().post(new V1.n(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(y1.C0951e r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f1609f
            monitor-enter(r0)
            java.util.Set r1 = r3.f1608e     // Catch:{ all -> 0x003a }
            r1.remove(r4)     // Catch:{ all -> 0x003a }
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            java.lang.Object r4 = r3.f1609f
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicInteger r0 = r3.f1614k     // Catch:{ all -> 0x0028 }
            int r0 = r0.get()     // Catch:{ all -> 0x0028 }
            if (r0 <= 0) goto L_0x002a
            java.util.concurrent.atomic.AtomicInteger r0 = r3.f1614k     // Catch:{ all -> 0x0028 }
            int r0 = r0.decrementAndGet()     // Catch:{ all -> 0x0028 }
            if (r0 <= 0) goto L_0x002a
            V1.i r0 = r3.f1605b     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = "Leaving the connection open for other ongoing calls."
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0028 }
            r0.d(r1, r2)     // Catch:{ all -> 0x0028 }
            monitor-exit(r4)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r0 = move-exception
            goto L_0x0038
        L_0x002a:
            monitor-exit(r4)     // Catch:{ all -> 0x0028 }
            V1.n r4 = new V1.n
            r4.<init>(r3)
            android.os.Handler r0 = r3.c()
            r0.post(r4)
            return
        L_0x0038:
            monitor-exit(r4)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x003a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.t.r(y1.e):void");
    }
}
