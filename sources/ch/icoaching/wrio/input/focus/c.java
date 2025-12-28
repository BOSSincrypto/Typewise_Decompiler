package ch.icoaching.wrio.input.focus;

import android.view.MotionEvent;
import android.view.View;

public final /* synthetic */ class c implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DefaultInputConnectionFocusController f9779a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f9780b;

    public /* synthetic */ c(DefaultInputConnectionFocusController defaultInputConnectionFocusController, View view) {
        this.f9779a = defaultInputConnectionFocusController;
        this.f9780b = view;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return DefaultInputConnectionFocusController.s(this.f9779a, this.f9780b, view, motionEvent);
    }
}
