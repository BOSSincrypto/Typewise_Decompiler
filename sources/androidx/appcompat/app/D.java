package androidx.appcompat.app;

import androidx.core.os.g;
import java.util.LinkedHashSet;
import java.util.Locale;

abstract class D {
    private static g a(g gVar, g gVar2) {
        Locale locale;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i4 = 0; i4 < gVar.g() + gVar2.g(); i4++) {
            if (i4 < gVar.g()) {
                locale = gVar.d(i4);
            } else {
                locale = gVar2.d(i4 - gVar.g());
            }
            if (locale != null) {
                linkedHashSet.add(locale);
            }
        }
        return g.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static g b(g gVar, g gVar2) {
        if (gVar == null || gVar.f()) {
            return g.e();
        }
        return a(gVar, gVar2);
    }
}
