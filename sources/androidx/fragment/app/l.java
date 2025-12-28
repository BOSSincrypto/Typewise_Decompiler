package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import y.g;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    private static final g f5827a = new g();

    static boolean b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class c(ClassLoader classLoader, String str) {
        g gVar = f5827a;
        g gVar2 = (g) gVar.get(classLoader);
        if (gVar2 == null) {
            gVar2 = new g();
            gVar.put(classLoader, gVar2);
        }
        Class cls = (Class) gVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        gVar2.put(str, cls2);
        return cls2;
    }

    public static Class d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassNotFoundException e4) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists", e4);
        } catch (ClassCastException e5) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e5);
        }
    }

    public abstract Fragment a(ClassLoader classLoader, String str);
}
