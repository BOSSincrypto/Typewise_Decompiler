package T0;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

public final class a extends RecyclerView.n {

    /* renamed from: a  reason: collision with root package name */
    private final int f1455a;

    public a(int i4) {
        this.f1455a = i4;
    }

    public void e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        RecyclerView.o layoutManager;
        o.e(rect, "outRect");
        o.e(view, "view");
        o.e(recyclerView, "parent");
        o.e(zVar, "state");
        super.e(rect, view, recyclerView, zVar);
        int j02 = recyclerView.j0(view);
        if (j02 != -1 && (layoutManager = recyclerView.getLayoutManager()) != null) {
            if (layoutManager instanceof GridLayoutManager) {
                if (j02 < ((GridLayoutManager) layoutManager).f3()) {
                    rect.set(view.getPaddingLeft(), view.getPaddingTop() + this.f1455a, view.getPaddingRight(), view.getPaddingBottom());
                } else {
                    rect.set(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
                }
            } else if (j02 == 0) {
                rect.set(view.getPaddingLeft(), view.getPaddingTop() + this.f1455a, view.getPaddingRight(), view.getPaddingBottom());
            } else {
                rect.set(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
            }
        }
    }
}
