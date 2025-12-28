package X2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class f extends k {

    /* renamed from: i  reason: collision with root package name */
    public static final b f1957i = new b((i) null);

    /* renamed from: d  reason: collision with root package name */
    private final Method f1958d;

    /* renamed from: e  reason: collision with root package name */
    private final Method f1959e;

    /* renamed from: f  reason: collision with root package name */
    private final Method f1960f;

    /* renamed from: g  reason: collision with root package name */
    private final Class f1961g;

    /* renamed from: h  reason: collision with root package name */
    private final Class f1962h;

    private static final class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private final List f1963a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f1964b;

        /* renamed from: c  reason: collision with root package name */
        private String f1965c;

        public a(List list) {
            o.e(list, "protocols");
            this.f1963a = list;
        }

        public final String a() {
            return this.f1965c;
        }

        public final boolean b() {
            return this.f1964b;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            o.e(obj, "proxy");
            o.e(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (o.a(name, "supports") && o.a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (o.a(name, "unsupported") && o.a(Void.TYPE, returnType)) {
                this.f1964b = true;
                return null;
            } else if (o.a(name, "protocols") && objArr.length == 0) {
                return this.f1963a;
            } else {
                if ((o.a(name, "selectProtocol") || o.a(name, "select")) && o.a(String.class, returnType) && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        if (obj2 != null) {
                            List list = (List) obj2;
                            int size = list.size();
                            if (size >= 0) {
                                int i4 = 0;
                                while (true) {
                                    int i5 = i4 + 1;
                                    Object obj3 = list.get(i4);
                                    if (obj3 != null) {
                                        String str = (String) obj3;
                                        if (this.f1963a.contains(str)) {
                                            this.f1965c = str;
                                            return str;
                                        } else if (i4 == size) {
                                            break;
                                        } else {
                                            i4 = i5;
                                        }
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                }
                            }
                            String str2 = (String) this.f1963a.get(0);
                            this.f1965c = str2;
                            return str2;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                }
                if ((!o.a(name, "protocolSelected") && !o.a(name, "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                }
                Object obj4 = objArr[0];
                if (obj4 != null) {
                    this.f1965c = (String) obj4;
                    return null;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
    }

    public static final class b {
        public /* synthetic */ b(i iVar) {
            this();
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|(1:5)|6|7|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0080, code lost:
            return null;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x001d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final X2.k a() {
            /*
                r14 = this;
                java.lang.String r0 = "org.eclipse.jetty.alpn.ALPN"
                r1 = 0
                r2 = 1
                java.lang.Class<javax.net.ssl.SSLSocket> r3 = javax.net.ssl.SSLSocket.class
                java.lang.String r4 = "java.specification.version"
                java.lang.String r5 = "unknown"
                java.lang.String r4 = java.lang.System.getProperty(r4, r5)
                r5 = 0
                java.lang.String r6 = "jvmVersion"
                kotlin.jvm.internal.o.d(r4, r6)     // Catch:{ NumberFormatException -> 0x001d }
                int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x001d }
                r6 = 9
                if (r4 < r6) goto L_0x001d
                return r5
            L_0x001d:
                java.lang.Class r4 = java.lang.Class.forName(r0, r2, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0080 }
                java.lang.String r6 = "$Provider"
                java.lang.String r6 = kotlin.jvm.internal.o.k(r0, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0080 }
                java.lang.Class r6 = java.lang.Class.forName(r6, r2, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0080 }
                java.lang.String r7 = "$ClientProvider"
                java.lang.String r7 = kotlin.jvm.internal.o.k(r0, r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0080 }
                java.lang.Class r12 = java.lang.Class.forName(r7, r2, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0080 }
                java.lang.String r7 = "$ServerProvider"
                java.lang.String r0 = kotlin.jvm.internal.o.k(r0, r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0080 }
                java.lang.Class r13 = java.lang.Class.forName(r0, r2, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0080 }
                java.lang.String r0 = "put"
                r7 = 2
                java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0080 }
                r7[r1] = r3     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0080 }
                r7[r2] = r6     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0080 }
                java.lang.reflect.Method r9 = r4.getMethod(r0, r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0080 }
                java.lang.String r0 = "get"
                java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0080 }
                r6[r1] = r3     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0080 }
                java.lang.reflect.Method r10 = r4.getMethod(r0, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0080 }
                java.lang.String r0 = "remove"
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0080 }
                r2[r1] = r3     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0080 }
                java.lang.reflect.Method r11 = r4.getMethod(r0, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0080 }
                X2.f r0 = new X2.f     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0080 }
                java.lang.String r1 = "putMethod"
                kotlin.jvm.internal.o.d(r9, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0080 }
                java.lang.String r1 = "getMethod"
                kotlin.jvm.internal.o.d(r10, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0080 }
                java.lang.String r1 = "removeMethod"
                kotlin.jvm.internal.o.d(r11, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0080 }
                java.lang.String r1 = "clientProviderClass"
                kotlin.jvm.internal.o.d(r12, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0080 }
                java.lang.String r1 = "serverProviderClass"
                kotlin.jvm.internal.o.d(r13, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0080 }
                r8 = r0
                r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0080 }
                return r0
            L_0x0080:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: X2.f.b.a():X2.k");
        }

        private b() {
        }
    }

    public f(Method method, Method method2, Method method3, Class cls, Class cls2) {
        o.e(method, "putMethod");
        o.e(method2, "getMethod");
        o.e(method3, "removeMethod");
        o.e(cls, "clientProviderClass");
        o.e(cls2, "serverProviderClass");
        this.f1958d = method;
        this.f1959e = method2;
        this.f1960f = method3;
        this.f1961g = cls;
        this.f1962h = cls2;
    }

    public void b(SSLSocket sSLSocket) {
        o.e(sSLSocket, "sslSocket");
        try {
            this.f1960f.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e4) {
            throw new AssertionError("failed to remove ALPN", e4);
        } catch (InvocationTargetException e5) {
            throw new AssertionError("failed to remove ALPN", e5);
        }
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
        o.e(sSLSocket, "sslSocket");
        o.e(list, "protocols");
        List b4 = k.f1971a.b(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(k.class.getClassLoader(), new Class[]{this.f1961g, this.f1962h}, new a(b4));
            this.f1958d.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (InvocationTargetException e4) {
            throw new AssertionError("failed to set ALPN", e4);
        } catch (IllegalAccessException e5) {
            throw new AssertionError("failed to set ALPN", e5);
        }
    }

    public String g(SSLSocket sSLSocket) {
        o.e(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f1959e.invoke((Object) null, new Object[]{sSLSocket}));
            if (invocationHandler != null) {
                a aVar = (a) invocationHandler;
                if (!aVar.b() && aVar.a() == null) {
                    k.k(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, (Throwable) null, 6, (Object) null);
                    return null;
                } else if (aVar.b()) {
                    return null;
                } else {
                    return aVar.a();
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
        } catch (InvocationTargetException e4) {
            throw new AssertionError("failed to get ALPN selected protocol", e4);
        } catch (IllegalAccessException e5) {
            throw new AssertionError("failed to get ALPN selected protocol", e5);
        }
    }
}
