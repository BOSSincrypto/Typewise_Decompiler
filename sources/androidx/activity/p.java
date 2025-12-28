package androidx.activity;

import android.window.OnBackInvokedCallback;
import androidx.activity.OnBackPressedDispatcher;
import u2.C0906a;

public final /* synthetic */ class p implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0906a f2388a;

    public /* synthetic */ p(C0906a aVar) {
        this.f2388a = aVar;
    }

    public final void onBackInvoked() {
        OnBackPressedDispatcher.a.c(this.f2388a);
    }
}
