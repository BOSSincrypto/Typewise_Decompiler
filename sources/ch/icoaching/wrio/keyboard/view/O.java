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
import androidx.constraintlayout.widget.ConstraintLayout;
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

public final class O extends C0531f {

    /* renamed from: B  reason: collision with root package name */
    public static final a f10266B = new a((i) null);

    /* renamed from: A  reason: collision with root package name */
    private float f10267A;

    /* renamed from: i  reason: collision with root package name */
    private final Paint f10268i;

    /* renamed from: j  reason: collision with root package name */
    private final Paint f10269j;

    /* renamed from: k  reason: collision with root package name */
    private final Paint f10270k;

    /* renamed from: l  reason: collision with root package name */
    private final int f10271l;

    /* renamed from: m  reason: collision with root package name */
    private final int f10272m;

    /* renamed from: n  reason: collision with root package name */
    private Drawable f10273n;

    /* renamed from: o  reason: collision with root package name */
    private Drawable f10274o;

    /* renamed from: p  reason: collision with root package name */
    private Drawable f10275p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f10276q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f10277r;

    /* renamed from: s  reason: collision with root package name */
    private Drawable f10278s;

    /* renamed from: t  reason: collision with root package name */
    private Drawable f10279t;

    /* renamed from: u  reason: collision with root package name */
    private Drawable f10280u;

    /* renamed from: v  reason: collision with root package name */
    private Drawable f10281v;

    /* renamed from: w  reason: collision with root package name */
    private Path f10282w;

    /* renamed from: x  reason: collision with root package name */
    private Path f10283x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public Path f10284y;

