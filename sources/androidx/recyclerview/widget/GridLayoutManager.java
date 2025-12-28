package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.core.view.accessibility.A;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: I  reason: collision with root package name */
    boolean f6161I = false;

    /* renamed from: J  reason: collision with root package name */
    int f6162J = -1;

    /* renamed from: K  reason: collision with root package name */
    int[] f6163K;

    /* renamed from: L  reason: collision with root package name */
    View[] f6164L;

    /* renamed from: M  reason: collision with root package name */
    final SparseIntArray f6165M = new SparseIntArray();

    /* renamed from: N  reason: collision with root package name */
    final SparseIntArray f6166N = new SparseIntArray();

    /* renamed from: O  reason: collision with root package name */
    c f6167O = new a();

    /* renamed from: P  reason: collision with root package name */
    final Rect f6168P = new Rect();

    /* renamed from: Q  reason: collision with root package name */
    private boolean f6169Q;

    public static final class a extends c {
        public int e(int i4, int i5) {
            return i4 % i5;
        }

        public int f(int i4) {
            return 1;
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final SparseIntArray f6172a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        final SparseIntArray f6173b = new SparseIntArray();

        /* renamed from: c  reason: collision with root package name */
        private boolean f6174c = false;

        /* renamed from: d  reason: collision with root package name */
        private boolean f6175d = false;

        static int a(SparseIntArray sparseIntArray, int i4) {
            int size = sparseIntArray.size() - 1;
            int i5 = 0;
            while (i5 <= size) {
                int i6 = (i5 + size) >>> 1;
                if (sparseIntArray.keyAt(i6) < i4) {
                    i5 = i6 + 1;
                } else {
                    size = i6 - 1;
                }
            }
            int i7 = i5 - 1;
            if (i7 < 0 || i7 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i7);
        }

        /* access modifiers changed from: package-private */
        public int b(int i4, int i5) {
            if (!this.f6175d) {
                return d(i4, i5);
            }
            int i6 = this.f6173b.get(i4, -1);
            if (i6 != -1) {
                return i6;
            }
            int d4 = d(i4, i5);
            this.f6173b.put(i4, d4);
            return d4;
        }

        /* access modifiers changed from: package-private */
        public int c(int i4, int i5) {
            if (!this.f6174c) {
                return e(i4, i5);
            }
            int i6 = this.f6172a.get(i4, -1);
            if (i6 != -1) {
                return i6;
            }
            int e4 = e(i4, i5);
            this.f6172a.put(i4, e4);
            return e4;
        }

        public int d(int i4, int i5) {
            int i6;
            int i7;
            int i8;
            int a4;
            if (!this.f6175d || (a4 = a(this.f6173b, i4)) == -1) {
                i8 = 0;
                i7 = 0;
                i6 = 0;
            } else {
                i8 = this.f6173b.get(a4);
                i7 = a4 + 1;
                i6 = c(a4, i5) + f(a4);
                if (i6 == i5) {
                    i8++;
                    i6 = 0;
                }
            }
            int f4 = f(i4);
            while (i7 < i4) {
                int f5 = f(i7);
                int i9 = i6 + f5;
                if (i9 == i5) {
                    i8++;
                    i9 = 0;
                } else if (i9 > i5) {
                    i8++;
                    i9 = f5;
                }
                i7++;
            }
            if (i6 + f4 > i5) {
                return i8 + 1;
            }
            return i8;
        }

        public abstract int e(int i4, int i5);

        public abstract int f(int i4);

        public void g() {
            this.f6173b.clear();
        }

        public void h() {
            this.f6172a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        m3(RecyclerView.o.r0(context, attributeSet, i4, i5).f6375b);
    }

    private void V2(RecyclerView.u uVar, RecyclerView.z zVar, int i4, boolean z3) {
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        if (z3) {
            i7 = 1;
            i5 = i4;
            i6 = 0;
        } else {
            i6 = i4 - 1;
            i5 = -1;
            i7 = -1;
        }
        while (i6 != i5) {
            View view = this.f6164L[i6];
            b bVar = (b) view.getLayoutParams();
            int i32 = i3(uVar, zVar, q0(view));
            bVar.f6171f = i32;
            bVar.f6170e = i8;
            i8 += i32;
            i6 += i7;
        }
    }

    private void W2() {
        int W3 = W();
        for (int i4 = 0; i4 < W3; i4++) {
            b bVar = (b) V(i4).getLayoutParams();
            int t4 = bVar.t();
            this.f6165M.put(t4, bVar.y());
            this.f6166N.put(t4, bVar.x());
        }
    }

    private void X2(int i4) {
        this.f6163K = Y2(this.f6163K, this.f6162J, i4);
    }

    static int[] Y2(int[] iArr, int i4, int i5) {
        int i6;
        if (!(iArr != null && iArr.length == i4 + 1 && iArr[iArr.length - 1] == i5)) {
            iArr = new int[(i4 + 1)];
        }
        int i7 = 0;
        iArr[0] = 0;
        int i8 = i5 / i4;
        int i9 = i5 % i4;
        int i10 = 0;
        for (int i11 = 1; i11 <= i4; i11++) {
            i7 += i9;
            if (i7 <= 0 || i4 - i7 >= i9) {
                i6 = i8;
            } else {
                i6 = i8 + 1;
                i7 -= i4;
            }
            i10 += i6;
            iArr[i11] = i10;
        }
        return iArr;
    }

    private void Z2() {
        this.f6165M.clear();
        this.f6166N.clear();
    }

    private int a3(RecyclerView.z zVar) {
        int i4;
        if (!(W() == 0 || zVar.b() == 0)) {
            e2();
            boolean y22 = y2();
            View i22 = i2(!y22, true);
            View h22 = h2(!y22, true);
            if (!(i22 == null || h22 == null)) {
                int b4 = this.f6167O.b(q0(i22), this.f6162J);
                int b5 = this.f6167O.b(q0(h22), this.f6162J);
                int min = Math.min(b4, b5);
                int max = Math.max(b4, b5);
                int b6 = this.f6167O.b(zVar.b() - 1, this.f6162J) + 1;
                if (this.f6189x) {
                    i4 = Math.max(0, (b6 - max) - 1);
                } else {
                    i4 = Math.max(0, min);
                }
                if (!y22) {
                    return i4;
                }
                return Math.round((((float) i4) * (((float) Math.abs(this.f6186u.d(h22) - this.f6186u.g(i22))) / ((float) ((this.f6167O.b(q0(h22), this.f6162J) - this.f6167O.b(q0(i22), this.f6162J)) + 1)))) + ((float) (this.f6186u.m() - this.f6186u.g(i22))));
            }
        }
        return 0;
    }

    private int b3(RecyclerView.z zVar) {
        if (!(W() == 0 || zVar.b() == 0)) {
            e2();
            View i22 = i2(!y2(), true);
            View h22 = h2(!y2(), true);
            if (!(i22 == null || h22 == null)) {
                if (!y2()) {
                    return this.f6167O.b(zVar.b() - 1, this.f6162J) + 1;
                }
                int d4 = this.f6186u.d(h22) - this.f6186u.g(i22);
                int b4 = this.f6167O.b(q0(i22), this.f6162J);
                return (int) ((((float) d4) / ((float) ((this.f6167O.b(q0(h22), this.f6162J) - b4) + 1))) * ((float) (this.f6167O.b(zVar.b() - 1, this.f6162J) + 1)));
            }
        }
        return 0;
    }

    private void c3(RecyclerView.u uVar, RecyclerView.z zVar, LinearLayoutManager.a aVar, int i4) {
        boolean z3;
        if (i4 == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int h32 = h3(uVar, zVar, aVar.f6193b);
        if (z3) {
            while (h32 > 0) {
                int i5 = aVar.f6193b;
                if (i5 > 0) {
                    int i6 = i5 - 1;
                    aVar.f6193b = i6;
                    h32 = h3(uVar, zVar, i6);
                } else {
                    return;
                }
            }
            return;
        }
        int b4 = zVar.b() - 1;
        int i7 = aVar.f6193b;
        while (i7 < b4) {
            int i8 = i7 + 1;
            int h33 = h3(uVar, zVar, i8);
            if (h33 <= h32) {
                break;
            }
            i7 = i8;
            h32 = h33;
        }
        aVar.f6193b = i7;
    }

    private void d3() {
        View[] viewArr = this.f6164L;
        if (viewArr == null || viewArr.length != this.f6162J) {
            this.f6164L = new View[this.f6162J];
        }
    }

    private int g3(RecyclerView.u uVar, RecyclerView.z zVar, int i4) {
        if (!zVar.e()) {
            return this.f6167O.b(i4, this.f6162J);
        }
        int f4 = uVar.f(i4);
        if (f4 != -1) {
            return this.f6167O.b(f4, this.f6162J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i4);
        return 0;
    }

    private int h3(RecyclerView.u uVar, RecyclerView.z zVar, int i4) {
        if (!zVar.e()) {
            return this.f6167O.c(i4, this.f6162J);
        }
        int i5 = this.f6166N.get(i4, -1);
        if (i5 != -1) {
            return i5;
        }
        int f4 = uVar.f(i4);
        if (f4 != -1) {
            return this.f6167O.c(f4, this.f6162J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i4);
        return 0;
    }

    private int i3(RecyclerView.u uVar, RecyclerView.z zVar, int i4) {
        if (!zVar.e()) {
            return this.f6167O.f(i4);
        }
        int i5 = this.f6165M.get(i4, -1);
        if (i5 != -1) {
            return i5;
        }
        int f4 = uVar.f(i4);
        if (f4 != -1) {
            return this.f6167O.f(f4);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i4);
        return 1;
    }

    private void j3(float f4, int i4) {
        X2(Math.max(Math.round(f4 * ((float) this.f6162J)), i4));
    }

    private void k3(View view, int i4, boolean z3) {
        int i5;
        int i6;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f6379b;
        int i7 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i8 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int e32 = e3(bVar.f6170e, bVar.f6171f);
        if (this.f6184s == 1) {
            i5 = RecyclerView.o.X(e32, i4, i8, bVar.width, false);
            i6 = RecyclerView.o.X(this.f6186u.n(), k0(), i7, bVar.height, true);
        } else {
            int X3 = RecyclerView.o.X(e32, i4, i7, bVar.height, false);
            int X4 = RecyclerView.o.X(this.f6186u.n(), y0(), i8, bVar.width, true);
            i6 = X3;
            i5 = X4;
        }
        l3(view, i5, i6, z3);
    }

    private void l3(View view, int i4, int i5, boolean z3) {
        boolean z4;
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z3) {
            z4 = S1(view, i4, i5, pVar);
        } else {
            z4 = Q1(view, i4, i5, pVar);
        }
        if (z4) {
            view.measure(i4, i5);
        }
    }

    private void n3() {
        int j02;
        int paddingTop;
        if (w2() == 1) {
            j02 = x0() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            j02 = j0() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        X2(j02 - paddingTop);
    }

    /* access modifiers changed from: package-private */
    public void B2(RecyclerView.u uVar, RecyclerView.z zVar, LinearLayoutManager.a aVar, int i4) {
        super.B2(uVar, zVar, aVar, i4);
        n3();
        if (zVar.b() > 0 && !zVar.e()) {
            c3(uVar, zVar, aVar, i4);
        }
        d3();
    }

    public int E(RecyclerView.z zVar) {
        if (this.f6169Q) {
            return a3(zVar);
        }
        return super.E(zVar);
    }

    public int F(RecyclerView.z zVar) {
        if (this.f6169Q) {
            return b3(zVar);
        }
        return super.F(zVar);
    }

    public int H(RecyclerView.z zVar) {
        if (this.f6169Q) {
            return a3(zVar);
        }
        return super.H(zVar);
    }

    public int H1(int i4, RecyclerView.u uVar, RecyclerView.z zVar) {
        n3();
        d3();
        return super.H1(i4, uVar, zVar);
    }

    public int I(RecyclerView.z zVar) {
        if (this.f6169Q) {
            return b3(zVar);
        }
        return super.I(zVar);
    }

    public int J1(int i4, RecyclerView.u uVar, RecyclerView.z zVar) {
        n3();
        d3();
        return super.J1(i4, uVar, zVar);
    }

    public void M2(boolean z3) {
        if (!z3) {
            super.M2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public void N1(Rect rect, int i4, int i5) {
        int i6;
        int i7;
        if (this.f6163K == null) {
            super.N1(rect, i4, i5);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f6184s == 1) {
            i7 = RecyclerView.o.A(i5, rect.height() + paddingTop, o0());
            int[] iArr = this.f6163K;
            i6 = RecyclerView.o.A(i4, iArr[iArr.length - 1] + paddingLeft, p0());
        } else {
            i6 = RecyclerView.o.A(i4, rect.width() + paddingLeft, p0());
            int[] iArr2 = this.f6163K;
            i7 = RecyclerView.o.A(i5, iArr2[iArr2.length - 1] + paddingTop, o0());
        }
        M1(i6, i7);
    }

    public RecyclerView.p Q() {
        if (this.f6184s == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    public RecyclerView.p R(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public RecyclerView.p S(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d1, code lost:
        if (r13 == r7) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f1, code lost:
        if (r13 == r10) goto L_0x00f3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View T0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.u r26, androidx.recyclerview.widget.RecyclerView.z r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.O(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.b) r5
            int r6 = r5.f6170e
            int r5 = r5.f6171f
            int r5 = r5 + r6
            android.view.View r7 = super.T0(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.c2(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = r9
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f6189x
            r11 = -1
            if (r7 == r10) goto L_0x0039
            int r7 = r23.W()
            int r7 = r7 - r9
            r10 = r11
            r12 = r10
            goto L_0x0040
        L_0x0039:
            int r7 = r23.W()
            r10 = r7
            r12 = r9
            r7 = 0
        L_0x0040:
            int r13 = r0.f6184s
            if (r13 != r9) goto L_0x004c
            boolean r13 = r23.x2()
            if (r13 == 0) goto L_0x004c
            r13 = r9
            goto L_0x004d
        L_0x004c:
            r13 = 0
        L_0x004d:
            int r14 = r0.g3(r1, r2, r7)
            r15 = r11
            r16 = r15
            r8 = 0
            r17 = 0
            r11 = r7
            r7 = r4
        L_0x0059:
            if (r11 == r10) goto L_0x0065
            int r9 = r0.g3(r1, r2, r11)
            android.view.View r1 = r0.V(r11)
            if (r1 != r3) goto L_0x0069
        L_0x0065:
            r21 = r7
            goto L_0x0137
        L_0x0069:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0082
            if (r9 == r14) goto L_0x0082
            if (r4 == 0) goto L_0x0074
            goto L_0x0065
        L_0x0074:
            r18 = r3
            r21 = r7
        L_0x0078:
            r19 = r8
            r20 = r10
        L_0x007c:
            r7 = r16
            r8 = r17
            goto L_0x0123
        L_0x0082:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r9 = (androidx.recyclerview.widget.GridLayoutManager.b) r9
            int r2 = r9.f6170e
            r18 = r3
            int r3 = r9.f6171f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009a
            if (r2 != r6) goto L_0x009a
            if (r3 != r5) goto L_0x009a
            return r1
        L_0x009a:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a2
            if (r4 == 0) goto L_0x00aa
        L_0x00a2:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00b5
            if (r7 != 0) goto L_0x00b5
        L_0x00aa:
            r21 = r7
        L_0x00ac:
            r19 = r8
            r20 = r10
            r7 = r16
            r8 = r17
            goto L_0x00f3
        L_0x00b5:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d4
            if (r7 <= r8) goto L_0x00ca
        L_0x00c9:
            goto L_0x00ac
        L_0x00ca:
            if (r7 != r8) goto L_0x0078
            if (r2 <= r15) goto L_0x00d0
            r7 = 1
            goto L_0x00d1
        L_0x00d0:
            r7 = 0
        L_0x00d1:
            if (r13 != r7) goto L_0x0078
            goto L_0x00c9
        L_0x00d4:
            if (r4 != 0) goto L_0x0078
            r19 = r8
            r20 = r10
            r8 = 0
            r10 = 1
            boolean r22 = r0.I0(r1, r8, r10)
            if (r22 == 0) goto L_0x007c
            r8 = r17
            if (r7 <= r8) goto L_0x00e9
            r7 = r16
            goto L_0x00f3
        L_0x00e9:
            if (r7 != r8) goto L_0x0121
            r7 = r16
            if (r2 <= r7) goto L_0x00f0
            goto L_0x00f1
        L_0x00f0:
            r10 = 0
        L_0x00f1:
            if (r13 != r10) goto L_0x0123
        L_0x00f3:
            boolean r10 = r1.hasFocusable()
            if (r10 == 0) goto L_0x010f
            int r4 = r9.f6170e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L_0x012b
        L_0x010f:
            int r7 = r9.f6170e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L_0x012b
        L_0x0121:
            r7 = r16
        L_0x0123:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L_0x012b:
            int r11 = r11 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r10 = r20
            r9 = 1
            goto L_0x0059
        L_0x0137:
            if (r4 == 0) goto L_0x013a
            goto L_0x013c
        L_0x013a:
            r4 = r21
        L_0x013c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.T0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z):android.view.View");
    }

    public boolean W1() {
        if (this.f6179D != null || this.f6161I) {
            return false;
        }
        return true;
    }

    public void X0(RecyclerView.u uVar, RecyclerView.z zVar, A a4) {
        super.X0(uVar, zVar, a4);
        a4.j0(GridView.class.getName());
    }

    /* access modifiers changed from: package-private */
    public void Y1(RecyclerView.z zVar, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int i4 = this.f6162J;
        for (int i5 = 0; i5 < this.f6162J && cVar.c(zVar) && i4 > 0; i5++) {
            int i6 = cVar.f6204d;
            cVar2.a(i6, Math.max(0, cVar.f6207g));
            i4 -= this.f6167O.f(i6);
            cVar.f6204d += cVar.f6205e;
        }
    }

    public void Z0(RecyclerView.u uVar, RecyclerView.z zVar, View view, A a4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.Y0(view, a4);
            return;
        }
        b bVar = (b) layoutParams;
        int g32 = g3(uVar, zVar, bVar.t());
        if (this.f6184s == 0) {
            a4.m0(A.g.a(bVar.x(), bVar.y(), g32, 1, false, false));
            return;
        }
        a4.m0(A.g.a(g32, 1, bVar.x(), bVar.y(), false, false));
    }

    public int a0(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f6184s == 1) {
            return this.f6162J;
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return g3(uVar, zVar, zVar.b() - 1) + 1;
    }

    public void b1(RecyclerView recyclerView, int i4, int i5) {
        this.f6167O.h();
        this.f6167O.g();
    }

    public void c1(RecyclerView recyclerView) {
        this.f6167O.h();
        this.f6167O.g();
    }

    public void d1(RecyclerView recyclerView, int i4, int i5, int i6) {
        this.f6167O.h();
        this.f6167O.g();
    }

    public void e1(RecyclerView recyclerView, int i4, int i5) {
        this.f6167O.h();
        this.f6167O.g();
    }

    /* access modifiers changed from: package-private */
    public int e3(int i4, int i5) {
        if (this.f6184s != 1 || !x2()) {
            int[] iArr = this.f6163K;
            return iArr[i5 + i4] - iArr[i4];
        }
        int[] iArr2 = this.f6163K;
        int i6 = this.f6162J;
        return iArr2[i6 - i4] - iArr2[(i6 - i4) - i5];
    }

    public int f3() {
        return this.f6162J;
    }

    public void g1(RecyclerView recyclerView, int i4, int i5, Object obj) {
        this.f6167O.h();
        this.f6167O.g();
    }

    public void h1(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (zVar.e()) {
            W2();
        }
        super.h1(uVar, zVar);
        Z2();
    }

    public void i1(RecyclerView.z zVar) {
        super.i1(zVar);
        this.f6161I = false;
    }

    public void m3(int i4) {
        if (i4 != this.f6162J) {
            this.f6161I = true;
            if (i4 >= 1) {
                this.f6162J = i4;
                this.f6167O.h();
                E1();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i4);
        }
    }

    /* access modifiers changed from: package-private */
    public View q2(RecyclerView.u uVar, RecyclerView.z zVar, boolean z3, boolean z4) {
        int i4;
        int i5;
        int W3 = W();
        int i6 = 1;
        if (z4) {
            i5 = W() - 1;
            i4 = -1;
            i6 = -1;
        } else {
            i4 = W3;
            i5 = 0;
        }
        int b4 = zVar.b();
        e2();
        int m4 = this.f6186u.m();
        int i7 = this.f6186u.i();
        View view = null;
        View view2 = null;
        while (i5 != i4) {
            View V3 = V(i5);
            int q02 = q0(V3);
            if (q02 >= 0 && q02 < b4 && h3(uVar, zVar, q02) == 0) {
                if (((RecyclerView.p) V3.getLayoutParams()).v()) {
                    if (view2 == null) {
                        view2 = V3;
                    }
                } else if (this.f6186u.g(V3) < i7 && this.f6186u.d(V3) >= m4) {
                    return V3;
                } else {
                    if (view == null) {
                        view = V3;
                    }
                }
            }
            i5 += i6;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    public int t0(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f6184s == 0) {
            return this.f6162J;
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return g3(uVar, zVar, zVar.b() - 1) + 1;
    }

    public boolean z(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    /* access modifiers changed from: package-private */
    public void z2(RecyclerView.u uVar, RecyclerView.z zVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        View d4;
        RecyclerView.u uVar2 = uVar;
        RecyclerView.z zVar2 = zVar;
        LinearLayoutManager.c cVar2 = cVar;
        LinearLayoutManager.b bVar2 = bVar;
        int l4 = this.f6186u.l();
        if (l4 != 1073741824) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (W() > 0) {
            i4 = this.f6163K[this.f6162J];
        } else {
            i4 = 0;
        }
        if (z3) {
            n3();
        }
        if (cVar2.f6205e == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        int i18 = this.f6162J;
        if (!z4) {
            i18 = h3(uVar2, zVar2, cVar2.f6204d) + i3(uVar2, zVar2, cVar2.f6204d);
        }
        int i19 = 0;
        while (i19 < this.f6162J && cVar2.c(zVar2) && i18 > 0) {
            int i20 = cVar2.f6204d;
            int i32 = i3(uVar2, zVar2, i20);
            if (i32 <= this.f6162J) {
                i18 -= i32;
                if (i18 < 0 || (d4 = cVar2.d(uVar2)) == null) {
                    break;
                }
                this.f6164L[i19] = d4;
                i19++;
            } else {
                throw new IllegalArgumentException("Item at position " + i20 + " requires " + i32 + " spans but GridLayoutManager has only " + this.f6162J + " spans.");
            }
        }
        if (i19 == 0) {
            bVar2.f6198b = true;
            return;
        }
        V2(uVar2, zVar2, i19, z4);
        float f4 = 0.0f;
        int i21 = 0;
        for (int i22 = 0; i22 < i19; i22++) {
            View view = this.f6164L[i22];
            if (cVar2.f6212l == null) {
                if (z4) {
                    q(view);
                } else {
                    r(view, 0);
                }
            } else if (z4) {
                o(view);
            } else {
                p(view, 0);
            }
            w(view, this.f6168P);
            k3(view, l4, false);
            int e4 = this.f6186u.e(view);
            if (e4 > i21) {
                i21 = e4;
            }
            float f5 = (((float) this.f6186u.f(view)) * 1.0f) / ((float) ((b) view.getLayoutParams()).f6171f);
            if (f5 > f4) {
                f4 = f5;
            }
        }
        if (z3) {
            j3(f4, i4);
            i21 = 0;
            for (int i23 = 0; i23 < i19; i23++) {
                View view2 = this.f6164L[i23];
                k3(view2, 1073741824, true);
                int e5 = this.f6186u.e(view2);
                if (e5 > i21) {
                    i21 = e5;
                }
            }
        }
        for (int i24 = 0; i24 < i19; i24++) {
            View view3 = this.f6164L[i24];
            if (this.f6186u.e(view3) != i21) {
                b bVar3 = (b) view3.getLayoutParams();
                Rect rect = bVar3.f6379b;
                int i25 = rect.top + rect.bottom + bVar3.topMargin + bVar3.bottomMargin;
                int i26 = rect.left + rect.right + bVar3.leftMargin + bVar3.rightMargin;
                int e32 = e3(bVar3.f6170e, bVar3.f6171f);
                if (this.f6184s == 1) {
                    i17 = RecyclerView.o.X(e32, 1073741824, i26, bVar3.width, false);
                    i16 = View.MeasureSpec.makeMeasureSpec(i21 - i25, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i21 - i26, 1073741824);
                    i16 = RecyclerView.o.X(e32, 1073741824, i25, bVar3.height, false);
                    i17 = makeMeasureSpec;
                }
                l3(view3, i17, i16, true);
            }
        }
        bVar2.f6197a = i21;
        if (this.f6184s == 1) {
            if (cVar2.f6206f == -1) {
                i8 = cVar2.f6202b;
                i15 = i8 - i21;
            } else {
                i15 = cVar2.f6202b;
                i8 = i15 + i21;
            }
            i5 = i15;
            i7 = 0;
            i6 = 0;
        } else {
            if (cVar2.f6206f == -1) {
                i14 = cVar2.f6202b;
                i13 = i14 - i21;
            } else {
                i13 = cVar2.f6202b;
                i14 = i13 + i21;
            }
            i6 = i13;
            i5 = 0;
            i7 = i14;
            i8 = 0;
        }
        int i27 = 0;
        while (i27 < i19) {
            View view4 = this.f6164L[i27];
            b bVar4 = (b) view4.getLayoutParams();
            if (this.f6184s == 1) {
                if (x2()) {
                    int paddingLeft = getPaddingLeft() + this.f6163K[this.f6162J - bVar4.f6170e];
                    i12 = i8;
                    i11 = paddingLeft;
                    i10 = paddingLeft - this.f6186u.f(view4);
                } else {
                    int paddingLeft2 = getPaddingLeft() + this.f6163K[bVar4.f6170e];
                    i12 = i8;
                    i10 = paddingLeft2;
                    i11 = this.f6186u.f(view4) + paddingLeft2;
                }
                i9 = i5;
            } else {
                int paddingTop = getPaddingTop() + this.f6163K[bVar4.f6170e];
                i9 = paddingTop;
                i11 = i7;
                i10 = i6;
                i12 = this.f6186u.f(view4) + paddingTop;
            }
            J0(view4, i10, i9, i11, i12);
            if (bVar4.v() || bVar4.u()) {
                bVar2.f6199c = true;
            }
            bVar2.f6200d |= view4.hasFocusable();
            i27++;
            i8 = i12;
            i7 = i11;
            i6 = i10;
            i5 = i9;
        }
        Arrays.fill(this.f6164L, (Object) null);
    }

    public static class b extends RecyclerView.p {

        /* renamed from: e  reason: collision with root package name */
        int f6170e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f6171f = 0;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int x() {
            return this.f6170e;
        }

        public int y() {
            return this.f6171f;
        }

        public b(int i4, int i5) {
            super(i4, i5);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public GridLayoutManager(Context context, int i4) {
        super(context);
        m3(i4);
    }

    public GridLayoutManager(Context context, int i4, int i5, boolean z3) {
        super(context, i5, z3);
        m3(i4);
    }
}
