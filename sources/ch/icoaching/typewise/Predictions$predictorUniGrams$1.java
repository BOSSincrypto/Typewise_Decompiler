package ch.icoaching.typewise;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
import u2.q;
import z0.C0967a;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* synthetic */ class Predictions$predictorUniGrams$1 extends FunctionReferenceImpl implements q {
    Predictions$predictorUniGrams$1(Object obj) {
        super(3, obj, C0967a.class, "getUniGrams", "getUniGrams(Ljava/lang/String;Ljava/lang/String;I)Ljava/util/List;", 0);
    }

    public final List a(String str, String str2, int i4) {
        o.e(str, "p0");
        o.e(str2, "p1");
        return ((C0967a) this.receiver).c(str, str2, i4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((String) obj, (String) obj2, ((Number) obj3).intValue());
    }
}
