package S2;

import Q2.d;
import U2.c;
import com.silkimen.http.HttpRequest;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import okhttp3.A;
import okhttp3.s;
import okhttp3.y;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f1439c = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final y f1440a;

    /* renamed from: b  reason: collision with root package name */
    private final A f1441b;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final boolean a(A a4, y yVar) {
            o.e(a4, "response");
            o.e(yVar, "request");
            int m4 = a4.m();
            if (!(m4 == 200 || m4 == 410 || m4 == 414 || m4 == 501 || m4 == 203 || m4 == 204)) {
                if (m4 != 307) {
                    if (!(m4 == 308 || m4 == 404 || m4 == 405)) {
                        switch (m4) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (A.A(a4, HttpRequest.HEADER_EXPIRES, (String) null, 2, (Object) null) == null && a4.e().d() == -1 && !a4.e().c() && !a4.e().b()) {
                    return false;
                }
            }
            if (a4.e().i() || yVar.b().i()) {
                return false;
            }
            return true;
        }

        private a() {
        }
    }

    /* renamed from: S2.b$b  reason: collision with other inner class name */
    public static final class C0026b {

        /* renamed from: a  reason: collision with root package name */
        private final long f1442a;

        /* renamed from: b  reason: collision with root package name */
        private final y f1443b;

        /* renamed from: c  reason: collision with root package name */
        private final A f1444c;

        /* renamed from: d  reason: collision with root package name */
        private Date f1445d;

        /* renamed from: e  reason: collision with root package name */
        private String f1446e;

        /* renamed from: f  reason: collision with root package name */
        private Date f1447f;

        /* renamed from: g  reason: collision with root package name */
        private String f1448g;

        /* renamed from: h  reason: collision with root package name */
        private Date f1449h;

        /* renamed from: i  reason: collision with root package name */
        private long f1450i;

        /* renamed from: j  reason: collision with root package name */
        private long f1451j;

        /* renamed from: k  reason: collision with root package name */
        private String f1452k;

        /* renamed from: l  reason: collision with root package name */
        private int f1453l = -1;

        public C0026b(long j4, y yVar, A a4) {
            o.e(yVar, "request");
            this.f1442a = j4;
            this.f1443b = yVar;
            this.f1444c = a4;
            if (a4 != null) {
                this.f1450i = a4.p0();
                this.f1451j = a4.j0();
                s D3 = a4.D();
                int size = D3.size();
                int i4 = 0;
                while (i4 < size) {
                    int i5 = i4 + 1;
                    String c4 = D3.c(i4);
                    String f4 = D3.f(i4);
                    if (kotlin.text.o.v(c4, HttpRequest.HEADER_DATE, true)) {
                        this.f1445d = c.a(f4);
                        this.f1446e = f4;
                    } else if (kotlin.text.o.v(c4, HttpRequest.HEADER_EXPIRES, true)) {
                        this.f1449h = c.a(f4);
                    } else if (kotlin.text.o.v(c4, HttpRequest.HEADER_LAST_MODIFIED, true)) {
                        this.f1447f = c.a(f4);
                        this.f1448g = f4;
                    } else if (kotlin.text.o.v(c4, HttpRequest.HEADER_ETAG, true)) {
                        this.f1452k = f4;
                    } else if (kotlin.text.o.v(c4, "Age", true)) {
                        this.f1453l = d.V(f4, -1);
                    }
                    i4 = i5;
                }
            }
        }

        private final long a() {
            Date date = this.f1445d;
            long j4 = 0;
            if (date != null) {
                j4 = Math.max(0, this.f1451j - date.getTime());
            }
            int i4 = this.f1453l;
            if (i4 != -1) {
                j4 = Math.max(j4, TimeUnit.SECONDS.toMillis((long) i4));
            }
            long j5 = this.f1451j;
            return j4 + (j5 - this.f1450i) + (this.f1442a - j5);
        }

        private final b c() {
            long j4;
            String str;
            if (this.f1444c == null) {
                return new b(this.f1443b, (A) null);
            }
            if (this.f1443b.f() && this.f1444c.v() == null) {
                return new b(this.f1443b, (A) null);
            }
            if (!b.f1439c.a(this.f1444c, this.f1443b)) {
                return new b(this.f1443b, (A) null);
            }
            okhttp3.d b4 = this.f1443b.b();
            if (b4.h() || e(this.f1443b)) {
                return new b(this.f1443b, (A) null);
            }
            okhttp3.d e4 = this.f1444c.e();
            long a4 = a();
            long d4 = d();
            if (b4.d() != -1) {
                d4 = Math.min(d4, TimeUnit.SECONDS.toMillis((long) b4.d()));
            }
            long j5 = 0;
            if (b4.f() != -1) {
                j4 = TimeUnit.SECONDS.toMillis((long) b4.f());
            } else {
                j4 = 0;
            }
            if (!e4.g() && b4.e() != -1) {
                j5 = TimeUnit.SECONDS.toMillis((long) b4.e());
            }
            if (!e4.h()) {
                long j6 = j4 + a4;
                if (j6 < j5 + d4) {
                    A.a b02 = this.f1444c.b0();
                    if (j6 >= d4) {
                        b02.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a4 > 86400000 && f()) {
                        b02.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new b((y) null, b02.c());
                }
            }
            String str2 = this.f1452k;
            if (str2 != null) {
                str = HttpRequest.HEADER_IF_NONE_MATCH;
            } else {
                if (this.f1447f != null) {
                    str2 = this.f1448g;
                } else if (this.f1445d == null) {
                    return new b(this.f1443b, (A) null);
                } else {
                    str2 = this.f1446e;
                }
                str = "If-Modified-Since";
            }
            s.a d5 = this.f1443b.e().d();
            o.b(str2);
            d5.d(str, str2);
            return new b(this.f1443b.h().f(d5.f()).b(), this.f1444c);
        }

        private final long d() {
            long j4;
            long j5;
            A a4 = this.f1444c;
            o.b(a4);
            okhttp3.d e4 = a4.e();
            if (e4.d() != -1) {
                return TimeUnit.SECONDS.toMillis((long) e4.d());
            }
            Date date = this.f1449h;
            Long l4 = null;
            if (date != null) {
                Date date2 = this.f1445d;
                if (date2 != null) {
                    l4 = Long.valueOf(date2.getTime());
                }
                if (l4 == null) {
                    j5 = this.f1451j;
                } else {
                    j5 = l4.longValue();
                }
                long time = date.getTime() - j5;
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f1447f == null || this.f1444c.o0().j().o() != null) {
                return 0;
            } else {
                Date date3 = this.f1445d;
                if (date3 != null) {
                    l4 = Long.valueOf(date3.getTime());
                }
                if (l4 == null) {
                    j4 = this.f1450i;
                } else {
                    j4 = l4.longValue();
                }
                Date date4 = this.f1447f;
                o.b(date4);
                long time2 = j4 - date4.getTime();
                if (time2 > 0) {
                    return time2 / ((long) 10);
                }
                return 0;
            }
        }

        private final boolean e(y yVar) {
            if (yVar.d("If-Modified-Since") == null && yVar.d(HttpRequest.HEADER_IF_NONE_MATCH) == null) {
                return false;
            }
            return true;
        }

        private final boolean f() {
            A a4 = this.f1444c;
            o.b(a4);
            if (a4.e().d() == -1 && this.f1449h == null) {
                return true;
            }
            return false;
        }

        public final b b() {
            b c4 = c();
            if (c4.b() == null || !this.f1443b.b().k()) {
                return c4;
            }
            return new b((y) null, (A) null);
        }
    }

    public b(y yVar, A a4) {
        this.f1440a = yVar;
        this.f1441b = a4;
    }

    public final A a() {
        return this.f1441b;
    }

    public final y b() {
        return this.f1440a;
    }
}
