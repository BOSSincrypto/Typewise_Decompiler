package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.y.b {

    /* renamed from: A  reason: collision with root package name */
    boolean f6431A = false;

    /* renamed from: B  reason: collision with root package name */
    private BitSet f6432B;

    /* renamed from: C  reason: collision with root package name */
    int f6433C = -1;

    /* renamed from: D  reason: collision with root package name */
    int f6434D = Integer.MIN_VALUE;

    /* renamed from: E  reason: collision with root package name */
    d f6435E = new d();

    /* renamed from: F  reason: collision with root package name */
    private int f6436F = 2;

    /* renamed from: G  reason: collision with root package name */
    private boolean f6437G;

    /* renamed from: H  reason: collision with root package name */
    private boolean f6438H;

    /* renamed from: I  reason: collision with root package name */
    private e f6439I;

    /* renamed from: J  reason: collision with root package name */
    private int f6440J;

    /* renamed from: K  reason: collision with root package name */
    private final Rect f6441K = new Rect();

    /* renamed from: L  reason: collision with root package name */
    private final b f6442L = new b();

    /* renamed from: M  reason: collision with root package name */
    private boolean f6443M = false;

    /* renamed from: N  reason: collision with root package name */
    private boolean f6444N = true;

    /* renamed from: O  reason: collision with root package name */
    private int[] f6445O;

    /* renamed from: P  reason: collision with root package name */
    private final Runnable f6446P = new a();

    /* renamed from: s  reason: collision with root package name */
    private int f6447s = -1;

    /* renamed from: t  reason: collision with root package name */
    f[] f6448t;

    /* renamed from: u  reason: collision with root package name */
    p f6449u;

    /* renamed from: v  reason: collision with root package name */
    p f6450v;

    /* renamed from: w  reason: collision with root package name */
    private int f6451w;

    /* renamed from: x  reason: collision with root package name */
    private int f6452x;

    /* renamed from: y  reason: collision with root package name */
    private final k f6453y;

    /* renamed from: z  reason: collision with root package name */
    boolean f6454z = false;

    class a implements Runnable {
        a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.d2();
        }
    }

    class b {

        /* renamed from: a  reason: collision with root package name */
        int f6456a;

        /* renamed from: b  reason: collision with root package name */
        int f6457b;

        /* renamed from: c  reason: collision with root package name */
        boolean f6458c;

        /* renamed from: d  reason: collision with root package name */
        boolean f6459d;

        /* renamed from: e  reason: collision with root package name */
        boolean f6460e;

        /* renamed from: f  reason: collision with root package name */
        int[] f6461f;

        b() {
            c();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int i4;
            if (this.f6458c) {
                i4 = StaggeredGridLayoutManager.this.f6449u.i();
            } else {
                i4 = StaggeredGridLayoutManager.this.f6449u.m();
            }
            this.f6457b = i4;
        }

        /* access modifiers changed from: package-private */
        public void b(int i4) {
            if (this.f6458c) {
                this.f6457b = StaggeredGridLayoutManager.this.f6449u.i() - i4;
            } else {
                this.f6457b = StaggeredGridLayoutManager.this.f6449u.m() + i4;
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f6456a = -1;
            this.f6457b = Integer.MIN_VALUE;
            this.f6458c = false;
            this.f6459d = false;
            this.f6460e = false;
            int[] iArr = this.f6461f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: package-private */
        public void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f6461f;
            if (iArr == null || iArr.length < length) {
                this.f6461f = new int[StaggeredGridLayoutManager.this.f6448t.length];
            }
            for (int i4 = 0; i4 < length; i4++) {
                this.f6461f[i4] = fVarArr[i4].p(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.p {

        /* renamed from: e  reason: collision with root package name */
        f f6463e;

        /* renamed from: f  reason: collision with root package name */
        boolean f6464f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean x() {
            return this.f6464f;
        }

        public c(int i4, int i5) {
            super(i4, i5);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        int f6471a;

        /* renamed from: b  reason: collision with root package name */
        int f6472b;

        /* renamed from: c  reason: collision with root package name */
        int f6473c;

        /* renamed from: d  reason: collision with root package name */
        int[] f6474d;

        /* renamed from: e  reason: collision with root package name */
        int f6475e;

        /* renamed from: f  reason: collision with root package name */
        int[] f6476f;

        /* renamed from: g  reason: collision with root package name */
        List f6477g;

        /* renamed from: h  reason: collision with root package name */
        boolean f6478h;

        /* renamed from: i  reason: collision with root package name */
        boolean f6479i;

        /* renamed from: j  reason: collision with root package name */
        boolean f6480j;

        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            /* renamed from: b */
            public e[] newArray(int i4) {
                return new e[i4];
            }
        }

        public e() {
        }

        public int describeContents() {
            return 0;
        }

        /* access modifiers changed from: package-private */
        public void t() {
            this.f6474d = null;
            this.f6473c = 0;
            this.f6471a = -1;
            this.f6472b = -1;
        }

        /* access modifiers changed from: package-private */
        public void u() {
            this.f6474d = null;
            this.f6473c = 0;
            this.f6475e = 0;
            this.f6476f = null;
            this.f6477g = null;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f6471a);
            parcel.writeInt(this.f6472b);
            parcel.writeInt(this.f6473c);
            if (this.f6473c > 0) {
                parcel.writeIntArray(this.f6474d);
            }
            parcel.writeInt(this.f6475e);
            if (this.f6475e > 0) {
                parcel.writeIntArray(this.f6476f);
            }
            parcel.writeInt(this.f6478h ? 1 : 0);
            parcel.writeInt(this.f6479i ? 1 : 0);
            parcel.writeInt(this.f6480j ? 1 : 0);
            parcel.writeList(this.f6477g);
        }

        e(Parcel parcel) {
            this.f6471a = parcel.readInt();
            this.f6472b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f6473c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f6474d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f6475e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f6476f = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z3 = false;
            this.f6478h = parcel.readInt() == 1;
            this.f6479i = parcel.readInt() == 1;
            this.f6480j = parcel.readInt() == 1 ? true : z3;
            this.f6477g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f6473c = eVar.f6473c;
            this.f6471a = eVar.f6471a;
            this.f6472b = eVar.f6472b;
            this.f6474d = eVar.f6474d;
            this.f6475e = eVar.f6475e;
            this.f6476f = eVar.f6476f;
            this.f6478h = eVar.f6478h;
            this.f6479i = eVar.f6479i;
            this.f6480j = eVar.f6480j;
            this.f6477g = eVar.f6477g;
        }
    }

    class f {

        /* renamed from: a  reason: collision with root package name */
        ArrayList f6481a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        int f6482b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        int f6483c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        int f6484d = 0;

        /* renamed from: e  reason: collision with root package name */
        final int f6485e;

        f(int i4) {
            this.f6485e = i4;
        }

        /* access modifiers changed from: package-private */
        public void a(View view) {
            c n4 = n(view);
            n4.f6463e = this;
            this.f6481a.add(view);
            this.f6483c = Integer.MIN_VALUE;
            if (this.f6481a.size() == 1) {
                this.f6482b = Integer.MIN_VALUE;
            }
            if (n4.v() || n4.u()) {
                this.f6484d += StaggeredGridLayoutManager.this.f6449u.e(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z3, int i4) {
            int i5;
            if (z3) {
                i5 = l(Integer.MIN_VALUE);
            } else {
                i5 = p(Integer.MIN_VALUE);
            }
            e();
            if (i5 != Integer.MIN_VALUE) {
                if (z3 && i5 < StaggeredGridLayoutManager.this.f6449u.i()) {
                    return;
                }
                if (z3 || i5 <= StaggeredGridLayoutManager.this.f6449u.m()) {
                    if (i4 != Integer.MIN_VALUE) {
                        i5 += i4;
                    }
                    this.f6483c = i5;
                    this.f6482b = i5;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            d.a f4;
            ArrayList arrayList = this.f6481a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            c n4 = n(view);
            this.f6483c = StaggeredGridLayoutManager.this.f6449u.d(view);
            if (n4.f6464f && (f4 = StaggeredGridLayoutManager.this.f6435E.f(n4.t())) != null && f4.f6468b == 1) {
                this.f6483c += f4.t(this.f6485e);
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            d.a f4;
            View view = (View) this.f6481a.get(0);
            c n4 = n(view);
            this.f6482b = StaggeredGridLayoutManager.this.f6449u.g(view);
            if (n4.f6464f && (f4 = StaggeredGridLayoutManager.this.f6435E.f(n4.t())) != null && f4.f6468b == -1) {
                this.f6482b -= f4.t(this.f6485e);
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f6481a.clear();
            q();
            this.f6484d = 0;
        }

        public int f() {
            if (StaggeredGridLayoutManager.this.f6454z) {
                return i(this.f6481a.size() - 1, -1, true);
            }
            return i(0, this.f6481a.size(), true);
        }

        public int g() {
            if (StaggeredGridLayoutManager.this.f6454z) {
                return i(0, this.f6481a.size(), true);
            }
            return i(this.f6481a.size() - 1, -1, true);
        }

        /* access modifiers changed from: package-private */
        public int h(int i4, int i5, boolean z3, boolean z4, boolean z5) {
            int i6;
            boolean z6;
            int m4 = StaggeredGridLayoutManager.this.f6449u.m();
            int i7 = StaggeredGridLayoutManager.this.f6449u.i();
            if (i5 > i4) {
                i6 = 1;
            } else {
                i6 = -1;
            }
            while (i4 != i5) {
                View view = (View) this.f6481a.get(i4);
                int g4 = StaggeredGridLayoutManager.this.f6449u.g(view);
                int d4 = StaggeredGridLayoutManager.this.f6449u.d(view);
                boolean z7 = false;
                if (!z5 ? g4 >= i7 : g4 > i7) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                if (!z5 ? d4 > m4 : d4 >= m4) {
                    z7 = true;
                }
                if (z6 && z7) {
                    if (!z3 || !z4) {
                        if (z4) {
                            return StaggeredGridLayoutManager.this.q0(view);
                        }
                        if (g4 < m4 || d4 > i7) {
                            return StaggeredGridLayoutManager.this.q0(view);
                        }
                    } else if (g4 >= m4 && d4 <= i7) {
                        return StaggeredGridLayoutManager.this.q0(view);
                    }
                }
                i4 += i6;
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public int i(int i4, int i5, boolean z3) {
            return h(i4, i5, false, false, z3);
        }

        public int j() {
            return this.f6484d;
        }

        /* access modifiers changed from: package-private */
        public int k() {
            int i4 = this.f6483c;
            if (i4 != Integer.MIN_VALUE) {
                return i4;
            }
            c();
            return this.f6483c;
        }

        /* access modifiers changed from: package-private */
        public int l(int i4) {
            int i5 = this.f6483c;
            if (i5 != Integer.MIN_VALUE) {
                return i5;
            }
            if (this.f6481a.size() == 0) {
                return i4;
            }
            c();
            return this.f6483c;
        }

        public View m(int i4, int i5) {
            View view = null;
            if (i5 != -1) {
                int size = this.f6481a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f6481a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f6454z && staggeredGridLayoutManager.q0(view2) >= i4) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f6454z && staggeredGridLayoutManager2.q0(view2) <= i4) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f6481a.size();
                int i6 = 0;
                while (i6 < size2) {
                    View view3 = (View) this.f6481a.get(i6);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f6454z && staggeredGridLayoutManager3.q0(view3) <= i4) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f6454z && staggeredGridLayoutManager4.q0(view3) >= i4) || !view3.hasFocusable()) {
                        break;
                    }
                    i6++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: package-private */
        public c n(View view) {
            return (c) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        public int o() {
            int i4 = this.f6482b;
            if (i4 != Integer.MIN_VALUE) {
                return i4;
            }
            d();
            return this.f6482b;
        }

        /* access modifiers changed from: package-private */
        public int p(int i4) {
            int i5 = this.f6482b;
            if (i5 != Integer.MIN_VALUE) {
                return i5;
            }
            if (this.f6481a.size() == 0) {
                return i4;
            }
            d();
            return this.f6482b;
        }

        /* access modifiers changed from: package-private */
        public void q() {
            this.f6482b = Integer.MIN_VALUE;
            this.f6483c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void r(int i4) {
            int i5 = this.f6482b;
            if (i5 != Integer.MIN_VALUE) {
                this.f6482b = i5 + i4;
            }
            int i6 = this.f6483c;
            if (i6 != Integer.MIN_VALUE) {
                this.f6483c = i6 + i4;
            }
        }

        /* access modifiers changed from: package-private */
        public void s() {
            int size = this.f6481a.size();
            View view = (View) this.f6481a.remove(size - 1);
            c n4 = n(view);
            n4.f6463e = null;
            if (n4.v() || n4.u()) {
                this.f6484d -= StaggeredGridLayoutManager.this.f6449u.e(view);
            }
            if (size == 1) {
                this.f6482b = Integer.MIN_VALUE;
            }
            this.f6483c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void t() {
            View view = (View) this.f6481a.remove(0);
            c n4 = n(view);
            n4.f6463e = null;
            if (this.f6481a.size() == 0) {
                this.f6483c = Integer.MIN_VALUE;
            }
            if (n4.v() || n4.u()) {
                this.f6484d -= StaggeredGridLayoutManager.this.f6449u.e(view);
            }
            this.f6482b = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void u(View view) {
            c n4 = n(view);
            n4.f6463e = this;
            this.f6481a.add(0, view);
            this.f6482b = Integer.MIN_VALUE;
            if (this.f6481a.size() == 1) {
                this.f6483c = Integer.MIN_VALUE;
            }
            if (n4.v() || n4.u()) {
                this.f6484d += StaggeredGridLayoutManager.this.f6449u.e(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void v(int i4) {
            this.f6482b = i4;
            this.f6483c = i4;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        RecyclerView.o.d r02 = RecyclerView.o.r0(context, attributeSet, i4, i5);
        S2(r02.f6374a);
        U2(r02.f6375b);
        T2(r02.f6376c);
        this.f6453y = new k();
        l2();
    }

    private f A2(k kVar) {
        int i4;
        int i5;
        int i6;
        if (I2(kVar.f6668e)) {
            i6 = this.f6447s - 1;
            i5 = -1;
            i4 = -1;
        } else {
            i5 = this.f6447s;
            i6 = 0;
            i4 = 1;
        }
        f fVar = null;
        if (kVar.f6668e == 1) {
            int m4 = this.f6449u.m();
            int i7 = Integer.MAX_VALUE;
            while (i6 != i5) {
                f fVar2 = this.f6448t[i6];
                int l4 = fVar2.l(m4);
                if (l4 < i7) {
                    fVar = fVar2;
                    i7 = l4;
                }
                i6 += i4;
            }
            return fVar;
        }
        int i8 = this.f6449u.i();
        int i9 = Integer.MIN_VALUE;
        while (i6 != i5) {
            f fVar3 = this.f6448t[i6];
            int p4 = fVar3.p(i8);
            if (p4 > i9) {
                fVar = fVar3;
                i9 = p4;
            }
            i6 += i4;
        }
        return fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void B2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f6431A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.v2()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.u2()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001b
            if (r7 >= r8) goto L_0x0017
            int r2 = r8 + 1
        L_0x0015:
            r3 = r7
            goto L_0x001e
        L_0x0017:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001e
        L_0x001b:
            int r2 = r7 + r8
            goto L_0x0015
        L_0x001e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f6435E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003d
            r5 = 2
            if (r9 == r5) goto L_0x0037
            if (r9 == r1) goto L_0x002c
            goto L_0x0042
        L_0x002c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f6435E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f6435E
            r7.j(r8, r4)
            goto L_0x0042
        L_0x0037:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f6435E
            r9.k(r7, r8)
            goto L_0x0042
        L_0x003d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f6435E
            r9.j(r7, r8)
        L_0x0042:
            if (r2 > r0) goto L_0x0045
            return
        L_0x0045:
            boolean r7 = r6.f6431A
            if (r7 == 0) goto L_0x004e
            int r7 = r6.u2()
            goto L_0x0052
        L_0x004e:
            int r7 = r6.v2()
        L_0x0052:
            if (r3 > r7) goto L_0x0057
            r6.E1()
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.B2(int, int, int):void");
    }

    private void F2(View view, int i4, int i5, boolean z3) {
        boolean z4;
        w(view, this.f6441K);
        c cVar = (c) view.getLayoutParams();
        int i6 = cVar.leftMargin;
        Rect rect = this.f6441K;
        int c32 = c3(i4, i6 + rect.left, cVar.rightMargin + rect.right);
        int i7 = cVar.topMargin;
        Rect rect2 = this.f6441K;
        int c33 = c3(i5, i7 + rect2.top, cVar.bottomMargin + rect2.bottom);
        if (z3) {
            z4 = S1(view, c32, c33, cVar);
        } else {
            z4 = Q1(view, c32, c33, cVar);
        }
        if (z4) {
            view.measure(c32, c33);
        }
    }

    private void G2(View view, c cVar, boolean z3) {
        if (cVar.f6464f) {
            if (this.f6451w == 1) {
                F2(view, this.f6440J, RecyclerView.o.X(j0(), k0(), getPaddingTop() + getPaddingBottom(), cVar.height, true), z3);
            } else {
                F2(view, RecyclerView.o.X(x0(), y0(), getPaddingLeft() + getPaddingRight(), cVar.width, true), this.f6440J, z3);
            }
        } else if (this.f6451w == 1) {
            F2(view, RecyclerView.o.X(this.f6452x, y0(), 0, cVar.width, false), RecyclerView.o.X(j0(), k0(), getPaddingTop() + getPaddingBottom(), cVar.height, true), z3);
        } else {
            F2(view, RecyclerView.o.X(x0(), y0(), getPaddingLeft() + getPaddingRight(), cVar.width, true), RecyclerView.o.X(this.f6452x, k0(), 0, cVar.height, false), z3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0152, code lost:
        if (d2() != false) goto L_0x0156;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void H2(androidx.recyclerview.widget.RecyclerView.u r9, androidx.recyclerview.widget.RecyclerView.z r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.f6442L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.f6439I
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.f6433C
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.b()
            if (r1 != 0) goto L_0x0018
            r8.v1(r9)
            r0.c()
            return
        L_0x0018:
            boolean r1 = r0.f6460e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.f6433C
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.f6439I
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = r3
            goto L_0x002a
        L_0x0029:
            r1 = r4
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f6439I
            if (r5 == 0) goto L_0x0037
            r8.Y1(r0)
            goto L_0x003e
        L_0x0037:
            r8.P2()
            boolean r5 = r8.f6431A
            r0.f6458c = r5
        L_0x003e:
            r8.Y2(r10, r0)
            r0.f6460e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f6439I
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f6433C
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f6458c
            boolean r6 = r8.f6437G
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.E2()
            boolean r6 = r8.f6438H
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r5 = r8.f6435E
            r5.b()
            r0.f6459d = r4
        L_0x0060:
            int r5 = r8.W()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f6439I
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f6473c
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f6459d
            if (r5 == 0) goto L_0x008e
            r1 = r3
        L_0x0073:
            int r5 = r8.f6447s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f6448t
            r5 = r5[r1]
            r5.e()
            int r5 = r0.f6457b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r8.f6448t
            r6 = r6[r1]
            r6.v(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f6442L
            int[] r1 = r1.f6461f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = r3
        L_0x0098:
            int r5 = r8.f6447s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f6448t
            r5 = r5[r1]
            r5.e()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.f6442L
            int[] r6 = r6.f6461f
            r6 = r6[r1]
            r5.v(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = r3
        L_0x00b0:
            int r5 = r8.f6447s
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f6448t
            r5 = r5[r1]
            boolean r6 = r8.f6431A
            int r7 = r0.f6457b
            r5.b(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f6442L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f6448t
            r1.d(r5)
        L_0x00c9:
            r8.J(r9)
            androidx.recyclerview.widget.k r1 = r8.f6453y
            r1.f6664a = r3
            r8.f6443M = r3
            androidx.recyclerview.widget.p r1 = r8.f6450v
            int r1 = r1.n()
            r8.a3(r1)
            int r1 = r0.f6456a
            r8.Z2(r1, r10)
            boolean r1 = r0.f6458c
            if (r1 == 0) goto L_0x00fc
            r8.R2(r2)
            androidx.recyclerview.widget.k r1 = r8.f6453y
            r8.m2(r9, r1, r10)
            r8.R2(r4)
            androidx.recyclerview.widget.k r1 = r8.f6453y
            int r2 = r0.f6456a
            int r5 = r1.f6667d
            int r2 = r2 + r5
            r1.f6666c = r2
            r8.m2(r9, r1, r10)
            goto L_0x0113
        L_0x00fc:
            r8.R2(r4)
            androidx.recyclerview.widget.k r1 = r8.f6453y
            r8.m2(r9, r1, r10)
            r8.R2(r2)
            androidx.recyclerview.widget.k r1 = r8.f6453y
            int r2 = r0.f6456a
            int r5 = r1.f6667d
            int r2 = r2 + r5
            r1.f6666c = r2
            r8.m2(r9, r1, r10)
        L_0x0113:
            r8.O2()
            int r1 = r8.W()
            if (r1 <= 0) goto L_0x012d
            boolean r1 = r8.f6431A
            if (r1 == 0) goto L_0x0127
            r8.s2(r9, r10, r4)
            r8.t2(r9, r10, r3)
            goto L_0x012d
        L_0x0127:
            r8.t2(r9, r10, r4)
            r8.s2(r9, r10, r3)
        L_0x012d:
            if (r11 == 0) goto L_0x0155
            boolean r11 = r10.e()
            if (r11 != 0) goto L_0x0155
            int r11 = r8.f6436F
            if (r11 == 0) goto L_0x0155
            int r11 = r8.W()
            if (r11 <= 0) goto L_0x0155
            boolean r11 = r8.f6443M
            if (r11 != 0) goto L_0x0149
            android.view.View r11 = r8.C2()
            if (r11 == 0) goto L_0x0155
        L_0x0149:
            java.lang.Runnable r11 = r8.f6446P
            r8.z1(r11)
            boolean r11 = r8.d2()
            if (r11 == 0) goto L_0x0155
            goto L_0x0156
        L_0x0155:
            r4 = r3
        L_0x0156:
            boolean r11 = r10.e()
            if (r11 == 0) goto L_0x0161
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f6442L
            r11.c()
        L_0x0161:
            boolean r11 = r0.f6458c
            r8.f6437G = r11
            boolean r11 = r8.E2()
            r8.f6438H = r11
            if (r4 == 0) goto L_0x0175
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f6442L
            r11.c()
            r8.H2(r9, r10, r3)
        L_0x0175:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.H2(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z, boolean):void");
    }

    private boolean I2(int i4) {
        boolean z3;
        boolean z4;
        boolean z5;
        if (this.f6451w == 0) {
            if (i4 == -1) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5 != this.f6431A) {
                return true;
            }
            return false;
        }
        if (i4 == -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 == this.f6431A) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 == E2()) {
            return true;
        }
        return false;
    }

    private void K2(View view) {
        for (int i4 = this.f6447s - 1; i4 >= 0; i4--) {
            this.f6448t[i4].u(view);
        }
    }

    private void L2(RecyclerView.u uVar, k kVar) {
        int i4;
        int i5;
        if (kVar.f6664a && !kVar.f6672i) {
            if (kVar.f6665b == 0) {
                if (kVar.f6668e == -1) {
                    M2(uVar, kVar.f6670g);
                } else {
                    N2(uVar, kVar.f6669f);
                }
            } else if (kVar.f6668e == -1) {
                int i6 = kVar.f6669f;
                int x22 = i6 - x2(i6);
                if (x22 < 0) {
                    i5 = kVar.f6670g;
                } else {
                    i5 = kVar.f6670g - Math.min(x22, kVar.f6665b);
                }
                M2(uVar, i5);
            } else {
                int y22 = y2(kVar.f6670g) - kVar.f6670g;
                if (y22 < 0) {
                    i4 = kVar.f6669f;
                } else {
                    i4 = Math.min(y22, kVar.f6665b) + kVar.f6669f;
                }
                N2(uVar, i4);
            }
        }
    }

    private void M2(RecyclerView.u uVar, int i4) {
        int W3 = W() - 1;
        while (W3 >= 0) {
            View V3 = V(W3);
            if (this.f6449u.g(V3) >= i4 && this.f6449u.q(V3) >= i4) {
                c cVar = (c) V3.getLayoutParams();
                if (cVar.f6464f) {
                    int i5 = 0;
                    while (i5 < this.f6447s) {
                        if (this.f6448t[i5].f6481a.size() != 1) {
                            i5++;
                        } else {
                            return;
                        }
                    }
                    for (int i6 = 0; i6 < this.f6447s; i6++) {
                        this.f6448t[i6].s();
                    }
                } else if (cVar.f6463e.f6481a.size() != 1) {
                    cVar.f6463e.s();
                } else {
                    return;
                }
                x1(V3, uVar);
                W3--;
            } else {
                return;
            }
        }
    }

    private void N2(RecyclerView.u uVar, int i4) {
        while (W() > 0) {
            View V3 = V(0);
            if (this.f6449u.d(V3) <= i4 && this.f6449u.p(V3) <= i4) {
                c cVar = (c) V3.getLayoutParams();
                if (cVar.f6464f) {
                    int i5 = 0;
                    while (i5 < this.f6447s) {
                        if (this.f6448t[i5].f6481a.size() != 1) {
                            i5++;
                        } else {
                            return;
                        }
                    }
                    for (int i6 = 0; i6 < this.f6447s; i6++) {
                        this.f6448t[i6].t();
                    }
                } else if (cVar.f6463e.f6481a.size() != 1) {
                    cVar.f6463e.t();
                } else {
                    return;
                }
                x1(V3, uVar);
            } else {
                return;
            }
        }
    }

    private void O2() {
        if (this.f6450v.k() != 1073741824) {
            int W3 = W();
            float f4 = 0.0f;
            for (int i4 = 0; i4 < W3; i4++) {
                View V3 = V(i4);
                float e4 = (float) this.f6450v.e(V3);
                if (e4 >= f4) {
                    if (((c) V3.getLayoutParams()).x()) {
                        e4 = (e4 * 1.0f) / ((float) this.f6447s);
                    }
                    f4 = Math.max(f4, e4);
                }
            }
            int i5 = this.f6452x;
            int round = Math.round(f4 * ((float) this.f6447s));
            if (this.f6450v.k() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f6450v.n());
            }
            a3(round);
            if (this.f6452x != i5) {
                for (int i6 = 0; i6 < W3; i6++) {
                    View V4 = V(i6);
                    c cVar = (c) V4.getLayoutParams();
                    if (!cVar.f6464f) {
                        if (!E2() || this.f6451w != 1) {
                            int i7 = cVar.f6463e.f6485e;
                            int i8 = this.f6452x * i7;
                            int i9 = i7 * i5;
                            if (this.f6451w == 1) {
                                V4.offsetLeftAndRight(i8 - i9);
                            } else {
                                V4.offsetTopAndBottom(i8 - i9);
                            }
                        } else {
                            int i10 = this.f6447s;
                            int i11 = cVar.f6463e.f6485e;
                            V4.offsetLeftAndRight(((-((i10 - 1) - i11)) * this.f6452x) - ((-((i10 - 1) - i11)) * i5));
                        }
                    }
                }
            }
        }
    }

    private void P2() {
        if (this.f6451w == 1 || !E2()) {
            this.f6431A = this.f6454z;
        } else {
            this.f6431A = !this.f6454z;
        }
    }

    private void R2(int i4) {
        boolean z3;
        k kVar = this.f6453y;
        kVar.f6668e = i4;
        boolean z4 = this.f6431A;
        int i5 = 1;
        if (i4 == -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z4 != z3) {
            i5 = -1;
        }
        kVar.f6667d = i5;
    }

    private void V2(int i4, int i5) {
        for (int i6 = 0; i6 < this.f6447s; i6++) {
            if (!this.f6448t[i6].f6481a.isEmpty()) {
                b3(this.f6448t[i6], i4, i5);
            }
        }
    }

    private boolean W2(RecyclerView.z zVar, b bVar) {
        int i4;
        if (this.f6437G) {
            i4 = r2(zVar.b());
        } else {
            i4 = n2(zVar.b());
        }
        bVar.f6456a = i4;
        bVar.f6457b = Integer.MIN_VALUE;
        return true;
    }

    private void X1(View view) {
        for (int i4 = this.f6447s - 1; i4 >= 0; i4--) {
            this.f6448t[i4].a(view);
        }
    }

    private void Y1(b bVar) {
        int m4;
        e eVar = this.f6439I;
        int i4 = eVar.f6473c;
        if (i4 > 0) {
            if (i4 == this.f6447s) {
                for (int i5 = 0; i5 < this.f6447s; i5++) {
                    this.f6448t[i5].e();
                    e eVar2 = this.f6439I;
                    int i6 = eVar2.f6474d[i5];
                    if (i6 != Integer.MIN_VALUE) {
                        if (eVar2.f6479i) {
                            m4 = this.f6449u.i();
                        } else {
                            m4 = this.f6449u.m();
                        }
                        i6 += m4;
                    }
                    this.f6448t[i5].v(i6);
                }
            } else {
                eVar.u();
                e eVar3 = this.f6439I;
                eVar3.f6471a = eVar3.f6472b;
            }
        }
        e eVar4 = this.f6439I;
        this.f6438H = eVar4.f6480j;
        T2(eVar4.f6478h);
        P2();
        e eVar5 = this.f6439I;
        int i7 = eVar5.f6471a;
        if (i7 != -1) {
            this.f6433C = i7;
            bVar.f6458c = eVar5.f6479i;
        } else {
            bVar.f6458c = this.f6431A;
        }
        if (eVar5.f6475e > 1) {
            d dVar = this.f6435E;
            dVar.f6465a = eVar5.f6476f;
            dVar.f6466b = eVar5.f6477g;
        }
    }

    private void Z2(int i4, RecyclerView.z zVar) {
        int i5;
        int i6;
        int c4;
        boolean z3;
        k kVar = this.f6453y;
        boolean z4 = false;
        kVar.f6665b = 0;
        kVar.f6666c = i4;
        if (!H0() || (c4 = zVar.c()) == -1) {
            i6 = 0;
            i5 = 0;
        } else {
            boolean z5 = this.f6431A;
            if (c4 < i4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z5 == z3) {
                i6 = this.f6449u.n();
                i5 = 0;
            } else {
                i5 = this.f6449u.n();
                i6 = 0;
            }
        }
        if (Z()) {
            this.f6453y.f6669f = this.f6449u.m() - i5;
            this.f6453y.f6670g = this.f6449u.i() + i6;
        } else {
            this.f6453y.f6670g = this.f6449u.h() + i6;
            this.f6453y.f6669f = -i5;
        }
        k kVar2 = this.f6453y;
        kVar2.f6671h = false;
        kVar2.f6664a = true;
        if (this.f6449u.k() == 0 && this.f6449u.h() == 0) {
            z4 = true;
        }
        kVar2.f6672i = z4;
    }

    private void b2(View view, c cVar, k kVar) {
        if (kVar.f6668e == 1) {
            if (cVar.f6464f) {
                X1(view);
            } else {
                cVar.f6463e.a(view);
            }
        } else if (cVar.f6464f) {
            K2(view);
        } else {
            cVar.f6463e.u(view);
        }
    }

    private void b3(f fVar, int i4, int i5) {
        int j4 = fVar.j();
        if (i4 == -1) {
            if (fVar.o() + j4 <= i5) {
                this.f6432B.set(fVar.f6485e, false);
            }
        } else if (fVar.k() - j4 >= i5) {
            this.f6432B.set(fVar.f6485e, false);
        }
    }

    private int c2(int i4) {
        boolean z3;
        if (W() != 0) {
            if (i4 < u2()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 != this.f6431A) {
                return -1;
            }
            return 1;
        } else if (this.f6431A) {
            return 1;
        } else {
            return -1;
        }
    }

    private int c3(int i4, int i5, int i6) {
        if (i5 == 0 && i6 == 0) {
            return i4;
        }
        int mode = View.MeasureSpec.getMode(i4);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i4) - i5) - i6), mode);
        }
        return i4;
    }

    private boolean e2(f fVar) {
        if (this.f6431A) {
            if (fVar.k() < this.f6449u.i()) {
                ArrayList arrayList = fVar.f6481a;
                return !fVar.n((View) arrayList.get(arrayList.size() - 1)).f6464f;
            }
        } else if (fVar.o() > this.f6449u.m()) {
            return !fVar.n((View) fVar.f6481a.get(0)).f6464f;
        }
        return false;
    }

    private int f2(RecyclerView.z zVar) {
        if (W() == 0) {
            return 0;
        }
        return s.a(zVar, this.f6449u, p2(!this.f6444N), o2(!this.f6444N), this, this.f6444N);
    }

    private int g2(RecyclerView.z zVar) {
        if (W() == 0) {
            return 0;
        }
        return s.b(zVar, this.f6449u, p2(!this.f6444N), o2(!this.f6444N), this, this.f6444N, this.f6431A);
    }

    private int h2(RecyclerView.z zVar) {
        if (W() == 0) {
            return 0;
        }
        return s.c(zVar, this.f6449u, p2(!this.f6444N), o2(!this.f6444N), this, this.f6444N);
    }

    private int i2(int i4) {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 17) {
                    if (i4 != 33) {
                        if (i4 != 66) {
                            if (i4 != 130) {
                                return Integer.MIN_VALUE;
                            }
                            if (this.f6451w == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f6451w == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f6451w == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f6451w == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f6451w != 1 && E2()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f6451w != 1 && E2()) {
            return 1;
        } else {
            return -1;
        }
    }

    private d.a j2(int i4) {
        d.a aVar = new d.a();
        aVar.f6469c = new int[this.f6447s];
        for (int i5 = 0; i5 < this.f6447s; i5++) {
            aVar.f6469c[i5] = i4 - this.f6448t[i5].l(i4);
        }
        return aVar;
    }

    private d.a k2(int i4) {
        d.a aVar = new d.a();
        aVar.f6469c = new int[this.f6447s];
        for (int i5 = 0; i5 < this.f6447s; i5++) {
            aVar.f6469c[i5] = this.f6448t[i5].p(i4) - i4;
        }
        return aVar;
    }

    private void l2() {
        this.f6449u = p.b(this, this.f6451w);
        this.f6450v = p.b(this, 1 - this.f6451w);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r9v5 */
    private int m2(RecyclerView.u uVar, k kVar, RecyclerView.z zVar) {
        int i4;
        int m4;
        int i5;
        boolean z3;
        f fVar;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z4;
        int i10;
        int i11;
        boolean a22;
        int i12;
        int i13;
        RecyclerView.u uVar2 = uVar;
        k kVar2 = kVar;
        ? r9 = 0;
        this.f6432B.set(0, this.f6447s, true);
        if (this.f6453y.f6672i) {
            if (kVar2.f6668e == 1) {
                i4 = Integer.MAX_VALUE;
            } else {
                i4 = Integer.MIN_VALUE;
            }
        } else if (kVar2.f6668e == 1) {
            i4 = kVar2.f6670g + kVar2.f6665b;
        } else {
            i4 = kVar2.f6669f - kVar2.f6665b;
        }
        int i14 = i4;
        V2(kVar2.f6668e, i14);
        if (this.f6431A) {
            m4 = this.f6449u.i();
        } else {
            m4 = this.f6449u.m();
        }
        int i15 = m4;
        boolean z5 = false;
        while (kVar.a(zVar) && (this.f6453y.f6672i || !this.f6432B.isEmpty())) {
            View b4 = kVar2.b(uVar2);
            c cVar = (c) b4.getLayoutParams();
            int t4 = cVar.t();
            int g4 = this.f6435E.g(t4);
            if (g4 == -1) {
                z3 = true;
            } else {
                z3 = r9;
            }
            if (z3) {
                if (cVar.f6464f) {
                    fVar = this.f6448t[r9];
                } else {
                    fVar = A2(kVar2);
                }
                this.f6435E.n(t4, fVar);
            } else {
                fVar = this.f6448t[g4];
            }
            f fVar2 = fVar;
            cVar.f6463e = fVar2;
            if (kVar2.f6668e == 1) {
                q(b4);
            } else {
                r(b4, r9);
            }
            G2(b4, cVar, r9);
            if (kVar2.f6668e == 1) {
                if (cVar.f6464f) {
                    i13 = w2(i15);
                } else {
                    i13 = fVar2.l(i15);
                }
                int e4 = this.f6449u.e(b4) + i13;
                if (z3 && cVar.f6464f) {
                    d.a j22 = j2(i13);
                    j22.f6468b = -1;
                    j22.f6467a = t4;
                    this.f6435E.a(j22);
                }
                i6 = e4;
                i7 = i13;
            } else {
                if (cVar.f6464f) {
                    i12 = z2(i15);
                } else {
                    i12 = fVar2.p(i15);
                }
                i7 = i12 - this.f6449u.e(b4);
                if (z3 && cVar.f6464f) {
                    d.a k22 = k2(i12);
                    k22.f6468b = 1;
                    k22.f6467a = t4;
                    this.f6435E.a(k22);
                }
                i6 = i12;
            }
            if (cVar.f6464f && kVar2.f6667d == -1) {
                if (z3) {
                    this.f6443M = true;
                } else {
                    if (kVar2.f6668e == 1) {
                        a22 = Z1();
                    } else {
                        a22 = a2();
                    }
                    if (!a22) {
                        d.a f4 = this.f6435E.f(t4);
                        if (f4 != null) {
                            f4.f6470d = true;
                        }
                        this.f6443M = true;
                    }
                }
            }
            b2(b4, cVar, kVar2);
            if (!E2() || this.f6451w != 1) {
                if (cVar.f6464f) {
                    i10 = this.f6450v.m();
                } else {
                    i10 = (fVar2.f6485e * this.f6452x) + this.f6450v.m();
                }
                i9 = i10;
                i8 = this.f6450v.e(b4) + i10;
            } else {
                if (cVar.f6464f) {
                    i11 = this.f6450v.i();
                } else {
                    i11 = this.f6450v.i() - (((this.f6447s - 1) - fVar2.f6485e) * this.f6452x);
                }
                i8 = i11;
                i9 = i11 - this.f6450v.e(b4);
            }
            if (this.f6451w == 1) {
                J0(b4, i9, i7, i8, i6);
            } else {
                J0(b4, i7, i9, i6, i8);
            }
            if (cVar.f6464f) {
                V2(this.f6453y.f6668e, i14);
            } else {
                b3(fVar2, this.f6453y.f6668e, i14);
            }
            L2(uVar2, this.f6453y);
            if (this.f6453y.f6671h && b4.hasFocusable()) {
                if (cVar.f6464f) {
                    this.f6432B.clear();
                } else {
                    z4 = false;
                    this.f6432B.set(fVar2.f6485e, false);
                    r9 = z4;
                    z5 = true;
                }
            }
            z4 = false;
            r9 = z4;
            z5 = true;
        }
        int i16 = r9;
        if (!z5) {
            L2(uVar2, this.f6453y);
        }
        if (this.f6453y.f6668e == -1) {
            i5 = this.f6449u.m() - z2(this.f6449u.m());
        } else {
            i5 = w2(this.f6449u.i()) - this.f6449u.i();
        }
        if (i5 > 0) {
            return Math.min(kVar2.f6665b, i5);
        }
        return i16;
    }

    private int n2(int i4) {
        int W3 = W();
        for (int i5 = 0; i5 < W3; i5++) {
            int q02 = q0(V(i5));
            if (q02 >= 0 && q02 < i4) {
                return q02;
            }
        }
        return 0;
    }

    private int r2(int i4) {
        for (int W3 = W() - 1; W3 >= 0; W3--) {
            int q02 = q0(V(W3));
            if (q02 >= 0 && q02 < i4) {
                return q02;
            }
        }
        return 0;
    }

    private void s2(RecyclerView.u uVar, RecyclerView.z zVar, boolean z3) {
        int i4;
        int w22 = w2(Integer.MIN_VALUE);
        if (w22 != Integer.MIN_VALUE && (i4 = this.f6449u.i() - w22) > 0) {
            int i5 = i4 - (-Q2(-i4, uVar, zVar));
            if (z3 && i5 > 0) {
                this.f6449u.r(i5);
            }
        }
    }

    private void t2(RecyclerView.u uVar, RecyclerView.z zVar, boolean z3) {
        int m4;
        int z22 = z2(Integer.MAX_VALUE);
        if (z22 != Integer.MAX_VALUE && (m4 = z22 - this.f6449u.m()) > 0) {
            int Q22 = m4 - Q2(m4, uVar, zVar);
            if (z3 && Q22 > 0) {
                this.f6449u.r(-Q22);
            }
        }
    }

    private int w2(int i4) {
        int l4 = this.f6448t[0].l(i4);
        for (int i5 = 1; i5 < this.f6447s; i5++) {
            int l5 = this.f6448t[i5].l(i4);
            if (l5 > l4) {
                l4 = l5;
            }
        }
        return l4;
    }

    private int x2(int i4) {
        int p4 = this.f6448t[0].p(i4);
        for (int i5 = 1; i5 < this.f6447s; i5++) {
            int p5 = this.f6448t[i5].p(i4);
            if (p5 > p4) {
                p4 = p5;
            }
        }
        return p4;
    }

    private int y2(int i4) {
        int l4 = this.f6448t[0].l(i4);
        for (int i5 = 1; i5 < this.f6447s; i5++) {
            int l5 = this.f6448t[i5].l(i4);
            if (l5 < l4) {
                l4 = l5;
            }
        }
        return l4;
    }

    private int z2(int i4) {
        int p4 = this.f6448t[0].p(i4);
        for (int i5 = 1; i5 < this.f6447s; i5++) {
            int p5 = this.f6448t[i5].p(i4);
            if (p5 < p4) {
                p4 = p5;
            }
        }
        return p4;
    }

    public void B(int i4, int i5, RecyclerView.z zVar, RecyclerView.o.c cVar) {
        int l4;
        int i6;
        if (this.f6451w != 0) {
            i4 = i5;
        }
        if (W() != 0 && i4 != 0) {
            J2(i4, zVar);
            int[] iArr = this.f6445O;
            if (iArr == null || iArr.length < this.f6447s) {
                this.f6445O = new int[this.f6447s];
            }
            int i7 = 0;
            for (int i8 = 0; i8 < this.f6447s; i8++) {
                k kVar = this.f6453y;
                if (kVar.f6667d == -1) {
                    l4 = kVar.f6669f;
                    i6 = this.f6448t[i8].p(l4);
                } else {
                    l4 = this.f6448t[i8].l(kVar.f6670g);
                    i6 = this.f6453y.f6670g;
                }
                int i9 = l4 - i6;
                if (i9 >= 0) {
                    this.f6445O[i7] = i9;
                    i7++;
                }
            }
            Arrays.sort(this.f6445O, 0, i7);
            for (int i10 = 0; i10 < i7 && this.f6453y.a(zVar); i10++) {
                cVar.a(this.f6453y.f6666c, this.f6445O[i10]);
                k kVar2 = this.f6453y;
                kVar2.f6666c += kVar2.f6667d;
            }
        }
    }

    public boolean B0() {
        if (this.f6436F != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public View C2() {
        char c4;
        int i4;
        boolean z3;
        boolean z4;
        int W3 = W();
        int i5 = W3 - 1;
        BitSet bitSet = new BitSet(this.f6447s);
        bitSet.set(0, this.f6447s, true);
        int i6 = -1;
        if (this.f6451w != 1 || !E2()) {
            c4 = 65535;
        } else {
            c4 = 1;
        }
        if (this.f6431A) {
            W3 = -1;
        } else {
            i5 = 0;
        }
        if (i5 < W3) {
            i6 = 1;
        }
        while (i5 != W3) {
            View V3 = V(i5);
            c cVar = (c) V3.getLayoutParams();
            if (bitSet.get(cVar.f6463e.f6485e)) {
                if (e2(cVar.f6463e)) {
                    return V3;
                }
                bitSet.clear(cVar.f6463e.f6485e);
            }
            if (!cVar.f6464f && (i4 = i5 + i6) != W3) {
                View V4 = V(i4);
                if (this.f6431A) {
                    int d4 = this.f6449u.d(V3);
                    int d5 = this.f6449u.d(V4);
                    if (d4 < d5) {
                        return V3;
                    }
                    if (d4 != d5) {
                        continue;
                    }
                } else {
                    int g4 = this.f6449u.g(V3);
                    int g5 = this.f6449u.g(V4);
                    if (g4 > g5) {
                        return V3;
                    }
                    if (g4 != g5) {
                        continue;
                    }
                }
                if (cVar.f6463e.f6485e - ((c) V4.getLayoutParams()).f6463e.f6485e < 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c4 < 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3 != z4) {
                    return V3;
                }
            }
            i5 += i6;
        }
        return null;
    }

    public int D(RecyclerView.z zVar) {
        return f2(zVar);
    }

    public void D2() {
        this.f6435E.b();
        E1();
    }

    public int E(RecyclerView.z zVar) {
        return g2(zVar);
    }

    /* access modifiers changed from: package-private */
    public boolean E2() {
        if (m0() == 1) {
            return true;
        }
        return false;
    }

    public int F(RecyclerView.z zVar) {
        return h2(zVar);
    }

    public int G(RecyclerView.z zVar) {
        return f2(zVar);
    }

    public int H(RecyclerView.z zVar) {
        return g2(zVar);
    }

    public int H1(int i4, RecyclerView.u uVar, RecyclerView.z zVar) {
        return Q2(i4, uVar, zVar);
    }

    public int I(RecyclerView.z zVar) {
        return h2(zVar);
    }

    public void I1(int i4) {
        e eVar = this.f6439I;
        if (!(eVar == null || eVar.f6471a == i4)) {
            eVar.t();
        }
        this.f6433C = i4;
        this.f6434D = Integer.MIN_VALUE;
        E1();
    }

    public int J1(int i4, RecyclerView.u uVar, RecyclerView.z zVar) {
        return Q2(i4, uVar, zVar);
    }

    /* access modifiers changed from: package-private */
    public void J2(int i4, RecyclerView.z zVar) {
        int i5;
        int i6;
        if (i4 > 0) {
            i6 = v2();
            i5 = 1;
        } else {
            i6 = u2();
            i5 = -1;
        }
        this.f6453y.f6664a = true;
        Z2(i6, zVar);
        R2(i5);
        k kVar = this.f6453y;
        kVar.f6666c = i6 + kVar.f6667d;
        kVar.f6665b = Math.abs(i4);
    }

    public void M0(int i4) {
        super.M0(i4);
        for (int i5 = 0; i5 < this.f6447s; i5++) {
            this.f6448t[i5].r(i4);
        }
    }

    public void N0(int i4) {
        super.N0(i4);
        for (int i5 = 0; i5 < this.f6447s; i5++) {
            this.f6448t[i5].r(i4);
        }
    }

    public void N1(Rect rect, int i4, int i5) {
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f6451w == 1) {
            i7 = RecyclerView.o.A(i5, rect.height() + paddingTop, o0());
            i6 = RecyclerView.o.A(i4, (this.f6452x * this.f6447s) + paddingLeft, p0());
        } else {
            i6 = RecyclerView.o.A(i4, rect.width() + paddingLeft, p0());
            i7 = RecyclerView.o.A(i5, (this.f6452x * this.f6447s) + paddingTop, o0());
        }
        M1(i6, i7);
    }

    public void O0(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        this.f6435E.b();
        for (int i4 = 0; i4 < this.f6447s; i4++) {
            this.f6448t[i4].e();
        }
    }

    public RecyclerView.p Q() {
        if (this.f6451w == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    /* access modifiers changed from: package-private */
    public int Q2(int i4, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (W() == 0 || i4 == 0) {
            return 0;
        }
        J2(i4, zVar);
        int m22 = m2(uVar, this.f6453y, zVar);
        if (this.f6453y.f6665b >= m22) {
            if (i4 < 0) {
                i4 = -m22;
            } else {
                i4 = m22;
            }
        }
        this.f6449u.r(-i4);
        this.f6437G = this.f6431A;
        k kVar = this.f6453y;
        kVar.f6665b = 0;
        L2(uVar, kVar);
        return i4;
    }

    public RecyclerView.p R(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public RecyclerView.p S(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    public void S0(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.S0(recyclerView, uVar);
        z1(this.f6446P);
        for (int i4 = 0; i4 < this.f6447s; i4++) {
            this.f6448t[i4].e();
        }
        recyclerView.requestLayout();
    }

    public void S2(int i4) {
        if (i4 == 0 || i4 == 1) {
            t((String) null);
            if (i4 != this.f6451w) {
                this.f6451w = i4;
                p pVar = this.f6449u;
                this.f6449u = this.f6450v;
                this.f6450v = pVar;
                E1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public View T0(View view, int i4, RecyclerView.u uVar, RecyclerView.z zVar) {
        View O3;
        int i5;
        boolean z3;
        boolean z4;
        int i6;
        int i7;
        int i8;
        View m4;
        if (W() == 0 || (O3 = O(view)) == null) {
            return null;
        }
        P2();
        int i22 = i2(i4);
        if (i22 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) O3.getLayoutParams();
        boolean z5 = cVar.f6464f;
        f fVar = cVar.f6463e;
        if (i22 == 1) {
            i5 = v2();
        } else {
            i5 = u2();
        }
        Z2(i5, zVar);
        R2(i22);
        k kVar = this.f6453y;
        kVar.f6666c = kVar.f6667d + i5;
        kVar.f6665b = (int) (((float) this.f6449u.n()) * 0.33333334f);
        k kVar2 = this.f6453y;
        kVar2.f6671h = true;
        kVar2.f6664a = false;
        m2(uVar, kVar2, zVar);
        this.f6437G = this.f6431A;
        if (!z5 && (m4 = fVar.m(i5, i22)) != null && m4 != O3) {
            return m4;
        }
        if (I2(i22)) {
            for (int i9 = this.f6447s - 1; i9 >= 0; i9--) {
                View m5 = this.f6448t[i9].m(i5, i22);
                if (m5 != null && m5 != O3) {
                    return m5;
                }
            }
        } else {
            for (int i10 = 0; i10 < this.f6447s; i10++) {
                View m6 = this.f6448t[i10].m(i5, i22);
                if (m6 != null && m6 != O3) {
                    return m6;
                }
            }
        }
        boolean z6 = !this.f6454z;
        if (i22 == -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z6 == z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z5) {
            if (z4) {
                i8 = fVar.f();
            } else {
                i8 = fVar.g();
            }
            View P3 = P(i8);
            if (!(P3 == null || P3 == O3)) {
                return P3;
            }
        }
        if (I2(i22)) {
            for (int i11 = this.f6447s - 1; i11 >= 0; i11--) {
                if (i11 != fVar.f6485e) {
                    if (z4) {
                        i7 = this.f6448t[i11].f();
                    } else {
                        i7 = this.f6448t[i11].g();
                    }
                    View P4 = P(i7);
                    if (!(P4 == null || P4 == O3)) {
                        return P4;
                    }
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f6447s; i12++) {
                if (z4) {
                    i6 = this.f6448t[i12].f();
                } else {
                    i6 = this.f6448t[i12].g();
                }
                View P5 = P(i6);
                if (P5 != null && P5 != O3) {
                    return P5;
                }
            }
        }
        return null;
    }

    public void T1(RecyclerView recyclerView, RecyclerView.z zVar, int i4) {
        l lVar = new l(recyclerView.getContext());
        lVar.p(i4);
        U1(lVar);
    }

    public void T2(boolean z3) {
        t((String) null);
        e eVar = this.f6439I;
        if (!(eVar == null || eVar.f6478h == z3)) {
            eVar.f6478h = z3;
        }
        this.f6454z = z3;
        E1();
    }

    public void U0(AccessibilityEvent accessibilityEvent) {
        super.U0(accessibilityEvent);
        if (W() > 0) {
            View p22 = p2(false);
            View o22 = o2(false);
            if (p22 != null && o22 != null) {
                int q02 = q0(p22);
                int q03 = q0(o22);
                if (q02 < q03) {
                    accessibilityEvent.setFromIndex(q02);
                    accessibilityEvent.setToIndex(q03);
                    return;
                }
                accessibilityEvent.setFromIndex(q03);
                accessibilityEvent.setToIndex(q02);
            }
        }
    }

    public void U2(int i4) {
        t((String) null);
        if (i4 != this.f6447s) {
            D2();
            this.f6447s = i4;
            this.f6432B = new BitSet(this.f6447s);
            this.f6448t = new f[this.f6447s];
            for (int i5 = 0; i5 < this.f6447s; i5++) {
                this.f6448t[i5] = new f(i5);
            }
            E1();
        }
    }

    public boolean W1() {
        if (this.f6439I == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean X2(RecyclerView.z zVar, b bVar) {
        int i4;
        int i5;
        int i6;
        boolean z3 = false;
        if (!zVar.e() && (i4 = this.f6433C) != -1) {
            if (i4 < 0 || i4 >= zVar.b()) {
                this.f6433C = -1;
                this.f6434D = Integer.MIN_VALUE;
            } else {
                e eVar = this.f6439I;
                if (eVar == null || eVar.f6471a == -1 || eVar.f6473c < 1) {
                    View P3 = P(this.f6433C);
                    if (P3 != null) {
                        if (this.f6431A) {
                            i5 = v2();
                        } else {
                            i5 = u2();
                        }
                        bVar.f6456a = i5;
                        if (this.f6434D != Integer.MIN_VALUE) {
                            if (bVar.f6458c) {
                                bVar.f6457b = (this.f6449u.i() - this.f6434D) - this.f6449u.d(P3);
                            } else {
                                bVar.f6457b = (this.f6449u.m() + this.f6434D) - this.f6449u.g(P3);
                            }
                            return true;
                        } else if (this.f6449u.e(P3) > this.f6449u.n()) {
                            if (bVar.f6458c) {
                                i6 = this.f6449u.i();
                            } else {
                                i6 = this.f6449u.m();
                            }
                            bVar.f6457b = i6;
                            return true;
                        } else {
                            int g4 = this.f6449u.g(P3) - this.f6449u.m();
                            if (g4 < 0) {
                                bVar.f6457b = -g4;
                                return true;
                            }
                            int i7 = this.f6449u.i() - this.f6449u.d(P3);
                            if (i7 < 0) {
                                bVar.f6457b = i7;
                                return true;
                            }
                            bVar.f6457b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i8 = this.f6433C;
                        bVar.f6456a = i8;
                        int i9 = this.f6434D;
                        if (i9 == Integer.MIN_VALUE) {
                            if (c2(i8) == 1) {
                                z3 = true;
                            }
                            bVar.f6458c = z3;
                            bVar.a();
                        } else {
                            bVar.b(i9);
                        }
                        bVar.f6459d = true;
                    }
                } else {
                    bVar.f6457b = Integer.MIN_VALUE;
                    bVar.f6456a = this.f6433C;
                }
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void Y2(RecyclerView.z zVar, b bVar) {
        if (!X2(zVar, bVar) && !W2(zVar, bVar)) {
            bVar.a();
            bVar.f6456a = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean Z1() {
        int l4 = this.f6448t[0].l(Integer.MIN_VALUE);
        for (int i4 = 1; i4 < this.f6447s; i4++) {
            if (this.f6448t[i4].l(Integer.MIN_VALUE) != l4) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean a2() {
        int p4 = this.f6448t[0].p(Integer.MIN_VALUE);
        for (int i4 = 1; i4 < this.f6447s; i4++) {
            if (this.f6448t[i4].p(Integer.MIN_VALUE) != p4) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a3(int i4) {
        this.f6452x = i4 / this.f6447s;
        this.f6440J = View.MeasureSpec.makeMeasureSpec(i4, this.f6450v.k());
    }

    public void b1(RecyclerView recyclerView, int i4, int i5) {
        B2(i4, i5, 1);
    }

    public void c1(RecyclerView recyclerView) {
        this.f6435E.b();
        E1();
    }

    public void d1(RecyclerView recyclerView, int i4, int i5, int i6) {
        B2(i4, i5, 8);
    }

    /* access modifiers changed from: package-private */
    public boolean d2() {
        int i4;
        int i5;
        int i6;
        if (W() == 0 || this.f6436F == 0 || !A0()) {
            return false;
        }
        if (this.f6431A) {
            i5 = v2();
            i4 = u2();
        } else {
            i5 = u2();
            i4 = v2();
        }
        if (i5 == 0 && C2() != null) {
            this.f6435E.b();
            F1();
            E1();
            return true;
        } else if (!this.f6443M) {
            return false;
        } else {
            if (this.f6431A) {
                i6 = -1;
            } else {
                i6 = 1;
            }
            int i7 = i4 + 1;
            d.a e4 = this.f6435E.e(i5, i7, i6, true);
            if (e4 == null) {
                this.f6443M = false;
                this.f6435E.d(i7);
                return false;
            }
            d.a e5 = this.f6435E.e(i5, e4.f6467a, i6 * -1, true);
            if (e5 == null) {
                this.f6435E.d(e4.f6467a);
            } else {
                this.f6435E.d(e5.f6467a + 1);
            }
            F1();
            E1();
            return true;
        }
    }

    public void e1(RecyclerView recyclerView, int i4, int i5) {
        B2(i4, i5, 2);
    }

    public PointF f(int i4) {
        int c22 = c2(i4);
        PointF pointF = new PointF();
        if (c22 == 0) {
            return null;
        }
        if (this.f6451w == 0) {
            pointF.x = (float) c22;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) c22;
        }
        return pointF;
    }

    public void g1(RecyclerView recyclerView, int i4, int i5, Object obj) {
        B2(i4, i5, 4);
    }

    public void h1(RecyclerView.u uVar, RecyclerView.z zVar) {
        H2(uVar, zVar, true);
    }

    public void i1(RecyclerView.z zVar) {
        super.i1(zVar);
        this.f6433C = -1;
        this.f6434D = Integer.MIN_VALUE;
        this.f6439I = null;
        this.f6442L.c();
    }

    public void m1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.f6439I = eVar;
            if (this.f6433C != -1) {
                eVar.t();
                this.f6439I.u();
            }
            E1();
        }
    }

    public Parcelable n1() {
        int i4;
        int i5;
        int m4;
        int[] iArr;
        if (this.f6439I != null) {
            return new e(this.f6439I);
        }
        e eVar = new e();
        eVar.f6478h = this.f6454z;
        eVar.f6479i = this.f6437G;
        eVar.f6480j = this.f6438H;
        d dVar = this.f6435E;
        if (dVar == null || (iArr = dVar.f6465a) == null) {
            eVar.f6475e = 0;
        } else {
            eVar.f6476f = iArr;
            eVar.f6475e = iArr.length;
            eVar.f6477g = dVar.f6466b;
        }
        if (W() > 0) {
            if (this.f6437G) {
                i4 = v2();
            } else {
                i4 = u2();
            }
            eVar.f6471a = i4;
            eVar.f6472b = q2();
            int i6 = this.f6447s;
            eVar.f6473c = i6;
            eVar.f6474d = new int[i6];
            for (int i7 = 0; i7 < this.f6447s; i7++) {
                if (this.f6437G) {
                    i5 = this.f6448t[i7].l(Integer.MIN_VALUE);
                    if (i5 != Integer.MIN_VALUE) {
                        m4 = this.f6449u.i();
                    } else {
                        eVar.f6474d[i7] = i5;
                    }
                } else {
                    i5 = this.f6448t[i7].p(Integer.MIN_VALUE);
                    if (i5 != Integer.MIN_VALUE) {
                        m4 = this.f6449u.m();
                    } else {
                        eVar.f6474d[i7] = i5;
                    }
                }
                i5 -= m4;
                eVar.f6474d[i7] = i5;
            }
        } else {
            eVar.f6471a = -1;
            eVar.f6472b = -1;
            eVar.f6473c = 0;
        }
        return eVar;
    }

    public void o1(int i4) {
        if (i4 == 0) {
            d2();
        }
    }

    /* access modifiers changed from: package-private */
    public View o2(boolean z3) {
        int m4 = this.f6449u.m();
        int i4 = this.f6449u.i();
        View view = null;
        for (int W3 = W() - 1; W3 >= 0; W3--) {
            View V3 = V(W3);
            int g4 = this.f6449u.g(V3);
            int d4 = this.f6449u.d(V3);
            if (d4 > m4 && g4 < i4) {
                if (d4 <= i4 || !z3) {
                    return V3;
                }
                if (view == null) {
                    view = V3;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public View p2(boolean z3) {
        int m4 = this.f6449u.m();
        int i4 = this.f6449u.i();
        int W3 = W();
        View view = null;
        for (int i5 = 0; i5 < W3; i5++) {
            View V3 = V(i5);
            int g4 = this.f6449u.g(V3);
            if (this.f6449u.d(V3) > m4 && g4 < i4) {
                if (g4 >= m4 || !z3) {
                    return V3;
                }
                if (view == null) {
                    view = V3;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public int q2() {
        View view;
        if (this.f6431A) {
            view = o2(true);
        } else {
            view = p2(true);
        }
        if (view == null) {
            return -1;
        }
        return q0(view);
    }

    public void t(String str) {
        if (this.f6439I == null) {
            super.t(str);
        }
    }

    /* access modifiers changed from: package-private */
    public int u2() {
        if (W() == 0) {
            return 0;
        }
        return q0(V(0));
    }

    /* access modifiers changed from: package-private */
    public int v2() {
        int W3 = W();
        if (W3 == 0) {
            return 0;
        }
        return q0(V(W3 - 1));
    }

    public boolean x() {
        if (this.f6451w == 0) {
            return true;
        }
        return false;
    }

    public boolean y() {
        if (this.f6451w == 1) {
            return true;
        }
        return false;
    }

    public boolean z(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    static class d {

        /* renamed from: a  reason: collision with root package name */
        int[] f6465a;

        /* renamed from: b  reason: collision with root package name */
        List f6466b;

        d() {
        }

        private int i(int i4) {
            if (this.f6466b == null) {
                return -1;
            }
            a f4 = f(i4);
            if (f4 != null) {
                this.f6466b.remove(f4);
            }
            int size = this.f6466b.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    i5 = -1;
                    break;
                } else if (((a) this.f6466b.get(i5)).f6467a >= i4) {
                    break;
                } else {
                    i5++;
                }
            }
            if (i5 == -1) {
                return -1;
            }
            this.f6466b.remove(i5);
            return ((a) this.f6466b.get(i5)).f6467a;
        }

        private void l(int i4, int i5) {
            List list = this.f6466b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = (a) this.f6466b.get(size);
                    int i6 = aVar.f6467a;
                    if (i6 >= i4) {
                        aVar.f6467a = i6 + i5;
                    }
                }
            }
        }

        private void m(int i4, int i5) {
            List list = this.f6466b;
            if (list != null) {
                int i6 = i4 + i5;
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = (a) this.f6466b.get(size);
                    int i7 = aVar.f6467a;
                    if (i7 >= i4) {
                        if (i7 < i6) {
                            this.f6466b.remove(size);
                        } else {
                            aVar.f6467a = i7 - i5;
                        }
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.f6466b == null) {
                this.f6466b = new ArrayList();
            }
            int size = this.f6466b.size();
            for (int i4 = 0; i4 < size; i4++) {
                a aVar2 = (a) this.f6466b.get(i4);
                if (aVar2.f6467a == aVar.f6467a) {
                    this.f6466b.remove(i4);
                }
                if (aVar2.f6467a >= aVar.f6467a) {
                    this.f6466b.add(i4, aVar);
                    return;
                }
            }
            this.f6466b.add(aVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int[] iArr = this.f6465a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f6466b = null;
        }

        /* access modifiers changed from: package-private */
        public void c(int i4) {
            int[] iArr = this.f6465a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i4, 10) + 1)];
                this.f6465a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[o(i4)];
                this.f6465a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f6465a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        public int d(int i4) {
            List list = this.f6466b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((a) this.f6466b.get(size)).f6467a >= i4) {
                        this.f6466b.remove(size);
                    }
                }
            }
            return h(i4);
        }

        public a e(int i4, int i5, int i6, boolean z3) {
            List list = this.f6466b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                a aVar = (a) this.f6466b.get(i7);
                int i8 = aVar.f6467a;
                if (i8 >= i5) {
                    return null;
                }
                if (i8 >= i4 && (i6 == 0 || aVar.f6468b == i6 || (z3 && aVar.f6470d))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i4) {
            List list = this.f6466b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f6466b.get(size);
                if (aVar.f6467a == i4) {
                    return aVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public int g(int i4) {
            int[] iArr = this.f6465a;
            if (iArr == null || i4 >= iArr.length) {
                return -1;
            }
            return iArr[i4];
        }

        /* access modifiers changed from: package-private */
        public int h(int i4) {
            int[] iArr = this.f6465a;
            if (iArr == null || i4 >= iArr.length) {
                return -1;
            }
            int i5 = i(i4);
            if (i5 == -1) {
                int[] iArr2 = this.f6465a;
                Arrays.fill(iArr2, i4, iArr2.length, -1);
                return this.f6465a.length;
            }
            int min = Math.min(i5 + 1, this.f6465a.length);
            Arrays.fill(this.f6465a, i4, min, -1);
            return min;
        }

        /* access modifiers changed from: package-private */
        public void j(int i4, int i5) {
            int[] iArr = this.f6465a;
            if (iArr != null && i4 < iArr.length) {
                int i6 = i4 + i5;
                c(i6);
                int[] iArr2 = this.f6465a;
                System.arraycopy(iArr2, i4, iArr2, i6, (iArr2.length - i4) - i5);
                Arrays.fill(this.f6465a, i4, i6, -1);
                l(i4, i5);
            }
        }

        /* access modifiers changed from: package-private */
        public void k(int i4, int i5) {
            int[] iArr = this.f6465a;
            if (iArr != null && i4 < iArr.length) {
                int i6 = i4 + i5;
                c(i6);
                int[] iArr2 = this.f6465a;
                System.arraycopy(iArr2, i6, iArr2, i4, (iArr2.length - i4) - i5);
                int[] iArr3 = this.f6465a;
                Arrays.fill(iArr3, iArr3.length - i5, iArr3.length, -1);
                m(i4, i5);
            }
        }

        /* access modifiers changed from: package-private */
        public void n(int i4, f fVar) {
            c(i4);
            this.f6465a[i4] = fVar.f6485e;
        }

        /* access modifiers changed from: package-private */
        public int o(int i4) {
            int length = this.f6465a.length;
            while (length <= i4) {
                length *= 2;
            }
            return length;
        }

        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0103a();

            /* renamed from: a  reason: collision with root package name */
            int f6467a;

            /* renamed from: b  reason: collision with root package name */
            int f6468b;

            /* renamed from: c  reason: collision with root package name */
            int[] f6469c;

            /* renamed from: d  reason: collision with root package name */
            boolean f6470d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            class C0103a implements Parcelable.Creator {
                C0103a() {
                }

                /* renamed from: a */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                /* renamed from: b */
                public a[] newArray(int i4) {
                    return new a[i4];
                }
            }

            a(Parcel parcel) {
                this.f6467a = parcel.readInt();
                this.f6468b = parcel.readInt();
                this.f6470d = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f6469c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int describeContents() {
                return 0;
            }

            /* access modifiers changed from: package-private */
            public int t(int i4) {
                int[] iArr = this.f6469c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i4];
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f6467a + ", mGapDir=" + this.f6468b + ", mHasUnwantedGapAfter=" + this.f6470d + ", mGapPerSpan=" + Arrays.toString(this.f6469c) + '}';
            }

            public void writeToParcel(Parcel parcel, int i4) {
                parcel.writeInt(this.f6467a);
                parcel.writeInt(this.f6468b);
                parcel.writeInt(this.f6470d ? 1 : 0);
                int[] iArr = this.f6469c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f6469c);
            }

            a() {
            }
        }
    }
}
