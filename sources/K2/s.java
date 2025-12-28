package K2;

import L2.b;
import L2.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.serialization.json.internal.I;

final class s extends C0341a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(C0346f fVar, b bVar) {
        super(fVar, bVar, (i) null);
        o.e(fVar, "configuration");
        o.e(bVar, "module");
        f();
    }

    private final void f() {
        if (!o.a(a(), c.a())) {
            a().a(new I(d().p(), d().e()));
        }
    }
}
