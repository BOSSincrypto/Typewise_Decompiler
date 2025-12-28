package ch.icoaching.typewise.word_lists;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
import u2.l;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* synthetic */ class WordList$contains$membershipFunction$2 extends FunctionReferenceImpl implements l {
    WordList$contains$membershipFunction$2(Object obj) {
        super(1, obj, WordList.class, "contains", "contains(Ljava/lang/String;)Z", 0);
    }

    /* renamed from: a */
    public final Boolean invoke(String str) {
        o.e(str, "p0");
        return Boolean.valueOf(((WordList) this.receiver).c(str));
    }
}
