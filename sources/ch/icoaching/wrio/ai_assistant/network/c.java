package ch.icoaching.wrio.ai_assistant.network;

import kotlin.Metadata;
import l3.a;
import l3.o;
import retrofit2.J;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lch/icoaching/wrio/ai_assistant/network/c;", "", "Lch/icoaching/wrio/ai_assistant/network/ChatCompletionBody;", "request", "Lretrofit2/J;", "Lch/icoaching/wrio/ai_assistant/network/ChatCompletion;", "a", "(Lch/icoaching/wrio/ai_assistant/network/ChatCompletionBody;Lkotlin/coroutines/c;)Ljava/lang/Object;", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface c {
    @o("/v1/chat/completions")
    Object a(@a ChatCompletionBody chatCompletionBody, kotlin.coroutines.c<? super J<ChatCompletion>> cVar);
}
