package B2;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.o;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference f191a;

    public a(e eVar) {
        o.e(eVar, "sequence");
        this.f191a = new AtomicReference(eVar);
    }

    public Iterator iterator() {
        e eVar = (e) this.f191a.getAndSet((Object) null);
        if (eVar != null) {
            return eVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
