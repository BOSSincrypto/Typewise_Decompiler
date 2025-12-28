package retrofit2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

abstract class t {

    /* renamed from: a  reason: collision with root package name */
    private static Constructor f16224a;

    static Object a(Method method, Class cls, Object obj, Object[] objArr) {
        Constructor constructor = f16224a;
        if (constructor == null) {
            constructor = C0888o.a().getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            constructor.setAccessible(true);
            f16224a = constructor;
        }
        return p.a(constructor.newInstance(new Object[]{cls, -1})).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
