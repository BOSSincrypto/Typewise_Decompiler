package com.google.android.material.timepicker;

import N1.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.C0402a;
import androidx.core.view.P;
import androidx.core.view.accessibility.A;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import o.C0836a;
import z1.C0970a;
import z1.C0971b;
import z1.C0972c;
import z1.e;
import z1.g;
import z1.i;
import z1.j;

class ClockFaceView extends e implements ClockHandView.b {
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public final ClockHandView f12463B;
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public final Rect f12464C;

    /* renamed from: D  reason: collision with root package name */
    private final RectF f12465D;

    /* renamed from: E  reason: collision with root package name */
    private final Rect f12466E;
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public final SparseArray f12467F;

    /* renamed from: G  reason: collision with root package name */
    private final C0402a f12468G;

    /* renamed from: H  reason: collision with root package name */
    private final int[] f12469H;

    /* renamed from: I  reason: collision with root package name */
    private final float[] f12470I;
    /* access modifiers changed from: private */

    /* renamed from: J  reason: collision with root package name */
    public final int f12471J;

    /* renamed from: K  reason: collision with root package name */
    private final int f12472K;

    /* renamed from: L  reason: collision with root package name */
    private final int f12473L;

    /* renamed from: M  reason: collision with root package name */
    private final int f12474M;

    /* renamed from: N  reason: collision with root package name */
    private String[] f12475N;

    /* renamed from: O  reason: collision with root package name */
    private float f12476O;

