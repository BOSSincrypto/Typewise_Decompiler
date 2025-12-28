package kotlinx.serialization.json.internal;

import F2.a;
import K2.B;
import K2.C0341a;
import kotlin.jvm.internal.o;

public abstract class Q {
    public static final Object a(C0341a aVar, String str, B b4, a aVar2) {
        o.e(aVar, "<this>");
        o.e(str, "discriminator");
        o.e(b4, "element");
        o.e(aVar2, "deserializer");
        return new E(aVar, b4, str, aVar2.a()).w(aVar2);
    }
}
