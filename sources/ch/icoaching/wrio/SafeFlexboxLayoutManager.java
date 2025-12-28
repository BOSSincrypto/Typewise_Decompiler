package ch.icoaching.wrio;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lch/icoaching/wrio/SafeFlexboxLayoutManager;", "Lcom/google/android/flexbox/FlexboxLayoutManager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/ViewGroup$LayoutParams;", "lp", "Landroidx/recyclerview/widget/RecyclerView$p;", "S", "(Landroid/view/ViewGroup$LayoutParams;)Landroidx/recyclerview/widget/RecyclerView$p;", "typewise-sdk-common-2.4.40(219)_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SafeFlexboxLayoutManager extends FlexboxLayoutManager {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SafeFlexboxLayoutManager(Context context) {
        super(context);
        o.e(context, "context");
    }

    public RecyclerView.p S(ViewGroup.LayoutParams layoutParams) {
        o.e(layoutParams, "lp");
        return new FlexboxLayoutManager.c(layoutParams);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SafeFlexboxLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        o.e(context, "context");
        o.e(attributeSet, "attrs");
    }
}
