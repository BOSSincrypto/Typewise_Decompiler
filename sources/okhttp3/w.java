package okhttp3;

import Q2.d;
import com.silkimen.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import okhttp3.v;
import okio.ByteString;

public final class w extends z {

    /* renamed from: g  reason: collision with root package name */
    public static final b f15516g = new b((i) null);

    /* renamed from: h  reason: collision with root package name */
    public static final v f15517h;

    /* renamed from: i  reason: collision with root package name */
    public static final v f15518i;

    /* renamed from: j  reason: collision with root package name */
    public static final v f15519j;

    /* renamed from: k  reason: collision with root package name */
    public static final v f15520k;

    /* renamed from: l  reason: collision with root package name */
    public static final v f15521l;

    /* renamed from: m  reason: collision with root package name */
    private static final byte[] f15522m = {58, 32};

    /* renamed from: n  reason: collision with root package name */
    private static final byte[] f15523n = {13, 10};

    /* renamed from: o  reason: collision with root package name */
    private static final byte[] f15524o = {45, 45};

    /* renamed from: b  reason: collision with root package name */
    private final ByteString f15525b;

    /* renamed from: c  reason: collision with root package name */
    private final v f15526c;

    /* renamed from: d  reason: collision with root package name */
    private final List f15527d;

    /* renamed from: e  reason: collision with root package name */
    private final v f15528e;

    /* renamed from: f  reason: collision with root package name */
    private long f15529f = -1;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final ByteString f15530a;

        /* renamed from: b  reason: collision with root package name */
        private v f15531b;

        /* renamed from: c  reason: collision with root package name */
        private final List f15532c;

        public a() {
            this((String) null, 1, (i) null);
        }

        public final a a(s sVar, z zVar) {
            o.e(zVar, "body");
            b(c.f15533c.a(sVar, zVar));
            return this;
        }

        public final a b(c cVar) {
            o.e(cVar, "part");
            this.f15532c.add(cVar);
            return this;
        }

