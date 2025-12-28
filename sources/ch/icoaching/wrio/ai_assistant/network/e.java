package ch.icoaching.wrio.ai_assistant.network;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import okhttp3.A;
import okhttp3.u;
import okhttp3.y;

public final class e implements u {

    /* renamed from: a  reason: collision with root package name */
    public static final e f9186a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map f9187b = new LinkedHashMap();

    static {
        e eVar = new e();
        f9186a = eVar;
        eVar.b();
    }

    private e() {
    }

    public A a(u.a aVar) {
        o.e(aVar, "chain");
        y.a h4 = aVar.a().h();
        for (Map.Entry entry : f9187b.entrySet()) {
            h4.a((String) entry.getKey(), (String) entry.getValue());
        }
        return aVar.b(h4.b());
    }

    public final void b() {
        Map map = f9187b;
        map.put("TW-User-ID", "");
        map.put("TW-Session-ID", "");
        map.put("TW-OS", "android");
        map.put("TW-App-Name", "");
        map.put("TW-Package-Name", "");
        map.put("TW-Only-Free-Experiment", "");
        map.put("TW-Is-Browser", "");
        map.put("X-Api-Key", "gmKJEyStgG2o6A8iTc9s47O146M7zlyy78uuhk8O");
    }

    public final void c(String str) {
        o.e(str, "appName");
        f9187b.put("TW-App-Name", str);
    }

    public final void d(boolean z3) {
        f9187b.put("TW-Is-Browser", String.valueOf(z3));
    }

    public final void e(String str) {
        o.e(str, "packageName");
        f9187b.put("TW-Package-Name", str);
    }

    public final void f(boolean z3) {
        f9187b.put("TW-Only-Free-Experiment", String.valueOf(z3));
    }

    public final void g(String str) {
        o.e(str, "sessionID");
        f9187b.put("TW-Session-ID", str);
    }

    public final void h(String str) {
        o.e(str, "userID");
        f9187b.put("TW-User-ID", str);
    }
}
