package D0;

import ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrary;
import java.util.List;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.o;
import l2.q;

public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    private final LanguageModellingLibrary f271a;

    public e0(LanguageModellingLibrary languageModellingLibrary) {
        o.e(languageModellingLibrary, "languageModellingLibrary");
        this.f271a = languageModellingLibrary;
    }

    public static /* synthetic */ Object a(e0 e0Var, String str, String str2, Float f4, c cVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = null;
        }
        if ((i4 & 4) != 0) {
            f4 = null;
        }
        return e0Var.b(str, str2, f4, cVar);
    }

    public final Object b(String str, String str2, Float f4, c cVar) {
        return LanguageModellingLibrary.b(this.f271a, str, (List) null, false, 5, f4, str2, cVar, 6, (Object) null);
    }

    public final Object c(c cVar) {
        Object d4 = this.f271a.d(cVar);
        if (d4 == a.f()) {
            return d4;
        }
        return q.f14567a;
    }
}
