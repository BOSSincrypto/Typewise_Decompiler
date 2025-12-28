package X2;

import Y2.d;
import Y2.h;
import Y2.j;
import Y2.k;
import Y2.l;
import Y2.m;
import Y2.n;
import a3.e;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class c extends k {

    /* renamed from: f  reason: collision with root package name */
    public static final a f1944f = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f1945g;

    /* renamed from: d  reason: collision with root package name */
    private final List f1946d;

    /* renamed from: e  reason: collision with root package name */
    private final j f1947e;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final k a() {
            if (b()) {
                return new c();
            }
            return null;
        }

        public final boolean b() {
            return c.f1945g;
        }

        private a() {
        }
    }

    public static final class b implements e {

        /* renamed from: a  reason: collision with root package name */
        private final X509TrustManager f1948a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f1949b;

        public b(X509TrustManager x509TrustManager, Method method) {
            o.e(x509TrustManager, "trustManager");
            o.e(method, "findByIssuerAndSignatureMethod");
            this.f1948a = x509TrustManager;
            this.f1949b = method;
        }

        public X509Certificate a(X509Certificate x509Certificate) {
            o.e(x509Certificate, "cert");
            try {
                Object invoke = this.f1949b.invoke(this.f1948a, new Object[]{x509Certificate});
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e4) {
                throw new AssertionError("unable to get issues and signature", e4);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (o.a(this.f1948a, bVar.f1948a) && o.a(this.f1949b, bVar.f1949b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f1948a.hashCode() * 31) + this.f1949b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f1948a + ", findByIssuerAndSignatureMethod=" + this.f1949b + ')';
        }
    }

    static {
        boolean z3 = false;
        if (k.f1971a.h() && Build.VERSION.SDK_INT < 30) {
            z3 = true;
        }
        f1945g = z3;
    }

    public c() {
        m[] mVarArr = {n.a.b(n.f2124j, (String) null, 1, (Object) null), new l(h.f2106f.d()), new l(k.f2120a.a()), new l(Y2.i.f2114a.a())};
        ArrayList arrayList = new ArrayList();
        for (Object next : C0718m.n(mVarArr)) {
            if (((m) next).isSupported()) {
                arrayList.add(next);
            }
        }
        this.f1946d = arrayList;
        this.f1947e = j.f2116d.a();
    }

    public a3.c c(X509TrustManager x509TrustManager) {
        o.e(x509TrustManager, "trustManager");
        d a4 = d.f2099d.a(x509TrustManager);
        if (a4 == null) {
            return super.c(x509TrustManager);
        }
        return a4;
    }

    public e d(X509TrustManager x509TrustManager) {
        o.e(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            o.d(declaredMethod, "method");
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        o.e(sSLSocket, "sslSocket");
        o.e(list, "protocols");
        Iterator it = this.f1946d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).a(sSLSocket)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            mVar.c(sSLSocket, str, list);
        }
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i4) {
        o.e(socket, "socket");
        o.e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i4);
        } catch (ClassCastException e4) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e4);
            }
            throw e4;
        }
    }

    public String g(SSLSocket sSLSocket) {
        Object obj;
        o.e(sSLSocket, "sslSocket");
        Iterator it = this.f1946d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).a(sSLSocket)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar == null) {
            return null;
        }
        return mVar.b(sSLSocket);
    }

    public Object h(String str) {
        o.e(str, "closer");
        return this.f1947e.a(str);
    }

    public boolean i(String str) {
        o.e(str, "hostname");
        if (Build.VERSION.SDK_INT >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    public void l(String str, Object obj) {
        o.e(str, "message");
        if (!this.f1947e.b(obj)) {
            k.k(this, str, 5, (Throwable) null, 4, (Object) null);
        }
    }
}
