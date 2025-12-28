package okhttp3;

import Q2.d;
import U2.f;
import com.silkimen.http.HttpRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.jvm.internal.o;
import okhttp3.s;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final t f15597a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15598b;

    /* renamed from: c  reason: collision with root package name */
    private final s f15599c;

    /* renamed from: d  reason: collision with root package name */
    private final z f15600d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f15601e;

    /* renamed from: f  reason: collision with root package name */
    private d f15602f;

    public y(t tVar, String str, s sVar, z zVar, Map map) {
        o.e(tVar, "url");
        o.e(str, "method");
        o.e(sVar, "headers");
        o.e(map, "tags");
        this.f15597a = tVar;
        this.f15598b = str;
        this.f15599c = sVar;
        this.f15600d = zVar;
        this.f15601e = map;
    }

    public final z a() {
        return this.f15600d;
    }

    public final d b() {
        d dVar = this.f15602f;
        if (dVar != null) {
            return dVar;
        }
        d b4 = d.f15173n.b(this.f15599c);
        this.f15602f = b4;
        return b4;
    }

    public final Map c() {
        return this.f15601e;
    }

    public final String d(String str) {
        o.e(str, "name");
        return this.f15599c.b(str);
    }

    public final s e() {
        return this.f15599c;
    }

    public final boolean f() {
        return this.f15597a.j();
    }

    public final String g() {
        return this.f15598b;
    }

    public final a h() {
        return new a(this);
    }

    public final Object i(Class cls) {
        o.e(cls, "type");
        return cls.cast(this.f15601e.get(cls));
    }

    public final t j() {
        return this.f15597a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(g());
        sb.append(", url=");
        sb.append(j());
        if (e().size() != 0) {
            sb.append(", headers=[");
            int i4 = 0;
            for (Object next : e()) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    C0718m.s();
                }
                Pair pair = (Pair) next;
                String str = (String) pair.component1();
                String str2 = (String) pair.component2();
                if (i4 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i4 = i5;
            }
            sb.append(']');
        }
        if (!c().isEmpty()) {
            sb.append(", tags=");
            sb.append(c());
        }
        sb.append('}');
        String sb2 = sb.toString();
        o.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private t f15603a;

        /* renamed from: b  reason: collision with root package name */
        private String f15604b;

        /* renamed from: c  reason: collision with root package name */
        private s.a f15605c;

        /* renamed from: d  reason: collision with root package name */
        private z f15606d;

        /* renamed from: e  reason: collision with root package name */
        private Map f15607e;

        public a() {
            this.f15607e = new LinkedHashMap();
            this.f15604b = HttpRequest.METHOD_GET;
            this.f15605c = new s.a();
        }

        public a a(String str, String str2) {
            o.e(str, "name");
            o.e(str2, "value");
            c().a(str, str2);
            return this;
        }

        public y b() {
            t tVar = this.f15603a;
            if (tVar != null) {
                return new y(tVar, this.f15604b, this.f15605c.f(), this.f15606d, d.T(this.f15607e));
            }
            throw new IllegalStateException("url == null");
        }

        public final s.a c() {
            return this.f15605c;
        }

        public final Map d() {
            return this.f15607e;
        }

        public a e(String str, String str2) {
            o.e(str, "name");
            o.e(str2, "value");
            c().i(str, str2);
            return this;
        }

        public a f(s sVar) {
            o.e(sVar, "headers");
            j(sVar.d());
            return this;
        }

        public a g(String str, z zVar) {
            o.e(str, "method");
            if (str.length() > 0) {
                if (zVar == null) {
                    if (f.d(str)) {
                        throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                    }
                } else if (!f.a(str)) {
                    throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
                }
                k(str);
                i(zVar);
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true");
        }

        public a h(String str) {
            o.e(str, "name");
            c().h(str);
            return this;
        }

        public final void i(z zVar) {
            this.f15606d = zVar;
        }

        public final void j(s.a aVar) {
            o.e(aVar, "<set-?>");
            this.f15605c = aVar;
        }

        public final void k(String str) {
            o.e(str, "<set-?>");
            this.f15604b = str;
        }

        public final void l(Map map) {
            o.e(map, "<set-?>");
            this.f15607e = map;
        }

        public final void m(t tVar) {
            this.f15603a = tVar;
        }

        public a n(Class cls, Object obj) {
            o.e(cls, "type");
            if (obj == null) {
                d().remove(cls);
            } else {
                if (d().isEmpty()) {
                    l(new LinkedHashMap());
                }
                Map d4 = d();
                Object cast = cls.cast(obj);
                o.b(cast);
                d4.put(cls, cast);
            }
            return this;
        }

        public a o(String str) {
            o.e(str, "url");
            if (kotlin.text.o.E(str, "ws:", true)) {
                String substring = str.substring(3);
                o.d(substring, "this as java.lang.String).substring(startIndex)");
                str = o.k("http:", substring);
            } else if (kotlin.text.o.E(str, "wss:", true)) {
                String substring2 = str.substring(4);
                o.d(substring2, "this as java.lang.String).substring(startIndex)");
                str = o.k("https:", substring2);
            }
            return p(t.f15488k.d(str));
        }

        public a p(t tVar) {
            o.e(tVar, "url");
            m(tVar);
            return this;
        }

        public a(y yVar) {
            Map map;
            o.e(yVar, "request");
            this.f15607e = new LinkedHashMap();
            this.f15603a = yVar.j();
            this.f15604b = yVar.g();
            this.f15606d = yVar.a();
            if (yVar.c().isEmpty()) {
                map = new LinkedHashMap();
            } else {
                map = D.s(yVar.c());
            }
            this.f15607e = map;
            this.f15605c = yVar.e().d();
        }
    }
}
