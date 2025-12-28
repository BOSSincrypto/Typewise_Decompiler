package ch.icoaching.wrio.keyboard.view;

import android.view.View;
import ch.icoaching.wrio.keyboard.view.V;
import u2.l;

public final /* synthetic */ class W implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ V.b f10326a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f10327b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ char f10328c;

    public /* synthetic */ W(V.b bVar, l lVar, char c4) {
        this.f10326a = bVar;
        this.f10327b = lVar;
        this.f10328c = c4;
    }

    public final void onClick(View view) {
        V.b.O(this.f10326a, this.f10327b, this.f10328c, view);
    }
}
