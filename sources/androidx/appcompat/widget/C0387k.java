package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.T;
import n.C0822a;
import n.C0824c;
import n.d;
import n.e;
import o.C0836a;

/* renamed from: androidx.appcompat.widget.k  reason: case insensitive filesystem */
public final class C0387k {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f3603b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    private static C0387k f3604c;

    /* renamed from: a  reason: collision with root package name */
    private T f3605a;

    /* renamed from: androidx.appcompat.widget.k$a */
    class a implements T.f {

        /* renamed from: a  reason: collision with root package name */
        private final int[] f3606a = {e.f14733R, e.f14731P, e.f14735a};

        /* renamed from: b  reason: collision with root package name */
        private final int[] f3607b = {e.f14749o, e.f14717B, e.f14754t, e.f14750p, e.f14751q, e.f14753s, e.f14752r};

        /* renamed from: c  reason: collision with root package name */
        private final int[] f3608c = {e.f14730O, e.f14732Q, e.f14745k, e.f14726K, e.f14727L, e.f14728M, e.f14729N};

        /* renamed from: d  reason: collision with root package name */
        private final int[] f3609d = {e.f14757w, e.f14743i, e.f14756v};

        /* renamed from: e  reason: collision with root package name */
        private final int[] f3610e = {e.f14725J, e.f14734S};

        /* renamed from: f  reason: collision with root package name */
        private final int[] f3611f = {e.f14737c, e.f14741g, e.f14738d, e.f14742h};

        a() {
        }

