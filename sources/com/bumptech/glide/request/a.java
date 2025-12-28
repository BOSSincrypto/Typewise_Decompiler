package com.bumptech.glide.request;

import X0.b;
import X0.c;
import X0.d;
import X0.g;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.m;
import com.bumptech.glide.load.resource.bitmap.u;
import com.bumptech.glide.load.resource.bitmap.w;
import i1.f;
import java.util.Map;
import kotlin.uuid.Uuid;
import o1.C0838a;
import p1.k;
import p1.l;

public abstract class a implements Cloneable {

    /* renamed from: A  reason: collision with root package name */
    private boolean f11268A;

    /* renamed from: B  reason: collision with root package name */
    private boolean f11269B;

    /* renamed from: C  reason: collision with root package name */
    private boolean f11270C = true;

    /* renamed from: D  reason: collision with root package name */
    private boolean f11271D;

    /* renamed from: a  reason: collision with root package name */
    private int f11272a;

    /* renamed from: b  reason: collision with root package name */
    private float f11273b = 1.0f;

    /* renamed from: c  reason: collision with root package name */
    private h f11274c = h.f10950e;

    /* renamed from: d  reason: collision with root package name */
    private Priority f11275d = Priority.NORMAL;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f11276e;

    /* renamed from: f  reason: collision with root package name */
    private int f11277f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f11278g;

    /* renamed from: h  reason: collision with root package name */
    private int f11279h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f11280i = true;

    /* renamed from: j  reason: collision with root package name */
    private int f11281j = -1;

    /* renamed from: k  reason: collision with root package name */
    private int f11282k = -1;

    /* renamed from: l  reason: collision with root package name */
    private b f11283l = C0838a.c();

    /* renamed from: m  reason: collision with root package name */
    private boolean f11284m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f11285n = true;

    /* renamed from: o  reason: collision with root package name */
    private Drawable f11286o;

    /* renamed from: p  reason: collision with root package name */
    private int f11287p;

    /* renamed from: q  reason: collision with root package name */
    private d f11288q = new d();

    /* renamed from: v  reason: collision with root package name */
    private Map f11289v = new p1.b();

    /* renamed from: w  reason: collision with root package name */
    private Class f11290w = Object.class;

    /* renamed from: x  reason: collision with root package name */
    private boolean f11291x;

    /* renamed from: y  reason: collision with root package name */
    private Resources.Theme f11292y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f11293z;

    private boolean I(int i4) {
        return J(this.f11272a, i4);
    }

    private static boolean J(int i4, int i5) {
        return (i4 & i5) != 0;
    }

    private a S(DownsampleStrategy downsampleStrategy, g gVar) {
        return W(downsampleStrategy, gVar, false);
    }

    private a W(DownsampleStrategy downsampleStrategy, g gVar, boolean z3) {
        a aVar;
        if (z3) {
            aVar = f0(downsampleStrategy, gVar);
        } else {
            aVar = T(downsampleStrategy, gVar);
        }
        aVar.f11270C = true;
        return aVar;
    }

    private a X() {
        return this;
    }

    public final Resources.Theme A() {
        return this.f11292y;
    }

    public final Map B() {
        return this.f11289v;
    }

    public final boolean C() {
        return this.f11271D;
    }

    public final boolean D() {
        return this.f11268A;
    }

    /* access modifiers changed from: protected */
    public final boolean E() {
        return this.f11293z;
    }

    public final boolean F() {
        return this.f11280i;
    }

    public final boolean G() {
        return I(8);
    }

    /* access modifiers changed from: package-private */
    public boolean H() {
        return this.f11270C;
    }

    public final boolean K() {
        return this.f11285n;
    }

    public final boolean L() {
        return this.f11284m;
    }

    public final boolean M() {
        return I(2048);
    }

    public final boolean N() {
        return l.s(this.f11282k, this.f11281j);
    }

    public a O() {
        this.f11291x = true;
        return X();
    }

    public a P() {
        return T(DownsampleStrategy.f11085e, new com.bumptech.glide.load.resource.bitmap.l());
    }

    public a Q() {
        return S(DownsampleStrategy.f11084d, new m());
    }

    public a R() {
        return S(DownsampleStrategy.f11083c, new w());
    }

    /* access modifiers changed from: package-private */
    public final a T(DownsampleStrategy downsampleStrategy, g gVar) {
        if (this.f11293z) {
            return clone().T(downsampleStrategy, gVar);
        }
        j(downsampleStrategy);
        return e0(gVar, false);
    }

    public a U(int i4, int i5) {
        if (this.f11293z) {
            return clone().U(i4, i5);
        }
        this.f11282k = i4;
        this.f11281j = i5;
        this.f11272a |= 512;
        return Y();
    }

