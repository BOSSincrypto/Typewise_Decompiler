package N;

import N.b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C0402a;
import androidx.core.view.P;
import androidx.core.view.accessibility.A;
import androidx.core.view.accessibility.B;
import androidx.core.view.accessibility.C;
import java.util.ArrayList;
import java.util.List;
import kotlin.uuid.Uuid;
import y.h;

public abstract class a extends C0402a {

    /* renamed from: n  reason: collision with root package name */
    private static final Rect f951n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o  reason: collision with root package name */
    private static final b.a f952o = new C0013a();

    /* renamed from: p  reason: collision with root package name */
    private static final b.C0014b f953p = new b();

    /* renamed from: d  reason: collision with root package name */
    private final Rect f954d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    private final Rect f955e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private final Rect f956f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    private final int[] f957g = new int[2];

    /* renamed from: h  reason: collision with root package name */
    private final AccessibilityManager f958h;

    /* renamed from: i  reason: collision with root package name */
    private final View f959i;

    /* renamed from: j  reason: collision with root package name */
    private c f960j;

    /* renamed from: k  reason: collision with root package name */
    int f961k = Integer.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    int f962l = Integer.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    private int f963m = Integer.MIN_VALUE;

    /* renamed from: N.a$a  reason: collision with other inner class name */
    class C0013a implements b.a {
        C0013a() {
        }

        /* renamed from: b */
        public void a(A a4, Rect rect) {
            a4.l(rect);
        }
    }

    class b implements b.C0014b {
        b() {
        }

        /* renamed from: c */
        public A a(h hVar, int i4) {
            return (A) hVar.p(i4);
        }

        /* renamed from: d */
        public int b(h hVar) {
            return hVar.o();
        }
    }

    private class c extends B {
        c() {
        }

        public A b(int i4) {
            return A.Z(a.this.H(i4));
        }

        public A d(int i4) {
            int i5;
            if (i4 == 2) {
                i5 = a.this.f961k;
            } else {
                i5 = a.this.f962l;
            }
            if (i5 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i5);
        }

