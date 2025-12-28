package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.g;
import androidx.work.impl.foreground.b;
import androidx.work.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import l0.v;
import m0.y;
import n0.c;

public class r implements C0471e, androidx.work.impl.foreground.a {

    /* renamed from: m  reason: collision with root package name */
    private static final String f7347m = m.i("Processor");

    /* renamed from: a  reason: collision with root package name */
    private PowerManager.WakeLock f7348a;

    /* renamed from: b  reason: collision with root package name */
    private Context f7349b;

    /* renamed from: c  reason: collision with root package name */
    private androidx.work.a f7350c;

    /* renamed from: d  reason: collision with root package name */
    private c f7351d;

    /* renamed from: e  reason: collision with root package name */
    private WorkDatabase f7352e;

    /* renamed from: f  reason: collision with root package name */
    private Map f7353f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private Map f7354g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private Map f7355h;

    /* renamed from: i  reason: collision with root package name */
    private List f7356i;

    /* renamed from: j  reason: collision with root package name */
    private Set f7357j;

    /* renamed from: k  reason: collision with root package name */
    private final List f7358k;

    /* renamed from: l  reason: collision with root package name */
    private final Object f7359l;

    private static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private C0471e f7360a;

        /* renamed from: b  reason: collision with root package name */
        private final l0.m f7361b;

        /* renamed from: c  reason: collision with root package name */
        private X1.a f7362c;

        a(C0471e eVar, l0.m mVar, X1.a aVar) {
            this.f7360a = eVar;
            this.f7361b = mVar;
            this.f7362c = aVar;
        }

        public void run() {
            boolean z3;
            try {
                z3 = ((Boolean) this.f7362c.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z3 = true;
            }
            this.f7360a.b(this.f7361b, z3);
        }
    }

    public r(Context context, androidx.work.a aVar, c cVar, WorkDatabase workDatabase, List list) {
        this.f7349b = context;
        this.f7350c = aVar;
        this.f7351d = cVar;
        this.f7352e = workDatabase;
        this.f7356i = list;
        this.f7357j = new HashSet();
        this.f7358k = new ArrayList();
        this.f7348a = null;
        this.f7359l = new Object();
        this.f7355h = new HashMap();
    }

