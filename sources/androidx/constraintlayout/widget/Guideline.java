package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Guideline extends View {

    /* renamed from: a  reason: collision with root package name */
    private boolean f4294a = true;

    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void draw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z3) {
        this.f4294a = z3;
    }

    public void setGuidelineBegin(int i4) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (!this.f4294a || bVar.f4236a != i4) {
            bVar.f4236a = i4;
            setLayoutParams(bVar);
        }
    }

    public void setGuidelineEnd(int i4) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (!this.f4294a || bVar.f4238b != i4) {
            bVar.f4238b = i4;
            setLayoutParams(bVar);
        }
    }

    public void setGuidelinePercent(float f4) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (!this.f4294a || bVar.f4240c != f4) {
            bVar.f4240c = f4;
            setLayoutParams(bVar);
        }
    }

    public void setVisibility(int i4) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
