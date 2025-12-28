package g0;

import f0.e;
import g3.a;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

public class i {

    /* renamed from: a  reason: collision with root package name */
    WebViewProviderBoundaryInterface f13600a;

    public i(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f13600a = webViewProviderBoundaryInterface;
    }

    public void a(String str, String[] strArr, e.a aVar) {
        this.f13600a.addWebMessageListener(str, strArr, a.c(new e(aVar)));
    }
}
