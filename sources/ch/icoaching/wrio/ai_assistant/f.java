package ch.icoaching.wrio.ai_assistant;

import F2.b;
import K2.C0341a;
import K2.C0344d;
import K2.t;
import L2.a;
import b2.C0485c;
import ch.icoaching.wrio.X;
import ch.icoaching.wrio.ai_assistant.network.ChatApiRepository;
import ch.icoaching.wrio.ai_assistant.network.ChatCompletionBody;
import ch.icoaching.wrio.ai_assistant.network.NoMetadataChatCompletionBody;
import ch.icoaching.wrio.ai_assistant.network.TonalityChatCompletionBody;
import ch.icoaching.wrio.ai_assistant.network.TranslateChatCompletionBody;
import ch.icoaching.wrio.ai_assistant.network.c;
import ch.icoaching.wrio.ai_assistant.network.e;
import ch.icoaching.wrio.ai_assistant.network.h;
import ch.icoaching.wrio.ai_assistant.network.i;
import ch.icoaching.wrio.keyboard.B;
import com.silkimen.http.HttpRequest;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.r;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import l2.q;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.v;
import okhttp3.x;
import q0.k;
import q0.m;
import retrofit2.K;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f9144a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static h f9145b;

    /* renamed from: c  reason: collision with root package name */
    private static ChatApiRepository f9146c;

    /* renamed from: d  reason: collision with root package name */
    private static m f9147d;

    /* renamed from: e  reason: collision with root package name */
    private static k f9148e;

    /* renamed from: f  reason: collision with root package name */
    private static c f9149f;

    /* renamed from: g  reason: collision with root package name */
    private static c f9150g;

    /* renamed from: h  reason: collision with root package name */
    private static C0341a f9151h;

    /* renamed from: i  reason: collision with root package name */
    private static i f9152i;

    private f() {
    }

    /* access modifiers changed from: private */
    public static final q b(C0344d dVar) {
        o.e(dVar, "$this$Json");
        kotlinx.serialization.modules.c cVar = new kotlinx.serialization.modules.c();
        a aVar = new a(r.b(ChatCompletionBody.class), (b) null);
        aVar.b(r.b(NoMetadataChatCompletionBody.class), NoMetadataChatCompletionBody.Companion.serializer());
        aVar.b(r.b(TranslateChatCompletionBody.class), TranslateChatCompletionBody.Companion.serializer());
        aVar.b(r.b(TonalityChatCompletionBody.class), TonalityChatCompletionBody.Companion.serializer());
        aVar.a(cVar);
        dVar.f(cVar.f());
        dVar.e(true);
        dVar.d(false);
        dVar.c(ClassDiscriminatorMode.NONE);
        return q.f14567a;
    }

    private final ChatApiRepository e() {
        if (f9146c == null) {
            synchronized (this) {
                try {
                    if (f9146c == null) {
                        f9146c = new ChatApiRepository();
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ChatApiRepository chatApiRepository = f9146c;
        o.b(chatApiRepository);
        return chatApiRepository;
    }

    private final i h() {
        if (f9152i == null) {
            synchronized (this) {
                try {
                    if (f9152i == null) {
                        f9152i = new i();
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        i iVar = f9152i;
        o.b(iVar);
        return iVar;
    }

    private final k i() {
        if (f9148e == null) {
            synchronized (this) {
                try {
                    if (f9148e == null) {
                        f9148e = new k();
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        k kVar = f9148e;
        o.b(kVar);
        return kVar;
    }

    private final m j() {
        if (f9147d == null) {
            synchronized (this) {
                try {
                    if (f9147d == null) {
                        f9147d = new m(ch.icoaching.wrio.data.f.f9502a.k());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        m mVar = f9147d;
        o.b(mVar);
        return mVar;
    }

    public final void c() {
        f9150g = null;
        f9145b = null;
        f9146c = null;
        f9147d = null;
        f9148e = null;
        f9151h = null;
    }

    public final h d() {
        if (f9145b == null) {
            synchronized (this) {
                try {
                    if (f9145b == null) {
                        f fVar = f9144a;
                        ChatApiRepository e4 = fVar.e();
                        m j4 = fVar.j();
                        k i4 = fVar.i();
                        X x3 = X.f9083a;
                        ch.icoaching.wrio.input.c h4 = x3.h();
                        B k4 = x3.k();
                        ch.icoaching.wrio.data.b j5 = ch.icoaching.wrio.data.f.f9502a.j();
                        I0.b b4 = I0.a.f579a.b();
                        M2.b bVar = M2.b.f944a;
                        f9145b = new DefaultAiAssistantController(e4, j4, i4, h4, k4, j5, b4, bVar.b(), bVar.c(), bVar.a(), M2.a.f941a.a());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        h hVar = f9145b;
        o.b(hVar);
        return hVar;
    }

    public final c f() {
        if (f9149f == null) {
            synchronized (this) {
                try {
                    if (f9149f == null) {
                        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor((HttpLoggingInterceptor.a) null, 1, (kotlin.jvm.internal.i) null);
                        httpLoggingInterceptor.c(HttpLoggingInterceptor.Level.NONE);
                        x.a a4 = g.b().a(e.f9186a);
                        f fVar = f9144a;
                        f9149f = (c) new K.b().g(a4.a(new ch.icoaching.wrio.ai_assistant.network.f(fVar.h())).a(httpLoggingInterceptor).b()).b(C0485c.a(fVar.g(), v.f15509e.a(HttpRequest.CONTENT_TYPE_JSON))).a(new h()).c("https://assistant.typewise.app/").e().b(c.class);
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c cVar = f9149f;
        o.b(cVar);
        return cVar;
    }

    public final C0341a g() {
        if (f9151h == null) {
            f9151h = t.b((C0341a) null, new e(), 1, (Object) null);
        }
        C0341a aVar = f9151h;
        o.b(aVar);
        return aVar;
    }
}
