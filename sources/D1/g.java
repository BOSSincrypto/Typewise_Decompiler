package d1;

import X0.d;
import c1.h;
import c1.n;
import c1.o;
import c1.r;
import java.io.InputStream;
import java.net.URL;

public class g implements n {

    /* renamed from: a  reason: collision with root package name */
    private final n f13556a;

    public static class a implements o {
        public n c(r rVar) {
            return new g(rVar.d(h.class, InputStream.class));
        }
    }

    public g(n nVar) {
        this.f13556a = nVar;
    }

    /* renamed from: c */
    public n.a a(URL url, int i4, int i5, d dVar) {
        return this.f13556a.a(new h(url), i4, i5, dVar);
    }

    /* renamed from: d */
    public boolean b(URL url) {
        return true;
    }
}
