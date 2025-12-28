package a3;

import Q2.a;
import c3.y;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;

public final class d implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final d f2320a = new d();

    private d() {
    }

    private final String b(String str) {
        if (!d(str)) {
            return str;
        }
        Locale locale = Locale.US;
        o.d(locale, "US");
        String lowerCase = str.toLowerCase(locale);
        o.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private final List c(X509Certificate x509Certificate, int i4) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return C0718m.j();
            }
            ArrayList arrayList = new ArrayList();
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        if (o.a(next.get(0), Integer.valueOf(i4))) {
                            Object obj = next.get(1);
                            if (obj != null) {
                                arrayList.add((String) obj);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return C0718m.j();
        }
    }

    private final boolean d(String str) {
        if (str.length() == ((int) y.b(str, 0, 0, 3, (Object) null))) {
            return true;
        }
        return false;
    }

    private final boolean f(String str, String str2) {
        if (str != null && str.length() != 0 && !kotlin.text.o.G(str, ".", false, 2, (Object) null) && !kotlin.text.o.u(str, "..", false, 2, (Object) null) && str2 != null && str2.length() != 0 && !kotlin.text.o.G(str2, ".", false, 2, (Object) null) && !kotlin.text.o.u(str2, "..", false, 2, (Object) null)) {
            if (!kotlin.text.o.u(str, ".", false, 2, (Object) null)) {
                str = o.k(str, ".");
            }
            String str3 = str;
            if (!kotlin.text.o.u(str2, ".", false, 2, (Object) null)) {
                str2 = o.k(str2, ".");
            }
            String b4 = b(str2);
            if (!kotlin.text.o.L(b4, "*", false, 2, (Object) null)) {
                return o.a(str3, b4);
            }
            if (!kotlin.text.o.G(b4, "*.", false, 2, (Object) null) || kotlin.text.o.U(b4, '*', 1, false, 4, (Object) null) != -1 || str3.length() < b4.length() || o.a("*.", b4)) {
                return false;
            }
            String substring = b4.substring(1);
            o.d(substring, "this as java.lang.String).substring(startIndex)");
            if (!kotlin.text.o.u(str3, substring, false, 2, (Object) null)) {
                return false;
            }
            int length = str3.length() - substring.length();
            if (length <= 0 || kotlin.text.o.a0(str3, '.', length - 1, false, 4, (Object) null) == -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    private final boolean g(String str, X509Certificate x509Certificate) {
        String b4 = b(str);
        Iterable<String> c4 = c(x509Certificate, 2);
        if ((c4 instanceof Collection) && ((Collection) c4).isEmpty()) {
            return false;
        }
        for (String f4 : c4) {
            if (f2320a.f(b4, f4)) {
                return true;
            }
        }
        return false;
    }

    private final boolean h(String str, X509Certificate x509Certificate) {
        String e4 = a.e(str);
        Iterable<String> c4 = c(x509Certificate, 7);
        if ((c4 instanceof Collection) && ((Collection) c4).isEmpty()) {
            return false;
        }
        for (String e5 : c4) {
            if (o.a(e4, a.e(e5))) {
                return true;
            }
        }
        return false;
    }

    public final List a(X509Certificate x509Certificate) {
        o.e(x509Certificate, "certificate");
        return C0718m.i0(c(x509Certificate, 7), c(x509Certificate, 2));
    }

    public final boolean e(String str, X509Certificate x509Certificate) {
        o.e(str, "host");
        o.e(x509Certificate, "certificate");
        if (Q2.d.i(str)) {
            return h(str, x509Certificate);
        }
        return g(str, x509Certificate);
    }

    public boolean verify(String str, SSLSession sSLSession) {
        o.e(str, "host");
        o.e(sSLSession, "session");
        if (!d(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return e(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
