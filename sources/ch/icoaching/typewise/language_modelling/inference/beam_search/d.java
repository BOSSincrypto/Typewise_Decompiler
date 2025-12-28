package ch.icoaching.typewise.language_modelling.inference.beam_search;

import D0.h0;
import ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import n2.C0830a;
import y0.C0945b;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8474a = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final List f8475b = C0718m.m("beamscore", "beamscrmultbynchars");

    public static final class a {
        private a() {
        }

        public final d a(h0.c cVar) {
            o.e(cVar, "inferenceConfig");
            String j4 = cVar.j();
            String b4 = b(d.f8475b, j4);
            if (o.a(b4, "beamscore")) {
                return new b();
            }
            if (o.a(b4, "beamscrmultbynchars")) {
                return new c(C0945b.b(j4, 0.0f, 2, (Object) null));
            }
            throw new IllegalArgumentException("Unrecognized final scoring strategy '" + b4 + "'.");
        }

        public final String b(List list, String str) {
            o.e(list, "allStrategies");
            o.e(str, "strDeclaration");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (kotlin.text.o.L(str, str2, false, 2, (Object) null)) {
                    return str2;
                }
            }
            return "beamscore";
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public static final class b implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C0830a.a(((BeamSearcher.b) obj2).d(), ((BeamSearcher.b) obj).d());
        }
    }

    public final List b(List list, Float f4) {
        o.e(list, "completedBeams");
        return C0718m.r0(c(list, f4), new b());
    }

    public abstract List c(List list, Float f4);
}
