package ch.icoaching.typewise.language_modelling.modelling;

import kotlin.Metadata;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lch/icoaching/typewise/language_modelling/modelling/ModelFileSyncException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "<init>", "(Ljava/lang/String;)V", "typewise-autocorrect-library-predictions-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ModelFileSyncException extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModelFileSyncException(String str) {
        super(str);
        o.e(str, "message");
    }
}
