package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.core.graphics.drawable.a;
import androidx.core.widget.c;

/* renamed from: androidx.appcompat.widget.i  reason: case insensitive filesystem */
class C0385i {

    /* renamed from: a  reason: collision with root package name */
    private final CheckedTextView f3589a;

    /* renamed from: b  reason: collision with root package name */
    private ColorStateList f3590b = null;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f3591c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3592d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3593e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3594f;

    C0385i(CheckedTextView checkedTextView) {
        this.f3589a = checkedTextView;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Drawable a4 = c.a(this.f3589a);
        if (a4 == null) {
            return;
        }
        if (this.f3592d || this.f3593e) {
            Drawable mutate = a.r(a4).mutate();
            if (this.f3592d) {
                a.o(mutate, this.f3590b);
            }
            if (this.f3593e) {
                a.p(mutate, this.f3591c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f3589a.getDrawableState());
            }
            this.f3589a.setCheckMarkDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList b() {
        return this.f3590b;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode c() {
        return this.f3591c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(12:1|2|(2:6|7)|9|10|(1:14)|15|(1:17)|18|(1:20)|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CheckedTextView r0 = r9.f3589a
            android.content.Context r0 = r0.getContext()
            int[] r3 = n.j.f14900P0
            r8 = 0
            androidx.appcompat.widget.c0 r0 = androidx.appcompat.widget.c0.v(r0, r10, r3, r11, r8)
            android.widget.CheckedTextView r1 = r9.f3589a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.r()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.P.m0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = n.j.f14908R0     // Catch:{ all -> 0x0039 }
            boolean r11 = r0.s(r10)     // Catch:{ all -> 0x0039 }
            if (r11 == 0) goto L_0x003b
            int r10 = r0.n(r10, r8)     // Catch:{ all -> 0x0039 }
            if (r10 == 0) goto L_0x003b
            android.widget.CheckedTextView r11 = r9.f3589a     // Catch:{ NotFoundException -> 0x003b }
            android.content.Context r1 = r11.getContext()     // Catch:{ NotFoundException -> 0x003b }
            android.graphics.drawable.Drawable r10 = o.C0836a.b(r1, r10)     // Catch:{ NotFoundException -> 0x003b }
            r11.setCheckMarkDrawable(r10)     // Catch:{ NotFoundException -> 0x003b }
            goto L_0x0056
        L_0x0039:
            r10 = move-exception
            goto L_0x0082
        L_0x003b:
            int r10 = n.j.f14904Q0     // Catch:{ all -> 0x0039 }
            boolean r11 = r0.s(r10)     // Catch:{ all -> 0x0039 }
            if (r11 == 0) goto L_0x0056
            int r10 = r0.n(r10, r8)     // Catch:{ all -> 0x0039 }
            if (r10 == 0) goto L_0x0056
            android.widget.CheckedTextView r11 = r9.f3589a     // Catch:{ all -> 0x0039 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0039 }
            android.graphics.drawable.Drawable r10 = o.C0836a.b(r1, r10)     // Catch:{ all -> 0x0039 }
            r11.setCheckMarkDrawable(r10)     // Catch:{ all -> 0x0039 }
        L_0x0056:
            int r10 = n.j.f14912S0     // Catch:{ all -> 0x0039 }
            boolean r11 = r0.s(r10)     // Catch:{ all -> 0x0039 }
            if (r11 == 0) goto L_0x0067
            android.widget.CheckedTextView r11 = r9.f3589a     // Catch:{ all -> 0x0039 }
            android.content.res.ColorStateList r10 = r0.c(r10)     // Catch:{ all -> 0x0039 }
            androidx.core.widget.c.b(r11, r10)     // Catch:{ all -> 0x0039 }
        L_0x0067:
            int r10 = n.j.f14916T0     // Catch:{ all -> 0x0039 }
            boolean r11 = r0.s(r10)     // Catch:{ all -> 0x0039 }
            if (r11 == 0) goto L_0x007e
            android.widget.CheckedTextView r11 = r9.f3589a     // Catch:{ all -> 0x0039 }
            r1 = -1
            int r10 = r0.k(r10, r1)     // Catch:{ all -> 0x0039 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.K.d(r10, r1)     // Catch:{ all -> 0x0039 }
            androidx.core.widget.c.c(r11, r10)     // Catch:{ all -> 0x0039 }
        L_0x007e:
            r0.w()
            return
        L_0x0082:
            r0.w()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0385i.d(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (this.f3594f) {
            this.f3594f = false;
            return;
        }
        this.f3594f = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void f(ColorStateList colorStateList) {
        this.f3590b = colorStateList;
        this.f3592d = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void g(PorterDuff.Mode mode) {
        this.f3591c = mode;
        this.f3593e = true;
        a();
    }
}
