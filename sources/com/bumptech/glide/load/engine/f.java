package com.bumptech.glide.load.engine;

import X0.a;
import X0.b;
import X0.g;
import a1.C0355a;
import c1.n;
import com.bumptech.glide.Priority;
import com.bumptech.glide.d;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.engine.DecodeJob;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class f {

    /* renamed from: a  reason: collision with root package name */
    private final List f10923a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final List f10924b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private d f10925c;

    /* renamed from: d  reason: collision with root package name */
    private Object f10926d;

    /* renamed from: e  reason: collision with root package name */
    private int f10927e;

    /* renamed from: f  reason: collision with root package name */
    private int f10928f;

    /* renamed from: g  reason: collision with root package name */
    private Class f10929g;

    /* renamed from: h  reason: collision with root package name */
    private DecodeJob.e f10930h;

    /* renamed from: i  reason: collision with root package name */
    private X0.d f10931i;

    /* renamed from: j  reason: collision with root package name */
    private Map f10932j;

    /* renamed from: k  reason: collision with root package name */
    private Class f10933k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f10934l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f10935m;

    /* renamed from: n  reason: collision with root package name */
    private b f10936n;

    /* renamed from: o  reason: collision with root package name */
    private Priority f10937o;

    /* renamed from: p  reason: collision with root package name */
    private h f10938p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f10939q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f10940r;

    f() {
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f10925c = null;
        this.f10926d = null;
        this.f10936n = null;
        this.f10929g = null;
        this.f10933k = null;
        this.f10931i = null;
        this.f10937o = null;
        this.f10932j = null;
        this.f10938p = null;
        this.f10923a.clear();
        this.f10934l = false;
        this.f10924b.clear();
        this.f10935m = false;
    }

    /* access modifiers changed from: package-private */
    public Z0.b b() {
        return this.f10925c.b();
    }

    /* access modifiers changed from: package-private */
    public List c() {
        if (!this.f10935m) {
            this.f10935m = true;
            this.f10924b.clear();
            List g4 = g();
            int size = g4.size();
            for (int i4 = 0; i4 < size; i4++) {
                n.a aVar = (n.a) g4.get(i4);
                if (!this.f10924b.contains(aVar.f7577a)) {
                    this.f10924b.add(aVar.f7577a);
                }
                for (int i5 = 0; i5 < aVar.f7578b.size(); i5++) {
                    if (!this.f10924b.contains(aVar.f7578b.get(i5))) {
                        this.f10924b.add(aVar.f7578b.get(i5));
                    }
                }
            }
        }
        return this.f10924b;
    }

    /* access modifiers changed from: package-private */
    public C0355a d() {
        return this.f10930h.a();
    }

    /* access modifiers changed from: package-private */
    public h e() {
        return this.f10938p;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f10928f;
    }

    /* access modifiers changed from: package-private */
    public List g() {
        if (!this.f10934l) {
            this.f10934l = true;
            this.f10923a.clear();
            List i4 = this.f10925c.i().i(this.f10926d);
            int size = i4.size();
            for (int i5 = 0; i5 < size; i5++) {
                n.a a4 = ((n) i4.get(i5)).a(this.f10926d, this.f10927e, this.f10928f, this.f10931i);
                if (a4 != null) {
                    this.f10923a.add(a4);
                }
            }
        }
        return this.f10923a;
    }

    /* access modifiers changed from: package-private */
    public q h(Class cls) {
        return this.f10925c.i().h(cls, this.f10929g, this.f10933k);
    }

    /* access modifiers changed from: package-private */
    public Class i() {
        return this.f10926d.getClass();
    }

    /* access modifiers changed from: package-private */
    public List j(File file) {
        return this.f10925c.i().i(file);
    }

    /* access modifiers changed from: package-private */
    public X0.d k() {
        return this.f10931i;
    }

    /* access modifiers changed from: package-private */
    public Priority l() {
        return this.f10937o;
    }

    /* access modifiers changed from: package-private */
    public List m() {
        return this.f10925c.i().j(this.f10926d.getClass(), this.f10929g, this.f10933k);
    }

    /* access modifiers changed from: package-private */
    public X0.f n(s sVar) {
        return this.f10925c.i().k(sVar);
    }

    /* access modifiers changed from: package-private */
    public e o(Object obj) {
        return this.f10925c.i().l(obj);
    }

    /* access modifiers changed from: package-private */
    public b p() {
        return this.f10936n;
    }

    /* access modifiers changed from: package-private */
    public a q(Object obj) {
        return this.f10925c.i().m(obj);
    }

    /* access modifiers changed from: package-private */
    public Class r() {
        return this.f10933k;
    }

    /* access modifiers changed from: package-private */
    public g s(Class cls) {
        g gVar = (g) this.f10932j.get(cls);
        if (gVar == null) {
            Iterator it = this.f10932j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    gVar = (g) entry.getValue();
                    break;
                }
            }
        }
        if (gVar != null) {
            return gVar;
        }
        if (!this.f10932j.isEmpty() || !this.f10939q) {
            return e1.n.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* access modifiers changed from: package-private */
    public int t() {
        return this.f10927e;
    }

    /* access modifiers changed from: package-private */
    public boolean u(Class cls) {
        if (h(cls) != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void v(d dVar, Object obj, b bVar, int i4, int i5, h hVar, Class cls, Class cls2, Priority priority, X0.d dVar2, Map map, boolean z3, boolean z4, DecodeJob.e eVar) {
        this.f10925c = dVar;
        this.f10926d = obj;
        this.f10936n = bVar;
        this.f10927e = i4;
        this.f10928f = i5;
        this.f10938p = hVar;
        this.f10929g = cls;
        this.f10930h = eVar;
        this.f10933k = cls2;
        this.f10937o = priority;
        this.f10931i = dVar2;
        this.f10932j = map;
        this.f10939q = z3;
        this.f10940r = z4;
    }

    /* access modifiers changed from: package-private */
    public boolean w(s sVar) {
        return this.f10925c.i().n(sVar);
    }

    /* access modifiers changed from: package-private */
    public boolean x() {
        return this.f10940r;
    }

    /* access modifiers changed from: package-private */
    public boolean y(b bVar) {
        List g4 = g();
        int size = g4.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((n.a) g4.get(i4)).f7577a.equals(bVar)) {
                return true;
            }
        }
        return false;
    }
}
