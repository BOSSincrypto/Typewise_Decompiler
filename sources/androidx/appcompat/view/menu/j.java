package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.C0408b;
import java.lang.reflect.Method;

public class j extends c implements MenuItem {

    /* renamed from: d  reason: collision with root package name */
    private final H.b f2991d;

    /* renamed from: e  reason: collision with root package name */
    private Method f2992e;

    private class a extends C0408b {

        /* renamed from: d  reason: collision with root package name */
        final ActionProvider f2993d;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f2993d = actionProvider;
        }

        public boolean a() {
            return this.f2993d.hasSubMenu();
        }

        public boolean d() {
            return this.f2993d.onPerformDefaultAction();
        }

        public void e(SubMenu subMenu) {
            this.f2993d.onPrepareSubMenu(j.this.d(subMenu));
        }
    }

    private class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: f  reason: collision with root package name */
        private C0408b.C0084b f2995f;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        public boolean b() {
            return this.f2993d.isVisible();
        }

        public View c(MenuItem menuItem) {
            return this.f2993d.onCreateActionView(menuItem);
        }

        public boolean f() {
            return this.f2993d.overridesItemVisibility();
        }

        public void i(C0408b.C0084b bVar) {
            b bVar2;
            this.f2995f = bVar;
            ActionProvider actionProvider = this.f2993d;
            if (bVar != null) {
                bVar2 = this;
            } else {
                bVar2 = null;
            }
            actionProvider.setVisibilityListener(bVar2);
        }

        public void onActionProviderVisibilityChanged(boolean z3) {
            C0408b.C0084b bVar = this.f2995f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z3);
            }
        }
    }

    static class c extends FrameLayout implements androidx.appcompat.view.c {

        /* renamed from: a  reason: collision with root package name */
        final CollapsibleActionView f2997a;

        c(View view) {
            super(view.getContext());
            this.f2997a = (CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: package-private */
        public View a() {
            return (View) this.f2997a;
        }

        public void c() {
            this.f2997a.onActionViewExpanded();
        }

        public void f() {
            this.f2997a.onActionViewCollapsed();
        }
    }

    private class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a  reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f2998a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f2998a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f2998a.onMenuItemActionCollapse(j.this.c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f2998a.onMenuItemActionExpand(j.this.c(menuItem));
        }
    }

    private class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f3000a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f3000a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f3000a.onMenuItemClick(j.this.c(menuItem));
        }
    }

    public j(Context context, H.b bVar) {
        super(context);
        if (bVar != null) {
            this.f2991d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f2991d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f2991d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C0408b b4 = this.f2991d.b();
        if (b4 instanceof a) {
            return ((a) b4).f2993d;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f2991d.getActionView();
        if (actionView instanceof c) {
            return ((c) actionView).a();
        }
        return actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f2991d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f2991d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f2991d.getContentDescription();
    }

    public int getGroupId() {
        return this.f2991d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f2991d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f2991d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2991d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f2991d.getIntent();
    }

    public int getItemId() {
        return this.f2991d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f2991d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f2991d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f2991d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f2991d.getOrder();
    }

    public SubMenu getSubMenu() {
        return d(this.f2991d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f2991d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f2991d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f2991d.getTooltipText();
    }

    public void h(boolean z3) {
        try {
            if (this.f2992e == null) {
                this.f2992e = this.f2991d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f2992e.invoke(this.f2991d, new Object[]{Boolean.valueOf(z3)});
        } catch (Exception e4) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e4);
        }
    }

    public boolean hasSubMenu() {
        return this.f2991d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f2991d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f2991d.isCheckable();
    }

    public boolean isChecked() {
        return this.f2991d.isChecked();
    }

    public boolean isEnabled() {
        return this.f2991d.isEnabled();
    }

    public boolean isVisible() {
        return this.f2991d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f2871a, actionProvider);
        H.b bVar2 = this.f2991d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f2991d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c4) {
        this.f2991d.setAlphabeticShortcut(c4);
        return this;
    }

    public MenuItem setCheckable(boolean z3) {
        this.f2991d.setCheckable(z3);
        return this;
    }

    public MenuItem setChecked(boolean z3) {
        this.f2991d.setChecked(z3);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f2991d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z3) {
        this.f2991d.setEnabled(z3);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f2991d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2991d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2991d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f2991d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c4) {
        this.f2991d.setNumericShortcut(c4);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        d dVar;
        H.b bVar = this.f2991d;
        if (onActionExpandListener != null) {
            dVar = new d(onActionExpandListener);
        } else {
            dVar = null;
        }
        bVar.setOnActionExpandListener(dVar);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        e eVar;
        H.b bVar = this.f2991d;
        if (onMenuItemClickListener != null) {
            eVar = new e(onMenuItemClickListener);
        } else {
            eVar = null;
        }
        bVar.setOnMenuItemClickListener(eVar);
        return this;
    }

    public MenuItem setShortcut(char c4, char c5) {
        this.f2991d.setShortcut(c4, c5);
        return this;
    }

    public void setShowAsAction(int i4) {
        this.f2991d.setShowAsAction(i4);
    }

    public MenuItem setShowAsActionFlags(int i4) {
        this.f2991d.setShowAsActionFlags(i4);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f2991d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2991d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f2991d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z3) {
        return this.f2991d.setVisible(z3);
    }

    public MenuItem setAlphabeticShortcut(char c4, int i4) {
        this.f2991d.setAlphabeticShortcut(c4, i4);
        return this;
    }

    public MenuItem setIcon(int i4) {
        this.f2991d.setIcon(i4);
        return this;
    }

    public MenuItem setNumericShortcut(char c4, int i4) {
        this.f2991d.setNumericShortcut(c4, i4);
        return this;
    }

    public MenuItem setShortcut(char c4, char c5, int i4, int i5) {
        this.f2991d.setShortcut(c4, c5, i4, i5);
        return this;
    }

    public MenuItem setTitle(int i4) {
        this.f2991d.setTitle(i4);
        return this;
    }

    public MenuItem setActionView(int i4) {
        this.f2991d.setActionView(i4);
        View actionView = this.f2991d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f2991d.setActionView((View) new c(actionView));
        }
        return this;
    }
}
