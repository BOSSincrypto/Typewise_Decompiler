package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.core.util.g;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private final m f5826a;

    private k(m mVar) {
        this.f5826a = mVar;
    }

    public static k b(m mVar) {
        return new k((m) g.h(mVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        m mVar = this.f5826a;
        mVar.f5832e.j(mVar, mVar, fragment);
    }

    public void c() {
        this.f5826a.f5832e.u();
    }

    public void d(Configuration configuration) {
        this.f5826a.f5832e.w(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f5826a.f5832e.x(menuItem);
    }

    public void f() {
        this.f5826a.f5832e.y();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f5826a.f5832e.z(menu, menuInflater);
    }

    public void h() {
        this.f5826a.f5832e.A();
    }

    public void i() {
        this.f5826a.f5832e.C();
    }

    public void j(boolean z3) {
        this.f5826a.f5832e.D(z3);
    }

    public boolean k(MenuItem menuItem) {
        return this.f5826a.f5832e.G(menuItem);
    }

    public void l(Menu menu) {
        this.f5826a.f5832e.H(menu);
    }

    public void m() {
        this.f5826a.f5832e.J();
    }

    public void n(boolean z3) {
        this.f5826a.f5832e.K(z3);
    }

    public boolean o(Menu menu) {
        return this.f5826a.f5832e.L(menu);
    }

    public void p() {
        this.f5826a.f5832e.N();
    }

    public void q() {
        this.f5826a.f5832e.O();
    }

    public void r() {
        this.f5826a.f5832e.Q();
    }

    public boolean s() {
        return this.f5826a.f5832e.X(true);
    }

    public q t() {
        return this.f5826a.f5832e;
    }

    public void u() {
        this.f5826a.f5832e.P0();
    }

    public View v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f5826a.f5832e.r0().onCreateView(view, str, context, attributeSet);
    }
}
