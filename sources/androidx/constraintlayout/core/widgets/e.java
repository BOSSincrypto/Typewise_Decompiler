package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.d;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

public class e extends h {
    /* access modifiers changed from: private */

    /* renamed from: a1  reason: collision with root package name */
    public int f4105a1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: b1  reason: collision with root package name */
    public int f4106b1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: c1  reason: collision with root package name */
    public int f4107c1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: d1  reason: collision with root package name */
    public int f4108d1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: e1  reason: collision with root package name */
    public int f4109e1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: f1  reason: collision with root package name */
    public int f4110f1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: g1  reason: collision with root package name */
    public float f4111g1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: h1  reason: collision with root package name */
    public float f4112h1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: i1  reason: collision with root package name */
    public float f4113i1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: j1  reason: collision with root package name */
    public float f4114j1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: k1  reason: collision with root package name */
    public float f4115k1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: l1  reason: collision with root package name */
    public float f4116l1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: m1  reason: collision with root package name */
    public int f4117m1 = 0;
    /* access modifiers changed from: private */

    /* renamed from: n1  reason: collision with root package name */
    public int f4118n1 = 0;
    /* access modifiers changed from: private */

    /* renamed from: o1  reason: collision with root package name */
    public int f4119o1 = 2;
    /* access modifiers changed from: private */

    /* renamed from: p1  reason: collision with root package name */
    public int f4120p1 = 2;

    /* renamed from: q1  reason: collision with root package name */
    private int f4121q1 = 0;

    /* renamed from: r1  reason: collision with root package name */
    private int f4122r1 = -1;

    /* renamed from: s1  reason: collision with root package name */
    private int f4123s1 = 0;

    /* renamed from: t1  reason: collision with root package name */
    private ArrayList f4124t1 = new ArrayList();

    /* renamed from: u1  reason: collision with root package name */
    private ConstraintWidget[] f4125u1 = null;

    /* renamed from: v1  reason: collision with root package name */
    private ConstraintWidget[] f4126v1 = null;

    /* renamed from: w1  reason: collision with root package name */
    private int[] f4127w1 = null;
    /* access modifiers changed from: private */

    /* renamed from: x1  reason: collision with root package name */
    public ConstraintWidget[] f4128x1;
    /* access modifiers changed from: private */

    /* renamed from: y1  reason: collision with root package name */
    public int f4129y1 = 0;

    private class a {

        /* renamed from: a  reason: collision with root package name */
        private int f4130a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public ConstraintWidget f4131b = null;

        /* renamed from: c  reason: collision with root package name */
        int f4132c = 0;

        /* renamed from: d  reason: collision with root package name */
        private ConstraintAnchor f4133d;

        /* renamed from: e  reason: collision with root package name */
        private ConstraintAnchor f4134e;

        /* renamed from: f  reason: collision with root package name */
        private ConstraintAnchor f4135f;

        /* renamed from: g  reason: collision with root package name */
        private ConstraintAnchor f4136g;

        /* renamed from: h  reason: collision with root package name */
        private int f4137h = 0;

        /* renamed from: i  reason: collision with root package name */
        private int f4138i = 0;

        /* renamed from: j  reason: collision with root package name */
        private int f4139j = 0;

        /* renamed from: k  reason: collision with root package name */
        private int f4140k = 0;

        /* renamed from: l  reason: collision with root package name */
        private int f4141l = 0;

        /* renamed from: m  reason: collision with root package name */
        private int f4142m = 0;

        /* renamed from: n  reason: collision with root package name */
        private int f4143n = 0;

        /* renamed from: o  reason: collision with root package name */
        private int f4144o = 0;

        /* renamed from: p  reason: collision with root package name */
        private int f4145p = 0;

        /* renamed from: q  reason: collision with root package name */
        private int f4146q = 0;

        public a(int i4, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i5) {
            this.f4130a = i4;
            this.f4133d = constraintAnchor;
            this.f4134e = constraintAnchor2;
            this.f4135f = constraintAnchor3;
            this.f4136g = constraintAnchor4;
            this.f4137h = e.this.z1();
            this.f4138i = e.this.B1();
            this.f4139j = e.this.A1();
            this.f4140k = e.this.y1();
            this.f4146q = i5;
        }

        private void h() {
            this.f4141l = 0;
            this.f4142m = 0;
            this.f4131b = null;
            this.f4132c = 0;
            int i4 = this.f4144o;
            int i5 = 0;
            while (i5 < i4 && this.f4143n + i5 < e.this.f4129y1) {
                ConstraintWidget constraintWidget = e.this.f4128x1[this.f4143n + i5];
                if (this.f4130a == 0) {
                    int W3 = constraintWidget.W();
                    int P12 = e.this.f4117m1;
                    if (constraintWidget.V() == 8) {
                        P12 = 0;
                    }
                    this.f4141l += W3 + P12;
                    int c22 = e.this.k2(constraintWidget, this.f4146q);
                    if (this.f4131b == null || this.f4132c < c22) {
                        this.f4131b = constraintWidget;
                        this.f4132c = c22;
                        this.f4142m = c22;
                    }
                } else {
                    int b22 = e.this.l2(constraintWidget, this.f4146q);
                    int c23 = e.this.k2(constraintWidget, this.f4146q);
                    int Q12 = e.this.f4118n1;
                    if (constraintWidget.V() == 8) {
                        Q12 = 0;
                    }
                    this.f4142m += c23 + Q12;
                    if (this.f4131b == null || this.f4132c < b22) {
                        this.f4131b = constraintWidget;
                        this.f4132c = b22;
                        this.f4141l = b22;
                    }
                }
                i5++;
            }
        }

        public void b(ConstraintWidget constraintWidget) {
            int i4 = 0;
            if (this.f4130a == 0) {
                int b22 = e.this.l2(constraintWidget, this.f4146q);
                if (constraintWidget.A() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f4145p++;
                    b22 = 0;
                }
                int P12 = e.this.f4117m1;
                if (constraintWidget.V() != 8) {
                    i4 = P12;
                }
                this.f4141l += b22 + i4;
                int c22 = e.this.k2(constraintWidget, this.f4146q);
                if (this.f4131b == null || this.f4132c < c22) {
                    this.f4131b = constraintWidget;
                    this.f4132c = c22;
                    this.f4142m = c22;
                }
            } else {
                int b23 = e.this.l2(constraintWidget, this.f4146q);
                int c23 = e.this.k2(constraintWidget, this.f4146q);
                if (constraintWidget.T() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f4145p++;
                    c23 = 0;
                }
                int Q12 = e.this.f4118n1;
                if (constraintWidget.V() != 8) {
                    i4 = Q12;
                }
                this.f4142m += c23 + i4;
                if (this.f4131b == null || this.f4132c < b23) {
                    this.f4131b = constraintWidget;
                    this.f4132c = b23;
                    this.f4141l = b23;
                }
            }
            this.f4144o++;
        }

