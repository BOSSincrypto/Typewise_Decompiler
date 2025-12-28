package androidx.room;

import Z.h;
import kotlin.jvm.internal.o;

public final class d implements h.c {

    /* renamed from: a  reason: collision with root package name */
    private final h.c f6787a;

    /* renamed from: b  reason: collision with root package name */
    private final c f6788b;

    public d(h.c cVar, c cVar2) {
        o.e(cVar, "delegate");
        o.e(cVar2, "autoCloser");
        this.f6787a = cVar;
        this.f6788b = cVar2;
    }

    /* renamed from: b */
    public AutoClosingRoomOpenHelper a(h.b bVar) {
        o.e(bVar, "configuration");
        return new AutoClosingRoomOpenHelper(this.f6787a.a(bVar), this.f6788b);
    }
}
