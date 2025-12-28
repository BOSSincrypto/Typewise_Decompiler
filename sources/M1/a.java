package M1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0397v;
import androidx.core.widget.d;
import z1.C0970a;
import z1.i;

public class a extends C0397v {

    /* renamed from: g  reason: collision with root package name */
    private static final int f937g = i.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: h  reason: collision with root package name */
    private static final int[][] f938h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e  reason: collision with root package name */
    private ColorStateList f939e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f940f;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0970a.f16500H);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f939e == null) {
            int d4 = F1.a.d(this, C0970a.f16505e);
            int d5 = F1.a.d(this, C0970a.colorOnSurface);
            int d6 = F1.a.d(this, C0970a.colorSurface);
            int[][] iArr = f938h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = F1.a.i(d6, d4, 1.0f);
            iArr2[1] = F1.a.i(d6, d5, 0.54f);
            iArr2[2] = F1.a.i(d6, d5, 0.38f);
            iArr2[3] = F1.a.i(d6, d5, 0.38f);
            this.f939e = new ColorStateList(iArr, iArr2);
        }
        return this.f939e;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f940f && d.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z3) {
        this.f940f = z3;
        if (z3) {
            d.d(this, getMaterialThemeColorsTintList());
        } else {
            d.d(this, (ColorStateList) null);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f937g
            android.content.Context r8 = T1.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = z1.j.f16657h3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.j.i(r0, r1, r2, r3, r4, r5)
            int r10 = z1.j.f16662i3
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0028
            android.content.res.ColorStateList r8 = N1.c.a(r8, r9, r10)
            androidx.core.widget.d.d(r7, r8)
        L_0x0028:
            int r8 = z1.j.f16667j3
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f940f = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
