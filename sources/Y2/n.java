package Y2;

import X2.k;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class n extends h {

    /* renamed from: j  reason: collision with root package name */
    public static final a f2124j = new a((i) null);

    /* renamed from: h  reason: collision with root package name */
    private final Class f2125h;

    /* renamed from: i  reason: collision with root package name */
    private final Class f2126i;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public static /* synthetic */ m b(a aVar, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.a(str);
        }

        public final m a(String str) {
            o.e(str, "packageName");
            try {
                Class<?> cls = Class.forName(o.k(str, ".OpenSSLSocketImpl"));
                Class<?> cls2 = Class.forName(o.k(str, ".OpenSSLSocketFactoryImpl"));
                Class<?> cls3 = Class.forName(o.k(str, ".SSLParametersImpl"));
                o.d(cls3, "paramsClass");
                return new n(cls, cls2, cls3);
            } catch (Exception e4) {
                k.f1971a.g().j("unable to load android socket classes", 5, e4);
                return null;
            }
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(Class cls, Class cls2, Class cls3) {
        super(cls);
        o.e(cls, "sslSocketClass");
        o.e(cls2, "sslSocketFactoryClass");
        o.e(cls3, "paramClass");
        this.f2125h = cls2;
        this.f2126i = cls3;
    }
}
