package retrofit2;

import c3.C0500b;
import c3.c;
import com.silkimen.http.HttpRequest;
import java.util.regex.Pattern;
import okhttp3.r;
import okhttp3.s;
import okhttp3.t;
import okhttp3.v;
import okhttp3.w;
import okhttp3.y;
import okhttp3.z;

final class H {

    /* renamed from: l  reason: collision with root package name */
    private static final char[] f16107l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m  reason: collision with root package name */
    private static final Pattern f16108m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a  reason: collision with root package name */
    private final String f16109a;

    /* renamed from: b  reason: collision with root package name */
    private final t f16110b;

    /* renamed from: c  reason: collision with root package name */
    private String f16111c;

    /* renamed from: d  reason: collision with root package name */
    private t.a f16112d;

    /* renamed from: e  reason: collision with root package name */
    private final y.a f16113e = new y.a();

    /* renamed from: f  reason: collision with root package name */
    private final s.a f16114f;

    /* renamed from: g  reason: collision with root package name */
    private v f16115g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f16116h;

    /* renamed from: i  reason: collision with root package name */
    private w.a f16117i;

    /* renamed from: j  reason: collision with root package name */
    private r.a f16118j;

    /* renamed from: k  reason: collision with root package name */
    private z f16119k;

    private static class a extends z {

        /* renamed from: b  reason: collision with root package name */
        private final z f16120b;

        /* renamed from: c  reason: collision with root package name */
        private final v f16121c;

        a(z zVar, v vVar) {
            this.f16120b = zVar;
            this.f16121c = vVar;
        }

        public long a() {
            return this.f16120b.a();
        }

        public v b() {
            return this.f16121c;
        }

        public void g(c cVar) {
            this.f16120b.g(cVar);
        }
    }

    H(String str, t tVar, String str2, s sVar, v vVar, boolean z3, boolean z4, boolean z5) {
        this.f16109a = str;
        this.f16110b = tVar;
        this.f16111c = str2;
        this.f16115g = vVar;
        this.f16116h = z3;
        if (sVar != null) {
            this.f16114f = sVar.d();
        } else {
            this.f16114f = new s.a();
        }
        if (z4) {
            this.f16118j = new r.a();
        } else if (z5) {
            w.a aVar = new w.a();
            this.f16117i = aVar;
            aVar.d(w.f15521l);
        }
    }

    private static String i(String str, boolean z3) {
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            int codePointAt = str.codePointAt(i4);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z3 && (codePointAt == 47 || codePointAt == 37))) {
                C0500b bVar = new C0500b();
                bVar.L0(str, 0, i4);
                j(bVar, str, i4, length, z3);
                return bVar.s0();
            }
            i4 += Character.charCount(codePointAt);
        }
        return str;
    }

    private static void j(C0500b bVar, String str, int i4, int i5, boolean z3) {
        C0500b bVar2 = null;
        while (i4 < i5) {
            int codePointAt = str.codePointAt(i4);
            if (!z3 || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z3 && (codePointAt == 47 || codePointAt == 37))) {
                    if (bVar2 == null) {
                        bVar2 = new C0500b();
                    }
                    bVar2.M0(codePointAt);
                    while (!bVar2.H()) {
                        byte readByte = bVar2.readByte();
                        bVar.I(37);
                        char[] cArr = f16107l;
                        bVar.I(cArr[((readByte & 255) >> 4) & 15]);
                        bVar.I(cArr[readByte & 15]);
                    }
                } else {
                    bVar.M0(codePointAt);
                }
            }
            i4 += Character.charCount(codePointAt);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, String str2, boolean z3) {
        if (z3) {
            this.f16118j.b(str, str2);
        } else {
            this.f16118j.a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(String str, String str2, boolean z3) {
        if (HttpRequest.HEADER_CONTENT_TYPE.equalsIgnoreCase(str)) {
            try {
                this.f16115g = v.e(str2);
            } catch (IllegalArgumentException e4) {
                throw new IllegalArgumentException("Malformed content type: " + str2, e4);
            }
        } else if (z3) {
            this.f16114f.e(str, str2);
        } else {
            this.f16114f.a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public void c(s sVar) {
        this.f16114f.b(sVar);
    }

    /* access modifiers changed from: package-private */
    public void d(s sVar, z zVar) {
        this.f16117i.a(sVar, zVar);
    }

    /* access modifiers changed from: package-private */
    public void e(w.c cVar) {
        this.f16117i.b(cVar);
    }

    /* access modifiers changed from: package-private */
    public void f(String str, String str2, boolean z3) {
        if (this.f16111c != null) {
            String i4 = i(str2, z3);
            String str3 = this.f16111c;
            String replace = str3.replace("{" + str + "}", i4);
            if (!f16108m.matcher(replace).matches()) {
                this.f16111c = replace;
                return;
            }
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    public void g(String str, String str2, boolean z3) {
        String str3 = this.f16111c;
        if (str3 != null) {
            t.a l4 = this.f16110b.l(str3);
            this.f16112d = l4;
            if (l4 != null) {
                this.f16111c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f16110b + ", Relative: " + this.f16111c);
            }
        }
        if (z3) {
            this.f16112d.a(str, str2);
        } else {
            this.f16112d.b(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public void h(Class cls, Object obj) {
        this.f16113e.n(cls, obj);
    }

    /* access modifiers changed from: package-private */
    public y.a k() {
        t tVar;
        t.a aVar = this.f16112d;
        if (aVar != null) {
            tVar = aVar.c();
        } else {
            tVar = this.f16110b.q(this.f16111c);
            if (tVar == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f16110b + ", Relative: " + this.f16111c);
            }
        }
        a aVar2 = this.f16119k;
        if (aVar2 == null) {
            r.a aVar3 = this.f16118j;
            if (aVar3 != null) {
                aVar2 = aVar3.c();
            } else {
                w.a aVar4 = this.f16117i;
                if (aVar4 != null) {
                    aVar2 = aVar4.c();
                } else if (this.f16116h) {
                    aVar2 = z.d((v) null, new byte[0]);
                }
            }
        }
        v vVar = this.f16115g;
        if (vVar != null) {
            if (aVar2 != null) {
                aVar2 = new a(aVar2, vVar);
            } else {
                this.f16114f.a(HttpRequest.HEADER_CONTENT_TYPE, vVar.toString());
            }
        }
        return this.f16113e.p(tVar).f(this.f16114f.f()).g(this.f16109a, aVar2);
    }

    /* access modifiers changed from: package-private */
    public void l(z zVar) {
        this.f16119k = zVar;
    }

    /* access modifiers changed from: package-private */
    public void m(Object obj) {
        this.f16111c = obj.toString();
    }
}
