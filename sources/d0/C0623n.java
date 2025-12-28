package d0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.P;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import y.C0939a;

/* renamed from: d0.n  reason: case insensitive filesystem */
public abstract class C0623n {

    /* renamed from: a  reason: collision with root package name */
    private static C0621l f13504a = new C0611b();

    /* renamed from: b  reason: collision with root package name */
    private static ThreadLocal f13505b = new ThreadLocal();

    /* renamed from: c  reason: collision with root package name */
    static ArrayList f13506c = new ArrayList();

    /* renamed from: d0.n$a */
    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        C0621l f13507a;

        /* renamed from: b  reason: collision with root package name */
        ViewGroup f13508b;

        /* renamed from: d0.n$a$a  reason: collision with other inner class name */
        class C0184a extends C0622m {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0939a f13509a;

            C0184a(C0939a aVar) {
                this.f13509a = aVar;
            }

            public void e(C0621l lVar) {
                ((ArrayList) this.f13509a.get(a.this.f13508b)).remove(lVar);
                lVar.T(this);
            }
        }

        a(C0621l lVar, ViewGroup viewGroup) {
            this.f13507a = lVar;
            this.f13508b = viewGroup;
        }

        private void a() {
            this.f13508b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f13508b.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            a();
            if (!C0623n.f13506c.remove(this.f13508b)) {
                return true;
            }
            C0939a b4 = C0623n.b();
            ArrayList arrayList = (ArrayList) b4.get(this.f13508b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                b4.put(this.f13508b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f13507a);
            this.f13507a.b(new C0184a(b4));
            this.f13507a.o(this.f13508b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C0621l) it.next()).V(this.f13508b);
                }
            }
            this.f13507a.S(this.f13508b);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            a();
            C0623n.f13506c.remove(this.f13508b);
            ArrayList arrayList = (ArrayList) C0623n.b().get(this.f13508b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C0621l) it.next()).V(this.f13508b);
                }
            }
            this.f13507a.p(true);
        }
    }

    public static void a(ViewGroup viewGroup, C0621l lVar) {
        if (!f13506c.contains(viewGroup) && P.S(viewGroup)) {
            f13506c.add(viewGroup);
            if (lVar == null) {
                lVar = f13504a;
            }
            C0621l q4 = lVar.clone();
            d(viewGroup, q4);
            C0620k.b(viewGroup, (C0620k) null);
            c(viewGroup, q4);
        }
    }

    static C0939a b() {
        C0939a aVar;
        WeakReference weakReference = (WeakReference) f13505b.get();
        if (weakReference != null && (aVar = (C0939a) weakReference.get()) != null) {
            return aVar;
        }
        C0939a aVar2 = new C0939a();
        f13505b.set(new WeakReference(aVar2));
        return aVar2;
    }

    private static void c(ViewGroup viewGroup, C0621l lVar) {
        if (lVar != null && viewGroup != null) {
            a aVar = new a(lVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    private static void d(ViewGroup viewGroup, C0621l lVar) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C0621l) it.next()).R(viewGroup);
            }
        }
        if (lVar != null) {
            lVar.o(viewGroup, true);
        }
        C0620k.a(viewGroup);
    }
}
