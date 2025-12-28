package retrofit2;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    private final Class f16233a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f16234b;

    /* renamed from: c  reason: collision with root package name */
    private final Method f16235c;

    /* renamed from: d  reason: collision with root package name */
    private final List f16236d;

    v(Class cls, Object obj, Method method, List list) {
        this.f16233a = cls;
        this.f16234b = obj;
        this.f16235c = method;
        this.f16236d = Collections.unmodifiableList(list);
    }

    public Method a() {
        return this.f16235c;
    }

    public Class b() {
        return this.f16233a;
    }

    public String toString() {
        return String.format("%s.%s() %s", new Object[]{this.f16233a.getName(), this.f16235c.getName(), this.f16236d});
    }
}
