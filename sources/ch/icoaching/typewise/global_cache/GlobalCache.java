package ch.icoaching.typewise.global_cache;

import E0.s;
import ch.icoaching.typewise.e;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import o2.C0840a;
import u2.l;
import w0.C0928a;

public abstract class GlobalCache {

    /* renamed from: c  reason: collision with root package name */
    public static final a f8267c = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final Kind f8268a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8269b;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lch/icoaching/typewise/global_cache/GlobalCache$Kind;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "IN_MEMORY_DICT", "NO_CACHE", "REDIS_CACHE", "typewise-autocorrect-library-common-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum Kind {
        IN_MEMORY_DICT("in_memory_dict"),
        NO_CACHE("no_cache"),
        REDIS_CACHE("redis");
        
        private final String code;

        static {
            Kind[] a4;
            f8271b = kotlin.enums.a.a(a4);
        }

        private Kind(String str) {
            this.code = str;
        }

        public static C0840a getEntries() {
            return f8271b;
        }

        public final String getCode() {
            return this.code;
        }
    }

    public static final class a {
        private a() {
        }

        public final String a(Pair pair) {
            o.e(pair, "uniqueIdAndText");
            Object first = pair.getFirst();
            Object second = pair.getSecond();
            return first + "##" + second;
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public GlobalCache(Kind kind, int i4) {
        o.e(kind, "kind");
        this.f8268a = kind;
        this.f8269b = i4;
    }

    public static /* synthetic */ Object d(GlobalCache globalCache, Object obj, l lVar, l lVar2, Object obj2, int i4, Object obj3) {
        if (obj3 == null) {
            if ((i4 & 8) != 0) {
                obj2 = null;
            }
            return globalCache.c(obj, lVar, lVar2, obj2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
    }

    public static /* synthetic */ Pair f(GlobalCache globalCache, String str, String str2, l lVar, Object obj, int i4, Object obj2) {
        if (obj2 == null) {
            if ((i4 & 8) != 0) {
                obj = null;
            }
            return globalCache.e(str, str2, lVar, obj);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWithAFewCharsFlexibility");
    }

    /* access modifiers changed from: private */
    public static final String g(Object obj) {
        o.e(obj, "it");
        return f8267c.a((Pair) obj);
    }

    public abstract void b();

    public abstract Object c(Object obj, l lVar, l lVar2, Object obj2);

    public Pair e(String str, String str2, l lVar, Object obj) {
        o.e(str, "uniqueIdentifier");
        o.e(str2, "text");
        o.e(lVar, "valueDeserializer");
        String str3 = str2;
        while (str2.length() - str3.length() <= this.f8269b) {
            Object d4 = d(this, new Pair(str, str3), new C0928a(), lVar, (Object) null, 8, (Object) null);
            if (d4 == null) {
                e eVar = e.f8233a;
                e.b(eVar, "GlobalCache", "Tried with '" + str3 + "', miss", (Throwable) null, 4, (Object) null);
                if (str3.length() <= 0) {
                    break;
                }
                str3 = s.n(str3, 0, -1);
            } else {
                e eVar2 = e.f8233a;
                e.b(eVar2, "GlobalCache", "Tried with '" + str3 + "', hit", (Throwable) null, 4, (Object) null);
                return new Pair(str3, d4);
            }
        }
        return new Pair("", null);
    }

    public abstract void h(Object obj, Object obj2, l lVar, l lVar2);
}
