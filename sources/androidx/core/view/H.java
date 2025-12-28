package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

public final class H {

    /* renamed from: a  reason: collision with root package name */
    private final c f5166a;

    private static class a extends c {

        /* renamed from: a  reason: collision with root package name */
        private final View f5167a;

        a(View view) {
            this.f5167a = view;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            View view = this.f5167a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f5167a.getWindowToken(), 0);
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            View view = this.f5167a;
            if (view != null) {
                if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                    view.requestFocus();
                } else {
                    view = view.getRootView().findFocus();
                }
                if (view == null) {
                    view = this.f5167a.getRootView().findViewById(16908290);
                }
                if (view != null && view.hasWindowFocus()) {
                    view.post(new G(view));
                }
            }
        }
    }

    private static class c {
        c() {
        }

        /* access modifiers changed from: package-private */
        public abstract void a();

        /* access modifiers changed from: package-private */
        public abstract void b();
    }

    public H(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f5166a = new b(view);
        } else {
            this.f5166a = new a(view);
        }
    }

    public void a() {
        this.f5166a.a();
    }

    public void b() {
        this.f5166a.b();
    }

    private static class b extends a {

        /* renamed from: b  reason: collision with root package name */
        private View f5168b;

        /* renamed from: c  reason: collision with root package name */
        private WindowInsetsController f5169c;

        b(View view) {
            super(view);
            this.f5168b = view;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void f(AtomicBoolean atomicBoolean, WindowInsetsController windowInsetsController, int i4) {
            boolean z3;
            if ((i4 & 8) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            atomicBoolean.set(z3);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            View view;
            WindowInsetsController windowInsetsController = this.f5169c;
            if (windowInsetsController == null) {
                View view2 = this.f5168b;
                if (view2 != null) {
                    windowInsetsController = view2.getWindowInsetsController();
                } else {
                    windowInsetsController = null;
                }
            }
            if (windowInsetsController != null) {
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                N n4 = new N(atomicBoolean);
                windowInsetsController.addOnControllableInsetsChangedListener(n4);
                if (!atomicBoolean.get() && (view = this.f5168b) != null) {
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f5168b.getWindowToken(), 0);
                }
                windowInsetsController.removeOnControllableInsetsChangedListener(n4);
                windowInsetsController.hide(WindowInsets.Type.ime());
                return;
            }
            super.a();
        }

        /* access modifiers changed from: package-private */
        public void b() {
            View view = this.f5168b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f5169c;
            if (windowInsetsController == null) {
                View view2 = this.f5168b;
                if (view2 != null) {
                    windowInsetsController = view2.getWindowInsetsController();
                } else {
                    windowInsetsController = null;
                }
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            } else {
                super.b();
            }
        }

        b(WindowInsetsController windowInsetsController) {
            super((View) null);
            this.f5169c = windowInsetsController;
        }
    }

    H(WindowInsetsController windowInsetsController) {
        this.f5166a = new b(windowInsetsController);
    }
}
