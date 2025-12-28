package c2;

import ch.icoaching.wrio.data.f;
import ch.icoaching.wrio.language.e;
import kotlin.jvm.internal.o;

/* renamed from: c2.b  reason: case insensitive filesystem */
public final class C0496b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0496b f7632a = new C0496b();

    /* renamed from: b  reason: collision with root package name */
    private static C0495a f7633b;

    private C0496b() {
    }

    public final C0495a a() {
        if (f7633b == null) {
            f fVar = f.f9502a;
            f7633b = new C0495a(fVar.d(), e.f10568a.a(), fVar.e());
        }
        C0495a aVar = f7633b;
        o.b(aVar);
        return aVar;
    }
}
