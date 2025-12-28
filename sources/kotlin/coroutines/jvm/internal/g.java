package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.o;

final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f13879a = new g();

    /* renamed from: b  reason: collision with root package name */
    private static final a f13880b = new a((Method) null, (Method) null, (Method) null);

    /* renamed from: c  reason: collision with root package name */
    private static a f13881c;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Method f13882a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f13883b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f13884c;

        public a(Method method, Method method2, Method method3) {
            this.f13882a = method;
            this.f13883b = method2;
            this.f13884c = method3;
        }
    }

    private g() {
    }

    private final a a(BaseContinuationImpl baseContinuationImpl) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", (Class[]) null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", (Class[]) null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", (Class[]) null));
            f13881c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = f13880b;
            f13881c = aVar2;
            return aVar2;
        }
    }

    public final String b(BaseContinuationImpl baseContinuationImpl) {
        Object obj;
        Object obj2;
        Object obj3;
        o.e(baseContinuationImpl, "continuation");
        a aVar = f13881c;
        if (aVar == null) {
            aVar = a(baseContinuationImpl);
        }
        if (aVar == f13880b) {
            return null;
        }
        Method method = aVar.f13882a;
        if (method != null) {
            obj = method.invoke(baseContinuationImpl.getClass(), (Object[]) null);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        Method method2 = aVar.f13883b;
        if (method2 != null) {
            obj2 = method2.invoke(obj, (Object[]) null);
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        Method method3 = aVar.f13884c;
        if (method3 != null) {
            obj3 = method3.invoke(obj2, (Object[]) null);
        } else {
            obj3 = null;
        }
        if (obj3 instanceof String) {
            return (String) obj3;
        }
        return null;
    }
}
