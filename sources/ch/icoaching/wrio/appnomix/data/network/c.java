package ch.icoaching.wrio.appnomix.data.network;

import K2.C0341a;
import K2.C0344d;
import K2.t;
import b2.C0485c;
import com.silkimen.http.HttpRequest;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.q;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.v;
import okhttp3.x;
import retrofit2.K;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f9246a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static g f9247b;

    /* renamed from: c  reason: collision with root package name */
    private static a f9248c;

    /* renamed from: d  reason: collision with root package name */
    private static d f9249d;

    /* renamed from: e  reason: collision with root package name */
    private static x.a f9250e;

    /* renamed from: f  reason: collision with root package name */
    private static x.a f9251f;

    /* renamed from: g  reason: collision with root package name */
    private static C0341a f9252g;

    private c() {
    }

    private final x.a c() {
        if (f9251f == null) {
            synchronized (this) {
                try {
                    if (f9251f == null) {
                        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor((HttpLoggingInterceptor.a) null, 1, (i) null);
                        httpLoggingInterceptor.c(HttpLoggingInterceptor.Level.NONE);
                        x.a a4 = new x.a().a(httpLoggingInterceptor);
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        x.a L3 = a4.c(60000, timeUnit).H(60000, timeUnit).L(60000, timeUnit);
                        L3.a(new e());
                        f9251f = L3;
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        x.a aVar = f9251f;
        o.b(aVar);
        return aVar;
    }

    private final C0341a e() {
        if (f9252g == null) {
            synchronized (this) {
                try {
                    if (f9252g == null) {
                        f9252g = t.b((C0341a) null, new b(), 1, (Object) null);
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C0341a aVar = f9252g;
        o.b(aVar);
        return aVar;
    }

    /* access modifiers changed from: private */
    public static final q f(C0344d dVar) {
        o.e(dVar, "$this$Json");
        dVar.e(true);
        dVar.d(false);
        return q.f14567a;
    }

    private final x.a g() {
        if (f9250e == null) {
            synchronized (this) {
                try {
                    if (f9250e == null) {
                        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor((HttpLoggingInterceptor.a) null, 1, (i) null);
                        httpLoggingInterceptor.c(HttpLoggingInterceptor.Level.NONE);
                        x.a a4 = new x.a().a(httpLoggingInterceptor);
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        f9250e = a4.c(60000, timeUnit).H(60000, timeUnit).L(60000, timeUnit);
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        x.a aVar = f9250e;
        o.b(aVar);
        return aVar;
    }

    public final d b() {
        if (f9249d == null) {
            synchronized (this) {
                try {
                    if (f9249d == null) {
                        K.b bVar = new K.b();
                        c cVar = f9246a;
                        f9249d = (d) bVar.g(cVar.c().b()).b(C0485c.a(cVar.e(), v.f15509e.a(HttpRequest.CONTENT_TYPE_JSON))).c("https://assistant.typewise.app/").e().b(d.class);
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d dVar = f9249d;
        o.b(dVar);
        return dVar;
    }

    public final a d() {
        if (f9248c == null) {
            synchronized (this) {
                try {
                    if (f9248c == null) {
                        K.b bVar = new K.b();
                        c cVar = f9246a;
                        f9248c = (a) bVar.g(cVar.g().b()).b(C0485c.a(cVar.e(), v.f15509e.a(HttpRequest.CONTENT_TYPE_JSON))).c("https://api.appnomix.app/").e().b(a.class);
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        a aVar = f9248c;
        o.b(aVar);
        return aVar;
    }

    public final g h() {
        if (f9247b == null) {
            synchronized (this) {
                try {
                    if (f9247b == null) {
                        f9247b = new g(f9246a.d());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        g gVar = f9247b;
        o.b(gVar);
        return gVar;
    }
}
