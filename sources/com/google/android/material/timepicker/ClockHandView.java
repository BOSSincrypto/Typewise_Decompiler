package com.google.android.material.timepicker;

import L1.d;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.P;
import com.google.android.material.internal.m;
import java.util.ArrayList;
import java.util.List;
import z1.C0970a;
import z1.C0972c;
import z1.i;
import z1.j;

class ClockHandView extends View {

    /* renamed from: a  reason: collision with root package name */
    private final int f12480a;

    /* renamed from: b  reason: collision with root package name */
    private final TimeInterpolator f12481b;

    /* renamed from: c  reason: collision with root package name */
    private final ValueAnimator f12482c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12483d;

    /* renamed from: e  reason: collision with root package name */
    private float f12484e;

    /* renamed from: f  reason: collision with root package name */
    private float f12485f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f12486g;

    /* renamed from: h  reason: collision with root package name */
    private final int f12487h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f12488i;

    /* renamed from: j  reason: collision with root package name */
    private final List f12489j;

    /* renamed from: k  reason: collision with root package name */
    private final int f12490k;

    /* renamed from: l  reason: collision with root package name */
    private final float f12491l;

    /* renamed from: m  reason: collision with root package name */
    private final Paint f12492m;

    /* renamed from: n  reason: collision with root package name */
    private final RectF f12493n;

    /* renamed from: o  reason: collision with root package name */
    private final int f12494o;

    /* renamed from: p  reason: collision with root package name */
    private float f12495p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f12496q;

    /* renamed from: r  reason: collision with root package name */
    private double f12497r;

    /* renamed from: s  reason: collision with root package name */
    private int f12498s;

