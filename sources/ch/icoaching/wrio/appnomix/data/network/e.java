package ch.icoaching.wrio.appnomix.data.network;

import kotlin.jvm.internal.o;
import okhttp3.A;
import okhttp3.u;
import okhttp3.y;

public final class e implements u {
    public final A a(u.a aVar) {
        o.e(aVar, "chain");
        y.a h4 = aVar.a().h();
        h4.a("X-Api-Key", "gmKJEyStgG2o6A8iTc9s47O146M7zlyy78uuhk8O");
        return aVar.b(h4.b());
    }
}
