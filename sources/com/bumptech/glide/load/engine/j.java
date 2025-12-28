package com.bumptech.glide.load.engine;

import b1.C0481a;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.n;
import com.bumptech.glide.request.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p1.k;
import q1.C0864a;
import q1.C0866c;

class j implements DecodeJob.b, C0864a.f {

    /* renamed from: D  reason: collision with root package name */
    private static final c f10977D = new c();

    /* renamed from: A  reason: collision with root package name */
    private DecodeJob f10978A;

    /* renamed from: B  reason: collision with root package name */
    private volatile boolean f10979B;

    /* renamed from: C  reason: collision with root package name */
    private boolean f10980C;

    /* renamed from: a  reason: collision with root package name */
    final e f10981a;

    /* renamed from: b  reason: collision with root package name */
    private final C0866c f10982b;

    /* renamed from: c  reason: collision with root package name */
    private final n.a f10983c;

    /* renamed from: d  reason: collision with root package name */
    private final androidx.core.util.d f10984d;

    /* renamed from: e  reason: collision with root package name */
    private final c f10985e;

    /* renamed from: f  reason: collision with root package name */
    private final k f10986f;

    /* renamed from: g  reason: collision with root package name */
    private final C0481a f10987g;

    /* renamed from: h  reason: collision with root package name */
    private final C0481a f10988h;

    /* renamed from: i  reason: collision with root package name */
    private final C0481a f10989i;

    /* renamed from: j  reason: collision with root package name */
    private final C0481a f10990j;

    /* renamed from: k  reason: collision with root package name */
    private final AtomicInteger f10991k;

    /* renamed from: l  reason: collision with root package name */
    private X0.b f10992l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f10993m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f10994n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f10995o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f10996p;

    /* renamed from: q  reason: collision with root package name */
    private s f10997q;

    /* renamed from: v  reason: collision with root package name */
    DataSource f10998v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f10999w;

    /* renamed from: x  reason: collision with root package name */
    GlideException f11000x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f11001y;

    /* renamed from: z  reason: collision with root package name */
    n f11002z;

    private class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final f f11003a;

        a(f fVar) {
            this.f11003a = fVar;
        }

