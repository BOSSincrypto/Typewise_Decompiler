package v0;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import s0.C0893c;

/* renamed from: v0.b  reason: case insensitive filesystem */
public abstract class C0921b {
    public static final Map a(Map map, Map map2) {
        if (map == null && map2 == null) {
            return null;
        }
        if (map == null) {
            return map2;
        }
        if (map2 == null) {
            return map;
        }
        Map s4 = D.s(map2);
        LinkedHashMap linkedHashMap = new LinkedHashMap(D.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = (String) entry.getKey();
            C0920a b4 = b((C0920a) entry.getValue(), (C0920a) s4.get(str));
            s4.remove(str);
            linkedHashMap.put(key, b4);
        }
        Map s5 = D.s(linkedHashMap);
        s5.putAll(s4);
        return s5;
    }

    private static final C0920a b(C0920a aVar, C0920a aVar2) {
        if (aVar2 == null) {
            return aVar;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Regex regex : aVar.a()) {
            if (!linkedHashSet.contains(regex.getPattern())) {
                linkedHashSet.add(regex.getPattern());
                linkedHashSet2.add(regex);
            }
        }
        for (Regex regex2 : aVar2.a()) {
            if (!linkedHashSet.contains(regex2.getPattern())) {
                linkedHashSet.add(regex2.getPattern());
                linkedHashSet2.add(regex2);
            }
        }
        return new C0920a(C0718m.E0(C0718m.G0(aVar.b(), aVar2.b())), linkedHashSet2);
    }

    public static final Map c(Map map) {
        o.e(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(D.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), d((C0893c.d) entry.getValue()));
        }
        return linkedHashMap;
    }

    public static final C0920a d(C0893c.d dVar) {
        Set set;
        o.e(dVar, "<this>");
        List d4 = dVar.d();
        if (d4 == null || (set = C0718m.E0(d4)) == null) {
            set = new LinkedHashSet();
        }
        List<String> c4 = dVar.c();
        if (c4 == null) {
            c4 = C0718m.j();
        }
        ArrayList arrayList = new ArrayList(C0718m.t(c4, 10));
        for (String regex : c4) {
            arrayList.add(new Regex(regex));
        }
        return new C0920a(set, C0718m.E0(arrayList));
    }
}
