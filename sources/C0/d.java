package C0;

import ch.icoaching.typewise.word_lists.WordListKind;
import kotlin.jvm.internal.o;

public abstract class d {
    public static final WordListKind a(String str) {
        o.e(str, "<this>");
        WordListKind wordListKind = WordListKind.STANDARD;
        if (!o.a(str, wordListKind.getValue())) {
            wordListKind = WordListKind.COMBINED;
            if (!o.a(str, wordListKind.getValue())) {
                wordListKind = WordListKind.ADDITIONAL;
                if (!o.a(str, wordListKind.getValue())) {
                    wordListKind = WordListKind.ALL;
                    if (!o.a(str, wordListKind.getValue())) {
                        wordListKind = WordListKind.EMPTY;
                        if (!o.a(str, wordListKind.getValue())) {
                            wordListKind = WordListKind.COMBINED_WITHOUT_COMPANY;
                            if (!o.a(str, wordListKind.getValue())) {
                                wordListKind = WordListKind.COMBINED_WITHOUT_STANDARD;
                                if (!o.a(str, wordListKind.getValue())) {
                                    wordListKind = WordListKind.BLOCKLIST_FROM_LIST_OF_WORDS;
                                    if (!o.a(str, wordListKind.getValue())) {
                                        wordListKind = WordListKind.PREDICTION_BLOCKLIST;
                                        if (!o.a(str, wordListKind.getValue())) {
                                            wordListKind = WordListKind.EMPTY_BLOCKLIST;
                                            if (!o.a(str, wordListKind.getValue())) {
                                                wordListKind = WordListKind.NAMES;
                                                if (!o.a(str, wordListKind.getValue())) {
                                                    wordListKind = WordListKind.SURNAMES;
                                                    if (!o.a(str, wordListKind.getValue())) {
                                                        throw new IllegalArgumentException(str + " is not a valid WordListKind.");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return wordListKind;
    }
}