        public void c() {
            this.f4132c = 0;
            this.f4131b = null;
            this.f4141l = 0;
            this.f4142m = 0;
            this.f4143n = 0;
            this.f4144o = 0;
            this.f4145p = 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:57:0x00e1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void d(boolean r17, int r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                int r1 = r0.f4144o
                r2 = 0
                r3 = r2
            L_0x0006:
                if (r3 >= r1) goto L_0x0027
                int r4 = r0.f4143n
                int r4 = r4 + r3
                androidx.constraintlayout.core.widgets.e r5 = androidx.constraintlayout.core.widgets.e.this
                int r5 = r5.f4129y1
                if (r4 < r5) goto L_0x0014
                goto L_0x0027
            L_0x0014:
                androidx.constraintlayout.core.widgets.e r4 = androidx.constraintlayout.core.widgets.e.this
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r4 = r4.f4128x1
                int r5 = r0.f4143n
                int r5 = r5 + r3
                r4 = r4[r5]
                if (r4 == 0) goto L_0x0024
                r4.u0()
            L_0x0024:
                int r3 = r3 + 1
                goto L_0x0006
            L_0x0027:
                if (r1 == 0) goto L_0x0383
                androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f4131b
                if (r3 != 0) goto L_0x002f
                goto L_0x0383
            L_0x002f:
                if (r19 == 0) goto L_0x0035
                if (r18 != 0) goto L_0x0035
                r4 = 1
                goto L_0x0036
            L_0x0035:
                r4 = r2
            L_0x0036:
                r5 = -1
                r6 = r2
                r7 = r5
                r8 = r7
            L_0x003a:
                if (r6 >= r1) goto L_0x0069
                if (r17 == 0) goto L_0x0042
                int r9 = r1 + -1
                int r9 = r9 - r6
                goto L_0x0043
            L_0x0042:
                r9 = r6
            L_0x0043:
                int r10 = r0.f4143n
                int r10 = r10 + r9
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.e.this
                int r11 = r11.f4129y1
                if (r10 < r11) goto L_0x004f
                goto L_0x0069
            L_0x004f:
                androidx.constraintlayout.core.widgets.e r10 = androidx.constraintlayout.core.widgets.e.this
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r10 = r10.f4128x1
                int r11 = r0.f4143n
                int r11 = r11 + r9
                r9 = r10[r11]
                if (r9 == 0) goto L_0x0066
                int r9 = r9.V()
                if (r9 != 0) goto L_0x0066
                if (r7 != r5) goto L_0x0065
                r7 = r6
            L_0x0065:
                r8 = r6
            L_0x0066:
                int r6 = r6 + 1
                goto L_0x003a
            L_0x0069:
                int r6 = r0.f4130a
                r9 = 0
                if (r6 != 0) goto L_0x020e
                androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r0.f4131b
                androidx.constraintlayout.core.widgets.e r10 = androidx.constraintlayout.core.widgets.e.this
                int r10 = r10.f4106b1
                r6.e1(r10)
                int r10 = r0.f4138i
                if (r18 <= 0) goto L_0x0084
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.e.this
                int r11 = r11.f4118n1
                int r10 = r10 + r11
            L_0x0084:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.f3899P
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r0.f4134e
                r11.a(r12, r10)
                if (r19 == 0) goto L_0x0096
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r6.f3901R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f4136g
                int r12 = r0.f4140k
                r10.a(r11, r12)
            L_0x0096:
                if (r18 <= 0) goto L_0x00a3
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.f4134e
                androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r10.f3865d
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r10.f3901R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.f3899P
                r10.a(r11, r2)
            L_0x00a3:
                androidx.constraintlayout.core.widgets.e r10 = androidx.constraintlayout.core.widgets.e.this
                int r10 = r10.f4120p1
                r11 = 3
                if (r10 != r11) goto L_0x00dd
                boolean r10 = r6.Z()
                if (r10 != 0) goto L_0x00dd
                r10 = r2
            L_0x00b3:
                if (r10 >= r1) goto L_0x00dd
                if (r17 == 0) goto L_0x00bb
                int r12 = r1 + -1
                int r12 = r12 - r10
                goto L_0x00bc
            L_0x00bb:
                r12 = r10
            L_0x00bc:
                int r13 = r0.f4143n
                int r13 = r13 + r12
                androidx.constraintlayout.core.widgets.e r14 = androidx.constraintlayout.core.widgets.e.this
                int r14 = r14.f4129y1
                if (r13 < r14) goto L_0x00c8
                goto L_0x00dd
            L_0x00c8:
                androidx.constraintlayout.core.widgets.e r13 = androidx.constraintlayout.core.widgets.e.this
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r13 = r13.f4128x1
                int r14 = r0.f4143n
                int r14 = r14 + r12
                r12 = r13[r14]
                boolean r13 = r12.Z()
                if (r13 == 0) goto L_0x00da
                goto L_0x00de
            L_0x00da:
                int r10 = r10 + 1
                goto L_0x00b3
            L_0x00dd:
                r12 = r6
            L_0x00de:
                r10 = r2
            L_0x00df:
                if (r10 >= r1) goto L_0x0383
                if (r17 == 0) goto L_0x00e7
                int r13 = r1 + -1
                int r13 = r13 - r10
                goto L_0x00e8
            L_0x00e7:
                r13 = r10
            L_0x00e8:
                int r14 = r0.f4143n
                int r14 = r14 + r13
                androidx.constraintlayout.core.widgets.e r15 = androidx.constraintlayout.core.widgets.e.this
                int r15 = r15.f4129y1
                if (r14 < r15) goto L_0x00f5
                goto L_0x0383
            L_0x00f5:
                androidx.constraintlayout.core.widgets.e r14 = androidx.constraintlayout.core.widgets.e.this
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r14 = r14.f4128x1
                int r15 = r0.f4143n
                int r15 = r15 + r13
                r14 = r14[r15]
                if (r14 != 0) goto L_0x0106
                r14 = r9
                r9 = r11
                goto L_0x0208
            L_0x0106:
                if (r10 != 0) goto L_0x0111
                androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r14.f3898O
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f4133d
                int r3 = r0.f4137h
                r14.k(r15, r11, r3)
            L_0x0111:
                if (r13 != 0) goto L_0x016f
                androidx.constraintlayout.core.widgets.e r3 = androidx.constraintlayout.core.widgets.e.this
                int r3 = r3.f4105a1
                r11 = 1065353216(0x3f800000, float:1.0)
                androidx.constraintlayout.core.widgets.e r13 = androidx.constraintlayout.core.widgets.e.this
                float r13 = r13.f4111g1
                if (r17 == 0) goto L_0x0125
                float r13 = r11 - r13
            L_0x0125:
                int r15 = r0.f4143n
                if (r15 != 0) goto L_0x0149
                androidx.constraintlayout.core.widgets.e r15 = androidx.constraintlayout.core.widgets.e.this
                int r15 = r15.f4107c1
                if (r15 == r5) goto L_0x0149
                androidx.constraintlayout.core.widgets.e r3 = androidx.constraintlayout.core.widgets.e.this
                int r3 = r3.f4107c1
                if (r17 == 0) goto L_0x0142
                androidx.constraintlayout.core.widgets.e r13 = androidx.constraintlayout.core.widgets.e.this
                float r13 = r13.f4113i1
            L_0x013f:
                float r11 = r11 - r13
            L_0x0140:
                r13 = r11
                goto L_0x0169
            L_0x0142:
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.e.this
                float r11 = r11.f4113i1
                goto L_0x0140
            L_0x0149:
                if (r19 == 0) goto L_0x0169
                androidx.constraintlayout.core.widgets.e r15 = androidx.constraintlayout.core.widgets.e.this
                int r15 = r15.f4109e1
                if (r15 == r5) goto L_0x0169
                androidx.constraintlayout.core.widgets.e r3 = androidx.constraintlayout.core.widgets.e.this
                int r3 = r3.f4109e1
                if (r17 == 0) goto L_0x0162
                androidx.constraintlayout.core.widgets.e r13 = androidx.constraintlayout.core.widgets.e.this
                float r13 = r13.f4115k1
                goto L_0x013f
            L_0x0162:
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.e.this
                float r11 = r11.f4115k1
                goto L_0x0140
            L_0x0169:
                r14.N0(r3)
                r14.M0(r13)
            L_0x016f:
                int r3 = r1 + -1
                if (r10 != r3) goto L_0x017c
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f3900Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f4135f
                int r13 = r0.f4139j
                r14.k(r3, r11, r13)
            L_0x017c:
                if (r9 == 0) goto L_0x01a7
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f3898O
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.f3900Q
                androidx.constraintlayout.core.widgets.e r13 = androidx.constraintlayout.core.widgets.e.this
                int r13 = r13.f4117m1
                r3.a(r11, r13)
                if (r10 != r7) goto L_0x0194
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f3898O
                int r11 = r0.f4137h
                r3.u(r11)
            L_0x0194:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r9.f3900Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r14.f3898O
                r3.a(r11, r2)
                r3 = 1
                int r11 = r8 + 1
                if (r10 != r11) goto L_0x01a7
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r9.f3900Q
                int r9 = r0.f4139j
                r3.u(r9)
            L_0x01a7:
                if (r14 == r6) goto L_0x0207
                androidx.constraintlayout.core.widgets.e r3 = androidx.constraintlayout.core.widgets.e.this
                int r3 = r3.f4120p1
                r9 = 3
                if (r3 != r9) goto L_0x01c8
                boolean r3 = r12.Z()
                if (r3 == 0) goto L_0x01c8
                if (r14 == r12) goto L_0x01c8
                boolean r3 = r14.Z()
                if (r3 == 0) goto L_0x01c8
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f3902S
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r12.f3902S
                r3.a(r11, r2)
                goto L_0x0208
            L_0x01c8:
                androidx.constraintlayout.core.widgets.e r3 = androidx.constraintlayout.core.widgets.e.this
                int r3 = r3.f4120p1
                if (r3 == 0) goto L_0x01ff
                r11 = 1
                if (r3 == r11) goto L_0x01f7
                if (r4 == 0) goto L_0x01e8
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f3899P
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f4134e
                int r13 = r0.f4138i
                r3.a(r11, r13)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f3901R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f4136g
                int r13 = r0.f4140k
                r3.a(r11, r13)
                goto L_0x0208
            L_0x01e8:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f3899P
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.f3899P
                r3.a(r11, r2)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f3901R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.f3901R
                r3.a(r11, r2)
                goto L_0x0208
            L_0x01f7:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f3901R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.f3901R
                r3.a(r11, r2)
                goto L_0x0208
            L_0x01ff:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f3899P
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.f3899P
                r3.a(r11, r2)
                goto L_0x0208
            L_0x0207:
                r9 = 3
            L_0x0208:
                int r10 = r10 + 1
                r11 = r9
                r9 = r14
                goto L_0x00df
            L_0x020e:
                androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f4131b
                androidx.constraintlayout.core.widgets.e r6 = androidx.constraintlayout.core.widgets.e.this
                int r6 = r6.f4105a1
                r3.N0(r6)
                int r6 = r0.f4137h
                if (r18 <= 0) goto L_0x0224
                androidx.constraintlayout.core.widgets.e r10 = androidx.constraintlayout.core.widgets.e.this
                int r10 = r10.f4117m1
                int r6 = r6 + r10
            L_0x0224:
                if (r17 == 0) goto L_0x0246
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.f3900Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f4135f
                r10.a(r11, r6)
                if (r19 == 0) goto L_0x0238
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.f3898O
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.f4133d
                int r11 = r0.f4139j
                r6.a(r10, r11)
            L_0x0238:
                if (r18 <= 0) goto L_0x0265
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r0.f4135f
                androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r6.f3865d
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.f3898O
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.f3900Q
                r6.a(r10, r2)
                goto L_0x0265
            L_0x0246:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.f3898O
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f4133d
                r10.a(r11, r6)
                if (r19 == 0) goto L_0x0258
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.f3900Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.f4135f
                int r11 = r0.f4139j
                r6.a(r10, r11)
            L_0x0258:
                if (r18 <= 0) goto L_0x0265
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r0.f4133d
                androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r6.f3865d
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.f3900Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.f3898O
                r6.a(r10, r2)
            L_0x0265:
                r6 = r2
            L_0x0266:
                if (r6 >= r1) goto L_0x0383
                int r10 = r0.f4143n
                int r10 = r10 + r6
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.e.this
                int r11 = r11.f4129y1
                if (r10 < r11) goto L_0x0275
                goto L_0x0383
            L_0x0275:
                androidx.constraintlayout.core.widgets.e r10 = androidx.constraintlayout.core.widgets.e.this
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r10 = r10.f4128x1
                int r11 = r0.f4143n
                int r11 = r11 + r6
                r10 = r10[r11]
                if (r10 != 0) goto L_0x0285
                r12 = 1
                goto L_0x037f
            L_0x0285:
                if (r6 != 0) goto L_0x02d1
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.f3899P
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r0.f4134e
                int r13 = r0.f4138i
                r10.k(r11, r12, r13)
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.e.this
                int r11 = r11.f4106b1
                androidx.constraintlayout.core.widgets.e r12 = androidx.constraintlayout.core.widgets.e.this
                float r12 = r12.f4112h1
                int r13 = r0.f4143n
                if (r13 != 0) goto L_0x02b5
                androidx.constraintlayout.core.widgets.e r13 = androidx.constraintlayout.core.widgets.e.this
                int r13 = r13.f4108d1
                if (r13 == r5) goto L_0x02b5
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.e.this
                int r11 = r11.f4108d1
                androidx.constraintlayout.core.widgets.e r12 = androidx.constraintlayout.core.widgets.e.this
                float r12 = r12.f4114j1
                goto L_0x02cb
            L_0x02b5:
                if (r19 == 0) goto L_0x02cb
                androidx.constraintlayout.core.widgets.e r13 = androidx.constraintlayout.core.widgets.e.this
                int r13 = r13.f4110f1
                if (r13 == r5) goto L_0x02cb
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.e.this
                int r11 = r11.f4110f1
                androidx.constraintlayout.core.widgets.e r12 = androidx.constraintlayout.core.widgets.e.this
                float r12 = r12.f4116l1
            L_0x02cb:
                r10.e1(r11)
                r10.d1(r12)
            L_0x02d1:
                int r11 = r1 + -1
                if (r6 != r11) goto L_0x02de
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.f3901R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r0.f4136g
                int r13 = r0.f4140k
                r10.k(r11, r12, r13)
            L_0x02de:
                if (r9 == 0) goto L_0x0309
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.f3899P
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r9.f3901R
                androidx.constraintlayout.core.widgets.e r13 = androidx.constraintlayout.core.widgets.e.this
                int r13 = r13.f4118n1
                r11.a(r12, r13)
                if (r6 != r7) goto L_0x02f6
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.f3899P
                int r12 = r0.f4138i
                r11.u(r12)
            L_0x02f6:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.f3901R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r10.f3899P
                r11.a(r12, r2)
                r11 = 1
                int r12 = r8 + 1
                if (r6 != r12) goto L_0x0309
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.f3901R
                int r11 = r0.f4140k
                r9.u(r11)
            L_0x0309:
                if (r10 == r3) goto L_0x033a
                r9 = 2
                if (r17 == 0) goto L_0x033c
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.e.this
                int r11 = r11.f4119o1
                if (r11 == 0) goto L_0x0333
                r12 = 1
                if (r11 == r12) goto L_0x032b
                if (r11 == r9) goto L_0x031c
                goto L_0x033a
            L_0x031c:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.f3898O
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.f3898O
                r9.a(r11, r2)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.f3900Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.f3900Q
                r9.a(r11, r2)
                goto L_0x033a
            L_0x032b:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.f3898O
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.f3898O
                r9.a(r11, r2)
                goto L_0x033a
            L_0x0333:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.f3900Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.f3900Q
                r9.a(r11, r2)
            L_0x033a:
                r12 = 1
                goto L_0x037e
            L_0x033c:
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.e.this
                int r11 = r11.f4119o1
                if (r11 == 0) goto L_0x0376
                r12 = 1
                if (r11 == r12) goto L_0x036e
                if (r11 == r9) goto L_0x034a
                goto L_0x037e
            L_0x034a:
                if (r4 == 0) goto L_0x035f
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.f3898O
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f4133d
                int r13 = r0.f4137h
                r9.a(r11, r13)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.f3900Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f4135f
                int r13 = r0.f4139j
                r9.a(r11, r13)
                goto L_0x037e
            L_0x035f:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.f3898O
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.f3898O
                r9.a(r11, r2)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.f3900Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.f3900Q
                r9.a(r11, r2)
                goto L_0x037e
            L_0x036e:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.f3900Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.f3900Q
                r9.a(r11, r2)
                goto L_0x037e
            L_0x0376:
                r12 = 1
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.f3898O
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.f3898O
                r9.a(r11, r2)
            L_0x037e:
                r9 = r10
            L_0x037f:
                int r6 = r6 + 1
                goto L_0x0266
            L_0x0383:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.e.a.d(boolean, int, boolean):void");
        }

        public int e() {
            if (this.f4130a == 1) {
                return this.f4142m - e.this.f4118n1;
            }
            return this.f4142m;
        }

        public int f() {
            if (this.f4130a == 0) {
                return this.f4141l - e.this.f4117m1;
            }
            return this.f4141l;
        }

        public void g(int i4) {
            int i5 = this.f4145p;
            if (i5 != 0) {
                int i6 = this.f4144o;
                int i7 = i4 / i5;
                int i8 = 0;
                while (i8 < i6 && this.f4143n + i8 < e.this.f4129y1) {
                    ConstraintWidget constraintWidget = e.this.f4128x1[this.f4143n + i8];
                    if (this.f4130a == 0) {
                        if (constraintWidget != null && constraintWidget.A() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f3954w == 0) {
                            e.this.D1(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i7, constraintWidget.T(), constraintWidget.x());
                        }
                    } else if (constraintWidget != null && constraintWidget.T() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f3956x == 0) {
                        e.this.D1(constraintWidget, constraintWidget.A(), constraintWidget.W(), ConstraintWidget.DimensionBehaviour.FIXED, i7);
                    }
                    i8++;
                }
                h();
            }
        }

        public void i(int i4) {
            this.f4143n = i4;
        }

        public void j(int i4, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i5, int i6, int i7, int i8, int i9) {
            this.f4130a = i4;
            this.f4133d = constraintAnchor;
            this.f4134e = constraintAnchor2;
            this.f4135f = constraintAnchor3;
            this.f4136g = constraintAnchor4;
            this.f4137h = i5;
            this.f4138i = i6;
            this.f4139j = i7;
            this.f4140k = i8;
            this.f4146q = i9;
        }
    }

