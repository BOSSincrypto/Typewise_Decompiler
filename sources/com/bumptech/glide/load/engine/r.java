package com.bumptech.glide.load.engine;

import androidx.core.util.d;
import p1.k;
import q1.C0864a;
import q1.C0866c;

final class r implements s, C0864a.f {

    /* renamed from: e  reason: collision with root package name */
    private static final d f11032e = C0864a.d(20, new a());

    /* renamed from: a  reason: collision with root package name */
    private final C0866c f11033a = C0866c.a();

    /* renamed from: b  reason: collision with root package name */
    private s f11034b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11035c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f11036d;

    class a implements C0864a.d {
        a() {
        }

        /* renamed from: b */
        public r a() {
            return new r();
        }
    }

    r() {
    }

    private void e(s sVar) {
        this.f11036d = false;
        this.f11035c = true;
        this.f11034b = sVar;
    }

    static r f(s sVar) {
        r rVar = (r) k.d((r) f11032e.b());
        rVar.e(sVar);
        return rVar;
    }

    private void g() {
        this.f11034b = null;
        f11032e.a(this);
    }

    public int a() {
        return this.f11034b.a();
    }

    public C0866c b() {
        return this.f11033a;
    }

    public Class c() {
        return this.f11034b.c();
    }

    public synchronized void d() {
        this.f11033a.c();
        this.f11036d = true;
        if (!this.f11035c) {
            this.f11034b.d();
            g();
        }
    }

    public Object get() {
        return this.f11034b.get();
    }

    /* access modifiers changed from: package-private */
    public synchronized void h() {
        this.f11033a.c();
        if (this.f11035c) {
            this.f11035c = false;
            if (this.f11036d) {
                d();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }
}
