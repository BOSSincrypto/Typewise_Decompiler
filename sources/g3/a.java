package g3;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

public abstract class a {

    /* renamed from: g3.a$a  reason: collision with other inner class name */
    private static class C0188a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private final Object f13613a;

        public C0188a(Object obj) {
            this.f13613a = obj;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                return a.d(method, this.f13613a.getClass().getClassLoader()).invoke(this.f13613a, objArr);
            } catch (InvocationTargetException e4) {
                throw e4.getTargetException();
            } catch (ReflectiveOperationException e5) {
                throw new RuntimeException("Reflection failed for method " + method, e5);
            }
        }
    }

    public static Object a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static boolean b(Collection collection, String str) {
        if (!collection.contains(str)) {
            if (e()) {
                if (collection.contains(str + ":dev")) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static InvocationHandler c(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0188a(obj);
    }

    public static Method d(Method method, ClassLoader classLoader) {
        return Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    private static boolean e() {
        String str = Build.TYPE;
        if ("eng".equals(str) || "userdebug".equals(str)) {
            return true;
        }
        return false;
    }
}
