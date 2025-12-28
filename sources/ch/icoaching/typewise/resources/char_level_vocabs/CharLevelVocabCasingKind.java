package ch.icoaching.typewise.resources.char_level_vocabs;

import kotlin.Metadata;
import kotlin.enums.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lch/icoaching/typewise/resources/char_level_vocabs/CharLevelVocabCasingKind;", "", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "LOWER", "MIXED", "typewise-autocorrect-library-predictions-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0})
public enum CharLevelVocabCasingKind {
    LOWER("lower"),
    MIXED("mixed");
    
    private final String value;

    static {
        CharLevelVocabCasingKind[] a4;
        f8861b = a.a(a4);
    }

    private CharLevelVocabCasingKind(String str) {
        this.value = str;
    }

    public final String b() {
        return this.value;
    }
}
