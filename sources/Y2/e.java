package Y2;

import W2.c;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.D;
import kotlin.jvm.internal.o;
import okhttp3.x;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f2102a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final CopyOnWriteArraySet f2103b = new CopyOnWriteArraySet();

    /* renamed from: c  reason: collision with root package name */
    private static final Map f2104c;

    static {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<x> cls = x.class;
        Package packageR = cls.getPackage();
        if (packageR == null) {
            str = null;
        } else {
            str = packageR.getName();
        }
        if (str != null) {
            linkedHashMap.put(str, "OkHttp");
        }
        String name = cls.getName();
        o.d(name, "OkHttpClient::class.java.name");
        linkedHashMap.put(name, "okhttp.OkHttpClient");
        String name2 = c.class.getName();
        o.d(name2, "Http2::class.java.name");
        linkedHashMap.put(name2, "okhttp.Http2");
        String name3 = T2.e.class.getName();
        o.d(name3, "TaskRunner::class.java.name");
        linkedHashMap.put(name3, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f2104c = D.q(linkedHashMap);
    }

    private e() {
    }

    private final void c(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (f2103b.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else if (Log.isLoggable(str2, 4)) {
                level = Level.INFO;
            } else {
                level = Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(f.f2105a);
        }
    }

    private final String d(String str) {
        String str2 = (String) f2104c.get(str);
        if (str2 == null) {
            return kotlin.text.o.W0(str, 23);
        }
        return str2;
    }

    public final void a(String str, int i4, String str2, Throwable th) {
        int min;
        o.e(str, "loggerName");
        o.e(str2, "message");
        String d4 = d(str);
        if (Log.isLoggable(d4, i4)) {
            if (th != null) {
                str2 = str2 + 10 + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i5 = 0;
            while (i5 < length) {
                int U3 = kotlin.text.o.U(str2, 10, i5, false, 4, (Object) null);
                if (U3 == -1) {
                    U3 = length;
                }
                while (true) {
                    min = Math.min(U3, i5 + 4000);
                    String substring = str2.substring(i5, min);
                    o.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i4, d4, substring);
                    if (min >= U3) {
                        break;
                    }
                    i5 = min;
                }
                i5 = min + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry entry : f2104c.entrySet()) {
            c((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
