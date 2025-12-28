package ch.icoaching.wrio.ai_assistant.network;

import F2.b;
import F2.c;
import F2.k;
import F2.m;
import I2.d;
import J2.C0;
import ch.icoaching.wrio.ai_assistant.network.NoMetadataChatCompletionBody;
import ch.icoaching.wrio.ai_assistant.network.TonalityChatCompletionBody;
import ch.icoaching.wrio.ai_assistant.network.TranslateChatCompletionBody;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.r;
import l2.f;

@c
@m
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0001\u0003\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lch/icoaching/wrio/ai_assistant/network/ChatCompletionBody;", "", "<init>", "()V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self", "(Lch/icoaching/wrio/ai_assistant/network/ChatCompletionBody;LI2/d;LH2/f;)V", "Companion", "a", "Lch/icoaching/wrio/ai_assistant/network/NoMetadataChatCompletionBody;", "Lch/icoaching/wrio/ai_assistant/network/TonalityChatCompletionBody;", "Lch/icoaching/wrio/ai_assistant/network/TranslateChatCompletionBody;", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChatCompletionBody {
    /* access modifiers changed from: private */
    public static final f $cachedSerializer$delegate = kotlin.c.a(LazyThreadSafetyMode.PUBLICATION, new a());
    public static final a Companion = new a((i) null);

    public static final class a {
        private a() {
        }

        private final /* synthetic */ b a() {
            return (b) ChatCompletionBody.$cachedSerializer$delegate.getValue();
        }

        public final b serializer() {
            return a();
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public /* synthetic */ ChatCompletionBody(i iVar) {
        this();
    }

    /* access modifiers changed from: private */
    public static final /* synthetic */ b _init_$_anonymous_() {
        return new k("ch.icoaching.wrio.ai_assistant.network.ChatCompletionBody", r.b(ChatCompletionBody.class), new A2.c[]{r.b(NoMetadataChatCompletionBody.class), r.b(TonalityChatCompletionBody.class), r.b(TranslateChatCompletionBody.class)}, new b[]{NoMetadataChatCompletionBody.a.f9165a, TonalityChatCompletionBody.a.f9169a, TranslateChatCompletionBody.a.f9173a}, new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(ChatCompletionBody chatCompletionBody, d dVar, H2.f fVar) {
    }

    private ChatCompletionBody() {
    }

    public /* synthetic */ ChatCompletionBody(int i4, C0 c02) {
    }
}
