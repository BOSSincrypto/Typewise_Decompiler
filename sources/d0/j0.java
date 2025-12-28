package D0;

import ch.icoaching.typewise.language_modelling.preprocessing.ProcessSampleApproachName;
import kotlin.jvm.internal.o;

public abstract class j0 {
    public static final i0 a(String str) {
        o.e(str, "declaration");
        if (o.a(str, ProcessSampleApproachName.DROP_DOCS.b())) {
            return new O();
        }
        if (o.a(str, ProcessSampleApproachName.DROP_DOCS_SINGLE_NEW_LINES.b())) {
            return new P();
        }
        throw new IllegalArgumentException("Unknown ProcessSampleApproach in preprocessing config of the config.json, please add it (2022)");
    }
}
