package W2;

import Q2.d;
import W2.b;
import c3.C0500b;
import c3.c;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import okhttp3.internal.http2.ErrorCode;

public final class h implements Closeable {

    /* renamed from: g  reason: collision with root package name */
    public static final a f1885g = new a((i) null);

    /* renamed from: h  reason: collision with root package name */
    private static final Logger f1886h = Logger.getLogger(c.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final c f1887a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f1888b;

    /* renamed from: c  reason: collision with root package name */
    private final C0500b f1889c;

    /* renamed from: d  reason: collision with root package name */
    private int f1890d = 16384;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1891e;

    /* renamed from: f  reason: collision with root package name */
    private final b.C0033b f1892f;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    public h(c cVar, boolean z3) {
        o.e(cVar, "sink");
        this.f1887a = cVar;
        this.f1888b = z3;
        C0500b bVar = new C0500b();
        this.f1889c = bVar;
        this.f1892f = new b.C0033b(0, false, bVar, 3, (i) null);
    }

    private final void b0(int i4, long j4) {
        int i5;
        while (j4 > 0) {
            long min = Math.min((long) this.f1890d, j4);
            j4 -= min;
            int i6 = (int) min;
            if (j4 == 0) {
                i5 = 4;
            } else {
                i5 = 0;
            }
            m(i4, i6, 9, i5);
            this.f1887a.z(this.f1889c, min);
        }
    }

    public final synchronized void A(boolean z3, int i4, int i5) {
        if (!this.f1891e) {
            m(0, 8, 6, z3 ? 1 : 0);
            this.f1887a.w(i4);
            this.f1887a.w(i5);
            this.f1887a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void D(int i4, int i5, List list) {
        int i6;
        o.e(list, "requestHeaders");
        if (!this.f1891e) {
            this.f1892f.g(list);
            long w02 = this.f1889c.w0();
            int min = (int) Math.min(((long) this.f1890d) - 4, w02);
            int i7 = min + 4;
            long j4 = (long) min;
            int i8 = (w02 > j4 ? 1 : (w02 == j4 ? 0 : -1));
            if (i8 == 0) {
                i6 = 4;
            } else {
                i6 = 0;
            }
            m(i4, i7, 5, i6);
            this.f1887a.w(i5 & Integer.MAX_VALUE);
            this.f1887a.z(this.f1889c, j4);
            if (i8 > 0) {
                b0(i4, w02 - j4);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void G(int i4, ErrorCode errorCode) {
        o.e(errorCode, "errorCode");
        if (this.f1891e) {
            throw new IOException("closed");
        } else if (errorCode.getHttpCode() != -1) {
            m(i4, 4, 3, 0);
            this.f1887a.w(errorCode.getHttpCode());
            this.f1887a.flush();
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final synchronized void Q(k kVar) {
        int i4;
        try {
            o.e(kVar, "settings");
            if (!this.f1891e) {
                int i5 = 0;
                m(0, kVar.i() * 6, 4, 0);
                while (i5 < 10) {
                    int i6 = i5 + 1;
                    if (kVar.f(i5)) {
                        if (i5 == 4) {
                            i4 = 3;
                        } else if (i5 != 7) {
                            i4 = i5;
                        } else {
                            i4 = 4;
                        }
                        this.f1887a.r(i4);
                        this.f1887a.w(kVar.a(i5));
                    }
                    i5 = i6;
                }
                this.f1887a.flush();
            } else {
                throw new IOException("closed");
            }
        } finally {
        }
    }

    public final synchronized void R(int i4, long j4) {
        if (this.f1891e) {
            throw new IOException("closed");
        } else if (j4 == 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(o.k("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ", Long.valueOf(j4)).toString());
        } else {
            m(i4, 4, 8, 0);
            this.f1887a.w((int) j4);
            this.f1887a.flush();
        }
    }

    public final synchronized void a(k kVar) {
        try {
            o.e(kVar, "peerSettings");
            if (!this.f1891e) {
                this.f1890d = kVar.e(this.f1890d);
                if (kVar.b() != -1) {
                    this.f1892f.e(kVar.b());
                }
                m(0, 0, 4, 1);
                this.f1887a.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void close() {
        this.f1891e = true;
        this.f1887a.close();
    }

    public final synchronized void e() {
        try {
            if (this.f1891e) {
                throw new IOException("closed");
            } else if (this.f1888b) {
                Logger logger = f1886h;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(d.t(o.k(">> CONNECTION ", c.f1732b.hex()), new Object[0]));
                }
                this.f1887a.P(c.f1732b);
                this.f1887a.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f(boolean z3, int i4, C0500b bVar, int i5) {
        if (!this.f1891e) {
            h(i4, z3 ? 1 : 0, bVar, i5);
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void flush() {
        if (!this.f1891e) {
            this.f1887a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final void h(int i4, int i5, C0500b bVar, int i6) {
        m(i4, i6, 0, i5);
        if (i6 > 0) {
            c cVar = this.f1887a;
            o.b(bVar);
            cVar.z(bVar, (long) i6);
        }
    }

    public final void m(int i4, int i5, int i6, int i7) {
        Logger logger = f1886h;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(c.f1731a.c(false, i4, i5, i6, i7));
        }
        if (i5 > this.f1890d) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f1890d + ": " + i5).toString());
        } else if ((Integer.MIN_VALUE & i4) == 0) {
            d.Z(this.f1887a, i5);
            this.f1887a.I(i6 & 255);
            this.f1887a.I(i7 & 255);
            this.f1887a.w(i4 & Integer.MAX_VALUE);
        } else {
            throw new IllegalArgumentException(o.k("reserved bit set: ", Integer.valueOf(i4)).toString());
        }
    }

    public final synchronized void o(int i4, ErrorCode errorCode, byte[] bArr) {
        try {
            o.e(errorCode, "errorCode");
            o.e(bArr, "debugData");
            if (this.f1891e) {
                throw new IOException("closed");
            } else if (errorCode.getHttpCode() != -1) {
                boolean z3 = false;
                m(0, bArr.length + 8, 7, 0);
                this.f1887a.w(i4);
                this.f1887a.w(errorCode.getHttpCode());
                if (bArr.length == 0) {
                    z3 = true;
                }
                if (!z3) {
                    this.f1887a.O(bArr);
                }
                this.f1887a.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void v(boolean z3, int i4, List list) {
        int i5;
        o.e(list, "headerBlock");
        if (!this.f1891e) {
            this.f1892f.g(list);
            long w02 = this.f1889c.w0();
            long min = Math.min((long) this.f1890d, w02);
            int i6 = (w02 > min ? 1 : (w02 == min ? 0 : -1));
            if (i6 == 0) {
                i5 = 4;
            } else {
                i5 = 0;
            }
            if (z3) {
                i5 |= 1;
            }
            m(i4, (int) min, 1, i5);
            this.f1887a.z(this.f1889c, min);
            if (i6 > 0) {
                b0(i4, w02 - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final int y() {
        return this.f1890d;
    }
}
