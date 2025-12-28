package kotlinx.serialization.json.internal;

import H2.f;
import K2.C0341a;
import K2.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

final class B extends C0764c {

    /* renamed from: g  reason: collision with root package name */
    private final h f14330g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B(C0341a aVar, h hVar, String str) {
        super(aVar, hVar, str, (i) null);
        o.e(aVar, "json");
        o.e(hVar, "value");
        this.f14330g = hVar;
        c0("primitive");
    }

    public int e(f fVar) {
        o.e(fVar, "descriptor");
        return 0;
    }

    /* access modifiers changed from: protected */
    public h l0(String str) {
        o.e(str, "tag");
        if (str == "primitive") {
            return z0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    public h z0() {
        return this.f14330g;
    }
}
