package com.bumptech.glide.load.engine;

import a1.C0355a;
import a1.C0356b;
import a1.h;
import android.util.Log;
import b1.C0481a;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.n;
import com.bumptech.glide.request.f;
import java.util.Map;
import java.util.concurrent.Executor;
import p1.g;
import p1.k;
import q1.C0864a;

public class i implements k, h.a, n.a {

    /* renamed from: i  reason: collision with root package name */
    private static final boolean f10951i = Log.isLoggable("Engine", 2);

    /* renamed from: a  reason: collision with root package name */
    private final p f10952a;

    /* renamed from: b  reason: collision with root package name */
    private final m f10953b;

    /* renamed from: c  reason: collision with root package name */
    private final h f10954c;

    /* renamed from: d  reason: collision with root package name */
    private final b f10955d;

    /* renamed from: e  reason: collision with root package name */
    private final v f10956e;

    /* renamed from: f  reason: collision with root package name */
    private final c f10957f;

    /* renamed from: g  reason: collision with root package name */
    private final a f10958g;

    /* renamed from: h  reason: collision with root package name */
    private final a f10959h;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        final DecodeJob.e f10960a;

        /* renamed from: b  reason: collision with root package name */
        final androidx.core.util.d f10961b = C0864a.d(150, new C0163a());

        /* renamed from: c  reason: collision with root package name */
        private int f10962c;

        /* renamed from: com.bumptech.glide.load.engine.i$a$a  reason: collision with other inner class name */
        class C0163a implements C0864a.d {
            C0163a() {
            }

            /* renamed from: b */
            public DecodeJob a() {
                a aVar = a.this;
                return new DecodeJob(aVar.f10960a, aVar.f10961b);
            }
        }

        a(DecodeJob.e eVar) {
            this.f10960a = eVar;
        }

        /* access modifiers changed from: package-private */
        public DecodeJob a(com.bumptech.glide.d dVar, Object obj, l lVar, X0.b bVar, int i4, int i5, Class cls, Class cls2, Priority priority, h hVar, Map map, boolean z3, boolean z4, boolean z5, X0.d dVar2, DecodeJob.b bVar2) {
            DecodeJob decodeJob = (DecodeJob) k.d((DecodeJob) this.f10961b.b());
            int i6 = this.f10962c;
            int i7 = i6;
            this.f10962c = i6 + 1;
            return decodeJob.n(dVar, obj, lVar, bVar, i4, i5, cls, cls2, priority, hVar, map, z3, z4, z5, dVar2, bVar2, i7);
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        final C0481a f10964a;

        /* renamed from: b  reason: collision with root package name */
        final C0481a f10965b;

        /* renamed from: c  reason: collision with root package name */
        final C0481a f10966c;

        /* renamed from: d  reason: collision with root package name */
        final C0481a f10967d;

        /* renamed from: e  reason: collision with root package name */
        final k f10968e;

        /* renamed from: f  reason: collision with root package name */
        final n.a f10969f;

        /* renamed from: g  reason: collision with root package name */
        final androidx.core.util.d f10970g = C0864a.d(150, new a());

        class a implements C0864a.d {
            a() {
            }

            /* renamed from: b */
            public j a() {
                b bVar = b.this;
                return new j(bVar.f10964a, bVar.f10965b, bVar.f10966c, bVar.f10967d, bVar.f10968e, bVar.f10969f, bVar.f10970g);
            }
        }

        b(C0481a aVar, C0481a aVar2, C0481a aVar3, C0481a aVar4, k kVar, n.a aVar5) {
            this.f10964a = aVar;
            this.f10965b = aVar2;
            this.f10966c = aVar3;
            this.f10967d = aVar4;
            this.f10968e = kVar;
            this.f10969f = aVar5;
        }

        /* access modifiers changed from: package-private */
        public j a(X0.b bVar, boolean z3, boolean z4, boolean z5, boolean z6) {
            return ((j) k.d((j) this.f10970g.b())).l(bVar, z3, z4, z5, z6);
        }
    }

    private static class c implements DecodeJob.e {

        /* renamed from: a  reason: collision with root package name */
        private final C0355a.C0044a f10972a;

        /* renamed from: b  reason: collision with root package name */
        private volatile C0355a f10973b;

        c(C0355a.C0044a aVar) {
            this.f10972a = aVar;
        }

