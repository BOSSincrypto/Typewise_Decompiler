package com.bumptech.glide.load.engine;

import X0.b;
import c1.n;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.e;
import java.io.File;
import java.util.List;
import q1.C0865b;

class t implements e, d.a {

    /* renamed from: a  reason: collision with root package name */
    private final e.a f11037a;

    /* renamed from: b  reason: collision with root package name */
    private final f f11038b;

    /* renamed from: c  reason: collision with root package name */
    private int f11039c;

    /* renamed from: d  reason: collision with root package name */
    private int f11040d = -1;

    /* renamed from: e  reason: collision with root package name */
    private b f11041e;

    /* renamed from: f  reason: collision with root package name */
    private List f11042f;

    /* renamed from: g  reason: collision with root package name */
    private int f11043g;

    /* renamed from: h  reason: collision with root package name */
    private volatile n.a f11044h;

    /* renamed from: i  reason: collision with root package name */
    private File f11045i;

    /* renamed from: j  reason: collision with root package name */
    private u f11046j;

    t(f fVar, e.a aVar) {
        this.f11038b = fVar;
        this.f11037a = aVar;
    }

    private boolean a() {
        if (this.f11043g < this.f11042f.size()) {
            return true;
        }
        return false;
    }

    public boolean b() {
        C0865b.a("ResourceCacheGenerator.startNext");
        try {
            List c4 = this.f11038b.c();
            boolean z3 = false;
            if (c4.isEmpty()) {
                C0865b.e();
                return false;
            }
            List m4 = this.f11038b.m();
            if (!m4.isEmpty()) {
                while (true) {
                    if (this.f11042f != null) {
                        if (a()) {
                            this.f11044h = null;
                            while (!z3 && a()) {
                                List list = this.f11042f;
                                int i4 = this.f11043g;
                                this.f11043g = i4 + 1;
                                this.f11044h = ((n) list.get(i4)).a(this.f11045i, this.f11038b.t(), this.f11038b.f(), this.f11038b.k());
                                if (this.f11044h != null && this.f11038b.u(this.f11044h.f7579c.a())) {
                                    this.f11044h.f7579c.f(this.f11038b.l(), this);
                                    z3 = true;
                                }
                            }
                            C0865b.e();
                            return z3;
                        }
                    }
                    int i5 = this.f11040d + 1;
                    this.f11040d = i5;
                    if (i5 >= m4.size()) {
                        int i6 = this.f11039c + 1;
                        this.f11039c = i6;
                        if (i6 >= c4.size()) {
                            C0865b.e();
                            return false;
                        }
                        this.f11040d = 0;
                    }
                    b bVar = (b) c4.get(this.f11039c);
                    Class cls = (Class) m4.get(this.f11040d);
                    this.f11046j = new u(this.f11038b.b(), bVar, this.f11038b.p(), this.f11038b.t(), this.f11038b.f(), this.f11038b.s(cls), cls, this.f11038b.k());
                    File b4 = this.f11038b.d().b(this.f11046j);
                    this.f11045i = b4;
                    if (b4 != null) {
                        this.f11041e = bVar;
                        this.f11042f = this.f11038b.j(b4);
                        this.f11043g = 0;
                    }
                }
            } else if (File.class.equals(this.f11038b.r())) {
                C0865b.e();
                return false;
            } else {
                throw new IllegalStateException("Failed to find any load path from " + this.f11038b.i() + " to " + this.f11038b.r());
            }
        } catch (Throwable th) {
            C0865b.e();
            throw th;
        }
    }

    public void c(Exception exc) {
        this.f11037a.d(this.f11046j, exc, this.f11044h.f7579c, DataSource.RESOURCE_DISK_CACHE);
    }

    public void cancel() {
        n.a aVar = this.f11044h;
        if (aVar != null) {
            aVar.f7579c.cancel();
        }
    }

    public void d(Object obj) {
        this.f11037a.c(this.f11041e, obj, this.f11044h.f7579c, DataSource.RESOURCE_DISK_CACHE, this.f11046j);
    }
}
