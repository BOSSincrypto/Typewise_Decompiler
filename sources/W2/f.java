package W2;

import W2.b;
import c3.C0500b;
import c3.d;
import c3.w;
import c3.x;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import z2.C0973a;

public final class f implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    public static final a f1845e = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final Logger f1846f;

    /* renamed from: a  reason: collision with root package name */
    private final d f1847a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f1848b;

    /* renamed from: c  reason: collision with root package name */
    private final b f1849c;

    /* renamed from: d  reason: collision with root package name */
    private final b.a f1850d;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final Logger a() {
            return f.f1846f;
        }

        public final int b(int i4, int i5, int i6) {
            if ((i5 & 8) != 0) {
                i4--;
            }
            if (i6 <= i4) {
                return i4 - i6;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i6 + " > remaining length " + i4);
        }

        private a() {
        }
    }

    public static final class b implements w {

        /* renamed from: a  reason: collision with root package name */
        private final d f1851a;

        /* renamed from: b  reason: collision with root package name */
        private int f1852b;

        /* renamed from: c  reason: collision with root package name */
        private int f1853c;

        /* renamed from: d  reason: collision with root package name */
        private int f1854d;

        /* renamed from: e  reason: collision with root package name */
        private int f1855e;

        /* renamed from: f  reason: collision with root package name */
        private int f1856f;

        public b(d dVar) {
            o.e(dVar, "source");
            this.f1851a = dVar;
        }

        private final void e() {
            int i4 = this.f1854d;
            int J3 = Q2.d.J(this.f1851a);
            this.f1855e = J3;
            this.f1852b = J3;
            int d4 = Q2.d.d(this.f1851a.readByte(), 255);
            this.f1853c = Q2.d.d(this.f1851a.readByte(), 255);
            a aVar = f.f1845e;
            if (aVar.a().isLoggable(Level.FINE)) {
                aVar.a().fine(c.f1731a.c(true, this.f1854d, this.f1852b, d4, this.f1853c));
            }
            int readInt = this.f1851a.readInt() & Integer.MAX_VALUE;
            this.f1854d = readInt;
            if (d4 != 9) {
                throw new IOException(d4 + " != TYPE_CONTINUATION");
            } else if (readInt != i4) {
                throw new IOException("TYPE_CONTINUATION streamId changed");
            }
        }

        public long N(C0500b bVar, long j4) {
            o.e(bVar, "sink");
            while (true) {
                int i4 = this.f1855e;
                if (i4 == 0) {
                    this.f1851a.b((long) this.f1856f);
                    this.f1856f = 0;
                    if ((this.f1853c & 4) != 0) {
                        return -1;
                    }
                    e();
                } else {
                    long N3 = this.f1851a.N(bVar, Math.min(j4, (long) i4));
                    if (N3 == -1) {
                        return -1;
                    }
                    this.f1855e -= (int) N3;
                    return N3;
                }
            }
        }

        public final int a() {
            return this.f1855e;
        }

        public void close() {
        }

        public x d() {
            return this.f1851a.d();
        }

        public final void f(int i4) {
            this.f1853c = i4;
        }

        public final void h(int i4) {
            this.f1855e = i4;
        }

        public final void m(int i4) {
            this.f1852b = i4;
        }

        public final void o(int i4) {
            this.f1856f = i4;
        }

        public final void v(int i4) {
            this.f1854d = i4;
        }
    }

    public interface c {
        void a();

        void b(boolean z3, int i4, int i5);

        void c(int i4, int i5, int i6, boolean z3);

        void d(int i4, ErrorCode errorCode);

        void e(boolean z3, int i4, d dVar, int i5);

        void f(boolean z3, k kVar);

        void g(boolean z3, int i4, int i5, List list);

        void h(int i4, long j4);

        void i(int i4, int i5, List list);

        void j(int i4, ErrorCode errorCode, ByteString byteString);
    }

    static {
        Logger logger = Logger.getLogger(c.class.getName());
        o.d(logger, "getLogger(Http2::class.java.name)");
        f1846f = logger;
    }

    public f(d dVar, boolean z3) {
        o.e(dVar, "source");
        this.f1847a = dVar;
        this.f1848b = z3;
        b bVar = new b(dVar);
        this.f1849c = bVar;
        this.f1850d = new b.a(bVar, 4096, 0, 4, (i) null);
    }

    private final void A(c cVar, int i4) {
        boolean z3;
        int readInt = this.f1847a.readInt();
        if ((Integer.MIN_VALUE & readInt) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        cVar.c(i4, readInt & Integer.MAX_VALUE, Q2.d.d(this.f1847a.readByte(), 255) + 1, z3);
    }

    private final void D(c cVar, int i4, int i5, int i6) {
        if (i4 != 5) {
            throw new IOException("TYPE_PRIORITY length: " + i4 + " != 5");
        } else if (i6 != 0) {
            A(cVar, i6);
        } else {
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
    }

    private final void G(c cVar, int i4, int i5, int i6) {
        int i7;
        if (i6 != 0) {
            if ((i5 & 8) != 0) {
                i7 = Q2.d.d(this.f1847a.readByte(), 255);
            } else {
                i7 = 0;
            }
            cVar.i(i6, this.f1847a.readInt() & Integer.MAX_VALUE, o(f1845e.b(i4 - 4, i5, i7), i7, i5, i6));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    private final void Q(c cVar, int i4, int i5, int i6) {
        if (i4 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i4 + " != 4");
        } else if (i6 != 0) {
            int readInt = this.f1847a.readInt();
            ErrorCode a4 = ErrorCode.Companion.a(readInt);
            if (a4 != null) {
                cVar.d(i6, a4);
                return;
            }
            throw new IOException(o.k("TYPE_RST_STREAM unexpected error code: ", Integer.valueOf(readInt)));
        } else {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
    }

    private final void R(c cVar, int i4, int i5, int i6) {
        int readInt;
        if (i6 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        } else if ((i5 & 1) != 0) {
            if (i4 == 0) {
                cVar.a();
                return;
            }
            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
        } else if (i4 % 6 == 0) {
            k kVar = new k();
            C0973a i7 = z2.d.i(z2.d.j(0, i4), 6);
            int b4 = i7.b();
            int c4 = i7.c();
            int d4 = i7.d();
            if ((d4 > 0 && b4 <= c4) || (d4 < 0 && c4 <= b4)) {
                while (true) {
                    int i8 = b4 + d4;
                    int e4 = Q2.d.e(this.f1847a.readShort(), 65535);
                    readInt = this.f1847a.readInt();
                    if (e4 != 2) {
                        if (e4 == 3) {
                            e4 = 4;
                        } else if (e4 != 4) {
                            if (e4 == 5 && (readInt < 16384 || readInt > 16777215)) {
                            }
                        } else if (readInt >= 0) {
                            e4 = 7;
                        } else {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                    } else if (!(readInt == 0 || readInt == 1)) {
                        throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                    }
                    kVar.h(e4, readInt);
                    if (b4 == c4) {
                        break;
                    }
                    b4 = i8;
                }
                throw new IOException(o.k("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", Integer.valueOf(readInt)));
            }
            cVar.f(false, kVar);
        } else {
            throw new IOException(o.k("TYPE_SETTINGS length % 6 != 0: ", Integer.valueOf(i4)));
        }
    }

    private final void b0(c cVar, int i4, int i5, int i6) {
        if (i4 == 4) {
            long f4 = Q2.d.f(this.f1847a.readInt(), 2147483647L);
            if (f4 != 0) {
                cVar.h(i6, f4);
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        throw new IOException(o.k("TYPE_WINDOW_UPDATE length !=4: ", Integer.valueOf(i4)));
    }

    private final void h(c cVar, int i4, int i5, int i6) {
        boolean z3;
        if (i6 != 0) {
            int i7 = 0;
            if ((i5 & 1) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i5 & 32) == 0) {
                if ((i5 & 8) != 0) {
                    i7 = Q2.d.d(this.f1847a.readByte(), 255);
                }
                cVar.e(z3, i6, this.f1847a, f1845e.b(i4, i5, i7));
                this.f1847a.b((long) i7);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    private final void m(c cVar, int i4, int i5, int i6) {
        if (i4 < 8) {
            throw new IOException(o.k("TYPE_GOAWAY length < 8: ", Integer.valueOf(i4)));
        } else if (i6 == 0) {
            int readInt = this.f1847a.readInt();
            int readInt2 = this.f1847a.readInt();
            int i7 = i4 - 8;
            ErrorCode a4 = ErrorCode.Companion.a(readInt2);
            if (a4 != null) {
                ByteString byteString = ByteString.EMPTY;
                if (i7 > 0) {
                    byteString = this.f1847a.n((long) i7);
                }
                cVar.j(readInt, a4, byteString);
                return;
            }
            throw new IOException(o.k("TYPE_GOAWAY unexpected error code: ", Integer.valueOf(readInt2)));
        } else {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
    }

    private final List o(int i4, int i5, int i6, int i7) {
        this.f1849c.h(i4);
        b bVar = this.f1849c;
        bVar.m(bVar.a());
        this.f1849c.o(i5);
        this.f1849c.f(i6);
        this.f1849c.v(i7);
        this.f1850d.k();
        return this.f1850d.e();
    }

    private final void v(c cVar, int i4, int i5, int i6) {
        boolean z3;
        if (i6 != 0) {
            int i7 = 0;
            if ((i5 & 1) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i5 & 8) != 0) {
                i7 = Q2.d.d(this.f1847a.readByte(), 255);
            }
            if ((i5 & 32) != 0) {
                A(cVar, i6);
                i4 -= 5;
            }
            cVar.g(z3, i6, -1, o(f1845e.b(i4, i5, i7), i7, i5, i6));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    private final void y(c cVar, int i4, int i5, int i6) {
        if (i4 != 8) {
            throw new IOException(o.k("TYPE_PING length != 8: ", Integer.valueOf(i4)));
        } else if (i6 == 0) {
            int readInt = this.f1847a.readInt();
            int readInt2 = this.f1847a.readInt();
            boolean z3 = true;
            if ((i5 & 1) == 0) {
                z3 = false;
            }
            cVar.b(z3, readInt, readInt2);
        } else {
            throw new IOException("TYPE_PING streamId != 0");
        }
    }

    public void close() {
        this.f1847a.close();
    }

    public final boolean e(boolean z3, c cVar) {
        o.e(cVar, "handler");
        try {
            this.f1847a.d0(9);
            int J3 = Q2.d.J(this.f1847a);
            if (J3 <= 16384) {
                int d4 = Q2.d.d(this.f1847a.readByte(), 255);
                int d5 = Q2.d.d(this.f1847a.readByte(), 255);
                int readInt = this.f1847a.readInt() & Integer.MAX_VALUE;
                Logger logger = f1846f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(c.f1731a.c(true, readInt, J3, d4, d5));
                }
                if (!z3 || d4 == 4) {
                    switch (d4) {
                        case 0:
                            h(cVar, J3, d5, readInt);
                            return true;
                        case 1:
                            v(cVar, J3, d5, readInt);
                            return true;
                        case 2:
                            D(cVar, J3, d5, readInt);
                            return true;
                        case 3:
                            Q(cVar, J3, d5, readInt);
                            return true;
                        case 4:
                            R(cVar, J3, d5, readInt);
                            return true;
                        case 5:
                            G(cVar, J3, d5, readInt);
                            return true;
                        case 6:
                            y(cVar, J3, d5, readInt);
                            return true;
                        case 7:
                            m(cVar, J3, d5, readInt);
                            return true;
                        case 8:
                            b0(cVar, J3, d5, readInt);
                            return true;
                        default:
                            this.f1847a.b((long) J3);
                            return true;
                    }
                } else {
                    throw new IOException(o.k("Expected a SETTINGS frame but was ", c.f1731a.b(d4)));
                }
            } else {
                throw new IOException(o.k("FRAME_SIZE_ERROR: ", Integer.valueOf(J3)));
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void f(c cVar) {
        o.e(cVar, "handler");
        if (!this.f1848b) {
            d dVar = this.f1847a;
            ByteString byteString = c.f1732b;
            ByteString n4 = dVar.n((long) byteString.size());
            Logger logger = f1846f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Q2.d.t(o.k("<< CONNECTION ", n4.hex()), new Object[0]));
            }
            if (!o.a(byteString, n4)) {
                throw new IOException(o.k("Expected a connection header but was ", n4.utf8()));
            }
        } else if (!e(true, cVar)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }
}
