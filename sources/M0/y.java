package m0;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.m;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import l2.q;

public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    private static final String f14635a;

    static {
        String i4 = m.i("WakeLocks");
        o.d(i4, "tagWithPrefix(\"WakeLocks\")");
        f14635a = i4;
    }

    public static final void a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        z zVar = z.f14636a;
        synchronized (zVar) {
            linkedHashMap.putAll(zVar.a());
            q qVar = q.f14567a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                m e4 = m.e();
                String str2 = f14635a;
                e4.k(str2, "WakeLock held for " + str);
            }
        }
    }

    public static final PowerManager.WakeLock b(Context context, String str) {
        o.e(context, "context");
        o.e(str, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        o.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, str2);
        z zVar = z.f14636a;
        synchronized (zVar) {
            String str3 = (String) zVar.a().put(newWakeLock, str2);
        }
        o.d(newWakeLock, "wakeLock");
        return newWakeLock;
    }
}
