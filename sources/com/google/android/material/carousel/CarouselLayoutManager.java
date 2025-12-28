package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.util.g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.google.android.material.carousel.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import z1.C0972c;

public class CarouselLayoutManager extends RecyclerView.o implements b, RecyclerView.y.b {

    /* renamed from: A  reason: collision with root package name */
    private int f11750A;

    /* renamed from: B  reason: collision with root package name */
    private Map f11751B;

    /* renamed from: C  reason: collision with root package name */
    private c f11752C;

    /* renamed from: s  reason: collision with root package name */
    int f11753s;

    /* renamed from: t  reason: collision with root package name */
    int f11754t;

    /* renamed from: u  reason: collision with root package name */
    int f11755u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f11756v;

    /* renamed from: w  reason: collision with root package name */
    private final c f11757w;

    /* renamed from: x  reason: collision with root package name */
    private d f11758x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public g f11759y;

    /* renamed from: z  reason: collision with root package name */
    private f f11760z;

    class a extends l {
        a(Context context) {
            super(context);
        }

        public PointF a(int i4) {
            return CarouselLayoutManager.this.f(i4);
        }

        public int t(View view, int i4) {
            if (CarouselLayoutManager.this.f11759y == null || !CarouselLayoutManager.this.j()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.k2(carouselLayoutManager.q0(view));
        }

        public int u(View view, int i4) {
            if (CarouselLayoutManager.this.f11759y == null || CarouselLayoutManager.this.j()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.k2(carouselLayoutManager.q0(view));
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        final View f11762a;

        /* renamed from: b  reason: collision with root package name */
        final float f11763b;

        /* renamed from: c  reason: collision with root package name */
        final float f11764c;

        /* renamed from: d  reason: collision with root package name */
        final d f11765d;

        b(View view, float f4, float f5, d dVar) {
            this.f11762a = view;
            this.f11763b = f4;
            this.f11764c = f5;
            this.f11765d = dVar;
        }
    }

    private static class c extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        private final Paint f11766a;

        /* renamed from: b  reason: collision with root package name */
        private List f11767b = Collections.unmodifiableList(new ArrayList());

        c() {
            Paint paint = new Paint();
            this.f11766a = paint;
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            super.i(canvas, recyclerView, zVar);
            this.f11766a.setStrokeWidth(recyclerView.getResources().getDimension(C0972c.m3_carousel_debug_keyline_width));
            for (f.c cVar : this.f11767b) {
                this.f11766a.setColor(androidx.core.graphics.a.c(-65281, -16776961, cVar.f11794c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).j()) {
                    canvas.drawLine(cVar.f11793b, (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).y2(), cVar.f11793b, (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).t2(), this.f11766a);
                } else {
                    canvas.drawLine((float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).v2(), cVar.f11793b, (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).w2(), cVar.f11793b, this.f11766a);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void j(List list) {
            this.f11767b = Collections.unmodifiableList(list);
        }
    }

    private static class d {

        /* renamed from: a  reason: collision with root package name */
        final f.c f11768a;

        /* renamed from: b  reason: collision with root package name */
        final f.c f11769b;

        d(f.c cVar, f.c cVar2) {
            boolean z3;
            if (cVar.f11792a <= cVar2.f11792a) {
                z3 = true;
            } else {
                z3 = false;
            }
            g.a(z3);
            this.f11768a = cVar;
            this.f11769b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        this(new h());
    }

    private static d A2(List list, float f4, boolean z3) {
        float f5;
        float f6 = Float.MAX_VALUE;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        float f7 = -3.4028235E38f;
        float f8 = Float.MAX_VALUE;
        float f9 = Float.MAX_VALUE;
        for (int i8 = 0; i8 < list.size(); i8++) {
            f.c cVar = (f.c) list.get(i8);
            if (z3) {
                f5 = cVar.f11793b;
            } else {
                f5 = cVar.f11792a;
            }
            float abs = Math.abs(f5 - f4);
            if (f5 <= f4 && abs <= f6) {
                i4 = i8;
                f6 = abs;
            }
            if (f5 > f4 && abs <= f8) {
                i6 = i8;
                f8 = abs;
            }
            if (f5 <= f9) {
                i5 = i8;
                f9 = f5;
            }
            if (f5 > f7) {
                i7 = i8;
                f7 = f5;
            }
        }
        if (i4 == -1) {
            i4 = i5;
        }
        if (i6 == -1) {
            i6 = i7;
        }
        return new d((f.c) list.get(i4), (f.c) list.get(i6));
    }

    private boolean C2(float f4, d dVar) {
        int e22 = e2((int) f4, (int) (r2(f4, dVar) / 2.0f));
        if (B2()) {
            if (e22 >= 0) {
                return false;
            }
        } else if (e22 <= o2()) {
            return false;
        }
        return true;
    }

    private boolean D2(float f4, d dVar) {
        int d22 = d2((int) f4, (int) (r2(f4, dVar) / 2.0f));
        if (B2()) {
            if (d22 <= o2()) {
                return false;
            }
        } else if (d22 >= 0) {
            return false;
        }
        return true;
    }

    private void E2() {
        if (this.f11756v && Log.isLoggable("CarouselLayoutManager", 3)) {
            for (int i4 = 0; i4 < W(); i4++) {
                View V3 = V(i4);
                float p22 = p2(V3);
                StringBuilder sb = new StringBuilder();
                sb.append("item position ");
                sb.append(q0(V3));
                sb.append(", center:");
                sb.append(p22);
                sb.append(", child index:");
                sb.append(i4);
            }
        }
    }

    private b F2(RecyclerView.u uVar, float f4, int i4) {
        View o4 = uVar.o(i4);
        K0(o4, 0, 0);
        float d22 = (float) d2((int) f4, (int) (this.f11760z.d() / 2.0f));
        d A22 = A2(this.f11760z.e(), d22, false);
        return new b(o4, d22, h2(o4, d22, A22), A22);
    }

    private void G2(View view, float f4, float f5, Rect rect) {
        float d22 = (float) d2((int) f4, (int) f5);
        d A22 = A2(this.f11760z.e(), d22, false);
        float h22 = h2(view, d22, A22);
        super.c0(view, rect);
        M2(view, d22, A22);
        this.f11752C.l(view, rect, f5, h22);
    }

    private void H2() {
        this.f11759y = null;
        E1();
    }

    private void I2(RecyclerView.u uVar) {
        while (W() > 0) {
            View V3 = V(0);
            float p22 = p2(V3);
            if (!D2(p22, A2(this.f11760z.e(), p22, true))) {
                break;
            }
            x1(V3, uVar);
        }
        while (W() - 1 >= 0) {
            View V4 = V(W() - 1);
            float p23 = p2(V4);
            if (C2(p23, A2(this.f11760z.e(), p23, true))) {
                x1(V4, uVar);
            } else {
                return;
            }
        }
    }

    private int J2(int i4, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (W() == 0 || i4 == 0) {
            return 0;
        }
        int l22 = l2(i4, this.f11753s, this.f11754t, this.f11755u);
        this.f11753s += l22;
        N2();
        float d4 = this.f11760z.d() / 2.0f;
        int i22 = i2(q0(V(0)));
        Rect rect = new Rect();
        for (int i5 = 0; i5 < W(); i5++) {
            G2(V(i5), (float) i22, d4, rect);
            i22 = d2(i22, (int) this.f11760z.d());
        }
        n2(uVar, zVar);
        return l22;
    }

    private void M2(View view, float f4, d dVar) {
    }

    private void N2() {
        f fVar;
        int i4 = this.f11755u;
        int i5 = this.f11754t;
        if (i4 <= i5) {
            if (B2()) {
                fVar = this.f11759y.h();
            } else {
                fVar = this.f11759y.l();
            }
            this.f11760z = fVar;
        } else {
            this.f11760z = this.f11759y.j((float) this.f11753s, (float) i5, (float) i4);
        }
        this.f11757w.j(this.f11760z.e());
    }

    private void O2() {
        if (this.f11756v && W() >= 1) {
            int i4 = 0;
            while (i4 < W() - 1) {
                int q02 = q0(V(i4));
                int i5 = i4 + 1;
                int q03 = q0(V(i5));
                if (q02 <= q03) {
                    i4 = i5;
                } else {
                    E2();
                    throw new IllegalStateException("Detected invalid child order. Child at index [" + i4 + "] had adapter position [" + q02 + "] and child at index [" + i5 + "] had adapter position [" + q03 + "].");
                }
            }
        }
    }

    private void c2(View view, int i4, b bVar) {
        float d4 = this.f11760z.d() / 2.0f;
        r(view, i4);
        float f4 = bVar.f11764c;
        this.f11752C.k(view, (int) (f4 - d4), (int) (f4 + d4));
        M2(view, bVar.f11763b, bVar.f11765d);
    }

    private int d2(int i4, int i5) {
        if (B2()) {
            return i4 - i5;
        }
        return i4 + i5;
    }

    private int e2(int i4, int i5) {
        if (B2()) {
            return i4 + i5;
        }
        return i4 - i5;
    }

    private void f2(RecyclerView.u uVar, RecyclerView.z zVar, int i4) {
        int i22 = i2(i4);
        while (i4 < zVar.b()) {
            b F22 = F2(uVar, (float) i22, i4);
            if (!C2(F22.f11764c, F22.f11765d)) {
                i22 = d2(i22, (int) this.f11760z.d());
                if (!D2(F22.f11764c, F22.f11765d)) {
                    c2(F22.f11762a, -1, F22);
                }
                i4++;
            } else {
                return;
            }
        }
    }

    private void g2(RecyclerView.u uVar, int i4) {
        int i22 = i2(i4);
        while (i4 >= 0) {
            b F22 = F2(uVar, (float) i22, i4);
            if (!D2(F22.f11764c, F22.f11765d)) {
                i22 = e2(i22, (int) this.f11760z.d());
                if (!C2(F22.f11764c, F22.f11765d)) {
                    c2(F22.f11762a, 0, F22);
                }
                i4--;
            } else {
                return;
            }
        }
    }

    private float h2(View view, float f4, d dVar) {
        f.c cVar = dVar.f11768a;
        float f5 = cVar.f11793b;
        f.c cVar2 = dVar.f11769b;
        float b4 = A1.a.b(f5, cVar2.f11793b, cVar.f11792a, cVar2.f11792a, f4);
        if (dVar.f11769b != this.f11760z.c() && dVar.f11768a != this.f11760z.h()) {
            return b4;
        }
        float d4 = this.f11752C.d((RecyclerView.p) view.getLayoutParams()) / this.f11760z.d();
        f.c cVar3 = dVar.f11769b;
        return b4 + ((f4 - cVar3.f11792a) * ((1.0f - cVar3.f11794c) + d4));
    }

    private int i2(int i4) {
        return d2((int) ((float) (x2() - this.f11753s)), (int) (this.f11760z.d() * ((float) i4)));
    }

    private int j2(RecyclerView.z zVar, g gVar) {
        f fVar;
        f.c cVar;
        float f4;
        boolean B22 = B2();
        if (B22) {
            fVar = gVar.l();
        } else {
            fVar = gVar.h();
        }
        if (B22) {
            cVar = fVar.a();
        } else {
            cVar = fVar.f();
        }
        float b4 = (((float) (zVar.b() - 1)) * fVar.d()) + ((float) getPaddingEnd());
        if (B22) {
            f4 = -1.0f;
        } else {
            f4 = 1.0f;
        }
        float f5 = b4 * f4;
        float x22 = cVar.f11792a - ((float) x2());
        float u22 = ((float) u2()) - cVar.f11792a;
        if (Math.abs(x22) > Math.abs(f5)) {
            return 0;
        }
        return (int) ((f5 - x22) + u22);
    }

    private static int l2(int i4, int i5, int i6, int i7) {
        int i8 = i5 + i4;
        if (i8 < i6) {
            return i6 - i5;
        }
        return i8 > i7 ? i7 - i5 : i4;
    }

    private int m2(g gVar) {
        f fVar;
        f.c cVar;
        int i4;
        boolean B22 = B2();
        if (B22) {
            fVar = gVar.h();
        } else {
            fVar = gVar.l();
        }
        if (B22) {
            cVar = fVar.f();
        } else {
            cVar = fVar.a();
        }
        int paddingStart = getPaddingStart();
        if (B22) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        return (int) ((((float) (paddingStart * i4)) + ((float) x2())) - ((float) e2((int) cVar.f11792a, (int) (fVar.d() / 2.0f))));
    }

    private void n2(RecyclerView.u uVar, RecyclerView.z zVar) {
        I2(uVar);
        if (W() == 0) {
            g2(uVar, this.f11750A - 1);
            f2(uVar, zVar, this.f11750A);
        } else {
            int q02 = q0(V(0));
            int q03 = q0(V(W() - 1));
            g2(uVar, q02 - 1);
            f2(uVar, zVar, q03 + 1);
        }
        O2();
    }

    private int o2() {
        if (j()) {
            return a();
        }
        return d();
    }

    private float p2(View view) {
        Rect rect = new Rect();
        super.c0(view, rect);
        return (float) rect.centerX();
    }

    private f q2(int i4) {
        f fVar;
        Map map = this.f11751B;
        if (map == null || (fVar = (f) map.get(Integer.valueOf(I.a.b(i4, 0, Math.max(0, l0() - 1))))) == null) {
            return this.f11759y.g();
        }
        return fVar;
    }

    private float r2(float f4, d dVar) {
        f.c cVar = dVar.f11768a;
        float f5 = cVar.f11795d;
        f.c cVar2 = dVar.f11769b;
        return A1.a.b(f5, cVar2.f11795d, cVar.f11793b, cVar2.f11793b, f4);
    }

    /* access modifiers changed from: private */
    public int t2() {
        return this.f11752C.e();
    }

    private int u2() {
        return this.f11752C.f();
    }

    /* access modifiers changed from: private */
    public int v2() {
        return this.f11752C.g();
    }

    /* access modifiers changed from: private */
    public int w2() {
        return this.f11752C.h();
    }

    private int x2() {
        return this.f11752C.i();
    }

    /* access modifiers changed from: private */
    public int y2() {
        return this.f11752C.j();
    }

    private int z2(int i4, f fVar) {
        if (B2()) {
            return (int) (((((float) o2()) - fVar.f().f11792a) - (((float) i4) * fVar.d())) - (fVar.d() / 2.0f));
        }
        return (int) (((((float) i4) * fVar.d()) - fVar.a().f11792a) + (fVar.d() / 2.0f));
    }

    /* access modifiers changed from: package-private */
    public boolean B2() {
        if (!j() || m0() != 1) {
            return false;
        }
        return true;
    }

    public int D(RecyclerView.z zVar) {
        return (int) this.f11759y.g().d();
    }

    public boolean D1(RecyclerView recyclerView, View view, Rect rect, boolean z3, boolean z4) {
        if (this.f11759y == null) {
            return false;
        }
        int s22 = s2(q0(view), q2(q0(view)));
        if (z4 || s22 == 0) {
            return false;
        }
        recyclerView.scrollBy(s22, 0);
        return true;
    }

    public int E(RecyclerView.z zVar) {
        return this.f11753s;
    }

    public int F(RecyclerView.z zVar) {
        return this.f11755u - this.f11754t;
    }

    public int G(RecyclerView.z zVar) {
        return (int) this.f11759y.g().d();
    }

    public int H(RecyclerView.z zVar) {
        return this.f11753s;
    }

    public int H1(int i4, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (x()) {
            return J2(i4, uVar, zVar);
        }
        return 0;
    }

    public int I(RecyclerView.z zVar) {
        return this.f11755u - this.f11754t;
    }

    public void I1(int i4) {
        if (this.f11759y != null) {
            this.f11753s = z2(i4, q2(i4));
            this.f11750A = I.a.b(i4, 0, Math.max(0, l0() - 1));
            N2();
            E1();
        }
    }

    public int J1(int i4, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (y()) {
            return J2(i4, uVar, zVar);
        }
        return 0;
    }

    public void K0(View view, int i4, int i5) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public void K2(d dVar) {
        this.f11758x = dVar;
        H2();
    }

    public void L2(int i4) {
        if (i4 == 0 || i4 == 1) {
            t((String) null);
            c cVar = this.f11752C;
            if (cVar == null || i4 != cVar.f11778a) {
                this.f11752C = c.b(this, i4);
                H2();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i4);
    }

    public RecyclerView.p Q() {
        return new RecyclerView.p(-2, -2);
    }

    public void T1(RecyclerView recyclerView, RecyclerView.z zVar, int i4) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i4);
        U1(aVar);
    }

    public void U0(AccessibilityEvent accessibilityEvent) {
        super.U0(accessibilityEvent);
        if (W() > 0) {
            accessibilityEvent.setFromIndex(q0(V(0)));
            accessibilityEvent.setToIndex(q0(V(W() - 1)));
        }
    }

    public int a() {
        return x0();
    }

    public void c0(View view, Rect rect) {
        super.c0(view, rect);
        float centerX = (float) rect.centerX();
        float width = (((float) rect.width()) - r2(centerX, A2(this.f11760z.e(), centerX, true))) / 2.0f;
        rect.set((int) (((float) rect.left) + width), rect.top, (int) (((float) rect.right) - width), rect.bottom);
    }

    public int d() {
        return j0();
    }

    public PointF f(int i4) {
        if (this.f11759y == null) {
            return null;
        }
        int s22 = s2(i4, q2(i4));
        if (j()) {
            return new PointF((float) s22, 0.0f);
        }
        return new PointF(0.0f, (float) s22);
    }

    public void h1(RecyclerView.u uVar, RecyclerView.z zVar) {
        boolean z3;
        int i4;
        if (zVar.b() <= 0) {
            v1(uVar);
            this.f11750A = 0;
            return;
        }
        boolean B22 = B2();
        if (this.f11759y == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            View o4 = uVar.o(0);
            K0(o4, 0, 0);
            f b4 = this.f11758x.b(this, o4);
            if (B22) {
                b4 = f.j(b4);
            }
            this.f11759y = g.f(this, b4);
        }
        int m22 = m2(this.f11759y);
        int j22 = j2(zVar, this.f11759y);
        if (B22) {
            i4 = j22;
        } else {
            i4 = m22;
        }
        this.f11754t = i4;
        if (B22) {
            j22 = m22;
        }
        this.f11755u = j22;
        if (z3) {
            this.f11753s = m22;
            this.f11751B = this.f11759y.i(l0(), this.f11754t, this.f11755u, B2());
        } else {
            int i5 = this.f11753s;
            this.f11753s = i5 + l2(0, i5, i4, j22);
        }
        this.f11750A = I.a.b(this.f11750A, 0, zVar.b());
        N2();
        J(uVar);
        n2(uVar, zVar);
    }

    public void i1(RecyclerView.z zVar) {
        super.i1(zVar);
        if (W() == 0) {
            this.f11750A = 0;
        } else {
            this.f11750A = q0(V(0));
        }
        O2();
    }

    public boolean j() {
        if (this.f11752C.f11778a == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public int k2(int i4) {
        return (int) (((float) this.f11753s) - ((float) z2(i4, q2(i4))));
    }

    /* access modifiers changed from: package-private */
    public int s2(int i4, f fVar) {
        return z2(i4, fVar) - this.f11753s;
    }

    public boolean x() {
        return j();
    }

    public boolean y() {
        return !j();
    }

    public CarouselLayoutManager(d dVar) {
        this(dVar, 0);
    }

    public CarouselLayoutManager(d dVar, int i4) {
        this.f11756v = false;
        this.f11757w = new c();
        this.f11750A = 0;
        K2(dVar);
        L2(i4);
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.f11756v = false;
        this.f11757w = new c();
        this.f11750A = 0;
        L2(RecyclerView.o.r0(context, attributeSet, i4, i5).f6374a);
        K2(new h());
    }
}
