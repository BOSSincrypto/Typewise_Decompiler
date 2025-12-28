package Q1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import z1.j;

public class k {

    /* renamed from: m  reason: collision with root package name */
    public static final c f1272m = new i(0.5f);

    /* renamed from: a  reason: collision with root package name */
    d f1273a;

    /* renamed from: b  reason: collision with root package name */
    d f1274b;

    /* renamed from: c  reason: collision with root package name */
    d f1275c;

    /* renamed from: d  reason: collision with root package name */
    d f1276d;

    /* renamed from: e  reason: collision with root package name */
    c f1277e;

    /* renamed from: f  reason: collision with root package name */
    c f1278f;

    /* renamed from: g  reason: collision with root package name */
    c f1279g;

    /* renamed from: h  reason: collision with root package name */
    c f1280h;

    /* renamed from: i  reason: collision with root package name */
    f f1281i;

    /* renamed from: j  reason: collision with root package name */
    f f1282j;

    /* renamed from: k  reason: collision with root package name */
    f f1283k;

    /* renamed from: l  reason: collision with root package name */
    f f1284l;

    public interface c {
        c a(c cVar);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i4, int i5) {
        return c(context, i4, i5, 0);
    }

    private static b c(Context context, int i4, int i5, int i6) {
        return d(context, i4, i5, new a((float) i6));
    }

    private static b d(Context context, int i4, int i5, c cVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i4);
        if (i5 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i5);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(j.f4);
        try {
            int i6 = obtainStyledAttributes.getInt(j.g4, 0);
            int i7 = obtainStyledAttributes.getInt(j.j4, i6);
            int i8 = obtainStyledAttributes.getInt(j.k4, i6);
            int i9 = obtainStyledAttributes.getInt(j.i4, i6);
            int i10 = obtainStyledAttributes.getInt(j.h4, i6);
            c m4 = m(obtainStyledAttributes, j.l4, cVar);
            c m5 = m(obtainStyledAttributes, j.o4, m4);
            c m6 = m(obtainStyledAttributes, j.p4, m4);
            c m7 = m(obtainStyledAttributes, j.n4, m4);
            return new b().y(i7, m5).C(i8, m6).u(i9, m7).q(i10, m(obtainStyledAttributes, j.m4, m4));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i4, int i5) {
        return f(context, attributeSet, i4, i5, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i4, int i5, int i6) {
        return g(context, attributeSet, i4, i5, new a((float) i6));
    }

    public static b g(Context context, AttributeSet attributeSet, int i4, int i5, c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f16672k3, i4, i5);
        int resourceId = obtainStyledAttributes.getResourceId(j.f16677l3, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(j.f16682m3, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    private static c m(TypedArray typedArray, int i4, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i4);
        if (peekValue == null) {
            return cVar;
        }
        int i5 = peekValue.type;
        if (i5 == 5) {
            return new a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i5 == 6) {
            return new i(peekValue.getFraction(1.0f, 1.0f));
        }
        return cVar;
    }

    public f h() {
        return this.f1283k;
    }

    public d i() {
        return this.f1276d;
    }

    public c j() {
        return this.f1280h;
    }

    public d k() {
        return this.f1275c;
    }

    public c l() {
        return this.f1279g;
    }

    public f n() {
        return this.f1284l;
    }

    public f o() {
        return this.f1282j;
    }

    public f p() {
        return this.f1281i;
    }

    public d q() {
        return this.f1273a;
    }

    public c r() {
        return this.f1277e;
    }

    public d s() {
        return this.f1274b;
    }

    public c t() {
        return this.f1278f;
    }

    public boolean u(RectF rectF) {
        boolean z3;
        boolean z4;
        boolean z5;
        Class<f> cls = f.class;
        if (!this.f1284l.getClass().equals(cls) || !this.f1282j.getClass().equals(cls) || !this.f1281i.getClass().equals(cls) || !this.f1283k.getClass().equals(cls)) {
            z3 = false;
        } else {
            z3 = true;
        }
        float a4 = this.f1277e.a(rectF);
        if (this.f1278f.a(rectF) == a4 && this.f1280h.a(rectF) == a4 && this.f1279g.a(rectF) == a4) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!(this.f1274b instanceof j) || !(this.f1273a instanceof j) || !(this.f1275c instanceof j) || !(this.f1276d instanceof j)) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!z3 || !z4 || !z5) {
            return false;
        }
        return true;
    }

