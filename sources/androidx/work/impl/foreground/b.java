package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.g;
import androidx.work.impl.C0471e;
import androidx.work.impl.F;
import androidx.work.m;
import i0.c;
import i0.d;
import i0.e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import l0.v;
import l0.y;

public class b implements c, C0471e {

    /* renamed from: k  reason: collision with root package name */
    static final String f7318k = m.i("SystemFgDispatcher");

    /* renamed from: a  reason: collision with root package name */
    private Context f7319a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public F f7320b;

    /* renamed from: c  reason: collision with root package name */
    private final n0.c f7321c;

    /* renamed from: d  reason: collision with root package name */
    final Object f7322d = new Object();

    /* renamed from: e  reason: collision with root package name */
    l0.m f7323e;

    /* renamed from: f  reason: collision with root package name */
    final Map f7324f;

    /* renamed from: g  reason: collision with root package name */
    final Map f7325g;

    /* renamed from: h  reason: collision with root package name */
    final Set f7326h;

    /* renamed from: i  reason: collision with root package name */
    final d f7327i;

    /* renamed from: j  reason: collision with root package name */
    private C0116b f7328j;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f7329a;

        a(String str) {
            this.f7329a = str;
        }

        public void run() {
            v h4 = b.this.f7320b.r().h(this.f7329a);
            if (h4 != null && h4.h()) {
                synchronized (b.this.f7322d) {
                    b.this.f7325g.put(y.a(h4), h4);
                    b.this.f7326h.add(h4);
                    b bVar = b.this;
                    bVar.f7327i.a(bVar.f7326h);
                }
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.b$b  reason: collision with other inner class name */
    interface C0116b {
        void b(int i4);

        void c(int i4, int i5, Notification notification);

        void d(int i4, Notification notification);

        void stop();
    }

    b(Context context) {
        this.f7319a = context;
        F p4 = F.p(context);
        this.f7320b = p4;
        this.f7321c = p4.v();
        this.f7323e = null;
        this.f7324f = new LinkedHashMap();
        this.f7326h = new HashSet();
        this.f7325g = new HashMap();
        this.f7327i = new e(this.f7320b.t(), (c) this);
        this.f7320b.r().g(this);
    }

    public static Intent d(Context context, l0.m mVar, g gVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.a());
        intent.putExtra("KEY_NOTIFICATION", gVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_GENERATION", mVar.a());
        return intent;
    }

    public static Intent f(Context context, l0.m mVar, g gVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_GENERATION", mVar.a());
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.a());
        intent.putExtra("KEY_NOTIFICATION", gVar.b());
        return intent;
    }

    public static Intent g(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void h(Intent intent) {
        m e4 = m.e();
        String str = f7318k;
        e4.f(str, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
            this.f7320b.j(UUID.fromString(stringExtra));
        }
    }

    private void i(Intent intent) {
        int i4 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        l0.m mVar = new l0.m(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        m e4 = m.e();
        String str = f7318k;
        e4.a(str, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification != null && this.f7328j != null) {
            this.f7324f.put(mVar, new g(intExtra, notification, intExtra2));
            if (this.f7323e == null) {
                this.f7323e = mVar;
                this.f7328j.c(intExtra, intExtra2, notification);
                return;
            }
            this.f7328j.d(intExtra, notification);
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry value : this.f7324f.entrySet()) {
                    i4 |= ((g) value.getValue()).a();
                }
                g gVar = (g) this.f7324f.get(this.f7323e);
                if (gVar != null) {
                    this.f7328j.c(gVar.c(), i4, gVar.b());
                }
            }
        }
    }

    private void j(Intent intent) {
        m e4 = m.e();
        String str = f7318k;
        e4.f(str, "Started foreground service " + intent);
        this.f7321c.c(new a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    public void b(l0.m mVar, boolean z3) {
        boolean z4;
        Map.Entry entry;
        synchronized (this.f7322d) {
            try {
                v vVar = (v) this.f7325g.remove(mVar);
                if (vVar != null) {
                    z4 = this.f7326h.remove(vVar);
                } else {
                    z4 = false;
                }
                if (z4) {
                    this.f7327i.a(this.f7326h);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        g gVar = (g) this.f7324f.remove(mVar);
        if (mVar.equals(this.f7323e) && this.f7324f.size() > 0) {
            Iterator it = this.f7324f.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.f7323e = (l0.m) entry.getKey();
            if (this.f7328j != null) {
                g gVar2 = (g) entry.getValue();
                this.f7328j.c(gVar2.c(), gVar2.a(), gVar2.b());
                this.f7328j.b(gVar2.c());
            }
        }
        C0116b bVar = this.f7328j;
        if (gVar != null && bVar != null) {
            m e4 = m.e();
            String str = f7318k;
            e4.a(str, "Removing Notification (id: " + gVar.c() + ", workSpecId: " + mVar + ", notificationType: " + gVar.a());
            bVar.b(gVar.c());
        }
    }

    public void c(List list) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                v vVar = (v) it.next();
                String str = vVar.f14470a;
                m e4 = m.e();
                String str2 = f7318k;
                e4.a(str2, "Constraints unmet for WorkSpec " + str);
                this.f7320b.C(y.a(vVar));
            }
        }
    }

    public void e(List list) {
    }

    /* access modifiers changed from: package-private */
    public void k(Intent intent) {
        m.e().f(f7318k, "Stopping foreground service");
        C0116b bVar = this.f7328j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        this.f7328j = null;
        synchronized (this.f7322d) {
            this.f7327i.d();
        }
        this.f7320b.r().n(this);
    }

    /* access modifiers changed from: package-private */
    public void m(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            j(intent);
            i(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            i(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            h(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            k(intent);
        }
    }

    /* access modifiers changed from: package-private */
    public void n(C0116b bVar) {
        if (this.f7328j != null) {
            m.e().c(f7318k, "A callback already exists.");
        } else {
            this.f7328j = bVar;
        }
    }
}
