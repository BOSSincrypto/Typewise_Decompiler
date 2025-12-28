package d0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.B;
import d0.C0621l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: d0.e  reason: case insensitive filesystem */
public class C0614e extends B {

    /* renamed from: d0.e$a */
    class a extends C0621l.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f13446a;

        a(Rect rect) {
            this.f13446a = rect;
        }
    }

    /* renamed from: d0.e$b */
    class b implements C0621l.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f13448a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f13449b;

        b(View view, ArrayList arrayList) {
            this.f13448a = view;
            this.f13449b = arrayList;
        }

        public void a(C0621l lVar) {
        }

        public void b(C0621l lVar) {
        }

        public void c(C0621l lVar) {
        }

        public void d(C0621l lVar) {
        }

        public void e(C0621l lVar) {
            lVar.T(this);
            this.f13448a.setVisibility(8);
            int size = this.f13449b.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((View) this.f13449b.get(i4)).setVisibility(0);
            }
        }
    }

    /* renamed from: d0.e$c */
    class c extends C0622m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f13451a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f13452b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f13453c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f13454d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f13455e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f13456f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f13451a = obj;
            this.f13452b = arrayList;
            this.f13453c = obj2;
            this.f13454d = arrayList2;
            this.f13455e = obj3;
            this.f13456f = arrayList3;
        }

        public void a(C0621l lVar) {
            Object obj = this.f13451a;
            if (obj != null) {
                C0614e.this.w(obj, this.f13452b, (ArrayList) null);
            }
            Object obj2 = this.f13453c;
            if (obj2 != null) {
                C0614e.this.w(obj2, this.f13454d, (ArrayList) null);
            }
            Object obj3 = this.f13455e;
            if (obj3 != null) {
                C0614e.this.w(obj3, this.f13456f, (ArrayList) null);
            }
        }

        public void e(C0621l lVar) {
            lVar.T(this);
        }
    }

    /* renamed from: d0.e$d */
    class d extends C0621l.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f13458a;

        d(Rect rect) {
            this.f13458a = rect;
        }
    }

    private static boolean v(C0621l lVar) {
        if (!B.i(lVar.D()) || !B.i(lVar.E()) || !B.i(lVar.F())) {
            return true;
        }
        return false;
    }

    public void a(Object obj, View view) {
        if (obj != null) {
            ((C0621l) obj).c(view);
        }
    }

    public void b(Object obj, ArrayList arrayList) {
        C0621l lVar = (C0621l) obj;
        if (lVar != null) {
            int i4 = 0;
            if (lVar instanceof C0625p) {
                C0625p pVar = (C0625p) lVar;
                int l02 = pVar.l0();
                while (i4 < l02) {
                    b(pVar.k0(i4), arrayList);
                    i4++;
                }
            } else if (!v(lVar) && B.i(lVar.G())) {
                int size = arrayList.size();
                while (i4 < size) {
                    lVar.c((View) arrayList.get(i4));
                    i4++;
                }
            }
        }
    }

    public void c(ViewGroup viewGroup, Object obj) {
        C0623n.a(viewGroup, (C0621l) obj);
    }

    public boolean e(Object obj) {
        return obj instanceof C0621l;
    }

    public Object f(Object obj) {
        if (obj != null) {
            return ((C0621l) obj).clone();
        }
        return null;
    }

    public Object j(Object obj, Object obj2, Object obj3) {
        C0621l lVar = (C0621l) obj;
        C0621l lVar2 = (C0621l) obj2;
        C0621l lVar3 = (C0621l) obj3;
        if (lVar != null && lVar2 != null) {
            lVar = new C0625p().i0(lVar).i0(lVar2).q0(1);
        } else if (lVar == null) {
            if (lVar2 != null) {
                lVar = lVar2;
            } else {
                lVar = null;
            }
        }
        if (lVar3 == null) {
            return lVar;
        }
        C0625p pVar = new C0625p();
        if (lVar != null) {
            pVar.i0(lVar);
        }
        pVar.i0(lVar3);
        return pVar;
    }

    public Object k(Object obj, Object obj2, Object obj3) {
        C0625p pVar = new C0625p();
        if (obj != null) {
            pVar.i0((C0621l) obj);
        }
        if (obj2 != null) {
            pVar.i0((C0621l) obj2);
        }
        if (obj3 != null) {
            pVar.i0((C0621l) obj3);
        }
        return pVar;
    }

    public void m(Object obj, View view, ArrayList arrayList) {
        ((C0621l) obj).b(new b(view, arrayList));
    }

    public void n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((C0621l) obj).b(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void o(Object obj, Rect rect) {
        if (obj != null) {
            ((C0621l) obj).Z(new d(rect));
        }
    }

    public void p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((C0621l) obj).Z(new a(rect));
        }
    }

    public void s(Object obj, View view, ArrayList arrayList) {
        C0625p pVar = (C0625p) obj;
        List G3 = pVar.G();
        G3.clear();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            B.d(G3, (View) arrayList.get(i4));
        }
        G3.add(view);
        arrayList.add(view);
        b(pVar, arrayList);
    }

    public void t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C0625p pVar = (C0625p) obj;
        if (pVar != null) {
            pVar.G().clear();
            pVar.G().addAll(arrayList2);
            w(pVar, arrayList, arrayList2);
        }
    }

    public Object u(Object obj) {
        if (obj == null) {
            return null;
        }
        C0625p pVar = new C0625p();
        pVar.i0((C0621l) obj);
        return pVar;
    }

    public void w(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        int i4;
        C0621l lVar = (C0621l) obj;
        int i5 = 0;
        if (lVar instanceof C0625p) {
            C0625p pVar = (C0625p) lVar;
            int l02 = pVar.l0();
            while (i5 < l02) {
                w(pVar.k0(i5), arrayList, arrayList2);
                i5++;
            }
        } else if (!v(lVar)) {
            List G3 = lVar.G();
            if (G3.size() == arrayList.size() && G3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i4 = 0;
                } else {
                    i4 = arrayList2.size();
                }
                while (i5 < i4) {
                    lVar.c((View) arrayList2.get(i5));
                    i5++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    lVar.U((View) arrayList.get(size));
                }
            }
        }
    }
}