        public final w c() {
            if (!this.f15532c.isEmpty()) {
                return new w(this.f15530a, this.f15531b, d.S(this.f15532c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        public final a d(v vVar) {
            o.e(vVar, "type");
            if (o.a(vVar.g(), "multipart")) {
                this.f15531b = vVar;
                return this;
            }
            throw new IllegalArgumentException(o.k("multipart != ", vVar).toString());
        }

        public a(String str) {
            o.e(str, "boundary");
            this.f15530a = ByteString.Companion.d(str);
            this.f15531b = w.f15517h;
            this.f15532c = new ArrayList();
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ a(java.lang.String r1, int r2, kotlin.jvm.internal.i r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L_0x0011
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "randomUUID().toString()"
                kotlin.jvm.internal.o.d(r1, r2)
            L_0x0011:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.w.a.<init>(java.lang.String, int, kotlin.jvm.internal.i):void");
        }
    }

    public static final class b {
        public /* synthetic */ b(i iVar) {
            this();
        }

        private b() {
        }
    }

    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        public static final a f15533c = new a((i) null);

        /* renamed from: a  reason: collision with root package name */
        private final s f15534a;

        /* renamed from: b  reason: collision with root package name */
        private final z f15535b;

        public static final class a {
            public /* synthetic */ a(i iVar) {
                this();
            }

            public final c a(s sVar, z zVar) {
                String str;
                String str2;
                o.e(zVar, "body");
                if (sVar == null) {
                    str = null;
                } else {
                    str = sVar.b(HttpRequest.HEADER_CONTENT_TYPE);
                }
                if (str == null) {
                    if (sVar == null) {
                        str2 = null;
                    } else {
                        str2 = sVar.b(HttpRequest.HEADER_CONTENT_LENGTH);
                    }
                    if (str2 == null) {
                        return new c(sVar, zVar, (i) null);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length");
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }

            private a() {
            }
        }

        public /* synthetic */ c(s sVar, z zVar, i iVar) {
            this(sVar, zVar);
        }

        public final z a() {
            return this.f15535b;
        }

        public final s b() {
            return this.f15534a;
        }

        private c(s sVar, z zVar) {
            this.f15534a = sVar;
            this.f15535b = zVar;
        }
    }

    static {
        v.a aVar = v.f15509e;
        f15517h = aVar.a("multipart/mixed");
        f15518i = aVar.a("multipart/alternative");
        f15519j = aVar.a("multipart/digest");
        f15520k = aVar.a("multipart/parallel");
        f15521l = aVar.a("multipart/form-data");
    }

    public w(ByteString byteString, v vVar, List list) {
        o.e(byteString, "boundaryByteString");
        o.e(vVar, "type");
        o.e(list, "parts");
        this.f15525b = byteString;
        this.f15526c = vVar;
        this.f15527d = list;
        v.a aVar = v.f15509e;
        this.f15528e = aVar.a(vVar + "; boundary=" + h());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: c3.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: c3.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: c3.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: c3.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: c3.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long i(c3.c r14, boolean r15) {
        /*
            r13 = this;
            if (r15 == 0) goto L_0x0009
            c3.b r14 = new c3.b
            r14.<init>()
            r0 = r14
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List r1 = r13.f15527d
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = r2
        L_0x0014:
            if (r5 >= r1) goto L_0x00b0
            int r6 = r5 + 1
            java.util.List r7 = r13.f15527d
            java.lang.Object r5 = r7.get(r5)
            okhttp3.w$c r5 = (okhttp3.w.c) r5
            okhttp3.s r7 = r5.b()
            okhttp3.z r5 = r5.a()
            kotlin.jvm.internal.o.b(r14)
            byte[] r8 = f15524o
            r14.O(r8)
            okio.ByteString r8 = r13.f15525b
            r14.P(r8)
            byte[] r8 = f15523n
            r14.O(r8)
            if (r7 == 0) goto L_0x0062
            int r8 = r7.size()
            r9 = r2
        L_0x0041:
            if (r9 >= r8) goto L_0x0062
            int r10 = r9 + 1
            java.lang.String r11 = r7.c(r9)
            c3.c r11 = r14.f0(r11)
            byte[] r12 = f15522m
            c3.c r11 = r11.O(r12)
            java.lang.String r9 = r7.f(r9)
            c3.c r9 = r11.f0(r9)
            byte[] r11 = f15523n
            r9.O(r11)
            r9 = r10
            goto L_0x0041
        L_0x0062:
            okhttp3.v r7 = r5.b()
            if (r7 == 0) goto L_0x007b
            java.lang.String r8 = "Content-Type: "
            c3.c r8 = r14.f0(r8)
            java.lang.String r7 = r7.toString()
            c3.c r7 = r8.f0(r7)
            byte[] r8 = f15523n
            r7.O(r8)
        L_0x007b:
            long r7 = r5.a()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0095
            java.lang.String r9 = "Content-Length: "
            c3.c r9 = r14.f0(r9)
            c3.c r9 = r9.h0(r7)
            byte[] r10 = f15523n
            r9.O(r10)
            goto L_0x009e
        L_0x0095:
            if (r15 == 0) goto L_0x009e
            kotlin.jvm.internal.o.b(r0)
            r0.o()
            return r9
        L_0x009e:
            byte[] r9 = f15523n
            r14.O(r9)
            if (r15 == 0) goto L_0x00a7
            long r3 = r3 + r7
            goto L_0x00aa
        L_0x00a7:
            r5.g(r14)
        L_0x00aa:
            r14.O(r9)
            r5 = r6
            goto L_0x0014
        L_0x00b0:
            kotlin.jvm.internal.o.b(r14)
            byte[] r1 = f15524o
            r14.O(r1)
            okio.ByteString r2 = r13.f15525b
            r14.P(r2)
            r14.O(r1)
            byte[] r1 = f15523n
            r14.O(r1)
            if (r15 == 0) goto L_0x00d2
            kotlin.jvm.internal.o.b(r0)
            long r14 = r0.w0()
            long r3 = r3 + r14
            r0.o()
        L_0x00d2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.w.i(c3.c, boolean):long");
    }

    public long a() {
        long j4 = this.f15529f;
        if (j4 != -1) {
            return j4;
        }
        long i4 = i((c3.c) null, true);
        this.f15529f = i4;
        return i4;
    }

    public v b() {
        return this.f15528e;
    }

    public void g(c3.c cVar) {
        o.e(cVar, "sink");
        i(cVar, false);
    }

    public final String h() {
        return this.f15525b.utf8();
    }
}
