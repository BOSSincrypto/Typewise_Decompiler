package ch.icoaching.wrio.data;

import i2.C0680a;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.c;

public final class DefaultOtherSettings implements i {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C0680a f9488a;

    public DefaultOtherSettings(C0680a aVar) {
        o.e(aVar, "defaultSharedPreferences");
        this.f9488a = aVar;
    }

    public c a() {
        return new DefaultOtherSettings$observeSendDebugLogTimestamp$$inlined$map$1(new DefaultOtherSettings$observeSendDebugLogTimestamp$$inlined$filter$1(this.f9488a.J0()), this);
    }

    public boolean b() {
        return this.f9488a.D0();
    }

    public boolean c() {
        return this.f9488a.c0();
    }

    public c d() {
        return new DefaultOtherSettings$observeIsInDebugMode$$inlined$map$1(new DefaultOtherSettings$observeIsInDebugMode$$inlined$filter$1(this.f9488a.J0()), this);
    }

    public boolean e() {
        return this.f9488a.c();
    }

    public void f(boolean z3) {
        this.f9488a.z0(z3);
    }

    public long g() {
        return this.f9488a.G0();
    }

    public void c(boolean z3) {
        this.f9488a.o0(z3);
    }
}
