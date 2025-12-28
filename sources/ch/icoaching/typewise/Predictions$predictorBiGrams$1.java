package ch.icoaching.typewise;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
import u2.r;
import z0.C0967a;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* synthetic */ class Predictions$predictorBiGrams$1 extends FunctionReferenceImpl implements r {
    Predictions$predictorBiGrams$1(Object obj) {
        super(4, obj, C0967a.class, "getBiGrams", "getBiGrams(Ljava/lang/String;Ljava/lang/String;II)Ljava/util/List;", 0);
    }

    public final List a(String str, String str2, int i4, int i5) {
        o.e(str, "p0");
        o.e(str2, "p1");
        return ((C0967a) this.receiver).f(str, str2, i4, i5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return a((String) obj, (String) obj2, ((Number) obj3).intValue(), ((Number) obj4).intValue());
    }
}
