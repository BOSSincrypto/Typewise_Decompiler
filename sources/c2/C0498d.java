package c2;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: c2.d  reason: case insensitive filesystem */
public final class C0498d {

    /* renamed from: a  reason: collision with root package name */
    private final Map f7634a = new LinkedHashMap();

    public final int a(String str) {
        o.e(str, "language");
        Integer num = (Integer) this.f7634a.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void b(Map map) {
        o.e(map, "counterMap");
        this.f7634a.putAll(map);
    }
}
