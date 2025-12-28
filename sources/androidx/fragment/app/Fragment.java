package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.app.p;
import androidx.core.view.C0437q;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.B;
import androidx.lifecycle.C0457g;
import androidx.lifecycle.C0458h;
import androidx.lifecycle.C0461k;
import androidx.lifecycle.F;
import androidx.lifecycle.I;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.L;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.uuid.Uuid;
import m.C0796a;
import t.C0897a;

public abstract class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, m, J, C0458h, Y.d {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    i mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    q mChildFragmentManager = new r();
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    F.b mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    q mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    m mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment = null;
    LayoutInflater mLayoutInflater;
    n mLifecycleRegistry;
    Lifecycle.State mMaxState = Lifecycle.State.RESUMED;
    boolean mMenuVisible = true;
    private final AtomicInteger mNextLocalRequestCode = new AtomicInteger();
    private final ArrayList<k> mOnPreAttachedListeners = new ArrayList<>();
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable = new a();
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    Y.c mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState = -1;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho = null;
    boolean mUserVisibleHint = true;
    View mView;
    C mViewLifecycleOwner;
    r mViewLifecycleOwnerLiveData = new r();
    String mWho = UUID.randomUUID().toString();

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SpecialEffectsController f5663a;

        c(SpecialEffectsController specialEffectsController) {
            this.f5663a = specialEffectsController;
        }

