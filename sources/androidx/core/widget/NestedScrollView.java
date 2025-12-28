package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.A;
import androidx.core.view.B;
import androidx.core.view.C0402a;
import androidx.core.view.C0443x;
import androidx.core.view.C0444y;
import androidx.core.view.P;
import androidx.core.view.accessibility.A;
import androidx.core.view.accessibility.C;
import java.util.ArrayList;

public class NestedScrollView extends FrameLayout implements A {

    /* renamed from: B  reason: collision with root package name */
    private static final float f5377B = ((float) (Math.log(0.78d) / Math.log(0.9d)));

    /* renamed from: C  reason: collision with root package name */
    private static final a f5378C = new a();

    /* renamed from: D  reason: collision with root package name */
    private static final int[] f5379D = {16843130};

    /* renamed from: A  reason: collision with root package name */
    private c f5380A;

    /* renamed from: a  reason: collision with root package name */
    private final float f5381a;

    /* renamed from: b  reason: collision with root package name */
    private long f5382b;

    /* renamed from: c  reason: collision with root package name */
    private final Rect f5383c;

    /* renamed from: d  reason: collision with root package name */
    private OverScroller f5384d;

    /* renamed from: e  reason: collision with root package name */
    public EdgeEffect f5385e;

    /* renamed from: f  reason: collision with root package name */
    public EdgeEffect f5386f;

    /* renamed from: g  reason: collision with root package name */
    private int f5387g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f5388h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f5389i;

    /* renamed from: j  reason: collision with root package name */
    private View f5390j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f5391k;

    /* renamed from: l  reason: collision with root package name */
    private VelocityTracker f5392l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f5393m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f5394n;

    /* renamed from: o  reason: collision with root package name */
    private int f5395o;

    /* renamed from: p  reason: collision with root package name */
    private int f5396p;

    /* renamed from: q  reason: collision with root package name */
    private int f5397q;

    /* renamed from: r  reason: collision with root package name */
    private int f5398r;

    /* renamed from: s  reason: collision with root package name */
    private final int[] f5399s;

    /* renamed from: t  reason: collision with root package name */
    private final int[] f5400t;

    /* renamed from: u  reason: collision with root package name */
    private int f5401u;

    /* renamed from: v  reason: collision with root package name */
    private int f5402v;

    /* renamed from: w  reason: collision with root package name */
    private d f5403w;

    /* renamed from: x  reason: collision with root package name */
    private final B f5404x;

    /* renamed from: y  reason: collision with root package name */
    private final C0444y f5405y;

    /* renamed from: z  reason: collision with root package name */
    private float f5406z;

    static class a extends C0402a {
        a() {
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            boolean z3;
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            accessibilityEvent.setScrollable(z3);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C.a(accessibilityEvent, nestedScrollView.getScrollX());
            C.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        public void g(View view, androidx.core.view.accessibility.A a4) {
            int scrollRange;
            super.g(view, a4);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            a4.j0(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                a4.B0(true);
                if (nestedScrollView.getScrollY() > 0) {
                    a4.b(A.a.f5255r);
                    a4.b(A.a.f5222C);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    a4.b(A.a.f5254q);
                    a4.b(A.a.f5224E);
                }
            }
        }

        public boolean j(View view, int i4, Bundle bundle) {
            if (super.j(view, i4, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i4 != 4096) {
                if (i4 == 8192 || i4 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.V(0, max, true);
                    return true;
                } else if (i4 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.V(0, min, true);
            return true;
        }
    }

    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public interface c {
        void a(NestedScrollView nestedScrollView, int i4, int i5, int i6, int i7);
    }

    static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f5407a;

        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* renamed from: b */
            public d[] newArray(int i4) {
                return new d[i4];
            }
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f5407a + "}";
        }

        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f5407a);
        }

        d(Parcel parcel) {
            super(parcel);
            this.f5407a = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, G.a.f431c);
    }

    private void A() {
        this.f5384d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f5395o = viewConfiguration.getScaledTouchSlop();
        this.f5396p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5397q = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void B() {
        if (this.f5392l == null) {
            this.f5392l = VelocityTracker.obtain();
        }
    }

    private void C(int i4, int i5) {
        this.f5387g = i4;
        this.f5398r = i5;
        W(2, 0);
    }

    private boolean D(View view) {
        return !F(view, 0, getHeight());
    }

    private static boolean E(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !E((View) parent, view2)) {
            return false;
        }
        return true;
    }

