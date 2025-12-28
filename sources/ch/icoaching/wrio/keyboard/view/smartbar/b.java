package ch.icoaching.wrio.keyboard.view.smartbar;

import kotlin.jvm.internal.o;

public abstract class b implements g {

    /* renamed from: a  reason: collision with root package name */
    private final String f10477a;

    /* renamed from: b  reason: collision with root package name */
    private final long f10478b;

    public b(String str, long j4) {
        o.e(str, "smartBarText");
        this.f10477a = str;
        this.f10478b = j4;
    }

    public boolean a(g gVar) {
        o.e(gVar, "other");
        return o.a(gVar, this);
    }

    public boolean b(g gVar) {
        o.e(gVar, "other");
        if (gVar.getClass() == getClass() && ((b) gVar).f10478b == this.f10478b) {
            return true;
        }
        return false;
    }

    public final long c() {
        return this.f10478b;
    }

    public abstract o d();

    public final String e() {
        return this.f10477a;
    }
}
