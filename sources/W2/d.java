package W2;

import W2.f;
import c3.C0500b;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.o;
import l2.q;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.s;
import okio.ByteString;
import u2.C0906a;

public final class d implements Closeable {

    /* renamed from: G  reason: collision with root package name */
    public static final b f1736G = new b((kotlin.jvm.internal.i) null);
    /* access modifiers changed from: private */

    /* renamed from: H  reason: collision with root package name */
    public static final k f1737H;

    /* renamed from: A  reason: collision with root package name */
    private long f1738A;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public long f1739B;

    /* renamed from: C  reason: collision with root package name */
    private final Socket f1740C;

    /* renamed from: D  reason: collision with root package name */
    private final h f1741D;

    /* renamed from: E  reason: collision with root package name */
    private final C0034d f1742E;
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public final Set f1743F;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f1744a;

    /* renamed from: b  reason: collision with root package name */
    private final c f1745b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f1746c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private final String f1747d;

    /* renamed from: e  reason: collision with root package name */
    private int f1748e;

    /* renamed from: f  reason: collision with root package name */
    private int f1749f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f1750g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final T2.e f1751h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final T2.d f1752i;

    /* renamed from: j  reason: collision with root package name */
    private final T2.d f1753j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final T2.d f1754k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final j f1755l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public long f1756m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public long f1757n;

    /* renamed from: o  reason: collision with root package name */
    private long f1758o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public long f1759p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public long f1760q;

    /* renamed from: v  reason: collision with root package name */
    private long f1761v;

    /* renamed from: w  reason: collision with root package name */
    private final k f1762w;

    /* renamed from: x  reason: collision with root package name */
    private k f1763x;

    /* renamed from: y  reason: collision with root package name */
    private long f1764y;

    /* renamed from: z  reason: collision with root package name */
    private long f1765z;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1766a;

        /* renamed from: b  reason: collision with root package name */
        private final T2.e f1767b;

        /* renamed from: c  reason: collision with root package name */
        public Socket f1768c;

        /* renamed from: d  reason: collision with root package name */
        public String f1769d;

        /* renamed from: e  reason: collision with root package name */
        public c3.d f1770e;

        /* renamed from: f  reason: collision with root package name */
        public c3.c f1771f;

        /* renamed from: g  reason: collision with root package name */
        private c f1772g = c.f1776b;

        /* renamed from: h  reason: collision with root package name */
        private j f1773h = j.f1901b;

        /* renamed from: i  reason: collision with root package name */
        private int f1774i;

        public a(boolean z3, T2.e eVar) {
            o.e(eVar, "taskRunner");
            this.f1766a = z3;
            this.f1767b = eVar;
        }

        public final d a() {
            return new d(this);
        }

        public final boolean b() {
            return this.f1766a;
        }

        public final String c() {
            String str = this.f1769d;
            if (str != null) {
                return str;
            }
            o.p("connectionName");
            return null;
        }

        public final c d() {
            return this.f1772g;
        }

        public final int e() {
            return this.f1774i;
        }

        public final j f() {
            return this.f1773h;
        }

        public final c3.c g() {
            c3.c cVar = this.f1771f;
            if (cVar != null) {
                return cVar;
            }
            o.p("sink");
            return null;
        }

        public final Socket h() {
            Socket socket = this.f1768c;
            if (socket != null) {
                return socket;
            }
            o.p("socket");
            return null;
        }

        public final c3.d i() {
            c3.d dVar = this.f1770e;
            if (dVar != null) {
                return dVar;
            }
            o.p("source");
            return null;
        }

        public final T2.e j() {
            return this.f1767b;
        }

        public final a k(c cVar) {
            o.e(cVar, "listener");
            n(cVar);
            return this;
        }

        public final a l(int i4) {
            o(i4);
            return this;
        }

        public final void m(String str) {
            o.e(str, "<set-?>");
            this.f1769d = str;
        }

        public final void n(c cVar) {
            o.e(cVar, "<set-?>");
            this.f1772g = cVar;
        }

        public final void o(int i4) {
            this.f1774i = i4;
        }

        public final void p(c3.c cVar) {
            o.e(cVar, "<set-?>");
            this.f1771f = cVar;
        }

        public final void q(Socket socket) {
            o.e(socket, "<set-?>");
            this.f1768c = socket;
        }

        public final void r(c3.d dVar) {
            o.e(dVar, "<set-?>");
            this.f1770e = dVar;
        }

        public final a s(Socket socket, String str, c3.d dVar, c3.c cVar) {
            String str2;
            o.e(socket, "socket");
            o.e(str, "peerName");
            o.e(dVar, "source");
            o.e(cVar, "sink");
            q(socket);
            if (b()) {
                str2 = Q2.d.f1354i + ' ' + str;
            } else {
                str2 = o.k("MockWebServer ", str);
            }
            m(str2);
            r(dVar);
            p(cVar);
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final k a() {
            return d.f1737H;
        }

        private b() {
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f1775a = new b((kotlin.jvm.internal.i) null);

        /* renamed from: b  reason: collision with root package name */
        public static final c f1776b = new a();

        public static final class a extends c {
            a() {
            }

            public void c(g gVar) {
                o.e(gVar, "stream");
                gVar.d(ErrorCode.REFUSED_STREAM, (IOException) null);
            }
        }

        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.i iVar) {
                this();
            }

            private b() {
            }
        }

