package androidx.appcompat.view.menu;

import H.b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.view.C0408b;

public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final int f2841a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2842b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2843c;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f2844d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f2845e;

    /* renamed from: f  reason: collision with root package name */
    private Intent f2846f;

    /* renamed from: g  reason: collision with root package name */
    private char f2847g;

    /* renamed from: h  reason: collision with root package name */
    private int f2848h = 4096;

    /* renamed from: i  reason: collision with root package name */
    private char f2849i;

    /* renamed from: j  reason: collision with root package name */
    private int f2850j = 4096;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f2851k;

    /* renamed from: l  reason: collision with root package name */
    private Context f2852l;

    /* renamed from: m  reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f2853m;

    /* renamed from: n  reason: collision with root package name */
    private CharSequence f2854n;

    /* renamed from: o  reason: collision with root package name */
    private CharSequence f2855o;

    /* renamed from: p  reason: collision with root package name */
    private ColorStateList f2856p = null;

    /* renamed from: q  reason: collision with root package name */
    private PorterDuff.Mode f2857q = null;

    /* renamed from: r  reason: collision with root package name */
    private boolean f2858r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f2859s = false;

    /* renamed from: t  reason: collision with root package name */
    private int f2860t = 16;

    public a(Context context, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        this.f2852l = context;
        this.f2841a = i5;
        this.f2842b = i4;
        this.f2843c = i7;
        this.f2844d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f2851k;
        if (drawable == null) {
            return;
        }
        if (this.f2858r || this.f2859s) {
            Drawable r4 = androidx.core.graphics.drawable.a.r(drawable);
            this.f2851k = r4;
            Drawable mutate = r4.mutate();
            this.f2851k = mutate;
            if (this.f2858r) {
                androidx.core.graphics.drawable.a.o(mutate, this.f2856p);
            }
            if (this.f2859s) {
                androidx.core.graphics.drawable.a.p(this.f2851k, this.f2857q);
            }
        }
    }

    public b a(C0408b bVar) {
        throw new UnsupportedOperationException();
    }

    public C0408b b() {
        return null;
    }

    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public b setActionView(int i4) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public boolean expandActionView() {
        return false;
    }

    /* renamed from: f */
    public b setShowAsActionFlags(int i4) {
        setShowAsAction(i4);
        return this;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f2850j;
    }

    public char getAlphabeticShortcut() {
        return this.f2849i;
    }

    public CharSequence getContentDescription() {
        return this.f2854n;
    }

    public int getGroupId() {
        return this.f2842b;
    }

    public Drawable getIcon() {
        return this.f2851k;
    }

    public ColorStateList getIconTintList() {
        return this.f2856p;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2857q;
    }

    public Intent getIntent() {
        return this.f2846f;
    }

    public int getItemId() {
        return this.f2841a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f2848h;
    }

    public char getNumericShortcut() {
        return this.f2847g;
    }

    public int getOrder() {
        return this.f2843c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f2844d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2845e;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f2844d;
    }

    public CharSequence getTooltipText() {
        return this.f2855o;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        if ((this.f2860t & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean isChecked() {
        if ((this.f2860t & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean isEnabled() {
        if ((this.f2860t & 16) != 0) {
            return true;
        }
        return false;
    }

    public boolean isVisible() {
        if ((this.f2860t & 8) == 0) {
            return true;
        }
        return false;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c4) {
        this.f2849i = Character.toLowerCase(c4);
        return this;
    }

    public MenuItem setCheckable(boolean z3) {
        this.f2860t = z3 | (this.f2860t & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z3) {
        int i4;
        int i5 = this.f2860t & -3;
        if (z3) {
            i4 = 2;
        } else {
            i4 = 0;
        }
        this.f2860t = i4 | i5;
        return this;
    }

    public MenuItem setEnabled(boolean z3) {
        int i4;
        int i5 = this.f2860t & -17;
        if (z3) {
            i4 = 16;
        } else {
            i4 = 0;
        }
        this.f2860t = i4 | i5;
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f2851k = drawable;
        c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2856p = colorStateList;
        this.f2858r = true;
        c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2857q = mode;
        this.f2859s = true;
        c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f2846f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c4) {
        this.f2847g = c4;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2853m = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c4, char c5) {
        this.f2847g = c4;
        this.f2849i = Character.toLowerCase(c5);
        return this;
    }

    public void setShowAsAction(int i4) {
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f2844d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2845e = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z3) {
        int i4 = 8;
        int i5 = this.f2860t & 8;
        if (z3) {
            i4 = 0;
        }
        this.f2860t = i5 | i4;
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c4, int i4) {
        this.f2849i = Character.toLowerCase(c4);
        this.f2850j = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    public b setContentDescription(CharSequence charSequence) {
        this.f2854n = charSequence;
        return this;
    }

    public MenuItem setNumericShortcut(char c4, int i4) {
        this.f2847g = c4;
        this.f2848h = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    public MenuItem setTitle(int i4) {
        this.f2844d = this.f2852l.getResources().getString(i4);
        return this;
    }

    public b setTooltipText(CharSequence charSequence) {
        this.f2855o = charSequence;
        return this;
    }

    public MenuItem setIcon(int i4) {
        this.f2851k = androidx.core.content.a.d(this.f2852l, i4);
        c();
        return this;
    }

    public MenuItem setShortcut(char c4, char c5, int i4, int i5) {
        this.f2847g = c4;
        this.f2848h = KeyEvent.normalizeMetaState(i4);
        this.f2849i = Character.toLowerCase(c5);
        this.f2850j = KeyEvent.normalizeMetaState(i5);
        return this;
    }
}
