package ch.icoaching.wrio.ai_assistant;

import i.e;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.ai_assistant.DefaultAiAssistantController$applyTextTransformation$1$1$messageTransformationResult$1", f = "DefaultAiAssistantController.kt", l = {285}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Lch/icoaching/wrio/ai_assistant/j;", "<anonymous>", "(Lkotlinx/coroutines/D;)Lch/icoaching/wrio/ai_assistant/j;"}, k = 3, mv = {2, 0, 0})
final class DefaultAiAssistantController$applyTextTransformation$1$1$messageTransformationResult$1 extends SuspendLambda implements p {
    final /* synthetic */ e $textTransformation;
    int label;
    final /* synthetic */ DefaultAiAssistantController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultAiAssistantController$applyTextTransformation$1$1$messageTransformationResult$1(DefaultAiAssistantController defaultAiAssistantController, e eVar, c<? super DefaultAiAssistantController$applyTextTransformation$1$1$messageTransformationResult$1> cVar) {
        super(2, cVar);
        this.this$0 = defaultAiAssistantController;
        this.$textTransformation = eVar;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultAiAssistantController$applyTextTransformation$1$1$messageTransformationResult$1(this.this$0, this.$textTransformation, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            DefaultAiAssistantController defaultAiAssistantController = this.this$0;
            e eVar = this.$textTransformation;
            this.label = 1;
            obj = defaultAiAssistantController.m(eVar, this);
            if (obj == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }

    public final Object invoke(D d4, c<? super j> cVar) {
        return ((DefaultAiAssistantController$applyTextTransformation$1$1$messageTransformationResult$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
