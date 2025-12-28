package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b  reason: case insensitive filesystem */
final class C0452b {

    /* renamed from: c  reason: collision with root package name */
    static C0452b f6050c = new C0452b();

    /* renamed from: a  reason: collision with root package name */
    private final Map f6051a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map f6052b = new HashMap();

    /* renamed from: androidx.lifecycle.b$a */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        final Map f6053a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        final Map f6054b;

        a(Map map) {
            this.f6054b = map;
            for (Map.Entry entry : map.entrySet()) {
                Lifecycle.Event event = (Lifecycle.Event) entry.getValue();
                List list = (List) this.f6053a.get(event);
                if (list == null) {
                    list = new ArrayList();
                    this.f6053a.put(event, list);
                }
                list.add((C0100b) entry.getKey());
            }
        }

        private static void b(List list, m mVar, Lifecycle.Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0100b) list.get(size)).a(mVar, event, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(m mVar, Lifecycle.Event event, Object obj) {
            b((List) this.f6053a.get(event), mVar, event, obj);
            b((List) this.f6053a.get(Lifecycle.Event.ON_ANY), mVar, event, obj);
        }
    }

    /* renamed from: androidx.lifecycle.b$b  reason: collision with other inner class name */
    static final class C0100b {

        /* renamed from: a  reason: collision with root package name */
        final int f6055a;

        /* renamed from: b  reason: collision with root package name */
        final Method f6056b;

        C0100b(int i4, Method method) {
            this.f6055a = i4;
            this.f6056b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        public void a(m mVar, Lifecycle.Event event, Object obj) {
            try {
                int i4 = this.f6055a;
                if (i4 == 0) {
                    this.f6056b.invoke(obj, (Object[]) null);
                } else if (i4 == 1) {
                    this.f6056b.invoke(obj, new Object[]{mVar});
                } else if (i4 == 2) {
                    this.f6056b.invoke(obj, new Object[]{mVar, event});
                }
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Failed to call observer method", e4.getCause());
            } catch (IllegalAccessException e5) {
                throw new RuntimeException(e5);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0100b)) {
                return false;
            }
            C0100b bVar = (C0100b) obj;
            if (this.f6055a != bVar.f6055a || !this.f6056b.getName().equals(bVar.f6056b.getName())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f6055a * 31) + this.f6056b.getName().hashCode();
        }
    }

    C0452b() {
    }

    private a a(Class cls, Method[] methodArr) {
        int i4;
        a c4;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c4 = c(superclass)) == null)) {
            hashMap.putAll(c4.f6054b);
        }
        for (Class c5 : cls.getInterfaces()) {
            for (Map.Entry entry : c(c5).f6054b.entrySet()) {
                e(hashMap, (C0100b) entry.getKey(), (Lifecycle.Event) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z3 = false;
        for (Method method : methodArr) {
            t tVar = (t) method.getAnnotation(t.class);
            if (tVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i4 = 0;
                } else if (m.class.isAssignableFrom(parameterTypes[0])) {
                    i4 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                Lifecycle.Event value = tVar.value();
                if (parameterTypes.length > 1) {
                    if (!Lifecycle.Event.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == Lifecycle.Event.ON_ANY) {
                        i4 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(hashMap, new C0100b(i4, method), value, cls);
                    z3 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f6051a.put(cls, aVar);
        this.f6052b.put(cls, Boolean.valueOf(z3));
        return aVar;
    }

    private Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e4) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
        }
    }

    private void e(Map map, C0100b bVar, Lifecycle.Event event, Class cls) {
        Lifecycle.Event event2 = (Lifecycle.Event) map.get(bVar);
        if (event2 != null && event != event2) {
            Method method = bVar.f6056b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
        } else if (event2 == null) {
            map.put(bVar, event);
        }
    }

    /* access modifiers changed from: package-private */
    public a c(Class cls) {
        a aVar = (a) this.f6051a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return a(cls, (Method[]) null);
    }

    /* access modifiers changed from: package-private */
    public boolean d(Class cls) {
        Boolean bool = (Boolean) this.f6052b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b4 = b(cls);
        for (Method annotation : b4) {
            if (((t) annotation.getAnnotation(t.class)) != null) {
                a(cls, b4);
                return true;
            }
        }
        this.f6052b.put(cls, Boolean.FALSE);
        return false;
    }
}
