package androidx.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.view.C0440u;
import androidx.core.view.C0442w;
import androidx.lifecycle.B;
import androidx.lifecycle.C0458h;
import androidx.lifecycle.C0461k;
import androidx.lifecycle.F;
import androidx.lifecycle.I;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.L;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import c0.C0492b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import l.C0780a;
import l.C0781b;
import l2.q;
import m.C0796a;

public abstract class ComponentActivity extends androidx.core.app.f implements m, J, C0458h, Y.d, q, androidx.activity.result.d, n {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    final C0780a mContextAwareHelper = new C0780a();
    private F.b mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    final m mFullyDrawnReporter;
    private final n mLifecycleRegistry = new n(this);
    private final C0440u mMenuHostHelper = new C0440u(new d(this));
    private final AtomicInteger mNextLocalRequestCode;
    /* access modifiers changed from: private */
    public OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<androidx.core.util.a> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<androidx.core.util.a> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<androidx.core.util.a> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<androidx.core.util.a> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<androidx.core.util.a> mOnTrimMemoryListeners;
    final f mReportFullyDrawnExecutor;
    final Y.c mSavedStateRegistryController;
    private I mViewModelStore;

    class a extends ActivityResultRegistry {

        /* renamed from: androidx.activity.ComponentActivity$a$a  reason: collision with other inner class name */
        class C0048a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f2326a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C0796a.C0206a f2327b;

            C0048a(int i4, C0796a.C0206a aVar) {
                this.f2326a = i4;
                this.f2327b = aVar;
            }

            public void run() {
                a.this.c(this.f2326a, this.f2327b.a());
            }
        }

        class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f2329a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ IntentSender.SendIntentException f2330b;

            b(int i4, IntentSender.SendIntentException sendIntentException) {
                this.f2329a = i4;
                this.f2330b = sendIntentException;
            }

