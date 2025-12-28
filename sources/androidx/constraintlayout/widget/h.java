package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;

public abstract class h extends a {

    /* renamed from: j  reason: collision with root package name */
    private boolean f4682j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f4683k;

    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    /* access modifiers changed from: protected */
    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.f4623n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == f.f4658u1) {
                    this.f4682j = true;
                } else if (index == f.f4458B1) {
                    this.f4683k = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4682j || this.f4683k) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i4 = 0; i4 < this.f4296b; i4++) {
                    View l4 = constraintLayout.l(this.f4295a[i4]);
                    if (l4 != null) {
                        if (this.f4682j) {
                            l4.setVisibility(visibility);
                        }
                        if (this.f4683k && elevation > 0.0f) {
                            l4.setTranslationZ(l4.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public abstract void p(androidx.constraintlayout.core.widgets.h hVar, int i4, int i5);

    public void setElevation(float f4) {
        super.setElevation(f4);
        d();
    }

    public void setVisibility(int i4) {
        super.setVisibility(i4);
        d();
    }
}
