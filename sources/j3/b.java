package j3;

import android.view.View;
import android.widget.LinearLayout;
import kotlin.jvm.internal.o;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private View f13775a;

    /* renamed from: b  reason: collision with root package name */
    private LinearLayout f13776b;

    /* access modifiers changed from: protected */
    public final View a() {
        return this.f13775a;
    }

    /* access modifiers changed from: protected */
    public final void b(View view) {
        this.f13775a = view;
    }

    public final void c(LinearLayout linearLayout) {
        o.e(linearLayout, "keyboardLayoutRootView");
        this.f13776b = linearLayout;
    }

    /* access modifiers changed from: protected */
    public final LinearLayout d() {
        return this.f13776b;
    }

    public final void e(View view) {
        o.e(view, "view");
        this.f13775a = view;
        h();
    }

    public abstract void f();

    public abstract boolean g();

    public abstract void h();
}
