package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import x.C0933a;

@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final int f3678a = getResources().getDimensionPixelOffset(C0933a.f16393b);

    /* renamed from: b  reason: collision with root package name */
    private final int f3679b = getResources().getDimensionPixelOffset(C0933a.f16392a);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f3678a * 2), this.f3679b), 1073741824), i5);
    }
}
