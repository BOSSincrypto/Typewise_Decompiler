package androidx.fragment.app;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.P;
import androidx.fragment.app.SpecialEffectsController;
import androidx.lifecycle.J;

class w {

    /* renamed from: a  reason: collision with root package name */
    private final o f5933a;

    /* renamed from: b  reason: collision with root package name */
    private final x f5934b;

    /* renamed from: c  reason: collision with root package name */
    private final Fragment f5935c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5936d = false;

    /* renamed from: e  reason: collision with root package name */
    private int f5937e = -1;

    class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f5938a;

        a(View view) {
            this.f5938a = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.f5938a.removeOnAttachStateChangeListener(this);
            P.l0(this.f5938a);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5940a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5940a = r0
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5940a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5940a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5940a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.w.b.<clinit>():void");
        }
    }

    w(o oVar, x xVar, Fragment fragment) {
        this.f5933a = oVar;
        this.f5934b = xVar;
        this.f5935c = fragment;
    }

    private boolean l(View view) {
        if (view == this.f5935c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f5935c.mView) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.f5935c.performSaveInstanceState(bundle);
        this.f5933a.j(this.f5935c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f5935c.mView != null) {
            s();
        }
        if (this.f5935c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f5935c.mSavedViewState);
        }
        if (this.f5935c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f5935c.mSavedViewRegistryState);
        }
        if (!this.f5935c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f5935c.mUserVisibleHint);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (q.D0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto ACTIVITY_CREATED: ");
            sb.append(this.f5935c);
        }
        Fragment fragment = this.f5935c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        o oVar = this.f5933a;
        Fragment fragment2 = this.f5935c;
        oVar.a(fragment2, fragment2.mSavedFragmentState, false);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int j4 = this.f5934b.j(this.f5935c);
        Fragment fragment = this.f5935c;
        fragment.mContainer.addView(fragment.mView, j4);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (q.D0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto ATTACHED: ");
            sb.append(this.f5935c);
        }
        Fragment fragment = this.f5935c;
        Fragment fragment2 = fragment.mTarget;
        w wVar = null;
        if (fragment2 != null) {
            w n4 = this.f5934b.n(fragment2.mWho);
            if (n4 != null) {
                Fragment fragment3 = this.f5935c;
                fragment3.mTargetWho = fragment3.mTarget.mWho;
                fragment3.mTarget = null;
                wVar = n4;
            } else {
                throw new IllegalStateException("Fragment " + this.f5935c + " declared target fragment " + this.f5935c.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (wVar = this.f5934b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f5935c + " declared target fragment " + this.f5935c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (wVar != null) {
            wVar.m();
        }
        Fragment fragment4 = this.f5935c;
        fragment4.mHost = fragment4.mFragmentManager.q0();
        Fragment fragment5 = this.f5935c;
        fragment5.mParentFragment = fragment5.mFragmentManager.t0();
        this.f5933a.g(this.f5935c, false);
        this.f5935c.performAttach();
        this.f5933a.b(this.f5935c, false);
    }

    /* access modifiers changed from: package-private */
    public int d() {
        SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact;
        Fragment fragment = this.f5935c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i4 = this.f5937e;
        int i5 = b.f5940a[fragment.mMaxState.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                i4 = Math.min(i4, 5);
            } else if (i5 == 3) {
                i4 = Math.min(i4, 1);
            } else if (i5 != 4) {
                i4 = Math.min(i4, -1);
            } else {
                i4 = Math.min(i4, 0);
            }
        }
        Fragment fragment2 = this.f5935c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                i4 = Math.max(this.f5937e, 2);
                View view = this.f5935c.mView;
                if (view != null && view.getParent() == null) {
                    i4 = Math.min(i4, 2);
                }
            } else {
                i4 = this.f5937e < 4 ? Math.min(i4, fragment2.mState) : Math.min(i4, 1);
            }
        }
        if (!this.f5935c.mAdded) {
            i4 = Math.min(i4, 1);
        }
        Fragment fragment3 = this.f5935c;
        ViewGroup viewGroup = fragment3.mContainer;
        if (viewGroup != null) {
            lifecycleImpact = SpecialEffectsController.n(viewGroup, fragment3.getParentFragmentManager()).l(this);
        } else {
            lifecycleImpact = null;
        }
        if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
            i4 = Math.min(i4, 6);
        } else if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.REMOVING) {
            i4 = Math.max(i4, 3);
        } else {
            Fragment fragment4 = this.f5935c;
            if (fragment4.mRemoving) {
                if (fragment4.isInBackStack()) {
                    i4 = Math.min(i4, 1);
                } else {
                    i4 = Math.min(i4, -1);
                }
            }
        }
        Fragment fragment5 = this.f5935c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i4 = Math.min(i4, 4);
        }
        if (q.D0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("computeExpectedState() of ");
            sb.append(i4);
            sb.append(" for ");
            sb.append(this.f5935c);
        }
        return i4;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (q.D0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATED: ");
            sb.append(this.f5935c);
        }
        Fragment fragment = this.f5935c;
        if (!fragment.mIsCreated) {
            this.f5933a.h(fragment, fragment.mSavedFragmentState, false);
            Fragment fragment2 = this.f5935c;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            o oVar = this.f5933a;
            Fragment fragment3 = this.f5935c;
            oVar.c(fragment3, fragment3.mSavedFragmentState, false);
            return;
        }
        fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
        this.f5935c.mState = 1;
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [android.view.View] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f() {
        /*
            r6 = this;
            androidx.fragment.app.Fragment r0 = r6.f5935c
            boolean r0 = r0.mFromLayout
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 3
            boolean r0 = androidx.fragment.app.q.D0(r0)
            if (r0 == 0) goto L_0x001d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto CREATE_VIEW: "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r6.f5935c
            r0.append(r1)
        L_0x001d:
            androidx.fragment.app.Fragment r0 = r6.f5935c
            android.os.Bundle r1 = r0.mSavedFragmentState
            android.view.LayoutInflater r0 = r0.performGetLayoutInflater(r1)
            androidx.fragment.app.Fragment r1 = r6.f5935c
            android.view.ViewGroup r2 = r1.mContainer
            if (r2 == 0) goto L_0x002d
            goto L_0x00b7
        L_0x002d:
            int r2 = r1.mContainerId
            if (r2 == 0) goto L_0x00b6
            r3 = -1
            if (r2 == r3) goto L_0x0098
            androidx.fragment.app.q r1 = r1.mFragmentManager
            androidx.fragment.app.j r1 = r1.m0()
            androidx.fragment.app.Fragment r2 = r6.f5935c
            int r2 = r2.mContainerId
            android.view.View r1 = r1.c(r2)
            r2 = r1
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L_0x008e
            androidx.fragment.app.Fragment r1 = r6.f5935c
            boolean r3 = r1.mRestored
            if (r3 == 0) goto L_0x004e
            goto L_0x00b7
        L_0x004e:
            android.content.res.Resources r0 = r1.getResources()     // Catch:{ NotFoundException -> 0x005b }
            androidx.fragment.app.Fragment r1 = r6.f5935c     // Catch:{ NotFoundException -> 0x005b }
            int r1 = r1.mContainerId     // Catch:{ NotFoundException -> 0x005b }
            java.lang.String r0 = r0.getResourceName(r1)     // Catch:{ NotFoundException -> 0x005b }
            goto L_0x005d
        L_0x005b:
            java.lang.String r0 = "unknown"
        L_0x005d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No view found for id 0x"
            r2.append(r3)
            androidx.fragment.app.Fragment r3 = r6.f5935c
            int r3 = r3.mContainerId
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") for fragment "
            r2.append(r0)
            androidx.fragment.app.Fragment r0 = r6.f5935c
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x008e:
            boolean r1 = r2 instanceof androidx.fragment.app.FragmentContainerView
            if (r1 != 0) goto L_0x00b7
            androidx.fragment.app.Fragment r1 = r6.f5935c
            androidx.fragment.app.strictmode.FragmentStrictMode.n(r1, r2)
            goto L_0x00b7
        L_0x0098:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create fragment "
            r1.append(r2)
            androidx.fragment.app.Fragment r2 = r6.f5935c
            r1.append(r2)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00b6:
            r2 = 0
        L_0x00b7:
            androidx.fragment.app.Fragment r1 = r6.f5935c
            r1.mContainer = r2
            android.os.Bundle r3 = r1.mSavedFragmentState
            r1.performCreateView(r0, r2, r3)
            androidx.fragment.app.Fragment r0 = r6.f5935c
            android.view.View r0 = r0.mView
            r1 = 2
            if (r0 == 0) goto L_0x0163
            r3 = 0
            r0.setSaveFromParentEnabled(r3)
            androidx.fragment.app.Fragment r0 = r6.f5935c
            android.view.View r4 = r0.mView
            int r5 = Q.b.f1203a
            r4.setTag(r5, r0)
            if (r2 == 0) goto L_0x00d9
            r6.b()
        L_0x00d9:
            androidx.fragment.app.Fragment r0 = r6.f5935c
            boolean r2 = r0.mHidden
            if (r2 == 0) goto L_0x00e6
            android.view.View r0 = r0.mView
            r2 = 8
            r0.setVisibility(r2)
        L_0x00e6:
            androidx.fragment.app.Fragment r0 = r6.f5935c
            android.view.View r0 = r0.mView
            boolean r0 = androidx.core.view.P.R(r0)
            if (r0 == 0) goto L_0x00f8
            androidx.fragment.app.Fragment r0 = r6.f5935c
            android.view.View r0 = r0.mView
            androidx.core.view.P.l0(r0)
            goto L_0x0104
        L_0x00f8:
            androidx.fragment.app.Fragment r0 = r6.f5935c
            android.view.View r0 = r0.mView
            androidx.fragment.app.w$a r2 = new androidx.fragment.app.w$a
            r2.<init>(r0)
            r0.addOnAttachStateChangeListener(r2)
        L_0x0104:
            androidx.fragment.app.Fragment r0 = r6.f5935c
            r0.performViewCreated()
            androidx.fragment.app.o r0 = r6.f5933a
            androidx.fragment.app.Fragment r2 = r6.f5935c
            android.view.View r4 = r2.mView
            android.os.Bundle r5 = r2.mSavedFragmentState
            r0.m(r2, r4, r5, r3)
            androidx.fragment.app.Fragment r0 = r6.f5935c
            android.view.View r0 = r0.mView
            int r0 = r0.getVisibility()
            androidx.fragment.app.Fragment r2 = r6.f5935c
            android.view.View r2 = r2.mView
            float r2 = r2.getAlpha()
            androidx.fragment.app.Fragment r3 = r6.f5935c
            r3.setPostOnViewCreatedAlpha(r2)
            androidx.fragment.app.Fragment r2 = r6.f5935c
            android.view.ViewGroup r3 = r2.mContainer
            if (r3 == 0) goto L_0x0163
            if (r0 != 0) goto L_0x0163
            android.view.View r0 = r2.mView
            android.view.View r0 = r0.findFocus()
            if (r0 == 0) goto L_0x015b
            androidx.fragment.app.Fragment r2 = r6.f5935c
            r2.setFocusedView(r0)
            boolean r2 = androidx.fragment.app.q.D0(r1)
            if (r2 == 0) goto L_0x015b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "requestFocus: Saved focused view "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " for Fragment "
            r2.append(r0)
            androidx.fragment.app.Fragment r0 = r6.f5935c
            r2.append(r0)
        L_0x015b:
            androidx.fragment.app.Fragment r0 = r6.f5935c
            android.view.View r0 = r0.mView
            r2 = 0
            r0.setAlpha(r2)
        L_0x0163:
            androidx.fragment.app.Fragment r0 = r6.f5935c
            r0.mState = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.w.f():void");
    }

    /* access modifiers changed from: package-private */
    public void g() {
        boolean z3;
        Fragment f4;
        if (q.D0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATED: ");
            sb.append(this.f5935c);
        }
        Fragment fragment = this.f5935c;
        boolean z4 = true;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            Fragment fragment2 = this.f5935c;
            if (!fragment2.mBeingSaved) {
                this.f5934b.B(fragment2.mWho, (v) null);
            }
        }
        if (z3 || this.f5934b.p().r(this.f5935c)) {
            m mVar = this.f5935c.mHost;
            if (mVar instanceof J) {
                z4 = this.f5934b.p().o();
            } else if (mVar.f() instanceof Activity) {
                z4 = true ^ ((Activity) mVar.f()).isChangingConfigurations();
            }
            if ((z3 && !this.f5935c.mBeingSaved) || z4) {
                this.f5934b.p().g(this.f5935c);
            }
            this.f5935c.performDestroy();
            this.f5933a.d(this.f5935c, false);
            for (w wVar : this.f5934b.k()) {
                if (wVar != null) {
                    Fragment k4 = wVar.k();
                    if (this.f5935c.mWho.equals(k4.mTargetWho)) {
                        k4.mTarget = this.f5935c;
                        k4.mTargetWho = null;
                    }
                }
            }
            Fragment fragment3 = this.f5935c;
            String str = fragment3.mTargetWho;
            if (str != null) {
                fragment3.mTarget = this.f5934b.f(str);
            }
            this.f5934b.s(this);
            return;
        }
        String str2 = this.f5935c.mTargetWho;
        if (!(str2 == null || (f4 = this.f5934b.f(str2)) == null || !f4.mRetainInstance)) {
            this.f5935c.mTarget = f4;
        }
        this.f5935c.mState = 0;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        View view;
        if (q.D0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATE_VIEW: ");
            sb.append(this.f5935c);
        }
        Fragment fragment = this.f5935c;
        ViewGroup viewGroup = fragment.mContainer;
        if (!(viewGroup == null || (view = fragment.mView) == null)) {
            viewGroup.removeView(view);
        }
        this.f5935c.performDestroyView();
        this.f5933a.n(this.f5935c, false);
        Fragment fragment2 = this.f5935c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.j((Object) null);
        this.f5935c.mInLayout = false;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        if (q.D0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom ATTACHED: ");
            sb.append(this.f5935c);
        }
        this.f5935c.performDetach();
        this.f5933a.e(this.f5935c, false);
        Fragment fragment = this.f5935c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if ((fragment.mRemoving && !fragment.isInBackStack()) || this.f5934b.p().r(this.f5935c)) {
            if (q.D0(3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("initState called for fragment: ");
                sb2.append(this.f5935c);
            }
            this.f5935c.initState();
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        Fragment fragment = this.f5935c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (q.D0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("moveto CREATE_VIEW: ");
                sb.append(this.f5935c);
            }
            Fragment fragment2 = this.f5935c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), (ViewGroup) null, this.f5935c.mSavedFragmentState);
            View view = this.f5935c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f5935c;
                fragment3.mView.setTag(Q.b.f1203a, fragment3);
                Fragment fragment4 = this.f5935c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f5935c.performViewCreated();
                o oVar = this.f5933a;
                Fragment fragment5 = this.f5935c;
                oVar.m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f5935c.mState = 2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment k() {
        return this.f5935c;
    }

    /* access modifiers changed from: package-private */
    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.f5936d) {
            try {
                this.f5936d = true;
                boolean z3 = false;
                while (true) {
                    int d4 = d();
                    Fragment fragment = this.f5935c;
                    int i4 = fragment.mState;
                    if (d4 != i4) {
                        if (d4 <= i4) {
                            switch (i4 - 1) {
                                case -1:
                                    i();
                                    break;
                                case 0:
                                    if (fragment.mBeingSaved && this.f5934b.q(fragment.mWho) == null) {
                                        r();
                                    }
                                    g();
                                    break;
                                case 1:
                                    h();
                                    this.f5935c.mState = 1;
                                    break;
                                case 2:
                                    fragment.mInLayout = false;
                                    fragment.mState = 2;
                                    break;
                                case 3:
                                    if (q.D0(3)) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("movefrom ACTIVITY_CREATED: ");
                                        sb.append(this.f5935c);
                                    }
                                    Fragment fragment2 = this.f5935c;
                                    if (fragment2.mBeingSaved) {
                                        r();
                                    } else if (fragment2.mView != null && fragment2.mSavedViewState == null) {
                                        s();
                                    }
                                    Fragment fragment3 = this.f5935c;
                                    if (!(fragment3.mView == null || (viewGroup2 = fragment3.mContainer) == null)) {
                                        SpecialEffectsController.n(viewGroup2, fragment3.getParentFragmentManager()).d(this);
                                    }
                                    this.f5935c.mState = 3;
                                    break;
                                case 4:
                                    v();
                                    break;
                                case 5:
                                    fragment.mState = 5;
                                    break;
                                case 6:
                                    n();
                                    break;
                            }
                        } else {
                            switch (i4 + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(fragment.mView == null || (viewGroup3 = fragment.mContainer) == null)) {
                                        SpecialEffectsController.n(viewGroup3, fragment.getParentFragmentManager()).b(SpecialEffectsController.Operation.State.from(this.f5935c.mView.getVisibility()), this);
                                    }
                                    this.f5935c.mState = 4;
                                    break;
                                case 5:
                                    u();
                                    break;
                                case 6:
                                    fragment.mState = 6;
                                    break;
                                case 7:
                                    p();
                                    break;
                            }
                        }
                        z3 = true;
                    } else {
                        if (!z3 && i4 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f5935c.mBeingSaved) {
                            if (q.D0(3)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Cleaning up state of never attached fragment: ");
                                sb2.append(this.f5935c);
                            }
                            this.f5934b.p().g(this.f5935c);
                            this.f5934b.s(this);
                            if (q.D0(3)) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("initState called for fragment: ");
                                sb3.append(this.f5935c);
                            }
                            this.f5935c.initState();
                        }
                        Fragment fragment4 = this.f5935c;
                        if (fragment4.mHiddenChanged) {
                            if (!(fragment4.mView == null || (viewGroup = fragment4.mContainer) == null)) {
                                SpecialEffectsController n4 = SpecialEffectsController.n(viewGroup, fragment4.getParentFragmentManager());
                                if (this.f5935c.mHidden) {
                                    n4.c(this);
                                } else {
                                    n4.e(this);
                                }
                            }
                            Fragment fragment5 = this.f5935c;
                            q qVar = fragment5.mFragmentManager;
                            if (qVar != null) {
                                qVar.B0(fragment5);
                            }
                            Fragment fragment6 = this.f5935c;
                            fragment6.mHiddenChanged = false;
                            fragment6.onHiddenChanged(fragment6.mHidden);
                            this.f5935c.mChildFragmentManager.F();
                        }
                        this.f5936d = false;
                        return;
                    }
                }
            } catch (Throwable th) {
                this.f5936d = false;
                throw th;
            }
        } else if (q.D0(2)) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Ignoring re-entrant call to moveToExpectedState() for ");
            sb4.append(k());
        }
    }

    /* access modifiers changed from: package-private */
    public void n() {
        if (q.D0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom RESUMED: ");
            sb.append(this.f5935c);
        }
        this.f5935c.performPause();
        this.f5933a.f(this.f5935c, false);
    }

    /* access modifiers changed from: package-private */
    public void o(ClassLoader classLoader) {
        Bundle bundle = this.f5935c.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f5935c;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f5935c;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
            Fragment fragment3 = this.f5935c;
            fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
            Fragment fragment4 = this.f5935c;
            if (fragment4.mTargetWho != null) {
                fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
            }
            Fragment fragment5 = this.f5935c;
            Boolean bool = fragment5.mSavedUserVisibleHint;
            if (bool != null) {
                fragment5.mUserVisibleHint = bool.booleanValue();
                this.f5935c.mSavedUserVisibleHint = null;
            } else {
                fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment6 = this.f5935c;
            if (!fragment6.mUserVisibleHint) {
                fragment6.mDeferStart = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        String str;
        if (q.D0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto RESUMED: ");
            sb.append(this.f5935c);
        }
        View focusedView = this.f5935c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (q.D0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb2.append(str);
                sb2.append(" on Fragment ");
                sb2.append(this.f5935c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f5935c.mView.findFocus());
            }
        }
        this.f5935c.setFocusedView((View) null);
        this.f5935c.performResume();
        this.f5933a.i(this.f5935c, false);
        Fragment fragment = this.f5935c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        v vVar = new v(this.f5935c);
        Fragment fragment = this.f5935c;
        if (fragment.mState <= -1 || vVar.f5932m != null) {
            vVar.f5932m = fragment.mSavedFragmentState;
        } else {
            Bundle q4 = q();
            vVar.f5932m = q4;
            if (this.f5935c.mTargetWho != null) {
                if (q4 == null) {
                    vVar.f5932m = new Bundle();
                }
                vVar.f5932m.putString("android:target_state", this.f5935c.mTargetWho);
                int i4 = this.f5935c.mTargetRequestCode;
                if (i4 != 0) {
                    vVar.f5932m.putInt("android:target_req_state", i4);
                }
            }
        }
        this.f5934b.B(this.f5935c.mWho, vVar);
    }

    /* access modifiers changed from: package-private */
    public void s() {
        if (this.f5935c.mView != null) {
            if (q.D0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Saving view state for fragment ");
                sb.append(this.f5935c);
                sb.append(" with view ");
                sb.append(this.f5935c.mView);
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f5935c.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f5935c.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f5935c.mViewLifecycleOwner.e(bundle);
            if (!bundle.isEmpty()) {
                this.f5935c.mSavedViewRegistryState = bundle;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void t(int i4) {
        this.f5937e = i4;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        if (q.D0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto STARTED: ");
            sb.append(this.f5935c);
        }
        this.f5935c.performStart();
        this.f5933a.k(this.f5935c, false);
    }

    /* access modifiers changed from: package-private */
    public void v() {
        if (q.D0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom STARTED: ");
            sb.append(this.f5935c);
        }
        this.f5935c.performStop();
        this.f5933a.l(this.f5935c, false);
    }

    w(o oVar, x xVar, ClassLoader classLoader, l lVar, v vVar) {
        this.f5933a = oVar;
        this.f5934b = xVar;
        Fragment t4 = vVar.t(lVar, classLoader);
        this.f5935c = t4;
        if (q.D0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Instantiated fragment ");
            sb.append(t4);
        }
    }

    w(o oVar, x xVar, Fragment fragment, v vVar) {
        this.f5933a = oVar;
        this.f5934b = xVar;
        this.f5935c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = vVar.f5932m;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
