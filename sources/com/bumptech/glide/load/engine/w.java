package com.bumptech.glide.load.engine;

import X0.b;
import android.util.Log;
import c1.n;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.e;
import java.io.IOException;
import java.util.List;

class w implements e, e.a {

    /* renamed from: a  reason: collision with root package name */
    private final f f11058a;

    /* renamed from: b  reason: collision with root package name */
    private final e.a f11059b;

    /* renamed from: c  reason: collision with root package name */
    private volatile int f11060c;

    /* renamed from: d  reason: collision with root package name */
    private volatile b f11061d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Object f11062e;

    /* renamed from: f  reason: collision with root package name */
    private volatile n.a f11063f;

    /* renamed from: g  reason: collision with root package name */
    private volatile c f11064g;

    class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n.a f11065a;

        a(n.a aVar) {
            this.f11065a = aVar;
        }

        public void c(Exception exc) {
            if (w.this.g(this.f11065a)) {
                w.this.i(this.f11065a, exc);
            }
        }

        public void d(Object obj) {
            if (w.this.g(this.f11065a)) {
                w.this.h(this.f11065a, obj);
            }
        }
    }

    w(f fVar, e.a aVar) {
        this.f11058a = fVar;
        this.f11059b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean e(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r0 = "SourceGenerator"
            long r1 = p1.g.b()
            r3 = 0
            com.bumptech.glide.load.engine.f r4 = r11.f11058a     // Catch:{ all -> 0x006b }
            com.bumptech.glide.load.data.e r4 = r4.o(r12)     // Catch:{ all -> 0x006b }
            java.lang.Object r5 = r4.a()     // Catch:{ all -> 0x006b }
            com.bumptech.glide.load.engine.f r6 = r11.f11058a     // Catch:{ all -> 0x006b }
            X0.a r6 = r6.q(r5)     // Catch:{ all -> 0x006b }
            com.bumptech.glide.load.engine.d r7 = new com.bumptech.glide.load.engine.d     // Catch:{ all -> 0x006b }
            com.bumptech.glide.load.engine.f r8 = r11.f11058a     // Catch:{ all -> 0x006b }
            X0.d r8 = r8.k()     // Catch:{ all -> 0x006b }
            r7.<init>(r6, r5, r8)     // Catch:{ all -> 0x006b }
            com.bumptech.glide.load.engine.c r5 = new com.bumptech.glide.load.engine.c     // Catch:{ all -> 0x006b }
            c1.n$a r8 = r11.f11063f     // Catch:{ all -> 0x006b }
            X0.b r8 = r8.f7577a     // Catch:{ all -> 0x006b }
            com.bumptech.glide.load.engine.f r9 = r11.f11058a     // Catch:{ all -> 0x006b }
            X0.b r9 = r9.p()     // Catch:{ all -> 0x006b }
            r5.<init>(r8, r9)     // Catch:{ all -> 0x006b }
            com.bumptech.glide.load.engine.f r8 = r11.f11058a     // Catch:{ all -> 0x006b }
            a1.a r8 = r8.d()     // Catch:{ all -> 0x006b }
            r8.a(r5, r7)     // Catch:{ all -> 0x006b }
            r7 = 2
            boolean r7 = android.util.Log.isLoggable(r0, r7)     // Catch:{ all -> 0x006b }
            java.lang.String r9 = ", data: "
            if (r7 == 0) goto L_0x006d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x006b }
            r7.<init>()     // Catch:{ all -> 0x006b }
            java.lang.String r10 = "Finished encoding source to cache, key: "
            r7.append(r10)     // Catch:{ all -> 0x006b }
            r7.append(r5)     // Catch:{ all -> 0x006b }
            r7.append(r9)     // Catch:{ all -> 0x006b }
            r7.append(r12)     // Catch:{ all -> 0x006b }
            java.lang.String r10 = ", encoder: "
            r7.append(r10)     // Catch:{ all -> 0x006b }
            r7.append(r6)     // Catch:{ all -> 0x006b }
            java.lang.String r6 = ", duration: "
            r7.append(r6)     // Catch:{ all -> 0x006b }
            double r1 = p1.g.a(r1)     // Catch:{ all -> 0x006b }
            r7.append(r1)     // Catch:{ all -> 0x006b }
            goto L_0x006d
        L_0x006b:
            r12 = move-exception
            goto L_0x00d1
        L_0x006d:
            java.io.File r1 = r8.b(r5)     // Catch:{ all -> 0x006b }
            r2 = 1
            if (r1 == 0) goto L_0x008f
            r11.f11064g = r5     // Catch:{ all -> 0x006b }
            com.bumptech.glide.load.engine.b r12 = new com.bumptech.glide.load.engine.b     // Catch:{ all -> 0x006b }
            c1.n$a r0 = r11.f11063f     // Catch:{ all -> 0x006b }
            X0.b r0 = r0.f7577a     // Catch:{ all -> 0x006b }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x006b }
            com.bumptech.glide.load.engine.f r1 = r11.f11058a     // Catch:{ all -> 0x006b }
            r12.<init>(r0, r1, r11)     // Catch:{ all -> 0x006b }
            r11.f11061d = r12     // Catch:{ all -> 0x006b }
            c1.n$a r12 = r11.f11063f
            com.bumptech.glide.load.data.d r12 = r12.f7579c
            r12.b()
            return r2
        L_0x008f:
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x00b0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x006b }
            r0.<init>()     // Catch:{ all -> 0x006b }
            java.lang.String r1 = "Attempt to write: "
            r0.append(r1)     // Catch:{ all -> 0x006b }
            com.bumptech.glide.load.engine.c r1 = r11.f11064g     // Catch:{ all -> 0x006b }
            r0.append(r1)     // Catch:{ all -> 0x006b }
            r0.append(r9)     // Catch:{ all -> 0x006b }
            r0.append(r12)     // Catch:{ all -> 0x006b }
            java.lang.String r12 = " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly..."
            r0.append(r12)     // Catch:{ all -> 0x006b }
        L_0x00b0:
            com.bumptech.glide.load.engine.e$a r12 = r11.f11059b     // Catch:{ all -> 0x00cf }
            c1.n$a r0 = r11.f11063f     // Catch:{ all -> 0x00cf }
            X0.b r5 = r0.f7577a     // Catch:{ all -> 0x00cf }
            java.lang.Object r6 = r4.a()     // Catch:{ all -> 0x00cf }
            c1.n$a r0 = r11.f11063f     // Catch:{ all -> 0x00cf }
            com.bumptech.glide.load.data.d r7 = r0.f7579c     // Catch:{ all -> 0x00cf }
            c1.n$a r0 = r11.f11063f     // Catch:{ all -> 0x00cf }
            com.bumptech.glide.load.data.d r0 = r0.f7579c     // Catch:{ all -> 0x00cf }
            com.bumptech.glide.load.DataSource r8 = r0.e()     // Catch:{ all -> 0x00cf }
            c1.n$a r0 = r11.f11063f     // Catch:{ all -> 0x00cf }
            X0.b r9 = r0.f7577a     // Catch:{ all -> 0x00cf }
            r4 = r12
            r4.c(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00cf }
            return r3
        L_0x00cf:
            r12 = move-exception
            r3 = r2
        L_0x00d1:
            if (r3 != 0) goto L_0x00da
            c1.n$a r0 = r11.f11063f
            com.bumptech.glide.load.data.d r0 = r0.f7579c
            r0.b()
        L_0x00da:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.w.e(java.lang.Object):boolean");
    }

    private boolean f() {
        if (this.f11060c < this.f11058a.g().size()) {
            return true;
        }
        return false;
    }

    private void j(n.a aVar) {
        this.f11063f.f7579c.f(this.f11058a.l(), new a(aVar));
    }

    public void a() {
        throw new UnsupportedOperationException();
    }

    public boolean b() {
        if (this.f11062e != null) {
            Object obj = this.f11062e;
            this.f11062e = null;
            try {
                if (!e(obj)) {
                    return true;
                }
            } catch (IOException unused) {
                Log.isLoggable("SourceGenerator", 3);
            }
        }
        if (this.f11061d != null && this.f11061d.b()) {
            return true;
        }
        this.f11061d = null;
        this.f11063f = null;
        boolean z3 = false;
        while (!z3 && f()) {
            List g4 = this.f11058a.g();
            int i4 = this.f11060c;
            this.f11060c = i4 + 1;
            this.f11063f = (n.a) g4.get(i4);
            if (this.f11063f != null && (this.f11058a.e().c(this.f11063f.f7579c.e()) || this.f11058a.u(this.f11063f.f7579c.a()))) {
                j(this.f11063f);
                z3 = true;
            }
        }
        return z3;
    }

    public void c(b bVar, Object obj, d dVar, DataSource dataSource, b bVar2) {
        this.f11059b.c(bVar, obj, dVar, this.f11063f.f7579c.e(), bVar);
    }

    public void cancel() {
        n.a aVar = this.f11063f;
        if (aVar != null) {
            aVar.f7579c.cancel();
        }
    }

    public void d(b bVar, Exception exc, d dVar, DataSource dataSource) {
        this.f11059b.d(bVar, exc, dVar, this.f11063f.f7579c.e());
    }

    /* access modifiers changed from: package-private */
    public boolean g(n.a aVar) {
        n.a aVar2 = this.f11063f;
        if (aVar2 == null || aVar2 != aVar) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void h(n.a aVar, Object obj) {
        h e4 = this.f11058a.e();
        if (obj == null || !e4.c(aVar.f7579c.e())) {
            e.a aVar2 = this.f11059b;
            b bVar = aVar.f7577a;
            d dVar = aVar.f7579c;
            aVar2.c(bVar, obj, dVar, dVar.e(), this.f11064g);
            return;
        }
        this.f11062e = obj;
        this.f11059b.a();
    }

    /* access modifiers changed from: package-private */
    public void i(n.a aVar, Exception exc) {
        e.a aVar2 = this.f11059b;
        c cVar = this.f11064g;
        d dVar = aVar.f7579c;
        aVar2.d(cVar, exc, dVar, dVar.e());
    }
}
