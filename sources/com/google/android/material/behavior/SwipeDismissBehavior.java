package com.google.android.material.behavior;

import N.c;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.P;
import androidx.core.view.accessibility.A;
import androidx.core.view.accessibility.D;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.b {

    /* renamed from: a  reason: collision with root package name */
    N.c f11581a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f11582b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f11583c;

    /* renamed from: d  reason: collision with root package name */
    private float f11584d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11585e;

    /* renamed from: f  reason: collision with root package name */
    int f11586f = 2;

    /* renamed from: g  reason: collision with root package name */
    float f11587g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    float f11588h = 0.0f;

    /* renamed from: i  reason: collision with root package name */
    float f11589i = 0.5f;

    /* renamed from: j  reason: collision with root package name */
    private final c.C0015c f11590j = new a();

    class a extends c.C0015c {

        /* renamed from: a  reason: collision with root package name */
        private int f11591a;

        /* renamed from: b  reason: collision with root package name */
        private int f11592b = -1;

        a() {
        }

        private boolean n(View view, float f4) {
            boolean z3;
            int i4 = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
            if (i4 != 0) {
                if (P.B(view) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i5 = SwipeDismissBehavior.this.f11586f;
                if (i5 == 2) {
                    return true;
                }
                if (i5 == 0) {
                    if (z3) {
                        if (f4 >= 0.0f) {
                            return false;
                        }
                    } else if (i4 <= 0) {
                        return false;
                    }
                    return true;
                } else if (i5 != 1) {
                    return false;
                } else {
                    if (z3) {
                        if (i4 <= 0) {
                            return false;
                        }
                    } else if (f4 >= 0.0f) {
                        return false;
                    }
                    return true;
                }
            } else {
                if (Math.abs(view.getLeft() - this.f11591a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f11587g)) {
                    return true;
                }
                return false;
            }
        }

        public int a(View view, int i4, int i5) {
            boolean z3;
            int i6;
            int i7;
            int width;
            if (P.B(view) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i8 = SwipeDismissBehavior.this.f11586f;
            if (i8 != 0) {
                if (i8 != 1) {
                    i6 = this.f11591a - view.getWidth();
                    i7 = view.getWidth() + this.f11591a;
                } else if (z3) {
                    i6 = this.f11591a;
                    width = view.getWidth();
                } else {
                    i6 = this.f11591a - view.getWidth();
                    i7 = this.f11591a;
                }
                return SwipeDismissBehavior.H(i6, i4, i7);
            } else if (z3) {
                i6 = this.f11591a - view.getWidth();
                i7 = this.f11591a;
                return SwipeDismissBehavior.H(i6, i4, i7);
            } else {
                i6 = this.f11591a;
                width = view.getWidth();
            }
            i7 = width + i6;
            return SwipeDismissBehavior.H(i6, i4, i7);
        }

        public int b(View view, int i4, int i5) {
            return view.getTop();
        }

        public int d(View view) {
            return view.getWidth();
        }

        public void i(View view, int i4) {
            this.f11592b = i4;
            this.f11591a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                boolean unused = SwipeDismissBehavior.this.f11583c = true;
                parent.requestDisallowInterceptTouchEvent(true);
                boolean unused2 = SwipeDismissBehavior.this.f11583c = false;
            }
        }

        public void j(int i4) {
            SwipeDismissBehavior.this.getClass();
        }

        public void k(View view, int i4, int i5, int i6, int i7) {
            float width = ((float) view.getWidth()) * SwipeDismissBehavior.this.f11588h;
            float width2 = ((float) view.getWidth()) * SwipeDismissBehavior.this.f11589i;
            float abs = (float) Math.abs(i4 - this.f11591a);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.G(0.0f, 1.0f - SwipeDismissBehavior.J(width, width2, abs), 1.0f));
            }
        }

        public void l(View view, float f4, float f5) {
            boolean z3;
            int i4;
            int i5;
            this.f11592b = -1;
            int width = view.getWidth();
            if (n(view, f4)) {
                if (f4 < 0.0f || view.getLeft() < (i5 = this.f11591a)) {
                    i4 = this.f11591a - width;
                } else {
                    i4 = i5 + width;
                }
                z3 = true;
            } else {
                i4 = this.f11591a;
                z3 = false;
            }
            if (SwipeDismissBehavior.this.f11581a.F(i4, view.getTop())) {
                P.g0(view, new c(view, z3));
            } else if (z3) {
                SwipeDismissBehavior.this.getClass();
            }
        }

        public boolean m(View view, int i4) {
            int i5 = this.f11592b;
            if ((i5 == -1 || i5 == i4) && SwipeDismissBehavior.this.F(view)) {
                return true;
            }
            return false;
        }
    }

    class b implements D {
        b() {
        }

        public boolean a(View view, D.a aVar) {
            int i4;
            boolean z3 = false;
            if (!SwipeDismissBehavior.this.F(view)) {
                return false;
            }
            if (P.B(view) == 1) {
                z3 = true;
            }
            int i5 = SwipeDismissBehavior.this.f11586f;
            if ((i5 != 0 || !z3) && (i5 != 1 || z3)) {
                i4 = view.getWidth();
            } else {
                i4 = -view.getWidth();
            }
            P.Y(view, i4);
            view.setAlpha(0.0f);
            SwipeDismissBehavior.this.getClass();
            return true;
        }
    }

    private class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final View f11595a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f11596b;

        c(View view, boolean z3) {
            this.f11595a = view;
            this.f11596b = z3;
        }

        public void run() {
            N.c cVar = SwipeDismissBehavior.this.f11581a;
            if (cVar != null && cVar.k(true)) {
                P.g0(this.f11595a, this);
            } else if (this.f11596b) {
                SwipeDismissBehavior.this.getClass();
            }
        }
    }

    static float G(float f4, float f5, float f6) {
        return Math.min(Math.max(f4, f5), f6);
    }

    static int H(int i4, int i5, int i6) {
        return Math.min(Math.max(i4, i5), i6);
    }

    private void I(ViewGroup viewGroup) {
        N.c cVar;
        if (this.f11581a == null) {
            if (this.f11585e) {
                cVar = N.c.l(viewGroup, this.f11584d, this.f11590j);
            } else {
                cVar = N.c.m(viewGroup, this.f11590j);
            }
            this.f11581a = cVar;
        }
    }

    static float J(float f4, float f5, float f6) {
        return (f6 - f4) / (f5 - f4);
    }

    private void N(View view) {
        P.i0(view, 1048576);
        if (F(view)) {
            P.k0(view, A.a.f5262y, (CharSequence) null, new b());
        }
    }

    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f11581a == null) {
            return false;
        }
        if (this.f11583c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f11581a.z(motionEvent);
        return true;
    }

    public boolean F(View view) {
        return true;
    }

    public void K(float f4) {
        this.f11589i = G(0.0f, f4, 1.0f);
    }

    public void L(float f4) {
        this.f11588h = G(0.0f, f4, 1.0f);
    }

    public void M(int i4) {
        this.f11586f = i4;
    }

    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z3 = this.f11582b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z3 = coordinatorLayout.A(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f11582b = z3;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f11582b = false;
        }
        if (!z3) {
            return false;
        }
        I(coordinatorLayout);
        if (this.f11583c || !this.f11581a.G(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        boolean l4 = super.l(coordinatorLayout, view, i4);
        if (P.z(view) == 0) {
            P.y0(view, 1);
            N(view);
        }
        return l4;
    }
}
