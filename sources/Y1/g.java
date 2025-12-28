package Y1;

import com.ibm.icu.impl.e;
import java.io.IOException;
import java.io.InputStream;
import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.MissingResourceException;
import java.util.Properties;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private static final Properties f2001a;

    static class a implements PrivilegedAction {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f2002a;

        a(String str) {
            this.f2002a = str;
        }

        /* renamed from: a */
        public String run() {
            return System.getProperty(this.f2002a);
        }
    }

    static {
        InputStream e4;
        Properties properties = new Properties();
        f2001a = properties;
        try {
            e4 = e.e("/com/ibm/icu/ICUConfig.properties");
            if (e4 != null) {
                properties.load(e4);
                e4.close();
            }
        } catch (IOException | MissingResourceException unused) {
        } catch (Throwable th) {
            e4.close();
            throw th;
        }
    }

    public static String a(String str) {
        return b(str, (String) null);
    }

    public static String b(String str, String str2) {
        String str3;
        if (System.getSecurityManager() != null) {
            try {
                str3 = (String) AccessController.doPrivileged(new a(str));
            } catch (AccessControlException unused) {
                str3 = null;
            }
        } else {
            str3 = System.getProperty(str);
        }
        if (str3 == null) {
            return f2001a.getProperty(str, str2);
        }
        return str3;
    }
}
