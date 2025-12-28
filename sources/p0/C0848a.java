package p0;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: p0.a  reason: case insensitive filesystem */
final class C0848a extends RecyclerView.n {

    /* renamed from: a  reason: collision with root package name */
    private final int f15825a;

    public C0848a(int i4) {
        this.f15825a = i4;
    }

    public void e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        o.e(rect, "outRect");
        o.e(view, "view");
        o.e(recyclerView, "parent");
        o.e(zVar, "state");
        super.e(rect, view, recyclerView, zVar);
        if (recyclerView.j0(view) != -1) {
            rect.set(view.getPaddingLeft() + this.f15825a, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingEnd());
        }
    }
}
