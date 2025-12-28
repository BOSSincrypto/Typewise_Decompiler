package kotlinx.serialization.json.internal;

import H2.f;
import H2.m;
import H2.n;
import K2.C0341a;
import K2.F;
import K2.w;
import K2.x;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.jvm.internal.o;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.u;

public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    private static final u.a f14405a = new u.a();

    /* renamed from: b  reason: collision with root package name */
    private static final u.a f14406b = new u.a();

    private static final Map b(f fVar, C0341a aVar) {
        String str;
        String[] names;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean d4 = d(aVar, fVar);
        m(fVar, aVar);
        int d5 = fVar.d();
        for (int i4 = 0; i4 < d5; i4++) {
            ArrayList arrayList = new ArrayList();
            for (Object next : fVar.h(i4)) {
                if (next instanceof w) {
                    arrayList.add(next);
                }
            }
            w wVar = (w) C0718m.n0(arrayList);
            if (!(wVar == null || (names = wVar.names()) == null)) {
                for (String str2 : names) {
                    if (d4) {
                        str2 = str2.toLowerCase(Locale.ROOT);
                        o.d(str2, "toLowerCase(...)");
                    }
                    c(linkedHashMap, fVar, str2, i4);
                }
            }
            if (d4) {
                str = fVar.e(i4).toLowerCase(Locale.ROOT);
                o.d(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            if (str != null) {
                c(linkedHashMap, fVar, str, i4);
            }
        }
        if (linkedHashMap.isEmpty()) {
            return D.h();
        }
        return linkedHashMap;
    }

    private static final void c(Map map, f fVar, String str, int i4) {
        String str2;
        if (o.a(fVar.c(), m.b.f574a)) {
            str2 = "enum value";
        } else {
            str2 = "property";
        }
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i4));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for " + str2 + ' ' + fVar.e(i4) + " is already one of the names for " + str2 + ' ' + fVar.e(((Number) D.i(map, str)).intValue()) + " in " + fVar);
    }

    private static final boolean d(C0341a aVar, f fVar) {
        if (!aVar.d().h() || !o.a(fVar.c(), m.b.f574a)) {
            return false;
        }
        return true;
    }

    public static final Map e(C0341a aVar, f fVar) {
        o.e(aVar, "<this>");
        o.e(fVar, "descriptor");
        return (Map) F.a(aVar).b(fVar, f14405a, new y(fVar, aVar));
    }

    /* access modifiers changed from: private */
    public static final Map f(f fVar, C0341a aVar) {
        return b(fVar, aVar);
    }

    public static final u.a g() {
        return f14405a;
    }

    public static final String h(f fVar, C0341a aVar, int i4) {
        o.e(fVar, "<this>");
        o.e(aVar, "json");
        m(fVar, aVar);
        return fVar.e(i4);
    }

    public static final int i(f fVar, C0341a aVar, String str) {
        o.e(fVar, "<this>");
        o.e(aVar, "json");
        o.e(str, "name");
        if (d(aVar, fVar)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            o.d(lowerCase, "toLowerCase(...)");
            return l(fVar, aVar, lowerCase);
        }
        m(fVar, aVar);
        int a4 = fVar.a(str);
        if (a4 == -3 && aVar.d().o()) {
            return l(fVar, aVar, str);
        }
        return a4;
    }

    public static final int j(f fVar, C0341a aVar, String str, String str2) {
        o.e(fVar, "<this>");
        o.e(aVar, "json");
        o.e(str, "name");
        o.e(str2, "suffix");
        int i4 = i(fVar, aVar, str);
        if (i4 != -3) {
            return i4;
        }
        throw new SerializationException(fVar.b() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static /* synthetic */ int k(f fVar, C0341a aVar, String str, String str2, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            str2 = "";
        }
        return j(fVar, aVar, str, str2);
    }

    private static final int l(f fVar, C0341a aVar, String str) {
        Integer num = (Integer) e(aVar, fVar).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final x m(f fVar, C0341a aVar) {
        o.e(fVar, "<this>");
        o.e(aVar, "json");
        if (!o.a(fVar.c(), n.a.f575a)) {
            return null;
        }
        aVar.d().l();
        return null;
    }
}
