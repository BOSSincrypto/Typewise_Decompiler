package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.P;

public abstract class a implements View.OnTouchListener {

    /* renamed from: r  reason: collision with root package name */
    private static final int f5408r = ViewConfiguration.getTapTimeout();

    /* renamed from: a  reason: collision with root package name */
    final C0088a f5409a = new C0088a();

    /* renamed from: b  reason: collision with root package name */
    private final Interpolator f5410b = new AccelerateInterpolator();

    /* renamed from: c  reason: collision with root package name */
    final View f5411c;

    /* renamed from: d  reason: collision with root package name */
    private Runnable f5412d;

    /* renamed from: e  reason: collision with root package name */
    private float[] f5413e = {0.0f, 0.0f};

    /* renamed from: f  reason: collision with root package name */
    private float[] f5414f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: g  reason: collision with root package name */
    private int f5415g;

    /* renamed from: h  reason: collision with root package name */
    private int f5416h;

    /* renamed from: i  reason: collision with root package name */
    private float[] f5417i = {0.0f, 0.0f};

    /* renamed from: j  reason: collision with root package name */
    private float[] f5418j = {0.0f, 0.0f};

    /* renamed from: k  reason: collision with root package name */
    private float[] f5419k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: l  reason: collision with root package name */
    private boolean f5420l;

    /* renamed from: m  reason: collision with root package name */
    boolean f5421m;

    /* renamed from: n  reason: collision with root package name */
    boolean f5422n;

    /* renamed from: o  reason: collision with root package name */
    boolean f5423o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f5424p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f5425q;

    /* renamed from: androidx.core.widget.a$a  reason: collision with other inner class name */
    private static class C0088a {

        /* renamed from: a  reason: collision with root package name */
        private int f5426a;

        /* renamed from: b  reason: collision with root package name */
        private int f5427b;

        /* renamed from: c  reason: collision with root package name */
        private float f5428c;

        /* renamed from: d  reason: collision with root package name */
        private float f5429d;

        /* renamed from: e  reason: collision with root package name */
        private long f5430e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        private long f5431f = 0;

        /* renamed from: g  reason: collision with root package name */
        private int f5432g = 0;

        /* renamed from: h  reason: collision with root package name */
        private int f5433h = 0;

        /* renamed from: i  reason: collision with root package name */
        private long f5434i = -1;

        /* renamed from: j  reason: collision with root package name */
        private float f5435j;

        /* renamed from: k  reason: collision with root package name */
        private int f5436k;

        C0088a() {
        }

        private float e(long j4) {
            long j5 = this.f5430e;
            if (j4 < j5) {
                return 0.0f;
            }
            long j6 = this.f5434i;
            if (j6 < 0 || j4 < j6) {
                return a.e(((float) (j4 - j5)) / ((float) this.f5426a), 0.0f, 1.0f) * 0.5f;
            }
            float f4 = this.f5435j;
            return (1.0f - f4) + (f4 * a.e(((float) (j4 - j6)) / ((float) this.f5436k), 0.0f, 1.0f));
        }

        private float g(float f4) {
            return (-4.0f * f4 * f4) + (f4 * 4.0f);
        }

