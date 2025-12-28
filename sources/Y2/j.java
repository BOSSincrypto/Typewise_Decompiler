package Y2;

import java.lang.reflect.Method;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class j {

    /* renamed from: d  reason: collision with root package name */
    public static final a f2116d = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final Method f2117a;

    /* renamed from: b  reason: collision with root package name */
    private final Method f2118b;

    /* renamed from: c  reason: collision with root package name */
    private final Method f2119c;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final j a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", (Class[]) null);
                method = cls.getMethod("open", new Class[]{String.class});
                method2 = cls.getMethod("warnIfOpen", (Class[]) null);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new j(method3, method, method2);
        }

        private a() {
        }
    }

    public j(Method method, Method method2, Method method3) {
        this.f2117a = method;
        this.f2118b = method2;
        this.f2119c = method3;
    }

    public final Object a(String str) {
        o.e(str, "closer");
        Method method = this.f2117a;
        if (method != null) {
            try {
                Object invoke = method.invoke((Object) null, (Object[]) null);
                Method method2 = this.f2118b;
                o.b(method2);
                method2.invoke(invoke, new Object[]{str});
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean b(Object obj) {
        if (obj != null) {
            try {
                Method method = this.f2119c;
                o.b(method);
                method.invoke(obj, (Object[]) null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
