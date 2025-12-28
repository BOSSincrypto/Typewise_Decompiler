package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.m;
import androidx.core.graphics.f;
import androidx.core.view.A;
import androidx.core.view.B;
import androidx.core.view.C0435o0;
import androidx.core.view.C0445z;
import androidx.core.view.P;
import n.C0822a;

public class ActionBarOverlayLayout extends ViewGroup implements I, C0445z, A {

    /* renamed from: F  reason: collision with root package name */
    static final int[] f3095F = {C0822a.f14669b, 16842841};

    /* renamed from: A  reason: collision with root package name */
    ViewPropertyAnimator f3096A;

    /* renamed from: B  reason: collision with root package name */
    final AnimatorListenerAdapter f3097B;

    /* renamed from: C  reason: collision with root package name */
    private final Runnable f3098C;

    /* renamed from: D  reason: collision with root package name */
    private final Runnable f3099D;

    /* renamed from: E  reason: collision with root package name */
    private final B f3100E;

    /* renamed from: a  reason: collision with root package name */
    private int f3101a;

    /* renamed from: b  reason: collision with root package name */
    private int f3102b = 0;

    /* renamed from: c  reason: collision with root package name */
    private ContentFrameLayout f3103c;

    /* renamed from: d  reason: collision with root package name */
    ActionBarContainer f3104d;

    /* renamed from: e  reason: collision with root package name */
    private J f3105e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f3106f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3107g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3108h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3109i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3110j;

    /* renamed from: k  reason: collision with root package name */
    boolean f3111k;

    /* renamed from: l  reason: collision with root package name */
    private int f3112l;

    /* renamed from: m  reason: collision with root package name */
    private int f3113m;

    /* renamed from: n  reason: collision with root package name */
    private final Rect f3114n = new Rect();

    /* renamed from: o  reason: collision with root package name */
    private final Rect f3115o = new Rect();

    /* renamed from: p  reason: collision with root package name */
    private final Rect f3116p = new Rect();

    /* renamed from: q  reason: collision with root package name */
    private final Rect f3117q = new Rect();

    /* renamed from: r  reason: collision with root package name */
    private final Rect f3118r = new Rect();

    /* renamed from: s  reason: collision with root package name */
    private final Rect f3119s = new Rect();

    /* renamed from: t  reason: collision with root package name */
    private final Rect f3120t = new Rect();

    /* renamed from: u  reason: collision with root package name */
    private C0435o0 f3121u;

    /* renamed from: v  reason: collision with root package name */
    private C0435o0 f3122v;

    /* renamed from: w  reason: collision with root package name */
    private C0435o0 f3123w;

    /* renamed from: x  reason: collision with root package name */
    private C0435o0 f3124x;

    /* renamed from: y  reason: collision with root package name */
    private d f3125y;

