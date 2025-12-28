package ch.icoaching.wrio.input;

import ch.icoaching.wrio.input.OnContentChangeEventFlags;
import kotlin.jvm.internal.o;

public final class d implements n {

    /* renamed from: a  reason: collision with root package name */
    private final ch.icoaching.wrio.language.d f9765a;

    public d(ch.icoaching.wrio.language.d dVar) {
        o.e(dVar, "languageController");
        this.f9765a = dVar;
    }

    public void a(l lVar) {
        o.e(lVar, "event");
        if (lVar.g().a() == OnContentChangeEventFlags.TriggerEventType.DELETE_DONE && lVar.d().length() == 0) {
            this.f9765a.d();
        }
    }
}
