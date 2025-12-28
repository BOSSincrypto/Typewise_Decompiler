package U2;

import Q2.d;
import c3.h;
import c3.k;
import com.silkimen.http.HttpRequest;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import okhttp3.A;
import okhttp3.B;
import okhttp3.l;
import okhttp3.m;
import okhttp3.u;
import okhttp3.v;
import okhttp3.y;
import okhttp3.z;

public final class a implements u {

    /* renamed from: a  reason: collision with root package name */
    private final m f1508a;

    public a(m mVar) {
        o.e(mVar, "cookieJar");
        this.f1508a = mVar;
    }

    private final String b(List list) {
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        for (Object next : list) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                C0718m.s();
            }
            l lVar = (l) next;
            if (i4 > 0) {
                sb.append("; ");
            }
            sb.append(lVar.i());
            sb.append('=');
            sb.append(lVar.n());
            i4 = i5;
        }
        String sb2 = sb.toString();
        o.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public A a(u.a aVar) {
        B a4;
        o.e(aVar, "chain");
        y a5 = aVar.a();
        y.a h4 = a5.h();
        z a6 = a5.a();
        if (a6 != null) {
            v b4 = a6.b();
            if (b4 != null) {
                h4.e(HttpRequest.HEADER_CONTENT_TYPE, b4.toString());
            }
            long a7 = a6.a();
            if (a7 != -1) {
                h4.e(HttpRequest.HEADER_CONTENT_LENGTH, String.valueOf(a7));
                h4.h("Transfer-Encoding");
            } else {
                h4.e("Transfer-Encoding", "chunked");
                h4.h(HttpRequest.HEADER_CONTENT_LENGTH);
            }
        }
        boolean z3 = false;
        if (a5.d("Host") == null) {
            h4.e("Host", d.R(a5.j(), false, 1, (Object) null));
        }
        if (a5.d("Connection") == null) {
            h4.e("Connection", "Keep-Alive");
        }
        if (a5.d(HttpRequest.HEADER_ACCEPT_ENCODING) == null && a5.d("Range") == null) {
            h4.e(HttpRequest.HEADER_ACCEPT_ENCODING, HttpRequest.ENCODING_GZIP);
            z3 = true;
        }
        List a8 = this.f1508a.a(a5.j());
        if (!a8.isEmpty()) {
            h4.e("Cookie", b(a8));
        }
        if (a5.d(HttpRequest.HEADER_USER_AGENT) == null) {
            h4.e(HttpRequest.HEADER_USER_AGENT, "okhttp/4.11.0");
        }
        A b5 = aVar.b(h4.b());
        e.f(this.f1508a, a5.j(), b5.D());
        A.a s4 = b5.b0().s(a5);
        if (z3 && kotlin.text.o.v(HttpRequest.ENCODING_GZIP, A.A(b5, HttpRequest.HEADER_CONTENT_ENCODING, (String) null, 2, (Object) null), true) && e.b(b5) && (a4 = b5.a()) != null) {
            h hVar = new h(a4.m());
            s4.l(b5.D().d().h(HttpRequest.HEADER_CONTENT_ENCODING).h(HttpRequest.HEADER_CONTENT_LENGTH).f());
            s4.b(new h(A.A(b5, HttpRequest.HEADER_CONTENT_TYPE, (String) null, 2, (Object) null), -1, k.b(hVar)));
        }
        return s4.c();
    }
}
