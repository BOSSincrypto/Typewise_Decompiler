package com.google.android.material.chip;

import A1.c;
import N1.d;
import O1.b;
import Q1.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.internal.h;
import com.google.android.material.internal.j;
import com.google.android.material.internal.m;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import o.C0836a;

public class a extends g implements Drawable.Callback, h.b {

    /* renamed from: J0  reason: collision with root package name */
    private static final int[] f11832J0 = {16842910};

    /* renamed from: K0  reason: collision with root package name */
    private static final ShapeDrawable f11833K0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A  reason: collision with root package name */
    private ColorStateList f11834A;

    /* renamed from: A0  reason: collision with root package name */
    private PorterDuff.Mode f11835A0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: B  reason: collision with root package name */
    private float f11836B;

    /* renamed from: B0  reason: collision with root package name */
    private int[] f11837B0;

    /* renamed from: C  reason: collision with root package name */
    private float f11838C = -1.0f;

    /* renamed from: C0  reason: collision with root package name */
    private boolean f11839C0;

    /* renamed from: D  reason: collision with root package name */
    private ColorStateList f11840D;

    /* renamed from: D0  reason: collision with root package name */
    private ColorStateList f11841D0;

    /* renamed from: E  reason: collision with root package name */
    private float f11842E;

    /* renamed from: E0  reason: collision with root package name */
    private WeakReference f11843E0 = new WeakReference((Object) null);

    /* renamed from: F  reason: collision with root package name */
    private ColorStateList f11844F;

    /* renamed from: F0  reason: collision with root package name */
    private TextUtils.TruncateAt f11845F0;

    /* renamed from: G  reason: collision with root package name */
    private CharSequence f11846G;

    /* renamed from: G0  reason: collision with root package name */
    private boolean f11847G0;

    /* renamed from: H  reason: collision with root package name */
    private boolean f11848H;

    /* renamed from: H0  reason: collision with root package name */
    private int f11849H0;

    /* renamed from: I  reason: collision with root package name */
    private Drawable f11850I;

    /* renamed from: I0  reason: collision with root package name */
    private boolean f11851I0;

    /* renamed from: J  reason: collision with root package name */
    private ColorStateList f11852J;

    /* renamed from: K  reason: collision with root package name */
    private float f11853K;

    /* renamed from: L  reason: collision with root package name */
    private boolean f11854L;

    /* renamed from: M  reason: collision with root package name */
    private boolean f11855M;

    /* renamed from: N  reason: collision with root package name */
    private Drawable f11856N;

    /* renamed from: O  reason: collision with root package name */
    private Drawable f11857O;

    /* renamed from: P  reason: collision with root package name */
    private ColorStateList f11858P;

    /* renamed from: Q  reason: collision with root package name */
    private float f11859Q;

    /* renamed from: R  reason: collision with root package name */
    private CharSequence f11860R;

    /* renamed from: S  reason: collision with root package name */
    private boolean f11861S;

    /* renamed from: T  reason: collision with root package name */
    private boolean f11862T;

    /* renamed from: U  reason: collision with root package name */
    private Drawable f11863U;

    /* renamed from: V  reason: collision with root package name */
    private ColorStateList f11864V;

    /* renamed from: W  reason: collision with root package name */
    private c f11865W;

    /* renamed from: X  reason: collision with root package name */
    private c f11866X;

    /* renamed from: Y  reason: collision with root package name */
    private float f11867Y;

    /* renamed from: Z  reason: collision with root package name */
    private float f11868Z;

    /* renamed from: a0  reason: collision with root package name */
    private float f11869a0;

    /* renamed from: b0  reason: collision with root package name */
    private float f11870b0;

    /* renamed from: c0  reason: collision with root package name */
    private float f11871c0;

    /* renamed from: d0  reason: collision with root package name */
    private float f11872d0;

    /* renamed from: e0  reason: collision with root package name */
    private float f11873e0;

    /* renamed from: f0  reason: collision with root package name */
    private float f11874f0;

    /* renamed from: g0  reason: collision with root package name */
    private final Context f11875g0;

    /* renamed from: h0  reason: collision with root package name */
    private final Paint f11876h0 = new Paint(1);

    /* renamed from: i0  reason: collision with root package name */
    private final Paint f11877i0;

    /* renamed from: j0  reason: collision with root package name */
    private final Paint.FontMetrics f11878j0 = new Paint.FontMetrics();

    /* renamed from: k0  reason: collision with root package name */
    private final RectF f11879k0 = new RectF();

    /* renamed from: l0  reason: collision with root package name */
    private final PointF f11880l0 = new PointF();

    /* renamed from: m0  reason: collision with root package name */
    private final Path f11881m0 = new Path();

    /* renamed from: n0  reason: collision with root package name */
    private final h f11882n0;

    /* renamed from: o0  reason: collision with root package name */
    private int f11883o0;

    /* renamed from: p0  reason: collision with root package name */
    private int f11884p0;

    /* renamed from: q0  reason: collision with root package name */
    private int f11885q0;

    /* renamed from: r0  reason: collision with root package name */
    private int f11886r0;

    /* renamed from: s0  reason: collision with root package name */
    private int f11887s0;

