package androidx.activity;

import Y.c;
import Y.d;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.savedstate.a;
import kotlin.jvm.internal.o;

public abstract class k extends Dialog implements m, q, d {

    /* renamed from: a  reason: collision with root package name */
    private n f2376a;

    /* renamed from: b  reason: collision with root package name */
    private final c f2377b = c.f1976d.a(this);

    /* renamed from: c  reason: collision with root package name */
    private final OnBackPressedDispatcher f2378c = new OnBackPressedDispatcher(new j(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(Context context, int i4) {
        super(context, i4);
        o.e(context, "context");
    }

    private final n b() {
        n nVar = this.f2376a;
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(this);
        this.f2376a = nVar2;
        return nVar2;
    }

    /* access modifiers changed from: private */
    public static final void c(k kVar) {
        o.e(kVar, "this$0");
        super.onBackPressed();
    }

    public Lifecycle getLifecycle() {
        return b();
    }

    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f2378c;
    }

    public a getSavedStateRegistry() {
        return this.f2377b.b();
    }

    public void onBackPressed() {
        this.f2378c.k();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f2378c;
            OnBackInvokedDispatcher a4 = getOnBackInvokedDispatcher();
            o.d(a4, "onBackInvokedDispatcher");
            onBackPressedDispatcher.n(a4);
        }
        this.f2377b.d(bundle);
        b().h(Lifecycle.Event.ON_CREATE);
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        o.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f2377b.e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        b().h(Lifecycle.Event.ON_RESUME);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        b().h(Lifecycle.Event.ON_DESTROY);
        this.f2376a = null;
        super.onStop();
    }
}
