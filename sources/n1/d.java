package N1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import androidx.core.content.res.h;
import z1.j;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f997a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f998b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f999c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1000d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1001e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1002f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1003g;

    /* renamed from: h  reason: collision with root package name */
    public final float f1004h;

    /* renamed from: i  reason: collision with root package name */
    public final float f1005i;

    /* renamed from: j  reason: collision with root package name */
    public final float f1006j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f1007k;

    /* renamed from: l  reason: collision with root package name */
    public final float f1008l;

    /* renamed from: m  reason: collision with root package name */
    private ColorStateList f1009m;

    /* renamed from: n  reason: collision with root package name */
    private float f1010n;

    /* renamed from: o  reason: collision with root package name */
    private final int f1011o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public boolean f1012p = false;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public Typeface f1013q;

    class a extends h.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f1014a;

        a(f fVar) {
            this.f1014a = fVar;
        }

        public void h(int i4) {
            boolean unused = d.this.f1012p = true;
            this.f1014a.a(i4);
        }

        public void i(Typeface typeface) {
            d dVar = d.this;
            Typeface unused = dVar.f1013q = Typeface.create(typeface, dVar.f1001e);
            boolean unused2 = d.this.f1012p = true;
            this.f1014a.b(d.this.f1013q, false);
        }
    }

    class b extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f1016a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextPaint f1017b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f1018c;

        b(Context context, TextPaint textPaint, f fVar) {
            this.f1016a = context;
            this.f1017b = textPaint;
            this.f1018c = fVar;
        }

        public void a(int i4) {
            this.f1018c.a(i4);
        }

        public void b(Typeface typeface, boolean z3) {
            d.this.p(this.f1016a, this.f1017b, typeface);
            this.f1018c.b(typeface, z3);
        }
    }

    public d(Context context, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, j.T4);
        l(obtainStyledAttributes.getDimension(j.U4, 0.0f));
        k(c.a(context, obtainStyledAttributes, j.X4));
        this.f997a = c.a(context, obtainStyledAttributes, j.Y4);
        this.f998b = c.a(context, obtainStyledAttributes, j.Z4);
        this.f1001e = obtainStyledAttributes.getInt(j.W4, 0);
        this.f1002f = obtainStyledAttributes.getInt(j.V4, 1);
        int e4 = c.e(obtainStyledAttributes, j.f5, j.e5);
        this.f1011o = obtainStyledAttributes.getResourceId(e4, 0);
        this.f1000d = obtainStyledAttributes.getString(e4);
        this.f1003g = obtainStyledAttributes.getBoolean(j.g5, false);
        this.f999c = c.a(context, obtainStyledAttributes, j.a5);
        this.f1004h = obtainStyledAttributes.getFloat(j.b5, 0.0f);
        this.f1005i = obtainStyledAttributes.getFloat(j.c5, 0.0f);
        this.f1006j = obtainStyledAttributes.getFloat(j.d5, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i4, j.f16692o3);
        int i5 = j.f16697p3;
        this.f1007k = obtainStyledAttributes2.hasValue(i5);
        this.f1008l = obtainStyledAttributes2.getFloat(i5, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f1013q == null && (str = this.f1000d) != null) {
            this.f1013q = Typeface.create(str, this.f1001e);
        }
        if (this.f1013q == null) {
            int i4 = this.f1002f;
            if (i4 == 1) {
                this.f1013q = Typeface.SANS_SERIF;
            } else if (i4 == 2) {
                this.f1013q = Typeface.SERIF;
            } else if (i4 != 3) {
                this.f1013q = Typeface.DEFAULT;
            } else {
                this.f1013q = Typeface.MONOSPACE;
            }
            this.f1013q = Typeface.create(this.f1013q, this.f1001e);
        }
    }

    private boolean m(Context context) {
        Typeface typeface;
        if (e.a()) {
            return true;
        }
        int i4 = this.f1011o;
        if (i4 != 0) {
            typeface = h.c(context, i4);
        } else {
            typeface = null;
        }
        if (typeface != null) {
            return true;
        }
        return false;
    }

    public Typeface e() {
        d();
        return this.f1013q;
    }

    public Typeface f(Context context) {
        if (this.f1012p) {
            return this.f1013q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface g4 = h.g(context, this.f1011o);
                this.f1013q = g4;
                if (g4 != null) {
                    this.f1013q = Typeface.create(g4, this.f1001e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception unused2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error loading font ");
                sb.append(this.f1000d);
            }
        }
        d();
        this.f1012p = true;
        return this.f1013q;
    }

    public void g(Context context, f fVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i4 = this.f1011o;
        if (i4 == 0) {
            this.f1012p = true;
        }
        if (this.f1012p) {
            fVar.b(this.f1013q, true);
            return;
        }
        try {
            h.i(context, i4, new a(fVar), (Handler) null);
        } catch (Resources.NotFoundException unused) {
            this.f1012p = true;
            fVar.a(1);
        } catch (Exception unused2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error loading font ");
            sb.append(this.f1000d);
            this.f1012p = true;
            fVar.a(-3);
        }
    }

    public void h(Context context, TextPaint textPaint, f fVar) {
        p(context, textPaint, e());
        g(context, new b(context, textPaint, fVar));
    }

    public ColorStateList i() {
        return this.f1009m;
    }

    public float j() {
        return this.f1010n;
    }

    public void k(ColorStateList colorStateList) {
        this.f1009m = colorStateList;
    }

    public void l(float f4) {
        this.f1010n = f4;
    }

    public void n(Context context, TextPaint textPaint, f fVar) {
        int i4;
        int i5;
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f1009m;
        if (colorStateList != null) {
            i4 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i4 = -16777216;
        }
        textPaint.setColor(i4);
        float f4 = this.f1006j;
        float f5 = this.f1004h;
        float f6 = this.f1005i;
        ColorStateList colorStateList2 = this.f999c;
        if (colorStateList2 != null) {
            i5 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i5 = 0;
        }
        textPaint.setShadowLayer(f4, f5, f6, i5);
    }

    public void o(Context context, TextPaint textPaint, f fVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            h(context, textPaint, fVar);
        }
    }

    public void p(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z3;
        float f4;
        Typeface a4 = j.a(context, typeface);
        if (a4 != null) {
            typeface = a4;
        }
        textPaint.setTypeface(typeface);
        int i4 = this.f1001e & (~typeface.getStyle());
        if ((i4 & 1) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        textPaint.setFakeBoldText(z3);
        if ((i4 & 2) != 0) {
            f4 = -0.25f;
        } else {
            f4 = 0.0f;
        }
        textPaint.setTextSkewX(f4);
        textPaint.setTextSize(this.f1010n);
        if (this.f1007k) {
            textPaint.setLetterSpacing(this.f1008l);
        }
    }
}
