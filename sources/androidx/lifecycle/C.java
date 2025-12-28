package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.C0713h;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;

public abstract class C {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final List f5981a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final List f5982b;

    static {
        Class<z> cls = z.class;
        f5981a = C0718m.m(Application.class, cls);
        f5982b = C0718m.e(cls);
    }

    public static final Constructor c(Class cls, List list) {
        o.e(cls, "modelClass");
        o.e(list, "signature");
        Constructor[] constructors = cls.getConstructors();
        o.d(constructors, "modelClass.constructors");
        int length = constructors.length;
        int i4 = 0;
        while (i4 < length) {
            Constructor constructor = constructors[i4];
            Class[] parameterTypes = constructor.getParameterTypes();
            o.d(parameterTypes, "constructor.parameterTypes");
            List a02 = C0713h.a0(parameterTypes);
            if (o.a(list, a02)) {
                o.c(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            } else if (list.size() != a02.size() || !a02.containsAll(list)) {
                i4++;
            } else {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final E d(Class cls, Constructor constructor, Object... objArr) {
        o.e(cls, "modelClass");
        o.e(constructor, "constructor");
        o.e(objArr, "params");
        try {
            return (E) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Failed to access " + cls, e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e6.getCause());
        }
    }
}
