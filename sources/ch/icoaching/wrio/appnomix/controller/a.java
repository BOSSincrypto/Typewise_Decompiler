package ch.icoaching.wrio.appnomix.controller;

import L0.b;
import ch.icoaching.wrio.appnomix.data.network.d;
import ch.icoaching.wrio.appnomix.data.network.model.AnalyticsEventType;
import ch.icoaching.wrio.appnomix.data.network.model.AppnomixAnalyticsEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;
import l2.q;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final d f9228a;

    public a(d dVar) {
        o.e(dVar, "analyticsApiService");
        this.f9228a = dVar;
    }

    private final Map a(String str, String str2, String str3, boolean z3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("campaign_id", I0.a.f579a.a());
        linkedHashMap.put("user_id", str);
        linkedHashMap.put("session_id", str2);
        linkedHashMap.put("os", "android");
        linkedHashMap.put("free_experiment", "false");
        linkedHashMap.put("is_browser_field", String.valueOf(z3));
        linkedHashMap.put("package_name", str3);
        linkedHashMap.put("license", str4);
        return linkedHashMap;
    }

    public final Object b(String str, String str2, String str3, boolean z3, String str4, c cVar) {
        String uuid = UUID.randomUUID().toString();
        o.d(uuid, "toString(...)");
        Object a4 = this.f9228a.a(new AppnomixAnalyticsEvent(uuid, AnalyticsEventType.KEYBOARD_OPEN, b.a(System.currentTimeMillis()), "typewise", a(str, str2, str3, z3, str4)), cVar);
        if (a4 == kotlin.coroutines.intrinsics.a.f()) {
            return a4;
        }
        return q.f14567a;
    }
}
