package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
import u2.l;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* synthetic */ class Regex$findAll$2 extends FunctionReferenceImpl implements l {
    public static final Regex$findAll$2 INSTANCE = new Regex$findAll$2();

    Regex$findAll$2() {
        super(1, l.class, "next", "next()Lkotlin/text/MatchResult;", 0);
    }

    public final l invoke(l lVar) {
        o.e(lVar, "p0");
        return lVar.next();
    }
}
