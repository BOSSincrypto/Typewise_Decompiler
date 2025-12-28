package q0;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: q0.a  reason: case insensitive filesystem */
final class C0858a extends RecyclerView.n {

    /* renamed from: a  reason: collision with root package name */
    private final int f15918a;

    /* renamed from: b  reason: collision with root package name */
    private final int f15919b;

    public C0858a(int i4, int i5) {
        this.f15918a = i4;
        this.f15919b = i5;
    }

    public void e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        int j02;
        int i4;
        o.e(rect, "outRect");
        o.e(view, "view");
        o.e(recyclerView, "parent");
        o.e(zVar, "state");
        super.e(rect, view, recyclerView, zVar);
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null && (j02 = recyclerView.j0(view)) != -1) {
            rect.top = this.f15918a;
            if (j02 == layoutManager.l0() - 1) {
                i4 = this.f15919b;
            } else {
                i4 = 0;
            }
            rect.bottom = i4;
        }
    }
}
