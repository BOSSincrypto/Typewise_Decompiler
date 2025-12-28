package kotlin.jvm.internal;

import java.util.List;
import l2.C0795e;
import u2.C0906a;
import u2.l;
import u2.p;
import u2.q;
import u2.r;
import v2.C0925a;
import v2.C0926b;
import v2.c;

public abstract class v {
    public static Iterable a(Object obj) {
        if ((obj instanceof C0925a) && !(obj instanceof C0926b)) {
            j(obj, "kotlin.collections.MutableIterable");
        }
        return d(obj);
    }

    public static List b(Object obj) {
        if ((obj instanceof C0925a) && !(obj instanceof c)) {
            j(obj, "kotlin.collections.MutableList");
        }
        return e(obj);
    }

    public static Object c(Object obj, int i4) {
        if (obj != null && !g(obj, i4)) {
            j(obj, "kotlin.jvm.functions.Function" + i4);
        }
        return obj;
    }

    public static Iterable d(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e4) {
            throw i(e4);
        }
    }

    public static List e(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e4) {
            throw i(e4);
        }
    }

    public static int f(Object obj) {
        if (obj instanceof l) {
            return ((l) obj).getArity();
        }
        if (obj instanceof C0906a) {
            return 0;
        }
        if (obj instanceof l) {
            return 1;
        }
        if (obj instanceof p) {
            return 2;
        }
        if (obj instanceof q) {
            return 3;
        }
        if (obj instanceof r) {
            return 4;
        }
        return -1;
    }

    public static boolean g(Object obj, int i4) {
        if (!(obj instanceof C0795e) || f(obj) != i4) {
            return false;
        }
        return true;
    }

    private static Throwable h(Throwable th) {
        return o.j(th, v.class.getName());
    }

    public static ClassCastException i(ClassCastException classCastException) {
        throw ((ClassCastException) h(classCastException));
    }

    public static void j(Object obj, String str) {
        String str2;
        if (obj == null) {
            str2 = "null";
        } else {
            str2 = obj.getClass().getName();
        }
        k(str2 + " cannot be cast to " + str);
    }

    public static void k(String str) {
        throw i(new ClassCastException(str));
    }
}
