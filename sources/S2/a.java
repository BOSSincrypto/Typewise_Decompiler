package S2;

import Q2.d;
import S2.b;
import com.silkimen.http.HttpRequest;
import kotlin.jvm.internal.i;
import kotlin.text.o;
import okhttp3.A;
import okhttp3.B;
import okhttp3.C0843c;
import okhttp3.Protocol;
import okhttp3.internal.connection.e;
import okhttp3.q;
import okhttp3.s;
import okhttp3.u;
import okhttp3.y;

public final class a implements u {

    /* renamed from: a  reason: collision with root package name */
    public static final C0025a f1438a = new C0025a((i) null);

    /* renamed from: S2.a$a  reason: collision with other inner class name */
    public static final class C0025a {
        public /* synthetic */ C0025a(i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final s c(s sVar, s sVar2) {
            s.a aVar = new s.a();
            int size = sVar.size();
            int i4 = 0;
            int i5 = 0;
            while (i5 < size) {
                int i6 = i5 + 1;
                String c4 = sVar.c(i5);
                String f4 = sVar.f(i5);
                if ((!o.v("Warning", c4, true) || !o.G(f4, "1", false, 2, (Object) null)) && (d(c4) || !e(c4) || sVar2.b(c4) == null)) {
                    aVar.d(c4, f4);
                }
                i5 = i6;
            }
            int size2 = sVar2.size();
            while (i4 < size2) {
                int i7 = i4 + 1;
                String c5 = sVar2.c(i4);
                if (!d(c5) && e(c5)) {
                    aVar.d(c5, sVar2.f(i4));
                }
                i4 = i7;
            }
            return aVar.f();
        }

        private final boolean d(String str) {
            if (o.v(HttpRequest.HEADER_CONTENT_LENGTH, str, true) || o.v(HttpRequest.HEADER_CONTENT_ENCODING, str, true) || o.v(HttpRequest.HEADER_CONTENT_TYPE, str, true)) {
                return true;
            }
            return false;
        }

        private final boolean e(String str) {
            if (o.v("Connection", str, true) || o.v("Keep-Alive", str, true) || o.v("Proxy-Authenticate", str, true) || o.v(HttpRequest.HEADER_PROXY_AUTHORIZATION, str, true) || o.v("TE", str, true) || o.v("Trailers", str, true) || o.v("Transfer-Encoding", str, true) || o.v("Upgrade", str, true)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: private */
        public final A f(A a4) {
            B b4;
            if (a4 == null) {
                b4 = null;
            } else {
                b4 = a4.a();
            }
            if (b4 != null) {
                return a4.b0().b((B) null).c();
            }
            return a4;
        }

        private C0025a() {
        }
    }

    public a(C0843c cVar) {
    }

    public A a(u.a aVar) {
        e eVar;
        q qVar;
        kotlin.jvm.internal.o.e(aVar, "chain");
        okhttp3.e call = aVar.call();
        b b4 = new b.C0026b(System.currentTimeMillis(), aVar.a(), (A) null).b();
        y b5 = b4.b();
        A a4 = b4.a();
        if (call instanceof e) {
            eVar = (e) call;
        } else {
            eVar = null;
        }
        if (eVar == null) {
            qVar = null;
        } else {
            qVar = eVar.q();
        }
        if (qVar == null) {
            qVar = q.f15477b;
        }
        if (b5 == null && a4 == null) {
            A c4 = new A.a().s(aVar.a()).q(Protocol.HTTP_1_1).g(504).n("Unsatisfiable Request (only-if-cached)").b(d.f1348c).t(-1).r(System.currentTimeMillis()).c();
            qVar.z(call, c4);
            return c4;
        } else if (b5 == null) {
            kotlin.jvm.internal.o.b(a4);
            A c5 = a4.b0().d(f1438a.f(a4)).c();
            qVar.b(call, c5);
            return c5;
        } else {
            if (a4 != null) {
                qVar.a(call, a4);
            }
            A b6 = aVar.b(b5);
            if (a4 != null) {
                if (b6 != null && b6.m() == 304) {
                    A.a b02 = a4.b0();
                    C0025a aVar2 = f1438a;
                    b02.l(aVar2.c(a4.D(), b6.D())).t(b6.p0()).r(b6.j0()).d(aVar2.f(a4)).o(aVar2.f(b6)).c();
                    B a5 = b6.a();
                    kotlin.jvm.internal.o.b(a5);
                    a5.close();
                    kotlin.jvm.internal.o.b((Object) null);
                    throw null;
                }
                B a6 = a4.a();
                if (a6 != null) {
                    d.m(a6);
                }
            }
            kotlin.jvm.internal.o.b(b6);
            A.a b03 = b6.b0();
            C0025a aVar3 = f1438a;
            return b03.d(aVar3.f(a4)).o(aVar3.f(b6)).c();
        }
    }
}
