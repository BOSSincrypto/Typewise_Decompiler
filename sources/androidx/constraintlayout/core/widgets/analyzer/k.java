package androidx.constraintlayout.core.widgets.analyzer;

import D.a;
import androidx.constraintlayout.core.widgets.d;
import java.util.ArrayList;

class k {

    /* renamed from: h  reason: collision with root package name */
    public static int f4027h;

    /* renamed from: a  reason: collision with root package name */
    public int f4028a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4029b = false;

    /* renamed from: c  reason: collision with root package name */
    WidgetRun f4030c = null;

    /* renamed from: d  reason: collision with root package name */
    WidgetRun f4031d = null;

    /* renamed from: e  reason: collision with root package name */
    ArrayList f4032e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    int f4033f;

    /* renamed from: g  reason: collision with root package name */
    int f4034g;

    public k(WidgetRun widgetRun, int i4) {
        int i5 = f4027h;
        this.f4033f = i5;
        f4027h = i5 + 1;
        this.f4030c = widgetRun;
        this.f4031d = widgetRun;
        this.f4034g = i4;
    }

    private long c(DependencyNode dependencyNode, long j4) {
        WidgetRun widgetRun = dependencyNode.f3972d;
        if (widgetRun instanceof i) {
            return j4;
        }
        int size = dependencyNode.f3979k.size();
        long j5 = j4;
        for (int i4 = 0; i4 < size; i4++) {
            a aVar = (a) dependencyNode.f3979k.get(i4);
            if (aVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) aVar;
                if (dependencyNode2.f3972d != widgetRun) {
                    j5 = Math.min(j5, c(dependencyNode2, ((long) dependencyNode2.f3974f) + j4));
                }
            }
        }
        if (dependencyNode != widgetRun.f3990i) {
            return j5;
        }
        long j6 = j4 - widgetRun.j();
        return Math.min(Math.min(j5, c(widgetRun.f3989h, j6)), j6 - ((long) widgetRun.f3989h.f3974f));
    }

    private long d(DependencyNode dependencyNode, long j4) {
        WidgetRun widgetRun = dependencyNode.f3972d;
        if (widgetRun instanceof i) {
            return j4;
        }
        int size = dependencyNode.f3979k.size();
        long j5 = j4;
        for (int i4 = 0; i4 < size; i4++) {
            a aVar = (a) dependencyNode.f3979k.get(i4);
            if (aVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) aVar;
                if (dependencyNode2.f3972d != widgetRun) {
                    j5 = Math.max(j5, d(dependencyNode2, ((long) dependencyNode2.f3974f) + j4));
                }
            }
        }
        if (dependencyNode != widgetRun.f3989h) {
            return j5;
        }
        long j6 = j4 + widgetRun.j();
        return Math.max(Math.max(j5, d(widgetRun.f3990i, j6)), j6 - ((long) widgetRun.f3990i.f3974f));
    }

    public void a(WidgetRun widgetRun) {
        this.f4032e.add(widgetRun);
        this.f4031d = widgetRun;
    }

    public long b(d dVar, int i4) {
        WidgetRun widgetRun;
        WidgetRun widgetRun2;
        long j4;
        int i5;
        WidgetRun widgetRun3 = this.f4030c;
        long j5 = 0;
        if (widgetRun3 instanceof c) {
            if (((c) widgetRun3).f3987f != i4) {
                return 0;
            }
        } else if (i4 == 0) {
            if (!(widgetRun3 instanceof j)) {
                return 0;
            }
        } else if (!(widgetRun3 instanceof l)) {
            return 0;
        }
        if (i4 == 0) {
            widgetRun = dVar.f3918e;
        } else {
            widgetRun = dVar.f3920f;
        }
        DependencyNode dependencyNode = widgetRun.f3989h;
        if (i4 == 0) {
            widgetRun2 = dVar.f3918e;
        } else {
            widgetRun2 = dVar.f3920f;
        }
        DependencyNode dependencyNode2 = widgetRun2.f3990i;
        boolean contains = widgetRun3.f3989h.f3980l.contains(dependencyNode);
        boolean contains2 = this.f4030c.f3990i.f3980l.contains(dependencyNode2);
        long j6 = this.f4030c.j();
        if (contains && contains2) {
            long d4 = d(this.f4030c.f3989h, 0);
            long c4 = c(this.f4030c.f3990i, 0);
            long j7 = d4 - j6;
            WidgetRun widgetRun4 = this.f4030c;
            int i6 = widgetRun4.f3990i.f3974f;
            if (j7 >= ((long) (-i6))) {
                j7 += (long) i6;
            }
            int i7 = widgetRun4.f3989h.f3974f;
            long j8 = ((-c4) - j6) - ((long) i7);
            if (j8 >= ((long) i7)) {
                j8 -= (long) i7;
            }
            float q4 = widgetRun4.f3983b.q(i4);
            if (q4 > 0.0f) {
                j5 = (long) ((((float) j8) / q4) + (((float) j7) / (1.0f - q4)));
            }
            float f4 = (float) j5;
            long j9 = ((long) ((f4 * q4) + 0.5f)) + j6 + ((long) ((f4 * (1.0f - q4)) + 0.5f));
            WidgetRun widgetRun5 = this.f4030c;
            j4 = ((long) widgetRun5.f3989h.f3974f) + j9;
            i5 = widgetRun5.f3990i.f3974f;
        } else if (contains) {
            DependencyNode dependencyNode3 = this.f4030c.f3989h;
            return Math.max(d(dependencyNode3, (long) dependencyNode3.f3974f), ((long) this.f4030c.f3989h.f3974f) + j6);
        } else if (contains2) {
            DependencyNode dependencyNode4 = this.f4030c.f3990i;
            return Math.max(-c(dependencyNode4, (long) dependencyNode4.f3974f), ((long) (-this.f4030c.f3990i.f3974f)) + j6);
        } else {
            WidgetRun widgetRun6 = this.f4030c;
            j4 = ((long) widgetRun6.f3989h.f3974f) + widgetRun6.j();
            i5 = this.f4030c.f3990i.f3974f;
        }
        return j4 - ((long) i5);
    }
}
