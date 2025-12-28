package com.google.android.material.internal;

import N1.a;
import N1.d;
import N1.j;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.core.text.o;
import androidx.core.text.p;
import androidx.core.util.g;
import androidx.core.view.C0434o;
import androidx.core.view.P;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

public final class a {

    /* renamed from: t0  reason: collision with root package name */
    private static final boolean f12071t0 = false;

    /* renamed from: u0  reason: collision with root package name */
    private static final Paint f12072u0 = null;

    /* renamed from: A  reason: collision with root package name */
    private Typeface f12073A;

    /* renamed from: B  reason: collision with root package name */
    private Typeface f12074B;

    /* renamed from: C  reason: collision with root package name */
    private Typeface f12075C;

    /* renamed from: D  reason: collision with root package name */
    private N1.a f12076D;

    /* renamed from: E  reason: collision with root package name */
    private N1.a f12077E;

    /* renamed from: F  reason: collision with root package name */
    private TextUtils.TruncateAt f12078F = TextUtils.TruncateAt.END;

    /* renamed from: G  reason: collision with root package name */
    private CharSequence f12079G;

    /* renamed from: H  reason: collision with root package name */
    private CharSequence f12080H;

    /* renamed from: I  reason: collision with root package name */
    private boolean f12081I;

    /* renamed from: J  reason: collision with root package name */
    private boolean f12082J = true;

    /* renamed from: K  reason: collision with root package name */
    private boolean f12083K;

    /* renamed from: L  reason: collision with root package name */
    private Bitmap f12084L;

    /* renamed from: M  reason: collision with root package name */
    private Paint f12085M;

    /* renamed from: N  reason: collision with root package name */
    private float f12086N;

    /* renamed from: O  reason: collision with root package name */
    private float f12087O;

    /* renamed from: P  reason: collision with root package name */
    private float f12088P;

    /* renamed from: Q  reason: collision with root package name */
    private float f12089Q;

    /* renamed from: R  reason: collision with root package name */
    private float f12090R;

    /* renamed from: S  reason: collision with root package name */
    private int f12091S;

    /* renamed from: T  reason: collision with root package name */
    private int[] f12092T;

    /* renamed from: U  reason: collision with root package name */
    private boolean f12093U;

    /* renamed from: V  reason: collision with root package name */
    private final TextPaint f12094V;

    /* renamed from: W  reason: collision with root package name */
    private final TextPaint f12095W;

    /* renamed from: X  reason: collision with root package name */
    private TimeInterpolator f12096X;

    /* renamed from: Y  reason: collision with root package name */
    private TimeInterpolator f12097Y;

    /* renamed from: Z  reason: collision with root package name */
    private float f12098Z;

    /* renamed from: a  reason: collision with root package name */
    private final View f12099a;

    /* renamed from: a0  reason: collision with root package name */
    private float f12100a0;

    /* renamed from: b  reason: collision with root package name */
    private float f12101b;

    /* renamed from: b0  reason: collision with root package name */
    private float f12102b0;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12103c;

    /* renamed from: c0  reason: collision with root package name */
    private ColorStateList f12104c0;

    /* renamed from: d  reason: collision with root package name */
    private float f12105d;

    /* renamed from: d0  reason: collision with root package name */
    private float f12106d0;

    /* renamed from: e  reason: collision with root package name */
    private float f12107e;

    /* renamed from: e0  reason: collision with root package name */
    private float f12108e0;

    /* renamed from: f  reason: collision with root package name */
    private int f12109f;

    /* renamed from: f0  reason: collision with root package name */
    private float f12110f0;

    /* renamed from: g  reason: collision with root package name */
    private final Rect f12111g;

    /* renamed from: g0  reason: collision with root package name */
    private ColorStateList f12112g0;

    /* renamed from: h  reason: collision with root package name */
    private final Rect f12113h;

    /* renamed from: h0  reason: collision with root package name */
    private float f12114h0;

    /* renamed from: i  reason: collision with root package name */
    private final RectF f12115i;

    /* renamed from: i0  reason: collision with root package name */
    private float f12116i0;

    /* renamed from: j  reason: collision with root package name */
    private int f12117j = 16;

    /* renamed from: j0  reason: collision with root package name */
    private float f12118j0;

