package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.d;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

public class f extends ConstraintWidget {

    /* renamed from: L0  reason: collision with root package name */
    protected float f4148L0 = -1.0f;

    /* renamed from: M0  reason: collision with root package name */
    protected int f4149M0 = -1;

    /* renamed from: N0  reason: collision with root package name */
    protected int f4150N0 = -1;

    /* renamed from: O0  reason: collision with root package name */
    protected boolean f4151O0 = true;

    /* renamed from: P0  reason: collision with root package name */
    private ConstraintAnchor f4152P0 = this.f3899P;

    /* renamed from: Q0  reason: collision with root package name */
    private int f4153Q0;

    /* renamed from: R0  reason: collision with root package name */
    private int f4154R0;

    /* renamed from: S0  reason: collision with root package name */
    private boolean f4155S0;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f4156a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4156a = r0
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4156a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4156a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4156a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f4156a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f4156a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f4156a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f4156a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f4156a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.f.a.<clinit>():void");
        }
    }

    public f() {
        this.f4153Q0 = 0;
        this.f4154R0 = 0;
        this.f3907X.clear();
        this.f3907X.add(this.f4152P0);
        int length = this.f3906W.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.f3906W[i4] = this.f4152P0;
        }
    }

    public void A1(int i4) {
        if (this.f4153Q0 != i4) {
            this.f4153Q0 = i4;
            this.f3907X.clear();
            if (this.f4153Q0 == 1) {
                this.f4152P0 = this.f3898O;
            } else {
                this.f4152P0 = this.f3899P;
            }
            this.f3907X.add(this.f4152P0);
            int length = this.f3906W.length;
            for (int i5 = 0; i5 < length; i5++) {
                this.f3906W[i5] = this.f4152P0;
            }
        }
    }

    public void g(d dVar, boolean z3) {
        boolean z4;
        d dVar2 = (d) K();
        if (dVar2 != null) {
            ConstraintAnchor o4 = dVar2.o(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor o5 = dVar2.o(ConstraintAnchor.Type.RIGHT);
            ConstraintWidget constraintWidget = this.f3911a0;
            boolean z5 = true;
            if (constraintWidget == null || constraintWidget.f3909Z[0] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (this.f4153Q0 == 0) {
                o4 = dVar2.o(ConstraintAnchor.Type.TOP);
                o5 = dVar2.o(ConstraintAnchor.Type.BOTTOM);
                ConstraintWidget constraintWidget2 = this.f3911a0;
                if (constraintWidget2 == null || constraintWidget2.f3909Z[1] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    z5 = false;
                }
                z4 = z5;
            }
            if (this.f4155S0 && this.f4152P0.n()) {
                SolverVariable q4 = dVar.q(this.f4152P0);
                dVar.f(q4, this.f4152P0.e());
                if (this.f4149M0 != -1) {
                    if (z4) {
                        dVar.h(dVar.q(o5), q4, 0, 5);
                    }
                } else if (this.f4150N0 != -1 && z4) {
                    SolverVariable q5 = dVar.q(o5);
                    dVar.h(q4, dVar.q(o4), 0, 5);
                    dVar.h(q5, q4, 0, 5);
                }
                this.f4155S0 = false;
            } else if (this.f4149M0 != -1) {
                SolverVariable q6 = dVar.q(this.f4152P0);
                dVar.e(q6, dVar.q(o4), this.f4149M0, 8);
                if (z4) {
                    dVar.h(dVar.q(o5), q6, 0, 5);
                }
            } else if (this.f4150N0 != -1) {
                SolverVariable q7 = dVar.q(this.f4152P0);
                SolverVariable q8 = dVar.q(o5);
                dVar.e(q7, q8, -this.f4150N0, 8);
                if (z4) {
                    dVar.h(q7, dVar.q(o4), 0, 5);
                    dVar.h(q8, q7, 0, 5);
                }
            } else if (this.f4148L0 != -1.0f) {
                dVar.d(d.s(dVar, dVar.q(this.f4152P0), dVar.q(o5), this.f4148L0));
            }
        }
    }

    public boolean h() {
        return true;
    }

    public boolean n0() {
        return this.f4155S0;
    }

    public ConstraintAnchor o(ConstraintAnchor.Type type) {
        int i4 = a.f4156a[type.ordinal()];
        if (i4 == 1 || i4 == 2) {
            if (this.f4153Q0 == 1) {
                return this.f4152P0;
            }
            return null;
        } else if ((i4 == 3 || i4 == 4) && this.f4153Q0 == 0) {
            return this.f4152P0;
        } else {
            return null;
        }
    }

    public boolean o0() {
        return this.f4155S0;
    }

    public void q1(d dVar, boolean z3) {
        if (K() != null) {
            int x3 = dVar.x(this.f4152P0);
            if (this.f4153Q0 == 1) {
                m1(x3);
                n1(0);
                L0(K().x());
                k1(0);
                return;
            }
            m1(0);
            n1(x3);
            k1(K().W());
            L0(0);
        }
    }

    public ConstraintAnchor r1() {
        return this.f4152P0;
    }

    public int s1() {
        return this.f4153Q0;
    }

    public int t1() {
        return this.f4149M0;
    }

    public int u1() {
        return this.f4150N0;
    }

    public float v1() {
        return this.f4148L0;
    }

    public void w1(int i4) {
        this.f4152P0.t(i4);
        this.f4155S0 = true;
    }

    public void x1(int i4) {
        if (i4 > -1) {
            this.f4148L0 = -1.0f;
            this.f4149M0 = i4;
            this.f4150N0 = -1;
        }
    }

    public void y1(int i4) {
        if (i4 > -1) {
            this.f4148L0 = -1.0f;
            this.f4149M0 = -1;
            this.f4150N0 = i4;
        }
    }

    public void z1(float f4) {
        if (f4 > -1.0f) {
            this.f4148L0 = f4;
            this.f4149M0 = -1;
            this.f4150N0 = -1;
        }
    }
}
