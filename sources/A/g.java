package a;

import ch.icoaching.wrio.X;
import ch.icoaching.wrio.data.f;
import kotlin.jvm.internal.o;
import l2.q;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f2214a = new g();

    /* renamed from: b  reason: collision with root package name */
    private static f f2215b;

    private g() {
    }

    public final void a() {
        f2215b = null;
    }

    public final f b() {
        if (f2215b == null) {
            synchronized (this) {
                try {
                    if (f2215b == null) {
                        f2215b = new f(X.f9083a.k(), f.f9502a.f());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        f fVar = f2215b;
        o.b(fVar);
        return fVar;
    }
}
