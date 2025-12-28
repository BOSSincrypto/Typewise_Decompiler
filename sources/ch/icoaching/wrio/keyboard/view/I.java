package ch.icoaching.wrio.keyboard.view;

import android.view.View;
import ch.icoaching.wrio.keyboard.model.config.Emoji;
import ch.icoaching.wrio.keyboard.view.G;
import u2.l;

public final /* synthetic */ class I implements View.OnLongClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Emoji f10159a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f10160b;

    public /* synthetic */ I(Emoji emoji, l lVar) {
        this.f10159a = emoji;
        this.f10160b = lVar;
    }

    public final boolean onLongClick(View view) {
        return G.b.Q(this.f10159a, this.f10160b, view);
    }
}