    /* renamed from: P  reason: collision with root package name */
    private final ColorStateList f12477P;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.F(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f12463B.i()) - ClockFaceView.this.f12471J);
            return true;
        }
    }

    class b extends C0402a {
        b() {
        }

        public void g(View view, A a4) {
            super.g(view, a4);
            int intValue = ((Integer) view.getTag(e.material_value_index)).intValue();
            if (intValue > 0) {
                a4.G0((View) ClockFaceView.this.f12467F.get(intValue - 1));
            }
            a4.m0(A.g.a(0, 1, intValue, 1, false, view.isSelected()));
            a4.k0(true);
            a4.b(A.a.f5246i);
        }

        public boolean j(View view, int i4, Bundle bundle) {
            if (i4 != 16) {
                return super.j(view, i4, bundle);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.f12464C);
            long j4 = uptimeMillis;
            float centerX = (float) ClockFaceView.this.f12464C.centerX();
            float centerY = (float) ClockFaceView.this.f12464C.centerY();
            ClockFaceView.this.f12463B.onTouchEvent(MotionEvent.obtain(uptimeMillis, j4, 0, centerX, centerY, 0));
            ClockFaceView.this.f12463B.onTouchEvent(MotionEvent.obtain(uptimeMillis, j4, 1, centerX, centerY, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0970a.materialClockStyle);
    }

    private void N() {
        boolean z3;
        RectF e4 = this.f12463B.e();
        TextView P3 = P(e4);
        for (int i4 = 0; i4 < this.f12467F.size(); i4++) {
            TextView textView = (TextView) this.f12467F.get(i4);
            if (textView != null) {
                if (textView == P3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                textView.setSelected(z3);
                textView.getPaint().setShader(O(e4, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient O(RectF rectF, TextView textView) {
        textView.getHitRect(this.f12464C);
        this.f12465D.set(this.f12464C);
        textView.getLineBounds(0, this.f12466E);
        RectF rectF2 = this.f12465D;
        Rect rect = this.f12466E;
        rectF2.inset((float) rect.left, (float) rect.top);
        if (!RectF.intersects(rectF, this.f12465D)) {
            return null;
        }
        return new RadialGradient(rectF.centerX() - this.f12465D.left, rectF.centerY() - this.f12465D.top, rectF.width() * 0.5f, this.f12469H, this.f12470I, Shader.TileMode.CLAMP);
    }

    private TextView P(RectF rectF) {
        float f4 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i4 = 0; i4 < this.f12467F.size(); i4++) {
            TextView textView2 = (TextView) this.f12467F.get(i4);
            if (textView2 != null) {
                textView2.getHitRect(this.f12464C);
                this.f12465D.set(this.f12464C);
                this.f12465D.union(rectF);
                float width = this.f12465D.width() * this.f12465D.height();
                if (width < f4) {
                    textView = textView2;
                    f4 = width;
                }
            }
        }
        return textView;
    }

    private static float Q(float f4, float f5, float f6) {
        return Math.max(Math.max(f4, f5), f6);
    }

    private void S(int i4) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f12467F.size();
        boolean z3 = false;
        for (int i5 = 0; i5 < Math.max(this.f12475N.length, size); i5++) {
            TextView textView = (TextView) this.f12467F.get(i5);
            if (i5 >= this.f12475N.length) {
                removeView(textView);
                this.f12467F.remove(i5);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(g.material_clockface_textview, this, false);
                    this.f12467F.put(i5, textView);
                    addView(textView);
                }
                textView.setText(this.f12475N[i5]);
                textView.setTag(e.material_value_index, Integer.valueOf(i5));
                int i6 = (i5 / 12) + 1;
                textView.setTag(e.material_clock_level, Integer.valueOf(i6));
                if (i6 > 1) {
                    z3 = true;
                }
                P.o0(textView, this.f12468G);
                textView.setTextColor(this.f12477P);
                if (i4 != 0) {
                    textView.setContentDescription(getResources().getString(i4, new Object[]{this.f12475N[i5]}));
                }
            }
        }
        this.f12463B.q(z3);
    }

    public void F(int i4) {
        if (i4 != E()) {
            super.F(i4);
            this.f12463B.m(E());
        }
    }

    /* access modifiers changed from: protected */
    public void H() {
        super.H();
        for (int i4 = 0; i4 < this.f12467F.size(); i4++) {
            ((TextView) this.f12467F.get(i4)).setVisibility(0);
        }
    }

    public void R(String[] strArr, int i4) {
        this.f12475N = strArr;
        S(i4);
    }

    public void a(float f4, boolean z3) {
        if (Math.abs(this.f12476O - f4) > 0.001f) {
            this.f12476O = f4;
            N();
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        A.J0(accessibilityNodeInfo).l0(A.f.a(1, this.f12475N.length, false, 1));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        N();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int Q3 = (int) (((float) this.f12474M) / Q(((float) this.f12472K) / ((float) displayMetrics.heightPixels), ((float) this.f12473L) / ((float) displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Q3, 1073741824);
        setMeasuredDimension(Q3, Q3);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f12464C = new Rect();
        this.f12465D = new RectF();
        this.f12466E = new Rect();
        this.f12467F = new SparseArray();
        this.f12470I = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f16579Q0, i4, i.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList a4 = c.a(context, obtainStyledAttributes, j.f16587S0);
        this.f12477P = a4;
        LayoutInflater.from(context).inflate(g.material_clockface_view, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(e.material_clock_hand);
        this.f12463B = clockHandView;
        this.f12471J = resources.getDimensionPixelSize(C0972c.material_clock_hand_padding);
        int colorForState = a4.getColorForState(new int[]{16842913}, a4.getDefaultColor());
        this.f12469H = new int[]{colorForState, colorForState, a4.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = C0836a.a(context, C0971b.material_timepicker_clockface).getDefaultColor();
        ColorStateList a5 = c.a(context, obtainStyledAttributes, j.f16583R0);
        setBackgroundColor(a5 != null ? a5.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f12468G = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        R(strArr, 0);
        this.f12472K = resources.getDimensionPixelSize(C0972c.material_time_picker_minimum_screen_height);
        this.f12473L = resources.getDimensionPixelSize(C0972c.material_time_picker_minimum_screen_width);
        this.f12474M = resources.getDimensionPixelSize(C0972c.material_clock_size);
    }
}
