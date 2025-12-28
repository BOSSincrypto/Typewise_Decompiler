package ch.icoaching.typewise.word_lists;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
import u2.l;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* synthetic */ class WordList$contains$membershipFunction$1 extends FunctionReferenceImpl implements l {
    WordList$contains$membershipFunction$1(Object obj) {
        super(1, obj, WordList.class, "containsCheckCase", "containsCheckCase(Ljava/lang/String;)Z", 0);
    }

    /* renamed from: a */
    public final Boolean invoke(String str) {
        o.e(str, "p0");
        return Boolean.valueOf(((WordList) this.receiver).f(str));
    }
}
