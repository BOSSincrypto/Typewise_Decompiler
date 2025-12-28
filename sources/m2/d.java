package M2;

import N2.f;
import c2.C0495a;
import c2.C0496b;
import ch.icoaching.wrio.X;
import ch.icoaching.wrio.data.a;
import ch.icoaching.wrio.dictionary.e;
import i2.C0680a;
import kotlin.jvm.internal.o;
import l2.q;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f949a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static f f950b;

    private d() {
    }

    public final f a() {
        if (f950b == null) {
            synchronized (this) {
                try {
                    if (f950b == null) {
                        C0495a a4 = C0496b.f7632a.a();
                        ch.icoaching.wrio.data.f fVar = ch.icoaching.wrio.data.f.f9502a;
                        C0680a f4 = fVar.f();
                        a d4 = fVar.d();
                        X x3 = X.f9083a;
                        f950b = new f(a4, f4, d4, x3.z(), e.f9628a.a(), fVar.h(), fVar.k(), fVar.e(), fVar.i(), b.f944a.b(), x3.b());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        f fVar2 = f950b;
        o.b(fVar2);
        return fVar2;
    }
}