    /* renamed from: z  reason: collision with root package name */
    private float f10285z;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final O a(Context context, d dVar, ThemeModel themeModel) {
            o.e(context, "context");
            o.e(dVar, "keyModel");
            o.e(themeModel, "themeModel");
            O o4 = new O(context);
            o4.setId(View.generateViewId());
            ConstraintLayout.b bVar = new ConstraintLayout.b(dVar.g(), dVar.d());
            bVar.width = dVar.g();
            bVar.height = dVar.d();
            o4.setLayoutParams(bVar);
            o4.setModel(dVar);
            o4.setTheme(themeModel);
            if (themeModel.getBoxShadowColor() != null) {
                o4.setElevation((float) C0553q.a(1));
            }
            return o4;
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10286a;

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
                f10286a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.keyboard.view.O.b.<clinit>():void");
        }
    }

    public static final class c extends ViewOutlineProvider {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ O f10287a;

        c(O o4) {
            this.f10287a = o4;
        }

        public void getOutline(View view, Outline outline) {
            o.e(view, "view");
            o.e(outline, "outline");
            Path path = null;
            if (Build.VERSION.SDK_INT >= 30) {
                Path k4 = this.f10287a.f10284y;
                if (k4 == null) {
                    o.p("rectangle");
                } else {
                    path = k4;
                }
                outline.setPath(path);
                return;
            }
            try {
                Path k5 = this.f10287a.f10284y;
                if (k5 == null) {
                    o.p("rectangle");
                } else {
                    path = k5;
                }
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public O(Context context) {
        this(context, (AttributeSet) null);
        o.e(context, "context");
    }

    private final void A(Canvas canvas, ThemeModel themeModel) {
        Drawable drawable;
        int[] iArr = {getVisualState().b()};
        ColorStateList a4 = themeModel.getKeysTheme().i().b().a();
        if (a4 != null) {
            this.f10268i.setColor(a4.getColorForState(iArr, 0));
            Path path = this.f10284y;
            if (path == null) {
                o.p("rectangle");
                path = null;
            }
            canvas.drawPath(path, this.f10268i);
        }
        int i4 = b.f10286a[getKeyCase().ordinal()];
        if (i4 == 1) {
            drawable = this.f10274o;
        } else if (i4 == 2) {
            drawable = this.f10273n;
        } else if (i4 == 3) {
            drawable = this.f10276q;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (drawable != null) {
            drawable.setTint(themeModel.getKeysTheme().i().b().b().getColorForState(iArr, 0));
            drawable.draw(canvas);
        }
    }

    private final void B(Canvas canvas, ThemeModel themeModel) {
        ColorStateList a4 = themeModel.getKeysTheme().j().a();
        if ((a4 == null || !p(canvas, a4)) && a4 != null) {
            this.f10268i.setColor(a4.getColorForState(new int[]{getVisualState().b()}, 0));
            Path path = this.f10284y;
            if (path == null) {
                o.p("rectangle");
                path = null;
            }
            canvas.drawPath(path, this.f10268i);
        }
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
                C0531f.e(this, d4, i4, i5, i4 + i6, i5 + i7, 0, 0, 1.0f, 48, (Object) null);
                this.f10275p = d4;
                return;
            }
            throw new IllegalStateException("Couldn't load ic_keyboard_backspace_white drawable");
        } else if (o.a(bVar, d.b.l.INSTANCE)) {
            Drawable d5 = androidx.core.content.a.d(getContext(), D.ic_keyboard_return_white);
            if (d5 != null) {
                C0531f.e(this, d5, i4, i5, i4 + i6, i5 + i7, 0, C0552p.a(0.5f), 0.6f, 16, (Object) null);
                this.f10279t = d5;
                return;
            }
            throw new IllegalStateException("Couldn't load ic_keyboard_return_white drawable");
        } else if (o.a(bVar, d.b.m.INSTANCE)) {
            Drawable d6 = androidx.core.content.a.d(getContext(), D.ic_keyboard_shift_lowercase_white);
            if (d6 != null) {
                int i8 = i4 + i6;
                int i9 = i5 + i7;
                C0531f.e(this, d6, i4, i5, i8, i9, 0, C0553q.a(-1), 1.0f, 16, (Object) null);
                this.f10274o = d6;
                Drawable d7 = androidx.core.content.a.d(getContext(), D.ic_keyboard_shift_uppercase_white);
                if (d7 != null) {
                    C0531f.e(this, d7, i4, i5, i8, i9, 0, C0553q.a(-1), 1.0f, 16, (Object) null);
                    this.f10273n = d7;
                    Drawable d8 = androidx.core.content.a.d(getContext(), D.ic_keyboard_capslock_white);
                    if (d8 != null) {
                        C0531f.e(this, d8, i4, i5, i8, i9, 0, C0553q.a(1), 0.45f, 16, (Object) null);
                        this.f10276q = d8;
                        return;
                    }
                    throw new IllegalStateException("Couldn't load ic_keyboard_capslock_white drawable");
                }
                throw new IllegalStateException("Couldn't load ic_keyboard_shift_uppercase_white drawable");
            }
            throw new IllegalStateException("Couldn't load ic_keyboard_shift_lowercase_white drawable");
        } else if (o.a(bVar, d.b.e.INSTANCE)) {
            Drawable d9 = androidx.core.content.a.d(getContext(), D.ic_keyboard_smiley_white);
            if (d9 != null) {
                int i10 = i4 + i6;
                int i11 = i5 + i7;
                int i12 = i11 / 2;
                C0531f.e(this, d9, i4, i5, i10, i12, 0, C0552p.a(1.5f), 0.8f, 16, (Object) null);
                this.f10278s = d9;
                Drawable d10 = androidx.core.content.a.d(getContext(), D.ic_keyboard_numbers_white);
                if (d10 != null) {
                    C0531f.e(this, d10, i4, i12, i10, i11, 0, C0553q.a(0), 0.6f, 16, (Object) null);
                    this.f10277r = d10;
                    return;
                }
                throw new IllegalStateException("Couldn't load ic_keyboard_numbers_white drawable");
            }
            throw new IllegalStateException("Couldn't load ic_keyboard_smiley_white drawable");
        } else if (o.a(bVar, d.b.C0011d.INSTANCE)) {
            Drawable d11 = androidx.core.content.a.d(getContext(), D.ic_keyboard_smiley_white);
            if (d11 != null) {
                C0531f.e(this, d11, i4, i5, i4 + i6, i5 + i7, 0, C0553q.a(1), 0.45f, 16, (Object) null);
                this.f10278s = d11;
                return;
            }
            throw new IllegalStateException("Couldn't load ic_keyboard_smiley_white drawable");
        } else if (o.a(bVar, d.b.k.INSTANCE)) {
            Drawable d12 = androidx.core.content.a.d(getContext(), D.ic_keyboard_numbers_white);
            if (d12 != null) {
                C0531f.e(this, d12, i4, i5, i4 + i6, i5 + i7, 0, C0553q.a(0), 0.45f, 16, (Object) null);
                this.f10277r = d12;
                return;
            }
            throw new IllegalStateException("Couldn't load ic_keyboard_numbers_white drawable");
        } else if (o.a(bVar, d.b.j.INSTANCE)) {
            Drawable d13 = androidx.core.content.a.d(getContext(), D.ic_keyboard_more_numbers);
            if (d13 != null) {
                C0531f.e(this, d13, i4, i5, i4 + i6, i5 + i7, 0, 0, 0.0f, 112, (Object) null);
                this.f10277r = d13;
                return;
            }
            throw new IllegalStateException("Couldn't load ic_keyboard_more_numbers drawable");
        } else if (o.a(bVar, d.b.i.INSTANCE)) {
            Drawable d14 = androidx.core.content.a.d(getContext(), D.ic_keyboard_more_math);
            if (d14 != null) {
                C0531f.e(this, d14, i4, i5, i4 + i6, i5 + i7, 0, 0, 0.8f, 48, (Object) null);
                this.f10281v = d14;
                return;
            }
            throw new IllegalStateException("Couldn't load ic_keyboard_more_math drawable");
        } else if (o.a(bVar, d.b.g.INSTANCE)) {
            Drawable d15 = androidx.core.content.a.d(getContext(), D.ic_keyboard_main_layout);
            if (d15 != null) {
                C0531f.e(this, d15, i4, i5, i4 + i6, i5 + i7, 0, 0, 0.8f, 48, (Object) null);
                this.f10280u = d15;
                return;
            }
            throw new IllegalStateException("Couldn't load ic_keyboard_more_math drawable");
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
            this.f10268i.setColor(themeModel.getKeysTheme().l().b().getColorForState(iArr, 0));
            this.f10268i.setColor(themeModel.getKeysTheme().l().b().getColorForState(iArr, 0));
            Path path = this.f10283x;
            Path path2 = null;
            if (path == null) {
                o.p("rectangleTopSplit");
                path = null;
            }
            canvas.drawPath(path, this.f10268i);
            if (getKeyCase().isUppercase()) {
                String valueOf = String.valueOf(c5);
                o.c(valueOf, "null cannot be cast to non-null type java.lang.String");
                str = valueOf.toUpperCase(Locale.ROOT);
                o.d(str, "toUpperCase(...)");
            } else {
                str = String.valueOf(c5);
            }
            this.f10269j.setTextSize((float) C0553q.b(16));
            this.f10269j.setColor(themeModel.getKeysTheme().l().e().getColorForState(iArr, 0));
            canvas.drawText(str, this.f10285z, height - Math.abs((this.f10269j.descent() + this.f10269j.ascent()) / 2.0f), this.f10269j);
            this.f10268i.setColor(themeModel.getKeysTheme().l().a().getColorForState(iArr2, 0));
            this.f10268i.setColor(themeModel.getKeysTheme().l().a().getColorForState(iArr2, 0));
            Path path3 = this.f10282w;
            if (path3 == null) {
                o.p("rectangleBottomSplit");
            } else {
                path2 = path3;
            }
            canvas.drawPath(path2, this.f10268i);
            float b4 = (float) C0553q.b(18);
            if (getKeyCase().isUppercase()) {
                String valueOf2 = String.valueOf(c4);
                o.c(valueOf2, "null cannot be cast to non-null type java.lang.String");
                str2 = valueOf2.toUpperCase(Locale.ROOT);
                o.d(str2, "toUpperCase(...)");
            } else {
                str2 = String.valueOf(c4);
            }
            this.f10269j.setTextSize(b4);
            this.f10269j.setColor(themeModel.getKeysTheme().l().c().getColorForState(iArr2, 0));
            canvas.drawText(str2, this.f10285z, b4 + height, this.f10269j);
            Character tertiaryCharacter = getTertiaryCharacter();
            if (tertiaryCharacter != null) {
                d keyModel = getKeyModel();
                if (keyModel != null) {
                    i4 = keyModel.g() / 4;
                } else {
                    i4 = this.f10271l;
                }
                float b5 = (float) C0553q.b(10);
                if (b5 > height) {
                    b5 = 0.7f * height;
                }
                if (getKeyCase().isUppercase()) {
                    String valueOf3 = String.valueOf(tertiaryCharacter.charValue());
                    o.c(valueOf3, "null cannot be cast to non-null type java.lang.String");
                    str3 = valueOf3.toUpperCase(Locale.ROOT);
                    o.d(str3, "toUpperCase(...)");
                } else {
                    str3 = tertiaryCharacter.toString();
                }
                this.f10269j.setTextSize(b5);
                this.f10269j.setColor(C0548l.a(themeModel.getKeysTheme().b().b().getColorForState(iArr2, 0), 0.6f));
                canvas.drawText(str3, this.f10285z + ((float) i4), this.f10267A + b5 + ((float) this.f10272m), this.f10269j);
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
                this.f10268i.setColor(a4.getColorForState(iArr, 0));
                Path path = this.f10284y;
                if (path == null) {
                    o.p("rectangle");
                    path = null;
                }
                canvas.drawPath(path, this.f10268i);
            }
            if (getKeyCase().isUppercase()) {
                String valueOf = String.valueOf(c4);
                o.c(valueOf, "null cannot be cast to non-null type java.lang.String");
                str = valueOf.toUpperCase(Locale.ROOT);
                o.d(str, "toUpperCase(...)");
            } else {
                str = String.valueOf(c4);
            }
            float height = (((float) canvas.getHeight()) / 2.0f) - ((this.f10270k.descent() + this.f10270k.ascent()) / 2.0f);
            this.f10270k.setColor(themeModel.getKeysTheme().b().b().getColorForState(iArr, 0));
            canvas.drawText(str, this.f10285z, height, this.f10270k);
            Character tertiaryCharacter = getTertiaryCharacter();
            if (tertiaryCharacter != null) {
                d keyModel = getKeyModel();
                if (keyModel != null) {
                    i4 = keyModel.g() / 4;
                } else {
                    i4 = this.f10271l;
                }
                float b4 = (float) C0553q.b(10);
                if (!getKeyCase().isUppercase() || tertiaryCharacter.charValue() == 223) {
                    str2 = tertiaryCharacter.toString();
                } else {
                    String valueOf2 = String.valueOf(tertiaryCharacter.charValue());
                    o.c(valueOf2, "null cannot be cast to non-null type java.lang.String");
                    str2 = valueOf2.toUpperCase(Locale.ROOT);
                    o.d(str2, "toUpperCase(...)");
                }
                this.f10269j.setTextSize(b4);
                this.f10269j.setColor(C0548l.a(themeModel.getKeysTheme().b().b().getColorForState(iArr, 0), 0.6f));
                canvas.drawText(str2, this.f10285z + ((float) i4), b4 + ((float) this.f10272m), this.f10269j);
            }
        }
    }

    private final void o(Canvas canvas, ThemeModel themeModel) {
        int[] iArr = {getVisualState().b()};
        ColorStateList a4 = themeModel.getKeysTheme().a().b().a();
        if (a4 != null) {
            this.f10268i.setColor(a4.getColorForState(iArr, 0));
            Path path = this.f10284y;
            if (path == null) {
                o.p("rectangle");
                path = null;
            }
            canvas.drawPath(path, this.f10268i);
        }
        Drawable drawable = this.f10275p;
        if (drawable != null) {
            drawable.setTint(themeModel.getKeysTheme().a().b().b().getColorForState(iArr, 0));
            drawable.draw(canvas);
        }
    }

    private final boolean p(Canvas canvas, ColorStateList colorStateList) {
        if (getVisualState() != C0531f.a.DIACRITICS_OVERLAY) {
            return false;
        }
        this.f10268i.setColor(colorStateList.getColorForState(new int[]{C0531f.a.DEFAULT.b()}, 0));
        Path path = this.f10284y;
        if (path == null) {
            o.p("rectangle");
            path = null;
        }
        canvas.drawPath(path, this.f10268i);
        return true;
    }

    private final void q(Canvas canvas, ThemeModel themeModel) {
        ColorStateList a4 = themeModel.getKeysTheme().c().a();
        if (a4 == null || !p(canvas, a4)) {
            int[] iArr = {getVisualState().b()};
            if (a4 != null) {
                this.f10268i.setColor(a4.getColorForState(iArr, 0));
                Path path = this.f10284y;
                if (path == null) {
                    o.p("rectangle");
                    path = null;
                }
                canvas.drawPath(path, this.f10268i);
            }
            Drawable drawable = this.f10278s;
            if (drawable != null) {
                drawable.setTint(themeModel.getKeysTheme().k().e().getColorForState(iArr, 0));
                drawable.draw(canvas);
            }
        }
    }

    private final void r(Canvas canvas, ThemeModel themeModel) {
        if (!p(canvas, themeModel.getKeysTheme().k().b())) {
            int[] iArr = {getTopSplitVisualState().b()};
            int[] iArr2 = {getBottomSplitVisualState().b()};
            this.f10268i.setColor(themeModel.getKeysTheme().k().b().getColorForState(iArr, 0));
            this.f10268i.setColor(themeModel.getKeysTheme().k().b().getColorForState(iArr, 0));
            Path path = this.f10283x;
            Path path2 = null;
            if (path == null) {
                o.p("rectangleTopSplit");
                path = null;
            }
            canvas.drawPath(path, this.f10268i);
            Drawable drawable = this.f10278s;
            if (drawable != null) {
                drawable.setTint(themeModel.getKeysTheme().k().e().getColorForState(iArr, 0));
                drawable.draw(canvas);
            }
            this.f10268i.setColor(themeModel.getKeysTheme().k().a().getColorForState(iArr2, 0));
            this.f10268i.setColor(themeModel.getKeysTheme().k().a().getColorForState(iArr2, 0));
            Path path3 = this.f10282w;
            if (path3 == null) {
                o.p("rectangleBottomSplit");
            } else {
                path2 = path3;
            }
            canvas.drawPath(path2, this.f10268i);
            Drawable drawable2 = this.f10277r;
            if (drawable2 != null) {
                drawable2.setTint(themeModel.getKeysTheme().k().c().getColorForState(iArr2, 0));
                drawable2.draw(canvas);
            }
        }
    }

    private final void s(Canvas canvas, ThemeModel themeModel) {
        ColorStateList a4 = themeModel.getKeysTheme().d().a();
        if (a4 == null || !p(canvas, a4)) {
            int[] iArr = {getVisualState().b()};
            if (a4 != null) {
                this.f10268i.setColor(a4.getColorForState(iArr, 0));
                Path path = this.f10284y;
                if (path == null) {
                    o.p("rectangle");
                    path = null;
                }
                canvas.drawPath(path, this.f10268i);
            }
            Drawable drawable = this.f10280u;
            if (drawable != null) {
                drawable.setTint(themeModel.getKeysTheme().d().b().getColorForState(iArr, 0));
                drawable.draw(canvas);
            }
        }
    }

    private final void t(Canvas canvas, ThemeModel themeModel) {
        ColorStateList a4 = themeModel.getKeysTheme().e().a();
        if (a4 == null || !p(canvas, a4)) {
            int[] iArr = {getVisualState().b()};
            if (a4 != null) {
                this.f10268i.setColor(a4.getColorForState(iArr, 0));
                Path path = this.f10284y;
                if (path == null) {
                    o.p("rectangle");
                    path = null;
                }
                canvas.drawPath(path, this.f10268i);
            }
            Drawable drawable = this.f10281v;
            if (drawable != null) {
                drawable.setTint(themeModel.getKeysTheme().e().b().getColorForState(iArr, 0));
                drawable.draw(canvas);
            }
        }
    }

    private final void u(Canvas canvas, ThemeModel themeModel) {
        ColorStateList a4 = themeModel.getKeysTheme().f().a();
        if (a4 == null || !p(canvas, a4)) {
            int[] iArr = {getVisualState().b()};
            if (a4 != null) {
                this.f10268i.setColor(a4.getColorForState(iArr, 0));
                Path path = this.f10284y;
                if (path == null) {
                    o.p("rectangle");
                    path = null;
                }
                canvas.drawPath(path, this.f10268i);
            }
            Drawable drawable = this.f10277r;
            if (drawable != null) {
                drawable.setTint(themeModel.getKeysTheme().f().b().getColorForState(iArr, 0));
                drawable.draw(canvas);
            }
        }
    }

    private final void v() {
        this.f10273n = null;
        this.f10274o = null;
        this.f10275p = null;
        this.f10276q = null;
        this.f10277r = null;
        this.f10278s = null;
        this.f10279t = null;
    }

    private final void w(Canvas canvas, ThemeModel themeModel) {
        ColorStateList a4 = themeModel.getKeysTheme().g().a();
        if (a4 == null || !p(canvas, a4)) {
            int[] iArr = {getVisualState().b()};
            if (a4 != null) {
                this.f10268i.setColor(a4.getColorForState(iArr, 0));
                Path path = this.f10284y;
                if (path == null) {
                    o.p("rectangle");
                    path = null;
                }
                canvas.drawPath(path, this.f10268i);
            }
            Drawable drawable = this.f10277r;
            if (drawable != null) {
                drawable.setTint(themeModel.getKeysTheme().g().b().getColorForState(iArr, 0));
                drawable.draw(canvas);
            }
        }
    }

    private final void x(Canvas canvas, ThemeModel themeModel) {
        ColorStateList a4 = themeModel.getKeysTheme().h().a();
        if (a4 == null || !p(canvas, a4)) {
            int[] iArr = {getVisualState().b()};
            if (a4 != null) {
                this.f10268i.setColor(a4.getColorForState(iArr, 0));
                Path path = this.f10284y;
                if (path == null) {
                    o.p("rectangle");
                    path = null;
                }
                canvas.drawPath(path, this.f10268i);
            }
            Drawable drawable = this.f10279t;
            if (drawable != null) {
                drawable.setTint(themeModel.getKeysTheme().h().b().getColorForState(iArr, 0));
                drawable.draw(canvas);
            }
        }
    }

    private final void z() {
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
                if (o.a(f4, d.b.a.INSTANCE)) {
                    o(canvas, themeModel);
                } else if (o.a(f4, d.b.e.INSTANCE)) {
                    r(canvas, themeModel);
                } else if (o.a(f4, d.b.C0011d.INSTANCE)) {
                    q(canvas, themeModel);
                } else if (o.a(f4, d.b.k.INSTANCE)) {
                    w(canvas, themeModel);
                } else if (o.a(f4, d.b.l.INSTANCE)) {
                    x(canvas, themeModel);
                } else if (o.a(f4, d.b.m.INSTANCE)) {
                    A(canvas, themeModel);
                } else if (o.a(f4, d.b.n.INSTANCE)) {
                    B(canvas, themeModel);
                } else if (o.a(f4, d.b.j.INSTANCE)) {
                    u(canvas, themeModel);
                } else if (o.a(f4, d.b.i.INSTANCE)) {
                    t(canvas, themeModel);
                } else if (o.a(f4, d.b.g.INSTANCE)) {
                    s(canvas, themeModel);
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
        float f4 = (float) size2;
        float rint = (float) Math.rint((double) (f4 / 11.0f));
        float f5 = paddingTop2;
        float f6 = (float) size;
        float f7 = f4;
        float f8 = rint;
        float f9 = rint;
        float f10 = f4 * 0.05f;
        this.f10282w = P.b(paddingStart2, f5, f6, f7, f8, f10);
        float f11 = f9;
        this.f10283x = P.d(paddingStart2, f5, f6, f7, f11, f10);
        this.f10284y = P.c(paddingStart2, f5, f6, f7, f11, f10);
        this.f10270k.setTextSize((float) C0553q.b(20));
        this.f10285z = ((float) paddingStart) / 2.0f;
        this.f10267A = ((float) paddingTop) / 2.0f;
        v();
        l(getPaddingLeft(), getPaddingTop(), size, size2);
        setMeasuredDimension(paddingStart, paddingTop);
        if (y()) {
            z();
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

    public boolean y() {
        d.b bVar;
        d keyModel = getKeyModel();
        if (keyModel != null) {
            bVar = keyModel.f();
        } else {
            bVar = null;
        }
        return !o.a(bVar, d.b.f.INSTANCE);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public O(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public O(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f10268i = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        Paint.Align align = Paint.Align.CENTER;
        paint2.setTextAlign(align);
        this.f10269j = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setTextAlign(align);
        this.f10270k = paint3;
        this.f10271l = C0553q.a(10);
        this.f10272m = C0553q.a(2);
    }
}
