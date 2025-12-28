package androidx.work.impl;

import android.content.Context;
import androidx.work.a;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.background.systemjob.l;
import androidx.work.m;
import java.util.Iterator;
import java.util.List;
import l0.v;
import l0.w;
import m0.C0818q;

public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    private static final String f7364a = m.i("Schedulers");

    static t a(Context context, F f4) {
        l lVar = new l(context, f4);
        C0818q.a(context, SystemJobService.class, true);
        m.e().a(f7364a, "Created SystemJobScheduler and enabled SystemJobService");
        return lVar;
    }

    public static void b(a aVar, WorkDatabase workDatabase, List list) {
        if (list != null && list.size() != 0) {
            w J3 = workDatabase.J();
            workDatabase.e();
            try {
                List<v> k4 = J3.k(aVar.h());
                List u3 = J3.u(200);
                if (k4 != null && k4.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (v vVar : k4) {
                        J3.e(vVar.f14470a, currentTimeMillis);
                    }
                }
                workDatabase.B();
                workDatabase.i();
                if (k4 != null && k4.size() > 0) {
                    v[] vVarArr = (v[]) k4.toArray(new v[k4.size()]);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        t tVar = (t) it.next();
                        if (tVar.f()) {
                            tVar.d(vVarArr);
                        }
                    }
                }
                if (u3 != null && u3.size() > 0) {
                    v[] vVarArr2 = (v[]) u3.toArray(new v[u3.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        t tVar2 = (t) it2.next();
                        if (!tVar2.f()) {
                            tVar2.d(vVarArr2);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.i();
                throw th;
            }
        }
    }
}
