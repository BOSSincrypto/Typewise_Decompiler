package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.P;
import androidx.recyclerview.widget.RecyclerView;

class i extends RecyclerView.n implements RecyclerView.r {

    /* renamed from: D  reason: collision with root package name */
    private static final int[] f6613D = {16842919};

    /* renamed from: E  reason: collision with root package name */
    private static final int[] f6614E = new int[0];

    /* renamed from: A  reason: collision with root package name */
    int f6615A;

    /* renamed from: B  reason: collision with root package name */
    private final Runnable f6616B;

    /* renamed from: C  reason: collision with root package name */
    private final RecyclerView.s f6617C;

    /* renamed from: a  reason: collision with root package name */
    private final int f6618a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6619b;

    /* renamed from: c  reason: collision with root package name */
    final StateListDrawable f6620c;

    /* renamed from: d  reason: collision with root package name */
    final Drawable f6621d;

    /* renamed from: e  reason: collision with root package name */
    private final int f6622e;

    /* renamed from: f  reason: collision with root package name */
    private final int f6623f;

    /* renamed from: g  reason: collision with root package name */
    private final StateListDrawable f6624g;

    /* renamed from: h  reason: collision with root package name */
    private final Drawable f6625h;

    /* renamed from: i  reason: collision with root package name */
    private final int f6626i;

    /* renamed from: j  reason: collision with root package name */
    private final int f6627j;

    /* renamed from: k  reason: collision with root package name */
    int f6628k;

    /* renamed from: l  reason: collision with root package name */
    int f6629l;

    /* renamed from: m  reason: collision with root package name */
    float f6630m;

    /* renamed from: n  reason: collision with root package name */
    int f6631n;

    /* renamed from: o  reason: collision with root package name */
    int f6632o;

    /* renamed from: p  reason: collision with root package name */
    float f6633p;

    /* renamed from: q  reason: collision with root package name */
    private int f6634q = 0;

    /* renamed from: r  reason: collision with root package name */
    private int f6635r = 0;

    /* renamed from: s  reason: collision with root package name */
    private RecyclerView f6636s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f6637t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f6638u = false;

    /* renamed from: v  reason: collision with root package name */
    private int f6639v = 0;

    /* renamed from: w  reason: collision with root package name */
    private int f6640w = 0;

    /* renamed from: x  reason: collision with root package name */
    private final int[] f6641x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    private final int[] f6642y = new int[2];