    private static boolean i(String str, K k4) {
        if (k4 != null) {
            k4.g();
            m e4 = m.e();
            String str2 = f7347m;
            e4.a(str2, "WorkerWrapper interrupted for " + str);
            return true;
        }
        m e5 = m.e();
        String str3 = f7347m;
        e5.a(str3, "WorkerWrapper could not be found for " + str);
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ v m(ArrayList arrayList, String str) {
        arrayList.addAll(this.f7352e.K().d(str));
        return this.f7352e.J().l(str);
    }

    private void o(l0.m mVar, boolean z3) {
        this.f7351d.a().execute(new q(this, mVar, z3));
    }

    private void s() {
        synchronized (this.f7359l) {
            try {
                if (this.f7353f.isEmpty()) {
                    this.f7349b.startService(b.g(this.f7349b));
                    PowerManager.WakeLock wakeLock = this.f7348a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f7348a = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(String str) {
        synchronized (this.f7359l) {
            this.f7353f.remove(str);
            s();
        }
    }

    /* renamed from: b */
    public void l(l0.m mVar, boolean z3) {
        synchronized (this.f7359l) {
            try {
                K k4 = (K) this.f7354g.get(mVar.b());
                if (k4 != null && mVar.equals(k4.d())) {
                    this.f7354g.remove(mVar.b());
                }
                m e4 = m.e();
                String str = f7347m;
                e4.a(str, getClass().getSimpleName() + " " + mVar.b() + " executed; reschedule = " + z3);
                for (C0471e b4 : this.f7358k) {
                    b4.b(mVar, z3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean c(String str) {
        boolean containsKey;
        synchronized (this.f7359l) {
            containsKey = this.f7353f.containsKey(str);
        }
        return containsKey;
    }

    public void d(String str, g gVar) {
        synchronized (this.f7359l) {
            try {
                m e4 = m.e();
                String str2 = f7347m;
                e4.f(str2, "Moving WorkSpec (" + str + ") to the foreground");
                K k4 = (K) this.f7354g.remove(str);
                if (k4 != null) {
                    if (this.f7348a == null) {
                        PowerManager.WakeLock b4 = y.b(this.f7349b, "ProcessorForegroundLck");
                        this.f7348a = b4;
                        b4.acquire();
                    }
                    this.f7353f.put(str, k4);
                    androidx.core.content.a.k(this.f7349b, b.f(this.f7349b, k4.d(), gVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g(C0471e eVar) {
        synchronized (this.f7359l) {
            this.f7358k.add(eVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: androidx.work.impl.K} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l0.v h(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f7359l
            monitor-enter(r0)
            java.util.Map r1 = r2.f7353f     // Catch:{ all -> 0x0017 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x0017 }
            androidx.work.impl.K r1 = (androidx.work.impl.K) r1     // Catch:{ all -> 0x0017 }
            if (r1 != 0) goto L_0x0019
            java.util.Map r1 = r2.f7354g     // Catch:{ all -> 0x0017 }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x0017 }
            r1 = r3
            androidx.work.impl.K r1 = (androidx.work.impl.K) r1     // Catch:{ all -> 0x0017 }
            goto L_0x0019
        L_0x0017:
            r3 = move-exception
            goto L_0x0024
        L_0x0019:
            if (r1 == 0) goto L_0x0021
            l0.v r3 = r1.e()     // Catch:{ all -> 0x0017 }
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            return r3
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            r3 = 0
            return r3
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.r.h(java.lang.String):l0.v");
    }

    public boolean j(String str) {
        boolean contains;
        synchronized (this.f7359l) {
            contains = this.f7357j.contains(str);
        }
        return contains;
    }

    public boolean k(String str) {
        boolean z3;
        synchronized (this.f7359l) {
            try {
                if (!this.f7354g.containsKey(str)) {
                    if (!this.f7353f.containsKey(str)) {
                        z3 = false;
                    }
                }
                z3 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    public void n(C0471e eVar) {
        synchronized (this.f7359l) {
            this.f7358k.remove(eVar);
        }
    }

    public boolean p(v vVar) {
        return q(vVar, (WorkerParameters.a) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean q(androidx.work.impl.v r13, androidx.work.WorkerParameters.a r14) {
        /*
            r12 = this;
            l0.m r0 = r13.a()
            java.lang.String r1 = r0.b()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            androidx.work.impl.WorkDatabase r2 = r12.f7352e
            androidx.work.impl.p r3 = new androidx.work.impl.p
            r3.<init>(r12, r9, r1)
            java.lang.Object r2 = r2.z(r3)
            r8 = r2
            l0.v r8 = (l0.v) r8
            r2 = 0
            if (r8 != 0) goto L_0x003c
            androidx.work.m r13 = androidx.work.m.e()
            java.lang.String r14 = f7347m
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Didn't find WorkSpec for id "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r13.k(r14, r1)
            r12.o(r0, r2)
            return r2
        L_0x003c:
            java.lang.Object r10 = r12.f7359l
            monitor-enter(r10)
            boolean r3 = r12.k(r1)     // Catch:{ all -> 0x0088 }
            if (r3 == 0) goto L_0x0090
            java.util.Map r14 = r12.f7355h     // Catch:{ all -> 0x0088 }
            java.lang.Object r14 = r14.get(r1)     // Catch:{ all -> 0x0088 }
            java.util.Set r14 = (java.util.Set) r14     // Catch:{ all -> 0x0088 }
            java.util.Iterator r1 = r14.iterator()     // Catch:{ all -> 0x0088 }
            java.lang.Object r1 = r1.next()     // Catch:{ all -> 0x0088 }
            androidx.work.impl.v r1 = (androidx.work.impl.v) r1     // Catch:{ all -> 0x0088 }
            l0.m r1 = r1.a()     // Catch:{ all -> 0x0088 }
            int r1 = r1.a()     // Catch:{ all -> 0x0088 }
            int r3 = r0.a()     // Catch:{ all -> 0x0088 }
            if (r1 != r3) goto L_0x008b
            r14.add(r13)     // Catch:{ all -> 0x0088 }
            androidx.work.m r13 = androidx.work.m.e()     // Catch:{ all -> 0x0088 }
            java.lang.String r14 = f7347m     // Catch:{ all -> 0x0088 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0088 }
            r1.<init>()     // Catch:{ all -> 0x0088 }
            java.lang.String r3 = "Work "
            r1.append(r3)     // Catch:{ all -> 0x0088 }
            r1.append(r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = " is already enqueued for processing"
            r1.append(r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0088 }
            r13.a(r14, r0)     // Catch:{ all -> 0x0088 }
            goto L_0x008e
        L_0x0088:
            r13 = move-exception
            goto L_0x0115
        L_0x008b:
            r12.o(r0, r2)     // Catch:{ all -> 0x0088 }
        L_0x008e:
            monitor-exit(r10)     // Catch:{ all -> 0x0088 }
            return r2
        L_0x0090:
            int r3 = r8.f()     // Catch:{ all -> 0x0088 }
            int r4 = r0.a()     // Catch:{ all -> 0x0088 }
            if (r3 == r4) goto L_0x009f
            r12.o(r0, r2)     // Catch:{ all -> 0x0088 }
            monitor-exit(r10)     // Catch:{ all -> 0x0088 }
            return r2
        L_0x009f:
            androidx.work.impl.K$c r11 = new androidx.work.impl.K$c     // Catch:{ all -> 0x0088 }
            android.content.Context r3 = r12.f7349b     // Catch:{ all -> 0x0088 }
            androidx.work.a r4 = r12.f7350c     // Catch:{ all -> 0x0088 }
            n0.c r5 = r12.f7351d     // Catch:{ all -> 0x0088 }
            androidx.work.impl.WorkDatabase r7 = r12.f7352e     // Catch:{ all -> 0x0088 }
            r2 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0088 }
            java.util.List r2 = r12.f7356i     // Catch:{ all -> 0x0088 }
            androidx.work.impl.K$c r2 = r11.d(r2)     // Catch:{ all -> 0x0088 }
            androidx.work.impl.K$c r14 = r2.c(r14)     // Catch:{ all -> 0x0088 }
            androidx.work.impl.K r14 = r14.b()     // Catch:{ all -> 0x0088 }
            X1.a r2 = r14.c()     // Catch:{ all -> 0x0088 }
            androidx.work.impl.r$a r3 = new androidx.work.impl.r$a     // Catch:{ all -> 0x0088 }
            l0.m r4 = r13.a()     // Catch:{ all -> 0x0088 }
            r3.<init>(r12, r4, r2)     // Catch:{ all -> 0x0088 }
            n0.c r4 = r12.f7351d     // Catch:{ all -> 0x0088 }
            java.util.concurrent.Executor r4 = r4.a()     // Catch:{ all -> 0x0088 }
            r2.a(r3, r4)     // Catch:{ all -> 0x0088 }
            java.util.Map r2 = r12.f7354g     // Catch:{ all -> 0x0088 }
            r2.put(r1, r14)     // Catch:{ all -> 0x0088 }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x0088 }
            r2.<init>()     // Catch:{ all -> 0x0088 }
            r2.add(r13)     // Catch:{ all -> 0x0088 }
            java.util.Map r13 = r12.f7355h     // Catch:{ all -> 0x0088 }
            r13.put(r1, r2)     // Catch:{ all -> 0x0088 }
            monitor-exit(r10)     // Catch:{ all -> 0x0088 }
            n0.c r13 = r12.f7351d
            n0.a r13 = r13.b()
            r13.execute(r14)
            androidx.work.m r13 = androidx.work.m.e()
            java.lang.String r14 = f7347m
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r12.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            java.lang.String r2 = ": processing "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r13.a(r14, r0)
            r13 = 1
            return r13
        L_0x0115:
            monitor-exit(r10)     // Catch:{ all -> 0x0088 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.r.q(androidx.work.impl.v, androidx.work.WorkerParameters$a):boolean");
    }

    public boolean r(String str) {
        K k4;
        boolean z3;
        synchronized (this.f7359l) {
            try {
                m e4 = m.e();
                String str2 = f7347m;
                e4.a(str2, "Processor cancelling " + str);
                this.f7357j.add(str);
                k4 = (K) this.f7353f.remove(str);
                if (k4 != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (k4 == null) {
                    k4 = (K) this.f7354g.remove(str);
                }
                if (k4 != null) {
                    this.f7355h.remove(str);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        boolean i4 = i(str, k4);
        if (z3) {
            s();
        }
        return i4;
    }

    public boolean t(v vVar) {
        K k4;
        String b4 = vVar.a().b();
        synchronized (this.f7359l) {
            try {
                m e4 = m.e();
                String str = f7347m;
                e4.a(str, "Processor stopping foreground work " + b4);
                k4 = (K) this.f7353f.remove(b4);
                if (k4 != null) {
                    this.f7355h.remove(b4);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return i(b4, k4);
    }

    public boolean u(v vVar) {
        String b4 = vVar.a().b();
        synchronized (this.f7359l) {
            try {
                K k4 = (K) this.f7354g.remove(b4);
                if (k4 == null) {
                    m e4 = m.e();
                    String str = f7347m;
                    e4.a(str, "WorkerWrapper could not be found for " + b4);
                    return false;
                }
                Set set = (Set) this.f7355h.get(b4);
                if (set != null) {
                    if (set.contains(vVar)) {
                        m e5 = m.e();
                        String str2 = f7347m;
                        e5.a(str2, "Processor stopping background work " + b4);
                        this.f7355h.remove(b4);
                        return i(b4, k4);
                    }
                }
                return false;
            } finally {
            }
        }
    }
}
