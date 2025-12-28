package com.google.android.material.textfield;

import Q1.g;
import Q1.k;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: com.google.android.material.textfield.h  reason: case insensitive filesystem */
abstract class C0581h extends g {

    /* renamed from: z  reason: collision with root package name */
    b f12348z;

    /* renamed from: com.google.android.material.textfield.h$c */
    private static class c extends C0581h {
        c(b bVar) {
            super(bVar);
        }

        /* access modifiers changed from: protected */
        public void r(Canvas canvas) {
            if (this.f12348z.f12349w.isEmpty()) {
                super.r(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                boolean unused = canvas.clipOutRect(this.f12348z.f12349w);
            } else {
                canvas.clipRect(this.f12348z.f12349w, Region.Op.DIFFERENCE);
            }
            super.r(canvas);
            canvas.restore();
        }
    }

    static C0581h f0(k kVar) {
        if (kVar == null) {
            kVar = new k();
        }
        return g0(new b(kVar, new RectF()));
    }

    /* access modifiers changed from: private */
    public static C0581h g0(b bVar) {
        return new c(bVar);
    }

    /* access modifiers changed from: package-private */
    public boolean h0() {
        return !this.f12348z.f12349w.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public void i0() {
        j0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* access modifiers changed from: package-private */
    public void j0(float f4, float f5, float f6, float f7) {
        if (f4 != this.f12348z.f12349w.left || f5 != this.f12348z.f12349w.top || f6 != this.f12348z.f12349w.right || f7 != this.f12348z.f12349w.bottom) {
            this.f12348z.f12349w.set(f4, f5, f6, f7);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    public void k0(RectF rectF) {
        j0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public Drawable mutate() {
        this.f12348z = new b(this.f12348z);
        return this;
    }

    /* renamed from: com.google.android.material.textfield.h$b */
    private static final class b extends g.c {
        /* access modifiers changed from: private */

        /* renamed from: w  reason: collision with root package name */
        public final RectF f12349w;

        public Drawable newDrawable() {
            C0581h e02 = C0581h.g0(this);
            e02.invalidateSelf();
            return e02;
        }

        private b(k kVar, RectF rectF) {
            super(kVar, (I1.a) null);
            this.f12349w = rectF;
        }

        private b(b bVar) {
            super(bVar);
            this.f12349w = bVar.f12349w;
        }
    }

    private C0581h(b bVar) {
        super((g.c) bVar);
        this.f12348z = bVar;
    }
}
