package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private Object f2737a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2738b;

    public interface a {
        boolean a(b bVar, Menu menu);

        void b(b bVar);

        boolean c(b bVar, MenuItem menuItem);

        boolean d(b bVar, Menu menu);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.f2737a;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.f2738b;
    }

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i4);

    public abstract void o(CharSequence charSequence);

    public void p(Object obj) {
        this.f2737a = obj;
    }

    public abstract void q(int i4);

    public abstract void r(CharSequence charSequence);

    public void s(boolean z3) {
        this.f2738b = z3;
    }
}
