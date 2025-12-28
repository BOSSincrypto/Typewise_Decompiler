package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.C0367a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.C0434o;
import androidx.core.view.C0440u;
import androidx.core.view.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import n.C0822a;
import n.j;
import o.C0836a;

public class Toolbar extends ViewGroup {

    /* renamed from: A  reason: collision with root package name */
    private ColorStateList f3392A;

    /* renamed from: B  reason: collision with root package name */
    private boolean f3393B;

    /* renamed from: C  reason: collision with root package name */
    private boolean f3394C;

    /* renamed from: D  reason: collision with root package name */
    private final ArrayList f3395D;

    /* renamed from: E  reason: collision with root package name */
    private final ArrayList f3396E;

    /* renamed from: F  reason: collision with root package name */
    private final int[] f3397F;

    /* renamed from: G  reason: collision with root package name */
    final C0440u f3398G;

    /* renamed from: H  reason: collision with root package name */
    private ArrayList f3399H;

    /* renamed from: I  reason: collision with root package name */
    h f3400I;

    /* renamed from: J  reason: collision with root package name */
    private final ActionMenuView.e f3401J;

    /* renamed from: K  reason: collision with root package name */
    private g0 f3402K;

    /* renamed from: L  reason: collision with root package name */
    private C0379c f3403L;

    /* renamed from: M  reason: collision with root package name */
    private f f3404M;

    /* renamed from: N  reason: collision with root package name */
    private m.a f3405N;

    /* renamed from: O  reason: collision with root package name */
    g.a f3406O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f3407P;

    /* renamed from: Q  reason: collision with root package name */
    private OnBackInvokedCallback f3408Q;

    /* renamed from: R  reason: collision with root package name */
    private OnBackInvokedDispatcher f3409R;

    /* renamed from: S  reason: collision with root package name */
    private boolean f3410S;

    /* renamed from: T  reason: collision with root package name */
    private final Runnable f3411T;

    /* renamed from: a  reason: collision with root package name */
    ActionMenuView f3412a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f3413b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f3414c;

    /* renamed from: d  reason: collision with root package name */
    private ImageButton f3415d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f3416e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f3417f;

    /* renamed from: g  reason: collision with root package name */
    private CharSequence f3418g;

    /* renamed from: h  reason: collision with root package name */
    ImageButton f3419h;

    /* renamed from: i  reason: collision with root package name */
    View f3420i;

    /* renamed from: j  reason: collision with root package name */
    private Context f3421j;

    /* renamed from: k  reason: collision with root package name */
    private int f3422k;

    /* renamed from: l  reason: collision with root package name */
    private int f3423l;

    /* renamed from: m  reason: collision with root package name */
    private int f3424m;

    /* renamed from: n  reason: collision with root package name */
    int f3425n;

    /* renamed from: o  reason: collision with root package name */
    private int f3426o;

    /* renamed from: p  reason: collision with root package name */
    private int f3427p;

    /* renamed from: q  reason: collision with root package name */
    private int f3428q;

    /* renamed from: r  reason: collision with root package name */
    private int f3429r;

    /* renamed from: s  reason: collision with root package name */
    private int f3430s;

    /* renamed from: t  reason: collision with root package name */
    private V f3431t;

    /* renamed from: u  reason: collision with root package name */
    private int f3432u;

    /* renamed from: v  reason: collision with root package name */
    private int f3433v;

    /* renamed from: w  reason: collision with root package name */
    private int f3434w;

    /* renamed from: x  reason: collision with root package name */
    private CharSequence f3435x;

    /* renamed from: y  reason: collision with root package name */
    private CharSequence f3436y;

    /* renamed from: z  reason: collision with root package name */
    private ColorStateList f3437z;

    class a implements ActionMenuView.e {
        a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f3398G.j(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.f3400I;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            Toolbar.this.Q();
        }
    }

    class c implements g.a {
        c() {
        }

        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            g.a aVar = Toolbar.this.f3406O;
            if (aVar == null || !aVar.a(gVar, menuItem)) {
                return false;
            }
            return true;
        }

