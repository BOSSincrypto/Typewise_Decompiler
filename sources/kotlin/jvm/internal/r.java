package kotlin.jvm.internal;

import A2.c;
import A2.d;
import A2.e;
import A2.g;

public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    private static final s f13909a;

    /* renamed from: b  reason: collision with root package name */
    private static final c[] f13910b = new c[0];

    static {
        s sVar = null;
        try {
            sVar = (s) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (sVar == null) {
            sVar = new s();
        }
        f13909a = sVar;
    }

    public static e a(FunctionReference functionReference) {
        return f13909a.a(functionReference);
    }

    public static c b(Class cls) {
        return f13909a.b(cls);
    }

    public static d c(Class cls) {
        return f13909a.c(cls, "");
    }

    public static g d(PropertyReference0 propertyReference0) {
        return f13909a.d(propertyReference0);
    }

    public static String e(l lVar) {
        return f13909a.e(lVar);
    }

    public static String f(Lambda lambda) {
        return f13909a.f(lambda);
    }
}
