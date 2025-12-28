package g0;

import android.webkit.WebView;
import g3.a;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

public class k implements j {

    /* renamed from: a  reason: collision with root package name */
    WebViewProviderFactoryBoundaryInterface f13601a;

    public k(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f13601a = webViewProviderFactoryBoundaryInterface;
    }

    public String[] a() {
        return this.f13601a.getSupportedFeatures();
    }

    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) a.a(WebViewProviderBoundaryInterface.class, this.f13601a.createWebView(webView));
    }
}