    public a V(Priority priority) {
        if (this.f11293z) {
            return clone().V(priority);
        }
        this.f11275d = (Priority) k.d(priority);
        this.f11272a |= 8;
        return Y();
    }

    /* access modifiers changed from: protected */
    public final a Y() {
        if (!this.f11291x) {
            return X();
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    public a Z(c cVar, Object obj) {
        if (this.f11293z) {
            return clone().Z(cVar, obj);
        }
        k.d(cVar);
        k.d(obj);
        this.f11288q.e(cVar, obj);
        return Y();
    }

    public a a0(b bVar) {
        if (this.f11293z) {
            return clone().a0(bVar);
        }
        this.f11283l = (b) k.d(bVar);
        this.f11272a |= 1024;
        return Y();
    }

    public a b(a aVar) {
        if (this.f11293z) {
            return clone().b(aVar);
        }
        if (J(aVar.f11272a, 2)) {
            this.f11273b = aVar.f11273b;
        }
        if (J(aVar.f11272a, 262144)) {
            this.f11268A = aVar.f11268A;
        }
        if (J(aVar.f11272a, 1048576)) {
            this.f11271D = aVar.f11271D;
        }
        if (J(aVar.f11272a, 4)) {
            this.f11274c = aVar.f11274c;
        }
        if (J(aVar.f11272a, 8)) {
            this.f11275d = aVar.f11275d;
        }
        if (J(aVar.f11272a, 16)) {
            this.f11276e = aVar.f11276e;
            this.f11277f = 0;
            this.f11272a &= -33;
        }
        if (J(aVar.f11272a, 32)) {
            this.f11277f = aVar.f11277f;
            this.f11276e = null;
            this.f11272a &= -17;
        }
        if (J(aVar.f11272a, 64)) {
            this.f11278g = aVar.f11278g;
            this.f11279h = 0;
            this.f11272a &= -129;
        }
        if (J(aVar.f11272a, Uuid.SIZE_BITS)) {
            this.f11279h = aVar.f11279h;
            this.f11278g = null;
            this.f11272a &= -65;
        }
        if (J(aVar.f11272a, 256)) {
            this.f11280i = aVar.f11280i;
        }
        if (J(aVar.f11272a, 512)) {
            this.f11282k = aVar.f11282k;
            this.f11281j = aVar.f11281j;
        }
        if (J(aVar.f11272a, 1024)) {
            this.f11283l = aVar.f11283l;
        }
        if (J(aVar.f11272a, 4096)) {
            this.f11290w = aVar.f11290w;
        }
        if (J(aVar.f11272a, 8192)) {
            this.f11286o = aVar.f11286o;
            this.f11287p = 0;
            this.f11272a &= -16385;
        }
        if (J(aVar.f11272a, 16384)) {
            this.f11287p = aVar.f11287p;
            this.f11286o = null;
            this.f11272a &= -8193;
        }
        if (J(aVar.f11272a, 32768)) {
            this.f11292y = aVar.f11292y;
        }
        if (J(aVar.f11272a, 65536)) {
            this.f11285n = aVar.f11285n;
        }
        if (J(aVar.f11272a, 131072)) {
            this.f11284m = aVar.f11284m;
        }
        if (J(aVar.f11272a, 2048)) {
            this.f11289v.putAll(aVar.f11289v);
            this.f11270C = aVar.f11270C;
        }
        if (J(aVar.f11272a, 524288)) {
            this.f11269B = aVar.f11269B;
        }
        if (!this.f11285n) {
            this.f11289v.clear();
            int i4 = this.f11272a;
            this.f11284m = false;
            this.f11272a = i4 & -133121;
            this.f11270C = true;
        }
        this.f11272a |= aVar.f11272a;
        this.f11288q.d(aVar.f11288q);
        return Y();
    }

    public a b0(float f4) {
        if (this.f11293z) {
            return clone().b0(f4);
        }
        if (f4 < 0.0f || f4 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f11273b = f4;
        this.f11272a |= 2;
        return Y();
    }

    public a c() {
        if (!this.f11291x || this.f11293z) {
            this.f11293z = true;
            return O();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    public a c0(boolean z3) {
        if (this.f11293z) {
            return clone().c0(true);
        }
        this.f11280i = !z3;
        this.f11272a |= 256;
        return Y();
    }

    /* renamed from: d */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            d dVar = new d();
            aVar.f11288q = dVar;
            dVar.d(this.f11288q);
            p1.b bVar = new p1.b();
            aVar.f11289v = bVar;
            bVar.putAll(this.f11289v);
            aVar.f11291x = false;
            aVar.f11293z = false;
            return aVar;
        } catch (CloneNotSupportedException e4) {
            throw new RuntimeException(e4);
        }
    }

    public a d0(g gVar) {
        return e0(gVar, true);
    }

    /* access modifiers changed from: package-private */
    public a e0(g gVar, boolean z3) {
        if (this.f11293z) {
            return clone().e0(gVar, z3);
        }
        u uVar = new u(gVar, z3);
        g0(Bitmap.class, gVar, z3);
        g0(Drawable.class, uVar, z3);
        g0(BitmapDrawable.class, uVar.c(), z3);
        g0(i1.c.class, new f(gVar), z3);
        return Y();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (Float.compare(aVar.f11273b, this.f11273b) == 0 && this.f11277f == aVar.f11277f && l.c(this.f11276e, aVar.f11276e) && this.f11279h == aVar.f11279h && l.c(this.f11278g, aVar.f11278g) && this.f11287p == aVar.f11287p && l.c(this.f11286o, aVar.f11286o) && this.f11280i == aVar.f11280i && this.f11281j == aVar.f11281j && this.f11282k == aVar.f11282k && this.f11284m == aVar.f11284m && this.f11285n == aVar.f11285n && this.f11268A == aVar.f11268A && this.f11269B == aVar.f11269B && this.f11274c.equals(aVar.f11274c) && this.f11275d == aVar.f11275d && this.f11288q.equals(aVar.f11288q) && this.f11289v.equals(aVar.f11289v) && this.f11290w.equals(aVar.f11290w) && l.c(this.f11283l, aVar.f11283l) && l.c(this.f11292y, aVar.f11292y)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final a f0(DownsampleStrategy downsampleStrategy, g gVar) {
        if (this.f11293z) {
            return clone().f0(downsampleStrategy, gVar);
        }
        j(downsampleStrategy);
        return d0(gVar);
    }

    public a g(Class cls) {
        if (this.f11293z) {
            return clone().g(cls);
        }
        this.f11290w = (Class) k.d(cls);
        this.f11272a |= 4096;
        return Y();
    }

    /* access modifiers changed from: package-private */
    public a g0(Class cls, g gVar, boolean z3) {
        if (this.f11293z) {
            return clone().g0(cls, gVar, z3);
        }
        k.d(cls);
        k.d(gVar);
        this.f11289v.put(cls, gVar);
        int i4 = this.f11272a;
        this.f11285n = true;
        this.f11272a = 67584 | i4;
        this.f11270C = false;
        if (z3) {
            this.f11272a = i4 | 198656;
            this.f11284m = true;
        }
        return Y();
    }

    public a h0(boolean z3) {
        if (this.f11293z) {
            return clone().h0(z3);
        }
        this.f11271D = z3;
        this.f11272a |= 1048576;
        return Y();
    }

    public int hashCode() {
        return l.n(this.f11292y, l.n(this.f11283l, l.n(this.f11290w, l.n(this.f11289v, l.n(this.f11288q, l.n(this.f11275d, l.n(this.f11274c, l.o(this.f11269B, l.o(this.f11268A, l.o(this.f11285n, l.o(this.f11284m, l.m(this.f11282k, l.m(this.f11281j, l.o(this.f11280i, l.n(this.f11286o, l.m(this.f11287p, l.n(this.f11278g, l.m(this.f11279h, l.n(this.f11276e, l.m(this.f11277f, l.k(this.f11273b)))))))))))))))))))));
    }

    public a i(h hVar) {
        if (this.f11293z) {
            return clone().i(hVar);
        }
        this.f11274c = (h) k.d(hVar);
        this.f11272a |= 4;
        return Y();
    }

    public a j(DownsampleStrategy downsampleStrategy) {
        return Z(DownsampleStrategy.f11088h, k.d(downsampleStrategy));
    }

    public final h k() {
        return this.f11274c;
    }

    public final int l() {
        return this.f11277f;
    }

    public final Drawable n() {
        return this.f11276e;
    }

    public final Drawable o() {
        return this.f11286o;
    }

    public final int p() {
        return this.f11287p;
    }

    public final boolean q() {
        return this.f11269B;
    }

    public final d r() {
        return this.f11288q;
    }

    public final int s() {
        return this.f11281j;
    }

    public final int t() {
        return this.f11282k;
    }

    public final Drawable u() {
        return this.f11278g;
    }

    public final int v() {
        return this.f11279h;
    }

    public final Priority w() {
        return this.f11275d;
    }

    public final Class x() {
        return this.f11290w;
    }

    public final b y() {
        return this.f11283l;
    }

    public final float z() {
        return this.f11273b;
    }
}
