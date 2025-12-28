package d0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.core.view.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import y.C0939a;
import y.C0942d;
import y.g;

/* renamed from: d0.l  reason: case insensitive filesystem */
public abstract class C0621l implements Cloneable {

    /* renamed from: K  reason: collision with root package name */
    private static final int[] f13461K = {2, 1, 3, 4};

    /* renamed from: L  reason: collision with root package name */
    private static final C0616g f13462L = new a();

    /* renamed from: M  reason: collision with root package name */
    private static ThreadLocal f13463M = new ThreadLocal();

    /* renamed from: A  reason: collision with root package name */
    boolean f13464A = false;

    /* renamed from: B  reason: collision with root package name */
    ArrayList f13465B = new ArrayList();

    /* renamed from: C  reason: collision with root package name */
    private int f13466C = 0;

    /* renamed from: D  reason: collision with root package name */
    private boolean f13467D = false;

    /* renamed from: E  reason: collision with root package name */
    private boolean f13468E = false;

    /* renamed from: F  reason: collision with root package name */
    private ArrayList f13469F = null;

    /* renamed from: G  reason: collision with root package name */
    private ArrayList f13470G = new ArrayList();

    /* renamed from: H  reason: collision with root package name */
    private e f13471H;

    /* renamed from: I  reason: collision with root package name */
    private C0939a f13472I;

    /* renamed from: J  reason: collision with root package name */
    private C0616g f13473J = f13462L;

    /* renamed from: a  reason: collision with root package name */
    private String f13474a = getClass().getName();

    /* renamed from: b  reason: collision with root package name */
    private long f13475b = -1;

    /* renamed from: c  reason: collision with root package name */
    long f13476c = -1;

    /* renamed from: d  reason: collision with root package name */
    private TimeInterpolator f13477d = null;

    /* renamed from: e  reason: collision with root package name */
    ArrayList f13478e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    ArrayList f13479f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private ArrayList f13480g = null;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList f13481h = null;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList f13482i = null;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList f13483j = null;

    /* renamed from: k  reason: collision with root package name */
    private ArrayList f13484k = null;

    /* renamed from: l  reason: collision with root package name */
    private ArrayList f13485l = null;

    /* renamed from: m  reason: collision with root package name */
    private ArrayList f13486m = null;

    /* renamed from: n  reason: collision with root package name */
    private ArrayList f13487n = null;

    /* renamed from: o  reason: collision with root package name */
    private ArrayList f13488o = null;

    /* renamed from: p  reason: collision with root package name */
    private C0629t f13489p = new C0629t();

    /* renamed from: q  reason: collision with root package name */
    private C0629t f13490q = new C0629t();

    /* renamed from: v  reason: collision with root package name */
    C0625p f13491v = null;

    /* renamed from: w  reason: collision with root package name */
    private int[] f13492w = f13461K;

    /* renamed from: x  reason: collision with root package name */
    private ArrayList f13493x;

    /* renamed from: y  reason: collision with root package name */
    private ArrayList f13494y;

    /* renamed from: z  reason: collision with root package name */
    private ViewGroup f13495z = null;

    /* renamed from: d0.l$a */
    static class a extends C0616g {
        a() {
        }

        public Path a(float f4, float f5, float f6, float f7) {
            Path path = new Path();
            path.moveTo(f4, f5);
            path.lineTo(f6, f7);
            return path;
        }
    }

    /* renamed from: d0.l$b */
    class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0939a f13496a;

