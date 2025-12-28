package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u2.l;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/text/f;", "", "T", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/Enum;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
final class Regex$special$$inlined$fromInt$1 extends Lambda implements l {
    final /* synthetic */ int $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Regex$special$$inlined$fromInt$1(int i4) {
        super(1);
        this.$value = i4;
    }

    public final Boolean invoke(RegexOption regexOption) {
        f fVar = regexOption;
        return Boolean.valueOf((this.$value & fVar.getMask()) == fVar.getValue());
    }
}
