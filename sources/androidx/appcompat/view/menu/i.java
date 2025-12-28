package androidx.appcompat.view.menu;

import H.b;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.n;
import androidx.core.view.C0408b;
import n.h;
import o.C0836a;

public final class i implements b {

    /* renamed from: A  reason: collision with root package name */
    private View f2959A;

    /* renamed from: B  reason: collision with root package name */
    private C0408b f2960B;

    /* renamed from: C  reason: collision with root package name */
    private MenuItem.OnActionExpandListener f2961C;

    /* renamed from: D  reason: collision with root package name */
    private boolean f2962D = false;

    /* renamed from: E  reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f2963E;

    /* renamed from: a  reason: collision with root package name */
    private final int f2964a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2965b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2966c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2967d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f2968e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f2969f;

    /* renamed from: g  reason: collision with root package name */
    private Intent f2970g;

    /* renamed from: h  reason: collision with root package name */
    private char f2971h;

    /* renamed from: i  reason: collision with root package name */
    private int f2972i = 4096;

    /* renamed from: j  reason: collision with root package name */
    private char f2973j;

    /* renamed from: k  reason: collision with root package name */
    private int f2974k = 4096;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f2975l;

    /* renamed from: m  reason: collision with root package name */
    private int f2976m = 0;

    /* renamed from: n  reason: collision with root package name */
    g f2977n;

    /* renamed from: o  reason: collision with root package name */
    private r f2978o;

    /* renamed from: p  reason: collision with root package name */
    private Runnable f2979p;

    /* renamed from: q  reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f2980q;

    /* renamed from: r  reason: collision with root package name */
    private CharSequence f2981r;

    /* renamed from: s  reason: collision with root package name */
    private CharSequence f2982s;

    /* renamed from: t  reason: collision with root package name */
    private ColorStateList f2983t = null;

    /* renamed from: u  reason: collision with root package name */
    private PorterDuff.Mode f2984u = null;

    /* renamed from: v  reason: collision with root package name */
    private boolean f2985v = false;

    /* renamed from: w  reason: collision with root package name */
    private boolean f2986w = false;

    /* renamed from: x  reason: collision with root package name */
    private boolean f2987x = false;

    /* renamed from: y  reason: collision with root package name */
    private int f2988y = 16;

    /* renamed from: z  reason: collision with root package name */
    private int f2989z;

    class a implements C0408b.C0084b {
        a() {
        }

        public void onActionProviderVisibilityChanged(boolean z3) {
            i iVar = i.this;
            iVar.f2977n.J(iVar);
        }
    }

    i(g gVar, int i4, int i5, int i6, int i7, CharSequence charSequence, int i8) {
        this.f2977n = gVar;
        this.f2964a = i5;
        this.f2965b = i4;
        this.f2966c = i6;
        this.f2967d = i7;
        this.f2968e = charSequence;
        this.f2989z = i8;
    }

