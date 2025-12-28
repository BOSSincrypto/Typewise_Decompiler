package androidx.appcompat.view.menu;

import H.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

public class o extends c implements Menu {

    /* renamed from: d  reason: collision with root package name */
    private final a f3016d;

    public o(Context context, a aVar) {
        super(context);
        if (aVar != null) {
            this.f3016d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(CharSequence charSequence) {
        return c(this.f3016d.add(charSequence));
    }

    public int addIntentOptions(int i4, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        MenuItem[] menuItemArr3 = menuItemArr;
        if (menuItemArr3 != null) {
            menuItemArr2 = new MenuItem[menuItemArr3.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = this.f3016d.addIntentOptions(i4, i5, i6, componentName, intentArr, intent, i7, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i8 = 0; i8 < length; i8++) {
                menuItemArr3[i8] = c(menuItemArr2[i8]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f3016d.addSubMenu(charSequence));
    }

    public void clear() {
        e();
        this.f3016d.clear();
    }

    public void close() {
        this.f3016d.close();
    }

    public MenuItem findItem(int i4) {
        return c(this.f3016d.findItem(i4));
    }

    public MenuItem getItem(int i4) {
        return c(this.f3016d.getItem(i4));
    }

    public boolean hasVisibleItems() {
        return this.f3016d.hasVisibleItems();
    }

    public boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        return this.f3016d.isShortcutKey(i4, keyEvent);
    }

    public boolean performIdentifierAction(int i4, int i5) {
        return this.f3016d.performIdentifierAction(i4, i5);
    }

    public boolean performShortcut(int i4, KeyEvent keyEvent, int i5) {
        return this.f3016d.performShortcut(i4, keyEvent, i5);
    }

    public void removeGroup(int i4) {
        f(i4);
        this.f3016d.removeGroup(i4);
    }

    public void removeItem(int i4) {
        g(i4);
        this.f3016d.removeItem(i4);
    }

    public void setGroupCheckable(int i4, boolean z3, boolean z4) {
        this.f3016d.setGroupCheckable(i4, z3, z4);
    }

    public void setGroupEnabled(int i4, boolean z3) {
        this.f3016d.setGroupEnabled(i4, z3);
    }

    public void setGroupVisible(int i4, boolean z3) {
        this.f3016d.setGroupVisible(i4, z3);
    }

    public void setQwertyMode(boolean z3) {
        this.f3016d.setQwertyMode(z3);
    }

    public int size() {
        return this.f3016d.size();
    }

    public MenuItem add(int i4) {
        return c(this.f3016d.add(i4));
    }

    public SubMenu addSubMenu(int i4) {
        return d(this.f3016d.addSubMenu(i4));
    }

    public MenuItem add(int i4, int i5, int i6, CharSequence charSequence) {
        return c(this.f3016d.add(i4, i5, i6, charSequence));
    }

    public SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        return d(this.f3016d.addSubMenu(i4, i5, i6, charSequence));
    }

    public MenuItem add(int i4, int i5, int i6, int i7) {
        return c(this.f3016d.add(i4, i5, i6, i7));
    }

    public SubMenu addSubMenu(int i4, int i5, int i6, int i7) {
        return d(this.f3016d.addSubMenu(i4, i5, i6, i7));
    }
}
