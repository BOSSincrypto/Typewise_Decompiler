package ch.icoaching.wrio.keyboard.view;

import M0.d;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import ch.icoaching.wrio.keyboard.KeyCase;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import kotlin.jvm.internal.o;

/* renamed from: ch.icoaching.wrio.keyboard.view.f  reason: case insensitive filesystem */
public abstract class C0531f extends View {

    /* renamed from: a  reason: collision with root package name */
    private a f10340a;

    /* renamed from: b  reason: collision with root package name */
    private a f10341b;

    /* renamed from: c  reason: collision with root package name */
    private a f10342c;

    /* renamed from: d  reason: collision with root package name */
    private KeyCase f10343d = KeyCase.LOWERCASE;

    /* renamed from: e  reason: collision with root package name */
    private ThemeModel f10344e;

    /* renamed from: f  reason: collision with root package name */
    private d f10345f;

    /* renamed from: g  reason: collision with root package name */
    private int f10346g = -1;

    /* renamed from: h  reason: collision with root package name */
    private Character f10347h;

    /* renamed from: ch.icoaching.wrio.keyboard.view.f$a */
    public enum a {
        DEFAULT(1),
        ACTIVE(2),
        DIACRITICS_OVERLAY(3);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f10353a;

        static {
            a[] a4;
            f10352f = kotlin.enums.a.a(a4);
        }

        private a(int i4) {
            this.f10353a = i4;
        }

