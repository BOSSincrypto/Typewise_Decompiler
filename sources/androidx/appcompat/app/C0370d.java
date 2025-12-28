package androidx.appcompat.app;

import Y.e;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.t;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.m0;
import androidx.core.app.q;
import androidx.core.os.g;
import androidx.fragment.app.h;
import androidx.lifecycle.K;
import androidx.lifecycle.L;
import androidx.savedstate.a;
import l.C0781b;

/* renamed from: androidx.appcompat.app.d  reason: case insensitive filesystem */
public abstract class C0370d extends h implements C0371e, q.a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private C0373g mDelegate;
    private Resources mResources;

    /* renamed from: androidx.appcompat.app.d$a */
    class a implements a.c {
        a() {
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            C0370d.this.getDelegate().C(bundle);
            return bundle;
        }
    }

    /* renamed from: androidx.appcompat.app.d$b */
    class b implements C0781b {
        b() {
        }

        public void a(Context context) {
            C0373g delegate = C0370d.this.getDelegate();
            delegate.t();
            delegate.y(C0370d.this.getSavedStateRegistry().b(C0370d.DELEGATE_TAG));
        }
    }

    public C0370d() {
        n();
    }

    private void n() {
        getSavedStateRegistry().h(DELEGATE_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private void o() {
        K.a(getWindow().getDecorView(), this);
        L.a(getWindow().getDecorView(), this);
        e.a(getWindow().getDecorView(), this);
        t.a(getWindow().getDecorView(), this);
    }

    private boolean p(KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o();
        getDelegate().e(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().g(context));
    }

    public void closeOptionsMenu() {
        C0367a supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.g()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0367a supportActionBar = getSupportActionBar();
        if (keyCode != 82 || supportActionBar == null || !supportActionBar.p(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(int i4) {
        return getDelegate().j(i4);
    }

    public C0373g getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = C0373g.h(this, this);
        }
        return this.mDelegate;
    }

    public C0368b getDrawerToggleDelegate() {
        return getDelegate().n();
    }

    public MenuInflater getMenuInflater() {
        return getDelegate().q();
    }

    public Resources getResources() {
        if (this.mResources == null && m0.c()) {
            this.mResources = new m0(this, super.getResources());
        }
        Resources resources = this.mResources;
        if (resources == null) {
            return super.getResources();
        }
        return resources;
    }

    public C0367a getSupportActionBar() {
        return getDelegate().s();
    }

    public Intent getSupportParentActivityIntent() {
        return androidx.core.app.h.a(this);
    }

    public void invalidateOptionsMenu() {
        getDelegate().u();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().x(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(q qVar) {
        qVar.b(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        getDelegate().z();
    }

    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (p(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onLocalesChanged(g gVar) {
    }

    public final boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        C0367a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.j() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    public boolean onMenuOpened(int i4, Menu menu) {
        return super.onMenuOpened(i4, menu);
    }

    /* access modifiers changed from: protected */
    public void onNightModeChanged(int i4) {
    }

    public void onPanelClosed(int i4, Menu menu) {
        super.onPanelClosed(i4, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().A(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        getDelegate().B();
    }

    public void onPrepareSupportNavigateUpTaskStack(q qVar) {
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        getDelegate().D();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        getDelegate().E();
    }

    public void onSupportActionModeFinished(androidx.appcompat.view.b bVar) {
    }

    public void onSupportActionModeStarted(androidx.appcompat.view.b bVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            q d4 = q.d(this);
            onCreateSupportNavigateUpTaskStack(d4);
            onPrepareSupportNavigateUpTaskStack(d4);
            d4.e();
            try {
                androidx.core.app.b.m(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i4) {
        super.onTitleChanged(charSequence, i4);
        getDelegate().O(charSequence);
    }

    public androidx.appcompat.view.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    public void openOptionsMenu() {
        C0367a supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.q()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i4) {
        o();
        getDelegate().I(i4);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().M(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i4) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z3) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z3) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z3) {
    }

    public void setTheme(int i4) {
        super.setTheme(i4);
        getDelegate().N(i4);
    }

    public androidx.appcompat.view.b startSupportActionMode(b.a aVar) {
        return getDelegate().P(aVar);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().u();
    }

    public void supportNavigateUpTo(Intent intent) {
        androidx.core.app.h.e(this, intent);
    }

    public boolean supportRequestWindowFeature(int i4) {
        return getDelegate().H(i4);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return androidx.core.app.h.f(this, intent);
    }

    public void setContentView(View view) {
        o();
        getDelegate().J(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o();
        getDelegate().K(view, layoutParams);
    }
}
