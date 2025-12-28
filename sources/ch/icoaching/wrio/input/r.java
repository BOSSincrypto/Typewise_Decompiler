package ch.icoaching.wrio.input;

import ch.icoaching.wrio.prediction.d;
import h.C0658a;
import kotlin.jvm.internal.o;

public final class r implements o {

    /* renamed from: a  reason: collision with root package name */
    private final C0658a f9814a;

    /* renamed from: b  reason: collision with root package name */
    private final d f9815b;

    public r(C0658a aVar, d dVar) {
        o.e(aVar, "smartBarAppearanceDecider");
        o.e(dVar, "predictionsController");
        this.f9814a = aVar;
        this.f9815b = dVar;
    }

    public void g(String str, int i4) {
        o.e(str, "content");
        if (this.f9814a.c()) {
            this.f9815b.g(str, i4);
        }
    }
}
