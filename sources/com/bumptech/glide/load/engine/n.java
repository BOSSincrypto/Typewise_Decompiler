package com.bumptech.glide.load.engine;

import X0.b;
import p1.k;

class n implements s {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f11019a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f11020b;

    /* renamed from: c  reason: collision with root package name */
    private final s f11021c;

    /* renamed from: d  reason: collision with root package name */
    private final a f11022d;

    /* renamed from: e  reason: collision with root package name */
    private final b f11023e;

    /* renamed from: f  reason: collision with root package name */
    private int f11024f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f11025g;

    interface a {
        void b(b bVar, n nVar);
    }

    n(s sVar, boolean z3, boolean z4, b bVar, a aVar) {
        this.f11021c = (s) k.d(sVar);
        this.f11019a = z3;
        this.f11020b = z4;
        this.f11023e = bVar;
        this.f11022d = (a) k.d(aVar);
    }

    public int a() {
        return this.f11021c.a();
    }

    /* access modifiers changed from: package-private */
    public synchronized void b() {
        if (!this.f11025g) {
            this.f11024f++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    public Class c() {
        return this.f11021c.c();
    }

    public synchronized void d() {
        if (this.f11024f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f11025g) {
            this.f11025g = true;
            if (this.f11020b) {
                this.f11021c.d();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    /* access modifiers changed from: package-private */
    public s e() {
        return this.f11021c;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.f11019a;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        boolean z3;
        synchronized (this) {
            int i4 = this.f11024f;
            if (i4 > 0) {
                z3 = true;
                int i5 = i4 - 1;
                this.f11024f = i5;
                if (i5 != 0) {
                    z3 = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z3) {
            this.f11022d.b(this.f11023e, this);
        }
    }

    public Object get() {
        return this.f11021c.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f11019a + ", listener=" + this.f11022d + ", key=" + this.f11023e + ", acquired=" + this.f11024f + ", isRecycled=" + this.f11025g + ", resource=" + this.f11021c + '}';
    }
}
