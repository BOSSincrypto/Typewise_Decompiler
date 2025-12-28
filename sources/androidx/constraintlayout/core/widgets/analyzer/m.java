package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.d;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class m {

    /* renamed from: g  reason: collision with root package name */
    static int f4038g;

    /* renamed from: a  reason: collision with root package name */
    ArrayList f4039a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    int f4040b;

    /* renamed from: c  reason: collision with root package name */
    boolean f4041c = false;

    /* renamed from: d  reason: collision with root package name */
    int f4042d;

    /* renamed from: e  reason: collision with root package name */
    ArrayList f4043e = null;

    /* renamed from: f  reason: collision with root package name */
    private int f4044f = -1;

    class a {

        /* renamed from: a  reason: collision with root package name */
        WeakReference f4045a;

        /* renamed from: b  reason: collision with root package name */
        int f4046b;

        /* renamed from: c  reason: collision with root package name */
        int f4047c;

        /* renamed from: d  reason: collision with root package name */
        int f4048d;

        /* renamed from: e  reason: collision with root package name */
        int f4049e;

        /* renamed from: f  reason: collision with root package name */
        int f4050f;

        /* renamed from: g  reason: collision with root package name */
        int f4051g;

        public a(ConstraintWidget constraintWidget, d dVar, int i4) {
            this.f4045a = new WeakReference(constraintWidget);
            this.f4046b = dVar.x(constraintWidget.f3898O);
            this.f4047c = dVar.x(constraintWidget.f3899P);
            this.f4048d = dVar.x(constraintWidget.f3900Q);
            this.f4049e = dVar.x(constraintWidget.f3901R);
            this.f4050f = dVar.x(constraintWidget.f3902S);
            this.f4051g = i4;
        }
    }

    public m(int i4) {
        int i5 = f4038g;
        f4038g = i5 + 1;
        this.f4040b = i5;
        this.f4042d = i4;
    }

    private String e() {
        int i4 = this.f4042d;
        if (i4 == 0) {
            return "Horizontal";
        }
        if (i4 == 1) {
            return "Vertical";
        }
        if (i4 == 2) {
            return "Both";
        }
        return "Unknown";
    }

    private int j(d dVar, ArrayList arrayList, int i4) {
        int x3;
        int x4;
        androidx.constraintlayout.core.widgets.d dVar2 = (androidx.constraintlayout.core.widgets.d) ((ConstraintWidget) arrayList.get(0)).K();
        dVar.D();
        dVar2.g(dVar, false);
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            ((ConstraintWidget) arrayList.get(i5)).g(dVar, false);
        }
        if (i4 == 0 && dVar2.f4085W0 > 0) {
            b.b(dVar2, dVar, arrayList, 0);
        }
        if (i4 == 1 && dVar2.f4086X0 > 0) {
            b.b(dVar2, dVar, arrayList, 1);
        }
        try {
            dVar.z();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        this.f4043e = new ArrayList();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            this.f4043e.add(new a((ConstraintWidget) arrayList.get(i6), dVar, i4));
        }
        if (i4 == 0) {
            x3 = dVar.x(dVar2.f3898O);
            x4 = dVar.x(dVar2.f3900Q);
            dVar.D();
        } else {
            x3 = dVar.x(dVar2.f3899P);
            x4 = dVar.x(dVar2.f3901R);
            dVar.D();
        }
        return x4 - x3;
    }

    public boolean a(ConstraintWidget constraintWidget) {
        if (this.f4039a.contains(constraintWidget)) {
            return false;
        }
        this.f4039a.add(constraintWidget);
        return true;
    }

    public void b(ArrayList arrayList) {
        int size = this.f4039a.size();
        if (this.f4044f != -1 && size > 0) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                m mVar = (m) arrayList.get(i4);
                if (this.f4044f == mVar.f4040b) {
                    g(this.f4042d, mVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f4040b;
    }

    public int d() {
        return this.f4042d;
    }

    public int f(d dVar, int i4) {
        if (this.f4039a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f4039a, i4);
    }

    public void g(int i4, m mVar) {
        Iterator it = this.f4039a.iterator();
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            mVar.a(constraintWidget);
            if (i4 == 0) {
                constraintWidget.f3891I0 = mVar.c();
            } else {
                constraintWidget.f3893J0 = mVar.c();
            }
        }
        this.f4044f = mVar.f4040b;
    }

    public void h(boolean z3) {
        this.f4041c = z3;
    }

    public void i(int i4) {
        this.f4042d = i4;
    }

    public String toString() {
        String str = e() + " [" + this.f4040b + "] <";
        Iterator it = this.f4039a.iterator();
        while (it.hasNext()) {
            str = str + " " + ((ConstraintWidget) it.next()).t();
        }
        return str + " >";
    }
}
