package v;

import android.os.Bundle;

/* renamed from: v.a  reason: case insensitive filesystem */
public abstract class C0917a {

    /* renamed from: a  reason: collision with root package name */
    protected final Bundle f16386a;

    /* renamed from: v.a$a  reason: collision with other inner class name */
    public static abstract class C0245a {

        /* renamed from: a  reason: collision with root package name */
        protected final Bundle f16387a;

        protected C0245a(String str) {
            Bundle bundle = new Bundle();
            this.f16387a = bundle;
            bundle.putBoolean(str, true);
        }
    }

    protected C0917a(Bundle bundle) {
        this.f16386a = bundle;
    }

    public final Bundle a() {
        return this.f16386a;
    }

    public void c() {
        if (!e()) {
            throw new IllegalStateException("Invalid style, missing bundle key " + d());
        }
    }

    /* access modifiers changed from: protected */
    public abstract String d();

    public boolean e() {
        Bundle bundle = this.f16386a;
        if (bundle == null || !bundle.getBoolean(d(), false)) {
            return false;
        }
        return true;
    }
}
