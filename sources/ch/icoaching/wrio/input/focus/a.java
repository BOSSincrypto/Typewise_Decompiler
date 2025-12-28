package ch.icoaching.wrio.input.focus;

import android.view.View;

public final /* synthetic */ class a implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DefaultInputConnectionFocusController f9778a;

    public /* synthetic */ a(DefaultInputConnectionFocusController defaultInputConnectionFocusController) {
        this.f9778a = defaultInputConnectionFocusController;
    }

    public final void onFocusChange(View view, boolean z3) {
        DefaultInputConnectionFocusController.r(this.f9778a, view, z3);
    }
}
