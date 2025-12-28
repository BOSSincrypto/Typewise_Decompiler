package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.a;
import androidx.constraintlayout.core.widgets.analyzer.b;
import androidx.constraintlayout.core.widgets.d;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    private static b.a f4022a = new b.a();

    /* renamed from: b  reason: collision with root package name */
    private static int f4023b = 0;

    /* renamed from: c  reason: collision with root package name */
    private static int f4024c = 0;

    private static boolean a(int i4, ConstraintWidget constraintWidget) {
        d dVar;
        boolean z3;
        boolean z4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour A3 = constraintWidget.A();
        ConstraintWidget.DimensionBehaviour T3 = constraintWidget.T();
        if (constraintWidget.K() != null) {
            dVar = (d) constraintWidget.K();
        } else {
            dVar = null;
        }
        if (dVar != null) {
            ConstraintWidget.DimensionBehaviour A4 = dVar.A();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (dVar != null) {
            ConstraintWidget.DimensionBehaviour T4 = dVar.T();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (A3 == dimensionBehaviour5 || constraintWidget.n0() || A3 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || ((A3 == (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.f3954w == 0 && constraintWidget.f3917d0 == 0.0f && constraintWidget.a0(0)) || (A3 == dimensionBehaviour2 && constraintWidget.f3954w == 1 && constraintWidget.d0(0, constraintWidget.W())))) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (T3 == dimensionBehaviour5 || constraintWidget.o0() || T3 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || ((T3 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.f3956x == 0 && constraintWidget.f3917d0 == 0.0f && constraintWidget.a0(1)) || (T3 == dimensionBehaviour && constraintWidget.f3956x == 1 && constraintWidget.d0(1, constraintWidget.x())))) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (constraintWidget.f3917d0 > 0.0f && (z3 || z4)) {
            return true;
        }
        if (!z3 || !z4) {
            return false;
        }
        return true;
    }

    private static void b(int i4, ConstraintWidget constraintWidget, b.C0061b bVar, boolean z3) {
        boolean z4;
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        boolean z5;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        ConstraintWidget constraintWidget2 = constraintWidget;
        b.C0061b bVar2 = bVar;
        boolean z6 = z3;
        if (!constraintWidget.g0()) {
            boolean z7 = true;
            f4023b++;
            if (!(constraintWidget2 instanceof d) && constraintWidget.m0()) {
                int i5 = i4 + 1;
                if (a(i5, constraintWidget2)) {
                    d.S1(i5, constraintWidget2, bVar2, new b.a(), b.a.f3997k);
                }
            }
            ConstraintAnchor o4 = constraintWidget2.o(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor o5 = constraintWidget2.o(ConstraintAnchor.Type.RIGHT);
            int e4 = o4.e();
            int e5 = o5.e();
            if (o4.d() != null && o4.n()) {
                Iterator it = o4.d().iterator();
                while (it.hasNext()) {
                    ConstraintAnchor constraintAnchor5 = (ConstraintAnchor) it.next();
                    ConstraintWidget constraintWidget3 = constraintAnchor5.f3865d;
                    int i6 = i4 + 1;
                    boolean a4 = a(i6, constraintWidget3);
                    if (constraintWidget3.m0() && a4) {
                        d.S1(i6, constraintWidget3, bVar2, new b.a(), b.a.f3997k);
                    }
                    if ((constraintAnchor5 != constraintWidget3.f3898O || (constraintAnchor4 = constraintWidget3.f3900Q.f3867f) == null || !constraintAnchor4.n()) && (constraintAnchor5 != constraintWidget3.f3900Q || (constraintAnchor3 = constraintWidget3.f3898O.f3867f) == null || !constraintAnchor3.n())) {
                        z5 = false;
                    } else {
                        z5 = z7;
                    }
                    ConstraintWidget.DimensionBehaviour A3 = constraintWidget3.A();
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (A3 != dimensionBehaviour || a4) {
                        if (!constraintWidget3.m0()) {
                            ConstraintAnchor constraintAnchor6 = constraintWidget3.f3898O;
                            if (constraintAnchor5 == constraintAnchor6 && constraintWidget3.f3900Q.f3867f == null) {
                                int f4 = constraintAnchor6.f() + e4;
                                constraintWidget3.F0(f4, constraintWidget3.W() + f4);
                                b(i6, constraintWidget3, bVar2, z6);
                            } else {
                                ConstraintAnchor constraintAnchor7 = constraintWidget3.f3900Q;
                                if (constraintAnchor5 == constraintAnchor7 && constraintAnchor6.f3867f == null) {
                                    int f5 = e4 - constraintAnchor7.f();
                                    constraintWidget3.F0(f5 - constraintWidget3.W(), f5);
                                    b(i6, constraintWidget3, bVar2, z6);
                                } else if (z5 && !constraintWidget3.i0()) {
                                    d(i6, bVar2, constraintWidget3, z6);
                                }
                            }
                        }
                    } else if (constraintWidget3.A() == dimensionBehaviour && constraintWidget3.f3874A >= 0 && constraintWidget3.f3960z >= 0 && ((constraintWidget3.V() == 8 || (constraintWidget3.f3954w == 0 && constraintWidget3.v() == 0.0f)) && !constraintWidget3.i0() && !constraintWidget3.l0() && z5 && !constraintWidget3.i0())) {
                        e(i6, constraintWidget2, bVar2, constraintWidget3, z6);
                    }
                    z7 = true;
                }
            }
            if (!(constraintWidget2 instanceof androidx.constraintlayout.core.widgets.f)) {
                if (o5.d() != null && o5.n()) {
                    Iterator it2 = o5.d().iterator();
                    while (it2.hasNext()) {
                        ConstraintAnchor constraintAnchor8 = (ConstraintAnchor) it2.next();
                        ConstraintWidget constraintWidget4 = constraintAnchor8.f3865d;
                        int i7 = i4 + 1;
                        boolean a5 = a(i7, constraintWidget4);
                        if (constraintWidget4.m0() && a5) {
                            d.S1(i7, constraintWidget4, bVar2, new b.a(), b.a.f3997k);
                        }
                        if ((constraintAnchor8 != constraintWidget4.f3898O || (constraintAnchor2 = constraintWidget4.f3900Q.f3867f) == null || !constraintAnchor2.n()) && (constraintAnchor8 != constraintWidget4.f3900Q || (constraintAnchor = constraintWidget4.f3898O.f3867f) == null || !constraintAnchor.n())) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        ConstraintWidget.DimensionBehaviour A4 = constraintWidget4.A();
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (A4 != dimensionBehaviour2 || a5) {
                            if (!constraintWidget4.m0()) {
                                ConstraintAnchor constraintAnchor9 = constraintWidget4.f3898O;
                                if (constraintAnchor8 == constraintAnchor9 && constraintWidget4.f3900Q.f3867f == null) {
                                    int f6 = constraintAnchor9.f() + e5;
                                    constraintWidget4.F0(f6, constraintWidget4.W() + f6);
                                    b(i7, constraintWidget4, bVar2, z6);
                                } else {
                                    ConstraintAnchor constraintAnchor10 = constraintWidget4.f3900Q;
                                    if (constraintAnchor8 == constraintAnchor10 && constraintAnchor9.f3867f == null) {
                                        int f7 = e5 - constraintAnchor10.f();
                                        constraintWidget4.F0(f7 - constraintWidget4.W(), f7);
                                        b(i7, constraintWidget4, bVar2, z6);
                                    } else if (z4 && !constraintWidget4.i0()) {
                                        d(i7, bVar2, constraintWidget4, z6);
                                    }
                                }
                            }
                        } else if (constraintWidget4.A() == dimensionBehaviour2 && constraintWidget4.f3874A >= 0 && constraintWidget4.f3960z >= 0) {
                            if ((constraintWidget4.V() == 8 || (constraintWidget4.f3954w == 0 && constraintWidget4.v() == 0.0f)) && !constraintWidget4.i0() && !constraintWidget4.l0() && z4 && !constraintWidget4.i0()) {
                                e(i7, constraintWidget2, bVar2, constraintWidget4, z6);
                            }
                        }
                    }
                }
                constraintWidget.q0();
            }
        }
    }

    private static void c(int i4, a aVar, b.C0061b bVar, int i5, boolean z3) {
        if (!aVar.t1()) {
            return;
        }
        if (i5 == 0) {
            b(i4 + 1, aVar, bVar, z3);
        } else {
            i(i4 + 1, aVar, bVar);
        }
    }

    private static void d(int i4, b.C0061b bVar, ConstraintWidget constraintWidget, boolean z3) {
        float f4;
        float y3 = constraintWidget.y();
        int e4 = constraintWidget.f3898O.f3867f.e();
        int e5 = constraintWidget.f3900Q.f3867f.e();
        int f5 = constraintWidget.f3898O.f() + e4;
        int f6 = e5 - constraintWidget.f3900Q.f();
        if (e4 == e5) {
            y3 = 0.5f;
        } else {
            e4 = f5;
            e5 = f6;
        }
        int W3 = constraintWidget.W();
        int i5 = (e5 - e4) - W3;
        if (e4 > e5) {
            i5 = (e4 - e5) - W3;
        }
        if (i5 > 0) {
            f4 = (y3 * ((float) i5)) + 0.5f;
        } else {
            f4 = y3 * ((float) i5);
        }
        int i6 = ((int) f4) + e4;
        int i7 = i6 + W3;
        if (e4 > e5) {
            i7 = i6 - W3;
        }
        constraintWidget.F0(i6, i7);
        b(i4 + 1, constraintWidget, bVar, z3);
    }

    private static void e(int i4, ConstraintWidget constraintWidget, b.C0061b bVar, ConstraintWidget constraintWidget2, boolean z3) {
        int i5;
        float y3 = constraintWidget2.y();
        int e4 = constraintWidget2.f3898O.f3867f.e() + constraintWidget2.f3898O.f();
        int e5 = constraintWidget2.f3900Q.f3867f.e() - constraintWidget2.f3900Q.f();
        if (e5 >= e4) {
            int W3 = constraintWidget2.W();
            if (constraintWidget2.V() != 8) {
                int i6 = constraintWidget2.f3954w;
                if (i6 == 2) {
                    if (constraintWidget instanceof d) {
                        i5 = constraintWidget.W();
                    } else {
                        i5 = constraintWidget.K().W();
                    }
                    W3 = (int) (constraintWidget2.y() * 0.5f * ((float) i5));
                } else if (i6 == 0) {
                    W3 = e5 - e4;
                }
                W3 = Math.max(constraintWidget2.f3960z, W3);
                int i7 = constraintWidget2.f3874A;
                if (i7 > 0) {
                    W3 = Math.min(i7, W3);
                }
            }
            int i8 = e4 + ((int) ((y3 * ((float) ((e5 - e4) - W3))) + 0.5f));
            constraintWidget2.F0(i8, W3 + i8);
            b(i4 + 1, constraintWidget2, bVar, z3);
        }
    }

    private static void f(int i4, b.C0061b bVar, ConstraintWidget constraintWidget) {
        float f4;
        float R3 = constraintWidget.R();
        int e4 = constraintWidget.f3899P.f3867f.e();
        int e5 = constraintWidget.f3901R.f3867f.e();
        int f5 = constraintWidget.f3899P.f() + e4;
        int f6 = e5 - constraintWidget.f3901R.f();
        if (e4 == e5) {
            R3 = 0.5f;
        } else {
            e4 = f5;
            e5 = f6;
        }
        int x3 = constraintWidget.x();
        int i5 = (e5 - e4) - x3;
        if (e4 > e5) {
            i5 = (e4 - e5) - x3;
        }
        if (i5 > 0) {
            f4 = (R3 * ((float) i5)) + 0.5f;
        } else {
            f4 = R3 * ((float) i5);
        }
        int i6 = (int) f4;
        int i7 = e4 + i6;
        int i8 = i7 + x3;
        if (e4 > e5) {
            i7 = e4 - i6;
            i8 = i7 - x3;
        }
        constraintWidget.I0(i7, i8);
        i(i4 + 1, constraintWidget, bVar);
    }

    private static void g(int i4, ConstraintWidget constraintWidget, b.C0061b bVar, ConstraintWidget constraintWidget2) {
        int i5;
        float R3 = constraintWidget2.R();
        int e4 = constraintWidget2.f3899P.f3867f.e() + constraintWidget2.f3899P.f();
        int e5 = constraintWidget2.f3901R.f3867f.e() - constraintWidget2.f3901R.f();
        if (e5 >= e4) {
            int x3 = constraintWidget2.x();
            if (constraintWidget2.V() != 8) {
                int i6 = constraintWidget2.f3956x;
                if (i6 == 2) {
                    if (constraintWidget instanceof d) {
                        i5 = constraintWidget.x();
                    } else {
                        i5 = constraintWidget.K().x();
                    }
                    x3 = (int) (R3 * 0.5f * ((float) i5));
                } else if (i6 == 0) {
                    x3 = e5 - e4;
                }
                x3 = Math.max(constraintWidget2.f3878C, x3);
                int i7 = constraintWidget2.f3880D;
                if (i7 > 0) {
                    x3 = Math.min(i7, x3);
                }
            }
            int i8 = e4 + ((int) ((R3 * ((float) ((e5 - e4) - x3))) + 0.5f));
            constraintWidget2.I0(i8, x3 + i8);
            i(i4 + 1, constraintWidget2, bVar);
        }
    }

    public static void h(d dVar, b.C0061b bVar) {
        ConstraintWidget.DimensionBehaviour A3 = dVar.A();
        ConstraintWidget.DimensionBehaviour T3 = dVar.T();
        f4023b = 0;
        f4024c = 0;
        dVar.v0();
        ArrayList r12 = dVar.r1();
        int size = r12.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((ConstraintWidget) r12.get(i4)).v0();
        }
        boolean P12 = dVar.P1();
        if (A3 == ConstraintWidget.DimensionBehaviour.FIXED) {
            dVar.F0(0, dVar.W());
        } else {
            dVar.G0(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) r12.get(i5);
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
                androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) constraintWidget;
                if (fVar.s1() == 1) {
                    if (fVar.t1() != -1) {
                        fVar.w1(fVar.t1());
                    } else if (fVar.u1() != -1 && dVar.n0()) {
                        fVar.w1(dVar.W() - fVar.u1());
                    } else if (dVar.n0()) {
                        fVar.w1((int) ((fVar.v1() * ((float) dVar.W())) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((constraintWidget instanceof a) && ((a) constraintWidget).x1() == 0) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget) r12.get(i6);
                if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.f) {
                    androidx.constraintlayout.core.widgets.f fVar2 = (androidx.constraintlayout.core.widgets.f) constraintWidget2;
                    if (fVar2.s1() == 1) {
                        b(0, fVar2, bVar, P12);
                    }
                }
            }
        }
        b(0, dVar, bVar, P12);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                ConstraintWidget constraintWidget3 = (ConstraintWidget) r12.get(i7);
                if (constraintWidget3 instanceof a) {
                    a aVar = (a) constraintWidget3;
                    if (aVar.x1() == 0) {
                        c(0, aVar, bVar, 0, P12);
                    }
                }
            }
        }
        if (T3 == ConstraintWidget.DimensionBehaviour.FIXED) {
            dVar.I0(0, dVar.x());
        } else {
            dVar.H0(0);
        }
        boolean z5 = false;
        boolean z6 = false;
        for (int i8 = 0; i8 < size; i8++) {
            ConstraintWidget constraintWidget4 = (ConstraintWidget) r12.get(i8);
            if (constraintWidget4 instanceof androidx.constraintlayout.core.widgets.f) {
                androidx.constraintlayout.core.widgets.f fVar3 = (androidx.constraintlayout.core.widgets.f) constraintWidget4;
                if (fVar3.s1() == 0) {
                    if (fVar3.t1() != -1) {
                        fVar3.w1(fVar3.t1());
                    } else if (fVar3.u1() != -1 && dVar.o0()) {
                        fVar3.w1(dVar.x() - fVar3.u1());
                    } else if (dVar.o0()) {
                        fVar3.w1((int) ((fVar3.v1() * ((float) dVar.x())) + 0.5f));
                    }
                    z5 = true;
                }
            } else if ((constraintWidget4 instanceof a) && ((a) constraintWidget4).x1() == 1) {
                z6 = true;
            }
        }
        if (z5) {
            for (int i9 = 0; i9 < size; i9++) {
                ConstraintWidget constraintWidget5 = (ConstraintWidget) r12.get(i9);
                if (constraintWidget5 instanceof androidx.constraintlayout.core.widgets.f) {
                    androidx.constraintlayout.core.widgets.f fVar4 = (androidx.constraintlayout.core.widgets.f) constraintWidget5;
                    if (fVar4.s1() == 0) {
                        i(1, fVar4, bVar);
                    }
                }
            }
        }
        i(0, dVar, bVar);
        if (z6) {
            for (int i10 = 0; i10 < size; i10++) {
                ConstraintWidget constraintWidget6 = (ConstraintWidget) r12.get(i10);
                if (constraintWidget6 instanceof a) {
                    a aVar2 = (a) constraintWidget6;
                    if (aVar2.x1() == 1) {
                        c(0, aVar2, bVar, 1, P12);
                    }
                }
            }
        }
        for (int i11 = 0; i11 < size; i11++) {
            ConstraintWidget constraintWidget7 = (ConstraintWidget) r12.get(i11);
            if (constraintWidget7.m0() && a(0, constraintWidget7)) {
                d.S1(0, constraintWidget7, bVar, f4022a, b.a.f3997k);
                if (!(constraintWidget7 instanceof androidx.constraintlayout.core.widgets.f)) {
                    b(0, constraintWidget7, bVar, P12);
                    i(0, constraintWidget7, bVar);
                } else if (((androidx.constraintlayout.core.widgets.f) constraintWidget7).s1() == 0) {
                    i(0, constraintWidget7, bVar);
                } else {
                    b(0, constraintWidget7, bVar, P12);
                }
            }
        }
    }

    private static void i(int i4, ConstraintWidget constraintWidget, b.C0061b bVar) {
        boolean z3;
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        boolean z4;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        ConstraintWidget constraintWidget2 = constraintWidget;
        b.C0061b bVar2 = bVar;
        if (!constraintWidget.p0()) {
            f4024c++;
            if (!(constraintWidget2 instanceof d) && constraintWidget.m0()) {
                int i5 = i4 + 1;
                if (a(i5, constraintWidget2)) {
                    d.S1(i5, constraintWidget2, bVar2, new b.a(), b.a.f3997k);
                }
            }
            ConstraintAnchor o4 = constraintWidget2.o(ConstraintAnchor.Type.TOP);
            ConstraintAnchor o5 = constraintWidget2.o(ConstraintAnchor.Type.BOTTOM);
            int e4 = o4.e();
            int e5 = o5.e();
            if (o4.d() != null && o4.n()) {
                Iterator it = o4.d().iterator();
                while (it.hasNext()) {
                    ConstraintAnchor constraintAnchor5 = (ConstraintAnchor) it.next();
                    ConstraintWidget constraintWidget3 = constraintAnchor5.f3865d;
                    int i6 = i4 + 1;
                    boolean a4 = a(i6, constraintWidget3);
                    if (constraintWidget3.m0() && a4) {
                        d.S1(i6, constraintWidget3, bVar2, new b.a(), b.a.f3997k);
                    }
                    if ((constraintAnchor5 != constraintWidget3.f3899P || (constraintAnchor4 = constraintWidget3.f3901R.f3867f) == null || !constraintAnchor4.n()) && (constraintAnchor5 != constraintWidget3.f3901R || (constraintAnchor3 = constraintWidget3.f3899P.f3867f) == null || !constraintAnchor3.n())) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    ConstraintWidget.DimensionBehaviour T3 = constraintWidget3.T();
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (T3 != dimensionBehaviour || a4) {
                        if (!constraintWidget3.m0()) {
                            ConstraintAnchor constraintAnchor6 = constraintWidget3.f3899P;
                            if (constraintAnchor5 == constraintAnchor6 && constraintWidget3.f3901R.f3867f == null) {
                                int f4 = constraintAnchor6.f() + e4;
                                constraintWidget3.I0(f4, constraintWidget3.x() + f4);
                                i(i6, constraintWidget3, bVar2);
                            } else {
                                ConstraintAnchor constraintAnchor7 = constraintWidget3.f3901R;
                                if (constraintAnchor5 == constraintAnchor7 && constraintAnchor6.f3867f == null) {
                                    int f5 = e4 - constraintAnchor7.f();
                                    constraintWidget3.I0(f5 - constraintWidget3.x(), f5);
                                    i(i6, constraintWidget3, bVar2);
                                } else if (z4 && !constraintWidget3.k0()) {
                                    f(i6, bVar2, constraintWidget3);
                                }
                            }
                        }
                    } else if (constraintWidget3.T() == dimensionBehaviour && constraintWidget3.f3880D >= 0 && constraintWidget3.f3878C >= 0) {
                        if ((constraintWidget3.V() == 8 || (constraintWidget3.f3956x == 0 && constraintWidget3.v() == 0.0f)) && !constraintWidget3.k0() && !constraintWidget3.l0() && z4 && !constraintWidget3.k0()) {
                            g(i6, constraintWidget2, bVar2, constraintWidget3);
                        }
                    }
                }
            }
            if (!(constraintWidget2 instanceof androidx.constraintlayout.core.widgets.f)) {
                if (o5.d() != null && o5.n()) {
                    Iterator it2 = o5.d().iterator();
                    while (it2.hasNext()) {
                        ConstraintAnchor constraintAnchor8 = (ConstraintAnchor) it2.next();
                        ConstraintWidget constraintWidget4 = constraintAnchor8.f3865d;
                        int i7 = i4 + 1;
                        boolean a5 = a(i7, constraintWidget4);
                        if (constraintWidget4.m0() && a5) {
                            d.S1(i7, constraintWidget4, bVar2, new b.a(), b.a.f3997k);
                        }
                        if ((constraintAnchor8 != constraintWidget4.f3899P || (constraintAnchor2 = constraintWidget4.f3901R.f3867f) == null || !constraintAnchor2.n()) && (constraintAnchor8 != constraintWidget4.f3901R || (constraintAnchor = constraintWidget4.f3899P.f3867f) == null || !constraintAnchor.n())) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        ConstraintWidget.DimensionBehaviour T4 = constraintWidget4.T();
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (T4 != dimensionBehaviour2 || a5) {
                            if (!constraintWidget4.m0()) {
                                ConstraintAnchor constraintAnchor9 = constraintWidget4.f3899P;
                                if (constraintAnchor8 == constraintAnchor9 && constraintWidget4.f3901R.f3867f == null) {
                                    int f6 = constraintAnchor9.f() + e5;
                                    constraintWidget4.I0(f6, constraintWidget4.x() + f6);
                                    i(i7, constraintWidget4, bVar2);
                                } else {
                                    ConstraintAnchor constraintAnchor10 = constraintWidget4.f3901R;
                                    if (constraintAnchor8 == constraintAnchor10 && constraintAnchor9.f3867f == null) {
                                        int f7 = e5 - constraintAnchor10.f();
                                        constraintWidget4.I0(f7 - constraintWidget4.x(), f7);
                                        i(i7, constraintWidget4, bVar2);
                                    } else if (z3 && !constraintWidget4.k0()) {
                                        f(i7, bVar2, constraintWidget4);
                                    }
                                }
                            }
                        } else if (constraintWidget4.T() == dimensionBehaviour2 && constraintWidget4.f3880D >= 0 && constraintWidget4.f3878C >= 0) {
                            if ((constraintWidget4.V() == 8 || (constraintWidget4.f3956x == 0 && constraintWidget4.v() == 0.0f)) && !constraintWidget4.k0() && !constraintWidget4.l0() && z3 && !constraintWidget4.k0()) {
                                g(i7, constraintWidget2, bVar2, constraintWidget4);
                            }
                        }
                    }
                }
                ConstraintAnchor o6 = constraintWidget2.o(ConstraintAnchor.Type.BASELINE);
                if (o6.d() != null && o6.n()) {
                    int e6 = o6.e();
                    Iterator it3 = o6.d().iterator();
                    while (it3.hasNext()) {
                        ConstraintAnchor constraintAnchor11 = (ConstraintAnchor) it3.next();
                        ConstraintWidget constraintWidget5 = constraintAnchor11.f3865d;
                        int i8 = i4 + 1;
                        boolean a6 = a(i8, constraintWidget5);
                        if (constraintWidget5.m0() && a6) {
                            d.S1(i8, constraintWidget5, bVar2, new b.a(), b.a.f3997k);
                        }
                        if ((constraintWidget5.T() != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || a6) && !constraintWidget5.m0() && constraintAnchor11 == constraintWidget5.f3902S) {
                            constraintWidget5.E0(constraintAnchor11.f() + e6);
                            try {
                                i(i8, constraintWidget5, bVar2);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
                constraintWidget.r0();
            }
        }
    }
}
