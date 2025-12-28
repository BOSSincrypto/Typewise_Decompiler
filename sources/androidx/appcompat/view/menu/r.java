package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.g;

public class r extends g implements SubMenu {

    /* renamed from: B  reason: collision with root package name */
    private g f3040B;

    /* renamed from: C  reason: collision with root package name */
    private i f3041C;

    public r(Context context, g gVar, i iVar) {
        super(context);
        this.f3040B = gVar;
        this.f3041C = iVar;
    }

    public g D() {
        return this.f3040B.D();
    }

    public boolean F() {
        return this.f3040B.F();
    }

    public boolean G() {
        return this.f3040B.G();
    }

    public boolean H() {
        return this.f3040B.H();
    }

    public void R(g.a aVar) {
        this.f3040B.R(aVar);
    }

    public Menu e0() {
        return this.f3040B;
    }

    public boolean f(i iVar) {
        return this.f3040B.f(iVar);
    }

    public MenuItem getItem() {
        return this.f3041C;
    }

    /* access modifiers changed from: package-private */
    public boolean h(g gVar, MenuItem menuItem) {
        if (super.h(gVar, menuItem) || this.f3040B.h(gVar, menuItem)) {
            return true;
        }
        return false;
    }

    public boolean k(i iVar) {
        return this.f3040B.k(iVar);
    }

    public void setGroupDividerEnabled(boolean z3) {
        this.f3040B.setGroupDividerEnabled(z3);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.V(drawable);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.Y(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.Z(view);
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f3041C.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z3) {
        this.f3040B.setQwertyMode(z3);
    }

    public String t() {
        int i4;
        i iVar = this.f3041C;
        if (iVar != null) {
            i4 = iVar.getItemId();
        } else {
            i4 = 0;
        }
        if (i4 == 0) {
            return null;
        }
        return super.t() + ":" + i4;
    }

    public SubMenu setHeaderIcon(int i4) {
        return (SubMenu) super.U(i4);
    }

    public SubMenu setHeaderTitle(int i4) {
        return (SubMenu) super.X(i4);
    }

    public SubMenu setIcon(int i4) {
        this.f3041C.setIcon(i4);
        return this;
    }
}