    /* renamed from: z  reason: collision with root package name */
    final ValueAnimator f6643z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            i.this.q(500);
        }
    }

    class b extends RecyclerView.s {
        b() {
        }

        public void b(RecyclerView recyclerView, int i4, int i5) {
            i.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    private class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f6646a = false;

        c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f6646a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f6646a) {
                this.f6646a = false;
            } else if (((Float) i.this.f6643z.getAnimatedValue()).floatValue() == 0.0f) {
                i iVar = i.this;
                iVar.f6615A = 0;
                iVar.y(0);
            } else {
                i iVar2 = i.this;
                iVar2.f6615A = 2;
                iVar2.v();
            }
        }
    }

    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            i.this.f6620c.setAlpha(floatValue);
            i.this.f6621d.setAlpha(floatValue);
            i.this.v();
        }
    }

    i(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i4, int i5, int i6) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f6643z = ofFloat;
        this.f6615A = 0;
        this.f6616B = new a();
        this.f6617C = new b();
        this.f6620c = stateListDrawable;
        this.f6621d = drawable;
        this.f6624g = stateListDrawable2;
        this.f6625h = drawable2;
        this.f6622e = Math.max(i4, stateListDrawable.getIntrinsicWidth());
        this.f6623f = Math.max(i4, drawable.getIntrinsicWidth());
        this.f6626i = Math.max(i4, stateListDrawable2.getIntrinsicWidth());
        this.f6627j = Math.max(i4, drawable2.getIntrinsicWidth());
        this.f6618a = i5;
        this.f6619b = i6;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        j(recyclerView);
    }

    private void C(float f4) {
        int[] p4 = p();
        float max = Math.max((float) p4[0], Math.min((float) p4[1], f4));
        if (Math.abs(((float) this.f6629l) - max) >= 2.0f) {
            int x3 = x(this.f6630m, max, p4, this.f6636s.computeVerticalScrollRange(), this.f6636s.computeVerticalScrollOffset(), this.f6635r);
            if (x3 != 0) {
                this.f6636s.scrollBy(0, x3);
            }
            this.f6630m = max;
        }
    }

    private void k() {
        this.f6636s.removeCallbacks(this.f6616B);
    }

    private void l() {
        this.f6636s.g1(this);
        this.f6636s.h1(this);
        this.f6636s.i1(this.f6617C);
        k();
    }

    private void m(Canvas canvas) {
        int i4 = this.f6635r;
        int i5 = this.f6626i;
        int i6 = i4 - i5;
        int i7 = this.f6632o;
        int i8 = this.f6631n;
        int i9 = i7 - (i8 / 2);
        this.f6624g.setBounds(0, 0, i8, i5);
        this.f6625h.setBounds(0, 0, this.f6634q, this.f6627j);
        canvas.translate(0.0f, (float) i6);
        this.f6625h.draw(canvas);
        canvas.translate((float) i9, 0.0f);
        this.f6624g.draw(canvas);
        canvas.translate((float) (-i9), (float) (-i6));
    }

    private void n(Canvas canvas) {
        int i4 = this.f6634q;
        int i5 = this.f6622e;
        int i6 = i4 - i5;
        int i7 = this.f6629l;
        int i8 = this.f6628k;
        int i9 = i7 - (i8 / 2);
        this.f6620c.setBounds(0, 0, i5, i8);
        this.f6621d.setBounds(0, 0, this.f6623f, this.f6635r);
        if (s()) {
            this.f6621d.draw(canvas);
            canvas.translate((float) this.f6622e, (float) i9);
            canvas.scale(-1.0f, 1.0f);
            this.f6620c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate((float) (-this.f6622e), (float) (-i9));
            return;
        }
        canvas.translate((float) i6, 0.0f);
        this.f6621d.draw(canvas);
        canvas.translate(0.0f, (float) i9);
        this.f6620c.draw(canvas);
        canvas.translate((float) (-i6), (float) (-i9));
    }

    private int[] o() {
        int[] iArr = this.f6642y;
        int i4 = this.f6619b;
        iArr[0] = i4;
        iArr[1] = this.f6634q - i4;
        return iArr;
    }

    private int[] p() {
        int[] iArr = this.f6641x;
        int i4 = this.f6619b;
        iArr[0] = i4;
        iArr[1] = this.f6635r - i4;
        return iArr;
    }

    private void r(float f4) {
        int[] o4 = o();
        float max = Math.max((float) o4[0], Math.min((float) o4[1], f4));
        if (Math.abs(((float) this.f6632o) - max) >= 2.0f) {
            int x3 = x(this.f6633p, max, o4, this.f6636s.computeHorizontalScrollRange(), this.f6636s.computeHorizontalScrollOffset(), this.f6634q);
            if (x3 != 0) {
                this.f6636s.scrollBy(x3, 0);
            }
            this.f6633p = max;
        }
    }

    private boolean s() {
        if (P.B(this.f6636s) == 1) {
            return true;
        }
        return false;
    }

    private void w(int i4) {
        k();
        this.f6636s.postDelayed(this.f6616B, (long) i4);
    }

    private int x(float f4, float f5, int[] iArr, int i4, int i5, int i6) {
        int i7 = iArr[1] - iArr[0];
        if (i7 == 0) {
            return 0;
        }
        int i8 = i4 - i6;
        int i9 = (int) (((f5 - f4) / ((float) i7)) * ((float) i8));
        int i10 = i5 + i9;
        if (i10 >= i8 || i10 < 0) {
            return 0;
        }
        return i9;
    }

    private void z() {
        this.f6636s.j(this);
        this.f6636s.l(this);
        this.f6636s.m(this.f6617C);
    }

    public void A() {
        int i4 = this.f6615A;
        if (i4 != 0) {
            if (i4 == 3) {
                this.f6643z.cancel();
            } else {
                return;
            }
        }
        this.f6615A = 1;
        ValueAnimator valueAnimator = this.f6643z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f6643z.setDuration(500);
        this.f6643z.setStartDelay(0);
        this.f6643z.start();
    }

    /* access modifiers changed from: package-private */
    public void B(int i4, int i5) {
        boolean z3;
        boolean z4;
        int computeVerticalScrollRange = this.f6636s.computeVerticalScrollRange();
        int i6 = this.f6635r;
        if (computeVerticalScrollRange - i6 <= 0 || i6 < this.f6618a) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f6637t = z3;
        int computeHorizontalScrollRange = this.f6636s.computeHorizontalScrollRange();
        int i7 = this.f6634q;
        if (computeHorizontalScrollRange - i7 <= 0 || i7 < this.f6618a) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f6638u = z4;
        boolean z5 = this.f6637t;
        if (z5 || z4) {
            if (z5) {
                float f4 = (float) i6;
                this.f6629l = (int) ((f4 * (((float) i5) + (f4 / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f6628k = Math.min(i6, (i6 * i6) / computeVerticalScrollRange);
            }
            if (this.f6638u) {
                float f5 = (float) i7;
                this.f6632o = (int) ((f5 * (((float) i4) + (f5 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f6631n = Math.min(i7, (i7 * i7) / computeHorizontalScrollRange);
            }
            int i8 = this.f6639v;
            if (i8 == 0 || i8 == 1) {
                y(1);
            }
        } else if (this.f6639v != 0) {
            y(0);
        }
    }

    public boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i4 = this.f6639v;
        if (i4 == 1) {
            boolean u3 = u(motionEvent.getX(), motionEvent.getY());
            boolean t4 = t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!u3 && !t4) {
                return false;
            }
            if (t4) {
                this.f6640w = 1;
                this.f6633p = (float) ((int) motionEvent.getX());
            } else if (u3) {
                this.f6640w = 2;
                this.f6630m = (float) ((int) motionEvent.getY());
            }
            y(2);
        } else if (i4 != 2) {
            return false;
        }
        return true;
    }

    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f6639v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean u3 = u(motionEvent.getX(), motionEvent.getY());
                boolean t4 = t(motionEvent.getX(), motionEvent.getY());
                if (u3 || t4) {
                    if (t4) {
                        this.f6640w = 1;
                        this.f6633p = (float) ((int) motionEvent.getX());
                    } else if (u3) {
                        this.f6640w = 2;
                        this.f6630m = (float) ((int) motionEvent.getY());
                    }
                    y(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f6639v == 2) {
                this.f6630m = 0.0f;
                this.f6633p = 0.0f;
                y(1);
                this.f6640w = 0;
            } else if (motionEvent.getAction() == 2 && this.f6639v == 2) {
                A();
                if (this.f6640w == 1) {
                    r(motionEvent.getX());
                }
                if (this.f6640w == 2) {
                    C(motionEvent.getY());
                }
            }
        }
    }

    public void c(boolean z3) {
    }

    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        if (this.f6634q != this.f6636s.getWidth() || this.f6635r != this.f6636s.getHeight()) {
            this.f6634q = this.f6636s.getWidth();
            this.f6635r = this.f6636s.getHeight();
            y(0);
        } else if (this.f6615A != 0) {
            if (this.f6637t) {
                n(canvas);
            }
            if (this.f6638u) {
                m(canvas);
            }
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f6636s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                l();
            }
            this.f6636s = recyclerView;
            if (recyclerView != null) {
                z();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void q(int i4) {
        int i5 = this.f6615A;
        if (i5 == 1) {
            this.f6643z.cancel();
        } else if (i5 != 2) {
            return;
        }
        this.f6615A = 3;
        ValueAnimator valueAnimator = this.f6643z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f6643z.setDuration((long) i4);
        this.f6643z.start();
    }

    /* access modifiers changed from: package-private */
    public boolean t(float f4, float f5) {
        if (f5 >= ((float) (this.f6635r - this.f6626i))) {
            int i4 = this.f6632o;
            int i5 = this.f6631n;
            if (f4 < ((float) (i4 - (i5 / 2))) || f4 > ((float) (i4 + (i5 / 2)))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean u(float f4, float f5) {
        if (!s() ? f4 >= ((float) (this.f6634q - this.f6622e)) : f4 <= ((float) this.f6622e)) {
            int i4 = this.f6629l;
            int i5 = this.f6628k;
            if (f5 < ((float) (i4 - (i5 / 2))) || f5 > ((float) (i4 + (i5 / 2)))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void v() {
        this.f6636s.invalidate();
    }

    /* access modifiers changed from: package-private */
    public void y(int i4) {
        if (i4 == 2 && this.f6639v != 2) {
            this.f6620c.setState(f6613D);
            k();
        }
        if (i4 == 0) {
            v();
        } else {
            A();
        }
        if (this.f6639v == 2 && i4 != 2) {
            this.f6620c.setState(f6614E);
            w(1200);
        } else if (i4 == 1) {
            w(1500);
        }
        this.f6639v = i4;
    }
}
