package a3;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class a extends c {

    /* renamed from: c  reason: collision with root package name */
    public static final C0047a f2316c = new C0047a((i) null);

    /* renamed from: b  reason: collision with root package name */
    private final e f2317b;

    /* renamed from: a3.a$a  reason: collision with other inner class name */
    public static final class C0047a {
        public /* synthetic */ C0047a(i iVar) {
            this();
        }

        private C0047a() {
        }
    }

    public a(e eVar) {
        o.e(eVar, "trustRootIndex");
        this.f2317b = eVar;
    }

    private final boolean b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!o.a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public List a(List list, String str) {
        o.e(list, "chain");
        o.e(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        o.d(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        int i4 = 0;
        boolean z3 = false;
        while (i4 < 9) {
            i4++;
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate a4 = this.f2317b.a(x509Certificate);
            if (a4 != null) {
                if (arrayList.size() > 1 || !o.a(x509Certificate, a4)) {
                    arrayList.add(a4);
                }
                if (b(a4, a4)) {
                    return arrayList;
                }
                z3 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                o.d(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next != null) {
                        X509Certificate x509Certificate2 = (X509Certificate) next;
                        if (b(x509Certificate, x509Certificate2)) {
                            it.remove();
                            arrayList.add(x509Certificate2);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                }
                if (z3) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException(o.k("Failed to find a trusted cert that signed ", x509Certificate));
            }
        }
        throw new SSLPeerUnverifiedException(o.k("Certificate chain too long: ", arrayList));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a) || !o.a(((a) obj).f2317b, this.f2317b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f2317b.hashCode();
    }
}
