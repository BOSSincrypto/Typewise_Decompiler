package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.P;
import androidx.core.view.S;

class k0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k  reason: collision with root package name */
    private static k0 f3612k;

    /* renamed from: l  reason: collision with root package name */
    private static k0 f3613l;

    /* renamed from: a  reason: collision with root package name */
    private final View f3614a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f3615b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3616c;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f3617d = new i0(this);

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f3618e = new j0(this);

    /* renamed from: f  reason: collision with root package name */
    private int f3619f;

    /* renamed from: g  reason: collision with root package name */
    private int f3620g;

    /* renamed from: h  reason: collision with root package name */
    private l0 f3621h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3622i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3623j;

    private k0(View view, CharSequence charSequence) {
        this.f3614a = view;
        this.f3615b = charSequence;
        this.f3616c = S.d(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void b() {
        this.f3614a.removeCallbacks(this.f3617d);
    }

    private void c() {
        this.f3623j = true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        i(false);
    }

    private void f() {
        this.f3614a.postDelayed(this.f3617d, (long) ViewConfiguration.getLongPressTimeout());
    }

    private static void g(k0 k0Var) {
        k0 k0Var2 = f3612k;
        if (k0Var2 != null) {
            k0Var2.b();
        }
        f3612k = k0Var;
        if (k0Var != null) {
            k0Var.f();
        }
    }

    public static void h(View view, CharSequence charSequence) {
        k0 k0Var = f3612k;
        if (k0Var != null && k0Var.f3614a == view) {
            g((k0) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            k0 k0Var2 = f3613l;
            if (k0Var2 != null && k0Var2.f3614a == view) {
                k0Var2.d();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new k0(view, charSequence);
    }

    private boolean j(MotionEvent motionEvent) {
        int x3 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        if (!this.f3623j && Math.abs(x3 - this.f3619f) <= this.f3616c && Math.abs(y3 - this.f3620g) <= this.f3616c) {
            return false;
        }
        this.f3619f = x3;
        this.f3620g = y3;
        this.f3623j = false;
        return true;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (f3613l == this) {
            f3613l = null;
            l0 l0Var = this.f3621h;
            if (l0Var != null) {
                l0Var.c();
                this.f3621h = null;
                c();
                this.f3614a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f3612k == this) {
            g((k0) null);
        }
        this.f3614a.removeCallbacks(this.f3618e);
    }

    /* access modifiers changed from: package-private */
    public void i(boolean z3) {
        long j4;
        long longPressTimeout;
        long j5;
        if (P.R(this.f3614a)) {
            g((k0) null);
            k0 k0Var = f3613l;
            if (k0Var != null) {
                k0Var.d();
            }
            f3613l = this;
            this.f3622i = z3;
            l0 l0Var = new l0(this.f3614a.getContext());
            this.f3621h = l0Var;
            l0Var.e(this.f3614a, this.f3619f, this.f3620g, this.f3622i, this.f3615b);
            this.f3614a.addOnAttachStateChangeListener(this);
            if (this.f3622i) {
                j4 = 2500;
            } else {
                if ((P.L(this.f3614a) & 1) == 1) {
                    longPressTimeout = (long) ViewConfiguration.getLongPressTimeout();
                    j5 = 3000;
                } else {
                    longPressTimeout = (long) ViewConfiguration.getLongPressTimeout();
                    j5 = 15000;
                }
                j4 = j5 - longPressTimeout;
            }
            this.f3614a.removeCallbacks(this.f3618e);
            this.f3614a.postDelayed(this.f3618e, j4);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f3621h != null && this.f3622i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f3614a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f3614a.isEnabled() && this.f3621h == null && j(motionEvent)) {
            g(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f3619f = view.getWidth() / 2;
        this.f3620g = view.getHeight() / 2;
        i(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        d();
    }
}
