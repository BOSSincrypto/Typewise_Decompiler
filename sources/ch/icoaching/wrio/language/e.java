package ch.icoaching.wrio.language;

import M2.b;
import ch.icoaching.wrio.X;
import ch.icoaching.wrio.data.f;
import ch.icoaching.wrio.tutorialmode.a;
import kotlin.jvm.internal.o;
import s3.c;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f10568a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static d f10569b;

    /* renamed from: c  reason: collision with root package name */
    private static f f10570c;

    /* renamed from: d  reason: collision with root package name */
    private static c f10571d;

    private e() {
    }

    private final c b() {
        if (f10571d == null) {
            f10571d = new c(f.f9502a.m());
        }
        c cVar = f10571d;
        o.b(cVar);
        return cVar;
    }

    private final f c() {
        if (f10570c == null) {
            f10570c = new c(f.f9502a.e(), X.f9083a.w());
        }
        f fVar = f10570c;
        o.b(fVar);
        return fVar;
    }

    public final d a() {
        if (f10569b == null) {
            f c4 = c();
            c b4 = b();
            a w3 = X.f9083a.w();
            b bVar = b.f944a;
            f10569b = new DefaultLanguageController(c4, b4, w3, bVar.b(), bVar.c(), bVar.a(), ch.icoaching.wrio.subscription.b.f10644a.a());
        }
        d dVar = f10569b;
        o.b(dVar);
        return dVar;
    }
}
