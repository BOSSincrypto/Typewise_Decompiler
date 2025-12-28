package ch.icoaching.wrio.util;

import android.content.Context;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.util.DictionaryExporter$exportDictionary$1$success$1", f = "DictionaryExporter.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "", "<anonymous>", "(Lkotlinx/coroutines/D;)Z"}, k = 3, mv = {2, 0, 0})
final class DictionaryExporter$exportDictionary$1$success$1 extends SuspendLambda implements p {
    final /* synthetic */ Context $applicationContext;
    int label;
    final /* synthetic */ DictionaryExporter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DictionaryExporter$exportDictionary$1$success$1(DictionaryExporter dictionaryExporter, Context context, c<? super DictionaryExporter$exportDictionary$1$success$1> cVar) {
        super(2, cVar);
        this.this$0 = dictionaryExporter;
        this.$applicationContext = context;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DictionaryExporter$exportDictionary$1$success$1(this.this$0, this.$applicationContext, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        a.f();
        if (this.label == 0) {
            f.b(obj);
            return kotlin.coroutines.jvm.internal.a.a(this.this$0.e(this.$applicationContext));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(D d4, c<? super Boolean> cVar) {
        return ((DictionaryExporter$exportDictionary$1$success$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
