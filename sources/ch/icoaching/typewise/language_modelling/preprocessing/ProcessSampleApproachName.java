package ch.icoaching.typewise.language_modelling.preprocessing;

import kotlin.Metadata;
import kotlin.enums.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lch/icoaching/typewise/language_modelling/preprocessing/ProcessSampleApproachName;", "", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "DROP_DOCS_REPLACE_NEW_LINES", "DROP_DOCS", "DROP_DOCS_SINGLE_NEW_LINES", "typewise-autocorrect-library-predictions-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0})
public enum ProcessSampleApproachName {
    DROP_DOCS_REPLACE_NEW_LINES("dropdocs-replacenewlines"),
    DROP_DOCS("dropdocs"),
    DROP_DOCS_SINGLE_NEW_LINES("dropdocssinglenewlines");
    
    private final String value;

    static {
        ProcessSampleApproachName[] a4;
        f8789b = a.a(a4);
    }

    private ProcessSampleApproachName(String str) {
        this.value = str;
    }

    public final String b() {
        return this.value;
    }
}
