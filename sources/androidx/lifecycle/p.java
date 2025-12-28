package androidx.lifecycle;

import androidx.appcompat.app.F;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final p f6071a = new p();

    /* renamed from: b  reason: collision with root package name */
    private static final Map f6072b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final Map f6073c = new HashMap();

    private p() {
    }

    private final C0456f a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(new Object[]{obj});
            o.d(newInstance, "{\n            constructo…tance(`object`)\n        }");
            F.a(newInstance);
            return null;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    private final Constructor b(Class cls) {
        String str;
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            if (packageR != null) {
                str = packageR.getName();
            } else {
                str = "";
            }
            o.d(str, "fullPackage");
            if (str.length() != 0) {
                o.d(canonicalName, "name");
                canonicalName = canonicalName.substring(str.length() + 1);
                o.d(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            o.d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c4 = c(canonicalName);
            if (str.length() != 0) {
                c4 = str + '.' + c4;
            }
            Class<?> cls2 = Class.forName(c4);
            o.c(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(new Class[]{cls});
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static final String c(String str) {
        o.e(str, "className");
        return kotlin.text.o.C(str, ".", "_", false, 4, (Object) null) + "_LifecycleAdapter";
    }

    private final int d(Class cls) {
        Map map = f6072b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g4 = g(cls);
        map.put(cls, Integer.valueOf(g4));
        return g4;
    }

    private final boolean e(Class cls) {
        if (cls == null || !C0462l.class.isAssignableFrom(cls)) {
            return false;
        }
        return true;
    }

    public static final C0461k f(Object obj) {
        o.e(obj, "object");
        boolean z3 = obj instanceof C0461k;
        boolean z4 = obj instanceof C0454d;
        if (z3 && z4) {
            return new DefaultLifecycleObserverAdapter((C0454d) obj, (C0461k) obj);
        }
        if (z4) {
            return new DefaultLifecycleObserverAdapter((C0454d) obj, (C0461k) null);
        }
        if (z3) {
            return (C0461k) obj;
        }
        Class<?> cls = obj.getClass();
        p pVar = f6071a;
        if (pVar.d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        Object obj2 = f6073c.get(cls);
        o.b(obj2);
        List list = (List) obj2;
        if (list.size() == 1) {
            pVar.a((Constructor) list.get(0), obj);
            return new SingleGeneratedAdapterObserver((C0456f) null);
        }
        int size = list.size();
        C0456f[] fVarArr = new C0456f[size];
        for (int i4 = 0; i4 < size; i4++) {
            f6071a.a((Constructor) list.get(i4), obj);
            fVarArr[i4] = null;
        }
        return new CompositeGeneratedAdaptersObserver(fVarArr);
    }

    private final int g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor b4 = b(cls);
        if (b4 != null) {
            f6073c.put(cls, C0718m.e(b4));
            return 2;
        } else if (C0452b.f6050c.d(cls)) {
            return 1;
        } else {
            Class superclass = cls.getSuperclass();
            if (e(superclass)) {
                o.d(superclass, "superclass");
                if (d(superclass) == 1) {
                    return 1;
                }
                Object obj = f6073c.get(superclass);
                o.b(obj);
                arrayList = new ArrayList((Collection) obj);
            } else {
                arrayList = null;
            }
            Class[] interfaces = cls.getInterfaces();
            o.d(interfaces, "klass.interfaces");
            for (Class cls2 : interfaces) {
                if (e(cls2)) {
                    o.d(cls2, "intrface");
                    if (d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    Object obj2 = f6073c.get(cls2);
                    o.b(obj2);
                    arrayList.addAll((Collection) obj2);
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f6073c.put(cls, arrayList);
            return 2;
        }
    }
}
