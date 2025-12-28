package a1;

import androidx.core.util.d;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p1.h;
import p1.k;
import p1.l;
import q1.C0864a;
import q1.C0866c;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private final h f2251a = new h(1000);

    /* renamed from: b  reason: collision with root package name */
    private final d f2252b = C0864a.d(10, new a());

    class a implements C0864a.d {
        a() {
        }

        /* renamed from: b */
        public b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    private static final class b implements C0864a.f {

        /* renamed from: a  reason: collision with root package name */
        final MessageDigest f2254a;

        /* renamed from: b  reason: collision with root package name */
        private final C0866c f2255b = C0866c.a();

        b(MessageDigest messageDigest) {
            this.f2254a = messageDigest;
        }

        public C0866c b() {
            return this.f2255b;
        }
    }

    private String a(X0.b bVar) {
        b bVar2 = (b) k.d(this.f2252b.b());
        try {
            bVar.b(bVar2.f2254a);
            return l.v(bVar2.f2254a.digest());
        } finally {
            this.f2252b.a(bVar2);
        }
    }

    public String b(X0.b bVar) {
        String str;
        synchronized (this.f2251a) {
            str = (String) this.f2251a.g(bVar);
        }
        if (str == null) {
            str = a(bVar);
        }
        synchronized (this.f2251a) {
            this.f2251a.k(bVar, str);
        }
        return str;
    }
}