    /* renamed from: z  reason: collision with root package name */
    private OverScroller f3126z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f3096A = null;
            actionBarOverlayLayout.f3111k = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f3096A = null;
            actionBarOverlayLayout.f3111k = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f3096A = actionBarOverlayLayout.f3104d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f3097B);
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f3096A = actionBarOverlayLayout.f3104d.animate().translationY((float) (-ActionBarOverlayLayout.this.f3104d.getHeight())).setListener(ActionBarOverlayLayout.this.f3097B);
        }
    }

    public interface d {
        void a();

        void b();

        void c(int i4);

        void d();

        void e(boolean z3);

        void f();
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i4, int i5) {
            super(i4, i5);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0435o0 o0Var = C0435o0.f5327b;
        this.f3121u = o0Var;
        this.f3122v = o0Var;
        this.f3123w = o0Var;
        this.f3124x = o0Var;
        this.f3097B = new a();
        this.f3098C = new b();
        this.f3099D = new c();
        v(context);
        this.f3100E = new B(this);
    }

    private void A() {
        u();
        this.f3098C.run();
    }

    private boolean B(float f4) {
        this.f3126z.fling(0, 0, 0, (int) f4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f3126z.getFinalY() > this.f3104d.getHeight()) {
            return true;
        }
        return false;
    }

    private void p() {
        u();
        this.f3099D.run();
    }

    private boolean q(View view, Rect rect, boolean z3, boolean z4, boolean z5, boolean z6) {
        boolean z7;
        int i4;
        int i5;
        int i6;
        int i7;
        e eVar = (e) view.getLayoutParams();
        if (!z3 || eVar.leftMargin == (i7 = rect.left)) {
            z7 = false;
        } else {
            eVar.leftMargin = i7;
            z7 = true;
        }
        if (z4 && eVar.topMargin != (i6 = rect.top)) {
            eVar.topMargin = i6;
            z7 = true;
        }
        if (z6 && eVar.rightMargin != (i5 = rect.right)) {
            eVar.rightMargin = i5;
            z7 = true;
        }
        if (!z5 || eVar.bottomMargin == (i4 = rect.bottom)) {
            return z7;
        }
        eVar.bottomMargin = i4;
        return true;
    }

    private J t(View view) {
        if (view instanceof J) {
            return (J) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void v(Context context) {
        boolean z3;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f3095F);
        boolean z4 = false;
        this.f3101a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f3106f = drawable;
        if (drawable == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        setWillNotDraw(z3);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z4 = true;
        }
        this.f3107g = z4;
        this.f3126z = new OverScroller(context);
    }

    private void x() {
        u();
        postDelayed(this.f3099D, 600);
    }

    private void y() {
        u();
        postDelayed(this.f3098C, 600);
    }

    public void a(Menu menu, m.a aVar) {
        z();
        this.f3105e.a(menu, aVar);
    }

    public boolean b() {
        z();
        return this.f3105e.b();
    }

    public void c() {
        z();
        this.f3105e.c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public boolean d() {
        z();
        return this.f3105e.d();
    }

    public void draw(Canvas canvas) {
        int i4;
        super.draw(canvas);
        if (this.f3106f != null && !this.f3107g) {
            if (this.f3104d.getVisibility() == 0) {
                i4 = (int) (((float) this.f3104d.getBottom()) + this.f3104d.getTranslationY() + 0.5f);
            } else {
                i4 = 0;
            }
            this.f3106f.setBounds(0, i4, getWidth(), this.f3106f.getIntrinsicHeight() + i4);
            this.f3106f.draw(canvas);
        }
    }

    public boolean e() {
        z();
        return this.f3105e.e();
    }

    public boolean f() {
        z();
        return this.f3105e.f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public boolean g() {
        z();
        return this.f3105e.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f3104d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f3100E.a();
    }

    public CharSequence getTitle() {
        z();
        return this.f3105e.getTitle();
    }

    public void h(View view, View view2, int i4, int i5) {
        if (i5 == 0) {
            onNestedScrollAccepted(view, view2, i4);
        }
    }

    public void i(View view, int i4) {
        if (i4 == 0) {
            onStopNestedScroll(view);
        }
    }

    public void j(View view, int i4, int i5, int[] iArr, int i6) {
        if (i6 == 0) {
            onNestedPreScroll(view, i4, i5, iArr);
        }
    }

    public void k(int i4) {
        z();
        if (i4 == 2) {
            this.f3105e.u();
        } else if (i4 == 5) {
            this.f3105e.v();
        } else if (i4 == 109) {
            setOverlayMode(true);
        }
    }

    public void l() {
        z();
        this.f3105e.h();
    }

    public void m(View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        n(view, i4, i5, i6, i7, i8);
    }

    public void n(View view, int i4, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            onNestedScroll(view, i4, i5, i6, i7);
        }
    }

    public boolean o(View view, View view2, int i4, int i5) {
        if (i5 != 0 || !onStartNestedScroll(view, view2, i4)) {
            return false;
        }
        return true;
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        z();
        C0435o0 w3 = C0435o0.w(windowInsets, this);
        boolean q4 = q(this.f3104d, new Rect(w3.i(), w3.k(), w3.j(), w3.h()), true, true, false, true);
        P.f(this, w3, this.f3114n);
        Rect rect = this.f3114n;
        C0435o0 l4 = w3.l(rect.left, rect.top, rect.right, rect.bottom);
        this.f3121u = l4;
        boolean z3 = true;
        if (!this.f3122v.equals(l4)) {
            this.f3122v = this.f3121u;
            q4 = true;
        }
        if (!this.f3115o.equals(this.f3114n)) {
            this.f3115o.set(this.f3114n);
        } else {
            z3 = q4;
        }
        if (z3) {
            requestLayout();
        }
        return w3.a().c().b().u();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        P.l0(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = eVar.leftMargin + paddingLeft;
                int i10 = eVar.topMargin + paddingTop;
                childAt.layout(i9, i10, measuredWidth + i9, measuredHeight + i10);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        boolean z3;
        int i6;
        z();
        measureChildWithMargins(this.f3104d, i4, 0, i5, 0);
        e eVar = (e) this.f3104d.getLayoutParams();
        int max = Math.max(0, this.f3104d.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f3104d.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f3104d.getMeasuredState());
        if ((P.L(this) & 256) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            i6 = this.f3101a;
            if (this.f3109i && this.f3104d.getTabContainer() != null) {
                i6 += this.f3101a;
            }
        } else {
            i6 = this.f3104d.getVisibility() != 8 ? this.f3104d.getMeasuredHeight() : 0;
        }
        this.f3116p.set(this.f3114n);
        C0435o0 o0Var = this.f3121u;
        this.f3123w = o0Var;
        if (this.f3108h || z3) {
            this.f3123w = new C0435o0.b(this.f3123w).d(f.b(o0Var.i(), this.f3123w.k() + i6, this.f3123w.j(), this.f3123w.h())).a();
        } else {
            Rect rect = this.f3116p;
            rect.top += i6;
            rect.bottom = rect.bottom;
            this.f3123w = o0Var.l(0, i6, 0, 0);
        }
        q(this.f3103c, this.f3116p, true, true, true, true);
        if (!this.f3124x.equals(this.f3123w)) {
            C0435o0 o0Var2 = this.f3123w;
            this.f3124x = o0Var2;
            P.g(this.f3103c, o0Var2);
        }
        measureChildWithMargins(this.f3103c, i4, 0, i5, 0);
        e eVar2 = (e) this.f3103c.getLayoutParams();
        int max3 = Math.max(max, this.f3103c.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f3103c.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f3103c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i4, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i5, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f4, float f5, boolean z3) {
        if (!this.f3110j || !z3) {
            return false;
        }
        if (B(f5)) {
            p();
        } else {
            A();
        }
        this.f3111k = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f4, float f5) {
        return false;
    }

    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
    }

    public void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        int i8 = this.f3112l + i5;
        this.f3112l = i8;
        setActionBarHideOffset(i8);
    }

    public void onNestedScrollAccepted(View view, View view2, int i4) {
        this.f3100E.b(view, view2, i4);
        this.f3112l = getActionBarHideOffset();
        u();
        d dVar = this.f3125y;
        if (dVar != null) {
            dVar.b();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i4) {
        if ((i4 & 2) == 0 || this.f3104d.getVisibility() != 0) {
            return false;
        }
        return this.f3110j;
    }

    public void onStopNestedScroll(View view) {
        if (this.f3110j && !this.f3111k) {
            if (this.f3112l <= this.f3104d.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.f3125y;
        if (dVar != null) {
            dVar.d();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i4) {
        boolean z3;
        super.onWindowSystemUiVisibilityChanged(i4);
        z();
        int i5 = this.f3113m ^ i4;
        this.f3113m = i4;
        boolean z4 = false;
        if ((i4 & 4) == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i4 & 256) != 0) {
            z4 = true;
        }
        d dVar = this.f3125y;
        if (dVar != null) {
            dVar.e(!z4);
            if (z3 || !z4) {
                this.f3125y.a();
            } else {
                this.f3125y.f();
            }
        }
        if ((i5 & 256) != 0 && this.f3125y != null) {
            P.l0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        this.f3102b = i4;
        d dVar = this.f3125y;
        if (dVar != null) {
            dVar.c(i4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    /* renamed from: s */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i4) {
        u();
        this.f3104d.setTranslationY((float) (-Math.max(0, Math.min(i4, this.f3104d.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f3125y = dVar;
        if (getWindowToken() != null) {
            this.f3125y.c(this.f3102b);
            int i4 = this.f3113m;
            if (i4 != 0) {
                onWindowSystemUiVisibilityChanged(i4);
                P.l0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z3) {
        this.f3109i = z3;
    }

    public void setHideOnContentScrollEnabled(boolean z3) {
        if (z3 != this.f3110j) {
            this.f3110j = z3;
            if (!z3) {
                u();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i4) {
        z();
        this.f3105e.setIcon(i4);
    }

    public void setLogo(int i4) {
        z();
        this.f3105e.r(i4);
    }

    public void setOverlayMode(boolean z3) {
        boolean z4;
        this.f3108h = z3;
        if (!z3 || getContext().getApplicationInfo().targetSdkVersion >= 19) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f3107g = z4;
    }

    public void setShowingForActionMode(boolean z3) {
    }

    public void setUiOptions(int i4) {
    }

    public void setWindowCallback(Window.Callback callback) {
        z();
        this.f3105e.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.f3105e.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        removeCallbacks(this.f3098C);
        removeCallbacks(this.f3099D);
        ViewPropertyAnimator viewPropertyAnimator = this.f3096A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean w() {
        return this.f3108h;
    }

    /* access modifiers changed from: package-private */
    public void z() {
        if (this.f3103c == null) {
            this.f3103c = (ContentFrameLayout) findViewById(n.f.f14778b);
            this.f3104d = (ActionBarContainer) findViewById(n.f.f14779c);
            this.f3105e = t(findViewById(n.f.f14777a));
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.f3105e.setIcon(drawable);
    }
}
