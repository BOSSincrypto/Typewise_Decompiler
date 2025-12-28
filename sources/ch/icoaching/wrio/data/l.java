package ch.icoaching.wrio.data;

import ch.icoaching.wrio.keyboard.M;
import ch.icoaching.wrio.keyboard.layout.Layout;
import i2.C0680a;
import java.util.List;
import java.util.Map;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.c;
import kotlinx.coroutines.flow.q;
import kotlinx.coroutines.flow.r;

public final class l implements c {

    /* renamed from: a  reason: collision with root package name */
    private final c f9518a;

    /* renamed from: b  reason: collision with root package name */
    private final C0680a f9519b;

    public l(c cVar, C0680a aVar) {
        o.e(cVar, "innerLanguageSettings");
        o.e(aVar, "defaultSharedPreferences");
        this.f9518a = cVar;
        this.f9519b = aVar;
    }

    public q a() {
        if (!this.f9519b.m0()) {
            return r.a(k());
        }
        return this.f9518a.a();
    }

    public String b() {
        return this.f9518a.b();
    }

    public c c() {
        return this.f9518a.c();
    }

    public void d(String str) {
        o.e(str, "language");
        this.f9518a.d(str);
    }

    public List e() {
        List e4 = this.f9518a.e();
        if (!this.f9519b.m0()) {
            return e4;
        }
        return C0718m.m(e4.get(0), "en", "de", "es");
    }

    public Map f() {
        return this.f9518a.f();
    }

    public List g() {
        return this.f9518a.g();
    }

    public boolean h() {
        return this.f9518a.h();
    }

    public q i() {
        return this.f9518a.i();
    }

    public List j() {
        return this.f9518a.j();
    }

    public Layout k() {
        if (!this.f9519b.m0()) {
            return this.f9518a.k();
        }
        if (e3.c.f((CharSequence) this.f9518a.e().get(0), "es")) {
            return Layout.QWERTY;
        }
        return M.a((String) e().get(0));
    }

    public void l(Map map) {
        o.e(map, "languageUsage");
        this.f9518a.l(map);
    }
}
