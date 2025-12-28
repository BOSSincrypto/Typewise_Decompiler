package ch.icoaching.wrio.ai_assistant.network;

import i.e;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.wrio.ai_assistant.network.ChatApiRepository", f = "ChatApiRepository.kt", l = {27}, m = "createChatCompletion")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ChatApiRepository$createChatCompletion$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatApiRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChatApiRepository$createChatCompletion$1(ChatApiRepository chatApiRepository, c<? super ChatApiRepository$createChatCompletion$1> cVar) {
        super(cVar);
        this.this$0 = chatApiRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d((e) null, this);
    }
}
