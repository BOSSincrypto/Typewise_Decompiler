package kotlinx.serialization.json.internal;

import H2.f;
import J2.C0333w;
import kotlin.jvm.internal.o;

public final class JsonElementMarker {

    /* renamed from: a  reason: collision with root package name */
    private final C0333w f14357a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f14358b;

    public JsonElementMarker(f fVar) {
        o.e(fVar, "descriptor");
        this.f14357a = new C0333w(fVar, new JsonElementMarker$origin$1(this));
    }

    /* access modifiers changed from: private */
    public final boolean e(f fVar, int i4) {
        boolean z3;
        if (fVar.j(i4) || !fVar.i(i4).g()) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f14358b = z3;
        return z3;
    }

    public final boolean b() {
        return this.f14358b;
    }

    public final void c(int i4) {
        this.f14357a.a(i4);
    }

    public final int d() {
        return this.f14357a.d();
    }
}
