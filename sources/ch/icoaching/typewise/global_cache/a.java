package ch.icoaching.typewise.global_cache;

import ch.icoaching.typewise.global_cache.GlobalCache;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.o;
import s0.C0892b;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static GlobalCache f8272a;

    public static final GlobalCache a() {
        GlobalCache globalCache = f8272a;
        if (globalCache != null) {
            o.b(globalCache);
            return globalCache;
        }
        throw new IllegalStateException("Global cache not set up, please call setupGlobalCacheFromConfig() first or set it to NoCacheGlobalCache() if you're just testing.");
    }

    public static final void b(C0892b.a aVar) {
        o.e(aVar, "settings");
        GlobalCache globalCache = f8272a;
        if (globalCache != null) {
            globalCache.b();
        }
        String a4 = aVar.a();
        if (o.a(a4, GlobalCache.Kind.NO_CACHE.getCode())) {
            throw new NotImplementedError("NoCacheGlobalCache not implemented in the KMP library!");
        } else if (o.a(a4, GlobalCache.Kind.IN_MEMORY_DICT.getCode())) {
            f8272a = new b(aVar.b().a(), aVar.b().b());
        } else if (o.a(a4, GlobalCache.Kind.REDIS_CACHE.getCode())) {
            throw new NotImplementedError("RedisGlobalCache not implemented in the KMP library!");
        } else {
            String a5 = aVar.a();
            throw new IllegalArgumentException("Not known cache implementation '" + a5 + "'");
        }
    }
}
