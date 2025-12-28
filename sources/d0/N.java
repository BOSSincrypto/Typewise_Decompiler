package D0;

import A0.a;
import E0.s;
import ch.icoaching.typewise.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import u2.q;
import x0.C0934a;

public final class N {

    /* renamed from: a  reason: collision with root package name */
    private final q f246a;

    /* renamed from: b  reason: collision with root package name */
    private final C0934a f247b = new C0934a();

    public N(q qVar) {
        o.e(qVar, "getWords");
        this.f246a = qVar;
    }

    private final String a(String str, boolean z3, String str2) {
        if (!z3 || a.f4a.a(str, str.length(), 16384) == 0) {
            return str2;
        }
        return s.a(str2);
    }

    public final List b(String str, boolean z3, int i4, List list) {
        o.e(list, "languages");
        if (str == null) {
            return C0718m.j();
        }
        ArrayList arrayList = new ArrayList();
        try {
            String c4 = s.c(str);
            q qVar = this.f246a;
            String lowerCase = c4.toLowerCase(Locale.ROOT);
            o.d(lowerCase, "toLowerCase(...)");
            List<String> D02 = C0718m.D0((Collection) qVar.invoke(lowerCase, this.f247b.a(list), Integer.valueOf(i4)));
            D02.remove(c4);
            for (String a4 : D02) {
                arrayList.add(a(str, z3, a4));
            }
        } catch (Exception e4) {
            e eVar = e.f8233a;
            String message = e4.getMessage();
            eVar.c("WordListPredictor", "predict() :: " + message, e4);
        }
        return arrayList;
    }
}