    private void j2(boolean z3) {
        ConstraintWidget constraintWidget;
        float f4;
        int i4;
        if (this.f4127w1 != null && this.f4126v1 != null && this.f4125u1 != null) {
            for (int i5 = 0; i5 < this.f4129y1; i5++) {
                this.f4128x1[i5].u0();
            }
            int[] iArr = this.f4127w1;
            int i6 = iArr[0];
            int i7 = iArr[1];
            float f5 = this.f4111g1;
            ConstraintWidget constraintWidget2 = null;
            int i8 = 0;
            while (i8 < i6) {
                if (z3) {
                    i4 = (i6 - i8) - 1;
                    f4 = 1.0f - this.f4111g1;
                } else {
                    f4 = f5;
                    i4 = i8;
                }
                ConstraintWidget constraintWidget3 = this.f4126v1[i4];
                if (!(constraintWidget3 == null || constraintWidget3.V() == 8)) {
                    if (i8 == 0) {
                        constraintWidget3.k(constraintWidget3.f3898O, this.f3898O, z1());
                        constraintWidget3.N0(this.f4105a1);
                        constraintWidget3.M0(f4);
                    }
                    if (i8 == i6 - 1) {
                        constraintWidget3.k(constraintWidget3.f3900Q, this.f3900Q, A1());
                    }
                    if (i8 > 0 && constraintWidget2 != null) {
                        constraintWidget3.k(constraintWidget3.f3898O, constraintWidget2.f3900Q, this.f4117m1);
                        constraintWidget2.k(constraintWidget2.f3900Q, constraintWidget3.f3898O, 0);
                    }
                    constraintWidget2 = constraintWidget3;
                }
                i8++;
                f5 = f4;
            }
            for (int i9 = 0; i9 < i7; i9++) {
                ConstraintWidget constraintWidget4 = this.f4125u1[i9];
                if (!(constraintWidget4 == null || constraintWidget4.V() == 8)) {
                    if (i9 == 0) {
                        constraintWidget4.k(constraintWidget4.f3899P, this.f3899P, B1());
                        constraintWidget4.e1(this.f4106b1);
                        constraintWidget4.d1(this.f4112h1);
                    }
                    if (i9 == i7 - 1) {
                        constraintWidget4.k(constraintWidget4.f3901R, this.f3901R, y1());
                    }
                    if (i9 > 0 && constraintWidget2 != null) {
                        constraintWidget4.k(constraintWidget4.f3899P, constraintWidget2.f3901R, this.f4118n1);
                        constraintWidget2.k(constraintWidget2.f3901R, constraintWidget4.f3899P, 0);
                    }
                    constraintWidget2 = constraintWidget4;
                }
            }
            for (int i10 = 0; i10 < i6; i10++) {
                for (int i11 = 0; i11 < i7; i11++) {
                    int i12 = (i11 * i6) + i10;
                    if (this.f4123s1 == 1) {
                        i12 = (i10 * i7) + i11;
                    }
                    ConstraintWidget[] constraintWidgetArr = this.f4128x1;
                    if (!(i12 >= constraintWidgetArr.length || (constraintWidget = constraintWidgetArr[i12]) == null || constraintWidget.V() == 8)) {
                        ConstraintWidget constraintWidget5 = this.f4126v1[i10];
                        ConstraintWidget constraintWidget6 = this.f4125u1[i11];
                        if (constraintWidget != constraintWidget5) {
                            constraintWidget.k(constraintWidget.f3898O, constraintWidget5.f3898O, 0);
                            constraintWidget.k(constraintWidget.f3900Q, constraintWidget5.f3900Q, 0);
                        }
                        if (constraintWidget != constraintWidget6) {
                            constraintWidget.k(constraintWidget.f3899P, constraintWidget6.f3899P, 0);
                            constraintWidget.k(constraintWidget.f3901R, constraintWidget6.f3901R, 0);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final int k2(ConstraintWidget constraintWidget, int i4) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.T() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i5 = constraintWidget.f3956x;
            if (i5 == 0) {
                return 0;
            }
            if (i5 == 2) {
                int i6 = (int) (constraintWidget.f3882E * ((float) i4));
                if (i6 != constraintWidget.x()) {
                    constraintWidget.Y0(true);
                    D1(constraintWidget, constraintWidget.A(), constraintWidget.W(), ConstraintWidget.DimensionBehaviour.FIXED, i6);
                }
                return i6;
            } else if (i5 == 1) {
                return constraintWidget.x();
            } else {
                if (i5 == 3) {
                    return (int) ((((float) constraintWidget.W()) * constraintWidget.f3917d0) + 0.5f);
                }
            }
        }
        return constraintWidget.x();
    }

    /* access modifiers changed from: private */
    public final int l2(ConstraintWidget constraintWidget, int i4) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.A() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i5 = constraintWidget.f3954w;
            if (i5 == 0) {
                return 0;
            }
            if (i5 == 2) {
                int i6 = (int) (constraintWidget.f3876B * ((float) i4));
                if (i6 != constraintWidget.W()) {
                    constraintWidget.Y0(true);
                    D1(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i6, constraintWidget.T(), constraintWidget.x());
                }
                return i6;
            } else if (i5 == 1) {
                return constraintWidget.W();
            } else {
                if (i5 == 3) {
                    return (int) ((((float) constraintWidget.x()) * constraintWidget.f3917d0) + 0.5f);
                }
            }
        }
        return constraintWidget.W();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x011d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x005e  */
    private void m2(androidx.constraintlayout.core.widgets.ConstraintWidget[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            r10 = this;
            r0 = 0
            if (r13 != 0) goto L_0x0026
            int r1 = r10.f4122r1
            if (r1 > 0) goto L_0x0023
            r1 = r0
            r2 = r1
            r3 = r2
        L_0x000a:
            if (r2 >= r12) goto L_0x0023
            if (r2 <= 0) goto L_0x0011
            int r4 = r10.f4117m1
            int r3 = r3 + r4
        L_0x0011:
            r4 = r11[r2]
            if (r4 != 0) goto L_0x0016
            goto L_0x0020
        L_0x0016:
            int r4 = r10.l2(r4, r14)
            int r3 = r3 + r4
            if (r3 <= r14) goto L_0x001e
            goto L_0x0023
        L_0x001e:
            int r1 = r1 + 1
        L_0x0020:
            int r2 = r2 + 1
            goto L_0x000a
        L_0x0023:
            r2 = r1
            r1 = r0
            goto L_0x0047
        L_0x0026:
            int r1 = r10.f4122r1
            if (r1 > 0) goto L_0x0046
            r1 = r0
            r2 = r1
            r3 = r2
        L_0x002d:
            if (r2 >= r12) goto L_0x0046
            if (r2 <= 0) goto L_0x0034
            int r4 = r10.f4118n1
            int r3 = r3 + r4
        L_0x0034:
            r4 = r11[r2]
            if (r4 != 0) goto L_0x0039
            goto L_0x0043
        L_0x0039:
            int r4 = r10.k2(r4, r14)
            int r3 = r3 + r4
            if (r3 <= r14) goto L_0x0041
            goto L_0x0046
        L_0x0041:
            int r1 = r1 + 1
        L_0x0043:
            int r2 = r2 + 1
            goto L_0x002d
        L_0x0046:
            r2 = r0
        L_0x0047:
            int[] r3 = r10.f4127w1
            if (r3 != 0) goto L_0x0050
            r3 = 2
            int[] r3 = new int[r3]
            r10.f4127w1 = r3
        L_0x0050:
            r3 = 1
            if (r1 != 0) goto L_0x0055
            if (r13 == r3) goto L_0x0059
        L_0x0055:
            if (r2 != 0) goto L_0x005b
            if (r13 != 0) goto L_0x005b
        L_0x0059:
            r4 = r3
            goto L_0x005c
        L_0x005b:
            r4 = r0
        L_0x005c:
            if (r4 != 0) goto L_0x011d
            if (r13 != 0) goto L_0x006a
            float r1 = (float) r12
            float r5 = (float) r2
            float r1 = r1 / r5
            double r5 = (double) r1
            double r5 = java.lang.Math.ceil(r5)
            int r1 = (int) r5
            goto L_0x0073
        L_0x006a:
            float r2 = (float) r12
            float r5 = (float) r1
            float r2 = r2 / r5
            double r5 = (double) r2
            double r5 = java.lang.Math.ceil(r5)
            int r2 = (int) r5
        L_0x0073:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r5 = r10.f4126v1
            r6 = 0
            if (r5 == 0) goto L_0x0080
            int r7 = r5.length
            if (r7 >= r2) goto L_0x007c
            goto L_0x0080
        L_0x007c:
            java.util.Arrays.fill(r5, r6)
            goto L_0x0084
        L_0x0080:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r5 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r2]
            r10.f4126v1 = r5
        L_0x0084:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r5 = r10.f4125u1
            if (r5 == 0) goto L_0x0090
            int r7 = r5.length
            if (r7 >= r1) goto L_0x008c
            goto L_0x0090
        L_0x008c:
            java.util.Arrays.fill(r5, r6)
            goto L_0x0094
        L_0x0090:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r5 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r1]
            r10.f4125u1 = r5
        L_0x0094:
            r5 = r0
        L_0x0095:
            if (r5 >= r2) goto L_0x00d9
            r6 = r0
        L_0x0098:
            if (r6 >= r1) goto L_0x00d6
            int r7 = r6 * r2
            int r7 = r7 + r5
            if (r13 != r3) goto L_0x00a2
            int r7 = r5 * r1
            int r7 = r7 + r6
        L_0x00a2:
            int r8 = r11.length
            if (r7 < r8) goto L_0x00a6
            goto L_0x00d3
        L_0x00a6:
            r7 = r11[r7]
            if (r7 != 0) goto L_0x00ab
            goto L_0x00d3
        L_0x00ab:
            int r8 = r10.l2(r7, r14)
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r9 = r10.f4126v1
            r9 = r9[r5]
            if (r9 == 0) goto L_0x00bb
            int r9 = r9.W()
            if (r9 >= r8) goto L_0x00bf
        L_0x00bb:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r8 = r10.f4126v1
            r8[r5] = r7
        L_0x00bf:
            int r8 = r10.k2(r7, r14)
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r9 = r10.f4125u1
            r9 = r9[r6]
            if (r9 == 0) goto L_0x00cf
            int r9 = r9.x()
            if (r9 >= r8) goto L_0x00d3
        L_0x00cf:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r8 = r10.f4125u1
            r8[r6] = r7
        L_0x00d3:
            int r6 = r6 + 1
            goto L_0x0098
        L_0x00d6:
            int r5 = r5 + 1
            goto L_0x0095
        L_0x00d9:
            r5 = r0
            r6 = r5
        L_0x00db:
            if (r5 >= r2) goto L_0x00f0
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r7 = r10.f4126v1
            r7 = r7[r5]
            if (r7 == 0) goto L_0x00ed
            if (r5 <= 0) goto L_0x00e8
            int r8 = r10.f4117m1
            int r6 = r6 + r8
        L_0x00e8:
            int r7 = r10.l2(r7, r14)
            int r6 = r6 + r7
        L_0x00ed:
            int r5 = r5 + 1
            goto L_0x00db
        L_0x00f0:
            r5 = r0
            r7 = r5
        L_0x00f2:
            if (r5 >= r1) goto L_0x0107
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r8 = r10.f4125u1
            r8 = r8[r5]
            if (r8 == 0) goto L_0x0104
            if (r5 <= 0) goto L_0x00ff
            int r9 = r10.f4118n1
            int r7 = r7 + r9
        L_0x00ff:
            int r8 = r10.k2(r8, r14)
            int r7 = r7 + r8
        L_0x0104:
            int r5 = r5 + 1
            goto L_0x00f2
        L_0x0107:
            r15[r0] = r6
            r15[r3] = r7
            if (r13 != 0) goto L_0x0115
            if (r6 <= r14) goto L_0x0059
            if (r2 <= r3) goto L_0x0059
            int r2 = r2 + -1
            goto L_0x005c
        L_0x0115:
            if (r7 <= r14) goto L_0x0059
            if (r1 <= r3) goto L_0x0059
            int r1 = r1 + -1
            goto L_0x005c
        L_0x011d:
            int[] r11 = r10.f4127w1
            r11[r0] = r2
            r11[r3] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.e.m2(androidx.constraintlayout.core.widgets.ConstraintWidget[], int, int, int, int[]):void");
    }

    private void n2(ConstraintWidget[] constraintWidgetArr, int i4, int i5, int i6, int[] iArr) {
        int i7;
        boolean z3;
        ConstraintAnchor constraintAnchor;
        int i8;
        int i9;
        int i10;
        ConstraintAnchor constraintAnchor2;
        boolean z4;
        int i11;
        boolean z5;
        int i12;
        int i13 = i4;
        int i14 = i6;
        if (i13 != 0) {
            this.f4124t1.clear();
            a aVar = new a(i5, this.f3898O, this.f3899P, this.f3900Q, this.f3901R, i6);
            this.f4124t1.add(aVar);
            if (i5 == 0) {
                i7 = 0;
                int i15 = 0;
                int i16 = 0;
                while (i16 < i13) {
                    ConstraintWidget constraintWidget = constraintWidgetArr[i16];
                    int l22 = l2(constraintWidget, i14);
                    if (constraintWidget.A() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        i7++;
                    }
                    int i17 = i7;
                    if ((i15 == i14 || this.f4117m1 + i15 + l22 > i14) && aVar.f4131b != null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!z5 && i16 > 0 && (i12 = this.f4122r1) > 0 && i16 % i12 == 0) {
                        z5 = true;
                    }
                    if (z5) {
                        aVar = new a(i5, this.f3898O, this.f3899P, this.f3900Q, this.f3901R, i6);
                        aVar.i(i16);
                        this.f4124t1.add(aVar);
                    } else if (i16 > 0) {
                        i15 += this.f4117m1 + l22;
                        aVar.b(constraintWidget);
                        i16++;
                        i7 = i17;
                    }
                    i15 = l22;
                    aVar.b(constraintWidget);
                    i16++;
                    i7 = i17;
                }
            } else {
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                while (i20 < i13) {
                    ConstraintWidget constraintWidget2 = constraintWidgetArr[i20];
                    int k22 = k2(constraintWidget2, i14);
                    if (constraintWidget2.T() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        i7++;
                    }
                    int i21 = i7;
                    if ((i19 == i14 || this.f4118n1 + i19 + k22 > i14) && aVar.f4131b != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4 && i20 > 0 && (i11 = this.f4122r1) > 0 && i20 % i11 == 0) {
                        z4 = true;
                    }
                    if (z4) {
                        aVar = new a(i5, this.f3898O, this.f3899P, this.f3900Q, this.f3901R, i6);
                        aVar.i(i20);
                        this.f4124t1.add(aVar);
                    } else if (i20 > 0) {
                        i19 += this.f4118n1 + k22;
                        aVar.b(constraintWidget2);
                        i20++;
                        i18 = i21;
                    }
                    i19 = k22;
                    aVar.b(constraintWidget2);
                    i20++;
                    i18 = i21;
                }
            }
            int size = this.f4124t1.size();
            ConstraintAnchor constraintAnchor3 = this.f3898O;
            ConstraintAnchor constraintAnchor4 = this.f3899P;
            ConstraintAnchor constraintAnchor5 = this.f3900Q;
            ConstraintAnchor constraintAnchor6 = this.f3901R;
            int z12 = z1();
            int B12 = B1();
            int A12 = A1();
            int y12 = y1();
            ConstraintWidget.DimensionBehaviour A3 = A();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (A3 == dimensionBehaviour || T() == dimensionBehaviour) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i7 > 0 && z3) {
                for (int i22 = 0; i22 < size; i22++) {
                    a aVar2 = (a) this.f4124t1.get(i22);
                    if (i5 == 0) {
                        aVar2.g(i14 - aVar2.f());
                    } else {
                        aVar2.g(i14 - aVar2.e());
                    }
                }
            }
            int i23 = B12;
            int i24 = A12;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            int i28 = z12;
            ConstraintAnchor constraintAnchor7 = constraintAnchor4;
            ConstraintAnchor constraintAnchor8 = constraintAnchor3;
            int i29 = y12;
            while (i27 < size) {
                a aVar3 = (a) this.f4124t1.get(i27);
                if (i5 == 0) {
                    if (i27 < size - 1) {
                        constraintAnchor2 = ((a) this.f4124t1.get(i27 + 1)).f4131b.f3899P;
                        i10 = 0;
                    } else {
                        constraintAnchor2 = this.f3901R;
                        i10 = y1();
                    }
                    ConstraintAnchor constraintAnchor9 = aVar3.f4131b.f3901R;
                    ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                    ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                    int i30 = i25;
                    ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                    int i31 = i26;
                    ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                    ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                    i8 = i27;
                    aVar3.j(i5, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i28, i23, i24, i10, i6);
                    int max = Math.max(i31, aVar3.f());
                    i25 = i30 + aVar3.e();
                    if (i8 > 0) {
                        i25 += this.f4118n1;
                    }
                    constraintAnchor8 = constraintAnchor11;
                    i26 = max;
                    i23 = 0;
                    constraintAnchor7 = constraintAnchor9;
                    constraintAnchor = constraintAnchor14;
                    int i32 = i10;
                    constraintAnchor6 = constraintAnchor2;
                    i29 = i32;
                } else {
                    ConstraintAnchor constraintAnchor15 = constraintAnchor8;
                    int i33 = i25;
                    int i34 = i26;
                    i8 = i27;
                    if (i8 < size - 1) {
                        constraintAnchor = ((a) this.f4124t1.get(i8 + 1)).f4131b.f3898O;
                        i9 = 0;
                    } else {
                        constraintAnchor = this.f3900Q;
                        i9 = A1();
                    }
                    ConstraintAnchor constraintAnchor16 = aVar3.f4131b.f3900Q;
                    aVar3.j(i5, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i28, i23, i9, i29, i6);
                    i26 = i34 + aVar3.f();
                    int max2 = Math.max(i33, aVar3.e());
                    if (i8 > 0) {
                        i26 += this.f4117m1;
                    }
                    i25 = max2;
                    i28 = 0;
                    i24 = i9;
                    constraintAnchor8 = constraintAnchor16;
                }
                i27 = i8 + 1;
                int i35 = i6;
                constraintAnchor5 = constraintAnchor;
            }
            iArr[0] = i26;
            iArr[1] = i25;
        }
    }

    private void o2(ConstraintWidget[] constraintWidgetArr, int i4, int i5, int i6, int[] iArr) {
        int i7;
        boolean z3;
        ConstraintAnchor constraintAnchor;
        int i8;
        int i9;
        int i10;
        ConstraintAnchor constraintAnchor2;
        boolean z4;
        int i11;
        boolean z5;
        int i12;
        int i13 = i4;
        int i14 = i6;
        if (i13 != 0) {
            this.f4124t1.clear();
            a aVar = new a(i5, this.f3898O, this.f3899P, this.f3900Q, this.f3901R, i6);
            this.f4124t1.add(aVar);
            if (i5 == 0) {
                int i15 = 0;
                i7 = 0;
                int i16 = 0;
                int i17 = 0;
                while (i17 < i13) {
                    int i18 = i15 + 1;
                    ConstraintWidget constraintWidget = constraintWidgetArr[i17];
                    int l22 = l2(constraintWidget, i14);
                    if (constraintWidget.A() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        i7++;
                    }
                    int i19 = i7;
                    if ((i16 == i14 || this.f4117m1 + i16 + l22 > i14) && aVar.f4131b != null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!z5 && i17 > 0 && (i12 = this.f4122r1) > 0 && i18 > i12) {
                        z5 = true;
                    }
                    if (z5) {
                        aVar = new a(i5, this.f3898O, this.f3899P, this.f3900Q, this.f3901R, i6);
                        aVar.i(i17);
                        this.f4124t1.add(aVar);
                        i15 = i18;
                        i16 = l22;
                    } else {
                        if (i17 > 0) {
                            i16 += this.f4117m1 + l22;
                        } else {
                            i16 = l22;
                        }
                        i15 = 0;
                    }
                    aVar.b(constraintWidget);
                    i17++;
                    i7 = i19;
                }
            } else {
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                while (i22 < i13) {
                    ConstraintWidget constraintWidget2 = constraintWidgetArr[i22];
                    int k22 = k2(constraintWidget2, i14);
                    if (constraintWidget2.T() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        i7++;
                    }
                    int i23 = i7;
                    if ((i20 == i14 || this.f4118n1 + i20 + k22 > i14) && aVar.f4131b != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4 && i22 > 0 && (i11 = this.f4122r1) > 0 && i11 < 0) {
                        z4 = true;
                    }
                    if (z4) {
                        aVar = new a(i5, this.f3898O, this.f3899P, this.f3900Q, this.f3901R, i6);
                        aVar.i(i22);
                        this.f4124t1.add(aVar);
                    } else if (i22 > 0) {
                        i20 += this.f4118n1 + k22;
                        aVar.b(constraintWidget2);
                        i22++;
                        i21 = i23;
                    }
                    i20 = k22;
                    aVar.b(constraintWidget2);
                    i22++;
                    i21 = i23;
                }
            }
            int size = this.f4124t1.size();
            ConstraintAnchor constraintAnchor3 = this.f3898O;
            ConstraintAnchor constraintAnchor4 = this.f3899P;
            ConstraintAnchor constraintAnchor5 = this.f3900Q;
            ConstraintAnchor constraintAnchor6 = this.f3901R;
            int z12 = z1();
            int B12 = B1();
            int A12 = A1();
            int y12 = y1();
            ConstraintWidget.DimensionBehaviour A3 = A();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (A3 == dimensionBehaviour || T() == dimensionBehaviour) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i7 > 0 && z3) {
                for (int i24 = 0; i24 < size; i24++) {
                    a aVar2 = (a) this.f4124t1.get(i24);
                    if (i5 == 0) {
                        aVar2.g(i14 - aVar2.f());
                    } else {
                        aVar2.g(i14 - aVar2.e());
                    }
                }
            }
            int i25 = B12;
            int i26 = A12;
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            int i30 = z12;
            ConstraintAnchor constraintAnchor7 = constraintAnchor4;
            ConstraintAnchor constraintAnchor8 = constraintAnchor3;
            int i31 = y12;
            while (i29 < size) {
                a aVar3 = (a) this.f4124t1.get(i29);
                if (i5 == 0) {
                    if (i29 < size - 1) {
                        constraintAnchor2 = ((a) this.f4124t1.get(i29 + 1)).f4131b.f3899P;
                        i10 = 0;
                    } else {
                        constraintAnchor2 = this.f3901R;
                        i10 = y1();
                    }
                    ConstraintAnchor constraintAnchor9 = aVar3.f4131b.f3901R;
                    ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                    ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                    int i32 = i27;
                    ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                    int i33 = i28;
                    ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                    ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                    i8 = i29;
                    aVar3.j(i5, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i30, i25, i26, i10, i6);
                    int max = Math.max(i33, aVar3.f());
                    i27 = i32 + aVar3.e();
                    if (i8 > 0) {
                        i27 += this.f4118n1;
                    }
                    constraintAnchor8 = constraintAnchor11;
                    i28 = max;
                    i25 = 0;
                    constraintAnchor7 = constraintAnchor9;
                    constraintAnchor = constraintAnchor14;
                    int i34 = i10;
                    constraintAnchor6 = constraintAnchor2;
                    i31 = i34;
                } else {
                    ConstraintAnchor constraintAnchor15 = constraintAnchor8;
                    int i35 = i27;
                    int i36 = i28;
                    i8 = i29;
                    if (i8 < size - 1) {
                        constraintAnchor = ((a) this.f4124t1.get(i8 + 1)).f4131b.f3898O;
                        i9 = 0;
                    } else {
                        constraintAnchor = this.f3900Q;
                        i9 = A1();
                    }
                    ConstraintAnchor constraintAnchor16 = aVar3.f4131b.f3900Q;
                    aVar3.j(i5, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i30, i25, i9, i31, i6);
                    i28 = i36 + aVar3.f();
                    int max2 = Math.max(i35, aVar3.e());
                    if (i8 > 0) {
                        i28 += this.f4117m1;
                    }
                    i27 = max2;
                    i30 = 0;
                    i26 = i9;
                    constraintAnchor8 = constraintAnchor16;
                }
                i29 = i8 + 1;
                int i37 = i6;
                constraintAnchor5 = constraintAnchor;
            }
            iArr[0] = i28;
            iArr[1] = i27;
        }
    }

