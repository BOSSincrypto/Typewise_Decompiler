package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.C0471e;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.impl.w;
import androidx.work.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l0.v;

public class b implements C0471e {

    /* renamed from: e  reason: collision with root package name */
    private static final String f7246e = m.i("CommandHandler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f7247a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f7248b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Object f7249c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final w f7250d;

    b(Context context, w wVar) {
        this.f7247a = context;
        this.f7250d = wVar;
    }

    static Intent a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent c(Context context, l0.m mVar) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        return q(intent, mVar);
    }

    static Intent d(Context context, l0.m mVar, boolean z3) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z3);
        return q(intent, mVar);
    }

    static Intent e(Context context, l0.m mVar) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        return q(intent, mVar);
    }

    static Intent f(Context context, l0.m mVar) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        return q(intent, mVar);
    }

    private void g(Intent intent, int i4, g gVar) {
        m e4 = m.e();
        String str = f7246e;
        e4.a(str, "Handling constraints changed " + intent);
        new c(this.f7247a, i4, gVar).a();
    }

    private void h(Intent intent, int i4, g gVar) {
        synchronized (this.f7249c) {
            try {
                l0.m p4 = p(intent);
                m e4 = m.e();
                String str = f7246e;
                e4.a(str, "Handing delay met for " + p4);
                if (!this.f7248b.containsKey(p4)) {
                    f fVar = new f(this.f7247a, i4, gVar, this.f7250d.d(p4));
                    this.f7248b.put(p4, fVar);
                    fVar.g();
                } else {
                    m e5 = m.e();
                    e5.a(str, "WorkSpec " + p4 + " is is already being handled for ACTION_DELAY_MET");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void i(Intent intent, int i4) {
        l0.m p4 = p(intent);
        boolean z3 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        m e4 = m.e();
        String str = f7246e;
        e4.a(str, "Handling onExecutionCompleted " + intent + ", " + i4);
        b(p4, z3);
    }

    private void j(Intent intent, int i4, g gVar) {
        m e4 = m.e();
        String str = f7246e;
        e4.a(str, "Handling reschedule " + intent + ", " + i4);
        gVar.g().y();
    }

    private void k(Intent intent, int i4, g gVar) {
        l0.m p4 = p(intent);
        m e4 = m.e();
        String str = f7246e;
        e4.a(str, "Handling schedule work for " + p4);
        WorkDatabase u3 = gVar.g().u();
        u3.e();
        try {
            v l4 = u3.J().l(p4.b());
            if (l4 == null) {
                m e5 = m.e();
                e5.k(str, "Skipping scheduling " + p4 + " because it's no longer in the DB");
            } else if (l4.f14471b.isFinished()) {
                m e6 = m.e();
                e6.k(str, "Skipping scheduling " + p4 + "because it is finished.");
                u3.i();
            } else {
                long c4 = l4.c();
                if (!l4.h()) {
                    m e7 = m.e();
                    e7.a(str, "Setting up Alarms for " + p4 + "at " + c4);
                    a.c(this.f7247a, u3, p4, c4);
                } else {
                    m e8 = m.e();
                    e8.a(str, "Opportunistically setting an alarm for " + p4 + "at " + c4);
                    a.c(this.f7247a, u3, p4, c4);
                    gVar.f().a().execute(new g.b(gVar, a(this.f7247a), i4));
                }
                u3.B();
                u3.i();
            }
        } finally {
            u3.i();
        }
    }

    private void l(Intent intent, g gVar) {
        List<androidx.work.impl.v> list;
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        if (extras.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i4 = extras.getInt("KEY_WORKSPEC_GENERATION");
            list = new ArrayList<>(1);
            androidx.work.impl.v b4 = this.f7250d.b(new l0.m(string, i4));
            if (b4 != null) {
                list.add(b4);
            }
        } else {
            list = this.f7250d.c(string);
        }
        for (androidx.work.impl.v vVar : list) {
            m e4 = m.e();
            String str = f7246e;
            e4.a(str, "Handing stopWork work for " + string);
            gVar.g().D(vVar);
            a.a(this.f7247a, gVar.g().u(), vVar.a());
            gVar.b(vVar.a(), false);
        }
    }

    private static boolean m(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    static l0.m p(Intent intent) {
        return new l0.m(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    private static Intent q(Intent intent, l0.m mVar) {
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_WORKSPEC_GENERATION", mVar.a());
        return intent;
    }

    public void b(l0.m mVar, boolean z3) {
        synchronized (this.f7249c) {
            try {
                f fVar = (f) this.f7248b.remove(mVar);
                this.f7250d.b(mVar);
                if (fVar != null) {
                    fVar.h(z3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        boolean z3;
        synchronized (this.f7249c) {
            z3 = !this.f7248b.isEmpty();
        }
        return z3;
    }

    /* access modifiers changed from: package-private */
    public void o(Intent intent, int i4, g gVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            g(intent, i4, gVar);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            j(intent, i4, gVar);
        } else if (!m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            m e4 = m.e();
            String str = f7246e;
            e4.c(str, "Invalid request for " + action + " , requires " + "KEY_WORKSPEC_ID" + " .");
        } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            k(intent, i4, gVar);
        } else if ("ACTION_DELAY_MET".equals(action)) {
            h(intent, i4, gVar);
        } else if ("ACTION_STOP_WORK".equals(action)) {
            l(intent, gVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            i(intent, i4);
        } else {
            m e5 = m.e();
            String str2 = f7246e;
            e5.k(str2, "Ignoring intent " + intent);
        }
    }
}