    private boolean F(View view, int i4, int i5) {
        view.getDrawingRect(this.f5383c);
        offsetDescendantRectToMyCoords(view, this.f5383c);
        if (this.f5383c.bottom + i4 < getScrollY() || this.f5383c.top - i4 > getScrollY() + i5) {
            return false;
        }
        return true;
    }

    private void G(int i4, int i5, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f5405y.e(0, scrollY2, 0, i4 - scrollY2, (int[]) null, i5, iArr);
    }

    private void H(MotionEvent motionEvent) {
        int i4;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5398r) {
            if (actionIndex == 0) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            this.f5387g = (int) motionEvent.getY(i4);
            this.f5398r = motionEvent.getPointerId(i4);
            VelocityTracker velocityTracker = this.f5392l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void K() {
        VelocityTracker velocityTracker = this.f5392l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5392l = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int L(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f5385e
            float r0 = androidx.core.widget.e.b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            android.widget.EdgeEffect r0 = r3.f5385e
            float r4 = -r4
            float r4 = androidx.core.widget.e.d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f5385e
            float r5 = androidx.core.widget.e.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f5385e
            r5.onRelease()
        L_0x002f:
            r1 = r4
            goto L_0x0054
        L_0x0031:
            android.widget.EdgeEffect r0 = r3.f5386f
            float r0 = androidx.core.widget.e.b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0054
            android.widget.EdgeEffect r0 = r3.f5386f
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.e.d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f5386f
            float r5 = androidx.core.widget.e.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f5386f
            r5.onRelease()
            goto L_0x002f
        L_0x0054:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L_0x0063
            r3.invalidate()
        L_0x0063:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.L(int, float):int");
    }

    private void M(boolean z3) {
        if (z3) {
            W(2, 1);
        } else {
            Y(1);
        }
        this.f5402v = getScrollY();
        P.f0(this);
    }

    private boolean N(int i4, int i5, int i6) {
        boolean z3;
        int i7;
        int height = getHeight();
        int scrollY = getScrollY();
        int i8 = height + scrollY;
        boolean z4 = false;
        if (i4 == 33) {
            z3 = true;
        } else {
            z3 = false;
        }
        View t4 = t(z3, i5, i6);
        if (t4 == null) {
            t4 = this;
        }
        if (i5 < scrollY || i6 > i8) {
            if (z3) {
                i7 = i5 - scrollY;
            } else {
                i7 = i6 - i8;
            }
            O(i7, 0, 1, true);
            z4 = true;
        }
        if (t4 != findFocus()) {
            t4.requestFocus(i4);
        }
        return z4;
    }

    private int O(int i4, int i5, int i6, boolean z3) {
        int i7;
        int i8;
        boolean z4;
        boolean z5;
        int i9 = i5;
        int i10 = i6;
        if (i10 == 1) {
            W(2, i10);
        }
        boolean z6 = false;
        if (k(0, i4, this.f5400t, this.f5399s, i6)) {
            i8 = i4 - this.f5400t[1];
            i7 = this.f5399s[1];
        } else {
            i8 = i4;
            i7 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        if (!c() || z3) {
            z4 = false;
        } else {
            z4 = true;
        }
        int i11 = scrollRange;
        if (!I(0, i8, 0, scrollY, 0, scrollRange, 0, 0, true) || x(i10)) {
            z5 = false;
        } else {
            z5 = true;
        }
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f5400t;
        iArr[1] = 0;
        l(0, scrollY2, 0, i8 - scrollY2, this.f5399s, i6, iArr);
        int i12 = i7 + this.f5399s[1];
        int i13 = i8 - this.f5400t[1];
        int i14 = scrollY + i13;
        if (i14 < 0) {
            if (z4) {
                e.d(this.f5385e, ((float) (-i13)) / ((float) getHeight()), ((float) i9) / ((float) getWidth()));
                if (!this.f5386f.isFinished()) {
                    this.f5386f.onRelease();
                }
            }
        } else if (i14 > i11 && z4) {
            e.d(this.f5386f, ((float) i13) / ((float) getHeight()), 1.0f - (((float) i9) / ((float) getWidth())));
            if (!this.f5385e.isFinished()) {
                this.f5385e.onRelease();
            }
        }
        if (!this.f5385e.isFinished() || !this.f5386f.isFinished()) {
            P.f0(this);
        } else {
            z6 = z5;
        }
        if (z6 && i10 == 0) {
            this.f5392l.clear();
        }
        if (i10 == 1) {
            Y(i10);
            this.f5385e.onRelease();
            this.f5386f.onRelease();
        }
        return i12;
    }

    private void P(View view) {
        view.getDrawingRect(this.f5383c);
        offsetDescendantRectToMyCoords(view, this.f5383c);
        int f4 = f(this.f5383c);
        if (f4 != 0) {
            scrollBy(0, f4);
        }
    }

    private boolean Q(Rect rect, boolean z3) {
        boolean z4;
        int f4 = f(rect);
        if (f4 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (z3) {
                scrollBy(0, f4);
            } else {
                S(0, f4);
            }
        }
        return z4;
    }

    private boolean R(EdgeEffect edgeEffect, int i4) {
        if (i4 > 0) {
            return true;
        }
        if (w(-i4) < e.b(edgeEffect) * ((float) getHeight())) {
            return true;
        }
        return false;
    }

    private void T(int i4, int i5, int i6, boolean z3) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f5382b > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f5384d;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i5 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i6);
                M(z3);
            } else {
                if (!this.f5384d.isFinished()) {
                    a();
                }
                scrollBy(i4, i5);
            }
            this.f5382b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    private boolean X(MotionEvent motionEvent) {
        boolean z3;
        if (e.b(this.f5385e) != 0.0f) {
            e.d(this.f5385e, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z3 = true;
        } else {
            z3 = false;
        }
        if (e.b(this.f5386f) == 0.0f) {
            return z3;
        }
        e.d(this.f5386f, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    private void a() {
        this.f5384d.abortAnimation();
        Y(1);
    }

    private boolean c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0) {
            return true;
        }
        if (overScrollMode != 1 || getScrollRange() <= 0) {
            return false;
        }
        return true;
    }

    private boolean d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    private static int e(int i4, int i5, int i6) {
        if (i5 >= i6 || i4 < 0) {
            return 0;
        }
        return i5 + i4 > i6 ? i6 - i5 : i4;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f5406z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f5406z = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f5406z;
    }

    private void p(int i4) {
        if (i4 == 0) {
            return;
        }
        if (this.f5394n) {
            S(0, i4);
        } else {
            scrollBy(0, i4);
        }
    }

    private boolean q(int i4) {
        if (e.b(this.f5385e) != 0.0f) {
            if (R(this.f5385e, i4)) {
                this.f5385e.onAbsorb(i4);
            } else {
                u(-i4);
            }
        } else if (e.b(this.f5386f) == 0.0f) {
            return false;
        } else {
            int i5 = -i4;
            if (R(this.f5386f, i5)) {
                this.f5386f.onAbsorb(i5);
            } else {
                u(i5);
            }
        }
        return true;
    }

    private void r() {
        this.f5398r = -1;
        this.f5391k = false;
        K();
        Y(0);
        this.f5385e.onRelease();
        this.f5386f.onRelease();
    }

    private View t(boolean z3, int i4, int i5) {
        boolean z4;
        boolean z5;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z6 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = focusables.get(i6);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i4 < bottom && top < i5) {
                if (i4 >= top || bottom >= i5) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (view == null) {
                    view = view2;
                    z6 = z4;
                } else {
                    if ((!z3 || top >= view.getTop()) && (z3 || bottom <= view.getBottom())) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (z6) {
                        if (z4) {
                            if (!z5) {
                            }
                        }
                    } else if (z4) {
                        view = view2;
                        z6 = true;
                    } else if (!z5) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    private float w(int i4) {
        double log = Math.log((double) ((((float) Math.abs(i4)) * 0.35f) / (this.f5381a * 0.015f)));
        float f4 = f5377B;
        return (float) (((double) (this.f5381a * 0.015f)) * Math.exp((((double) f4) / (((double) f4) - 1.0d)) * log));
    }

    private boolean y(int i4, int i5) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i5 < childAt.getTop() - scrollY || i5 >= childAt.getBottom() - scrollY || i4 < childAt.getLeft() || i4 >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    private void z() {
        VelocityTracker velocityTracker = this.f5392l;
        if (velocityTracker == null) {
            this.f5392l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean I(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i12;
        int i13;
        boolean z8;
        boolean z9;
        int overScrollMode = getOverScrollMode();
        if (computeHorizontalScrollRange() > computeHorizontalScrollExtent()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (computeVerticalScrollRange() > computeVerticalScrollExtent()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (overScrollMode == 0 || (overScrollMode == 1 && z4)) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (overScrollMode == 0 || (overScrollMode == 1 && z5)) {
            z7 = true;
        } else {
            z7 = false;
        }
        int i14 = i6 + i4;
        if (!z6) {
            i12 = 0;
        } else {
            i12 = i10;
        }
        int i15 = i7 + i5;
        if (!z7) {
            i13 = 0;
        } else {
            i13 = i11;
        }
        int i16 = -i12;
        int i17 = i12 + i8;
        int i18 = -i13;
        int i19 = i13 + i9;
        if (i14 > i17) {
            i14 = i17;
            z8 = true;
        } else if (i14 < i16) {
            z8 = true;
            i14 = i16;
        } else {
            z8 = false;
        }
        if (i15 > i19) {
            i15 = i19;
            z9 = true;
        } else if (i15 < i18) {
            z9 = true;
            i15 = i18;
        } else {
            z9 = false;
        }
        if (z9 && !x(1)) {
            this.f5384d.springBack(i14, i15, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i14, i15, z8, z9);
        if (z8 || z9) {
            return true;
        }
        return false;
    }

    public boolean J(int i4) {
        boolean z3;
        if (i4 == 130) {
            z3 = true;
        } else {
            z3 = false;
        }
        int height = getHeight();
        if (z3) {
            this.f5383c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f5383c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f5383c.top = getScrollY() - height;
            Rect rect2 = this.f5383c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f5383c;
        int i5 = rect3.top;
        int i6 = height + i5;
        rect3.bottom = i6;
        return N(i4, i5, i6);
    }

    public final void S(int i4, int i5) {
        T(i4, i5, 250, false);
    }

    /* access modifiers changed from: package-private */
    public void U(int i4, int i5, int i6, boolean z3) {
        T(i4 - getScrollX(), i5 - getScrollY(), i6, z3);
    }

    /* access modifiers changed from: package-private */
    public void V(int i4, int i5, boolean z3) {
        U(i4, i5, 250, z3);
    }

    public boolean W(int i4, int i5) {
        return this.f5405y.p(i4, i5);
    }

    public void Y(int i4) {
        this.f5405y.r(i4);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean b(int i4) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i4);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !F(findNextFocus, maxScrollAmount, getHeight())) {
            if (i4 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i4 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i4 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            O(maxScrollAmount, 0, 1, true);
        } else {
            findNextFocus.getDrawingRect(this.f5383c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f5383c);
            O(f(this.f5383c), 0, 1, true);
            findNextFocus.requestFocus(i4);
        }
        if (findFocus != null && findFocus.isFocused() && D(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (!this.f5384d.isFinished()) {
            this.f5384d.computeScrollOffset();
            int currY = this.f5384d.getCurrY();
            int g4 = g(currY - this.f5402v);
            this.f5402v = currY;
            int[] iArr = this.f5400t;
            iArr[1] = 0;
            k(0, g4, iArr, (int[]) null, 1);
            int i4 = g4 - this.f5400t[1];
            int scrollRange = getScrollRange();
            if (i4 != 0) {
                int scrollY = getScrollY();
                I(0, i4, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i5 = i4 - scrollY2;
                int[] iArr2 = this.f5400t;
                iArr2[1] = 0;
                l(0, scrollY2, 0, i5, this.f5399s, 1, iArr2);
                i4 = i5 - this.f5400t[1];
            }
            if (i4 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i4 < 0) {
                        if (this.f5385e.isFinished()) {
                            this.f5385e.onAbsorb((int) this.f5384d.getCurrVelocity());
                        }
                    } else if (this.f5386f.isFinished()) {
                        this.f5386f.onAbsorb((int) this.f5384d.getCurrVelocity());
                    }
                }
                a();
            }
            if (!this.f5384d.isFinished()) {
                P.f0(this);
            } else {
                Y(1);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || s(keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean dispatchNestedFling(float f4, float f5, boolean z3) {
        return this.f5405y.a(f4, f5, z3);
    }

    public boolean dispatchNestedPreFling(float f4, float f5) {
        return this.f5405y.b(f4, f5);
    }

    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return k(i4, i5, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return this.f5405y.f(i4, i5, i6, i7, iArr);
    }

    public void draw(Canvas canvas) {
        int i4;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i5 = 0;
        if (!this.f5385e.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i4 = getPaddingLeft();
            } else {
                i4 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate((float) i4, (float) min);
            this.f5385e.setSize(width, height);
            if (this.f5385e.draw(canvas)) {
                P.f0(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f5386f.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (b.a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i5 = getPaddingLeft();
            }
            if (b.a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i5 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            this.f5386f.setSize(width2, height2);
            if (this.f5386f.draw(canvas)) {
                P.f0(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* access modifiers changed from: protected */
    public int f(Rect rect) {
        int i4;
        int i5;
        int i6;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i4 = i7 - verticalFadingEdgeLength;
        } else {
            i4 = i7;
        }
        int i8 = rect.bottom;
        if (i8 > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i6 = rect.top - scrollY;
            } else {
                i6 = rect.bottom - i4;
            }
            return Math.min(i6, (childAt.getBottom() + layoutParams.bottomMargin) - i7);
        } else if (rect.top >= scrollY || i8 >= i4) {
            return 0;
        } else {
            if (rect.height() > height) {
                i5 = 0 - (i4 - rect.bottom);
            } else {
                i5 = 0 - (scrollY - rect.top);
            }
            return Math.max(i5, -getScrollY());
        }
    }

    /* access modifiers changed from: package-private */
    public int g(int i4) {
        int height = getHeight();
        if (i4 > 0 && e.b(this.f5385e) != 0.0f) {
            int round = Math.round((((float) (-height)) / 4.0f) * e.d(this.f5385e, (((float) (-i4)) * 4.0f) / ((float) height), 0.5f));
            if (round != i4) {
                this.f5385e.finish();
            }
            return i4 - round;
        } else if (i4 >= 0 || e.b(this.f5386f) == 0.0f) {
            return i4;
        } else {
            float f4 = (float) height;
            int round2 = Math.round((f4 / 4.0f) * e.d(this.f5386f, (((float) i4) * 4.0f) / f4, 0.5f));
            if (round2 != i4) {
                this.f5386f.finish();
            }
            return i4 - round2;
        }
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f5404x.a();
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public void h(View view, View view2, int i4, int i5) {
        this.f5404x.c(view, view2, i4, i5);
        W(2, i5);
    }

    public boolean hasNestedScrollingParent() {
        return x(0);
    }

    public void i(View view, int i4) {
        this.f5404x.d(view, i4);
        Y(i4);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f5405y.l();
    }

    public void j(View view, int i4, int i5, int[] iArr, int i6) {
        k(i4, i5, iArr, (int[]) null, i6);
    }

    public boolean k(int i4, int i5, int[] iArr, int[] iArr2, int i6) {
        return this.f5405y.d(i4, i5, iArr, iArr2, i6);
    }

    public void l(int i4, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        this.f5405y.e(i4, i5, i6, i7, iArr, i8, iArr2);
    }

    public void m(View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        G(i7, i8, iArr);
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i4, int i5) {
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i4, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void n(View view, int i4, int i5, int i6, int i7, int i8) {
        G(i7, i8, (int[]) null);
    }

    public boolean o(View view, View view2, int i4, int i5) {
        return (i4 & 2) != 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5389i = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i4;
        float f4;
        if (motionEvent.getAction() != 8 || this.f5391k) {
            return false;
        }
        if (C0443x.a(motionEvent, 2)) {
            f4 = motionEvent.getAxisValue(9);
            i4 = (int) motionEvent.getX();
        } else if (C0443x.a(motionEvent, 4194304)) {
            float axisValue = motionEvent.getAxisValue(26);
            i4 = getWidth() / 2;
            f4 = axisValue;
        } else {
            i4 = 0;
            f4 = 0.0f;
        }
        if (f4 == 0.0f) {
            return false;
        }
        O(-((int) (f4 * getVerticalScrollFactorCompat())), i4, 1, C0443x.a(motionEvent, 8194));
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action == 2 && this.f5391k) {
            return true;
        }
        int i4 = action & 255;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = this.f5398r;
                    if (i5 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i5);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i5 + " in onInterceptTouchEvent");
                        } else {
                            int y3 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y3 - this.f5387g) > this.f5395o && (2 & getNestedScrollAxes()) == 0) {
                                this.f5391k = true;
                                this.f5387g = y3;
                                B();
                                this.f5392l.addMovement(motionEvent);
                                this.f5401u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i4 != 3) {
                    if (i4 == 6) {
                        H(motionEvent);
                    }
                }
            }
            this.f5391k = false;
            this.f5398r = -1;
            K();
            if (this.f5384d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                P.f0(this);
            }
            Y(0);
        } else {
            int y4 = (int) motionEvent.getY();
            if (!y((int) motionEvent.getX(), y4)) {
                if (!X(motionEvent) && this.f5384d.isFinished()) {
                    z3 = false;
                }
                this.f5391k = z3;
                K();
            } else {
                this.f5387g = y4;
                this.f5398r = motionEvent.getPointerId(0);
                z();
                this.f5392l.addMovement(motionEvent);
                this.f5384d.computeScrollOffset();
                if (!X(motionEvent) && this.f5384d.isFinished()) {
                    z3 = false;
                }
                this.f5391k = z3;
                W(2, 0);
            }
        }
        return this.f5391k;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        int i8 = 0;
        this.f5388h = false;
        View view = this.f5390j;
        if (view != null && E(view, this)) {
            P(this.f5390j);
        }
        this.f5390j = null;
        if (!this.f5389i) {
            if (this.f5403w != null) {
                scrollTo(getScrollX(), this.f5403w.f5407a);
                this.f5403w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i8 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int e4 = e(scrollY, paddingTop, i8);
            if (e4 != scrollY) {
                scrollTo(getScrollX(), e4);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f5389i = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f5393m && View.MeasureSpec.getMode(i5) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f4, float f5, boolean z3) {
        if (z3) {
            return false;
        }
        dispatchNestedFling(0.0f, f5, true);
        u((int) f5);
        return true;
    }

    public boolean onNestedPreFling(View view, float f4, float f5) {
        return dispatchNestedPreFling(f4, f5);
    }

    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        j(view, i4, i5, iArr, 0);
    }

    public void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        G(i7, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i4) {
        h(view, view2, i4, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i4, int i5, boolean z3, boolean z4) {
        super.scrollTo(i4, i5);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i4, Rect rect) {
        View view;
        if (i4 == 2) {
            i4 = 130;
        } else if (i4 == 1) {
            i4 = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i4);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i4);
        }
        if (view != null && !D(view)) {
            return view.requestFocus(i4, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f5403w = dVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f5407a = getScrollY();
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
        c cVar = this.f5380A;
        if (cVar != null) {
            cVar.a(this, i4, i5, i6, i7);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && F(findFocus, 0, i7)) {
            findFocus.getDrawingRect(this.f5383c);
            offsetDescendantRectToMyCoords(findFocus, this.f5383c);
            p(f(this.f5383c));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i4) {
        return o(view, view2, i4, 0);
    }

    public void onStopNestedScroll(View view) {
        i(view, 0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        B();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5401u = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, (float) this.f5401u);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f5392l;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f5397q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f5398r);
                if (Math.abs(yVelocity) >= this.f5396p) {
                    if (!q(yVelocity)) {
                        int i4 = -yVelocity;
                        float f4 = (float) i4;
                        if (!dispatchNestedPreFling(0.0f, f4)) {
                            dispatchNestedFling(0.0f, f4, true);
                            u(i4);
                        }
                    }
                } else if (this.f5384d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    P.f0(this);
                }
                r();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f5398r);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f5398r + " in onTouchEvent");
                } else {
                    int y3 = (int) motionEvent.getY(findPointerIndex);
                    int i5 = this.f5387g - y3;
                    int L3 = i5 - L(i5, motionEvent.getX(findPointerIndex));
                    if (!this.f5391k && Math.abs(L3) > this.f5395o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f5391k = true;
                        L3 = L3 > 0 ? L3 - this.f5395o : L3 + this.f5395o;
                    }
                    if (this.f5391k) {
                        int O3 = O(L3, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f5387g = y3 - O3;
                        this.f5401u += O3;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f5391k && getChildCount() > 0 && this.f5384d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    P.f0(this);
                }
                r();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f5387g = (int) motionEvent.getY(actionIndex);
                this.f5398r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                H(motionEvent);
                this.f5387g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f5398r));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            if (this.f5391k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f5384d.isFinished()) {
                a();
            }
            C((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f5392l;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f5388h) {
            P(view2);
        } else {
            this.f5390j = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return Q(rect, z3);
    }

    public void requestDisallowInterceptTouchEvent(boolean z3) {
        if (z3) {
            K();
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    public void requestLayout() {
        this.f5388h = true;
        super.requestLayout();
    }

    public boolean s(KeyEvent keyEvent) {
        this.f5383c.setEmpty();
        int i4 = 130;
        if (!d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode == 62) {
                        if (keyEvent.isShiftPressed()) {
                            i4 = 33;
                        }
                        J(i4);
                        return false;
                    } else if (keyCode == 92) {
                        return v(33);
                    } else {
                        if (keyCode == 93) {
                            return v(130);
                        }
                        if (keyCode == 122) {
                            J(33);
                            return false;
                        } else if (keyCode != 123) {
                            return false;
                        } else {
                            J(130);
                            return false;
                        }
                    }
                } else if (keyEvent.isAltPressed()) {
                    return v(130);
                } else {
                    return b(130);
                }
            } else if (keyEvent.isAltPressed()) {
                return v(33);
            } else {
                return b(33);
            }
        }
    }

    public void scrollTo(int i4, int i5) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int e4 = e(i4, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int e5 = e(i5, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (e4 != getScrollX() || e5 != getScrollY()) {
                super.scrollTo(e4, e5);
            }
        }
    }

    public void setFillViewport(boolean z3) {
        if (z3 != this.f5393m) {
            this.f5393m = z3;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z3) {
        this.f5405y.m(z3);
    }

    public void setOnScrollChangeListener(c cVar) {
    }

    public void setSmoothScrollingEnabled(boolean z3) {
        this.f5394n = z3;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i4) {
        return W(i4, 0);
    }

    public void stopNestedScroll() {
        Y(0);
    }

    public void u(int i4) {
        if (getChildCount() > 0) {
            this.f5384d.fling(getScrollX(), getScrollY(), 0, i4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            M(true);
        }
    }

    public boolean v(int i4) {
        boolean z3;
        int childCount;
        if (i4 == 130) {
            z3 = true;
        } else {
            z3 = false;
        }
        int height = getHeight();
        Rect rect = this.f5383c;
        rect.top = 0;
        rect.bottom = height;
        if (z3 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f5383c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f5383c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f5383c;
        return N(i4, rect3.top, rect3.bottom);
    }

    public boolean x(int i4) {
        return this.f5405y.k(i4);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f5383c = new Rect();
        this.f5388h = true;
        this.f5389i = false;
        this.f5390j = null;
        this.f5391k = false;
        this.f5394n = true;
        this.f5398r = -1;
        this.f5399s = new int[2];
        this.f5400t = new int[2];
        this.f5385e = e.a(context, attributeSet);
        this.f5386f = e.a(context, attributeSet);
        this.f5381a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        A();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5379D, i4, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f5404x = new B(this);
        this.f5405y = new C0444y(this);
        setNestedScrollingEnabled(true);
        P.o0(this, f5378C);
    }

    public void addView(View view, int i4) {
        if (getChildCount() <= 0) {
            super.addView(view, i4);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i4, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