    private void p2(ConstraintWidget[] constraintWidgetArr, int i4, int i5, int i6, int[] iArr) {
        a aVar;
        int i7 = i4;
        if (i7 != 0) {
            if (this.f4124t1.size() == 0) {
                aVar = new a(i5, this.f3898O, this.f3899P, this.f3900Q, this.f3901R, i6);
                this.f4124t1.add(aVar);
            } else {
                a aVar2 = (a) this.f4124t1.get(0);
                aVar2.c();
                aVar = aVar2;
                aVar.j(i5, this.f3898O, this.f3899P, this.f3900Q, this.f3901R, z1(), B1(), A1(), y1(), i6);
            }
            for (int i8 = 0; i8 < i7; i8++) {
                aVar.b(constraintWidgetArr[i8]);
            }
            iArr[0] = aVar.f();
            iArr[1] = aVar.e();
        }
    }

    public void A2(float f4) {
        this.f4116l1 = f4;
    }

    public void B2(int i4) {
        this.f4110f1 = i4;
    }

    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: type inference failed for: r11v8 */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C1(int r19, int r20, int r21, int r22) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            int r0 = r6.f218M0
            r11 = 0
            if (r0 <= 0) goto L_0x001c
            boolean r0 = r18.E1()
            if (r0 != 0) goto L_0x001c
            r6.H1(r11, r11)
            r6.G1(r11)
            return
        L_0x001c:
            int r12 = r18.z1()
            int r13 = r18.A1()
            int r14 = r18.B1()
            int r15 = r18.y1()
            r0 = 2
            int[] r5 = new int[r0]
            int r1 = r8 - r12
            int r1 = r1 - r13
            int r2 = r6.f4123s1
            r4 = 1
            if (r2 != r4) goto L_0x003a
            int r1 = r10 - r14
            int r1 = r1 - r15
        L_0x003a:
            r16 = r1
            r1 = -1
            if (r2 != 0) goto L_0x004c
            int r2 = r6.f4105a1
            if (r2 != r1) goto L_0x0045
            r6.f4105a1 = r11
        L_0x0045:
            int r2 = r6.f4106b1
            if (r2 != r1) goto L_0x0058
            r6.f4106b1 = r11
            goto L_0x0058
        L_0x004c:
            int r2 = r6.f4105a1
            if (r2 != r1) goto L_0x0052
            r6.f4105a1 = r11
        L_0x0052:
            int r2 = r6.f4106b1
            if (r2 != r1) goto L_0x0058
            r6.f4106b1 = r11
        L_0x0058:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = r6.f217L0
            r2 = r11
            r3 = r2
        L_0x005c:
            int r11 = r6.f218M0
            r0 = 8
            if (r2 >= r11) goto L_0x0072
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r11 = r6.f217L0
            r11 = r11[r2]
            int r11 = r11.V()
            if (r11 != r0) goto L_0x006e
            int r3 = r3 + 1
        L_0x006e:
            int r2 = r2 + 1
            r0 = 2
            goto L_0x005c
        L_0x0072:
            if (r3 <= 0) goto L_0x0091
            int r11 = r11 - r3
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r11]
            r2 = 0
            r3 = 0
        L_0x0079:
            int r11 = r6.f218M0
            if (r2 >= r11) goto L_0x008f
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r11 = r6.f217L0
            r11 = r11[r2]
            int r4 = r11.V()
            if (r4 == r0) goto L_0x008b
            r1[r3] = r11
            int r3 = r3 + 1
        L_0x008b:
            int r2 = r2 + 1
            r4 = 1
            goto L_0x0079
        L_0x008f:
            r2 = r3
            goto L_0x0092
        L_0x0091:
            r2 = r11
        L_0x0092:
            r6.f4128x1 = r1
            r6.f4129y1 = r2
            int r0 = r6.f4121q1
            if (r0 == 0) goto L_0x00cf
            r4 = 1
            if (r0 == r4) goto L_0x00c2
            r3 = 2
            if (r0 == r3) goto L_0x00b5
            r3 = 3
            if (r0 == r3) goto L_0x00a8
            r11 = r4
            r17 = r5
        L_0x00a6:
            r0 = 0
            goto L_0x00dc
        L_0x00a8:
            int r3 = r6.f4123s1
            r0 = r18
            r11 = r4
            r4 = r16
            r17 = r5
            r0.o2(r1, r2, r3, r4, r5)
            goto L_0x00a6
        L_0x00b5:
            r11 = r4
            r17 = r5
            int r3 = r6.f4123s1
            r0 = r18
            r4 = r16
            r0.m2(r1, r2, r3, r4, r5)
            goto L_0x00a6
        L_0x00c2:
            r11 = r4
            r17 = r5
            int r3 = r6.f4123s1
            r0 = r18
            r4 = r16
            r0.n2(r1, r2, r3, r4, r5)
            goto L_0x00a6
        L_0x00cf:
            r17 = r5
            r11 = 1
            int r3 = r6.f4123s1
            r0 = r18
            r4 = r16
            r0.p2(r1, r2, r3, r4, r5)
            goto L_0x00a6
        L_0x00dc:
            r1 = r17[r0]
            int r1 = r1 + r12
            int r1 = r1 + r13
            r2 = r17[r11]
            int r2 = r2 + r14
            int r2 = r2 + r15
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r7 != r4) goto L_0x00ec
            r1 = r8
            goto L_0x00f7
        L_0x00ec:
            if (r7 != r3) goto L_0x00f3
            int r1 = java.lang.Math.min(r1, r8)
            goto L_0x00f7
        L_0x00f3:
            if (r7 != 0) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            r1 = r0
        L_0x00f7:
            if (r9 != r4) goto L_0x00fb
            r2 = r10
            goto L_0x0106
        L_0x00fb:
            if (r9 != r3) goto L_0x0102
            int r2 = java.lang.Math.min(r2, r10)
            goto L_0x0106
        L_0x0102:
            if (r9 != 0) goto L_0x0105
            goto L_0x0106
        L_0x0105:
            r2 = r0
        L_0x0106:
            r6.H1(r1, r2)
            r6.k1(r1)
            r6.L0(r2)
            int r1 = r6.f218M0
            if (r1 <= 0) goto L_0x0114
            goto L_0x0115
        L_0x0114:
            r11 = r0
        L_0x0115:
            r6.G1(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.e.C1(int, int, int, int):void");
    }

    public void C2(int i4) {
        this.f4122r1 = i4;
    }

    public void D2(int i4) {
        this.f4123s1 = i4;
    }

    public void E2(int i4) {
        this.f4120p1 = i4;
    }

    public void F2(float f4) {
        this.f4112h1 = f4;
    }

    public void G2(int i4) {
        this.f4118n1 = i4;
    }

    public void H2(int i4) {
        this.f4106b1 = i4;
    }

    public void I2(int i4) {
        this.f4121q1 = i4;
    }

    public void g(d dVar, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        super.g(dVar, z3);
        if (K() == null || !((d) K()).P1()) {
            z4 = false;
        } else {
            z4 = true;
        }
        int i4 = this.f4121q1;
        if (i4 != 0) {
            if (i4 == 1) {
                int size = this.f4124t1.size();
                for (int i5 = 0; i5 < size; i5++) {
                    a aVar = (a) this.f4124t1.get(i5);
                    if (i5 == size - 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    aVar.d(z4, i5, z5);
                }
            } else if (i4 == 2) {
                j2(z4);
            } else if (i4 == 3) {
                int size2 = this.f4124t1.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    a aVar2 = (a) this.f4124t1.get(i6);
                    if (i6 == size2 - 1) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    aVar2.d(z4, i6, z6);
                }
            }
        } else if (this.f4124t1.size() > 0) {
            ((a) this.f4124t1.get(0)).d(z4, 0, true);
        }
        G1(false);
    }

    public void q2(float f4) {
        this.f4113i1 = f4;
    }

    public void r2(int i4) {
        this.f4107c1 = i4;
    }

    public void s2(float f4) {
        this.f4114j1 = f4;
    }

    public void t2(int i4) {
        this.f4108d1 = i4;
    }

    public void u2(int i4) {
        this.f4119o1 = i4;
    }

    public void v2(float f4) {
        this.f4111g1 = f4;
    }

    public void w2(int i4) {
        this.f4117m1 = i4;
    }

    public void x2(int i4) {
        this.f4105a1 = i4;
    }

    public void y2(float f4) {
        this.f4115k1 = f4;
    }

    public void z2(int i4) {
        this.f4109e1 = i4;
    }
}