        b(C0939a aVar) {
            this.f13496a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f13496a.remove(animator);
            C0621l.this.f13465B.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            C0621l.this.f13465B.add(animator);
        }
    }

    /* renamed from: d0.l$c */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        public void onAnimationEnd(Animator animator) {
            C0621l.this.t();
            animator.removeListener(this);
        }
    }

    /* renamed from: d0.l$d */
    private static class d {

        /* renamed from: a  reason: collision with root package name */
        View f13499a;

        /* renamed from: b  reason: collision with root package name */
        String f13500b;

        /* renamed from: c  reason: collision with root package name */
        C0628s f13501c;

        /* renamed from: d  reason: collision with root package name */
        C0609P f13502d;

        /* renamed from: e  reason: collision with root package name */
        C0621l f13503e;

        d(View view, String str, C0621l lVar, C0609P p4, C0628s sVar) {
            this.f13499a = view;
            this.f13500b = str;
            this.f13501c = sVar;
            this.f13502d = p4;
            this.f13503e = lVar;
        }
    }

    /* renamed from: d0.l$e */
    public static abstract class e {
    }

    /* renamed from: d0.l$f */
    public interface f {
        void a(C0621l lVar);

        void b(C0621l lVar);

        void c(C0621l lVar);

        void d(C0621l lVar);

        void e(C0621l lVar);
    }

    private static C0939a B() {
        C0939a aVar = (C0939a) f13463M.get();
        if (aVar != null) {
            return aVar;
        }
        C0939a aVar2 = new C0939a();
        f13463M.set(aVar2);
        return aVar2;
    }

    private static boolean L(C0628s sVar, C0628s sVar2, String str) {
        Object obj = sVar.f13522a.get(str);
        Object obj2 = sVar2.f13522a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void M(C0939a aVar, C0939a aVar2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) sparseArray.valueAt(i4);
            if (view2 != null && K(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i4))) != null && K(view)) {
                C0628s sVar = (C0628s) aVar.get(view2);
                C0628s sVar2 = (C0628s) aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f13493x.add(sVar);
                    this.f13494y.add(sVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void N(C0939a aVar, C0939a aVar2) {
        C0628s sVar;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.j(size);
            if (view != null && K(view) && (sVar = (C0628s) aVar2.remove(view)) != null && K(sVar.f13523b)) {
                this.f13493x.add((C0628s) aVar.l(size));
                this.f13494y.add(sVar);
            }
        }
    }

    private void O(C0939a aVar, C0939a aVar2, C0942d dVar, C0942d dVar2) {
        View view;
        int q4 = dVar.q();
        for (int i4 = 0; i4 < q4; i4++) {
            View view2 = (View) dVar.r(i4);
            if (view2 != null && K(view2) && (view = (View) dVar2.i(dVar.l(i4))) != null && K(view)) {
                C0628s sVar = (C0628s) aVar.get(view2);
                C0628s sVar2 = (C0628s) aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f13493x.add(sVar);
                    this.f13494y.add(sVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void P(C0939a aVar, C0939a aVar2, C0939a aVar3, C0939a aVar4) {
        View view;
        int size = aVar3.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) aVar3.n(i4);
            if (view2 != null && K(view2) && (view = (View) aVar4.get(aVar3.j(i4))) != null && K(view)) {
                C0628s sVar = (C0628s) aVar.get(view2);
                C0628s sVar2 = (C0628s) aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f13493x.add(sVar);
                    this.f13494y.add(sVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void Q(C0629t tVar, C0629t tVar2) {
        C0939a aVar = new C0939a((g) tVar.f13525a);
        C0939a aVar2 = new C0939a((g) tVar2.f13525a);
        int i4 = 0;
        while (true) {
            int[] iArr = this.f13492w;
            if (i4 < iArr.length) {
                int i5 = iArr[i4];
                if (i5 == 1) {
                    N(aVar, aVar2);
                } else if (i5 == 2) {
                    P(aVar, aVar2, tVar.f13528d, tVar2.f13528d);
                } else if (i5 == 3) {
                    M(aVar, aVar2, tVar.f13526b, tVar2.f13526b);
                } else if (i5 == 4) {
                    O(aVar, aVar2, tVar.f13527c, tVar2.f13527c);
                }
                i4++;
            } else {
                d(aVar, aVar2);
                return;
            }
        }
    }

    private void W(Animator animator, C0939a aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            i(animator);
        }
    }

    private void d(C0939a aVar, C0939a aVar2) {
        for (int i4 = 0; i4 < aVar.size(); i4++) {
            C0628s sVar = (C0628s) aVar.n(i4);
            if (K(sVar.f13523b)) {
                this.f13493x.add(sVar);
                this.f13494y.add((Object) null);
            }
        }
        for (int i5 = 0; i5 < aVar2.size(); i5++) {
            C0628s sVar2 = (C0628s) aVar2.n(i5);
            if (K(sVar2.f13523b)) {
                this.f13494y.add(sVar2);
                this.f13493x.add((Object) null);
            }
        }
    }

    private static void g(C0629t tVar, View view, C0628s sVar) {
        tVar.f13525a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f13526b.indexOfKey(id) >= 0) {
                tVar.f13526b.put(id, (Object) null);
            } else {
                tVar.f13526b.put(id, view);
            }
        }
        String J3 = P.J(view);
        if (J3 != null) {
            if (tVar.f13528d.containsKey(J3)) {
                tVar.f13528d.put(J3, (Object) null);
            } else {
                tVar.f13528d.put(J3, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f13527c.k(itemIdAtPosition) >= 0) {
                    View view2 = (View) tVar.f13527c.i(itemIdAtPosition);
                    if (view2 != null) {
                        P.x0(view2, false);
                        tVar.f13527c.n(itemIdAtPosition, (Object) null);
                        return;
                    }
                    return;
                }
                P.x0(view, true);
                tVar.f13527c.n(itemIdAtPosition, view);
            }
        }
    }

    private void k(View view, boolean z3) {
        if (view != null) {
            int id = view.getId();
            ArrayList arrayList = this.f13482i;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList arrayList2 = this.f13483j;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList arrayList3 = this.f13484k;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i4 = 0;
                        while (i4 < size) {
                            if (!((Class) this.f13484k.get(i4)).isInstance(view)) {
                                i4++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        C0628s sVar = new C0628s(view);
                        if (z3) {
                            n(sVar);
                        } else {
                            j(sVar);
                        }
                        sVar.f13524c.add(this);
                        l(sVar);
                        if (z3) {
                            g(this.f13489p, view, sVar);
                        } else {
                            g(this.f13490q, view, sVar);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList arrayList4 = this.f13486m;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList arrayList5 = this.f13487n;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList arrayList6 = this.f13488o;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i5 = 0;
                                    while (i5 < size2) {
                                        if (!((Class) this.f13488o.get(i5)).isInstance(view)) {
                                            i5++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                                    k(viewGroup.getChildAt(i6), z3);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public C0624o A() {
        return null;
    }

    public long C() {
        return this.f13475b;
    }

    public List D() {
        return this.f13478e;
    }

    public List E() {
        return this.f13480g;
    }

    public List F() {
        return this.f13481h;
    }

    public List G() {
        return this.f13479f;
    }

    public String[] H() {
        return null;
    }

    public C0628s I(View view, boolean z3) {
        C0629t tVar;
        C0625p pVar = this.f13491v;
        if (pVar != null) {
            return pVar.I(view, z3);
        }
        if (z3) {
            tVar = this.f13489p;
        } else {
            tVar = this.f13490q;
        }
        return (C0628s) tVar.f13525a.get(view);
    }

    public boolean J(C0628s sVar, C0628s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] H3 = H();
        if (H3 != null) {
            int length = H3.length;
            int i4 = 0;
            while (i4 < length) {
                if (!L(sVar, sVar2, H3[i4])) {
                    i4++;
                }
            }
            return false;
        }
        for (String L3 : sVar.f13522a.keySet()) {
            if (L(sVar, sVar2, L3)) {
            }
        }
        return false;
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean K(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.f13482i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList4 = this.f13483j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f13484k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((Class) this.f13484k.get(i4)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f13485l != null && P.J(view) != null && this.f13485l.contains(P.J(view))) {
            return false;
        }
        if ((this.f13478e.size() == 0 && this.f13479f.size() == 0 && (((arrayList = this.f13481h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f13480g) == null || arrayList2.isEmpty()))) || this.f13478e.contains(Integer.valueOf(id)) || this.f13479f.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f13480g;
        if (arrayList6 != null && arrayList6.contains(P.J(view))) {
            return true;
        }
        if (this.f13481h != null) {
            for (int i5 = 0; i5 < this.f13481h.size(); i5++) {
                if (((Class) this.f13481h.get(i5)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void R(View view) {
        if (!this.f13468E) {
            C0939a B3 = B();
            int size = B3.size();
            C0609P d4 = C0594A.d(view);
            for (int i4 = size - 1; i4 >= 0; i4--) {
                d dVar = (d) B3.n(i4);
                if (dVar.f13499a != null && d4.equals(dVar.f13502d)) {
                    C0610a.b((Animator) B3.j(i4));
                }
            }
            ArrayList arrayList = this.f13469F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f13469F.clone();
                int size2 = arrayList2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    ((f) arrayList2.get(i5)).c(this);
                }
            }
            this.f13467D = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: d0.s} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void S(android.view.ViewGroup r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f13493x = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f13494y = r0
            d0.t r0 = r10.f13489p
            d0.t r1 = r10.f13490q
            r10.Q(r0, r1)
            y.a r0 = B()
            int r1 = r0.size()
            d0.P r2 = d0.C0594A.d(r11)
            r3 = 1
            int r1 = r1 - r3
        L_0x0023:
            if (r1 < 0) goto L_0x007f
            java.lang.Object r4 = r0.j(r1)
            android.animation.Animator r4 = (android.animation.Animator) r4
            if (r4 == 0) goto L_0x007c
            java.lang.Object r5 = r0.get(r4)
            d0.l$d r5 = (d0.C0621l.d) r5
            if (r5 == 0) goto L_0x007c
            android.view.View r6 = r5.f13499a
            if (r6 == 0) goto L_0x007c
            d0.P r6 = r5.f13502d
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x007c
            d0.s r6 = r5.f13501c
            android.view.View r7 = r5.f13499a
            d0.s r8 = r10.I(r7, r3)
            d0.s r9 = r10.x(r7, r3)
            if (r8 != 0) goto L_0x005c
            if (r9 != 0) goto L_0x005c
            d0.t r9 = r10.f13490q
            y.a r9 = r9.f13525a
            java.lang.Object r7 = r9.get(r7)
            r9 = r7
            d0.s r9 = (d0.C0628s) r9
        L_0x005c:
            if (r8 != 0) goto L_0x0060
            if (r9 == 0) goto L_0x007c
        L_0x0060:
            d0.l r5 = r5.f13503e
            boolean r5 = r5.J(r6, r9)
            if (r5 == 0) goto L_0x007c
            boolean r5 = r4.isRunning()
            if (r5 != 0) goto L_0x0079
            boolean r5 = r4.isStarted()
            if (r5 == 0) goto L_0x0075
            goto L_0x0079
        L_0x0075:
            r0.remove(r4)
            goto L_0x007c
        L_0x0079:
            r4.cancel()
        L_0x007c:
            int r1 = r1 + -1
            goto L_0x0023
        L_0x007f:
            d0.t r6 = r10.f13489p
            d0.t r7 = r10.f13490q
            java.util.ArrayList r8 = r10.f13493x
            java.util.ArrayList r9 = r10.f13494y
            r4 = r10
            r5 = r11
            r4.s(r5, r6, r7, r8, r9)
            r10.X()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.C0621l.S(android.view.ViewGroup):void");
    }

    public C0621l T(f fVar) {
        ArrayList arrayList = this.f13469F;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f13469F.size() == 0) {
            this.f13469F = null;
        }
        return this;
    }

    public C0621l U(View view) {
        this.f13479f.remove(view);
        return this;
    }

    public void V(View view) {
        if (this.f13467D) {
            if (!this.f13468E) {
                C0939a B3 = B();
                int size = B3.size();
                C0609P d4 = C0594A.d(view);
                for (int i4 = size - 1; i4 >= 0; i4--) {
                    d dVar = (d) B3.n(i4);
                    if (dVar.f13499a != null && d4.equals(dVar.f13502d)) {
                        C0610a.c((Animator) B3.j(i4));
                    }
                }
                ArrayList arrayList = this.f13469F;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f13469F.clone();
                    int size2 = arrayList2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        ((f) arrayList2.get(i5)).d(this);
                    }
                }
            }
            this.f13467D = false;
        }
    }

    /* access modifiers changed from: protected */
    public void X() {
        e0();
        C0939a B3 = B();
        Iterator it = this.f13470G.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (B3.containsKey(animator)) {
                e0();
                W(animator, B3);
            }
        }
        this.f13470G.clear();
        t();
    }

    public C0621l Y(long j4) {
        this.f13476c = j4;
        return this;
    }

    public void Z(e eVar) {
        this.f13471H = eVar;
    }

    public C0621l a0(TimeInterpolator timeInterpolator) {
        this.f13477d = timeInterpolator;
        return this;
    }

    public C0621l b(f fVar) {
        if (this.f13469F == null) {
            this.f13469F = new ArrayList();
        }
        this.f13469F.add(fVar);
        return this;
    }

    public void b0(C0616g gVar) {
        if (gVar == null) {
            this.f13473J = f13462L;
        } else {
            this.f13473J = gVar;
        }
    }

    public C0621l c(View view) {
        this.f13479f.add(view);
        return this;
    }

    public void c0(C0624o oVar) {
    }

    /* access modifiers changed from: protected */
    public void cancel() {
        for (int size = this.f13465B.size() - 1; size >= 0; size--) {
            ((Animator) this.f13465B.get(size)).cancel();
        }
        ArrayList arrayList = this.f13469F;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f13469F.clone();
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ((f) arrayList2.get(i4)).b(this);
            }
        }
    }

    public C0621l d0(long j4) {
        this.f13475b = j4;
        return this;
    }

    /* access modifiers changed from: protected */
    public void e0() {
        if (this.f13466C == 0) {
            ArrayList arrayList = this.f13469F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f13469F.clone();
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((f) arrayList2.get(i4)).a(this);
                }
            }
            this.f13468E = false;
        }
        this.f13466C++;
    }

    /* access modifiers changed from: package-private */
    public String f0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f13476c != -1) {
            str2 = str2 + "dur(" + this.f13476c + ") ";
        }
        if (this.f13475b != -1) {
            str2 = str2 + "dly(" + this.f13475b + ") ";
        }
        if (this.f13477d != null) {
            str2 = str2 + "interp(" + this.f13477d + ") ";
        }
        if (this.f13478e.size() <= 0 && this.f13479f.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f13478e.size() > 0) {
            for (int i4 = 0; i4 < this.f13478e.size(); i4++) {
                if (i4 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f13478e.get(i4);
            }
        }
        if (this.f13479f.size() > 0) {
            for (int i5 = 0; i5 < this.f13479f.size(); i5++) {
                if (i5 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f13479f.get(i5);
            }
        }
        return str3 + ")";
    }

    /* access modifiers changed from: protected */
    public void i(Animator animator) {
        if (animator == null) {
            t();
            return;
        }
        if (u() >= 0) {
            animator.setDuration(u());
        }
        if (C() >= 0) {
            animator.setStartDelay(C() + animator.getStartDelay());
        }
        if (w() != null) {
            animator.setInterpolator(w());
        }
        animator.addListener(new c());
        animator.start();
    }

    public abstract void j(C0628s sVar);

    /* access modifiers changed from: package-private */
    public void l(C0628s sVar) {
    }

    public abstract void n(C0628s sVar);

    /* access modifiers changed from: package-private */
    public void o(ViewGroup viewGroup, boolean z3) {
        C0939a aVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        p(z3);
        if ((this.f13478e.size() > 0 || this.f13479f.size() > 0) && (((arrayList = this.f13480g) == null || arrayList.isEmpty()) && ((arrayList2 = this.f13481h) == null || arrayList2.isEmpty()))) {
            for (int i4 = 0; i4 < this.f13478e.size(); i4++) {
                View findViewById = viewGroup.findViewById(((Integer) this.f13478e.get(i4)).intValue());
                if (findViewById != null) {
                    C0628s sVar = new C0628s(findViewById);
                    if (z3) {
                        n(sVar);
                    } else {
                        j(sVar);
                    }
                    sVar.f13524c.add(this);
                    l(sVar);
                    if (z3) {
                        g(this.f13489p, findViewById, sVar);
                    } else {
                        g(this.f13490q, findViewById, sVar);
                    }
                }
            }
            for (int i5 = 0; i5 < this.f13479f.size(); i5++) {
                View view = (View) this.f13479f.get(i5);
                C0628s sVar2 = new C0628s(view);
                if (z3) {
                    n(sVar2);
                } else {
                    j(sVar2);
                }
                sVar2.f13524c.add(this);
                l(sVar2);
                if (z3) {
                    g(this.f13489p, view, sVar2);
                } else {
                    g(this.f13490q, view, sVar2);
                }
            }
        } else {
            k(viewGroup, z3);
        }
        if (!z3 && (aVar = this.f13472I) != null) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i6 = 0; i6 < size; i6++) {
                arrayList3.add(this.f13489p.f13528d.remove((String) this.f13472I.j(i6)));
            }
            for (int i7 = 0; i7 < size; i7++) {
                View view2 = (View) arrayList3.get(i7);
                if (view2 != null) {
                    this.f13489p.f13528d.put((String) this.f13472I.n(i7), view2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void p(boolean z3) {
        if (z3) {
            this.f13489p.f13525a.clear();
            this.f13489p.f13526b.clear();
            this.f13489p.f13527c.c();
            return;
        }
        this.f13490q.f13525a.clear();
        this.f13490q.f13526b.clear();
        this.f13490q.f13527c.c();
    }

    /* renamed from: q */
    public C0621l clone() {
        try {
            C0621l lVar = (C0621l) super.clone();
            lVar.f13470G = new ArrayList();
            lVar.f13489p = new C0629t();
            lVar.f13490q = new C0629t();
            lVar.f13493x = null;
            lVar.f13494y = null;
            return lVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator r(ViewGroup viewGroup, C0628s sVar, C0628s sVar2) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void s(ViewGroup viewGroup, C0629t tVar, C0629t tVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i4;
        Animator animator;
        C0628s sVar;
        View view;
        C0628s sVar2;
        Animator animator2;
        C0939a B3 = B();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            C0628s sVar3 = (C0628s) arrayList.get(i5);
            C0628s sVar4 = (C0628s) arrayList2.get(i5);
            if (sVar3 != null && !sVar3.f13524c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f13524c.contains(this)) {
                sVar4 = null;
            }
            if (!(sVar3 == null && sVar4 == null) && (sVar3 == null || sVar4 == null || J(sVar3, sVar4))) {
                Animator r4 = r(viewGroup, sVar3, sVar4);
                if (r4 != null) {
                    if (sVar4 != null) {
                        View view2 = sVar4.f13523b;
                        String[] H3 = H();
                        if (H3 != null && H3.length > 0) {
                            sVar2 = new C0628s(view2);
                            C0628s sVar5 = (C0628s) tVar2.f13525a.get(view2);
                            if (sVar5 != null) {
                                int i6 = 0;
                                while (i6 < H3.length) {
                                    Map map = sVar2.f13522a;
                                    Animator animator3 = r4;
                                    String str = H3[i6];
                                    map.put(str, sVar5.f13522a.get(str));
                                    i6++;
                                    r4 = animator3;
                                    H3 = H3;
                                }
                            }
                            Animator animator4 = r4;
                            int size2 = B3.size();
                            int i7 = 0;
                            while (true) {
                                if (i7 >= size2) {
                                    animator2 = animator4;
                                    break;
                                }
                                d dVar = (d) B3.get((Animator) B3.j(i7));
                                if (dVar.f13501c != null && dVar.f13499a == view2 && dVar.f13500b.equals(y()) && dVar.f13501c.equals(sVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            C0629t tVar3 = tVar2;
                            animator2 = r4;
                            sVar2 = null;
                        }
                        view = view2;
                        animator = animator2;
                        sVar = sVar2;
                    } else {
                        C0629t tVar4 = tVar2;
                        view = sVar3.f13523b;
                        animator = r4;
                        sVar = null;
                    }
                    if (animator != null) {
                        i4 = size;
                        d dVar2 = r0;
                        d dVar3 = new d(view, y(), this, C0594A.d(viewGroup), sVar);
                        B3.put(animator, dVar2);
                        this.f13470G.add(animator);
                        i5++;
                        size = i4;
                    }
                    i4 = size;
                    i5++;
                    size = i4;
                }
            } else {
                ViewGroup viewGroup2 = viewGroup;
            }
            C0629t tVar5 = tVar2;
            i4 = size;
            i5++;
            size = i4;
        }
        if (sparseIntArray.size() != 0) {
            for (int i8 = 0; i8 < sparseIntArray.size(); i8++) {
                Animator animator5 = (Animator) this.f13470G.get(sparseIntArray.keyAt(i8));
                animator5.setStartDelay((((long) sparseIntArray.valueAt(i8)) - Long.MAX_VALUE) + animator5.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void t() {
        int i4 = this.f13466C - 1;
        this.f13466C = i4;
        if (i4 == 0) {
            ArrayList arrayList = this.f13469F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f13469F.clone();
                int size = arrayList2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((f) arrayList2.get(i5)).e(this);
                }
            }
            for (int i6 = 0; i6 < this.f13489p.f13527c.q(); i6++) {
                View view = (View) this.f13489p.f13527c.r(i6);
                if (view != null) {
                    P.x0(view, false);
                }
            }
            for (int i7 = 0; i7 < this.f13490q.f13527c.q(); i7++) {
                View view2 = (View) this.f13490q.f13527c.r(i7);
                if (view2 != null) {
                    P.x0(view2, false);
                }
            }
            this.f13468E = true;
        }
    }

    public String toString() {
        return f0("");
    }

    public long u() {
        return this.f13476c;
    }

    public e v() {
        return this.f13471H;
    }

    public TimeInterpolator w() {
        return this.f13477d;
    }

    /* access modifiers changed from: package-private */
    public C0628s x(View view, boolean z3) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C0625p pVar = this.f13491v;
        if (pVar != null) {
            return pVar.x(view, z3);
        }
        if (z3) {
            arrayList = this.f13493x;
        } else {
            arrayList = this.f13494y;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            }
            C0628s sVar = (C0628s) arrayList.get(i4);
            if (sVar == null) {
                return null;
            }
            if (sVar.f13523b == view) {
                break;
            }
            i4++;
        }
        if (i4 < 0) {
            return null;
        }
        if (z3) {
            arrayList2 = this.f13494y;
        } else {
            arrayList2 = this.f13493x;
        }
        return (C0628s) arrayList2.get(i4);
    }

    public String y() {
        return this.f13474a;
    }

    public C0616g z() {
        return this.f13473J;
    }
}
