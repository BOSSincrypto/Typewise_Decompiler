package androidx.core.view;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

public final /* synthetic */ class G implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f5165a;

    public /* synthetic */ G(View view) {
        this.f5165a = view;
    }

    public final void run() {
        ((InputMethodManager) this.f5165a.getContext().getSystemService("input_method")).showSoftInput(this.f5165a, 0);
    }
}