        public void b(d dVar, k kVar) {
            o.e(dVar, "connection");
            o.e(kVar, "settings");
        }

        public abstract void c(g gVar);
    }

    /* renamed from: W2.d$d  reason: collision with other inner class name */
    public final class C0034d implements f.c, C0906a {

        /* renamed from: a  reason: collision with root package name */
        private final f f1777a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f1778b;

        /* renamed from: W2.d$d$a */
        public static final class a extends T2.a {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f1779e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ boolean f1780f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ d f1781g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ Ref$ObjectRef f1782h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z3, d dVar, Ref$ObjectRef ref$ObjectRef) {
                super(str, z3);
                this.f1779e = str;
                this.f1780f = z3;
                this.f1781g = dVar;
                this.f1782h = ref$ObjectRef;
            }

            public long f() {
                this.f1781g.u0().b(this.f1781g, (k) this.f1782h.element);
                return -1;
            }
        }

        /* renamed from: W2.d$d$b */
        public static final class b extends T2.a {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f1783e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ boolean f1784f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ d f1785g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ g f1786h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z3, d dVar, g gVar) {
                super(str, z3);
                this.f1783e = str;
                this.f1784f = z3;
                this.f1785g = dVar;
                this.f1786h = gVar;
            }

            public long f() {
                try {
                    this.f1785g.u0().c(this.f1786h);
                    return -1;
                } catch (IOException e4) {
                    X2.k.f1971a.g().j(o.k("Http2Connection.Listener failure for ", this.f1785g.s0()), 4, e4);
                    try {
                        this.f1786h.d(ErrorCode.PROTOCOL_ERROR, e4);
                        return -1;
                    } catch (IOException unused) {
                        return -1;
                    }
                }
            }
        }

        /* renamed from: W2.d$d$c */
        public static final class c extends T2.a {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f1787e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ boolean f1788f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ d f1789g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ int f1790h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ int f1791i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z3, d dVar, int i4, int i5) {
                super(str, z3);
                this.f1787e = str;
                this.f1788f = z3;
                this.f1789g = dVar;
                this.f1790h = i4;
                this.f1791i = i5;
            }

            public long f() {
                this.f1789g.X0(true, this.f1790h, this.f1791i);
                return -1;
            }
        }

        /* renamed from: W2.d$d$d  reason: collision with other inner class name */
        public static final class C0035d extends T2.a {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f1792e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ boolean f1793f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C0034d f1794g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ boolean f1795h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ k f1796i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0035d(String str, boolean z3, C0034d dVar, boolean z4, k kVar) {
                super(str, z3);
                this.f1792e = str;
                this.f1793f = z3;
                this.f1794g = dVar;
                this.f1795h = z4;
                this.f1796i = kVar;
            }

            public long f() {
                this.f1794g.k(this.f1795h, this.f1796i);
                return -1;
            }
        }

        public C0034d(d dVar, f fVar) {
            o.e(dVar, "this$0");
            o.e(fVar, "reader");
            this.f1778b = dVar;
            this.f1777a = fVar;
        }

        public void a() {
        }

        public void b(boolean z3, int i4, int i5) {
            if (z3) {
                d dVar = this.f1778b;
                synchronized (dVar) {
                    if (i4 == 1) {
                        dVar.f1757n = dVar.f1757n + 1;
                    } else if (i4 != 2) {
                        if (i4 == 3) {
                            dVar.f1760q = dVar.f1760q + 1;
                            dVar.notifyAll();
                        }
                        try {
                            q qVar = q.f14567a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else {
                        dVar.f1759p = dVar.f1759p + 1;
                    }
                }
                return;
            }
            this.f1778b.f1752i.i(new c(o.k(this.f1778b.s0(), " ping"), true, this.f1778b, i4, i5), 0);
        }

        public void c(int i4, int i5, int i6, boolean z3) {
        }

        public void d(int i4, ErrorCode errorCode) {
            o.e(errorCode, "errorCode");
            if (this.f1778b.L0(i4)) {
                this.f1778b.K0(i4, errorCode);
                return;
            }
            g M02 = this.f1778b.M0(i4);
            if (M02 != null) {
                M02.y(errorCode);
            }
        }

        public void e(boolean z3, int i4, c3.d dVar, int i5) {
            o.e(dVar, "source");
            if (this.f1778b.L0(i4)) {
                this.f1778b.H0(i4, dVar, i5, z3);
                return;
            }
            g z02 = this.f1778b.z0(i4);
            if (z02 == null) {
                this.f1778b.Z0(i4, ErrorCode.PROTOCOL_ERROR);
                long j4 = (long) i5;
                this.f1778b.U0(j4);
                dVar.b(j4);
                return;
            }
            z02.w(dVar, i5);
            if (z3) {
                z02.x(Q2.d.f1347b, true);
            }
        }

        public void f(boolean z3, k kVar) {
            o.e(kVar, "settings");
            this.f1778b.f1752i.i(new C0035d(o.k(this.f1778b.s0(), " applyAndAckSettings"), true, this, z3, kVar), 0);
        }

        public void g(boolean z3, int i4, int i5, List list) {
            o.e(list, "headerBlock");
            if (this.f1778b.L0(i4)) {
                this.f1778b.I0(i4, list, z3);
                return;
            }
            d dVar = this.f1778b;
            synchronized (dVar) {
                g z02 = dVar.z0(i4);
                if (z02 != null) {
                    q qVar = q.f14567a;
                    z02.x(Q2.d.P(list), z3);
                } else if (!dVar.f1750g) {
                    if (i4 > dVar.t0()) {
                        if (i4 % 2 != dVar.v0() % 2) {
                            g gVar = new g(i4, dVar, false, z3, Q2.d.P(list));
                            dVar.O0(i4);
                            dVar.A0().put(Integer.valueOf(i4), gVar);
                            T2.d i6 = dVar.f1751h.i();
                            i6.i(new b(dVar.s0() + '[' + i4 + "] onStream", true, dVar, gVar), 0);
                        }
                    }
                }
            }
        }

        public void h(int i4, long j4) {
            if (i4 == 0) {
                d dVar = this.f1778b;
                synchronized (dVar) {
                    dVar.f1739B = dVar.B0() + j4;
                    dVar.notifyAll();
                    q qVar = q.f14567a;
                }
                return;
            }
            g z02 = this.f1778b.z0(i4);
            if (z02 != null) {
                synchronized (z02) {
                    z02.a(j4);
                    q qVar2 = q.f14567a;
                }
            }
        }

        public void i(int i4, int i5, List list) {
            o.e(list, "requestHeaders");
            this.f1778b.J0(i5, list);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            l();
            return q.f14567a;
        }

        public void j(int i4, ErrorCode errorCode, ByteString byteString) {
            int i5;
            Object[] array;
            o.e(errorCode, "errorCode");
            o.e(byteString, "debugData");
            byteString.size();
            d dVar = this.f1778b;
            synchronized (dVar) {
                i5 = 0;
                array = dVar.A0().values().toArray(new g[0]);
                if (array != null) {
                    dVar.f1750g = true;
                    q qVar = q.f14567a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
            }
            g[] gVarArr = (g[]) array;
            int length = gVarArr.length;
            while (i5 < length) {
                g gVar = gVarArr[i5];
                i5++;
                if (gVar.j() > i4 && gVar.t()) {
                    gVar.y(ErrorCode.REFUSED_STREAM);
                    this.f1778b.M0(gVar.j());
                }
            }
        }

        public final void k(boolean z3, T t4) {
            long c4;
            int i4;
            g[] gVarArr;
            o.e(t4, "settings");
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            h D02 = this.f1778b.D0();
            d dVar = this.f1778b;
            synchronized (D02) {
                synchronized (dVar) {
                    try {
                        k x02 = dVar.x0();
                        if (!z3) {
                            T kVar = new k();
                            kVar.g(x02);
                            kVar.g(t4);
                            t4 = kVar;
                        }
                        ref$ObjectRef.element = t4;
                        c4 = ((long) t4.c()) - ((long) x02.c());
                        i4 = 0;
                        if (c4 != 0) {
                            if (!dVar.A0().isEmpty()) {
                                Object[] array = dVar.A0().values().toArray(new g[0]);
                                if (array != null) {
                                    gVarArr = (g[]) array;
                                    dVar.Q0((k) ref$ObjectRef.element);
                                    dVar.f1754k.i(new a(o.k(dVar.s0(), " onSettings"), true, dVar, ref$ObjectRef), 0);
                                    q qVar = q.f14567a;
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                }
                            }
                        }
                        gVarArr = null;
                        dVar.Q0((k) ref$ObjectRef.element);
                        dVar.f1754k.i(new a(o.k(dVar.s0(), " onSettings"), true, dVar, ref$ObjectRef), 0);
                        q qVar2 = q.f14567a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    dVar.D0().a((k) ref$ObjectRef.element);
                } catch (IOException e4) {
                    dVar.q0(e4);
                }
                q qVar3 = q.f14567a;
            }
            if (gVarArr != null) {
                int length = gVarArr.length;
                while (i4 < length) {
                    g gVar = gVarArr[i4];
                    i4++;
                    synchronized (gVar) {
                        gVar.a(c4);
                        q qVar4 = q.f14567a;
                    }
                }
            }
        }

        public void l() {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            e = null;
            try {
                this.f1777a.f(this);
                while (this.f1777a.e(false, this)) {
                }
                errorCode = ErrorCode.NO_ERROR;
                try {
                    this.f1778b.p0(errorCode, ErrorCode.CANCEL, (IOException) null);
                } catch (IOException e4) {
                    e = e4;
                    try {
                        ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                        this.f1778b.p0(errorCode3, errorCode3, e);
                        Q2.d.m(this.f1777a);
                    } catch (Throwable th) {
                        th = th;
                        this.f1778b.p0(errorCode, errorCode2, e);
                        Q2.d.m(this.f1777a);
                        throw th;
                    }
                }
            } catch (IOException e5) {
                e = e5;
                errorCode = errorCode2;
                ErrorCode errorCode32 = ErrorCode.PROTOCOL_ERROR;
                this.f1778b.p0(errorCode32, errorCode32, e);
                Q2.d.m(this.f1777a);
            } catch (Throwable th2) {
                th = th2;
                errorCode = errorCode2;
                this.f1778b.p0(errorCode, errorCode2, e);
                Q2.d.m(this.f1777a);
                throw th;
            }
            Q2.d.m(this.f1777a);
        }
    }

    public static final class e extends T2.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f1797e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f1798f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f1799g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f1800h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C0500b f1801i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f1802j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ boolean f1803k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z3, d dVar, int i4, C0500b bVar, int i5, boolean z4) {
            super(str, z3);
            this.f1797e = str;
            this.f1798f = z3;
            this.f1799g = dVar;
            this.f1800h = i4;
            this.f1801i = bVar;
            this.f1802j = i5;
            this.f1803k = z4;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long f() {
            /*
                r5 = this;
                W2.d r0 = r5.f1799g     // Catch:{ IOException -> 0x003e }
                W2.j r0 = r0.f1755l     // Catch:{ IOException -> 0x003e }
                int r1 = r5.f1800h     // Catch:{ IOException -> 0x003e }
                c3.b r2 = r5.f1801i     // Catch:{ IOException -> 0x003e }
                int r3 = r5.f1802j     // Catch:{ IOException -> 0x003e }
                boolean r4 = r5.f1803k     // Catch:{ IOException -> 0x003e }
                boolean r0 = r0.c(r1, r2, r3, r4)     // Catch:{ IOException -> 0x003e }
                if (r0 == 0) goto L_0x0021
                W2.d r1 = r5.f1799g     // Catch:{ IOException -> 0x003e }
                W2.h r1 = r1.D0()     // Catch:{ IOException -> 0x003e }
                int r2 = r5.f1800h     // Catch:{ IOException -> 0x003e }
                okhttp3.internal.http2.ErrorCode r3 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ IOException -> 0x003e }
                r1.G(r2, r3)     // Catch:{ IOException -> 0x003e }
            L_0x0021:
                if (r0 != 0) goto L_0x0027
                boolean r0 = r5.f1803k     // Catch:{ IOException -> 0x003e }
                if (r0 == 0) goto L_0x003e
            L_0x0027:
                W2.d r0 = r5.f1799g     // Catch:{ IOException -> 0x003e }
                monitor-enter(r0)     // Catch:{ IOException -> 0x003e }
                W2.d r1 = r5.f1799g     // Catch:{ all -> 0x003b }
                java.util.Set r1 = r1.f1743F     // Catch:{ all -> 0x003b }
                int r2 = r5.f1800h     // Catch:{ all -> 0x003b }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x003b }
                r1.remove(r2)     // Catch:{ all -> 0x003b }
                monitor-exit(r0)     // Catch:{ IOException -> 0x003e }
                goto L_0x003e
            L_0x003b:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ IOException -> 0x003e }
                throw r1     // Catch:{ IOException -> 0x003e }
            L_0x003e:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: W2.d.e.f():long");
        }
    }

    public static final class f extends T2.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f1804e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f1805f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f1806g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f1807h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ List f1808i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f1809j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z3, d dVar, int i4, List list, boolean z4) {
            super(str, z3);
            this.f1804e = str;
            this.f1805f = z3;
            this.f1806g = dVar;
            this.f1807h = i4;
            this.f1808i = list;
            this.f1809j = z4;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long f() {
            /*
                r4 = this;
                W2.d r0 = r4.f1806g
                W2.j r0 = r0.f1755l
                int r1 = r4.f1807h
                java.util.List r2 = r4.f1808i
                boolean r3 = r4.f1809j
                boolean r0 = r0.b(r1, r2, r3)
                if (r0 == 0) goto L_0x001f
                W2.d r1 = r4.f1806g     // Catch:{ IOException -> 0x003c }
                W2.h r1 = r1.D0()     // Catch:{ IOException -> 0x003c }
                int r2 = r4.f1807h     // Catch:{ IOException -> 0x003c }
                okhttp3.internal.http2.ErrorCode r3 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ IOException -> 0x003c }
                r1.G(r2, r3)     // Catch:{ IOException -> 0x003c }
            L_0x001f:
                if (r0 != 0) goto L_0x0025
                boolean r0 = r4.f1809j     // Catch:{ IOException -> 0x003c }
                if (r0 == 0) goto L_0x003c
            L_0x0025:
                W2.d r0 = r4.f1806g     // Catch:{ IOException -> 0x003c }
                monitor-enter(r0)     // Catch:{ IOException -> 0x003c }
                W2.d r1 = r4.f1806g     // Catch:{ all -> 0x0039 }
                java.util.Set r1 = r1.f1743F     // Catch:{ all -> 0x0039 }
                int r2 = r4.f1807h     // Catch:{ all -> 0x0039 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0039 }
                r1.remove(r2)     // Catch:{ all -> 0x0039 }
                monitor-exit(r0)     // Catch:{ IOException -> 0x003c }
                goto L_0x003c
            L_0x0039:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ IOException -> 0x003c }
                throw r1     // Catch:{ IOException -> 0x003c }
            L_0x003c:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: W2.d.f.f():long");
        }
    }

    public static final class g extends T2.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f1810e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f1811f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f1812g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f1813h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ List f1814i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z3, d dVar, int i4, List list) {
            super(str, z3);
            this.f1810e = str;
            this.f1811f = z3;
            this.f1812g = dVar;
            this.f1813h = i4;
            this.f1814i = list;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long f() {
            /*
                r3 = this;
                W2.d r0 = r3.f1812g
                W2.j r0 = r0.f1755l
                int r1 = r3.f1813h
                java.util.List r2 = r3.f1814i
                boolean r0 = r0.a(r1, r2)
                if (r0 == 0) goto L_0x0034
                W2.d r0 = r3.f1812g     // Catch:{ IOException -> 0x0034 }
                W2.h r0 = r0.D0()     // Catch:{ IOException -> 0x0034 }
                int r1 = r3.f1813h     // Catch:{ IOException -> 0x0034 }
                okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ IOException -> 0x0034 }
                r0.G(r1, r2)     // Catch:{ IOException -> 0x0034 }
                W2.d r0 = r3.f1812g     // Catch:{ IOException -> 0x0034 }
                monitor-enter(r0)     // Catch:{ IOException -> 0x0034 }
                W2.d r1 = r3.f1812g     // Catch:{ all -> 0x0031 }
                java.util.Set r1 = r1.f1743F     // Catch:{ all -> 0x0031 }
                int r2 = r3.f1813h     // Catch:{ all -> 0x0031 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0031 }
                r1.remove(r2)     // Catch:{ all -> 0x0031 }
                monitor-exit(r0)     // Catch:{ IOException -> 0x0034 }
                goto L_0x0034
            L_0x0031:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ IOException -> 0x0034 }
                throw r1     // Catch:{ IOException -> 0x0034 }
            L_0x0034:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: W2.d.g.f():long");
        }
    }

    public static final class h extends T2.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f1815e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f1816f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f1817g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f1818h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ErrorCode f1819i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z3, d dVar, int i4, ErrorCode errorCode) {
            super(str, z3);
            this.f1815e = str;
            this.f1816f = z3;
            this.f1817g = dVar;
            this.f1818h = i4;
            this.f1819i = errorCode;
        }

        public long f() {
            this.f1817g.f1755l.d(this.f1818h, this.f1819i);
            synchronized (this.f1817g) {
                this.f1817g.f1743F.remove(Integer.valueOf(this.f1818h));
                q qVar = q.f14567a;
            }
            return -1;
        }
    }

    public static final class i extends T2.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f1820e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f1821f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f1822g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z3, d dVar) {
            super(str, z3);
            this.f1820e = str;
            this.f1821f = z3;
            this.f1822g = dVar;
        }

        public long f() {
            this.f1822g.X0(false, 2, 0);
            return -1;
        }
    }

    public static final class j extends T2.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f1823e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d f1824f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f1825g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(String str, d dVar, long j4) {
            super(str, false, 2, (kotlin.jvm.internal.i) null);
            this.f1823e = str;
            this.f1824f = dVar;
            this.f1825g = j4;
        }

        public long f() {
            boolean z3;
            synchronized (this.f1824f) {
                if (this.f1824f.f1757n < this.f1824f.f1756m) {
                    z3 = true;
                } else {
                    this.f1824f.f1756m = this.f1824f.f1756m + 1;
                    z3 = false;
                }
            }
            if (z3) {
                this.f1824f.q0((IOException) null);
                return -1;
            }
            this.f1824f.X0(false, 1, 0);
            return this.f1825g;
        }
    }

    public static final class k extends T2.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f1826e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f1827f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f1828g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f1829h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ErrorCode f1830i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z3, d dVar, int i4, ErrorCode errorCode) {
            super(str, z3);
            this.f1826e = str;
            this.f1827f = z3;
            this.f1828g = dVar;
            this.f1829h = i4;
            this.f1830i = errorCode;
        }

        public long f() {
            try {
                this.f1828g.Y0(this.f1829h, this.f1830i);
                return -1;
            } catch (IOException e4) {
                this.f1828g.q0(e4);
                return -1;
            }
        }
    }

    public static final class l extends T2.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f1831e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f1832f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f1833g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f1834h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ long f1835i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z3, d dVar, int i4, long j4) {
            super(str, z3);
            this.f1831e = str;
            this.f1832f = z3;
            this.f1833g = dVar;
            this.f1834h = i4;
            this.f1835i = j4;
        }

        public long f() {
            try {
                this.f1833g.D0().R(this.f1834h, this.f1835i);
                return -1;
            } catch (IOException e4) {
                this.f1833g.q0(e4);
                return -1;
            }
        }
    }

    static {
        k kVar = new k();
        kVar.h(7, 65535);
        kVar.h(5, 16384);
        f1737H = kVar;
    }

    public d(a aVar) {
        int i4;
        o.e(aVar, "builder");
        boolean b4 = aVar.b();
        this.f1744a = b4;
        this.f1745b = aVar.d();
        String c4 = aVar.c();
        this.f1747d = c4;
        if (aVar.b()) {
            i4 = 3;
        } else {
            i4 = 2;
        }
        this.f1749f = i4;
        T2.e j4 = aVar.j();
        this.f1751h = j4;
        T2.d i5 = j4.i();
        this.f1752i = i5;
        this.f1753j = j4.i();
        this.f1754k = j4.i();
        this.f1755l = aVar.f();
        k kVar = new k();
        if (aVar.b()) {
            kVar.h(7, 16777216);
        }
        this.f1762w = kVar;
        k kVar2 = f1737H;
        this.f1763x = kVar2;
        this.f1739B = (long) kVar2.c();
        this.f1740C = aVar.h();
        this.f1741D = new h(aVar.g(), b4);
        this.f1742E = new C0034d(this, new f(aVar.i(), b4));
        this.f1743F = new LinkedHashSet();
        if (aVar.e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) aVar.e());
            i5.i(new j(o.k(c4, " ping"), this, nanos), nanos);
        }
    }

    private final g F0(int i4, List list, boolean z3) {
        int v02;
        g gVar;
        boolean z4 = true;
        boolean z5 = !z3;
        synchronized (this.f1741D) {
            try {
                synchronized (this) {
                    if (v0() > 1073741823) {
                        R0(ErrorCode.REFUSED_STREAM);
                    }
                    if (!this.f1750g) {
                        v02 = v0();
                        P0(v0() + 2);
                        gVar = new g(v02, this, z5, false, (s) null);
                        if (z3 && C0() < B0()) {
                            if (gVar.r() < gVar.q()) {
                                z4 = false;
                            }
                        }
                        if (gVar.u()) {
                            A0().put(Integer.valueOf(v02), gVar);
                        }
                        q qVar = q.f14567a;
                    } else {
                        throw new ConnectionShutdownException();
                    }
                }
                if (i4 == 0) {
                    D0().v(z5, v02, list);
                } else if (!r0()) {
                    D0().D(i4, v02, list);
                } else {
                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                }
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (z4) {
            this.f1741D.flush();
        }
        return gVar;
    }

    public static /* synthetic */ void T0(d dVar, boolean z3, T2.e eVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = true;
        }
        if ((i4 & 2) != 0) {
            eVar = T2.e.f1472i;
        }
        dVar.S0(z3, eVar);
    }

    /* access modifiers changed from: private */
    public final void q0(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        p0(errorCode, errorCode, iOException);
    }

    public final Map A0() {
        return this.f1746c;
    }

    public final long B0() {
        return this.f1739B;
    }

    public final long C0() {
        return this.f1738A;
    }

    public final h D0() {
        return this.f1741D;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001b, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean E0(long r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f1750g     // Catch:{ all -> 0x0018 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r6)
            return r1
        L_0x0008:
            long r2 = r6.f1759p     // Catch:{ all -> 0x0018 }
            long r4 = r6.f1758o     // Catch:{ all -> 0x0018 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x001a
            long r2 = r6.f1761v     // Catch:{ all -> 0x0018 }
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x001a
            monitor-exit(r6)
            return r1
        L_0x0018:
            r7 = move-exception
            goto L_0x001d
        L_0x001a:
            monitor-exit(r6)
            r7 = 1
            return r7
        L_0x001d:
            monitor-exit(r6)     // Catch:{ all -> 0x0018 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: W2.d.E0(long):boolean");
    }

    public final g G0(List list, boolean z3) {
        o.e(list, "requestHeaders");
        return F0(0, list, z3);
    }

    public final void H0(int i4, c3.d dVar, int i5, boolean z3) {
        o.e(dVar, "source");
        C0500b bVar = new C0500b();
        long j4 = (long) i5;
        dVar.d0(j4);
        dVar.N(bVar, j4);
        T2.d dVar2 = this.f1753j;
        dVar2.i(new e(this.f1747d + '[' + i4 + "] onData", true, this, i4, bVar, i5, z3), 0);
    }

    public final void I0(int i4, List list, boolean z3) {
        o.e(list, "requestHeaders");
        T2.d dVar = this.f1753j;
        dVar.i(new f(this.f1747d + '[' + i4 + "] onHeaders", true, this, i4, list, z3), 0);
    }

    public final void J0(int i4, List list) {
        o.e(list, "requestHeaders");
        synchronized (this) {
            if (this.f1743F.contains(Integer.valueOf(i4))) {
                Z0(i4, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.f1743F.add(Integer.valueOf(i4));
            T2.d dVar = this.f1753j;
            dVar.i(new g(this.f1747d + '[' + i4 + "] onRequest", true, this, i4, list), 0);
        }
    }

    public final void K0(int i4, ErrorCode errorCode) {
        o.e(errorCode, "errorCode");
        T2.d dVar = this.f1753j;
        dVar.i(new h(this.f1747d + '[' + i4 + "] onReset", true, this, i4, errorCode), 0);
    }

    public final boolean L0(int i4) {
        if (i4 == 0 || (i4 & 1) != 0) {
            return false;
        }
        return true;
    }

    public final synchronized g M0(int i4) {
        g gVar;
        gVar = (g) this.f1746c.remove(Integer.valueOf(i4));
        notifyAll();
        return gVar;
    }

    public final void N0() {
        synchronized (this) {
            long j4 = this.f1759p;
            long j5 = this.f1758o;
            if (j4 >= j5) {
                this.f1758o = j5 + 1;
                this.f1761v = System.nanoTime() + ((long) 1000000000);
                q qVar = q.f14567a;
                this.f1752i.i(new i(o.k(this.f1747d, " ping"), true, this), 0);
            }
        }
    }

    public final void O0(int i4) {
        this.f1748e = i4;
    }

    public final void P0(int i4) {
        this.f1749f = i4;
    }

    public final void Q0(k kVar) {
        o.e(kVar, "<set-?>");
        this.f1763x = kVar;
    }

    public final void R0(ErrorCode errorCode) {
        o.e(errorCode, "statusCode");
        synchronized (this.f1741D) {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            synchronized (this) {
                if (!this.f1750g) {
                    this.f1750g = true;
                    ref$IntRef.element = t0();
                    q qVar = q.f14567a;
                    D0().o(ref$IntRef.element, errorCode, Q2.d.f1346a);
                }
            }
        }
    }

    public final void S0(boolean z3, T2.e eVar) {
        o.e(eVar, "taskRunner");
        if (z3) {
            this.f1741D.e();
            this.f1741D.Q(this.f1762w);
            int c4 = this.f1762w.c();
            if (c4 != 65535) {
                this.f1741D.R(0, (long) (c4 - 65535));
            }
        }
        eVar.i().i(new T2.c(this.f1747d, true, this.f1742E), 0);
    }

    public final synchronized void U0(long j4) {
        long j5 = this.f1764y + j4;
        this.f1764y = j5;
        long j6 = j5 - this.f1765z;
        if (j6 >= ((long) (this.f1762w.c() / 2))) {
            a1(0, j6);
            this.f1765z += j6;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, B0() - C0()), D0().y());
        r6 = (long) r2;
        r8.f1738A = C0() + r6;
        r4 = l2.q.f14567a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007b, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void V0(int r9, boolean r10, c3.C0500b r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            W2.h r12 = r8.f1741D
            r12.f(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x007e
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.C0()     // Catch:{ InterruptedException -> 0x006f }
            long r6 = r8.B0()     // Catch:{ InterruptedException -> 0x006f }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x003a
            java.util.Map r2 = r8.A0()     // Catch:{ InterruptedException -> 0x006f }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x006f }
            boolean r2 = r2.containsKey(r4)     // Catch:{ InterruptedException -> 0x006f }
            if (r2 == 0) goto L_0x0032
            r8.wait()     // Catch:{ InterruptedException -> 0x006f }
            goto L_0x0012
        L_0x0030:
            r9 = move-exception
            goto L_0x007c
        L_0x0032:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x006f }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x006f }
            throw r9     // Catch:{ InterruptedException -> 0x006f }
        L_0x003a:
            long r4 = r8.B0()     // Catch:{ all -> 0x0030 }
            long r6 = r8.C0()     // Catch:{ all -> 0x0030 }
            long r4 = r4 - r6
            long r4 = java.lang.Math.min(r12, r4)     // Catch:{ all -> 0x0030 }
            int r2 = (int) r4     // Catch:{ all -> 0x0030 }
            W2.h r4 = r8.D0()     // Catch:{ all -> 0x0030 }
            int r4 = r4.y()     // Catch:{ all -> 0x0030 }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x0030 }
            long r4 = r8.C0()     // Catch:{ all -> 0x0030 }
            long r6 = (long) r2     // Catch:{ all -> 0x0030 }
            long r4 = r4 + r6
            r8.f1738A = r4     // Catch:{ all -> 0x0030 }
            l2.q r4 = l2.q.f14567a     // Catch:{ all -> 0x0030 }
            monitor-exit(r8)
            long r12 = r12 - r6
            W2.h r4 = r8.f1741D
            if (r10 == 0) goto L_0x006a
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x006a
            r5 = 1
            goto L_0x006b
        L_0x006a:
            r5 = r3
        L_0x006b:
            r4.f(r5, r9, r11, r2)
            goto L_0x000d
        L_0x006f:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0030 }
            r9.interrupt()     // Catch:{ all -> 0x0030 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0030 }
            r9.<init>()     // Catch:{ all -> 0x0030 }
            throw r9     // Catch:{ all -> 0x0030 }
        L_0x007c:
            monitor-exit(r8)
            throw r9
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W2.d.V0(int, boolean, c3.b, long):void");
    }

    public final void W0(int i4, boolean z3, List list) {
        o.e(list, "alternating");
        this.f1741D.v(z3, i4, list);
    }

    public final void X0(boolean z3, int i4, int i5) {
        try {
            this.f1741D.A(z3, i4, i5);
        } catch (IOException e4) {
            q0(e4);
        }
    }

    public final void Y0(int i4, ErrorCode errorCode) {
        o.e(errorCode, "statusCode");
        this.f1741D.G(i4, errorCode);
    }

    public final void Z0(int i4, ErrorCode errorCode) {
        o.e(errorCode, "errorCode");
        T2.d dVar = this.f1752i;
        dVar.i(new k(this.f1747d + '[' + i4 + "] writeSynReset", true, this, i4, errorCode), 0);
    }

    public final void a1(int i4, long j4) {
        T2.d dVar = this.f1752i;
        dVar.i(new l(this.f1747d + '[' + i4 + "] windowUpdate", true, this, i4, j4), 0);
    }

    public void close() {
        p0(ErrorCode.NO_ERROR, ErrorCode.CANCEL, (IOException) null);
    }

    public final void flush() {
        this.f1741D.flush();
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0088 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p0(okhttp3.internal.http2.ErrorCode r4, okhttp3.internal.http2.ErrorCode r5, java.io.IOException r6) {
        /*
            r3 = this;
            java.lang.String r0 = "connectionCode"
            kotlin.jvm.internal.o.e(r4, r0)
            java.lang.String r0 = "streamCode"
            kotlin.jvm.internal.o.e(r5, r0)
            boolean r0 = Q2.d.f1353h
            if (r0 == 0) goto L_0x003c
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto L_0x0015
            goto L_0x003c
        L_0x0015:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Thread "
            r5.append(r6)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            r5.append(r6)
            java.lang.String r6 = " MUST NOT hold lock on "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x003c:
            r3.R0(r4)     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            monitor-enter(r3)
            java.util.Map r4 = r3.A0()     // Catch:{ all -> 0x0063 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0063 }
            r0 = 0
            if (r4 != 0) goto L_0x006d
            java.util.Map r4 = r3.A0()     // Catch:{ all -> 0x0063 }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x0063 }
            W2.g[] r1 = new W2.g[r0]     // Catch:{ all -> 0x0063 }
            java.lang.Object[] r4 = r4.toArray(r1)     // Catch:{ all -> 0x0063 }
            if (r4 == 0) goto L_0x0065
            java.util.Map r1 = r3.A0()     // Catch:{ all -> 0x0063 }
            r1.clear()     // Catch:{ all -> 0x0063 }
            goto L_0x006e
        L_0x0063:
            r4 = move-exception
            goto L_0x009f
        L_0x0065:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            r4.<init>(r5)     // Catch:{ all -> 0x0063 }
            throw r4     // Catch:{ all -> 0x0063 }
        L_0x006d:
            r4 = 0
        L_0x006e:
            l2.q r1 = l2.q.f14567a     // Catch:{ all -> 0x0063 }
            monitor-exit(r3)
            W2.g[] r4 = (W2.g[]) r4
            if (r4 != 0) goto L_0x0076
            goto L_0x0081
        L_0x0076:
            int r1 = r4.length
        L_0x0077:
            if (r0 >= r1) goto L_0x0081
            r2 = r4[r0]
            r2.d(r5, r6)     // Catch:{ IOException -> 0x007e }
        L_0x007e:
            int r0 = r0 + 1
            goto L_0x0077
        L_0x0081:
            W2.h r4 = r3.D0()     // Catch:{ IOException -> 0x0088 }
            r4.close()     // Catch:{ IOException -> 0x0088 }
        L_0x0088:
            java.net.Socket r4 = r3.y0()     // Catch:{ IOException -> 0x008f }
            r4.close()     // Catch:{ IOException -> 0x008f }
        L_0x008f:
            T2.d r4 = r3.f1752i
            r4.o()
            T2.d r4 = r3.f1753j
            r4.o()
            T2.d r4 = r3.f1754k
            r4.o()
            return
        L_0x009f:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: W2.d.p0(okhttp3.internal.http2.ErrorCode, okhttp3.internal.http2.ErrorCode, java.io.IOException):void");
    }

    public final boolean r0() {
        return this.f1744a;
    }

    public final String s0() {
        return this.f1747d;
    }

    public final int t0() {
        return this.f1748e;
    }

    public final c u0() {
        return this.f1745b;
    }

    public final int v0() {
        return this.f1749f;
    }

    public final k w0() {
        return this.f1762w;
    }

    public final k x0() {
        return this.f1763x;
    }

    public final Socket y0() {
        return this.f1740C;
    }

    public final synchronized g z0(int i4) {
        return (g) this.f1746c.get(Integer.valueOf(i4));
    }
}
