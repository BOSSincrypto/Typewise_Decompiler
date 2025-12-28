package kotlinx.coroutines;

import kotlinx.coroutines.internal.r;
import kotlinx.coroutines.internal.z;

public abstract class H {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f13998a = z.e("kotlinx.coroutines.main.delay", false);

    /* renamed from: b  reason: collision with root package name */
    private static final K f13999b = b();

    public static final K a() {
        return f13999b;
    }

    private static final K b() {
        if (!f13998a) {
            return G.f13996h;
        }
        q0 c4 = P.c();
        if (r.c(c4) || !(c4 instanceof K)) {
            return G.f13996h;
        }
        return (K) c4;
    }
}
