package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import n.C0822a;

/* renamed from: androidx.appcompat.widget.w  reason: case insensitive filesystem */
public class C0398w extends RatingBar {

    /* renamed from: a  reason: collision with root package name */
    private final C0396u f3670a;

    public C0398w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0822a.f14661E);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        Bitmap b4 = this.f3670a.b();
        if (b4 != null) {
            setMeasuredDimension(View.resolveSizeAndState(b4.getWidth() * getNumStars(), i4, 0), getMeasuredHeight());
        }
    }

    public C0398w(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Y.a(this, getContext());
        C0396u uVar = new C0396u(this);
        this.f3670a = uVar;
        uVar.c(attributeSet, i4);
    }
}
