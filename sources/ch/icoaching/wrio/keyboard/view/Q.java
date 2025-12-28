package ch.icoaching.wrio.keyboard.view;

import androidx.recyclerview.widget.RecyclerView;

public final /* synthetic */ class Q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f10288a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f10289b;

    public /* synthetic */ Q(RecyclerView recyclerView, int i4) {
        this.f10288a = recyclerView;
        this.f10289b = i4;
    }

    public final void run() {
        S.c(this.f10288a, this.f10289b);
    }
}
