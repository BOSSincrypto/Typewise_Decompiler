package C0;

import android.util.LruCache;
import kotlin.jvm.internal.o;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final LruCache f220a;

    public a(int i4) {
        this.f220a = new LruCache(i4);
    }

    public final Object a(String str) {
        o.e(str, "key");
        return this.f220a.get(str);
    }

    public final void b() {
        this.f220a.evictAll();
    }

    public final void c(String str, Object obj) {
        o.e(str, "key");
        o.e(obj, "value");
        this.f220a.put(str, obj);
    }
}
