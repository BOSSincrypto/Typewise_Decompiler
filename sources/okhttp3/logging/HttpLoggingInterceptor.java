package okhttp3.logging;

import U2.e;
import X2.k;
import c3.C0500b;
import c3.d;
import c3.h;
import com.silkimen.http.HttpRequest;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.L;
import kotlin.jvm.internal.o;
import okhttp3.A;
import okhttp3.B;
import okhttp3.i;
import okhttp3.s;
import okhttp3.u;
import okhttp3.v;
import okhttp3.y;
import okhttp3.z;
import s2.C0896b;

public final class HttpLoggingInterceptor implements u {

    /* renamed from: a  reason: collision with root package name */
    private final a f15455a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Set f15456b;

    /* renamed from: c  reason: collision with root package name */
    private volatile Level f15457c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY", "okhttp-logging-interceptor"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0212a f15459a = C0212a.f15461a;

        /* renamed from: b  reason: collision with root package name */
        public static final a f15460b = new C0212a.C0213a();

        /* renamed from: okhttp3.logging.HttpLoggingInterceptor$a$a  reason: collision with other inner class name */
        public static final class C0212a {

            /* renamed from: a  reason: collision with root package name */
            static final /* synthetic */ C0212a f15461a = new C0212a();

            /* renamed from: okhttp3.logging.HttpLoggingInterceptor$a$a$a  reason: collision with other inner class name */
            private static final class C0213a implements a {
                public void a(String str) {
                    o.e(str, "message");
                    k.k(k.f1971a.g(), str, 0, (Throwable) null, 6, (Object) null);
                }
            }

            private C0212a() {
            }
        }

