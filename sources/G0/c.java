package g0;

import androidx.webkit.internal.WebViewFeatureInternal;
import f0.C0647a;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

public class c extends C0647a {

    /* renamed from: a  reason: collision with root package name */
    private JsReplyProxyBoundaryInterface f13595a;

    class a implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JsReplyProxyBoundaryInterface f13596a;

        a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
            this.f13596a = jsReplyProxyBoundaryInterface;
        }

        public Object call() {
            return new c(this.f13596a);
        }
    }

    public c(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f13595a = jsReplyProxyBoundaryInterface;
    }

    public static c b(InvocationHandler invocationHandler) {
        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) g3.a.a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (c) jsReplyProxyBoundaryInterface.getOrCreatePeer(new a(jsReplyProxyBoundaryInterface));
    }

    public void a(String str) {
        if (WebViewFeatureInternal.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            this.f13595a.postMessage(str);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
