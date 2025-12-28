package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.C0471e;
import androidx.work.impl.F;
import androidx.work.impl.r;
import androidx.work.impl.w;
import androidx.work.m;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import m0.C0801E;
import m0.y;
import n0.C0825a;

public class g implements C0471e {

    /* renamed from: k  reason: collision with root package name */
    static final String f7271k = m.i("SystemAlarmDispatcher");

    /* renamed from: a  reason: collision with root package name */
    final Context f7272a;

    /* renamed from: b  reason: collision with root package name */
    final n0.c f7273b;

    /* renamed from: c  reason: collision with root package name */
    private final C0801E f7274c;

    /* renamed from: d  reason: collision with root package name */
    private final r f7275d;

    /* renamed from: e  reason: collision with root package name */
    private final F f7276e;

    /* renamed from: f  reason: collision with root package name */
    final b f7277f;

    /* renamed from: g  reason: collision with root package name */
    final List f7278g;

    /* renamed from: h  reason: collision with root package name */
    Intent f7279h;

    /* renamed from: i  reason: collision with root package name */
    private c f7280i;

    /* renamed from: j  reason: collision with root package name */
    private w f7281j;

    class a implements Runnable {
        a() {
        }

        public void run() {
            Executor a4;
            d dVar;
            synchronized (g.this.f7278g) {
                g gVar = g.this;
                gVar.f7279h = (Intent) gVar.f7278g.get(0);
            }
            Intent intent = g.this.f7279h;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = g.this.f7279h.getIntExtra("KEY_START_ID", 0);
                m e4 = m.e();
                String str = g.f7271k;
                e4.a(str, "Processing command " + g.this.f7279h + ", " + intExtra);
                Context context = g.this.f7272a;
                PowerManager.WakeLock b4 = y.b(context, action + " (" + intExtra + ")");
                try {
                    m e5 = m.e();
                    e5.a(str, "Acquiring operation wake lock (" + action + ") " + b4);
                    b4.acquire();
                    g gVar2 = g.this;
                    gVar2.f7277f.o(gVar2.f7279h, intExtra, gVar2);
                    m e6 = m.e();
                    e6.a(str, "Releasing operation wake lock (" + action + ") " + b4);
                    b4.release();
                    a4 = g.this.f7273b.a();
                    dVar = new d(g.this);
                } catch (Throwable th) {
                    m e7 = m.e();
                    String str2 = g.f7271k;
                    e7.a(str2, "Releasing operation wake lock (" + action + ") " + b4);
                    b4.release();
                    g.this.f7273b.a().execute(new d(g.this));
                    throw th;
                }
                a4.execute(dVar);
            }
        }
    }

    static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final g f7283a;

        /* renamed from: b  reason: collision with root package name */
        private final Intent f7284b;

        /* renamed from: c  reason: collision with root package name */
        private final int f7285c;

        b(g gVar, Intent intent, int i4) {
            this.f7283a = gVar;
            this.f7284b = intent;
            this.f7285c = i4;
        }

        public void run() {
            this.f7283a.a(this.f7284b, this.f7285c);
        }
    }

    interface c {
        void a();
    }

    static class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final g f7286a;

        d(g gVar) {
            this.f7286a = gVar;
        }

        public void run() {
            this.f7286a.d();
        }
    }

    g(Context context) {
        this(context, (r) null, (F) null);
    }

    private void c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean i(String str) {
        c();
        synchronized (this.f7278g) {
            try {
                for (Intent action : this.f7278g) {
                    if (str.equals(action.getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void k() {
        c();
        PowerManager.WakeLock b4 = y.b(this.f7272a, "ProcessCommand");
        try {
            b4.acquire();
            this.f7276e.v().c(new a());
        } finally {
            b4.release();
        }
    }

    public boolean a(Intent intent, int i4) {
        m e4 = m.e();
        String str = f7271k;
        e4.a(str, "Adding command " + intent + " (" + i4 + ")");
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            m.e().k(str, "Unknown command. Ignoring");
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i4);
            synchronized (this.f7278g) {
                try {
                    boolean isEmpty = this.f7278g.isEmpty();
                    this.f7278g.add(intent);
                    if (isEmpty) {
                        k();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
    }

    public void b(l0.m mVar, boolean z3) {
        this.f7273b.a().execute(new b(this, b.d(this.f7272a, mVar, z3), 0));
    }

    /* access modifiers changed from: package-private */
    public void d() {
        m e4 = m.e();
        String str = f7271k;
        e4.a(str, "Checking if commands are complete.");
        c();
        synchronized (this.f7278g) {
            try {
                if (this.f7279h != null) {
                    m e5 = m.e();
                    e5.a(str, "Removing command " + this.f7279h);
                    if (((Intent) this.f7278g.remove(0)).equals(this.f7279h)) {
                        this.f7279h = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                C0825a b4 = this.f7273b.b();
                if (!this.f7277f.n() && this.f7278g.isEmpty() && !b4.g0()) {
                    m.e().a(str, "No more commands & intents.");
                    c cVar = this.f7280i;
                    if (cVar != null) {
                        cVar.a();
                    }
                } else if (!this.f7278g.isEmpty()) {
                    k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public r e() {
        return this.f7275d;
    }

    /* access modifiers changed from: package-private */
    public n0.c f() {
        return this.f7273b;
    }

    /* access modifiers changed from: package-private */
    public F g() {
        return this.f7276e;
    }

    /* access modifiers changed from: package-private */
    public C0801E h() {
        return this.f7274c;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        m.e().a(f7271k, "Destroying SystemAlarmDispatcher");
        this.f7275d.n(this);
        this.f7280i = null;
    }

    /* access modifiers changed from: package-private */
    public void l(c cVar) {
        if (this.f7280i != null) {
            m.e().c(f7271k, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f7280i = cVar;
        }
    }

    g(Context context, r rVar, F f4) {
        Context applicationContext = context.getApplicationContext();
        this.f7272a = applicationContext;
        this.f7281j = new w();
        this.f7277f = new b(applicationContext, this.f7281j);
        f4 = f4 == null ? F.p(context) : f4;
        this.f7276e = f4;
        this.f7274c = new C0801E(f4.n().k());
        rVar = rVar == null ? f4.r() : rVar;
        this.f7275d = rVar;
        this.f7273b = f4.v();
        rVar.g(this);
        this.f7278g = new ArrayList();
        this.f7279h = null;
    }
}
