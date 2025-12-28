package M2;

import kotlin.jvm.internal.o;
import kotlinx.coroutines.C;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.D;
import kotlinx.coroutines.E;
import kotlinx.coroutines.P;
import kotlinx.coroutines.g0;
import kotlinx.coroutines.z0;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f944a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static CoroutineDispatcher f945b;

    /* renamed from: c  reason: collision with root package name */
    private static CoroutineDispatcher f946c;

    /* renamed from: d  reason: collision with root package name */
    private static D f947d;

    private b() {
    }

    public final D a() {
        if (f947d == null) {
            f947d = E.a(z0.b((g0) null, 1, (Object) null).plus(P.a()).plus(new C("ApplicationCoroutineScope")));
        }
        D d4 = f947d;
        o.b(d4);
        return d4;
    }

    public final CoroutineDispatcher b() {
        if (f946c == null) {
            f946c = P.b();
        }
        CoroutineDispatcher coroutineDispatcher = f946c;
        o.b(coroutineDispatcher);
        return coroutineDispatcher;
    }

    public final CoroutineDispatcher c() {
        if (f945b == null) {
            f945b = P.c();
        }
        CoroutineDispatcher coroutineDispatcher = f945b;
        o.b(coroutineDispatcher);
        return coroutineDispatcher;
    }
}
