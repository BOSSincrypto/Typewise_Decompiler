package androidx.work.impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import l0.m;
import l0.v;
import l0.y;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final Object f7401a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Map f7402b = new LinkedHashMap();

    public final boolean a(m mVar) {
        boolean containsKey;
        o.e(mVar, "id");
        synchronized (this.f7401a) {
            containsKey = this.f7402b.containsKey(mVar);
        }
        return containsKey;
    }

    public final v b(m mVar) {
        v vVar;
        o.e(mVar, "id");
        synchronized (this.f7401a) {
            vVar = (v) this.f7402b.remove(mVar);
        }
        return vVar;
    }

    public final List c(String str) {
        List B02;
        o.e(str, "workSpecId");
        synchronized (this.f7401a) {
            try {
                Map map = this.f7402b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (o.a(((m) entry.getKey()).b(), str)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (m remove : linkedHashMap.keySet()) {
                    this.f7402b.remove(remove);
                }
                B02 = C0718m.B0(linkedHashMap.values());
            } finally {
            }
        }
        return B02;
    }

    public final v d(m mVar) {
        v vVar;
        o.e(mVar, "id");
        synchronized (this.f7401a) {
            try {
                Map map = this.f7402b;
                Object obj = map.get(mVar);
                if (obj == null) {
                    obj = new v(mVar);
                    map.put(mVar, obj);
                }
                vVar = (v) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }

    public final v e(v vVar) {
        o.e(vVar, "spec");
        return d(y.a(vVar));
    }
}
