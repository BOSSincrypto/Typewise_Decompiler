package ch.icoaching.wrio.util;

import android.content.Context;
import ch.icoaching.wrio.logging.Log;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.C0738g;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.D;
import kotlinx.coroutines.P;
import l2.q;
import u2.l;
import u2.p;

@d(c = "ch.icoaching.wrio.util.DictionaryExporter$exportDictionary$1", f = "DictionaryExporter.kt", l = {23}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DictionaryExporter$exportDictionary$1 extends SuspendLambda implements p {
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ l $callback;
    int label;
    final /* synthetic */ DictionaryExporter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DictionaryExporter$exportDictionary$1(l lVar, DictionaryExporter dictionaryExporter, Context context, c<? super DictionaryExporter$exportDictionary$1> cVar) {
        super(2, cVar);
        this.$callback = lVar;
        this.this$0 = dictionaryExporter;
        this.$applicationContext = context;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DictionaryExporter$exportDictionary$1(this.$callback, this.this$0, this.$applicationContext, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            CoroutineDispatcher b4 = P.b();
            DictionaryExporter$exportDictionary$1$success$1 dictionaryExporter$exportDictionary$1$success$1 = new DictionaryExporter$exportDictionary$1$success$1(this.this$0, this.$applicationContext, (c<? super DictionaryExporter$exportDictionary$1$success$1>) null);
            this.label = 1;
            obj = C0738g.e(b4, dictionaryExporter$exportDictionary$1$success$1, this);
            if (obj == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Boolean) obj).booleanValue()) {
            Log.i(Log.f10572a, "DictionaryExporter", "doWork() :: Success. Dictionary exported", (Throwable) null, 4, (Object) null);
            this.$callback.invoke(this.this$0.f(this.$applicationContext));
        } else {
            Log.i(Log.f10572a, "DictionaryExporter", "doWork() :: Failure", (Throwable) null, 4, (Object) null);
            this.$callback.invoke((Object) null);
        }
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((DictionaryExporter$exportDictionary$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
