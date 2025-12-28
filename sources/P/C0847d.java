package p;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p.C0845b;

/* renamed from: p.d  reason: case insensitive filesystem */
public abstract class C0847d extends C0845b {

    /* renamed from: m  reason: collision with root package name */
    private a f15822m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f15823n;

    /* renamed from: p.d$a */
    static class a extends C0845b.d {

        /* renamed from: J  reason: collision with root package name */
        int[][] f15824J;

        a(a aVar, C0847d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.f15824J = aVar.f15824J;
            } else {
                this.f15824J = new int[f()][];
            }
        }

        /* access modifiers changed from: package-private */
        public int A(int[] iArr) {
            int[][] iArr2 = this.f15824J;
            int h4 = h();
            for (int i4 = 0; i4 < h4; i4++) {
                if (StateSet.stateSetMatches(iArr2[i4], iArr)) {
                    return i4;
                }
            }
            return -1;
        }

        public void o(int i4, int i5) {
            super.o(i4, i5);
            int[][] iArr = new int[i5][];
            System.arraycopy(this.f15824J, 0, iArr, 0, i4);
            this.f15824J = iArr;
        }

        /* access modifiers changed from: package-private */
        public abstract void r();

        /* access modifiers changed from: package-private */
        public int z(int[] iArr, Drawable drawable) {
            int a4 = a(drawable);
            this.f15824J[a4] = iArr;
            return a4;
        }
    }

    C0847d(a aVar) {
        if (aVar != null) {
            h(aVar);
        }
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: package-private */
    public void h(C0845b.d dVar) {
        super.h(dVar);
        if (dVar instanceof a) {
            this.f15822m = (a) dVar;
        }
    }

    /* access modifiers changed from: package-private */
    public int[] j(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i4 = 0;
        for (int i5 = 0; i5 < attributeCount; i5++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i5);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i6 = i4 + 1;
                if (!attributeSet.getAttributeBooleanValue(i5, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i4] = attributeNameResource;
                i4 = i6;
            }
        }
        return StateSet.trimStateSet(iArr, i4);
    }

    public Drawable mutate() {
        if (!this.f15823n && super.mutate() == this) {
            this.f15822m.r();
            this.f15823n = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract boolean onStateChange(int[] iArr);
}