        private boolean f(int[] iArr, int i4) {
            for (int i5 : iArr) {
                if (i5 == i4) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i4) {
            int c4 = Y.c(context, C0822a.f14687t);
            int b4 = Y.b(context, C0822a.f14685r);
            return new ColorStateList(new int[][]{Y.f3481b, Y.f3484e, Y.f3482c, Y.f3488i}, new int[]{b4, androidx.core.graphics.a.g(c4, i4), androidx.core.graphics.a.g(c4, i4), i4});
        }

        private ColorStateList i(Context context) {
            return h(context, Y.c(context, C0822a.f14684q));
        }

        private ColorStateList j(Context context) {
            return h(context, Y.c(context, C0822a.f14685r));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i4 = C0822a.f14689v;
            ColorStateList e4 = Y.e(context, i4);
            if (e4 == null || !e4.isStateful()) {
                iArr[0] = Y.f3481b;
                iArr2[0] = Y.b(context, i4);
                iArr[1] = Y.f3485f;
                iArr2[1] = Y.c(context, C0822a.f14686s);
                iArr[2] = Y.f3488i;
                iArr2[2] = Y.c(context, i4);
            } else {
                int[] iArr3 = Y.f3481b;
                iArr[0] = iArr3;
                iArr2[0] = e4.getColorForState(iArr3, 0);
                iArr[1] = Y.f3485f;
                iArr2[1] = Y.c(context, C0822a.f14686s);
                iArr[2] = Y.f3488i;
                iArr2[2] = e4.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(T t4, Context context, int i4) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i4);
            Drawable j4 = t4.j(context, e.f14721F);
            Drawable j5 = t4.j(context, e.f14722G);
            if ((j4 instanceof BitmapDrawable) && j4.getIntrinsicWidth() == dimensionPixelSize && j4.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) j4;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j4.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j4.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((j5 instanceof BitmapDrawable) && j5.getIntrinsicWidth() == dimensionPixelSize && j5.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j5;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j5.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j5.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i4, PorterDuff.Mode mode) {
            if (K.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0387k.f3603b;
            }
            drawable.setColorFilter(C0387k.e(i4, mode));
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x006c A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
            /*
                r7 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0387k.f3603b
                int[] r1 = r7.f3606a
                boolean r1 = r7.f(r1, r9)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L_0x0015
                int r9 = n.C0822a.f14688u
            L_0x0011:
                r1 = r0
                r5 = r2
            L_0x0013:
                r0 = r4
                goto L_0x004f
            L_0x0015:
                int[] r1 = r7.f3608c
                boolean r1 = r7.f(r1, r9)
                if (r1 == 0) goto L_0x0020
                int r9 = n.C0822a.f14686s
                goto L_0x0011
            L_0x0020:
                int[] r1 = r7.f3609d
                boolean r1 = r7.f(r1, r9)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L_0x0032
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L_0x002d:
                r1 = r0
                r0 = r4
                r9 = r5
                r5 = r2
                goto L_0x004f
            L_0x0032:
                int r1 = n.e.f14755u
                if (r9 != r1) goto L_0x0046
                r9 = 1109603123(0x42233333, float:40.8)
                int r9 = java.lang.Math.round(r9)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r2
                r6 = r0
                r0 = r9
                r9 = r1
                r1 = r6
                goto L_0x004f
            L_0x0046:
                int r1 = n.e.f14746l
                if (r9 != r1) goto L_0x004b
                goto L_0x002d
            L_0x004b:
                r1 = r0
                r9 = r3
                r5 = r9
                goto L_0x0013
            L_0x004f:
                if (r5 == 0) goto L_0x006c
                boolean r3 = androidx.appcompat.widget.K.a(r10)
                if (r3 == 0) goto L_0x005b
                android.graphics.drawable.Drawable r10 = r10.mutate()
            L_0x005b:
                int r8 = androidx.appcompat.widget.Y.c(r8, r9)
                android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.C0387k.e(r8, r1)
                r10.setColorFilter(r8)
                if (r0 == r4) goto L_0x006b
                r10.setAlpha(r0)
            L_0x006b:
                return r2
            L_0x006c:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0387k.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        public PorterDuff.Mode b(int i4) {
            if (i4 == e.f14723H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        public Drawable c(T t4, Context context, int i4) {
            if (i4 == e.f14744j) {
                return new LayerDrawable(new Drawable[]{t4.j(context, e.f14743i), t4.j(context, e.f14745k)});
            } else if (i4 == e.f14759y) {
                return l(t4, context, d.f14709g);
            } else {
                if (i4 == e.f14758x) {
                    return l(t4, context, d.f14710h);
                }
                if (i4 == e.f14760z) {
                    return l(t4, context, d.f14711i);
                }
                return null;
            }
        }

        public ColorStateList d(Context context, int i4) {
            if (i4 == e.f14747m) {
                return C0836a.a(context, C0824c.f14699e);
            }
            if (i4 == e.f14724I) {
                return C0836a.a(context, C0824c.f14702h);
            }
            if (i4 == e.f14723H) {
                return k(context);
            }
            if (i4 == e.f14740f) {
                return j(context);
            }
            if (i4 == e.f14736b) {
                return g(context);
            }
            if (i4 == e.f14739e) {
                return i(context);
            }
            if (i4 == e.f14719D || i4 == e.f14720E) {
                return C0836a.a(context, C0824c.f14701g);
            }
            if (f(this.f3607b, i4)) {
                return Y.e(context, C0822a.f14688u);
            }
            if (f(this.f3610e, i4)) {
                return C0836a.a(context, C0824c.f14698d);
            }
            if (f(this.f3611f, i4)) {
                return C0836a.a(context, C0824c.f14697c);
            }
            if (i4 == e.f14716A) {
                return C0836a.a(context, C0824c.f14700f);
            }
            return null;
        }

        public boolean e(Context context, int i4, Drawable drawable) {
            if (i4 == e.f14718C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int i5 = C0822a.f14688u;
                m(findDrawableByLayerId, Y.c(context, i5), C0387k.f3603b);
                m(layerDrawable.findDrawableByLayerId(16908303), Y.c(context, i5), C0387k.f3603b);
                m(layerDrawable.findDrawableByLayerId(16908301), Y.c(context, C0822a.f14686s), C0387k.f3603b);
                return true;
            } else if (i4 != e.f14759y && i4 != e.f14758x && i4 != e.f14760z) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m(layerDrawable2.findDrawableByLayerId(16908288), Y.b(context, C0822a.f14688u), C0387k.f3603b);
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908303);
                int i6 = C0822a.f14686s;
                m(findDrawableByLayerId2, Y.c(context, i6), C0387k.f3603b);
                m(layerDrawable2.findDrawableByLayerId(16908301), Y.c(context, i6), C0387k.f3603b);
                return true;
            }
        }
    }

    public static synchronized C0387k b() {
        C0387k kVar;
        synchronized (C0387k.class) {
            try {
                if (f3604c == null) {
                    h();
                }
                kVar = f3604c;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return kVar;
    }

    public static synchronized PorterDuffColorFilter e(int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter l4;
        synchronized (C0387k.class) {
            l4 = T.l(i4, mode);
        }
        return l4;
    }

    public static synchronized void h() {
        synchronized (C0387k.class) {
            if (f3604c == null) {
                C0387k kVar = new C0387k();
                f3604c = kVar;
                kVar.f3605a = T.h();
                f3604c.f3605a.u(new a());
            }
        }
    }

    static void i(Drawable drawable, a0 a0Var, int[] iArr) {
        T.w(drawable, a0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i4) {
        return this.f3605a.j(context, i4);
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable d(Context context, int i4, boolean z3) {
        return this.f3605a.k(context, i4, z3);
    }

    /* access modifiers changed from: package-private */
    public synchronized ColorStateList f(Context context, int i4) {
        return this.f3605a.m(context, i4);
    }

    public synchronized void g(Context context) {
        this.f3605a.s(context);
    }
}
