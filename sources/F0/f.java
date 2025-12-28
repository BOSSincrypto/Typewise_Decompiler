package f0;

import androidx.webkit.internal.WebViewFeatureInternal;

public abstract class f {
    public static boolean a(String str) {
        return WebViewFeatureInternal.isSupported(str);
    }
}
