package androidx.constraintlayout.core.widgets.analyzer;

import D.a;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.f;

class h extends WidgetRun {
    public h(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.f3918e.f();
        constraintWidget.f3920f.f();
        this.f3987f = ((f) constraintWidget).s1();
    }

    private void q(DependencyNode dependencyNode) {
        this.f3989h.f3979k.add(dependencyNode);
        dependencyNode.f3980l.add(this.f3989h);
    }

    public void a(a aVar) {
        DependencyNode dependencyNode = this.f3989h;
        if (dependencyNode.f3971c && !dependencyNode.f3978j) {
            this.f3989h.d((int) ((((float) ((DependencyNode) dependencyNode.f3980l.get(0)).f3975g) * ((f) this.f3983b).v1()) + 0.5f));
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        f fVar = (f) this.f3983b;
        int t12 = fVar.t1();
        int u12 = fVar.u1();
        fVar.v1();
        if (fVar.s1() == 1) {
            if (t12 != -1) {
                this.f3989h.f3980l.add(this.f3983b.f3911a0.f3918e.f3989h);
                this.f3983b.f3911a0.f3918e.f3989h.f3979k.add(this.f3989h);
                this.f3989h.f3974f = t12;
            } else if (u12 != -1) {
                this.f3989h.f3980l.add(this.f3983b.f3911a0.f3918e.f3990i);
                this.f3983b.f3911a0.f3918e.f3990i.f3979k.add(this.f3989h);
                this.f3989h.f3974f = -u12;
            } else {
                DependencyNode dependencyNode = this.f3989h;
                dependencyNode.f3970b = true;
                dependencyNode.f3980l.add(this.f3983b.f3911a0.f3918e.f3990i);
                this.f3983b.f3911a0.f3918e.f3990i.f3979k.add(this.f3989h);
            }
            q(this.f3983b.f3918e.f3989h);
            q(this.f3983b.f3918e.f3990i);
            return;
        }
        if (t12 != -1) {
            this.f3989h.f3980l.add(this.f3983b.f3911a0.f3920f.f3989h);
            this.f3983b.f3911a0.f3920f.f3989h.f3979k.add(this.f3989h);
            this.f3989h.f3974f = t12;
        } else if (u12 != -1) {
            this.f3989h.f3980l.add(this.f3983b.f3911a0.f3920f.f3990i);
            this.f3983b.f3911a0.f3920f.f3990i.f3979k.add(this.f3989h);
            this.f3989h.f3974f = -u12;
        } else {
            DependencyNode dependencyNode2 = this.f3989h;
            dependencyNode2.f3970b = true;
            dependencyNode2.f3980l.add(this.f3983b.f3911a0.f3920f.f3990i);
            this.f3983b.f3911a0.f3920f.f3990i.f3979k.add(this.f3989h);
        }
        q(this.f3983b.f3920f.f3989h);
        q(this.f3983b.f3920f.f3990i);
    }

    public void e() {
        if (((f) this.f3983b).s1() == 1) {
            this.f3983b.m1(this.f3989h.f3975g);
        } else {
            this.f3983b.n1(this.f3989h.f3975g);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f3989h.c();
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return false;
    }
}