        public void run() {
            this.f5663a.g();
        }
    }

    class d extends j {
        d() {
        }

        public View c(int i4) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i4);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        public boolean d() {
            if (Fragment.this.mView != null) {
                return true;
            }
            return false;
        }
    }

    class e implements C0897a {
        e() {
        }

        /* renamed from: b */
        public ActivityResultRegistry a(Void voidR) {
            Fragment fragment = Fragment.this;
            m mVar = fragment.mHost;
            if (mVar instanceof androidx.activity.result.d) {
                return ((androidx.activity.result.d) mVar).getActivityResultRegistry();
            }
            return fragment.requireActivity().getActivityResultRegistry();
        }
    }

    class f implements C0897a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ActivityResultRegistry f5667a;

        f(ActivityResultRegistry activityResultRegistry) {
            this.f5667a = activityResultRegistry;
        }

        /* renamed from: b */
        public ActivityResultRegistry a(Void voidR) {
            return this.f5667a;
        }
    }

    class g extends k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0897a f5669a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtomicReference f5670b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C0796a f5671c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.activity.result.b f5672d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C0897a aVar, AtomicReference atomicReference, C0796a aVar2, androidx.activity.result.b bVar) {
            super((a) null);
            this.f5669a = aVar;
            this.f5670b = atomicReference;
            this.f5671c = aVar2;
            this.f5672d = bVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f5670b.set(((ActivityResultRegistry) this.f5669a.a((Object) null)).i(Fragment.this.generateActivityResultKey(), Fragment.this, this.f5671c, this.f5672d));
        }
    }

    class h extends androidx.activity.result.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AtomicReference f5674a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C0796a f5675b;

        h(AtomicReference atomicReference, C0796a aVar) {
            this.f5674a = atomicReference;
            this.f5675b = aVar;
        }

        public void b(Object obj, androidx.core.app.c cVar) {
            androidx.activity.result.c cVar2 = (androidx.activity.result.c) this.f5674a.get();
            if (cVar2 != null) {
                cVar2.b(obj, cVar);
                return;
            }
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }

        public void c() {
            androidx.activity.result.c cVar = (androidx.activity.result.c) this.f5674a.getAndSet((Object) null);
            if (cVar != null) {
                cVar.c();
            }
        }
    }

    static class i {

        /* renamed from: a  reason: collision with root package name */
        View f5677a;

        /* renamed from: b  reason: collision with root package name */
        boolean f5678b;

        /* renamed from: c  reason: collision with root package name */
        int f5679c;

        /* renamed from: d  reason: collision with root package name */
        int f5680d;

        /* renamed from: e  reason: collision with root package name */
        int f5681e;

        /* renamed from: f  reason: collision with root package name */
        int f5682f;

        /* renamed from: g  reason: collision with root package name */
        int f5683g;

        /* renamed from: h  reason: collision with root package name */
        ArrayList f5684h;

        /* renamed from: i  reason: collision with root package name */
        ArrayList f5685i;

        /* renamed from: j  reason: collision with root package name */
        Object f5686j = null;

        /* renamed from: k  reason: collision with root package name */
        Object f5687k;

        /* renamed from: l  reason: collision with root package name */
        Object f5688l;

        /* renamed from: m  reason: collision with root package name */
        Object f5689m;

        /* renamed from: n  reason: collision with root package name */
        Object f5690n;

        /* renamed from: o  reason: collision with root package name */
        Object f5691o;

        /* renamed from: p  reason: collision with root package name */
        Boolean f5692p;

        /* renamed from: q  reason: collision with root package name */
        Boolean f5693q;

        /* renamed from: r  reason: collision with root package name */
        float f5694r;

        /* renamed from: s  reason: collision with root package name */
        View f5695s;

        /* renamed from: t  reason: collision with root package name */
        boolean f5696t;

        i() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f5687k = obj;
            this.f5688l = null;
            this.f5689m = obj;
            this.f5690n = null;
            this.f5691o = obj;
            this.f5694r = 1.0f;
            this.f5695s = null;
        }
    }

    static class j {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    private static abstract class k {
        private k() {
        }

        /* access modifiers changed from: package-private */
        public abstract void a();

        /* synthetic */ k(a aVar) {
            this();
        }
    }

    public static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        final Bundle f5697a;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public l createFromParcel(Parcel parcel) {
                return new l(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new l(parcel, classLoader);
            }

            /* renamed from: c */
            public l[] newArray(int i4) {
                return new l[i4];
            }
        }

        l(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f5697a = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeBundle(this.f5697a);
        }
    }

    public Fragment() {
        d();
    }

    private i a() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new i();
        }
        return this.mAnimationInfo;
    }

    private int b() {
        Lifecycle.State state = this.mMaxState;
        if (state == Lifecycle.State.INITIALIZED || this.mParentFragment == null) {
            return state.ordinal();
        }
        return Math.min(state.ordinal(), this.mParentFragment.b());
    }

    private Fragment c(boolean z3) {
        String str;
        if (z3) {
            FragmentStrictMode.j(this);
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        q qVar = this.mFragmentManager;
        if (qVar == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return qVar.b0(str);
    }

    private void d() {
        this.mLifecycleRegistry = new n(this);
        this.mSavedStateRegistryController = Y.c.a(this);
        this.mDefaultFactory = null;
    }

    private androidx.activity.result.c e(C0796a aVar, C0897a aVar2, androidx.activity.result.b bVar) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            f(new g(aVar2, atomicReference, aVar, bVar));
            return new h(atomicReference, aVar);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void f(k kVar) {
        if (this.mState >= 0) {
            kVar.a();
        } else {
            this.mOnPreAttachedListeners.add(kVar);
        }
    }

    private void g() {
        if (q.D0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto RESTORE_VIEW_STATE: ");
            sb.append(this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, (Bundle) null);
    }

    /* access modifiers changed from: package-private */
    public void callStartTransitionListener(boolean z3) {
        ViewGroup viewGroup;
        q qVar;
        i iVar = this.mAnimationInfo;
        if (iVar != null) {
            iVar.f5696t = false;
        }
        if (this.mView != null && (viewGroup = this.mContainer) != null && (qVar = this.mFragmentManager) != null) {
            SpecialEffectsController n4 = SpecialEffectsController.n(viewGroup, qVar);
            n4.p();
            if (z3) {
                this.mHost.g().post(new c(n4));
            } else {
                n4.g();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public j createFragmentContainer() {
        return new d();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment c4 = c(false);
        if (c4 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(c4);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        q qVar = this.mChildFragmentManager;
        qVar.T(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: package-private */
    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.f0(str);
    }

    /* access modifiers changed from: package-private */
    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final h getActivity() {
        m mVar = this.mHost;
        if (mVar == null) {
            return null;
        }
        return (h) mVar.e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        i iVar = this.mAnimationInfo;
        if (iVar == null || (bool = iVar.f5693q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        i iVar = this.mAnimationInfo;
        if (iVar == null || (bool = iVar.f5692p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public View getAnimatingAway() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f5677a;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final q getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        m mVar = this.mHost;
        if (mVar == null) {
            return null;
        }
        return mVar.f();
    }

    public /* synthetic */ U.a getDefaultViewModelCreationExtras() {
        return C0457g.a(this);
    }

    public F.b getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Context applicationContext = requireContext().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        application = null;
                        break;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                if (application == null && q.D0(3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not find Application instance from Context ");
                    sb.append(requireContext().getApplicationContext());
                    sb.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.mDefaultFactory = new B(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* access modifiers changed from: package-private */
    public int getEnterAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f5679c;
    }

    public Object getEnterTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f5686j;
    }

    /* access modifiers changed from: package-private */
    public p getEnterTransitionCallback() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        iVar.getClass();
        return null;
    }

    /* access modifiers changed from: package-private */
    public int getExitAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f5680d;
    }

    public Object getExitTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f5688l;
    }

    /* access modifiers changed from: package-private */
    public p getExitTransitionCallback() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        iVar.getClass();
        return null;
    }

    /* access modifiers changed from: package-private */
    public View getFocusedView() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f5695s;
    }

    @Deprecated
    public final q getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        m mVar = this.mHost;
        if (mVar == null) {
            return null;
        }
        return mVar.h();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater((Bundle) null) : layoutInflater;
    }

    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public androidx.loader.app.a getLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    /* access modifiers changed from: package-private */
    public int getNextTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f5683g;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final q getParentFragmentManager() {
        q qVar = this.mFragmentManager;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* access modifiers changed from: package-private */
    public boolean getPopDirection() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return false;
        }
        return iVar.f5678b;
    }

    /* access modifiers changed from: package-private */
    public int getPopEnterAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f5681e;
    }

    /* access modifiers changed from: package-private */
    public int getPopExitAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f5682f;
    }

    /* access modifiers changed from: package-private */
    public float getPostOnViewCreatedAlpha() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 1.0f;
        }
        return iVar.f5694r;
    }

    public Object getReenterTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f5689m;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getExitTransition();
        }
        return obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        FragmentStrictMode.h(this);
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f5687k;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getEnterTransition();
        }
        return obj;
    }

    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    public Object getSharedElementEnterTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f5690n;
    }

    public Object getSharedElementReturnTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f5691o;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return obj;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        i iVar = this.mAnimationInfo;
        if (iVar == null || (arrayList = iVar.f5684h) == null) {
            return new ArrayList<>();
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        i iVar = this.mAnimationInfo;
        if (iVar == null || (arrayList = iVar.f5685i) == null) {
            return new ArrayList<>();
        }
        return arrayList;
    }

    public final String getString(int i4) {
        return getResources().getString(i4);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return c(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        FragmentStrictMode.i(this);
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i4) {
        return getResources().getText(i4);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public m getViewLifecycleOwner() {
        C c4 = this.mViewLifecycleOwner;
        if (c4 != null) {
            return c4;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    public I getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (b() != Lifecycle.State.INITIALIZED.ordinal()) {
            return this.mFragmentManager.y0(this);
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: package-private */
    public void initState() {
        d();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new r();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        if (this.mHost == null || !this.mAdded) {
            return false;
        }
        return true;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        q qVar;
        if (this.mHidden || ((qVar = this.mFragmentManager) != null && qVar.F0(this.mParentFragment))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean isInBackStack() {
        if (this.mBackStackNesting > 0) {
            return true;
        }
        return false;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        q qVar;
        if (!this.mMenuVisible || ((qVar = this.mFragmentManager) != null && !qVar.G0(this.mParentFragment))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean isPostponed() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return false;
        }
        return iVar.f5696t;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        if (this.mState >= 7) {
            return true;
        }
        return false;
    }

    public final boolean isStateSaved() {
        q qVar = this.mFragmentManager;
        if (qVar == null) {
            return false;
        }
        return qVar.J0();
    }

    public final boolean isVisible() {
        View view;
        if (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void noteStateNotSaved() {
        this.mChildFragmentManager.P0();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i4, int i5, Intent intent) {
        if (q.D0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" received the following in onActivityResult(): requestCode: ");
            sb.append(i4);
            sb.append(" resultCode: ");
            sb.append(i5);
            sb.append(" data: ");
            sb.append(intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        m mVar = this.mHost;
        Activity e4 = mVar == null ? null : mVar.e();
        if (e4 != null) {
            this.mCalled = false;
            onAttach(e4);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (!this.mChildFragmentManager.I0(1)) {
            this.mChildFragmentManager.y();
        }
    }

    public Animation onCreateAnimation(int i4, boolean z3, int i5) {
        return null;
    }

    public Animator onCreateAnimator(int i4, boolean z3, int i5) {
        return null;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i4 = this.mContentLayoutId;
        if (i4 != 0) {
            return layoutInflater.inflate(i4, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z3) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        m mVar = this.mHost;
        Activity e4 = mVar == null ? null : mVar.e();
        if (e4 != null) {
            this.mCalled = false;
            onInflate(e4, attributeSet, bundle);
        }
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z3) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z3) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z3) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    /* access modifiers changed from: package-private */
    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.P0();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            g();
            this.mChildFragmentManager.u();
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* access modifiers changed from: package-private */
    public void performAttach() {
        Iterator<k> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.j(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f());
        if (this.mCalled) {
            this.mFragmentManager.E(this);
            this.mChildFragmentManager.v();
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onAttach()");
    }

    /* access modifiers changed from: package-private */
    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.w(configuration);
    }

    /* access modifiers changed from: package-private */
    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.x(menuItem);
    }

    /* access modifiers changed from: package-private */
    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.P0();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new C0461k() {
            public void c(m mVar, Lifecycle.Event event) {
                View view;
                if (event == Lifecycle.Event.ON_STOP && (view = Fragment.this.mView) != null) {
                    j.a(view);
                }
            }
        });
        this.mSavedStateRegistryController.d(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.h(Lifecycle.Event.ON_CREATE);
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* access modifiers changed from: package-private */
    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z3 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z3 = true;
        }
        return z3 | this.mChildFragmentManager.z(menu, menuInflater);
    }

    /* access modifiers changed from: package-private */
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.P0();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.b();
            K.a(this.mView, this.mViewLifecycleOwner);
            L.a(this.mView, this.mViewLifecycleOwner);
            Y.e.a(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.j(this.mViewLifecycleOwner);
        } else if (!this.mViewLifecycleOwner.c()) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* access modifiers changed from: package-private */
    public void performDestroy() {
        this.mChildFragmentManager.A();
        this.mLifecycleRegistry.h(Lifecycle.Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    /* access modifiers changed from: package-private */
    public void performDestroyView() {
        this.mChildFragmentManager.B();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().b().isAtLeast(Lifecycle.State.CREATED)) {
            this.mViewLifecycleOwner.a(Lifecycle.Event.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            androidx.loader.app.a.b(this).c();
            this.mPerformedCreateView = false;
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.mChildFragmentManager.C0()) {
            this.mChildFragmentManager.A();
            this.mChildFragmentManager = new r();
        }
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    /* access modifiers changed from: package-private */
    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.C();
    }

    /* access modifiers changed from: package-private */
    public void performMultiWindowModeChanged(boolean z3) {
        onMultiWindowModeChanged(z3);
        this.mChildFragmentManager.D(z3);
    }

    /* access modifiers changed from: package-private */
    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (!this.mHasMenu || !this.mMenuVisible || !onOptionsItemSelected(menuItem)) {
            return this.mChildFragmentManager.G(menuItem);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.H(menu);
        }
    }

    /* access modifiers changed from: package-private */
    public void performPause() {
        this.mChildFragmentManager.J();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(Lifecycle.Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.h(Lifecycle.Event.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    public void performPictureInPictureModeChanged(boolean z3) {
        onPictureInPictureModeChanged(z3);
        this.mChildFragmentManager.K(z3);
    }

    /* access modifiers changed from: package-private */
    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z3 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z3 = true;
        }
        return z3 | this.mChildFragmentManager.L(menu);
    }

    /* access modifiers changed from: package-private */
    public void performPrimaryNavigationFragmentChanged() {
        boolean H02 = this.mFragmentManager.H0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != H02) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(H02);
            onPrimaryNavigationFragmentChanged(H02);
            this.mChildFragmentManager.M();
        }
    }

    /* access modifiers changed from: package-private */
    public void performResume() {
        this.mChildFragmentManager.P0();
        this.mChildFragmentManager.X(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            n nVar = this.mLifecycleRegistry;
            Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
            nVar.h(event);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(event);
            }
            this.mChildFragmentManager.N();
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onResume()");
    }

    /* access modifiers changed from: package-private */
    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.e(bundle);
        Parcelable c12 = this.mChildFragmentManager.c1();
        if (c12 != null) {
            bundle.putParcelable("android:support:fragments", c12);
        }
    }

    /* access modifiers changed from: package-private */
    public void performStart() {
        this.mChildFragmentManager.P0();
        this.mChildFragmentManager.X(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            n nVar = this.mLifecycleRegistry;
            Lifecycle.Event event = Lifecycle.Event.ON_START;
            nVar.h(event);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(event);
            }
            this.mChildFragmentManager.O();
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onStart()");
    }

    /* access modifiers changed from: package-private */
    public void performStop() {
        this.mChildFragmentManager.Q();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(Lifecycle.Event.ON_STOP);
        }
        this.mLifecycleRegistry.h(Lifecycle.Event.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* access modifiers changed from: package-private */
    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.R();
    }

    public void postponeEnterTransition() {
        a().f5696t = true;
    }

    public final <I, O> androidx.activity.result.c registerForActivityResult(C0796a aVar, androidx.activity.result.b bVar) {
        return e(aVar, new e(), bVar);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i4) {
        if (this.mHost != null) {
            getParentFragmentManager().L0(this, strArr, i4);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final h requireActivity() {
        h activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final q requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* access modifiers changed from: package-private */
    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.mChildFragmentManager.a1(parcelable);
            this.mChildFragmentManager.y();
        }
    }

    /* access modifiers changed from: package-private */
    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.d(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.mView != null) {
            this.mViewLifecycleOwner.a(Lifecycle.Event.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z3) {
        a().f5693q = Boolean.valueOf(z3);
    }

    public void setAllowReturnTransitionOverlap(boolean z3) {
        a().f5692p = Boolean.valueOf(z3);
    }

    /* access modifiers changed from: package-private */
    public void setAnimations(int i4, int i5, int i6, int i7) {
        if (this.mAnimationInfo != null || i4 != 0 || i5 != 0 || i6 != 0 || i7 != 0) {
            a().f5679c = i4;
            a().f5680d = i5;
            a().f5681e = i6;
            a().f5682f = i7;
        }
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public void setEnterSharedElementCallback(p pVar) {
        a().getClass();
    }

    public void setEnterTransition(Object obj) {
        a().f5686j = obj;
    }

    public void setExitSharedElementCallback(p pVar) {
        a().getClass();
    }

    public void setExitTransition(Object obj) {
        a().f5688l = obj;
    }

    /* access modifiers changed from: package-private */
    public void setFocusedView(View view) {
        a().f5695s = view;
    }

    public void setHasOptionsMenu(boolean z3) {
        if (this.mHasMenu != z3) {
            this.mHasMenu = z3;
            if (isAdded() && !isHidden()) {
                this.mHost.n();
            }
        }
    }

    public void setInitialSavedState(l lVar) {
        Bundle bundle;
        if (this.mFragmentManager == null) {
            if (lVar == null || (bundle = lVar.f5697a) == null) {
                bundle = null;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z3) {
        if (this.mMenuVisible != z3) {
            this.mMenuVisible = z3;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.n();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setNextTransition(int i4) {
        if (this.mAnimationInfo != null || i4 != 0) {
            a();
            this.mAnimationInfo.f5683g = i4;
        }
    }

    /* access modifiers changed from: package-private */
    public void setPopDirection(boolean z3) {
        if (this.mAnimationInfo != null) {
            a().f5678b = z3;
        }
    }

    /* access modifiers changed from: package-private */
    public void setPostOnViewCreatedAlpha(float f4) {
        a().f5694r = f4;
    }

    public void setReenterTransition(Object obj) {
        a().f5689m = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z3) {
        FragmentStrictMode.k(this);
        this.mRetainInstance = z3;
        q qVar = this.mFragmentManager;
        if (qVar == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z3) {
            qVar.h(this);
        } else {
            qVar.Y0(this);
        }
    }

    public void setReturnTransition(Object obj) {
        a().f5687k = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        a().f5690n = obj;
    }

    /* access modifiers changed from: package-private */
    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        a();
        i iVar = this.mAnimationInfo;
        iVar.f5684h = arrayList;
        iVar.f5685i = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        a().f5691o = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i4) {
        q qVar;
        if (fragment != null) {
            FragmentStrictMode.l(this, fragment, i4);
        }
        q qVar2 = this.mFragmentManager;
        if (fragment != null) {
            qVar = fragment.mFragmentManager;
        } else {
            qVar = null;
        }
        if (qVar2 == null || qVar == null || qVar2 == qVar) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (!fragment2.equals(this)) {
                    fragment2 = fragment2.c(false);
                } else {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            if (fragment == null) {
                this.mTargetWho = null;
                this.mTarget = null;
            } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = fragment;
            } else {
                this.mTargetWho = fragment.mWho;
                this.mTarget = null;
            }
            this.mTargetRequestCode = i4;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
    }

    @Deprecated
    public void setUserVisibleHint(boolean z3) {
        boolean z4;
        FragmentStrictMode.m(this, z3);
        if (!this.mUserVisibleHint && z3 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            q qVar = this.mFragmentManager;
            qVar.R0(qVar.s(this));
        }
        this.mUserVisibleHint = z3;
        if (this.mState >= 5 || z3) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.mDeferStart = z4;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z3);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        m mVar = this.mHost;
        if (mVar != null) {
            return mVar.k(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, (Bundle) null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i4) {
        startActivityForResult(intent, i4, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7, Bundle bundle) {
        if (this.mHost != null) {
            if (q.D0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(this);
                sb.append(" received the following in startIntentSenderForResult() requestCode: ");
                int i8 = i4;
                sb.append(i4);
                sb.append(" IntentSender: ");
                IntentSender intentSender2 = intentSender;
                sb.append(intentSender);
                sb.append(" fillInIntent: ");
                Intent intent2 = intent;
                sb.append(intent);
                sb.append(" options: ");
                sb.append(bundle);
            } else {
                IntentSender intentSender3 = intentSender;
                int i9 = i4;
                Intent intent3 = intent;
                Bundle bundle2 = bundle;
            }
            getParentFragmentManager().N0(this, intentSender, i4, intent, i5, i6, i7, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && a().f5696t) {
            if (this.mHost == null) {
                a().f5696t = false;
            } else if (Looper.myLooper() != this.mHost.g().getLooper()) {
                this.mHost.g().postAtFrontOfQueue(new b());
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(Uuid.SIZE_BITS);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) l.d(context.getClassLoader(), str).getConstructor((Class[]) null).newInstance((Object[]) null);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (InstantiationException e4) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (IllegalAccessException e5) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e5);
        } catch (NoSuchMethodException e6) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e6);
        } catch (InvocationTargetException e7) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e7);
        }
    }

    public final String getString(int i4, Object... objArr) {
        return getResources().getString(i4, objArr);
    }

    public final void postponeEnterTransition(long j4, TimeUnit timeUnit) {
        Handler handler;
        a().f5696t = true;
        q qVar = this.mFragmentManager;
        if (qVar != null) {
            handler = qVar.q0().g();
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j4));
    }

    public final <I, O> androidx.activity.result.c registerForActivityResult(C0796a aVar, ActivityResultRegistry activityResultRegistry, androidx.activity.result.b bVar) {
        return e(aVar, new f(activityResultRegistry), bVar);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        m mVar = this.mHost;
        if (mVar != null) {
            mVar.l(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i4, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().M0(this, intent, i4, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        m mVar = this.mHost;
        if (mVar != null) {
            LayoutInflater i4 = mVar.i();
            C0437q.a(i4, this.mChildFragmentManager.r0());
            return i4;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }
}
