package h0;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.WorkInfo;
import androidx.work.a;
import androidx.work.impl.C0471e;
import androidx.work.impl.F;
import androidx.work.impl.t;
import androidx.work.impl.w;
import androidx.work.m;
import i0.c;
import i0.d;
import i0.e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k0.o;
import l0.v;
import l0.y;
import m0.s;

/* renamed from: h0.b  reason: case insensitive filesystem */
public class C0660b implements t, c, C0471e {

    /* renamed from: j  reason: collision with root package name */
    private static final String f13625j = m.i("GreedyScheduler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f13626a;

    /* renamed from: b  reason: collision with root package name */
    private final F f13627b;

    /* renamed from: c  reason: collision with root package name */
    private final d f13628c;

    /* renamed from: d  reason: collision with root package name */
    private final Set f13629d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private C0659a f13630e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13631f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f13632g;

    /* renamed from: h  reason: collision with root package name */
    private final w f13633h = new w();

    /* renamed from: i  reason: collision with root package name */
    Boolean f13634i;

    public C0660b(Context context, a aVar, o oVar, F f4) {
        this.f13626a = context;
        this.f13627b = f4;
        this.f13628c = new e(oVar, (c) this);
        this.f13630e = new C0659a(this, aVar.k());
        this.f13632g = new Object();
    }

    private void g() {
        this.f13634i = Boolean.valueOf(s.b(this.f13626a, this.f13627b.n()));
    }

    private void h() {
        if (!this.f13631f) {
            this.f13627b.r().g(this);
            this.f13631f = true;
        }
    }

    private void i(l0.m mVar) {
        synchronized (this.f13632g) {
            try {
                Iterator it = this.f13629d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    v vVar = (v) it.next();
                    if (y.a(vVar).equals(mVar)) {
                        m e4 = m.e();
                        String str = f13625j;
                        e4.a(str, "Stopping tracking for " + mVar);
                        this.f13629d.remove(vVar);
                        this.f13628c.a(this.f13629d);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(String str) {
        if (this.f13634i == null) {
            g();
        }
        if (!this.f13634i.booleanValue()) {
            m.e().f(f13625j, "Ignoring schedule request in non-main process");
            return;
        }
        h();
        m e4 = m.e();
        String str2 = f13625j;
        e4.a(str2, "Cancelling work ID " + str);
        C0659a aVar = this.f13630e;
        if (aVar != null) {
            aVar.b(str);
        }
        for (androidx.work.impl.v D3 : this.f13633h.c(str)) {
            this.f13627b.D(D3);
        }
    }

    public void b(l0.m mVar, boolean z3) {
        this.f13633h.b(mVar);
        i(mVar);
    }

    public void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l0.m a4 = y.a((v) it.next());
            m e4 = m.e();
            String str = f13625j;
            e4.a(str, "Constraints not met: Cancelling work ID " + a4);
            androidx.work.impl.v b4 = this.f13633h.b(a4);
            if (b4 != null) {
                this.f13627b.D(b4);
            }
        }
    }

    public void d(v... vVarArr) {
        if (this.f13634i == null) {
            g();
        }
        if (!this.f13634i.booleanValue()) {
            m.e().f(f13625j, "Ignoring schedule request in a secondary process");
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (v vVar : vVarArr) {
            if (!this.f13633h.a(y.a(vVar))) {
                long c4 = vVar.c();
                long currentTimeMillis = System.currentTimeMillis();
                if (vVar.f14471b == WorkInfo.State.ENQUEUED) {
                    if (currentTimeMillis < c4) {
                        C0659a aVar = this.f13630e;
                        if (aVar != null) {
                            aVar.a(vVar);
                        }
                    } else if (vVar.h()) {
                        int i4 = Build.VERSION.SDK_INT;
                        if (vVar.f14479j.h()) {
                            m.e().a(f13625j, "Ignoring " + vVar + ". Requires device idle.");
                        } else if (i4 < 24 || !vVar.f14479j.e()) {
                            hashSet.add(vVar);
                            hashSet2.add(vVar.f14470a);
                        } else {
                            m.e().a(f13625j, "Ignoring " + vVar + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f13633h.a(y.a(vVar))) {
                        m.e().a(f13625j, "Starting work for " + vVar.f14470a);
                        this.f13627b.A(this.f13633h.e(vVar));
                    }
                }
            }
        }
        synchronized (this.f13632g) {
            try {
                if (!hashSet.isEmpty()) {
                    String join = TextUtils.join(",", hashSet2);
                    m.e().a(f13625j, "Starting tracking for " + join);
                    this.f13629d.addAll(hashSet);
                    this.f13628c.a(this.f13629d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l0.m a4 = y.a((v) it.next());
            if (!this.f13633h.a(a4)) {
                m e4 = m.e();
                String str = f13625j;
                e4.a(str, "Constraints met: Scheduling work ID " + a4);
                this.f13627b.A(this.f13633h.d(a4));
            }
        }
    }

    public boolean f() {
        return false;
    }
}
