package androidx.core.content.res;

import android.graphics.Typeface;
import androidx.core.content.res.h;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h.e f4942a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Typeface f4943b;

    public /* synthetic */ i(h.e eVar, Typeface typeface) {
        this.f4942a = eVar;
        this.f4943b = typeface;
    }

    public final void run() {
        this.f4942a.g(this.f4943b);
    }
}