    /* renamed from: k  reason: collision with root package name */
    private int f12119k = 16;

    /* renamed from: k0  reason: collision with root package name */
    private StaticLayout f12120k0;

    /* renamed from: l  reason: collision with root package name */
    private float f12121l = 15.0f;

    /* renamed from: l0  reason: collision with root package name */
    private float f12122l0;

    /* renamed from: m  reason: collision with root package name */
    private float f12123m = 15.0f;

    /* renamed from: m0  reason: collision with root package name */
    private float f12124m0;

    /* renamed from: n  reason: collision with root package name */
    private ColorStateList f12125n;

    /* renamed from: n0  reason: collision with root package name */
    private float f12126n0;

    /* renamed from: o  reason: collision with root package name */
    private ColorStateList f12127o;

    /* renamed from: o0  reason: collision with root package name */
    private CharSequence f12128o0;

    /* renamed from: p  reason: collision with root package name */
    private int f12129p;

    /* renamed from: p0  reason: collision with root package name */
    private int f12130p0 = 1;

    /* renamed from: q  reason: collision with root package name */
    private float f12131q;

    /* renamed from: q0  reason: collision with root package name */
    private float f12132q0 = 0.0f;

    /* renamed from: r  reason: collision with root package name */
    private float f12133r;

    /* renamed from: r0  reason: collision with root package name */
    private float f12134r0 = 1.0f;

    /* renamed from: s  reason: collision with root package name */
    private float f12135s;

    /* renamed from: s0  reason: collision with root package name */
    private int f12136s0 = StaticLayoutBuilderCompat.f12056n;

    /* renamed from: t  reason: collision with root package name */
    private float f12137t;

    /* renamed from: u  reason: collision with root package name */
    private float f12138u;

    /* renamed from: v  reason: collision with root package name */
    private float f12139v;

    /* renamed from: w  reason: collision with root package name */
    private Typeface f12140w;

    /* renamed from: x  reason: collision with root package name */
    private Typeface f12141x;

    /* renamed from: y  reason: collision with root package name */
    private Typeface f12142y;

    /* renamed from: z  reason: collision with root package name */
    private Typeface f12143z;

    /* renamed from: com.google.android.material.internal.a$a  reason: collision with other inner class name */
    class C0171a implements a.C0016a {
        C0171a() {
        }

        public void a(Typeface typeface) {
            a.this.T(typeface);
        }
    }

    public a(View view) {
        this.f12099a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f12094V = textPaint;
        this.f12095W = new TextPaint(textPaint);
        this.f12113h = new Rect();
        this.f12111g = new Rect();
        this.f12115i = new RectF();
        this.f12107e = e();
        H(view.getContext().getResources().getConfiguration());
    }

    private void A(TextPaint textPaint) {
        textPaint.setTextSize(this.f12121l);
        textPaint.setTypeface(this.f12143z);
        textPaint.setLetterSpacing(this.f12116i0);
    }

    private void B(float f4) {
        Rect rect;
        if (this.f12103c) {
            RectF rectF = this.f12115i;
            if (f4 < this.f12107e) {
                rect = this.f12111g;
            } else {
                rect = this.f12113h;
            }
            rectF.set(rect);
            return;
        }
        this.f12115i.left = G((float) this.f12111g.left, (float) this.f12113h.left, f4, this.f12096X);
        this.f12115i.top = G(this.f12131q, this.f12133r, f4, this.f12096X);
        this.f12115i.right = G((float) this.f12111g.right, (float) this.f12113h.right, f4, this.f12096X);
        this.f12115i.bottom = G((float) this.f12111g.bottom, (float) this.f12113h.bottom, f4, this.f12096X);
    }

    private static boolean C(float f4, float f5) {
        if (Math.abs(f4 - f5) < 1.0E-5f) {
            return true;
        }
        return false;
    }

    private boolean D() {
        if (P.B(this.f12099a) == 1) {
            return true;
        }
        return false;
    }

    private boolean F(CharSequence charSequence, boolean z3) {
        o oVar;
        if (z3) {
            oVar = p.f5147d;
        } else {
            oVar = p.f5146c;
        }
        return oVar.a(charSequence, 0, charSequence.length());
    }

