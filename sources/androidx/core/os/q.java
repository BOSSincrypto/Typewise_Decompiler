package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.Method;

public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    private static long f5022a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f5023b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f5024c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f5025d;

    /* renamed from: e  reason: collision with root package name */
    private static Method f5026e;

    static class a {
        static void a(String str) {
            Trace.beginSection(str);
        }

        static void b() {
            Trace.endSection();
        }
    }

    static {
        Class<String> cls = String.class;
        Class<Trace> cls2 = Trace.class;
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f5022a = cls2.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls3 = Long.TYPE;
                f5023b = cls2.getMethod("isTagEnabled", new Class[]{cls3});
                Class cls4 = Integer.TYPE;
                f5024c = cls2.getMethod("asyncTraceBegin", new Class[]{cls3, cls, cls4});
                f5025d = cls2.getMethod("asyncTraceEnd", new Class[]{cls3, cls, cls4});
                f5026e = cls2.getMethod("traceCounter", new Class[]{cls3, cls, cls4});
            } catch (Exception unused) {
            }
        }
    }

    public static void a(String str) {
        a.a(str);
    }

    public static void b() {
        a.b();
    }
}
