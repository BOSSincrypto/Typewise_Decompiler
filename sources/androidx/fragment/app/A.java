package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

class A extends B {

    class a extends Transition.EpicenterCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f5632a;

        a(Rect rect) {
            this.f5632a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f5632a;
        }
    }

    class b implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f5634a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f5635b;

        b(View view, ArrayList arrayList) {
            this.f5634a = view;
            this.f5635b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            f.b(transition, this);
            this.f5634a.setVisibility(8);
            int size = this.f5635b.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((View) this.f5635b.get(i4)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            f.b(transition, this);
            f.a(transition, this);
        }
    }

    class c implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f5637a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f5638b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f5639c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f5640d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f5641e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f5642f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f5637a = obj;
            this.f5638b = arrayList;
            this.f5639c = obj2;
            this.f5640d = arrayList2;
            this.f5641e = obj3;
            this.f5642f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            f.b(transition, this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f5637a;
            if (obj != null) {
                A.this.w(obj, this.f5638b, (ArrayList) null);
            }
            Object obj2 = this.f5639c;
            if (obj2 != null) {
                A.this.w(obj2, this.f5640d, (ArrayList) null);
            }
            Object obj3 = this.f5641e;
            if (obj3 != null) {
                A.this.w(obj3, this.f5642f, (ArrayList) null);
            }
        }
    }

    class d implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f5644a;

        d(Runnable runnable) {
            this.f5644a = runnable;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f5644a.run();
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    class e extends Transition.EpicenterCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f5646a;

        e(Rect rect) {
            this.f5646a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f5646a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f5646a;
        }
    }

    static class f {
        static void a(Transition transition, Transition.TransitionListener transitionListener) {
            transition.addListener(transitionListener);
        }

        static void b(Transition transition, Transition.TransitionListener transitionListener) {
            transition.removeListener(transitionListener);
        }
    }

    A() {
    }

    private static boolean v(Transition transition) {
        if (!B.i(transition.getTargetIds()) || !B.i(transition.getTargetNames()) || !B.i(transition.getTargetTypes())) {
            return true;
        }
        return false;
    }

    public void a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    public void b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i4 = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i4 < transitionCount) {
                    b(transitionSet.getTransitionAt(i4), arrayList);
                    i4++;
                }
            } else if (!v(transition) && B.i(transition.getTargets())) {
                int size = arrayList.size();
                while (i4 < size) {
                    transition.addTarget((View) arrayList.get(i4));
                    i4++;
                }
            }
        }
    }

    public void c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public boolean e(Object obj) {
        return obj instanceof Transition;
    }

    public Object f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    public Object j(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            if (transition2 != null) {
                transition = transition2;
            } else {
                transition = null;
            }
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    public Object k(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    public void m(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new b(view, arrayList));
    }

    public void n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void o(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new e(rect));
        }
    }

    public void p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(rect));
        }
    }

    public void q(Fragment fragment, Object obj, androidx.core.os.e eVar, Runnable runnable) {
        ((Transition) obj).addListener(new d(runnable));
    }

    public void s(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            B.d(targets, (View) arrayList.get(i4));
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    public void t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            w(transitionSet, arrayList, arrayList2);
        }
    }

    public Object u(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public void w(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        int i4;
        Transition transition = (Transition) obj;
        int i5 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i5 < transitionCount) {
                w(transitionSet.getTransitionAt(i5), arrayList, arrayList2);
                i5++;
            }
        } else if (!v(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                i4 = 0;
            } else {
                i4 = arrayList2.size();
            }
            while (i5 < i4) {
                transition.addTarget((View) arrayList2.get(i5));
                i5++;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                transition.removeTarget((View) arrayList.get(size));
            }
        }
    }
}