    private static void d(StringBuilder sb, int i4, int i5, String str) {
        if ((i4 & i5) == i5) {
            sb.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f2987x && (this.f2985v || this.f2986w)) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (this.f2985v) {
                androidx.core.graphics.drawable.a.o(drawable, this.f2983t);
            }
            if (this.f2986w) {
                androidx.core.graphics.drawable.a.p(drawable, this.f2984u);
            }
            this.f2987x = false;
        }
        return drawable;
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        if (!this.f2977n.H() || g() == 0) {
            return false;
        }
        return true;
    }

    public boolean B() {
        if ((this.f2989z & 4) == 4) {
            return true;
        }
        return false;
    }

    public b a(C0408b bVar) {
        C0408b bVar2 = this.f2960B;
        if (bVar2 != null) {
            bVar2.g();
        }
        this.f2959A = null;
        this.f2960B = bVar;
        this.f2977n.K(true);
        C0408b bVar3 = this.f2960B;
        if (bVar3 != null) {
            bVar3.i(new a());
        }
        return this;
    }

    public C0408b b() {
        return this.f2960B;
    }

    public void c() {
        this.f2977n.I(this);
    }

    public boolean collapseActionView() {
        if ((this.f2989z & 8) == 0) {
            return false;
        }
        if (this.f2959A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2961C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2977n.f(this);
        }
        return false;
    }

    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2961C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2977n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f2967d;
    }

    /* access modifiers changed from: package-private */
    public char g() {
        if (this.f2977n.G()) {
            return this.f2973j;
        }
        return this.f2971h;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f2959A;
        if (view != null) {
            return view;
        }
        C0408b bVar = this.f2960B;
        if (bVar == null) {
            return null;
        }
        View c4 = bVar.c(this);
        this.f2959A = c4;
        return c4;
    }

    public int getAlphabeticModifiers() {
        return this.f2974k;
    }

    public char getAlphabeticShortcut() {
        return this.f2973j;
    }

    public CharSequence getContentDescription() {
        return this.f2981r;
    }

    public int getGroupId() {
        return this.f2965b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f2975l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f2976m == 0) {
            return null;
        }
        Drawable b4 = C0836a.b(this.f2977n.u(), this.f2976m);
        this.f2976m = 0;
        this.f2975l = b4;
        return e(b4);
    }

    public ColorStateList getIconTintList() {
        return this.f2983t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2984u;
    }

    public Intent getIntent() {
        return this.f2970g;
    }

    public int getItemId() {
        return this.f2964a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f2963E;
    }

    public int getNumericModifiers() {
        return this.f2972i;
    }

    public char getNumericShortcut() {
        return this.f2971h;
    }

    public int getOrder() {
        return this.f2966c;
    }

    public SubMenu getSubMenu() {
        return this.f2978o;
    }

    public CharSequence getTitle() {
        return this.f2968e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2969f;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f2968e;
    }

    public CharSequence getTooltipText() {
        return this.f2982s;
    }

    /* access modifiers changed from: package-private */
    public String h() {
        int i4;
        char g4 = g();
        if (g4 == 0) {
            return "";
        }
        Resources resources = this.f2977n.u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f2977n.u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(h.f14833k));
        }
        if (this.f2977n.G()) {
            i4 = this.f2974k;
        } else {
            i4 = this.f2972i;
        }
        d(sb, i4, 65536, resources.getString(h.f14829g));
        d(sb, i4, 4096, resources.getString(h.f14825c));
        d(sb, i4, 2, resources.getString(h.f14824b));
        d(sb, i4, 1, resources.getString(h.f14830h));
        d(sb, i4, 4, resources.getString(h.f14832j));
        d(sb, i4, 8, resources.getString(h.f14828f));
        if (g4 == 8) {
            sb.append(resources.getString(h.f14826d));
        } else if (g4 == 10) {
            sb.append(resources.getString(h.f14827e));
        } else if (g4 != ' ') {
            sb.append(g4);
        } else {
            sb.append(resources.getString(h.f14831i));
        }
        return sb.toString();
    }

    public boolean hasSubMenu() {
        if (this.f2978o != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public CharSequence i(n.a aVar) {
        if (aVar == null || !aVar.d()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    public boolean isActionViewExpanded() {
        return this.f2962D;
    }

    public boolean isCheckable() {
        if ((this.f2988y & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean isChecked() {
        if ((this.f2988y & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean isEnabled() {
        if ((this.f2988y & 16) != 0) {
            return true;
        }
        return false;
    }

    public boolean isVisible() {
        C0408b bVar = this.f2960B;
        if (bVar == null || !bVar.f()) {
            if ((this.f2988y & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f2988y & 8) != 0 || !this.f2960B.b()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean j() {
        C0408b bVar;
        if ((this.f2989z & 8) == 0) {
            return false;
        }
        if (this.f2959A == null && (bVar = this.f2960B) != null) {
            this.f2959A = bVar.c(this);
        }
        if (this.f2959A != null) {
            return true;
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f2980q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        g gVar = this.f2977n;
        if (gVar.h(gVar, this)) {
            return true;
        }
        Runnable runnable = this.f2979p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f2970g != null) {
            try {
                this.f2977n.u().startActivity(this.f2970g);
                return true;
            } catch (ActivityNotFoundException e4) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e4);
            }
        }
        C0408b bVar = this.f2960B;
        if (bVar == null || !bVar.d()) {
            return false;
        }
        return true;
    }

    public boolean l() {
        if ((this.f2988y & 32) == 32) {
            return true;
        }
        return false;
    }

    public boolean m() {
        if ((this.f2988y & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean n() {
        if ((this.f2989z & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean o() {
        if ((this.f2989z & 2) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public b setActionView(int i4) {
        Context u3 = this.f2977n.u();
        setActionView(LayoutInflater.from(u3).inflate(i4, new LinearLayout(u3), false));
        return this;
    }

    /* renamed from: q */
    public b setActionView(View view) {
        int i4;
        this.f2959A = view;
        this.f2960B = null;
        if (view != null && view.getId() == -1 && (i4 = this.f2964a) > 0) {
            view.setId(i4);
        }
        this.f2977n.I(this);
        return this;
    }

    public void r(boolean z3) {
        this.f2962D = z3;
        this.f2977n.K(false);
    }

    /* access modifiers changed from: package-private */
    public void s(boolean z3) {
        int i4;
        int i5 = this.f2988y;
        int i6 = i5 & -3;
        if (z3) {
            i4 = 2;
        } else {
            i4 = 0;
        }
        int i7 = i4 | i6;
        this.f2988y = i7;
        if (i5 != i7) {
            this.f2977n.K(false);
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c4) {
        if (this.f2973j == c4) {
            return this;
        }
        this.f2973j = Character.toLowerCase(c4);
        this.f2977n.K(false);
        return this;
    }

    public MenuItem setCheckable(boolean z3) {
        int i4 = this.f2988y;
        boolean z4 = z3 | (i4 & true);
        this.f2988y = z4 ? 1 : 0;
        if (i4 != z4) {
            this.f2977n.K(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z3) {
        if ((this.f2988y & 4) != 0) {
            this.f2977n.T(this);
        } else {
            s(z3);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z3) {
        if (z3) {
            this.f2988y |= 16;
        } else {
            this.f2988y &= -17;
        }
        this.f2977n.K(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f2976m = 0;
        this.f2975l = drawable;
        this.f2987x = true;
        this.f2977n.K(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2983t = colorStateList;
        this.f2985v = true;
        this.f2987x = true;
        this.f2977n.K(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2984u = mode;
        this.f2986w = true;
        this.f2987x = true;
        this.f2977n.K(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f2970g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c4) {
        if (this.f2971h == c4) {
            return this;
        }
        this.f2971h = c4;
        this.f2977n.K(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2961C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2980q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c4, char c5) {
        this.f2971h = c4;
        this.f2973j = Character.toLowerCase(c5);
        this.f2977n.K(false);
        return this;
    }

    public void setShowAsAction(int i4) {
        int i5 = i4 & 3;
        if (i5 == 0 || i5 == 1 || i5 == 2) {
            this.f2989z = i4;
            this.f2977n.I(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f2968e = charSequence;
        this.f2977n.K(false);
        r rVar = this.f2978o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2969f = charSequence;
        this.f2977n.K(false);
        return this;
    }

    public MenuItem setVisible(boolean z3) {
        if (y(z3)) {
            this.f2977n.J(this);
        }
        return this;
    }

    public void t(boolean z3) {
        int i4;
        int i5 = this.f2988y & -5;
        if (z3) {
            i4 = 4;
        } else {
            i4 = 0;
        }
        this.f2988y = i4 | i5;
    }

    public String toString() {
        CharSequence charSequence = this.f2968e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z3) {
        if (z3) {
            this.f2988y |= 32;
        } else {
            this.f2988y &= -33;
        }
    }

    /* access modifiers changed from: package-private */
    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f2963E = contextMenuInfo;
    }

    /* renamed from: w */
    public b setShowAsActionFlags(int i4) {
        setShowAsAction(i4);
        return this;
    }

    public void x(r rVar) {
        this.f2978o = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    /* access modifiers changed from: package-private */
    public boolean y(boolean z3) {
        int i4;
        int i5 = this.f2988y;
        int i6 = i5 & -9;
        if (z3) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        int i7 = i4 | i6;
        this.f2988y = i7;
        if (i5 != i7) {
            return true;
        }
        return false;
    }

    public boolean z() {
        return this.f2977n.A();
    }

    public b setContentDescription(CharSequence charSequence) {
        this.f2981r = charSequence;
        this.f2977n.K(false);
        return this;
    }

    public b setTooltipText(CharSequence charSequence) {
        this.f2982s = charSequence;
        this.f2977n.K(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c4, int i4) {
        if (this.f2973j == c4 && this.f2974k == i4) {
            return this;
        }
        this.f2973j = Character.toLowerCase(c4);
        this.f2974k = KeyEvent.normalizeMetaState(i4);
        this.f2977n.K(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c4, int i4) {
        if (this.f2971h == c4 && this.f2972i == i4) {
            return this;
        }
        this.f2971h = c4;
        this.f2972i = KeyEvent.normalizeMetaState(i4);
        this.f2977n.K(false);
        return this;
    }

    public MenuItem setShortcut(char c4, char c5, int i4, int i5) {
        this.f2971h = c4;
        this.f2972i = KeyEvent.normalizeMetaState(i4);
        this.f2973j = Character.toLowerCase(c5);
        this.f2974k = KeyEvent.normalizeMetaState(i5);
        this.f2977n.K(false);
        return this;
    }

    public MenuItem setIcon(int i4) {
        this.f2975l = null;
        this.f2976m = i4;
        this.f2987x = true;
        this.f2977n.K(false);
        return this;
    }

    public MenuItem setTitle(int i4) {
        return setTitle((CharSequence) this.f2977n.u().getString(i4));
    }
}
