package kotlinx.serialization.json.internal;

import K2.C0341a;
import kotlin.jvm.internal.o;

/* renamed from: kotlinx.serialization.json.internal.s  reason: case insensitive filesystem */
public abstract class C0779s {
    public static final C0769h a(v vVar, C0341a aVar) {
        o.e(vVar, "sb");
        o.e(aVar, "json");
        if (aVar.d().m()) {
            return new r(vVar, aVar);
        }
        return new C0769h(vVar);
    }
}
