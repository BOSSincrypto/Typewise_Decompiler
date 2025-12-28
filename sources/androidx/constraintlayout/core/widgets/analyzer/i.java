package androidx.constraintlayout.core.widgets.analyzer;

import D.a;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;

class i extends WidgetRun {
    public i(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    private void q(DependencyNode dependencyNode) {
        this.f3989h.f3979k.add(dependencyNode);
        dependencyNode.f3980l.add(this.f3989h);
    }

    public void a(a aVar) {
        androidx.constraintlayout.core.widgets.a aVar2 = (androidx.constraintlayout.core.widgets.a) this.f3983b;
        int v12 = aVar2.v1();
        int i4 = 0;
        int i5 = -1;
        for (DependencyNode dependencyNode : this.f3989h.f3980l) {
            int i6 = dependencyNode.f3975g;
            if (i5 == -1 || i6 < i5) {
                i5 = i6;
            }
            if (i4 < i6) {
                i4 = i6;
            }
        }
        if (v12 == 0 || v12 == 2) {
            this.f3989h.d(i5 + aVar2.w1());
        } else {
            this.f3989h.d(i4 + aVar2.w1());
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        ConstraintWidget constraintWidget = this.f3983b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            this.f3989h.f3970b = true;
            androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) constraintWidget;
            int v12 = aVar.v1();
            boolean u12 = aVar.u1();
            int i4 = 0;
            if (v12 == 0) {
                this.f3989h.f3973e = DependencyNode.Type.LEFT;
                while (i4 < aVar.f218M0) {
                    ConstraintWidget constraintWidget2 = aVar.f217L0[i4];
                    if (u12 || constraintWidget2.V() != 8) {
                        DependencyNode dependencyNode = constraintWidget2.f3918e.f3989h;
                        dependencyNode.f3979k.add(this.f3989h);
                        this.f3989h.f3980l.add(dependencyNode);
                    }
                    i4++;
                }
                q(this.f3983b.f3918e.f3989h);
                q(this.f3983b.f3918e.f3990i);
            } else if (v12 == 1) {
                this.f3989h.f3973e = DependencyNode.Type.RIGHT;
                while (i4 < aVar.f218M0) {
                    ConstraintWidget constraintWidget3 = aVar.f217L0[i4];
                    if (u12 || constraintWidget3.V() != 8) {
                        DependencyNode dependencyNode2 = constraintWidget3.f3918e.f3990i;
                        dependencyNode2.f3979k.add(this.f3989h);
                        this.f3989h.f3980l.add(dependencyNode2);
                    }
                    i4++;
                }
                q(this.f3983b.f3918e.f3989h);
                q(this.f3983b.f3918e.f3990i);
            } else if (v12 == 2) {
                this.f3989h.f3973e = DependencyNode.Type.TOP;
                while (i4 < aVar.f218M0) {
                    ConstraintWidget constraintWidget4 = aVar.f217L0[i4];
                    if (u12 || constraintWidget4.V() != 8) {
                        DependencyNode dependencyNode3 = constraintWidget4.f3920f.f3989h;
                        dependencyNode3.f3979k.add(this.f3989h);
                        this.f3989h.f3980l.add(dependencyNode3);
                    }
                    i4++;
                }
                q(this.f3983b.f3920f.f3989h);
                q(this.f3983b.f3920f.f3990i);
            } else if (v12 == 3) {
                this.f3989h.f3973e = DependencyNode.Type.BOTTOM;
                while (i4 < aVar.f218M0) {
                    ConstraintWidget constraintWidget5 = aVar.f217L0[i4];
                    if (u12 || constraintWidget5.V() != 8) {
                        DependencyNode dependencyNode4 = constraintWidget5.f3920f.f3990i;
                        dependencyNode4.f3979k.add(this.f3989h);
                        this.f3989h.f3980l.add(dependencyNode4);
                    }
                    i4++;
                }
                q(this.f3983b.f3920f.f3989h);
                q(this.f3983b.f3920f.f3990i);
            }
        }
    }

    public void e() {
        ConstraintWidget constraintWidget = this.f3983b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            int v12 = ((androidx.constraintlayout.core.widgets.a) constraintWidget).v1();
            if (v12 == 0 || v12 == 1) {
                this.f3983b.m1(this.f3989h.f3975g);
            } else {
                this.f3983b.n1(this.f3989h.f3975g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f3984c = null;
        this.f3989h.c();
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return false;
    }
}
