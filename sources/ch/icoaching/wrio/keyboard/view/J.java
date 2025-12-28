package ch.icoaching.wrio.keyboard.view;

import M0.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.LinearLayout;
import ch.icoaching.wrio.C0548l;
import ch.icoaching.wrio.C0552p;
import ch.icoaching.wrio.C0553q;
import ch.icoaching.wrio.keyboard.D;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import ch.icoaching.wrio.keyboard.view.C0531f;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class J extends C0531f {

    /* renamed from: z  reason: collision with root package name */
    public static final a f10161z = new a((i) null);

    /* renamed from: i  reason: collision with root package name */
    private final Paint f10162i;

    /* renamed from: j  reason: collision with root package name */
    private final Paint f10163j;

    /* renamed from: k  reason: collision with root package name */
    private final Paint f10164k;

    /* renamed from: l  reason: collision with root package name */
    private final float f10165l;

    /* renamed from: m  reason: collision with root package name */
    private final int f10166m;

    /* renamed from: n  reason: collision with root package name */
    private Drawable f10167n;

    /* renamed from: o  reason: collision with root package name */
    private Drawable f10168o;

    /* renamed from: p  reason: collision with root package name */
    private Drawable f10169p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f10170q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f10171r;

    /* renamed from: s  reason: collision with root package name */
    private Drawable f10172s;

    /* renamed from: t  reason: collision with root package name */
    private Drawable f10173t;

    /* renamed from: u  reason: collision with root package name */
    private Path f10174u;

    /* renamed from: v  reason: collision with root package name */
    private Path f10175v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public Path f10176w;

    /* renamed from: x  reason: collision with root package name */
    private float f10177x;

    /* renamed from: y  reason: collision with root package name */
    private float f10178y;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final J a(Context context, d dVar, ThemeModel themeModel) {
            o.e(context, "context");
            o.e(dVar, "keyModel");
            o.e(themeModel, "themeModel");
            J j4 = new J(context);
            j4.setId(View.generateViewId());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dVar.g(), dVar.d());
            layoutParams.width = dVar.g();
            layoutParams.height = dVar.d();
            j4.setLayoutParams(layoutParams);
            j4.setModel(dVar);
            j4.setTheme(themeModel);
            if (themeModel.getBoxShadowColor() != null) {
                j4.setElevation((float) C0553q.a(1));
            }
            return j4;
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10179a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ch.icoaching.wrio.keyboard.KeyCase[] r0 = ch.icoaching.wrio.keyboard.KeyCase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ch.icoaching.wrio.keyboard.KeyCase r1 = ch.icoaching.wrio.keyboard.KeyCase.LOWERCASE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ch.icoaching.wrio.keyboard.KeyCase r1 = ch.icoaching.wrio.keyboard.KeyCase.UPPERCASE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ch.icoaching.wrio.keyboard.KeyCase r1 = ch.icoaching.wrio.keyboard.KeyCase.CAPS_LOCK     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f10179a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.keyboard.view.J.b.<clinit>():void");
        }
    }

    public static final class c extends ViewOutlineProvider {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ J f10180a;

        c(J j4) {
            this.f10180a = j4;
        }

        public void getOutline(View view, Outline outline) {
            o.e(view, "view");
            o.e(outline, "outline");
            Path path = null;
            if (Build.VERSION.SDK_INT >= 30) {
                Path k4 = this.f10180a.f10176w;
                if (k4 == null) {
                    o.p("hexagonPath");
                } else {
                    path = k4;
                }
                outline.setPath(path);
                return;
            }
            try {
                Path k5 = this.f10180a.f10176w;
                if (k5 == null) {
                    o.p("hexagonPath");
                } else {
                    path = k5;
                }
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public J(Context context) {
        this(context, (AttributeSet) null);
        o.e(context, "context");
    }

    private final void l(int i4, int i5, int i6, int i7) {
        d.b bVar;
        d keyModel = getKeyModel();
        if (keyModel != null) {
            bVar = keyModel.f();
        } else {
            bVar = null;
        }
        if (o.a(bVar, d.b.a.INSTANCE)) {
            Drawable d4 = androidx.core.content.a.d(getContext(), D.ic_keyboard_backspace_white);
            if (d4 != null) {
                C0531f.e(this, d4, i4, i5, i4 + i6, i5 + i7, 0, 0, 0.755f, 48, (Object) null);
                this.f10169p = d4;
                return;
            }
            throw new IllegalStateException("Couldn't load ic_keyboard_backspace_white drawable");
        } else if (o.a(bVar, d.b.l.INSTANCE)) {
            Drawable d5 = androidx.core.content.a.d(getContext(), D.ic_keyboard_return_white);
            if (d5 != null) {
                C0531f.e(this, d5, i4, i5, i4 + i6, i5 + i7, 0, C0552p.a(0.5f), 0.5f, 16, (Object) null);
                this.f10173t = d5;
                return;
            }
            throw new IllegalStateException("Couldn't load ic_keyboard_return_white drawable");
        } else if (o.a(bVar, d.b.m.INSTANCE)) {
            Drawable d6 = androidx.core.content.a.d(getContext(), D.ic_keyboard_shift_lowercase_white);
            if (d6 != null) {
                int i8 = i4 + i6;
                int i9 = i5 + i7;
                C0531f.e(this, d6, i4, i5, i8, i9, 0, C0553q.a(-1), 0.745f, 16, (Object) null);
                this.f10168o = d6;
                Drawable d7 = androidx.core.content.a.d(getContext(), D.ic_keyboard_shift_uppercase_white);
                if (d7 != null) {
                    C0531f.e(this, d7, i4, i5, i8, i9, 0, C0553q.a(-1), 0.745f, 16, (Object) null);
                    this.f10167n = d7;
                    Drawable d8 = androidx.core.content.a.d(getContext(), D.ic_keyboard_capslock_white);
                    if (d8 != null) {
                        C0531f.e(this, d8, i4, i5, i8, i9, 0, C0553q.a(1), 0.6f, 16, (Object) null);
                        this.f10170q = d8;
                        return;
                    }
                    throw new IllegalStateException("Couldn't load ic_keyboard_capslock_white drawable");
                }
                throw new IllegalStateException("Couldn't load ic_keyboard_shift_uppercase_white drawable");
            }
            throw new IllegalStateException("Couldn't load ic_keyboard_shift_lowercase_white drawable");
        } else if (o.a(bVar, d.b.C0011d.INSTANCE) || o.a(bVar, d.b.k.INSTANCE)) {
            Drawable d9 = androidx.core.content.a.d(getContext(), D.ic_keyboard_smiley_white);
            if (d9 != null) {
                int i10 = i4 + i6;
                int i11 = i5 + i7;
                C0531f.e(this, d9, i4, i5, i10, i11, 0, 0, 0.45f, 48, (Object) null);
                this.f10172s = d9;
                Drawable d10 = androidx.core.content.a.d(getContext(), D.ic_keyboard_numbers_white);
                if (d10 != null) {
                    C0531f.e(this, d10, i4, i5, i10, i11, 0, 0, 0.8f, 48, (Object) null);
                    this.f10171r = d10;
                    return;
                }
                throw new IllegalStateException("Couldn't load ic_keyboard_numbers_white drawable");
            }
            throw new IllegalStateException("Couldn't load ic_keyboard_smiley_white drawable");
        } else if (o.a(bVar, d.b.e.INSTANCE)) {
            Drawable d11 = androidx.core.content.a.d(getContext(), D.ic_keyboard_smiley_white);
            if (d11 != null) {
                int i12 = i4 + i6;
                int i13 = i5 + i7;
                int i14 = i13 / 2;
                C0531f.e(this, d11, i4, i5, i12, i14, 0, C0553q.a(3), 0.55f, 16, (Object) null);
                this.f10172s = d11;
                Drawable d12 = androidx.core.content.a.d(getContext(), D.ic_keyboard_numbers_white);
                if (d12 != null) {
                    C0531f.e(this, d12, i4, i14, i12, i13, 0, C0553q.a(-3), 0.6f, 16, (Object) null);
                    this.f10171r = d12;
                    return;
                }
                throw new IllegalStateException("Couldn't load ic_keyboard_numbers_white drawable");
            }
            throw new IllegalStateException("Couldn't load ic_keyboard_smiley_white drawable");
        } else if (o.a(bVar, d.b.h.INSTANCE)) {
            Drawable d13 = androidx.core.content.a.d(getContext(), D.ic_keyboard_symbols_white);
            if (d13 != null) {
                int i15 = i4 + i6;
                int i16 = i5 + i7;
                int i17 = i16 / 2;
                C0531f.e(this, d13, i4, i5, i15, i17, 0, C0553q.a(4), 1.0f, 16, (Object) null);
                this.f10172s = d13;
                Drawable d14 = androidx.core.content.a.d(getContext(), D.ic_keyboard_abc_white);
                if (d14 != null) {
                    C0531f.e(this, d14, i4, i17, i15, i16, 0, C0553q.a(-4), 0.9f, 16, (Object) null);
                    this.f10171r = d14;
                    return;
                }
                throw new IllegalStateException("Couldn't load ic_keyboard_abc_white drawable");
            }
            throw new IllegalStateException("Couldn't load ic_keyboard_symbols_white drawable");
        }
    }

    private final void m(Canvas canvas, char c4, char c5, ThemeModel themeModel) {
        String str;
        String str2;
        int i4;
        String str3;
        if (!p(canvas, themeModel.getKeysTheme().l().b())) {
            int[] iArr = {getTopSplitVisualState().b()};
            int[] iArr2 = {getBottomSplitVisualState().b()};
            float height = ((float) canvas.getHeight()) / 2.0f;
            this.f10162i.setColor(themeModel.getKeysTheme().l().b().getColorForState(iArr, 0));
            this.f10162i.setColor(themeModel.getKeysTheme().l().b().getColorForState(iArr, 0));
            Path path = this.f10175v;
            Path path2 = null;
            if (path == null) {
                o.p("hexagonTopSplitPath");
                path = null;
            }
            canvas.drawPath(path, this.f10162i);
            float b4 = (float) C0553q.b(16);
            if (b4 > height) {
                b4 = height * 0.7f;
            }
            if (getKeyCase().isUppercase()) {
                String valueOf = String.valueOf(c5);
                o.c(valueOf, "null cannot be cast to non-null type java.lang.String");
                str = valueOf.toUpperCase(Locale.ROOT);
                o.d(str, "toUpperCase(...)");
            } else {
                str = String.valueOf(c5);
            }
            this.f10163j.setTextSize(b4);
            this.f10163j.setColor(themeModel.getKeysTheme().l().e().getColorForState(iArr, 0));
            canvas.drawText(str, this.f10177x, height - Math.abs((this.f10163j.descent() + this.f10163j.ascent()) / 2.0f), this.f10163j);
            this.f10162i.setColor(themeModel.getKeysTheme().l().a().getColorForState(iArr2, 0));
            this.f10162i.setColor(themeModel.getKeysTheme().l().a().getColorForState(iArr2, 0));
            Path path3 = this.f10174u;
            if (path3 == null) {
                o.p("hexagonBottomSplitPath");
            } else {
                path2 = path3;
            }
            canvas.drawPath(path2, this.f10162i);
            float b5 = (float) C0553q.b(18);
            if (b5 > height) {
                b5 = height * 0.7f;
            }
            if (getKeyCase().isUppercase()) {
                String valueOf2 = String.valueOf(c4);
                o.c(valueOf2, "null cannot be cast to non-null type java.lang.String");
                str2 = valueOf2.toUpperCase(Locale.ROOT);
                o.d(str2, "toUpperCase(...)");
            } else {
                str2 = String.valueOf(c4);
            }
            this.f10163j.setTextSize(b5);
            this.f10163j.setColor(themeModel.getKeysTheme().l().c().getColorForState(iArr2, 0));
            canvas.drawText(str2, this.f10177x, b5 + height, this.f10163j);
            Character tertiaryCharacter = getTertiaryCharacter();
            if (tertiaryCharacter != null) {
                d keyModel = getKeyModel();
                if (keyModel != null) {
                    i4 = keyModel.g() / 4;
                } else {
                    i4 = this.f10166m;
                }
                float b6 = (float) C0553q.b(12);
                if (b6 > height) {
                    b6 = height * 0.7f;
                }
                if (getKeyCase().isUppercase()) {
                    String valueOf3 = String.valueOf(tertiaryCharacter.charValue());
                    o.c(valueOf3, "null cannot be cast to non-null type java.lang.String");
                    str3 = valueOf3.toUpperCase(Locale.ROOT);
                    o.d(str3, "toUpperCase(...)");
                } else {
                    str3 = tertiaryCharacter.toString();
                }
                this.f10163j.setTextSize(b6);
                this.f10163j.setColor(themeModel.getKeysTheme().l().d().getColorForState(iArr2, 0));
                canvas.drawText(str3, this.f10177x + ((float) i4), height + b6, this.f10163j);
            }
        }
    }

    private final void n(Canvas canvas, char c4, ThemeModel themeModel) {
        String str;
        int i4;
        String str2;
        ColorStateList a4 = themeModel.getKeysTheme().b().a();
        if (a4 == null || !p(canvas, a4)) {
            int[] iArr = {getVisualState().b()};
            if (a4 != null) {
                this.f10162i.setColor(a4.getColorForState(iArr, 0));
                Path path = this.f10176w;
                if (path == null) {
                    o.p("hexagonPath");
                    path = null;
                }
                canvas.drawPath(path, this.f10162i);
            }
            if (getKeyCase().isUppercase()) {
                String valueOf = String.valueOf(c4);
                o.c(valueOf, "null cannot be cast to non-null type java.lang.String");
                str = valueOf.toUpperCase(Locale.ROOT);
                o.d(str, "toUpperCase(...)");
            } else {
                str = String.valueOf(c4);
            }
            float height = (((float) canvas.getHeight()) / 2.0f) - ((this.f10164k.descent() + this.f10164k.ascent()) / 2.0f);
            this.f10164k.setColor(themeModel.getKeysTheme().b().b().getColorForState(iArr, 0));
            canvas.drawText(str, this.f10177x, height, this.f10164k);
            Character tertiaryCharacter = getTertiaryCharacter();
            if (tertiaryCharacter != null) {
                d keyModel = getKeyModel();
                if (keyModel != null) {
                    i4 = keyModel.g() / 4;
                } else {
                    i4 = this.f10166m;
                }
                float b4 = (float) C0553q.b(12);
                if (!getKeyCase().isUppercase() || tertiaryCharacter.charValue() == 223) {
                    str2 = tertiaryCharacter.toString();
                } else {
                    String valueOf2 = String.valueOf(tertiaryCharacter.charValue());
                    o.c(valueOf2, "null cannot be cast to non-null type java.lang.String");
                    str2 = valueOf2.toUpperCase(Locale.ROOT);
                    o.d(str2, "toUpperCase(...)");
                }
                this.f10163j.setTextSize(b4);
                this.f10163j.setColor(C0548l.a(themeModel.getKeysTheme().b().b().getColorForState(iArr, 0), 0.6f));
                canvas.drawText(str2, this.f10177x + ((float) i4), ((float) 2) * b4, this.f10163j);
            }
        }
    }

    private final void o(Canvas canvas, ThemeModel themeModel) {
        int[] iArr = {getVisualState().b()};
        ColorStateList a4 = themeModel.getKeysTheme().a().a().a();
        if (a4 != null) {
            this.f10162i.setColor(a4.getColorForState(iArr, 0));
            Path path = this.f10176w;
            if (path == null) {
                o.p("hexagonPath");
                path = null;
            }
            canvas.drawPath(path, this.f10162i);
        }
        Drawable drawable = this.f10169p;
        if (drawable != null) {
            drawable.setTint(themeModel.getKeysTheme().a().a().b().getColorForState(iArr, 0));
            drawable.draw(canvas);
        }
    }

    private final boolean p(Canvas canvas, ColorStateList colorStateList) {
        if (getVisualState() != C0531f.a.DIACRITICS_OVERLAY) {
            return false;
        }
        this.f10162i.setColor(colorStateList.getColorForState(new int[]{C0531f.a.DEFAULT.b()}, 0));
        Path path = this.f10176w;
        if (path == null) {
            o.p("hexagonPath");
            path = null;
        }
        canvas.drawPath(path, this.f10162i);
        return true;
    }

    private final void q(Canvas canvas, ThemeModel themeModel) {
        int i4;
        ColorStateList a4 = themeModel.getKeysTheme().c().a();
        if (a4 == null || !p(canvas, a4)) {
            int[] iArr = {getVisualState().b()};
            Paint paint = this.f10162i;
            ColorStateList a5 = themeModel.getKeysTheme().c().a();
            if (a5 != null) {
                i4 = a5.getColorForState(iArr, 0);
            } else {
                i4 = 0;
            }
            paint.setColor(i4);
            Path path = this.f10176w;
            if (path == null) {
                o.p("hexagonPath");
                path = null;
            }
            canvas.drawPath(path, this.f10162i);
            Drawable drawable = this.f10172s;
            if (drawable != null) {
                drawable.setTint(themeModel.getKeysTheme().c().b().getColorForState(iArr, 0));
                drawable.draw(canvas);
            }
        }
    }

    private final void r(Canvas canvas, ThemeModel themeModel) {
        int i4;
        ColorStateList a4 = themeModel.getKeysTheme().g().a();
        if (a4 == null || !p(canvas, a4)) {
            int[] iArr = {getVisualState().b()};
            Paint paint = this.f10162i;
            ColorStateList a5 = themeModel.getKeysTheme().c().a();
            if (a5 != null) {
                i4 = a5.getColorForState(iArr, 0);
            } else {
                i4 = 0;
            }
            paint.setColor(i4);
            Path path = this.f10176w;
            if (path == null) {
                o.p("hexagonPath");
                path = null;
            }
            canvas.drawPath(path, this.f10162i);
            Drawable drawable = this.f10171r;
            if (drawable != null) {
                drawable.setTint(themeModel.getKeysTheme().g().b().getColorForState(iArr, 0));
                drawable.draw(canvas);
            }
        }
    }

    private final void s(Canvas canvas, ThemeModel themeModel) {
        ColorStateList a4 = themeModel.getKeysTheme().h().a();
        if (a4 == null || !p(canvas, a4)) {
            int[] iArr = {getVisualState().b()};
            if (a4 != null) {
                this.f10162i.setColor(a4.getColorForState(iArr, 0));
                Path path = this.f10176w;
                if (path == null) {
                    o.p("hexagonPath");
                    path = null;
                }
                canvas.drawPath(path, this.f10162i);
            }
            Drawable drawable = this.f10173t;
            if (drawable != null) {
                drawable.setTint(themeModel.getKeysTheme().h().b().getColorForState(iArr, 0));
                drawable.draw(canvas);
            }
        }
    }

    private final void t(Canvas canvas, ThemeModel themeModel) {
        Drawable drawable;
        int[] iArr = {getVisualState().b()};
        ColorStateList a4 = themeModel.getKeysTheme().i().a().a();
        if (a4 != null) {
            this.f10162i.setColor(a4.getColorForState(iArr, 0));
            Path path = this.f10176w;
            if (path == null) {
                o.p("hexagonPath");
                path = null;
            }
            canvas.drawPath(path, this.f10162i);
        }
        int i4 = b.f10179a[getKeyCase().ordinal()];
        if (i4 == 1) {
            drawable = this.f10168o;
        } else if (i4 == 2) {
            drawable = this.f10167n;
        } else if (i4 == 3) {
            drawable = this.f10170q;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (drawable != null) {
            drawable.setTint(themeModel.getKeysTheme().i().a().b().getColorForState(iArr, 0));
            drawable.draw(canvas);
        }
    }

    private final void u(Canvas canvas, ThemeModel themeModel) {
        ColorStateList a4 = themeModel.getKeysTheme().j().a();
        if ((a4 == null || !p(canvas, a4)) && a4 != null) {
            this.f10162i.setColor(a4.getColorForState(new int[]{getVisualState().b()}, 0));
            Path path = this.f10176w;
            if (path == null) {
                o.p("hexagonPath");
                path = null;
            }
            canvas.drawPath(path, this.f10162i);
        }
    }

    private final void v() {
        this.f10167n = null;
        this.f10168o = null;
        this.f10169p = null;
        this.f10170q = null;
        this.f10173t = null;
        this.f10171r = null;
        this.f10172s = null;
    }

    private final void w(Canvas canvas, ThemeModel themeModel) {
        if (!p(canvas, themeModel.getKeysTheme().k().b())) {
            int[] iArr = {getTopSplitVisualState().b()};
            int[] iArr2 = {getBottomSplitVisualState().b()};
            this.f10162i.setColor(themeModel.getKeysTheme().k().b().getColorForState(iArr, 0));
            Path path = this.f10175v;
            Path path2 = null;
            if (path == null) {
                o.p("hexagonTopSplitPath");
                path = null;
            }
            canvas.drawPath(path, this.f10162i);
            Drawable drawable = this.f10172s;
            if (drawable != null) {
                drawable.setTint(themeModel.getKeysTheme().k().e().getColorForState(iArr, 0));
                drawable.draw(canvas);
            }
            this.f10162i.setColor(themeModel.getKeysTheme().k().a().getColorForState(iArr2, 0));
            Path path3 = this.f10174u;
            if (path3 == null) {
                o.p("hexagonBottomSplitPath");
            } else {
                path2 = path3;
            }
            canvas.drawPath(path2, this.f10162i);
            Drawable drawable2 = this.f10171r;
            if (drawable2 != null) {
                drawable2.setTint(themeModel.getKeysTheme().k().c().getColorForState(iArr2, 0));
                drawable2.draw(canvas);
            }
        }
    }

    private final void y() {
        setOutlineProvider(new c(this));
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        v();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        o.e(canvas, "canvas");
        super.onDraw(canvas);
        d keyModel = getKeyModel();
        ThemeModel themeModel = getThemeModel();
        if (keyModel != null && themeModel != null) {
            canvas.drawColor(0);
            d.b f4 = keyModel.f();
            if (f4 instanceof d.b.C0008b) {
                n(canvas, ((d.b.C0008b) keyModel.f()).e(), themeModel);
            } else if (f4 instanceof d.b.o) {
                m(canvas, ((d.b.o) keyModel.f()).e(), ((d.b.o) keyModel.f()).f(), themeModel);
            } else if (f4 instanceof d.b.c) {
                if (((d.b.c) keyModel.f()).h() == null) {
                    n(canvas, ((d.b.c) keyModel.f()).f(), themeModel);
                } else {
                    m(canvas, ((d.b.c) keyModel.f()).f(), ((d.b.c) keyModel.f()).h().charValue(), themeModel);
                }
            } else if (o.a(f4, d.b.f.INSTANCE)) {
            } else {
                if (o.a(f4, d.b.n.INSTANCE)) {
                    u(canvas, themeModel);
                } else if (o.a(f4, d.b.l.INSTANCE)) {
                    s(canvas, themeModel);
                } else if (o.a(f4, d.b.m.INSTANCE)) {
                    t(canvas, themeModel);
                } else if (o.a(f4, d.b.a.INSTANCE)) {
                    o(canvas, themeModel);
                } else if (o.a(f4, d.b.C0011d.INSTANCE)) {
                    q(canvas, themeModel);
                } else if (o.a(f4, d.b.k.INSTANCE)) {
                    r(canvas, themeModel);
                } else if (o.a(f4, d.b.e.INSTANCE) || o.a(f4, d.b.h.INSTANCE)) {
                    w(canvas, themeModel);
                } else if (!o.a(f4, d.b.j.INSTANCE) && !o.a(f4, d.b.i.INSTANCE) && !o.a(f4, d.b.g.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        int paddingStart = getPaddingStart() + size + getPaddingEnd();
        int paddingTop = getPaddingTop() + size2 + getPaddingBottom();
        float paddingStart2 = (float) getPaddingStart();
        float paddingTop2 = (float) getPaddingTop();
        getPaddingStart();
        float f4 = (float) size;
        float f5 = f4 * 0.025f;
        float f6 = paddingTop2;
        float f7 = f4;
        float f8 = (float) size2;
        float f9 = f5;
        this.f10174u = M.b(paddingStart2, f6, f7, f8, 0.5f, this.f10165l, f9);
        this.f10175v = M.d(paddingStart2, f6, f7, f8, 0.5f, this.f10165l, f9);
        this.f10176w = M.a(paddingStart2, f6, f7, f8, this.f10165l, f5);
        this.f10164k.setTextSize((float) C0553q.b(20));
        this.f10177x = ((float) paddingStart) / 2.0f;
        this.f10178y = ((float) paddingTop) / 2.0f;
        v();
        l(getPaddingLeft(), getPaddingTop(), size, size2);
        setMeasuredDimension(paddingStart, paddingTop);
        if (x()) {
            y();
        }
    }

    public void setModel(d dVar) {
        o.e(dVar, "model");
        super.setModel(dVar);
        if (isAttachedToWindow() && isLaidOut()) {
            v();
            l(getPaddingLeft(), getPaddingTop(), getWidth(), getHeight());
        }
    }

    public boolean x() {
        d.b bVar;
        d.b bVar2;
        d keyModel = getKeyModel();
        d.b bVar3 = null;
        if (keyModel != null) {
            bVar = keyModel.f();
        } else {
            bVar = null;
        }
        if (!o.a(bVar, d.b.f.INSTANCE)) {
            d keyModel2 = getKeyModel();
            if (keyModel2 != null) {
                bVar2 = keyModel2.f();
            } else {
                bVar2 = null;
            }
            if (!o.a(bVar2, d.b.m.INSTANCE)) {
                d keyModel3 = getKeyModel();
                if (keyModel3 != null) {
                    bVar3 = keyModel3.f();
                }
                if (!o.a(bVar3, d.b.a.INSTANCE)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public J(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f10162i = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        Paint.Align align = Paint.Align.CENTER;
        paint2.setTextAlign(align);
        this.f10163j = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setTextAlign(align);
        this.f10164k = paint3;
        this.f10165l = (float) C0553q.a(3);
        this.f10166m = C0553q.a(10);
    }
}
