package kotlinx.coroutines;

import kotlinx.coroutines.internal.q;
import kotlinx.coroutines.scheduling.a;
import kotlinx.coroutines.scheduling.b;

public final class P {

    /* renamed from: a  reason: collision with root package name */
    public static final P f14002a = new P();

    /* renamed from: b  reason: collision with root package name */
    private static final CoroutineDispatcher f14003b = b.f14255i;

    /* renamed from: c  reason: collision with root package name */
    private static final CoroutineDispatcher f14004c = C0.f13988c;

    /* renamed from: d  reason: collision with root package name */
    private static final CoroutineDispatcher f14005d = a.f14253d;

    private P() {
    }

    public static final CoroutineDispatcher a() {
        return f14003b;
    }

    public static final CoroutineDispatcher b() {
        return f14005d;
    }

    public static final q0 c() {
        return q.f14197b;
    }
}
