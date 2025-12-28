package c1;

import X0.d;
import android.net.Uri;
import c1.n;
import com.getcapacitor.Bridge;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class y implements n {

    /* renamed from: b  reason: collision with root package name */
    private static final Set f7621b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{Bridge.CAPACITOR_HTTP_SCHEME, Bridge.CAPACITOR_HTTPS_SCHEME})));

    /* renamed from: a  reason: collision with root package name */
    private final n f7622a;

    public static class a implements o {
        public n c(r rVar) {
            return new y(rVar.d(h.class, InputStream.class));
        }
    }

    public y(n nVar) {
        this.f7622a = nVar;
    }

    /* renamed from: c */
    public n.a a(Uri uri, int i4, int i5, d dVar) {
        return this.f7622a.a(new h(uri.toString()), i4, i5, dVar);
    }

    /* renamed from: d */
    public boolean b(Uri uri) {
        return f7621b.contains(uri.getScheme());
    }
}
