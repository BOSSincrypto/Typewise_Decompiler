package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

public class c {

    /* renamed from: a  reason: collision with root package name */
    protected ConstraintWidget f4053a;

    /* renamed from: b  reason: collision with root package name */
    protected ConstraintWidget f4054b;

    /* renamed from: c  reason: collision with root package name */
    protected ConstraintWidget f4055c;

    /* renamed from: d  reason: collision with root package name */
    protected ConstraintWidget f4056d;

    /* renamed from: e  reason: collision with root package name */
    protected ConstraintWidget f4057e;

    /* renamed from: f  reason: collision with root package name */
    protected ConstraintWidget f4058f;

    /* renamed from: g  reason: collision with root package name */
    protected ConstraintWidget f4059g;

    /* renamed from: h  reason: collision with root package name */
    protected ArrayList f4060h;

    /* renamed from: i  reason: collision with root package name */
    protected int f4061i;

    /* renamed from: j  reason: collision with root package name */
    protected int f4062j;

    /* renamed from: k  reason: collision with root package name */
    protected float f4063k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    int f4064l;

    /* renamed from: m  reason: collision with root package name */
    int f4065m;

    /* renamed from: n  reason: collision with root package name */
    int f4066n;

    /* renamed from: o  reason: collision with root package name */
    boolean f4067o;

    /* renamed from: p  reason: collision with root package name */
    private int f4068p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f4069q;

    /* renamed from: r  reason: collision with root package name */
    protected boolean f4070r;

    /* renamed from: s  reason: collision with root package name */
    protected boolean f4071s;

    /* renamed from: t  reason: collision with root package name */
    protected boolean f4072t;

    /* renamed from: u  reason: collision with root package name */
    protected boolean f4073u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f4074v;

    public c(ConstraintWidget constraintWidget, int i4, boolean z3) {
        this.f4053a = constraintWidget;
        this.f4068p = i4;
        this.f4069q = z3;
    }

    private void b() {
        int i4 = this.f4068p * 2;
        ConstraintWidget constraintWidget = this.f4053a;
        boolean z3 = true;
        this.f4067o = true;
        ConstraintWidget constraintWidget2 = constraintWidget;
        boolean z4 = false;
        while (!z4) {
            this.f4061i++;
            ConstraintWidget[] constraintWidgetArr = constraintWidget.f3885F0;
            int i5 = this.f4068p;
            ConstraintWidget constraintWidget3 = null;
            constraintWidgetArr[i5] = null;
            constraintWidget.f3883E0[i5] = null;
            if (constraintWidget.V() != 8) {
                this.f4064l++;
                ConstraintWidget.DimensionBehaviour u3 = constraintWidget.u(this.f4068p);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (u3 != dimensionBehaviour) {
                    this.f4065m += constraintWidget.E(this.f4068p);
                }
                int f4 = this.f4065m + constraintWidget.f3906W[i4].f();
                this.f4065m = f4;
                int i6 = i4 + 1;
                this.f4065m = f4 + constraintWidget.f3906W[i6].f();
                int f5 = this.f4066n + constraintWidget.f3906W[i4].f();
                this.f4066n = f5;
                this.f4066n = f5 + constraintWidget.f3906W[i6].f();
                if (this.f4054b == null) {
                    this.f4054b = constraintWidget;
                }
                this.f4056d = constraintWidget;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f3909Z;
                int i7 = this.f4068p;
                if (dimensionBehaviourArr[i7] == dimensionBehaviour) {
                    int i8 = constraintWidget.f3958y[i7];
                    if (i8 == 0 || i8 == 3 || i8 == 2) {
                        this.f4062j++;
                        float f6 = constraintWidget.f3881D0[i7];
                        if (f6 > 0.0f) {
                            this.f4063k += f6;
                        }
                        if (c(constraintWidget, i7)) {
                            if (f6 < 0.0f) {
                                this.f4070r = true;
                            } else {
                                this.f4071s = true;
                            }
                            if (this.f4060h == null) {
                                this.f4060h = new ArrayList();
                            }
                            this.f4060h.add(constraintWidget);
                        }
                        if (this.f4058f == null) {
                            this.f4058f = constraintWidget;
                        }
                        ConstraintWidget constraintWidget4 = this.f4059g;
                        if (constraintWidget4 != null) {
                            constraintWidget4.f3883E0[this.f4068p] = constraintWidget;
                        }
                        this.f4059g = constraintWidget;
                    }
                    if (this.f4068p == 0) {
                        if (constraintWidget.f3954w != 0) {
                            this.f4067o = false;
                        } else if (!(constraintWidget.f3960z == 0 && constraintWidget.f3874A == 0)) {
                            this.f4067o = false;
                        }
                    } else if (constraintWidget.f3956x != 0) {
                        this.f4067o = false;
                    } else if (!(constraintWidget.f3878C == 0 && constraintWidget.f3880D == 0)) {
                        this.f4067o = false;
                    }
                    if (constraintWidget.f3917d0 != 0.0f) {
                        this.f4067o = false;
                        this.f4073u = true;
                    }
                }
            }
            if (constraintWidget2 != constraintWidget) {
                constraintWidget2.f3885F0[this.f4068p] = constraintWidget;
            }
            ConstraintAnchor constraintAnchor = constraintWidget.f3906W[i4 + 1].f3867f;
            if (constraintAnchor != null) {
                ConstraintWidget constraintWidget5 = constraintAnchor.f3865d;
                ConstraintAnchor constraintAnchor2 = constraintWidget5.f3906W[i4].f3867f;
                if (constraintAnchor2 != null && constraintAnchor2.f3865d == constraintWidget) {
                    constraintWidget3 = constraintWidget5;
                }
            }
            if (constraintWidget3 == null) {
                constraintWidget3 = constraintWidget;
                z4 = true;
            }
            constraintWidget2 = constraintWidget;
            constraintWidget = constraintWidget3;
        }
        ConstraintWidget constraintWidget6 = this.f4054b;
        if (constraintWidget6 != null) {
            this.f4065m -= constraintWidget6.f3906W[i4].f();
        }
        ConstraintWidget constraintWidget7 = this.f4056d;
        if (constraintWidget7 != null) {
            this.f4065m -= constraintWidget7.f3906W[i4 + 1].f();
        }
        this.f4055c = constraintWidget;
        if (this.f4068p != 0 || !this.f4069q) {
            this.f4057e = this.f4053a;
        } else {
            this.f4057e = constraintWidget;
        }
        if (!this.f4071s || !this.f4070r) {
            z3 = false;
        }
        this.f4072t = z3;
    }

    private static boolean c(ConstraintWidget constraintWidget, int i4) {
        int i5;
        if (constraintWidget.V() != 8 && constraintWidget.f3909Z[i4] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && ((i5 = constraintWidget.f3958y[i4]) == 0 || i5 == 3)) {
            return true;
        }
        return false;
    }

    public void a() {
        if (!this.f4074v) {
            b();
        }
        this.f4074v = true;
    }
}