    /* renamed from: t0  reason: collision with root package name */
    private int f11888t0;

    /* renamed from: u0  reason: collision with root package name */
    private boolean f11889u0;

    /* renamed from: v0  reason: collision with root package name */
    private int f11890v0;

    /* renamed from: w0  reason: collision with root package name */
    private int f11891w0 = 255;

    /* renamed from: x0  reason: collision with root package name */
    private ColorFilter f11892x0;

    /* renamed from: y0  reason: collision with root package name */
    private PorterDuffColorFilter f11893y0;

    /* renamed from: z  reason: collision with root package name */
    private ColorStateList f11894z;

    /* renamed from: z0  reason: collision with root package name */
    private ColorStateList f11895z0;

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    public interface C0169a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        J(context);
        this.f11875g0 = context;
        h hVar = new h(this);
        this.f11882n0 = hVar;
        this.f11846G = "";
        hVar.f().density = context.getResources().getDisplayMetrics().density;
        this.f11877i0 = null;
        int[] iArr = f11832J0;
        setState(iArr);
        f2(iArr);
        this.f11847G0 = true;
        if (b.f1065a) {
            f11833K0.setTint(-1);
        }
    }

    private boolean H2() {
        if (!this.f11862T || this.f11863U == null || !this.f11889u0) {
            return false;
        }
        return true;
    }

    private boolean I2() {
        if (!this.f11848H || this.f11850I == null) {
            return false;
        }
        return true;
    }

    private boolean J2() {
        if (!this.f11855M || this.f11856N == null) {
            return false;
        }
        return true;
    }

    private void K2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    private void L2() {
        ColorStateList colorStateList;
        if (this.f11839C0) {
            colorStateList = b.a(this.f11844F);
        } else {
            colorStateList = null;
        }
        this.f11841D0 = colorStateList;
    }

    private void M2() {
        this.f11857O = new RippleDrawable(b.a(Z0()), this.f11856N, f11833K0);
    }

    private float T0() {
        Drawable drawable;
        if (this.f11889u0) {
            drawable = this.f11863U;
        } else {
            drawable = this.f11850I;
        }
        float f4 = this.f11853K;
        if (f4 <= 0.0f && drawable != null) {
            f4 = (float) Math.ceil((double) m.c(this.f11875g0, 24));
            if (((float) drawable.getIntrinsicHeight()) <= f4) {
                return (float) drawable.getIntrinsicHeight();
            }
        }
        return f4;
    }

    private float U0() {
        Drawable drawable;
        if (this.f11889u0) {
            drawable = this.f11863U;
        } else {
            drawable = this.f11850I;
        }
        float f4 = this.f11853K;
        if (f4 > 0.0f || drawable == null) {
            return f4;
        }
        return (float) drawable.getIntrinsicWidth();
    }

    private void V1(ColorStateList colorStateList) {
        if (this.f11894z != colorStateList) {
            this.f11894z = colorStateList;
            onStateChange(getState());
        }
    }

    private void e0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f11856N) {
                if (drawable.isStateful()) {
                    drawable.setState(Q0());
                }
                androidx.core.graphics.drawable.a.o(drawable, this.f11858P);
                return;
            }
            Drawable drawable2 = this.f11850I;
            if (drawable == drawable2 && this.f11854L) {
                androidx.core.graphics.drawable.a.o(drawable2, this.f11852J);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    private void f0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (I2() || H2()) {
            float f4 = this.f11867Y + this.f11868Z;
            float U02 = U0();
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f5 = ((float) rect.left) + f4;
                rectF.left = f5;
                rectF.right = f5 + U02;
            } else {
                float f6 = ((float) rect.right) - f4;
                rectF.right = f6;
                rectF.left = f6 - U02;
            }
            float T02 = T0();
            float exactCenterY = rect.exactCenterY() - (T02 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + T02;
        }
    }

    private ColorFilter f1() {
        ColorFilter colorFilter = this.f11892x0;
        if (colorFilter != null) {
            return colorFilter;
        }
        return this.f11893y0;
    }

    private void h0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (J2()) {
            float f4 = this.f11874f0 + this.f11873e0 + this.f11859Q + this.f11872d0 + this.f11871c0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.right = ((float) rect.right) - f4;
            } else {
                rectF.left = ((float) rect.left) + f4;
            }
        }
    }

    private static boolean h1(int[] iArr, int i4) {
        if (iArr == null) {
            return false;
        }
        for (int i5 : iArr) {
            if (i5 == i4) {
                return true;
            }
        }
        return false;
    }

    private void i0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (J2()) {
            float f4 = this.f11874f0 + this.f11873e0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f5 = ((float) rect.right) - f4;
                rectF.right = f5;
                rectF.left = f5 - this.f11859Q;
            } else {
                float f6 = ((float) rect.left) + f4;
                rectF.left = f6;
                rectF.right = f6 + this.f11859Q;
            }
            float exactCenterY = rect.exactCenterY();
            float f7 = this.f11859Q;
            float f8 = exactCenterY - (f7 / 2.0f);
            rectF.top = f8;
            rectF.bottom = f8 + f7;
        }
    }

    private void j0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (J2()) {
            float f4 = this.f11874f0 + this.f11873e0 + this.f11859Q + this.f11872d0 + this.f11871c0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f5 = (float) rect.right;
                rectF.right = f5;
                rectF.left = f5 - f4;
            } else {
                int i4 = rect.left;
                rectF.left = (float) i4;
                rectF.right = ((float) i4) + f4;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    private void l0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f11846G != null) {
            float g02 = this.f11867Y + g0() + this.f11870b0;
            float k02 = this.f11874f0 + k0() + this.f11871c0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.left = ((float) rect.left) + g02;
                rectF.right = ((float) rect.right) - k02;
            } else {
                rectF.left = ((float) rect.left) + k02;
                rectF.right = ((float) rect.right) - g02;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    private static boolean l1(d dVar) {
        if (dVar == null || dVar.i() == null || !dVar.i().isStateful()) {
            return false;
        }
        return true;
    }

    private float m0() {
        this.f11882n0.f().getFontMetrics(this.f11878j0);
        Paint.FontMetrics fontMetrics = this.f11878j0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean m1(ColorStateList colorStateList) {
        if (colorStateList == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    private static boolean n1(Drawable drawable) {
        if (drawable == null || !drawable.isStateful()) {
            return false;
        }
        return true;
    }

    private boolean o0() {
        if (!this.f11862T || this.f11863U == null || !this.f11861S) {
            return false;
        }
        return true;
    }

    private void o1(AttributeSet attributeSet, int i4, int i5) {
        TypedArray i6 = j.i(this.f11875g0, attributeSet, z1.j.f16614Z, i4, i5, new int[0]);
        this.f11851I0 = i6.hasValue(z1.j.f16555K0);
        V1(N1.c.a(this.f11875g0, i6, z1.j.f16731x0));
        z1(N1.c.a(this.f11875g0, i6, z1.j.f16669k0));
        N1(i6.getDimension(z1.j.f16709s0, 0.0f));
        int i7 = z1.j.f16674l0;
        if (i6.hasValue(i7)) {
            B1(i6.getDimension(i7, 0.0f));
        }
        R1(N1.c.a(this.f11875g0, i6, z1.j.f16723v0));
        T1(i6.getDimension(z1.j.f16727w0, 0.0f));
        s2(N1.c.a(this.f11875g0, i6, z1.j.f16551J0));
        x2(i6.getText(z1.j.f16639e0));
        d f4 = N1.c.f(this.f11875g0, i6, z1.j.f16619a0);
        f4.l(i6.getDimension(z1.j.f16624b0, f4.j()));
        y2(f4);
        int i8 = i6.getInt(z1.j.f16629c0, 0);
        if (i8 == 1) {
            k2(TextUtils.TruncateAt.START);
        } else if (i8 == 2) {
            k2(TextUtils.TruncateAt.MIDDLE);
        } else if (i8 == 3) {
            k2(TextUtils.TruncateAt.END);
        }
        M1(i6.getBoolean(z1.j.f16704r0, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
            M1(i6.getBoolean(z1.j.f16689o0, false));
        }
        F1(N1.c.d(this.f11875g0, i6, z1.j.f16684n0));
        int i9 = z1.j.f16699q0;
        if (i6.hasValue(i9)) {
            J1(N1.c.a(this.f11875g0, i6, i9));
        }
        H1(i6.getDimension(z1.j.f16694p0, -1.0f));
        i2(i6.getBoolean(z1.j.f16531E0, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
            i2(i6.getBoolean(z1.j.f16739z0, false));
        }
        W1(N1.c.d(this.f11875g0, i6, z1.j.f16735y0));
        g2(N1.c.a(this.f11875g0, i6, z1.j.f16527D0));
        b2(i6.getDimension(z1.j.f16519B0, 0.0f));
        r1(i6.getBoolean(z1.j.f16644f0, false));
        y1(i6.getBoolean(z1.j.f16664j0, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
            y1(i6.getBoolean(z1.j.f16654h0, false));
        }
        t1(N1.c.d(this.f11875g0, i6, z1.j.f16649g0));
        int i10 = z1.j.f16659i0;
        if (i6.hasValue(i10)) {
            v1(N1.c.a(this.f11875g0, i6, i10));
        }
        v2(c.b(this.f11875g0, i6, z1.j.f16559L0));
        l2(c.b(this.f11875g0, i6, z1.j.f16539G0));
        P1(i6.getDimension(z1.j.f16719u0, 0.0f));
        p2(i6.getDimension(z1.j.f16547I0, 0.0f));
        n2(i6.getDimension(z1.j.f16543H0, 0.0f));
        D2(i6.getDimension(z1.j.f16567N0, 0.0f));
        A2(i6.getDimension(z1.j.f16563M0, 0.0f));
        d2(i6.getDimension(z1.j.f16523C0, 0.0f));
        Y1(i6.getDimension(z1.j.f16515A0, 0.0f));
        D1(i6.getDimension(z1.j.f16679m0, 0.0f));
        r2(i6.getDimensionPixelSize(z1.j.f16634d0, Integer.MAX_VALUE));
        i6.recycle();
    }

    public static a p0(Context context, AttributeSet attributeSet, int i4, int i5) {
        a aVar = new a(context, attributeSet, i4, i5);
        aVar.o1(attributeSet, i4, i5);
        return aVar;
    }

    private void q0(Canvas canvas, Rect rect) {
        if (H2()) {
            f0(rect, this.f11879k0);
            RectF rectF = this.f11879k0;
            float f4 = rectF.left;
            float f5 = rectF.top;
            canvas.translate(f4, f5);
            this.f11863U.setBounds(0, 0, (int) this.f11879k0.width(), (int) this.f11879k0.height());
            this.f11863U.draw(canvas);
            canvas.translate(-f4, -f5);
        }
    }

    private boolean q1(int[] iArr, int[] iArr2) {
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        int i6;
        int i7;
        int i8;
        boolean z5;
        boolean z6;
        int i9;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f11894z;
        if (colorStateList != null) {
            i4 = colorStateList.getColorForState(iArr, this.f11883o0);
        } else {
            i4 = 0;
        }
        int l4 = l(i4);
        boolean z7 = true;
        if (this.f11883o0 != l4) {
            this.f11883o0 = l4;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.f11834A;
        if (colorStateList2 != null) {
            i5 = colorStateList2.getColorForState(iArr, this.f11884p0);
        } else {
            i5 = 0;
        }
        int l5 = l(i5);
        if (this.f11884p0 != l5) {
            this.f11884p0 = l5;
            onStateChange = true;
        }
        int h4 = F1.a.h(l4, l5);
        if (this.f11885q0 != h4) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (v() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 || z4) {
            this.f11885q0 = h4;
            T(ColorStateList.valueOf(h4));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f11840D;
        if (colorStateList3 != null) {
            i6 = colorStateList3.getColorForState(iArr, this.f11886r0);
        } else {
            i6 = 0;
        }
        if (this.f11886r0 != i6) {
            this.f11886r0 = i6;
            onStateChange = true;
        }
        if (this.f11841D0 == null || !b.b(iArr)) {
            i7 = 0;
        } else {
            i7 = this.f11841D0.getColorForState(iArr, this.f11887s0);
        }
        if (this.f11887s0 != i7) {
            this.f11887s0 = i7;
            if (this.f11839C0) {
                onStateChange = true;
            }
        }
        if (this.f11882n0.e() == null || this.f11882n0.e().i() == null) {
            i8 = 0;
        } else {
            i8 = this.f11882n0.e().i().getColorForState(iArr, this.f11888t0);
        }
        if (this.f11888t0 != i8) {
            this.f11888t0 = i8;
            onStateChange = true;
        }
        if (!h1(getState(), 16842912) || !this.f11861S) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (this.f11889u0 == z5 || this.f11863U == null) {
            z6 = false;
        } else {
            float g02 = g0();
            this.f11889u0 = z5;
            if (g02 != g0()) {
                onStateChange = true;
                z6 = true;
            } else {
                z6 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f11895z0;
        if (colorStateList4 != null) {
            i9 = colorStateList4.getColorForState(iArr, this.f11890v0);
        } else {
            i9 = 0;
        }
        if (this.f11890v0 != i9) {
            this.f11890v0 = i9;
            this.f11893y0 = H1.a.i(this, this.f11895z0, this.f11835A0);
        } else {
            z7 = onStateChange;
        }
        if (n1(this.f11850I)) {
            z7 |= this.f11850I.setState(iArr);
        }
        if (n1(this.f11863U)) {
            z7 |= this.f11863U.setState(iArr);
        }
        if (n1(this.f11856N)) {
            int[] iArr3 = new int[(iArr.length + iArr2.length)];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z7 |= this.f11856N.setState(iArr3);
        }
        if (b.f1065a && n1(this.f11857O)) {
            z7 |= this.f11857O.setState(iArr2);
        }
        if (z7) {
            invalidateSelf();
        }
        if (z6) {
            p1();
        }
        return z7;
    }

    private void r0(Canvas canvas, Rect rect) {
        if (!this.f11851I0) {
            this.f11876h0.setColor(this.f11884p0);
            this.f11876h0.setStyle(Paint.Style.FILL);
            this.f11876h0.setColorFilter(f1());
            this.f11879k0.set(rect);
            canvas.drawRoundRect(this.f11879k0, C0(), C0(), this.f11876h0);
        }
    }

    private void s0(Canvas canvas, Rect rect) {
        if (I2()) {
            f0(rect, this.f11879k0);
            RectF rectF = this.f11879k0;
            float f4 = rectF.left;
            float f5 = rectF.top;
            canvas.translate(f4, f5);
            this.f11850I.setBounds(0, 0, (int) this.f11879k0.width(), (int) this.f11879k0.height());
            this.f11850I.draw(canvas);
            canvas.translate(-f4, -f5);
        }
    }

    private void t0(Canvas canvas, Rect rect) {
        if (this.f11842E > 0.0f && !this.f11851I0) {
            this.f11876h0.setColor(this.f11886r0);
            this.f11876h0.setStyle(Paint.Style.STROKE);
            if (!this.f11851I0) {
                this.f11876h0.setColorFilter(f1());
            }
            RectF rectF = this.f11879k0;
            float f4 = this.f11842E;
            rectF.set(((float) rect.left) + (f4 / 2.0f), ((float) rect.top) + (f4 / 2.0f), ((float) rect.right) - (f4 / 2.0f), ((float) rect.bottom) - (f4 / 2.0f));
            float f5 = this.f11838C - (this.f11842E / 2.0f);
            canvas.drawRoundRect(this.f11879k0, f5, f5, this.f11876h0);
        }
    }

    private void u0(Canvas canvas, Rect rect) {
        if (!this.f11851I0) {
            this.f11876h0.setColor(this.f11883o0);
            this.f11876h0.setStyle(Paint.Style.FILL);
            this.f11879k0.set(rect);
            canvas.drawRoundRect(this.f11879k0, C0(), C0(), this.f11876h0);
        }
    }

    private void v0(Canvas canvas, Rect rect) {
        if (J2()) {
            i0(rect, this.f11879k0);
            RectF rectF = this.f11879k0;
            float f4 = rectF.left;
            float f5 = rectF.top;
            canvas.translate(f4, f5);
            this.f11856N.setBounds(0, 0, (int) this.f11879k0.width(), (int) this.f11879k0.height());
            if (b.f1065a) {
                this.f11857O.setBounds(this.f11856N.getBounds());
                this.f11857O.jumpToCurrentState();
                this.f11857O.draw(canvas);
            } else {
                this.f11856N.draw(canvas);
            }
            canvas.translate(-f4, -f5);
        }
    }

    private void w0(Canvas canvas, Rect rect) {
        this.f11876h0.setColor(this.f11887s0);
        this.f11876h0.setStyle(Paint.Style.FILL);
        this.f11879k0.set(rect);
        if (!this.f11851I0) {
            canvas.drawRoundRect(this.f11879k0, C0(), C0(), this.f11876h0);
            return;
        }
        h(new RectF(rect), this.f11881m0);
        super.q(canvas, this.f11876h0, this.f11881m0, s());
    }

    private void x0(Canvas canvas, Rect rect) {
        Paint paint = this.f11877i0;
        if (paint != null) {
            paint.setColor(androidx.core.graphics.a.k(-16777216, 127));
            canvas.drawRect(rect, this.f11877i0);
            if (I2() || H2()) {
                f0(rect, this.f11879k0);
                canvas.drawRect(this.f11879k0, this.f11877i0);
            }
            if (this.f11846G != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f11877i0);
            }
            if (J2()) {
                i0(rect, this.f11879k0);
                canvas.drawRect(this.f11879k0, this.f11877i0);
            }
            this.f11877i0.setColor(androidx.core.graphics.a.k(-65536, 127));
            h0(rect, this.f11879k0);
            canvas.drawRect(this.f11879k0, this.f11877i0);
            this.f11877i0.setColor(androidx.core.graphics.a.k(-16711936, 127));
            j0(rect, this.f11879k0);
            canvas.drawRect(this.f11879k0, this.f11877i0);
        }
    }

    private void y0(Canvas canvas, Rect rect) {
        boolean z3;
        if (this.f11846G != null) {
            Paint.Align n02 = n0(rect, this.f11880l0);
            l0(rect, this.f11879k0);
            if (this.f11882n0.e() != null) {
                this.f11882n0.f().drawableState = getState();
                this.f11882n0.l(this.f11875g0);
            }
            this.f11882n0.f().setTextAlign(n02);
            int i4 = 0;
            if (Math.round(this.f11882n0.g(b1().toString())) > Math.round(this.f11879k0.width())) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                i4 = canvas.save();
                canvas.clipRect(this.f11879k0);
            }
            CharSequence charSequence = this.f11846G;
            if (z3 && this.f11845F0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f11882n0.f(), this.f11879k0.width(), this.f11845F0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f11880l0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f11882n0.f());
            if (z3) {
                canvas.restoreToCount(i4);
            }
        }
    }

    public ColorStateList A0() {
        return this.f11864V;
    }

    public void A1(int i4) {
        z1(C0836a.a(this.f11875g0, i4));
    }

    public void A2(float f4) {
        if (this.f11871c0 != f4) {
            this.f11871c0 = f4;
            invalidateSelf();
            p1();
        }
    }

    public ColorStateList B0() {
        return this.f11834A;
    }

    public void B1(float f4) {
        if (this.f11838C != f4) {
            this.f11838C = f4;
            setShapeAppearanceModel(A().w(f4));
        }
    }

    public void B2(int i4) {
        A2(this.f11875g0.getResources().getDimension(i4));
    }

    public float C0() {
        if (this.f11851I0) {
            return C();
        }
        return this.f11838C;
    }

    public void C1(int i4) {
        B1(this.f11875g0.getResources().getDimension(i4));
    }

    public void C2(float f4) {
        d c12 = c1();
        if (c12 != null) {
            c12.l(f4);
            this.f11882n0.f().setTextSize(f4);
            a();
        }
    }

    public float D0() {
        return this.f11874f0;
    }

    public void D1(float f4) {
        if (this.f11874f0 != f4) {
            this.f11874f0 = f4;
            invalidateSelf();
            p1();
        }
    }

    public void D2(float f4) {
        if (this.f11870b0 != f4) {
            this.f11870b0 = f4;
            invalidateSelf();
            p1();
        }
    }

    public Drawable E0() {
        Drawable drawable = this.f11850I;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void E1(int i4) {
        D1(this.f11875g0.getResources().getDimension(i4));
    }

    public void E2(int i4) {
        D2(this.f11875g0.getResources().getDimension(i4));
    }

    public float F0() {
        return this.f11853K;
    }

    public void F1(Drawable drawable) {
        Drawable drawable2;
        Drawable E02 = E0();
        if (E02 != drawable) {
            float g02 = g0();
            if (drawable != null) {
                drawable2 = androidx.core.graphics.drawable.a.r(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.f11850I = drawable2;
            float g03 = g0();
            K2(E02);
            if (I2()) {
                e0(this.f11850I);
            }
            invalidateSelf();
            if (g02 != g03) {
                p1();
            }
        }
    }

    public void F2(boolean z3) {
        if (this.f11839C0 != z3) {
            this.f11839C0 = z3;
            L2();
            onStateChange(getState());
        }
    }

    public ColorStateList G0() {
        return this.f11852J;
    }

    public void G1(int i4) {
        F1(C0836a.b(this.f11875g0, i4));
    }

    /* access modifiers changed from: package-private */
    public boolean G2() {
        return this.f11847G0;
    }

    public float H0() {
        return this.f11836B;
    }

    public void H1(float f4) {
        if (this.f11853K != f4) {
            float g02 = g0();
            this.f11853K = f4;
            float g03 = g0();
            invalidateSelf();
            if (g02 != g03) {
                p1();
            }
        }
    }

    public float I0() {
        return this.f11867Y;
    }

    public void I1(int i4) {
        H1(this.f11875g0.getResources().getDimension(i4));
    }

    public ColorStateList J0() {
        return this.f11840D;
    }

    public void J1(ColorStateList colorStateList) {
        this.f11854L = true;
        if (this.f11852J != colorStateList) {
            this.f11852J = colorStateList;
            if (I2()) {
                androidx.core.graphics.drawable.a.o(this.f11850I, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float K0() {
        return this.f11842E;
    }

    public void K1(int i4) {
        J1(C0836a.a(this.f11875g0, i4));
    }

    public Drawable L0() {
        Drawable drawable = this.f11856N;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void L1(int i4) {
        M1(this.f11875g0.getResources().getBoolean(i4));
    }

    public CharSequence M0() {
        return this.f11860R;
    }

    public void M1(boolean z3) {
        if (this.f11848H != z3) {
            boolean I22 = I2();
            this.f11848H = z3;
            boolean I23 = I2();
            if (I22 != I23) {
                if (I23) {
                    e0(this.f11850I);
                } else {
                    K2(this.f11850I);
                }
                invalidateSelf();
                p1();
            }
        }
    }

    public float N0() {
        return this.f11873e0;
    }

    public void N1(float f4) {
        if (this.f11836B != f4) {
            this.f11836B = f4;
            invalidateSelf();
            p1();
        }
    }

    public float O0() {
        return this.f11859Q;
    }

    public void O1(int i4) {
        N1(this.f11875g0.getResources().getDimension(i4));
    }

    public float P0() {
        return this.f11872d0;
    }

    public void P1(float f4) {
        if (this.f11867Y != f4) {
            this.f11867Y = f4;
            invalidateSelf();
            p1();
        }
    }

    public int[] Q0() {
        return this.f11837B0;
    }

    public void Q1(int i4) {
        P1(this.f11875g0.getResources().getDimension(i4));
    }

    public ColorStateList R0() {
        return this.f11858P;
    }

    public void R1(ColorStateList colorStateList) {
        if (this.f11840D != colorStateList) {
            this.f11840D = colorStateList;
            if (this.f11851I0) {
                Z(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void S0(RectF rectF) {
        j0(getBounds(), rectF);
    }

    public void S1(int i4) {
        R1(C0836a.a(this.f11875g0, i4));
    }

    public void T1(float f4) {
        if (this.f11842E != f4) {
            this.f11842E = f4;
            this.f11876h0.setStrokeWidth(f4);
            if (this.f11851I0) {
                super.a0(f4);
            }
            invalidateSelf();
        }
    }

    public void U1(int i4) {
        T1(this.f11875g0.getResources().getDimension(i4));
    }

    public TextUtils.TruncateAt V0() {
        return this.f11845F0;
    }

    public c W0() {
        return this.f11866X;
    }

    public void W1(Drawable drawable) {
        Drawable drawable2;
        Drawable L02 = L0();
        if (L02 != drawable) {
            float k02 = k0();
            if (drawable != null) {
                drawable2 = androidx.core.graphics.drawable.a.r(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.f11856N = drawable2;
            if (b.f1065a) {
                M2();
            }
            float k03 = k0();
            K2(L02);
            if (J2()) {
                e0(this.f11856N);
            }
            invalidateSelf();
            if (k02 != k03) {
                p1();
            }
        }
    }

    public float X0() {
        return this.f11869a0;
    }

    public void X1(CharSequence charSequence) {
        if (this.f11860R != charSequence) {
            this.f11860R = androidx.core.text.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float Y0() {
        return this.f11868Z;
    }

    public void Y1(float f4) {
        if (this.f11873e0 != f4) {
            this.f11873e0 = f4;
            invalidateSelf();
            if (J2()) {
                p1();
            }
        }
    }

    public ColorStateList Z0() {
        return this.f11844F;
    }

    public void Z1(int i4) {
        Y1(this.f11875g0.getResources().getDimension(i4));
    }

    public void a() {
        p1();
        invalidateSelf();
    }

    public c a1() {
        return this.f11865W;
    }

    public void a2(int i4) {
        W1(C0836a.b(this.f11875g0, i4));
    }

    public CharSequence b1() {
        return this.f11846G;
    }

    public void b2(float f4) {
        if (this.f11859Q != f4) {
            this.f11859Q = f4;
            invalidateSelf();
            if (J2()) {
                p1();
            }
        }
    }

    public d c1() {
        return this.f11882n0.e();
    }

    public void c2(int i4) {
        b2(this.f11875g0.getResources().getDimension(i4));
    }

    public float d1() {
        return this.f11871c0;
    }

    public void d2(float f4) {
        if (this.f11872d0 != f4) {
            this.f11872d0 = f4;
            invalidateSelf();
            if (J2()) {
                p1();
            }
        }
    }

    public void draw(Canvas canvas) {
        int i4;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i5 = this.f11891w0;
            if (i5 < 255) {
                i4 = C1.a.a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i5);
            } else {
                i4 = 0;
            }
            u0(canvas, bounds);
            r0(canvas, bounds);
            if (this.f11851I0) {
                super.draw(canvas);
            }
            t0(canvas, bounds);
            w0(canvas, bounds);
            s0(canvas, bounds);
            q0(canvas, bounds);
            if (this.f11847G0) {
                y0(canvas, bounds);
            }
            v0(canvas, bounds);
            x0(canvas, bounds);
            if (this.f11891w0 < 255) {
                canvas.restoreToCount(i4);
            }
        }
    }

    public float e1() {
        return this.f11870b0;
    }

    public void e2(int i4) {
        d2(this.f11875g0.getResources().getDimension(i4));
    }

    public boolean f2(int[] iArr) {
        if (Arrays.equals(this.f11837B0, iArr)) {
            return false;
        }
        this.f11837B0 = iArr;
        if (J2()) {
            return q1(getState(), iArr);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public float g0() {
        if (I2() || H2()) {
            return this.f11868Z + U0() + this.f11869a0;
        }
        return 0.0f;
    }

    public boolean g1() {
        return this.f11839C0;
    }

    public void g2(ColorStateList colorStateList) {
        if (this.f11858P != colorStateList) {
            this.f11858P = colorStateList;
            if (J2()) {
                androidx.core.graphics.drawable.a.o(this.f11856N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public int getAlpha() {
        return this.f11891w0;
    }

    public ColorFilter getColorFilter() {
        return this.f11892x0;
    }

    public int getIntrinsicHeight() {
        return (int) this.f11836B;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f11867Y + g0() + this.f11870b0 + this.f11882n0.g(b1().toString()) + this.f11871c0 + k0() + this.f11874f0), this.f11849H0);
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        if (this.f11851I0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f11838C);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f11838C);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    public void h2(int i4) {
        g2(C0836a.a(this.f11875g0, i4));
    }

    public boolean i1() {
        return this.f11861S;
    }

    public void i2(boolean z3) {
        if (this.f11855M != z3) {
            boolean J22 = J2();
            this.f11855M = z3;
            boolean J23 = J2();
            if (J22 != J23) {
                if (J23) {
                    e0(this.f11856N);
                } else {
                    K2(this.f11856N);
                }
                invalidateSelf();
                p1();
            }
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        if (m1(this.f11894z) || m1(this.f11834A) || m1(this.f11840D) || ((this.f11839C0 && m1(this.f11841D0)) || l1(this.f11882n0.e()) || o0() || n1(this.f11850I) || n1(this.f11863U) || m1(this.f11895z0))) {
            return true;
        }
        return false;
    }

    public boolean j1() {
        return n1(this.f11856N);
    }

    public void j2(C0169a aVar) {
        this.f11843E0 = new WeakReference(aVar);
    }

    /* access modifiers changed from: package-private */
    public float k0() {
        if (J2()) {
            return this.f11872d0 + this.f11859Q + this.f11873e0;
        }
        return 0.0f;
    }

    public boolean k1() {
        return this.f11855M;
    }

    public void k2(TextUtils.TruncateAt truncateAt) {
        this.f11845F0 = truncateAt;
    }

    public void l2(c cVar) {
        this.f11866X = cVar;
    }

    public void m2(int i4) {
        l2(c.c(this.f11875g0, i4));
    }

    /* access modifiers changed from: package-private */
    public Paint.Align n0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f11846G != null) {
            float g02 = this.f11867Y + g0() + this.f11870b0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                pointF.x = ((float) rect.left) + g02;
            } else {
                pointF.x = ((float) rect.right) - g02;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - m0();
        }
        return align;
    }

    public void n2(float f4) {
        if (this.f11869a0 != f4) {
            float g02 = g0();
            this.f11869a0 = f4;
            float g03 = g0();
            invalidateSelf();
            if (g02 != g03) {
                p1();
            }
        }
    }

    public void o2(int i4) {
        n2(this.f11875g0.getResources().getDimension(i4));
    }

    public boolean onLayoutDirectionChanged(int i4) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i4);
        if (I2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.f11850I, i4);
        }
        if (H2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.f11863U, i4);
        }
        if (J2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.f11856N, i4);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i4) {
        boolean onLevelChange = super.onLevelChange(i4);
        if (I2()) {
            onLevelChange |= this.f11850I.setLevel(i4);
        }
        if (H2()) {
            onLevelChange |= this.f11863U.setLevel(i4);
        }
        if (J2()) {
            onLevelChange |= this.f11856N.setLevel(i4);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.f11851I0) {
            super.onStateChange(iArr);
        }
        return q1(iArr, Q0());
    }

    /* access modifiers changed from: protected */
    public void p1() {
        C0169a aVar = (C0169a) this.f11843E0.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void p2(float f4) {
        if (this.f11868Z != f4) {
            float g02 = g0();
            this.f11868Z = f4;
            float g03 = g0();
            invalidateSelf();
            if (g02 != g03) {
                p1();
            }
        }
    }

    public void q2(int i4) {
        p2(this.f11875g0.getResources().getDimension(i4));
    }

    public void r1(boolean z3) {
        if (this.f11861S != z3) {
            this.f11861S = z3;
            float g02 = g0();
            if (!z3 && this.f11889u0) {
                this.f11889u0 = false;
            }
            float g03 = g0();
            invalidateSelf();
            if (g02 != g03) {
                p1();
            }
        }
    }

    public void r2(int i4) {
        this.f11849H0 = i4;
    }

    public void s1(int i4) {
        r1(this.f11875g0.getResources().getBoolean(i4));
    }

    public void s2(ColorStateList colorStateList) {
        if (this.f11844F != colorStateList) {
            this.f11844F = colorStateList;
            L2();
            onStateChange(getState());
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j4);
        }
    }

    public void setAlpha(int i4) {
        if (this.f11891w0 != i4) {
            this.f11891w0 = i4;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f11892x0 != colorFilter) {
            this.f11892x0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f11895z0 != colorStateList) {
            this.f11895z0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f11835A0 != mode) {
            this.f11835A0 = mode;
            this.f11893y0 = H1.a.i(this, this.f11895z0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z3, boolean z4) {
        boolean visible = super.setVisible(z3, z4);
        if (I2()) {
            visible |= this.f11850I.setVisible(z3, z4);
        }
        if (H2()) {
            visible |= this.f11863U.setVisible(z3, z4);
        }
        if (J2()) {
            visible |= this.f11856N.setVisible(z3, z4);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void t1(Drawable drawable) {
        if (this.f11863U != drawable) {
            float g02 = g0();
            this.f11863U = drawable;
            float g03 = g0();
            K2(this.f11863U);
            e0(this.f11863U);
            invalidateSelf();
            if (g02 != g03) {
                p1();
            }
        }
    }

    public void t2(int i4) {
        s2(C0836a.a(this.f11875g0, i4));
    }

    public void u1(int i4) {
        t1(C0836a.b(this.f11875g0, i4));
    }

    /* access modifiers changed from: package-private */
    public void u2(boolean z3) {
        this.f11847G0 = z3;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v1(ColorStateList colorStateList) {
        if (this.f11864V != colorStateList) {
            this.f11864V = colorStateList;
            if (o0()) {
                androidx.core.graphics.drawable.a.o(this.f11863U, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void v2(c cVar) {
        this.f11865W = cVar;
    }

    public void w1(int i4) {
        v1(C0836a.a(this.f11875g0, i4));
    }

    public void w2(int i4) {
        v2(c.c(this.f11875g0, i4));
    }

    public void x1(int i4) {
        y1(this.f11875g0.getResources().getBoolean(i4));
    }

    public void x2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f11846G, charSequence)) {
            this.f11846G = charSequence;
            this.f11882n0.k(true);
            invalidateSelf();
            p1();
        }
    }

    public void y1(boolean z3) {
        if (this.f11862T != z3) {
            boolean H22 = H2();
            this.f11862T = z3;
            boolean H23 = H2();
            if (H22 != H23) {
                if (H23) {
                    e0(this.f11863U);
                } else {
                    K2(this.f11863U);
                }
                invalidateSelf();
                p1();
            }
        }
    }

    public void y2(d dVar) {
        this.f11882n0.j(dVar, this.f11875g0);
    }

    public Drawable z0() {
        return this.f11863U;
    }

    public void z1(ColorStateList colorStateList) {
        if (this.f11834A != colorStateList) {
            this.f11834A = colorStateList;
            onStateChange(getState());
        }
    }

    public void z2(int i4) {
        y2(new d(this.f11875g0, i4));
    }
}
