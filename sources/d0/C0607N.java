package d0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import d0.C0621l;

/* renamed from: d0.N  reason: case insensitive filesystem */
public abstract class C0607N extends C0621l {

    /* renamed from: O  reason: collision with root package name */
    private static final String[] f13386O = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: N  reason: collision with root package name */
    private int f13387N = 3;

    /* renamed from: d0.N$a */
    class a extends C0622m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f13388a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f13389b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f13390c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f13388a = viewGroup;
            this.f13389b = view;
            this.f13390c = view2;
        }

        public void c(C0621l lVar) {
            C0633x.a(this.f13388a).c(this.f13389b);
        }

        public void d(C0621l lVar) {
            if (this.f13389b.getParent() == null) {
                C0633x.a(this.f13388a).a(this.f13389b);
            } else {
                C0607N.this.cancel();
            }
        }

        public void e(C0621l lVar) {
            this.f13390c.setTag(C0618i.save_overlay_view, (Object) null);
            C0633x.a(this.f13388a).c(this.f13389b);
            lVar.T(this);
        }
    }

    /* renamed from: d0.N$b */
    private static class b extends AnimatorListenerAdapter implements C0621l.f {

        /* renamed from: a  reason: collision with root package name */
        private final View f13392a;

        /* renamed from: b  reason: collision with root package name */
        private final int f13393b;

        /* renamed from: c  reason: collision with root package name */
        private final ViewGroup f13394c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f13395d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f13396e;

        /* renamed from: f  reason: collision with root package name */
        boolean f13397f = false;

        b(View view, int i4, boolean z3) {
            this.f13392a = view;
            this.f13393b = i4;
            this.f13394c = (ViewGroup) view.getParent();
            this.f13395d = z3;
            g(true);
        }

        private void f() {
            if (!this.f13397f) {
                C0594A.h(this.f13392a, this.f13393b);
                ViewGroup viewGroup = this.f13394c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z3) {
            ViewGroup viewGroup;
            if (this.f13395d && this.f13396e != z3 && (viewGroup = this.f13394c) != null) {
                this.f13396e = z3;
                C0633x.c(viewGroup, z3);
            }
        }

        public void a(C0621l lVar) {
        }

        public void b(C0621l lVar) {
        }

        public void c(C0621l lVar) {
            g(false);
        }

        public void d(C0621l lVar) {
            g(true);
        }

        public void e(C0621l lVar) {
            f();
            lVar.T(this);
        }

        public void onAnimationCancel(Animator animator) {
            this.f13397f = true;
        }

        public void onAnimationEnd(Animator animator) {
            f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f13397f) {
                C0594A.h(this.f13392a, this.f13393b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f13397f) {
                C0594A.h(this.f13392a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: d0.N$c */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f13398a;

        /* renamed from: b  reason: collision with root package name */
        boolean f13399b;

        /* renamed from: c  reason: collision with root package name */
        int f13400c;

        /* renamed from: d  reason: collision with root package name */
        int f13401d;

        /* renamed from: e  reason: collision with root package name */
        ViewGroup f13402e;

        /* renamed from: f  reason: collision with root package name */
        ViewGroup f13403f;

        c() {
        }
    }

    private void g0(C0628s sVar) {
        sVar.f13522a.put("android:visibility:visibility", Integer.valueOf(sVar.f13523b.getVisibility()));
        sVar.f13522a.put("android:visibility:parent", sVar.f13523b.getParent());
        int[] iArr = new int[2];
        sVar.f13523b.getLocationOnScreen(iArr);
        sVar.f13522a.put("android:visibility:screenLocation", iArr);
    }

    private c h0(C0628s sVar, C0628s sVar2) {
        c cVar = new c();
        cVar.f13398a = false;
        cVar.f13399b = false;
        if (sVar == null || !sVar.f13522a.containsKey("android:visibility:visibility")) {
            cVar.f13400c = -1;
            cVar.f13402e = null;
        } else {
            cVar.f13400c = ((Integer) sVar.f13522a.get("android:visibility:visibility")).intValue();
            cVar.f13402e = (ViewGroup) sVar.f13522a.get("android:visibility:parent");
        }
        if (sVar2 == null || !sVar2.f13522a.containsKey("android:visibility:visibility")) {
            cVar.f13401d = -1;
            cVar.f13403f = null;
        } else {
            cVar.f13401d = ((Integer) sVar2.f13522a.get("android:visibility:visibility")).intValue();
            cVar.f13403f = (ViewGroup) sVar2.f13522a.get("android:visibility:parent");
        }
        if (sVar != null && sVar2 != null) {
            int i4 = cVar.f13400c;
            int i5 = cVar.f13401d;
            if (i4 == i5 && cVar.f13402e == cVar.f13403f) {
                return cVar;
            }
            if (i4 != i5) {
                if (i4 == 0) {
                    cVar.f13399b = false;
                    cVar.f13398a = true;
                } else if (i5 == 0) {
                    cVar.f13399b = true;
                    cVar.f13398a = true;
                }
            } else if (cVar.f13403f == null) {
                cVar.f13399b = false;
                cVar.f13398a = true;
            } else if (cVar.f13402e == null) {
                cVar.f13399b = true;
                cVar.f13398a = true;
            }
        } else if (sVar == null && cVar.f13401d == 0) {
            cVar.f13399b = true;
            cVar.f13398a = true;
        } else if (sVar2 == null && cVar.f13400c == 0) {
            cVar.f13399b = false;
            cVar.f13398a = true;
        }
        return cVar;
    }

    public String[] H() {
        return f13386O;
    }

    public boolean J(C0628s sVar, C0628s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f13522a.containsKey("android:visibility:visibility") != sVar.f13522a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c h02 = h0(sVar, sVar2);
        if (!h02.f13398a) {
            return false;
        }
        if (h02.f13400c == 0 || h02.f13401d == 0) {
            return true;
        }
        return false;
    }

    public abstract Animator i0(ViewGroup viewGroup, View view, C0628s sVar, C0628s sVar2);

    public void j(C0628s sVar) {
        g0(sVar);
    }

    public Animator j0(ViewGroup viewGroup, C0628s sVar, int i4, C0628s sVar2, int i5) {
        if ((this.f13387N & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f13523b.getParent();
            if (h0(x(view, false), I(view, false)).f13398a) {
                return null;
            }
        }
        return i0(viewGroup, sVar2.f13523b, sVar, sVar2);
    }

    public abstract Animator k0(ViewGroup viewGroup, View view, C0628s sVar, C0628s sVar2);

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008f, code lost:
        if (r0.f13464A != false) goto L_0x0091;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator l0(android.view.ViewGroup r18, d0.C0628s r19, int r20, d0.C0628s r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            r4 = r22
            int r5 = r0.f13387N
            r6 = 2
            r5 = r5 & r6
            r7 = 0
            if (r5 == r6) goto L_0x0012
            return r7
        L_0x0012:
            if (r2 != 0) goto L_0x0015
            return r7
        L_0x0015:
            android.view.View r5 = r2.f13523b
            if (r3 == 0) goto L_0x001c
            android.view.View r8 = r3.f13523b
            goto L_0x001d
        L_0x001c:
            r8 = r7
        L_0x001d:
            int r9 = d0.C0618i.save_overlay_view
            java.lang.Object r10 = r5.getTag(r9)
            android.view.View r10 = (android.view.View) r10
            r11 = 0
            r12 = 1
            if (r10 == 0) goto L_0x002d
            r8 = r7
            r13 = r12
            goto L_0x0094
        L_0x002d:
            if (r8 == 0) goto L_0x0044
            android.view.ViewParent r10 = r8.getParent()
            if (r10 != 0) goto L_0x0036
            goto L_0x0044
        L_0x0036:
            r10 = 4
            if (r4 != r10) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            if (r5 != r8) goto L_0x0040
        L_0x003c:
            r10 = r8
            r13 = r11
            r8 = r7
            goto L_0x0048
        L_0x0040:
            r8 = r7
            r10 = r8
            r13 = r12
            goto L_0x0048
        L_0x0044:
            if (r8 == 0) goto L_0x0040
            r10 = r7
            r13 = r11
        L_0x0048:
            if (r13 == 0) goto L_0x0073
            android.view.ViewParent r13 = r5.getParent()
            if (r13 != 0) goto L_0x0051
            goto L_0x0091
        L_0x0051:
            android.view.ViewParent r13 = r5.getParent()
            boolean r13 = r13 instanceof android.view.View
            if (r13 == 0) goto L_0x0073
            android.view.ViewParent r13 = r5.getParent()
            android.view.View r13 = (android.view.View) r13
            d0.s r14 = r0.I(r13, r12)
            d0.s r15 = r0.x(r13, r12)
            d0.N$c r14 = r0.h0(r14, r15)
            boolean r14 = r14.f13398a
            if (r14 != 0) goto L_0x007a
            android.view.View r8 = d0.C0627r.a(r1, r5, r13)
        L_0x0073:
            r13 = r11
            r16 = r10
            r10 = r8
            r8 = r16
            goto L_0x0094
        L_0x007a:
            int r14 = r13.getId()
            android.view.ViewParent r13 = r13.getParent()
            if (r13 != 0) goto L_0x0073
            r13 = -1
            if (r14 == r13) goto L_0x0073
            android.view.View r13 = r1.findViewById(r14)
            if (r13 == 0) goto L_0x0073
            boolean r13 = r0.f13464A
            if (r13 == 0) goto L_0x0073
        L_0x0091:
            r8 = r10
            r13 = r11
            r10 = r5
        L_0x0094:
            if (r10 == 0) goto L_0x00e4
            if (r13 != 0) goto L_0x00c8
            java.util.Map r4 = r2.f13522a
            java.lang.String r7 = "android:visibility:screenLocation"
            java.lang.Object r4 = r4.get(r7)
            int[] r4 = (int[]) r4
            r7 = r4[r11]
            r4 = r4[r12]
            int[] r6 = new int[r6]
            r1.getLocationOnScreen(r6)
            r8 = r6[r11]
            int r7 = r7 - r8
            int r8 = r10.getLeft()
            int r7 = r7 - r8
            r10.offsetLeftAndRight(r7)
            r6 = r6[r12]
            int r4 = r4 - r6
            int r6 = r10.getTop()
            int r4 = r4 - r6
            r10.offsetTopAndBottom(r4)
            d0.v r4 = d0.C0633x.a(r18)
            r4.a(r10)
        L_0x00c8:
            android.animation.Animator r2 = r0.k0(r1, r10, r2, r3)
            if (r13 != 0) goto L_0x00e3
            if (r2 != 0) goto L_0x00d8
            d0.v r1 = d0.C0633x.a(r18)
            r1.c(r10)
            goto L_0x00e3
        L_0x00d8:
            r5.setTag(r9, r10)
            d0.N$a r3 = new d0.N$a
            r3.<init>(r1, r10, r5)
            r0.b(r3)
        L_0x00e3:
            return r2
        L_0x00e4:
            if (r8 == 0) goto L_0x0106
            int r5 = r8.getVisibility()
            d0.C0594A.h(r8, r11)
            android.animation.Animator r1 = r0.k0(r1, r8, r2, r3)
            if (r1 == 0) goto L_0x0102
            d0.N$b r2 = new d0.N$b
            r2.<init>(r8, r4, r12)
            r1.addListener(r2)
            d0.C0610a.a(r1, r2)
            r0.b(r2)
            goto L_0x0105
        L_0x0102:
            d0.C0594A.h(r8, r5)
        L_0x0105:
            return r1
        L_0x0106:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.C0607N.l0(android.view.ViewGroup, d0.s, int, d0.s, int):android.animation.Animator");
    }

    public void m0(int i4) {
        if ((i4 & -4) == 0) {
            this.f13387N = i4;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public void n(C0628s sVar) {
        g0(sVar);
    }

    public Animator r(ViewGroup viewGroup, C0628s sVar, C0628s sVar2) {
        c h02 = h0(sVar, sVar2);
        if (!h02.f13398a) {
            return null;
        }
        if (h02.f13402e == null && h02.f13403f == null) {
            return null;
        }
        if (h02.f13399b) {
            return j0(viewGroup, sVar, h02.f13400c, sVar2, h02.f13401d);
        }
        return l0(viewGroup, sVar, h02.f13400c, sVar2, h02.f13401d);
    }
}
