package g0;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* renamed from: g0.b  reason: case insensitive filesystem */
public class C0655b implements j {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f13594a = new String[0];

    public String[] a() {
        return f13594a;
    }

    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}
