package kotlinx.coroutines.selects;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f14295a = AtomicLongFieldUpdater.newUpdater(f.class, "number");
    private volatile /* synthetic */ long number = 1;

    public final long a() {
        return f14295a.incrementAndGet(this);
    }
}
