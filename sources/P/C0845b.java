package p;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;

/* renamed from: p.b  reason: case insensitive filesystem */
public abstract class C0845b extends Drawable implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    private d f15772a;

    /* renamed from: b  reason: collision with root package name */
    private Rect f15773b;

    /* renamed from: c  reason: collision with root package name */
    private Drawable f15774c;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f15775d;

    /* renamed from: e  reason: collision with root package name */
    private int f15776e = 255;

    /* renamed from: f  reason: collision with root package name */
    private boolean f15777f;

    /* renamed from: g  reason: collision with root package name */
    private int f15778g = -1;

    /* renamed from: h  reason: collision with root package name */
    private boolean f15779h;

    /* renamed from: i  reason: collision with root package name */
    private Runnable f15780i;

    /* renamed from: j  reason: collision with root package name */
    private long f15781j;

    /* renamed from: k  reason: collision with root package name */
    private long f15782k;

    /* renamed from: l  reason: collision with root package name */
    private c f15783l;

    /* renamed from: p.b$a */
    class a implements Runnable {
        a() {
        }

        public void run() {
            C0845b.this.a(true);
            C0845b.this.invalidateSelf();
        }
    }

    /* renamed from: p.b$b  reason: collision with other inner class name */
    private static class C0221b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* renamed from: p.b$c */
    static class c implements Drawable.Callback {

        /* renamed from: a  reason: collision with root package name */
        private Drawable.Callback f15785a;

        c() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f15785a;
            this.f15785a = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f15785a = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
            Drawable.Callback callback = this.f15785a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j4);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f15785a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: p.b$d */
    static abstract class d extends Drawable.ConstantState {

        /* renamed from: A  reason: collision with root package name */
        int f15786A = 0;

        /* renamed from: B  reason: collision with root package name */
        int f15787B = 0;

        /* renamed from: C  reason: collision with root package name */
        boolean f15788C;

        /* renamed from: D  reason: collision with root package name */
        ColorFilter f15789D;

        /* renamed from: E  reason: collision with root package name */
        boolean f15790E;

        /* renamed from: F  reason: collision with root package name */
        ColorStateList f15791F;

        /* renamed from: G  reason: collision with root package name */
        PorterDuff.Mode f15792G;

        /* renamed from: H  reason: collision with root package name */
        boolean f15793H;

        /* renamed from: I  reason: collision with root package name */
        boolean f15794I;

        /* renamed from: a  reason: collision with root package name */
        final C0845b f15795a;

        /* renamed from: b  reason: collision with root package name */
        Resources f15796b;

        /* renamed from: c  reason: collision with root package name */
        int f15797c;

        /* renamed from: d  reason: collision with root package name */
        int f15798d;

        /* renamed from: e  reason: collision with root package name */
        int f15799e;

        /* renamed from: f  reason: collision with root package name */
        SparseArray f15800f;

        /* renamed from: g  reason: collision with root package name */
        Drawable[] f15801g;

        /* renamed from: h  reason: collision with root package name */
        int f15802h;

        /* renamed from: i  reason: collision with root package name */
        boolean f15803i = false;

        /* renamed from: j  reason: collision with root package name */
        boolean f15804j;

        /* renamed from: k  reason: collision with root package name */
        Rect f15805k;

        /* renamed from: l  reason: collision with root package name */
        boolean f15806l = false;

        /* renamed from: m  reason: collision with root package name */
        boolean f15807m;

        /* renamed from: n  reason: collision with root package name */
        int f15808n;

        /* renamed from: o  reason: collision with root package name */
        int f15809o;

        /* renamed from: p  reason: collision with root package name */
        int f15810p;

        /* renamed from: q  reason: collision with root package name */
        int f15811q;

        /* renamed from: r  reason: collision with root package name */
        boolean f15812r;

        /* renamed from: s  reason: collision with root package name */
        int f15813s;

        /* renamed from: t  reason: collision with root package name */
        boolean f15814t;

        /* renamed from: u  reason: collision with root package name */
        boolean f15815u;

        /* renamed from: v  reason: collision with root package name */
        boolean f15816v;

        /* renamed from: w  reason: collision with root package name */
        boolean f15817w;

        /* renamed from: x  reason: collision with root package name */
        boolean f15818x = true;

        /* renamed from: y  reason: collision with root package name */
        boolean f15819y;

        /* renamed from: z  reason: collision with root package name */
        int f15820z;

        d(d dVar, C0845b bVar, Resources resources) {
            Resources resources2;
            int i4;
            this.f15795a = bVar;
            Rect rect = null;
            if (resources != null) {
                resources2 = resources;
            } else if (dVar != null) {
                resources2 = dVar.f15796b;
            } else {
                resources2 = null;
            }
            this.f15796b = resources2;
            if (dVar != null) {
                i4 = dVar.f15797c;
            } else {
                i4 = 0;
            }
            int f4 = C0845b.f(resources, i4);
            this.f15797c = f4;
            if (dVar != null) {
                this.f15798d = dVar.f15798d;
                this.f15799e = dVar.f15799e;
                this.f15816v = true;
                this.f15817w = true;
                this.f15803i = dVar.f15803i;
                this.f15806l = dVar.f15806l;
                this.f15818x = dVar.f15818x;
                this.f15819y = dVar.f15819y;
                this.f15820z = dVar.f15820z;
                this.f15786A = dVar.f15786A;
                this.f15787B = dVar.f15787B;
                this.f15788C = dVar.f15788C;
                this.f15789D = dVar.f15789D;
                this.f15790E = dVar.f15790E;
                this.f15791F = dVar.f15791F;
                this.f15792G = dVar.f15792G;
                this.f15793H = dVar.f15793H;
                this.f15794I = dVar.f15794I;
                if (dVar.f15797c == f4) {
                    if (dVar.f15804j) {
                        this.f15805k = dVar.f15805k != null ? new Rect(dVar.f15805k) : rect;
                        this.f15804j = true;
                    }
                    if (dVar.f15807m) {
                        this.f15808n = dVar.f15808n;
                        this.f15809o = dVar.f15809o;
                        this.f15810p = dVar.f15810p;
                        this.f15811q = dVar.f15811q;
                        this.f15807m = true;
                    }
                }
                if (dVar.f15812r) {
                    this.f15813s = dVar.f15813s;
                    this.f15812r = true;
                }
                if (dVar.f15814t) {
                    this.f15815u = dVar.f15815u;
                    this.f15814t = true;
                }
                Drawable[] drawableArr = dVar.f15801g;
                this.f15801g = new Drawable[drawableArr.length];
                this.f15802h = dVar.f15802h;
                SparseArray sparseArray = dVar.f15800f;
                if (sparseArray != null) {
                    this.f15800f = sparseArray.clone();
                } else {
                    this.f15800f = new SparseArray(this.f15802h);
                }
                int i5 = this.f15802h;
                for (int i6 = 0; i6 < i5; i6++) {
                    Drawable drawable = drawableArr[i6];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f15800f.put(i6, constantState);
                        } else {
                            this.f15801g[i6] = drawableArr[i6];
                        }
                    }
                }
                return;
            }
            this.f15801g = new Drawable[10];
            this.f15802h = 0;
        }

        private void e() {
            SparseArray sparseArray = this.f15800f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    this.f15801g[this.f15800f.keyAt(i4)] = s(((Drawable.ConstantState) this.f15800f.valueAt(i4)).newDrawable(this.f15796b));
                }
                this.f15800f = null;
            }
        }

        private Drawable s(Drawable drawable) {
            androidx.core.graphics.drawable.a.m(drawable, this.f15820z);
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f15795a);
            return mutate;
        }

        public final int a(Drawable drawable) {
            int i4 = this.f15802h;
            if (i4 >= this.f15801g.length) {
                o(i4, i4 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f15795a);
            this.f15801g[i4] = drawable;
            this.f15802h++;
            this.f15799e = drawable.getChangingConfigurations() | this.f15799e;
            p();
            this.f15805k = null;
            this.f15804j = false;
            this.f15807m = false;
            this.f15816v = false;
            return i4;
        }

        /* access modifiers changed from: package-private */
        public final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i4 = this.f15802h;
                Drawable[] drawableArr = this.f15801g;
                for (int i5 = 0; i5 < i4; i5++) {
                    Drawable drawable = drawableArr[i5];
                    if (drawable != null && androidx.core.graphics.drawable.a.b(drawable)) {
                        androidx.core.graphics.drawable.a.a(drawableArr[i5], theme);
                        this.f15799e |= drawableArr[i5].getChangingConfigurations();
                    }
                }
                y(C0221b.c(theme));
            }
        }

        public boolean c() {
            if (this.f15816v) {
                return this.f15817w;
            }
            e();
            this.f15816v = true;
            int i4 = this.f15802h;
            Drawable[] drawableArr = this.f15801g;
            for (int i5 = 0; i5 < i4; i5++) {
                if (drawableArr[i5].getConstantState() == null) {
                    this.f15817w = false;
                    return false;
                }
            }
            this.f15817w = true;
            return true;
        }

        public boolean canApplyTheme() {
            int i4 = this.f15802h;
            Drawable[] drawableArr = this.f15801g;
            for (int i5 = 0; i5 < i4; i5++) {
                Drawable drawable = drawableArr[i5];
                if (drawable == null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) this.f15800f.get(i5);
                    if (constantState != null && C0221b.a(constantState)) {
                        return true;
                    }
                } else if (androidx.core.graphics.drawable.a.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void d() {
            this.f15807m = true;
            e();
            int i4 = this.f15802h;
            Drawable[] drawableArr = this.f15801g;
            this.f15809o = -1;
            this.f15808n = -1;
            this.f15811q = 0;
            this.f15810p = 0;
            for (int i5 = 0; i5 < i4; i5++) {
                Drawable drawable = drawableArr[i5];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f15808n) {
                    this.f15808n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f15809o) {
                    this.f15809o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f15810p) {
                    this.f15810p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f15811q) {
                    this.f15811q = minimumHeight;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final int f() {
            return this.f15801g.length;
        }

        public final Drawable g(int i4) {
            int indexOfKey;
            Drawable drawable = this.f15801g[i4];
            if (drawable != null) {
                return drawable;
            }
            SparseArray sparseArray = this.f15800f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i4)) < 0) {
                return null;
            }
            Drawable s4 = s(((Drawable.ConstantState) this.f15800f.valueAt(indexOfKey)).newDrawable(this.f15796b));
            this.f15801g[i4] = s4;
            this.f15800f.removeAt(indexOfKey);
            if (this.f15800f.size() == 0) {
                this.f15800f = null;
            }
            return s4;
        }

        public int getChangingConfigurations() {
            return this.f15798d | this.f15799e;
        }

        public final int h() {
            return this.f15802h;
        }

        public final int i() {
            if (!this.f15807m) {
                d();
            }
            return this.f15809o;
        }

        public final int j() {
            if (!this.f15807m) {
                d();
            }
            return this.f15811q;
        }

        public final int k() {
            if (!this.f15807m) {
                d();
            }
            return this.f15810p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f15803i) {
                return null;
            }
            Rect rect2 = this.f15805k;
            if (rect2 != null || this.f15804j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i4 = this.f15802h;
            Drawable[] drawableArr = this.f15801g;
            for (int i5 = 0; i5 < i4; i5++) {
                if (drawableArr[i5].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i6 = rect3.left;
                    if (i6 > rect.left) {
                        rect.left = i6;
                    }
                    int i7 = rect3.top;
                    if (i7 > rect.top) {
                        rect.top = i7;
                    }
                    int i8 = rect3.right;
                    if (i8 > rect.right) {
                        rect.right = i8;
                    }
                    int i9 = rect3.bottom;
                    if (i9 > rect.bottom) {
                        rect.bottom = i9;
                    }
                }
            }
            this.f15804j = true;
            this.f15805k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f15807m) {
                d();
            }
            return this.f15808n;
        }

        public final int n() {
            int i4;
            if (this.f15812r) {
                return this.f15813s;
            }
            e();
            int i5 = this.f15802h;
            Drawable[] drawableArr = this.f15801g;
            if (i5 > 0) {
                i4 = drawableArr[0].getOpacity();
            } else {
                i4 = -2;
            }
            for (int i6 = 1; i6 < i5; i6++) {
                i4 = Drawable.resolveOpacity(i4, drawableArr[i6].getOpacity());
            }
            this.f15813s = i4;
            this.f15812r = true;
            return i4;
        }

        public void o(int i4, int i5) {
            Drawable[] drawableArr = new Drawable[i5];
            Drawable[] drawableArr2 = this.f15801g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i4);
            }
            this.f15801g = drawableArr;
        }

        /* access modifiers changed from: package-private */
        public void p() {
            this.f15812r = false;
            this.f15814t = false;
        }

        public final boolean q() {
            return this.f15806l;
        }

        /* access modifiers changed from: package-private */
        public abstract void r();

        public final void t(boolean z3) {
            this.f15806l = z3;
        }

        public final void u(int i4) {
            this.f15786A = i4;
        }

        public final void v(int i4) {
            this.f15787B = i4;
        }

        /* access modifiers changed from: package-private */
        public final boolean w(int i4, int i5) {
            int i6 = this.f15802h;
            Drawable[] drawableArr = this.f15801g;
            boolean z3 = false;
            for (int i7 = 0; i7 < i6; i7++) {
                Drawable drawable = drawableArr[i7];
                if (drawable != null) {
                    boolean m4 = androidx.core.graphics.drawable.a.m(drawable, i4);
                    if (i7 == i5) {
                        z3 = m4;
                    }
                }
            }
            this.f15820z = i4;
            return z3;
        }

        public final void x(boolean z3) {
            this.f15803i = z3;
        }

        /* access modifiers changed from: package-private */
        public final void y(Resources resources) {
            if (resources != null) {
                this.f15796b = resources;
                int f4 = C0845b.f(resources, this.f15797c);
                int i4 = this.f15797c;
                this.f15797c = f4;
                if (i4 != f4) {
                    this.f15807m = false;
                    this.f15804j = false;
                }
            }
        }
    }

    private void d(Drawable drawable) {
        if (this.f15783l == null) {
            this.f15783l = new c();
        }
        drawable.setCallback(this.f15783l.b(drawable.getCallback()));
        try {
            if (this.f15772a.f15786A <= 0 && this.f15777f) {
                drawable.setAlpha(this.f15776e);
            }
            d dVar = this.f15772a;
            if (dVar.f15790E) {
                drawable.setColorFilter(dVar.f15789D);
            } else {
                if (dVar.f15793H) {
                    androidx.core.graphics.drawable.a.o(drawable, dVar.f15791F);
                }
                d dVar2 = this.f15772a;
                if (dVar2.f15794I) {
                    androidx.core.graphics.drawable.a.p(drawable, dVar2.f15792G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f15772a.f15818x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
            androidx.core.graphics.drawable.a.j(drawable, this.f15772a.f15788C);
            Rect rect = this.f15773b;
            if (rect != null) {
                androidx.core.graphics.drawable.a.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            drawable.setCallback(this.f15783l.a());
        } catch (Throwable th) {
            drawable.setCallback(this.f15783l.a());
            throw th;
        }
    }

    private boolean e() {
        if (!isAutoMirrored() || androidx.core.graphics.drawable.a.f(this) != 1) {
            return false;
        }
        return true;
    }

    static int f(Resources resources, int i4) {
        if (resources != null) {
            i4 = resources.getDisplayMetrics().densityDpi;
        }
        if (i4 == 0) {
            return 160;
        }
        return i4;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f15777f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f15774c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L_0x0036
            long r9 = r13.f15781j
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x0038
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.f15776e
            r3.setAlpha(r9)
            r13.f15781j = r6
            goto L_0x0038
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            p.b$d r10 = r13.f15772a
            int r10 = r10.f15786A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f15776e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L_0x0039
        L_0x0036:
            r13.f15781j = r6
        L_0x0038:
            r3 = r8
        L_0x0039:
            android.graphics.drawable.Drawable r9 = r13.f15775d
            if (r9 == 0) goto L_0x0061
            long r10 = r13.f15782k
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L_0x0063
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0050
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f15775d = r0
            r13.f15782k = r6
            goto L_0x0063
        L_0x0050:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            p.b$d r4 = r13.f15772a
            int r4 = r4.f15787B
            int r3 = r3 / r4
            int r4 = r13.f15776e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0064
        L_0x0061:
            r13.f15782k = r6
        L_0x0063:
            r0 = r3
        L_0x0064:
            if (r14 == 0) goto L_0x0070
            if (r0 == 0) goto L_0x0070
            java.lang.Runnable r14 = r13.f15780i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C0845b.a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        this.f15772a.b(theme);
    }

    /* access modifiers changed from: package-private */
    public abstract d b();

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f15778g;
    }

    public boolean canApplyTheme() {
        return this.f15772a.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f15774c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f15775d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f15778g
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            p.b$d r0 = r9.f15772a
            int r0 = r0.f15787B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f15775d
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f15774c
            if (r0 == 0) goto L_0x0029
            r9.f15775d = r0
            p.b$d r0 = r9.f15772a
            int r0 = r0.f15787B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f15782k = r0
            goto L_0x0035
        L_0x0029:
            r9.f15775d = r4
            r9.f15782k = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f15774c
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            p.b$d r0 = r9.f15772a
            int r1 = r0.f15802h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.f15774c = r0
            r9.f15778g = r10
            if (r0 == 0) goto L_0x005a
            p.b$d r10 = r9.f15772a
            int r10 = r10.f15786A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f15781j = r2
        L_0x0051:
            r9.d(r0)
            goto L_0x005a
        L_0x0055:
            r9.f15774c = r4
            r10 = -1
            r9.f15778g = r10
        L_0x005a:
            long r0 = r9.f15781j
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L_0x0067
            long r1 = r9.f15782k
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r10 = r9.f15780i
            if (r10 != 0) goto L_0x0073
            p.b$a r10 = new p.b$a
            r10.<init>()
            r9.f15780i = r10
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r10)
        L_0x0076:
            r9.a(r0)
        L_0x0079:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C0845b.g(int):boolean");
    }

    public int getAlpha() {
        return this.f15776e;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f15772a.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f15772a.c()) {
            return null;
        }
        this.f15772a.f15798d = getChangingConfigurations();
        return this.f15772a;
    }

    public Drawable getCurrent() {
        return this.f15774c;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f15773b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f15772a.q()) {
            return this.f15772a.i();
        }
        Drawable drawable = this.f15774c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f15772a.q()) {
            return this.f15772a.m();
        }
        Drawable drawable = this.f15774c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f15772a.q()) {
            return this.f15772a.j();
        }
        Drawable drawable = this.f15774c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f15772a.q()) {
            return this.f15772a.k();
        }
        Drawable drawable = this.f15774c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f15774c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f15772a.n();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f15774c;
        if (drawable != null) {
            C0221b.b(drawable, outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z3;
        Rect l4 = this.f15772a.l();
        if (l4 != null) {
            rect.set(l4);
            if ((l4.right | l4.left | l4.top | l4.bottom) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            Drawable drawable = this.f15774c;
            if (drawable != null) {
                z3 = drawable.getPadding(rect);
            } else {
                z3 = super.getPadding(rect);
            }
        }
        if (e()) {
            int i4 = rect.left;
            rect.left = rect.right;
            rect.right = i4;
        }
        return z3;
    }

    /* access modifiers changed from: package-private */
    public void h(d dVar) {
        this.f15772a = dVar;
        int i4 = this.f15778g;
        if (i4 >= 0) {
            Drawable g4 = dVar.g(i4);
            this.f15774c = g4;
            if (g4 != null) {
                d(g4);
            }
        }
        this.f15775d = null;
    }

    /* access modifiers changed from: package-private */
    public final void i(Resources resources) {
        this.f15772a.y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f15772a;
        if (dVar != null) {
            dVar.p();
        }
        if (drawable == this.f15774c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f15772a.f15788C;
    }

    public void jumpToCurrentState() {
        boolean z3;
        Drawable drawable = this.f15775d;
        boolean z4 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f15775d = null;
            z3 = true;
        } else {
            z3 = false;
        }
        Drawable drawable2 = this.f15774c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f15777f) {
                this.f15774c.setAlpha(this.f15776e);
            }
        }
        if (this.f15782k != 0) {
            this.f15782k = 0;
            z3 = true;
        }
        if (this.f15781j != 0) {
            this.f15781j = 0;
        } else {
            z4 = z3;
        }
        if (z4) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f15779h && super.mutate() == this) {
            d b4 = b();
            b4.r();
            h(b4);
            this.f15779h = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f15775d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f15774c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i4) {
        return this.f15772a.w(i4, c());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i4) {
        Drawable drawable = this.f15775d;
        if (drawable != null) {
            return drawable.setLevel(i4);
        }
        Drawable drawable2 = this.f15774c;
        if (drawable2 != null) {
            return drawable2.setLevel(i4);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        if (drawable == this.f15774c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j4);
        }
    }

    public void setAlpha(int i4) {
        if (!this.f15777f || this.f15776e != i4) {
            this.f15777f = true;
            this.f15776e = i4;
            Drawable drawable = this.f15774c;
            if (drawable == null) {
                return;
            }
            if (this.f15781j == 0) {
                drawable.setAlpha(i4);
            } else {
                a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z3) {
        d dVar = this.f15772a;
        if (dVar.f15788C != z3) {
            dVar.f15788C = z3;
            Drawable drawable = this.f15774c;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.j(drawable, z3);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f15772a;
        dVar.f15790E = true;
        if (dVar.f15789D != colorFilter) {
            dVar.f15789D = colorFilter;
            Drawable drawable = this.f15774c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z3) {
        d dVar = this.f15772a;
        if (dVar.f15818x != z3) {
            dVar.f15818x = z3;
            Drawable drawable = this.f15774c;
            if (drawable != null) {
                drawable.setDither(z3);
            }
        }
    }

    public void setHotspot(float f4, float f5) {
        Drawable drawable = this.f15774c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, f4, f5);
        }
    }

    public void setHotspotBounds(int i4, int i5, int i6, int i7) {
        Rect rect = this.f15773b;
        if (rect == null) {
            this.f15773b = new Rect(i4, i5, i6, i7);
        } else {
            rect.set(i4, i5, i6, i7);
        }
        Drawable drawable = this.f15774c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.l(drawable, i4, i5, i6, i7);
        }
    }

    public void setTint(int i4) {
        setTintList(ColorStateList.valueOf(i4));
    }

    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f15772a;
        dVar.f15793H = true;
        if (dVar.f15791F != colorStateList) {
            dVar.f15791F = colorStateList;
            androidx.core.graphics.drawable.a.o(this.f15774c, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f15772a;
        dVar.f15794I = true;
        if (dVar.f15792G != mode) {
            dVar.f15792G = mode;
            androidx.core.graphics.drawable.a.p(this.f15774c, mode);
        }
    }

    public boolean setVisible(boolean z3, boolean z4) {
        boolean visible = super.setVisible(z3, z4);
        Drawable drawable = this.f15775d;
        if (drawable != null) {
            drawable.setVisible(z3, z4);
        }
        Drawable drawable2 = this.f15774c;
        if (drawable2 != null) {
            drawable2.setVisible(z3, z4);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f15774c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
