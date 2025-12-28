package ch.icoaching.typewise.language_modelling.modelling.sentence_completion;

import D0.m0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.D;

public abstract class f {
    /* access modifiers changed from: private */
    public static final m0 b(g gVar) {
        String i4 = gVar.i();
        int e4 = gVar.e();
        Map h4 = gVar.h();
        LinkedHashMap linkedHashMap = new LinkedHashMap(D.e(h4.size()));
        for (Map.Entry entry : h4.entrySet()) {
            linkedHashMap.put(Float.valueOf(Float.parseFloat((String) entry.getKey())), entry.getValue());
        }
        return new m0(i4, e4, linkedHashMap, gVar.g(), gVar.c(), gVar.d(), gVar.f());
    }
}
