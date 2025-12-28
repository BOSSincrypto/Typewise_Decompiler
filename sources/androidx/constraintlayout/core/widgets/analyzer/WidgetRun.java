package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

public abstract class WidgetRun implements D.a {

    /* renamed from: a  reason: collision with root package name */
    public int f3982a;

    /* renamed from: b  reason: collision with root package name */
    ConstraintWidget f3983b;

    /* renamed from: c  reason: collision with root package name */
    k f3984c;

    /* renamed from: d  reason: collision with root package name */
    protected ConstraintWidget.DimensionBehaviour f3985d;

    /* renamed from: e  reason: collision with root package name */
    e f3986e = new e(this);

    /* renamed from: f  reason: collision with root package name */
    public int f3987f = 0;

    /* renamed from: g  reason: collision with root package name */
    boolean f3988g = false;

    /* renamed from: h  reason: collision with root package name */
    public DependencyNode f3989h = new DependencyNode(this);

    /* renamed from: i  reason: collision with root package name */
    public DependencyNode f3990i = new DependencyNode(this);

    /* renamed from: j  reason: collision with root package name */
    protected RunType f3991j = RunType.NONE;

    enum RunType {
        NONE,
        START,
        END,
        CENTER
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3993a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3993a = r0
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3993a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3993a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3993a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f3993a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.WidgetRun.a.<clinit>():void");
        }
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.f3983b = constraintWidget;
    }

    private void l(int i4, int i5) {
        WidgetRun widgetRun;
        float f4;
        int i6;
        int i7 = this.f3982a;
        if (i7 == 0) {
            this.f3986e.d(g(i5, i4));
        } else if (i7 == 1) {
            this.f3986e.d(Math.min(g(this.f3986e.f4021m, i4), i5));
        } else if (i7 == 2) {
            ConstraintWidget K3 = this.f3983b.K();
            if (K3 != null) {
                if (i4 == 0) {
                    widgetRun = K3.f3918e;
                } else {
                    widgetRun = K3.f3920f;
                }
                e eVar = widgetRun.f3986e;
                if (eVar.f3978j) {
                    ConstraintWidget constraintWidget = this.f3983b;
                    if (i4 == 0) {
                        f4 = constraintWidget.f3876B;
                    } else {
                        f4 = constraintWidget.f3882E;
                    }
                    this.f3986e.d(g((int) ((((float) eVar.f3975g) * f4) + 0.5f), i4));
                }
            }
        } else if (i7 == 3) {
            ConstraintWidget constraintWidget2 = this.f3983b;
            WidgetRun widgetRun2 = constraintWidget2.f3918e;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = widgetRun2.f3985d;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour == dimensionBehaviour2 && widgetRun2.f3982a == 3) {
                l lVar = constraintWidget2.f3920f;
                if (lVar.f3985d == dimensionBehaviour2 && lVar.f3982a == 3) {
                    return;
                }
            }
            if (i4 == 0) {
                widgetRun2 = constraintWidget2.f3920f;
            }
            if (widgetRun2.f3986e.f3978j) {
                float v3 = constraintWidget2.v();
                if (i4 == 1) {
                    i6 = (int) ((((float) widgetRun2.f3986e.f3975g) / v3) + 0.5f);
                } else {
                    i6 = (int) ((v3 * ((float) widgetRun2.f3986e.f3975g)) + 0.5f);
                }
                this.f3986e.d(i6);
            }
        }
    }

    public abstract void a(D.a aVar);

    /* access modifiers changed from: protected */
    public final void b(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i4) {
        dependencyNode.f3980l.add(dependencyNode2);
        dependencyNode.f3974f = i4;
        dependencyNode2.f3979k.add(dependencyNode);
    }

    /* access modifiers changed from: protected */
    public final void c(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i4, e eVar) {
        dependencyNode.f3980l.add(dependencyNode2);
        dependencyNode.f3980l.add(this.f3986e);
        dependencyNode.f3976h = i4;
        dependencyNode.f3977i = eVar;
        dependencyNode2.f3979k.add(dependencyNode);
        eVar.f3979k.add(dependencyNode);
    }

    /* access modifiers changed from: package-private */
    public abstract void d();

    /* access modifiers changed from: package-private */
    public abstract void e();

    /* access modifiers changed from: package-private */
    public abstract void f();

    /* access modifiers changed from: protected */
    public final int g(int i4, int i5) {
        int i6;
        if (i5 == 0) {
            ConstraintWidget constraintWidget = this.f3983b;
            int i7 = constraintWidget.f3874A;
            i6 = Math.max(constraintWidget.f3960z, i4);
            if (i7 > 0) {
                i6 = Math.min(i7, i4);
            }
            if (i6 == i4) {
                return i4;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f3983b;
            int i8 = constraintWidget2.f3880D;
            int max = Math.max(constraintWidget2.f3878C, i4);
            if (i8 > 0) {
                max = Math.min(i8, i4);
            }
            if (i6 == i4) {
                return i4;
            }
        }
        return i6;
    }

    /* access modifiers changed from: protected */
    public final DependencyNode h(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f3867f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f3865d;
        int i4 = a.f3993a[constraintAnchor2.f3866e.ordinal()];
        if (i4 == 1) {
            return constraintWidget.f3918e.f3989h;
        }
        if (i4 == 2) {
            return constraintWidget.f3918e.f3990i;
        }
        if (i4 == 3) {
            return constraintWidget.f3920f.f3989h;
        }
        if (i4 == 4) {
            return constraintWidget.f3920f.f4035k;
        }
        if (i4 != 5) {
            return null;
        }
        return constraintWidget.f3920f.f3990i;
    }

    /* access modifiers changed from: protected */
    public final DependencyNode i(ConstraintAnchor constraintAnchor, int i4) {
        WidgetRun widgetRun;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f3867f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f3865d;
        if (i4 == 0) {
            widgetRun = constraintWidget.f3918e;
        } else {
            widgetRun = constraintWidget.f3920f;
        }
        int i5 = a.f3993a[constraintAnchor2.f3866e.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 5) {
                        return null;
                    }
                }
            }
            return widgetRun.f3990i;
        }
        return widgetRun.f3989h;
    }

    public long j() {
        e eVar = this.f3986e;
        if (eVar.f3978j) {
            return (long) eVar.f3975g;
        }
        return 0;
    }

    public boolean k() {
        return this.f3988g;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean m();

    /* access modifiers changed from: protected */
    public void n(D.a aVar, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i4) {
        float f4;
        DependencyNode h4 = h(constraintAnchor);
        DependencyNode h5 = h(constraintAnchor2);
        if (h4.f3978j && h5.f3978j) {
            int f5 = h4.f3975g + constraintAnchor.f();
            int f6 = h5.f3975g - constraintAnchor2.f();
            int i5 = f6 - f5;
            if (!this.f3986e.f3978j && this.f3985d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                l(i4, i5);
            }
            e eVar = this.f3986e;
            if (eVar.f3978j) {
                if (eVar.f3975g == i5) {
                    this.f3989h.d(f5);
                    this.f3990i.d(f6);
                    return;
                }
                ConstraintWidget constraintWidget = this.f3983b;
                if (i4 == 0) {
                    f4 = constraintWidget.y();
                } else {
                    f4 = constraintWidget.R();
                }
                if (h4 == h5) {
                    f5 = h4.f3975g;
                    f6 = h5.f3975g;
                    f4 = 0.5f;
                }
                this.f3989h.d((int) (((float) f5) + 0.5f + (((float) ((f6 - f5) - this.f3986e.f3975g)) * f4)));
                this.f3990i.d(this.f3989h.f3975g + this.f3986e.f3975g);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void o(D.a aVar) {
    }

    /* access modifiers changed from: protected */
    public void p(D.a aVar) {
    }
}
