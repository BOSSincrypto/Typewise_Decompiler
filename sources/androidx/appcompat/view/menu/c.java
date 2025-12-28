package androidx.appcompat.view.menu;

import H.b;
import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import y.g;

abstract class c {

    /* renamed from: a  reason: collision with root package name */
    final Context f2871a;

    /* renamed from: b  reason: collision with root package name */
    private g f2872b;

    /* renamed from: c  reason: collision with root package name */
    private g f2873c;

    c(Context context) {
        this.f2871a = context;
    }

    /* access modifiers changed from: package-private */
    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof b)) {
            return menuItem;
        }
        b bVar = (b) menuItem;
        if (this.f2872b == null) {
            this.f2872b = new g();
        }
        MenuItem menuItem2 = (MenuItem) this.f2872b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j jVar = new j(this.f2871a, bVar);
        this.f2872b.put(bVar, jVar);
        return jVar;
    }

    /* access modifiers changed from: package-private */
    public final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        g gVar = this.f2872b;
        if (gVar != null) {
            gVar.clear();
        }
        g gVar2 = this.f2873c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final void f(int i4) {
        if (this.f2872b != null) {
            int i5 = 0;
            while (i5 < this.f2872b.size()) {
                if (((b) this.f2872b.j(i5)).getGroupId() == i4) {
                    this.f2872b.l(i5);
                    i5--;
                }
                i5++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void g(int i4) {
        if (this.f2872b != null) {
            for (int i5 = 0; i5 < this.f2872b.size(); i5++) {
                if (((b) this.f2872b.j(i5)).getItemId() == i4) {
                    this.f2872b.l(i5);
                    return;
                }
            }
        }
    }
}