        public void a() {
            if (this.f5431f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g4 = g(e(currentAnimationTimeMillis));
                this.f5431f = currentAnimationTimeMillis;
                float f4 = ((float) (currentAnimationTimeMillis - this.f5431f)) * g4;
                this.f5432g = (int) (this.f5428c * f4);
                this.f5433h = (int) (f4 * this.f5429d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.f5432g;
        }

        public int c() {
            return this.f5433h;
        }

        public int d() {
            float f4 = this.f5428c;
            return (int) (f4 / Math.abs(f4));
        }

        public int f() {
            float f4 = this.f5429d;
            return (int) (f4 / Math.abs(f4));
        }

        public boolean h() {
            if (this.f5434i <= 0 || AnimationUtils.currentAnimationTimeMillis() <= this.f5434i + ((long) this.f5436k)) {
                return false;
            }
            return true;
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f5436k = a.f((int) (currentAnimationTimeMillis - this.f5430e), 0, this.f5427b);
            this.f5435j = e(currentAnimationTimeMillis);
            this.f5434i = currentAnimationTimeMillis;
        }

        public void j(int i4) {
            this.f5427b = i4;
        }

        public void k(int i4) {
            this.f5426a = i4;
        }

        public void l(float f4, float f5) {
            this.f5428c = f4;
            this.f5429d = f5;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f5430e = currentAnimationTimeMillis;
            this.f5434i = -1;
            this.f5431f = currentAnimationTimeMillis;
            this.f5435j = 0.5f;
            this.f5432g = 0;
            this.f5433h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        public void run() {
            a aVar = a.this;
            if (aVar.f5423o) {
                if (aVar.f5421m) {
                    aVar.f5421m = false;
                    aVar.f5409a.m();
                }
                C0088a aVar2 = a.this.f5409a;
                if (aVar2.h() || !a.this.u()) {
                    a.this.f5423o = false;
                    return;
                }
                a aVar3 = a.this;
                if (aVar3.f5422n) {
                    aVar3.f5422n = false;
                    aVar3.c();
                }
                aVar2.a();
                a.this.j(aVar2.b(), aVar2.c());
                P.g0(a.this.f5411c, this);
            }
        }
    }

    public a(View view) {
        this.f5411c = view;
        float f4 = Resources.getSystem().getDisplayMetrics().density;
        float f5 = (float) ((int) ((1575.0f * f4) + 0.5f));
        o(f5, f5);
        float f6 = (float) ((int) ((f4 * 315.0f) + 0.5f));
        p(f6, f6);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f5408r);
        r(500);
        q(500);
    }

    private float d(int i4, float f4, float f5, float f6) {
        float h4 = h(this.f5413e[i4], f5, this.f5414f[i4], f4);
        int i5 = (h4 > 0.0f ? 1 : (h4 == 0.0f ? 0 : -1));
        if (i5 == 0) {
            return 0.0f;
        }
        float f7 = this.f5417i[i4];
        float f8 = this.f5418j[i4];
        float f9 = this.f5419k[i4];
        float f10 = f7 * f6;
        if (i5 > 0) {
            return e(h4 * f10, f8, f9);
        }
        return -e((-h4) * f10, f8, f9);
    }

    static float e(float f4, float f5, float f6) {
        if (f4 > f6) {
            return f6;
        }
        return f4 < f5 ? f5 : f4;
    }

    static int f(int i4, int i5, int i6) {
        if (i4 > i6) {
            return i6;
        }
        return i4 < i5 ? i5 : i4;
    }

    private float g(float f4, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        int i4 = this.f5415g;
        if (i4 == 0 || i4 == 1) {
            if (f4 < f5) {
                if (f4 >= 0.0f) {
                    return 1.0f - (f4 / f5);
                }
                if (!this.f5423o || i4 != 1) {
                    return 0.0f;
                }
                return 1.0f;
            }
        } else if (i4 == 2 && f4 < 0.0f) {
            return f4 / (-f5);
        }
        return 0.0f;
    }

    private float h(float f4, float f5, float f6, float f7) {
        float f8;
        float e4 = e(f4 * f5, 0.0f, f6);
        float g4 = g(f5 - f7, e4) - g(f7, e4);
        if (g4 < 0.0f) {
            f8 = -this.f5410b.getInterpolation(-g4);
        } else if (g4 <= 0.0f) {
            return 0.0f;
        } else {
            f8 = this.f5410b.getInterpolation(g4);
        }
        return e(f8, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f5421m) {
            this.f5423o = false;
        } else {
            this.f5409a.i();
        }
    }

    private void v() {
        int i4;
        if (this.f5412d == null) {
            this.f5412d = new b();
        }
        this.f5423o = true;
        this.f5421m = true;
        if (this.f5420l || (i4 = this.f5416h) <= 0) {
            this.f5412d.run();
        } else {
            P.h0(this.f5411c, this.f5412d, (long) i4);
        }
        this.f5420l = true;
    }

    public abstract boolean a(int i4);

    public abstract boolean b(int i4);

    /* access modifiers changed from: package-private */
    public void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f5411c.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i4, int i5);

    public a k(int i4) {
        this.f5416h = i4;
        return this;
    }

    public a l(int i4) {
        this.f5415g = i4;
        return this;
    }

    public a m(boolean z3) {
        if (this.f5424p && !z3) {
            i();
        }
        this.f5424p = z3;
        return this;
    }

    public a n(float f4, float f5) {
        float[] fArr = this.f5414f;
        fArr[0] = f4;
        fArr[1] = f5;
        return this;
    }

    public a o(float f4, float f5) {
        float[] fArr = this.f5419k;
        fArr[0] = f4 / 1000.0f;
        fArr[1] = f5 / 1000.0f;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f5424p
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.i()
            goto L_0x0058
        L_0x001a:
            r5.f5422n = r2
            r5.f5420l = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f5411c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f5411c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f5409a
            r7.l(r0, r6)
            boolean r6 = r5.f5423o
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.u()
            if (r6 == 0) goto L_0x0058
            r5.v()
        L_0x0058:
            boolean r6 = r5.f5425q
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f5423o
            if (r6 == 0) goto L_0x0061
            r1 = r2
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f4, float f5) {
        float[] fArr = this.f5418j;
        fArr[0] = f4 / 1000.0f;
        fArr[1] = f5 / 1000.0f;
        return this;
    }

    public a q(int i4) {
        this.f5409a.j(i4);
        return this;
    }

    public a r(int i4) {
        this.f5409a.k(i4);
        return this;
    }

    public a s(float f4, float f5) {
        float[] fArr = this.f5413e;
        fArr[0] = f4;
        fArr[1] = f5;
        return this;
    }

    public a t(float f4, float f5) {
        float[] fArr = this.f5417i;
        fArr[0] = f4 / 1000.0f;
        fArr[1] = f5 / 1000.0f;
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean u() {
        C0088a aVar = this.f5409a;
        int f4 = aVar.f();
        int d4 = aVar.d();
        if ((f4 == 0 || !b(f4)) && (d4 == 0 || !a(d4))) {
            return false;
        }
        return true;
    }
}
