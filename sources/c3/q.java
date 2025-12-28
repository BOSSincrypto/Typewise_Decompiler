package c3;

import com.silkimen.http.HttpRequest;
import d3.a;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.o;
import okio.ByteString;

public final class q implements d {

    /* renamed from: a  reason: collision with root package name */
    public final w f7679a;

    /* renamed from: b  reason: collision with root package name */
    public final C0500b f7680b = new C0500b();

    /* renamed from: c  reason: collision with root package name */
    public boolean f7681c;

    public q(w wVar) {
        o.e(wVar, "source");
        this.f7679a = wVar;
    }

    public String C() {
        return T(Long.MAX_VALUE);
    }

    public boolean H() {
        if (this.f7681c) {
            throw new IllegalStateException("closed");
        } else if (!this.f7680b.H() || this.f7679a.N(this.f7680b, 8192) != -1) {
            return false;
        } else {
            return true;
        }
    }

    public byte[] L(long j4) {
        d0(j4);
        return this.f7680b.L(j4);
    }

    public long N(C0500b bVar, long j4) {
        o.e(bVar, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        } else if (this.f7681c) {
            throw new IllegalStateException("closed");
        } else if (this.f7680b.w0() == 0 && this.f7679a.N(this.f7680b, 8192) == -1) {
            return -1;
        } else {
            return this.f7680b.N(bVar, Math.min(j4, this.f7680b.w0()));
        }
    }

    public String T(long j4) {
        long j5;
        if (j4 >= 0) {
            if (j4 == Long.MAX_VALUE) {
                j5 = Long.MAX_VALUE;
            } else {
                j5 = j4 + 1;
            }
            byte b4 = (byte) 10;
            long e4 = e(b4, 0, j5);
            if (e4 != -1) {
                return a.b(this.f7680b, e4);
            }
            if (j5 < Long.MAX_VALUE && s(j5) && this.f7680b.G(j5 - 1) == ((byte) 13) && s(1 + j5) && this.f7680b.G(j5) == b4) {
                return a.b(this.f7680b, j5);
            }
            C0500b bVar = new C0500b();
            C0500b bVar2 = this.f7680b;
            bVar2.D(bVar, 0, Math.min((long) 32, bVar2.w0()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f7680b.w0(), j4) + " content=" + bVar.j0().hex() + 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j4).toString());
    }

    public int W(n nVar) {
        o.e(nVar, "options");
        if (!this.f7681c) {
            while (true) {
                int c4 = a.c(this.f7680b, nVar, true);
                if (c4 == -2) {
                    if (this.f7679a.N(this.f7680b, 8192) == -1) {
                        break;
                    }
                } else if (c4 != -1) {
                    this.f7680b.b((long) nVar.d()[c4].size());
                    return c4;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    public long a(byte b4) {
        return e(b4, 0, Long.MAX_VALUE);
    }

    public void b(long j4) {
        if (!this.f7681c) {
            while (j4 > 0) {
                if (this.f7680b.w0() == 0 && this.f7679a.N(this.f7680b, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j4, this.f7680b.w0());
                this.f7680b.b(min);
                j4 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public C0500b c() {
        return this.f7680b;
    }

    public long c0(u uVar) {
        o.e(uVar, "sink");
        long j4 = 0;
        while (this.f7679a.N(this.f7680b, 8192) != -1) {
            long y3 = this.f7680b.y();
            if (y3 > 0) {
                j4 += y3;
                uVar.z(this.f7680b, y3);
            }
        }
        if (this.f7680b.w0() <= 0) {
            return j4;
        }
        long w02 = j4 + this.f7680b.w0();
        C0500b bVar = this.f7680b;
        uVar.z(bVar, bVar.w0());
        return w02;
    }

    public void close() {
        if (!this.f7681c) {
            this.f7681c = true;
            this.f7679a.close();
            this.f7680b.o();
        }
    }

    public x d() {
        return this.f7679a.d();
    }

    public void d0(long j4) {
        if (!s(j4)) {
            throw new EOFException();
        }
    }

    public long e(byte b4, long j4, long j5) {
        if (this.f7681c) {
            throw new IllegalStateException("closed");
        } else if (0 > j4 || j4 > j5) {
            throw new IllegalArgumentException(("fromIndex=" + j4 + " toIndex=" + j5).toString());
        } else {
            while (j4 < j5) {
                long Q3 = this.f7680b.Q(b4, j4, j5);
                if (Q3 != -1) {
                    return Q3;
                }
                long w02 = this.f7680b.w0();
                if (w02 >= j5 || this.f7679a.N(this.f7680b, 8192) == -1) {
                    return -1;
                }
                j4 = Math.max(j4, w02);
            }
            return -1;
        }
    }

    public int f() {
        d0(4);
        return this.f7680b.p0();
    }

    public short h() {
        d0(2);
        return this.f7680b.q0();
    }

    public boolean isOpen() {
        return !this.f7681c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long m0() {
        /*
            r5 = this;
            r0 = 1
            r5.d0(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.s(r2)
            if (r2 == 0) goto L_0x0064
            c3.b r2 = r5.f7680b
            long r3 = (long) r0
            byte r2 = r2.G(r3)
            r3 = 48
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0020
            r3 = 57
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x0020:
            r3 = 97
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x002a
            r3 = 102(0x66, float:1.43E-43)
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x002a:
            r3 = 65
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0037
            r3 = 70
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = r1
            goto L_0x0006
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            goto L_0x0064
        L_0x003a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r3)
            r3 = 16
            int r3 = kotlin.text.C0721a.a(r3)
            int r3 = kotlin.text.C0721a.a(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.o.d(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0064:
            c3.b r0 = r5.f7680b
            long r0 = r0.m0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.q.m0():long");
    }

    public ByteString n(long j4) {
        d0(j4);
        return this.f7680b.n(j4);
    }

    public String n0(Charset charset) {
        o.e(charset, HttpRequest.PARAM_CHARSET);
        this.f7680b.D0(this.f7679a);
        return this.f7680b.n0(charset);
    }

    public int read(ByteBuffer byteBuffer) {
        o.e(byteBuffer, "sink");
        if (this.f7680b.w0() == 0 && this.f7679a.N(this.f7680b, 8192) == -1) {
            return -1;
        }
        return this.f7680b.read(byteBuffer);
    }

    public byte readByte() {
        d0(1);
        return this.f7680b.readByte();
    }

    public int readInt() {
        d0(4);
        return this.f7680b.readInt();
    }

    public short readShort() {
        d0(2);
        return this.f7680b.readShort();
    }

    public boolean s(long j4) {
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        } else if (!this.f7681c) {
            while (this.f7680b.w0() < j4) {
                if (this.f7679a.N(this.f7680b, 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public String toString() {
        return "buffer(" + this.f7679a + ')';
    }
}