        public final int b() {
            return this.f10353a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0531f(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        a aVar = a.DEFAULT;
        this.f10340a = aVar;
        this.f10341b = aVar;
        this.f10342c = aVar;
        a();
    }

    private final void a() {
        setBackgroundColor(0);
    }

    public static /* synthetic */ void e(C0531f fVar, Drawable drawable, int i4, int i5, int i6, int i7, int i8, int i9, float f4, int i10, Object obj) {
        int i11;
        int i12;
        float f5;
        if (obj == null) {
            if ((i10 & 16) != 0) {
                i11 = 0;
            } else {
                i11 = i8;
            }
            if ((i10 & 32) != 0) {
                i12 = 0;
            } else {
                i12 = i9;
            }
            if ((i10 & 64) != 0) {
                f5 = 1.0f;
            } else {
                f5 = f4;
            }
            fVar.b(drawable, i4, i5, i6, i7, i11, i12, f5);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBoundsToCenterDrawableInTheGivenViewBounds");
    }

    /* access modifiers changed from: protected */
    public final void b(Drawable drawable, int i4, int i5, int i6, int i7, int i8, int i9, float f4) {
        o.e(drawable, "<this>");
        float f5 = (float) i4;
        float f6 = (float) (i6 - i4);
        float f7 = f5 + (f6 / 2.0f);
        float f8 = (float) i5;
        float f9 = (float) (i7 - i5);
        float f10 = f8 + (f9 / 2.0f);
        float f11 = f6 * f4;
        float f12 = f9 * f4;
        float intrinsicWidth = (float) drawable.getIntrinsicWidth();
        float intrinsicHeight = (float) drawable.getIntrinsicHeight();
        if (intrinsicWidth > f11) {
            intrinsicHeight *= f11 / intrinsicWidth;
        } else {
            f11 = intrinsicWidth;
        }
        if (intrinsicHeight > f12) {
            float f13 = f12 / intrinsicHeight;
            f11 *= f13;
            intrinsicHeight *= f13;
        }
        float f14 = (f7 - (f11 / 2.0f)) + ((float) i8);
        float f15 = (f10 - (intrinsicHeight / 2.0f)) + ((float) i9);
        drawable.setBounds((int) f14, (int) f15, (int) (f11 + f14), (int) (intrinsicHeight + f15));
    }

    public final void c(a aVar) {
        o.e(aVar, "newVisualState");
        if (this.f10340a != aVar) {
            this.f10340a = aVar;
            invalidate();
        }
    }

    public final void d(a aVar, a aVar2) {
        o.e(aVar, "newTopSplitVisualState");
        o.e(aVar2, "newBottomSplitVisualState");
        if (aVar != this.f10341b || aVar2 != this.f10342c) {
            this.f10341b = aVar;
            this.f10342c = aVar2;
            invalidate();
        }
    }

    public final boolean f() {
        d.b bVar;
        d dVar = this.f10345f;
        if (dVar != null) {
            bVar = dVar.f();
        } else {
            bVar = null;
        }
        return bVar instanceof d.b.a;
    }

    public final boolean g() {
        d.b bVar;
        d dVar = this.f10345f;
        if (dVar != null) {
            bVar = dVar.f();
        } else {
            bVar = null;
        }
        return bVar instanceof d.b.m;
    }

    /* access modifiers changed from: protected */
    public final a getBottomSplitVisualState() {
        return this.f10342c;
    }

    public final int getCode$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease() {
        return this.f10346g;
    }

    /* access modifiers changed from: protected */
    public final KeyCase getKeyCase() {
        return this.f10343d;
    }

    /* access modifiers changed from: protected */
    public final int getKeyCode() {
        return this.f10346g;
    }

    /* access modifiers changed from: protected */
    public final d getKeyModel() {
        return this.f10345f;
    }

    public final d getModel$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease() {
        return this.f10345f;
    }

    /* access modifiers changed from: protected */
    public final Character getTertiaryCharacter() {
        return this.f10347h;
    }

    /* access modifiers changed from: protected */
    public final ThemeModel getThemeModel() {
        return this.f10344e;
    }

    /* access modifiers changed from: protected */
    public final a getTopSplitVisualState() {
        return this.f10341b;
    }

    /* access modifiers changed from: protected */
    public final a getVisualState() {
        return this.f10340a;
    }

    public final boolean h() {
        d.b bVar;
        d dVar = this.f10345f;
        if (dVar != null) {
            bVar = dVar.f();
        } else {
            bVar = null;
        }
        return bVar instanceof d.b.n;
    }

    public final boolean i() {
        d.b bVar;
        d dVar = this.f10345f;
        if (dVar != null) {
            bVar = dVar.f();
        } else {
            bVar = null;
        }
        if ((bVar instanceof d.b.o) || ((bVar instanceof d.b.c) && ((d.b.c) bVar).h() != null)) {
            return true;
        }
        return false;
    }

    public final void j() {
        if (i()) {
            a aVar = a.DEFAULT;
            d(aVar, aVar);
            return;
        }
        c(a.DEFAULT);
    }

    /* access modifiers changed from: protected */
    public final void setBottomSplitVisualState(a aVar) {
        o.e(aVar, "<set-?>");
        this.f10342c = aVar;
    }

    public void setCase(KeyCase keyCase) {
        o.e(keyCase, "keyCase");
        this.f10343d = keyCase;
        if (isLaidOut() && getVisibility() == 0) {
            invalidate();
        }
    }

    public void setCode(int i4) {
        this.f10346g = i4;
    }

    /* access modifiers changed from: protected */
    public final void setKeyCase(KeyCase keyCase) {
        o.e(keyCase, "<set-?>");
        this.f10343d = keyCase;
    }

    /* access modifiers changed from: protected */
    public final void setKeyCode(int i4) {
        this.f10346g = i4;
    }

    /* access modifiers changed from: protected */
    public final void setKeyModel(d dVar) {
        this.f10345f = dVar;
    }

    public void setModel(d dVar) {
        o.e(dVar, "model");
        this.f10345f = dVar;
        if (isAttachedToWindow() && isLaidOut()) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void setTertiaryCharacter(Character ch2) {
        this.f10347h = ch2;
    }

    public void setTheme(ThemeModel themeModel) {
        o.e(themeModel, "themeModel");
        this.f10344e = themeModel;
        if (isAttachedToWindow() && isLaidOut()) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void setThemeModel(ThemeModel themeModel) {
        this.f10344e = themeModel;
    }

    /* access modifiers changed from: protected */
    public final void setTopSplitVisualState(a aVar) {
        o.e(aVar, "<set-?>");
        this.f10341b = aVar;
    }

    /* access modifiers changed from: protected */
    public final void setVisualState(a aVar) {
        o.e(aVar, "<set-?>");
        this.f10340a = aVar;
    }

    public void setTertiaryCharacter(char c4) {
        this.f10347h = Character.valueOf(c4);
        if (isAttachedToWindow() && isLaidOut()) {
            invalidate();
        }
    }
}
