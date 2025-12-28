package ch.icoaching.wrio.tutorialmode;

import ch.icoaching.wrio.data.c;
import ch.icoaching.wrio.data.m;
import i2.C0680a;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.q;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final c f10681a;

    /* renamed from: b  reason: collision with root package name */
    private final q f10682b;

    public a(C0680a aVar, c cVar) {
        o.e(aVar, "defaultSharedPreferences");
        o.e(cVar, "languageSettings");
        c a4 = m.a(cVar, aVar);
        this.f10681a = a4;
        this.f10682b = a4.i();
    }

    public final List a() {
        return this.f10681a.e();
    }

    public final String b() {
        return this.f10681a.b();
    }

    public final q c() {
        return this.f10682b;
    }

    public final boolean d() {
        return this.f10681a.h();
    }

    public final kotlinx.coroutines.flow.c e() {
        return this.f10681a.c();
    }
}
