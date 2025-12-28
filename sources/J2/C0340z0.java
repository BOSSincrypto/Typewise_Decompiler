package J2;

import A2.c;
import F2.b;
import H2.e;
import H2.f;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.r;

/* renamed from: J2.z0  reason: case insensitive filesystem */
public abstract class C0340z0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Map f767a = C0313l0.g();

    public static final f a(String str, e eVar) {
        o.e(str, "serialName");
        o.e(eVar, "kind");
        c(str);
        return new C0338y0(str, eVar);
    }

    public static final b b(c cVar) {
        o.e(cVar, "<this>");
        return (b) f767a.get(cVar);
    }

    private static final void c(String str) {
        for (b bVar : f767a.values()) {
            if (o.a(str, bVar.a().b())) {
                throw new IllegalArgumentException(kotlin.text.o.f("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exists " + r.b(bVar.getClass()).b() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
