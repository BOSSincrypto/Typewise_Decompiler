package ch.icoaching.typewise;

import ch.icoaching.typewise.autocorrection.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
import u2.l;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* synthetic */ class Autocorrection$reinitialize$1$1$blocklistDictionaryRepository$1 extends FunctionReferenceImpl implements l {
    Autocorrection$reinitialize$1$1$blocklistDictionaryRepository$1(Object obj) {
        super(1, obj, a.class, "getBlocklistWords", "getBlocklistWords(Ljava/lang/String;)Ljava/util/List;", 0);
    }

    /* renamed from: a */
    public final List invoke(String str) {
        o.e(str, "p0");
        return ((a) this.receiver).d(str);
    }
}
