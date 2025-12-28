package ch.icoaching.wrio.ai_assistant;

import ch.icoaching.wrio.ai_assistant.j;
import ch.icoaching.wrio.ai_assistant.network.ChatApiRepository;
import ch.icoaching.wrio.ai_assistant.network.ChatCompletion;
import ch.icoaching.wrio.ai_assistant.network.b;
import ch.icoaching.wrio.ai_assistant.network.d;
import i.e;
import kotlin.Metadata;
import kotlin.collections.C0718m;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.text.o;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.ai_assistant.DefaultAiAssistantController$transformMessage$2", f = "DefaultAiAssistantController.kt", l = {316}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Lch/icoaching/wrio/ai_assistant/j;", "<anonymous>", "(Lkotlinx/coroutines/D;)Lch/icoaching/wrio/ai_assistant/j;"}, k = 3, mv = {2, 0, 0})
final class DefaultAiAssistantController$transformMessage$2 extends SuspendLambda implements p {
    final /* synthetic */ e $textTransformation;
    int label;
    final /* synthetic */ DefaultAiAssistantController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultAiAssistantController$transformMessage$2(DefaultAiAssistantController defaultAiAssistantController, e eVar, c<? super DefaultAiAssistantController$transformMessage$2> cVar) {
        super(2, cVar);
        this.this$0 = defaultAiAssistantController;
        this.$textTransformation = eVar;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultAiAssistantController$transformMessage$2(this.this$0, this.$textTransformation, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            ChatApiRepository y3 = this.this$0.f9111a;
            e eVar = this.$textTransformation;
            this.label = 1;
            obj = y3.d(eVar, this);
            if (obj == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b bVar = (b) obj;
        if (bVar instanceof b.C0149b) {
            ChatCompletion.Choice choice = (ChatCompletion.Choice) C0718m.c0(((ChatCompletion) ((b.C0149b) bVar).a()).getChoices());
            if (choice == null) {
                return new j.a(d.i.f9185a);
            }
            String content = choice.getMessage().getContent();
            if (content == null) {
                return new j.a(d.i.f9185a);
            }
            return new j.b(o.g(o.K0(o.E0(content, this.$textTransformation.e(), (String) null, 2, (Object) null), this.$textTransformation.d(), (String) null, 2, (Object) null), "\\n"));
        }
        kotlin.jvm.internal.o.c(bVar, "null cannot be cast to non-null type ch.icoaching.wrio.ai_assistant.network.ApiResponse.Error");
        return new j.a(((b.a) bVar).a());
    }

    public final Object invoke(D d4, c<? super j> cVar) {
        return ((DefaultAiAssistantController$transformMessage$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
