package ch.icoaching.wrio.ai_assistant.network;

import ch.icoaching.wrio.logging.Log;
import com.getcapacitor.PluginMethod;
import kotlin.Result;
import kotlin.f;
import kotlin.jvm.internal.o;
import okhttp3.B;
import okhttp3.y;
import retrofit2.C0877d;
import retrofit2.C0879f;
import retrofit2.HttpException;
import retrofit2.J;

public final class g implements C0877d {

    /* renamed from: a  reason: collision with root package name */
    private final C0877d f9189a;

    public static final class a implements C0879f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0879f f9190a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f9191b;

        a(C0879f fVar, g gVar) {
            this.f9190a = fVar;
            this.f9191b = gVar;
        }

        public void a(C0877d dVar, J j4) {
            String str;
            o.e(dVar, "call");
            o.e(j4, "response");
            if (j4.e()) {
                C0879f fVar = this.f9190a;
                g gVar = this.f9191b;
                int b4 = j4.b();
                Result.a aVar = Result.Companion;
                Object a4 = j4.a();
                o.b(a4);
                fVar.a(gVar, J.g(b4, Result.m0boximpl(Result.m1constructorimpl(a4))));
                return;
            }
            Log log = Log.f10572a;
            B d4 = j4.d();
            if (d4 != null) {
                str = d4.o();
            } else {
                str = null;
            }
            Log.d(log, "ResultCall", String.valueOf(str), (Throwable) null, 4, (Object) null);
            C0879f fVar2 = this.f9190a;
            g gVar2 = this.f9191b;
            Result.a aVar2 = Result.Companion;
            fVar2.a(gVar2, J.h(Result.m0boximpl(Result.m1constructorimpl(f.a(new HttpException(j4))))));
        }

        public void b(C0877d dVar, Throwable th) {
            o.e(dVar, "call");
            o.e(th, "t");
            C0879f fVar = this.f9190a;
            g gVar = this.f9191b;
            Result.a aVar = Result.Companion;
            fVar.a(gVar, J.h(Result.m0boximpl(Result.m1constructorimpl(f.a(th)))));
        }
    }

    public g(C0877d dVar) {
        o.e(dVar, "delegate");
        this.f9189a = dVar;
    }

    public y a() {
        y a4 = this.f9189a.a();
        o.d(a4, "request(...)");
        return a4;
    }

    public void cancel() {
        this.f9189a.cancel();
    }

    public boolean e() {
        return this.f9189a.e();
    }

    /* renamed from: f */
    public C0877d clone() {
        C0877d f4 = this.f9189a.f();
        o.d(f4, "clone(...)");
        return new g(f4);
    }

    public void m(C0879f fVar) {
        o.e(fVar, PluginMethod.RETURN_CALLBACK);
        this.f9189a.m(new a(fVar, this));
    }
}
