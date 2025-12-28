package ch.icoaching.wrio.subscription;

import I0.a;
import ch.icoaching.wrio.data.f;
import kotlin.jvm.internal.o;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f10644a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static a f10645b;

    private b() {
    }

    public final a a() {
        if (f10645b == null) {
            f10645b = new TypewiseSubscriptionChecker(f.f9502a.f(), a.f579a.b(), M2.a.f941a.a());
        }
        a aVar = f10645b;
        o.b(aVar);
        return aVar;
    }
}
