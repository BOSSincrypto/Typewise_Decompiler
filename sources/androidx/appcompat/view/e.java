package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

public class e extends b implements g.a {

    /* renamed from: c  reason: collision with root package name */
    private Context f2745c;

    /* renamed from: d  reason: collision with root package name */
    private ActionBarContextView f2746d;

    /* renamed from: e  reason: collision with root package name */
    private b.a f2747e;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference f2748f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2749g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2750h;

    /* renamed from: i  reason: collision with root package name */
    private g f2751i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z3) {
        this.f2745c = context;
        this.f2746d = actionBarContextView;
        this.f2747e = aVar;
        g S3 = new g(actionBarContextView.getContext()).S(1);
        this.f2751i = S3;
        S3.R(this);
        this.f2750h = z3;
    }

    public boolean a(g gVar, MenuItem menuItem) {
        return this.f2747e.c(this, menuItem);
    }

    public void b(g gVar) {
        k();
        this.f2746d.l();
    }

    public void c() {
        if (!this.f2749g) {
            this.f2749g = true;
            this.f2747e.b(this);
        }
    }

    public View d() {
        WeakReference weakReference = this.f2748f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public Menu e() {
        return this.f2751i;
    }

    public MenuInflater f() {
        return new g(this.f2746d.getContext());
    }

    public CharSequence g() {
        return this.f2746d.getSubtitle();
    }

    public CharSequence i() {
        return this.f2746d.getTitle();
    }

    public void k() {
        this.f2747e.a(this, this.f2751i);
    }

    public boolean l() {
        return this.f2746d.j();
    }

    public void m(View view) {
        WeakReference weakReference;
        this.f2746d.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.f2748f = weakReference;
    }

    public void n(int i4) {
        o(this.f2745c.getString(i4));
    }

    public void o(CharSequence charSequence) {
        this.f2746d.setSubtitle(charSequence);
    }

    public void q(int i4) {
        r(this.f2745c.getString(i4));
    }

    public void r(CharSequence charSequence) {
        this.f2746d.setTitle(charSequence);
    }

    public void s(boolean z3) {
        super.s(z3);
        this.f2746d.setTitleOptional(z3);
    }
}
