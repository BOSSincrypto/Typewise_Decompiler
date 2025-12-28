package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

public final class F implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f5162a;

    /* renamed from: b  reason: collision with root package name */
    private ViewTreeObserver f5163b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f5164c;

    private F(View view, Runnable runnable) {
        this.f5162a = view;
        this.f5163b = view.getViewTreeObserver();
        this.f5164c = runnable;
    }

    public static F a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            F f4 = new F(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(f4);
            view.addOnAttachStateChangeListener(f4);
            return f4;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public void b() {
        if (this.f5163b.isAlive()) {
            this.f5163b.removeOnPreDrawListener(this);
        } else {
            this.f5162a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f5162a.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        b();
        this.f5164c.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f5163b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
