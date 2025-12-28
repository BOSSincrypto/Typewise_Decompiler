package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.p;
import com.google.android.flexbox.d;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayoutManager extends RecyclerView.o implements a, RecyclerView.y.b {

    /* renamed from: S  reason: collision with root package name */
    private static final Rect f11432S = new Rect();
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public final d f11433A;

    /* renamed from: B  reason: collision with root package name */
    private RecyclerView.u f11434B;

    /* renamed from: C  reason: collision with root package name */
    private RecyclerView.z f11435C;

    /* renamed from: D  reason: collision with root package name */
    private d f11436D;

    /* renamed from: E  reason: collision with root package name */
    private b f11437E;
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public p f11438F;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public p f11439G;

    /* renamed from: H  reason: collision with root package name */
    private e f11440H;

    /* renamed from: I  reason: collision with root package name */
    private int f11441I;

    /* renamed from: J  reason: collision with root package name */
    private int f11442J;

    /* renamed from: K  reason: collision with root package name */
    private int f11443K;

    /* renamed from: L  reason: collision with root package name */
    private int f11444L;

    /* renamed from: M  reason: collision with root package name */
    private boolean f11445M;

    /* renamed from: N  reason: collision with root package name */
    private SparseArray f11446N;

    /* renamed from: O  reason: collision with root package name */
    private final Context f11447O;

    /* renamed from: P  reason: collision with root package name */
    private View f11448P;

    /* renamed from: Q  reason: collision with root package name */
    private int f11449Q;

    /* renamed from: R  reason: collision with root package name */
    private d.b f11450R;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public int f11451s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public int f11452t;

    /* renamed from: u  reason: collision with root package name */
    private int f11453u;

    /* renamed from: v  reason: collision with root package name */
    private int f11454v;

    /* renamed from: w  reason: collision with root package name */
    private int f11455w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public boolean f11456x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f11457y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public List f11458z;

    private class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f11459a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f11460b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f11461c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f11462d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public boolean f11463e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public boolean f11464f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public boolean f11465g;

        private b() {
            this.f11462d = 0;
        }

        static /* synthetic */ int l(b bVar, int i4) {
            int i5 = bVar.f11462d + i4;
            bVar.f11462d = i5;
            return i5;
        }

        /* access modifiers changed from: private */
        public void r() {
            int i4;
            int i5;
            if (FlexboxLayoutManager.this.m() || !FlexboxLayoutManager.this.f11456x) {
                if (this.f11463e) {
                    i4 = FlexboxLayoutManager.this.f11438F.i();
                } else {
                    i4 = FlexboxLayoutManager.this.f11438F.m();
                }
                this.f11461c = i4;
                return;
            }
            if (this.f11463e) {
                i5 = FlexboxLayoutManager.this.f11438F.i();
            } else {
                i5 = FlexboxLayoutManager.this.x0() - FlexboxLayoutManager.this.f11438F.m();
            }
            this.f11461c = i5;
        }

        /* access modifiers changed from: private */
        public void s(View view) {
            p pVar;
            if (FlexboxLayoutManager.this.f11452t == 0) {
                pVar = FlexboxLayoutManager.this.f11439G;
            } else {
                pVar = FlexboxLayoutManager.this.f11438F;
            }
            if (FlexboxLayoutManager.this.m() || !FlexboxLayoutManager.this.f11456x) {
                if (this.f11463e) {
                    this.f11461c = pVar.d(view) + pVar.o();
                } else {
                    this.f11461c = pVar.g(view);
                }
            } else if (this.f11463e) {
                this.f11461c = pVar.g(view) + pVar.o();
            } else {
                this.f11461c = pVar.d(view);
            }
            this.f11459a = FlexboxLayoutManager.this.q0(view);
            int i4 = 0;
            this.f11465g = false;
            int[] iArr = FlexboxLayoutManager.this.f11433A.f11508c;
            int i5 = this.f11459a;
            if (i5 == -1) {
                i5 = 0;
            }
            int i6 = iArr[i5];
            if (i6 != -1) {
                i4 = i6;
            }
            this.f11460b = i4;
            if (FlexboxLayoutManager.this.f11458z.size() > this.f11460b) {
                this.f11459a = ((c) FlexboxLayoutManager.this.f11458z.get(this.f11460b)).f11502o;
            }
        }

        /* access modifiers changed from: private */
        public void t() {
            this.f11459a = -1;
            this.f11460b = -1;
            this.f11461c = Integer.MIN_VALUE;
            boolean z3 = false;
            this.f11464f = false;
            this.f11465g = false;
            if (FlexboxLayoutManager.this.m()) {
                if (FlexboxLayoutManager.this.f11452t == 0) {
                    if (FlexboxLayoutManager.this.f11451s == 1) {
                        z3 = true;
                    }
                    this.f11463e = z3;
                    return;
                }
                if (FlexboxLayoutManager.this.f11452t == 2) {
                    z3 = true;
                }
                this.f11463e = z3;
            } else if (FlexboxLayoutManager.this.f11452t == 0) {
                if (FlexboxLayoutManager.this.f11451s == 3) {
                    z3 = true;
                }
                this.f11463e = z3;
            } else {
                if (FlexboxLayoutManager.this.f11452t == 2) {
                    z3 = true;
                }
                this.f11463e = z3;
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f11459a + ", mFlexLinePosition=" + this.f11460b + ", mCoordinate=" + this.f11461c + ", mPerpendicularCoordinate=" + this.f11462d + ", mLayoutFromEnd=" + this.f11463e + ", mValid=" + this.f11464f + ", mAssignedFromSavedState=" + this.f11465g + '}';
        }
    }

    private static class d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f11476a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public boolean f11477b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f11478c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f11479d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f11480e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f11481f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f11482g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public int f11483h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public int f11484i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public boolean f11485j;

        private d() {
            this.f11483h = 1;
            this.f11484i = 1;
        }

        /* access modifiers changed from: private */
        public boolean D(RecyclerView.z zVar, List list) {
            int i4;
            int i5 = this.f11479d;
            if (i5 < 0 || i5 >= zVar.b() || (i4 = this.f11478c) < 0 || i4 >= list.size()) {
                return false;
            }
            return true;
        }

        static /* synthetic */ int c(d dVar, int i4) {
            int i5 = dVar.f11480e + i4;
            dVar.f11480e = i5;
            return i5;
        }

        static /* synthetic */ int d(d dVar, int i4) {
            int i5 = dVar.f11480e - i4;
            dVar.f11480e = i5;
            return i5;
        }

        static /* synthetic */ int i(d dVar, int i4) {
            int i5 = dVar.f11476a - i4;
            dVar.f11476a = i5;
            return i5;
        }

        static /* synthetic */ int l(d dVar) {
            int i4 = dVar.f11478c;
            dVar.f11478c = i4 + 1;
            return i4;
        }

        static /* synthetic */ int m(d dVar) {
            int i4 = dVar.f11478c;
            dVar.f11478c = i4 - 1;
            return i4;
        }

        static /* synthetic */ int n(d dVar, int i4) {
            int i5 = dVar.f11478c + i4;
            dVar.f11478c = i5;
            return i5;
        }

        static /* synthetic */ int q(d dVar, int i4) {
            int i5 = dVar.f11481f + i4;
            dVar.f11481f = i5;
            return i5;
        }

        static /* synthetic */ int u(d dVar, int i4) {
            int i5 = dVar.f11479d + i4;
            dVar.f11479d = i5;
            return i5;
        }

        static /* synthetic */ int v(d dVar, int i4) {
            int i5 = dVar.f11479d - i4;
            dVar.f11479d = i5;
            return i5;
        }

        public String toString() {
            return "LayoutState{mAvailable=" + this.f11476a + ", mFlexLinePosition=" + this.f11478c + ", mPosition=" + this.f11479d + ", mOffset=" + this.f11480e + ", mScrollingOffset=" + this.f11481f + ", mLastScrollDelta=" + this.f11482g + ", mItemDirection=" + this.f11483h + ", mLayoutDirection=" + this.f11484i + '}';
        }
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0, 1);
    }

    private int A2(View view) {
        return g0(view) + ((RecyclerView.p) view.getLayoutParams()).rightMargin;
    }

    private int B2(View view) {
        return h0(view) - ((RecyclerView.p) view.getLayoutParams()).topMargin;
    }

    private int C2(int i4, RecyclerView.u uVar, RecyclerView.z zVar) {
        boolean z3;
        if (W() == 0 || i4 == 0) {
            return 0;
        }
        l2();
        int i5 = 1;
        boolean unused = this.f11436D.f11485j = true;
        if (m() || !this.f11456x) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3 ? i4 <= 0 : i4 >= 0) {
            i5 = -1;
        }
        int abs = Math.abs(i4);
        X2(i5, abs);
        int o4 = this.f11436D.f11481f + m2(uVar, zVar, this.f11436D);
        if (o4 < 0) {
            return 0;
        }
        if (z3) {
            if (abs > o4) {
                i4 = (-i5) * o4;
            }
        } else if (abs > o4) {
            i4 = i5 * o4;
        }
        this.f11438F.r(-i4);
        int unused2 = this.f11436D.f11482g = i4;
        return i4;
    }

    private int D2(int i4) {
        int i5;
        int i6;
        int j4;
        if (W() == 0 || i4 == 0) {
            return 0;
        }
        l2();
        boolean m4 = m();
        View view = this.f11448P;
        if (m4) {
            i5 = view.getWidth();
        } else {
            i5 = view.getHeight();
        }
        if (m4) {
            i6 = x0();
        } else {
            i6 = j0();
        }
        if (m0() == 1) {
            int abs = Math.abs(i4);
            if (i4 < 0) {
                j4 = Math.min((i6 + this.f11437E.f11462d) - i5, abs);
            } else if (this.f11437E.f11462d + i4 <= 0) {
                return i4;
            } else {
                j4 = this.f11437E.f11462d;
            }
        } else if (i4 > 0) {
            return Math.min((i6 - this.f11437E.f11462d) - i5, i4);
        } else {
            if (this.f11437E.f11462d + i4 >= 0) {
                return i4;
            }
            j4 = this.f11437E.f11462d;
        }
        return -j4;
    }

    private boolean E2(View view, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int x02 = x0() - getPaddingRight();
        int j02 = j0() - getPaddingBottom();
        int z22 = z2(view);
        int B22 = B2(view);
        int A22 = A2(view);
        int x22 = x2(view);
        if (paddingLeft > z22 || x02 < A22) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z22 >= x02 || A22 >= paddingLeft) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (paddingTop > B22 || j02 < x22) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (B22 >= j02 || x22 >= paddingTop) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z3) {
            if (!z4 || !z6) {
                return false;
            }
            return true;
        } else if (!z5 || !z7) {
            return false;
        } else {
            return true;
        }
    }

    private int F2(c cVar, d dVar) {
        if (m()) {
            return G2(cVar, dVar);
        }
        return H2(cVar, dVar);
    }

    private static boolean G0(int i4, int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (i6 > 0 && i4 != i6) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode == 1073741824 && size == i4) {
                return true;
            }
            return false;
        } else if (size >= i4) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int G2(com.google.android.flexbox.c r22, com.google.android.flexbox.FlexboxLayoutManager.d r23) {
        /*
            r21 = this;
            r0 = r21
            r8 = r22
            int r1 = r21.getPaddingLeft()
            int r2 = r21.getPaddingRight()
            int r3 = r21.x0()
            int r4 = r23.f11480e
            int r5 = r23.f11484i
            r6 = -1
            if (r5 != r6) goto L_0x001e
            int r5 = r8.f11494g
            int r4 = r4 - r5
        L_0x001e:
            r9 = r4
            int r10 = r23.f11479d
            int r4 = r0.f11453u
            r5 = 0
            r11 = 1
            if (r4 == 0) goto L_0x00ae
            if (r4 == r11) goto L_0x00a0
            r6 = 2
            r7 = 1073741824(0x40000000, float:2.0)
            if (r4 == r6) goto L_0x008f
            r6 = 3
            if (r4 == r6) goto L_0x007c
            r6 = 4
            if (r4 == r6) goto L_0x0067
            r6 = 5
            if (r4 != r6) goto L_0x004e
            int r4 = r8.f11495h
            if (r4 == 0) goto L_0x0046
            int r6 = r8.f11492e
            int r6 = r3 - r6
            float r6 = (float) r6
            int r4 = r4 + r11
            float r4 = (float) r4
            float r6 = r6 / r4
            goto L_0x0047
        L_0x0046:
            r6 = r5
        L_0x0047:
            float r1 = (float) r1
            float r1 = r1 + r6
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r6
            goto L_0x00b2
        L_0x004e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.append(r3)
            int r3 = r0.f11453u
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0067:
            int r4 = r8.f11495h
            if (r4 == 0) goto L_0x0073
            int r6 = r8.f11492e
            int r6 = r3 - r6
            float r6 = (float) r6
            float r4 = (float) r4
            float r6 = r6 / r4
            goto L_0x0074
        L_0x0073:
            r6 = r5
        L_0x0074:
            float r1 = (float) r1
            float r4 = r6 / r7
            float r1 = r1 + r4
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r4
            goto L_0x00b2
        L_0x007c:
            float r1 = (float) r1
            int r4 = r8.f11495h
            if (r4 == r11) goto L_0x0084
            int r4 = r4 - r11
            float r4 = (float) r4
            goto L_0x0086
        L_0x0084:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0086:
            int r6 = r8.f11492e
            int r6 = r3 - r6
            float r6 = (float) r6
            float r6 = r6 / r4
            int r3 = r3 - r2
            float r2 = (float) r3
            goto L_0x00b2
        L_0x008f:
            float r1 = (float) r1
            int r4 = r8.f11492e
            int r6 = r3 - r4
            float r6 = (float) r6
            float r6 = r6 / r7
            float r1 = r1 + r6
            int r2 = r3 - r2
            float r2 = (float) r2
            int r3 = r3 - r4
            float r3 = (float) r3
            float r3 = r3 / r7
            float r2 = r2 - r3
        L_0x009e:
            r6 = r5
            goto L_0x00b2
        L_0x00a0:
            int r4 = r8.f11492e
            int r3 = r3 - r4
            int r3 = r3 + r2
            float r2 = (float) r3
            int r4 = r4 - r1
            float r1 = (float) r4
            r6 = r5
            r20 = r2
            r2 = r1
            r1 = r20
            goto L_0x00b2
        L_0x00ae:
            float r1 = (float) r1
            int r3 = r3 - r2
            float r2 = (float) r3
            goto L_0x009e
        L_0x00b2:
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f11437E
            int r3 = r3.f11462d
            float r3 = (float) r3
            float r1 = r1 - r3
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f11437E
            int r3 = r3.f11462d
            float r3 = (float) r3
            float r2 = r2 - r3
            float r12 = java.lang.Math.max(r6, r5)
            int r13 = r22.b()
            r3 = 0
            r14 = r10
        L_0x00cc:
            int r4 = r10 + r13
            if (r14 >= r4) goto L_0x019a
            android.view.View r15 = r0.b(r14)
            if (r15 != 0) goto L_0x00d8
            goto L_0x0195
        L_0x00d8:
            int r4 = r23.f11484i
            if (r4 != r11) goto L_0x00e9
            android.graphics.Rect r4 = f11432S
            r0.w(r15, r4)
            r0.q(r15)
        L_0x00e6:
            r16 = r3
            goto L_0x00f4
        L_0x00e9:
            android.graphics.Rect r4 = f11432S
            r0.w(r15, r4)
            r0.r(r15, r3)
            int r3 = r3 + 1
            goto L_0x00e6
        L_0x00f4:
            com.google.android.flexbox.d r3 = r0.f11433A
            long[] r4 = r3.f11509d
            r5 = r4[r14]
            int r3 = r3.y(r5)
            com.google.android.flexbox.d r4 = r0.f11433A
            int r4 = r4.x(r5)
            android.view.ViewGroup$LayoutParams r5 = r15.getLayoutParams()
            r7 = r5
            com.google.android.flexbox.FlexboxLayoutManager$c r7 = (com.google.android.flexbox.FlexboxLayoutManager.c) r7
            boolean r5 = r0.Q1(r15, r3, r4, r7)
            if (r5 == 0) goto L_0x0114
            r15.measure(r3, r4)
        L_0x0114:
            int r3 = r7.leftMargin
            int r4 = r0.n0(r15)
            int r3 = r3 + r4
            float r3 = (float) r3
            float r17 = r1 + r3
            int r1 = r7.rightMargin
            int r3 = r0.s0(r15)
            int r1 = r1 + r3
            float r1 = (float) r1
            float r18 = r2 - r1
            int r1 = r0.v0(r15)
            int r5 = r9 + r1
            boolean r1 = r0.f11456x
            if (r1 == 0) goto L_0x0152
            com.google.android.flexbox.d r1 = r0.f11433A
            int r2 = java.lang.Math.round(r18)
            int r3 = r15.getMeasuredWidth()
            int r4 = r2 - r3
            int r6 = java.lang.Math.round(r18)
            int r2 = r15.getMeasuredHeight()
            int r19 = r5 + r2
            r2 = r15
            r3 = r22
            r11 = r7
            r7 = r19
            r1.Q(r2, r3, r4, r5, r6, r7)
            goto L_0x016f
        L_0x0152:
            r11 = r7
            com.google.android.flexbox.d r1 = r0.f11433A
            int r4 = java.lang.Math.round(r17)
            int r2 = java.lang.Math.round(r17)
            int r3 = r15.getMeasuredWidth()
            int r6 = r2 + r3
            int r2 = r15.getMeasuredHeight()
            int r7 = r5 + r2
            r2 = r15
            r3 = r22
            r1.Q(r2, r3, r4, r5, r6, r7)
        L_0x016f:
            int r1 = r15.getMeasuredWidth()
            int r2 = r11.rightMargin
            int r1 = r1 + r2
            int r2 = r0.s0(r15)
            int r1 = r1 + r2
            float r1 = (float) r1
            float r1 = r1 + r12
            float r17 = r17 + r1
            int r1 = r15.getMeasuredWidth()
            int r2 = r11.leftMargin
            int r1 = r1 + r2
            int r2 = r0.n0(r15)
            int r1 = r1 + r2
            float r1 = (float) r1
            float r1 = r1 + r12
            float r18 = r18 - r1
            r3 = r16
            r1 = r17
            r2 = r18
        L_0x0195:
            int r14 = r14 + 1
            r11 = 1
            goto L_0x00cc
        L_0x019a:
            com.google.android.flexbox.FlexboxLayoutManager$d r1 = r0.f11436D
            int r1 = r1.f11484i
            r2 = r23
            com.google.android.flexbox.FlexboxLayoutManager.d.n(r2, r1)
            int r1 = r22.a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.G2(com.google.android.flexbox.c, com.google.android.flexbox.FlexboxLayoutManager$d):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int H2(com.google.android.flexbox.c r26, com.google.android.flexbox.FlexboxLayoutManager.d r27) {
        /*
            r25 = this;
            r0 = r25
            r9 = r26
            int r1 = r25.getPaddingTop()
            int r2 = r25.getPaddingBottom()
            int r3 = r25.j0()
            int r4 = r27.f11480e
            int r5 = r27.f11480e
            int r6 = r27.f11484i
            r7 = -1
            if (r6 != r7) goto L_0x0023
            int r6 = r9.f11494g
            int r4 = r4 - r6
            int r5 = r5 + r6
        L_0x0023:
            r10 = r4
            r11 = r5
            int r12 = r27.f11479d
            int r4 = r0.f11453u
            r5 = 0
            r13 = 1
            if (r4 == 0) goto L_0x00b4
            if (r4 == r13) goto L_0x00a6
            r6 = 2
            r7 = 1073741824(0x40000000, float:2.0)
            if (r4 == r6) goto L_0x0095
            r6 = 3
            if (r4 == r6) goto L_0x0082
            r6 = 4
            if (r4 == r6) goto L_0x006d
            r6 = 5
            if (r4 != r6) goto L_0x0054
            int r4 = r9.f11495h
            if (r4 == 0) goto L_0x004c
            int r6 = r9.f11492e
            int r6 = r3 - r6
            float r6 = (float) r6
            int r4 = r4 + r13
            float r4 = (float) r4
            float r6 = r6 / r4
            goto L_0x004d
        L_0x004c:
            r6 = r5
        L_0x004d:
            float r1 = (float) r1
            float r1 = r1 + r6
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r6
            goto L_0x00b8
        L_0x0054:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.append(r3)
            int r3 = r0.f11453u
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x006d:
            int r4 = r9.f11495h
            if (r4 == 0) goto L_0x0079
            int r6 = r9.f11492e
            int r6 = r3 - r6
            float r6 = (float) r6
            float r4 = (float) r4
            float r6 = r6 / r4
            goto L_0x007a
        L_0x0079:
            r6 = r5
        L_0x007a:
            float r1 = (float) r1
            float r4 = r6 / r7
            float r1 = r1 + r4
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r4
            goto L_0x00b8
        L_0x0082:
            float r1 = (float) r1
            int r4 = r9.f11495h
            if (r4 == r13) goto L_0x008a
            int r4 = r4 - r13
            float r4 = (float) r4
            goto L_0x008c
        L_0x008a:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x008c:
            int r6 = r9.f11492e
            int r6 = r3 - r6
            float r6 = (float) r6
            float r6 = r6 / r4
            int r3 = r3 - r2
            float r2 = (float) r3
            goto L_0x00b8
        L_0x0095:
            float r1 = (float) r1
            int r4 = r9.f11492e
            int r6 = r3 - r4
            float r6 = (float) r6
            float r6 = r6 / r7
            float r1 = r1 + r6
            int r2 = r3 - r2
            float r2 = (float) r2
            int r3 = r3 - r4
            float r3 = (float) r3
            float r3 = r3 / r7
            float r2 = r2 - r3
        L_0x00a4:
            r6 = r5
            goto L_0x00b8
        L_0x00a6:
            int r4 = r9.f11492e
            int r3 = r3 - r4
            int r3 = r3 + r2
            float r2 = (float) r3
            int r4 = r4 - r1
            float r1 = (float) r4
            r6 = r5
            r24 = r2
            r2 = r1
            r1 = r24
            goto L_0x00b8
        L_0x00b4:
            float r1 = (float) r1
            int r3 = r3 - r2
            float r2 = (float) r3
            goto L_0x00a4
        L_0x00b8:
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f11437E
            int r3 = r3.f11462d
            float r3 = (float) r3
            float r1 = r1 - r3
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f11437E
            int r3 = r3.f11462d
            float r3 = (float) r3
            float r2 = r2 - r3
            float r14 = java.lang.Math.max(r6, r5)
            int r15 = r26.b()
            r3 = 0
            r8 = r12
        L_0x00d2:
            int r4 = r12 + r15
            if (r8 >= r4) goto L_0x0210
            android.view.View r7 = r0.b(r8)
            if (r7 != 0) goto L_0x00e4
            r23 = r8
            r22 = r13
            r17 = r14
            goto L_0x0208
        L_0x00e4:
            com.google.android.flexbox.d r4 = r0.f11433A
            long[] r5 = r4.f11509d
            r17 = r14
            r13 = r5[r8]
            int r4 = r4.y(r13)
            com.google.android.flexbox.d r5 = r0.f11433A
            int r5 = r5.x(r13)
            android.view.ViewGroup$LayoutParams r6 = r7.getLayoutParams()
            r13 = r6
            com.google.android.flexbox.FlexboxLayoutManager$c r13 = (com.google.android.flexbox.FlexboxLayoutManager.c) r13
            boolean r6 = r0.Q1(r7, r4, r5, r13)
            if (r6 == 0) goto L_0x0106
            r7.measure(r4, r5)
        L_0x0106:
            int r4 = r13.topMargin
            int r5 = r0.v0(r7)
            int r4 = r4 + r5
            float r4 = (float) r4
            float r14 = r1 + r4
            int r1 = r13.rightMargin
            int r4 = r0.U(r7)
            int r1 = r1 + r4
            float r1 = (float) r1
            float r18 = r2 - r1
            int r1 = r27.f11484i
            r6 = 1
            if (r1 != r6) goto L_0x012c
            android.graphics.Rect r1 = f11432S
            r0.w(r7, r1)
            r0.q(r7)
        L_0x0129:
            r16 = r3
            goto L_0x0137
        L_0x012c:
            android.graphics.Rect r1 = f11432S
            r0.w(r7, r1)
            r0.r(r7, r3)
            int r3 = r3 + 1
            goto L_0x0129
        L_0x0137:
            int r1 = r0.n0(r7)
            int r5 = r10 + r1
            int r1 = r0.s0(r7)
            int r19 = r11 - r1
            boolean r4 = r0.f11456x
            if (r4 == 0) goto L_0x019b
            boolean r1 = r0.f11457y
            if (r1 == 0) goto L_0x0175
            com.google.android.flexbox.d r1 = r0.f11433A
            int r2 = r7.getMeasuredWidth()
            int r5 = r19 - r2
            int r2 = java.lang.Math.round(r18)
            int r3 = r7.getMeasuredHeight()
            int r20 = r2 - r3
            int r21 = java.lang.Math.round(r18)
            r2 = r7
            r3 = r26
            r22 = r6
            r6 = r20
            r20 = r7
            r7 = r19
            r23 = r8
            r8 = r21
            r1.R(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x01e0
        L_0x0175:
            r22 = r6
            r20 = r7
            r23 = r8
            com.google.android.flexbox.d r1 = r0.f11433A
            int r2 = r20.getMeasuredWidth()
            int r5 = r19 - r2
            int r6 = java.lang.Math.round(r14)
            int r2 = java.lang.Math.round(r14)
            int r3 = r20.getMeasuredHeight()
            int r8 = r2 + r3
            r2 = r20
            r3 = r26
            r7 = r19
            r1.R(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x01e0
        L_0x019b:
            r22 = r6
            r20 = r7
            r23 = r8
            boolean r1 = r0.f11457y
            if (r1 == 0) goto L_0x01c3
            com.google.android.flexbox.d r1 = r0.f11433A
            int r2 = java.lang.Math.round(r18)
            int r3 = r20.getMeasuredHeight()
            int r6 = r2 - r3
            int r2 = r20.getMeasuredWidth()
            int r7 = r5 + r2
            int r8 = java.lang.Math.round(r18)
            r2 = r20
            r3 = r26
            r1.R(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x01e0
        L_0x01c3:
            com.google.android.flexbox.d r1 = r0.f11433A
            int r6 = java.lang.Math.round(r14)
            int r2 = r20.getMeasuredWidth()
            int r7 = r5 + r2
            int r2 = java.lang.Math.round(r14)
            int r3 = r20.getMeasuredHeight()
            int r8 = r2 + r3
            r2 = r20
            r3 = r26
            r1.R(r2, r3, r4, r5, r6, r7, r8)
        L_0x01e0:
            int r1 = r20.getMeasuredHeight()
            int r2 = r13.topMargin
            int r1 = r1 + r2
            r2 = r20
            int r3 = r0.U(r2)
            int r1 = r1 + r3
            float r1 = (float) r1
            float r1 = r1 + r17
            float r14 = r14 + r1
            int r1 = r2.getMeasuredHeight()
            int r3 = r13.bottomMargin
            int r1 = r1 + r3
            int r2 = r0.v0(r2)
            int r1 = r1 + r2
            float r1 = (float) r1
            float r1 = r1 + r17
            float r18 = r18 - r1
            r1 = r14
            r3 = r16
            r2 = r18
        L_0x0208:
            int r8 = r23 + 1
            r14 = r17
            r13 = r22
            goto L_0x00d2
        L_0x0210:
            com.google.android.flexbox.FlexboxLayoutManager$d r1 = r0.f11436D
            int r1 = r1.f11484i
            r2 = r27
            com.google.android.flexbox.FlexboxLayoutManager.d.n(r2, r1)
            int r1 = r26.a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.H2(com.google.android.flexbox.c, com.google.android.flexbox.FlexboxLayoutManager$d):int");
    }

    private void I2(RecyclerView.u uVar, d dVar) {
        if (dVar.f11485j) {
            if (dVar.f11484i == -1) {
                K2(uVar, dVar);
            } else {
                L2(uVar, dVar);
            }
        }
    }

    private void J2(RecyclerView.u uVar, int i4, int i5) {
        while (i5 >= i4) {
            y1(i5, uVar);
            i5--;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r1 = r0 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void K2(androidx.recyclerview.widget.RecyclerView.u r8, com.google.android.flexbox.FlexboxLayoutManager.d r9) {
        /*
            r7 = this;
            int r0 = r9.f11481f
            if (r0 >= 0) goto L_0x0007
            return
        L_0x0007:
            int r0 = r7.W()
            if (r0 != 0) goto L_0x000e
            return
        L_0x000e:
            int r1 = r0 + -1
            android.view.View r2 = r7.V(r1)
            if (r2 != 0) goto L_0x0017
            return
        L_0x0017:
            com.google.android.flexbox.d r3 = r7.f11433A
            int[] r3 = r3.f11508c
            int r2 = r7.q0(r2)
            r2 = r3[r2]
            r3 = -1
            if (r2 != r3) goto L_0x0025
            return
        L_0x0025:
            java.util.List r3 = r7.f11458z
            java.lang.Object r3 = r3.get(r2)
            com.google.android.flexbox.c r3 = (com.google.android.flexbox.c) r3
            r4 = r1
        L_0x002e:
            if (r4 < 0) goto L_0x005f
            android.view.View r5 = r7.V(r4)
            if (r5 != 0) goto L_0x0037
            goto L_0x005c
        L_0x0037:
            int r6 = r9.f11481f
            boolean r6 = r7.e2(r5, r6)
            if (r6 == 0) goto L_0x005f
            int r6 = r3.f11502o
            int r5 = r7.q0(r5)
            if (r6 != r5) goto L_0x005c
            if (r2 > 0) goto L_0x004d
            r0 = r4
            goto L_0x005f
        L_0x004d:
            int r0 = r9.f11484i
            int r2 = r2 + r0
            java.util.List r0 = r7.f11458z
            java.lang.Object r0 = r0.get(r2)
            com.google.android.flexbox.c r0 = (com.google.android.flexbox.c) r0
            r3 = r0
            r0 = r4
        L_0x005c:
            int r4 = r4 + -1
            goto L_0x002e
        L_0x005f:
            r7.J2(r8, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.K2(androidx.recyclerview.widget.RecyclerView$u, com.google.android.flexbox.FlexboxLayoutManager$d):void");
    }

    private void L2(RecyclerView.u uVar, d dVar) {
        int W3;
        View V3;
        if (dVar.f11481f >= 0 && (W3 = W()) != 0 && (V3 = V(0)) != null) {
            int i4 = this.f11433A.f11508c[q0(V3)];
            int i5 = -1;
            if (i4 != -1) {
                c cVar = (c) this.f11458z.get(i4);
                int i6 = 0;
                while (true) {
                    if (i6 >= W3) {
                        break;
                    }
                    View V4 = V(i6);
                    if (V4 != null) {
                        if (!f2(V4, dVar.f11481f)) {
                            break;
                        } else if (cVar.f11503p != q0(V4)) {
                            continue;
                        } else if (i4 >= this.f11458z.size() - 1) {
                            i5 = i6;
                            break;
                        } else {
                            i4 += dVar.f11484i;
                            cVar = (c) this.f11458z.get(i4);
                            i5 = i6;
                        }
                    }
                    i6++;
                }
                J2(uVar, 0, i5);
            }
        }
    }

    private void M2() {
        int i4;
        boolean z3;
        if (m()) {
            i4 = k0();
        } else {
            i4 = y0();
        }
        d dVar = this.f11436D;
        if (i4 == 0 || i4 == Integer.MIN_VALUE) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean unused = dVar.f11477b = z3;
    }

    private void N2() {
        boolean z3;
        boolean z4;
        boolean z5;
        int m02 = m0();
        int i4 = this.f11451s;
        boolean z6 = false;
        if (i4 == 0) {
            if (m02 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f11456x = z3;
            if (this.f11452t == 2) {
                z6 = true;
            }
            this.f11457y = z6;
        } else if (i4 == 1) {
            if (m02 != 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f11456x = z4;
            if (this.f11452t == 2) {
                z6 = true;
            }
            this.f11457y = z6;
        } else if (i4 == 2) {
            if (m02 == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.f11456x = z5;
            if (this.f11452t == 2) {
                this.f11456x = !z5;
            }
            this.f11457y = false;
        } else if (i4 != 3) {
            this.f11456x = false;
            this.f11457y = false;
        } else {
            if (m02 == 1) {
                z6 = true;
            }
            this.f11456x = z6;
            if (this.f11452t == 2) {
                this.f11456x = !z6;
            }
            this.f11457y = true;
        }
    }

    private boolean Q1(View view, int i4, int i5, RecyclerView.p pVar) {
        if (view.isLayoutRequested() || !F0() || !G0(view.getWidth(), i4, pVar.width) || !G0(view.getHeight(), i5, pVar.height)) {
            return true;
        }
        return false;
    }

    private boolean S2(RecyclerView.z zVar, b bVar) {
        View view;
        int i4;
        if (W() == 0) {
            return false;
        }
        if (bVar.f11463e) {
            view = q2(zVar.b());
        } else {
            view = n2(zVar.b());
        }
        if (view == null) {
            return false;
        }
        bVar.s(view);
        if (zVar.e() || !W1()) {
            return true;
        }
        if (this.f11438F.g(view) < this.f11438F.i() && this.f11438F.d(view) >= this.f11438F.m()) {
            return true;
        }
        if (bVar.f11463e) {
            i4 = this.f11438F.i();
        } else {
            i4 = this.f11438F.m();
        }
        int unused = bVar.f11461c = i4;
        return true;
    }

    private boolean T2(RecyclerView.z zVar, b bVar, e eVar) {
        int i4;
        View V3;
        int i5;
        boolean z3 = false;
        if (!zVar.e() && (i4 = this.f11441I) != -1) {
            if (i4 < 0 || i4 >= zVar.b()) {
                this.f11441I = -1;
                this.f11442J = Integer.MIN_VALUE;
            } else {
                int unused = bVar.f11459a = this.f11441I;
                int unused2 = bVar.f11460b = this.f11433A.f11508c[bVar.f11459a];
                e eVar2 = this.f11440H;
                if (eVar2 != null && eVar2.z(zVar.b())) {
                    int unused3 = bVar.f11461c = this.f11438F.m() + eVar.f11487b;
                    boolean unused4 = bVar.f11465g = true;
                    int unused5 = bVar.f11460b = -1;
                    return true;
                } else if (this.f11442J == Integer.MIN_VALUE) {
                    View P3 = P(this.f11441I);
                    if (P3 == null) {
                        if (W() > 0 && (V3 = V(0)) != null) {
                            if (this.f11441I < q0(V3)) {
                                z3 = true;
                            }
                            boolean unused6 = bVar.f11463e = z3;
                        }
                        bVar.r();
                    } else if (this.f11438F.e(P3) > this.f11438F.n()) {
                        bVar.r();
                        return true;
                    } else if (this.f11438F.g(P3) - this.f11438F.m() < 0) {
                        int unused7 = bVar.f11461c = this.f11438F.m();
                        boolean unused8 = bVar.f11463e = false;
                        return true;
                    } else if (this.f11438F.i() - this.f11438F.d(P3) < 0) {
                        int unused9 = bVar.f11461c = this.f11438F.i();
                        boolean unused10 = bVar.f11463e = true;
                        return true;
                    } else {
                        if (bVar.f11463e) {
                            i5 = this.f11438F.d(P3) + this.f11438F.o();
                        } else {
                            i5 = this.f11438F.g(P3);
                        }
                        int unused11 = bVar.f11461c = i5;
                    }
                    return true;
                } else {
                    if (m() || !this.f11456x) {
                        int unused12 = bVar.f11461c = this.f11438F.m() + this.f11442J;
                    } else {
                        int unused13 = bVar.f11461c = this.f11442J - this.f11438F.j();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private void U2(RecyclerView.z zVar, b bVar) {
        if (!T2(zVar, bVar, this.f11440H) && !S2(zVar, bVar)) {
            bVar.r();
            int unused = bVar.f11459a = 0;
            int unused2 = bVar.f11460b = 0;
        }
    }

    private void V2(int i4) {
        if (i4 < s2()) {
            int W3 = W();
            this.f11433A.t(W3);
            this.f11433A.u(W3);
            this.f11433A.s(W3);
            if (i4 < this.f11433A.f11508c.length) {
                this.f11449Q = i4;
                View y22 = y2();
                if (y22 != null) {
                    this.f11441I = q0(y22);
                    if (m() || !this.f11456x) {
                        this.f11442J = this.f11438F.g(y22) - this.f11438F.m();
                    } else {
                        this.f11442J = this.f11438F.d(y22) + this.f11438F.j();
                    }
                }
            }
        }
    }

    private void W2(int i4) {
        int g4;
        int a4;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(x0(), y0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(j0(), k0());
        int x02 = x0();
        int j02 = j0();
        boolean z3 = false;
        if (m()) {
            int i5 = this.f11443K;
            if (!(i5 == Integer.MIN_VALUE || i5 == x02)) {
                z3 = true;
            }
            if (this.f11436D.f11477b) {
                g4 = this.f11447O.getResources().getDisplayMetrics().heightPixels;
            } else {
                g4 = this.f11436D.f11476a;
            }
        } else {
            int i6 = this.f11444L;
            if (!(i6 == Integer.MIN_VALUE || i6 == j02)) {
                z3 = true;
            }
            if (this.f11436D.f11477b) {
                g4 = this.f11447O.getResources().getDisplayMetrics().widthPixels;
            } else {
                g4 = this.f11436D.f11476a;
            }
        }
        int i7 = g4;
        this.f11443K = x02;
        this.f11444L = j02;
        int i8 = this.f11449Q;
        if (i8 != -1 || (this.f11441I == -1 && !z3)) {
            if (i8 != -1) {
                a4 = Math.min(i8, this.f11437E.f11459a);
            } else {
                a4 = this.f11437E.f11459a;
            }
            int i9 = a4;
            this.f11450R.a();
            if (m()) {
                if (this.f11458z.size() > 0) {
                    this.f11433A.j(this.f11458z, i9);
                    this.f11433A.b(this.f11450R, makeMeasureSpec, makeMeasureSpec2, i7, i9, this.f11437E.f11459a, this.f11458z);
                } else {
                    this.f11433A.s(i4);
                    this.f11433A.d(this.f11450R, makeMeasureSpec, makeMeasureSpec2, i7, 0, this.f11458z);
                }
            } else if (this.f11458z.size() > 0) {
                this.f11433A.j(this.f11458z, i9);
                this.f11433A.b(this.f11450R, makeMeasureSpec2, makeMeasureSpec, i7, i9, this.f11437E.f11459a, this.f11458z);
            } else {
                this.f11433A.s(i4);
                this.f11433A.g(this.f11450R, makeMeasureSpec, makeMeasureSpec2, i7, 0, this.f11458z);
            }
            this.f11458z = this.f11450R.f11511a;
            this.f11433A.q(makeMeasureSpec, makeMeasureSpec2, i9);
            this.f11433A.Y(i9);
        } else if (!this.f11437E.f11463e) {
            this.f11458z.clear();
            this.f11450R.a();
            if (m()) {
                this.f11433A.e(this.f11450R, makeMeasureSpec, makeMeasureSpec2, i7, this.f11437E.f11459a, this.f11458z);
            } else {
                this.f11433A.h(this.f11450R, makeMeasureSpec, makeMeasureSpec2, i7, this.f11437E.f11459a, this.f11458z);
            }
            this.f11458z = this.f11450R.f11511a;
            this.f11433A.p(makeMeasureSpec, makeMeasureSpec2);
            this.f11433A.X();
            b bVar = this.f11437E;
            int unused = bVar.f11460b = this.f11433A.f11508c[bVar.f11459a];
            int unused2 = this.f11436D.f11478c = this.f11437E.f11460b;
        }
    }

    private void X2(int i4, int i5) {
        boolean z3;
        int i6;
        int unused = this.f11436D.f11484i = i4;
        boolean m4 = m();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(x0(), y0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(j0(), k0());
        if (m4 || !this.f11456x) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i4 == 1) {
            View V3 = V(W() - 1);
            if (V3 != null) {
                int unused2 = this.f11436D.f11480e = this.f11438F.d(V3);
                int q02 = q0(V3);
                View r22 = r2(V3, (c) this.f11458z.get(this.f11433A.f11508c[q02]));
                int unused3 = this.f11436D.f11483h = 1;
                d dVar = this.f11436D;
                int unused4 = dVar.f11479d = q02 + dVar.f11483h;
                if (this.f11433A.f11508c.length <= this.f11436D.f11479d) {
                    int unused5 = this.f11436D.f11478c = -1;
                } else {
                    d dVar2 = this.f11436D;
                    int unused6 = dVar2.f11478c = this.f11433A.f11508c[dVar2.f11479d];
                }
                if (z3) {
                    int unused7 = this.f11436D.f11480e = this.f11438F.g(r22);
                    int unused8 = this.f11436D.f11481f = (-this.f11438F.g(r22)) + this.f11438F.m();
                    d dVar3 = this.f11436D;
                    int unused9 = dVar3.f11481f = Math.max(dVar3.f11481f, 0);
                } else {
                    int unused10 = this.f11436D.f11480e = this.f11438F.d(r22);
                    int unused11 = this.f11436D.f11481f = this.f11438F.d(r22) - this.f11438F.i();
                }
                if ((this.f11436D.f11478c == -1 || this.f11436D.f11478c > this.f11458z.size() - 1) && this.f11436D.f11479d <= getFlexItemCount()) {
                    int o4 = i5 - this.f11436D.f11481f;
                    this.f11450R.a();
                    if (o4 > 0) {
                        if (m4) {
                            this.f11433A.d(this.f11450R, makeMeasureSpec, makeMeasureSpec2, o4, this.f11436D.f11479d, this.f11458z);
                        } else {
                            this.f11433A.g(this.f11450R, makeMeasureSpec, makeMeasureSpec2, o4, this.f11436D.f11479d, this.f11458z);
                        }
                        this.f11433A.q(makeMeasureSpec, makeMeasureSpec2, this.f11436D.f11479d);
                        this.f11433A.Y(this.f11436D.f11479d);
                    }
                }
            } else {
                return;
            }
        } else {
            View V4 = V(0);
            if (V4 != null) {
                int unused12 = this.f11436D.f11480e = this.f11438F.g(V4);
                int q03 = q0(V4);
                View o22 = o2(V4, (c) this.f11458z.get(this.f11433A.f11508c[q03]));
                int unused13 = this.f11436D.f11483h = 1;
                int i7 = this.f11433A.f11508c[q03];
                if (i7 == -1) {
                    i7 = 0;
                }
                if (i7 > 0) {
                    int unused14 = this.f11436D.f11479d = q03 - ((c) this.f11458z.get(i7 - 1)).b();
                } else {
                    int unused15 = this.f11436D.f11479d = -1;
                }
                d dVar4 = this.f11436D;
                if (i7 > 0) {
                    i6 = i7 - 1;
                } else {
                    i6 = 0;
                }
                int unused16 = dVar4.f11478c = i6;
                if (z3) {
                    int unused17 = this.f11436D.f11480e = this.f11438F.d(o22);
                    int unused18 = this.f11436D.f11481f = this.f11438F.d(o22) - this.f11438F.i();
                    d dVar5 = this.f11436D;
                    int unused19 = dVar5.f11481f = Math.max(dVar5.f11481f, 0);
                } else {
                    int unused20 = this.f11436D.f11480e = this.f11438F.g(o22);
                    int unused21 = this.f11436D.f11481f = (-this.f11438F.g(o22)) + this.f11438F.m();
                }
            } else {
                return;
            }
        }
        d dVar6 = this.f11436D;
        int unused22 = dVar6.f11476a = i5 - dVar6.f11481f;
    }

    private void Y2(b bVar, boolean z3, boolean z4) {
        if (z4) {
            M2();
        } else {
            boolean unused = this.f11436D.f11477b = false;
        }
        if (m() || !this.f11456x) {
            int unused2 = this.f11436D.f11476a = this.f11438F.i() - bVar.f11461c;
        } else {
            int unused3 = this.f11436D.f11476a = bVar.f11461c - getPaddingRight();
        }
        int unused4 = this.f11436D.f11479d = bVar.f11459a;
        int unused5 = this.f11436D.f11483h = 1;
        int unused6 = this.f11436D.f11484i = 1;
        int unused7 = this.f11436D.f11480e = bVar.f11461c;
        int unused8 = this.f11436D.f11481f = Integer.MIN_VALUE;
        int unused9 = this.f11436D.f11478c = bVar.f11460b;
        if (z3 && this.f11458z.size() > 1 && bVar.f11460b >= 0 && bVar.f11460b < this.f11458z.size() - 1) {
            d.l(this.f11436D);
            d.u(this.f11436D, ((c) this.f11458z.get(bVar.f11460b)).b());
        }
    }

    private void Z2(b bVar, boolean z3, boolean z4) {
        if (z4) {
            M2();
        } else {
            boolean unused = this.f11436D.f11477b = false;
        }
        if (m() || !this.f11456x) {
            int unused2 = this.f11436D.f11476a = bVar.f11461c - this.f11438F.m();
        } else {
            int unused3 = this.f11436D.f11476a = (this.f11448P.getWidth() - bVar.f11461c) - this.f11438F.m();
        }
        int unused4 = this.f11436D.f11479d = bVar.f11459a;
        int unused5 = this.f11436D.f11483h = 1;
        int unused6 = this.f11436D.f11484i = -1;
        int unused7 = this.f11436D.f11480e = bVar.f11461c;
        int unused8 = this.f11436D.f11481f = Integer.MIN_VALUE;
        int unused9 = this.f11436D.f11478c = bVar.f11460b;
        if (z3 && bVar.f11460b > 0 && this.f11458z.size() > bVar.f11460b) {
            d.m(this.f11436D);
            d.v(this.f11436D, ((c) this.f11458z.get(bVar.f11460b)).b());
        }
    }

    private boolean e2(View view, int i4) {
        if (m() || !this.f11456x) {
            if (this.f11438F.g(view) >= this.f11438F.h() - i4) {
                return true;
            }
            return false;
        } else if (this.f11438F.d(view) <= i4) {
            return true;
        } else {
            return false;
        }
    }

    private boolean f2(View view, int i4) {
        if (m() || !this.f11456x) {
            if (this.f11438F.d(view) <= i4) {
                return true;
            }
            return false;
        } else if (this.f11438F.h() - this.f11438F.g(view) <= i4) {
            return true;
        } else {
            return false;
        }
    }

    private void g2() {
        this.f11458z.clear();
        this.f11437E.t();
        int unused = this.f11437E.f11462d = 0;
    }

    private int h2(RecyclerView.z zVar) {
        if (W() == 0) {
            return 0;
        }
        int b4 = zVar.b();
        l2();
        View n22 = n2(b4);
        View q22 = q2(b4);
        if (zVar.b() == 0 || n22 == null || q22 == null) {
            return 0;
        }
        return Math.min(this.f11438F.n(), this.f11438F.d(q22) - this.f11438F.g(n22));
    }

    private int i2(RecyclerView.z zVar) {
        if (W() == 0) {
            return 0;
        }
        int b4 = zVar.b();
        View n22 = n2(b4);
        View q22 = q2(b4);
        if (!(zVar.b() == 0 || n22 == null || q22 == null)) {
            int q02 = q0(n22);
            int q03 = q0(q22);
            int abs = Math.abs(this.f11438F.d(q22) - this.f11438F.g(n22));
            int[] iArr = this.f11433A.f11508c;
            int i4 = iArr[q02];
            if (!(i4 == 0 || i4 == -1)) {
                return Math.round((((float) i4) * (((float) abs) / ((float) ((iArr[q03] - i4) + 1)))) + ((float) (this.f11438F.m() - this.f11438F.g(n22))));
            }
        }
        return 0;
    }

    private int j2(RecyclerView.z zVar) {
        if (W() == 0) {
            return 0;
        }
        int b4 = zVar.b();
        View n22 = n2(b4);
        View q22 = q2(b4);
        if (zVar.b() == 0 || n22 == null || q22 == null) {
            return 0;
        }
        int p22 = p2();
        return (int) ((((float) Math.abs(this.f11438F.d(q22) - this.f11438F.g(n22))) / ((float) ((s2() - p22) + 1))) * ((float) zVar.b()));
    }

    private void k2() {
        if (this.f11436D == null) {
            this.f11436D = new d();
        }
    }

    private void l2() {
        if (this.f11438F == null) {
            if (m()) {
                if (this.f11452t == 0) {
                    this.f11438F = p.a(this);
                    this.f11439G = p.c(this);
                    return;
                }
                this.f11438F = p.c(this);
                this.f11439G = p.a(this);
            } else if (this.f11452t == 0) {
                this.f11438F = p.c(this);
                this.f11439G = p.a(this);
            } else {
                this.f11438F = p.a(this);
                this.f11439G = p.c(this);
            }
        }
    }

    private int m2(RecyclerView.u uVar, RecyclerView.z zVar, d dVar) {
        if (dVar.f11481f != Integer.MIN_VALUE) {
            if (dVar.f11476a < 0) {
                d.q(dVar, dVar.f11476a);
            }
            I2(uVar, dVar);
        }
        int g4 = dVar.f11476a;
        int g5 = dVar.f11476a;
        boolean m4 = m();
        int i4 = 0;
        while (true) {
            if ((g5 > 0 || this.f11436D.f11477b) && dVar.D(zVar, this.f11458z)) {
                c cVar = (c) this.f11458z.get(dVar.f11478c);
                int unused = dVar.f11479d = cVar.f11502o;
                i4 += F2(cVar, dVar);
                if (m4 || !this.f11456x) {
                    d.c(dVar, cVar.a() * dVar.f11484i);
                } else {
                    d.d(dVar, cVar.a() * dVar.f11484i);
                }
                g5 -= cVar.a();
            }
        }
        d.i(dVar, i4);
        if (dVar.f11481f != Integer.MIN_VALUE) {
            d.q(dVar, i4);
            if (dVar.f11476a < 0) {
                d.q(dVar, dVar.f11476a);
            }
            I2(uVar, dVar);
        }
        return g4 - dVar.f11476a;
    }

    private View n2(int i4) {
        int i5;
        View u22 = u2(0, W(), i4);
        if (u22 == null || (i5 = this.f11433A.f11508c[q0(u22)]) == -1) {
            return null;
        }
        return o2(u22, (c) this.f11458z.get(i5));
    }

    private View o2(View view, c cVar) {
        boolean m4 = m();
        int i4 = cVar.f11495h;
        for (int i5 = 1; i5 < i4; i5++) {
            View V3 = V(i5);
            if (!(V3 == null || V3.getVisibility() == 8)) {
                if (!this.f11456x || m4) {
                    if (this.f11438F.g(view) <= this.f11438F.g(V3)) {
                    }
                } else if (this.f11438F.d(view) >= this.f11438F.d(V3)) {
                }
                view = V3;
            }
        }
        return view;
    }

    private View q2(int i4) {
        View u22 = u2(W() - 1, -1, i4);
        if (u22 == null) {
            return null;
        }
        return r2(u22, (c) this.f11458z.get(this.f11433A.f11508c[q0(u22)]));
    }

    private View r2(View view, c cVar) {
        boolean m4 = m();
        int W3 = (W() - cVar.f11495h) - 1;
        for (int W4 = W() - 2; W4 > W3; W4--) {
            View V3 = V(W4);
            if (!(V3 == null || V3.getVisibility() == 8)) {
                if (!this.f11456x || m4) {
                    if (this.f11438F.d(view) >= this.f11438F.d(V3)) {
                    }
                } else if (this.f11438F.g(view) <= this.f11438F.g(V3)) {
                }
                view = V3;
            }
        }
        return view;
    }

    private View t2(int i4, int i5, boolean z3) {
        int i6;
        if (i5 > i4) {
            i6 = 1;
        } else {
            i6 = -1;
        }
        while (i4 != i5) {
            View V3 = V(i4);
            if (E2(V3, z3)) {
                return V3;
            }
            i4 += i6;
        }
        return null;
    }

    private View u2(int i4, int i5, int i6) {
        int i7;
        int q02;
        l2();
        k2();
        int m4 = this.f11438F.m();
        int i8 = this.f11438F.i();
        if (i5 > i4) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        View view = null;
        View view2 = null;
        while (i4 != i5) {
            View V3 = V(i4);
            if (V3 != null && (q02 = q0(V3)) >= 0 && q02 < i6) {
                if (((RecyclerView.p) V3.getLayoutParams()).v()) {
                    if (view2 == null) {
                        view2 = V3;
                    }
                } else if (this.f11438F.g(V3) >= m4 && this.f11438F.d(V3) <= i8) {
                    return V3;
                } else {
                    if (view == null) {
                        view = V3;
                    }
                }
            }
            i4 += i7;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    private int v2(int i4, RecyclerView.u uVar, RecyclerView.z zVar, boolean z3) {
        int i5;
        int i6;
        if (m() || !this.f11456x) {
            int i7 = this.f11438F.i() - i4;
            if (i7 <= 0) {
                return 0;
            }
            i5 = -C2(-i7, uVar, zVar);
        } else {
            int m4 = i4 - this.f11438F.m();
            if (m4 <= 0) {
                return 0;
            }
            i5 = C2(m4, uVar, zVar);
        }
        int i8 = i4 + i5;
        if (!z3 || (i6 = this.f11438F.i() - i8) <= 0) {
            return i5;
        }
        this.f11438F.r(i6);
        return i6 + i5;
    }

    private int w2(int i4, RecyclerView.u uVar, RecyclerView.z zVar, boolean z3) {
        int i5;
        int m4;
        if (m() || !this.f11456x) {
            int m5 = i4 - this.f11438F.m();
            if (m5 <= 0) {
                return 0;
            }
            i5 = -C2(m5, uVar, zVar);
        } else {
            int i6 = this.f11438F.i() - i4;
            if (i6 <= 0) {
                return 0;
            }
            i5 = C2(-i6, uVar, zVar);
        }
        int i7 = i4 + i5;
        if (!z3 || (m4 = i7 - this.f11438F.m()) <= 0) {
            return i5;
        }
        this.f11438F.r(-m4);
        return i5 - m4;
    }

    private int x2(View view) {
        return b0(view) + ((RecyclerView.p) view.getLayoutParams()).bottomMargin;
    }

    private View y2() {
        return V(0);
    }

    private int z2(View view) {
        return d0(view) - ((RecyclerView.p) view.getLayoutParams()).leftMargin;
    }

    public boolean B0() {
        return true;
    }

    public int D(RecyclerView.z zVar) {
        return h2(zVar);
    }

    public int E(RecyclerView.z zVar) {
        return i2(zVar);
    }

    public int F(RecyclerView.z zVar) {
        return j2(zVar);
    }

    public int G(RecyclerView.z zVar) {
        return h2(zVar);
    }

    public int H(RecyclerView.z zVar) {
        return i2(zVar);
    }

    public int H1(int i4, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (!m() || this.f11452t == 0) {
            int C22 = C2(i4, uVar, zVar);
            this.f11446N.clear();
            return C22;
        }
        int D22 = D2(i4);
        b.l(this.f11437E, D22);
        this.f11439G.r(-D22);
        return D22;
    }

    public int I(RecyclerView.z zVar) {
        return j2(zVar);
    }

    public void I1(int i4) {
        this.f11441I = i4;
        this.f11442J = Integer.MIN_VALUE;
        e eVar = this.f11440H;
        if (eVar != null) {
            eVar.A();
        }
        E1();
    }

    public int J1(int i4, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (m() || (this.f11452t == 0 && !m())) {
            int C22 = C2(i4, uVar, zVar);
            this.f11446N.clear();
            return C22;
        }
        int D22 = D2(i4);
        b.l(this.f11437E, D22);
        this.f11439G.r(-D22);
        return D22;
    }

    public void O0(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        u1();
    }

    public void O2(int i4) {
        int i5 = this.f11454v;
        if (i5 != i4) {
            if (i5 == 4 || i4 == 4) {
                u1();
                g2();
            }
            this.f11454v = i4;
            E1();
        }
    }

    public void P2(int i4) {
        if (this.f11451s != i4) {
            u1();
            this.f11451s = i4;
            this.f11438F = null;
            this.f11439G = null;
            g2();
            E1();
        }
    }

    public RecyclerView.p Q() {
        return new c(-2, -2);
    }

    public void Q0(RecyclerView recyclerView) {
        super.Q0(recyclerView);
        this.f11448P = (View) recyclerView.getParent();
    }

    public void Q2(int i4) {
        if (i4 != 2) {
            int i5 = this.f11452t;
            if (i5 != i4) {
                if (i5 == 0 || i4 == 0) {
                    u1();
                    g2();
                }
                this.f11452t = i4;
                this.f11438F = null;
                this.f11439G = null;
                E1();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
    }

    public RecyclerView.p R(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public void R2(int i4) {
        if (this.f11453u != i4) {
            this.f11453u = i4;
            E1();
        }
    }

    public void S0(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.S0(recyclerView, uVar);
        if (this.f11445M) {
            v1(uVar);
            uVar.c();
        }
    }

    public void T1(RecyclerView recyclerView, RecyclerView.z zVar, int i4) {
        l lVar = new l(recyclerView.getContext());
        lVar.p(i4);
        U1(lVar);
    }

    public View b(int i4) {
        View view = (View) this.f11446N.get(i4);
        if (view != null) {
            return view;
        }
        return this.f11434B.o(i4);
    }

    public void b1(RecyclerView recyclerView, int i4, int i5) {
        super.b1(recyclerView, i4, i5);
        V2(i4);
    }

    public int c(View view, int i4, int i5) {
        int v02;
        int U3;
        if (m()) {
            v02 = n0(view);
            U3 = s0(view);
        } else {
            v02 = v0(view);
            U3 = U(view);
        }
        return v02 + U3;
    }

    public void d1(RecyclerView recyclerView, int i4, int i5, int i6) {
        super.d1(recyclerView, i4, i5, i6);
        V2(Math.min(i4, i5));
    }

    public int e(int i4, int i5, int i6) {
        return RecyclerView.o.X(j0(), k0(), i5, i6, y());
    }

    public void e1(RecyclerView recyclerView, int i4, int i5) {
        super.e1(recyclerView, i4, i5);
        V2(i4);
    }

    public PointF f(int i4) {
        View V3;
        int i5;
        if (W() == 0 || (V3 = V(0)) == null) {
            return null;
        }
        if (i4 < q0(V3)) {
            i5 = -1;
        } else {
            i5 = 1;
        }
        if (m()) {
            return new PointF(0.0f, (float) i5);
        }
        return new PointF((float) i5, 0.0f);
    }

    public void f1(RecyclerView recyclerView, int i4, int i5) {
        super.f1(recyclerView, i4, i5);
        V2(i4);
    }

    public void g(View view, int i4, int i5, c cVar) {
        w(view, f11432S);
        if (m()) {
            int n02 = n0(view) + s0(view);
            cVar.f11492e += n02;
            cVar.f11493f += n02;
            return;
        }
        int v02 = v0(view) + U(view);
        cVar.f11492e += v02;
        cVar.f11493f += v02;
    }

    public void g1(RecyclerView recyclerView, int i4, int i5, Object obj) {
        super.g1(recyclerView, i4, i5, obj);
        V2(i4);
    }

    public int getAlignContent() {
        return 5;
    }

    public int getAlignItems() {
        return this.f11454v;
    }

    public int getFlexDirection() {
        return this.f11451s;
    }

    public int getFlexItemCount() {
        return this.f11435C.b();
    }

    public List getFlexLinesInternal() {
        return this.f11458z;
    }

    public int getFlexWrap() {
        return this.f11452t;
    }

    public int getLargestMainSize() {
        if (this.f11458z.size() == 0) {
            return 0;
        }
        int size = this.f11458z.size();
        int i4 = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < size; i5++) {
            i4 = Math.max(i4, ((c) this.f11458z.get(i5)).f11492e);
        }
        return i4;
    }

    public int getMaxLine() {
        return this.f11455w;
    }

    public int getSumOfCrossSize() {
        int size = this.f11458z.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += ((c) this.f11458z.get(i5)).f11494g;
        }
        return i4;
    }

    public void h(c cVar) {
    }

    public void h1(RecyclerView.u uVar, RecyclerView.z zVar) {
        int i4;
        int i5;
        this.f11434B = uVar;
        this.f11435C = zVar;
        int b4 = zVar.b();
        if (b4 != 0 || !zVar.e()) {
            N2();
            l2();
            k2();
            this.f11433A.t(b4);
            this.f11433A.u(b4);
            this.f11433A.s(b4);
            boolean unused = this.f11436D.f11485j = false;
            e eVar = this.f11440H;
            if (eVar != null && eVar.z(b4)) {
                this.f11441I = this.f11440H.f11486a;
            }
            if (!(this.f11437E.f11464f && this.f11441I == -1 && this.f11440H == null)) {
                this.f11437E.t();
                U2(zVar, this.f11437E);
                boolean unused2 = this.f11437E.f11464f = true;
            }
            J(uVar);
            if (this.f11437E.f11463e) {
                Z2(this.f11437E, false, true);
            } else {
                Y2(this.f11437E, false, true);
            }
            W2(b4);
            m2(uVar, zVar, this.f11436D);
            if (this.f11437E.f11463e) {
                i5 = this.f11436D.f11480e;
                Y2(this.f11437E, true, false);
                m2(uVar, zVar, this.f11436D);
                i4 = this.f11436D.f11480e;
            } else {
                i4 = this.f11436D.f11480e;
                Z2(this.f11437E, true, false);
                m2(uVar, zVar, this.f11436D);
                i5 = this.f11436D.f11480e;
            }
            if (W() <= 0) {
                return;
            }
            if (this.f11437E.f11463e) {
                w2(i5 + v2(i4, uVar, zVar, true), uVar, zVar, false);
            } else {
                v2(i4 + w2(i5, uVar, zVar, true), uVar, zVar, false);
            }
        }
    }

    public View i(int i4) {
        return b(i4);
    }

    public void i1(RecyclerView.z zVar) {
        super.i1(zVar);
        this.f11440H = null;
        this.f11441I = -1;
        this.f11442J = Integer.MIN_VALUE;
        this.f11449Q = -1;
        this.f11437E.t();
        this.f11446N.clear();
    }

    public int k(int i4, int i5, int i6) {
        return RecyclerView.o.X(x0(), y0(), i5, i6, x());
    }

    public void l(int i4, View view) {
        this.f11446N.put(i4, view);
    }

    public boolean m() {
        int i4 = this.f11451s;
        if (i4 == 0 || i4 == 1) {
            return true;
        }
        return false;
    }

    public void m1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.f11440H = (e) parcelable;
            E1();
        }
    }

    public int n(View view) {
        int n02;
        int s02;
        if (m()) {
            n02 = v0(view);
            s02 = U(view);
        } else {
            n02 = n0(view);
            s02 = s0(view);
        }
        return n02 + s02;
    }

    public Parcelable n1() {
        if (this.f11440H != null) {
            return new e(this.f11440H);
        }
        e eVar = new e();
        if (W() > 0) {
            View y22 = y2();
            int unused = eVar.f11486a = q0(y22);
            int unused2 = eVar.f11487b = this.f11438F.g(y22) - this.f11438F.m();
        } else {
            eVar.A();
        }
        return eVar;
    }

    public int p2() {
        View t22 = t2(0, W(), false);
        if (t22 == null) {
            return -1;
        }
        return q0(t22);
    }

    public int s2() {
        View t22 = t2(W() - 1, -1, false);
        if (t22 == null) {
            return -1;
        }
        return q0(t22);
    }

    public void setFlexLines(List list) {
        this.f11458z = list;
    }

    public boolean x() {
        int i4;
        if (this.f11452t == 0) {
            return m();
        }
        if (m()) {
            int x02 = x0();
            View view = this.f11448P;
            if (view != null) {
                i4 = view.getWidth();
            } else {
                i4 = 0;
            }
            if (x02 > i4) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean y() {
        int i4;
        if (this.f11452t == 0) {
            return !m();
        }
        if (m()) {
            return true;
        }
        int j02 = j0();
        View view = this.f11448P;
        if (view != null) {
            i4 = view.getHeight();
        } else {
            i4 = 0;
        }
        if (j02 > i4) {
            return true;
        }
        return false;
    }

    public boolean z(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    private static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f11486a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f11487b;

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

        /* access modifiers changed from: private */
        public void A() {
            this.f11486a = -1;
        }

        /* access modifiers changed from: private */
        public boolean z(int i4) {
            int i5 = this.f11486a;
            if (i5 < 0 || i5 >= i4) {
                return false;
            }
            return true;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.f11486a + ", mAnchorOffset=" + this.f11487b + '}';
        }

        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f11486a);
            parcel.writeInt(this.f11487b);
        }

        e() {
        }

        private e(Parcel parcel) {
            this.f11486a = parcel.readInt();
            this.f11487b = parcel.readInt();
        }

        private e(e eVar) {
            this.f11486a = eVar.f11486a;
            this.f11487b = eVar.f11487b;
        }
    }

    public FlexboxLayoutManager(Context context, int i4, int i5) {
        this.f11455w = -1;
        this.f11458z = new ArrayList();
        this.f11433A = new d(this);
        this.f11437E = new b();
        this.f11441I = -1;
        this.f11442J = Integer.MIN_VALUE;
        this.f11443K = Integer.MIN_VALUE;
        this.f11444L = Integer.MIN_VALUE;
        this.f11446N = new SparseArray();
        this.f11449Q = -1;
        this.f11450R = new d.b();
        P2(i4);
        Q2(i5);
        O2(4);
        this.f11447O = context;
    }

    public static class c extends RecyclerView.p implements b {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        private float f11467e = 0.0f;

        /* renamed from: f  reason: collision with root package name */
        private float f11468f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        private int f11469g = -1;

        /* renamed from: h  reason: collision with root package name */
        private float f11470h = -1.0f;

        /* renamed from: i  reason: collision with root package name */
        private int f11471i;

        /* renamed from: j  reason: collision with root package name */
        private int f11472j;

        /* renamed from: k  reason: collision with root package name */
        private int f11473k = 16777215;

        /* renamed from: l  reason: collision with root package name */
        private int f11474l = 16777215;

        /* renamed from: m  reason: collision with root package name */
        private boolean f11475m;

        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            /* renamed from: b */
            public c[] newArray(int i4) {
                return new c[i4];
            }
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public void a(int i4) {
            this.f11472j = i4;
        }

        public float b() {
            return this.f11467e;
        }

        public int c() {
            return this.height;
        }

        public int describeContents() {
            return 0;
        }

        public float e() {
            return this.f11470h;
        }

        public int f() {
            return this.f11469g;
        }

        public float g() {
            return this.f11468f;
        }

        public int getOrder() {
            return 1;
        }

        public int i() {
            return this.rightMargin;
        }

        public int j() {
            return this.f11472j;
        }

        public int k() {
            return this.f11471i;
        }

        public boolean l() {
            return this.f11475m;
        }

        public int m() {
            return this.width;
        }

        public int n() {
            return this.f11474l;
        }

        public void o(int i4) {
            this.f11471i = i4;
        }

        public int p() {
            return this.bottomMargin;
        }

        public int q() {
            return this.leftMargin;
        }

        public int r() {
            return this.f11473k;
        }

        public int s() {
            return this.topMargin;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeFloat(this.f11467e);
            parcel.writeFloat(this.f11468f);
            parcel.writeInt(this.f11469g);
            parcel.writeFloat(this.f11470h);
            parcel.writeInt(this.f11471i);
            parcel.writeInt(this.f11472j);
            parcel.writeInt(this.f11473k);
            parcel.writeInt(this.f11474l);
            parcel.writeByte(this.f11475m ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        public c(int i4, int i5) {
            super(i4, i5);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        protected c(Parcel parcel) {
            super(-2, -2);
            this.f11467e = parcel.readFloat();
            this.f11468f = parcel.readFloat();
            this.f11469g = parcel.readInt();
            this.f11470h = parcel.readFloat();
            this.f11471i = parcel.readInt();
            this.f11472j = parcel.readInt();
            this.f11473k = parcel.readInt();
            this.f11474l = parcel.readInt();
            this.f11475m = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.f11455w = -1;
        this.f11458z = new ArrayList();
        this.f11433A = new d(this);
        this.f11437E = new b();
        this.f11441I = -1;
        this.f11442J = Integer.MIN_VALUE;
        this.f11443K = Integer.MIN_VALUE;
        this.f11444L = Integer.MIN_VALUE;
        this.f11446N = new SparseArray();
        this.f11449Q = -1;
        this.f11450R = new d.b();
        RecyclerView.o.d r02 = RecyclerView.o.r0(context, attributeSet, i4, i5);
        int i6 = r02.f6374a;
        if (i6 != 0) {
            if (i6 == 1) {
                if (r02.f6376c) {
                    P2(3);
                } else {
                    P2(2);
                }
            }
        } else if (r02.f6376c) {
            P2(1);
        } else {
            P2(0);
        }
        Q2(1);
        O2(4);
        this.f11447O = context;
    }
}
