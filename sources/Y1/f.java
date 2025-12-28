package Y1;

import java.security.AccessController;
import java.security.PrivilegedAction;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ClassLoader f2000a;

    static class a implements PrivilegedAction {
        a() {
        }

        /* renamed from: a */
        public b run() {
            return new b();
        }
    }

    private static class b extends ClassLoader {
        b() {
            super(Object.class.getClassLoader());
        }
    }

    private static ClassLoader a() {
        ClassLoader classLoader;
        if (f2000a == null) {
            synchronized (f.class) {
                try {
                    if (f2000a == null) {
                        if (System.getSecurityManager() != null) {
                            classLoader = (ClassLoader) AccessController.doPrivileged(new a());
                        } else {
                            classLoader = new b();
                        }
                        f2000a = classLoader;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f2000a;
    }

    public static ClassLoader b() {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null) {
            return contextClassLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        if (systemClassLoader == null) {
            return a();
        }
        return systemClassLoader;
    }

    public static ClassLoader c(Class cls) {
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader == null) {
            return b();
        }
        return classLoader;
    }
}
