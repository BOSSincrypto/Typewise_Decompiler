package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.C0461k;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;

class FragmentManager$5 implements C0461k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f5703a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Lifecycle f5704b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ q f5705c;

    public void c(m mVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START && ((Bundle) this.f5705c.f5863k.get(this.f5703a)) != null) {
            throw null;
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            this.f5704b.c(this);
            this.f5705c.f5864l.remove(this.f5703a);
        }
    }
}
