package m0;

import android.text.TextUtils;
import androidx.work.impl.F;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.o;
import androidx.work.impl.u;
import androidx.work.impl.x;
import androidx.work.m;
import androidx.work.o;
import java.util.List;

/* renamed from: m0.c  reason: case insensitive filesystem */
public class C0804c implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    private static final String f14608c = m.i("EnqueueRunnable");

    /* renamed from: a  reason: collision with root package name */
    private final x f14609a;

    /* renamed from: b  reason: collision with root package name */
    private final o f14610b;

    public C0804c(x xVar) {
        this(xVar, new o());
    }

    private static boolean b(x xVar) {
        boolean c4 = c(xVar.g(), xVar.f(), (String[]) x.l(xVar).toArray(new String[0]), xVar.d(), xVar.b());
        xVar.k();
        return c4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x015b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean c(androidx.work.impl.F r18, java.util.List r19, java.lang.String[] r20, java.lang.String r21, androidx.work.ExistingWorkPolicy r22) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            long r3 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r5 = r18.u()
            r7 = 0
            if (r0 == 0) goto L_0x0016
            int r8 = r0.length
            if (r8 <= 0) goto L_0x0016
            r8 = 1
            goto L_0x0017
        L_0x0016:
            r8 = r7
        L_0x0017:
            if (r8 == 0) goto L_0x0064
            int r9 = r0.length
            r10 = r7
            r12 = r10
            r13 = r12
            r11 = 1
        L_0x001e:
            if (r10 >= r9) goto L_0x0067
            r14 = r0[r10]
            l0.w r15 = r5.J()
            l0.v r15 = r15.l(r14)
            if (r15 != 0) goto L_0x004c
            androidx.work.m r0 = androidx.work.m.e()
            java.lang.String r1 = f14608c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Prerequisite "
            r2.append(r3)
            r2.append(r14)
            java.lang.String r3 = " doesn't exist; not enqueuing"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.c(r1, r2)
            return r7
        L_0x004c:
            androidx.work.WorkInfo$State r14 = r15.f14471b
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.SUCCEEDED
            if (r14 != r15) goto L_0x0054
            r15 = 1
            goto L_0x0055
        L_0x0054:
            r15 = r7
        L_0x0055:
            r11 = r11 & r15
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.FAILED
            if (r14 != r15) goto L_0x005c
            r13 = 1
            goto L_0x0061
        L_0x005c:
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.CANCELLED
            if (r14 != r15) goto L_0x0061
            r12 = 1
        L_0x0061:
            int r10 = r10 + 1
            goto L_0x001e
        L_0x0064:
            r12 = r7
            r13 = r12
            r11 = 1
        L_0x0067:
            boolean r9 = android.text.TextUtils.isEmpty(r21)
            if (r9 != 0) goto L_0x014e
            if (r8 != 0) goto L_0x014e
            l0.w r10 = r5.J()
            java.util.List r10 = r10.g(r1)
            boolean r14 = r10.isEmpty()
            if (r14 != 0) goto L_0x014e
            androidx.work.ExistingWorkPolicy r14 = androidx.work.ExistingWorkPolicy.APPEND
            if (r2 == r14) goto L_0x0085
            androidx.work.ExistingWorkPolicy r14 = androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE
            if (r2 != r14) goto L_0x0088
        L_0x0085:
            r14 = r18
            goto L_0x00cd
        L_0x0088:
            androidx.work.ExistingWorkPolicy r14 = androidx.work.ExistingWorkPolicy.KEEP
            if (r2 != r14) goto L_0x00a7
            java.util.Iterator r2 = r10.iterator()
        L_0x0090:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L_0x00a7
            java.lang.Object r14 = r2.next()
            l0.v$b r14 = (l0.v.b) r14
            androidx.work.WorkInfo$State r14 = r14.f14491b
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.ENQUEUED
            if (r14 == r15) goto L_0x00a6
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.RUNNING
            if (r14 != r15) goto L_0x0090
        L_0x00a6:
            return r7
        L_0x00a7:
            r14 = r18
            m0.b r2 = m0.C0803b.c(r1, r14, r7)
            r2.run()
            l0.w r2 = r5.J()
            java.util.Iterator r10 = r10.iterator()
        L_0x00b8:
            boolean r15 = r10.hasNext()
            if (r15 == 0) goto L_0x00ca
            java.lang.Object r15 = r10.next()
            l0.v$b r15 = (l0.v.b) r15
            java.lang.String r15 = r15.f14490a
            r2.a(r15)
            goto L_0x00b8
        L_0x00ca:
            r6 = 1
            goto L_0x0151
        L_0x00cd:
            l0.b r8 = r5.E()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x00da:
            boolean r16 = r10.hasNext()
            if (r16 == 0) goto L_0x0114
            java.lang.Object r16 = r10.next()
            r6 = r16
            l0.v$b r6 = (l0.v.b) r6
            java.lang.String r7 = r6.f14490a
            boolean r7 = r8.c(r7)
            if (r7 != 0) goto L_0x010e
            androidx.work.WorkInfo$State r7 = r6.f14491b
            r17 = r8
            androidx.work.WorkInfo$State r8 = androidx.work.WorkInfo.State.SUCCEEDED
            if (r7 != r8) goto L_0x00fa
            r8 = 1
            goto L_0x00fb
        L_0x00fa:
            r8 = 0
        L_0x00fb:
            r8 = r8 & r11
            androidx.work.WorkInfo$State r11 = androidx.work.WorkInfo.State.FAILED
            if (r7 != r11) goto L_0x0102
            r13 = 1
            goto L_0x0107
        L_0x0102:
            androidx.work.WorkInfo$State r11 = androidx.work.WorkInfo.State.CANCELLED
            if (r7 != r11) goto L_0x0107
            r12 = 1
        L_0x0107:
            java.lang.String r6 = r6.f14490a
            r15.add(r6)
            r11 = r8
            goto L_0x0110
        L_0x010e:
            r17 = r8
        L_0x0110:
            r8 = r17
            r7 = 0
            goto L_0x00da
        L_0x0114:
            androidx.work.ExistingWorkPolicy r6 = androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE
            if (r2 != r6) goto L_0x0140
            if (r12 != 0) goto L_0x011c
            if (r13 == 0) goto L_0x0140
        L_0x011c:
            l0.w r2 = r5.J()
            java.util.List r6 = r2.g(r1)
            java.util.Iterator r6 = r6.iterator()
        L_0x0128:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x013a
            java.lang.Object r7 = r6.next()
            l0.v$b r7 = (l0.v.b) r7
            java.lang.String r7 = r7.f14490a
            r2.a(r7)
            goto L_0x0128
        L_0x013a:
            java.util.List r15 = java.util.Collections.emptyList()
            r12 = 0
            r13 = 0
        L_0x0140:
            java.lang.Object[] r0 = r15.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            int r2 = r0.length
            if (r2 <= 0) goto L_0x014b
            r8 = 1
            goto L_0x014c
        L_0x014b:
            r8 = 0
        L_0x014c:
            r6 = 0
            goto L_0x0151
        L_0x014e:
            r14 = r18
            goto L_0x014c
        L_0x0151:
            java.util.Iterator r2 = r19.iterator()
        L_0x0155:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x01e2
            java.lang.Object r7 = r2.next()
            androidx.work.u r7 = (androidx.work.u) r7
            l0.v r10 = r7.d()
            if (r8 == 0) goto L_0x017c
            if (r11 != 0) goto L_0x017c
            if (r13 == 0) goto L_0x0170
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.FAILED
            r10.f14471b = r15
            goto L_0x017e
        L_0x0170:
            if (r12 == 0) goto L_0x0177
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.CANCELLED
            r10.f14471b = r15
            goto L_0x017e
        L_0x0177:
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.BLOCKED
            r10.f14471b = r15
            goto L_0x017e
        L_0x017c:
            r10.f14483n = r3
        L_0x017e:
            androidx.work.WorkInfo$State r15 = r10.f14471b
            r19 = r2
            androidx.work.WorkInfo$State r2 = androidx.work.WorkInfo.State.ENQUEUED
            if (r15 != r2) goto L_0x0187
            r6 = 1
        L_0x0187:
            l0.w r2 = r5.J()
            java.util.List r15 = r18.s()
            l0.v r10 = m0.C0805d.b(r15, r10)
            r2.j(r10)
            if (r8 == 0) goto L_0x01b9
            int r2 = r0.length
            r10 = 0
        L_0x019a:
            if (r10 >= r2) goto L_0x01b9
            r15 = r0[r10]
            r17 = r0
            l0.a r0 = new l0.a
            r20 = r2
            java.lang.String r2 = r7.b()
            r0.<init>(r2, r15)
            l0.b r2 = r5.E()
            r2.b(r0)
            int r10 = r10 + 1
            r2 = r20
            r0 = r17
            goto L_0x019a
        L_0x01b9:
            r17 = r0
            l0.A r0 = r5.K()
            java.lang.String r2 = r7.b()
            java.util.Set r10 = r7.c()
            r0.b(r2, r10)
            if (r9 != 0) goto L_0x01dc
            l0.o r0 = r5.H()
            l0.n r2 = new l0.n
            java.lang.String r7 = r7.b()
            r2.<init>(r1, r7)
            r0.a(r2)
        L_0x01dc:
            r2 = r19
            r0 = r17
            goto L_0x0155
        L_0x01e2:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C0804c.c(androidx.work.impl.F, java.util.List, java.lang.String[], java.lang.String, androidx.work.ExistingWorkPolicy):boolean");
    }

    private static boolean e(x xVar) {
        List<x> e4 = xVar.e();
        boolean z3 = false;
        if (e4 != null) {
            for (x xVar2 : e4) {
                if (!xVar2.j()) {
                    z3 |= e(xVar2);
                } else {
                    m e5 = m.e();
                    String str = f14608c;
                    e5.k(str, "Already enqueued work ids (" + TextUtils.join(", ", xVar2.c()) + ")");
                }
            }
        }
        return b(xVar) | z3;
    }

    public boolean a() {
        WorkDatabase u3 = this.f14609a.g().u();
        u3.e();
        try {
            boolean e4 = e(this.f14609a);
            u3.B();
            return e4;
        } finally {
            u3.i();
        }
    }

    public androidx.work.o d() {
        return this.f14610b;
    }

    public void f() {
        F g4 = this.f14609a.g();
        u.b(g4.n(), g4.u(), g4.s());
    }

    public void run() {
        try {
            if (!this.f14609a.h()) {
                if (a()) {
                    C0818q.a(this.f14609a.g().m(), RescheduleReceiver.class, true);
                    f();
                }
                this.f14610b.a(androidx.work.o.f7433a);
                return;
            }
            throw new IllegalStateException("WorkContinuation has cycles (" + this.f14609a + ")");
        } catch (Throwable th) {
            this.f14610b.a(new o.b.a(th));
        }
    }

    public C0804c(x xVar, androidx.work.impl.o oVar) {
        this.f14609a = xVar;
        this.f14610b = oVar;
    }
}
