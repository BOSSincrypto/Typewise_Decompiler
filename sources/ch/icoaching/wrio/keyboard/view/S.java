package ch.icoaching.wrio.keyboard.view;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

public abstract class S {
    public static final void b(RecyclerView recyclerView, int i4) {
        o.e(recyclerView, "<this>");
        recyclerView.post(new Q(recyclerView, i4));
    }

    /* access modifiers changed from: private */
    public static final void c(RecyclerView recyclerView, int i4) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            ((LinearLayoutManager) layoutManager).J2(i4, 0);
        }
    }
}
