package T2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import kotlin.jvm.internal.o;
import l2.q;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final e f1465a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1466b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1467c;

    /* renamed from: d  reason: collision with root package name */
    private a f1468d;

    /* renamed from: e  reason: collision with root package name */
    private final List f1469e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private boolean f1470f;

    public d(e eVar, String str) {
        o.e(eVar, "taskRunner");
        o.e(str, "name");
        this.f1465a = eVar;
        this.f1466b = str;
    }

    public static /* synthetic */ void j(d dVar, a aVar, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        dVar.i(aVar, j4);
    }

    public final void a() {
        if (!Q2.d.f1353h || !Thread.holdsLock(this)) {
            synchronized (this.f1465a) {
                try {
                    if (b()) {
                        h().h(this);
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final boolean b() {
        a aVar = this.f1468d;
        if (aVar != null) {
            o.b(aVar);
            if (aVar.a()) {
                this.f1470f = true;
            }
        }
        int size = this.f1469e.size() - 1;
        boolean z3 = false;
        if (size >= 0) {
            while (true) {
                int i4 = size - 1;
                if (((a) this.f1469e.get(size)).a()) {
                    a aVar2 = (a) this.f1469e.get(size);
                    if (e.f1471h.a().isLoggable(Level.FINE)) {
                        b.c(aVar2, this, "canceled");
                    }
                    this.f1469e.remove(size);
                    z3 = true;
                }
                if (i4 < 0) {
                    break;
                }
                size = i4;
            }
        }
        return z3;
    }

    public final a c() {
        return this.f1468d;
    }

    public final boolean d() {
        return this.f1470f;
    }

    public final List e() {
        return this.f1469e;
    }

    public final String f() {
        return this.f1466b;
    }

    public final boolean g() {
        return this.f1467c;
    }

    public final e h() {
        return this.f1465a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(T2.a r3, long r4) {
        /*
            r2 = this;
            java.lang.String r0 = "task"
            kotlin.jvm.internal.o.e(r3, r0)
            T2.e r0 = r2.f1465a
            monitor-enter(r0)
            boolean r1 = r2.g()     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0045
            boolean r4 = r3.a()     // Catch:{ all -> 0x0028 }
            if (r4 == 0) goto L_0x002c
            T2.e$b r4 = T2.e.f1471h     // Catch:{ all -> 0x0028 }
            java.util.logging.Logger r4 = r4.a()     // Catch:{ all -> 0x0028 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0028 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0028 }
            if (r4 == 0) goto L_0x002a
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            T2.b.c(r3, r2, r4)     // Catch:{ all -> 0x0028 }
            goto L_0x002a
        L_0x0028:
            r3 = move-exception
            goto L_0x0057
        L_0x002a:
            monitor-exit(r0)
            return
        L_0x002c:
            T2.e$b r4 = T2.e.f1471h     // Catch:{ all -> 0x0028 }
            java.util.logging.Logger r4 = r4.a()     // Catch:{ all -> 0x0028 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0028 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0028 }
            if (r4 == 0) goto L_0x003f
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            T2.b.c(r3, r2, r4)     // Catch:{ all -> 0x0028 }
        L_0x003f:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0028 }
            r3.<init>()     // Catch:{ all -> 0x0028 }
            throw r3     // Catch:{ all -> 0x0028 }
        L_0x0045:
            r1 = 0
            boolean r3 = r2.k(r3, r4, r1)     // Catch:{ all -> 0x0028 }
            if (r3 == 0) goto L_0x0053
            T2.e r3 = r2.h()     // Catch:{ all -> 0x0028 }
            r3.h(r2)     // Catch:{ all -> 0x0028 }
        L_0x0053:
            l2.q r3 = l2.q.f14567a     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)
            return
        L_0x0057:
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.d.i(T2.a, long):void");
    }

    public final boolean k(a aVar, long j4, boolean z3) {
        String str;
        o.e(aVar, "task");
        aVar.e(this);
        long c4 = this.f1465a.g().c();
        long j5 = c4 + j4;
        int indexOf = this.f1469e.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.c() <= j5) {
                if (e.f1471h.a().isLoggable(Level.FINE)) {
                    b.c(aVar, this, "already scheduled");
                }
                return false;
            }
            this.f1469e.remove(indexOf);
        }
        aVar.g(j5);
        if (e.f1471h.a().isLoggable(Level.FINE)) {
            if (z3) {
                str = o.k("run again after ", b.b(j5 - c4));
            } else {
                str = o.k("scheduled after ", b.b(j5 - c4));
            }
            b.c(aVar, this, str);
        }
        Iterator it = this.f1469e.iterator();
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                i4 = -1;
                break;
            } else if (((a) it.next()).c() - c4 > j4) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 == -1) {
            i4 = this.f1469e.size();
        }
        this.f1469e.add(i4, aVar);
        if (i4 == 0) {
            return true;
        }
        return false;
    }

    public final void l(a aVar) {
        this.f1468d = aVar;
    }

    public final void m(boolean z3) {
        this.f1470f = z3;
    }

    public final void n(boolean z3) {
        this.f1467c = z3;
    }

    public final void o() {
        if (!Q2.d.f1353h || !Thread.holdsLock(this)) {
            synchronized (this.f1465a) {
                try {
                    n(true);
                    if (b()) {
                        h().h(this);
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public String toString() {
        return this.f1466b;
    }
}
