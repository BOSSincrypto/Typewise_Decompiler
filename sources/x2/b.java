package X2;

import Y2.c;
import Y2.d;
import Y2.h;
import Y2.k;
import Y2.l;
import Y2.m;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class b extends k {

    /* renamed from: e  reason: collision with root package name */
    public static final a f1941e = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f1942f;

    /* renamed from: d  reason: collision with root package name */
    private final List f1943d;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final k a() {
            if (b()) {
                return new b();
            }
            return null;
        }

        public final boolean b() {
            return b.f1942f;
        }

        private a() {
        }
    }

    static {
        boolean z3;
        if (!k.f1971a.h() || Build.VERSION.SDK_INT < 29) {
            z3 = false;
        } else {
            z3 = true;
        }
        f1942f = z3;
    }

    public b() {
        m[] mVarArr = {c.f2098a.a(), new l(h.f2106f.d()), new l(k.f2120a.a()), new l(Y2.i.f2114a.a())};
        ArrayList arrayList = new ArrayList();
        for (Object next : C0718m.n(mVarArr)) {
            if (((m) next).isSupported()) {
                arrayList.add(next);
            }
        }
        this.f1943d = arrayList;
    }

    public a3.c c(X509TrustManager x509TrustManager) {
        o.e(x509TrustManager, "trustManager");
        d a4 = d.f2099d.a(x509TrustManager);
        if (a4 == null) {
            return super.c(x509TrustManager);
        }
        return a4;
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        o.e(sSLSocket, "sslSocket");
        o.e(list, "protocols");
        Iterator it = this.f1943d.iterator();
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

    public String g(SSLSocket sSLSocket) {
        Object obj;
        o.e(sSLSocket, "sslSocket");
        Iterator it = this.f1943d.iterator();
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

    public boolean i(String str) {
        o.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
