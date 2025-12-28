package g0;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

public abstract class h {

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        static final j f13599a = h.a();
    }

    static j a() {
        try {
            return new k((WebViewProviderFactoryBoundaryInterface) g3.a.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(e5);
        } catch (ClassNotFoundException unused) {
            return new C0655b();
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException(e6);
        }
    }

    private static InvocationHandler b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, d()).getDeclaredMethod("createWebViewProviderFactory", (Class[]) null).invoke((Object) null, (Object[]) null);
    }

    public static j c() {
        return a.f13599a;
    }

    public static ClassLoader d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return WebView.getWebViewClassLoader();
        }
        return e().getClass().getClassLoader();
    }

    private static Object e() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", (Class[]) null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke((Object) null, (Object[]) null);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(e5);
        } catch (IllegalAccessException e6) {
            throw new RuntimeException(e6);
        }
    }
}