        void a(String str);
    }

    public HttpLoggingInterceptor(a aVar) {
        o.e(aVar, "logger");
        this.f15455a = aVar;
        this.f15456b = L.e();
        this.f15457c = Level.NONE;
    }

    private final boolean b(s sVar) {
        String b4 = sVar.b(HttpRequest.HEADER_CONTENT_ENCODING);
        if (b4 != null && !kotlin.text.o.v(b4, "identity", true) && !kotlin.text.o.v(b4, HttpRequest.ENCODING_GZIP, true)) {
            return true;
        }
        return false;
    }

    private final void d(s sVar, int i4) {
        String str;
        if (this.f15456b.contains(sVar.c(i4))) {
            str = "██";
        } else {
            str = sVar.f(i4);
        }
        a aVar = this.f15455a;
        aVar.a(sVar.c(i4) + ": " + str);
    }

    public A a(u.a aVar) {
        boolean z3;
        boolean z4;
        String str;
        String str2;
        String str3;
        String str4;
        char c4;
        String str5;
        Charset charset;
        Long l4;
        Charset charset2;
        Throwable th;
        Charset charset3;
        u.a aVar2 = aVar;
        o.e(aVar2, "chain");
        Level level = this.f15457c;
        y a4 = aVar.a();
        if (level == Level.NONE) {
            return aVar2.b(a4);
        }
        if (level == Level.BODY) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 || level == Level.HEADERS) {
            z4 = true;
        } else {
            z4 = false;
        }
        z a5 = a4.a();
        i c5 = aVar.c();
        StringBuilder sb = new StringBuilder();
        sb.append("--> ");
        sb.append(a4.g());
        sb.append(' ');
        sb.append(a4.j());
        if (c5 != null) {
            str = o.k(" ", c5.a());
        } else {
            str = "";
        }
        sb.append(str);
        String sb2 = sb.toString();
        if (!z4 && a5 != null) {
            sb2 = sb2 + " (" + a5.a() + "-byte body)";
        }
        this.f15455a.a(sb2);
        if (z4) {
            s e4 = a4.e();
            if (a5 != null) {
                v b4 = a5.b();
                if (b4 != null && e4.b(HttpRequest.HEADER_CONTENT_TYPE) == null) {
                    this.f15455a.a(o.k("Content-Type: ", b4));
                }
                if (a5.a() != -1 && e4.b(HttpRequest.HEADER_CONTENT_LENGTH) == null) {
                    this.f15455a.a(o.k("Content-Length: ", Long.valueOf(a5.a())));
                }
            }
            int size = e4.size();
            for (int i4 = 0; i4 < size; i4++) {
                d(e4, i4);
            }
            if (!z3 || a5 == null) {
                this.f15455a.a(o.k("--> END ", a4.g()));
            } else if (b(a4.e())) {
                this.f15455a.a("--> END " + a4.g() + " (encoded body omitted)");
            } else if (a5.e()) {
                this.f15455a.a("--> END " + a4.g() + " (duplex request body omitted)");
            } else if (a5.f()) {
                this.f15455a.a("--> END " + a4.g() + " (one-shot body omitted)");
            } else {
                C0500b bVar = new C0500b();
                a5.g(bVar);
                v b5 = a5.b();
                if (b5 == null) {
                    charset3 = null;
                } else {
                    charset3 = b5.c(StandardCharsets.UTF_8);
                }
                if (charset3 == null) {
                    charset3 = StandardCharsets.UTF_8;
                    o.d(charset3, "UTF_8");
                }
                this.f15455a.a("");
                if (b3.a.a(bVar)) {
                    this.f15455a.a(bVar.n0(charset3));
                    this.f15455a.a("--> END " + a4.g() + " (" + a5.a() + "-byte body)");
                } else {
                    this.f15455a.a("--> END " + a4.g() + " (binary " + a5.a() + "-byte body omitted)");
                }
            }
        }
        long nanoTime = System.nanoTime();
        try {
            A b6 = aVar2.b(a4);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            B a6 = b6.a();
            o.b(a6);
            long e5 = a6.e();
            if (e5 != -1) {
                str2 = e5 + "-byte";
            } else {
                str2 = "unknown-length";
            }
            a aVar3 = this.f15455a;
            String str6 = "-byte body)";
            StringBuilder sb3 = new StringBuilder();
            long j4 = e5;
            sb3.append("<-- ");
            sb3.append(b6.m());
            if (b6.Q().length() == 0) {
                str3 = "-byte body omitted)";
                str4 = "";
                c4 = ' ';
            } else {
                String Q3 = b6.Q();
                StringBuilder sb4 = new StringBuilder();
                str3 = "-byte body omitted)";
                c4 = ' ';
                sb4.append(' ');
                sb4.append(Q3);
                str4 = sb4.toString();
            }
            sb3.append(str4);
            sb3.append(c4);
            sb3.append(b6.o0().j());
            sb3.append(" (");
            sb3.append(millis);
            sb3.append("ms");
            if (!z4) {
                str5 = ", " + str2 + " body";
            } else {
                str5 = "";
            }
            sb3.append(str5);
            sb3.append(')');
            aVar3.a(sb3.toString());
            if (z4) {
                s D3 = b6.D();
                int size2 = D3.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    d(D3, i5);
                }
                if (!z3 || !e.b(b6)) {
                    this.f15455a.a("<-- END HTTP");
                } else if (b(b6.D())) {
                    this.f15455a.a("<-- END HTTP (encoded body omitted)");
                } else {
                    d m4 = a6.m();
                    m4.s(Long.MAX_VALUE);
                    C0500b c6 = m4.c();
                    if (kotlin.text.o.v(HttpRequest.ENCODING_GZIP, D3.b(HttpRequest.HEADER_CONTENT_ENCODING), true)) {
                        l4 = Long.valueOf(c6.w0());
                        h hVar = new h(c6.clone());
                        try {
                            c6 = new C0500b();
                            c6.D0(hVar);
                            charset = null;
                            C0896b.a(hVar, (Throwable) null);
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            C0896b.a(hVar, th);
                            throw th3;
                        }
                    } else {
                        charset = null;
                        l4 = null;
                    }
                    v f4 = a6.f();
                    if (f4 == null) {
                        charset2 = charset;
                    } else {
                        charset2 = f4.c(StandardCharsets.UTF_8);
                    }
                    if (charset2 == null) {
                        charset2 = StandardCharsets.UTF_8;
                        o.d(charset2, "UTF_8");
                    }
                    if (!b3.a.a(c6)) {
                        this.f15455a.a("");
                        this.f15455a.a("<-- END HTTP (binary " + c6.w0() + str3);
                        return b6;
                    }
                    if (j4 != 0) {
                        this.f15455a.a("");
                        this.f15455a.a(c6.clone().n0(charset2));
                    }
                    if (l4 != null) {
                        this.f15455a.a("<-- END HTTP (" + c6.w0() + "-byte, " + l4 + "-gzipped-byte body)");
                    } else {
                        this.f15455a.a("<-- END HTTP (" + c6.w0() + str6);
                    }
                }
            }
            return b6;
        } catch (Exception e6) {
            Exception exc = e6;
            this.f15455a.a(o.k("<-- HTTP FAILED: ", exc));
            throw exc;
        }
    }

    public final void c(Level level) {
        o.e(level, "<set-?>");
        this.f15457c = level;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HttpLoggingInterceptor(a aVar, int i4, kotlin.jvm.internal.i iVar) {
        this((i4 & 1) != 0 ? a.f15460b : aVar);
    }
}
