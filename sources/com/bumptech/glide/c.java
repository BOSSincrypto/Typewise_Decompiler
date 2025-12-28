package com.bumptech.glide;

import Z0.k;
import a1.C0355a;
import a1.g;
import a1.h;
import a1.i;
import android.content.Context;
import b1.C0481a;
import com.bumptech.glide.b;
import com.bumptech.glide.e;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.manager.f;
import com.bumptech.glide.manager.r;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k1.C0704a;
import y.C0939a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map f10734a = new C0939a();

    /* renamed from: b  reason: collision with root package name */
    private final e.a f10735b = new e.a();

    /* renamed from: c  reason: collision with root package name */
    private i f10736c;

    /* renamed from: d  reason: collision with root package name */
    private Z0.d f10737d;

    /* renamed from: e  reason: collision with root package name */
    private Z0.b f10738e;

    /* renamed from: f  reason: collision with root package name */
    private h f10739f;

    /* renamed from: g  reason: collision with root package name */
    private C0481a f10740g;

    /* renamed from: h  reason: collision with root package name */
    private C0481a f10741h;

    /* renamed from: i  reason: collision with root package name */
    private C0355a.C0044a f10742i;

    /* renamed from: j  reason: collision with root package name */
    private a1.i f10743j;

    /* renamed from: k  reason: collision with root package name */
    private com.bumptech.glide.manager.d f10744k;

    /* renamed from: l  reason: collision with root package name */
    private int f10745l = 4;

    /* renamed from: m  reason: collision with root package name */
    private b.a f10746m = new a();

    /* renamed from: n  reason: collision with root package name */
    private r.b f10747n;

    /* renamed from: o  reason: collision with root package name */
    private C0481a f10748o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f10749p;

    /* renamed from: q  reason: collision with root package name */
    private List f10750q;

    class a implements b.a {
        a() {
        }

        public com.bumptech.glide.request.e a() {
            return new com.bumptech.glide.request.e();
        }
    }

    static final class b {
    }

    /* renamed from: com.bumptech.glide.c$c  reason: collision with other inner class name */
    public static final class C0159c {
    }

    public static final class d {
    }

    /* access modifiers changed from: package-private */
    public b a(Context context, List list, C0704a aVar) {
        Context context2 = context;
        if (this.f10740g == null) {
            this.f10740g = C0481a.i();
        }
        if (this.f10741h == null) {
            this.f10741h = C0481a.g();
        }
        if (this.f10748o == null) {
            this.f10748o = C0481a.d();
        }
        if (this.f10743j == null) {
            this.f10743j = new i.a(context2).a();
        }
        if (this.f10744k == null) {
            this.f10744k = new f();
        }
        if (this.f10737d == null) {
            int b4 = this.f10743j.b();
            if (b4 > 0) {
                this.f10737d = new k((long) b4);
            } else {
                this.f10737d = new Z0.e();
            }
        }
        if (this.f10738e == null) {
            this.f10738e = new Z0.i(this.f10743j.a());
        }
        if (this.f10739f == null) {
            this.f10739f = new g((long) this.f10743j.d());
        }
        if (this.f10742i == null) {
            this.f10742i = new a1.f(context2);
        }
        if (this.f10736c == null) {
            this.f10736c = new com.bumptech.glide.load.engine.i(this.f10739f, this.f10742i, this.f10741h, this.f10740g, C0481a.j(), this.f10748o, this.f10749p);
        }
        List list2 = this.f10750q;
        if (list2 == null) {
            this.f10750q = Collections.emptyList();
        } else {
            this.f10750q = Collections.unmodifiableList(list2);
        }
        e b5 = this.f10735b.b();
        return new b(context, this.f10736c, this.f10739f, this.f10737d, this.f10738e, new r(this.f10747n, b5), this.f10744k, this.f10745l, this.f10746m, this.f10734a, this.f10750q, list, aVar, b5);
    }

    /* access modifiers changed from: package-private */
    public void b(r.b bVar) {
        this.f10747n = bVar;
    }
}
