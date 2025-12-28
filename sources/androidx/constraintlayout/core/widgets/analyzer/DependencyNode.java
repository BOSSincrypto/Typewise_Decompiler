package androidx.constraintlayout.core.widgets.analyzer;

import D.a;
import java.util.ArrayList;
import java.util.List;

public class DependencyNode implements a {

    /* renamed from: a  reason: collision with root package name */
    public a f3969a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3970b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3971c = false;

    /* renamed from: d  reason: collision with root package name */
    WidgetRun f3972d;

    /* renamed from: e  reason: collision with root package name */
    Type f3973e = Type.UNKNOWN;

    /* renamed from: f  reason: collision with root package name */
    int f3974f;

    /* renamed from: g  reason: collision with root package name */
    public int f3975g;

    /* renamed from: h  reason: collision with root package name */
    int f3976h = 1;

    /* renamed from: i  reason: collision with root package name */
    e f3977i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3978j = false;

    /* renamed from: k  reason: collision with root package name */
    List f3979k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    List f3980l = new ArrayList();

    enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.f3972d = widgetRun;
    }

    public void a(a aVar) {
        for (DependencyNode dependencyNode : this.f3980l) {
            if (!dependencyNode.f3978j) {
                return;
            }
        }
        this.f3971c = true;
        a aVar2 = this.f3969a;
        if (aVar2 != null) {
            aVar2.a(this);
        }
        if (this.f3970b) {
            this.f3972d.a(this);
            return;
        }
        DependencyNode dependencyNode2 = null;
        int i4 = 0;
        for (DependencyNode dependencyNode3 : this.f3980l) {
            if (!(dependencyNode3 instanceof e)) {
                i4++;
                dependencyNode2 = dependencyNode3;
            }
        }
        if (dependencyNode2 != null && i4 == 1 && dependencyNode2.f3978j) {
            e eVar = this.f3977i;
            if (eVar != null) {
                if (eVar.f3978j) {
                    this.f3974f = this.f3976h * eVar.f3975g;
                } else {
                    return;
                }
            }
            d(dependencyNode2.f3975g + this.f3974f);
        }
        a aVar3 = this.f3969a;
        if (aVar3 != null) {
            aVar3.a(this);
        }
    }

    public void b(a aVar) {
        this.f3979k.add(aVar);
        if (this.f3978j) {
            aVar.a(aVar);
        }
    }

    public void c() {
        this.f3980l.clear();
        this.f3979k.clear();
        this.f3978j = false;
        this.f3975g = 0;
        this.f3971c = false;
        this.f3970b = false;
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

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3972d.f3983b.t());
        sb.append(":");
        sb.append(this.f3973e);
        sb.append("(");
        if (this.f3978j) {
            obj = Integer.valueOf(this.f3975g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.f3980l.size());
        sb.append(":d=");
        sb.append(this.f3979k.size());
        sb.append(">");
        return sb.toString();
    }
}
