package ch.icoaching.wrio.keyboard;

import M0.a;
import ch.icoaching.wrio.C0511k;
import ch.icoaching.wrio.data.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C0718m;
import kotlin.collections.L;
import kotlin.jvm.internal.o;

public final class I implements v {

    /* renamed from: a  reason: collision with root package name */
    private final DiacriticsStore f9965a;

    /* renamed from: b  reason: collision with root package name */
    private final c f9966b;

    public I(DiacriticsStore diacriticsStore, c cVar) {
        o.e(diacriticsStore, "diacriticsStore");
        o.e(cVar, "languageSettings");
        this.f9965a = diacriticsStore;
        this.f9966b = cVar;
    }

    private final Collection c(char c4) {
        Map l4 = this.f9965a.l();
        String valueOf = String.valueOf(c4);
        o.c(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(Locale.ROOT);
        o.d(lowerCase, "toLowerCase(...)");
        Set<Character> set = (Set) l4.get(lowerCase);
        if (set == null) {
            return L.e();
        }
        if (!Character.isUpperCase(c4)) {
            return set;
        }
        ArrayList arrayList = new ArrayList(C0718m.t(set, 10));
        for (Character charValue : set) {
            arrayList.add(Character.valueOf(C0511k.a(charValue.charValue())));
        }
        return arrayList;
    }

    public Character[] a(char c4) {
        Object obj;
        Set set;
        boolean isUpperCase = Character.isUpperCase(c4);
        String valueOf = String.valueOf(c4);
        o.c(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(Locale.ROOT);
        o.d(lowerCase, "toLowerCase(...)");
        Iterator it = this.f9965a.c(this.f9966b.e()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (o.a(((a) obj).b(), lowerCase)) {
                break;
            }
        }
        a aVar = (a) obj;
        if (aVar == null) {
            set = L.e();
        } else if (isUpperCase) {
            set = kotlin.text.o.Y0(aVar.d());
        } else {
            set = kotlin.text.o.Y0(aVar.c());
        }
        Collection c5 = c(c4);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(set);
        linkedHashSet.addAll(c5);
        return (Character[]) linkedHashSet.toArray(new Character[0]);
    }

    public Character[] b(char c4) {
        Object obj;
        Set set;
        boolean isUpperCase = Character.isUpperCase(c4);
        String valueOf = String.valueOf(c4);
        o.c(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(Locale.ROOT);
        o.d(lowerCase, "toLowerCase(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry value : this.f9965a.m().entrySet()) {
            Iterator it = ((List) value.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (o.a(((a) obj).b(), lowerCase)) {
                    break;
                }
            }
            a aVar = (a) obj;
            if (aVar == null) {
                set = L.e();
            } else if (isUpperCase) {
                set = kotlin.text.o.Y0(aVar.d());
            } else {
                set = kotlin.text.o.Y0(aVar.c());
            }
            linkedHashSet.addAll(set);
        }
        linkedHashSet.addAll(c(c4));
        return (Character[]) linkedHashSet.toArray(new Character[0]);
    }
}
