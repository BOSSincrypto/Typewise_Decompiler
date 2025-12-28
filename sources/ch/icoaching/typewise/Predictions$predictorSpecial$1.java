package ch.icoaching.typewise;

import ch.icoaching.typewise.text.TypewiseInputType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
import u2.p;
import z0.C0967a;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* synthetic */ class Predictions$predictorSpecial$1 extends FunctionReferenceImpl implements p {
    Predictions$predictorSpecial$1(Object obj) {
        super(2, obj, C0967a.class, "getSpecialFieldValues", "getSpecialFieldValues(Ljava/lang/String;Lch/icoaching/typewise/text/TypewiseInputType;)Ljava/util/List;", 0);
    }

    /* renamed from: a */
    public final List invoke(String str, TypewiseInputType typewiseInputType) {
        o.e(str, "p0");
        return ((C0967a) this.receiver).e(str, typewiseInputType);
    }
}
