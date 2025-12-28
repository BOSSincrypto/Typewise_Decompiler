package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.os.e;
import androidx.core.view.P;
import androidx.core.view.T;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import y.C0939a;

/* renamed from: androidx.fragment.app.d  reason: case insensitive filesystem */
class C0449d extends SpecialEffectsController {

    /* renamed from: androidx.fragment.app.d$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5748a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.fragment.app.SpecialEffectsController$Operation$State[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5748a = r0
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5748a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5748a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5748a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0449d.a.<clinit>():void");
        }
    }

    /* renamed from: androidx.fragment.app.d$b */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f5749a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SpecialEffectsController.Operation f5750b;

        b(List list, SpecialEffectsController.Operation operation) {
            this.f5749a = list;
            this.f5750b = operation;
        }

        public void run() {
            if (this.f5749a.contains(this.f5750b)) {
                this.f5749a.remove(this.f5750b);
                C0449d.this.s(this.f5750b);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$c */
    class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f5752a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f5753b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f5754c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ SpecialEffectsController.Operation f5755d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f5756e;

        c(ViewGroup viewGroup, View view, boolean z3, SpecialEffectsController.Operation operation, k kVar) {
            this.f5752a = viewGroup;
            this.f5753b = view;
            this.f5754c = z3;
            this.f5755d = operation;
            this.f5756e = kVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f5752a.endViewTransition(this.f5753b);
            if (this.f5754c) {
                this.f5755d.e().applyState(this.f5753b);
            }
            this.f5756e.a();
            if (q.D0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animator from operation ");
                sb.append(this.f5755d);
                sb.append(" has ended.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$d  reason: collision with other inner class name */
    class C0094d implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Animator f5758a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SpecialEffectsController.Operation f5759b;

        C0094d(Animator animator, SpecialEffectsController.Operation operation) {
            this.f5758a = animator;
            this.f5759b = operation;
        }

        public void a() {
            this.f5758a.end();
            if (q.D0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animator from operation ");
                sb.append(this.f5759b);
                sb.append(" has been canceled.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$e */
    class e implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SpecialEffectsController.Operation f5761a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f5762b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f5763c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k f5764d;

        /* renamed from: androidx.fragment.app.d$e$a */
        class a implements Runnable {
            a() {
            }

            public void run() {
                e eVar = e.this;
                eVar.f5762b.endViewTransition(eVar.f5763c);
                e.this.f5764d.a();
            }
        }

        e(SpecialEffectsController.Operation operation, ViewGroup viewGroup, View view, k kVar) {
            this.f5761a = operation;
            this.f5762b = viewGroup;
            this.f5763c = view;
            this.f5764d = kVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f5762b.post(new a());
            if (q.D0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animation from operation ");
                sb.append(this.f5761a);
                sb.append(" has ended.");
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            if (q.D0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animation from operation ");
                sb.append(this.f5761a);
                sb.append(" has reached onAnimationStart.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$f */
    class f implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f5767a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f5768b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f5769c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ SpecialEffectsController.Operation f5770d;

        f(View view, ViewGroup viewGroup, k kVar, SpecialEffectsController.Operation operation) {
            this.f5767a = view;
            this.f5768b = viewGroup;
            this.f5769c = kVar;
            this.f5770d = operation;
        }

        public void a() {
            this.f5767a.clearAnimation();
            this.f5768b.endViewTransition(this.f5767a);
            this.f5769c.a();
            if (q.D0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animation from operation ");
                sb.append(this.f5770d);
                sb.append(" has been cancelled.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$g */
    class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SpecialEffectsController.Operation f5772a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SpecialEffectsController.Operation f5773b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f5774c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C0939a f5775d;

        g(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, boolean z3, C0939a aVar) {
            this.f5772a = operation;
            this.f5773b = operation2;
            this.f5774c = z3;
            this.f5775d = aVar;
        }

        public void run() {
            z.a(this.f5772a.f(), this.f5773b.f(), this.f5774c, this.f5775d, false);
        }
    }

    /* renamed from: androidx.fragment.app.d$h */
    class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f5777a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f5778b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Rect f5779c;

        h(B b4, View view, Rect rect) {
            this.f5777a = b4;
            this.f5778b = view;
            this.f5779c = rect;
        }

        public void run() {
            this.f5777a.h(this.f5778b, this.f5779c);
        }
    }

    /* renamed from: androidx.fragment.app.d$i */
    class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f5781a;

        i(ArrayList arrayList) {
            this.f5781a = arrayList;
        }

        public void run() {
            z.d(this.f5781a, 4);
        }
    }

    /* renamed from: androidx.fragment.app.d$j */
    class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f5783a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SpecialEffectsController.Operation f5784b;

        j(m mVar, SpecialEffectsController.Operation operation) {
            this.f5783a = mVar;
            this.f5784b = operation;
        }

        public void run() {
            this.f5783a.a();
            if (q.D0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Transition for operation ");
                sb.append(this.f5784b);
                sb.append("has completed");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$k */
    private static class k extends l {

        /* renamed from: c  reason: collision with root package name */
        private boolean f5786c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f5787d = false;

        /* renamed from: e  reason: collision with root package name */
        private i.a f5788e;

        k(SpecialEffectsController.Operation operation, androidx.core.os.e eVar, boolean z3) {
            super(operation, eVar);
            this.f5786c = z3;
        }

        /* access modifiers changed from: package-private */
        public i.a e(Context context) {
            boolean z3;
            if (this.f5787d) {
                return this.f5788e;
            }
            Fragment f4 = b().f();
            if (b().e() == SpecialEffectsController.Operation.State.VISIBLE) {
                z3 = true;
            } else {
                z3 = false;
            }
            i.a b4 = i.b(context, f4, z3, this.f5786c);
            this.f5788e = b4;
            this.f5787d = true;
            return b4;
        }
    }

    /* renamed from: androidx.fragment.app.d$l */
    private static class l {

        /* renamed from: a  reason: collision with root package name */
        private final SpecialEffectsController.Operation f5789a;

        /* renamed from: b  reason: collision with root package name */
        private final androidx.core.os.e f5790b;

        l(SpecialEffectsController.Operation operation, androidx.core.os.e eVar) {
            this.f5789a = operation;
            this.f5790b = eVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f5789a.d(this.f5790b);
        }

        /* access modifiers changed from: package-private */
        public SpecialEffectsController.Operation b() {
            return this.f5789a;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.os.e c() {
            return this.f5790b;
        }

        /* access modifiers changed from: package-private */
        public boolean d() {
            SpecialEffectsController.Operation.State state;
            SpecialEffectsController.Operation.State from = SpecialEffectsController.Operation.State.from(this.f5789a.f().mView);
            SpecialEffectsController.Operation.State e4 = this.f5789a.e();
            if (from == e4 || (from != (state = SpecialEffectsController.Operation.State.VISIBLE) && e4 != state)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.fragment.app.d$m */
    private static class m extends l {

        /* renamed from: c  reason: collision with root package name */
        private final Object f5791c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f5792d;

        /* renamed from: e  reason: collision with root package name */
        private final Object f5793e;

        m(SpecialEffectsController.Operation operation, androidx.core.os.e eVar, boolean z3, boolean z4) {
            super(operation, eVar);
            Object obj;
            Object obj2;
            boolean z5;
            if (operation.e() == SpecialEffectsController.Operation.State.VISIBLE) {
                if (z3) {
                    obj2 = operation.f().getReenterTransition();
                } else {
                    obj2 = operation.f().getEnterTransition();
                }
                this.f5791c = obj2;
                if (z3) {
                    z5 = operation.f().getAllowReturnTransitionOverlap();
                } else {
                    z5 = operation.f().getAllowEnterTransitionOverlap();
                }
                this.f5792d = z5;
            } else {
                if (z3) {
                    obj = operation.f().getReturnTransition();
                } else {
                    obj = operation.f().getExitTransition();
                }
                this.f5791c = obj;
                this.f5792d = true;
            }
            if (!z4) {
                this.f5793e = null;
            } else if (z3) {
                this.f5793e = operation.f().getSharedElementReturnTransition();
            } else {
                this.f5793e = operation.f().getSharedElementEnterTransition();
            }
        }

        private B f(Object obj) {
            if (obj == null) {
                return null;
            }
            B b4 = z.f5973a;
            if (b4 != null && b4.e(obj)) {
                return b4;
            }
            B b5 = z.f5974b;
            if (b5 != null && b5.e(obj)) {
                return b5;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* access modifiers changed from: package-private */
        public B e() {
            B f4 = f(this.f5791c);
            B f5 = f(this.f5793e);
            if (f4 != null && f5 != null && f4 != f5) {
                throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f5791c + " which uses a different Transition  type than its shared element transition " + this.f5793e);
            } else if (f4 != null) {
                return f4;
            } else {
                return f5;
            }
        }

        public Object g() {
            return this.f5793e;
        }

        /* access modifiers changed from: package-private */
        public Object h() {
            return this.f5791c;
        }

        public boolean i() {
            if (this.f5793e != null) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean j() {
            return this.f5792d;
        }
    }

    C0449d(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(List list, List list2, boolean z3, Map map) {
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        SpecialEffectsController.Operation operation;
        ViewGroup m4 = m();
        Context context = m4.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z6 = false;
        while (true) {
            i4 = 2;
            if (!it.hasNext()) {
                break;
            }
            k kVar = (k) it.next();
            if (kVar.d()) {
                kVar.a();
            } else {
                i.a e4 = kVar.e(context);
                if (e4 == null) {
                    kVar.a();
                } else {
                    Animator animator = e4.f5820b;
                    if (animator == null) {
                        arrayList.add(kVar);
                    } else {
                        SpecialEffectsController.Operation b4 = kVar.b();
                        Fragment f4 = b4.f();
                        if (Boolean.TRUE.equals(map.get(b4))) {
                            if (q.D0(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Ignoring Animator set on ");
                                sb.append(f4);
                                sb.append(" as this Fragment was involved in a Transition.");
                            }
                            kVar.a();
                        } else {
                            if (b4.e() == SpecialEffectsController.Operation.State.GONE) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            List list3 = list2;
                            if (z5) {
                                list3.remove(b4);
                            }
                            View view = f4.mView;
                            m4.startViewTransition(view);
                            c cVar = r0;
                            View view2 = view;
                            SpecialEffectsController.Operation operation2 = b4;
                            c cVar2 = new c(m4, view2, z5, b4, kVar);
                            animator.addListener(cVar);
                            animator.setTarget(view2);
                            animator.start();
                            if (q.D0(2)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Animator from operation ");
                                operation = operation2;
                                sb2.append(operation);
                                sb2.append(" has started.");
                            } else {
                                operation = operation2;
                            }
                            kVar.c().b(new C0094d(animator, operation));
                            z6 = true;
                        }
                    }
                }
            }
            Map map2 = map;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k kVar2 = (k) it2.next();
            SpecialEffectsController.Operation b5 = kVar2.b();
            Fragment f5 = b5.f();
            if (z3) {
                if (q.D0(i4)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Ignoring Animation set on ");
                    sb3.append(f5);
                    sb3.append(" as Animations cannot run alongside Transitions.");
                }
                kVar2.a();
            } else if (z6) {
                if (q.D0(i4)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Ignoring Animation set on ");
                    sb4.append(f5);
                    sb4.append(" as Animations cannot run alongside Animators.");
                }
                kVar2.a();
            } else {
                View view3 = f5.mView;
                Animation animation = (Animation) androidx.core.util.g.g(((i.a) androidx.core.util.g.g(kVar2.e(context))).f5819a);
                if (b5.e() != SpecialEffectsController.Operation.State.REMOVED) {
                    view3.startAnimation(animation);
                    kVar2.a();
                    z4 = z6;
                    i5 = i4;
                } else {
                    m4.startViewTransition(view3);
                    e eVar = r0;
                    z4 = z6;
                    i.b bVar = new i.b(animation, m4, view3);
                    e eVar2 = new e(b5, m4, view3, kVar2);
                    bVar.setAnimationListener(eVar);
                    view3.startAnimation(bVar);
                    i5 = 2;
                    if (q.D0(2)) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Animation from operation ");
                        sb5.append(b5);
                        sb5.append(" has started.");
                    }
                }
                androidx.core.os.e c4 = kVar2.c();
                k kVar3 = kVar2;
                f fVar = r0;
                f fVar2 = new f(view3, m4, kVar3, b5);
                c4.b(fVar);
                i4 = i5;
                z6 = z4;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map x(java.util.List r31, java.util.List r32, boolean r33, androidx.fragment.app.SpecialEffectsController.Operation r34, androidx.fragment.app.SpecialEffectsController.Operation r35) {
        /*
            r30 = this;
            r6 = r30
            r7 = r33
            r8 = r34
            r9 = r35
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.util.Iterator r0 = r31.iterator()
            r15 = 0
        L_0x0012:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0062
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.d$m r1 = (androidx.fragment.app.C0449d.m) r1
            boolean r2 = r1.d()
            if (r2 == 0) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            androidx.fragment.app.B r2 = r1.e()
            if (r15 != 0) goto L_0x002d
            r15 = r2
            goto L_0x0012
        L_0x002d:
            if (r2 == 0) goto L_0x0012
            if (r15 != r2) goto L_0x0032
            goto L_0x0012
        L_0x0032:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            r2.append(r3)
            androidx.fragment.app.SpecialEffectsController$Operation r3 = r1.b()
            androidx.fragment.app.Fragment r3 = r3.f()
            r2.append(r3)
            java.lang.String r3 = " returned Transition "
            r2.append(r3)
            java.lang.Object r1 = r1.h()
            r2.append(r1)
            java.lang.String r1 = " which uses a different Transition  type than other Fragments."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0062:
            if (r15 != 0) goto L_0x0082
            java.util.Iterator r0 = r31.iterator()
        L_0x0068:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0081
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.d$m r1 = (androidx.fragment.app.C0449d.m) r1
            androidx.fragment.app.SpecialEffectsController$Operation r2 = r1.b()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r10.put(r2, r3)
            r1.a()
            goto L_0x0068
        L_0x0081:
            return r10
        L_0x0082:
            android.view.View r14 = new android.view.View
            android.view.ViewGroup r0 = r30.m()
            android.content.Context r0 = r0.getContext()
            r14.<init>(r0)
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            y.a r4 = new y.a
            r4.<init>()
            java.util.Iterator r20 = r31.iterator()
            r0 = 0
            r2 = 0
            r21 = 0
        L_0x00ab:
            boolean r1 = r20.hasNext()
            r22 = 2
            if (r1 == 0) goto L_0x02bf
            java.lang.Object r1 = r20.next()
            androidx.fragment.app.d$m r1 = (androidx.fragment.app.C0449d.m) r1
            boolean r16 = r1.i()
            if (r16 == 0) goto L_0x02a4
            if (r8 == 0) goto L_0x02a4
            if (r9 == 0) goto L_0x02a4
            java.lang.Object r0 = r1.g()
            java.lang.Object r0 = r15.f(r0)
            java.lang.Object r1 = r15.u(r0)
            androidx.fragment.app.Fragment r0 = r35.f()
            java.util.ArrayList r0 = r0.getSharedElementSourceNames()
            androidx.fragment.app.Fragment r16 = r34.f()
            java.util.ArrayList r3 = r16.getSharedElementSourceNames()
            androidx.fragment.app.Fragment r16 = r34.f()
            java.util.ArrayList r11 = r16.getSharedElementTargetNames()
            r16 = r1
            r18 = r2
            r1 = 0
        L_0x00ec:
            int r2 = r11.size()
            if (r1 >= r2) goto L_0x010d
            java.lang.Object r2 = r11.get(r1)
            int r2 = r0.indexOf(r2)
            r19 = r11
            r11 = -1
            if (r2 == r11) goto L_0x0108
            java.lang.Object r11 = r3.get(r1)
            java.lang.String r11 = (java.lang.String) r11
            r0.set(r2, r11)
        L_0x0108:
            int r1 = r1 + 1
            r11 = r19
            goto L_0x00ec
        L_0x010d:
            androidx.fragment.app.Fragment r1 = r35.f()
            java.util.ArrayList r11 = r1.getSharedElementTargetNames()
            if (r7 != 0) goto L_0x0126
            androidx.fragment.app.Fragment r1 = r34.f()
            r1.getExitTransitionCallback()
            androidx.fragment.app.Fragment r1 = r35.f()
            r1.getEnterTransitionCallback()
            goto L_0x0134
        L_0x0126:
            androidx.fragment.app.Fragment r1 = r34.f()
            r1.getEnterTransitionCallback()
            androidx.fragment.app.Fragment r1 = r35.f()
            r1.getExitTransitionCallback()
        L_0x0134:
            int r1 = r0.size()
            r2 = 0
        L_0x0139:
            if (r2 >= r1) goto L_0x0153
            java.lang.Object r3 = r0.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r19 = r11.get(r2)
            r24 = r1
            r1 = r19
            java.lang.String r1 = (java.lang.String) r1
            r4.put(r3, r1)
            int r2 = r2 + 1
            r1 = r24
            goto L_0x0139
        L_0x0153:
            boolean r1 = androidx.fragment.app.q.D0(r22)
            if (r1 == 0) goto L_0x019b
            java.util.Iterator r1 = r11.iterator()
        L_0x015d:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = "Name: "
            if (r2 == 0) goto L_0x017b
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r19 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r2)
            r1 = r19
            goto L_0x015d
        L_0x017b:
            java.util.Iterator r1 = r0.iterator()
        L_0x017f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x019b
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r19 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r2)
            r1 = r19
            goto L_0x017f
        L_0x019b:
            y.a r3 = new y.a
            r3.<init>()
            androidx.fragment.app.Fragment r1 = r34.f()
            android.view.View r1 = r1.mView
            r6.u(r3, r1)
            r3.p(r0)
            java.util.Set r1 = r3.keySet()
            r4.p(r1)
            y.a r2 = new y.a
            r2.<init>()
            androidx.fragment.app.Fragment r1 = r35.f()
            android.view.View r1 = r1.mView
            r6.u(r2, r1)
            r2.p(r11)
            java.util.Collection r1 = r4.values()
            r2.p(r1)
            androidx.fragment.app.z.c(r4, r2)
            java.util.Set r1 = r4.keySet()
            r6.v(r3, r1)
            java.util.Collection r1 = r4.values()
            r6.v(r2, r1)
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x01f7
            r12.clear()
            r5.clear()
            r24 = r4
            r1 = r5
            r3 = r8
            r4 = r12
            r5 = r13
            r7 = r14
            r11 = r15
            r2 = r18
            r0 = 0
            r8 = 0
            r15 = r9
            goto L_0x02b2
        L_0x01f7:
            androidx.fragment.app.Fragment r1 = r35.f()
            r19 = r0
            androidx.fragment.app.Fragment r0 = r34.f()
            r9 = 1
            androidx.fragment.app.z.a(r1, r0, r7, r3, r9)
            android.view.ViewGroup r1 = r30.m()
            androidx.fragment.app.d$g r0 = new androidx.fragment.app.d$g
            r22 = r19
            r19 = r0
            r7 = r1
            r9 = r16
            r1 = r30
            r16 = r2
            r25 = r18
            r2 = r35
            r17 = r3
            r8 = 0
            r3 = r34
            r24 = r4
            r4 = r33
            r26 = r5
            r5 = r16
            r0.<init>(r2, r3, r4, r5)
            androidx.core.view.F.a(r7, r0)
            java.util.Collection r0 = r17.values()
            r12.addAll(r0)
            boolean r0 = r22.isEmpty()
            if (r0 != 0) goto L_0x024f
            r0 = r22
            java.lang.Object r0 = r0.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            r1 = r17
            java.lang.Object r0 = r1.get(r0)
            r2 = r0
            android.view.View r2 = (android.view.View) r2
            r15.p(r9, r2)
            goto L_0x0251
        L_0x024f:
            r2 = r25
        L_0x0251:
            java.util.Collection r0 = r16.values()
            r1 = r26
            r1.addAll(r0)
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x027e
            java.lang.Object r0 = r11.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            r3 = r16
            java.lang.Object r0 = r3.get(r0)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x027e
            android.view.ViewGroup r3 = r30.m()
            androidx.fragment.app.d$h r4 = new androidx.fragment.app.d$h
            r4.<init>(r15, r0, r13)
            androidx.core.view.F.a(r3, r4)
            r21 = 1
        L_0x027e:
            r15.s(r9, r14, r12)
            r16 = 0
            r17 = 0
            r0 = 0
            r3 = 0
            r4 = r12
            r12 = r15
            r5 = r13
            r13 = r9
            r7 = r14
            r14 = r0
            r11 = r15
            r15 = r3
            r18 = r9
            r19 = r1
            r12.n(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3 = r34
            r10.put(r3, r0)
            r15 = r35
            r10.put(r15, r0)
            r0 = r9
            goto L_0x02b2
        L_0x02a4:
            r25 = r2
            r24 = r4
            r1 = r5
            r3 = r8
            r4 = r12
            r5 = r13
            r7 = r14
            r11 = r15
            r8 = 0
            r15 = r9
            r2 = r25
        L_0x02b2:
            r8 = r3
            r12 = r4
            r13 = r5
            r14 = r7
            r9 = r15
            r4 = r24
            r7 = r33
            r5 = r1
            r15 = r11
            goto L_0x00ab
        L_0x02bf:
            r25 = r2
            r24 = r4
            r1 = r5
            r3 = r8
            r4 = r12
            r5 = r13
            r7 = r14
            r11 = r15
            r2 = 1
            r8 = 0
            r15 = r9
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r20 = r31.iterator()
            r13 = 0
            r14 = 0
        L_0x02d7:
            boolean r12 = r20.hasNext()
            if (r12 == 0) goto L_0x03f2
            java.lang.Object r12 = r20.next()
            r23 = r12
            androidx.fragment.app.d$m r23 = (androidx.fragment.app.C0449d.m) r23
            boolean r12 = r23.d()
            if (r12 == 0) goto L_0x02f9
            androidx.fragment.app.SpecialEffectsController$Operation r12 = r23.b()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r10.put(r12, r2)
            r23.a()
            r2 = 1
            goto L_0x02d7
        L_0x02f9:
            java.lang.Object r2 = r23.h()
            java.lang.Object r2 = r11.f(r2)
            androidx.fragment.app.SpecialEffectsController$Operation r12 = r23.b()
            if (r0 == 0) goto L_0x030e
            if (r12 == r3) goto L_0x030b
            if (r12 != r15) goto L_0x030e
        L_0x030b:
            r16 = 1
            goto L_0x0310
        L_0x030e:
            r16 = r8
        L_0x0310:
            if (r2 != 0) goto L_0x032b
            if (r16 != 0) goto L_0x031c
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r10.put(r12, r2)
            r23.a()
        L_0x031c:
            r12 = r32
            r29 = r1
            r28 = r4
            r27 = r7
            r2 = r13
            r1 = r15
            r8 = r25
            r13 = 0
            goto L_0x03e4
        L_0x032b:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r33 = r13
            androidx.fragment.app.Fragment r13 = r12.f()
            android.view.View r13 = r13.mView
            r6.t(r8, r13)
            if (r16 == 0) goto L_0x0346
            if (r12 != r3) goto L_0x0343
            r8.removeAll(r4)
            goto L_0x0346
        L_0x0343:
            r8.removeAll(r1)
        L_0x0346:
            boolean r13 = r8.isEmpty()
            if (r13 == 0) goto L_0x035d
            r11.a(r2, r7)
            r29 = r1
            r28 = r4
            r27 = r7
            r13 = r12
            r4 = r14
            r1 = r15
            r12 = r32
            r7 = r33
            goto L_0x03b3
        L_0x035d:
            r11.b(r2, r8)
            r18 = 0
            r19 = 0
            r16 = 0
            r17 = 0
            r13 = r12
            r12 = r11
            r27 = r7
            r7 = r33
            r33 = r13
            r13 = r2
            r28 = r4
            r4 = r14
            r14 = r2
            r29 = r1
            r1 = r15
            r15 = r8
            r12.n(r13, r14, r15, r16, r17, r18, r19)
            androidx.fragment.app.SpecialEffectsController$Operation$State r12 = r33.e()
            androidx.fragment.app.SpecialEffectsController$Operation$State r13 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            if (r12 != r13) goto L_0x03af
            r12 = r32
            r13 = r33
            r12.remove(r13)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r8)
            androidx.fragment.app.Fragment r15 = r13.f()
            android.view.View r15 = r15.mView
            r14.remove(r15)
            androidx.fragment.app.Fragment r15 = r13.f()
            android.view.View r15 = r15.mView
            r11.m(r2, r15, r14)
            android.view.ViewGroup r14 = r30.m()
            androidx.fragment.app.d$i r15 = new androidx.fragment.app.d$i
            r15.<init>(r8)
            androidx.core.view.F.a(r14, r15)
            goto L_0x03b3
        L_0x03af:
            r12 = r32
            r13 = r33
        L_0x03b3:
            androidx.fragment.app.SpecialEffectsController$Operation$State r14 = r13.e()
            androidx.fragment.app.SpecialEffectsController$Operation$State r15 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r14 != r15) goto L_0x03c6
            r9.addAll(r8)
            if (r21 == 0) goto L_0x03c3
            r11.o(r2, r5)
        L_0x03c3:
            r8 = r25
            goto L_0x03cb
        L_0x03c6:
            r8 = r25
            r11.p(r2, r8)
        L_0x03cb:
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            r10.put(r13, r14)
            boolean r13 = r23.j()
            if (r13 == 0) goto L_0x03de
            r13 = 0
            java.lang.Object r2 = r11.k(r4, r2, r13)
            r14 = r2
            r2 = r7
            goto L_0x03e4
        L_0x03de:
            r13 = 0
            java.lang.Object r2 = r11.k(r7, r2, r13)
            r14 = r4
        L_0x03e4:
            r15 = r1
            r13 = r2
            r25 = r8
            r7 = r27
            r4 = r28
            r1 = r29
            r2 = 1
            r8 = 0
            goto L_0x02d7
        L_0x03f2:
            r29 = r1
            r28 = r4
            r7 = r13
            r4 = r14
            r1 = r15
            java.lang.Object r2 = r11.j(r4, r7, r0)
            if (r2 != 0) goto L_0x0400
            return r10
        L_0x0400:
            java.util.Iterator r4 = r31.iterator()
        L_0x0404:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x046e
            java.lang.Object r5 = r4.next()
            androidx.fragment.app.d$m r5 = (androidx.fragment.app.C0449d.m) r5
            boolean r7 = r5.d()
            if (r7 == 0) goto L_0x0417
            goto L_0x0404
        L_0x0417:
            java.lang.Object r7 = r5.h()
            androidx.fragment.app.SpecialEffectsController$Operation r8 = r5.b()
            if (r0 == 0) goto L_0x0427
            if (r8 == r3) goto L_0x0425
            if (r8 != r1) goto L_0x0427
        L_0x0425:
            r12 = 1
            goto L_0x0428
        L_0x0427:
            r12 = 0
        L_0x0428:
            if (r7 != 0) goto L_0x042c
            if (r12 == 0) goto L_0x0404
        L_0x042c:
            android.view.ViewGroup r7 = r30.m()
            boolean r7 = androidx.core.view.P.S(r7)
            if (r7 != 0) goto L_0x0459
            boolean r7 = androidx.fragment.app.q.D0(r22)
            if (r7 == 0) goto L_0x0455
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r12 = "SpecialEffectsController: Container "
            r7.append(r12)
            android.view.ViewGroup r12 = r30.m()
            r7.append(r12)
            java.lang.String r12 = " has not been laid out. Completing operation "
            r7.append(r12)
            r7.append(r8)
        L_0x0455:
            r5.a()
            goto L_0x0404
        L_0x0459:
            androidx.fragment.app.SpecialEffectsController$Operation r7 = r5.b()
            androidx.fragment.app.Fragment r7 = r7.f()
            androidx.core.os.e r12 = r5.c()
            androidx.fragment.app.d$j r13 = new androidx.fragment.app.d$j
            r13.<init>(r5, r8)
            r11.q(r7, r2, r12, r13)
            goto L_0x0404
        L_0x046e:
            android.view.ViewGroup r1 = r30.m()
            boolean r1 = androidx.core.view.P.S(r1)
            if (r1 != 0) goto L_0x0479
            return r10
        L_0x0479:
            r1 = 4
            androidx.fragment.app.z.d(r9, r1)
            r1 = r29
            java.util.ArrayList r16 = r11.l(r1)
            boolean r3 = androidx.fragment.app.q.D0(r22)
            if (r3 == 0) goto L_0x04d9
            java.util.Iterator r3 = r28.iterator()
        L_0x048d:
            boolean r4 = r3.hasNext()
            java.lang.String r5 = " Name: "
            java.lang.String r7 = "View: "
            if (r4 == 0) goto L_0x04b3
            java.lang.Object r4 = r3.next()
            android.view.View r4 = (android.view.View) r4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r8.append(r4)
            r8.append(r5)
            java.lang.String r4 = androidx.core.view.P.J(r4)
            r8.append(r4)
            goto L_0x048d
        L_0x04b3:
            java.util.Iterator r3 = r1.iterator()
        L_0x04b7:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04d9
            java.lang.Object r4 = r3.next()
            android.view.View r4 = (android.view.View) r4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r8.append(r4)
            r8.append(r5)
            java.lang.String r4 = androidx.core.view.P.J(r4)
            r8.append(r4)
            goto L_0x04b7
        L_0x04d9:
            android.view.ViewGroup r3 = r30.m()
            r11.c(r3, r2)
            android.view.ViewGroup r13 = r30.m()
            r12 = r11
            r14 = r28
            r15 = r1
            r17 = r24
            r12.r(r13, r14, r15, r16, r17)
            r2 = 0
            androidx.fragment.app.z.d(r9, r2)
            r2 = r28
            r11.t(r0, r2, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0449d.x(java.util.List, java.util.List, boolean, androidx.fragment.app.SpecialEffectsController$Operation, androidx.fragment.app.SpecialEffectsController$Operation):java.util.Map");
    }

    /* access modifiers changed from: package-private */
    public void f(List list, boolean z3) {
        Iterator it = list.iterator();
        SpecialEffectsController.Operation operation = null;
        SpecialEffectsController.Operation operation2 = null;
        while (it.hasNext()) {
            SpecialEffectsController.Operation operation3 = (SpecialEffectsController.Operation) it.next();
            SpecialEffectsController.Operation.State from = SpecialEffectsController.Operation.State.from(operation3.f().mView);
            int i4 = a.f5748a[operation3.e().ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                if (from == SpecialEffectsController.Operation.State.VISIBLE && operation == null) {
                    operation = operation3;
                }
            } else if (i4 == 4 && from != SpecialEffectsController.Operation.State.VISIBLE) {
                operation2 = operation3;
            }
        }
        if (q.D0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Executing operations from ");
            sb.append(operation);
            sb.append(" to ");
            sb.append(operation2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<SpecialEffectsController.Operation> arrayList3 = new ArrayList<>(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            SpecialEffectsController.Operation operation4 = (SpecialEffectsController.Operation) it2.next();
            androidx.core.os.e eVar = new androidx.core.os.e();
            operation4.j(eVar);
            arrayList.add(new k(operation4, eVar, z3));
            androidx.core.os.e eVar2 = new androidx.core.os.e();
            operation4.j(eVar2);
            boolean z4 = false;
            if (z3) {
                if (operation4 != operation) {
                    arrayList2.add(new m(operation4, eVar2, z3, z4));
                    operation4.a(new b(arrayList3, operation4));
                }
            } else if (operation4 != operation2) {
                arrayList2.add(new m(operation4, eVar2, z3, z4));
                operation4.a(new b(arrayList3, operation4));
            }
            z4 = true;
            arrayList2.add(new m(operation4, eVar2, z3, z4));
            operation4.a(new b(arrayList3, operation4));
        }
        Map x3 = x(arrayList2, arrayList3, z3, operation, operation2);
        w(arrayList, arrayList3, x3.containsValue(Boolean.TRUE), x3);
        for (SpecialEffectsController.Operation s4 : arrayList3) {
            s(s4);
        }
        arrayList3.clear();
        if (q.D0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Completed executing operations from ");
            sb2.append(operation);
            sb2.append(" to ");
            sb2.append(operation2);
        }
    }

    /* access modifiers changed from: package-private */
    public void s(SpecialEffectsController.Operation operation) {
        operation.e().applyState(operation.f().mView);
    }

    /* access modifiers changed from: package-private */
    public void t(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!T.a(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = viewGroup.getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        t(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* access modifiers changed from: package-private */
    public void u(Map map, View view) {
        String J3 = P.J(view);
        if (J3 != null) {
            map.put(J3, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void v(C0939a aVar, Collection collection) {
        Iterator it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(P.J((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }
}