        public void b(androidx.appcompat.view.menu.g gVar) {
            if (!Toolbar.this.f3412a.J()) {
                Toolbar.this.f3398G.k(gVar);
            }
            g.a aVar = Toolbar.this.f3406O;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    static class e {
        static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new f0(runnable);
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    private class f implements m {

        /* renamed from: a  reason: collision with root package name */
        androidx.appcompat.view.menu.g f3442a;

        /* renamed from: b  reason: collision with root package name */
        androidx.appcompat.view.menu.i f3443b;

        f() {
        }

        public void a(androidx.appcompat.view.menu.g gVar, boolean z3) {
        }

        public void c(Context context, androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.i iVar;
            androidx.appcompat.view.menu.g gVar2 = this.f3442a;
            if (!(gVar2 == null || (iVar = this.f3443b) == null)) {
                gVar2.f(iVar);
            }
            this.f3442a = gVar;
        }

        public boolean e(r rVar) {
            return false;
        }

        public void f(boolean z3) {
            if (this.f3443b != null) {
                androidx.appcompat.view.menu.g gVar = this.f3442a;
                if (gVar != null) {
                    int size = gVar.size();
                    int i4 = 0;
                    while (i4 < size) {
                        if (this.f3442a.getItem(i4) != this.f3443b) {
                            i4++;
                        } else {
                            return;
                        }
                    }
                }
                i(this.f3442a, this.f3443b);
            }
        }

        public boolean h() {
            return false;
        }

        public boolean i(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            View view = Toolbar.this.f3420i;
            if (view instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) view).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f3420i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f3419h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f3420i = null;
            toolbar3.a();
            this.f3443b = null;
            Toolbar.this.requestLayout();
            iVar.r(false);
            Toolbar.this.R();
            return true;
        }

        public boolean j(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f3419h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f3419h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f3419h);
            }
            Toolbar.this.f3420i = iVar.getActionView();
            this.f3443b = iVar;
            ViewParent parent2 = Toolbar.this.f3420i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f3420i);
                }
                g m4 = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                m4.f2603a = (toolbar4.f3425n & 112) | 8388611;
                m4.f3445b = 2;
                toolbar4.f3420i.setLayoutParams(m4);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f3420i);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            iVar.r(true);
            View view = Toolbar.this.f3420i;
            if (view instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) view).c();
            }
            Toolbar.this.R();
            return true;
        }
    }

    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0822a.f14667K);
    }

    private int C(View view, int i4, int[] iArr, int i5) {
        g gVar = (g) view.getLayoutParams();
        int i6 = gVar.leftMargin - iArr[0];
        int max = i4 + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        int q4 = q(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q4, max + measuredWidth, view.getMeasuredHeight() + q4);
        return max + measuredWidth + gVar.rightMargin;
    }

    private int D(View view, int i4, int[] iArr, int i5) {
        g gVar = (g) view.getLayoutParams();
        int i6 = gVar.rightMargin - iArr[1];
        int max = i4 - Math.max(0, i6);
        iArr[1] = Math.max(0, -i6);
        int q4 = q(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q4, max, view.getMeasuredHeight() + q4);
        return max - (measuredWidth + gVar.leftMargin);
    }

    private int E(View view, int i4, int i5, int i6, int i7, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i8 = marginLayoutParams.leftMargin - iArr[0];
        int i9 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i8) + Math.max(0, i9);
        iArr[0] = Math.max(0, -i8);
        iArr[1] = Math.max(0, -i9);
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight() + max + i5, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i6, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void F(View view, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i6, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i8 >= 0) {
            if (mode != 0) {
                i8 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i8);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f3398G.h(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f3399H = currentMenuItems2;
    }

    private void H() {
        removeCallbacks(this.f3411T);
        post(this.f3411T);
    }

    private boolean O() {
        if (!this.f3407P) {
            return false;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean P(View view) {
        if (view == null || view.getParent() != this || view.getVisibility() == 8) {
            return false;
        }
        return true;
    }

    private void b(List list, int i4) {
        boolean z3;
        if (P.B(this) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int childCount = getChildCount();
        int b4 = C0434o.b(i4, P.B(this));
        list.clear();
        if (z3) {
            for (int i5 = childCount - 1; i5 >= 0; i5--) {
                View childAt = getChildAt(i5);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f3445b == 0 && P(childAt) && p(gVar.f2603a) == b4) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f3445b == 0 && P(childAt2) && p(gVar2.f2603a) == b4) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z3) {
        g gVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            gVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            gVar = generateLayoutParams(layoutParams);
        } else {
            gVar = (g) layoutParams;
        }
        gVar.f3445b = 1;
        if (!z3 || this.f3420i == null) {
            addView(view, gVar);
            return;
        }
        view.setLayoutParams(gVar);
        this.f3396E.add(view);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i4 = 0; i4 < menu.size(); i4++) {
            arrayList.add(menu.getItem(i4));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private void h() {
        if (this.f3431t == null) {
            this.f3431t = new V();
        }
    }

    private void i() {
        if (this.f3416e == null) {
            this.f3416e = new r(getContext());
        }
    }

    private void j() {
        k();
        if (this.f3412a.N() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.f3412a.getMenu();
            if (this.f3404M == null) {
                this.f3404M = new f();
            }
            this.f3412a.setExpandedActionViewsExclusive(true);
            gVar.c(this.f3404M, this.f3421j);
            R();
        }
    }

    private void k() {
        if (this.f3412a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f3412a = actionMenuView;
            actionMenuView.setPopupTheme(this.f3422k);
            this.f3412a.setOnMenuItemClickListener(this.f3401J);
            this.f3412a.O(this.f3405N, new c());
            g m4 = generateDefaultLayoutParams();
            m4.f2603a = (this.f3425n & 112) | 8388613;
            this.f3412a.setLayoutParams(m4);
            c(this.f3412a, false);
        }
    }

    private void l() {
        if (this.f3415d == null) {
            this.f3415d = new C0392p(getContext(), (AttributeSet) null, C0822a.f14666J);
            g m4 = generateDefaultLayoutParams();
            m4.f2603a = (this.f3425n & 112) | 8388611;
            this.f3415d.setLayoutParams(m4);
        }
    }

    private int p(int i4) {
        int B3 = P.B(this);
        int b4 = C0434o.b(i4, B3) & 7;
        if (b4 == 1 || b4 == 3 || b4 == 5) {
            return b4;
        }
        if (B3 == 1) {
            return 5;
        }
        return 3;
    }

    private int q(View view, int i4) {
        int i5;
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i4 > 0) {
            i5 = (measuredHeight - i4) / 2;
        } else {
            i5 = 0;
        }
        int r4 = r(gVar.f2603a);
        if (r4 == 48) {
            return getPaddingTop() - i5;
        }
        if (r4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - gVar.bottomMargin) - i5;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i6 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i7 = gVar.topMargin;
        if (i6 < i7) {
            i6 = i7;
        } else {
            int i8 = (((height - paddingBottom) - measuredHeight) - i6) - paddingTop;
            int i9 = gVar.bottomMargin;
            if (i8 < i9) {
                i6 = Math.max(0, i6 - (i9 - i8));
            }
        }
        return paddingTop + i6;
    }

    private int r(int i4) {
        int i5 = i4 & 112;
        if (i5 == 16 || i5 == 48 || i5 == 80) {
            return i5;
        }
        return this.f3434w & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.r.b(marginLayoutParams) + androidx.core.view.r.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List list, int[] iArr) {
        int i4 = iArr[0];
        int i5 = iArr[1];
        int size = list.size();
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            View view = (View) list.get(i6);
            g gVar = (g) view.getLayoutParams();
            int i8 = gVar.leftMargin - i4;
            int i9 = gVar.rightMargin - i5;
            int max = Math.max(0, i8);
            int max2 = Math.max(0, i9);
            int max3 = Math.max(0, -i8);
            int max4 = Math.max(0, -i9);
            i7 += max + view.getMeasuredWidth() + max2;
            i6++;
            i5 = max4;
            i4 = max3;
        }
        return i7;
    }

    private boolean z(View view) {
        if (view.getParent() == this || this.f3396E.contains(view)) {
            return true;
        }
        return false;
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f3412a;
        if (actionMenuView == null || !actionMenuView.I()) {
            return false;
        }
        return true;
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f3412a;
        if (actionMenuView == null || !actionMenuView.J()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((g) childAt.getLayoutParams()).f3445b == 2 || childAt == this.f3412a)) {
                removeViewAt(childCount);
                this.f3396E.add(childAt);
            }
        }
    }

    public void J(int i4, int i5) {
        h();
        this.f3431t.g(i4, i5);
    }

    public void K(androidx.appcompat.view.menu.g gVar, C0379c cVar) {
        if (gVar != null || this.f3412a != null) {
            k();
            androidx.appcompat.view.menu.g N3 = this.f3412a.N();
            if (N3 != gVar) {
                if (N3 != null) {
                    N3.O(this.f3403L);
                    N3.O(this.f3404M);
                }
                if (this.f3404M == null) {
                    this.f3404M = new f();
                }
                cVar.G(true);
                if (gVar != null) {
                    gVar.c(cVar, this.f3421j);
                    gVar.c(this.f3404M, this.f3421j);
                } else {
                    cVar.c(this.f3421j, (androidx.appcompat.view.menu.g) null);
                    this.f3404M.c(this.f3421j, (androidx.appcompat.view.menu.g) null);
                    cVar.f(true);
                    this.f3404M.f(true);
                }
                this.f3412a.setPopupTheme(this.f3422k);
                this.f3412a.setPresenter(cVar);
                this.f3403L = cVar;
                R();
            }
        }
    }

    public void L(m.a aVar, g.a aVar2) {
        this.f3405N = aVar;
        this.f3406O = aVar2;
        ActionMenuView actionMenuView = this.f3412a;
        if (actionMenuView != null) {
            actionMenuView.O(aVar, aVar2);
        }
    }

    public void M(Context context, int i4) {
        this.f3424m = i4;
        TextView textView = this.f3414c;
        if (textView != null) {
            textView.setTextAppearance(context, i4);
        }
    }

    public void N(Context context, int i4) {
        this.f3423l = i4;
        TextView textView = this.f3413b;
        if (textView != null) {
            textView.setTextAppearance(context, i4);
        }
    }

    public boolean Q() {
        ActionMenuView actionMenuView = this.f3412a;
        if (actionMenuView == null || !actionMenuView.P()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void R() {
        boolean z3;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a4 = e.a(this);
            if (!v() || a4 == null || !P.R(this) || !this.f3410S) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3 && this.f3409R == null) {
                if (this.f3408Q == null) {
                    this.f3408Q = e.b(new d0(this));
                }
                e.c(a4, this.f3408Q);
                this.f3409R = a4;
            } else if (!z3 && (onBackInvokedDispatcher = this.f3409R) != null) {
                e.d(onBackInvokedDispatcher, this.f3408Q);
                this.f3409R = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        for (int size = this.f3396E.size() - 1; size >= 0; size--) {
            addView((View) this.f3396E.get(size));
        }
        this.f3396E.clear();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!super.checkLayoutParams(layoutParams) || !(layoutParams instanceof g)) {
            return false;
        }
        return true;
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        if (getVisibility() != 0 || (actionMenuView = this.f3412a) == null || !actionMenuView.K()) {
            return false;
        }
        return true;
    }

    public void e() {
        androidx.appcompat.view.menu.i iVar;
        f fVar = this.f3404M;
        if (fVar == null) {
            iVar = null;
        } else {
            iVar = fVar.f3443b;
        }
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f3412a;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        if (this.f3419h == null) {
            C0392p pVar = new C0392p(getContext(), (AttributeSet) null, C0822a.f14666J);
            this.f3419h = pVar;
            pVar.setImageDrawable(this.f3417f);
            this.f3419h.setContentDescription(this.f3418g);
            g m4 = generateDefaultLayoutParams();
            m4.f2603a = (this.f3425n & 112) | 8388611;
            m4.f3445b = 2;
            this.f3419h.setLayoutParams(m4);
            this.f3419h.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f3419h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f3419h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        V v3 = this.f3431t;
        if (v3 != null) {
            return v3.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i4 = this.f3433v;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        V v3 = this.f3431t;
        if (v3 != null) {
            return v3.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        V v3 = this.f3431t;
        if (v3 != null) {
            return v3.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        V v3 = this.f3431t;
        if (v3 != null) {
            return v3.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i4 = this.f3432u;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.g N3;
        ActionMenuView actionMenuView = this.f3412a;
        if (actionMenuView == null || (N3 = actionMenuView.N()) == null || !N3.hasVisibleItems()) {
            return getContentInsetEnd();
        }
        return Math.max(getContentInsetEnd(), Math.max(this.f3433v, 0));
    }

    public int getCurrentContentInsetLeft() {
        if (P.B(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (P.B(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f3432u, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f3416e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f3416e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f3412a.getMenu();
    }

    /* access modifiers changed from: package-private */
    public View getNavButtonView() {
        return this.f3415d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f3415d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f3415d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C0379c getOuterActionMenuPresenter() {
        return this.f3403L;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f3412a.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f3421j;
    }

    public int getPopupTheme() {
        return this.f3422k;
    }

    public CharSequence getSubtitle() {
        return this.f3436y;
    }

    /* access modifiers changed from: package-private */
    public final TextView getSubtitleTextView() {
        return this.f3414c;
    }

    public CharSequence getTitle() {
        return this.f3435x;
    }

    public int getTitleMarginBottom() {
        return this.f3430s;
    }

    public int getTitleMarginEnd() {
        return this.f3428q;
    }

    public int getTitleMarginStart() {
        return this.f3427p;
    }

    public int getTitleMarginTop() {
        return this.f3429r;
    }

    /* access modifiers changed from: package-private */
    public final TextView getTitleTextView() {
        return this.f3413b;
    }

    public J getWrapper() {
        if (this.f3402K == null) {
            this.f3402K = new g0(this, true);
        }
        return this.f3402K;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    /* renamed from: n */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        if (layoutParams instanceof C0367a.C0051a) {
            return new g((C0367a.C0051a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new g((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new g(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        R();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f3411T);
        R();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3394C = false;
        }
        if (!this.f3394C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f3394C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3394C = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02a1 A[LOOP:0: B:103:0x029f->B:104:0x02a1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02c3 A[LOOP:1: B:106:0x02c1->B:107:0x02c3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02fc A[LOOP:2: B:114:0x02fa->B:115:0x02fc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0227  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = androidx.core.view.P.B(r19)
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x000c
            r1 = r3
            goto L_0x000d
        L_0x000c:
            r1 = r2
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f3397F
            r11[r3] = r2
            r11[r2] = r2
            int r12 = androidx.core.view.P.C(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = r2
        L_0x003b:
            android.widget.ImageButton r13 = r0.f3415d
            boolean r13 = r0.P(r13)
            if (r13 == 0) goto L_0x0056
            if (r1 == 0) goto L_0x004e
            android.widget.ImageButton r13 = r0.f3415d
            int r13 = r0.D(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0058
        L_0x004e:
            android.widget.ImageButton r13 = r0.f3415d
            int r13 = r0.C(r13, r6, r11, r12)
        L_0x0054:
            r14 = r10
            goto L_0x0058
        L_0x0056:
            r13 = r6
            goto L_0x0054
        L_0x0058:
            android.widget.ImageButton r15 = r0.f3419h
            boolean r15 = r0.P(r15)
            if (r15 == 0) goto L_0x006f
            if (r1 == 0) goto L_0x0069
            android.widget.ImageButton r15 = r0.f3419h
            int r14 = r0.D(r15, r14, r11, r12)
            goto L_0x006f
        L_0x0069:
            android.widget.ImageButton r15 = r0.f3419h
            int r13 = r0.C(r15, r13, r11, r12)
        L_0x006f:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f3412a
            boolean r15 = r0.P(r15)
            if (r15 == 0) goto L_0x0086
            if (r1 == 0) goto L_0x0080
            androidx.appcompat.widget.ActionMenuView r15 = r0.f3412a
            int r13 = r0.C(r15, r13, r11, r12)
            goto L_0x0086
        L_0x0080:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f3412a
            int r14 = r0.D(r15, r14, r11, r12)
        L_0x0086:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r3 = r15 - r13
            int r3 = java.lang.Math.max(r2, r3)
            r11[r2] = r3
            int r3 = r10 - r14
            int r3 = r16 - r3
            int r3 = java.lang.Math.max(r2, r3)
            r17 = 1
            r11[r17] = r3
            int r3 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f3420i
            boolean r13 = r0.P(r13)
            if (r13 == 0) goto L_0x00c3
            if (r1 == 0) goto L_0x00bd
            android.view.View r13 = r0.f3420i
            int r10 = r0.D(r13, r10, r11, r12)
            goto L_0x00c3
        L_0x00bd:
            android.view.View r13 = r0.f3420i
            int r3 = r0.C(r13, r3, r11, r12)
        L_0x00c3:
            android.widget.ImageView r13 = r0.f3416e
            boolean r13 = r0.P(r13)
            if (r13 == 0) goto L_0x00da
            if (r1 == 0) goto L_0x00d4
            android.widget.ImageView r13 = r0.f3416e
            int r10 = r0.D(r13, r10, r11, r12)
            goto L_0x00da
        L_0x00d4:
            android.widget.ImageView r13 = r0.f3416e
            int r3 = r0.C(r13, r3, r11, r12)
        L_0x00da:
            android.widget.TextView r13 = r0.f3413b
            boolean r13 = r0.P(r13)
            android.widget.TextView r14 = r0.f3414c
            boolean r14 = r0.P(r14)
            if (r13 == 0) goto L_0x00ff
            android.widget.TextView r15 = r0.f3413b
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r15 = (androidx.appcompat.widget.Toolbar.g) r15
            int r2 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f3413b
            int r7 = r7.getMeasuredHeight()
            int r2 = r2 + r7
            int r7 = r15.bottomMargin
            int r2 = r2 + r7
            goto L_0x0102
        L_0x00ff:
            r23 = r7
            r2 = 0
        L_0x0102:
            if (r14 == 0) goto L_0x011c
            android.widget.TextView r7 = r0.f3414c
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r7 = (androidx.appcompat.widget.Toolbar.g) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f3414c
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r2 = r2 + r15
            goto L_0x011e
        L_0x011c:
            r16 = r4
        L_0x011e:
            if (r13 != 0) goto L_0x012a
            if (r14 == 0) goto L_0x0123
            goto L_0x012a
        L_0x0123:
            r18 = r6
            r22 = r12
        L_0x0127:
            r2 = 0
            goto L_0x0291
        L_0x012a:
            if (r13 == 0) goto L_0x012f
            android.widget.TextView r4 = r0.f3413b
            goto L_0x0131
        L_0x012f:
            android.widget.TextView r4 = r0.f3414c
        L_0x0131:
            if (r14 == 0) goto L_0x0136
            android.widget.TextView r7 = r0.f3414c
            goto L_0x0138
        L_0x0136:
            android.widget.TextView r7 = r0.f3413b
        L_0x0138:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r4 = (androidx.appcompat.widget.Toolbar.g) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r7 = (androidx.appcompat.widget.Toolbar.g) r7
            if (r13 == 0) goto L_0x014e
            android.widget.TextView r15 = r0.f3413b
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0158
        L_0x014e:
            if (r14 == 0) goto L_0x015b
            android.widget.TextView r15 = r0.f3414c
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015b
        L_0x0158:
            r17 = 1
            goto L_0x015d
        L_0x015b:
            r17 = 0
        L_0x015d:
            int r15 = r0.f3434w
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x01a5
            r6 = 80
            if (r15 == r6) goto L_0x0197
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r2
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.f3429r
            r24 = r3
            int r3 = r15 + r12
            if (r6 >= r3) goto L_0x0180
            int r6 = r15 + r12
            goto L_0x0195
        L_0x0180:
            int r5 = r5 - r9
            int r5 = r5 - r2
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f3430s
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0195
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0195:
            int r8 = r8 + r6
            goto L_0x01b4
        L_0x0197:
            r24 = r3
            r22 = r12
            int r5 = r5 - r9
            int r3 = r7.bottomMargin
            int r5 = r5 - r3
            int r3 = r0.f3430s
            int r5 = r5 - r3
            int r8 = r5 - r2
            goto L_0x01b4
        L_0x01a5:
            r24 = r3
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f3429r
            int r8 = r2 + r3
        L_0x01b4:
            if (r1 == 0) goto L_0x0227
            if (r17 == 0) goto L_0x01bc
            int r1 = r0.f3427p
        L_0x01ba:
            r2 = 1
            goto L_0x01be
        L_0x01bc:
            r1 = 0
            goto L_0x01ba
        L_0x01be:
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01f4
            android.widget.TextView r1 = r0.f3413b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            android.widget.TextView r2 = r0.f3413b
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f3413b
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f3413b
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f3428q
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f5
        L_0x01f4:
            r2 = r10
        L_0x01f5:
            if (r14 == 0) goto L_0x021b
            android.widget.TextView r1 = r0.f3414c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f3414c
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f3414c
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f3414c
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.f3428q
            int r1 = r10 - r1
            goto L_0x021c
        L_0x021b:
            r1 = r10
        L_0x021c:
            if (r17 == 0) goto L_0x0223
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x0223:
            r3 = r24
            goto L_0x0127
        L_0x0227:
            if (r17 == 0) goto L_0x022e
            int r2 = r0.f3427p
            r1 = r2
        L_0x022c:
            r2 = 0
            goto L_0x0230
        L_0x022e:
            r1 = 0
            goto L_0x022c
        L_0x0230:
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r24 + r3
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x0265
            android.widget.TextView r1 = r0.f3413b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            android.widget.TextView r4 = r0.f3413b
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r3
            android.widget.TextView r5 = r0.f3413b
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f3413b
            r6.layout(r3, r8, r4, r5)
            int r6 = r0.f3428q
            int r4 = r4 + r6
            int r1 = r1.bottomMargin
            int r8 = r5 + r1
            goto L_0x0266
        L_0x0265:
            r4 = r3
        L_0x0266:
            if (r14 == 0) goto L_0x028a
            android.widget.TextView r1 = r0.f3414c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.g) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f3414c
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            android.widget.TextView r5 = r0.f3414c
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f3414c
            r6.layout(r3, r8, r1, r5)
            int r5 = r0.f3428q
            int r1 = r1 + r5
            goto L_0x028b
        L_0x028a:
            r1 = r3
        L_0x028b:
            if (r17 == 0) goto L_0x0291
            int r3 = java.lang.Math.max(r4, r1)
        L_0x0291:
            java.util.ArrayList r1 = r0.f3395D
            r4 = 3
            r0.b(r1, r4)
            java.util.ArrayList r1 = r0.f3395D
            int r1 = r1.size()
            r4 = r3
            r3 = r2
        L_0x029f:
            if (r3 >= r1) goto L_0x02b2
            java.util.ArrayList r5 = r0.f3395D
            java.lang.Object r5 = r5.get(r3)
            android.view.View r5 = (android.view.View) r5
            r12 = r22
            int r4 = r0.C(r5, r4, r11, r12)
            int r3 = r3 + 1
            goto L_0x029f
        L_0x02b2:
            r12 = r22
            java.util.ArrayList r1 = r0.f3395D
            r3 = 5
            r0.b(r1, r3)
            java.util.ArrayList r1 = r0.f3395D
            int r1 = r1.size()
            r3 = r2
        L_0x02c1:
            if (r3 >= r1) goto L_0x02d2
            java.util.ArrayList r5 = r0.f3395D
            java.lang.Object r5 = r5.get(r3)
            android.view.View r5 = (android.view.View) r5
            int r10 = r0.D(r5, r10, r11, r12)
            int r3 = r3 + 1
            goto L_0x02c1
        L_0x02d2:
            java.util.ArrayList r1 = r0.f3395D
            r3 = 1
            r0.b(r1, r3)
            java.util.ArrayList r1 = r0.f3395D
            int r1 = r0.u(r1, r11)
            int r3 = r16 - r18
            int r3 = r3 - r23
            int r3 = r3 / 2
            int r6 = r18 + r3
            int r3 = r1 / 2
            int r6 = r6 - r3
            int r1 = r1 + r6
            if (r6 >= r4) goto L_0x02ed
            goto L_0x02f4
        L_0x02ed:
            if (r1 <= r10) goto L_0x02f3
            int r1 = r1 - r10
            int r4 = r6 - r1
            goto L_0x02f4
        L_0x02f3:
            r4 = r6
        L_0x02f4:
            java.util.ArrayList r1 = r0.f3395D
            int r1 = r1.size()
        L_0x02fa:
            if (r2 >= r1) goto L_0x030b
            java.util.ArrayList r3 = r0.f3395D
            java.lang.Object r3 = r3.get(r2)
            android.view.View r3 = (android.view.View) r3
            int r4 = r0.C(r3, r4, r11, r12)
            int r2 = r2 + 1
            goto L_0x02fa
        L_0x030b:
            java.util.ArrayList r1 = r0.f3395D
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr = this.f3397F;
        char b4 = n0.b(this);
        int i13 = 0;
        char c4 = b4 ^ 1;
        if (P(this.f3415d)) {
            F(this.f3415d, i4, 0, i5, 0, this.f3426o);
            i8 = this.f3415d.getMeasuredWidth() + s(this.f3415d);
            i7 = Math.max(0, this.f3415d.getMeasuredHeight() + t(this.f3415d));
            i6 = View.combineMeasuredStates(0, this.f3415d.getMeasuredState());
        } else {
            i8 = 0;
            i7 = 0;
            i6 = 0;
        }
        if (P(this.f3419h)) {
            F(this.f3419h, i4, 0, i5, 0, this.f3426o);
            i8 = this.f3419h.getMeasuredWidth() + s(this.f3419h);
            i7 = Math.max(i7, this.f3419h.getMeasuredHeight() + t(this.f3419h));
            i6 = View.combineMeasuredStates(i6, this.f3419h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i8);
        iArr[b4] = Math.max(0, currentContentInsetStart - i8);
        if (P(this.f3412a)) {
            F(this.f3412a, i4, max, i5, 0, this.f3426o);
            i9 = this.f3412a.getMeasuredWidth() + s(this.f3412a);
            i7 = Math.max(i7, this.f3412a.getMeasuredHeight() + t(this.f3412a));
            i6 = View.combineMeasuredStates(i6, this.f3412a.getMeasuredState());
        } else {
            i9 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i9);
        iArr[c4] = Math.max(0, currentContentInsetEnd - i9);
        if (P(this.f3420i)) {
            max2 += E(this.f3420i, i4, max2, i5, 0, iArr);
            i7 = Math.max(i7, this.f3420i.getMeasuredHeight() + t(this.f3420i));
            i6 = View.combineMeasuredStates(i6, this.f3420i.getMeasuredState());
        }
        if (P(this.f3416e)) {
            max2 += E(this.f3416e, i4, max2, i5, 0, iArr);
            i7 = Math.max(i7, this.f3416e.getMeasuredHeight() + t(this.f3416e));
            i6 = View.combineMeasuredStates(i6, this.f3416e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (((g) childAt.getLayoutParams()).f3445b == 0 && P(childAt)) {
                max2 += E(childAt, i4, max2, i5, 0, iArr);
                i7 = Math.max(i7, childAt.getMeasuredHeight() + t(childAt));
                i6 = View.combineMeasuredStates(i6, childAt.getMeasuredState());
            }
        }
        int i15 = this.f3429r + this.f3430s;
        int i16 = this.f3427p + this.f3428q;
        if (P(this.f3413b)) {
            E(this.f3413b, i4, max2 + i16, i5, i15, iArr);
            int measuredWidth = this.f3413b.getMeasuredWidth() + s(this.f3413b);
            i10 = this.f3413b.getMeasuredHeight() + t(this.f3413b);
            i12 = View.combineMeasuredStates(i6, this.f3413b.getMeasuredState());
            i11 = measuredWidth;
        } else {
            i10 = 0;
            i12 = i6;
            i11 = 0;
        }
        if (P(this.f3414c)) {
            i11 = Math.max(i11, E(this.f3414c, i4, max2 + i16, i5, i10 + i15, iArr));
            i10 += this.f3414c.getMeasuredHeight() + t(this.f3414c);
            i12 = View.combineMeasuredStates(i12, this.f3414c.getMeasuredState());
        } else {
            int i17 = i12;
        }
        int max3 = Math.max(i7, i10);
        int paddingLeft = max2 + i11 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i4, -16777216 & i12);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i5, i12 << 16);
        if (!O()) {
            i13 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i13);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        androidx.appcompat.view.menu.g gVar;
        MenuItem findItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.t());
        ActionMenuView actionMenuView = this.f3412a;
        if (actionMenuView != null) {
            gVar = actionMenuView.N();
        } else {
            gVar = null;
        }
        int i4 = iVar.f3446c;
        if (!(i4 == 0 || this.f3404M == null || gVar == null || (findItem = gVar.findItem(i4)) == null)) {
            findItem.expandActionView();
        }
        if (iVar.f3447d) {
            H();
        }
    }

    public void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        h();
        V v3 = this.f3431t;
        boolean z3 = true;
        if (i4 != 1) {
            z3 = false;
        }
        v3.f(z3);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.i iVar;
        i iVar2 = new i(super.onSaveInstanceState());
        f fVar = this.f3404M;
        if (!(fVar == null || (iVar = fVar.f3443b) == null)) {
            iVar2.f3446c = iVar.getItemId();
        }
        iVar2.f3447d = B();
        return iVar2;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3393B = false;
        }
        if (!this.f3393B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f3393B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3393B = false;
        }
        return true;
    }

    public void setBackInvokedCallbackEnabled(boolean z3) {
        if (this.f3410S != z3) {
            this.f3410S = z3;
            R();
        }
    }

    public void setCollapseContentDescription(int i4) {
        setCollapseContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setCollapseIcon(int i4) {
        setCollapseIcon(C0836a.b(getContext(), i4));
    }

    public void setCollapsible(boolean z3) {
        this.f3407P = z3;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.f3433v) {
            this.f3433v = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.f3432u) {
            this.f3432u = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i4) {
        setLogo(C0836a.b(getContext(), i4));
    }

    public void setLogoDescription(int i4) {
        setLogoDescription(getContext().getText(i4));
    }

    public void setNavigationContentDescription(int i4) {
        setNavigationContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setNavigationIcon(int i4) {
        setNavigationIcon(C0836a.b(getContext(), i4));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f3415d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.f3400I = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f3412a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i4) {
        if (this.f3422k != i4) {
            this.f3422k = i4;
            if (i4 == 0) {
                this.f3421j = getContext();
            } else {
                this.f3421j = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setSubtitle(int i4) {
        setSubtitle(getContext().getText(i4));
    }

    public void setSubtitleTextColor(int i4) {
        setSubtitleTextColor(ColorStateList.valueOf(i4));
    }

    public void setTitle(int i4) {
        setTitle(getContext().getText(i4));
    }

    public void setTitleMarginBottom(int i4) {
        this.f3430s = i4;
        requestLayout();
    }

    public void setTitleMarginEnd(int i4) {
        this.f3428q = i4;
        requestLayout();
    }

    public void setTitleMarginStart(int i4) {
        this.f3427p = i4;
        requestLayout();
    }

    public void setTitleMarginTop(int i4) {
        this.f3429r = i4;
        requestLayout();
    }

    public void setTitleTextColor(int i4) {
        setTitleTextColor(ColorStateList.valueOf(i4));
    }

    public boolean v() {
        f fVar = this.f3404M;
        if (fVar == null || fVar.f3443b == null) {
            return false;
        }
        return true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f3412a;
        if (actionMenuView == null || !actionMenuView.H()) {
            return false;
        }
        return true;
    }

    public void x(int i4) {
        getMenuInflater().inflate(i4, getMenu());
    }

    public void y() {
        Iterator it = this.f3399H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        G();
    }

    public static class g extends C0367a.C0051a {

        /* renamed from: b  reason: collision with root package name */
        int f3445b = 0;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: package-private */
        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i4, int i5) {
            super(i4, i5);
            this.f2603a = 8388627;
        }

        public g(g gVar) {
            super((C0367a.C0051a) gVar);
            this.f3445b = gVar.f3445b;
        }

        public g(C0367a.C0051a aVar) {
            super(aVar);
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f3434w = 8388627;
        this.f3395D = new ArrayList();
        this.f3396E = new ArrayList();
        this.f3397F = new int[2];
        this.f3398G = new C0440u(new e0(this));
        this.f3399H = new ArrayList();
        this.f3401J = new a();
        this.f3411T = new b();
        Context context2 = getContext();
        int[] iArr = j.f14898O2;
        c0 v3 = c0.v(context2, attributeSet, iArr, i4, 0);
        P.m0(this, context, iArr, attributeSet, v3.r(), i4, 0);
        this.f3423l = v3.n(j.f15027q3, 0);
        this.f3424m = v3.n(j.f14982h3, 0);
        this.f3434w = v3.l(j.f14902P2, this.f3434w);
        this.f3425n = v3.l(j.f14906Q2, 48);
        int e4 = v3.e(j.f14997k3, 0);
        int i5 = j.f15022p3;
        e4 = v3.s(i5) ? v3.e(i5, e4) : e4;
        this.f3430s = e4;
        this.f3429r = e4;
        this.f3428q = e4;
        this.f3427p = e4;
        int e5 = v3.e(j.f15012n3, -1);
        if (e5 >= 0) {
            this.f3427p = e5;
        }
        int e6 = v3.e(j.f15007m3, -1);
        if (e6 >= 0) {
            this.f3428q = e6;
        }
        int e7 = v3.e(j.f15017o3, -1);
        if (e7 >= 0) {
            this.f3429r = e7;
        }
        int e8 = v3.e(j.f15002l3, -1);
        if (e8 >= 0) {
            this.f3430s = e8;
        }
        this.f3426o = v3.f(j.f14952b3, -1);
        int e9 = v3.e(j.f14934X2, Integer.MIN_VALUE);
        int e10 = v3.e(j.f14918T2, Integer.MIN_VALUE);
        int f4 = v3.f(j.f14926V2, 0);
        int f5 = v3.f(j.f14930W2, 0);
        h();
        this.f3431t.e(f4, f5);
        if (!(e9 == Integer.MIN_VALUE && e10 == Integer.MIN_VALUE)) {
            this.f3431t.g(e9, e10);
        }
        this.f3432u = v3.e(j.f14938Y2, Integer.MIN_VALUE);
        this.f3433v = v3.e(j.f14922U2, Integer.MIN_VALUE);
        this.f3417f = v3.g(j.f14914S2);
        this.f3418g = v3.p(j.f14910R2);
        CharSequence p4 = v3.p(j.f14992j3);
        if (!TextUtils.isEmpty(p4)) {
            setTitle(p4);
        }
        CharSequence p5 = v3.p(j.f14977g3);
        if (!TextUtils.isEmpty(p5)) {
            setSubtitle(p5);
        }
        this.f3421j = getContext();
        setPopupTheme(v3.n(j.f14972f3, 0));
        Drawable g4 = v3.g(j.f14967e3);
        if (g4 != null) {
            setNavigationIcon(g4);
        }
        CharSequence p6 = v3.p(j.f14962d3);
        if (!TextUtils.isEmpty(p6)) {
            setNavigationContentDescription(p6);
        }
        Drawable g5 = v3.g(j.f14942Z2);
        if (g5 != null) {
            setLogo(g5);
        }
        CharSequence p7 = v3.p(j.f14947a3);
        if (!TextUtils.isEmpty(p7)) {
            setLogoDescription(p7);
        }
        int i6 = j.f15032r3;
        if (v3.s(i6)) {
            setTitleTextColor(v3.c(i6));
        }
        int i7 = j.f14987i3;
        if (v3.s(i7)) {
            setSubtitleTextColor(v3.c(i7));
        }
        int i8 = j.f14957c3;
        if (v3.s(i8)) {
            x(v3.n(i8, 0));
        }
        v3.w();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f3419h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f3419h.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f3419h;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f3417f);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.f3416e)) {
                c(this.f3416e, true);
            }
        } else {
            ImageView imageView = this.f3416e;
            if (imageView != null && z(imageView)) {
                removeView(this.f3416e);
                this.f3396E.remove(this.f3416e);
            }
        }
        ImageView imageView2 = this.f3416e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f3416e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f3415d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            h0.a(this.f3415d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.f3415d)) {
                c(this.f3415d, true);
            }
        } else {
            ImageButton imageButton = this.f3415d;
            if (imageButton != null && z(imageButton)) {
                removeView(this.f3415d);
                this.f3396E.remove(this.f3415d);
            }
        }
        ImageButton imageButton2 = this.f3415d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f3414c == null) {
                Context context = getContext();
                D d4 = new D(context);
                this.f3414c = d4;
                d4.setSingleLine();
                this.f3414c.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.f3424m;
                if (i4 != 0) {
                    this.f3414c.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.f3392A;
                if (colorStateList != null) {
                    this.f3414c.setTextColor(colorStateList);
                }
            }
            if (!z(this.f3414c)) {
                c(this.f3414c, true);
            }
        } else {
            TextView textView = this.f3414c;
            if (textView != null && z(textView)) {
                removeView(this.f3414c);
                this.f3396E.remove(this.f3414c);
            }
        }
        TextView textView2 = this.f3414c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f3436y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f3392A = colorStateList;
        TextView textView = this.f3414c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f3413b == null) {
                Context context = getContext();
                D d4 = new D(context);
                this.f3413b = d4;
                d4.setSingleLine();
                this.f3413b.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.f3423l;
                if (i4 != 0) {
                    this.f3413b.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.f3437z;
                if (colorStateList != null) {
                    this.f3413b.setTextColor(colorStateList);
                }
            }
            if (!z(this.f3413b)) {
                c(this.f3413b, true);
            }
        } else {
            TextView textView = this.f3413b;
            if (textView != null && z(textView)) {
                removeView(this.f3413b);
                this.f3396E.remove(this.f3413b);
            }
        }
        TextView textView2 = this.f3413b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f3435x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f3437z = colorStateList;
        TextView textView = this.f3413b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class i extends M.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        int f3446c;

        /* renamed from: d  reason: collision with root package name */
        boolean f3447d;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            /* renamed from: c */
            public i[] newArray(int i4) {
                return new i[i4];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3446c = parcel.readInt();
            this.f3447d = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f3446c);
            parcel.writeInt(this.f3447d ? 1 : 0);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
