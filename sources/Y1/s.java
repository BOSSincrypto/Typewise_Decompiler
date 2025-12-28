package Y1;

import com.ibm.icu.impl.CacheValue;
import java.util.concurrent.ConcurrentHashMap;

public abstract class s extends c {

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap f2077a = new ConcurrentHashMap();

    public final Object b(Object obj, Object obj2) {
        Object obj3;
        Object obj4 = this.f2077a.get(obj);
        if (obj4 == null) {
            Object a4 = a(obj, obj2);
            if (a4 == null || !CacheValue.a()) {
                obj3 = CacheValue.c(a4);
            } else {
                obj3 = a4;
            }
            Object putIfAbsent = this.f2077a.putIfAbsent(obj, obj3);
            if (putIfAbsent == null) {
                return a4;
            }
            if (!(putIfAbsent instanceof CacheValue)) {
                return putIfAbsent;
            }
            return ((CacheValue) putIfAbsent).e(a4);
        } else if (!(obj4 instanceof CacheValue)) {
            return obj4;
        } else {
            CacheValue cacheValue = (CacheValue) obj4;
            if (cacheValue.d()) {
                return null;
            }
            Object b4 = cacheValue.b();
            if (b4 != null) {
                return b4;
            }
            return cacheValue.e(a(obj, obj2));
        }
    }
}
