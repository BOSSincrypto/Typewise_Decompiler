package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.a;
import java.util.Map;
import kotlin.c;
import kotlin.jvm.internal.o;
import l2.f;

public final class SavedStateHandlesProvider implements a.c {

    /* renamed from: a  reason: collision with root package name */
    private final a f6046a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6047b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f6048c;

    /* renamed from: d  reason: collision with root package name */
    private final f f6049d;

    public SavedStateHandlesProvider(a aVar, J j4) {
        o.e(aVar, "savedStateRegistry");
        o.e(j4, "viewModelStoreOwner");
        this.f6046a = aVar;
        this.f6049d = c.b(new SavedStateHandlesProvider$viewModel$2(j4));
    }

    private final A c() {
        return (A) this.f6049d.getValue();
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f6048c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : c().f().entrySet()) {
            String str = (String) entry.getKey();
            Bundle a4 = ((z) entry.getValue()).c().a();
            if (!o.a(a4, Bundle.EMPTY)) {
                bundle.putBundle(str, a4);
            }
        }
        this.f6047b = false;
        return bundle;
    }

    public final Bundle b(String str) {
        Bundle bundle;
        o.e(str, "key");
        d();
        Bundle bundle2 = this.f6048c;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(str);
        } else {
            bundle = null;
        }
        Bundle bundle3 = this.f6048c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f6048c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f6048c = null;
        }
        return bundle;
    }

    public final void d() {
        if (!this.f6047b) {
            this.f6048c = this.f6046a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
            this.f6047b = true;
            c();
        }
    }
}
