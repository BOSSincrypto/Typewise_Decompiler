package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.f;
import androidx.constraintlayout.core.widgets.g;
import androidx.constraintlayout.core.widgets.h;
import java.util.ArrayList;
import kotlin.uuid.Uuid;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f3994a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private a f3995b = new a();

    /* renamed from: c  reason: collision with root package name */
    private d f3996c;

    public static class a {

        /* renamed from: k  reason: collision with root package name */
        public static int f3997k = 0;

        /* renamed from: l  reason: collision with root package name */
        public static int f3998l = 1;

        /* renamed from: m  reason: collision with root package name */
        public static int f3999m = 2;

        /* renamed from: a  reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f4000a;

        /* renamed from: b  reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f4001b;

        /* renamed from: c  reason: collision with root package name */
        public int f4002c;

        /* renamed from: d  reason: collision with root package name */
        public int f4003d;

        /* renamed from: e  reason: collision with root package name */
        public int f4004e;

        /* renamed from: f  reason: collision with root package name */
        public int f4005f;

        /* renamed from: g  reason: collision with root package name */
        public int f4006g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f4007h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f4008i;

        /* renamed from: j  reason: collision with root package name */
        public int f4009j;
    }

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.b$b  reason: collision with other inner class name */
    public interface C0061b {
        void a();

        void b(ConstraintWidget constraintWidget, a aVar);
    }

    public b(d dVar) {
        this.f3996c = dVar;
    }

    private boolean a(C0061b bVar, ConstraintWidget constraintWidget, int i4) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        this.f3995b.f4000a = constraintWidget.A();
        this.f3995b.f4001b = constraintWidget.T();
        this.f3995b.f4002c = constraintWidget.W();
        this.f3995b.f4003d = constraintWidget.x();
        a aVar = this.f3995b;
        aVar.f4008i = false;
        aVar.f4009j = i4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f4000a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour == dimensionBehaviour2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (aVar.f4001b == dimensionBehaviour2) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z3 || constraintWidget.f3917d0 <= 0.0f) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!z4 || constraintWidget.f3917d0 <= 0.0f) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (z5 && constraintWidget.f3958y[0] == 4) {
            aVar.f4000a = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z6 && constraintWidget.f3958y[1] == 4) {
            aVar.f4001b = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        bVar.b(constraintWidget, aVar);
        constraintWidget.k1(this.f3995b.f4004e);
        constraintWidget.L0(this.f3995b.f4005f);
        constraintWidget.K0(this.f3995b.f4007h);
        constraintWidget.A0(this.f3995b.f4006g);
        a aVar2 = this.f3995b;
        aVar2.f4009j = a.f3997k;
        return aVar2.f4008i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008d, code lost:
        if (r8 != r9) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0094, code lost:
        if (r5.f3917d0 <= 0.0f) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(androidx.constraintlayout.core.widgets.d r13) {
        /*
            r12 = this;
            java.util.ArrayList r0 = r13.f219L0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.T1(r1)
            androidx.constraintlayout.core.widgets.analyzer.b$b r2 = r13.I1()
            r3 = 0
            r4 = r3
        L_0x0012:
            if (r4 >= r0) goto L_0x00a4
            java.util.ArrayList r5 = r13.f219L0
            java.lang.Object r5 = r5.get(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.f
            if (r6 == 0) goto L_0x0022
            goto L_0x00a0
        L_0x0022:
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.a
            if (r6 == 0) goto L_0x0028
            goto L_0x00a0
        L_0x0028:
            boolean r6 = r5.l0()
            if (r6 == 0) goto L_0x0030
            goto L_0x00a0
        L_0x0030:
            if (r1 == 0) goto L_0x0047
            androidx.constraintlayout.core.widgets.analyzer.j r6 = r5.f3918e
            if (r6 == 0) goto L_0x0047
            androidx.constraintlayout.core.widgets.analyzer.l r7 = r5.f3920f
            if (r7 == 0) goto L_0x0047
            androidx.constraintlayout.core.widgets.analyzer.e r6 = r6.f3986e
            boolean r6 = r6.f3978j
            if (r6 == 0) goto L_0x0047
            androidx.constraintlayout.core.widgets.analyzer.e r6 = r7.f3986e
            boolean r6 = r6.f3978j
            if (r6 == 0) goto L_0x0047
            goto L_0x00a0
        L_0x0047:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = r5.u(r3)
            r7 = 1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = r5.u(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 != r9) goto L_0x0060
            int r10 = r5.f3954w
            if (r10 == r7) goto L_0x0060
            if (r8 != r9) goto L_0x0060
            int r10 = r5.f3956x
            if (r10 == r7) goto L_0x0060
            r10 = r7
            goto L_0x0061
        L_0x0060:
            r10 = r3
        L_0x0061:
            if (r10 != 0) goto L_0x0097
            boolean r11 = r13.T1(r7)
            if (r11 == 0) goto L_0x0097
            boolean r11 = r5 instanceof androidx.constraintlayout.core.widgets.h
            if (r11 != 0) goto L_0x0097
            if (r6 != r9) goto L_0x007c
            int r11 = r5.f3954w
            if (r11 != 0) goto L_0x007c
            if (r8 == r9) goto L_0x007c
            boolean r11 = r5.i0()
            if (r11 != 0) goto L_0x007c
            r10 = r7
        L_0x007c:
            if (r8 != r9) goto L_0x008b
            int r11 = r5.f3956x
            if (r11 != 0) goto L_0x008b
            if (r6 == r9) goto L_0x008b
            boolean r11 = r5.i0()
            if (r11 != 0) goto L_0x008b
            r10 = r7
        L_0x008b:
            if (r6 == r9) goto L_0x008f
            if (r8 != r9) goto L_0x0097
        L_0x008f:
            float r6 = r5.f3917d0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r7 = r10
        L_0x0098:
            if (r7 == 0) goto L_0x009b
            goto L_0x00a0
        L_0x009b:
            int r6 = androidx.constraintlayout.core.widgets.analyzer.b.a.f3997k
            r12.a(r2, r5, r6)
        L_0x00a0:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x00a4:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.b.b(androidx.constraintlayout.core.widgets.d):void");
    }

    private void c(d dVar, String str, int i4, int i5, int i6) {
        int I3 = dVar.I();
        int H3 = dVar.H();
        dVar.a1(0);
        dVar.Z0(0);
        dVar.k1(i5);
        dVar.L0(i6);
        dVar.a1(I3);
        dVar.Z0(H3);
        this.f3996c.X1(i4);
        this.f3996c.s1();
    }

    public long d(d dVar, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        boolean z3;
        boolean z4;
        int i13;
        boolean z5;
        boolean z6;
        int i14;
        d dVar2;
        boolean z7;
        boolean z8;
        boolean z9;
        int i15;
        boolean z10;
        int i16;
        int i17;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        b bVar = this;
        d dVar3 = dVar;
        int i18 = i4;
        int i19 = i7;
        int i20 = i9;
        C0061b I12 = dVar.I1();
        int size = dVar3.f219L0.size();
        int W3 = dVar.W();
        int x3 = dVar.x();
        boolean b4 = g.b(i18, Uuid.SIZE_BITS);
        int i21 = 1;
        if (b4 || g.b(i18, 64)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            int i22 = 0;
            while (true) {
                if (i22 >= size) {
                    break;
                }
                ConstraintWidget constraintWidget = (ConstraintWidget) dVar3.f219L0.get(i22);
                ConstraintWidget.DimensionBehaviour A3 = constraintWidget.A();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (A3 == dimensionBehaviour) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (constraintWidget.T() == dimensionBehaviour) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z14 || !z15 || constraintWidget.v() <= 0.0f) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                if ((!constraintWidget.i0() || !z16) && ((!constraintWidget.k0() || !z16) && !(constraintWidget instanceof h) && !constraintWidget.i0() && !constraintWidget.k0())) {
                    i22++;
                }
            }
            z3 = false;
        }
        if (z3) {
            boolean z17 = androidx.constraintlayout.core.d.f3810r;
        }
        if (!(i19 == 1073741824 && i20 == 1073741824) && !b4) {
            z4 = false;
        } else {
            z4 = true;
        }
        boolean z18 = z3 & z4;
        int i23 = 2;
        if (z18) {
            int min = Math.min(dVar.G(), i8);
            int min2 = Math.min(dVar.F(), i10);
            if (i19 == 1073741824 && dVar.W() != min) {
                dVar3.k1(min);
                dVar.M1();
            }
            if (i20 == 1073741824 && dVar.x() != min2) {
                dVar3.L0(min2);
                dVar.M1();
            }
            if (i19 == 1073741824 && i20 == 1073741824) {
                z6 = dVar3.F1(b4);
                i13 = 2;
                z5 = false;
            } else {
                boolean G12 = dVar3.G1(b4);
                z5 = false;
                if (i19 == 1073741824) {
                    G12 &= dVar3.H1(b4, 0);
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                if (i20 == 1073741824) {
                    z6 = dVar3.H1(b4, 1) & G12;
                    i13++;
                } else {
                    z6 = G12;
                }
            }
            if (z6) {
                if (i19 == 1073741824) {
                    z12 = true;
                } else {
                    z12 = z5;
                }
                if (i20 == 1073741824) {
                    z13 = true;
                } else {
                    z13 = z5;
                }
                dVar3.p1(z12, z13);
            }
        } else {
            z5 = false;
            z6 = false;
            i13 = 0;
        }
        if (z6 && i13 == 2) {
            return 0;
        }
        int J12 = dVar.J1();
        if (size > 0) {
            b(dVar);
        }
        e(dVar);
        int size2 = bVar.f3994a.size();
        if (size > 0) {
            c(dVar, "First pass", 0, W3, x3);
        }
        if (size2 > 0) {
            ConstraintWidget.DimensionBehaviour A4 = dVar.A();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (A4 == dimensionBehaviour2) {
                z7 = true;
            } else {
                z7 = z5;
            }
            if (dVar.T() == dimensionBehaviour2) {
                z8 = true;
            } else {
                z8 = z5;
            }
            int max = Math.max(dVar.W(), bVar.f3996c.I());
            int max2 = Math.max(dVar.x(), bVar.f3996c.H());
            int i24 = z5;
            boolean z19 = i24;
            while (i24 < size2) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget) bVar.f3994a.get(i24);
                if (!(constraintWidget2 instanceof h)) {
                    i16 = J12;
                    i17 = i21;
                } else {
                    int W4 = constraintWidget2.W();
                    int x4 = constraintWidget2.x();
                    boolean a4 = z19 | bVar.a(I12, constraintWidget2, a.f3998l);
                    int W5 = constraintWidget2.W();
                    i16 = J12;
                    int x5 = constraintWidget2.x();
                    if (W5 != W4) {
                        constraintWidget2.k1(W5);
                        if (z7 && constraintWidget2.M() > max) {
                            max = Math.max(max, constraintWidget2.M() + constraintWidget2.o(ConstraintAnchor.Type.RIGHT).f());
                        }
                        z11 = true;
                    } else {
                        z11 = a4;
                    }
                    if (x5 != x4) {
                        constraintWidget2.L0(x5);
                        if (z8 && constraintWidget2.r() > max2) {
                            max2 = Math.max(max2, constraintWidget2.r() + constraintWidget2.o(ConstraintAnchor.Type.BOTTOM).f());
                        }
                        z11 = true;
                    }
                    z19 = z11 | ((h) constraintWidget2).F1();
                    i17 = 1;
                }
                i24 += i17;
                J12 = i16;
                i21 = i17;
                i23 = 2;
                d dVar4 = dVar;
            }
            int i25 = J12;
            int i26 = i23;
            int i27 = 0;
            while (i27 < i26) {
                int i28 = 0;
                while (i28 < size2) {
                    ConstraintWidget constraintWidget3 = (ConstraintWidget) bVar.f3994a.get(i28);
                    if ((!(constraintWidget3 instanceof C.a) || (constraintWidget3 instanceof h)) && !(constraintWidget3 instanceof f) && constraintWidget3.V() != 8 && ((!z18 || !constraintWidget3.f3918e.f3986e.f3978j || !constraintWidget3.f3920f.f3986e.f3978j) && !(constraintWidget3 instanceof h))) {
                        int W6 = constraintWidget3.W();
                        int x6 = constraintWidget3.x();
                        int p4 = constraintWidget3.p();
                        int i29 = a.f3998l;
                        z9 = z18;
                        if (i27 == 1) {
                            i29 = a.f3999m;
                        }
                        int W7 = constraintWidget3.W();
                        boolean a5 = z19 | bVar.a(I12, constraintWidget3, i29);
                        int x7 = constraintWidget3.x();
                        if (W7 != W6) {
                            constraintWidget3.k1(W7);
                            if (z7 && constraintWidget3.M() > max) {
                                max = Math.max(max, constraintWidget3.M() + constraintWidget3.o(ConstraintAnchor.Type.RIGHT).f());
                            }
                            z10 = true;
                        } else {
                            z10 = a5;
                        }
                        if (x7 != x6) {
                            constraintWidget3.L0(x7);
                            if (z8 && constraintWidget3.r() > max2) {
                                max2 = Math.max(max2, constraintWidget3.r() + constraintWidget3.o(ConstraintAnchor.Type.BOTTOM).f());
                            }
                            z10 = true;
                        }
                        if (!constraintWidget3.Z() || p4 == constraintWidget3.p()) {
                            z19 = z10;
                        } else {
                            i15 = 1;
                            z19 = 1;
                            i28 += i15;
                            bVar = this;
                            z18 = z9;
                        }
                    } else {
                        z9 = z18;
                    }
                    i15 = 1;
                    i28 += i15;
                    bVar = this;
                    z18 = z9;
                }
                boolean z20 = z18;
                if (z19 == 0) {
                    break;
                }
                i27++;
                c(dVar, "intermediate pass", i27, W3, x3);
                i26 = 2;
                z19 = 0;
                bVar = this;
                z18 = z20;
            }
            dVar2 = dVar;
            i14 = i25;
        } else {
            dVar2 = dVar;
            i14 = J12;
        }
        dVar2.W1(i14);
        return 0;
    }

    public void e(d dVar) {
        this.f3994a.clear();
        int size = dVar.f219L0.size();
        for (int i4 = 0; i4 < size; i4++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) dVar.f219L0.get(i4);
            ConstraintWidget.DimensionBehaviour A3 = constraintWidget.A();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (A3 == dimensionBehaviour || constraintWidget.T() == dimensionBehaviour) {
                this.f3994a.add(constraintWidget);
            }
        }
        dVar.M1();
    }
}
