package f0;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.getcapacitor.Bridge;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final List f13573a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f13574a = false;

        /* renamed from: b  reason: collision with root package name */
        private String f13575b = "appassets.androidplatform.net";

        /* renamed from: c  reason: collision with root package name */
        private List f13576c = new ArrayList();

        public a a(String str, b bVar) {
            this.f13576c.add(new c(this.f13575b, str, this.f13574a, bVar));
            return this;
        }

        public d b() {
            return new d(this.f13576c);
        }

        public a c(String str) {
            this.f13575b = str;
            return this;
        }

        public a d(boolean z3) {
            this.f13574a = z3;
            return this;
        }
    }

    public interface b {
        WebResourceResponse a(String str);
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        final boolean f13577a;

        /* renamed from: b  reason: collision with root package name */
        final String f13578b;

        /* renamed from: c  reason: collision with root package name */
        final String f13579c;

        /* renamed from: d  reason: collision with root package name */
        final b f13580d;

        c(String str, String str2, boolean z3, b bVar) {
            if (str2.isEmpty() || str2.charAt(0) != '/') {
                throw new IllegalArgumentException("Path should start with a slash '/'.");
            } else if (str2.endsWith("/")) {
                this.f13578b = str;
                this.f13579c = str2;
                this.f13577a = z3;
                this.f13580d = bVar;
            } else {
                throw new IllegalArgumentException("Path should end with a slash '/'");
            }
        }

        public String a(String str) {
            return str.replaceFirst(this.f13579c, "");
        }

        public b b(Uri uri) {
            if (uri.getScheme().equals(Bridge.CAPACITOR_HTTP_SCHEME) && !this.f13577a) {
                return null;
            }
            if ((uri.getScheme().equals(Bridge.CAPACITOR_HTTP_SCHEME) || uri.getScheme().equals(Bridge.CAPACITOR_HTTPS_SCHEME)) && uri.getAuthority().equals(this.f13578b) && uri.getPath().startsWith(this.f13579c)) {
                return this.f13580d;
            }
            return null;
        }
    }

    d(List list) {
        this.f13573a = list;
    }

    public WebResourceResponse a(Uri uri) {
        WebResourceResponse a4;
        for (c cVar : this.f13573a) {
            b b4 = cVar.b(uri);
            if (b4 != null && (a4 = b4.a(cVar.a(uri.getPath()))) != null) {
                return a4;
            }
        }
        return null;
    }
}
