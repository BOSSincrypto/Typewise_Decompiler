package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import n.j;

public final class ViewStubCompat extends View {

    /* renamed from: a  reason: collision with root package name */
    private int f3457a;

    /* renamed from: b  reason: collision with root package name */
    private int f3458b;

    /* renamed from: c  reason: collision with root package name */
    private WeakReference f3459c;

    /* renamed from: d  reason: collision with root package name */
    private LayoutInflater f3460d;

    public interface a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f3457a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f3460d;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f3457a, viewGroup, false);
            int i4 = this.f3458b;
            if (i4 != -1) {
                inflate.setId(i4);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f3459c = new WeakReference(inflate);
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f3458b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f3460d;
    }

    public int getLayoutResource() {
        return this.f3457a;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i4) {
        this.f3458b = i4;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f3460d = layoutInflater;
    }

    public void setLayoutResource(int i4) {
        this.f3457a = i4;
    }

    public void setOnInflateListener(a aVar) {
    }

    public void setVisibility(int i4) {
        WeakReference weakReference = this.f3459c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i4);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i4);
        if (i4 == 0 || i4 == 4) {
            a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f3457a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.z3, i4, 0);
        this.f3458b = obtainStyledAttributes.getResourceId(j.C3, -1);
        this.f3457a = obtainStyledAttributes.getResourceId(j.B3, 0);
        setId(obtainStyledAttributes.getResourceId(j.A3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
