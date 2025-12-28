package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.silkimen.http.HttpRequest;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p1.k;

public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: a  reason: collision with root package name */
    static final byte[] f11076a = "Exif\u0000\u0000".getBytes(Charset.forName(HttpRequest.CHARSET_UTF8));

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f11077b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private interface Reader {

        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a(byte[] bArr, int i4);

        long b(long j4);

        short c();

        int d();
    }

    private static final class a implements Reader {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f11078a;

        a(ByteBuffer byteBuffer) {
            this.f11078a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public int a(byte[] bArr, int i4) {
            int min = Math.min(i4, this.f11078a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f11078a.get(bArr, 0, min);
            return min;
        }

        public long b(long j4) {
            int min = (int) Math.min((long) this.f11078a.remaining(), j4);
            ByteBuffer byteBuffer = this.f11078a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }

        public short c() {
            if (this.f11078a.remaining() >= 1) {
                return (short) (this.f11078a.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        public int d() {
            return (c() << 8) | c();
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f11079a;

        b(byte[] bArr, int i4) {
            this.f11079a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i4);
        }

        private boolean c(int i4, int i5) {
            if (this.f11079a.remaining() - i4 >= i5) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public short a(int i4) {
            if (c(i4, 2)) {
                return this.f11079a.getShort(i4);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public int b(int i4) {
            if (c(i4, 4)) {
                return this.f11079a.getInt(i4);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public int d() {
            return this.f11079a.remaining();
        }

        /* access modifiers changed from: package-private */
        public void e(ByteOrder byteOrder) {
            this.f11079a.order(byteOrder);
        }
    }

    private static final class c implements Reader {

        /* renamed from: a  reason: collision with root package name */
        private final InputStream f11080a;

        c(InputStream inputStream) {
            this.f11080a = inputStream;
        }

        public int a(byte[] bArr, int i4) {
            int i5 = 0;
            int i6 = 0;
            while (i5 < i4 && (i6 = this.f11080a.read(bArr, i5, i4 - i5)) != -1) {
                i5 += i6;
            }
            if (i5 != 0 || i6 != -1) {
                return i5;
            }
            throw new Reader.EndOfFileException();
        }

        public long b(long j4) {
            if (j4 < 0) {
                return 0;
            }
            long j5 = j4;
            while (j5 > 0) {
                long skip = this.f11080a.skip(j5);
                if (skip <= 0) {
                    if (this.f11080a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j5 -= skip;
            }
            return j4 - j5;
        }

        public short c() {
            int read = this.f11080a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }

        public int d() {
            return (c() << 8) | c();
        }
    }

    private static int e(int i4, int i5) {
        return i4 + 2 + (i5 * 12);
    }

    private int f(Reader reader, Z0.b bVar) {
        byte[] bArr;
        try {
            int d4 = reader.d();
            if (!h(d4)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Parser doesn't handle magic number: ");
                    sb.append(d4);
                }
                return -1;
            }
            int j4 = j(reader);
            if (j4 == -1) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            bArr = (byte[]) bVar.e(j4, byte[].class);
            int l4 = l(reader, bArr, j4);
            bVar.d(bArr);
            return l4;
        } catch (Reader.EndOfFileException unused) {
            return -1;
        } catch (Throwable th) {
            bVar.d(bArr);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bumptech.glide.load.ImageHeaderParser.ImageType g(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader r6) {
        /*
            r5 = this;
            int r0 = r6.d()     // Catch:{ EndOfFileException -> 0x00a9 }
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch:{ EndOfFileException -> 0x00a9 }
            return r6
        L_0x000c:
            int r0 = r0 << 8
            short r1 = r6.c()     // Catch:{ EndOfFileException -> 0x00a9 }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch:{ EndOfFileException -> 0x00a9 }
            return r6
        L_0x001b:
            int r0 = r0 << 8
            short r1 = r6.c()     // Catch:{ EndOfFileException -> 0x00a9 }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L_0x003c
            r0 = 21
            r6.b(r0)     // Catch:{ EndOfFileException -> 0x00a9 }
            short r6 = r6.c()     // Catch:{ EndOfFileException -> 0x0039 }
            r0 = 3
            if (r6 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch:{ EndOfFileException -> 0x0039 }
            goto L_0x0038
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ EndOfFileException -> 0x0039 }
        L_0x0038:
            return r6
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ EndOfFileException -> 0x00a9 }
            return r6
        L_0x003c:
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            if (r0 == r1) goto L_0x0046
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = r5.m(r6, r0)     // Catch:{ EndOfFileException -> 0x00a9 }
            return r6
        L_0x0046:
            r0 = 4
            r6.b(r0)     // Catch:{ EndOfFileException -> 0x00a9 }
            int r2 = r6.d()     // Catch:{ EndOfFileException -> 0x00a9 }
            int r2 = r2 << 16
            int r3 = r6.d()     // Catch:{ EndOfFileException -> 0x00a9 }
            r2 = r2 | r3
            r3 = 1464156752(0x57454250, float:2.16888601E14)
            if (r2 == r3) goto L_0x005e
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ EndOfFileException -> 0x00a9 }
            return r6
        L_0x005e:
            int r2 = r6.d()     // Catch:{ EndOfFileException -> 0x00a9 }
            int r2 = r2 << 16
            int r3 = r6.d()     // Catch:{ EndOfFileException -> 0x00a9 }
            r2 = r2 | r3
            r3 = r2 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r3 == r4) goto L_0x0073
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ EndOfFileException -> 0x00a9 }
            return r6
        L_0x0073:
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 88
            if (r2 != r3) goto L_0x0091
            r6.b(r0)     // Catch:{ EndOfFileException -> 0x00a9 }
            short r6 = r6.c()     // Catch:{ EndOfFileException -> 0x00a9 }
            r0 = r6 & 2
            if (r0 == 0) goto L_0x0087
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.ANIMATED_WEBP     // Catch:{ EndOfFileException -> 0x00a9 }
            return r6
        L_0x0087:
            r6 = r6 & 16
            if (r6 == 0) goto L_0x008e
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ EndOfFileException -> 0x00a9 }
            return r6
        L_0x008e:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ EndOfFileException -> 0x00a9 }
            return r6
        L_0x0091:
            r3 = 76
            if (r2 != r3) goto L_0x00a6
            r6.b(r0)     // Catch:{ EndOfFileException -> 0x00a9 }
            short r6 = r6.c()     // Catch:{ EndOfFileException -> 0x00a9 }
            r6 = r6 & 8
            if (r6 == 0) goto L_0x00a3
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ EndOfFileException -> 0x00a9 }
            goto L_0x00a5
        L_0x00a3:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ EndOfFileException -> 0x00a9 }
        L_0x00a5:
            return r6
        L_0x00a6:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ EndOfFileException -> 0x00a9 }
            return r6
        L_0x00a9:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.g(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    private static boolean h(int i4) {
        return (i4 & 65496) == 65496 || i4 == 19789 || i4 == 18761;
    }

    private boolean i(byte[] bArr, int i4) {
        boolean z3;
        if (bArr == null || i4 <= f11076a.length) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            int i5 = 0;
            while (true) {
                byte[] bArr2 = f11076a;
                if (i5 >= bArr2.length) {
                    break;
                } else if (bArr[i5] != bArr2[i5]) {
                    return false;
                } else {
                    i5++;
                }
            }
        }
        return z3;
    }

    private int j(Reader reader) {
        short c4;
        int d4;
        long j4;
        long b4;
        do {
            short c5 = reader.c();
            if (c5 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown segmentId=");
                    sb.append(c5);
                }
                return -1;
            }
            c4 = reader.c();
            if (c4 == 218) {
                return -1;
            }
            if (c4 == 217) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            d4 = reader.d() - 2;
            if (c4 == 225) {
                return d4;
            }
            j4 = (long) d4;
            b4 = reader.b(j4);
        } while (b4 == j4);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to skip enough data, type: ");
            sb2.append(c4);
            sb2.append(", wanted to skip: ");
            sb2.append(d4);
            sb2.append(", but actually skipped: ");
            sb2.append(b4);
        }
        return -1;
    }

    private static int k(b bVar) {
        ByteOrder byteOrder;
        short a4 = bVar.a(6);
        if (a4 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (a4 != 19789) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown endianness = ");
                sb.append(a4);
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.e(byteOrder);
        int b4 = bVar.b(10) + 6;
        short a5 = bVar.a(b4);
        for (int i4 = 0; i4 < a5; i4++) {
            int e4 = e(b4, i4);
            short a6 = bVar.a(e4);
            if (a6 == 274) {
                short a7 = bVar.a(e4 + 2);
                if (a7 >= 1 && a7 <= 12) {
                    int b5 = bVar.b(e4 + 4);
                    if (b5 < 0) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Got tagIndex=");
                            sb2.append(i4);
                            sb2.append(" tagType=");
                            sb2.append(a6);
                            sb2.append(" formatCode=");
                            sb2.append(a7);
                            sb2.append(" componentCount=");
                            sb2.append(b5);
                        }
                        int i5 = b5 + f11077b[a7];
                        if (i5 <= 4) {
                            int i6 = e4 + 8;
                            if (i6 < 0 || i6 > bVar.d()) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Illegal tagValueOffset=");
                                    sb3.append(i6);
                                    sb3.append(" tagType=");
                                    sb3.append(a6);
                                }
                            } else if (i5 >= 0 && i5 + i6 <= bVar.d()) {
                                return bVar.a(i6);
                            } else {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("Illegal number of bytes for TI tag data tagType=");
                                    sb4.append(a6);
                                }
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Got byte count > 4, not orientation, continuing, formatCode=");
                            sb5.append(a7);
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Got invalid format code = ");
                    sb6.append(a7);
                }
            }
        }
        return -1;
    }

    private int l(Reader reader, byte[] bArr, int i4) {
        int a4 = reader.a(bArr, i4);
        if (a4 != i4) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to read exif segment data, length: ");
                sb.append(i4);
                sb.append(", actually read: ");
                sb.append(a4);
            }
            return -1;
        } else if (i(bArr, i4)) {
            return k(new b(bArr, i4));
        } else {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
    }

    private ImageHeaderParser.ImageType m(Reader reader, int i4) {
        boolean z3;
        if (((reader.d() << 16) | reader.d()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int d4 = (reader.d() << 16) | reader.d();
        if (d4 == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i5 = 0;
        if (d4 == 1635150182) {
            z3 = true;
        } else {
            z3 = false;
        }
        reader.b(4);
        int i6 = i4 - 16;
        if (i6 % 4 == 0) {
            while (i5 < 5 && i6 > 0) {
                int d5 = (reader.d() << 16) | reader.d();
                if (d5 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (d5 == 1635150182) {
                    z3 = true;
                }
                i5++;
                i6 -= 4;
            }
        }
        if (z3) {
            return ImageHeaderParser.ImageType.AVIF;
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return g(new a((ByteBuffer) k.d(byteBuffer)));
    }

    public int b(InputStream inputStream, Z0.b bVar) {
        return f(new c((InputStream) k.d(inputStream)), (Z0.b) k.d(bVar));
    }

    public ImageHeaderParser.ImageType c(InputStream inputStream) {
        return g(new c((InputStream) k.d(inputStream)));
    }

    public int d(ByteBuffer byteBuffer, Z0.b bVar) {
        return f(new a((ByteBuffer) k.d(byteBuffer)), (Z0.b) k.d(bVar));
    }
}
