package kotlinx.serialization.json.internal;

import K2.C0341a;
import kotlin.jvm.internal.o;

public abstract class N {
    public static final M a(C0341a aVar, String str) {
        o.e(aVar, "json");
        o.e(str, "source");
        if (!aVar.d().a()) {
            return new M(str);
        }
        return new O(str);
    }
}
