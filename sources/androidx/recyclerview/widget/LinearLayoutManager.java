package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.o implements RecyclerView.y.b {

    /* renamed from: A  reason: collision with root package name */
    int f6176A;

    /* renamed from: B  reason: collision with root package name */
    int f6177B;

    /* renamed from: C  reason: collision with root package name */
    private boolean f6178C;

    /* renamed from: D  reason: collision with root package name */
    d f6179D;

    /* renamed from: E  reason: collision with root package name */
    final a f6180E;

    /* renamed from: F  reason: collision with root package name */
    private final b f6181F;

    /* renamed from: G  reason: collision with root package name */
    private int f6182G;

    /* renamed from: H  reason: collision with root package name */
    private int[] f6183H;

    /* renamed from: s  reason: collision with root package name */
    int f6184s;

    /* renamed from: t  reason: collision with root package name */
    private c f6185t;

    /* renamed from: u  reason: collision with root package name */
    p f6186u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f6187v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f6188w;

    /* renamed from: x  reason: collision with root package name */
    boolean f6189x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f6190y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f6191z;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        p f6192a;

        /* renamed from: b  reason: collision with root package name */
        int f6193b;

        /* renamed from: c  reason: collision with root package name */
        int f6194c;

        /* renamed from: d  reason: collision with root package name */
        boolean f6195d;

        /* renamed from: e  reason: collision with root package name */
        boolean f6196e;

        a() {
            e();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int i4;
            if (this.f6195d) {
                i4 = this.f6192a.i();
            } else {
                i4 = this.f6192a.m();
            }
            this.f6194c = i4;
        }

        public void b(View view, int i4) {
            if (this.f6195d) {
                this.f6194c = this.f6192a.d(view) + this.f6192a.o();
            } else {
                this.f6194c = this.f6192a.g(view);
            }
            this.f6193b = i4;
        }

        public void c(View view, int i4) {
            int o4 = this.f6192a.o();
            if (o4 >= 0) {
                b(view, i4);
                return;
            }
            this.f6193b = i4;
            if (this.f6195d) {
                int i5 = (this.f6192a.i() - o4) - this.f6192a.d(view);
                this.f6194c = this.f6192a.i() - i5;
                if (i5 > 0) {
                    int e4 = this.f6194c - this.f6192a.e(view);
                    int m4 = this.f6192a.m();
                    int min = e4 - (m4 + Math.min(this.f6192a.g(view) - m4, 0));
                    if (min < 0) {
                        this.f6194c += Math.min(i5, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g4 = this.f6192a.g(view);
            int m5 = g4 - this.f6192a.m();
            this.f6194c = g4;
            if (m5 > 0) {
                int i6 = (this.f6192a.i() - Math.min(0, (this.f6192a.i() - o4) - this.f6192a.d(view))) - (g4 + this.f6192a.e(view));
                if (i6 < 0) {
                    this.f6194c -= Math.min(m5, -i6);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(View view, RecyclerView.z zVar) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            if (pVar.v() || pVar.t() < 0 || pVar.t() >= zVar.b()) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f6193b = -1;
            this.f6194c = Integer.MIN_VALUE;
            this.f6195d = false;
            this.f6196e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f6193b + ", mCoordinate=" + this.f6194c + ", mLayoutFromEnd=" + this.f6195d + ", mValid=" + this.f6196e + '}';
        }
    }

    protected static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f6197a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6198b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f6199c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f6200d;

        protected b() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f6197a = 0;
            this.f6198b = false;
            this.f6199c = false;
            this.f6200d = false;
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f6201a = true;

        /* renamed from: b  reason: collision with root package name */
        int f6202b;

        /* renamed from: c  reason: collision with root package name */
        int f6203c;

        /* renamed from: d  reason: collision with root package name */
        int f6204d;

        /* renamed from: e  reason: collision with root package name */
        int f6205e;

        /* renamed from: f  reason: collision with root package name */
        int f6206f;

        /* renamed from: g  reason: collision with root package name */
        int f6207g;

        /* renamed from: h  reason: collision with root package name */
        int f6208h = 0;

        /* renamed from: i  reason: collision with root package name */
        int f6209i = 0;

        /* renamed from: j  reason: collision with root package name */
        boolean f6210j = false;

        /* renamed from: k  reason: collision with root package name */
        int f6211k;

        /* renamed from: l  reason: collision with root package name */
        List f6212l = null;

        /* renamed from: m  reason: collision with root package name */
        boolean f6213m;

        c() {
        }

        private View e() {
            int size = this.f6212l.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = ((RecyclerView.D) this.f6212l.get(i4)).f6318a;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.v() && this.f6204d == pVar.t()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b((View) null);
        }

        public void b(View view) {
            View f4 = f(view);
            if (f4 == null) {
                this.f6204d = -1;
            } else {
                this.f6204d = ((RecyclerView.p) f4.getLayoutParams()).t();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(RecyclerView.z zVar) {
            int i4 = this.f6204d;
            if (i4 < 0 || i4 >= zVar.b()) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public View d(RecyclerView.u uVar) {
            if (this.f6212l != null) {
                return e();
            }
            View o4 = uVar.o(this.f6204d);
            this.f6204d += this.f6205e;
            return o4;
        }

        public View f(View view) {
            int t4;
            int size = this.f6212l.size();
            View view2 = null;
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < size; i5++) {
                View view3 = ((RecyclerView.D) this.f6212l.get(i5)).f6318a;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.v() && (t4 = (pVar.t() - this.f6204d) * this.f6205e) >= 0 && t4 < i4) {
                    view2 = view3;
                    if (t4 == 0) {
                        break;
                    }
                    i4 = t4;
                }
            }
            return view2;
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        int f6214a;

        /* renamed from: b  reason: collision with root package name */
        int f6215b;

        /* renamed from: c  reason: collision with root package name */
        boolean f6216c;

        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* renamed from: b */
            public d[] newArray(int i4) {
                return new d[i4];
            }
        }

        public d() {
        }

        public int describeContents() {
            return 0;
        }

        /* access modifiers changed from: package-private */
        public boolean t() {
            if (this.f6214a >= 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void u() {
            this.f6214a = -1;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f6214a);
            parcel.writeInt(this.f6215b);
            parcel.writeInt(this.f6216c ? 1 : 0);
        }

        d(Parcel parcel) {
            this.f6214a = parcel.readInt();
            this.f6215b = parcel.readInt();
            this.f6216c = parcel.readInt() != 1 ? false : true;
        }

        public d(d dVar) {
            this.f6214a = dVar.f6214a;
            this.f6215b = dVar.f6215b;
            this.f6216c = dVar.f6216c;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private void A2(RecyclerView.u uVar, RecyclerView.z zVar, int i4, int i5) {
        boolean z3;
        if (zVar.g() && W() != 0 && !zVar.e() && W1()) {
            List k4 = uVar.k();
            int size = k4.size();
            int q02 = q0(V(0));
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < size; i8++) {
                RecyclerView.D d4 = (RecyclerView.D) k4.get(i8);
                if (!d4.v()) {
                    if (d4.m() < q02) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3 != this.f6189x) {
                        i6 += this.f6186u.e(d4.f6318a);
                    } else {
                        i7 += this.f6186u.e(d4.f6318a);
                    }
                }
            }
            this.f6185t.f6212l = k4;
            if (i6 > 0) {
                T2(q0(u2()), i4);
                c cVar = this.f6185t;
                cVar.f6208h = i6;
                cVar.f6203c = 0;
                cVar.a();
                f2(uVar, this.f6185t, zVar, false);
            }
            if (i7 > 0) {
                R2(q0(t2()), i5);
                c cVar2 = this.f6185t;
                cVar2.f6208h = i7;
                cVar2.f6203c = 0;
                cVar2.a();
                f2(uVar, this.f6185t, zVar, false);
            }
            this.f6185t.f6212l = null;
        }
    }

    private void C2(RecyclerView.u uVar, c cVar) {
        if (cVar.f6201a && !cVar.f6213m) {
            int i4 = cVar.f6207g;
            int i5 = cVar.f6209i;
            if (cVar.f6206f == -1) {
                E2(uVar, i4, i5);
            } else {
                F2(uVar, i4, i5);
            }
        }
    }

    private void D2(RecyclerView.u uVar, int i4, int i5) {
        if (i4 != i5) {
            if (i5 > i4) {
                for (int i6 = i5 - 1; i6 >= i4; i6--) {
                    y1(i6, uVar);
                }
                return;
            }
            while (i4 > i5) {
                y1(i4, uVar);
                i4--;
            }
        }
    }

    private void E2(RecyclerView.u uVar, int i4, int i5) {
        int W3 = W();
        if (i4 >= 0) {
            int h4 = (this.f6186u.h() - i4) + i5;
            if (this.f6189x) {
                for (int i6 = 0; i6 < W3; i6++) {
                    View V3 = V(i6);
                    if (this.f6186u.g(V3) < h4 || this.f6186u.q(V3) < h4) {
                        D2(uVar, 0, i6);
                        return;
                    }
                }
                return;
            }
            int i7 = W3 - 1;
            for (int i8 = i7; i8 >= 0; i8--) {
                View V4 = V(i8);
                if (this.f6186u.g(V4) < h4 || this.f6186u.q(V4) < h4) {
                    D2(uVar, i7, i8);
                    return;
                }
            }
        }
    }

    private void F2(RecyclerView.u uVar, int i4, int i5) {
        if (i4 >= 0) {
            int i6 = i4 - i5;
            int W3 = W();
            if (this.f6189x) {
                int i7 = W3 - 1;
                for (int i8 = i7; i8 >= 0; i8--) {
                    View V3 = V(i8);
                    if (this.f6186u.d(V3) > i6 || this.f6186u.p(V3) > i6) {
                        D2(uVar, i7, i8);
                        return;
                    }
                }
                return;
            }
            for (int i9 = 0; i9 < W3; i9++) {
                View V4 = V(i9);
                if (this.f6186u.d(V4) > i6 || this.f6186u.p(V4) > i6) {
                    D2(uVar, 0, i9);
                    return;
                }
            }
        }
    }

    private void H2() {
        if (this.f6184s == 1 || !x2()) {
            this.f6189x = this.f6188w;
        } else {
            this.f6189x = !this.f6188w;
        }
    }

    private boolean N2(RecyclerView.u uVar, RecyclerView.z zVar, a aVar) {
        View q22;
        boolean z3;
        boolean z4 = false;
        if (W() == 0) {
            return false;
        }
        View i02 = i0();
        if (i02 == null || !aVar.d(i02, zVar)) {
            boolean z5 = this.f6187v;
            boolean z6 = this.f6190y;
            if (z5 != z6 || (q22 = q2(uVar, zVar, aVar.f6195d, z6)) == null) {
                return false;
            }
            aVar.b(q22, q0(q22));
            if (!zVar.e() && W1()) {
                int g4 = this.f6186u.g(q22);
                int d4 = this.f6186u.d(q22);
                int m4 = this.f6186u.m();
                int i4 = this.f6186u.i();
                if (d4 > m4 || g4 >= m4) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (g4 >= i4 && d4 > i4) {
                    z4 = true;
                }
                if (z3 || z4) {
                    if (aVar.f6195d) {
                        m4 = i4;
                    }
                    aVar.f6194c = m4;
                }
            }
            return true;
        }
        aVar.c(i02, q0(i02));
        return true;
    }

    private boolean O2(RecyclerView.z zVar, a aVar) {
        int i4;
        boolean z3;
        int i5;
        boolean z4 = false;
        if (!zVar.e() && (i4 = this.f6176A) != -1) {
            if (i4 < 0 || i4 >= zVar.b()) {
                this.f6176A = -1;
                this.f6177B = Integer.MIN_VALUE;
            } else {
                aVar.f6193b = this.f6176A;
                d dVar = this.f6179D;
                if (dVar != null && dVar.t()) {
                    boolean z5 = this.f6179D.f6216c;
                    aVar.f6195d = z5;
                    if (z5) {
                        aVar.f6194c = this.f6186u.i() - this.f6179D.f6215b;
                    } else {
                        aVar.f6194c = this.f6186u.m() + this.f6179D.f6215b;
                    }
                    return true;
                } else if (this.f6177B == Integer.MIN_VALUE) {
                    View P3 = P(this.f6176A);
                    if (P3 == null) {
                        if (W() > 0) {
                            if (this.f6176A < q0(V(0))) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3 == this.f6189x) {
                                z4 = true;
                            }
                            aVar.f6195d = z4;
                        }
                        aVar.a();
                    } else if (this.f6186u.e(P3) > this.f6186u.n()) {
                        aVar.a();
                        return true;
                    } else if (this.f6186u.g(P3) - this.f6186u.m() < 0) {
                        aVar.f6194c = this.f6186u.m();
                        aVar.f6195d = false;
                        return true;
                    } else if (this.f6186u.i() - this.f6186u.d(P3) < 0) {
                        aVar.f6194c = this.f6186u.i();
                        aVar.f6195d = true;
                        return true;
                    } else {
                        if (aVar.f6195d) {
                            i5 = this.f6186u.d(P3) + this.f6186u.o();
                        } else {
                            i5 = this.f6186u.g(P3);
                        }
                        aVar.f6194c = i5;
                    }
                    return true;
                } else {
                    boolean z6 = this.f6189x;
                    aVar.f6195d = z6;
                    if (z6) {
                        aVar.f6194c = this.f6186u.i() - this.f6177B;
                    } else {
                        aVar.f6194c = this.f6186u.m() + this.f6177B;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private void P2(RecyclerView.u uVar, RecyclerView.z zVar, a aVar) {
        int i4;
        if (!O2(zVar, aVar) && !N2(uVar, zVar, aVar)) {
            aVar.a();
            if (this.f6190y) {
                i4 = zVar.b() - 1;
            } else {
                i4 = 0;
            }
            aVar.f6193b = i4;
        }
    }

    private void Q2(int i4, int i5, boolean z3, RecyclerView.z zVar) {
        int i6;
        int i7;
        this.f6185t.f6213m = G2();
        this.f6185t.f6206f = i4;
        int[] iArr = this.f6183H;
        boolean z4 = false;
        iArr[0] = 0;
        int i8 = 1;
        iArr[1] = 0;
        X1(zVar, iArr);
        int max = Math.max(0, this.f6183H[0]);
        int max2 = Math.max(0, this.f6183H[1]);
        if (i4 == 1) {
            z4 = true;
        }
        c cVar = this.f6185t;
        if (z4) {
            i6 = max2;
        } else {
            i6 = max;
        }
        cVar.f6208h = i6;
        if (!z4) {
            max = max2;
        }
        cVar.f6209i = max;
        if (z4) {
            cVar.f6208h = i6 + this.f6186u.j();
            View t22 = t2();
            c cVar2 = this.f6185t;
            if (this.f6189x) {
                i8 = -1;
            }
            cVar2.f6205e = i8;
            int q02 = q0(t22);
            c cVar3 = this.f6185t;
            cVar2.f6204d = q02 + cVar3.f6205e;
            cVar3.f6202b = this.f6186u.d(t22);
            i7 = this.f6186u.d(t22) - this.f6186u.i();
        } else {
            View u22 = u2();
            this.f6185t.f6208h += this.f6186u.m();
            c cVar4 = this.f6185t;
            if (!this.f6189x) {
                i8 = -1;
            }
            cVar4.f6205e = i8;
            int q03 = q0(u22);
            c cVar5 = this.f6185t;
            cVar4.f6204d = q03 + cVar5.f6205e;
            cVar5.f6202b = this.f6186u.g(u22);
            i7 = (-this.f6186u.g(u22)) + this.f6186u.m();
        }
        c cVar6 = this.f6185t;
        cVar6.f6203c = i5;
        if (z3) {
            cVar6.f6203c = i5 - i7;
        }
        cVar6.f6207g = i7;
    }

    private void R2(int i4, int i5) {
        int i6;
        this.f6185t.f6203c = this.f6186u.i() - i5;
        c cVar = this.f6185t;
        if (this.f6189x) {
            i6 = -1;
        } else {
            i6 = 1;
        }
        cVar.f6205e = i6;
        cVar.f6204d = i4;
        cVar.f6206f = 1;
        cVar.f6202b = i5;
        cVar.f6207g = Integer.MIN_VALUE;
    }

    private void S2(a aVar) {
        R2(aVar.f6193b, aVar.f6194c);
    }

    private void T2(int i4, int i5) {
        int i6;
        this.f6185t.f6203c = i5 - this.f6186u.m();
        c cVar = this.f6185t;
        cVar.f6204d = i4;
        if (this.f6189x) {
            i6 = 1;
        } else {
            i6 = -1;
        }
        cVar.f6205e = i6;
        cVar.f6206f = -1;
        cVar.f6202b = i5;
        cVar.f6207g = Integer.MIN_VALUE;
    }

    private void U2(a aVar) {
        T2(aVar.f6193b, aVar.f6194c);
    }

    private int Z1(RecyclerView.z zVar) {
        if (W() == 0) {
            return 0;
        }
        e2();
        p pVar = this.f6186u;
        View i22 = i2(!this.f6191z, true);
        return s.a(zVar, pVar, i22, h2(!this.f6191z, true), this, this.f6191z);
    }

    private int a2(RecyclerView.z zVar) {
        if (W() == 0) {
            return 0;
        }
        e2();
        p pVar = this.f6186u;
        View i22 = i2(!this.f6191z, true);
        return s.b(zVar, pVar, i22, h2(!this.f6191z, true), this, this.f6191z, this.f6189x);
    }

    private int b2(RecyclerView.z zVar) {
        if (W() == 0) {
            return 0;
        }
        e2();
        p pVar = this.f6186u;
        View i22 = i2(!this.f6191z, true);
        return s.c(zVar, pVar, i22, h2(!this.f6191z, true), this, this.f6191z);
    }

    private View g2() {
        return m2(0, W());
    }

    private View k2() {
        return m2(W() - 1, -1);
    }

    private View o2() {
        if (this.f6189x) {
            return g2();
        }
        return k2();
    }

    private View p2() {
        if (this.f6189x) {
            return k2();
        }
        return g2();
    }

    private int r2(int i4, RecyclerView.u uVar, RecyclerView.z zVar, boolean z3) {
        int i5;
        int i6 = this.f6186u.i() - i4;
        if (i6 <= 0) {
            return 0;
        }
        int i7 = -I2(-i6, uVar, zVar);
        int i8 = i4 + i7;
        if (!z3 || (i5 = this.f6186u.i() - i8) <= 0) {
            return i7;
        }
        this.f6186u.r(i5);
        return i5 + i7;
    }

    private int s2(int i4, RecyclerView.u uVar, RecyclerView.z zVar, boolean z3) {
        int m4;
        int m5 = i4 - this.f6186u.m();
        if (m5 <= 0) {
            return 0;
        }
        int i5 = -I2(m5, uVar, zVar);
        int i6 = i4 + i5;
        if (!z3 || (m4 = i6 - this.f6186u.m()) <= 0) {
            return i5;
        }
        this.f6186u.r(-m4);
        return i5 - m4;
    }

    private View t2() {
        int i4;
        if (this.f6189x) {
            i4 = 0;
        } else {
            i4 = W() - 1;
        }
        return V(i4);
    }

    private View u2() {
        int i4;
        if (this.f6189x) {
            i4 = W() - 1;
        } else {
            i4 = 0;
        }
        return V(i4);
    }

    public void B(int i4, int i5, RecyclerView.z zVar, RecyclerView.o.c cVar) {
        int i6;
        if (this.f6184s != 0) {
            i4 = i5;
        }
        if (W() != 0 && i4 != 0) {
            e2();
            if (i4 > 0) {
                i6 = 1;
            } else {
                i6 = -1;
            }
            Q2(i6, Math.abs(i4), true, zVar);
            Y1(zVar, this.f6185t, cVar);
        }
    }

    public boolean B0() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void B2(RecyclerView.u uVar, RecyclerView.z zVar, a aVar, int i4) {
    }

    public void C(int i4, RecyclerView.o.c cVar) {
        boolean z3;
        int i5;
        d dVar = this.f6179D;
        int i6 = -1;
        if (dVar == null || !dVar.t()) {
            H2();
            z3 = this.f6189x;
            i5 = this.f6176A;
            if (i5 == -1) {
                if (z3) {
                    i5 = i4 - 1;
                } else {
                    i5 = 0;
                }
            }
        } else {
            d dVar2 = this.f6179D;
            z3 = dVar2.f6216c;
            i5 = dVar2.f6214a;
        }
        if (!z3) {
            i6 = 1;
        }
        for (int i7 = 0; i7 < this.f6182G && i5 >= 0 && i5 < i4; i7++) {
            cVar.a(i5, 0);
            i5 += i6;
        }
    }

    public int D(RecyclerView.z zVar) {
        return Z1(zVar);
    }

    public int E(RecyclerView.z zVar) {
        return a2(zVar);
    }

    public int F(RecyclerView.z zVar) {
        return b2(zVar);
    }

    public int G(RecyclerView.z zVar) {
        return Z1(zVar);
    }

    /* access modifiers changed from: package-private */
    public boolean G2() {
        if (this.f6186u.k() == 0 && this.f6186u.h() == 0) {
            return true;
        }
        return false;
    }

    public int H(RecyclerView.z zVar) {
        return a2(zVar);
    }

    public int H1(int i4, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f6184s == 1) {
            return 0;
        }
        return I2(i4, uVar, zVar);
    }

    public int I(RecyclerView.z zVar) {
        return b2(zVar);
    }

    public void I1(int i4) {
        this.f6176A = i4;
        this.f6177B = Integer.MIN_VALUE;
        d dVar = this.f6179D;
        if (dVar != null) {
            dVar.u();
        }
        E1();
    }

    /* access modifiers changed from: package-private */
    public int I2(int i4, RecyclerView.u uVar, RecyclerView.z zVar) {
        int i5;
        if (W() == 0 || i4 == 0) {
            return 0;
        }
        e2();
        this.f6185t.f6201a = true;
        if (i4 > 0) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        int abs = Math.abs(i4);
        Q2(i5, abs, true, zVar);
        c cVar = this.f6185t;
        int f22 = cVar.f6207g + f2(uVar, cVar, zVar, false);
        if (f22 < 0) {
            return 0;
        }
        if (abs > f22) {
            i4 = i5 * f22;
        }
        this.f6186u.r(-i4);
        this.f6185t.f6211k = i4;
        return i4;
    }

    public int J1(int i4, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f6184s == 0) {
            return 0;
        }
        return I2(i4, uVar, zVar);
    }

    public void J2(int i4, int i5) {
        this.f6176A = i4;
        this.f6177B = i5;
        d dVar = this.f6179D;
        if (dVar != null) {
            dVar.u();
        }
        E1();
    }

    public void K2(int i4) {
        if (i4 == 0 || i4 == 1) {
            t((String) null);
            if (i4 != this.f6184s || this.f6186u == null) {
                p b4 = p.b(this, i4);
                this.f6186u = b4;
                this.f6180E.f6192a = b4;
                this.f6184s = i4;
                E1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i4);
    }

    public void L2(boolean z3) {
        t((String) null);
        if (z3 != this.f6188w) {
            this.f6188w = z3;
            E1();
        }
    }

    public void M2(boolean z3) {
        t((String) null);
        if (this.f6190y != z3) {
            this.f6190y = z3;
            E1();
        }
    }

    public View P(int i4) {
        int W3 = W();
        if (W3 == 0) {
            return null;
        }
        int q02 = i4 - q0(V(0));
        if (q02 >= 0 && q02 < W3) {
            View V3 = V(q02);
            if (q0(V3) == i4) {
                return V3;
            }
        }
        return super.P(i4);
    }

    public RecyclerView.p Q() {
        return new RecyclerView.p(-2, -2);
    }

    /* access modifiers changed from: package-private */
    public boolean R1() {
        if (k0() == 1073741824 || y0() == 1073741824 || !z0()) {
            return false;
        }
        return true;
    }

    public void S0(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.S0(recyclerView, uVar);
        if (this.f6178C) {
            v1(uVar);
            uVar.c();
        }
    }

    public View T0(View view, int i4, RecyclerView.u uVar, RecyclerView.z zVar) {
        int c22;
        View view2;
        View view3;
        H2();
        if (W() == 0 || (c22 = c2(i4)) == Integer.MIN_VALUE) {
            return null;
        }
        e2();
        Q2(c22, (int) (((float) this.f6186u.n()) * 0.33333334f), false, zVar);
        c cVar = this.f6185t;
        cVar.f6207g = Integer.MIN_VALUE;
        cVar.f6201a = false;
        f2(uVar, cVar, zVar, true);
        if (c22 == -1) {
            view2 = p2();
        } else {
            view2 = o2();
        }
        if (c22 == -1) {
            view3 = u2();
        } else {
            view3 = t2();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    public void T1(RecyclerView recyclerView, RecyclerView.z zVar, int i4) {
        l lVar = new l(recyclerView.getContext());
        lVar.p(i4);
        U1(lVar);
    }

    public void U0(AccessibilityEvent accessibilityEvent) {
        super.U0(accessibilityEvent);
        if (W() > 0) {
            accessibilityEvent.setFromIndex(j2());
            accessibilityEvent.setToIndex(l2());
        }
    }

    public boolean W1() {
        if (this.f6179D == null && this.f6187v == this.f6190y) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void X1(RecyclerView.z zVar, int[] iArr) {
        int i4;
        int v22 = v2(zVar);
        if (this.f6185t.f6206f == -1) {
            i4 = 0;
        } else {
            i4 = v22;
            v22 = 0;
        }
        iArr[0] = v22;
        iArr[1] = i4;
    }

    /* access modifiers changed from: package-private */
    public void Y1(RecyclerView.z zVar, c cVar, RecyclerView.o.c cVar2) {
        int i4 = cVar.f6204d;
        if (i4 >= 0 && i4 < zVar.b()) {
            cVar2.a(i4, Math.max(0, cVar.f6207g));
        }
    }

    /* access modifiers changed from: package-private */
    public int c2(int i4) {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 17) {
                    if (i4 != 33) {
                        if (i4 != 66) {
                            if (i4 != 130) {
                                return Integer.MIN_VALUE;
                            }
                            if (this.f6184s == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f6184s == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f6184s == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f6184s == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f6184s != 1 && x2()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f6184s != 1 && x2()) {
            return 1;
        } else {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    public c d2() {
        return new c();
    }

    /* access modifiers changed from: package-private */
    public void e2() {
        if (this.f6185t == null) {
            this.f6185t = d2();
        }
    }

    public PointF f(int i4) {
        if (W() == 0) {
            return null;
        }
        boolean z3 = false;
        int i5 = 1;
        if (i4 < q0(V(0))) {
            z3 = true;
        }
        if (z3 != this.f6189x) {
            i5 = -1;
        }
        if (this.f6184s == 0) {
            return new PointF((float) i5, 0.0f);
        }
        return new PointF(0.0f, (float) i5);
    }

    /* access modifiers changed from: package-private */
    public int f2(RecyclerView.u uVar, c cVar, RecyclerView.z zVar, boolean z3) {
        int i4 = cVar.f6203c;
        int i5 = cVar.f6207g;
        if (i5 != Integer.MIN_VALUE) {
            if (i4 < 0) {
                cVar.f6207g = i5 + i4;
            }
            C2(uVar, cVar);
        }
        int i6 = cVar.f6203c + cVar.f6208h;
        b bVar = this.f6181F;
        while (true) {
            if ((!cVar.f6213m && i6 <= 0) || !cVar.c(zVar)) {
                break;
            }
            bVar.a();
            z2(uVar, zVar, cVar, bVar);
            if (!bVar.f6198b) {
                cVar.f6202b += bVar.f6197a * cVar.f6206f;
                if (!bVar.f6199c || cVar.f6212l != null || !zVar.e()) {
                    int i7 = cVar.f6203c;
                    int i8 = bVar.f6197a;
                    cVar.f6203c = i7 - i8;
                    i6 -= i8;
                }
                int i9 = cVar.f6207g;
                if (i9 != Integer.MIN_VALUE) {
                    int i10 = i9 + bVar.f6197a;
                    cVar.f6207g = i10;
                    int i11 = cVar.f6203c;
                    if (i11 < 0) {
                        cVar.f6207g = i10 + i11;
                    }
                    C2(uVar, cVar);
                }
                if (z3 && bVar.f6200d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i4 - cVar.f6203c;
    }

    public void h1(RecyclerView.u uVar, RecyclerView.z zVar) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int r22;
        int i9;
        View P3;
        int g4;
        int i10;
        int i11 = -1;
        if (!(this.f6179D == null && this.f6176A == -1) && zVar.b() == 0) {
            v1(uVar);
            return;
        }
        d dVar = this.f6179D;
        if (dVar != null && dVar.t()) {
            this.f6176A = this.f6179D.f6214a;
        }
        e2();
        this.f6185t.f6201a = false;
        H2();
        View i02 = i0();
        a aVar = this.f6180E;
        if (!aVar.f6196e || this.f6176A != -1 || this.f6179D != null) {
            aVar.e();
            a aVar2 = this.f6180E;
            aVar2.f6195d = this.f6189x ^ this.f6190y;
            P2(uVar, zVar, aVar2);
            this.f6180E.f6196e = true;
        } else if (i02 != null && (this.f6186u.g(i02) >= this.f6186u.i() || this.f6186u.d(i02) <= this.f6186u.m())) {
            this.f6180E.c(i02, q0(i02));
        }
        c cVar = this.f6185t;
        if (cVar.f6211k >= 0) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        cVar.f6206f = i4;
        int[] iArr = this.f6183H;
        iArr[0] = 0;
        iArr[1] = 0;
        X1(zVar, iArr);
        int max = Math.max(0, this.f6183H[0]) + this.f6186u.m();
        int max2 = Math.max(0, this.f6183H[1]) + this.f6186u.j();
        if (!(!zVar.e() || (i9 = this.f6176A) == -1 || this.f6177B == Integer.MIN_VALUE || (P3 = P(i9)) == null)) {
            if (this.f6189x) {
                i10 = this.f6186u.i() - this.f6186u.d(P3);
                g4 = this.f6177B;
            } else {
                g4 = this.f6186u.g(P3) - this.f6186u.m();
                i10 = this.f6177B;
            }
            int i12 = i10 - g4;
            if (i12 > 0) {
                max += i12;
            } else {
                max2 -= i12;
            }
        }
        a aVar3 = this.f6180E;
        if (!aVar3.f6195d ? !this.f6189x : this.f6189x) {
            i11 = 1;
        }
        B2(uVar, zVar, aVar3, i11);
        J(uVar);
        this.f6185t.f6213m = G2();
        this.f6185t.f6210j = zVar.e();
        this.f6185t.f6209i = 0;
        a aVar4 = this.f6180E;
        if (aVar4.f6195d) {
            U2(aVar4);
            c cVar2 = this.f6185t;
            cVar2.f6208h = max;
            f2(uVar, cVar2, zVar, false);
            c cVar3 = this.f6185t;
            i6 = cVar3.f6202b;
            int i13 = cVar3.f6204d;
            int i14 = cVar3.f6203c;
            if (i14 > 0) {
                max2 += i14;
            }
            S2(this.f6180E);
            c cVar4 = this.f6185t;
            cVar4.f6208h = max2;
            cVar4.f6204d += cVar4.f6205e;
            f2(uVar, cVar4, zVar, false);
            c cVar5 = this.f6185t;
            i5 = cVar5.f6202b;
            int i15 = cVar5.f6203c;
            if (i15 > 0) {
                T2(i13, i6);
                c cVar6 = this.f6185t;
                cVar6.f6208h = i15;
                f2(uVar, cVar6, zVar, false);
                i6 = this.f6185t.f6202b;
            }
        } else {
            S2(aVar4);
            c cVar7 = this.f6185t;
            cVar7.f6208h = max2;
            f2(uVar, cVar7, zVar, false);
            c cVar8 = this.f6185t;
            i5 = cVar8.f6202b;
            int i16 = cVar8.f6204d;
            int i17 = cVar8.f6203c;
            if (i17 > 0) {
                max += i17;
            }
            U2(this.f6180E);
            c cVar9 = this.f6185t;
            cVar9.f6208h = max;
            cVar9.f6204d += cVar9.f6205e;
            f2(uVar, cVar9, zVar, false);
            c cVar10 = this.f6185t;
            i6 = cVar10.f6202b;
            int i18 = cVar10.f6203c;
            if (i18 > 0) {
                R2(i16, i5);
                c cVar11 = this.f6185t;
                cVar11.f6208h = i18;
                f2(uVar, cVar11, zVar, false);
                i5 = this.f6185t.f6202b;
            }
        }
        if (W() > 0) {
            if (this.f6189x ^ this.f6190y) {
                int r23 = r2(i5, uVar, zVar, true);
                i7 = i6 + r23;
                i8 = i5 + r23;
                r22 = s2(i7, uVar, zVar, false);
            } else {
                int s22 = s2(i6, uVar, zVar, true);
                i7 = i6 + s22;
                i8 = i5 + s22;
                r22 = r2(i8, uVar, zVar, false);
            }
            i6 = i7 + r22;
            i5 = i8 + r22;
        }
        A2(uVar, zVar, i6, i5);
        if (!zVar.e()) {
            this.f6186u.s();
        } else {
            this.f6180E.e();
        }
        this.f6187v = this.f6190y;
    }

    /* access modifiers changed from: package-private */
    public View h2(boolean z3, boolean z4) {
        if (this.f6189x) {
            return n2(0, W(), z3, z4);
        }
        return n2(W() - 1, -1, z3, z4);
    }

    public void i1(RecyclerView.z zVar) {
        super.i1(zVar);
        this.f6179D = null;
        this.f6176A = -1;
        this.f6177B = Integer.MIN_VALUE;
        this.f6180E.e();
    }

    /* access modifiers changed from: package-private */
    public View i2(boolean z3, boolean z4) {
        if (this.f6189x) {
            return n2(W() - 1, -1, z3, z4);
        }
        return n2(0, W(), z3, z4);
    }

    public int j2() {
        View n22 = n2(0, W(), false, true);
        if (n22 == null) {
            return -1;
        }
        return q0(n22);
    }

    public int l2() {
        View n22 = n2(W() - 1, -1, false, true);
        if (n22 == null) {
            return -1;
        }
        return q0(n22);
    }

    public void m1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.f6179D = dVar;
            if (this.f6176A != -1) {
                dVar.u();
            }
            E1();
        }
    }

    /* access modifiers changed from: package-private */
    public View m2(int i4, int i5) {
        int i6;
        int i7;
        e2();
        if (i5 <= i4 && i5 >= i4) {
            return V(i4);
        }
        if (this.f6186u.g(V(i4)) < this.f6186u.m()) {
            i7 = 16644;
            i6 = 16388;
        } else {
            i7 = 4161;
            i6 = 4097;
        }
        if (this.f6184s == 0) {
            return this.f6358e.a(i4, i5, i7, i6);
        }
        return this.f6359f.a(i4, i5, i7, i6);
    }

    public Parcelable n1() {
        if (this.f6179D != null) {
            return new d(this.f6179D);
        }
        d dVar = new d();
        if (W() > 0) {
            e2();
            boolean z3 = this.f6187v ^ this.f6189x;
            dVar.f6216c = z3;
            if (z3) {
                View t22 = t2();
                dVar.f6215b = this.f6186u.i() - this.f6186u.d(t22);
                dVar.f6214a = q0(t22);
            } else {
                View u22 = u2();
                dVar.f6214a = q0(u22);
                dVar.f6215b = this.f6186u.g(u22) - this.f6186u.m();
            }
        } else {
            dVar.u();
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public View n2(int i4, int i5, boolean z3, boolean z4) {
        int i6;
        e2();
        int i7 = 320;
        if (z3) {
            i6 = 24579;
        } else {
            i6 = 320;
        }
        if (!z4) {
            i7 = 0;
        }
        if (this.f6184s == 0) {
            return this.f6358e.a(i4, i5, i6, i7);
        }
        return this.f6359f.a(i4, i5, i6, i7);
    }

    /* access modifiers changed from: package-private */
    public View q2(RecyclerView.u uVar, RecyclerView.z zVar, boolean z3, boolean z4) {
        int i4;
        int i5;
        int i6;
        boolean z5;
        boolean z6;
        e2();
        int W3 = W();
        if (z4) {
            i6 = W() - 1;
            i5 = -1;
            i4 = -1;
        } else {
            i5 = W3;
            i6 = 0;
            i4 = 1;
        }
        int b4 = zVar.b();
        int m4 = this.f6186u.m();
        int i7 = this.f6186u.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i6 != i5) {
            View V3 = V(i6);
            int q02 = q0(V3);
            int g4 = this.f6186u.g(V3);
            int d4 = this.f6186u.d(V3);
            if (q02 >= 0 && q02 < b4) {
                if (!((RecyclerView.p) V3.getLayoutParams()).v()) {
                    if (d4 > m4 || g4 >= m4) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (g4 < i7 || d4 <= i7) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (!z5 && !z6) {
                        return V3;
                    }
                    if (z3) {
                        if (!z6) {
                            if (view != null) {
                            }
                            view = V3;
                        }
                    } else if (!z5) {
                        if (view != null) {
                        }
                        view = V3;
                    }
                    view2 = V3;
                } else if (view3 == null) {
                    view3 = V3;
                }
            }
            i6 += i4;
        }
        if (view != null) {
            return view;
        }
        if (view2 != null) {
            return view2;
        }
        return view3;
    }

    public void t(String str) {
        if (this.f6179D == null) {
            super.t(str);
        }
    }

    /* access modifiers changed from: protected */
    public int v2(RecyclerView.z zVar) {
        if (zVar.d()) {
            return this.f6186u.n();
        }
        return 0;
    }

    public int w2() {
        return this.f6184s;
    }

    public boolean x() {
        if (this.f6184s == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean x2() {
        if (m0() == 1) {
            return true;
        }
        return false;
    }

    public boolean y() {
        if (this.f6184s == 1) {
            return true;
        }
        return false;
    }

    public boolean y2() {
        return this.f6191z;
    }

    /* access modifiers changed from: package-private */
    public void z2(RecyclerView.u uVar, RecyclerView.z zVar, c cVar, b bVar) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        boolean z4;
        View d4 = cVar.d(uVar);
        if (d4 == null) {
            bVar.f6198b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) d4.getLayoutParams();
        if (cVar.f6212l == null) {
            boolean z5 = this.f6189x;
            if (cVar.f6206f == -1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z5 == z4) {
                q(d4);
            } else {
                r(d4, 0);
            }
        } else {
            boolean z6 = this.f6189x;
            if (cVar.f6206f == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z6 == z3) {
                o(d4);
            } else {
                p(d4, 0);
            }
        }
        K0(d4, 0, 0);
        bVar.f6197a = this.f6186u.e(d4);
        if (this.f6184s == 1) {
            if (x2()) {
                i8 = x0() - getPaddingRight();
                i7 = i8 - this.f6186u.f(d4);
            } else {
                i7 = getPaddingLeft();
                i8 = this.f6186u.f(d4) + i7;
            }
            if (cVar.f6206f == -1) {
                int i9 = cVar.f6202b;
                i4 = i9;
                i5 = i8;
                i6 = i9 - bVar.f6197a;
            } else {
                int i10 = cVar.f6202b;
                i6 = i10;
                i5 = i8;
                i4 = bVar.f6197a + i10;
            }
        } else {
            int paddingTop = getPaddingTop();
            int f4 = this.f6186u.f(d4) + paddingTop;
            if (cVar.f6206f == -1) {
                int i11 = cVar.f6202b;
                i5 = i11;
                i6 = paddingTop;
                i4 = f4;
                i7 = i11 - bVar.f6197a;
            } else {
                int i12 = cVar.f6202b;
                i6 = paddingTop;
                i5 = bVar.f6197a + i12;
                i4 = f4;
                i7 = i12;
            }
        }
        J0(d4, i7, i6, i5, i4);
        if (pVar.v() || pVar.u()) {
            bVar.f6199c = true;
        }
        bVar.f6200d = d4.hasFocusable();
    }

    public LinearLayoutManager(Context context, int i4, boolean z3) {
        this.f6184s = 1;
        this.f6188w = false;
        this.f6189x = false;
        this.f6190y = false;
        this.f6191z = true;
        this.f6176A = -1;
        this.f6177B = Integer.MIN_VALUE;
        this.f6179D = null;
        this.f6180E = new a();
        this.f6181F = new b();
        this.f6182G = 2;
        this.f6183H = new int[2];
        K2(i4);
        L2(z3);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.f6184s = 1;
        this.f6188w = false;
        this.f6189x = false;
        this.f6190y = false;
        this.f6191z = true;
        this.f6176A = -1;
        this.f6177B = Integer.MIN_VALUE;
        this.f6179D = null;
        this.f6180E = new a();
        this.f6181F = new b();
        this.f6182G = 2;
        this.f6183H = new int[2];
        RecyclerView.o.d r02 = RecyclerView.o.r0(context, attributeSet, i4, i5);
        K2(r02.f6374a);
        L2(r02.f6376c);
        M2(r02.f6377d);
    }
}