    /* renamed from: t  reason: collision with root package name */
    private int f12499t;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
        void a(float f4, boolean z3);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0970a.materialClockStyle);
    }

    private void c(float f4, float f5) {
        int i4 = 2;
        if (K1.a.a((float) (getWidth() / 2), (float) (getHeight() / 2), f4, f5) > ((float) h(2)) + m.c(getContext(), 12)) {
            i4 = 1;
        }
        this.f12499t = i4;
    }

    private void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int h4 = h(this.f12499t);
        float f4 = (float) width;
        float f5 = (float) h4;
        float f6 = (float) height;
        this.f12492m.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) Math.cos(this.f12497r)) * f5) + f4, (f5 * ((float) Math.sin(this.f12497r))) + f6, (float) this.f12490k, this.f12492m);
        double sin = Math.sin(this.f12497r);
        double cos = Math.cos(this.f12497r);
        double d4 = (double) ((float) (h4 - this.f12490k));
        float f7 = (float) (width + ((int) (cos * d4)));
        float f8 = (float) (height + ((int) (d4 * sin)));
        this.f12492m.setStrokeWidth((float) this.f12494o);
        canvas.drawLine(f4, f6, f7, f8, this.f12492m);
        canvas.drawCircle(f4, f6, this.f12491l, this.f12492m);
    }

    private int f(float f4, float f5) {
        int degrees = (int) Math.toDegrees(Math.atan2((double) (f5 - ((float) (getHeight() / 2))), (double) (f4 - ((float) (getWidth() / 2)))));
        int i4 = degrees + 90;
        if (i4 < 0) {
            return degrees + 450;
        }
        return i4;
    }

    private int h(int i4) {
        if (i4 == 2) {
            return Math.round(((float) this.f12498s) * 0.66f);
        }
        return this.f12498s;
    }

    private Pair j(float f4) {
        float g4 = g();
        if (Math.abs(g4 - f4) > 180.0f) {
            if (g4 > 180.0f && f4 < 180.0f) {
                f4 += 360.0f;
            }
            if (g4 < 180.0f && f4 > 180.0f) {
                g4 += 360.0f;
            }
        }
        return new Pair(Float.valueOf(g4), Float.valueOf(f4));
    }

    private boolean k(float f4, float f5, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        float f6 = (float) f(f4, f5);
        boolean z7 = false;
        if (g() != f6) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z4 && z6) {
            return true;
        }
        if (!z6 && !z3) {
            return false;
        }
        if (z5 && this.f12483d) {
            z7 = true;
        }
        o(f6, z7);
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l(ValueAnimator valueAnimator) {
        p(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void p(float f4, boolean z3) {
        float f5 = f4 % 360.0f;
        this.f12495p = f5;
        this.f12497r = Math.toRadians((double) (f5 - 90.0f));
        float h4 = (float) h(this.f12499t);
        float width = ((float) (getWidth() / 2)) + (((float) Math.cos(this.f12497r)) * h4);
        float height = ((float) (getHeight() / 2)) + (h4 * ((float) Math.sin(this.f12497r)));
        RectF rectF = this.f12493n;
        int i4 = this.f12490k;
        rectF.set(width - ((float) i4), height - ((float) i4), width + ((float) i4), height + ((float) i4));
        for (b a4 : this.f12489j) {
            a4.a(f5, z3);
        }
        invalidate();
    }

    public void b(b bVar) {
        this.f12489j.add(bVar);
    }

    public RectF e() {
        return this.f12493n;
    }

    public float g() {
        return this.f12495p;
    }

    public int i() {
        return this.f12490k;
    }

    public void m(int i4) {
        this.f12498s = i4;
        invalidate();
    }

    public void n(float f4) {
        o(f4, false);
    }

    public void o(float f4, boolean z3) {
        ValueAnimator valueAnimator = this.f12482c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z3) {
            p(f4, false);
            return;
        }
        Pair j4 = j(f4);
        this.f12482c.setFloatValues(new float[]{((Float) j4.first).floatValue(), ((Float) j4.second).floatValue()});
        this.f12482c.setDuration((long) this.f12480a);
        this.f12482c.setInterpolator(this.f12481b);
        this.f12482c.addUpdateListener(new b(this));
        this.f12482c.addListener(new a());
        this.f12482c.start();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        if (!this.f12482c.isRunning()) {
            n(g());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int actionMasked = motionEvent.getActionMasked();
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f12484e = x3;
            this.f12485f = y3;
            this.f12486g = true;
            this.f12496q = false;
            z4 = true;
            z5 = false;
            z3 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i4 = (int) (x3 - this.f12484e);
            int i5 = (int) (y3 - this.f12485f);
            if ((i4 * i4) + (i5 * i5) > this.f12487h) {
                z6 = true;
            } else {
                z6 = false;
            }
            this.f12486g = z6;
            z5 = this.f12496q;
            if (actionMasked == 1) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (this.f12488i) {
                c(x3, y3);
            }
            z3 = z7;
            z4 = false;
        } else {
            z5 = false;
            z4 = false;
            z3 = false;
        }
        this.f12496q |= k(x3, y3, z5, z4, z3);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z3) {
        if (this.f12488i && !z3) {
            this.f12499t = 1;
        }
        this.f12488i = z3;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f12482c = new ValueAnimator();
        this.f12489j = new ArrayList();
        Paint paint = new Paint();
        this.f12492m = paint;
        this.f12493n = new RectF();
        this.f12499t = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f16591T0, i4, i.Widget_MaterialComponents_TimePicker_Clock);
        this.f12480a = d.f(context, C0970a.motionDurationLong2, 200);
        this.f12481b = d.g(context, C0970a.motionEasingEmphasizedInterpolator, A1.a.f6b);
        this.f12498s = obtainStyledAttributes.getDimensionPixelSize(j.f16599V0, 0);
        this.f12490k = obtainStyledAttributes.getDimensionPixelSize(j.f16603W0, 0);
        Resources resources = getResources();
        this.f12494o = resources.getDimensionPixelSize(C0972c.material_clock_hand_stroke_width);
        this.f12491l = (float) resources.getDimensionPixelSize(C0972c.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(j.f16595U0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        n(0.0f);
        this.f12487h = ViewConfiguration.get(context).getScaledTouchSlop();
        P.y0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
