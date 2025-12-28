package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.q;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.d;
import androidx.core.app.b;
import androidx.core.app.p;
import androidx.lifecycle.I;
import androidx.lifecycle.J;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.n;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class h extends ComponentActivity implements b.f {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final n mFragmentLifecycleRegistry = new n(this);
    final k mFragments = k.b(new a());
    boolean mResumed;
    boolean mStopped = true;

    class a extends m implements J, q, d, Y.d, u {
        public a() {
            super(h.this);
        }

        public void a(q qVar, Fragment fragment) {
            h.this.onAttachFragment(fragment);
        }

        public View c(int i4) {
            return h.this.findViewById(i4);
        }

        public boolean d() {
            Window window = h.this.getWindow();
            if (window == null || window.peekDecorView() == null) {
                return false;
            }
            return true;
        }

        public ActivityResultRegistry getActivityResultRegistry() {
            return h.this.getActivityResultRegistry();
        }

        public Lifecycle getLifecycle() {
            return h.this.mFragmentLifecycleRegistry;
        }

        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return h.this.getOnBackPressedDispatcher();
        }

        public androidx.savedstate.a getSavedStateRegistry() {
            return h.this.getSavedStateRegistry();
        }

        public I getViewModelStore() {
            return h.this.getViewModelStore();
        }

        public LayoutInflater i() {
            return h.this.getLayoutInflater().cloneInContext(h.this);
        }

        public boolean k(String str) {
            return b.u(h.this, str);
        }

        public void n() {
            h.this.supportInvalidateOptionsMenu();
        }

        /* renamed from: o */
        public h h() {
            return h.this;
        }
    }

    public h() {
        init();
    }

    private void init() {
        getSavedStateRegistry().h(LIFECYCLE_TAG, new f(this));
        addOnContextAvailableListener(new g(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Bundle k() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.h(Lifecycle.Event.ON_STOP);
        return new Bundle();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l(Context context) {
        this.mFragments.a((Fragment) null);
    }

    private static boolean m(q qVar, Lifecycle.State state) {
        boolean z3 = false;
        for (Fragment fragment : qVar.p0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z3 |= m(fragment.getChildFragmentManager(), state);
                }
                C c4 = fragment.mViewLifecycleOwner;
                if (c4 != null && c4.getLifecycle().b().isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.mViewLifecycleOwner.f(state);
                    z3 = true;
                }
                if (fragment.mLifecycleRegistry.b().isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.mLifecycleRegistry.n(state);
                    z3 = true;
                }
            }
        }
        return z3;
    }

    /* access modifiers changed from: package-private */
    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.v(view, str, context, attributeSet);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.t().T(str, fileDescriptor, printWriter, strArr);
    }

    public q getSupportFragmentManager() {
        return this.mFragments.t();
    }

    @Deprecated
    public androidx.loader.app.a getSupportLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    /* access modifiers changed from: package-private */
    public void markFragmentsCreated() {
        do {
        } while (m(getSupportFragmentManager(), Lifecycle.State.CREATED));
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i4, int i5, Intent intent) {
        this.mFragments.u();
        super.onActivityResult(i4, i5, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mFragments.u();
        super.onConfigurationChanged(configuration);
        this.mFragments.d(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.h(Lifecycle.Event.ON_CREATE);
        this.mFragments.f();
    }

    public boolean onCreatePanelMenu(int i4, Menu menu) {
        if (i4 == 0) {
            return super.onCreatePanelMenu(i4, menu) | this.mFragments.g(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i4, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.h();
        this.mFragmentLifecycleRegistry.h(Lifecycle.Event.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.i();
    }

    public boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        if (i4 == 0) {
            return this.mFragments.k(menuItem);
        }
        if (i4 != 6) {
            return false;
        }
        return this.mFragments.e(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z3) {
        this.mFragments.j(z3);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        this.mFragments.u();
        super.onNewIntent(intent);
    }

    public void onPanelClosed(int i4, Menu menu) {
        if (i4 == 0) {
            this.mFragments.l(menu);
        }
        super.onPanelClosed(i4, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.m();
        this.mFragmentLifecycleRegistry.h(Lifecycle.Event.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z3) {
        this.mFragments.n(z3);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public boolean onPreparePanel(int i4, View view, Menu menu) {
        if (i4 == 0) {
            return onPrepareOptionsPanel(view, menu) | this.mFragments.o(menu);
        }
        return super.onPreparePanel(i4, view, menu);
    }

    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        this.mFragments.u();
        super.onRequestPermissionsResult(i4, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        this.mFragments.u();
        super.onResume();
        this.mResumed = true;
        this.mFragments.s();
    }

    /* access modifiers changed from: protected */
    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.h(Lifecycle.Event.ON_RESUME);
        this.mFragments.p();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        this.mFragments.u();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.s();
        this.mFragmentLifecycleRegistry.h(Lifecycle.Event.ON_START);
        this.mFragments.q();
    }

    public void onStateNotSaved() {
        this.mFragments.u();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.r();
        this.mFragmentLifecycleRegistry.h(Lifecycle.Event.ON_STOP);
    }

    public void setEnterSharedElementCallback(p pVar) {
        b.s(this, pVar);
    }

    public void setExitSharedElementCallback(p pVar) {
        b.t(this, pVar);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i4) {
        startActivityFromFragment(fragment, intent, i4, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7, Bundle bundle) {
        if (i4 == -1) {
            b.w(this, intentSender, i4, intent, i5, i6, i7, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        b.n(this);
    }

    public abstract void supportInvalidateOptionsMenu();

    public void supportPostponeEnterTransition() {
        b.p(this);
    }

    public void supportStartPostponedEnterTransition() {
        b.x(this);
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i4) {
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i4, Bundle bundle) {
        if (i4 == -1) {
            b.v(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i4, bundle);
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView((View) null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }
}
