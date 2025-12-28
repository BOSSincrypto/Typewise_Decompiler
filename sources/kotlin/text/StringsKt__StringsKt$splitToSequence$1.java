package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import u2.l;
import z2.c;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz2/c;", "it", "", "invoke", "(Lz2/c;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
final class StringsKt__StringsKt$splitToSequence$1 extends Lambda implements l {
    final /* synthetic */ CharSequence $this_splitToSequence;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StringsKt__StringsKt$splitToSequence$1(CharSequence charSequence) {
        super(1);
        this.$this_splitToSequence = charSequence;
    }

    public final String invoke(c cVar) {
        o.e(cVar, "it");
        return StringsKt__StringsKt.A0(this.$this_splitToSequence, cVar);
    }
}
