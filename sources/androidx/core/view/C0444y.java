package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* renamed from: androidx.core.view.y  reason: case insensitive filesystem */
public class C0444y {

    /* renamed from: a  reason: collision with root package name */
    private ViewParent f5372a;

    /* renamed from: b  reason: collision with root package name */
    private ViewParent f5373b;

    /* renamed from: c  reason: collision with root package name */
    private final View f5374c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5375d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f5376e;

    public C0444y(View view) {
        this.f5374c = view;
    }

    private boolean g(int i4, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        ViewParent h4;
        int i9;
        int i10;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!l() || (h4 = h(i8)) == null) {
            return false;
        }
        if (i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f5374c.getLocationInWindow(iArr4);
            i10 = iArr4[0];
            i9 = iArr4[1];
        } else {
            i10 = 0;
            i9 = 0;
        }
        if (iArr2 == null) {
            int[] i11 = i();
            i11[0] = 0;
            i11[1] = 0;
            iArr3 = i11;
        } else {
            iArr3 = iArr2;
        }
        U.d(h4, this.f5374c, i4, i5, i6, i7, i8, iArr3);
        if (iArr4 != null) {
            this.f5374c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i10;
            iArr4[1] = iArr4[1] - i9;
        }
        return true;
    }

    private ViewParent h(int i4) {
        if (i4 == 0) {
            return this.f5372a;
        }
        if (i4 != 1) {
            return null;
        }
        return this.f5373b;
    }

    private int[] i() {
        if (this.f5376e == null) {
            this.f5376e = new int[2];
        }
        return this.f5376e;
    }

    private void n(int i4, ViewParent viewParent) {
        if (i4 == 0) {
            this.f5372a = viewParent;
        } else if (i4 == 1) {
            this.f5373b = viewParent;
        }
    }

    public boolean a(float f4, float f5, boolean z3) {
        ViewParent h4;
        if (!l() || (h4 = h(0)) == null) {
            return false;
        }
        return U.a(h4, this.f5374c, f4, f5, z3);
    }

    public boolean b(float f4, float f5) {
        ViewParent h4;
        if (!l() || (h4 = h(0)) == null) {
            return false;
        }
        return U.b(h4, this.f5374c, f4, f5);
    }

    public boolean c(int i4, int i5, int[] iArr, int[] iArr2) {
        return d(i4, i5, iArr, iArr2, 0);
    }

    public boolean d(int i4, int i5, int[] iArr, int[] iArr2, int i6) {
        ViewParent h4;
        int i7;
        int i8;
        if (!l() || (h4 = h(i6)) == null) {
            return false;
        }
        if (i4 != 0 || i5 != 0) {
            if (iArr2 != null) {
                this.f5374c.getLocationInWindow(iArr2);
                i8 = iArr2[0];
                i7 = iArr2[1];
            } else {
                i8 = 0;
                i7 = 0;
            }
            if (iArr == null) {
                iArr = i();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            U.c(h4, this.f5374c, i4, i5, iArr, i6);
            if (iArr2 != null) {
                this.f5374c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i8;
                iArr2[1] = iArr2[1] - i7;
            }
            if (iArr[0] == 0 && iArr[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    public void e(int i4, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        g(i4, i5, i6, i7, iArr, i8, iArr2);
    }

    public boolean f(int i4, int i5, int i6, int i7, int[] iArr) {
        return g(i4, i5, i6, i7, iArr, 0, (int[]) null);
    }

    public boolean j() {
        return k(0);
    }

    public boolean k(int i4) {
        if (h(i4) != null) {
            return true;
        }
        return false;
    }

    public boolean l() {
        return this.f5375d;
    }

    public void m(boolean z3) {
        if (this.f5375d) {
            P.J0(this.f5374c);
        }
        this.f5375d = z3;
    }

    public boolean o(int i4) {
        return p(i4, 0);
    }

    public boolean p(int i4, int i5) {
        if (k(i5)) {
            return true;
        }
        if (!l()) {
            return false;
        }
        View view = this.f5374c;
        for (ViewParent parent = this.f5374c.getParent(); parent != null; parent = parent.getParent()) {
            if (U.f(parent, view, this.f5374c, i4, i5)) {
                n(i5, parent);
                U.e(parent, view, this.f5374c, i4, i5);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void q() {
        r(0);
    }

    public void r(int i4) {
        ViewParent h4 = h(i4);
        if (h4 != null) {
            U.g(h4, this.f5374c, i4);
            n(i4, (ViewParent) null);
        }
    }
}
