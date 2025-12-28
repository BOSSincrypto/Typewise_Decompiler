package m2;

import java.util.Map;
import kotlin.collections.C0710e;
import kotlin.jvm.internal.o;

/* renamed from: m2.a  reason: case insensitive filesystem */
public abstract class C0820a extends C0710e {
    public final boolean b(Map.Entry entry) {
        o.e(entry, "element");
        return c(entry);
    }

    public abstract boolean c(Map.Entry entry);

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return b((Map.Entry) obj);
    }

    public abstract /* bridge */ boolean d(Map.Entry entry);

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return d((Map.Entry) obj);
    }
}
