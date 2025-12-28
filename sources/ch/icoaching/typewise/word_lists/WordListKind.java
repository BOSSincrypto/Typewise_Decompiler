package ch.icoaching.typewise.word_lists;

import kotlin.Metadata;
import kotlin.enums.a;
import o2.C0840a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lch/icoaching/typewise/word_lists/WordListKind;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "STANDARD", "COMBINED", "ADDITIONAL", "ALL", "EMPTY", "COMBINED_WITHOUT_COMPANY", "COMBINED_WITHOUT_STANDARD", "BLOCKLIST_FROM_LIST_OF_WORDS", "PREDICTION_BLOCKLIST", "EMPTY_BLOCKLIST", "NAMES", "SURNAMES", "typewise-autocorrect-library-common-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum WordListKind {
    STANDARD("standard"),
    COMBINED("combined"),
    ADDITIONAL("additional"),
    ALL("all"),
    EMPTY("empty"),
    COMBINED_WITHOUT_COMPANY("combined-without-company"),
    COMBINED_WITHOUT_STANDARD("combined-without-standard"),
    BLOCKLIST_FROM_LIST_OF_WORDS("blocklistfromlistofwords"),
    PREDICTION_BLOCKLIST("prediction-blocklist"),
    EMPTY_BLOCKLIST("emptyblocklist"),
    NAMES("names"),
    SURNAMES("surnames");
    
    private final String value;

    static {
        WordListKind[] a4;
        f8893b = a.a(a4);
    }

    private WordListKind(String str) {
        this.value = str;
    }

    public static C0840a getEntries() {
        return f8893b;
    }

    public final String getValue() {
        return this.value;
    }
}
