package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C0747k;
import l2.q;
import u2.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ll2/q;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class ProduceKt$awaitClose$4$1 extends Lambda implements l {
    final /* synthetic */ C0747k $cont;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProduceKt$awaitClose$4$1(C0747k kVar) {
        super(1);
        this.$cont = kVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return q.f14567a;
    }

    public final void invoke(Throwable th) {
        C0747k kVar = this.$cont;
        Result.a aVar = Result.Companion;
        kVar.resumeWith(Result.m1constructorimpl(q.f14567a));
    }
}
