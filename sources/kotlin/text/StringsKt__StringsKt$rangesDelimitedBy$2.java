package kotlin.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import l2.g;
import u2.p;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "currentIndex", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class StringsKt__StringsKt$rangesDelimitedBy$2 extends Lambda implements p {
    final /* synthetic */ List<String> $delimitersList;
    final /* synthetic */ boolean $ignoreCase;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StringsKt__StringsKt$rangesDelimitedBy$2(List<String> list, boolean z3) {
        super(2);
        this.$delimitersList = list;
        this.$ignoreCase = z3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((CharSequence) obj, ((Number) obj2).intValue());
    }

    public final Pair<Integer, Integer> invoke(CharSequence charSequence, int i4) {
        o.e(charSequence, "$this$$receiver");
        Pair H3 = StringsKt__StringsKt.O(charSequence, this.$delimitersList, i4, this.$ignoreCase, false);
        if (H3 != null) {
            return g.a(H3.getFirst(), Integer.valueOf(((String) H3.getSecond()).length()));
        }
        return null;
    }
}
