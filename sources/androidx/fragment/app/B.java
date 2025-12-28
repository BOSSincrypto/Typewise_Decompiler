package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.os.e;
import androidx.core.view.F;
import androidx.core.view.P;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class B {

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5648a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f5649b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayList f5650c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f5651d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArrayList f5652e;

        a(int i4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f5648a = i4;
            this.f5649b = arrayList;
            this.f5650c = arrayList2;
            this.f5651d = arrayList3;
            this.f5652e = arrayList4;
        }

        public void run() {
            for (int i4 = 0; i4 < this.f5648a; i4++) {
                P.G0((View) this.f5649b.get(i4), (String) this.f5650c.get(i4));
                P.G0((View) this.f5651d.get(i4), (String) this.f5652e.get(i4));
            }
        }
    }

    protected static void d(List list, View view) {
        int size = list.size();
        if (!g(list, view, size)) {
            if (P.J(view) != null) {
                list.add(view);
            }
            for (int i4 = size; i4 < list.size(); i4++) {
                View view2 = (View) list.get(i4);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i5 = 0; i5 < childCount; i5++) {
                        View childAt = viewGroup.getChildAt(i5);
                        if (!g(list, childAt, size) && P.J(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    private static boolean g(List list, View view, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (list.get(i5) == view) {
                return true;
            }
        }
        return false;
    }

    protected static boolean i(List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public abstract Object f(Object obj);

    /* access modifiers changed from: protected */
    public void h(View view, Rect rect) {
        if (P.R(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object j(Object obj, Object obj2, Object obj3);

    public abstract Object k(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: package-private */
    public ArrayList l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) arrayList.get(i4);
            arrayList2.add(P.J(view));
            P.G0(view, (String) null);
        }
        return arrayList2;
    }

    public abstract void m(Object obj, View view, ArrayList arrayList);

    public abstract void n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public abstract void o(Object obj, Rect rect);

    public abstract void p(Object obj, View view);

    public void q(Fragment fragment, Object obj, e eVar, Runnable runnable) {
        runnable.run();
    }

    /* access modifiers changed from: package-private */
    public void r(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList.get(i4);
            String J3 = P.J(view2);
            arrayList4.add(J3);
            if (J3 != null) {
                P.G0(view2, (String) null);
                String str = (String) map.get(J3);
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i5))) {
                        P.G0((View) arrayList2.get(i5), J3);
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        }
        F.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void s(Object obj, View view, ArrayList arrayList);

    public abstract void t(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object u(Object obj);
}
