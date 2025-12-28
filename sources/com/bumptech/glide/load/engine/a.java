package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.engine.n;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p1.k;

final class a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f10897a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f10898b;

    /* renamed from: c  reason: collision with root package name */
    final Map f10899c;

    /* renamed from: d  reason: collision with root package name */
    private final ReferenceQueue f10900d;

    /* renamed from: e  reason: collision with root package name */
    private n.a f10901e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f10902f;

    /* renamed from: com.bumptech.glide.load.engine.a$a  reason: collision with other inner class name */
    class C0161a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.a$a$a  reason: collision with other inner class name */
        class C0162a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Runnable f10903a;

            C0162a(Runnable runnable) {
                this.f10903a = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.f10903a.run();
            }
        }

        C0161a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(new C0162a(runnable), "glide-active-resources");
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            a.this.b();
        }
    }

    static final class c extends WeakReference {

        /* renamed from: a  reason: collision with root package name */
        final X0.b f10906a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f10907b;

        /* renamed from: c  reason: collision with root package name */
        s f10908c;

        c(X0.b bVar, n nVar, ReferenceQueue referenceQueue, boolean z3) {
            super(nVar, referenceQueue);
            s sVar;
            this.f10906a = (X0.b) k.d(bVar);
            if (!nVar.f() || !z3) {
                sVar = null;
            } else {
                sVar = (s) k.d(nVar.e());
            }
            this.f10908c = sVar;
            this.f10907b = nVar.f();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f10908c = null;
            clear();
        }
    }

    a(boolean z3) {
        this(z3, Executors.newSingleThreadExecutor(new C0161a()));
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(X0.b bVar, n nVar) {
        c cVar = (c) this.f10899c.put(bVar, new c(bVar, nVar, this.f10900d, this.f10897a));
        if (cVar != null) {
            cVar.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        while (!this.f10902f) {
            try {
                c((c) this.f10900d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(c cVar) {
        synchronized (this) {
            this.f10899c.remove(cVar.f10906a);
            if (cVar.f10907b) {
                s sVar = cVar.f10908c;
                if (sVar != null) {
                    this.f10901e.b(cVar.f10906a, new n(sVar, true, false, cVar.f10906a, this.f10901e));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void d(X0.b bVar) {
        c cVar = (c) this.f10899c.remove(bVar);
        if (cVar != null) {
            cVar.a();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.bumptech.glide.load.engine.n e(X0.b r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.f10899c     // Catch:{ all -> 0x001a }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001a }
            com.bumptech.glide.load.engine.a$c r2 = (com.bumptech.glide.load.engine.a.c) r2     // Catch:{ all -> 0x001a }
            if (r2 != 0) goto L_0x000e
            monitor-exit(r1)
            r2 = 0
            return r2
        L_0x000e:
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x001a }
            com.bumptech.glide.load.engine.n r0 = (com.bumptech.glide.load.engine.n) r0     // Catch:{ all -> 0x001a }
            if (r0 != 0) goto L_0x001c
            r1.c(r2)     // Catch:{ all -> 0x001a }
            goto L_0x001c
        L_0x001a:
            r2 = move-exception
            goto L_0x001e
        L_0x001c:
            monitor-exit(r1)
            return r0
        L_0x001e:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.a.e(X0.b):com.bumptech.glide.load.engine.n");
    }

    /* access modifiers changed from: package-private */
    public void f(n.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f10901e = aVar;
            }
        }
    }

    a(boolean z3, Executor executor) {
        this.f10899c = new HashMap();
        this.f10900d = new ReferenceQueue();
        this.f10897a = z3;
        this.f10898b = executor;
        executor.execute(new b());
    }
}
