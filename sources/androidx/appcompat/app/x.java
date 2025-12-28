package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.k;
import androidx.appcompat.view.b;
import androidx.core.view.C0436p;
import n.C0822a;

public abstract class x extends k implements C0371e {

    /* renamed from: d  reason: collision with root package name */
    private C0373g f2722d;

    /* renamed from: e  reason: collision with root package name */
    private final C0436p.a f2723e = new w(this);

    public x(Context context, int i4) {
        super(context, e(context, i4));
        C0373g d4 = d();
        d4.N(e(context, i4));
        d4.y((Bundle) null);
    }

    private static int e(Context context, int i4) {
        if (i4 != 0) {
            return i4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0822a.f14690w, typedValue, true);
        return typedValue.resourceId;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d().e(view, layoutParams);
    }

    public C0373g d() {
        if (this.f2722d == null) {
            this.f2722d = C0373g.i(this, this);
        }
        return this.f2722d;
    }

    public void dismiss() {
        super.dismiss();
        d().z();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0436p.e(this.f2723e, getWindow().getDecorView(), this, keyEvent);
    }

    /* access modifiers changed from: package-private */
    public boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public View findViewById(int i4) {
        return d().j(i4);
    }

    public boolean g(int i4) {
        return d().H(i4);
    }

    public void invalidateOptionsMenu() {
        d().u();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        d().t();
        super.onCreate(bundle);
        d().y(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        d().E();
    }

    public void onSupportActionModeFinished(b bVar) {
    }

    public void onSupportActionModeStarted(b bVar) {
    }

    public b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    public void setContentView(int i4) {
        d().I(i4);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().O(charSequence);
    }

    public void setContentView(View view) {
        d().J(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d().K(view, layoutParams);
    }

    public void setTitle(int i4) {
        super.setTitle(i4);
        d().O(getContext().getString(i4));
    }
}
