package p2;

import java.lang.reflect.Method;
import kotlin.collections.C0713h;
import kotlin.jvm.internal.o;
import kotlin.random.Random;
import x2.C0937b;

/* renamed from: p2.a  reason: case insensitive filesystem */
public abstract class C0852a {

    /* renamed from: p2.a$a  reason: collision with other inner class name */
    private static final class C0223a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0223a f15884a = new C0223a();

        /* renamed from: b  reason: collision with root package name */
        public static final Method f15885b;

        /* renamed from: c  reason: collision with root package name */
        public static final Method f15886c;

        static {
            Method method;
            Method method2;
            Class<Throwable> cls = Throwable.class;
            Method[] methods = cls.getMethods();
            o.b(methods);
            int length = methods.length;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                method = null;
                if (i5 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i5];
                if (o.a(method2.getName(), "addSuppressed")) {
                    Class[] parameterTypes = method2.getParameterTypes();
                    o.d(parameterTypes, "getParameterTypes(...)");
                    if (o.a(C0713h.W(parameterTypes), cls)) {
                        break;
                    }
                }
                i5++;
            }
            f15885b = method2;
            int length2 = methods.length;
            while (true) {
                if (i4 >= length2) {
                    break;
                }
                Method method3 = methods[i4];
                if (o.a(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i4++;
            }
            f15886c = method;
        }

        private C0223a() {
        }
    }

    public void a(Throwable th, Throwable th2) {
        o.e(th, "cause");
        o.e(th2, "exception");
        Method method = C0223a.f15885b;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }

    public Random b() {
        return new C0937b();
    }
}
