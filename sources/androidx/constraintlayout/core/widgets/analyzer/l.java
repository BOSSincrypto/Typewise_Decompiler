package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

public class l extends WidgetRun {

    /* renamed from: k  reason: collision with root package name */
    public DependencyNode f4035k;

    /* renamed from: l  reason: collision with root package name */
    e f4036l = null;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f4037a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType[] r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4037a = r0
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4037a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4037a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.l.a.<clinit>():void");
        }
    }

    public l(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.f4035k = dependencyNode;
        this.f3989h.f3973e = DependencyNode.Type.TOP;
        this.f3990i.f3973e = DependencyNode.Type.BOTTOM;
        dependencyNode.f3973e = DependencyNode.Type.BASELINE;
        this.f3987f = 1;
    }

    public void a(D.a aVar) {
        int i4;
        float f4;
        float v3;
        float f5;
        int i5 = a.f4037a[this.f3991j.ordinal()];
        if (i5 == 1) {
            p(aVar);
        } else if (i5 == 2) {
            o(aVar);
        } else if (i5 == 3) {
            ConstraintWidget constraintWidget = this.f3983b;
            n(aVar, constraintWidget.f3899P, constraintWidget.f3901R, 1);
            return;
        }
        e eVar = this.f3986e;
        if (eVar.f3971c && !eVar.f3978j && this.f3985d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.f3983b;
            int i6 = constraintWidget2.f3956x;
            if (i6 == 2) {
                ConstraintWidget K3 = constraintWidget2.K();
                if (K3 != null) {
                    e eVar2 = K3.f3920f.f3986e;
                    if (eVar2.f3978j) {
                        this.f3986e.d((int) ((((float) eVar2.f3975g) * this.f3983b.f3882E) + 0.5f));
                    }
                }
            } else if (i6 == 3 && constraintWidget2.f3918e.f3986e.f3978j) {
                int w3 = constraintWidget2.w();
                if (w3 == -1) {
                    ConstraintWidget constraintWidget3 = this.f3983b;
                    f4 = (float) constraintWidget3.f3918e.f3986e.f3975g;
                    v3 = constraintWidget3.v();
                } else if (w3 == 0) {
                    ConstraintWidget constraintWidget4 = this.f3983b;
                    f5 = ((float) constraintWidget4.f3918e.f3986e.f3975g) * constraintWidget4.v();
                    i4 = (int) (f5 + 0.5f);
                    this.f3986e.d(i4);
                } else if (w3 != 1) {
                    i4 = 0;
                    this.f3986e.d(i4);
                } else {
                    ConstraintWidget constraintWidget5 = this.f3983b;
                    f4 = (float) constraintWidget5.f3918e.f3986e.f3975g;
                    v3 = constraintWidget5.v();
                }
                f5 = f4 / v3;
                i4 = (int) (f5 + 0.5f);
                this.f3986e.d(i4);
            }
        }
        DependencyNode dependencyNode = this.f3989h;
        if (dependencyNode.f3971c) {
            DependencyNode dependencyNode2 = this.f3990i;
            if (dependencyNode2.f3971c) {
                if (!dependencyNode.f3978j || !dependencyNode2.f3978j || !this.f3986e.f3978j) {
                    if (!this.f3986e.f3978j && this.f3985d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        ConstraintWidget constraintWidget6 = this.f3983b;
                        if (constraintWidget6.f3954w == 0 && !constraintWidget6.k0()) {
                            int i7 = ((DependencyNode) this.f3989h.f3980l.get(0)).f3975g;
                            DependencyNode dependencyNode3 = this.f3989h;
                            int i8 = i7 + dependencyNode3.f3974f;
                            int i9 = ((DependencyNode) this.f3990i.f3980l.get(0)).f3975g + this.f3990i.f3974f;
                            dependencyNode3.d(i8);
                            this.f3990i.d(i9);
                            this.f3986e.d(i9 - i8);
                            return;
                        }
                    }
                    if (!this.f3986e.f3978j && this.f3985d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f3982a == 1 && this.f3989h.f3980l.size() > 0 && this.f3990i.f3980l.size() > 0) {
                        int i10 = (((DependencyNode) this.f3990i.f3980l.get(0)).f3975g + this.f3990i.f3974f) - (((DependencyNode) this.f3989h.f3980l.get(0)).f3975g + this.f3989h.f3974f);
                        e eVar3 = this.f3986e;
                        int i11 = eVar3.f4021m;
                        if (i10 < i11) {
                            eVar3.d(i10);
                        } else {
                            eVar3.d(i11);
                        }
                    }
                    if (this.f3986e.f3978j && this.f3989h.f3980l.size() > 0 && this.f3990i.f3980l.size() > 0) {
                        DependencyNode dependencyNode4 = (DependencyNode) this.f3989h.f3980l.get(0);
                        DependencyNode dependencyNode5 = (DependencyNode) this.f3990i.f3980l.get(0);
                        int i12 = dependencyNode4.f3975g + this.f3989h.f3974f;
                        int i13 = dependencyNode5.f3975g + this.f3990i.f3974f;
                        float R3 = this.f3983b.R();
                        if (dependencyNode4 == dependencyNode5) {
                            i12 = dependencyNode4.f3975g;
                            i13 = dependencyNode5.f3975g;
                            R3 = 0.5f;
                        }
                        this.f3989h.d((int) (((float) i12) + 0.5f + (((float) ((i13 - i12) - this.f3986e.f3975g)) * R3)));
                        this.f3990i.d(this.f3989h.f3975g + this.f3986e.f3975g);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        ConstraintWidget K3;
        ConstraintWidget K4;
        ConstraintWidget constraintWidget = this.f3983b;
        if (constraintWidget.f3910a) {
            this.f3986e.d(constraintWidget.x());
        }
        if (!this.f3986e.f3978j) {
            this.f3985d = this.f3983b.T();
            if (this.f3983b.Z()) {
                this.f4036l = new a(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f3985d;
            if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (K4 = this.f3983b.K()) != null && K4.T() == ConstraintWidget.DimensionBehaviour.FIXED) {
                    int x3 = (K4.x() - this.f3983b.f3899P.f()) - this.f3983b.f3901R.f();
                    b(this.f3989h, K4.f3920f.f3989h, this.f3983b.f3899P.f());
                    b(this.f3990i, K4.f3920f.f3990i, -this.f3983b.f3901R.f());
                    this.f3986e.d(x3);
                    return;
                } else if (this.f3985d == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.f3986e.d(this.f3983b.x());
                }
            }
        } else if (this.f3985d == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (K3 = this.f3983b.K()) != null && K3.T() == ConstraintWidget.DimensionBehaviour.FIXED) {
            b(this.f3989h, K3.f3920f.f3989h, this.f3983b.f3899P.f());
            b(this.f3990i, K3.f3920f.f3990i, -this.f3983b.f3901R.f());
            return;
        }
        e eVar = this.f3986e;
        boolean z3 = eVar.f3978j;
        if (z3) {
            ConstraintWidget constraintWidget2 = this.f3983b;
            if (constraintWidget2.f3910a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.f3906W;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[2];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f3867f;
                if (constraintAnchor2 != null && constraintAnchorArr[3].f3867f != null) {
                    if (constraintWidget2.k0()) {
                        this.f3989h.f3974f = this.f3983b.f3906W[2].f();
                        this.f3990i.f3974f = -this.f3983b.f3906W[3].f();
                    } else {
                        DependencyNode h4 = h(this.f3983b.f3906W[2]);
                        if (h4 != null) {
                            b(this.f3989h, h4, this.f3983b.f3906W[2].f());
                        }
                        DependencyNode h5 = h(this.f3983b.f3906W[3]);
                        if (h5 != null) {
                            b(this.f3990i, h5, -this.f3983b.f3906W[3].f());
                        }
                        this.f3989h.f3970b = true;
                        this.f3990i.f3970b = true;
                    }
                    if (this.f3983b.Z()) {
                        b(this.f4035k, this.f3989h, this.f3983b.p());
                        return;
                    }
                    return;
                } else if (constraintAnchor2 != null) {
                    DependencyNode h6 = h(constraintAnchor);
                    if (h6 != null) {
                        b(this.f3989h, h6, this.f3983b.f3906W[2].f());
                        b(this.f3990i, this.f3989h, this.f3986e.f3975g);
                        if (this.f3983b.Z()) {
                            b(this.f4035k, this.f3989h, this.f3983b.p());
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    ConstraintAnchor constraintAnchor3 = constraintAnchorArr[3];
                    if (constraintAnchor3.f3867f != null) {
                        DependencyNode h7 = h(constraintAnchor3);
                        if (h7 != null) {
                            b(this.f3990i, h7, -this.f3983b.f3906W[3].f());
                            b(this.f3989h, this.f3990i, -this.f3986e.f3975g);
                        }
                        if (this.f3983b.Z()) {
                            b(this.f4035k, this.f3989h, this.f3983b.p());
                            return;
                        }
                        return;
                    }
                    ConstraintAnchor constraintAnchor4 = constraintAnchorArr[4];
                    if (constraintAnchor4.f3867f != null) {
                        DependencyNode h8 = h(constraintAnchor4);
                        if (h8 != null) {
                            b(this.f4035k, h8, 0);
                            b(this.f3989h, this.f4035k, -this.f3983b.p());
                            b(this.f3990i, this.f3989h, this.f3986e.f3975g);
                            return;
                        }
                        return;
                    } else if (!(constraintWidget2 instanceof C.a) && constraintWidget2.K() != null && this.f3983b.o(ConstraintAnchor.Type.CENTER).f3867f == null) {
                        b(this.f3989h, this.f3983b.K().f3920f.f3989h, this.f3983b.Y());
                        b(this.f3990i, this.f3989h, this.f3986e.f3975g);
                        if (this.f3983b.Z()) {
                            b(this.f4035k, this.f3989h, this.f3983b.p());
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (z3 || this.f3985d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            eVar.b(this);
        } else {
            ConstraintWidget constraintWidget3 = this.f3983b;
            int i4 = constraintWidget3.f3956x;
            if (i4 == 2) {
                ConstraintWidget K5 = constraintWidget3.K();
                if (K5 != null) {
                    e eVar2 = K5.f3920f.f3986e;
                    this.f3986e.f3980l.add(eVar2);
                    eVar2.f3979k.add(this.f3986e);
                    e eVar3 = this.f3986e;
                    eVar3.f3970b = true;
                    eVar3.f3979k.add(this.f3989h);
                    this.f3986e.f3979k.add(this.f3990i);
                }
            } else if (i4 == 3 && !constraintWidget3.k0()) {
                ConstraintWidget constraintWidget4 = this.f3983b;
                if (constraintWidget4.f3954w != 3) {
                    e eVar4 = constraintWidget4.f3918e.f3986e;
                    this.f3986e.f3980l.add(eVar4);
                    eVar4.f3979k.add(this.f3986e);
                    e eVar5 = this.f3986e;
                    eVar5.f3970b = true;
                    eVar5.f3979k.add(this.f3989h);
                    this.f3986e.f3979k.add(this.f3990i);
                }
            }
        }
        ConstraintWidget constraintWidget5 = this.f3983b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget5.f3906W;
        ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[2];
        ConstraintAnchor constraintAnchor6 = constraintAnchor5.f3867f;
        if (constraintAnchor6 != null && constraintAnchorArr2[3].f3867f != null) {
            if (constraintWidget5.k0()) {
                this.f3989h.f3974f = this.f3983b.f3906W[2].f();
                this.f3990i.f3974f = -this.f3983b.f3906W[3].f();
            } else {
                DependencyNode h9 = h(this.f3983b.f3906W[2]);
                DependencyNode h10 = h(this.f3983b.f3906W[3]);
                if (h9 != null) {
                    h9.b(this);
                }
                if (h10 != null) {
                    h10.b(this);
                }
                this.f3991j = WidgetRun.RunType.CENTER;
            }
            if (this.f3983b.Z()) {
                c(this.f4035k, this.f3989h, 1, this.f4036l);
            }
        } else if (constraintAnchor6 != null) {
            DependencyNode h11 = h(constraintAnchor5);
            if (h11 != null) {
                b(this.f3989h, h11, this.f3983b.f3906W[2].f());
                c(this.f3990i, this.f3989h, 1, this.f3986e);
                if (this.f3983b.Z()) {
                    c(this.f4035k, this.f3989h, 1, this.f4036l);
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.f3985d;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour2 == dimensionBehaviour3 && this.f3983b.v() > 0.0f) {
                    j jVar = this.f3983b.f3918e;
                    if (jVar.f3985d == dimensionBehaviour3) {
                        jVar.f3986e.f3979k.add(this.f3986e);
                        this.f3986e.f3980l.add(this.f3983b.f3918e.f3986e);
                        this.f3986e.f3969a = this;
                    }
                }
            }
        } else {
            ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[3];
            if (constraintAnchor7.f3867f != null) {
                DependencyNode h12 = h(constraintAnchor7);
                if (h12 != null) {
                    b(this.f3990i, h12, -this.f3983b.f3906W[3].f());
                    c(this.f3989h, this.f3990i, -1, this.f3986e);
                    if (this.f3983b.Z()) {
                        c(this.f4035k, this.f3989h, 1, this.f4036l);
                    }
                }
            } else {
                ConstraintAnchor constraintAnchor8 = constraintAnchorArr2[4];
                if (constraintAnchor8.f3867f != null) {
                    DependencyNode h13 = h(constraintAnchor8);
                    if (h13 != null) {
                        b(this.f4035k, h13, 0);
                        c(this.f3989h, this.f4035k, -1, this.f4036l);
                        c(this.f3990i, this.f3989h, 1, this.f3986e);
                    }
                } else if (!(constraintWidget5 instanceof C.a) && constraintWidget5.K() != null) {
                    b(this.f3989h, this.f3983b.K().f3920f.f3989h, this.f3983b.Y());
                    c(this.f3990i, this.f3989h, 1, this.f3986e);
                    if (this.f3983b.Z()) {
                        c(this.f4035k, this.f3989h, 1, this.f4036l);
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.f3985d;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour4 == dimensionBehaviour5 && this.f3983b.v() > 0.0f) {
                        j jVar2 = this.f3983b.f3918e;
                        if (jVar2.f3985d == dimensionBehaviour5) {
                            jVar2.f3986e.f3979k.add(this.f3986e);
                            this.f3986e.f3980l.add(this.f3983b.f3918e.f3986e);
                            this.f3986e.f3969a = this;
                        }
                    }
                }
            }
        }
        if (this.f3986e.f3980l.size() == 0) {
            this.f3986e.f3971c = true;
        }
    }

    public void e() {
        DependencyNode dependencyNode = this.f3989h;
        if (dependencyNode.f3978j) {
            this.f3983b.n1(dependencyNode.f3975g);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f3984c = null;
        this.f3989h.c();
        this.f3990i.c();
        this.f4035k.c();
        this.f3986e.c();
        this.f3988g = false;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        if (this.f3985d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f3983b.f3956x == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.f3988g = false;
        this.f3989h.c();
        this.f3989h.f3978j = false;
        this.f3990i.c();
        this.f3990i.f3978j = false;
        this.f4035k.c();
        this.f4035k.f3978j = false;
        this.f3986e.f3978j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f3983b.t();
    }
}
