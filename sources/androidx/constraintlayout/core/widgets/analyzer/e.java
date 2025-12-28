package androidx.constraintlayout.core.widgets.analyzer;

import D.a;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;

class e extends DependencyNode {

    /* renamed from: m  reason: collision with root package name */
    public int f4021m;

    public e(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof j) {
            this.f3973e = DependencyNode.Type.HORIZONTAL_DIMENSION;
        } else {
            this.f3973e = DependencyNode.Type.VERTICAL_DIMENSION;
        }
    }

    public void d(int i4) {
        if (!this.f3978j) {
            this.f3978j = true;
            this.f3975g = i4;
            for (a aVar : this.f3979k) {
                aVar.a(aVar);
            }
        }
    }
}
