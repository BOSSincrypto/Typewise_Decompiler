package ch.icoaching.wrio.input;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.input.SaveWordsUseCase$saveWords$2$wordId$1", f = "SaveWordsUseCase.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "", "<anonymous>", "(Lkotlinx/coroutines/D;)J"}, k = 3, mv = {2, 0, 0})
final class SaveWordsUseCase$saveWords$2$wordId$1 extends SuspendLambda implements p {
    final /* synthetic */ String $dominantLanguage;
    final /* synthetic */ String $realWord;
    int label;
    final /* synthetic */ SaveWordsUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SaveWordsUseCase$saveWords$2$wordId$1(SaveWordsUseCase saveWordsUseCase, String str, String str2, c<? super SaveWordsUseCase$saveWords$2$wordId$1> cVar) {
        super(2, cVar);
        this.this$0 = saveWordsUseCase;
        this.$realWord = str;
        this.$dominantLanguage = str2;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new SaveWordsUseCase$saveWords$2$wordId$1(this.this$0, this.$realWord, this.$dominantLanguage, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        long j4;
        a.f();
        if (this.label == 0) {
            f.b(obj);
            Long j5 = this.this$0.f9755f.f7496f.j(this.$realWord, this.$dominantLanguage);
            if (j5 != null) {
                j4 = j5.longValue();
            } else {
                j4 = -1;
            }
            return kotlin.coroutines.jvm.internal.a.e(j4);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(D d4, c<? super Long> cVar) {
        return ((SaveWordsUseCase$saveWords$2$wordId$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
