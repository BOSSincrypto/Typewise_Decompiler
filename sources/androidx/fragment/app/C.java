package androidx.fragment.app;

import U.a;
import Y.c;
import Y.d;
import android.os.Bundle;
import androidx.lifecycle.C0457g;
import androidx.lifecycle.C0458h;
import androidx.lifecycle.I;
import androidx.lifecycle.J;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.n;

class C implements C0458h, d, J {

    /* renamed from: a  reason: collision with root package name */
    private final Fragment f5654a;

    /* renamed from: b  reason: collision with root package name */
    private final I f5655b;

    /* renamed from: c  reason: collision with root package name */
    private n f5656c = null;

    /* renamed from: d  reason: collision with root package name */
    private c f5657d = null;

    C(Fragment fragment, I i4) {
        this.f5654a = fragment;
        this.f5655b = i4;
    }

    /* access modifiers changed from: package-private */
    public void a(Lifecycle.Event event) {
        this.f5656c.h(event);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.f5656c == null) {
            this.f5656c = new n(this);
            this.f5657d = c.a(this);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        if (this.f5656c != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void d(Bundle bundle) {
        this.f5657d.d(bundle);
    }

    /* access modifiers changed from: package-private */
    public void e(Bundle bundle) {
        this.f5657d.e(bundle);
    }

    /* access modifiers changed from: package-private */
    public void f(Lifecycle.State state) {
        this.f5656c.n(state);
    }

    public /* synthetic */ a getDefaultViewModelCreationExtras() {
        return C0457g.a(this);
    }

    public Lifecycle getLifecycle() {
        b();
        return this.f5656c;
    }

    public androidx.savedstate.a getSavedStateRegistry() {
        b();
        return this.f5657d.b();
    }

    public I getViewModelStore() {
        b();
        return this.f5655b;
    }
}
