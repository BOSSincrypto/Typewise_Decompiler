package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.UninitializedPropertyAccessException;

public abstract class o {
    public static boolean a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public static void b(Object obj) {
        if (obj == null) {
            l();
        }
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            m(str);
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) i(new NullPointerException(str + " must not be null")));
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            n(str);
        }
    }

    public static int f(int i4, int i5) {
        if (i4 < i5) {
            return -1;
        }
        return i4 == i5 ? 0 : 1;
    }

    public static int g(long j4, long j5) {
        int i4 = (j4 > j5 ? 1 : (j4 == j5 ? 0 : -1));
        if (i4 < 0) {
            return -1;
        }
        return i4 == 0 ? 0 : 1;
    }

    private static String h(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = o.class.getName();
        int i4 = 0;
        while (!stackTrace[i4].getClassName().equals(name)) {
            i4++;
        }
        while (stackTrace[i4].getClassName().equals(name)) {
            i4++;
        }
        StackTraceElement stackTraceElement = stackTrace[i4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    private static Throwable i(Throwable th) {
        return j(th, o.class.getName());
    }

    static Throwable j(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i4 = -1;
        for (int i5 = 0; i5 < length; i5++) {
            if (str.equals(stackTrace[i5].getClassName())) {
                i4 = i5;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i4 + 1, length));
        return th;
    }

    public static String k(String str, Object obj) {
        return str + obj;
    }

    public static void l() {
        throw ((NullPointerException) i(new NullPointerException()));
    }

    public static void m(String str) {
        throw ((NullPointerException) i(new NullPointerException(str)));
    }

    private static void n(String str) {
        throw ((NullPointerException) i(new NullPointerException(h(str))));
    }

    public static void o(String str) {
        throw ((UninitializedPropertyAccessException) i(new UninitializedPropertyAccessException(str)));
    }

    public static void p(String str) {
        o("lateinit property " + str + " has not been initialized");
    }
}
