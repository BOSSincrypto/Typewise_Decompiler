package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.res.h;
import androidx.core.view.P;
import java.lang.ref.WeakReference;
import java.util.Locale;
import n.j;

class C {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f3155a;

    /* renamed from: b  reason: collision with root package name */
    private a0 f3156b;

    /* renamed from: c  reason: collision with root package name */
    private a0 f3157c;

    /* renamed from: d  reason: collision with root package name */
    private a0 f3158d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f3159e;

    /* renamed from: f  reason: collision with root package name */
    private a0 f3160f;

    /* renamed from: g  reason: collision with root package name */
    private a0 f3161g;

    /* renamed from: h  reason: collision with root package name */
    private a0 f3162h;

    /* renamed from: i  reason: collision with root package name */
    private final E f3163i;

    /* renamed from: j  reason: collision with root package name */
    private int f3164j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f3165k = -1;

    /* renamed from: l  reason: collision with root package name */
    private Typeface f3166l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f3167m;

    class a extends h.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f3168a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f3169b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WeakReference f3170c;

        a(int i4, int i5, WeakReference weakReference) {
            this.f3168a = i4;
            this.f3169b = i5;
            this.f3170c = weakReference;
        }

        public void h(int i4) {
        }

        public void i(Typeface typeface) {
            int i4;
            boolean z3;
            if (Build.VERSION.SDK_INT >= 28 && (i4 = this.f3168a) != -1) {
                if ((this.f3169b & 2) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                typeface = g.a(typeface, i4, z3);
            }
            C.this.n(this.f3170c, typeface);
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f3172a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Typeface f3173b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f3174c;

        b(TextView textView, Typeface typeface, int i4) {
            this.f3172a = textView;
            this.f3173b = typeface;
            this.f3174c = i4;
        }

        public void run() {
            this.f3172a.setTypeface(this.f3173b, this.f3174c);
        }
    }

    static class c {
        static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    static class d {
        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    static class e {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    static class f {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i4, int i5, int i6, int i7) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
        }

        static void c(TextView textView, int[] iArr, int i4) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    static class g {
        static Typeface a(Typeface typeface, int i4, boolean z3) {
            return Typeface.create(typeface, i4, z3);
        }
    }

    C(TextView textView) {
        this.f3155a = textView;
        this.f3163i = new E(textView);
    }

    private void B(int i4, float f4) {
        this.f3163i.t(i4, f4);
    }

    private void C(Context context, c0 c0Var) {
        String o4;
        boolean z3;
        boolean z4;
        this.f3164j = c0Var.k(j.f14870H2, this.f3164j);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            int k4 = c0Var.k(j.f14878J2, -1);
            this.f3165k = k4;
            if (k4 != -1) {
                this.f3164j &= 2;
            }
        }
        int i5 = j.f14874I2;
        boolean z5 = true;
        if (c0Var.s(i5) || c0Var.s(j.f14882K2)) {
            this.f3166l = null;
            int i6 = j.f14882K2;
            if (c0Var.s(i6)) {
                i5 = i6;
            }
            int i7 = this.f3165k;
            int i8 = this.f3164j;
            if (!context.isRestricted()) {
                try {
                    Typeface j4 = c0Var.j(i5, this.f3164j, new a(i7, i8, new WeakReference(this.f3155a)));
                    if (j4 != null) {
                        if (i4 < 28 || this.f3165k == -1) {
                            this.f3166l = j4;
                        } else {
                            Typeface create = Typeface.create(j4, 0);
                            int i9 = this.f3165k;
                            if ((this.f3164j & 2) != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            this.f3166l = g.a(create, i9, z4);
                        }
                    }
                    if (this.f3166l == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.f3167m = z3;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f3166l == null && (o4 = c0Var.o(i5)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f3165k == -1) {
                    this.f3166l = Typeface.create(o4, this.f3164j);
                    return;
                }
                Typeface create2 = Typeface.create(o4, 0);
                int i10 = this.f3165k;
                if ((this.f3164j & 2) == 0) {
                    z5 = false;
                }
                this.f3166l = g.a(create2, i10, z5);
                return;
            }
            return;
        }
        int i11 = j.f14866G2;
        if (c0Var.s(i11)) {
            this.f3167m = false;
            int k5 = c0Var.k(i11, 1);
            if (k5 == 1) {
                this.f3166l = Typeface.SANS_SERIF;
            } else if (k5 == 2) {
                this.f3166l = Typeface.SERIF;
            } else if (k5 == 3) {
                this.f3166l = Typeface.MONOSPACE;
            }
        }
    }

    private void a(Drawable drawable, a0 a0Var) {
        if (drawable != null && a0Var != null) {
            C0387k.i(drawable, a0Var, this.f3155a.getDrawableState());
        }
    }

    private static a0 d(Context context, C0387k kVar, int i4) {
        ColorStateList f4 = kVar.f(context, i4);
        if (f4 == null) {
            return null;
        }
        a0 a0Var = new a0();
        a0Var.f3508d = true;
        a0Var.f3505a = f4;
        return a0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] a4 = c.a(this.f3155a);
            TextView textView = this.f3155a;
            if (drawable5 == null) {
                drawable5 = a4[0];
            }
            if (drawable2 == null) {
                drawable2 = a4[1];
            }
            if (drawable6 == null) {
                drawable6 = a4[2];
            }
            if (drawable4 == null) {
                drawable4 = a4[3];
            }
            c.b(textView, drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            Drawable[] a5 = c.a(this.f3155a);
            Drawable drawable7 = a5[0];
            if (drawable7 == null && a5[2] == null) {
                Drawable[] compoundDrawables = this.f3155a.getCompoundDrawables();
                TextView textView2 = this.f3155a;
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            TextView textView3 = this.f3155a;
            if (drawable2 == null) {
                drawable2 = a5[1];
            }
            Drawable drawable8 = a5[2];
            if (drawable4 == null) {
                drawable4 = a5[3];
            }
            c.b(textView3, drawable7, drawable2, drawable8, drawable4);
        }
    }

    private void z() {
        a0 a0Var = this.f3162h;
        this.f3156b = a0Var;
        this.f3157c = a0Var;
        this.f3158d = a0Var;
        this.f3159e = a0Var;
        this.f3160f = a0Var;
        this.f3161g = a0Var;
    }

    /* access modifiers changed from: package-private */
    public void A(int i4, float f4) {
        if (!n0.f3645b && !l()) {
            B(i4, f4);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (!(this.f3156b == null && this.f3157c == null && this.f3158d == null && this.f3159e == null)) {
            Drawable[] compoundDrawables = this.f3155a.getCompoundDrawables();
            a(compoundDrawables[0], this.f3156b);
            a(compoundDrawables[1], this.f3157c);
            a(compoundDrawables[2], this.f3158d);
            a(compoundDrawables[3], this.f3159e);
        }
        if (this.f3160f != null || this.f3161g != null) {
            Drawable[] a4 = c.a(this.f3155a);
            a(a4[0], this.f3160f);
            a(a4[2], this.f3161g);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f3163i.a();
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f3163i.f();
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f3163i.g();
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f3163i.h();
    }

    /* access modifiers changed from: package-private */
    public int[] h() {
        return this.f3163i.i();
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.f3163i.j();
    }

    /* access modifiers changed from: package-private */
    public ColorStateList j() {
        a0 a0Var = this.f3162h;
        if (a0Var != null) {
            return a0Var.f3505a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode k() {
        a0 a0Var = this.f3162h;
        if (a0Var != null) {
            return a0Var.f3506b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.f3163i.n();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0208  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(android.util.AttributeSet r20, int r21) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            android.widget.TextView r0 = r7.f3155a
            android.content.Context r10 = r0.getContext()
            androidx.appcompat.widget.k r11 = androidx.appcompat.widget.C0387k.b()
            int[] r2 = n.j.f14935Y
            r12 = 0
            androidx.appcompat.widget.c0 r13 = androidx.appcompat.widget.c0.v(r10, r8, r2, r9, r12)
            android.widget.TextView r0 = r7.f3155a
            android.content.Context r1 = r0.getContext()
            android.content.res.TypedArray r4 = r13.r()
            r6 = 0
            r3 = r20
            r5 = r21
            androidx.core.view.P.m0(r0, r1, r2, r3, r4, r5, r6)
            int r0 = n.j.f14939Z
            r14 = -1
            int r0 = r13.n(r0, r14)
            int r1 = n.j.f14954c0
            boolean r2 = r13.s(r1)
            if (r2 == 0) goto L_0x0042
            int r1 = r13.n(r1, r12)
            androidx.appcompat.widget.a0 r1 = d(r10, r11, r1)
            r7.f3156b = r1
        L_0x0042:
            int r1 = n.j.f14944a0
            boolean r2 = r13.s(r1)
            if (r2 == 0) goto L_0x0054
            int r1 = r13.n(r1, r12)
            androidx.appcompat.widget.a0 r1 = d(r10, r11, r1)
            r7.f3157c = r1
        L_0x0054:
            int r1 = n.j.f14959d0
            boolean r2 = r13.s(r1)
            if (r2 == 0) goto L_0x0066
            int r1 = r13.n(r1, r12)
            androidx.appcompat.widget.a0 r1 = d(r10, r11, r1)
            r7.f3158d = r1
        L_0x0066:
            int r1 = n.j.f14949b0
            boolean r2 = r13.s(r1)
            if (r2 == 0) goto L_0x0078
            int r1 = r13.n(r1, r12)
            androidx.appcompat.widget.a0 r1 = d(r10, r11, r1)
            r7.f3159e = r1
        L_0x0078:
            int r1 = android.os.Build.VERSION.SDK_INT
            int r2 = n.j.f14964e0
            boolean r3 = r13.s(r2)
            if (r3 == 0) goto L_0x008c
            int r2 = r13.n(r2, r12)
            androidx.appcompat.widget.a0 r2 = d(r10, r11, r2)
            r7.f3160f = r2
        L_0x008c:
            int r2 = n.j.f14969f0
            boolean r3 = r13.s(r2)
            if (r3 == 0) goto L_0x009e
            int r2 = r13.n(r2, r12)
            androidx.appcompat.widget.a0 r2 = d(r10, r11, r2)
            r7.f3161g = r2
        L_0x009e:
            r13.w()
            android.widget.TextView r2 = r7.f3155a
            android.text.method.TransformationMethod r2 = r2.getTransformationMethod()
            boolean r2 = r2 instanceof android.text.method.PasswordTransformationMethod
            r3 = 26
            if (r0 == r14) goto L_0x00ea
            int[] r5 = n.j.f14858E2
            androidx.appcompat.widget.c0 r0 = androidx.appcompat.widget.c0.t(r10, r0, r5)
            if (r2 != 0) goto L_0x00c3
            int r5 = n.j.f14890M2
            boolean r6 = r0.s(r5)
            if (r6 == 0) goto L_0x00c3
            boolean r5 = r0.a(r5, r12)
            r6 = 1
            goto L_0x00c5
        L_0x00c3:
            r5 = r12
            r6 = r5
        L_0x00c5:
            r7.C(r10, r0)
            int r15 = n.j.f14894N2
            boolean r16 = r0.s(r15)
            if (r16 == 0) goto L_0x00d5
            java.lang.String r15 = r0.o(r15)
            goto L_0x00d6
        L_0x00d5:
            r15 = 0
        L_0x00d6:
            if (r1 < r3) goto L_0x00e5
            int r4 = n.j.f14886L2
            boolean r17 = r0.s(r4)
            if (r17 == 0) goto L_0x00e5
            java.lang.String r4 = r0.o(r4)
            goto L_0x00e6
        L_0x00e5:
            r4 = 0
        L_0x00e6:
            r0.w()
            goto L_0x00ee
        L_0x00ea:
            r5 = r12
            r6 = r5
            r4 = 0
            r15 = 0
        L_0x00ee:
            int[] r0 = n.j.f14858E2
            androidx.appcompat.widget.c0 r0 = androidx.appcompat.widget.c0.v(r10, r8, r0, r9, r12)
            if (r2 != 0) goto L_0x0105
            int r13 = n.j.f14890M2
            boolean r18 = r0.s(r13)
            if (r18 == 0) goto L_0x0105
            boolean r5 = r0.a(r13, r12)
            r16 = 1
            goto L_0x0107
        L_0x0105:
            r16 = r6
        L_0x0107:
            int r6 = n.j.f14894N2
            boolean r13 = r0.s(r6)
            if (r13 == 0) goto L_0x0113
            java.lang.String r15 = r0.o(r6)
        L_0x0113:
            if (r1 < r3) goto L_0x0121
            int r3 = n.j.f14886L2
            boolean r6 = r0.s(r3)
            if (r6 == 0) goto L_0x0121
            java.lang.String r4 = r0.o(r3)
        L_0x0121:
            r3 = 28
            if (r1 < r3) goto L_0x0139
            int r3 = n.j.f14862F2
            boolean r6 = r0.s(r3)
            if (r6 == 0) goto L_0x0139
            int r3 = r0.f(r3, r14)
            if (r3 != 0) goto L_0x0139
            android.widget.TextView r3 = r7.f3155a
            r6 = 0
            r3.setTextSize(r12, r6)
        L_0x0139:
            r7.C(r10, r0)
            r0.w()
            if (r2 != 0) goto L_0x0146
            if (r16 == 0) goto L_0x0146
            r7.s(r5)
        L_0x0146:
            android.graphics.Typeface r0 = r7.f3166l
            if (r0 == 0) goto L_0x015b
            int r2 = r7.f3165k
            if (r2 != r14) goto L_0x0156
            android.widget.TextView r2 = r7.f3155a
            int r3 = r7.f3164j
            r2.setTypeface(r0, r3)
            goto L_0x015b
        L_0x0156:
            android.widget.TextView r2 = r7.f3155a
            r2.setTypeface(r0)
        L_0x015b:
            if (r4 == 0) goto L_0x0162
            android.widget.TextView r0 = r7.f3155a
            androidx.appcompat.widget.C.f.d(r0, r4)
        L_0x0162:
            if (r15 == 0) goto L_0x0183
            r0 = 24
            if (r1 < r0) goto L_0x0172
            android.widget.TextView r0 = r7.f3155a
            android.os.LocaleList r1 = androidx.appcompat.widget.C.e.a(r15)
            androidx.appcompat.widget.C.e.b(r0, r1)
            goto L_0x0183
        L_0x0172:
            java.lang.String r0 = ","
            java.lang.String[] r0 = r15.split(r0)
            r0 = r0[r12]
            android.widget.TextView r1 = r7.f3155a
            java.util.Locale r0 = androidx.appcompat.widget.C.d.a(r0)
            androidx.appcompat.widget.C.c.c(r1, r0)
        L_0x0183:
            androidx.appcompat.widget.E r0 = r7.f3163i
            r0.o(r8, r9)
            boolean r0 = androidx.appcompat.widget.n0.f3645b
            if (r0 == 0) goto L_0x01c7
            androidx.appcompat.widget.E r0 = r7.f3163i
            int r0 = r0.j()
            if (r0 == 0) goto L_0x01c7
            androidx.appcompat.widget.E r0 = r7.f3163i
            int[] r0 = r0.i()
            int r1 = r0.length
            if (r1 <= 0) goto L_0x01c7
            android.widget.TextView r1 = r7.f3155a
            int r1 = androidx.appcompat.widget.C.f.a(r1)
            float r1 = (float) r1
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x01c2
            android.widget.TextView r0 = r7.f3155a
            androidx.appcompat.widget.E r1 = r7.f3163i
            int r1 = r1.g()
            androidx.appcompat.widget.E r2 = r7.f3163i
            int r2 = r2.f()
            androidx.appcompat.widget.E r3 = r7.f3163i
            int r3 = r3.h()
            androidx.appcompat.widget.C.f.b(r0, r1, r2, r3, r12)
            goto L_0x01c7
        L_0x01c2:
            android.widget.TextView r1 = r7.f3155a
            androidx.appcompat.widget.C.f.c(r1, r0, r12)
        L_0x01c7:
            int[] r0 = n.j.f14974g0
            androidx.appcompat.widget.c0 r8 = androidx.appcompat.widget.c0.u(r10, r8, r0)
            int r0 = n.j.f15014o0
            int r0 = r8.n(r0, r14)
            if (r0 == r14) goto L_0x01db
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r1 = r0
            goto L_0x01dc
        L_0x01db:
            r1 = 0
        L_0x01dc:
            int r0 = n.j.f15039t0
            int r0 = r8.n(r0, r14)
            if (r0 == r14) goto L_0x01ea
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r2 = r0
            goto L_0x01eb
        L_0x01ea:
            r2 = 0
        L_0x01eb:
            int r0 = n.j.f15019p0
            int r0 = r8.n(r0, r14)
            if (r0 == r14) goto L_0x01f9
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r3 = r0
            goto L_0x01fa
        L_0x01f9:
            r3 = 0
        L_0x01fa:
            int r0 = n.j.f15004m0
            int r0 = r8.n(r0, r14)
            if (r0 == r14) goto L_0x0208
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r4 = r0
            goto L_0x0209
        L_0x0208:
            r4 = 0
        L_0x0209:
            int r0 = n.j.f15024q0
            int r0 = r8.n(r0, r14)
            if (r0 == r14) goto L_0x0217
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r5 = r0
            goto L_0x0218
        L_0x0217:
            r5 = 0
        L_0x0218:
            int r0 = n.j.f15009n0
            int r0 = r8.n(r0, r14)
            if (r0 == r14) goto L_0x0226
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r6 = r0
            goto L_0x0227
        L_0x0226:
            r6 = 0
        L_0x0227:
            r0 = r19
            r0.y(r1, r2, r3, r4, r5, r6)
            int r0 = n.j.f15029r0
            boolean r1 = r8.s(r0)
            if (r1 == 0) goto L_0x023d
            android.content.res.ColorStateList r0 = r8.c(r0)
            android.widget.TextView r1 = r7.f3155a
            androidx.core.widget.j.h(r1, r0)
        L_0x023d:
            int r0 = n.j.f15034s0
            boolean r1 = r8.s(r0)
            if (r1 == 0) goto L_0x0253
            int r0 = r8.k(r0, r14)
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.K.d(r0, r1)
            android.widget.TextView r1 = r7.f3155a
            androidx.core.widget.j.i(r1, r0)
        L_0x0253:
            int r0 = n.j.f15048v0
            int r0 = r8.f(r0, r14)
            int r1 = n.j.f15052w0
            int r1 = r8.f(r1, r14)
            int r2 = n.j.f15056x0
            int r2 = r8.f(r2, r14)
            r8.w()
            if (r0 == r14) goto L_0x026f
            android.widget.TextView r3 = r7.f3155a
            androidx.core.widget.j.k(r3, r0)
        L_0x026f:
            if (r1 == r14) goto L_0x0276
            android.widget.TextView r0 = r7.f3155a
            androidx.core.widget.j.l(r0, r1)
        L_0x0276:
            if (r2 == r14) goto L_0x027d
            android.widget.TextView r0 = r7.f3155a
            androidx.core.widget.j.m(r0, r2)
        L_0x027d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C.m(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    public void n(WeakReference weakReference, Typeface typeface) {
        if (this.f3167m) {
            this.f3166l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView == null) {
                return;
            }
            if (P.R(textView)) {
                textView.post(new b(textView, typeface, this.f3164j));
            } else {
                textView.setTypeface(typeface, this.f3164j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void o(boolean z3, int i4, int i5, int i6, int i7) {
        if (!n0.f3645b) {
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        b();
    }

    /* access modifiers changed from: package-private */
    public void q(Context context, int i4) {
        String o4;
        c0 t4 = c0.t(context, i4, j.f14858E2);
        int i5 = j.f14890M2;
        if (t4.s(i5)) {
            s(t4.a(i5, false));
        }
        int i6 = Build.VERSION.SDK_INT;
        int i7 = j.f14862F2;
        if (t4.s(i7) && t4.f(i7, -1) == 0) {
            this.f3155a.setTextSize(0, 0.0f);
        }
        C(context, t4);
        if (i6 >= 26) {
            int i8 = j.f14886L2;
            if (t4.s(i8) && (o4 = t4.o(i8)) != null) {
                f.d(this.f3155a, o4);
            }
        }
        t4.w();
        Typeface typeface = this.f3166l;
        if (typeface != null) {
            this.f3155a.setTypeface(typeface, this.f3164j);
        }
    }

    /* access modifiers changed from: package-private */
    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            J.c.f(editorInfo, textView.getText());
        }
    }

    /* access modifiers changed from: package-private */
    public void s(boolean z3) {
        this.f3155a.setAllCaps(z3);
    }

    /* access modifiers changed from: package-private */
    public void t(int i4, int i5, int i6, int i7) {
        this.f3163i.p(i4, i5, i6, i7);
    }

    /* access modifiers changed from: package-private */
    public void u(int[] iArr, int i4) {
        this.f3163i.q(iArr, i4);
    }

    /* access modifiers changed from: package-private */
    public void v(int i4) {
        this.f3163i.r(i4);
    }

    /* access modifiers changed from: package-private */
    public void w(ColorStateList colorStateList) {
        boolean z3;
        if (this.f3162h == null) {
            this.f3162h = new a0();
        }
        a0 a0Var = this.f3162h;
        a0Var.f3505a = colorStateList;
        if (colorStateList != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        a0Var.f3508d = z3;
        z();
    }

    /* access modifiers changed from: package-private */
    public void x(PorterDuff.Mode mode) {
        boolean z3;
        if (this.f3162h == null) {
            this.f3162h = new a0();
        }
        a0 a0Var = this.f3162h;
        a0Var.f3506b = mode;
        if (mode != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        a0Var.f3507c = z3;
        z();
    }
}
