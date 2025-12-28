package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.view.A;
import androidx.core.view.B;
import androidx.core.view.C;
import androidx.core.view.C0434o;
import androidx.core.view.C0435o0;
import androidx.core.view.C0445z;
import androidx.core.view.P;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements C0445z, A {

    /* renamed from: t  reason: collision with root package name */
    static final String f4684t;

    /* renamed from: u  reason: collision with root package name */
    static final Class[] f4685u = {Context.class, AttributeSet.class};

    /* renamed from: v  reason: collision with root package name */
    static final ThreadLocal f4686v = new ThreadLocal();

    /* renamed from: w  reason: collision with root package name */
    static final Comparator f4687w = new h();

    /* renamed from: x  reason: collision with root package name */
    private static final androidx.core.util.d f4688x = new androidx.core.util.f(12);

    /* renamed from: a  reason: collision with root package name */
    private final List f4689a;

    /* renamed from: b  reason: collision with root package name */
    private final a f4690b;

    /* renamed from: c  reason: collision with root package name */
    private final List f4691c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f4692d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f4693e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f4694f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f4695g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f4696h;

    /* renamed from: i  reason: collision with root package name */
    private int[] f4697i;

    /* renamed from: j  reason: collision with root package name */
    private View f4698j;

    /* renamed from: k  reason: collision with root package name */
    private View f4699k;

    /* renamed from: l  reason: collision with root package name */
    private f f4700l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f4701m;

    /* renamed from: n  reason: collision with root package name */
    private C0435o0 f4702n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f4703o;

    /* renamed from: p  reason: collision with root package name */
    private Drawable f4704p;

    /* renamed from: q  reason: collision with root package name */
    ViewGroup.OnHierarchyChangeListener f4705q;

    /* renamed from: r  reason: collision with root package name */
    private C f4706r;

    /* renamed from: s  reason: collision with root package name */
    private final B f4707s;

    class a implements C {
        a() {
        }

        public C0435o0 a(View view, C0435o0 o0Var) {
            return CoordinatorLayout.this.X(o0Var);
        }
    }

    public static abstract class b {
        public b() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4, int i5) {
            if (i5 == 0) {
                return z(coordinatorLayout, view, view2, view3, i4);
            }
            return false;
        }

        public void B(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i4) {
            if (i4 == 0) {
                B(coordinatorLayout, view, view2);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view) {
            if (d(coordinatorLayout, view) > 0.0f) {
                return true;
            }
            return false;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public C0435o0 f(CoordinatorLayout coordinatorLayout, View view, C0435o0 o0Var) {
            return o0Var;
        }

        public void g(e eVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6, int i7) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, View view, View view2, float f4, float f5, boolean z3) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f4, float f5) {
            return false;
        }

        public void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int[] iArr, int i6) {
            if (i6 == 0) {
                p(coordinatorLayout, view, view2, i4, i5, iArr);
            }
        }

        public void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int i6, int i7) {
        }

        public void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int i6, int i7, int i8) {
            if (i8 == 0) {
                r(coordinatorLayout, view, view2, i4, i5, i6, i7);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
            iArr[0] = iArr[0] + i6;
            iArr[1] = iArr[1] + i7;
            s(coordinatorLayout, view, view2, i4, i5, i6, i7, i8);
        }

        public void u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4) {
        }

        public void v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4, int i5) {
            if (i5 == 0) {
                u(coordinatorLayout, view, view2, view3, i4);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z3) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4) {
            return false;
        }

        public b(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface c {
        Class value();
    }

    private class d implements ViewGroup.OnHierarchyChangeListener {
        d() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f4705q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f4705q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    class f implements ViewTreeObserver.OnPreDrawListener {
        f() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.H(0);
            return true;
        }
    }

    static class h implements Comparator {
        h() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float M3 = P.M(view);
            float M4 = P.M(view2);
            if (M3 > M4) {
                return -1;
            }
            if (M3 < M4) {
                return 1;
            }
            return 0;
        }
    }

    static {
        String str;
        Package packageR = CoordinatorLayout.class.getPackage();
        if (packageR != null) {
            str = packageR.getName();
        } else {
            str = null;
        }
        f4684t = str;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, F.a.f401a);
    }

    private void B(View view, int i4) {
        e eVar = (e) view.getLayoutParams();
        Rect a4 = a();
        a4.set(getPaddingLeft() + eVar.leftMargin, getPaddingTop() + eVar.topMargin, (getWidth() - getPaddingRight()) - eVar.rightMargin, (getHeight() - getPaddingBottom()) - eVar.bottomMargin);
        if (this.f4702n != null && P.y(this) && !P.y(view)) {
            a4.left += this.f4702n.i();
            a4.top += this.f4702n.k();
            a4.right -= this.f4702n.j();
            a4.bottom -= this.f4702n.h();
        }
        Rect a5 = a();
        C0434o.a(T(eVar.f4712c), view.getMeasuredWidth(), view.getMeasuredHeight(), a4, a5, i4);
        view.layout(a5.left, a5.top, a5.right, a5.bottom);
        P(a4);
        P(a5);
    }

    private void C(View view, View view2, int i4) {
        Rect a4 = a();
        Rect a5 = a();
        try {
            s(view2, a4);
            t(view, i4, a4, a5);
            view.layout(a5.left, a5.top, a5.right, a5.bottom);
        } finally {
            P(a4);
            P(a5);
        }
    }

    private void D(View view, int i4, int i5) {
        int i6;
        e eVar = (e) view.getLayoutParams();
        int b4 = C0434o.b(U(eVar.f4712c), i5);
        int i7 = b4 & 7;
        int i8 = b4 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i5 == 1) {
            i4 = width - i4;
        }
        int v3 = v(i4) - measuredWidth;
        if (i7 == 1) {
            v3 += measuredWidth / 2;
        } else if (i7 == 5) {
            v3 += measuredWidth;
        }
        if (i8 == 16) {
            i6 = measuredHeight / 2;
        } else if (i8 != 80) {
            i6 = 0;
        } else {
            i6 = measuredHeight;
        }
        int max = Math.max(getPaddingLeft() + eVar.leftMargin, Math.min(v3, ((width - getPaddingRight()) - measuredWidth) - eVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + eVar.topMargin, Math.min(i6, ((height - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private MotionEvent E(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        return obtain;
    }

    private void F(View view, Rect rect, int i4) {
        boolean z3;
        boolean z4;
        int width;
        int i5;
        int i6;
        int i7;
        int height;
        int i8;
        int i9;
        int i10;
        if (P.S(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            e eVar = (e) view.getLayoutParams();
            b e4 = eVar.e();
            Rect a4 = a();
            Rect a5 = a();
            a5.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (e4 == null || !e4.b(this, view, a4)) {
                a4.set(a5);
            } else if (!a5.contains(a4)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a4.toShortString() + " | Bounds:" + a5.toShortString());
            }
            P(a5);
            if (a4.isEmpty()) {
                P(a4);
                return;
            }
            int b4 = C0434o.b(eVar.f4717h, i4);
            boolean z5 = true;
            if ((b4 & 48) != 48 || (i9 = (a4.top - eVar.topMargin) - eVar.f4719j) >= (i10 = rect.top)) {
                z3 = false;
            } else {
                W(view, i10 - i9);
                z3 = true;
            }
            if ((b4 & 80) == 80 && (height = ((getHeight() - a4.bottom) - eVar.bottomMargin) + eVar.f4719j) < (i8 = rect.bottom)) {
                W(view, height - i8);
                z3 = true;
            }
            if (!z3) {
                W(view, 0);
            }
            if ((b4 & 3) != 3 || (i6 = (a4.left - eVar.leftMargin) - eVar.f4718i) >= (i7 = rect.left)) {
                z4 = false;
            } else {
                V(view, i7 - i6);
                z4 = true;
            }
            if ((b4 & 5) != 5 || (width = ((getWidth() - a4.right) - eVar.rightMargin) + eVar.f4718i) >= (i5 = rect.right)) {
                z5 = z4;
            } else {
                V(view, width - i5);
            }
            if (!z5) {
                V(view, 0);
            }
            P(a4);
        }
    }

    static b K(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f4684t;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f4686v;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f4685u);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (b) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e4) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e4);
        }
    }

    private boolean L(b bVar, View view, MotionEvent motionEvent, int i4) {
        if (i4 == 0) {
            return bVar.k(this, view, motionEvent);
        }
        if (i4 == 1) {
            return bVar.D(this, view, motionEvent);
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        r6 = L(r10, r8, r14, r15);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean M(android.view.MotionEvent r14, int r15) {
        /*
            r13 = this;
            int r0 = r14.getActionMasked()
            java.util.List r1 = r13.f4691c
            r13.y(r1)
            int r2 = r1.size()
            r3 = 0
            r4 = 0
            r5 = r3
            r6 = r5
            r7 = r6
        L_0x0012:
            if (r5 >= r2) goto L_0x0082
            java.lang.Object r8 = r1.get(r5)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r9 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r9
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r10 = r9.e()
            if (r6 != 0) goto L_0x0028
            if (r7 == 0) goto L_0x0036
        L_0x0028:
            if (r0 == 0) goto L_0x0036
            if (r10 == 0) goto L_0x007f
            if (r4 != 0) goto L_0x0032
            android.view.MotionEvent r4 = r13.E(r14)
        L_0x0032:
            r13.L(r10, r8, r4, r15)
            goto L_0x007f
        L_0x0036:
            r11 = 1
            if (r7 != 0) goto L_0x006b
            if (r6 != 0) goto L_0x006b
            if (r10 == 0) goto L_0x006b
            boolean r6 = r13.L(r10, r8, r14, r15)
            if (r6 == 0) goto L_0x006b
            r13.f4698j = r8
            r7 = 3
            if (r0 == r7) goto L_0x006b
            if (r0 == r11) goto L_0x006b
            r7 = r3
        L_0x004b:
            if (r7 >= r5) goto L_0x006b
            java.lang.Object r10 = r1.get(r7)
            android.view.View r10 = (android.view.View) r10
            android.view.ViewGroup$LayoutParams r12 = r10.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r12 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r12
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r12 = r12.e()
            if (r12 == 0) goto L_0x0068
            if (r4 != 0) goto L_0x0065
            android.view.MotionEvent r4 = r13.E(r14)
        L_0x0065:
            r13.L(r12, r10, r4, r15)
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x004b
        L_0x006b:
            boolean r7 = r9.c()
            boolean r8 = r9.h(r13, r8)
            if (r8 == 0) goto L_0x0079
            if (r7 != 0) goto L_0x0079
            r7 = r11
            goto L_0x007a
        L_0x0079:
            r7 = r3
        L_0x007a:
            if (r8 == 0) goto L_0x007f
            if (r7 != 0) goto L_0x007f
            goto L_0x0082
        L_0x007f:
            int r5 = r5 + 1
            goto L_0x0012
        L_0x0082:
            r1.clear()
            if (r4 == 0) goto L_0x008a
            r4.recycle()
        L_0x008a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.M(android.view.MotionEvent, int):boolean");
    }

    private void N() {
        this.f4689a.clear();
        this.f4690b.c();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            e x3 = x(childAt);
            x3.d(this, childAt);
            this.f4690b.b(childAt);
            for (int i5 = 0; i5 < childCount; i5++) {
                if (i5 != i4) {
                    View childAt2 = getChildAt(i5);
                    if (x3.b(this, childAt, childAt2)) {
                        if (!this.f4690b.d(childAt2)) {
                            this.f4690b.b(childAt2);
                        }
                        this.f4690b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f4689a.addAll(this.f4690b.h());
        Collections.reverse(this.f4689a);
    }

    private static void P(Rect rect) {
        rect.setEmpty();
        f4688x.a(rect);
    }

    private void R() {
        View view = this.f4698j;
        if (view != null) {
            b e4 = ((e) view.getLayoutParams()).e();
            if (e4 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                e4.D(this, this.f4698j, obtain);
                obtain.recycle();
            }
            this.f4698j = null;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ((e) getChildAt(i4).getLayoutParams()).l();
        }
        this.f4695g = false;
    }

    private static int S(int i4) {
        if (i4 == 0) {
            return 17;
        }
        return i4;
    }

    private static int T(int i4) {
        if ((i4 & 7) == 0) {
            i4 |= 8388611;
        }
        return (i4 & 112) == 0 ? i4 | 48 : i4;
    }

    private static int U(int i4) {
        if (i4 == 0) {
            return 8388661;
        }
        return i4;
    }

    private void V(View view, int i4) {
        e eVar = (e) view.getLayoutParams();
        int i5 = eVar.f4718i;
        if (i5 != i4) {
            P.Y(view, i4 - i5);
            eVar.f4718i = i4;
        }
    }

    private void W(View view, int i4) {
        e eVar = (e) view.getLayoutParams();
        int i5 = eVar.f4719j;
        if (i5 != i4) {
            P.Z(view, i4 - i5);
            eVar.f4719j = i4;
        }
    }

    private void Y() {
        if (P.y(this)) {
            if (this.f4706r == null) {
                this.f4706r = new a();
            }
            P.C0(this, this.f4706r);
            setSystemUiVisibility(1280);
            return;
        }
        P.C0(this, (C) null);
    }

    private static Rect a() {
        Rect rect = (Rect) f4688x.b();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    private void c() {
        int childCount = getChildCount();
        MotionEvent motionEvent = null;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            b e4 = ((e) childAt.getLayoutParams()).e();
            if (e4 != null) {
                if (motionEvent == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                e4.k(this, childAt, motionEvent);
            }
        }
        if (motionEvent != null) {
            motionEvent.recycle();
        }
    }

    private static int d(int i4, int i5, int i6) {
        if (i4 < i5) {
            return i5;
        }
        return i4 > i6 ? i6 : i4;
    }

    private void e(e eVar, Rect rect, int i4, int i5) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + eVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i4) - eVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + eVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i5) - eVar.bottomMargin));
        rect.set(max, max2, i4 + max, i5 + max2);
    }

    private C0435o0 f(C0435o0 o0Var) {
        b e4;
        if (o0Var.n()) {
            return o0Var;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (P.y(childAt) && (e4 = ((e) childAt.getLayoutParams()).e()) != null) {
                o0Var = e4.f(this, childAt, o0Var);
                if (o0Var.n()) {
                    break;
                }
            }
        }
        return o0Var;
    }

    private void u(int i4, Rect rect, Rect rect2, e eVar, int i5, int i6) {
        int i7;
        int i8;
        int b4 = C0434o.b(S(eVar.f4712c), i4);
        int b5 = C0434o.b(T(eVar.f4713d), i4);
        int i9 = b4 & 7;
        int i10 = b4 & 112;
        int i11 = b5 & 7;
        int i12 = b5 & 112;
        if (i11 == 1) {
            i7 = rect.left + (rect.width() / 2);
        } else if (i11 != 5) {
            i7 = rect.left;
        } else {
            i7 = rect.right;
        }
        if (i12 == 16) {
            i8 = rect.top + (rect.height() / 2);
        } else if (i12 != 80) {
            i8 = rect.top;
        } else {
            i8 = rect.bottom;
        }
        if (i9 == 1) {
            i7 -= i5 / 2;
        } else if (i9 != 5) {
            i7 -= i5;
        }
        if (i10 == 16) {
            i8 -= i6 / 2;
        } else if (i10 != 80) {
            i8 -= i6;
        }
        rect2.set(i7, i8, i5 + i7, i6 + i8);
    }

    private int v(int i4) {
        int[] iArr = this.f4697i;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i4);
            return 0;
        } else if (i4 >= 0 && i4 < iArr.length) {
            return iArr[i4];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i4 + " out of range for " + this);
            return 0;
        }
    }

    private void y(List list) {
        int i4;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            if (isChildrenDrawingOrderEnabled) {
                i4 = getChildDrawingOrder(childCount, i5);
            } else {
                i4 = i5;
            }
            list.add(getChildAt(i4));
        }
        Comparator comparator = f4687w;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean z(View view) {
        return this.f4690b.i(view);
    }

    public boolean A(View view, int i4, int i5) {
        Rect a4 = a();
        s(view, a4);
        try {
            return a4.contains(i4, i5);
        } finally {
            P(a4);
        }
    }

    /* access modifiers changed from: package-private */
    public void G(View view, int i4) {
        b e4;
        View view2 = view;
        e eVar = (e) view.getLayoutParams();
        if (eVar.f4720k != null) {
            Rect a4 = a();
            Rect a5 = a();
            Rect a6 = a();
            s(eVar.f4720k, a4);
            boolean z3 = false;
            q(view2, false, a5);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            u(i4, a4, a6, eVar, measuredWidth, measuredHeight);
            if (!(a6.left == a5.left && a6.top == a5.top)) {
                z3 = true;
            }
            e(eVar, a6, measuredWidth, measuredHeight);
            int i5 = a6.left - a5.left;
            int i6 = a6.top - a5.top;
            if (i5 != 0) {
                P.Y(view2, i5);
            }
            if (i6 != 0) {
                P.Z(view2, i6);
            }
            if (z3 && (e4 = eVar.e()) != null) {
                e4.h(this, view2, eVar.f4720k);
            }
            P(a4);
            P(a5);
            P(a6);
        }
    }

    /* access modifiers changed from: package-private */
    public final void H(int i4) {
        boolean z3;
        int i5 = i4;
        int B3 = P.B(this);
        int size = this.f4689a.size();
        Rect a4 = a();
        Rect a5 = a();
        Rect a6 = a();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) this.f4689a.get(i6);
            e eVar = (e) view.getLayoutParams();
            if (i5 != 0 || view.getVisibility() != 8) {
                for (int i7 = 0; i7 < i6; i7++) {
                    if (eVar.f4721l == ((View) this.f4689a.get(i7))) {
                        G(view, B3);
                    }
                }
                q(view, true, a5);
                if (eVar.f4716g != 0 && !a5.isEmpty()) {
                    int b4 = C0434o.b(eVar.f4716g, B3);
                    int i8 = b4 & 112;
                    if (i8 == 48) {
                        a4.top = Math.max(a4.top, a5.bottom);
                    } else if (i8 == 80) {
                        a4.bottom = Math.max(a4.bottom, getHeight() - a5.top);
                    }
                    int i9 = b4 & 7;
                    if (i9 == 3) {
                        a4.left = Math.max(a4.left, a5.right);
                    } else if (i9 == 5) {
                        a4.right = Math.max(a4.right, getWidth() - a5.left);
                    }
                }
                if (eVar.f4717h != 0 && view.getVisibility() == 0) {
                    F(view, a4, B3);
                }
                if (i5 != 2) {
                    w(view, a6);
                    if (!a6.equals(a5)) {
                        O(view, a5);
                    }
                }
                for (int i10 = i6 + 1; i10 < size; i10++) {
                    View view2 = (View) this.f4689a.get(i10);
                    e eVar2 = (e) view2.getLayoutParams();
                    b e4 = eVar2.e();
                    if (e4 != null && e4.e(this, view2, view)) {
                        if (i5 != 0 || !eVar2.f()) {
                            if (i5 != 2) {
                                z3 = e4.h(this, view2, view);
                            } else {
                                e4.i(this, view2, view);
                                z3 = true;
                            }
                            if (i5 == 1) {
                                eVar2.o(z3);
                            }
                        } else {
                            eVar2.j();
                        }
                    }
                }
            }
        }
        P(a4);
        P(a5);
        P(a6);
    }

    public void I(View view, int i4) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.a()) {
            View view2 = eVar.f4720k;
            if (view2 != null) {
                C(view, view2, i4);
                return;
            }
            int i5 = eVar.f4714e;
            if (i5 >= 0) {
                D(view, i5, i4);
            } else {
                B(view, i4);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    public void J(View view, int i4, int i5, int i6, int i7) {
        measureChildWithMargins(view, i4, i5, i6, i7);
    }

    /* access modifiers changed from: package-private */
    public void O(View view, Rect rect) {
        ((e) view.getLayoutParams()).p(rect);
    }

    /* access modifiers changed from: package-private */
    public void Q() {
        if (this.f4696h && this.f4700l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f4700l);
        }
        this.f4701m = false;
    }

    /* access modifiers changed from: package-private */
    public final C0435o0 X(C0435o0 o0Var) {
        boolean z3;
        if (androidx.core.util.c.a(this.f4702n, o0Var)) {
            return o0Var;
        }
        this.f4702n = o0Var;
        boolean z4 = false;
        if (o0Var == null || o0Var.k() <= 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f4703o = z3;
        if (!z3 && getBackground() == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        C0435o0 f4 = f(o0Var);
        requestLayout();
        return f4;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.f4696h) {
            if (this.f4700l == null) {
                this.f4700l = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f4700l);
        }
        this.f4701m = true;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof e) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j4) {
        e eVar = (e) view.getLayoutParams();
        b bVar = eVar.f4710a;
        if (bVar != null) {
            float d4 = bVar.d(this, view);
            if (d4 > 0.0f) {
                if (this.f4692d == null) {
                    this.f4692d = new Paint();
                }
                this.f4692d.setColor(eVar.f4710a.c(this, view));
                this.f4692d.setAlpha(d(Math.round(d4 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f4692d);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j4);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        boolean z3;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f4704p;
        if (drawable == null || !drawable.isStateful()) {
            z3 = false;
        } else {
            z3 = drawable.setState(drawableState);
        }
        if (z3) {
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        int childCount = getChildCount();
        boolean z3 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                break;
            } else if (z(getChildAt(i4))) {
                z3 = true;
                break;
            } else {
                i4++;
            }
        }
        if (z3 == this.f4701m) {
            return;
        }
        if (z3) {
            b();
        } else {
            Q();
        }
    }

    /* access modifiers changed from: package-private */
    public final List<View> getDependencySortedChildren() {
        N();
        return Collections.unmodifiableList(this.f4689a);
    }

    public final C0435o0 getLastWindowInsets() {
        return this.f4702n;
    }

    public int getNestedScrollAxes() {
        return this.f4707s.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f4704p;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void h(View view, View view2, int i4, int i5) {
        b e4;
        this.f4707s.c(view, view2, i4, i5);
        this.f4699k = view2;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.i(i5) && (e4 = eVar.e()) != null) {
                e4.v(this, childAt, view, view2, i4, i5);
            }
        }
    }

    public void i(View view, int i4) {
        this.f4707s.d(view, i4);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.i(i4)) {
                b e4 = eVar.e();
                if (e4 != null) {
                    e4.C(this, childAt, view, i4);
                }
                eVar.k(i4);
                eVar.j();
            }
        }
        this.f4699k = null;
    }

    public void j(View view, int i4, int i5, int[] iArr, int i6) {
        b e4;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z3 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                int i10 = i6;
            } else {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.i(i6) && (e4 = eVar.e()) != null) {
                    int[] iArr2 = this.f4693e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    e4.q(this, childAt, view, i4, i5, iArr2, i6);
                    if (i4 > 0) {
                        min = Math.max(i7, this.f4693e[0]);
                    } else {
                        min = Math.min(i7, this.f4693e[0]);
                    }
                    i7 = min;
                    if (i5 > 0) {
                        min2 = Math.max(i8, this.f4693e[1]);
                    } else {
                        min2 = Math.min(i8, this.f4693e[1]);
                    }
                    i8 = min2;
                    z3 = true;
                }
            }
        }
        iArr[0] = i7;
        iArr[1] = i8;
        if (z3) {
            H(1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    /* renamed from: l */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void m(View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        b e4;
        int min;
        boolean z3;
        int min2;
        int childCount = getChildCount();
        boolean z4 = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.i(i8) && (e4 = eVar.e()) != null) {
                    int[] iArr2 = this.f4693e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    e4.t(this, childAt, view, i4, i5, i6, i7, i8, iArr2);
                    if (i6 > 0) {
                        min = Math.max(i9, this.f4693e[0]);
                    } else {
                        min = Math.min(i9, this.f4693e[0]);
                    }
                    i9 = min;
                    if (i7 > 0) {
                        z3 = true;
                        min2 = Math.max(i10, this.f4693e[1]);
                    } else {
                        z3 = true;
                        min2 = Math.min(i10, this.f4693e[1]);
                    }
                    i10 = min2;
                    z4 = z3;
                }
            }
        }
        iArr[0] = iArr[0] + i9;
        iArr[1] = iArr[1] + i10;
        if (z4) {
            H(1);
        }
    }

    public void n(View view, int i4, int i5, int i6, int i7, int i8) {
        m(view, i4, i5, i6, i7, 0, this.f4694f);
    }

    public boolean o(View view, View view2, int i4, int i5) {
        int i6 = i5;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                b e4 = eVar.e();
                if (e4 != null) {
                    boolean A3 = e4.A(this, childAt, view, view2, i4, i5);
                    z3 |= A3;
                    eVar.q(i6, A3);
                } else {
                    eVar.q(i6, false);
                }
            }
        }
        return z3;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        R();
        if (this.f4701m) {
            if (this.f4700l == null) {
                this.f4700l = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f4700l);
        }
        if (this.f4702n == null && P.y(this)) {
            P.l0(this);
        }
        this.f4696h = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        R();
        if (this.f4701m && this.f4700l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f4700l);
        }
        View view = this.f4699k;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f4696h = false;
    }

    public void onDraw(Canvas canvas) {
        int i4;
        super.onDraw(canvas);
        if (this.f4703o && this.f4704p != null) {
            C0435o0 o0Var = this.f4702n;
            if (o0Var != null) {
                i4 = o0Var.k();
            } else {
                i4 = 0;
            }
            if (i4 > 0) {
                this.f4704p.setBounds(0, 0, getWidth(), i4);
                this.f4704p.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            R();
        }
        boolean M3 = M(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.f4698j = null;
            R();
        }
        return M3;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        b e4;
        int B3 = P.B(this);
        int size = this.f4689a.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view = (View) this.f4689a.get(i8);
            if (view.getVisibility() != 8 && ((e4 = ((e) view.getLayoutParams()).e()) == null || !e4.l(this, view, B3))) {
                I(view, B3);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011c, code lost:
        if (r0.m(r30, r20, r11, r21, r23, 0) == false) goto L_0x012c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.N()
            r30.g()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = androidx.core.view.P.B(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = r2
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            androidx.core.view.o0 r3 = r7.f4702n
            if (r3 == 0) goto L_0x004b
            boolean r3 = androidx.core.view.P.y(r30)
            if (r3 == 0) goto L_0x004b
            r19 = r2
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List r2 = r7.f4689a
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x0057:
            if (r3 >= r6) goto L_0x0171
            java.util.List r0 = r7.f4689a
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0073
            r22 = r3
            r29 = r6
            r28 = r8
            goto L_0x0169
        L_0x0073:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r1
            int r0 = r1.f4714e
            if (r0 < 0) goto L_0x00bc
            if (r13 == 0) goto L_0x00bc
            int r0 = r7.v(r0)
            int r11 = r1.f4712c
            int r11 = U(r11)
            int r11 = androidx.core.view.C0434o.b(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0097
            if (r12 == 0) goto L_0x009c
        L_0x0097:
            r2 = 5
            if (r11 != r2) goto L_0x00a8
            if (r12 == 0) goto L_0x00a8
        L_0x009c:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r11 = r0
            r21 = r2
            goto L_0x00c1
        L_0x00a8:
            if (r11 != r2) goto L_0x00ac
            if (r12 == 0) goto L_0x00b1
        L_0x00ac:
            r2 = 3
            if (r11 != r2) goto L_0x00ba
            if (r12 == 0) goto L_0x00ba
        L_0x00b1:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00c1
        L_0x00ba:
            r11 = 0
            goto L_0x00bf
        L_0x00bc:
            r22 = r2
            goto L_0x00ba
        L_0x00bf:
            r21 = r11
        L_0x00c1:
            if (r19 == 0) goto L_0x00f3
            boolean r0 = androidx.core.view.P.y(r20)
            if (r0 != 0) goto L_0x00f3
            androidx.core.view.o0 r0 = r7.f4702n
            int r0 = r0.i()
            androidx.core.view.o0 r2 = r7.f4702n
            int r2 = r2.j()
            int r0 = r0 + r2
            androidx.core.view.o0 r2 = r7.f4702n
            int r2 = r2.k()
            androidx.core.view.o0 r11 = r7.f4702n
            int r11 = r11.h()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f7
        L_0x00f3:
            r11 = r31
            r23 = r32
        L_0x00f7:
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r0 = r1.e()
            if (r0 == 0) goto L_0x011f
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r11
            r27 = r4
            r4 = r21
            r28 = r8
            r8 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.m(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0139
            goto L_0x012c
        L_0x011f:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r8
            r25 = r22
            r22 = r3
            r8 = r5
        L_0x012c:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.J(r1, r2, r3, r4, r5)
        L_0x0139:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r8, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r25
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r5 = r0
            r4 = r1
        L_0x0169:
            int r3 = r22 + 1
            r8 = r28
            r6 = r29
            goto L_0x0057
        L_0x0171:
            r11 = r2
            r1 = r4
            r8 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r8, r2, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f4, float f5, boolean z3) {
        b e4;
        int childCount = getChildCount();
        boolean z4 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.i(0) && (e4 = eVar.e()) != null) {
                    z4 |= e4.n(this, childAt, view, f4, f5, z3);
                }
            }
        }
        if (z4) {
            H(1);
        }
        return z4;
    }

    public boolean onNestedPreFling(View view, float f4, float f5) {
        b e4;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.i(0) && (e4 = eVar.e()) != null) {
                    z3 |= e4.o(this, childAt, view, f4, f5);
                }
            }
        }
        return z3;
    }

    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        j(view, i4, i5, iArr, 0);
    }

    public void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        n(view, i4, i5, i6, i7, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i4) {
        h(view, view2, i4, 0);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.t());
        SparseArray sparseArray = gVar.f4729c;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id = childAt.getId();
            b e4 = x(childAt).e();
            if (!(id == -1 || e4 == null || (parcelable2 = (Parcelable) sparseArray.get(id)) == null)) {
                e4.x(this, childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable y3;
        g gVar = new g(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id = childAt.getId();
            b e4 = ((e) childAt.getLayoutParams()).e();
            if (!(id == -1 || e4 == null || (y3 = e4.y(this, childAt)) == null)) {
                sparseArray.append(id, y3);
            }
        }
        gVar.f4729c = sparseArray;
        return gVar;
    }

    public boolean onStartNestedScroll(View view, View view2, int i4) {
        return o(view, view2, i4, 0);
    }

    public void onStopNestedScroll(View view) {
        i(view, 0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.f4698j;
        boolean z4 = false;
        if (view != null) {
            b e4 = ((e) view.getLayoutParams()).e();
            z3 = e4 != null ? e4.D(this, this.f4698j, motionEvent) : false;
        } else {
            z3 = M(motionEvent, 1);
            if (actionMasked != 0 && z3) {
                z4 = true;
            }
        }
        if (this.f4698j == null || actionMasked == 3) {
            z3 |= super.onTouchEvent(motionEvent);
        } else if (z4) {
            MotionEvent E3 = E(motionEvent);
            super.onTouchEvent(E3);
            E3.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f4698j = null;
            R();
        }
        return z3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void q(View view, boolean z3, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z3) {
            s(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List r(View view) {
        List g4 = this.f4690b.g(view);
        if (g4 == null) {
            return Collections.emptyList();
        }
        return g4;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        b e4 = ((e) view.getLayoutParams()).e();
        if (e4 == null || !e4.w(this, view, rect, z3)) {
            return super.requestChildRectangleOnScreen(view, rect, z3);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z3) {
        super.requestDisallowInterceptTouchEvent(z3);
        if (z3 && !this.f4695g) {
            if (this.f4698j == null) {
                c();
            }
            R();
            this.f4695g = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void s(View view, Rect rect) {
        b.a(this, view, rect);
    }

    public void setFitsSystemWindows(boolean z3) {
        super.setFitsSystemWindows(z3);
        Y();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f4705q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z3;
        Drawable drawable2 = this.f4704p;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f4704p = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f4704p.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.f4704p, P.B(this));
                Drawable drawable4 = this.f4704p;
                if (getVisibility() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                drawable4.setVisible(z3, false);
                this.f4704p.setCallback(this);
            }
            P.f0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i4) {
        setStatusBarBackground(new ColorDrawable(i4));
    }

    public void setStatusBarBackgroundResource(int i4) {
        Drawable drawable;
        if (i4 != 0) {
            drawable = androidx.core.content.a.d(getContext(), i4);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    public void setVisibility(int i4) {
        boolean z3;
        super.setVisibility(i4);
        if (i4 == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Drawable drawable = this.f4704p;
        if (drawable != null && drawable.isVisible() != z3) {
            this.f4704p.setVisible(z3, false);
        }
    }

    /* access modifiers changed from: package-private */
    public void t(View view, int i4, Rect rect, Rect rect2) {
        e eVar = (e) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        u(i4, rect, rect2, eVar, measuredWidth, measuredHeight);
        e(eVar, rect2, measuredWidth, measuredHeight);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f4704p) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void w(View view, Rect rect) {
        rect.set(((e) view.getLayoutParams()).g());
    }

    /* access modifiers changed from: package-private */
    public e x(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f4711b) {
            c cVar = null;
            for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                cVar = (c) cls.getAnnotation(c.class);
                if (cVar != null) {
                    break;
                }
            }
            if (cVar != null) {
                try {
                    eVar.n((b) cVar.value().getDeclaredConstructor((Class[]) null).newInstance((Object[]) null));
                } catch (Exception e4) {
                    Log.e("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e4);
                }
            }
            eVar.f4711b = true;
        }
        return eVar;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        TypedArray typedArray;
        this.f4689a = new ArrayList();
        this.f4690b = new a();
        this.f4691c = new ArrayList();
        this.f4693e = new int[2];
        this.f4694f = new int[2];
        this.f4707s = new B(this);
        if (i4 == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, F.c.f403a, 0, F.b.f402a);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, F.c.f403a, i4, 0);
        }
        if (i4 == 0) {
            P.m0(this, context, F.c.f403a, attributeSet, typedArray, 0, F.b.f402a);
        } else {
            P.m0(this, context, F.c.f403a, attributeSet, typedArray, i4, 0);
        }
        int resourceId = typedArray.getResourceId(F.c.f404b, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f4697i = resources.getIntArray(resourceId);
            float f4 = resources.getDisplayMetrics().density;
            int length = this.f4697i.length;
            for (int i5 = 0; i5 < length; i5++) {
                int[] iArr = this.f4697i;
                iArr[i5] = (int) (((float) iArr[i5]) * f4);
            }
        }
        this.f4704p = typedArray.getDrawable(F.c.f405c);
        typedArray.recycle();
        Y();
        super.setOnHierarchyChangeListener(new d());
        if (P.z(this) == 0) {
            P.y0(this, 1);
        }
    }

    protected static class g extends M.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        SparseArray f4729c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            /* renamed from: c */
            public g[] newArray(int i4) {
                return new g[i4];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f4729c = new SparseArray(readInt);
            for (int i4 = 0; i4 < readInt; i4++) {
                this.f4729c.append(iArr[i4], readParcelableArray[i4]);
            }
        }

        public void writeToParcel(Parcel parcel, int i4) {
            int i5;
            super.writeToParcel(parcel, i4);
            SparseArray sparseArray = this.f4729c;
            if (sparseArray != null) {
                i5 = sparseArray.size();
            } else {
                i5 = 0;
            }
            parcel.writeInt(i5);
            int[] iArr = new int[i5];
            Parcelable[] parcelableArr = new Parcelable[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                iArr[i6] = this.f4729c.keyAt(i6);
                parcelableArr[i6] = (Parcelable) this.f4729c.valueAt(i6);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i4);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        b f4710a;

        /* renamed from: b  reason: collision with root package name */
        boolean f4711b = false;

        /* renamed from: c  reason: collision with root package name */
        public int f4712c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f4713d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f4714e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f4715f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f4716g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f4717h = 0;

        /* renamed from: i  reason: collision with root package name */
        int f4718i;

        /* renamed from: j  reason: collision with root package name */
        int f4719j;

        /* renamed from: k  reason: collision with root package name */
        View f4720k;

        /* renamed from: l  reason: collision with root package name */
        View f4721l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f4722m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f4723n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f4724o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f4725p;

        /* renamed from: q  reason: collision with root package name */
        final Rect f4726q = new Rect();

        /* renamed from: r  reason: collision with root package name */
        Object f4727r;

        public e(int i4, int i5) {
            super(i4, i5);
        }

        private void m(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f4715f);
            this.f4720k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    ViewParent parent = findViewById.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.f4721l = null;
                            this.f4720k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f4721l = findViewById;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.f4721l = null;
                    this.f4720k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.f4721l = null;
                this.f4720k = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f4715f) + " to anchor view " + view);
            }
        }

        private boolean r(View view, int i4) {
            int b4 = C0434o.b(((e) view.getLayoutParams()).f4716g, i4);
            if (b4 == 0 || (C0434o.b(this.f4717h, i4) & b4) != b4) {
                return false;
            }
            return true;
        }

        private boolean s(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f4720k.getId() != this.f4715f) {
                return false;
            }
            View view2 = this.f4720k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f4721l = null;
                    this.f4720k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f4721l = view2;
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            if (this.f4720k != null || this.f4715f == -1) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            b bVar;
            if (view2 == this.f4721l || r(view2, P.B(coordinatorLayout)) || ((bVar = this.f4710a) != null && bVar.e(coordinatorLayout, view, view2))) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            if (this.f4710a == null) {
                this.f4722m = false;
            }
            return this.f4722m;
        }

        /* access modifiers changed from: package-private */
        public View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f4715f == -1) {
                this.f4721l = null;
                this.f4720k = null;
                return null;
            }
            if (this.f4720k == null || !s(view, coordinatorLayout)) {
                m(view, coordinatorLayout);
            }
            return this.f4720k;
        }

        public b e() {
            return this.f4710a;
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return this.f4725p;
        }

        /* access modifiers changed from: package-private */
        public Rect g() {
            return this.f4726q;
        }

        /* access modifiers changed from: package-private */
        public boolean h(CoordinatorLayout coordinatorLayout, View view) {
            boolean z3;
            boolean z4 = this.f4722m;
            if (z4) {
                return true;
            }
            b bVar = this.f4710a;
            if (bVar != null) {
                z3 = bVar.a(coordinatorLayout, view);
            } else {
                z3 = false;
            }
            boolean z5 = z3 | z4;
            this.f4722m = z5;
            return z5;
        }

        /* access modifiers changed from: package-private */
        public boolean i(int i4) {
            if (i4 == 0) {
                return this.f4723n;
            }
            if (i4 != 1) {
                return false;
            }
            return this.f4724o;
        }

        /* access modifiers changed from: package-private */
        public void j() {
            this.f4725p = false;
        }

        /* access modifiers changed from: package-private */
        public void k(int i4) {
            q(i4, false);
        }

        /* access modifiers changed from: package-private */
        public void l() {
            this.f4722m = false;
        }

        public void n(b bVar) {
            b bVar2 = this.f4710a;
            if (bVar2 != bVar) {
                if (bVar2 != null) {
                    bVar2.j();
                }
                this.f4710a = bVar;
                this.f4727r = null;
                this.f4711b = true;
                if (bVar != null) {
                    bVar.g(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void o(boolean z3) {
            this.f4725p = z3;
        }

        /* access modifiers changed from: package-private */
        public void p(Rect rect) {
            this.f4726q.set(rect);
        }

        /* access modifiers changed from: package-private */
        public void q(int i4, boolean z3) {
            if (i4 == 0) {
                this.f4723n = z3;
            } else if (i4 == 1) {
                this.f4724o = z3;
            }
        }

        e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, F.c.f406d);
            this.f4712c = obtainStyledAttributes.getInteger(F.c.f407e, 0);
            this.f4715f = obtainStyledAttributes.getResourceId(F.c.f408f, -1);
            this.f4713d = obtainStyledAttributes.getInteger(F.c.f409g, 0);
            this.f4714e = obtainStyledAttributes.getInteger(F.c.f413k, -1);
            this.f4716g = obtainStyledAttributes.getInt(F.c.f412j, 0);
            this.f4717h = obtainStyledAttributes.getInt(F.c.f411i, 0);
            int i4 = F.c.f410h;
            boolean hasValue = obtainStyledAttributes.hasValue(i4);
            this.f4711b = hasValue;
            if (hasValue) {
                this.f4710a = CoordinatorLayout.K(context, attributeSet, obtainStyledAttributes.getString(i4));
            }
            obtainStyledAttributes.recycle();
            b bVar = this.f4710a;
            if (bVar != null) {
                bVar.g(this);
            }
        }

        public e(e eVar) {
            super(eVar);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
