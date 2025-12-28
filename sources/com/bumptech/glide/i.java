package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.manager.c;
import com.bumptech.glide.manager.d;
import com.bumptech.glide.manager.l;
import com.bumptech.glide.manager.m;
import com.bumptech.glide.manager.s;
import com.bumptech.glide.manager.t;
import com.bumptech.glide.manager.w;
import com.bumptech.glide.request.e;
import i1.c;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class i implements ComponentCallbacks2, m {

    /* renamed from: l  reason: collision with root package name */
    private static final e f10786l = ((e) e.i0(Bitmap.class).O());

    /* renamed from: m  reason: collision with root package name */
    private static final e f10787m = ((e) e.i0(c.class).O());

    /* renamed from: n  reason: collision with root package name */
    private static final e f10788n = ((e) ((e) e.j0(h.f10948c).V(Priority.LOW)).c0(true));

    /* renamed from: a  reason: collision with root package name */
    protected final b f10789a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f10790b;

    /* renamed from: c  reason: collision with root package name */
    final l f10791c;

    /* renamed from: d  reason: collision with root package name */
    private final t f10792d;

    /* renamed from: e  reason: collision with root package name */
    private final s f10793e;

    /* renamed from: f  reason: collision with root package name */
    private final w f10794f;

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f10795g;

    /* renamed from: h  reason: collision with root package name */
    private final com.bumptech.glide.manager.c f10796h;

    /* renamed from: i  reason: collision with root package name */
    private final CopyOnWriteArrayList f10797i;

    /* renamed from: j  reason: collision with root package name */
    private e f10798j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f10799k;

    class a implements Runnable {
        a() {
        }

        public void run() {
            i iVar = i.this;
            iVar.f10791c.e(iVar);
        }
    }

    private class b implements c.a {

        /* renamed from: a  reason: collision with root package name */
        private final t f10801a;

        b(t tVar) {
            this.f10801a = tVar;
        }

        public void a(boolean z3) {
            if (z3) {
                synchronized (i.this) {
                    this.f10801a.e();
                }
            }
        }
    }

    public i(b bVar, l lVar, s sVar, Context context) {
        this(bVar, lVar, sVar, new t(), bVar.g(), context);
    }

    private void A(m1.h hVar) {
        boolean z3 = z(hVar);
        com.bumptech.glide.request.c i4 = hVar.i();
        if (!z3 && !this.f10789a.p(hVar) && i4 != null) {
            hVar.k((com.bumptech.glide.request.c) null);
            i4.clear();
        }
    }

    public synchronized void a() {
        w();
        this.f10794f.a();
    }

    public synchronized void c() {
        v();
        this.f10794f.c();
    }

    public synchronized void e() {
        try {
            this.f10794f.e();
            for (m1.h o4 : this.f10794f.m()) {
                o(o4);
            }
            this.f10794f.l();
            this.f10792d.b();
            this.f10791c.f(this);
            this.f10791c.f(this.f10796h);
            p1.l.u(this.f10795g);
            this.f10789a.s(this);
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public h l(Class cls) {
        return new h(this.f10789a, this, cls, this.f10790b);
    }

    public h m() {
        return l(Bitmap.class).b(f10786l);
    }

    public h n() {
        return l(Drawable.class);
    }

    public void o(m1.h hVar) {
        if (hVar != null) {
            A(hVar);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i4) {
        if (i4 == 60 && this.f10799k) {
            u();
        }
    }

    /* access modifiers changed from: package-private */
    public List p() {
        return this.f10797i;
    }

    /* access modifiers changed from: package-private */
    public synchronized e q() {
        return this.f10798j;
    }

    /* access modifiers changed from: package-private */
    public j r(Class cls) {
        return this.f10789a.i().e(cls);
    }

    public h s(String str) {
        return n().w0(str);
    }

    public synchronized void t() {
        this.f10792d.c();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f10792d + ", treeNode=" + this.f10793e + "}";
    }

    public synchronized void u() {
        t();
        for (i t4 : this.f10793e.a()) {
            t4.t();
        }
    }

    public synchronized void v() {
        this.f10792d.d();
    }

    public synchronized void w() {
        this.f10792d.f();
    }

    /* access modifiers changed from: protected */
    public synchronized void x(e eVar) {
        this.f10798j = (e) ((e) eVar.clone()).c();
    }

    /* access modifiers changed from: package-private */
    public synchronized void y(m1.h hVar, com.bumptech.glide.request.c cVar) {
        this.f10794f.n(hVar);
        this.f10792d.g(cVar);
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean z(m1.h hVar) {
        com.bumptech.glide.request.c i4 = hVar.i();
        if (i4 == null) {
            return true;
        }
        if (!this.f10792d.a(i4)) {
            return false;
        }
        this.f10794f.o(hVar);
        hVar.k((com.bumptech.glide.request.c) null);
        return true;
    }

    i(b bVar, l lVar, s sVar, t tVar, d dVar, Context context) {
        this.f10794f = new w();
        a aVar = new a();
        this.f10795g = aVar;
        this.f10789a = bVar;
        this.f10791c = lVar;
        this.f10793e = sVar;
        this.f10792d = tVar;
        this.f10790b = context;
        com.bumptech.glide.manager.c a4 = dVar.a(context.getApplicationContext(), new b(tVar));
        this.f10796h = a4;
        bVar.o(this);
        if (p1.l.p()) {
            p1.l.t(aVar);
        } else {
            lVar.e(this);
        }
        lVar.e(a4);
        this.f10797i = new CopyOnWriteArrayList(bVar.i().c());
        x(bVar.i().d());
    }
}
