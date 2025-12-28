package c3;

import com.silkimen.http.HttpRequest;
import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.collections.C0713h;
import kotlin.jvm.internal.o;
import kotlin.text.C0724d;
import kotlin.uuid.Uuid;
import okio.ByteString;
import okio.SegmentedByteString;

/* renamed from: c3.b  reason: case insensitive filesystem */
public final class C0500b implements d, c, Cloneable, ByteChannel {

    /* renamed from: a  reason: collision with root package name */
    public r f7648a;

    /* renamed from: b  reason: collision with root package name */
    private long f7649b;

    /* renamed from: c3.b$a */
    public static final class a implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        public C0500b f7650a;

        /* renamed from: b  reason: collision with root package name */
        private r f7651b;

        /* renamed from: c  reason: collision with root package name */
        public long f7652c = -1;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f7653d;

        /* renamed from: e  reason: collision with root package name */
        public int f7654e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f7655f = -1;

        public final void a(r rVar) {
            this.f7651b = rVar;
        }

        public void close() {
            if (this.f7650a != null) {
                this.f7650a = null;
                a((r) null);
                this.f7652c = -1;
                this.f7653d = null;
                this.f7654e = -1;
                this.f7655f = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer");
        }
    }

    public final C0500b A() {
        C0500b bVar = new C0500b();
        if (w0() != 0) {
            r rVar = this.f7648a;
            o.b(rVar);
            r d4 = rVar.d();
            bVar.f7648a = d4;
            d4.f7689g = d4;
            d4.f7688f = d4;
            for (r rVar2 = rVar.f7688f; rVar2 != rVar; rVar2 = rVar2.f7688f) {
                r rVar3 = d4.f7689g;
                o.b(rVar3);
                o.b(rVar2);
                rVar3.c(rVar2.d());
            }
            bVar.v0(w0());
        }
        return bVar;
    }

