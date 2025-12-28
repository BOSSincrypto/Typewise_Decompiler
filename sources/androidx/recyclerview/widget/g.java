package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.P;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class g extends t {

    /* renamed from: s  reason: collision with root package name */
    private static TimeInterpolator f6537s;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList f6538h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private ArrayList f6539i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private ArrayList f6540j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private ArrayList f6541k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    ArrayList f6542l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    ArrayList f6543m = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    ArrayList f6544n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    ArrayList f6545o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    ArrayList f6546p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    ArrayList f6547q = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    ArrayList f6548r = new ArrayList();

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f6549a;

        a(ArrayList arrayList) {
            this.f6549a = arrayList;
        }

        public void run() {
            Iterator it = this.f6549a.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                g.this.S(jVar.f6583a, jVar.f6584b, jVar.f6585c, jVar.f6586d, jVar.f6587e);
            }
            this.f6549a.clear();
            g.this.f6543m.remove(this.f6549a);
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f6551a;

        b(ArrayList arrayList) {
            this.f6551a = arrayList;
        }

        public void run() {
            Iterator it = this.f6551a.iterator();
            while (it.hasNext()) {
                g.this.R((i) it.next());
            }
            this.f6551a.clear();
            g.this.f6544n.remove(this.f6551a);
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f6553a;

        c(ArrayList arrayList) {
            this.f6553a = arrayList;
        }

        public void run() {
            Iterator it = this.f6553a.iterator();
            while (it.hasNext()) {
                g.this.Q((RecyclerView.D) it.next());
            }
            this.f6553a.clear();
            g.this.f6542l.remove(this.f6553a);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.D f6555a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f6556b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f6557c;

        d(RecyclerView.D d4, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f6555a = d4;
            this.f6556b = viewPropertyAnimator;
            this.f6557c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f6556b.setListener((Animator.AnimatorListener) null);
            this.f6557c.setAlpha(1.0f);
            g.this.G(this.f6555a);
            g.this.f6547q.remove(this.f6555a);
            g.this.V();
        }

        public void onAnimationStart(Animator animator) {
            g.this.H(this.f6555a);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.D f6559a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f6560b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f6561c;

        e(RecyclerView.D d4, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f6559a = d4;
            this.f6560b = view;
            this.f6561c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f6560b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f6561c.setListener((Animator.AnimatorListener) null);
            g.this.A(this.f6559a);
            g.this.f6545o.remove(this.f6559a);
            g.this.V();
        }

        public void onAnimationStart(Animator animator) {
            g.this.B(this.f6559a);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.D f6563a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f6564b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f6565c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f6566d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f6567e;

        f(RecyclerView.D d4, int i4, View view, int i5, ViewPropertyAnimator viewPropertyAnimator) {
            this.f6563a = d4;
            this.f6564b = i4;
            this.f6565c = view;
            this.f6566d = i5;
            this.f6567e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f6564b != 0) {
                this.f6565c.setTranslationX(0.0f);
            }
            if (this.f6566d != 0) {
                this.f6565c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f6567e.setListener((Animator.AnimatorListener) null);
            g.this.E(this.f6563a);
            g.this.f6546p.remove(this.f6563a);
            g.this.V();
        }

        public void onAnimationStart(Animator animator) {
            g.this.F(this.f6563a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$g  reason: collision with other inner class name */
    class C0106g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f6569a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f6570b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f6571c;

        C0106g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f6569a = iVar;
            this.f6570b = viewPropertyAnimator;
            this.f6571c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f6570b.setListener((Animator.AnimatorListener) null);
            this.f6571c.setAlpha(1.0f);
            this.f6571c.setTranslationX(0.0f);
            this.f6571c.setTranslationY(0.0f);
            g.this.C(this.f6569a.f6577a, true);
            g.this.f6548r.remove(this.f6569a.f6577a);
            g.this.V();
        }

        public void onAnimationStart(Animator animator) {
            g.this.D(this.f6569a.f6577a, true);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f6573a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f6574b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f6575c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f6573a = iVar;
            this.f6574b = viewPropertyAnimator;
            this.f6575c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f6574b.setListener((Animator.AnimatorListener) null);
            this.f6575c.setAlpha(1.0f);
            this.f6575c.setTranslationX(0.0f);
            this.f6575c.setTranslationY(0.0f);
            g.this.C(this.f6573a.f6578b, false);
            g.this.f6548r.remove(this.f6573a.f6578b);
            g.this.V();
        }

        public void onAnimationStart(Animator animator) {
            g.this.D(this.f6573a.f6578b, false);
        }
    }

    private static class j {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.D f6583a;

        /* renamed from: b  reason: collision with root package name */
        public int f6584b;

        /* renamed from: c  reason: collision with root package name */
        public int f6585c;

        /* renamed from: d  reason: collision with root package name */
        public int f6586d;

        /* renamed from: e  reason: collision with root package name */
        public int f6587e;

        j(RecyclerView.D d4, int i4, int i5, int i6, int i7) {
            this.f6583a = d4;
            this.f6584b = i4;
            this.f6585c = i5;
            this.f6586d = i6;
            this.f6587e = i7;
        }
    }

    private void T(RecyclerView.D d4) {
        View view = d4.f6318a;
        ViewPropertyAnimator animate = view.animate();
        this.f6547q.add(d4);
        animate.setDuration(o()).alpha(0.0f).setListener(new d(d4, animate, view)).start();
    }

    private void W(List list, RecyclerView.D d4) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (Y(iVar, d4) && iVar.f6577a == null && iVar.f6578b == null) {
                list.remove(iVar);
            }
        }
    }

    private void X(i iVar) {
        RecyclerView.D d4 = iVar.f6577a;
        if (d4 != null) {
            Y(iVar, d4);
        }
        RecyclerView.D d5 = iVar.f6578b;
        if (d5 != null) {
            Y(iVar, d5);
        }
    }

    private boolean Y(i iVar, RecyclerView.D d4) {
        boolean z3 = false;
        if (iVar.f6578b == d4) {
            iVar.f6578b = null;
        } else if (iVar.f6577a != d4) {
            return false;
        } else {
            iVar.f6577a = null;
            z3 = true;
        }
        d4.f6318a.setAlpha(1.0f);
        d4.f6318a.setTranslationX(0.0f);
        d4.f6318a.setTranslationY(0.0f);
        C(d4, z3);
        return true;
    }

    private void Z(RecyclerView.D d4) {
        if (f6537s == null) {
            f6537s = new ValueAnimator().getInterpolator();
        }
        d4.f6318a.animate().setInterpolator(f6537s);
        j(d4);
    }

    /* access modifiers changed from: package-private */
    public void Q(RecyclerView.D d4) {
        View view = d4.f6318a;
        ViewPropertyAnimator animate = view.animate();
        this.f6545o.add(d4);
        animate.alpha(1.0f).setDuration(l()).setListener(new e(d4, view, animate)).start();
    }

    /* access modifiers changed from: package-private */
    public void R(i iVar) {
        View view;
        RecyclerView.D d4 = iVar.f6577a;
        View view2 = null;
        if (d4 == null) {
            view = null;
        } else {
            view = d4.f6318a;
        }
        RecyclerView.D d5 = iVar.f6578b;
        if (d5 != null) {
            view2 = d5.f6318a;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f6548r.add(iVar.f6577a);
            duration.translationX((float) (iVar.f6581e - iVar.f6579c));
            duration.translationY((float) (iVar.f6582f - iVar.f6580d));
            duration.alpha(0.0f).setListener(new C0106g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f6548r.add(iVar.f6578b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    /* access modifiers changed from: package-private */
    public void S(RecyclerView.D d4, int i4, int i5, int i6, int i7) {
        View view = d4.f6318a;
        int i8 = i6 - i4;
        int i9 = i7 - i5;
        if (i8 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i9 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f6546p.add(d4);
        animate.setDuration(n()).setListener(new f(d4, i8, view, i9, animate)).start();
    }

    /* access modifiers changed from: package-private */
    public void U(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.D) list.get(size)).f6318a.animate().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public void V() {
        if (!p()) {
            i();
        }
    }

    public boolean g(RecyclerView.D d4, List list) {
        if (!list.isEmpty() || super.g(d4, list)) {
            return true;
        }
        return false;
    }

    public void j(RecyclerView.D d4) {
        View view = d4.f6318a;
        view.animate().cancel();
        int size = this.f6540j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((j) this.f6540j.get(size)).f6583a == d4) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(d4);
                this.f6540j.remove(size);
            }
        }
        W(this.f6541k, d4);
        if (this.f6538h.remove(d4)) {
            view.setAlpha(1.0f);
            G(d4);
        }
        if (this.f6539i.remove(d4)) {
            view.setAlpha(1.0f);
            A(d4);
        }
        for (int size2 = this.f6544n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f6544n.get(size2);
            W(arrayList, d4);
            if (arrayList.isEmpty()) {
                this.f6544n.remove(size2);
            }
        }
        for (int size3 = this.f6543m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f6543m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((j) arrayList2.get(size4)).f6583a == d4) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(d4);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f6543m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f6542l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f6542l.get(size5);
            if (arrayList3.remove(d4)) {
                view.setAlpha(1.0f);
                A(d4);
                if (arrayList3.isEmpty()) {
                    this.f6542l.remove(size5);
                }
            }
        }
        this.f6547q.remove(d4);
        this.f6545o.remove(d4);
        this.f6548r.remove(d4);
        this.f6546p.remove(d4);
        V();
    }

    public void k() {
        int size = this.f6540j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f6540j.get(size);
            View view = jVar.f6583a.f6318a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f6583a);
            this.f6540j.remove(size);
        }
        for (int size2 = this.f6538h.size() - 1; size2 >= 0; size2--) {
            G((RecyclerView.D) this.f6538h.get(size2));
            this.f6538h.remove(size2);
        }
        int size3 = this.f6539i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.D d4 = (RecyclerView.D) this.f6539i.get(size3);
            d4.f6318a.setAlpha(1.0f);
            A(d4);
            this.f6539i.remove(size3);
        }
        for (int size4 = this.f6541k.size() - 1; size4 >= 0; size4--) {
            X((i) this.f6541k.get(size4));
        }
        this.f6541k.clear();
        if (p()) {
            for (int size5 = this.f6543m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f6543m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f6583a.f6318a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f6583a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f6543m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f6542l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f6542l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.D d5 = (RecyclerView.D) arrayList2.get(size8);
                    d5.f6318a.setAlpha(1.0f);
                    A(d5);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f6542l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f6544n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f6544n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f6544n.remove(arrayList3);
                    }
                }
            }
            U(this.f6547q);
            U(this.f6546p);
            U(this.f6545o);
            U(this.f6548r);
            i();
        }
    }

    public boolean p() {
        if (!this.f6539i.isEmpty() || !this.f6541k.isEmpty() || !this.f6540j.isEmpty() || !this.f6538h.isEmpty() || !this.f6546p.isEmpty() || !this.f6547q.isEmpty() || !this.f6545o.isEmpty() || !this.f6548r.isEmpty() || !this.f6543m.isEmpty() || !this.f6542l.isEmpty() || !this.f6544n.isEmpty()) {
            return true;
        }
        return false;
    }

    public void u() {
        long j4;
        long j5;
        boolean isEmpty = this.f6538h.isEmpty();
        boolean isEmpty2 = this.f6540j.isEmpty();
        boolean isEmpty3 = this.f6541k.isEmpty();
        boolean isEmpty4 = this.f6539i.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            Iterator it = this.f6538h.iterator();
            while (it.hasNext()) {
                T((RecyclerView.D) it.next());
            }
            this.f6538h.clear();
            if (!isEmpty2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f6540j);
                this.f6543m.add(arrayList);
                this.f6540j.clear();
                a aVar = new a(arrayList);
                if (!isEmpty) {
                    P.h0(((j) arrayList.get(0)).f6583a.f6318a, aVar, o());
                } else {
                    aVar.run();
                }
            }
            if (!isEmpty3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f6541k);
                this.f6544n.add(arrayList2);
                this.f6541k.clear();
                b bVar = new b(arrayList2);
                if (!isEmpty) {
                    P.h0(((i) arrayList2.get(0)).f6577a.f6318a, bVar, o());
                } else {
                    bVar.run();
                }
            }
            if (!isEmpty4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f6539i);
                this.f6542l.add(arrayList3);
                this.f6539i.clear();
                c cVar = new c(arrayList3);
                if (!isEmpty || !isEmpty2 || !isEmpty3) {
                    long j6 = 0;
                    if (!isEmpty) {
                        j4 = o();
                    } else {
                        j4 = 0;
                    }
                    if (!isEmpty2) {
                        j5 = n();
                    } else {
                        j5 = 0;
                    }
                    if (!isEmpty3) {
                        j6 = m();
                    }
                    P.h0(((RecyclerView.D) arrayList3.get(0)).f6318a, cVar, j4 + Math.max(j5, j6));
                    return;
                }
                cVar.run();
            }
        }
    }

    public boolean w(RecyclerView.D d4) {
        Z(d4);
        d4.f6318a.setAlpha(0.0f);
        this.f6539i.add(d4);
        return true;
    }

    public boolean x(RecyclerView.D d4, RecyclerView.D d5, int i4, int i5, int i6, int i7) {
        if (d4 == d5) {
            return y(d4, i4, i5, i6, i7);
        }
        float translationX = d4.f6318a.getTranslationX();
        float translationY = d4.f6318a.getTranslationY();
        float alpha = d4.f6318a.getAlpha();
        Z(d4);
        int i8 = (int) (((float) (i6 - i4)) - translationX);
        int i9 = (int) (((float) (i7 - i5)) - translationY);
        d4.f6318a.setTranslationX(translationX);
        d4.f6318a.setTranslationY(translationY);
        d4.f6318a.setAlpha(alpha);
        if (d5 != null) {
            Z(d5);
            d5.f6318a.setTranslationX((float) (-i8));
            d5.f6318a.setTranslationY((float) (-i9));
            d5.f6318a.setAlpha(0.0f);
        }
        this.f6541k.add(new i(d4, d5, i4, i5, i6, i7));
        return true;
    }

    public boolean y(RecyclerView.D d4, int i4, int i5, int i6, int i7) {
        View view = d4.f6318a;
        int translationX = i4 + ((int) view.getTranslationX());
        int translationY = i5 + ((int) d4.f6318a.getTranslationY());
        Z(d4);
        int i8 = i6 - translationX;
        int i9 = i7 - translationY;
        if (i8 == 0 && i9 == 0) {
            E(d4);
            return false;
        }
        if (i8 != 0) {
            view.setTranslationX((float) (-i8));
        }
        if (i9 != 0) {
            view.setTranslationY((float) (-i9));
        }
        this.f6540j.add(new j(d4, translationX, translationY, i6, i7));
        return true;
    }

    public boolean z(RecyclerView.D d4) {
        Z(d4);
        this.f6538h.add(d4);
        return true;
    }

    private static class i {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.D f6577a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.D f6578b;

        /* renamed from: c  reason: collision with root package name */
        public int f6579c;

        /* renamed from: d  reason: collision with root package name */
        public int f6580d;

        /* renamed from: e  reason: collision with root package name */
        public int f6581e;

        /* renamed from: f  reason: collision with root package name */
        public int f6582f;

        private i(RecyclerView.D d4, RecyclerView.D d5) {
            this.f6577a = d4;
            this.f6578b = d5;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f6577a + ", newHolder=" + this.f6578b + ", fromX=" + this.f6579c + ", fromY=" + this.f6580d + ", toX=" + this.f6581e + ", toY=" + this.f6582f + '}';
        }

        i(RecyclerView.D d4, RecyclerView.D d5, int i4, int i5, int i6, int i7) {
            this(d4, d5);
            this.f6579c = i4;
            this.f6580d = i5;
            this.f6581e = i6;
            this.f6582f = i7;
        }
    }
}
