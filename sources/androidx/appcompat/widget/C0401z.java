package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.a;
import androidx.core.view.P;
import n.j;

/* renamed from: androidx.appcompat.widget.z  reason: case insensitive filesystem */
class C0401z extends C0396u {

    /* renamed from: d  reason: collision with root package name */
    private final SeekBar f3672d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f3673e;

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f3674f = null;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f3675g = null;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3676h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3677i = false;

    C0401z(SeekBar seekBar) {
        super(seekBar);
        this.f3672d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f3673e;
        if (drawable == null) {
            return;
        }
        if (this.f3676h || this.f3677i) {
            Drawable r4 = a.r(drawable.mutate());
            this.f3673e = r4;
            if (this.f3676h) {
                a.o(r4, this.f3674f);
            }
            if (this.f3677i) {
                a.p(this.f3673e, this.f3675g);
            }
            if (this.f3673e.isStateful()) {
                this.f3673e.setState(this.f3672d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i4) {
        super.c(attributeSet, i4);
        Context context = this.f3672d.getContext();
        int[] iArr = j.f14915T;
        c0 v3 = c0.v(context, attributeSet, iArr, i4, 0);
        SeekBar seekBar = this.f3672d;
        P.m0(seekBar, seekBar.getContext(), iArr, attributeSet, v3.r(), i4, 0);
        Drawable h4 = v3.h(j.f14919U);
        if (h4 != null) {
            this.f3672d.setThumb(h4);
        }
        j(v3.g(j.f14923V));
        int i5 = j.f14931X;
        if (v3.s(i5)) {
            this.f3675g = K.d(v3.k(i5, -1), this.f3675g);
            this.f3677i = true;
        }
        int i6 = j.f14927W;
        if (v3.s(i6)) {
            this.f3674f = v3.c(i6);
            this.f3676h = true;
        }
        v3.w();
        f();
    }

    /* access modifiers changed from: package-private */
    public void g(Canvas canvas) {
        int i4;
        if (this.f3673e != null) {
            int max = this.f3672d.getMax();
            int i5 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f3673e.getIntrinsicWidth();
                int intrinsicHeight = this.f3673e.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i4 = intrinsicWidth / 2;
                } else {
                    i4 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i5 = intrinsicHeight / 2;
                }
                this.f3673e.setBounds(-i4, -i5, i4, i5);
                float width = ((float) ((this.f3672d.getWidth() - this.f3672d.getPaddingLeft()) - this.f3672d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f3672d.getPaddingLeft(), (float) (this.f3672d.getHeight() / 2));
                for (int i6 = 0; i6 <= max; i6++) {
                    this.f3673e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        Drawable drawable = this.f3673e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f3672d.getDrawableState())) {
            this.f3672d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        Drawable drawable = this.f3673e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    public void j(Drawable drawable) {
        Drawable drawable2 = this.f3673e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f3673e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f3672d);
            a.m(drawable, P.B(this.f3672d));
            if (drawable.isStateful()) {
                drawable.setState(this.f3672d.getDrawableState());
            }
            f();
        }
        this.f3672d.invalidate();
    }
}