        public void run() {
            synchronized (this.f11003a.f()) {
                synchronized (j.this) {
                    try {
                        if (j.this.f10981a.b(this.f11003a)) {
                            j.this.f(this.f11003a);
                        }
                        j.this.i();
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    private class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final f f11005a;

        b(f fVar) {
            this.f11005a = fVar;
        }

        public void run() {
            synchronized (this.f11005a.f()) {
                synchronized (j.this) {
                    try {
                        if (j.this.f10981a.b(this.f11005a)) {
                            j.this.f11002z.b();
                            j.this.g(this.f11005a);
                            j.this.r(this.f11005a);
                        }
                        j.this.i();
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    static class c {
        c() {
        }

        public n a(s sVar, boolean z3, X0.b bVar, n.a aVar) {
            return new n(sVar, z3, true, bVar, aVar);
        }
    }

    static final class d {

        /* renamed from: a  reason: collision with root package name */
        final f f11007a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f11008b;

        d(f fVar, Executor executor) {
            this.f11007a = fVar;
            this.f11008b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f11007a.equals(((d) obj).f11007a);
            }
            return false;
        }

        public int hashCode() {
            return this.f11007a.hashCode();
        }
    }

    static final class e implements Iterable {

        /* renamed from: a  reason: collision with root package name */
        private final List f11009a;

        e() {
            this(new ArrayList(2));
        }

        private static d d(f fVar) {
            return new d(fVar, p1.e.a());
        }

        /* access modifiers changed from: package-private */
        public void a(f fVar, Executor executor) {
            this.f11009a.add(new d(fVar, executor));
        }

        /* access modifiers changed from: package-private */
        public boolean b(f fVar) {
            return this.f11009a.contains(d(fVar));
        }

        /* access modifiers changed from: package-private */
        public e c() {
            return new e(new ArrayList(this.f11009a));
        }

        /* access modifiers changed from: package-private */
        public void clear() {
            this.f11009a.clear();
        }

        /* access modifiers changed from: package-private */
        public void e(f fVar) {
            this.f11009a.remove(d(fVar));
        }

        /* access modifiers changed from: package-private */
        public boolean isEmpty() {
            return this.f11009a.isEmpty();
        }

        public Iterator iterator() {
            return this.f11009a.iterator();
        }

        /* access modifiers changed from: package-private */
        public int size() {
            return this.f11009a.size();
        }

        e(List list) {
            this.f11009a = list;
        }
    }

    j(C0481a aVar, C0481a aVar2, C0481a aVar3, C0481a aVar4, k kVar, n.a aVar5, androidx.core.util.d dVar) {
        this(aVar, aVar2, aVar3, aVar4, kVar, aVar5, dVar, f10977D);
    }

    private C0481a j() {
        if (this.f10994n) {
            return this.f10989i;
        }
        if (this.f10995o) {
            return this.f10990j;
        }
        return this.f10988h;
    }

    private boolean m() {
        if (this.f11001y || this.f10999w || this.f10979B) {
            return true;
        }
        return false;
    }

    private synchronized void q() {
        if (this.f10992l != null) {
            this.f10981a.clear();
            this.f10992l = null;
            this.f11002z = null;
            this.f10997q = null;
            this.f11001y = false;
            this.f10979B = false;
            this.f10999w = false;
            this.f10980C = false;
            this.f10978A.w(false);
            this.f10978A = null;
            this.f11000x = null;
            this.f10998v = null;
            this.f10984d.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void a(GlideException glideException) {
        synchronized (this) {
            this.f11000x = glideException;
        }
        n();
    }

    public C0866c b() {
        return this.f10982b;
    }

    public void c(s sVar, DataSource dataSource, boolean z3) {
        synchronized (this) {
            this.f10997q = sVar;
            this.f10998v = dataSource;
            this.f10980C = z3;
        }
        o();
    }

    public void d(DecodeJob decodeJob) {
        j().execute(decodeJob);
    }

    /* access modifiers changed from: package-private */
    public synchronized void e(f fVar, Executor executor) {
        try {
            this.f10982b.c();
            this.f10981a.a(fVar, executor);
            if (this.f10999w) {
                k(1);
                executor.execute(new b(fVar));
            } else if (this.f11001y) {
                k(1);
                executor.execute(new a(fVar));
            } else {
                k.a(!this.f10979B, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f(f fVar) {
        try {
            fVar.a(this.f11000x);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    /* access modifiers changed from: package-private */
    public void g(f fVar) {
        try {
            fVar.c(this.f11002z, this.f10998v, this.f10980C);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        if (!m()) {
            this.f10979B = true;
            this.f10978A.e();
            this.f10986f.c(this, this.f10992l);
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        boolean z3;
        n nVar;
        synchronized (this) {
            try {
                this.f10982b.c();
                k.a(m(), "Not yet complete!");
                int decrementAndGet = this.f10991k.decrementAndGet();
                if (decrementAndGet >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                k.a(z3, "Can't decrement below 0");
                if (decrementAndGet == 0) {
                    nVar = this.f11002z;
                    q();
                } else {
                    nVar = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (nVar != null) {
            nVar.g();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void k(int i4) {
        n nVar;
        k.a(m(), "Not yet complete!");
        if (this.f10991k.getAndAdd(i4) == 0 && (nVar = this.f11002z) != null) {
            nVar.b();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized j l(X0.b bVar, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f10992l = bVar;
        this.f10993m = z3;
        this.f10994n = z4;
        this.f10995o = z5;
        this.f10996p = z6;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        r4.f10986f.d(r4, r1, (com.bumptech.glide.load.engine.n) null);
        r0 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r0.hasNext() == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        r1 = (com.bumptech.glide.load.engine.j.d) r0.next();
        r1.f11008b.execute(new com.bumptech.glide.load.engine.j.a(r4, r1.f11007a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n() {
        /*
            r4 = this;
            monitor-enter(r4)
            q1.c r0 = r4.f10982b     // Catch:{ all -> 0x000f }
            r0.c()     // Catch:{ all -> 0x000f }
            boolean r0 = r4.f10979B     // Catch:{ all -> 0x000f }
            if (r0 == 0) goto L_0x0011
            r4.q()     // Catch:{ all -> 0x000f }
            monitor-exit(r4)     // Catch:{ all -> 0x000f }
            return
        L_0x000f:
            r0 = move-exception
            goto L_0x0068
        L_0x0011:
            com.bumptech.glide.load.engine.j$e r0 = r4.f10981a     // Catch:{ all -> 0x000f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x000f }
            if (r0 != 0) goto L_0x0060
            boolean r0 = r4.f11001y     // Catch:{ all -> 0x000f }
            if (r0 != 0) goto L_0x0058
            r0 = 1
            r4.f11001y = r0     // Catch:{ all -> 0x000f }
            X0.b r1 = r4.f10992l     // Catch:{ all -> 0x000f }
            com.bumptech.glide.load.engine.j$e r2 = r4.f10981a     // Catch:{ all -> 0x000f }
            com.bumptech.glide.load.engine.j$e r2 = r2.c()     // Catch:{ all -> 0x000f }
            int r3 = r2.size()     // Catch:{ all -> 0x000f }
            int r3 = r3 + r0
            r4.k(r3)     // Catch:{ all -> 0x000f }
            monitor-exit(r4)     // Catch:{ all -> 0x000f }
            com.bumptech.glide.load.engine.k r0 = r4.f10986f
            r3 = 0
            r0.d(r4, r1, r3)
            java.util.Iterator r0 = r2.iterator()
        L_0x003b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0054
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.engine.j$d r1 = (com.bumptech.glide.load.engine.j.d) r1
            java.util.concurrent.Executor r2 = r1.f11008b
            com.bumptech.glide.load.engine.j$a r3 = new com.bumptech.glide.load.engine.j$a
            com.bumptech.glide.request.f r1 = r1.f11007a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x003b
        L_0x0054:
            r4.i()
            return
        L_0x0058:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x000f }
            java.lang.String r1 = "Already failed once"
            r0.<init>(r1)     // Catch:{ all -> 0x000f }
            throw r0     // Catch:{ all -> 0x000f }
        L_0x0060:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x000f }
            java.lang.String r1 = "Received an exception without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x000f }
            throw r0     // Catch:{ all -> 0x000f }
        L_0x0068:
            monitor-exit(r4)     // Catch:{ all -> 0x000f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.j.n():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        r5.f10986f.d(r5, r0, r2);
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r0.hasNext() == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        r1 = (com.bumptech.glide.load.engine.j.d) r0.next();
        r1.f11008b.execute(new com.bumptech.glide.load.engine.j.b(r5, r1.f11007a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o() {
        /*
            r5 = this;
            monitor-enter(r5)
            q1.c r0 = r5.f10982b     // Catch:{ all -> 0x0014 }
            r0.c()     // Catch:{ all -> 0x0014 }
            boolean r0 = r5.f10979B     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x0016
            com.bumptech.glide.load.engine.s r0 = r5.f10997q     // Catch:{ all -> 0x0014 }
            r0.d()     // Catch:{ all -> 0x0014 }
            r5.q()     // Catch:{ all -> 0x0014 }
            monitor-exit(r5)     // Catch:{ all -> 0x0014 }
            return
        L_0x0014:
            r0 = move-exception
            goto L_0x007e
        L_0x0016:
            com.bumptech.glide.load.engine.j$e r0 = r5.f10981a     // Catch:{ all -> 0x0014 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0014 }
            if (r0 != 0) goto L_0x0076
            boolean r0 = r5.f10999w     // Catch:{ all -> 0x0014 }
            if (r0 != 0) goto L_0x006e
            com.bumptech.glide.load.engine.j$c r0 = r5.f10985e     // Catch:{ all -> 0x0014 }
            com.bumptech.glide.load.engine.s r1 = r5.f10997q     // Catch:{ all -> 0x0014 }
            boolean r2 = r5.f10993m     // Catch:{ all -> 0x0014 }
            X0.b r3 = r5.f10992l     // Catch:{ all -> 0x0014 }
            com.bumptech.glide.load.engine.n$a r4 = r5.f10983c     // Catch:{ all -> 0x0014 }
            com.bumptech.glide.load.engine.n r0 = r0.a(r1, r2, r3, r4)     // Catch:{ all -> 0x0014 }
            r5.f11002z = r0     // Catch:{ all -> 0x0014 }
            r0 = 1
            r5.f10999w = r0     // Catch:{ all -> 0x0014 }
            com.bumptech.glide.load.engine.j$e r1 = r5.f10981a     // Catch:{ all -> 0x0014 }
            com.bumptech.glide.load.engine.j$e r1 = r1.c()     // Catch:{ all -> 0x0014 }
            int r2 = r1.size()     // Catch:{ all -> 0x0014 }
            int r2 = r2 + r0
            r5.k(r2)     // Catch:{ all -> 0x0014 }
            X0.b r0 = r5.f10992l     // Catch:{ all -> 0x0014 }
            com.bumptech.glide.load.engine.n r2 = r5.f11002z     // Catch:{ all -> 0x0014 }
            monitor-exit(r5)     // Catch:{ all -> 0x0014 }
            com.bumptech.glide.load.engine.k r3 = r5.f10986f
            r3.d(r5, r0, r2)
            java.util.Iterator r0 = r1.iterator()
        L_0x0051:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x006a
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.engine.j$d r1 = (com.bumptech.glide.load.engine.j.d) r1
            java.util.concurrent.Executor r2 = r1.f11008b
            com.bumptech.glide.load.engine.j$b r3 = new com.bumptech.glide.load.engine.j$b
            com.bumptech.glide.request.f r1 = r1.f11007a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x0051
        L_0x006a:
            r5.i()
            return
        L_0x006e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0014 }
            java.lang.String r1 = "Already have resource"
            r0.<init>(r1)     // Catch:{ all -> 0x0014 }
            throw r0     // Catch:{ all -> 0x0014 }
        L_0x0076:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0014 }
            java.lang.String r1 = "Received a resource without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x0014 }
            throw r0     // Catch:{ all -> 0x0014 }
        L_0x007e:
            monitor-exit(r5)     // Catch:{ all -> 0x0014 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.j.o():void");
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.f10996p;
    }

    /* access modifiers changed from: package-private */
    public synchronized void r(f fVar) {
        try {
            this.f10982b.c();
            this.f10981a.e(fVar);
            if (this.f10981a.isEmpty()) {
                h();
                if (!this.f10999w) {
                    if (this.f11001y) {
                    }
                }
                if (this.f10991k.get() == 0) {
                    q();
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public synchronized void s(DecodeJob decodeJob) {
        C0481a aVar;
        try {
            this.f10978A = decodeJob;
            if (decodeJob.D()) {
                aVar = this.f10987g;
            } else {
                aVar = j();
            }
            aVar.execute(decodeJob);
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    j(C0481a aVar, C0481a aVar2, C0481a aVar3, C0481a aVar4, k kVar, n.a aVar5, androidx.core.util.d dVar, c cVar) {
        this.f10981a = new e();
        this.f10982b = C0866c.a();
        this.f10991k = new AtomicInteger();
        this.f10987g = aVar;
        this.f10988h = aVar2;
        this.f10989i = aVar3;
        this.f10990j = aVar4;
        this.f10986f = kVar;
        this.f10983c = aVar5;
        this.f10984d = dVar;
        this.f10985e = cVar;
    }
}
