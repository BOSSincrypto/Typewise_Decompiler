package androidx.lifecycle;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;

public class I {

    /* renamed from: a  reason: collision with root package name */
    private final Map f6008a = new LinkedHashMap();

    public final void a() {
        for (E a4 : this.f6008a.values()) {
            a4.a();
        }
        this.f6008a.clear();
    }

    public final E b(String str) {
        o.e(str, "key");
        return (E) this.f6008a.get(str);
    }

    public final Set c() {
        return new HashSet(this.f6008a.keySet());
    }

    public final void d(String str, E e4) {
        o.e(str, "key");
        o.e(e4, "viewModel");
        E e5 = (E) this.f6008a.put(str, e4);
        if (e5 != null) {
            e5.d();
        }
    }
}
