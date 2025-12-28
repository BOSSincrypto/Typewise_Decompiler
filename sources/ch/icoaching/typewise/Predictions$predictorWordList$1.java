package ch.icoaching.typewise;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
import u2.q;
import z0.C0967a;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* synthetic */ class Predictions$predictorWordList$1 extends FunctionReferenceImpl implements q {
    Predictions$predictorWordList$1(Object obj) {
        super(3, obj, C0967a.class, "getWords", "getWords(Ljava/lang/String;Ljava/util/List;I)Ljava/util/List;", 0);
    }

    public final List a(String str, List list, int i4) {
        o.e(str, "p0");
        o.e(list, "p1");
        return ((C0967a) this.receiver).i(str, list, i4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((String) obj, (List) obj2, ((Number) obj3).intValue());
    }
}
