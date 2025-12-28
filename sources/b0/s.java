package B0;

import B0.o;
import ch.icoaching.typewise.autocorrection.resources.IDictionaryRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import r0.c;
import r0.e;

public final class s {

    /* renamed from: d  reason: collision with root package name */
    public static final a f169d = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f170a;

    /* renamed from: b  reason: collision with root package name */
    private final IDictionaryRepository f171b;

    /* renamed from: c  reason: collision with root package name */
    private final String f172c;

    public static final class a {
        private a() {
        }

        public final List a(List list) {
            o.e(list, "suggestions");
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                o oVar = (o) it.next();
                if (!linkedHashSet.contains(oVar.f())) {
                    arrayList.add(oVar);
                    linkedHashSet.add(oVar.f());
                }
            }
            return arrayList;
        }

        public final List b(List list, float f4) {
            o.e(list, "suggestions");
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                o oVar = (o) it.next();
                if (oVar.a() <= f4) {
                    arrayList.add(oVar);
                }
            }
            return arrayList;
        }

        public final boolean c(int i4, float f4) {
            if (((float) i4) > f4) {
                return true;
            }
            return false;
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public s(int i4, IDictionaryRepository iDictionaryRepository, String str) {
        o.e(iDictionaryRepository, "dictionaryRepository");
        o.e(str, "language");
        this.f170a = i4;
        this.f171b = iDictionaryRepository;
        this.f172c = str;
    }

    public final F a(F f4, c cVar, e eVar) {
        o.e(cVar, "singleWord");
        o.e(eVar, "previousWordData");
        if (f4 != null && !f4.c().isEmpty()) {
            return f4;
        }
        return new F(C0718m.e(o.a.a(o.f148f, cVar.b(), -1.0f, C0718m.e(this.f171b.j(cVar, eVar.d(), this.f172c)), cVar.d(), 0, 16, (Object) null)), eVar);
    }

    public final E0.o b(String str, Set set) {
        kotlin.jvm.internal.o.e(str, "suggestion");
        kotlin.jvm.internal.o.e(set, "consideredSuggestions");
        if (set.contains(str)) {
            return new E0.o(set, Boolean.TRUE);
        }
        set.add(str);
        return new E0.o(set, Boolean.FALSE);
    }

    public final E0.o c(c cVar, e eVar, List list) {
        boolean z3 = true;
        kotlin.jvm.internal.o.e(cVar, "singleWord");
        kotlin.jvm.internal.o.e(eVar, "previousWordData");
        kotlin.jvm.internal.o.e(list, "suggestions");
        List D02 = C0718m.D0(list);
        e j4 = this.f171b.j(cVar, eVar.d(), this.f172c);
        if (j4.b() == -2 && j4.c() == 0) {
            z3 = false;
        } else {
            D02.add(o.a.a(o.f148f, cVar.b(), 0.0f, C0718m.o(j4), cVar.d(), 0, 16, (Object) null));
        }
        return new E0.o(Boolean.valueOf(z3), D02);
    }

    public final boolean d(float f4, int i4, int i5, int i6, String str, String str2) {
        int i7;
        boolean z3;
        kotlin.jvm.internal.o.e(str, "phrase");
        kotlin.jvm.internal.o.e(str2, "suggestion");
        float f5 = (float) i4;
        if (((float) this.f170a) - f4 == f5) {
            i7 = Math.min(i5, i6) - this.f170a;
        } else {
            i7 = 0;
        }
        if (((float) this.f170a) - f4 == f5) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i8 = i5 - i7;
        int i9 = i6 - i7;
        if (!z3 || i7 <= 1 || kotlin.jvm.internal.o.a(E0.s.o(str, i8 + 1, (Integer) null, 2, (Object) null), E0.s.o(str2, i9 + 1, (Integer) null, 2, (Object) null))) {
            if (i7 <= 0 || E0.s.l(str, i8) == E0.s.l(str2, i9)) {
                return false;
            }
            if (E0.s.l(str, i8 - 1) == E0.s.l(str2, i9) && E0.s.l(str, i8) == E0.s.l(str2, i9 - 1)) {
                return false;
            }
        }
        return true;
    }

    public final boolean e(int i4, float f4) {
        if (((float) i4) - f4 > ((float) this.f171b.l(this.f172c))) {
            return true;
        }
        return false;
    }

    public final boolean f(int i4, float f4, String str, String str2, int i5, int i6, int i7, int i8, String str3, String str4) {
        kotlin.jvm.internal.o.e(str, "suggestion");
        kotlin.jvm.internal.o.e(str2, "candidate");
        if (kotlin.text.o.K(str, '\'', false, 2, (Object) null)) {
            f4 += 0.5f;
        }
        if (str3 != null && str4 != null && str.length() > 1 && str3.length() > 1 && str4.length() > 0 && E0.s.l(str, -2) == '\'' && E0.s.l(str3, -2) != '\'' && str4.charAt(0) == '\'') {
            i8++;
        }
        int i9 = i7 - i4;
        if (((float) Math.abs(i9)) > f4 || i7 < i6 || ((i7 == i6 && !kotlin.jvm.internal.o.a(str, str2)) || Math.abs(i9) > i8)) {
            return true;
        }
        int min = Math.min(i7, this.f170a);
        if (min <= i5 || ((float) (min - i6)) <= f4) {
            return false;
        }
        return true;
    }
}
