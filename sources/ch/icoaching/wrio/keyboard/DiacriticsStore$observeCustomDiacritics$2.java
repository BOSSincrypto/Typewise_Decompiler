package ch.icoaching.wrio.keyboard;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.keyboard.DiacriticsStore$observeCustomDiacritics$2", f = "DiacriticsStore.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ll2/q;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 0, 0})
final class DiacriticsStore$observeCustomDiacritics$2 extends SuspendLambda implements p {
    int label;
    final /* synthetic */ DiacriticsStore this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DiacriticsStore$observeCustomDiacritics$2(DiacriticsStore diacriticsStore, c<? super DiacriticsStore$observeCustomDiacritics$2> cVar) {
        super(2, cVar);
        this.this$0 = diacriticsStore;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DiacriticsStore$observeCustomDiacritics$2(this.this$0, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        a.f();
        if (this.label == 0) {
            f.b(obj);
            DiacriticsStore diacriticsStore = this.this$0;
            diacriticsStore.e(diacriticsStore.f9953b.k0());
            return q.f14567a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(String str, c<? super q> cVar) {
        return ((DiacriticsStore$observeCustomDiacritics$2) create(str, cVar)).invokeSuspend(q.f14567a);
    }
}
