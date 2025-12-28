package androidx.work.impl;

import androidx.work.BackoffPolicy;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.a;
import androidx.work.b;
import androidx.work.e;
import androidx.work.o;
import androidx.work.u;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.C0718m;
import l0.C0782A;
import l0.v;
import l0.w;
import m0.C0805d;
import u2.C0906a;

public abstract class WorkerUpdater {
    public static final o c(F f4, String str, u uVar) {
        kotlin.jvm.internal.o.e(f4, "<this>");
        kotlin.jvm.internal.o.e(str, "name");
        kotlin.jvm.internal.o.e(uVar, "workRequest");
        o oVar = new o();
        f4.v().b().execute(new H(f4, str, oVar, new WorkerUpdater$enqueueUniquelyNamedPeriodic$enqueueNew$1(uVar, f4, str, oVar), uVar));
        return oVar;
    }

    /* access modifiers changed from: private */
    public static final void d(F f4, String str, o oVar, C0906a aVar, u uVar) {
        String str2 = str;
        o oVar2 = oVar;
        kotlin.jvm.internal.o.e(f4, "$this_enqueueUniquelyNamedPeriodic");
        kotlin.jvm.internal.o.e(str2, "$name");
        kotlin.jvm.internal.o.e(oVar2, "$operation");
        kotlin.jvm.internal.o.e(aVar, "$enqueueNew");
        kotlin.jvm.internal.o.e(uVar, "$workRequest");
        w J3 = f4.u().J();
        List g4 = J3.g(str2);
        if (g4.size() > 1) {
            e(oVar2, "Can't apply UPDATE policy to the chains of work.");
            return;
        }
        v.b bVar = (v.b) C0718m.S(g4);
        if (bVar == null) {
            aVar.invoke();
            return;
        }
        v l4 = J3.l(bVar.f14490a);
        if (l4 == null) {
            oVar2.a(new o.b.a(new IllegalStateException("WorkSpec with " + bVar.f14490a + ", that matches a name \"" + str2 + "\", wasn't found")));
        } else if (!l4.j()) {
            e(oVar2, "Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
        } else if (bVar.f14491b == WorkInfo.State.CANCELLED) {
            J3.a(bVar.f14490a);
            aVar.invoke();
        } else {
            v e4 = v.e(uVar.d(), bVar.f14490a, (WorkInfo.State) null, (String) null, (String) null, (e) null, (e) null, 0, 0, 0, (b) null, 0, (BackoffPolicy) null, 0, 0, 0, 0, false, (OutOfQuotaPolicy) null, 0, 0, 1048574, (Object) null);
            try {
                r r4 = f4.r();
                kotlin.jvm.internal.o.d(r4, "processor");
                WorkDatabase u3 = f4.u();
                kotlin.jvm.internal.o.d(u3, "workDatabase");
                a n4 = f4.n();
                kotlin.jvm.internal.o.d(n4, "configuration");
                List s4 = f4.s();
                kotlin.jvm.internal.o.d(s4, "schedulers");
                f(r4, u3, n4, s4, e4, uVar.c());
                oVar2.a(o.f7433a);
            } catch (Throwable th) {
                oVar2.a(new o.b.a(th));
            }
        }
    }

    private static final void e(o oVar, String str) {
        oVar.a(new o.b.a(new UnsupportedOperationException(str)));
    }

    private static final WorkManager.UpdateResult f(r rVar, WorkDatabase workDatabase, a aVar, List list, v vVar, Set set) {
        String str = vVar.f14470a;
        v l4 = workDatabase.J().l(str);
        if (l4 == null) {
            throw new IllegalArgumentException("Worker with " + str + " doesn't exist");
        } else if (l4.f14471b.isFinished()) {
            return WorkManager.UpdateResult.NOT_APPLIED;
        } else {
            if (!(l4.j() ^ vVar.j())) {
                boolean k4 = rVar.k(str);
                if (!k4) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((t) it.next()).a(str);
                    }
                }
                workDatabase.A(new I(workDatabase, vVar, l4, list, str, set, k4));
                if (!k4) {
                    u.b(aVar, workDatabase, list);
                }
                if (k4) {
                    return WorkManager.UpdateResult.APPLIED_FOR_NEXT_RUN;
                }
                return WorkManager.UpdateResult.APPLIED_IMMEDIATELY;
            }
            WorkerUpdater$updateWorkImpl$type$1 workerUpdater$updateWorkImpl$type$1 = WorkerUpdater$updateWorkImpl$type$1.INSTANCE;
            throw new UnsupportedOperationException("Can't update " + ((String) workerUpdater$updateWorkImpl$type$1.invoke(l4)) + " Worker to " + ((String) workerUpdater$updateWorkImpl$type$1.invoke(vVar)) + " Worker. Update operation must preserve worker's type.");
        }
    }

    /* access modifiers changed from: private */
    public static final void g(WorkDatabase workDatabase, v vVar, v vVar2, List list, String str, Set set, boolean z3) {
        v vVar3 = vVar2;
        List list2 = list;
        String str2 = str;
        Set set2 = set;
        kotlin.jvm.internal.o.e(workDatabase, "$workDatabase");
        kotlin.jvm.internal.o.e(vVar, "$newWorkSpec");
        kotlin.jvm.internal.o.e(vVar3, "$oldWorkSpec");
        kotlin.jvm.internal.o.e(list2, "$schedulers");
        kotlin.jvm.internal.o.e(str2, "$workSpecId");
        kotlin.jvm.internal.o.e(set2, "$tags");
        w J3 = workDatabase.J();
        C0782A K3 = workDatabase.K();
        w wVar = J3;
        wVar.r(C0805d.b(list2, v.e(vVar, (String) null, vVar3.f14471b, (String) null, (String) null, (e) null, (e) null, 0, 0, 0, (b) null, vVar3.f14480k, (BackoffPolicy) null, 0, vVar3.f14483n, 0, 0, false, (OutOfQuotaPolicy) null, 0, vVar2.f() + 1, 515069, (Object) null)));
        C0782A a4 = K3;
        a4.c(str2);
        a4.b(str2, set2);
        if (!z3) {
            wVar.e(str2, -1);
            workDatabase.I().a(str2);
        }
    }
}