            public void run() {
                a.this.b(this.f2329a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f2330b));
            }
        }

        a() {
        }

        public void f(int i4, C0796a aVar, Object obj, androidx.core.app.c cVar) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            C0796a.C0206a b4 = aVar.b(componentActivity, obj);
            if (b4 != null) {
                new Handler(Looper.getMainLooper()).post(new C0048a(i4, b4));
                return;
            }
            Intent a4 = aVar.a(componentActivity, obj);
            if (a4.getExtras() != null && a4.getExtras().getClassLoader() == null) {
                a4.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a4.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = a4.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a4.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a4.getAction())) {
                String[] stringArrayExtra = a4.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.b.r(componentActivity, stringArrayExtra, i4);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a4.getAction())) {
                androidx.activity.result.e eVar = (androidx.activity.result.e) a4.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    androidx.core.app.b.w(componentActivity, eVar.w(), i4, eVar.t(), eVar.u(), eVar.v(), 0, bundle);
                } catch (IntentSender.SendIntentException e4) {
                    new Handler(Looper.getMainLooper()).post(new b(i4, e4));
                }
            } else {
                androidx.core.app.b.v(componentActivity, a4, i4, bundle);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e4) {
                if (!TextUtils.equals(e4.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e4;
                }
            } catch (NullPointerException e5) {
                if (!TextUtils.equals(e5.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e5;
                }
            }
        }
    }

    static class c {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    static class d {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    static final class e {

        /* renamed from: a  reason: collision with root package name */
        Object f2333a;

        /* renamed from: b  reason: collision with root package name */
        I f2334b;

        e() {
        }
    }

    private interface f extends Executor {
        void A(View view);

        void f();
    }

    class g implements f, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: a  reason: collision with root package name */
        final long f2335a = (SystemClock.uptimeMillis() + 10000);

        /* renamed from: b  reason: collision with root package name */
        Runnable f2336b;

        /* renamed from: c  reason: collision with root package name */
        boolean f2337c = false;

        g() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b() {
            Runnable runnable = this.f2336b;
            if (runnable != null) {
                runnable.run();
                this.f2336b = null;
            }
        }

        public void A(View view) {
            if (!this.f2337c) {
                this.f2337c = true;
                view.getViewTreeObserver().addOnDrawListener(this);
            }
        }

        public void execute(Runnable runnable) {
            this.f2336b = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (!this.f2337c) {
                decorView.postOnAnimation(new h(this));
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        public void f() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        public void onDraw() {
            Runnable runnable = this.f2336b;
            if (runnable != null) {
                runnable.run();
                this.f2336b = null;
                if (ComponentActivity.this.mFullyDrawnReporter.c()) {
                    this.f2337c = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                }
            } else if (SystemClock.uptimeMillis() > this.f2335a) {
                this.f2337c = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public ComponentActivity() {
        Y.c a4 = Y.c.a(this);
        this.mSavedStateRegistryController = a4;
        this.mOnBackPressedDispatcher = null;
        f e4 = e();
        this.mReportFullyDrawnExecutor = e4;
        this.mFullyDrawnReporter = new m(e4, new e(this));
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new a();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() != null) {
            int i4 = Build.VERSION.SDK_INT;
            getLifecycle().a(new C0461k() {
                public void c(m mVar, Lifecycle.Event event) {
                    View view;
                    if (event == Lifecycle.Event.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        if (window != null) {
                            view = window.peekDecorView();
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            c.a(view);
                        }
                    }
                }
            });
            getLifecycle().a(new C0461k() {
                public void c(m mVar, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().a();
                        }
                        ComponentActivity.this.mReportFullyDrawnExecutor.f();
                    }
                }
            });
            getLifecycle().a(new C0461k() {
                public void c(m mVar, Lifecycle.Event event) {
                    ComponentActivity.this.ensureViewModelStore();
                    ComponentActivity.this.getLifecycle().c(this);
                }
            });
            a4.c();
            SavedStateHandleSupport.c(this);
            if (i4 <= 23) {
                getLifecycle().a(new ImmLeaksCleaner(this));
            }
            getSavedStateRegistry().h(ACTIVITY_RESULT_TAG, new f(this));
            addOnContextAvailableListener(new g(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private f e() {
        return new g();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ q f() {
        reportFullyDrawn();
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Bundle g() {
        Bundle bundle = new Bundle();
        this.mActivityResultRegistry.h(bundle);
        return bundle;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(Context context) {
        Bundle b4 = getSavedStateRegistry().b(ACTIVITY_RESULT_TAG);
        if (b4 != null) {
            this.mActivityResultRegistry.g(b4);
        }
    }

    public void addMenuProvider(C0442w wVar) {
        this.mMenuHostHelper.c(wVar);
    }

    public final void addOnConfigurationChangedListener(androidx.core.util.a aVar) {
        this.mOnConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(C0781b bVar) {
        this.mContextAwareHelper.a(bVar);
    }

    public final void addOnMultiWindowModeChangedListener(androidx.core.util.a aVar) {
        this.mOnMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(androidx.core.util.a aVar) {
        this.mOnNewIntentListeners.add(aVar);
    }

    public final void addOnPictureInPictureModeChangedListener(androidx.core.util.a aVar) {
        this.mOnPictureInPictureModeChangedListeners.add(aVar);
    }

    public final void addOnTrimMemoryListener(androidx.core.util.a aVar) {
        this.mOnTrimMemoryListeners.add(aVar);
    }

    /* access modifiers changed from: package-private */
    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            e eVar = (e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.mViewModelStore = eVar.f2334b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new I();
            }
        }
    }

    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    public U.a getDefaultViewModelCreationExtras() {
        U.d dVar = new U.d();
        if (getApplication() != null) {
            dVar.c(F.a.f6001g, getApplication());
        }
        dVar.c(SavedStateHandleSupport.f6043a, this);
        dVar.c(SavedStateHandleSupport.f6044b, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            dVar.c(SavedStateHandleSupport.f6045c, getIntent().getExtras());
        }
        return dVar;
    }

    public F.b getDefaultViewModelProviderFactory() {
        Bundle bundle;
        if (this.mDefaultFactory == null) {
            Application application = getApplication();
            if (getIntent() != null) {
                bundle = getIntent().getExtras();
            } else {
                bundle = null;
            }
            this.mDefaultFactory = new B(application, this, bundle);
        }
        return this.mDefaultFactory;
    }

    public m getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        e eVar = (e) getLastNonConfigurationInstance();
        if (eVar != null) {
            return eVar.f2333a;
        }
        return null;
    }

    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        if (this.mOnBackPressedDispatcher == null) {
            this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new b());
            getLifecycle().a(new C0461k() {
                public void c(m mVar, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                        ComponentActivity.this.mOnBackPressedDispatcher.n(d.a((ComponentActivity) mVar));
                    }
                }
            });
        }
        return this.mOnBackPressedDispatcher;
    }

    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    public I getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void initializeViewTreeOwners() {
        K.a(getWindow().getDecorView(), this);
        L.a(getWindow().getDecorView(), this);
        Y.e.a(getWindow().getDecorView(), this);
        t.a(getWindow().getDecorView(), this);
        s.a(getWindow().getDecorView(), this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i4, int i5, Intent intent) {
        if (!this.mActivityResultRegistry.b(i4, i5, intent)) {
            super.onActivityResult(i4, i5, intent);
        }
    }

    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().k();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<androidx.core.util.a> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.d(bundle);
        this.mContextAwareHelper.c(this);
        super.onCreate(bundle);
        w.e(this);
        int i4 = this.mContentLayoutId;
        if (i4 != 0) {
            setContentView(i4);
        }
    }

    public boolean onCreatePanelMenu(int i4, Menu menu) {
        if (i4 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i4, menu);
        this.mMenuHostHelper.h(menu, getMenuInflater());
        return true;
    }

    public boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        if (i4 == 0) {
            return this.mMenuHostHelper.j(menuItem);
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    public void onMultiWindowModeChanged(boolean z3, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z3, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<androidx.core.util.a> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.g(z3, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator<androidx.core.util.a> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    public void onPanelClosed(int i4, Menu menu) {
        this.mMenuHostHelper.i(menu);
        super.onPanelClosed(i4, menu);
    }

    /* JADX INFO: finally extract failed */
    public void onPictureInPictureModeChanged(boolean z3, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z3, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<androidx.core.util.a> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new androidx.core.app.n(z3, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    public boolean onPreparePanel(int i4, View view, Menu menu) {
        if (i4 != 0) {
            return true;
        }
        super.onPreparePanel(i4, view, menu);
        this.mMenuHostHelper.k(menu);
        return true;
    }

    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        if (!this.mActivityResultRegistry.b(i4, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i4, strArr, iArr);
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public final Object onRetainNonConfigurationInstance() {
        e eVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        I i4 = this.mViewModelStore;
        if (i4 == null && (eVar = (e) getLastNonConfigurationInstance()) != null) {
            i4 = eVar.f2334b;
        }
        if (i4 == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        e eVar2 = new e();
        eVar2.f2333a = onRetainCustomNonConfigurationInstance;
        eVar2.f2334b = i4;
        return eVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof n) {
            ((n) lifecycle).n(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.e(bundle);
    }

    public void onTrimMemory(int i4) {
        super.onTrimMemory(i4);
        Iterator<androidx.core.util.a> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i4));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.d();
    }

    public final <I, O> androidx.activity.result.c registerForActivityResult(C0796a aVar, ActivityResultRegistry activityResultRegistry, androidx.activity.result.b bVar) {
        return activityResultRegistry.i("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, aVar, bVar);
    }

    public void removeMenuProvider(C0442w wVar) {
        this.mMenuHostHelper.l(wVar);
    }

    public final void removeOnConfigurationChangedListener(androidx.core.util.a aVar) {
        this.mOnConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(C0781b bVar) {
        this.mContextAwareHelper.e(bVar);
    }

    public final void removeOnMultiWindowModeChangedListener(androidx.core.util.a aVar) {
        this.mOnMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(androidx.core.util.a aVar) {
        this.mOnNewIntentListeners.remove(aVar);
    }

    public final void removeOnPictureInPictureModeChangedListener(androidx.core.util.a aVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(aVar);
    }

    public final void removeOnTrimMemoryListener(androidx.core.util.a aVar) {
        this.mOnTrimMemoryListeners.remove(aVar);
    }

    public void reportFullyDrawn() {
        try {
            if (C0492b.d()) {
                C0492b.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.mFullyDrawnReporter.b();
            C0492b.b();
        } catch (Throwable th) {
            C0492b.b();
            throw th;
        }
    }

    public abstract void setContentView(int i4);

    public void setContentView(View view) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.A(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i4) {
        super.startActivityForResult(intent, i4);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7) {
        super.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7);
    }

    public void addMenuProvider(C0442w wVar, m mVar) {
        this.mMenuHostHelper.d(wVar, mVar);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i4, Bundle bundle) {
        super.startActivityForResult(intent, i4, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7, bundle);
    }

    public void addMenuProvider(C0442w wVar, m mVar, Lifecycle.State state) {
        this.mMenuHostHelper.e(wVar, mVar, state);
    }

    public final <I, O> androidx.activity.result.c registerForActivityResult(C0796a aVar, androidx.activity.result.b bVar) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, bVar);
    }
}
