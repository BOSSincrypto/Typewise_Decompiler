package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

abstract class L {
    L() {
    }

    static L b(K k4, Class cls, Method method) {
        I b4 = I.b(k4, cls, method);
        Type genericReturnType = method.getGenericReturnType();
        if (O.j(genericReturnType)) {
            throw O.n(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        } else if (genericReturnType != Void.TYPE) {
            return u.f(k4, method, b4);
        } else {
            throw O.n(method, "Service methods cannot return void.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract Object a(Object obj, Object[] objArr);
}
