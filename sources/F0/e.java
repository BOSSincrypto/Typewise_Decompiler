package f0;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.internal.WebViewFeatureInternal;
import g0.h;
import g0.i;
import g0.j;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Uri f13581a = Uri.parse("*");

    /* renamed from: b  reason: collision with root package name */
    private static final Uri f13582b = Uri.parse("");

    public interface a {
        void a(WebView webView, b bVar, Uri uri, boolean z3, C0647a aVar);
    }

    public static void a(WebView webView, String str, Set set, a aVar) {
        if (WebViewFeatureInternal.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            d(webView).a(str, (String[]) set.toArray(new String[0]), aVar);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    private static WebViewProviderBoundaryInterface b(WebView webView) {
        return c().createWebView(webView);
    }

    private static j c() {
        return h.c();
    }

    private static i d(WebView webView) {
        return new i(b(webView));
    }
}
