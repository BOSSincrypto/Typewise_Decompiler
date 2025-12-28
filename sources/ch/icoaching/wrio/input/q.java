package ch.icoaching.wrio.input;

import ch.icoaching.wrio.input.OnContentChangeEventFlags;
import ch.icoaching.wrio.prediction.d;
import h.C0658a;
import kotlin.jvm.internal.o;

public final class q implements n {

    /* renamed from: a  reason: collision with root package name */
    private final d f9812a;

    /* renamed from: b  reason: collision with root package name */
    private final C0658a f9813b;

    public q(d dVar, C0658a aVar) {
        o.e(dVar, "predictionsController");
        o.e(aVar, "smartBarAppearanceDecider");
        this.f9812a = dVar;
        this.f9813b = aVar;
    }

    public void a(l lVar) {
        o.e(lVar, "event");
        if ((lVar.g().a() == OnContentChangeEventFlags.TriggerEventType.PREDICTION || lVar.g().e()) && lVar.g().a() != OnContentChangeEventFlags.TriggerEventType.DELETE && lVar.g().a() != OnContentChangeEventFlags.TriggerEventType.RESTORE && this.f9813b.c()) {
            this.f9812a.g(lVar.d(), lVar.f());
        }
    }
}
