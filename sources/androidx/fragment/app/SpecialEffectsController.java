package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.e;
import androidx.core.view.P;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

abstract class SpecialEffectsController {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f5706a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList f5707b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    final ArrayList f5708c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    boolean f5709d = false;

    /* renamed from: e  reason: collision with root package name */
    boolean f5710e = false;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f5721a;

        a(d dVar) {
            this.f5721a = dVar;
        }

        public void run() {
            if (SpecialEffectsController.this.f5707b.contains(this.f5721a)) {
                this.f5721a.e().applyState(this.f5721a.f().mView);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f5723a;

        b(d dVar) {
            this.f5723a = dVar;
        }

        public void run() {
            SpecialEffectsController.this.f5707b.remove(this.f5723a);
            SpecialEffectsController.this.f5708c.remove(this.f5723a);
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5725a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f5726b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5726b = r0
                r1 = 1
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r2 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f5726b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f5726b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r4 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                androidx.fragment.app.SpecialEffectsController$Operation$State[] r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f5725a = r3
                androidx.fragment.app.SpecialEffectsController$Operation$State r4 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f5725a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f5725a     // Catch:{ NoSuchFieldError -> 0x004d }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f5725a     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.SpecialEffectsController.c.<clinit>():void");
        }
    }

    private static class d extends Operation {

        /* renamed from: h  reason: collision with root package name */
        private final w f5727h;

        d(Operation.State state, Operation.LifecycleImpact lifecycleImpact, w wVar, e eVar) {
            super(state, lifecycleImpact, wVar.k(), eVar);
            this.f5727h = wVar;
        }

        public void c() {
            super.c();
            this.f5727h.m();
        }

        /* access modifiers changed from: package-private */
        public void l() {
            if (g() == Operation.LifecycleImpact.ADDING) {
                Fragment k4 = this.f5727h.k();
                View findFocus = k4.mView.findFocus();
                if (findFocus != null) {
                    k4.setFocusedView(findFocus);
                    if (q.D0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("requestFocus: Saved focused view ");
                        sb.append(findFocus);
                        sb.append(" for Fragment ");
                        sb.append(k4);
                    }
                }
                View requireView = f().requireView();
                if (requireView.getParent() == null) {
                    this.f5727h.b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(k4.getPostOnViewCreatedAlpha());
            } else if (g() == Operation.LifecycleImpact.REMOVING) {
                Fragment k5 = this.f5727h.k();
                View requireView2 = k5.requireView();
                if (q.D0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Clearing focus ");
                    sb2.append(requireView2.findFocus());
                    sb2.append(" on view ");
                    sb2.append(requireView2);
                    sb2.append(" for Fragment ");
                    sb2.append(k5);
                }
                requireView2.clearFocus();
            }
        }
    }

    SpecialEffectsController(ViewGroup viewGroup) {
        this.f5706a = viewGroup;
    }

    private void a(Operation.State state, Operation.LifecycleImpact lifecycleImpact, w wVar) {
        synchronized (this.f5707b) {
            try {
                e eVar = new e();
                Operation h4 = h(wVar.k());
                if (h4 != null) {
                    h4.k(state, lifecycleImpact);
                    return;
                }
                d dVar = new d(state, lifecycleImpact, wVar, eVar);
                this.f5707b.add(dVar);
                dVar.a(new a(dVar));
                dVar.a(new b(dVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Operation h(Fragment fragment) {
        Iterator it = this.f5707b.iterator();
        while (it.hasNext()) {
            Operation operation = (Operation) it.next();
            if (operation.f().equals(fragment) && !operation.h()) {
                return operation;
            }
        }
        return null;
    }

    private Operation i(Fragment fragment) {
        Iterator it = this.f5708c.iterator();
        while (it.hasNext()) {
            Operation operation = (Operation) it.next();
            if (operation.f().equals(fragment) && !operation.h()) {
                return operation;
            }
        }
        return null;
    }

    static SpecialEffectsController n(ViewGroup viewGroup, q qVar) {
        return o(viewGroup, qVar.v0());
    }

    static SpecialEffectsController o(ViewGroup viewGroup, E e4) {
        int i4 = Q.b.f1204b;
        Object tag = viewGroup.getTag(i4);
        if (tag instanceof SpecialEffectsController) {
            return (SpecialEffectsController) tag;
        }
        SpecialEffectsController a4 = e4.a(viewGroup);
        viewGroup.setTag(i4, a4);
        return a4;
    }

    private void q() {
        Iterator it = this.f5707b.iterator();
        while (it.hasNext()) {
            Operation operation = (Operation) it.next();
            if (operation.g() == Operation.LifecycleImpact.ADDING) {
                operation.k(Operation.State.from(operation.f().requireView().getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Operation.State state, w wVar) {
        if (q.D0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing add operation for fragment ");
            sb.append(wVar.k());
        }
        a(state, Operation.LifecycleImpact.ADDING, wVar);
    }

    /* access modifiers changed from: package-private */
    public void c(w wVar) {
        if (q.D0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing hide operation for fragment ");
            sb.append(wVar.k());
        }
        a(Operation.State.GONE, Operation.LifecycleImpact.NONE, wVar);
    }

    /* access modifiers changed from: package-private */
    public void d(w wVar) {
        if (q.D0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing remove operation for fragment ");
            sb.append(wVar.k());
        }
        a(Operation.State.REMOVED, Operation.LifecycleImpact.REMOVING, wVar);
    }

    /* access modifiers changed from: package-private */
    public void e(w wVar) {
        if (q.D0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing show operation for fragment ");
            sb.append(wVar.k());
        }
        a(Operation.State.VISIBLE, Operation.LifecycleImpact.NONE, wVar);
    }

    /* access modifiers changed from: package-private */
    public abstract void f(List list, boolean z3);

    /* access modifiers changed from: package-private */
    public void g() {
        if (!this.f5710e) {
            if (!P.R(this.f5706a)) {
                j();
                this.f5709d = false;
                return;
            }
            synchronized (this.f5707b) {
                try {
                    if (!this.f5707b.isEmpty()) {
                        ArrayList arrayList = new ArrayList(this.f5708c);
                        this.f5708c.clear();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Operation operation = (Operation) it.next();
                            if (q.D0(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("SpecialEffectsController: Cancelling operation ");
                                sb.append(operation);
                            }
                            operation.b();
                            if (!operation.i()) {
                                this.f5708c.add(operation);
                            }
                        }
                        q();
                        ArrayList arrayList2 = new ArrayList(this.f5707b);
                        this.f5707b.clear();
                        this.f5708c.addAll(arrayList2);
                        q.D0(2);
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((Operation) it2.next()).l();
                        }
                        f(arrayList2, this.f5709d);
                        this.f5709d = false;
                        q.D0(2);
                    }
                } finally {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        String str;
        String str2;
        q.D0(2);
        boolean R3 = P.R(this.f5706a);
        synchronized (this.f5707b) {
            try {
                q();
                Iterator it = this.f5707b.iterator();
                while (it.hasNext()) {
                    ((Operation) it.next()).l();
                }
                Iterator it2 = new ArrayList(this.f5708c).iterator();
                while (it2.hasNext()) {
                    Operation operation = (Operation) it2.next();
                    if (q.D0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (R3) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f5706a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(operation);
                    }
                    operation.b();
                }
                Iterator it3 = new ArrayList(this.f5707b).iterator();
                while (it3.hasNext()) {
                    Operation operation2 = (Operation) it3.next();
                    if (q.D0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (R3) {
                            str = "";
                        } else {
                            str = "Container " + this.f5706a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(operation2);
                    }
                    operation2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void k() {
        if (this.f5710e) {
            q.D0(2);
            this.f5710e = false;
            g();
        }
    }

    /* access modifiers changed from: package-private */
    public Operation.LifecycleImpact l(w wVar) {
        Operation.LifecycleImpact lifecycleImpact;
        Operation h4 = h(wVar.k());
        if (h4 != null) {
            lifecycleImpact = h4.g();
        } else {
            lifecycleImpact = null;
        }
        Operation i4 = i(wVar.k());
        if (i4 == null || (lifecycleImpact != null && lifecycleImpact != Operation.LifecycleImpact.NONE)) {
            return lifecycleImpact;
        }
        return i4.g();
    }

    public ViewGroup m() {
        return this.f5706a;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        synchronized (this.f5707b) {
            try {
                q();
                this.f5710e = false;
                int size = this.f5707b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    Operation operation = (Operation) this.f5707b.get(size);
                    Operation.State from = Operation.State.from(operation.f().mView);
                    Operation.State e4 = operation.e();
                    Operation.State state = Operation.State.VISIBLE;
                    if (e4 == state && from != state) {
                        this.f5710e = operation.f().isPostponed();
                        break;
                    }
                    size--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void r(boolean z3) {
        this.f5709d = z3;
    }

    static class Operation {

        /* renamed from: a  reason: collision with root package name */
        private State f5711a;

        /* renamed from: b  reason: collision with root package name */
        private LifecycleImpact f5712b;

        /* renamed from: c  reason: collision with root package name */
        private final Fragment f5713c;

        /* renamed from: d  reason: collision with root package name */
        private final List f5714d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private final HashSet f5715e = new HashSet();

        /* renamed from: f  reason: collision with root package name */
        private boolean f5716f = false;

        /* renamed from: g  reason: collision with root package name */
        private boolean f5717g = false;

        enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        class a implements e.b {
            a() {
            }

            public void a() {
                Operation.this.b();
            }
        }

        Operation(State state, LifecycleImpact lifecycleImpact, Fragment fragment, e eVar) {
            this.f5711a = state;
            this.f5712b = lifecycleImpact;
            this.f5713c = fragment;
            eVar.b(new a());
        }

        /* access modifiers changed from: package-private */
        public final void a(Runnable runnable) {
            this.f5714d.add(runnable);
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            if (!h()) {
                this.f5716f = true;
                if (this.f5715e.isEmpty()) {
                    c();
                    return;
                }
                Iterator it = new ArrayList(this.f5715e).iterator();
                while (it.hasNext()) {
                    ((e) it.next()).a();
                }
            }
        }

        public void c() {
            if (!this.f5717g) {
                if (q.D0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    sb.append(this);
                    sb.append(" has called complete.");
                }
                this.f5717g = true;
                for (Runnable run : this.f5714d) {
                    run.run();
                }
            }
        }

        public final void d(e eVar) {
            if (this.f5715e.remove(eVar) && this.f5715e.isEmpty()) {
                c();
            }
        }

        public State e() {
            return this.f5711a;
        }

        public final Fragment f() {
            return this.f5713c;
        }

        /* access modifiers changed from: package-private */
        public LifecycleImpact g() {
            return this.f5712b;
        }

        /* access modifiers changed from: package-private */
        public final boolean h() {
            return this.f5716f;
        }

        /* access modifiers changed from: package-private */
        public final boolean i() {
            return this.f5717g;
        }

        public final void j(e eVar) {
            l();
            this.f5715e.add(eVar);
        }

        /* access modifiers changed from: package-private */
        public final void k(State state, LifecycleImpact lifecycleImpact) {
            int i4 = c.f5726b[lifecycleImpact.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    if (q.D0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: For fragment ");
                        sb.append(this.f5713c);
                        sb.append(" mFinalState = ");
                        sb.append(this.f5711a);
                        sb.append(" -> REMOVED. mLifecycleImpact  = ");
                        sb.append(this.f5712b);
                        sb.append(" to REMOVING.");
                    }
                    this.f5711a = State.REMOVED;
                    this.f5712b = LifecycleImpact.REMOVING;
                } else if (i4 == 3 && this.f5711a != State.REMOVED) {
                    if (q.D0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: For fragment ");
                        sb2.append(this.f5713c);
                        sb2.append(" mFinalState = ");
                        sb2.append(this.f5711a);
                        sb2.append(" -> ");
                        sb2.append(state);
                        sb2.append(". ");
                    }
                    this.f5711a = state;
                }
            } else if (this.f5711a == State.REMOVED) {
                if (q.D0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: For fragment ");
                    sb3.append(this.f5713c);
                    sb3.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                    sb3.append(this.f5712b);
                    sb3.append(" to ADDING.");
                }
                this.f5711a = State.VISIBLE;
                this.f5712b = LifecycleImpact.ADDING;
            }
        }

        /* access modifiers changed from: package-private */
        public abstract void l();

        public String toString() {
            return "Operation " + "{" + Integer.toHexString(System.identityHashCode(this)) + "} " + "{" + "mFinalState = " + this.f5711a + "} " + "{" + "mLifecycleImpact = " + this.f5712b + "} " + "{" + "mFragment = " + this.f5713c + "}";
        }

        enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            static State from(View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return from(view.getVisibility());
            }

            /* access modifiers changed from: package-private */
            public void applyState(View view) {
                int i4 = c.f5725a[ordinal()];
                if (i4 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (q.D0(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: Removing view ");
                            sb.append(view);
                            sb.append(" from container ");
                            sb.append(viewGroup);
                        }
                        viewGroup.removeView(view);
                    }
                } else if (i4 == 2) {
                    if (q.D0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: Setting view ");
                        sb2.append(view);
                        sb2.append(" to VISIBLE");
                    }
                    view.setVisibility(0);
                } else if (i4 == 3) {
                    if (q.D0(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("SpecialEffectsController: Setting view ");
                        sb3.append(view);
                        sb3.append(" to GONE");
                    }
                    view.setVisibility(8);
                } else if (i4 == 4) {
                    if (q.D0(2)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("SpecialEffectsController: Setting view ");
                        sb4.append(view);
                        sb4.append(" to INVISIBLE");
                    }
                    view.setVisibility(4);
                }
            }

            static State from(int i4) {
                if (i4 == 0) {
                    return VISIBLE;
                }
                if (i4 == 4) {
                    return INVISIBLE;
                }
                if (i4 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i4);
            }
        }
    }
}
