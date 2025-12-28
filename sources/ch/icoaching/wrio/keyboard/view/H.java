package ch.icoaching.wrio.keyboard.view;

import android.view.View;
import ch.icoaching.wrio.keyboard.model.config.Emoji;
import ch.icoaching.wrio.keyboard.view.G;
import u2.l;

public final /* synthetic */ class H implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f10157a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Emoji f10158b;

    public /* synthetic */ H(l lVar, Emoji emoji) {
        this.f10157a = lVar;
        this.f10158b = emoji;
    }

    public final void onClick(View view) {
        G.b.P(this.f10157a, this.f10158b, view);
    }
}