    private static float G(float f4, float f5, float f6, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f6 = timeInterpolator.getInterpolation(f6);
        }
        return A1.a.a(f4, f5, f6);
    }

    private float I(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static boolean L(Rect rect, int i4, int i5, int i6, int i7) {
        if (rect.left == i4 && rect.top == i5 && rect.right == i6 && rect.bottom == i7) {
            return true;
        }
        return false;
    }

    private void Q(float f4) {
        this.f12124m0 = f4;
        P.f0(this.f12099a);
    }

    private boolean U(Typeface typeface) {
        N1.a aVar = this.f12077E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f12142y == typeface) {
            return false;
        }
        this.f12142y = typeface;
        Typeface b4 = j.b(this.f12099a.getContext().getResources().getConfiguration(), typeface);
        this.f12141x = b4;
        if (b4 == null) {
            b4 = this.f12142y;
        }
        this.f12140w = b4;
        return true;
    }

    private void Y(float f4) {
        this.f12126n0 = f4;
        P.f0(this.f12099a);
    }

    private static int a(int i4, int i5, float f4) {
        float f5 = 1.0f - f4;
        return Color.argb(Math.round((((float) Color.alpha(i4)) * f5) + (((float) Color.alpha(i5)) * f4)), Math.round((((float) Color.red(i4)) * f5) + (((float) Color.red(i5)) * f4)), Math.round((((float) Color.green(i4)) * f5) + (((float) Color.green(i5)) * f4)), Math.round((((float) Color.blue(i4)) * f5) + (((float) Color.blue(i5)) * f4)));
    }

    private void b(boolean z3) {
        float f4;
        int i4;
        StaticLayout staticLayout;
        i(1.0f, z3);
        CharSequence charSequence = this.f12080H;
        if (!(charSequence == null || (staticLayout = this.f12120k0) == null)) {
            this.f12128o0 = TextUtils.ellipsize(charSequence, this.f12094V, (float) staticLayout.getWidth(), this.f12078F);
        }
        CharSequence charSequence2 = this.f12128o0;
        float f5 = 0.0f;
        if (charSequence2 != null) {
            this.f12122l0 = I(this.f12094V, charSequence2);
        } else {
            this.f12122l0 = 0.0f;
        }
        int b4 = C0434o.b(this.f12119k, this.f12081I ? 1 : 0);
        int i5 = b4 & 112;
        if (i5 == 48) {
            this.f12133r = (float) this.f12113h.top;
        } else if (i5 != 80) {
            this.f12133r = ((float) this.f12113h.centerY()) - ((this.f12094V.descent() - this.f12094V.ascent()) / 2.0f);
        } else {
            this.f12133r = ((float) this.f12113h.bottom) + this.f12094V.ascent();
        }
        int i6 = b4 & 8388615;
        if (i6 == 1) {
            this.f12137t = ((float) this.f12113h.centerX()) - (this.f12122l0 / 2.0f);
        } else if (i6 != 5) {
            this.f12137t = (float) this.f12113h.left;
        } else {
            this.f12137t = ((float) this.f12113h.right) - this.f12122l0;
        }
        i(0.0f, z3);
        StaticLayout staticLayout2 = this.f12120k0;
        if (staticLayout2 != null) {
            f4 = (float) staticLayout2.getHeight();
        } else {
            f4 = 0.0f;
        }
        StaticLayout staticLayout3 = this.f12120k0;
        if (staticLayout3 == null || this.f12130p0 <= 1) {
            CharSequence charSequence3 = this.f12080H;
            if (charSequence3 != null) {
                f5 = I(this.f12094V, charSequence3);
            }
        } else {
            f5 = (float) staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f12120k0;
        if (staticLayout4 != null) {
            i4 = staticLayout4.getLineCount();
        } else {
            i4 = 0;
        }
        this.f12129p = i4;
        int b5 = C0434o.b(this.f12117j, this.f12081I ? 1 : 0);
        int i7 = b5 & 112;
        if (i7 == 48) {
            this.f12131q = (float) this.f12111g.top;
        } else if (i7 != 80) {
            this.f12131q = ((float) this.f12111g.centerY()) - (f4 / 2.0f);
        } else {
            this.f12131q = (((float) this.f12111g.bottom) - f4) + this.f12094V.descent();
        }
        int i8 = b5 & 8388615;
        if (i8 == 1) {
            this.f12135s = ((float) this.f12111g.centerX()) - (f5 / 2.0f);
        } else if (i8 != 5) {
            this.f12135s = (float) this.f12111g.left;
        } else {
            this.f12135s = ((float) this.f12111g.right) - f5;
        }
        j();
        d0(this.f12101b);
    }

    private boolean b0(Typeface typeface) {
        N1.a aVar = this.f12076D;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f12074B == typeface) {
            return false;
        }
        this.f12074B = typeface;
        Typeface b4 = j.b(this.f12099a.getContext().getResources().getConfiguration(), typeface);
        this.f12073A = b4;
        if (b4 == null) {
            b4 = this.f12074B;
        }
        this.f12143z = b4;
        return true;
    }

    private void c() {
        g(this.f12101b);
    }

    private float d(float f4) {
        float f5 = this.f12107e;
        if (f4 <= f5) {
            return A1.a.b(1.0f, 0.0f, this.f12105d, f5, f4);
        }
        return A1.a.b(0.0f, 1.0f, f5, 1.0f, f4);
    }

    private void d0(float f4) {
        boolean z3;
        h(f4);
        if (!f12071t0 || this.f12086N == 1.0f) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f12083K = z3;
        if (z3) {
            n();
        }
        P.f0(this.f12099a);
    }

    private float e() {
        float f4 = this.f12105d;
        return f4 + ((1.0f - f4) * 0.5f);
    }

    private boolean f(CharSequence charSequence) {
        boolean D3 = D();
        if (this.f12082J) {
            return F(charSequence, D3);
        }
        return D3;
    }

    private void g(float f4) {
        float f5;
        B(f4);
        if (!this.f12103c) {
            this.f12138u = G(this.f12135s, this.f12137t, f4, this.f12096X);
            this.f12139v = G(this.f12131q, this.f12133r, f4, this.f12096X);
            d0(f4);
            f5 = f4;
        } else if (f4 < this.f12107e) {
            this.f12138u = this.f12135s;
            this.f12139v = this.f12131q;
            d0(0.0f);
            f5 = 0.0f;
        } else {
            this.f12138u = this.f12137t;
            this.f12139v = this.f12133r - ((float) Math.max(0, this.f12109f));
            d0(1.0f);
            f5 = 1.0f;
        }
        TimeInterpolator timeInterpolator = A1.a.f6b;
        Q(1.0f - G(0.0f, 1.0f, 1.0f - f4, timeInterpolator));
        Y(G(1.0f, 0.0f, f4, timeInterpolator));
        if (this.f12127o != this.f12125n) {
            this.f12094V.setColor(a(v(), t(), f5));
        } else {
            this.f12094V.setColor(t());
        }
        float f6 = this.f12114h0;
        float f7 = this.f12116i0;
        if (f6 != f7) {
            this.f12094V.setLetterSpacing(G(f7, f6, f4, timeInterpolator));
        } else {
            this.f12094V.setLetterSpacing(f6);
        }
        this.f12088P = G(this.f12106d0, this.f12098Z, f4, (TimeInterpolator) null);
        this.f12089Q = G(this.f12108e0, this.f12100a0, f4, (TimeInterpolator) null);
        this.f12090R = G(this.f12110f0, this.f12102b0, f4, (TimeInterpolator) null);
        int a4 = a(u(this.f12112g0), u(this.f12104c0), f4);
        this.f12091S = a4;
        this.f12094V.setShadowLayer(this.f12088P, this.f12089Q, this.f12090R, a4);
        if (this.f12103c) {
            this.f12094V.setAlpha((int) (d(f4) * ((float) this.f12094V.getAlpha())));
        }
        P.f0(this.f12099a);
    }

    private void h(float f4) {
        i(f4, false);
    }

    private void i(float f4, boolean z3) {
        float f5;
        float f6;
        Typeface typeface;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        if (this.f12079G != null) {
            float width = (float) this.f12113h.width();
            float width2 = (float) this.f12111g.width();
            if (C(f4, 1.0f)) {
                f6 = this.f12123m;
                f5 = this.f12114h0;
                this.f12086N = 1.0f;
                typeface = this.f12140w;
            } else {
                float f7 = this.f12121l;
                float f8 = this.f12116i0;
                Typeface typeface2 = this.f12143z;
                if (C(f4, 0.0f)) {
                    this.f12086N = 1.0f;
                } else {
                    this.f12086N = G(this.f12121l, this.f12123m, f4, this.f12097Y) / this.f12121l;
                }
                float f9 = this.f12123m / this.f12121l;
                float f10 = width2 * f9;
                if (!z3 && f10 > width) {
                    width = Math.min(width / f9, width2);
                } else {
                    width = width2;
                }
                f6 = f7;
                f5 = f8;
                typeface = typeface2;
            }
            int i4 = 1;
            boolean z9 = false;
            if (width > 0.0f) {
                if (this.f12087O != f6) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (this.f12118j0 != f5) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (this.f12075C != typeface) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                StaticLayout staticLayout = this.f12120k0;
                if (staticLayout == null || width == ((float) staticLayout.getWidth())) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (z4 || z5 || z7 || z6 || this.f12093U) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                this.f12087O = f6;
                this.f12118j0 = f5;
                this.f12075C = typeface;
                this.f12093U = false;
                TextPaint textPaint = this.f12094V;
                if (this.f12086N != 1.0f) {
                    z9 = true;
                }
                textPaint.setLinearText(z9);
                z9 = z8;
            }
            if (this.f12080H == null || z9) {
                this.f12094V.setTextSize(this.f12087O);
                this.f12094V.setTypeface(this.f12075C);
                this.f12094V.setLetterSpacing(this.f12118j0);
                this.f12081I = f(this.f12079G);
                if (j0()) {
                    i4 = this.f12130p0;
                }
                StaticLayout k4 = k(i4, width, this.f12081I);
                this.f12120k0 = k4;
                this.f12080H = k4.getText();
            }
        }
    }

    private void j() {
        Bitmap bitmap = this.f12084L;
        if (bitmap != null) {
            bitmap.recycle();
            this.f12084L = null;
        }
    }

    private boolean j0() {
        if (this.f12130p0 <= 1 || ((this.f12081I && !this.f12103c) || this.f12083K)) {
            return false;
        }
        return true;
    }

    private StaticLayout k(int i4, float f4, boolean z3) {
        Layout.Alignment alignment;
        StaticLayout staticLayout = null;
        if (i4 == 1) {
            try {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e4) {
                Log.e("CollapsingTextHelper", e4.getCause().getMessage(), e4);
            }
        } else {
            alignment = y();
        }
        staticLayout = StaticLayoutBuilderCompat.b(this.f12079G, this.f12094V, (int) f4).d(this.f12078F).g(z3).c(alignment).f(false).i(i4).h(this.f12132q0, this.f12134r0).e(this.f12136s0).j((g) null).a();
        return (StaticLayout) g.g(staticLayout);
    }

    private void m(Canvas canvas, float f4, float f5) {
        int alpha = this.f12094V.getAlpha();
        canvas.translate(f4, f5);
        if (!this.f12103c) {
            this.f12094V.setAlpha((int) (this.f12126n0 * ((float) alpha)));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.f12094V;
                textPaint.setShadowLayer(this.f12088P, this.f12089Q, this.f12090R, F1.a.a(this.f12091S, textPaint.getAlpha()));
            }
            Canvas canvas2 = canvas;
            this.f12120k0.draw(canvas);
        } else {
            Canvas canvas3 = canvas;
        }
        if (!this.f12103c) {
            this.f12094V.setAlpha((int) (this.f12124m0 * ((float) alpha)));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            TextPaint textPaint2 = this.f12094V;
            textPaint2.setShadowLayer(this.f12088P, this.f12089Q, this.f12090R, F1.a.a(this.f12091S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f12120k0.getLineBaseline(0);
        CharSequence charSequence = this.f12128o0;
        float f6 = (float) lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f6, this.f12094V);
        if (i4 >= 31) {
            this.f12094V.setShadowLayer(this.f12088P, this.f12089Q, this.f12090R, this.f12091S);
        }
        if (!this.f12103c) {
            String trim = this.f12128o0.toString().trim();
            if (trim.endsWith("…")) {
                trim = trim.substring(0, trim.length() - 1);
            }
            String str = trim;
            this.f12094V.setAlpha(alpha);
            canvas.drawText(str, 0, Math.min(this.f12120k0.getLineEnd(0), str.length()), 0.0f, f6, this.f12094V);
        }
    }

    private void n() {
        if (this.f12084L == null && !this.f12111g.isEmpty() && !TextUtils.isEmpty(this.f12080H)) {
            g(0.0f);
            int width = this.f12120k0.getWidth();
            int height = this.f12120k0.getHeight();
            if (width > 0 && height > 0) {
                this.f12084L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f12120k0.draw(new Canvas(this.f12084L));
                if (this.f12085M == null) {
                    this.f12085M = new Paint(3);
                }
            }
        }
    }

    private float r(int i4, int i5) {
        if (i5 == 17 || (i5 & 7) == 1) {
            return (((float) i4) / 2.0f) - (this.f12122l0 / 2.0f);
        }
        if ((i5 & 8388613) == 8388613 || (i5 & 5) == 5) {
            if (this.f12081I) {
                return (float) this.f12113h.left;
            }
            return ((float) this.f12113h.right) - this.f12122l0;
        } else if (this.f12081I) {
            return ((float) this.f12113h.right) - this.f12122l0;
        } else {
            return (float) this.f12113h.left;
        }
    }

    private float s(RectF rectF, int i4, int i5) {
        if (i5 == 17 || (i5 & 7) == 1) {
            return (((float) i4) / 2.0f) + (this.f12122l0 / 2.0f);
        }
        if ((i5 & 8388613) == 8388613 || (i5 & 5) == 5) {
            if (this.f12081I) {
                return rectF.left + this.f12122l0;
            }
            return (float) this.f12113h.right;
        } else if (this.f12081I) {
            return (float) this.f12113h.right;
        } else {
            return rectF.left + this.f12122l0;
        }
    }

    private int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f12092T;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    private int v() {
        return u(this.f12125n);
    }

    private Layout.Alignment y() {
        int b4 = C0434o.b(this.f12117j, this.f12081I ? 1 : 0) & 7;
        if (b4 == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (b4 != 5) {
            if (this.f12081I) {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        } else if (this.f12081I) {
            return Layout.Alignment.ALIGN_NORMAL;
        } else {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    private void z(TextPaint textPaint) {
        textPaint.setTextSize(this.f12123m);
        textPaint.setTypeface(this.f12140w);
        textPaint.setLetterSpacing(this.f12114h0);
    }

    public final boolean E() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f12127o;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = this.f12125n) == null || !colorStateList.isStateful())) {
            return false;
        }
        return true;
    }

    public void H(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f12142y;
            if (typeface != null) {
                this.f12141x = j.b(configuration, typeface);
            }
            Typeface typeface2 = this.f12074B;
            if (typeface2 != null) {
                this.f12073A = j.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f12141x;
            if (typeface3 == null) {
                typeface3 = this.f12142y;
            }
            this.f12140w = typeface3;
            Typeface typeface4 = this.f12073A;
            if (typeface4 == null) {
                typeface4 = this.f12074B;
            }
            this.f12143z = typeface4;
            K(true);
        }
    }

    public void J() {
        K(false);
    }

    public void K(boolean z3) {
        if ((this.f12099a.getHeight() > 0 && this.f12099a.getWidth() > 0) || z3) {
            b(z3);
            c();
        }
    }

    public void M(ColorStateList colorStateList) {
        if (this.f12127o != colorStateList || this.f12125n != colorStateList) {
            this.f12127o = colorStateList;
            this.f12125n = colorStateList;
            J();
        }
    }

    public void N(int i4, int i5, int i6, int i7) {
        if (!L(this.f12113h, i4, i5, i6, i7)) {
            this.f12113h.set(i4, i5, i6, i7);
            this.f12093U = true;
        }
    }

    public void O(Rect rect) {
        N(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void P(int i4) {
        d dVar = new d(this.f12099a.getContext(), i4);
        if (dVar.i() != null) {
            this.f12127o = dVar.i();
        }
        if (dVar.j() != 0.0f) {
            this.f12123m = dVar.j();
        }
        ColorStateList colorStateList = dVar.f999c;
        if (colorStateList != null) {
            this.f12104c0 = colorStateList;
        }
        this.f12100a0 = dVar.f1004h;
        this.f12102b0 = dVar.f1005i;
        this.f12098Z = dVar.f1006j;
        this.f12114h0 = dVar.f1008l;
        N1.a aVar = this.f12077E;
        if (aVar != null) {
            aVar.c();
        }
        this.f12077E = new N1.a(new C0171a(), dVar.e());
        dVar.g(this.f12099a.getContext(), this.f12077E);
        J();
    }

    public void R(ColorStateList colorStateList) {
        if (this.f12127o != colorStateList) {
            this.f12127o = colorStateList;
            J();
        }
    }

    public void S(int i4) {
        if (this.f12119k != i4) {
            this.f12119k = i4;
            J();
        }
    }

    public void T(Typeface typeface) {
        if (U(typeface)) {
            J();
        }
    }

    public void V(int i4, int i5, int i6, int i7) {
        if (!L(this.f12111g, i4, i5, i6, i7)) {
            this.f12111g.set(i4, i5, i6, i7);
            this.f12093U = true;
        }
    }

    public void W(Rect rect) {
        V(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void X(float f4) {
        if (this.f12116i0 != f4) {
            this.f12116i0 = f4;
            J();
        }
    }

    public void Z(int i4) {
        if (this.f12117j != i4) {
            this.f12117j = i4;
            J();
        }
    }

    public void a0(float f4) {
        if (this.f12121l != f4) {
            this.f12121l = f4;
            J();
        }
    }

    public void c0(float f4) {
        float a4 = I.a.a(f4, 0.0f, 1.0f);
        if (a4 != this.f12101b) {
            this.f12101b = a4;
            c();
        }
    }

    public void e0(TimeInterpolator timeInterpolator) {
        this.f12096X = timeInterpolator;
        J();
    }

    public final boolean f0(int[] iArr) {
        this.f12092T = iArr;
        if (!E()) {
            return false;
        }
        J();
        return true;
    }

    public void g0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f12079G, charSequence)) {
            this.f12079G = charSequence;
            this.f12080H = null;
            j();
            J();
        }
    }

    public void h0(TimeInterpolator timeInterpolator) {
        this.f12097Y = timeInterpolator;
        J();
    }

    public void i0(Typeface typeface) {
        boolean U3 = U(typeface);
        boolean b02 = b0(typeface);
        if (U3 || b02) {
            J();
        }
    }

    public void l(Canvas canvas) {
        boolean z3;
        int save = canvas.save();
        if (this.f12080H != null && this.f12115i.width() > 0.0f && this.f12115i.height() > 0.0f) {
            this.f12094V.setTextSize(this.f12087O);
            float f4 = this.f12138u;
            float f5 = this.f12139v;
            if (!this.f12083K || this.f12084L == null) {
                z3 = false;
            } else {
                z3 = true;
            }
            float f6 = this.f12086N;
            if (f6 != 1.0f && !this.f12103c) {
                canvas.scale(f6, f6, f4, f5);
            }
            if (z3) {
                canvas.drawBitmap(this.f12084L, f4, f5, this.f12085M);
                canvas.restoreToCount(save);
                return;
            }
            if (!j0() || (this.f12103c && this.f12101b <= this.f12107e)) {
                canvas.translate(f4, f5);
                this.f12120k0.draw(canvas);
            } else {
                m(canvas, this.f12138u - ((float) this.f12120k0.getLineStart(0)), f5);
            }
            canvas.restoreToCount(save);
        }
    }

    public void o(RectF rectF, int i4, int i5) {
        this.f12081I = f(this.f12079G);
        rectF.left = Math.max(r(i4, i5), (float) this.f12113h.left);
        rectF.top = (float) this.f12113h.top;
        rectF.right = Math.min(s(rectF, i4, i5), (float) this.f12113h.right);
        rectF.bottom = ((float) this.f12113h.top) + q();
    }

    public ColorStateList p() {
        return this.f12127o;
    }

    public float q() {
        z(this.f12095W);
        return -this.f12095W.ascent();
    }

    public int t() {
        return u(this.f12127o);
    }

    public float w() {
        A(this.f12095W);
        return -this.f12095W.ascent();
    }

    public float x() {
        return this.f12101b;
    }
}
