package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u2.C0906a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/text/l;", "invoke", "()Lkotlin/text/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
final class Regex$findAll$1 extends Lambda implements C0906a {
    final /* synthetic */ CharSequence $input;
    final /* synthetic */ int $startIndex;
    final /* synthetic */ Regex this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Regex$findAll$1(Regex regex, CharSequence charSequence, int i4) {
        super(0);
        this.this$0 = regex;
        this.$input = charSequence;
        this.$startIndex = i4;
    }

    public final l invoke() {
        return this.this$0.find(this.$input, this.$startIndex);
    }
}