    /* renamed from: A0 */
    public C0500b P(ByteString byteString) {
        o.e(byteString, "byteString");
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    /* renamed from: B0 */
    public C0500b O(byte[] bArr) {
        o.e(bArr, "source");
        return g(bArr, 0, bArr.length);
    }

    public String C() {
        return T(Long.MAX_VALUE);
    }

    /* renamed from: C0 */
    public C0500b g(byte[] bArr, int i4, int i5) {
        o.e(bArr, "source");
        long j4 = (long) i5;
        B.b((long) bArr.length, (long) i4, j4);
        int i6 = i5 + i4;
        while (i4 < i6) {
            r z02 = z0(1);
            int min = Math.min(i6 - i4, 8192 - z02.f7685c);
            int i7 = i4 + min;
            C0713h.d(bArr, z02.f7683a, z02.f7685c, i4, i7);
            z02.f7685c += min;
            i4 = i7;
        }
        v0(w0() + j4);
        return this;
    }

    public final C0500b D(C0500b bVar, long j4, long j5) {
        o.e(bVar, "out");
        B.b(w0(), j4, j5);
        if (j5 != 0) {
            bVar.v0(bVar.w0() + j5);
            r rVar = this.f7648a;
            while (true) {
                o.b(rVar);
                int i4 = rVar.f7685c;
                int i5 = rVar.f7684b;
                if (j4 < ((long) (i4 - i5))) {
                    break;
                }
                j4 -= (long) (i4 - i5);
                rVar = rVar.f7688f;
            }
            while (j5 > 0) {
                o.b(rVar);
                r d4 = rVar.d();
                int i6 = d4.f7684b + ((int) j4);
                d4.f7684b = i6;
                d4.f7685c = Math.min(i6 + ((int) j5), d4.f7685c);
                r rVar2 = bVar.f7648a;
                if (rVar2 == null) {
                    d4.f7689g = d4;
                    d4.f7688f = d4;
                    bVar.f7648a = d4;
                } else {
                    o.b(rVar2);
                    r rVar3 = rVar2.f7689g;
                    o.b(rVar3);
                    rVar3.c(d4);
                }
                j5 -= (long) (d4.f7685c - d4.f7684b);
                rVar = rVar.f7688f;
                j4 = 0;
            }
        }
        return this;
    }

    public long D0(w wVar) {
        o.e(wVar, "source");
        long j4 = 0;
        while (true) {
            long N3 = wVar.N(this, 8192);
            if (N3 == -1) {
                return j4;
            }
            j4 += N3;
        }
    }

    /* renamed from: E0 */
    public C0500b I(int i4) {
        r z02 = z0(1);
        byte[] bArr = z02.f7683a;
        int i5 = z02.f7685c;
        z02.f7685c = i5 + 1;
        bArr[i5] = (byte) i4;
        v0(w0() + 1);
        return this;
    }

    /* renamed from: F0 */
    public C0500b h0(long j4) {
        boolean z3;
        int i4 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
        if (i4 == 0) {
            return I(48);
        }
        int i5 = 1;
        if (i4 < 0) {
            j4 = -j4;
            if (j4 < 0) {
                return f0("-9223372036854775808");
            }
            z3 = true;
        } else {
            z3 = false;
        }
        if (j4 < 100000000) {
            if (j4 < 10000) {
                if (j4 < 100) {
                    if (j4 >= 10) {
                        i5 = 2;
                    }
                } else if (j4 < 1000) {
                    i5 = 3;
                } else {
                    i5 = 4;
                }
            } else if (j4 < 1000000) {
                if (j4 < 100000) {
                    i5 = 5;
                } else {
                    i5 = 6;
                }
            } else if (j4 < 10000000) {
                i5 = 7;
            } else {
                i5 = 8;
            }
        } else if (j4 < 1000000000000L) {
            if (j4 < 10000000000L) {
                if (j4 < 1000000000) {
                    i5 = 9;
                } else {
                    i5 = 10;
                }
            } else if (j4 < 100000000000L) {
                i5 = 11;
            } else {
                i5 = 12;
            }
        } else if (j4 < 1000000000000000L) {
            if (j4 < 10000000000000L) {
                i5 = 13;
            } else if (j4 < 100000000000000L) {
                i5 = 14;
            } else {
                i5 = 15;
            }
        } else if (j4 < 100000000000000000L) {
            if (j4 < 10000000000000000L) {
                i5 = 16;
            } else {
                i5 = 17;
            }
        } else if (j4 < 1000000000000000000L) {
            i5 = 18;
        } else {
            i5 = 19;
        }
        if (z3) {
            i5++;
        }
        r z02 = z0(i5);
        byte[] bArr = z02.f7683a;
        int i6 = z02.f7685c + i5;
        while (j4 != 0) {
            long j5 = (long) 10;
            i6--;
            bArr[i6] = d3.a.a()[(int) (j4 % j5)];
            j4 /= j5;
        }
        if (z3) {
            bArr[i6 - 1] = (byte) 45;
        }
        z02.f7685c += i5;
        v0(w0() + ((long) i5));
        return this;
    }

    public final byte G(long j4) {
        B.b(w0(), j4, 1);
        r rVar = this.f7648a;
        if (rVar == null) {
            o.b((Object) null);
            throw null;
        } else if (w0() - j4 < j4) {
            long w02 = w0();
            while (w02 > j4) {
                rVar = rVar.f7689g;
                o.b(rVar);
                w02 -= (long) (rVar.f7685c - rVar.f7684b);
            }
            o.b(rVar);
            return rVar.f7683a[(int) ((((long) rVar.f7684b) + j4) - w02)];
        } else {
            long j5 = 0;
            while (true) {
                long j6 = ((long) (rVar.f7685c - rVar.f7684b)) + j5;
                if (j6 <= j4) {
                    rVar = rVar.f7688f;
                    o.b(rVar);
                    j5 = j6;
                } else {
                    o.b(rVar);
                    return rVar.f7683a[(int) ((((long) rVar.f7684b) + j4) - j5)];
                }
            }
        }
    }

    /* renamed from: G0 */
    public C0500b k(long j4) {
        if (j4 == 0) {
            return I(48);
        }
        long j5 = (j4 >>> 1) | j4;
        long j6 = j5 | (j5 >>> 2);
        long j7 = j6 | (j6 >>> 4);
        long j8 = j7 | (j7 >>> 8);
        long j9 = j8 | (j8 >>> 16);
        long j10 = j9 | (j9 >>> 32);
        long j11 = j10 - ((j10 >>> 1) & 6148914691236517205L);
        long j12 = ((j11 >>> 2) & 3689348814741910323L) + (j11 & 3689348814741910323L);
        long j13 = ((j12 >>> 4) + j12) & 1085102592571150095L;
        long j14 = j13 + (j13 >>> 8);
        long j15 = j14 + (j14 >>> 16);
        int i4 = (int) ((((j15 & 63) + ((j15 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        r z02 = z0(i4);
        byte[] bArr = z02.f7683a;
        int i5 = z02.f7685c;
        for (int i6 = (i5 + i4) - 1; i6 >= i5; i6--) {
            bArr[i6] = d3.a.a()[(int) (15 & j4)];
            j4 >>>= 4;
        }
        z02.f7685c += i4;
        v0(w0() + ((long) i4));
        return this;
    }

    public boolean H() {
        if (this.f7649b == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: H0 */
    public C0500b w(int i4) {
        r z02 = z0(4);
        byte[] bArr = z02.f7683a;
        int i5 = z02.f7685c;
        bArr[i5] = (byte) ((i4 >>> 24) & 255);
        bArr[i5 + 1] = (byte) ((i4 >>> 16) & 255);
        bArr[i5 + 2] = (byte) ((i4 >>> 8) & 255);
        bArr[i5 + 3] = (byte) (i4 & 255);
        z02.f7685c = i5 + 4;
        v0(w0() + 4);
        return this;
    }

    /* renamed from: I0 */
    public C0500b r(int i4) {
        r z02 = z0(2);
        byte[] bArr = z02.f7683a;
        int i5 = z02.f7685c;
        bArr[i5] = (byte) ((i4 >>> 8) & 255);
        bArr[i5 + 1] = (byte) (i4 & 255);
        z02.f7685c = i5 + 2;
        v0(w0() + 2);
        return this;
    }

    public C0500b J0(String str, int i4, int i5, Charset charset) {
        o.e(str, "string");
        o.e(charset, HttpRequest.PARAM_CHARSET);
        if (i4 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i4).toString());
        } else if (i5 < i4) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i5 + " < " + i4).toString());
        } else if (i5 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i5 + " > " + str.length()).toString());
        } else if (o.a(charset, C0724d.f13927b)) {
            return L0(str, i4, i5);
        } else {
            String substring = str.substring(i4, i5);
            o.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            byte[] bytes = substring.getBytes(charset);
            o.d(bytes, "this as java.lang.String).getBytes(charset)");
            return g(bytes, 0, bytes.length);
        }
    }

    /* renamed from: K0 */
    public C0500b f0(String str) {
        o.e(str, "string");
        return L0(str, 0, str.length());
    }

    public byte[] L(long j4) {
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        } else if (w0() >= j4) {
            byte[] bArr = new byte[((int) j4)];
            o0(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    public C0500b L0(String str, int i4, int i5) {
        char c4;
        char charAt;
        o.e(str, "string");
        if (i4 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i4).toString());
        } else if (i5 < i4) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i5 + " < " + i4).toString());
        } else if (i5 <= str.length()) {
            while (i4 < i5) {
                char charAt2 = str.charAt(i4);
                if (charAt2 < 128) {
                    r z02 = z0(1);
                    byte[] bArr = z02.f7683a;
                    int i6 = z02.f7685c - i4;
                    int min = Math.min(i5, 8192 - i6);
                    int i7 = i4 + 1;
                    bArr[i4 + i6] = (byte) charAt2;
                    while (true) {
                        i4 = i7;
                        if (i4 >= min || (charAt = str.charAt(i4)) >= 128) {
                            int i8 = z02.f7685c;
                            int i9 = (i6 + i4) - i8;
                            z02.f7685c = i8 + i9;
                            v0(w0() + ((long) i9));
                        } else {
                            i7 = i4 + 1;
                            bArr[i4 + i6] = (byte) charAt;
                        }
                    }
                    int i82 = z02.f7685c;
                    int i92 = (i6 + i4) - i82;
                    z02.f7685c = i82 + i92;
                    v0(w0() + ((long) i92));
                } else {
                    if (charAt2 < 2048) {
                        r z03 = z0(2);
                        byte[] bArr2 = z03.f7683a;
                        int i10 = z03.f7685c;
                        bArr2[i10] = (byte) ((charAt2 >> 6) | 192);
                        bArr2[i10 + 1] = (byte) ((charAt2 & '?') | 128);
                        z03.f7685c = i10 + 2;
                        v0(w0() + 2);
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        r z04 = z0(3);
                        byte[] bArr3 = z04.f7683a;
                        int i11 = z04.f7685c;
                        bArr3[i11] = (byte) ((charAt2 >> 12) | 224);
                        bArr3[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | Uuid.SIZE_BITS);
                        bArr3[i11 + 2] = (byte) ((charAt2 & '?') | 128);
                        z04.f7685c = i11 + 3;
                        v0(w0() + 3);
                    } else {
                        int i12 = i4 + 1;
                        if (i12 < i5) {
                            c4 = str.charAt(i12);
                        } else {
                            c4 = 0;
                        }
                        if (charAt2 > 56319 || 56320 > c4 || c4 >= 57344) {
                            I(63);
                            i4 = i12;
                        } else {
                            int i13 = (((charAt2 & 1023) << 10) | (c4 & 1023)) + 0;
                            r z05 = z0(4);
                            byte[] bArr4 = z05.f7683a;
                            int i14 = z05.f7685c;
                            bArr4[i14] = (byte) ((i13 >> 18) | 240);
                            bArr4[i14 + 1] = (byte) (((i13 >> 12) & 63) | Uuid.SIZE_BITS);
                            bArr4[i14 + 2] = (byte) (((i13 >> 6) & 63) | Uuid.SIZE_BITS);
                            bArr4[i14 + 3] = (byte) ((i13 & 63) | Uuid.SIZE_BITS);
                            z05.f7685c = i14 + 4;
                            v0(w0() + 4);
                            i4 += 2;
                        }
                    }
                    i4++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException(("endIndex > string.length: " + i5 + " > " + str.length()).toString());
        }
    }

    public C0500b M0(int i4) {
        if (i4 < 128) {
            I(i4);
        } else if (i4 < 2048) {
            r z02 = z0(2);
            byte[] bArr = z02.f7683a;
            int i5 = z02.f7685c;
            bArr[i5] = (byte) ((i4 >> 6) | 192);
            bArr[i5 + 1] = (byte) ((i4 & 63) | Uuid.SIZE_BITS);
            z02.f7685c = i5 + 2;
            v0(w0() + 2);
        } else if (55296 <= i4 && i4 < 57344) {
            I(63);
        } else if (i4 < 65536) {
            r z03 = z0(3);
            byte[] bArr2 = z03.f7683a;
            int i6 = z03.f7685c;
            bArr2[i6] = (byte) ((i4 >> 12) | 224);
            bArr2[i6 + 1] = (byte) (((i4 >> 6) & 63) | Uuid.SIZE_BITS);
            bArr2[i6 + 2] = (byte) ((i4 & 63) | Uuid.SIZE_BITS);
            z03.f7685c = i6 + 3;
            v0(w0() + 3);
        } else if (i4 <= 1114111) {
            r z04 = z0(4);
            byte[] bArr3 = z04.f7683a;
            int i7 = z04.f7685c;
            bArr3[i7] = (byte) ((i4 >> 18) | 240);
            bArr3[i7 + 1] = (byte) (((i4 >> 12) & 63) | Uuid.SIZE_BITS);
            bArr3[i7 + 2] = (byte) (((i4 >> 6) & 63) | Uuid.SIZE_BITS);
            bArr3[i7 + 3] = (byte) ((i4 & 63) | Uuid.SIZE_BITS);
            z04.f7685c = i7 + 4;
            v0(w0() + 4);
        } else {
            throw new IllegalArgumentException("Unexpected code point: 0x" + B.i(i4));
        }
        return this;
    }

    public long N(C0500b bVar, long j4) {
        o.e(bVar, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        } else if (w0() == 0) {
            return -1;
        } else {
            if (j4 > w0()) {
                j4 = w0();
            }
            bVar.z(this, j4);
            return j4;
        }
    }

    public long Q(byte b4, long j4, long j5) {
        r rVar;
        long j6;
        int i4;
        long j7 = 0;
        if (0 > j4 || j4 > j5) {
            throw new IllegalArgumentException(("size=" + w0() + " fromIndex=" + j4 + " toIndex=" + j5).toString());
        }
        if (j5 > w0()) {
            j5 = w0();
        }
        if (j4 == j5 || (rVar = this.f7648a) == null) {
            return -1;
        }
        if (w0() - j4 < j4) {
            j6 = w0();
            while (j6 > j4) {
                rVar = rVar.f7689g;
                o.b(rVar);
                j6 -= (long) (rVar.f7685c - rVar.f7684b);
            }
            while (j6 < j5) {
                byte[] bArr = rVar.f7683a;
                int min = (int) Math.min((long) rVar.f7685c, (((long) rVar.f7684b) + j5) - j6);
                i4 = (int) ((((long) rVar.f7684b) + j4) - j6);
                while (i4 < min) {
                    if (bArr[i4] != b4) {
                        i4++;
                    }
                }
                j6 += (long) (rVar.f7685c - rVar.f7684b);
                rVar = rVar.f7688f;
                o.b(rVar);
                j4 = j6;
            }
            return -1;
        }
        while (true) {
            long j8 = ((long) (rVar.f7685c - rVar.f7684b)) + j7;
            if (j8 > j4) {
                break;
            }
            rVar = rVar.f7688f;
            o.b(rVar);
            j7 = j8;
        }
        while (j6 < j5) {
            byte[] bArr2 = rVar.f7683a;
            int min2 = (int) Math.min((long) rVar.f7685c, (((long) rVar.f7684b) + j5) - j6);
            int i5 = (int) ((((long) rVar.f7684b) + j4) - j6);
            while (i4 < min2) {
                if (bArr2[i4] != b4) {
                    i5 = i4 + 1;
                }
            }
            j7 = j6 + ((long) (rVar.f7685c - rVar.f7684b));
            rVar = rVar.f7688f;
            o.b(rVar);
            j4 = j7;
        }
        return -1;
        return ((long) (i4 - rVar.f7684b)) + j6;
    }

    public long R(ByteString byteString) {
        o.e(byteString, "targetBytes");
        return b0(byteString, 0);
    }

    public String T(long j4) {
        if (j4 >= 0) {
            long j5 = Long.MAX_VALUE;
            if (j4 != Long.MAX_VALUE) {
                j5 = j4 + 1;
            }
            byte b4 = (byte) 10;
            long Q3 = Q(b4, 0, j5);
            if (Q3 != -1) {
                return d3.a.b(this, Q3);
            }
            if (j5 < w0() && G(j5 - 1) == ((byte) 13) && G(j5) == b4) {
                return d3.a.b(this, j5);
            }
            C0500b bVar = new C0500b();
            D(bVar, 0, Math.min((long) 32, w0()));
            throw new EOFException("\\n not found: limit=" + Math.min(w0(), j4) + " content=" + bVar.j0().hex() + 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j4).toString());
    }

    public int W(n nVar) {
        o.e(nVar, "options");
        int d4 = d3.a.d(this, nVar, false, 2, (Object) null);
        if (d4 == -1) {
            return -1;
        }
        b((long) nVar.d()[d4].size());
        return d4;
    }

    public void b(long j4) {
        while (j4 > 0) {
            r rVar = this.f7648a;
            if (rVar != null) {
                int min = (int) Math.min(j4, (long) (rVar.f7685c - rVar.f7684b));
                long j5 = (long) min;
                v0(w0() - j5);
                j4 -= j5;
                int i4 = rVar.f7684b + min;
                rVar.f7684b = i4;
                if (i4 == rVar.f7685c) {
                    this.f7648a = rVar.b();
                    t.b(rVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public long b0(ByteString byteString, long j4) {
        long j5;
        int i4;
        int i5;
        int i6;
        o.e(byteString, "targetBytes");
        long j6 = 0;
        if (j4 >= 0) {
            r rVar = this.f7648a;
            if (rVar == null) {
                return -1;
            }
            if (w0() - j4 < j4) {
                j5 = w0();
                while (j5 > j4) {
                    rVar = rVar.f7689g;
                    o.b(rVar);
                    j5 -= (long) (rVar.f7685c - rVar.f7684b);
                }
                if (byteString.size() == 2) {
                    byte b4 = byteString.getByte(0);
                    byte b5 = byteString.getByte(1);
                    while (j5 < w0()) {
                        byte[] bArr = rVar.f7683a;
                        i5 = (int) ((((long) rVar.f7684b) + j4) - j5);
                        int i7 = rVar.f7685c;
                        while (i5 < i7) {
                            byte b6 = bArr[i5];
                            if (!(b6 == b4 || b6 == b5)) {
                                i5++;
                            }
                        }
                        j5 += (long) (rVar.f7685c - rVar.f7684b);
                        rVar = rVar.f7688f;
                        o.b(rVar);
                        j4 = j5;
                    }
                    return -1;
                }
                byte[] internalArray$okio = byteString.internalArray$okio();
                while (j5 < w0()) {
                    byte[] bArr2 = rVar.f7683a;
                    i4 = (int) ((((long) rVar.f7684b) + j4) - j5);
                    int i8 = rVar.f7685c;
                    while (i4 < i8) {
                        byte b7 = bArr2[i4];
                        for (byte b8 : internalArray$okio) {
                            if (b7 == b8) {
                                i6 = rVar.f7684b;
                                return ((long) (i5 - i6)) + j5;
                            }
                        }
                        i4++;
                    }
                    j5 += (long) (rVar.f7685c - rVar.f7684b);
                    rVar = rVar.f7688f;
                    o.b(rVar);
                    j4 = j5;
                }
                return -1;
            }
            while (true) {
                long j7 = ((long) (rVar.f7685c - rVar.f7684b)) + j6;
                if (j7 > j4) {
                    break;
                }
                rVar = rVar.f7688f;
                o.b(rVar);
                j6 = j7;
            }
            if (byteString.size() == 2) {
                byte b9 = byteString.getByte(0);
                byte b10 = byteString.getByte(1);
                while (j5 < w0()) {
                    byte[] bArr3 = rVar.f7683a;
                    int i9 = (int) ((((long) rVar.f7684b) + j4) - j5);
                    int i10 = rVar.f7685c;
                    while (i5 < i10) {
                        byte b11 = bArr3[i5];
                        if (!(b11 == b9 || b11 == b10)) {
                            i9 = i5 + 1;
                        }
                    }
                    j6 = j5 + ((long) (rVar.f7685c - rVar.f7684b));
                    rVar = rVar.f7688f;
                    o.b(rVar);
                    j4 = j6;
                }
                return -1;
            }
            byte[] internalArray$okio2 = byteString.internalArray$okio();
            while (j5 < w0()) {
                byte[] bArr4 = rVar.f7683a;
                int i11 = (int) ((((long) rVar.f7684b) + j4) - j5);
                int i12 = rVar.f7685c;
                while (i4 < i12) {
                    byte b12 = bArr4[i4];
                    for (byte b13 : internalArray$okio2) {
                        if (b12 == b13) {
                            i6 = rVar.f7684b;
                            return ((long) (i5 - i6)) + j5;
                        }
                    }
                    i11 = i4 + 1;
                }
                j6 = j5 + ((long) (rVar.f7685c - rVar.f7684b));
                rVar = rVar.f7688f;
                o.b(rVar);
                j4 = j6;
            }
            return -1;
            i6 = rVar.f7684b;
            return ((long) (i5 - i6)) + j5;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j4).toString());
    }

    public C0500b c() {
        return this;
    }

    public long c0(u uVar) {
        o.e(uVar, "sink");
        long w02 = w0();
        if (w02 > 0) {
            uVar.z(this, w02);
        }
        return w02;
    }

    public void close() {
    }

    public x d() {
        return x.f7697e;
    }

    public void d0(long j4) {
        if (this.f7649b < j4) {
            throw new EOFException();
        }
    }

    public int e0(byte[] bArr, int i4, int i5) {
        o.e(bArr, "sink");
        B.b((long) bArr.length, (long) i4, (long) i5);
        r rVar = this.f7648a;
        if (rVar == null) {
            return -1;
        }
        int min = Math.min(i5, rVar.f7685c - rVar.f7684b);
        byte[] bArr2 = rVar.f7683a;
        int i6 = rVar.f7684b;
        C0713h.d(bArr2, bArr, i4, i6, i6 + min);
        rVar.f7684b += min;
        v0(w0() - ((long) min));
        if (rVar.f7684b == rVar.f7685c) {
            this.f7648a = rVar.b();
            t.b(rVar);
        }
        return min;
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r0 != r1) goto L_0x0009
            goto L_0x0081
        L_0x0009:
            boolean r3 = r1 instanceof c3.C0500b
            r4 = 0
            if (r3 != 0) goto L_0x0011
        L_0x000e:
            r2 = r4
            goto L_0x0081
        L_0x0011:
            long r5 = r18.w0()
            c3.b r1 = (c3.C0500b) r1
            long r7 = r1.w0()
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0020
            goto L_0x000e
        L_0x0020:
            long r5 = r18.w0()
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x002b
            goto L_0x0081
        L_0x002b:
            c3.r r3 = r0.f7648a
            kotlin.jvm.internal.o.b(r3)
            c3.r r1 = r1.f7648a
            kotlin.jvm.internal.o.b(r1)
            int r5 = r3.f7684b
            int r6 = r1.f7684b
            r9 = r7
        L_0x003a:
            long r11 = r18.w0()
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0081
            int r11 = r3.f7685c
            int r11 = r11 - r5
            int r12 = r1.f7685c
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r7
        L_0x004e:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x0069
            byte[] r15 = r3.f7683a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            byte[] r15 = r1.f7683a
            int r17 = r6 + 1
            byte r6 = r15[r6]
            if (r5 == r6) goto L_0x0061
            goto L_0x000e
        L_0x0061:
            r5 = 1
            long r13 = r13 + r5
            r5 = r16
            r6 = r17
            goto L_0x004e
        L_0x0069:
            int r13 = r3.f7685c
            if (r5 != r13) goto L_0x0074
            c3.r r3 = r3.f7688f
            kotlin.jvm.internal.o.b(r3)
            int r5 = r3.f7684b
        L_0x0074:
            int r13 = r1.f7685c
            if (r6 != r13) goto L_0x007f
            c3.r r1 = r1.f7688f
            kotlin.jvm.internal.o.b(r1)
            int r6 = r1.f7684b
        L_0x007f:
            long r9 = r9 + r11
            goto L_0x003a
        L_0x0081:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.C0500b.equals(java.lang.Object):boolean");
    }

    public void flush() {
    }

    public byte[] g0() {
        return L(w0());
    }

    public int hashCode() {
        r rVar = this.f7648a;
        if (rVar == null) {
            return 0;
        }
        int i4 = 1;
        do {
            int i5 = rVar.f7685c;
            for (int i6 = rVar.f7684b; i6 < i5; i6++) {
                i4 = (i4 * 31) + rVar.f7683a[i6];
            }
            rVar = rVar.f7688f;
            o.b(rVar);
        } while (rVar != this.f7648a);
        return i4;
    }

    public boolean isOpen() {
        return true;
    }

    public ByteString j0() {
        return n(w0());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009a, code lost:
        if (r8 != r9) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009c, code lost:
        r14.f7648a = r6.b();
        c3.t.b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a6, code lost:
        r6.f7684b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a8, code lost:
        if (r1 != false) goto L_0x00ae;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long m0() {
        /*
            r14 = this;
            long r0 = r14.w0()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00b8
            r0 = 0
            r1 = r0
            r4 = r2
        L_0x000d:
            c3.r r6 = r14.f7648a
            kotlin.jvm.internal.o.b(r6)
            byte[] r7 = r6.f7683a
            int r8 = r6.f7684b
            int r9 = r6.f7685c
        L_0x0018:
            if (r8 >= r9) goto L_0x009a
            byte r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0029
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0029
            int r11 = r10 - r11
            goto L_0x0043
        L_0x0029:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0038
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0038
        L_0x0033:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L_0x0043
        L_0x0038:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x007b
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x007b
            goto L_0x0033
        L_0x0043:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0053
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0018
        L_0x0053:
            c3.b r0 = new c3.b
            r0.<init>()
            c3.b r0 = r0.k(r4)
            c3.b r0 = r0.I(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.s0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x007b:
            if (r0 == 0) goto L_0x007f
            r1 = 1
            goto L_0x009a
        L_0x007f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = c3.B.h(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009a:
            if (r8 != r9) goto L_0x00a6
            c3.r r7 = r6.b()
            r14.f7648a = r7
            c3.t.b(r6)
            goto L_0x00a8
        L_0x00a6:
            r6.f7684b = r8
        L_0x00a8:
            if (r1 != 0) goto L_0x00ae
            c3.r r6 = r14.f7648a
            if (r6 != 0) goto L_0x000d
        L_0x00ae:
            long r1 = r14.w0()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.v0(r1)
            return r4
        L_0x00b8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.C0500b.m0():long");
    }

    public ByteString n(long j4) {
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        } else if (w0() < j4) {
            throw new EOFException();
        } else if (j4 < 4096) {
            return new ByteString(L(j4));
        } else {
            ByteString y02 = y0((int) j4);
            b(j4);
            return y02;
        }
    }

    public String n0(Charset charset) {
        o.e(charset, HttpRequest.PARAM_CHARSET);
        return r0(this.f7649b, charset);
    }

    public final void o() {
        b(w0());
    }

    public void o0(byte[] bArr) {
        o.e(bArr, "sink");
        int i4 = 0;
        while (i4 < bArr.length) {
            int e02 = e0(bArr, i4, bArr.length - i4);
            if (e02 != -1) {
                i4 += e02;
            } else {
                throw new EOFException();
            }
        }
    }

    public int p0() {
        return B.f(readInt());
    }

    public short q0() {
        return B.g(readShort());
    }

    public String r0(long j4, Charset charset) {
        o.e(charset, HttpRequest.PARAM_CHARSET);
        int i4 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
        if (i4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        } else if (this.f7649b < j4) {
            throw new EOFException();
        } else if (i4 == 0) {
            return "";
        } else {
            r rVar = this.f7648a;
            o.b(rVar);
            int i5 = rVar.f7684b;
            if (((long) i5) + j4 > ((long) rVar.f7685c)) {
                return new String(L(j4), charset);
            }
            int i6 = (int) j4;
            String str = new String(rVar.f7683a, i5, i6, charset);
            int i7 = rVar.f7684b + i6;
            rVar.f7684b = i7;
            this.f7649b -= j4;
            if (i7 == rVar.f7685c) {
                this.f7648a = rVar.b();
                t.b(rVar);
            }
            return str;
        }
    }

    public int read(ByteBuffer byteBuffer) {
        o.e(byteBuffer, "sink");
        r rVar = this.f7648a;
        if (rVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), rVar.f7685c - rVar.f7684b);
        byteBuffer.put(rVar.f7683a, rVar.f7684b, min);
        int i4 = rVar.f7684b + min;
        rVar.f7684b = i4;
        this.f7649b -= (long) min;
        if (i4 == rVar.f7685c) {
            this.f7648a = rVar.b();
            t.b(rVar);
        }
        return min;
    }

    public byte readByte() {
        if (w0() != 0) {
            r rVar = this.f7648a;
            o.b(rVar);
            int i4 = rVar.f7684b;
            int i5 = rVar.f7685c;
            int i6 = i4 + 1;
            byte b4 = rVar.f7683a[i4];
            v0(w0() - 1);
            if (i6 == i5) {
                this.f7648a = rVar.b();
                t.b(rVar);
            } else {
                rVar.f7684b = i6;
            }
            return b4;
        }
        throw new EOFException();
    }

    public int readInt() {
        if (w0() >= 4) {
            r rVar = this.f7648a;
            o.b(rVar);
            int i4 = rVar.f7684b;
            int i5 = rVar.f7685c;
            if (((long) (i5 - i4)) < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = rVar.f7683a;
            byte b4 = ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4] & 255) << 24);
            int i6 = i4 + 3;
            int i7 = i4 + 4;
            byte b5 = (bArr[i6] & 255) | b4 | ((bArr[i4 + 2] & 255) << 8);
            v0(w0() - 4);
            if (i7 == i5) {
                this.f7648a = rVar.b();
                t.b(rVar);
            } else {
                rVar.f7684b = i7;
            }
            return b5;
        }
        throw new EOFException();
    }

    public short readShort() {
        if (w0() >= 2) {
            r rVar = this.f7648a;
            o.b(rVar);
            int i4 = rVar.f7684b;
            int i5 = rVar.f7685c;
            if (i5 - i4 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = rVar.f7683a;
            int i6 = i4 + 1;
            int i7 = i4 + 2;
            byte b4 = (bArr[i6] & 255) | ((bArr[i4] & 255) << 8);
            v0(w0() - 2);
            if (i7 == i5) {
                this.f7648a = rVar.b();
                t.b(rVar);
            } else {
                rVar.f7684b = i7;
            }
            return (short) b4;
        }
        throw new EOFException();
    }

    public boolean s(long j4) {
        if (this.f7649b >= j4) {
            return true;
        }
        return false;
    }

    public String s0() {
        return r0(this.f7649b, C0724d.f13927b);
    }

    public String t0(long j4) {
        return r0(j4, C0724d.f13927b);
    }

    public String toString() {
        return x0().toString();
    }

    public int u0() {
        byte b4;
        int i4;
        byte b5;
        if (w0() != 0) {
            byte G3 = G(0);
            int i5 = 1;
            if ((G3 & 128) == 0) {
                b5 = G3 & Byte.MAX_VALUE;
                b4 = 0;
                i4 = 1;
            } else if ((G3 & 224) == 192) {
                b5 = G3 & 31;
                i4 = 2;
                b4 = 128;
            } else if ((G3 & 240) == 224) {
                b5 = G3 & 15;
                i4 = 3;
                b4 = 2048;
            } else if ((G3 & 248) == 240) {
                b5 = G3 & 7;
                i4 = 4;
                b4 = 65536;
            } else {
                b(1);
                return 65533;
            }
            long j4 = (long) i4;
            if (w0() >= j4) {
                while (i5 < i4) {
                    long j5 = (long) i5;
                    byte G4 = G(j5);
                    if ((G4 & 192) == 128) {
                        b5 = (b5 << 6) | (G4 & 63);
                        i5++;
                    } else {
                        b(j5);
                        return 65533;
                    }
                }
                b(j4);
                if (b5 > 1114111) {
                    return 65533;
                }
                if ((55296 > b5 || b5 >= 57344) && b5 >= b4) {
                    return b5;
                }
                return 65533;
            }
            throw new EOFException("size < " + i4 + ": " + w0() + " (to read code point prefixed 0x" + B.h(G3) + ')');
        }
        throw new EOFException();
    }

    /* renamed from: v */
    public C0500b clone() {
        return A();
    }

    public final void v0(long j4) {
        this.f7649b = j4;
    }

    public final long w0() {
        return this.f7649b;
    }

    public int write(ByteBuffer byteBuffer) {
        o.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i4 = remaining;
        while (i4 > 0) {
            r z02 = z0(1);
            int min = Math.min(i4, 8192 - z02.f7685c);
            byteBuffer.get(z02.f7683a, z02.f7685c, min);
            i4 -= min;
            z02.f7685c += min;
        }
        this.f7649b += (long) remaining;
        return remaining;
    }

    public final ByteString x0() {
        if (w0() <= 2147483647L) {
            return y0((int) w0());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + w0()).toString());
    }

    public final long y() {
        long w02 = w0();
        if (w02 == 0) {
            return 0;
        }
        r rVar = this.f7648a;
        o.b(rVar);
        r rVar2 = rVar.f7689g;
        o.b(rVar2);
        int i4 = rVar2.f7685c;
        if (i4 < 8192 && rVar2.f7687e) {
            w02 -= (long) (i4 - rVar2.f7684b);
        }
        return w02;
    }

    public final ByteString y0(int i4) {
        if (i4 == 0) {
            return ByteString.EMPTY;
        }
        B.b(w0(), 0, (long) i4);
        r rVar = this.f7648a;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            o.b(rVar);
            int i8 = rVar.f7685c;
            int i9 = rVar.f7684b;
            if (i8 != i9) {
                i6 += i8 - i9;
                i7++;
                rVar = rVar.f7688f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i7][];
        int[] iArr = new int[(i7 * 2)];
        r rVar2 = this.f7648a;
        int i10 = 0;
        while (i5 < i4) {
            o.b(rVar2);
            bArr[i10] = rVar2.f7683a;
            i5 += rVar2.f7685c - rVar2.f7684b;
            iArr[i10] = Math.min(i5, i4);
            iArr[i10 + i7] = rVar2.f7684b;
            rVar2.f7686d = true;
            i10++;
            rVar2 = rVar2.f7688f;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    public void z(C0500b bVar, long j4) {
        r rVar;
        int i4;
        o.e(bVar, "source");
        if (bVar != this) {
            B.b(bVar.w0(), 0, j4);
            while (j4 > 0) {
                r rVar2 = bVar.f7648a;
                o.b(rVar2);
                int i5 = rVar2.f7685c;
                r rVar3 = bVar.f7648a;
                o.b(rVar3);
                if (j4 < ((long) (i5 - rVar3.f7684b))) {
                    r rVar4 = this.f7648a;
                    if (rVar4 != null) {
                        o.b(rVar4);
                        rVar = rVar4.f7689g;
                    } else {
                        rVar = null;
                    }
                    if (rVar != null && rVar.f7687e) {
                        long j5 = ((long) rVar.f7685c) + j4;
                        if (rVar.f7686d) {
                            i4 = 0;
                        } else {
                            i4 = rVar.f7684b;
                        }
                        if (j5 - ((long) i4) <= 8192) {
                            r rVar5 = bVar.f7648a;
                            o.b(rVar5);
                            rVar5.f(rVar, (int) j4);
                            bVar.v0(bVar.w0() - j4);
                            v0(w0() + j4);
                            return;
                        }
                    }
                    r rVar6 = bVar.f7648a;
                    o.b(rVar6);
                    bVar.f7648a = rVar6.e((int) j4);
                }
                r rVar7 = bVar.f7648a;
                o.b(rVar7);
                long j6 = (long) (rVar7.f7685c - rVar7.f7684b);
                bVar.f7648a = rVar7.b();
                r rVar8 = this.f7648a;
                if (rVar8 == null) {
                    this.f7648a = rVar7;
                    rVar7.f7689g = rVar7;
                    rVar7.f7688f = rVar7;
                } else {
                    o.b(rVar8);
                    r rVar9 = rVar8.f7689g;
                    o.b(rVar9);
                    rVar9.c(rVar7).a();
                }
                bVar.v0(bVar.w0() - j6);
                v0(w0() + j6);
                j4 -= j6;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public final r z0(int i4) {
        if (i4 < 1 || i4 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        r rVar = this.f7648a;
        if (rVar == null) {
            r c4 = t.c();
            this.f7648a = c4;
            c4.f7689g = c4;
            c4.f7688f = c4;
            return c4;
        }
        o.b(rVar);
        r rVar2 = rVar.f7689g;
        o.b(rVar2);
        if (rVar2.f7685c + i4 > 8192 || !rVar2.f7687e) {
            return rVar2.c(t.c());
        }
        return rVar2;
    }
}