    public b v() {
        return new b(this);
    }

    public k w(float f4) {
        return v().o(f4).m();
    }

    public k x(c cVar) {
        return v().p(cVar).m();
    }

    public k y(c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }

    private k(b bVar) {
        this.f1273a = bVar.f1285a;
        this.f1274b = bVar.f1286b;
        this.f1275c = bVar.f1287c;
        this.f1276d = bVar.f1288d;
        this.f1277e = bVar.f1289e;
        this.f1278f = bVar.f1290f;
        this.f1279g = bVar.f1291g;
        this.f1280h = bVar.f1292h;
        this.f1281i = bVar.f1293i;
        this.f1282j = bVar.f1294j;
        this.f1283k = bVar.f1295k;
        this.f1284l = bVar.f1296l;
    }

    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public d f1285a = h.b();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public d f1286b = h.b();
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public d f1287c = h.b();
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public d f1288d = h.b();
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public c f1289e = new a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public c f1290f = new a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public c f1291g = new a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public c f1292h = new a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public f f1293i = h.c();
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public f f1294j = h.c();
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public f f1295k = h.c();
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public f f1296l = h.c();

        public b() {
        }

        private static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f1271a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).f1219a;
            }
            return -1.0f;
        }

        public b A(float f4) {
            this.f1289e = new a(f4);
            return this;
        }

        public b B(c cVar) {
            this.f1289e = cVar;
            return this;
        }

        public b C(int i4, c cVar) {
            return D(h.a(i4)).F(cVar);
        }

        public b D(d dVar) {
            this.f1286b = dVar;
            float n4 = n(dVar);
            if (n4 != -1.0f) {
                E(n4);
            }
            return this;
        }

        public b E(float f4) {
            this.f1290f = new a(f4);
            return this;
        }

        public b F(c cVar) {
            this.f1290f = cVar;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f4) {
            return A(f4).E(f4).w(f4).s(f4);
        }

        public b p(c cVar) {
            return B(cVar).F(cVar).x(cVar).t(cVar);
        }

        public b q(int i4, c cVar) {
            return r(h.a(i4)).t(cVar);
        }

        public b r(d dVar) {
            this.f1288d = dVar;
            float n4 = n(dVar);
            if (n4 != -1.0f) {
                s(n4);
            }
            return this;
        }

        public b s(float f4) {
            this.f1292h = new a(f4);
            return this;
        }

        public b t(c cVar) {
            this.f1292h = cVar;
            return this;
        }

        public b u(int i4, c cVar) {
            return v(h.a(i4)).x(cVar);
        }

        public b v(d dVar) {
            this.f1287c = dVar;
            float n4 = n(dVar);
            if (n4 != -1.0f) {
                w(n4);
            }
            return this;
        }

        public b w(float f4) {
            this.f1291g = new a(f4);
            return this;
        }

        public b x(c cVar) {
            this.f1291g = cVar;
            return this;
        }

        public b y(int i4, c cVar) {
            return z(h.a(i4)).B(cVar);
        }

        public b z(d dVar) {
            this.f1285a = dVar;
            float n4 = n(dVar);
            if (n4 != -1.0f) {
                A(n4);
            }
            return this;
        }

        public b(k kVar) {
            this.f1285a = kVar.f1273a;
            this.f1286b = kVar.f1274b;
            this.f1287c = kVar.f1275c;
            this.f1288d = kVar.f1276d;
            this.f1289e = kVar.f1277e;
            this.f1290f = kVar.f1278f;
            this.f1291g = kVar.f1279g;
            this.f1292h = kVar.f1280h;
            this.f1293i = kVar.f1281i;
            this.f1294j = kVar.f1282j;
            this.f1295k = kVar.f1283k;
            this.f1296l = kVar.f1284l;
        }
    }

    public k() {
        this.f1273a = h.b();
        this.f1274b = h.b();
        this.f1275c = h.b();
        this.f1276d = h.b();
        this.f1277e = new a(0.0f);
        this.f1278f = new a(0.0f);
        this.f1279g = new a(0.0f);
        this.f1280h = new a(0.0f);
        this.f1281i = h.c();
        this.f1282j = h.c();
        this.f1283k = h.c();
        this.f1284l = h.c();
    }
}
