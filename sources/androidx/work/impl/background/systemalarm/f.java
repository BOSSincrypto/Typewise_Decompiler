package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.impl.v;
import androidx.work.m;
import i0.c;
import i0.e;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import k0.o;
import l0.y;
import m0.C0801E;

public class f implements c, C0801E.a {

    /* renamed from: m  reason: collision with root package name */
    private static final String f7258m = m.i("DelayMetCommandHandler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f7259a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7260b;

    /* renamed from: c  reason: collision with root package name */
    private final l0.m f7261c;

    /* renamed from: d  reason: collision with root package name */
    private final g f7262d;

    /* renamed from: e  reason: collision with root package name */
    private final e f7263e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f7264f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private int f7265g = 0;

    /* renamed from: h  reason: collision with root package name */
    private final Executor f7266h;

    /* renamed from: i  reason: collision with root package name */
    private final Executor f7267i;

    /* renamed from: j  reason: collision with root package name */
    private PowerManager.WakeLock f7268j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f7269k = false;

    /* renamed from: l  reason: collision with root package name */
    private final v f7270l;

    f(Context context, int i4, g gVar, v vVar) {
        this.f7259a = context;
        this.f7260b = i4;
        this.f7262d = gVar;
        this.f7261c = vVar.a();
        this.f7270l = vVar;
        o t4 = gVar.g().t();
        this.f7266h = gVar.f().b();
        this.f7267i = gVar.f().a();
        this.f7263e = new e(t4, (c) this);
    }

    private void f() {
        synchronized (this.f7264f) {
            try {
                this.f7263e.d();
                this.f7262d.h().b(this.f7261c);
                PowerManager.WakeLock wakeLock = this.f7268j;
                if (wakeLock != null && wakeLock.isHeld()) {
                    m e4 = m.e();
                    String str = f7258m;
                    e4.a(str, "Releasing wakelock " + this.f7268j + "for WorkSpec " + this.f7261c);
                    this.f7268j.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* access modifiers changed from: private */
    public void i() {
        if (this.f7265g == 0) {
            this.f7265g = 1;
            m e4 = m.e();
            String str = f7258m;
            e4.a(str, "onAllConstraintsMet for " + this.f7261c);
            if (this.f7262d.e().p(this.f7270l)) {
                this.f7262d.h().a(this.f7261c, 600000, this);
            } else {
                f();
            }
        } else {
            m e5 = m.e();
            String str2 = f7258m;
            e5.a(str2, "Already started work for " + this.f7261c);
        }
    }

    /* access modifiers changed from: private */
    public void j() {
        String b4 = this.f7261c.b();
        if (this.f7265g < 2) {
            this.f7265g = 2;
            m e4 = m.e();
            String str = f7258m;
            e4.a(str, "Stopping work for WorkSpec " + b4);
            this.f7267i.execute(new g.b(this.f7262d, b.f(this.f7259a, this.f7261c), this.f7260b));
            if (this.f7262d.e().k(this.f7261c.b())) {
                m e5 = m.e();
                e5.a(str, "WorkSpec " + b4 + " needs to be rescheduled");
                this.f7267i.execute(new g.b(this.f7262d, b.e(this.f7259a, this.f7261c), this.f7260b));
                return;
            }
            m e6 = m.e();
            e6.a(str, "Processor does not have WorkSpec " + b4 + ". No need to reschedule");
            return;
        }
        m e7 = m.e();
        String str2 = f7258m;
        e7.a(str2, "Already stopped work for " + b4);
    }

    public void a(l0.m mVar) {
        m e4 = m.e();
        String str = f7258m;
        e4.a(str, "Exceeded time limits on execution for " + mVar);
        this.f7266h.execute(new d(this));
    }

    public void c(List list) {
        this.f7266h.execute(new d(this));
    }

    public void e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (y.a((l0.v) it.next()).equals(this.f7261c)) {
                this.f7266h.execute(new e(this));
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        String b4 = this.f7261c.b();
        Context context = this.f7259a;
        this.f7268j = m0.y.b(context, b4 + " (" + this.f7260b + ")");
        m e4 = m.e();
        String str = f7258m;
        e4.a(str, "Acquiring wakelock " + this.f7268j + "for WorkSpec " + b4);
        this.f7268j.acquire();
        l0.v l4 = this.f7262d.g().u().J().l(b4);
        if (l4 == null) {
            this.f7266h.execute(new d(this));
            return;
        }
        boolean h4 = l4.h();
        this.f7269k = h4;
        if (!h4) {
            m e5 = m.e();
            e5.a(str, "No constraints for " + b4);
            e(Collections.singletonList(l4));
            return;
        }
        this.f7263e.a(Collections.singletonList(l4));
    }

    /* access modifiers changed from: package-private */
    public void h(boolean z3) {
        m e4 = m.e();
        String str = f7258m;
        e4.a(str, "onExecuted " + this.f7261c + ", " + z3);
        f();
        if (z3) {
            this.f7267i.execute(new g.b(this.f7262d, b.e(this.f7259a, this.f7261c), this.f7260b));
        }
        if (this.f7269k) {
            this.f7267i.execute(new g.b(this.f7262d, b.a(this.f7259a), this.f7260b));
        }
    }
}
