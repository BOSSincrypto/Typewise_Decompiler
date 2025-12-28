package d0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.P;
import java.util.Map;

/* renamed from: d0.c  reason: case insensitive filesystem */
public class C0612c extends C0621l {

    /* renamed from: Q  reason: collision with root package name */
    private static final String[] f13405Q = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: R  reason: collision with root package name */
    private static final Property f13406R;

    /* renamed from: S  reason: collision with root package name */
    private static final Property f13407S;

    /* renamed from: T  reason: collision with root package name */
    private static final Property f13408T;

    /* renamed from: U  reason: collision with root package name */
    private static final Property f13409U;

    /* renamed from: V  reason: collision with root package name */
    private static final Property f13410V;

    /* renamed from: W  reason: collision with root package name */
    private static final Property f13411W;

    /* renamed from: X  reason: collision with root package name */
    private static C0619j f13412X = new C0619j();

    /* renamed from: N  reason: collision with root package name */
    private int[] f13413N = new int[2];

    /* renamed from: O  reason: collision with root package name */
    private boolean f13414O = false;

    /* renamed from: P  reason: collision with root package name */
    private boolean f13415P = false;

    /* renamed from: d0.c$a */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f13416a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f13417b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f13418c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f13419d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f4) {
            this.f13416a = viewGroup;
            this.f13417b = bitmapDrawable;
            this.f13418c = view;
            this.f13419d = f4;
        }

        public void onAnimationEnd(Animator animator) {
            C0594A.b(this.f13416a).d(this.f13417b);
            C0594A.g(this.f13418c, this.f13419d);
        }
    }

    /* renamed from: d0.c$b */
    static class b extends Property {

        /* renamed from: a  reason: collision with root package name */
        private Rect f13421a = new Rect();

        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f13421a);
            Rect rect = this.f13421a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f13421a);
            this.f13421a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f13421a);
        }
    }

    /* renamed from: d0.c$c  reason: collision with other inner class name */
    static class C0183c extends Property {
        C0183c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* renamed from: d0.c$d */
    static class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* renamed from: d0.c$e */
    static class e extends Property {
        e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C0594A.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: d0.c$f */
    static class f extends Property {
        f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C0594A.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: d0.c$g */
    static class g extends Property {
        g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C0594A.f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: d0.c$h */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f13422a;
        private k mViewBounds;

        h(k kVar) {
            this.f13422a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: d0.c$i */
    class i extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f13424a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f13425b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Rect f13426c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f13427d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f13428e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f13429f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f13430g;

        i(View view, Rect rect, int i4, int i5, int i6, int i7) {
            this.f13425b = view;
            this.f13426c = rect;
            this.f13427d = i4;
            this.f13428e = i5;
            this.f13429f = i6;
            this.f13430g = i7;
        }

        public void onAnimationCancel(Animator animator) {
            this.f13424a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f13424a) {
                P.v0(this.f13425b, this.f13426c);
                C0594A.f(this.f13425b, this.f13427d, this.f13428e, this.f13429f, this.f13430g);
            }
        }
    }

    /* renamed from: d0.c$j */
    class j extends C0622m {

        /* renamed from: a  reason: collision with root package name */
        boolean f13432a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f13433b;

        j(ViewGroup viewGroup) {
            this.f13433b = viewGroup;
        }

        public void b(C0621l lVar) {
            C0633x.c(this.f13433b, false);
            this.f13432a = true;
        }

        public void c(C0621l lVar) {
            C0633x.c(this.f13433b, false);
        }

        public void d(C0621l lVar) {
            C0633x.c(this.f13433b, true);
        }

        public void e(C0621l lVar) {
            if (!this.f13432a) {
                C0633x.c(this.f13433b, false);
            }
            lVar.T(this);
        }
    }

    /* renamed from: d0.c$k */
    private static class k {

        /* renamed from: a  reason: collision with root package name */
        private int f13435a;

        /* renamed from: b  reason: collision with root package name */
        private int f13436b;

        /* renamed from: c  reason: collision with root package name */
        private int f13437c;

        /* renamed from: d  reason: collision with root package name */
        private int f13438d;

        /* renamed from: e  reason: collision with root package name */
        private View f13439e;

        /* renamed from: f  reason: collision with root package name */
        private int f13440f;

        /* renamed from: g  reason: collision with root package name */
        private int f13441g;

        k(View view) {
            this.f13439e = view;
        }

        private void b() {
            C0594A.f(this.f13439e, this.f13435a, this.f13436b, this.f13437c, this.f13438d);
            this.f13440f = 0;
            this.f13441g = 0;
        }

        /* access modifiers changed from: package-private */
        public void a(PointF pointF) {
            this.f13437c = Math.round(pointF.x);
            this.f13438d = Math.round(pointF.y);
            int i4 = this.f13441g + 1;
            this.f13441g = i4;
            if (this.f13440f == i4) {
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public void c(PointF pointF) {
            this.f13435a = Math.round(pointF.x);
            this.f13436b = Math.round(pointF.y);
            int i4 = this.f13440f + 1;
            this.f13440f = i4;
            if (i4 == this.f13441g) {
                b();
            }
        }
    }

    static {
        Class<PointF> cls = PointF.class;
        f13406R = new b(cls, "boundsOrigin");
        f13407S = new C0183c(cls, "topLeft");
        f13408T = new d(cls, "bottomRight");
        f13409U = new e(cls, "bottomRight");
        f13410V = new f(cls, "topLeft");
        f13411W = new g(cls, "position");
    }

    private void g0(C0628s sVar) {
        View view = sVar.f13523b;
        if (P.S(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            sVar.f13522a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            sVar.f13522a.put("android:changeBounds:parent", sVar.f13523b.getParent());
            if (this.f13415P) {
                sVar.f13523b.getLocationInWindow(this.f13413N);
                sVar.f13522a.put("android:changeBounds:windowX", Integer.valueOf(this.f13413N[0]));
                sVar.f13522a.put("android:changeBounds:windowY", Integer.valueOf(this.f13413N[1]));
            }
            if (this.f13414O) {
                sVar.f13522a.put("android:changeBounds:clip", P.u(view));
            }
        }
    }

    private boolean h0(View view, View view2) {
        if (!this.f13415P) {
            return true;
        }
        C0628s x3 = x(view, true);
        if (x3 == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == x3.f13523b) {
            return true;
        }
        return false;
    }

    public String[] H() {
        return f13405Q;
    }

    public void j(C0628s sVar) {
        g0(sVar);
    }

    public void n(C0628s sVar) {
        g0(sVar);
    }

    public Animator r(ViewGroup viewGroup, C0628s sVar, C0628s sVar2) {
        int i4;
        View view;
        Animator animator;
        ObjectAnimator objectAnimator;
        int i5;
        Rect rect;
        ObjectAnimator objectAnimator2;
        C0628s sVar3 = sVar;
        C0628s sVar4 = sVar2;
        if (sVar3 == null || sVar4 == null) {
            return null;
        }
        Map map = sVar3.f13522a;
        Map map2 = sVar4.f13522a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar4.f13523b;
        if (h0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) sVar3.f13522a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) sVar4.f13522a.get("android:changeBounds:bounds");
            int i6 = rect2.left;
            int i7 = rect3.left;
            int i8 = rect2.top;
            int i9 = rect3.top;
            int i10 = rect2.right;
            int i11 = rect3.right;
            int i12 = rect2.bottom;
            int i13 = rect3.bottom;
            int i14 = i10 - i6;
            int i15 = i12 - i8;
            int i16 = i11 - i7;
            int i17 = i13 - i9;
            View view3 = view2;
            Rect rect4 = (Rect) sVar3.f13522a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) sVar4.f13522a.get("android:changeBounds:clip");
            if ((i14 == 0 || i15 == 0) && (i16 == 0 || i17 == 0)) {
                i4 = 0;
            } else {
                if (i6 == i7 && i8 == i9) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
                if (!(i10 == i11 && i12 == i13)) {
                    i4++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i4++;
            }
            if (i4 <= 0) {
                return null;
            }
            Rect rect6 = rect5;
            if (!this.f13414O) {
                view = view3;
                C0594A.f(view, i6, i8, i10, i12);
                if (i4 == 2) {
                    if (i14 == i16 && i15 == i17) {
                        animator = C0615f.a(view, f13411W, z().a((float) i6, (float) i8, (float) i7, (float) i9));
                    } else {
                        k kVar = new k(view);
                        ObjectAnimator a4 = C0615f.a(kVar, f13407S, z().a((float) i6, (float) i8, (float) i7, (float) i9));
                        ObjectAnimator a5 = C0615f.a(kVar, f13408T, z().a((float) i10, (float) i12, (float) i11, (float) i13));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{a4, a5});
                        animatorSet.addListener(new h(kVar));
                        animator = animatorSet;
                    }
                } else if (i6 == i7 && i8 == i9) {
                    animator = C0615f.a(view, f13409U, z().a((float) i10, (float) i12, (float) i11, (float) i13));
                } else {
                    animator = C0615f.a(view, f13410V, z().a((float) i6, (float) i8, (float) i7, (float) i9));
                }
            } else {
                view = view3;
                C0594A.f(view, i6, i8, Math.max(i14, i16) + i6, Math.max(i15, i17) + i8);
                if (i6 == i7 && i8 == i9) {
                    objectAnimator = null;
                } else {
                    objectAnimator = C0615f.a(view, f13411W, z().a((float) i6, (float) i8, (float) i7, (float) i9));
                }
                if (rect4 == null) {
                    i5 = 0;
                    rect4 = new Rect(0, 0, i14, i15);
                } else {
                    i5 = 0;
                }
                if (rect6 == null) {
                    rect = new Rect(i5, i5, i16, i17);
                } else {
                    rect = rect6;
                }
                if (!rect4.equals(rect)) {
                    P.v0(view, rect4);
                    C0619j jVar = f13412X;
                    Object[] objArr = new Object[2];
                    objArr[i5] = rect4;
                    objArr[1] = rect;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", jVar, objArr);
                    ofObject.addListener(new i(view, rect6, i7, i9, i11, i13));
                    objectAnimator2 = ofObject;
                } else {
                    objectAnimator2 = null;
                }
                animator = C0627r.c(objectAnimator, objectAnimator2);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                C0633x.c(viewGroup4, true);
                b(new j(viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) sVar3.f13522a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) sVar3.f13522a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) sVar4.f13522a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) sVar4.f13522a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f13413N);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c4 = C0594A.c(view2);
        C0594A.g(view2, 0.0f);
        C0594A.b(viewGroup).b(bitmapDrawable);
        C0616g z3 = z();
        int[] iArr = this.f13413N;
        int i18 = iArr[0];
        int i19 = iArr[1];
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{C0617h.a(f13406R, z3.a((float) (intValue - i18), (float) (intValue2 - i19), (float) (intValue3 - i18), (float) (intValue4 - i19)))});
        ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, c4));
        return ofPropertyValuesHolder;
    }
}
