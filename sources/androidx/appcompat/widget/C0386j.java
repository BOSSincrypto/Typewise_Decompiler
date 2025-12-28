package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.a;
import androidx.core.widget.d;

/* renamed from: androidx.appcompat.widget.j  reason: case insensitive filesystem */
class C0386j {

    /* renamed from: a  reason: collision with root package name */
    private final CompoundButton f3596a;

    /* renamed from: b  reason: collision with root package name */
    private ColorStateList f3597b = null;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f3598c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3599d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3600e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3601f;

    C0386j(CompoundButton compoundButton) {
        this.f3596a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Drawable a4 = d.a(this.f3596a);
        if (a4 == null) {
            return;
        }
        if (this.f3599d || this.f3600e) {
            Drawable mutate = a.r(a4).mutate();
            if (this.f3599d) {
                a.o(mutate, this.f3597b);
            }
            if (this.f3600e) {
                a.p(mutate, this.f3598c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f3596a.getDrawableState());
            }
            this.f3596a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    public int b(int i4) {
        return i4;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList c() {
        return this.f3597b;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        return this.f3598c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(12:1|2|(2:6|7)|9|10|(1:14)|15|(1:17)|18|(1:20)|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f3596a
            android.content.Context r0 = r0.getContext()
            int[] r3 = n.j.f14920U0
            r8 = 0
            androidx.appcompat.widget.c0 r0 = androidx.appcompat.widget.c0.v(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f3596a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.r()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.P.m0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = n.j.f14928W0     // Catch:{ all -> 0x0039 }
            boolean r11 = r0.s(r10)     // Catch:{ all -> 0x0039 }
            if (r11 == 0) goto L_0x003b
            int r10 = r0.n(r10, r8)     // Catch:{ all -> 0x0039 }
            if (r10 == 0) goto L_0x003b
            android.widget.CompoundButton r11 = r9.f3596a     // Catch:{ NotFoundException -> 0x003b }
            android.content.Context r1 = r11.getContext()     // Catch:{ NotFoundException -> 0x003b }
            android.graphics.drawable.Drawable r10 = o.C0836a.b(r1, r10)     // Catch:{ NotFoundException -> 0x003b }
            r11.setButtonDrawable(r10)     // Catch:{ NotFoundException -> 0x003b }
            goto L_0x0056
        L_0x0039:
            r10 = move-exception
            goto L_0x0082
        L_0x003b:
            int r10 = n.j.f14924V0     // Catch:{ all -> 0x0039 }
            boolean r11 = r0.s(r10)     // Catch:{ all -> 0x0039 }
            if (r11 == 0) goto L_0x0056
            int r10 = r0.n(r10, r8)     // Catch:{ all -> 0x0039 }
            if (r10 == 0) goto L_0x0056
            android.widget.CompoundButton r11 = r9.f3596a     // Catch:{ all -> 0x0039 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0039 }
            android.graphics.drawable.Drawable r10 = o.C0836a.b(r1, r10)     // Catch:{ all -> 0x0039 }
            r11.setButtonDrawable(r10)     // Catch:{ all -> 0x0039 }
        L_0x0056:
            int r10 = n.j.f14932X0     // Catch:{ all -> 0x0039 }
            boolean r11 = r0.s(r10)     // Catch:{ all -> 0x0039 }
            if (r11 == 0) goto L_0x0067
            android.widget.CompoundButton r11 = r9.f3596a     // Catch:{ all -> 0x0039 }
            android.content.res.ColorStateList r10 = r0.c(r10)     // Catch:{ all -> 0x0039 }
            androidx.core.widget.d.d(r11, r10)     // Catch:{ all -> 0x0039 }
        L_0x0067:
            int r10 = n.j.f14936Y0     // Catch:{ all -> 0x0039 }
            boolean r11 = r0.s(r10)     // Catch:{ all -> 0x0039 }
            if (r11 == 0) goto L_0x007e
            android.widget.CompoundButton r11 = r9.f3596a     // Catch:{ all -> 0x0039 }
            r1 = -1
            int r10 = r0.k(r10, r1)     // Catch:{ all -> 0x0039 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.K.d(r10, r1)     // Catch:{ all -> 0x0039 }
            androidx.core.widget.d.e(r11, r10)     // Catch:{ all -> 0x0039 }
        L_0x007e:
            r0.w()
            return
        L_0x0082:
            r0.w()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0386j.e(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (this.f3601f) {
            this.f3601f = false;
            return;
        }
        this.f3601f = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void g(ColorStateList colorStateList) {
        this.f3597b = colorStateList;
        this.f3599d = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void h(PorterDuff.Mode mode) {
        this.f3598c = mode;
        this.f3600e = true;
        a();
    }
}
