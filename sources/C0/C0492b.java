package c0;

import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: c0.b  reason: case insensitive filesystem */
public abstract class C0492b {

    /* renamed from: a  reason: collision with root package name */
    private static long f7515a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f7516b;

    public static void a(String str) {
        C0493c.a(str);
    }

    public static void b() {
        C0493c.b();
    }

    private static void c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to call ");
        sb.append(str);
        sb.append(" via reflection");
    }

    public static boolean d() {
        try {
            if (f7516b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return e();
    }

    private static boolean e() {
        Class<Trace> cls = Trace.class;
        try {
            if (f7516b == null) {
                f7515a = cls.getField("TRACE_TAG_APP").getLong((Object) null);
                f7516b = cls.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f7516b.invoke((Object) null, new Object[]{Long.valueOf(f7515a)})).booleanValue();
        } catch (Exception e4) {
            c("isTagEnabled", e4);
            return false;
        }
    }
}
