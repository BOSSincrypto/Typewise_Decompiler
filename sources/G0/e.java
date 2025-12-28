package g0;

import android.net.Uri;
import android.webkit.WebView;
import f0.e;
import g3.a;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

public class e implements WebMessageListenerBoundaryInterface {

    /* renamed from: a  reason: collision with root package name */
    private e.a f13597a;

    public e(e.a aVar) {
        this.f13597a = aVar;
    }

    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER"};
    }

    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z3, InvocationHandler invocationHandler2) {
        this.f13597a.a(webView, d.b((WebMessageBoundaryInterface) a.a(WebMessageBoundaryInterface.class, invocationHandler)), uri, z3, c.b(invocationHandler2));
    }
}
