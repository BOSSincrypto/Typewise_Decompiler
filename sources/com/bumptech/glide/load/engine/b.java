package com.bumptech.glide.load.engine;

import c1.n;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.e;
import java.io.File;
import java.util.List;
import q1.C0865b;

class b implements e, d.a {

    /* renamed from: a  reason: collision with root package name */
    private final List f10909a;

    /* renamed from: b  reason: collision with root package name */
    private final f f10910b;

    /* renamed from: c  reason: collision with root package name */
    private final e.a f10911c;

    /* renamed from: d  reason: collision with root package name */
    private int f10912d;

    /* renamed from: e  reason: collision with root package name */
    private X0.b f10913e;

    /* renamed from: f  reason: collision with root package name */
    private List f10914f;

    /* renamed from: g  reason: collision with root package name */
    private int f10915g;

    /* renamed from: h  reason: collision with root package name */
    private volatile n.a f10916h;

    /* renamed from: i  reason: collision with root package name */
    private File f10917i;

    b(f fVar, e.a aVar) {
        this(fVar.c(), fVar, aVar);
    }

    private boolean a() {
        if (this.f10915g < this.f10914f.size()) {
            return true;
        }
        return false;
    }

    public boolean b() {
        C0865b.a("DataCacheGenerator.startNext");
        while (true) {
            try {
                boolean z3 = false;
                if (this.f10914f != null) {
                    if (a()) {
                        this.f10916h = null;
                        while (!z3 && a()) {
                            List list = this.f10914f;
                            int i4 = this.f10915g;
                            this.f10915g = i4 + 1;
                            this.f10916h = ((n) list.get(i4)).a(this.f10917i, this.f10910b.t(), this.f10910b.f(), this.f10910b.k());
                            if (this.f10916h != null && this.f10910b.u(this.f10916h.f7579c.a())) {
                                this.f10916h.f7579c.f(this.f10910b.l(), this);
                                z3 = true;
                            }
                        }
                        C0865b.e();
                        return z3;
                    }
                }
                int i5 = this.f10912d + 1;
                this.f10912d = i5;
                if (i5 >= this.f10909a.size()) {
                    return false;
                }
                X0.b bVar = (X0.b) this.f10909a.get(this.f10912d);
                File b4 = this.f10910b.d().b(new c(bVar, this.f10910b.p()));
                this.f10917i = b4;
                if (b4 != null) {
                    this.f10913e = bVar;
                    this.f10914f = this.f10910b.j(b4);
                    this.f10915g = 0;
                }
            } finally {
                C0865b.e();
            }
        }
    }

    public void c(Exception exc) {
        this.f10911c.d(this.f10913e, exc, this.f10916h.f7579c, DataSource.DATA_DISK_CACHE);
    }

    public void cancel() {
        n.a aVar = this.f10916h;
        if (aVar != null) {
            aVar.f7579c.cancel();
        }
    }

    public void d(Object obj) {
        this.f10911c.c(this.f10913e, obj, this.f10916h.f7579c, DataSource.DATA_DISK_CACHE, this.f10913e);
    }

    b(List list, f fVar, e.a aVar) {
        this.f10912d = -1;
        this.f10909a = list;
        this.f10910b = fVar;
        this.f10911c = aVar;
    }
}
