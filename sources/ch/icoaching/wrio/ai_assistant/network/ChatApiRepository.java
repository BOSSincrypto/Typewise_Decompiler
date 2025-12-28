package ch.icoaching.wrio.ai_assistant.network;

import ch.icoaching.wrio.ai_assistant.network.b;
import ch.icoaching.wrio.ai_assistant.network.d;
import ch.icoaching.wrio.logging.Log;
import i.e;
import kotlin.text.o;
import okhttp3.B;
import retrofit2.J;

public final class ChatApiRepository {

    /* renamed from: a  reason: collision with root package name */
    private c f9157a;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9158a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ch.icoaching.wrio.ai_assistant.network.ActionType[] r0 = ch.icoaching.wrio.ai_assistant.network.ActionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ch.icoaching.wrio.ai_assistant.network.ActionType r1 = ch.icoaching.wrio.ai_assistant.network.ActionType.TRANSLATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ch.icoaching.wrio.ai_assistant.network.ActionType r1 = ch.icoaching.wrio.ai_assistant.network.ActionType.TONALITY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f9158a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.ai_assistant.network.ChatApiRepository.a.<clinit>():void");
        }
    }

    private final ChatCompletionBody a(e eVar) {
        ActionType c4 = eVar.c();
        int i4 = a.f9158a[c4.ordinal()];
        if (i4 == 1) {
            return new TranslateChatCompletionBody(eVar.b(true), c4, new TranslateActionMetadata(eVar.a()));
        }
        if (i4 != 2) {
            return new NoMetadataChatCompletionBody(eVar.b(true), c4);
        }
        return new TonalityChatCompletionBody(eVar.b(true), c4, new TonalityActionMetadata(eVar.a()));
    }

    private final b b(J j4) {
        String str;
        d dVar;
        if (j4.e()) {
            ChatCompletion chatCompletion = (ChatCompletion) j4.a();
            if (chatCompletion != null) {
                Log.d(Log.f10572a, "ChatApiRepository", "parseApiResponse() :: response successful and body present.", (Throwable) null, 4, (Object) null);
                return new b.C0149b(chatCompletion);
            }
            Log.d(Log.f10572a, "ChatApiRepository", "parseApiResponse() :: empty response body.", (Throwable) null, 4, (Object) null);
            return new b.a(d.a.f9177a);
        }
        B d4 = j4.d();
        if (d4 != null) {
            str = d4.o();
        } else {
            str = null;
        }
        Log log = Log.f10572a;
        Log.d(log, "ChatApiRepository", "parseApiResponse() :: API error " + str + '.', (Throwable) null, 4, (Object) null);
        if (str == null || (dVar = c(j4.b(), str)) == null) {
            dVar = d.i.f9185a;
        }
        return new b.a(dVar);
    }

    private final d c(int i4, String str) {
        if (i4 != 400) {
            if (i4 != 401) {
                if (i4 == 429) {
                    return d.g.f9183a;
                }
                if (i4 == 500) {
                    return d.h.f9184a;
                }
                if (i4 != 503) {
                    return d.i.f9185a;
                }
                return d.b.f9178a;
            } else if (str == null) {
                return d.i.f9185a;
            } else {
                if (o.L(str, "You didn't provide", false, 2, (Object) null)) {
                    return d.f.f9182a;
                }
                if (o.L(str, "Incorrect API key", false, 2, (Object) null)) {
                    return d.c.f9179a;
                }
                return d.i.f9185a;
            }
        } else if (str == null || !o.L(str, "Message input too long", false, 2, (Object) null)) {
            return d.i.f9185a;
        } else {
            return d.C0150d.f9180a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(i.e r5, kotlin.coroutines.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ch.icoaching.wrio.ai_assistant.network.ChatApiRepository$createChatCompletion$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ch.icoaching.wrio.ai_assistant.network.ChatApiRepository$createChatCompletion$1 r0 = (ch.icoaching.wrio.ai_assistant.network.ChatApiRepository$createChatCompletion$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.wrio.ai_assistant.network.ChatApiRepository$createChatCompletion$1 r0 = new ch.icoaching.wrio.ai_assistant.network.ChatApiRepository$createChatCompletion$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.L$0
            ch.icoaching.wrio.ai_assistant.network.ChatApiRepository r5 = (ch.icoaching.wrio.ai_assistant.network.ChatApiRepository) r5
            kotlin.f.b(r6)     // Catch:{ Exception -> 0x0053 }
            goto L_0x004c
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            kotlin.f.b(r6)
            ch.icoaching.wrio.ai_assistant.network.c r6 = r4.f9157a
            if (r6 == 0) goto L_0x005b
            ch.icoaching.wrio.ai_assistant.network.ChatCompletionBody r5 = r4.a(r5)     // Catch:{ Exception -> 0x0053 }
            r0.L$0 = r4     // Catch:{ Exception -> 0x0053 }
            r0.label = r3     // Catch:{ Exception -> 0x0053 }
            java.lang.Object r6 = r6.a(r5, r0)     // Catch:{ Exception -> 0x0053 }
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r5 = r4
        L_0x004c:
            retrofit2.J r6 = (retrofit2.J) r6     // Catch:{ Exception -> 0x0053 }
            ch.icoaching.wrio.ai_assistant.network.b r5 = r5.b(r6)     // Catch:{ Exception -> 0x0053 }
            goto L_0x005a
        L_0x0053:
            ch.icoaching.wrio.ai_assistant.network.b$a r5 = new ch.icoaching.wrio.ai_assistant.network.b$a
            ch.icoaching.wrio.ai_assistant.network.d$i r6 = ch.icoaching.wrio.ai_assistant.network.d.i.f9185a
            r5.<init>(r6)
        L_0x005a:
            return r5
        L_0x005b:
            ch.icoaching.wrio.ai_assistant.network.b$a r5 = new ch.icoaching.wrio.ai_assistant.network.b$a
            ch.icoaching.wrio.ai_assistant.network.d$e r6 = ch.icoaching.wrio.ai_assistant.network.d.e.f9181a
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.ai_assistant.network.ChatApiRepository.d(i.e, kotlin.coroutines.c):java.lang.Object");
    }

    public final void e() {
        this.f9157a = null;
    }

    public final void f(c cVar) {
        kotlin.jvm.internal.o.e(cVar, "apiService");
        this.f9157a = cVar;
    }
}
