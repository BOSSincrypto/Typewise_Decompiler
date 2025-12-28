package Y2;

import X2.c;
import X2.k;
import Y2.l;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.text.C0724d;

public class h implements m {

    /* renamed from: f  reason: collision with root package name */
    public static final a f2106f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final l.a f2107g;

    /* renamed from: a  reason: collision with root package name */
    private final Class f2108a;

    /* renamed from: b  reason: collision with root package name */
    private final Method f2109b;

    /* renamed from: c  reason: collision with root package name */
    private final Method f2110c;

    /* renamed from: d  reason: collision with root package name */
    private final Method f2111d;

    /* renamed from: e  reason: collision with root package name */
    private final Method f2112e;

    public static final class a {

        /* renamed from: Y2.h$a$a  reason: collision with other inner class name */
        public static final class C0039a implements l.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f2113a;

            C0039a(String str) {
                this.f2113a = str;
            }

            public boolean a(SSLSocket sSLSocket) {
                o.e(sSLSocket, "sslSocket");
                String name = sSLSocket.getClass().getName();
                o.d(name, "sslSocket.javaClass.name");
                return kotlin.text.o.G(name, o.k(this.f2113a, "."), false, 2, (Object) null);
            }

            public m b(SSLSocket sSLSocket) {
                o.e(sSLSocket, "sslSocket");
                return h.f2106f.b(sSLSocket.getClass());
            }
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final h b(Class cls) {
            Class cls2 = cls;
            while (cls2 != null && !o.a(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError(o.k("No OpenSSLSocketImpl superclass of socket of type ", cls));
                }
            }
            o.b(cls2);
            return new h(cls2);
        }

        public final l.a c(String str) {
            o.e(str, "packageName");
            return new C0039a(str);
        }

        public final l.a d() {
            return h.f2107g;
        }

        private a() {
        }
    }

    static {
        a aVar = new a((i) null);
        f2106f = aVar;
        f2107g = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public h(Class cls) {
        o.e(cls, "sslSocketClass");
        this.f2108a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        o.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f2109b = declaredMethod;
        this.f2110c = cls.getMethod("setHostname", new Class[]{String.class});
        this.f2111d = cls.getMethod("getAlpnSelectedProtocol", (Class[]) null);
        this.f2112e = cls.getMethod("setAlpnProtocols", new Class[]{byte[].class});
    }

    public boolean a(SSLSocket sSLSocket) {
        o.e(sSLSocket, "sslSocket");
        return this.f2108a.isInstance(sSLSocket);
    }

    public String b(SSLSocket sSLSocket) {
        o.e(sSLSocket, "sslSocket");
        if (!a(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f2111d.invoke(sSLSocket, (Object[]) null);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, C0724d.f13927b);
        } catch (IllegalAccessException e4) {
            throw new AssertionError(e4);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if ((cause instanceof NullPointerException) && o.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e5);
        }
    }

    public void c(SSLSocket sSLSocket, String str, List list) {
        o.e(sSLSocket, "sslSocket");
        o.e(list, "protocols");
        if (a(sSLSocket)) {
            try {
                this.f2109b.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                if (str != null) {
                    this.f2110c.invoke(sSLSocket, new Object[]{str});
                }
                this.f2112e.invoke(sSLSocket, new Object[]{k.f1971a.c(list)});
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            } catch (InvocationTargetException e5) {
                throw new AssertionError(e5);
            }
        }
    }

    public boolean isSupported() {
        return c.f1944f.b();
    }
}
