package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.C0461k;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;

class FragmentStateAdapter$4 implements C0461k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Handler f7057a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Runnable f7058b;

    public void c(m mVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f7057a.removeCallbacks(this.f7058b);
            mVar.getLifecycle().c(this);
        }
    }
}
