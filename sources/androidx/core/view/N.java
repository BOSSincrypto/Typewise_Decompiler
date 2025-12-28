package androidx.core.view;

import android.view.WindowInsetsController;
import androidx.core.view.H;
import java.util.concurrent.atomic.AtomicBoolean;

public final /* synthetic */ class N implements WindowInsetsController.OnControllableInsetsChangedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f5178a;

    public /* synthetic */ N(AtomicBoolean atomicBoolean) {
        this.f5178a = atomicBoolean;
    }

    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i4) {
        H.b.f(this.f5178a, windowInsetsController, i4);
    }
}
