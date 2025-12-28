package I0;

import kotlin.jvm.internal.o;
import l2.q;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f579a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static b f580b;

    private a() {
    }

    public final String a() {
        return "01J32Z9HTGYRC68FA41AGG2BEV";
    }

    public final b b() {
        if (f580b == null) {
            synchronized (this) {
                try {
                    if (f580b == null) {
                        f580b = new b(H0.a.f529a.b());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        b bVar = f580b;
        o.b(bVar);
        return bVar;
    }
}
