package ch.icoaching.typewise;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
import u2.l;
import z0.C0967a;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* synthetic */ class Predictions$Companion$getTypewiseLMCapitalizationInference$languageModelingLibrary$1 extends FunctionReferenceImpl implements l {
    Predictions$Companion$getTypewiseLMCapitalizationInference$languageModelingLibrary$1(Object obj) {
        super(1, obj, C0967a.class, "getBlocklistWords", "getBlocklistWords(Ljava/lang/String;)Ljava/util/List;", 0);
    }

    /* renamed from: a */
    public final List invoke(String str) {
        o.e(str, "p0");
        return ((C0967a) this.receiver).d(str);
    }
}
