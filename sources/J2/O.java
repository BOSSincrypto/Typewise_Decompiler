package J2;

import F2.b;
import H2.f;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class O extends Z {

    /* renamed from: c  reason: collision with root package name */
    private final f f648c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public O(b bVar, b bVar2) {
        super(bVar, bVar2, (i) null);
        o.e(bVar, "kSerializer");
        o.e(bVar2, "vSerializer");
        this.f648c = new N(bVar.a(), bVar2.a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public LinkedHashMap p(Map map) {
        LinkedHashMap linkedHashMap;
        o.e(map, "<this>");
        if (map instanceof LinkedHashMap) {
            linkedHashMap = (LinkedHashMap) map;
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return new LinkedHashMap(map);
        }
        return linkedHashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public Map q(LinkedHashMap linkedHashMap) {
        o.e(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    public f a() {
        return this.f648c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public LinkedHashMap f() {
        return new LinkedHashMap();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int g(LinkedHashMap linkedHashMap) {
        o.e(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void h(LinkedHashMap linkedHashMap, int i4) {
        o.e(linkedHashMap, "<this>");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Iterator i(Map map) {
        o.e(map, "<this>");
        return map.entrySet().iterator();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int j(Map map) {
        o.e(map, "<this>");
        return map.size();
    }
}
