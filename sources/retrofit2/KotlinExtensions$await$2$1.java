package retrofit2;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import l2.q;
import u2.l;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "it", "Ll2/q;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
final class KotlinExtensions$await$2$1 extends Lambda implements l {
    final /* synthetic */ C0877d $this_await;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KotlinExtensions$await$2$1(C0877d dVar) {
        super(1);
        this.$this_await = dVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return q.f14567a;
    }

    public final void invoke(Throwable th) {
        this.$this_await.cancel();
    }
}
