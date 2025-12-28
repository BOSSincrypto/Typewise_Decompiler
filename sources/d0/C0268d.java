package D0;

import ch.icoaching.typewise.language_modelling.inference.beam_search.a;
import ch.icoaching.typewise.language_modelling.inference.beam_search.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;

/* renamed from: D0.d  reason: case insensitive filesystem */
public abstract class C0268d {
    public static final e a(e eVar, E e4, E e5, List list, E e6, E e7, E e8) {
        List list2 = list;
        E e9 = e6;
        E e10 = e7;
        o.e(eVar, "<this>");
        o.e(e4, "beamIndices");
        o.e(e5, "vocabIndices");
        o.e(list2, "newStates");
        o.e(e9, "candidateLLs");
        o.e(e10, "candidateScores");
        E r02 = C.r0(C0718m.m(J.g(e4), J.g(e5)), 1);
        E H3 = C.H(e9, r02, 0, 4, (Object) null);
        E H4 = C.H(e10, r02, 0, 4, (Object) null);
        ArrayList arrayList = new ArrayList(C0718m.t(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C.L((E) it.next(), e4, (Boolean) null, (Integer) null, 12, (Object) null));
        }
        E e11 = e4;
        E k02 = C.k0(eVar.a(), e11, (Boolean) null, (Integer) null, 12, (Object) null);
        E L3 = C.L(eVar.f(), e11, (Boolean) null, (Integer) null, 12, (Object) null);
        E c4 = D.c(e8, r02);
        E k03 = C.k0(eVar.d(), e11, (Boolean) null, (Integer) null, 12, (Object) null);
        E o4 = J.o(eVar.b(), C.z(((Number) H3.i().get(0)).intValue()));
        return new a(C.r0(C0718m.m(k02, J.g(e5)), 1), arrayList, C.b0(C0718m.m(L3, J.b(H3)), 1), H4, c4, k03, o4);
    }
}
