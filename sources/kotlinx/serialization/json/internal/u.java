package kotlinx.serialization.json.internal;

import H2.f;
import java.util.Map;
import kotlin.jvm.internal.o;
import u2.C0906a;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    private final Map f14400a = t.a(16);

    public static final class a {
    }

    public final Object a(f fVar, a aVar) {
        Object obj;
        o.e(fVar, "descriptor");
        o.e(aVar, "key");
        Map map = (Map) this.f14400a.get(fVar);
        if (map != null) {
            obj = map.get(aVar);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final Object b(f fVar, a aVar, C0906a aVar2) {
        o.e(fVar, "descriptor");
        o.e(aVar, "key");
        o.e(aVar2, "defaultValue");
        Object a4 = a(fVar, aVar);
        if (a4 != null) {
            return a4;
        }
        Object invoke = aVar2.invoke();
        c(fVar, aVar, invoke);
        return invoke;
    }

    public final void c(f fVar, a aVar, Object obj) {
        o.e(fVar, "descriptor");
        o.e(aVar, "key");
        o.e(obj, "value");
        Map map = this.f14400a;
        Object obj2 = map.get(fVar);
        if (obj2 == null) {
            obj2 = t.a(2);
            map.put(fVar, obj2);
        }
        ((Map) obj2).put(aVar, obj);
    }
}
