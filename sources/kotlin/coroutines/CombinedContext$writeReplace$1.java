package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.o;
import l2.q;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll2/q;", "<anonymous parameter 0>", "Lkotlin/coroutines/CoroutineContext$a;", "element", "invoke", "(Ll2/q;Lkotlin/coroutines/CoroutineContext$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
final class CombinedContext$writeReplace$1 extends Lambda implements p {
    final /* synthetic */ CoroutineContext[] $elements;
    final /* synthetic */ Ref$IntRef $index;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CombinedContext$writeReplace$1(CoroutineContext[] coroutineContextArr, Ref$IntRef ref$IntRef) {
        super(2);
        this.$elements = coroutineContextArr;
        this.$index = ref$IntRef;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((q) obj, (CoroutineContext.a) obj2);
        return q.f14567a;
    }

    public final void invoke(q qVar, CoroutineContext.a aVar) {
        o.e(qVar, "<anonymous parameter 0>");
        o.e(aVar, "element");
        CoroutineContext[] coroutineContextArr = this.$elements;
        Ref$IntRef ref$IntRef = this.$index;
        int i4 = ref$IntRef.element;
        ref$IntRef.element = i4 + 1;
        coroutineContextArr[i4] = aVar;
    }
}
