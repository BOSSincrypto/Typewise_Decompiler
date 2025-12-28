package x0;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

/* renamed from: x0.a  reason: case insensitive filesystem */
public final class C0934a {

    /* renamed from: c  reason: collision with root package name */
    public static final C0249a f16394c = new C0249a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private Map f16395a;

    /* renamed from: b  reason: collision with root package name */
    private Map f16396b;

    /* renamed from: x0.a$a  reason: collision with other inner class name */
    public static final class C0249a {
        private C0249a() {
        }

        public final String a(String str) {
            o.e(str, "language");
            if (o.a(str, "fr-ca") || o.a(str, "fr-ch")) {
                return "fr";
            }
            return str;
        }

        public /* synthetic */ C0249a(i iVar) {
            this();
        }
    }

    public C0934a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("nl-be", "nl");
        linkedHashMap.put("fr-ca", "fr");
        linkedHashMap.put("fr-ch", "fr");
        linkedHashMap.put("pl-qwertz", "pl");
        this.f16395a = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("nl-be", "nl");
        linkedHashMap2.put("pl-qwertz", "pl");
        this.f16396b = linkedHashMap2;
    }

    public final List a(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            String str = (String) list.get(i4);
            if (this.f16395a.containsKey(str)) {
                Object obj = this.f16395a.get(str);
                o.b(obj);
                str = (String) obj;
            }
            arrayList.add(str);
        }
        return arrayList;
    }
}