        public boolean f(int i4, int i5, Bundle bundle) {
            return a.this.P(i4, i5, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f959i = view;
            this.f958h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (P.z(view) == 0) {
                P.y0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private static Rect D(View view, int i4, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i4 == 17) {
            rect.set(width, 0, width, height);
        } else if (i4 == 33) {
            rect.set(0, height, width, height);
        } else if (i4 == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i4 == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    private boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f959i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f959i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent != null) {
            return true;
        }
        return false;
    }

    private static int F(int i4) {
        if (i4 == 19) {
            return 33;
        }
        if (i4 == 21) {
            return 17;
        }
        if (i4 != 22) {
            return 130;
        }
        return 66;
    }

    private boolean G(int i4, Rect rect) {
        A a4;
        A a5;
        boolean z3;
        h y3 = y();
        int i5 = this.f962l;
        int i6 = Integer.MIN_VALUE;
        if (i5 == Integer.MIN_VALUE) {
            a4 = null;
        } else {
            a4 = (A) y3.i(i5);
        }
        A a6 = a4;
        if (i4 == 1 || i4 == 2) {
            if (P.B(this.f959i) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            a5 = (A) b.d(y3, f953p, f952o, a6, i4, z3, false);
        } else if (i4 == 17 || i4 == 33 || i4 == 66 || i4 == 130) {
            Rect rect2 = new Rect();
            int i7 = this.f962l;
            if (i7 != Integer.MIN_VALUE) {
                z(i7, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f959i, i4, rect2);
            }
            a5 = (A) b.c(y3, f953p, f952o, a6, rect2, i4);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (a5 != null) {
            i6 = y3.l(y3.k(a5));
        }
        return T(i6);
    }

    private boolean Q(int i4, int i5, Bundle bundle) {
        if (i5 == 1) {
            return T(i4);
        }
        if (i5 == 2) {
            return o(i4);
        }
        if (i5 == 64) {
            return S(i4);
        }
        if (i5 != 128) {
            return J(i4, i5, bundle);
        }
        return n(i4);
    }

    private boolean R(int i4, Bundle bundle) {
        return P.d0(this.f959i, i4, bundle);
    }

    private boolean S(int i4) {
        int i5;
        if (!this.f958h.isEnabled() || !this.f958h.isTouchExplorationEnabled() || (i5 = this.f961k) == i4) {
            return false;
        }
        if (i5 != Integer.MIN_VALUE) {
            n(i5);
        }
        this.f961k = i4;
        this.f959i.invalidate();
        U(i4, 32768);
        return true;
    }

    private void V(int i4) {
        int i5 = this.f963m;
        if (i5 != i4) {
            this.f963m = i4;
            U(i4, Uuid.SIZE_BITS);
            U(i5, 256);
        }
    }

    private boolean n(int i4) {
        if (this.f961k != i4) {
            return false;
        }
        this.f961k = Integer.MIN_VALUE;
        this.f959i.invalidate();
        U(i4, 65536);
        return true;
    }

    private boolean p() {
        int i4 = this.f962l;
        if (i4 == Integer.MIN_VALUE || !J(i4, 16, (Bundle) null)) {
            return false;
        }
        return true;
    }

    private AccessibilityEvent q(int i4, int i5) {
        if (i4 != -1) {
            return r(i4, i5);
        }
        return s(i5);
    }

    private AccessibilityEvent r(int i4, int i5) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i5);
        A H3 = H(i4);
        obtain.getText().add(H3.A());
        obtain.setContentDescription(H3.s());
        obtain.setScrollable(H3.S());
        obtain.setPassword(H3.R());
        obtain.setEnabled(H3.L());
        obtain.setChecked(H3.I());
        L(i4, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(H3.p());
            C.c(obtain, this.f959i, i4);
            obtain.setPackageName(this.f959i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    private AccessibilityEvent s(int i4) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i4);
        this.f959i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private A t(int i4) {
        boolean z3;
        A X3 = A.X();
        X3.o0(true);
        X3.q0(true);
        X3.j0("android.view.View");
        Rect rect = f951n;
        X3.f0(rect);
        X3.g0(rect);
        X3.y0(this.f959i);
        N(i4, X3);
        if (X3.A() == null && X3.s() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        X3.l(this.f955e);
        if (!this.f955e.equals(rect)) {
            int j4 = X3.j();
            if ((j4 & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((j4 & Uuid.SIZE_BITS) == 0) {
                X3.w0(this.f959i.getContext().getPackageName());
                X3.D0(this.f959i, i4);
                if (this.f961k == i4) {
                    X3.d0(true);
                    X3.a(Uuid.SIZE_BITS);
                } else {
                    X3.d0(false);
                    X3.a(64);
                }
                if (this.f962l == i4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    X3.a(2);
                } else if (X3.M()) {
                    X3.a(1);
                }
                X3.r0(z3);
                this.f959i.getLocationOnScreen(this.f957g);
                X3.m(this.f954d);
                if (this.f954d.equals(rect)) {
                    X3.l(this.f954d);
                    if (X3.f5218b != -1) {
                        A X4 = A.X();
                        for (int i5 = X3.f5218b; i5 != -1; i5 = X4.f5218b) {
                            X4.z0(this.f959i, -1);
                            X4.f0(f951n);
                            N(i5, X4);
                            X4.l(this.f955e);
                            Rect rect2 = this.f954d;
                            Rect rect3 = this.f955e;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        X4.b0();
                    }
                    this.f954d.offset(this.f957g[0] - this.f959i.getScrollX(), this.f957g[1] - this.f959i.getScrollY());
                }
                if (this.f959i.getLocalVisibleRect(this.f956f)) {
                    this.f956f.offset(this.f957g[0] - this.f959i.getScrollX(), this.f957g[1] - this.f959i.getScrollY());
                    if (this.f954d.intersect(this.f956f)) {
                        X3.g0(this.f954d);
                        if (E(this.f954d)) {
                            X3.H0(true);
                        }
                    }
                }
                return X3;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    private A u() {
        A Y3 = A.Y(this.f959i);
        P.b0(this.f959i, Y3);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (Y3.o() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                Y3.c(this.f959i, ((Integer) arrayList.get(i4)).intValue());
            }
            return Y3;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    private h y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        h hVar = new h();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            hVar.n(((Integer) arrayList.get(i4)).intValue(), t(((Integer) arrayList.get(i4)).intValue()));
        }
        return hVar;
    }

    private void z(int i4, Rect rect) {
        H(i4).l(rect);
    }

    public final int A() {
        return this.f962l;
    }

    /* access modifiers changed from: protected */
    public abstract int B(float f4, float f5);

    /* access modifiers changed from: protected */
    public abstract void C(List list);

    /* access modifiers changed from: package-private */
    public A H(int i4) {
        if (i4 == -1) {
            return u();
        }
        return t(i4);
    }

    public final void I(boolean z3, int i4, Rect rect) {
        int i5 = this.f962l;
        if (i5 != Integer.MIN_VALUE) {
            o(i5);
        }
        if (z3) {
            G(i4, rect);
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean J(int i4, int i5, Bundle bundle);

    /* access modifiers changed from: protected */
    public void K(AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public void L(int i4, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public abstract void M(A a4);

    /* access modifiers changed from: protected */
    public abstract void N(int i4, A a4);

    /* access modifiers changed from: protected */
    public abstract void O(int i4, boolean z3);

    /* access modifiers changed from: package-private */
    public boolean P(int i4, int i5, Bundle bundle) {
        if (i4 != -1) {
            return Q(i4, i5, bundle);
        }
        return R(i5, bundle);
    }

    public final boolean T(int i4) {
        int i5;
        if ((!this.f959i.isFocused() && !this.f959i.requestFocus()) || (i5 = this.f962l) == i4) {
            return false;
        }
        if (i5 != Integer.MIN_VALUE) {
            o(i5);
        }
        if (i4 == Integer.MIN_VALUE) {
            return false;
        }
        this.f962l = i4;
        O(i4, true);
        U(i4, 8);
        return true;
    }

    public final boolean U(int i4, int i5) {
        ViewParent parent;
        if (i4 == Integer.MIN_VALUE || !this.f958h.isEnabled() || (parent = this.f959i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f959i, q(i4, i5));
    }

    public B b(View view) {
        if (this.f960j == null) {
            this.f960j = new c();
        }
        return this.f960j;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    public void g(View view, A a4) {
        super.g(view, a4);
        M(a4);
    }

    public final boolean o(int i4) {
        if (this.f962l != i4) {
            return false;
        }
        this.f962l = Integer.MIN_VALUE;
        O(i4, false);
        U(i4, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (!this.f958h.isEnabled() || !this.f958h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int B3 = B(motionEvent.getX(), motionEvent.getY());
            V(B3);
            if (B3 != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (action != 10 || this.f963m == Integer.MIN_VALUE) {
            return false;
        } else {
            V(Integer.MIN_VALUE);
            return true;
        }
    }

    public final boolean w(KeyEvent keyEvent) {
        int i4 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int F3 = F(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z3 = false;
                        while (i4 < repeatCount && G(F3, (Rect) null)) {
                            i4++;
                            z3 = true;
                        }
                        return z3;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            p();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return G(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return G(1, (Rect) null);
            }
            return false;
        }
    }

    public final int x() {
        return this.f961k;
    }
}
