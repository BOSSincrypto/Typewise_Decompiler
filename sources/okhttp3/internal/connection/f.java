package okhttp3.internal.connection;

import T2.d;
import T2.e;
import X2.k;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.q;
import okhttp3.C0841a;
import okhttp3.internal.connection.e;

public final class f {

    /* renamed from: f  reason: collision with root package name */
    public static final a f15397f = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f15398a;

    /* renamed from: b  reason: collision with root package name */
    private final long f15399b;

    /* renamed from: c  reason: collision with root package name */
    private final d f15400c;

    /* renamed from: d  reason: collision with root package name */
    private final b f15401d = new b(this, o.k(Q2.d.f1354i, " ConnectionPool"));

    /* renamed from: e  reason: collision with root package name */
    private final ConcurrentLinkedQueue f15402e = new ConcurrentLinkedQueue();

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends T2.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f15403e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar, String str) {
            super(str, false, 2, (i) null);
            this.f15403e = fVar;
        }

        public long f() {
            return this.f15403e.b(System.nanoTime());
        }
    }

    public f(e eVar, int i4, long j4, TimeUnit timeUnit) {
        o.e(eVar, "taskRunner");
        o.e(timeUnit, "timeUnit");
        this.f15398a = i4;
        this.f15399b = timeUnit.toNanos(j4);
        this.f15400c = eVar.i();
        if (j4 <= 0) {
            throw new IllegalArgumentException(o.k("keepAliveDuration <= 0: ", Long.valueOf(j4)).toString());
        }
    }

    private final int d(RealConnection realConnection, long j4) {
        if (!Q2.d.f1353h || Thread.holdsLock(realConnection)) {
            List o4 = realConnection.o();
            int i4 = 0;
            while (i4 < o4.size()) {
                Reference reference = (Reference) o4.get(i4);
                if (reference.get() != null) {
                    i4++;
                } else {
                    k.f1971a.g().l("A connection to " + realConnection.A().a().l() + " was leaked. Did you forget to close a response body?", ((e.b) reference).a());
                    o4.remove(i4);
                    realConnection.D(true);
                    if (o4.isEmpty()) {
                        realConnection.C(j4 - this.f15399b);
                        return 0;
                    }
                }
            }
            return o4.size();
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
    }

    public final boolean a(C0841a aVar, e eVar, List list, boolean z3) {
        o.e(aVar, "address");
        o.e(eVar, "call");
        Iterator it = this.f15402e.iterator();
        while (it.hasNext()) {
            RealConnection realConnection = (RealConnection) it.next();
            o.d(realConnection, "connection");
            synchronized (realConnection) {
                if (z3) {
                    try {
                        if (!realConnection.w()) {
                            q qVar = q.f14567a;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (realConnection.u(aVar, list)) {
                    eVar.d(realConnection);
                    return true;
                }
                q qVar2 = q.f14567a;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0079, code lost:
        Q2.d.n(r4.E());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0086, code lost:
        if (r11.f15402e.isEmpty() == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0088, code lost:
        r11.f15400c.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008d, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long b(long r12) {
        /*
            r11 = this;
            r0 = 1
            java.util.concurrent.ConcurrentLinkedQueue r1 = r11.f15402e
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = 0
            r4 = -9223372036854775808
            r5 = r4
            r4 = r3
            r3 = r2
        L_0x000e:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x003c
            java.lang.Object r7 = r1.next()
            okhttp3.internal.connection.RealConnection r7 = (okhttp3.internal.connection.RealConnection) r7
            java.lang.String r8 = "connection"
            kotlin.jvm.internal.o.d(r7, r8)
            monitor-enter(r7)
            int r8 = r11.d(r7, r12)     // Catch:{ all -> 0x0039 }
            if (r8 <= 0) goto L_0x0028
            int r3 = r3 + r0
            goto L_0x0037
        L_0x0028:
            int r2 = r2 + r0
            long r8 = r7.p()     // Catch:{ all -> 0x0039 }
            long r8 = r12 - r8
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 <= 0) goto L_0x0035
            r4 = r7
            r5 = r8
        L_0x0035:
            l2.q r8 = l2.q.f14567a     // Catch:{ all -> 0x0039 }
        L_0x0037:
            monitor-exit(r7)
            goto L_0x000e
        L_0x0039:
            r12 = move-exception
            monitor-exit(r7)
            throw r12
        L_0x003c:
            long r7 = r11.f15399b
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0051
            int r1 = r11.f15398a
            if (r2 <= r1) goto L_0x0047
            goto L_0x0051
        L_0x0047:
            if (r2 <= 0) goto L_0x004b
            long r7 = r7 - r5
            return r7
        L_0x004b:
            if (r3 <= 0) goto L_0x004e
            return r7
        L_0x004e:
            r12 = -1
            return r12
        L_0x0051:
            kotlin.jvm.internal.o.b(r4)
            monitor-enter(r4)
            java.util.List r1 = r4.o()     // Catch:{ all -> 0x008e }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x008e }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x008e }
            r2 = 0
            if (r1 != 0) goto L_0x0065
            monitor-exit(r4)
            return r2
        L_0x0065:
            long r7 = r4.p()     // Catch:{ all -> 0x008e }
            long r7 = r7 + r5
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 == 0) goto L_0x0070
            monitor-exit(r4)
            return r2
        L_0x0070:
            r4.D(r0)     // Catch:{ all -> 0x008e }
            java.util.concurrent.ConcurrentLinkedQueue r12 = r11.f15402e     // Catch:{ all -> 0x008e }
            r12.remove(r4)     // Catch:{ all -> 0x008e }
            monitor-exit(r4)
            java.net.Socket r12 = r4.E()
            Q2.d.n(r12)
            java.util.concurrent.ConcurrentLinkedQueue r12 = r11.f15402e
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x008d
            T2.d r12 = r11.f15400c
            r12.a()
        L_0x008d:
            return r2
        L_0x008e:
            r12 = move-exception
            monitor-exit(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.f.b(long):long");
    }

    public final boolean c(RealConnection realConnection) {
        o.e(realConnection, "connection");
        if (Q2.d.f1353h && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        } else if (realConnection.q() || this.f15398a == 0) {
            realConnection.D(true);
            this.f15402e.remove(realConnection);
            if (this.f15402e.isEmpty()) {
                this.f15400c.a();
            }
            return true;
        } else {
            d.j(this.f15400c, this.f15401d, 0, 2, (Object) null);
            return false;
        }
    }

    public final void e(RealConnection realConnection) {
        o.e(realConnection, "connection");
        if (!Q2.d.f1353h || Thread.holdsLock(realConnection)) {
            this.f15402e.add(realConnection);
            d.j(this.f15400c, this.f15401d, 0, 2, (Object) null);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
    }
}
