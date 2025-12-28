package ch.icoaching.typewise.global_cache;

import C0.a;
import ch.icoaching.typewise.e;
import ch.icoaching.typewise.global_cache.GlobalCache;
import kotlin.jvm.internal.o;
import u2.l;

public final class b extends GlobalCache {

    /* renamed from: d  reason: collision with root package name */
    private final a f8273d;

    public b(int i4, int i5) {
        super(GlobalCache.Kind.IN_MEMORY_DICT, i5);
        this.f8273d = new a(i4);
    }

    public void b() {
        this.f8273d.b();
    }

    public Object c(Object obj, l lVar, l lVar2, Object obj2) {
        o.e(obj, "key");
        o.e(lVar, "keySerializer");
        o.e(lVar2, "valueDeserializer");
        String str = (String) lVar.invoke(obj);
        Object a4 = this.f8273d.a(str);
        e eVar = e.f8233a;
        if (a4 == null) {
            e.b(eVar, "InMemoryDictGlobalCache", "get() :: Cache miss for '" + str + "'", (Throwable) null, 4, (Object) null);
            return obj2;
        }
        e.b(eVar, "InMemoryDictGlobalCache", "get() :: Cache hit for '" + str + "'", (Throwable) null, 4, (Object) null);
        return a4;
    }

    public void h(Object obj, Object obj2, l lVar, l lVar2) {
        o.e(obj, "key");
        o.e(obj2, "value");
        o.e(lVar, "keySerializer");
        o.e(lVar2, "valueSerializer");
        this.f8273d.c((String) lVar.invoke(obj), obj2);
    }
}