        public C0355a a() {
            if (this.f10973b == null) {
                synchronized (this) {
                    try {
                        if (this.f10973b == null) {
                            this.f10973b = this.f10972a.a();
                        }
                        if (this.f10973b == null) {
                            this.f10973b = new C0356b();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f10973b;
        }
    }

    public class d {

        /* renamed from: a  reason: collision with root package name */
        private final j f10974a;

        /* renamed from: b  reason: collision with root package name */
        private final f f10975b;

        d(f fVar, j jVar) {
            this.f10975b = fVar;
            this.f10974a = jVar;
        }

        public void a() {
            synchronized (i.this) {
                this.f10974a.r(this.f10975b);
            }
        }
    }

    public i(h hVar, C0355a.C0044a aVar, C0481a aVar2, C0481a aVar3, C0481a aVar4, C0481a aVar5, boolean z3) {
        this(hVar, aVar, aVar2, aVar3, aVar4, aVar5, (p) null, (m) null, (a) null, (b) null, (a) null, (v) null, z3);
    }

    private n e(X0.b bVar) {
        s d4 = this.f10954c.d(bVar);
        if (d4 == null) {
            return null;
        }
        if (d4 instanceof n) {
            return (n) d4;
        }
        return new n(d4, true, true, bVar, this);
    }

    private n g(X0.b bVar) {
        n e4 = this.f10959h.e(bVar);
        if (e4 != null) {
            e4.b();
        }
        return e4;
    }

    private n h(X0.b bVar) {
        n e4 = e(bVar);
        if (e4 != null) {
            e4.b();
            this.f10959h.a(bVar, e4);
        }
        return e4;
    }

    private n i(l lVar, boolean z3, long j4) {
        if (!z3) {
            return null;
        }
        n g4 = g(lVar);
        if (g4 != null) {
            if (f10951i) {
                j("Loaded resource from active resources", j4, lVar);
            }
            return g4;
        }
        n h4 = h(lVar);
        if (h4 == null) {
            return null;
        }
        if (f10951i) {
            j("Loaded resource from cache", j4, lVar);
        }
        return h4;
    }

    private static void j(String str, long j4, X0.b bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(g.a(j4));
        sb.append("ms, key: ");
        sb.append(bVar);
    }

    private d l(com.bumptech.glide.d dVar, Object obj, X0.b bVar, int i4, int i5, Class cls, Class cls2, Priority priority, h hVar, Map map, boolean z3, boolean z4, X0.d dVar2, boolean z5, boolean z6, boolean z7, boolean z8, f fVar, Executor executor, l lVar, long j4) {
        f fVar2 = fVar;
        Executor executor2 = executor;
        l lVar2 = lVar;
        long j5 = j4;
        j a4 = this.f10952a.a(lVar2, z8);
        if (a4 != null) {
            a4.e(fVar2, executor2);
            if (f10951i) {
                j("Added to existing load", j5, lVar2);
            }
            return new d(fVar2, a4);
        }
        j a5 = this.f10955d.a(lVar, z5, z6, z7, z8);
        j jVar = a5;
        l lVar3 = lVar2;
        DecodeJob a6 = this.f10958g.a(dVar, obj, lVar, bVar, i4, i5, cls, cls2, priority, hVar, map, z3, z4, z8, dVar2, a5);
        this.f10952a.c(lVar3, jVar);
        j jVar2 = jVar;
        l lVar4 = lVar3;
        f fVar3 = fVar;
        jVar2.e(fVar3, executor);
        jVar2.s(a6);
        if (f10951i) {
            j("Started new load", j4, lVar4);
        }
        return new d(fVar3, jVar2);
    }

    public void a(s sVar) {
        this.f10956e.a(sVar, true);
    }

    public void b(X0.b bVar, n nVar) {
        this.f10959h.d(bVar);
        if (nVar.f()) {
            this.f10954c.c(bVar, nVar);
        } else {
            this.f10956e.a(nVar, false);
        }
    }

    public synchronized void c(j jVar, X0.b bVar) {
        this.f10952a.d(bVar, jVar);
    }

    public synchronized void d(j jVar, X0.b bVar, n nVar) {
        if (nVar != null) {
            try {
                if (nVar.f()) {
                    this.f10959h.a(bVar, nVar);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.f10952a.d(bVar, jVar);
    }

    public d f(com.bumptech.glide.d dVar, Object obj, X0.b bVar, int i4, int i5, Class cls, Class cls2, Priority priority, h hVar, Map map, boolean z3, boolean z4, X0.d dVar2, boolean z5, boolean z6, boolean z7, boolean z8, f fVar, Executor executor) {
        long b4 = f10951i ? g.b() : 0;
        l a4 = this.f10953b.a(obj, bVar, i4, i5, map, cls, cls2, dVar2);
        synchronized (this) {
            try {
                n i6 = i(a4, z5, b4);
                if (i6 == null) {
                    d l4 = l(dVar, obj, bVar, i4, i5, cls, cls2, priority, hVar, map, z3, z4, dVar2, z5, z6, z7, z8, fVar, executor, a4, b4);
                    return l4;
                }
                fVar.c(i6, DataSource.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public void k(s sVar) {
        if (sVar instanceof n) {
            ((n) sVar).g();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    i(h hVar, C0355a.C0044a aVar, C0481a aVar2, C0481a aVar3, C0481a aVar4, C0481a aVar5, p pVar, m mVar, a aVar6, b bVar, a aVar7, v vVar, boolean z3) {
        this.f10954c = hVar;
        C0355a.C0044a aVar8 = aVar;
        c cVar = new c(aVar);
        this.f10957f = cVar;
        a aVar9 = aVar6 == null ? new a(z3) : aVar6;
        this.f10959h = aVar9;
        aVar9.f(this);
        this.f10953b = mVar == null ? new m() : mVar;
        this.f10952a = pVar == null ? new p() : pVar;
        this.f10955d = bVar == null ? new b(aVar2, aVar3, aVar4, aVar5, this, this) : bVar;
        this.f10958g = aVar7 == null ? new a(cVar) : aVar7;
        this.f10956e = vVar == null ? new v() : vVar;
        hVar.e(this);
    }
}
