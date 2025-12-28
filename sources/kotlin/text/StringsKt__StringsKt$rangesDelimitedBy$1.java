package kotlin.text;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import l2.g;
import u2.p;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "currentIndex", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class StringsKt__StringsKt$rangesDelimitedBy$1 extends Lambda implements p {
    final /* synthetic */ char[] $delimiters;
    final /* synthetic */ boolean $ignoreCase;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StringsKt__StringsKt$rangesDelimitedBy$1(char[] cArr, boolean z3) {
        super(2);
        this.$delimiters = cArr;
        this.$ignoreCase = z3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((CharSequence) obj, ((Number) obj2).intValue());
    }

    public final Pair<Integer, Integer> invoke(CharSequence charSequence, int i4) {
        o.e(charSequence, "$this$$receiver");
        int W3 = StringsKt__StringsKt.W(charSequence, this.$delimiters, i4, this.$ignoreCase);
        if (W3 < 0) {
            return null;
        }
        return g.a(Integer.valueOf(W3), 1);
    }
}
