package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.system.OsConstants;
import android.util.Log;
import androidx.exifinterface.media.b;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

public class a {

    /* renamed from: A  reason: collision with root package name */
    static final byte[] f5540A = {-1, -40, -1};

    /* renamed from: B  reason: collision with root package name */
    private static final byte[] f5541B = {102, 116, 121, 112};

    /* renamed from: C  reason: collision with root package name */
    private static final byte[] f5542C = {109, 105, 102, 49};

    /* renamed from: D  reason: collision with root package name */
    private static final byte[] f5543D = {104, 101, 105, 99};

    /* renamed from: E  reason: collision with root package name */
    private static final byte[] f5544E = {79, 76, 89, 77, 80, 0};

    /* renamed from: F  reason: collision with root package name */
    private static final byte[] f5545F = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: G  reason: collision with root package name */
    private static final byte[] f5546G = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: H  reason: collision with root package name */
    private static final byte[] f5547H = {101, 88, 73, 102};

    /* renamed from: I  reason: collision with root package name */
    private static final byte[] f5548I = {73, 72, 68, 82};

    /* renamed from: J  reason: collision with root package name */
    private static final byte[] f5549J = {73, 69, 78, 68};

    /* renamed from: K  reason: collision with root package name */
    private static final byte[] f5550K = {82, 73, 70, 70};

    /* renamed from: L  reason: collision with root package name */
    private static final byte[] f5551L = {87, 69, 66, 80};

    /* renamed from: M  reason: collision with root package name */
    private static final byte[] f5552M = {69, 88, 73, 70};

    /* renamed from: N  reason: collision with root package name */
    private static final byte[] f5553N = {-99, 1, 42};

    /* renamed from: O  reason: collision with root package name */
    private static final byte[] f5554O = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: P  reason: collision with root package name */
    private static final byte[] f5555P = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: Q  reason: collision with root package name */
    private static final byte[] f5556Q = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: R  reason: collision with root package name */
    private static final byte[] f5557R = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: S  reason: collision with root package name */
    private static final byte[] f5558S = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: T  reason: collision with root package name */
    private static SimpleDateFormat f5559T;

    /* renamed from: U  reason: collision with root package name */
    private static SimpleDateFormat f5560U;

    /* renamed from: V  reason: collision with root package name */
    static final String[] f5561V = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: W  reason: collision with root package name */
    static final int[] f5562W = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: X  reason: collision with root package name */
    static final byte[] f5563X = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: Y  reason: collision with root package name */
    private static final d[] f5564Y;

    /* renamed from: Z  reason: collision with root package name */
    private static final d[] f5565Z;

    /* renamed from: a0  reason: collision with root package name */
    private static final d[] f5566a0;

    /* renamed from: b0  reason: collision with root package name */
    private static final d[] f5567b0;

    /* renamed from: c0  reason: collision with root package name */
    private static final d[] f5568c0;

    /* renamed from: d0  reason: collision with root package name */
    private static final d f5569d0;

    /* renamed from: e0  reason: collision with root package name */
    private static final d[] f5570e0;

    /* renamed from: f0  reason: collision with root package name */
    private static final d[] f5571f0;

    /* renamed from: g0  reason: collision with root package name */
    private static final d[] f5572g0;

    /* renamed from: h0  reason: collision with root package name */
    private static final d[] f5573h0;

    /* renamed from: i0  reason: collision with root package name */
    static final d[][] f5574i0;

    /* renamed from: j0  reason: collision with root package name */
    private static final d[] f5575j0;

    /* renamed from: k0  reason: collision with root package name */
    private static final HashMap[] f5576k0;

    /* renamed from: l0  reason: collision with root package name */
    private static final HashMap[] f5577l0;

    /* renamed from: m0  reason: collision with root package name */
    private static final HashSet f5578m0 = new HashSet(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));

    /* renamed from: n0  reason: collision with root package name */
    private static final HashMap f5579n0 = new HashMap();

    /* renamed from: o0  reason: collision with root package name */
    static final Charset f5580o0;

    /* renamed from: p0  reason: collision with root package name */
    static final byte[] f5581p0;

    /* renamed from: q0  reason: collision with root package name */
    private static final byte[] f5582q0;

    /* renamed from: r0  reason: collision with root package name */
    private static final Pattern f5583r0 = Pattern.compile(".*[1-9].*");

    /* renamed from: s0  reason: collision with root package name */
    private static final Pattern f5584s0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: t0  reason: collision with root package name */
    private static final Pattern f5585t0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: u  reason: collision with root package name */
    private static final boolean f5586u = Log.isLoggable("ExifInterface", 3);

    /* renamed from: u0  reason: collision with root package name */
    private static final Pattern f5587u0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: v  reason: collision with root package name */
    private static final List f5588v = Arrays.asList(new Integer[]{1, 6, 3, 8});

    /* renamed from: w  reason: collision with root package name */
    private static final List f5589w = Arrays.asList(new Integer[]{2, 7, 4, 5});

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f5590x = {8, 8, 8};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f5591y = {4};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f5592z = {8};

    /* renamed from: a  reason: collision with root package name */
    private String f5593a;

    /* renamed from: b  reason: collision with root package name */
    private FileDescriptor f5594b;

    /* renamed from: c  reason: collision with root package name */
    private AssetManager.AssetInputStream f5595c;

    /* renamed from: d  reason: collision with root package name */
    private int f5596d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5597e;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap[] f5598f;

    /* renamed from: g  reason: collision with root package name */
    private Set f5599g;

    /* renamed from: h  reason: collision with root package name */
    private ByteOrder f5600h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f5601i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f5602j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f5603k;

    /* renamed from: l  reason: collision with root package name */
    private int f5604l;

    /* renamed from: m  reason: collision with root package name */
    private int f5605m;

    /* renamed from: n  reason: collision with root package name */
    private byte[] f5606n;

    /* renamed from: o  reason: collision with root package name */
    private int f5607o;

    /* renamed from: p  reason: collision with root package name */
    private int f5608p;

    /* renamed from: q  reason: collision with root package name */
    private int f5609q;

    /* renamed from: r  reason: collision with root package name */
    private int f5610r;

    /* renamed from: s  reason: collision with root package name */
    private int f5611s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f5612t;

    /* renamed from: androidx.exifinterface.media.a$a  reason: collision with other inner class name */
    class C0092a extends MediaDataSource {

        /* renamed from: a  reason: collision with root package name */
        long f5613a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f5614b;

        C0092a(f fVar) {
            this.f5614b = fVar;
        }

        public void close() {
        }

        public long getSize() {
            return -1;
        }

        public int readAt(long j4, byte[] bArr, int i4, int i5) {
            if (i5 == 0) {
                return 0;
            }
            if (j4 < 0) {
                return -1;
            }
            try {
                long j5 = this.f5613a;
                if (j5 != j4) {
                    if (j5 >= 0 && j4 >= j5 + ((long) this.f5614b.available())) {
                        return -1;
                    }
                    this.f5614b.m(j4);
                    this.f5613a = j4;
                }
                if (i5 > this.f5614b.available()) {
                    i5 = this.f5614b.available();
                }
                int read = this.f5614b.read(bArr, i4, i5);
                if (read >= 0) {
                    this.f5613a += (long) read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f5613a = -1;
            return -1;
        }
    }

    private static class b extends InputStream implements DataInput {

        /* renamed from: e  reason: collision with root package name */
        private static final ByteOrder f5616e = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: f  reason: collision with root package name */
        private static final ByteOrder f5617f = ByteOrder.BIG_ENDIAN;

        /* renamed from: a  reason: collision with root package name */
        final DataInputStream f5618a;

        /* renamed from: b  reason: collision with root package name */
        private ByteOrder f5619b;

        /* renamed from: c  reason: collision with root package name */
        int f5620c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f5621d;

        b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        public int a() {
            return this.f5620c;
        }

        public int available() {
            return this.f5618a.available();
        }

        public long e() {
            return ((long) readInt()) & 4294967295L;
        }

        public void f(ByteOrder byteOrder) {
            this.f5619b = byteOrder;
        }

        public void h(int i4) {
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i4 - i5;
                int skip = (int) this.f5618a.skip((long) i6);
                if (skip <= 0) {
                    if (this.f5621d == null) {
                        this.f5621d = new byte[8192];
                    }
                    skip = this.f5618a.read(this.f5621d, 0, Math.min(8192, i6));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i4 + " bytes.");
                    }
                }
                i5 += skip;
            }
            this.f5620c += i5;
        }

        public void mark(int i4) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        public int read() {
            this.f5620c++;
            return this.f5618a.read();
        }

        public boolean readBoolean() {
            this.f5620c++;
            return this.f5618a.readBoolean();
        }

        public byte readByte() {
            this.f5620c++;
            int read = this.f5618a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        public char readChar() {
            this.f5620c += 2;
            return this.f5618a.readChar();
        }

        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr, int i4, int i5) {
            this.f5620c += i5;
            this.f5618a.readFully(bArr, i4, i5);
        }

        public int readInt() {
            this.f5620c += 4;
            int read = this.f5618a.read();
            int read2 = this.f5618a.read();
            int read3 = this.f5618a.read();
            int read4 = this.f5618a.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f5619b;
                if (byteOrder == f5616e) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f5617f) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f5619b);
            }
            throw new EOFException();
        }

        public String readLine() {
            return null;
        }

        public long readLong() {
            this.f5620c += 8;
            int read = this.f5618a.read();
            int read2 = this.f5618a.read();
            int read3 = this.f5618a.read();
            int read4 = this.f5618a.read();
            int read5 = this.f5618a.read();
            int read6 = this.f5618a.read();
            int read7 = this.f5618a.read();
            int read8 = this.f5618a.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f5619b;
                if (byteOrder == f5616e) {
                    return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                }
                int i4 = read2;
                if (byteOrder == f5617f) {
                    return (((long) read) << 56) + (((long) i4) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                }
                throw new IOException("Invalid byte order: " + this.f5619b);
            }
            throw new EOFException();
        }

        public short readShort() {
            this.f5620c += 2;
            int read = this.f5618a.read();
            int read2 = this.f5618a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f5619b;
                if (byteOrder == f5616e) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == f5617f) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f5619b);
            }
            throw new EOFException();
        }

        public String readUTF() {
            this.f5620c += 2;
            return this.f5618a.readUTF();
        }

        public int readUnsignedByte() {
            this.f5620c++;
            return this.f5618a.readUnsignedByte();
        }

        public int readUnsignedShort() {
            this.f5620c += 2;
            int read = this.f5618a.read();
            int read2 = this.f5618a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f5619b;
                if (byteOrder == f5616e) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == f5617f) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f5619b);
            }
            throw new EOFException();
        }

        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        public int skipBytes(int i4) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            this.f5619b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f5618a = dataInputStream;
            dataInputStream.mark(0);
            this.f5620c = 0;
            this.f5619b = byteOrder;
        }

        public int read(byte[] bArr, int i4, int i5) {
            int read = this.f5618a.read(bArr, i4, i5);
            this.f5620c += read;
            return read;
        }

        public void readFully(byte[] bArr) {
            this.f5620c += bArr.length;
            this.f5618a.readFully(bArr);
        }
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f5622a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5623b;

        /* renamed from: c  reason: collision with root package name */
        public final long f5624c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f5625d;

        c(int i4, int i5, byte[] bArr) {
            this(i4, i5, -1, bArr);
        }

        public static c a(String str) {
            byte[] bytes = (str + 0).getBytes(a.f5580o0);
            return new c(2, bytes.length, bytes);
        }

        public static c b(long j4, ByteOrder byteOrder) {
            return c(new long[]{j4}, byteOrder);
        }

        public static c c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.f5562W[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j4 : jArr) {
                wrap.putInt((int) j4);
            }
            return new c(4, jArr.length, wrap.array());
        }

        public static c d(e eVar, ByteOrder byteOrder) {
            return e(new e[]{eVar}, byteOrder);
        }

        public static c e(e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.f5562W[5] * eVarArr.length)]);
            wrap.order(byteOrder);
            for (e eVar : eVarArr) {
                wrap.putInt((int) eVar.f5630a);
                wrap.putInt((int) eVar.f5631b);
            }
            return new c(5, eVarArr.length, wrap.array());
        }

        public static c f(int i4, ByteOrder byteOrder) {
            return g(new int[]{i4}, byteOrder);
        }

        public static c g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.f5562W[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i4 : iArr) {
                wrap.putShort((short) i4);
            }
            return new c(3, iArr.length, wrap.array());
        }

        public double h(ByteOrder byteOrder) {
            Object k4 = k(byteOrder);
            if (k4 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (k4 instanceof String) {
                return Double.parseDouble((String) k4);
            } else {
                if (k4 instanceof long[]) {
                    long[] jArr = (long[]) k4;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k4 instanceof int[]) {
                    int[] iArr = (int[]) k4;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k4 instanceof double[]) {
                    double[] dArr = (double[]) k4;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k4 instanceof e[]) {
                    e[] eVarArr = (e[]) k4;
                    if (eVarArr.length == 1) {
                        return eVarArr[0].a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        public int i(ByteOrder byteOrder) {
            Object k4 = k(byteOrder);
            if (k4 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (k4 instanceof String) {
                return Integer.parseInt((String) k4);
            } else {
                if (k4 instanceof long[]) {
                    long[] jArr = (long[]) k4;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k4 instanceof int[]) {
                    int[] iArr = (int[]) k4;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public String j(ByteOrder byteOrder) {
            Object k4 = k(byteOrder);
            if (k4 == null) {
                return null;
            }
            if (k4 instanceof String) {
                return (String) k4;
            }
            StringBuilder sb = new StringBuilder();
            int i4 = 0;
            if (k4 instanceof long[]) {
                long[] jArr = (long[]) k4;
                while (i4 < jArr.length) {
                    sb.append(jArr[i4]);
                    i4++;
                    if (i4 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (k4 instanceof int[]) {
                int[] iArr = (int[]) k4;
                while (i4 < iArr.length) {
                    sb.append(iArr[i4]);
                    i4++;
                    if (i4 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (k4 instanceof double[]) {
                double[] dArr = (double[]) k4;
                while (i4 < dArr.length) {
                    sb.append(dArr[i4]);
                    i4++;
                    if (i4 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(k4 instanceof e[])) {
                return null;
            } else {
                e[] eVarArr = (e[]) k4;
                while (i4 < eVarArr.length) {
                    sb.append(eVarArr[i4].f5630a);
                    sb.append('/');
                    sb.append(eVarArr[i4].f5631b);
                    i4++;
                    if (i4 != eVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:162:0x018f A[SYNTHETIC, Splitter:B:162:0x018f] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object k(java.nio.ByteOrder r12) {
            /*
                r11 = this;
                r0 = 0
                r1 = 1
                java.lang.String r2 = "IOException occurred while closing InputStream"
                java.lang.String r3 = "ExifInterface"
                r4 = 0
                androidx.exifinterface.media.a$b r5 = new androidx.exifinterface.media.a$b     // Catch:{ IOException -> 0x017b, all -> 0x0179 }
                byte[] r6 = r11.f5625d     // Catch:{ IOException -> 0x017b, all -> 0x0179 }
                r5.<init>((byte[]) r6)     // Catch:{ IOException -> 0x017b, all -> 0x0179 }
                r5.f(r12)     // Catch:{ IOException -> 0x0033 }
                int r12 = r11.f5622a     // Catch:{ IOException -> 0x0033 }
                switch(r12) {
                    case 1: goto L_0x0149;
                    case 2: goto L_0x0103;
                    case 3: goto L_0x00ea;
                    case 4: goto L_0x00d1;
                    case 5: goto L_0x00af;
                    case 6: goto L_0x0149;
                    case 7: goto L_0x0103;
                    case 8: goto L_0x0096;
                    case 9: goto L_0x007d;
                    case 10: goto L_0x0059;
                    case 11: goto L_0x003f;
                    case 12: goto L_0x001f;
                    default: goto L_0x0016;
                }
            L_0x0016:
                r5.close()     // Catch:{ IOException -> 0x001a }
                goto L_0x001e
            L_0x001a:
                r12 = move-exception
                android.util.Log.e(r3, r2, r12)
            L_0x001e:
                return r4
            L_0x001f:
                int r12 = r11.f5623b     // Catch:{ IOException -> 0x0033 }
                double[] r12 = new double[r12]     // Catch:{ IOException -> 0x0033 }
            L_0x0023:
                int r6 = r11.f5623b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x0036
                double r6 = r5.readDouble()     // Catch:{ IOException -> 0x0033 }
                r12[r0] = r6     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x0023
            L_0x002f:
                r12 = move-exception
                r4 = r5
                goto L_0x018d
            L_0x0033:
                r12 = move-exception
                goto L_0x017d
            L_0x0036:
                r5.close()     // Catch:{ IOException -> 0x003a }
                goto L_0x003e
            L_0x003a:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x003e:
                return r12
            L_0x003f:
                int r12 = r11.f5623b     // Catch:{ IOException -> 0x0033 }
                double[] r12 = new double[r12]     // Catch:{ IOException -> 0x0033 }
            L_0x0043:
                int r6 = r11.f5623b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x0050
                float r6 = r5.readFloat()     // Catch:{ IOException -> 0x0033 }
                double r6 = (double) r6     // Catch:{ IOException -> 0x0033 }
                r12[r0] = r6     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x0043
            L_0x0050:
                r5.close()     // Catch:{ IOException -> 0x0054 }
                goto L_0x0058
            L_0x0054:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x0058:
                return r12
            L_0x0059:
                int r12 = r11.f5623b     // Catch:{ IOException -> 0x0033 }
                androidx.exifinterface.media.a$e[] r12 = new androidx.exifinterface.media.a.e[r12]     // Catch:{ IOException -> 0x0033 }
            L_0x005d:
                int r6 = r11.f5623b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x0074
                int r6 = r5.readInt()     // Catch:{ IOException -> 0x0033 }
                long r6 = (long) r6     // Catch:{ IOException -> 0x0033 }
                int r8 = r5.readInt()     // Catch:{ IOException -> 0x0033 }
                long r8 = (long) r8     // Catch:{ IOException -> 0x0033 }
                androidx.exifinterface.media.a$e r10 = new androidx.exifinterface.media.a$e     // Catch:{ IOException -> 0x0033 }
                r10.<init>(r6, r8)     // Catch:{ IOException -> 0x0033 }
                r12[r0] = r10     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x005d
            L_0x0074:
                r5.close()     // Catch:{ IOException -> 0x0078 }
                goto L_0x007c
            L_0x0078:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x007c:
                return r12
            L_0x007d:
                int r12 = r11.f5623b     // Catch:{ IOException -> 0x0033 }
                int[] r12 = new int[r12]     // Catch:{ IOException -> 0x0033 }
            L_0x0081:
                int r6 = r11.f5623b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x008d
                int r6 = r5.readInt()     // Catch:{ IOException -> 0x0033 }
                r12[r0] = r6     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x0081
            L_0x008d:
                r5.close()     // Catch:{ IOException -> 0x0091 }
                goto L_0x0095
            L_0x0091:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x0095:
                return r12
            L_0x0096:
                int r12 = r11.f5623b     // Catch:{ IOException -> 0x0033 }
                int[] r12 = new int[r12]     // Catch:{ IOException -> 0x0033 }
            L_0x009a:
                int r6 = r11.f5623b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x00a6
                short r6 = r5.readShort()     // Catch:{ IOException -> 0x0033 }
                r12[r0] = r6     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x009a
            L_0x00a6:
                r5.close()     // Catch:{ IOException -> 0x00aa }
                goto L_0x00ae
            L_0x00aa:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x00ae:
                return r12
            L_0x00af:
                int r12 = r11.f5623b     // Catch:{ IOException -> 0x0033 }
                androidx.exifinterface.media.a$e[] r12 = new androidx.exifinterface.media.a.e[r12]     // Catch:{ IOException -> 0x0033 }
            L_0x00b3:
                int r6 = r11.f5623b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x00c8
                long r6 = r5.e()     // Catch:{ IOException -> 0x0033 }
                long r8 = r5.e()     // Catch:{ IOException -> 0x0033 }
                androidx.exifinterface.media.a$e r10 = new androidx.exifinterface.media.a$e     // Catch:{ IOException -> 0x0033 }
                r10.<init>(r6, r8)     // Catch:{ IOException -> 0x0033 }
                r12[r0] = r10     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x00b3
            L_0x00c8:
                r5.close()     // Catch:{ IOException -> 0x00cc }
                goto L_0x00d0
            L_0x00cc:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x00d0:
                return r12
            L_0x00d1:
                int r12 = r11.f5623b     // Catch:{ IOException -> 0x0033 }
                long[] r12 = new long[r12]     // Catch:{ IOException -> 0x0033 }
            L_0x00d5:
                int r6 = r11.f5623b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x00e1
                long r6 = r5.e()     // Catch:{ IOException -> 0x0033 }
                r12[r0] = r6     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x00d5
            L_0x00e1:
                r5.close()     // Catch:{ IOException -> 0x00e5 }
                goto L_0x00e9
            L_0x00e5:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x00e9:
                return r12
            L_0x00ea:
                int r12 = r11.f5623b     // Catch:{ IOException -> 0x0033 }
                int[] r12 = new int[r12]     // Catch:{ IOException -> 0x0033 }
            L_0x00ee:
                int r6 = r11.f5623b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x00fa
                int r6 = r5.readUnsignedShort()     // Catch:{ IOException -> 0x0033 }
                r12[r0] = r6     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x00ee
            L_0x00fa:
                r5.close()     // Catch:{ IOException -> 0x00fe }
                goto L_0x0102
            L_0x00fe:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x0102:
                return r12
            L_0x0103:
                int r12 = r11.f5623b     // Catch:{ IOException -> 0x0033 }
                byte[] r6 = androidx.exifinterface.media.a.f5563X     // Catch:{ IOException -> 0x0033 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0033 }
                if (r12 < r6) goto L_0x011c
                r12 = r0
            L_0x010b:
                byte[] r6 = androidx.exifinterface.media.a.f5563X     // Catch:{ IOException -> 0x0033 }
                int r7 = r6.length     // Catch:{ IOException -> 0x0033 }
                if (r12 >= r7) goto L_0x011b
                byte[] r7 = r11.f5625d     // Catch:{ IOException -> 0x0033 }
                byte r7 = r7[r12]     // Catch:{ IOException -> 0x0033 }
                byte r6 = r6[r12]     // Catch:{ IOException -> 0x0033 }
                if (r7 == r6) goto L_0x0119
                goto L_0x011c
            L_0x0119:
                int r12 = r12 + r1
                goto L_0x010b
            L_0x011b:
                int r0 = r6.length     // Catch:{ IOException -> 0x0033 }
            L_0x011c:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0033 }
                r12.<init>()     // Catch:{ IOException -> 0x0033 }
            L_0x0121:
                int r6 = r11.f5623b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x013c
                byte[] r6 = r11.f5625d     // Catch:{ IOException -> 0x0033 }
                byte r6 = r6[r0]     // Catch:{ IOException -> 0x0033 }
                if (r6 != 0) goto L_0x012c
                goto L_0x013c
            L_0x012c:
                r7 = 32
                if (r6 < r7) goto L_0x0135
                char r6 = (char) r6     // Catch:{ IOException -> 0x0033 }
                r12.append(r6)     // Catch:{ IOException -> 0x0033 }
                goto L_0x013a
            L_0x0135:
                r6 = 63
                r12.append(r6)     // Catch:{ IOException -> 0x0033 }
            L_0x013a:
                int r0 = r0 + r1
                goto L_0x0121
            L_0x013c:
                java.lang.String r12 = r12.toString()     // Catch:{ IOException -> 0x0033 }
                r5.close()     // Catch:{ IOException -> 0x0144 }
                goto L_0x0148
            L_0x0144:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x0148:
                return r12
            L_0x0149:
                byte[] r12 = r11.f5625d     // Catch:{ IOException -> 0x0033 }
                int r6 = r12.length     // Catch:{ IOException -> 0x0033 }
                if (r6 != r1) goto L_0x0169
                byte r6 = r12[r0]     // Catch:{ IOException -> 0x0033 }
                if (r6 < 0) goto L_0x0169
                if (r6 > r1) goto L_0x0169
                java.lang.String r12 = new java.lang.String     // Catch:{ IOException -> 0x0033 }
                int r6 = r6 + 48
                char r6 = (char) r6     // Catch:{ IOException -> 0x0033 }
                char[] r1 = new char[r1]     // Catch:{ IOException -> 0x0033 }
                r1[r0] = r6     // Catch:{ IOException -> 0x0033 }
                r12.<init>(r1)     // Catch:{ IOException -> 0x0033 }
                r5.close()     // Catch:{ IOException -> 0x0164 }
                goto L_0x0168
            L_0x0164:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x0168:
                return r12
            L_0x0169:
                java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x0033 }
                java.nio.charset.Charset r1 = androidx.exifinterface.media.a.f5580o0     // Catch:{ IOException -> 0x0033 }
                r0.<init>(r12, r1)     // Catch:{ IOException -> 0x0033 }
                r5.close()     // Catch:{ IOException -> 0x0174 }
                goto L_0x0178
            L_0x0174:
                r12 = move-exception
                android.util.Log.e(r3, r2, r12)
            L_0x0178:
                return r0
            L_0x0179:
                r12 = move-exception
                goto L_0x018d
            L_0x017b:
                r12 = move-exception
                r5 = r4
            L_0x017d:
                java.lang.String r0 = "IOException occurred during reading a value"
                android.util.Log.w(r3, r0, r12)     // Catch:{ all -> 0x002f }
                if (r5 == 0) goto L_0x018c
                r5.close()     // Catch:{ IOException -> 0x0188 }
                goto L_0x018c
            L_0x0188:
                r12 = move-exception
                android.util.Log.e(r3, r2, r12)
            L_0x018c:
                return r4
            L_0x018d:
                if (r4 == 0) goto L_0x0197
                r4.close()     // Catch:{ IOException -> 0x0193 }
                goto L_0x0197
            L_0x0193:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x0197:
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.c.k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + a.f5561V[this.f5622a] + ", data length:" + this.f5625d.length + ")";
        }

        c(int i4, int i5, long j4, byte[] bArr) {
            this.f5622a = i4;
            this.f5623b = i5;
            this.f5624c = j4;
            this.f5625d = bArr;
        }
    }

    private static class e {

        /* renamed from: a  reason: collision with root package name */
        public final long f5630a;

        /* renamed from: b  reason: collision with root package name */
        public final long f5631b;

        e(long j4, long j5) {
            if (j5 == 0) {
                this.f5630a = 0;
                this.f5631b = 1;
                return;
            }
            this.f5630a = j4;
            this.f5631b = j5;
        }

        public double a() {
            return ((double) this.f5630a) / ((double) this.f5631b);
        }

        public String toString() {
            return this.f5630a + "/" + this.f5631b;
        }
    }

    static {
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        f5564Y = dVarArr;
        d[] dVarArr2 = dVarArr;
        d[] dVarArr3 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f5565Z = dVarArr3;
        d[] dVarArr4 = dVarArr3;
        d[] dVarArr5 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        f5566a0 = dVarArr5;
        d[] dVarArr6 = {new d("InteroperabilityIndex", 1, 2)};
        f5567b0 = dVarArr6;
        String str = "StripOffsets";
        d[] dVarArr7 = dVarArr6;
        String str2 = str;
        String str3 = "SubIFDPointer";
        String str4 = "ExifIFDPointer";
        d[] dVarArr8 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(str, 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d(str3, 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Xmp", 700, 1), new d("Copyright", 33432, 2), new d(str4, 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f5568c0 = dVarArr8;
        f5569d0 = new d(str2, 273, 3);
        d[] dVarArr9 = {new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)};
        f5570e0 = dVarArr9;
        d[] dVarArr10 = {new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)};
        f5571f0 = dVarArr10;
        d[] dVarArr11 = {new d("AspectFrame", 4371, 3)};
        f5572g0 = dVarArr11;
        d[] dVarArr12 = {new d("ColorSpace", 55, 3)};
        f5573h0 = dVarArr12;
        d[][] dVarArr13 = {dVarArr2, dVarArr4, dVarArr5, dVarArr7, dVarArr8, dVarArr2, dVarArr9, dVarArr10, dVarArr11, dVarArr12};
        f5574i0 = dVarArr13;
        f5575j0 = new d[]{new d(str3, 330, 4), new d(str4, 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f5576k0 = new HashMap[dVarArr13.length];
        f5577l0 = new HashMap[dVarArr13.length];
        Charset forName = Charset.forName("US-ASCII");
        f5580o0 = forName;
        f5581p0 = "Exif\u0000\u0000".getBytes(forName);
        f5582q0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f5559T = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f5560U = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i4 = 0;
        while (true) {
            d[][] dVarArr14 = f5574i0;
            if (i4 < dVarArr14.length) {
                f5576k0[i4] = new HashMap();
                f5577l0[i4] = new HashMap();
                for (d dVar : dVarArr14[i4]) {
                    f5576k0[i4].put(Integer.valueOf(dVar.f5626a), dVar);
                    f5577l0[i4].put(dVar.f5627b, dVar);
                }
                i4++;
            } else {
                HashMap hashMap = f5579n0;
                d[] dVarArr15 = f5575j0;
                hashMap.put(Integer.valueOf(dVarArr15[0].f5626a), 5);
                hashMap.put(Integer.valueOf(dVarArr15[1].f5626a), 1);
                hashMap.put(Integer.valueOf(dVarArr15[2].f5626a), 2);
                hashMap.put(Integer.valueOf(dVarArr15[3].f5626a), 3);
                hashMap.put(Integer.valueOf(dVarArr15[4].f5626a), 7);
                hashMap.put(Integer.valueOf(dVarArr15[5].f5626a), 8);
                return;
            }
        }
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    private boolean A(byte[] bArr) {
        int i4 = 0;
        while (true) {
            byte[] bArr2 = f5550K;
            if (i4 >= bArr2.length) {
                int i5 = 0;
                while (true) {
                    byte[] bArr3 = f5551L;
                    if (i5 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f5550K.length + i5 + 4] != bArr3[i5]) {
                        return false;
                    }
                    i5++;
                }
            } else if (bArr[i4] != bArr2[i4]) {
                return false;
            } else {
                i4++;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x009f A[Catch:{ all -> 0x0015 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void B(java.io.InputStream r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x00b8
            r0 = 0
            r1 = r0
        L_0x0004:
            androidx.exifinterface.media.a$d[][] r2 = f5574i0     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            int r2 = r2.length     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            if (r1 >= r2) goto L_0x001e
            java.util.HashMap[] r2 = r4.f5598f     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r3.<init>()     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r2[r1] = r3     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0015:
            r5 = move-exception
            goto L_0x00ad
        L_0x0018:
            r5 = move-exception
            goto L_0x009b
        L_0x001b:
            r5 = move-exception
            goto L_0x009b
        L_0x001e:
            boolean r1 = r4.f5597e     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            if (r1 != 0) goto L_0x0030
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            int r5 = r4.g(r1)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r4.f5596d = r5     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r5 = r1
        L_0x0030:
            int r1 = r4.f5596d     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            boolean r1 = K(r1)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            if (r1 == 0) goto L_0x006b
            androidx.exifinterface.media.a$f r0 = new androidx.exifinterface.media.a$f     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r0.<init>((java.io.InputStream) r5)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            boolean r5 = r4.f5597e     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            if (r5 == 0) goto L_0x0045
            r4.m(r0)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            goto L_0x0061
        L_0x0045:
            int r5 = r4.f5596d     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r1 = 12
            if (r5 != r1) goto L_0x004f
            r4.e(r0)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            goto L_0x0061
        L_0x004f:
            r1 = 7
            if (r5 != r1) goto L_0x0056
            r4.h(r0)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            goto L_0x0061
        L_0x0056:
            r1 = 10
            if (r5 != r1) goto L_0x005e
            r4.l(r0)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            goto L_0x0061
        L_0x005e:
            r4.k(r0)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
        L_0x0061:
            int r5 = r4.f5608p     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            long r1 = (long) r5     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r0.m(r1)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r4.J(r0)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            goto L_0x0090
        L_0x006b:
            androidx.exifinterface.media.a$b r1 = new androidx.exifinterface.media.a$b     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r1.<init>((java.io.InputStream) r5)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            int r5 = r4.f5596d     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r2 = 4
            if (r5 != r2) goto L_0x0079
            r4.f(r1, r0, r0)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            goto L_0x0090
        L_0x0079:
            r0 = 13
            if (r5 != r0) goto L_0x0081
            r4.i(r1)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            goto L_0x0090
        L_0x0081:
            r0 = 9
            if (r5 != r0) goto L_0x0089
            r4.j(r1)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            goto L_0x0090
        L_0x0089:
            r0 = 14
            if (r5 != r0) goto L_0x0090
            r4.n(r1)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
        L_0x0090:
            r4.a()
            boolean r5 = f5586u
            if (r5 == 0) goto L_0x00ac
        L_0x0097:
            r4.D()
            goto L_0x00ac
        L_0x009b:
            boolean r0 = f5586u     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x00a6
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r5)     // Catch:{ all -> 0x0015 }
        L_0x00a6:
            r4.a()
            if (r0 == 0) goto L_0x00ac
            goto L_0x0097
        L_0x00ac:
            return
        L_0x00ad:
            r4.a()
            boolean r0 = f5586u
            if (r0 == 0) goto L_0x00b7
            r4.D()
        L_0x00b7:
            throw r5
        L_0x00b8:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "inputstream shouldn't be null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.B(java.io.InputStream):void");
    }

    private void C(b bVar) {
        ByteOrder E3 = E(bVar);
        this.f5600h = E3;
        bVar.f(E3);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i4 = this.f5596d;
        if (i4 == 7 || i4 == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt >= 8) {
                int i5 = readInt - 8;
                if (i5 > 0) {
                    bVar.h(i5);
                    return;
                }
                return;
            }
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    private void D() {
        for (int i4 = 0; i4 < this.f5598f.length; i4++) {
            StringBuilder sb = new StringBuilder();
            sb.append("The size of tag group[");
            sb.append(i4);
            sb.append("]: ");
            sb.append(this.f5598f[i4].size());
            for (Map.Entry entry : this.f5598f[i4].entrySet()) {
                c cVar = (c) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("tagName: ");
                sb2.append((String) entry.getKey());
                sb2.append(", tagType: ");
                sb2.append(cVar.toString());
                sb2.append(", tagValue: '");
                sb2.append(cVar.j(this.f5600h));
                sb2.append("'");
            }
        }
    }

    private ByteOrder E(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    private void F(byte[] bArr, int i4) {
        f fVar = new f(bArr);
        C(fVar);
        G(fVar, i4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0239  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void G(androidx.exifinterface.media.a.f r29, int r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            r5 = 5
            r7 = 0
            r8 = 1
            java.util.Set r9 = r0.f5599g
            int r10 = r1.f5620c
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9.add(r10)
            short r9 = r29.readShort()
            boolean r10 = f5586u
            if (r10 == 0) goto L_0x0029
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "numberOfDirectoryEntry: "
            r10.append(r11)
            r10.append(r9)
        L_0x0029:
            if (r9 > 0) goto L_0x002c
            return
        L_0x002c:
            r10 = r7
        L_0x002d:
            if (r10 >= r9) goto L_0x02d8
            int r13 = r29.readUnsignedShort()
            int r14 = r29.readUnsignedShort()
            int r15 = r29.readInt()
            int r11 = r29.a()
            long r11 = (long) r11
            r18 = 4
            long r11 = r11 + r18
            java.util.HashMap[] r20 = f5576k0
            r6 = r20[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            java.lang.Object r3 = r6.get(r3)
            androidx.exifinterface.media.a$d r3 = (androidx.exifinterface.media.a.d) r3
            boolean r6 = f5586u
            if (r6 == 0) goto L_0x0084
            java.lang.Integer r20 = java.lang.Integer.valueOf(r30)
            java.lang.Integer r21 = java.lang.Integer.valueOf(r13)
            if (r3 == 0) goto L_0x0063
            java.lang.String r4 = r3.f5627b
            goto L_0x0064
        L_0x0063:
            r4 = 0
        L_0x0064:
            java.lang.Integer r22 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r23 = java.lang.Integer.valueOf(r15)
            r24 = r9
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r9[r7] = r20
            r9[r8] = r21
            r20 = 2
            r9[r20] = r4
            r4 = 3
            r9[r4] = r22
            r4 = 4
            r9[r4] = r23
            java.lang.String r4 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String.format(r4, r9)
            goto L_0x0086
        L_0x0084:
            r24 = r9
        L_0x0086:
            r4 = 7
            if (r3 != 0) goto L_0x0099
            if (r6 == 0) goto L_0x00fe
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r5 = "Skip the tag entry since tag number is not defined: "
            r9.append(r5)
            r9.append(r13)
            goto L_0x00fe
        L_0x0099:
            if (r14 <= 0) goto L_0x00ef
            int[] r5 = f5562W
            int r9 = r5.length
            if (r14 < r9) goto L_0x00a1
            goto L_0x00ef
        L_0x00a1:
            boolean r9 = r3.a(r14)
            if (r9 != 0) goto L_0x00c5
            if (r6 == 0) goto L_0x00fe
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "Skip the tag entry since data format ("
            r5.append(r9)
            java.lang.String[] r9 = f5561V
            r9 = r9[r14]
            r5.append(r9)
            java.lang.String r9 = ") is unexpected for tag: "
            r5.append(r9)
            java.lang.String r9 = r3.f5627b
            r5.append(r9)
            goto L_0x00fe
        L_0x00c5:
            if (r14 != r4) goto L_0x00c9
            int r14 = r3.f5628c
        L_0x00c9:
            long r8 = (long) r15
            r5 = r5[r14]
            long r4 = (long) r5
            long r4 = r4 * r8
            r8 = 0
            int r23 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r23 < 0) goto L_0x00de
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x00dc
            goto L_0x00de
        L_0x00dc:
            r8 = 1
            goto L_0x0101
        L_0x00de:
            if (r6 == 0) goto L_0x00ed
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Skip the tag entry since the number of components is invalid: "
            r8.append(r9)
            r8.append(r15)
        L_0x00ed:
            r8 = r7
            goto L_0x0101
        L_0x00ef:
            if (r6 == 0) goto L_0x00fe
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Skip the tag entry since data format is invalid: "
            r4.append(r5)
            r4.append(r14)
        L_0x00fe:
            r8 = r7
            r4 = 0
        L_0x0101:
            if (r8 != 0) goto L_0x010d
            r1.m(r11)
            r25 = r10
            r3 = 1
            r4 = 3
            r10 = 2
            goto L_0x02cd
        L_0x010d:
            int r8 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            java.lang.String r9 = "Compression"
            if (r8 <= 0) goto L_0x018e
            int r8 = r29.readInt()
            if (r6 == 0) goto L_0x0129
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r25 = r10
            java.lang.String r10 = "seek to data offset: "
            r7.append(r10)
            r7.append(r8)
            goto L_0x012b
        L_0x0129:
            r25 = r10
        L_0x012b:
            int r7 = r0.f5596d
            r10 = 7
            if (r7 != r10) goto L_0x013c
            java.lang.String r7 = r3.f5627b
            java.lang.String r10 = "MakerNote"
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x0141
            r0.f5609q = r8
        L_0x013c:
            r26 = r11
            r18 = r15
            goto L_0x0189
        L_0x0141:
            r7 = 6
            if (r2 != r7) goto L_0x013c
            java.lang.String r10 = "ThumbnailImage"
            java.lang.String r7 = r3.f5627b
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x013c
            r0.f5610r = r8
            r0.f5611s = r15
            java.nio.ByteOrder r7 = r0.f5600h
            r10 = 6
            androidx.exifinterface.media.a$c r7 = androidx.exifinterface.media.a.c.f(r10, r7)
            int r10 = r0.f5610r
            r26 = r11
            long r10 = (long) r10
            java.nio.ByteOrder r12 = r0.f5600h
            androidx.exifinterface.media.a$c r10 = androidx.exifinterface.media.a.c.b(r10, r12)
            int r11 = r0.f5611s
            long r11 = (long) r11
            r18 = r15
            java.nio.ByteOrder r15 = r0.f5600h
            androidx.exifinterface.media.a$c r11 = androidx.exifinterface.media.a.c.b(r11, r15)
            java.util.HashMap[] r12 = r0.f5598f
            r15 = 4
            r12 = r12[r15]
            r12.put(r9, r7)
            java.util.HashMap[] r7 = r0.f5598f
            r7 = r7[r15]
            java.lang.String r12 = "JPEGInterchangeFormat"
            r7.put(r12, r10)
            java.util.HashMap[] r7 = r0.f5598f
            r7 = r7[r15]
            java.lang.String r10 = "JPEGInterchangeFormatLength"
            r7.put(r10, r11)
        L_0x0189:
            long r7 = (long) r8
            r1.m(r7)
            goto L_0x0194
        L_0x018e:
            r25 = r10
            r26 = r11
            r18 = r15
        L_0x0194:
            java.util.HashMap r7 = f5579n0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
            java.lang.Object r7 = r7.get(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r6 == 0) goto L_0x01b7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "nextIfdType: "
            r8.append(r10)
            r8.append(r7)
            java.lang.String r10 = " byteCount: "
            r8.append(r10)
            r8.append(r4)
        L_0x01b7:
            r8 = 8
            if (r7 == 0) goto L_0x0250
            r10 = 3
            if (r14 == r10) goto L_0x01de
            r4 = 4
            if (r14 == r4) goto L_0x01d9
            if (r14 == r8) goto L_0x01d4
            r4 = 9
            if (r14 == r4) goto L_0x01ce
            r4 = 13
            if (r14 == r4) goto L_0x01ce
            r4 = -1
            goto L_0x01e3
        L_0x01ce:
            int r4 = r29.readInt()
        L_0x01d2:
            long r4 = (long) r4
            goto L_0x01e3
        L_0x01d4:
            short r4 = r29.readShort()
            goto L_0x01d2
        L_0x01d9:
            long r4 = r29.e()
            goto L_0x01e3
        L_0x01de:
            int r4 = r29.readUnsignedShort()
            goto L_0x01d2
        L_0x01e3:
            if (r6 == 0) goto L_0x01fc
            java.lang.Long r8 = java.lang.Long.valueOf(r4)
            java.lang.String r3 = r3.f5627b
            r10 = 2
            java.lang.Object[] r9 = new java.lang.Object[r10]
            r11 = 0
            r9[r11] = r8
            r8 = 1
            r9[r8] = r3
            java.lang.String r3 = "Offset: %d, tagName: %s"
            java.lang.String.format(r3, r9)
        L_0x01f9:
            r8 = 0
            goto L_0x01fe
        L_0x01fc:
            r10 = 2
            goto L_0x01f9
        L_0x01fe:
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x0239
            java.util.Set r3 = r0.f5599g
            int r8 = (int) r4
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r3 = r3.contains(r8)
            if (r3 != 0) goto L_0x021c
            r1.m(r4)
            int r3 = r7.intValue()
            r0.G(r1, r3)
        L_0x0219:
            r11 = r26
            goto L_0x0249
        L_0x021c:
            if (r6 == 0) goto L_0x0219
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "Skip jump into the IFD since it has already been read: IfdType "
            r3.append(r6)
            r3.append(r7)
            java.lang.String r6 = " (at "
            r3.append(r6)
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            goto L_0x0219
        L_0x0239:
            if (r6 == 0) goto L_0x0219
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "Skip jump into the IFD since its offset is invalid: "
            r3.append(r6)
            r3.append(r4)
            goto L_0x0219
        L_0x0249:
            r1.m(r11)
            r3 = 1
            r4 = 3
            goto L_0x02cd
        L_0x0250:
            r11 = r26
            r10 = 2
            int r6 = r29.a()
            int r7 = r0.f5608p
            int r6 = r6 + r7
            int r4 = (int) r4
            byte[] r4 = new byte[r4]
            r1.readFully(r4)
            androidx.exifinterface.media.a$c r5 = new androidx.exifinterface.media.a$c
            long r6 = (long) r6
            r13 = r18
            r15 = r5
            r16 = r14
            r17 = r13
            r18 = r6
            r20 = r4
            r15.<init>(r16, r17, r18, r20)
            java.util.HashMap[] r4 = r0.f5598f
            r4 = r4[r2]
            java.lang.String r6 = r3.f5627b
            r4.put(r6, r5)
            java.lang.String r4 = "DNGVersion"
            java.lang.String r6 = r3.f5627b
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0288
            r4 = 3
            r0.f5596d = r4
            goto L_0x0289
        L_0x0288:
            r4 = 3
        L_0x0289:
            java.lang.String r6 = "Make"
            java.lang.String r7 = r3.f5627b
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x029d
            java.lang.String r6 = "Model"
            java.lang.String r7 = r3.f5627b
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x02ab
        L_0x029d:
            java.nio.ByteOrder r6 = r0.f5600h
            java.lang.String r6 = r5.j(r6)
            java.lang.String r7 = "PENTAX"
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x02be
        L_0x02ab:
            java.lang.String r3 = r3.f5627b
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x02c0
            java.nio.ByteOrder r3 = r0.f5600h
            int r3 = r5.i(r3)
            r5 = 65535(0xffff, float:9.1834E-41)
            if (r3 != r5) goto L_0x02c0
        L_0x02be:
            r0.f5596d = r8
        L_0x02c0:
            int r3 = r29.a()
            long r5 = (long) r3
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x02cc
            r1.m(r11)
        L_0x02cc:
            r3 = 1
        L_0x02cd:
            int r5 = r25 + 1
            short r5 = (short) r5
            r8 = r3
            r10 = r5
            r9 = r24
            r5 = 5
            r7 = 0
            goto L_0x002d
        L_0x02d8:
            r3 = r8
            int r2 = r29.readInt()
            boolean r4 = f5586u
            if (r4 == 0) goto L_0x02ef
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r6 = 0
            r3[r6] = r5
            java.lang.String r5 = "nextIfdOffset: %d"
            java.lang.String.format(r5, r3)
        L_0x02ef:
            long r5 = (long) r2
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x0333
            java.util.Set r3 = r0.f5599g
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            boolean r3 = r3.contains(r7)
            if (r3 != 0) goto L_0x0323
            r1.m(r5)
            java.util.HashMap[] r2 = r0.f5598f
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0314
            r0.G(r1, r3)
            goto L_0x0342
        L_0x0314:
            java.util.HashMap[] r2 = r0.f5598f
            r3 = 5
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0342
            r0.G(r1, r3)
            goto L_0x0342
        L_0x0323:
            if (r4 == 0) goto L_0x0342
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            goto L_0x0342
        L_0x0333:
            if (r4 == 0) goto L_0x0342
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
        L_0x0342:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.G(androidx.exifinterface.media.a$f, int):void");
    }

    private void H(int i4, String str, String str2) {
        if (!this.f5598f[i4].isEmpty() && this.f5598f[i4].get(str) != null) {
            HashMap hashMap = this.f5598f[i4];
            hashMap.put(str2, hashMap.get(str));
            this.f5598f[i4].remove(str);
        }
    }

    private void I(f fVar, int i4) {
        c cVar = (c) this.f5598f[i4].get("ImageLength");
        c cVar2 = (c) this.f5598f[i4].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            c cVar3 = (c) this.f5598f[i4].get("JPEGInterchangeFormat");
            c cVar4 = (c) this.f5598f[i4].get("JPEGInterchangeFormatLength");
            if (cVar3 != null && cVar4 != null) {
                int i5 = cVar3.i(this.f5600h);
                int i6 = cVar3.i(this.f5600h);
                fVar.m((long) i5);
                byte[] bArr = new byte[i6];
                fVar.read(bArr);
                f(new b(bArr), i5, i4);
            }
        }
    }

    private void J(b bVar) {
        HashMap hashMap = this.f5598f[4];
        c cVar = (c) hashMap.get("Compression");
        if (cVar != null) {
            int i4 = cVar.i(this.f5600h);
            this.f5607o = i4;
            if (i4 != 1) {
                if (i4 == 6) {
                    o(bVar, hashMap);
                    return;
                } else if (i4 != 7) {
                    return;
                }
            }
            if (y(hashMap)) {
                p(bVar, hashMap);
                return;
            }
            return;
        }
        this.f5607o = 6;
        o(bVar, hashMap);
    }

    private static boolean K(int i4) {
        return (i4 == 4 || i4 == 9 || i4 == 13 || i4 == 14) ? false : true;
    }

    private void L(int i4, int i5) {
        if (!this.f5598f[i4].isEmpty() && !this.f5598f[i5].isEmpty()) {
            c cVar = (c) this.f5598f[i4].get("ImageLength");
            c cVar2 = (c) this.f5598f[i4].get("ImageWidth");
            c cVar3 = (c) this.f5598f[i5].get("ImageLength");
            c cVar4 = (c) this.f5598f[i5].get("ImageWidth");
            if (cVar != null && cVar2 != null && cVar3 != null && cVar4 != null) {
                int i6 = cVar.i(this.f5600h);
                int i7 = cVar2.i(this.f5600h);
                int i8 = cVar3.i(this.f5600h);
                int i9 = cVar4.i(this.f5600h);
                if (i6 < i8 && i7 < i9) {
                    HashMap[] hashMapArr = this.f5598f;
                    HashMap hashMap = hashMapArr[i4];
                    hashMapArr[i4] = hashMapArr[i5];
                    hashMapArr[i5] = hashMap;
                }
            }
        }
    }

    private void M(f fVar, int i4) {
        c cVar;
        c cVar2;
        c cVar3 = (c) this.f5598f[i4].get("DefaultCropSize");
        c cVar4 = (c) this.f5598f[i4].get("SensorTopBorder");
        c cVar5 = (c) this.f5598f[i4].get("SensorLeftBorder");
        c cVar6 = (c) this.f5598f[i4].get("SensorBottomBorder");
        c cVar7 = (c) this.f5598f[i4].get("SensorRightBorder");
        if (cVar3 != null) {
            if (cVar3.f5622a == 5) {
                e[] eVarArr = (e[]) cVar3.k(this.f5600h);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                cVar2 = c.d(eVarArr[0], this.f5600h);
                cVar = c.d(eVarArr[1], this.f5600h);
            } else {
                int[] iArr = (int[]) cVar3.k(this.f5600h);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                cVar2 = c.f(iArr[0], this.f5600h);
                cVar = c.f(iArr[1], this.f5600h);
            }
            this.f5598f[i4].put("ImageWidth", cVar2);
            this.f5598f[i4].put("ImageLength", cVar);
        } else if (cVar4 == null || cVar5 == null || cVar6 == null || cVar7 == null) {
            I(fVar, i4);
        } else {
            int i5 = cVar4.i(this.f5600h);
            int i6 = cVar6.i(this.f5600h);
            int i7 = cVar7.i(this.f5600h);
            int i8 = cVar5.i(this.f5600h);
            if (i6 > i5 && i7 > i8) {
                c f4 = c.f(i6 - i5, this.f5600h);
                c f5 = c.f(i7 - i8, this.f5600h);
                this.f5598f[i4].put("ImageLength", f4);
                this.f5598f[i4].put("ImageWidth", f5);
            }
        }
    }

    private void N() {
        L(0, 5);
        L(0, 4);
        L(5, 4);
        c cVar = (c) this.f5598f[1].get("PixelXDimension");
        c cVar2 = (c) this.f5598f[1].get("PixelYDimension");
        if (!(cVar == null || cVar2 == null)) {
            this.f5598f[0].put("ImageWidth", cVar);
            this.f5598f[0].put("ImageLength", cVar2);
        }
        if (this.f5598f[4].isEmpty() && z(this.f5598f[5])) {
            HashMap[] hashMapArr = this.f5598f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        z(this.f5598f[4]);
        H(0, "ThumbnailOrientation", "Orientation");
        H(0, "ThumbnailImageLength", "ImageLength");
        H(0, "ThumbnailImageWidth", "ImageWidth");
        H(5, "ThumbnailOrientation", "Orientation");
        H(5, "ThumbnailImageLength", "ImageLength");
        H(5, "ThumbnailImageWidth", "ImageWidth");
        H(4, "Orientation", "ThumbnailOrientation");
        H(4, "ImageLength", "ThumbnailImageLength");
        H(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private void a() {
        String b4 = b("DateTimeOriginal");
        if (b4 != null && b("DateTime") == null) {
            this.f5598f[0].put("DateTime", c.a(b4));
        }
        if (b("ImageWidth") == null) {
            this.f5598f[0].put("ImageWidth", c.b(0, this.f5600h));
        }
        if (b("ImageLength") == null) {
            this.f5598f[0].put("ImageLength", c.b(0, this.f5600h));
        }
        if (b("Orientation") == null) {
            this.f5598f[0].put("Orientation", c.b(0, this.f5600h));
        }
        if (b("LightSource") == null) {
            this.f5598f[1].put("LightSource", c.b(0, this.f5600h));
        }
    }

    private c d(String str) {
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                str = "PhotographicSensitivity";
            }
            for (int i4 = 0; i4 < f5574i0.length; i4++) {
                c cVar = (c) this.f5598f[i4].get(str);
                if (cVar != null) {
                    return cVar;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:55|56|57) */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0139, code lost:
        throw new java.lang.UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013a, code lost:
        r1.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013d, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0046, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0132 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e(androidx.exifinterface.media.a.f r13) {
        /*
            r12 = this;
            java.lang.String r0 = "yes"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x013e
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever
            r1.<init>()
            androidx.exifinterface.media.a$a r2 = new androidx.exifinterface.media.a$a     // Catch:{ RuntimeException -> 0x0132 }
            r2.<init>(r13)     // Catch:{ RuntimeException -> 0x0132 }
            androidx.exifinterface.media.b.C0093b.a(r1, r2)     // Catch:{ RuntimeException -> 0x0132 }
            r2 = 33
            java.lang.String r2 = r1.extractMetadata(r2)     // Catch:{ RuntimeException -> 0x0132 }
            r3 = 34
            java.lang.String r3 = r1.extractMetadata(r3)     // Catch:{ RuntimeException -> 0x0132 }
            r4 = 26
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x0132 }
            r5 = 17
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x0132 }
            boolean r4 = r0.equals(r4)     // Catch:{ RuntimeException -> 0x0132 }
            if (r4 == 0) goto L_0x0049
            r0 = 29
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0132 }
            r4 = 30
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x0132 }
            r5 = 31
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x0132 }
            goto L_0x0065
        L_0x0046:
            r13 = move-exception
            goto L_0x013a
        L_0x0049:
            boolean r0 = r0.equals(r5)     // Catch:{ RuntimeException -> 0x0132 }
            if (r0 == 0) goto L_0x0062
            r0 = 18
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0132 }
            r4 = 19
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x0132 }
            r5 = 24
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x0132 }
            goto L_0x0065
        L_0x0062:
            r0 = 0
            r4 = r0
            r5 = r4
        L_0x0065:
            r6 = 0
            if (r0 == 0) goto L_0x007b
            java.util.HashMap[] r7 = r12.f5598f     // Catch:{ RuntimeException -> 0x0132 }
            r7 = r7[r6]     // Catch:{ RuntimeException -> 0x0132 }
            java.lang.String r8 = "ImageWidth"
            int r9 = java.lang.Integer.parseInt(r0)     // Catch:{ RuntimeException -> 0x0132 }
            java.nio.ByteOrder r10 = r12.f5600h     // Catch:{ RuntimeException -> 0x0132 }
            androidx.exifinterface.media.a$c r9 = androidx.exifinterface.media.a.c.f(r9, r10)     // Catch:{ RuntimeException -> 0x0132 }
            r7.put(r8, r9)     // Catch:{ RuntimeException -> 0x0132 }
        L_0x007b:
            if (r4 == 0) goto L_0x0090
            java.util.HashMap[] r7 = r12.f5598f     // Catch:{ RuntimeException -> 0x0132 }
            r7 = r7[r6]     // Catch:{ RuntimeException -> 0x0132 }
            java.lang.String r8 = "ImageLength"
            int r9 = java.lang.Integer.parseInt(r4)     // Catch:{ RuntimeException -> 0x0132 }
            java.nio.ByteOrder r10 = r12.f5600h     // Catch:{ RuntimeException -> 0x0132 }
            androidx.exifinterface.media.a$c r9 = androidx.exifinterface.media.a.c.f(r9, r10)     // Catch:{ RuntimeException -> 0x0132 }
            r7.put(r8, r9)     // Catch:{ RuntimeException -> 0x0132 }
        L_0x0090:
            r7 = 6
            if (r5 == 0) goto L_0x00ba
            int r8 = java.lang.Integer.parseInt(r5)     // Catch:{ RuntimeException -> 0x0132 }
            r9 = 90
            if (r8 == r9) goto L_0x00aa
            r9 = 180(0xb4, float:2.52E-43)
            if (r8 == r9) goto L_0x00a8
            r9 = 270(0x10e, float:3.78E-43)
            if (r8 == r9) goto L_0x00a5
            r8 = 1
            goto L_0x00ab
        L_0x00a5:
            r8 = 8
            goto L_0x00ab
        L_0x00a8:
            r8 = 3
            goto L_0x00ab
        L_0x00aa:
            r8 = r7
        L_0x00ab:
            java.util.HashMap[] r9 = r12.f5598f     // Catch:{ RuntimeException -> 0x0132 }
            r9 = r9[r6]     // Catch:{ RuntimeException -> 0x0132 }
            java.lang.String r10 = "Orientation"
            java.nio.ByteOrder r11 = r12.f5600h     // Catch:{ RuntimeException -> 0x0132 }
            androidx.exifinterface.media.a$c r8 = androidx.exifinterface.media.a.c.f(r8, r11)     // Catch:{ RuntimeException -> 0x0132 }
            r9.put(r10, r8)     // Catch:{ RuntimeException -> 0x0132 }
        L_0x00ba:
            if (r2 == 0) goto L_0x010d
            if (r3 == 0) goto L_0x010d
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ RuntimeException -> 0x0132 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ RuntimeException -> 0x0132 }
            if (r3 <= r7) goto L_0x0105
            long r8 = (long) r2     // Catch:{ RuntimeException -> 0x0132 }
            r13.m(r8)     // Catch:{ RuntimeException -> 0x0132 }
            byte[] r8 = new byte[r7]     // Catch:{ RuntimeException -> 0x0132 }
            int r9 = r13.read(r8)     // Catch:{ RuntimeException -> 0x0132 }
            if (r9 != r7) goto L_0x00fd
            int r2 = r2 + r7
            int r3 = r3 + -6
            byte[] r7 = f5581p0     // Catch:{ RuntimeException -> 0x0132 }
            boolean r7 = java.util.Arrays.equals(r8, r7)     // Catch:{ RuntimeException -> 0x0132 }
            if (r7 == 0) goto L_0x00f5
            byte[] r7 = new byte[r3]     // Catch:{ RuntimeException -> 0x0132 }
            int r13 = r13.read(r7)     // Catch:{ RuntimeException -> 0x0132 }
            if (r13 != r3) goto L_0x00ed
            r12.f5608p = r2     // Catch:{ RuntimeException -> 0x0132 }
            r12.F(r7, r6)     // Catch:{ RuntimeException -> 0x0132 }
            goto L_0x010d
        L_0x00ed:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0132 }
            java.lang.String r0 = "Can't read exif"
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x0132 }
            throw r13     // Catch:{ RuntimeException -> 0x0132 }
        L_0x00f5:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0132 }
            java.lang.String r0 = "Invalid identifier"
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x0132 }
            throw r13     // Catch:{ RuntimeException -> 0x0132 }
        L_0x00fd:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0132 }
            java.lang.String r0 = "Can't read identifier"
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x0132 }
            throw r13     // Catch:{ RuntimeException -> 0x0132 }
        L_0x0105:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0132 }
            java.lang.String r0 = "Invalid exif length"
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x0132 }
            throw r13     // Catch:{ RuntimeException -> 0x0132 }
        L_0x010d:
            boolean r13 = f5586u     // Catch:{ RuntimeException -> 0x0132 }
            if (r13 == 0) goto L_0x012e
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0132 }
            r13.<init>()     // Catch:{ RuntimeException -> 0x0132 }
            java.lang.String r2 = "Heif meta: "
            r13.append(r2)     // Catch:{ RuntimeException -> 0x0132 }
            r13.append(r0)     // Catch:{ RuntimeException -> 0x0132 }
            java.lang.String r0 = "x"
            r13.append(r0)     // Catch:{ RuntimeException -> 0x0132 }
            r13.append(r4)     // Catch:{ RuntimeException -> 0x0132 }
            java.lang.String r0 = ", rotation "
            r13.append(r0)     // Catch:{ RuntimeException -> 0x0132 }
            r13.append(r5)     // Catch:{ RuntimeException -> 0x0132 }
        L_0x012e:
            r1.release()
            return
        L_0x0132:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."
            r13.<init>(r0)     // Catch:{ all -> 0x0046 }
            throw r13     // Catch:{ all -> 0x0046 }
        L_0x013a:
            r1.release()
            throw r13
        L_0x013e:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Reading EXIF from HEIF files is supported from SDK 28 and above"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.e(androidx.exifinterface.media.a$f):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x015b A[LOOP:0: B:8:0x002e->B:57:0x015b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0161 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f(androidx.exifinterface.media.a.b r20, int r21, int r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            boolean r3 = f5586u
            if (r3 == 0) goto L_0x0017
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "getJpegAttributes starting with: "
            r3.append(r4)
            r3.append(r1)
        L_0x0017:
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
            r1.f(r3)
            byte r3 = r20.readByte()
            java.lang.String r4 = "Invalid marker: "
            r5 = -1
            if (r3 != r5) goto L_0x01ab
            byte r6 = r20.readByte()
            r7 = -40
            if (r6 != r7) goto L_0x0190
            r3 = 2
        L_0x002e:
            byte r4 = r20.readByte()
            if (r4 != r5) goto L_0x0173
            byte r4 = r20.readByte()
            boolean r6 = f5586u
            if (r6 == 0) goto L_0x004f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Found JPEG segment indicator: "
            r7.append(r8)
            r8 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r8 = java.lang.Integer.toHexString(r8)
            r7.append(r8)
        L_0x004f:
            r7 = -39
            if (r4 == r7) goto L_0x016d
            r7 = -38
            if (r4 != r7) goto L_0x0059
            goto L_0x016d
        L_0x0059:
            int r7 = r20.readUnsignedShort()
            int r8 = r7 + -2
            r9 = 4
            int r3 = r3 + r9
            if (r6 == 0) goto L_0x0083
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "JPEG segment: "
            r6.append(r10)
            r10 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r10 = java.lang.Integer.toHexString(r10)
            r6.append(r10)
            java.lang.String r10 = " (length: "
            r6.append(r10)
            r6.append(r7)
            java.lang.String r10 = ")"
            r6.append(r10)
        L_0x0083:
            java.lang.String r6 = "Invalid length"
            if (r8 < 0) goto L_0x0167
            r10 = -31
            r11 = 1
            r12 = 0
            if (r4 == r10) goto L_0x0103
            r10 = -2
            if (r4 == r10) goto L_0x00d7
            switch(r4) {
                case -64: goto L_0x009e;
                case -63: goto L_0x009e;
                case -62: goto L_0x009e;
                case -61: goto L_0x009e;
                default: goto L_0x0093;
            }
        L_0x0093:
            switch(r4) {
                case -59: goto L_0x009e;
                case -58: goto L_0x009e;
                case -57: goto L_0x009e;
                default: goto L_0x0096;
            }
        L_0x0096:
            switch(r4) {
                case -55: goto L_0x009e;
                case -54: goto L_0x009e;
                case -53: goto L_0x009e;
                default: goto L_0x0099;
            }
        L_0x0099:
            switch(r4) {
                case -51: goto L_0x009e;
                case -50: goto L_0x009e;
                case -49: goto L_0x009e;
                default: goto L_0x009c;
            }
        L_0x009c:
            goto L_0x0159
        L_0x009e:
            r1.h(r11)
            java.util.HashMap[] r4 = r0.f5598f
            r4 = r4[r2]
            if (r2 == r9) goto L_0x00aa
            java.lang.String r8 = "ImageLength"
            goto L_0x00ac
        L_0x00aa:
            java.lang.String r8 = "ThumbnailImageLength"
        L_0x00ac:
            int r10 = r20.readUnsignedShort()
            long r10 = (long) r10
            java.nio.ByteOrder r12 = r0.f5600h
            androidx.exifinterface.media.a$c r10 = androidx.exifinterface.media.a.c.b(r10, r12)
            r4.put(r8, r10)
            java.util.HashMap[] r4 = r0.f5598f
            r4 = r4[r2]
            if (r2 == r9) goto L_0x00c3
            java.lang.String r8 = "ImageWidth"
            goto L_0x00c5
        L_0x00c3:
            java.lang.String r8 = "ThumbnailImageWidth"
        L_0x00c5:
            int r9 = r20.readUnsignedShort()
            long r9 = (long) r9
            java.nio.ByteOrder r11 = r0.f5600h
            androidx.exifinterface.media.a$c r9 = androidx.exifinterface.media.a.c.b(r9, r11)
            r4.put(r8, r9)
            int r8 = r7 + -7
            goto L_0x0159
        L_0x00d7:
            byte[] r4 = new byte[r8]
            int r7 = r1.read(r4)
            if (r7 != r8) goto L_0x00fb
            java.lang.String r7 = "UserComment"
            java.lang.String r8 = r0.b(r7)
            if (r8 != 0) goto L_0x00f9
            java.util.HashMap[] r8 = r0.f5598f
            r8 = r8[r11]
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = f5580o0
            r9.<init>(r4, r10)
            androidx.exifinterface.media.a$c r4 = androidx.exifinterface.media.a.c.a(r9)
            r8.put(r7, r4)
        L_0x00f9:
            r8 = r12
            goto L_0x0159
        L_0x00fb:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid exif"
            r1.<init>(r2)
            throw r1
        L_0x0103:
            byte[] r4 = new byte[r8]
            r1.readFully(r4)
            int r7 = r3 + r8
            byte[] r9 = f5581p0
            boolean r10 = androidx.exifinterface.media.b.c(r4, r9)
            if (r10 == 0) goto L_0x0129
            int r10 = r9.length
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r10, r8)
            int r3 = r21 + r3
            int r8 = r9.length
            int r3 = r3 + r8
            r0.f5608p = r3
            r0.F(r4, r2)
            androidx.exifinterface.media.a$b r3 = new androidx.exifinterface.media.a$b
            r3.<init>((byte[]) r4)
            r0.J(r3)
            goto L_0x0157
        L_0x0129:
            byte[] r9 = f5582q0
            boolean r10 = androidx.exifinterface.media.b.c(r4, r9)
            if (r10 == 0) goto L_0x0157
            int r10 = r9.length
            int r3 = r3 + r10
            int r9 = r9.length
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r9, r8)
            java.lang.String r8 = "Xmp"
            java.lang.String r9 = r0.b(r8)
            if (r9 != 0) goto L_0x0157
            java.util.HashMap[] r9 = r0.f5598f
            r9 = r9[r12]
            androidx.exifinterface.media.a$c r10 = new androidx.exifinterface.media.a$c
            int r15 = r4.length
            long r13 = (long) r3
            r3 = 1
            r16 = r13
            r13 = r10
            r14 = r3
            r18 = r4
            r13.<init>(r14, r15, r16, r18)
            r9.put(r8, r10)
            r0.f5612t = r11
        L_0x0157:
            r3 = r7
            goto L_0x00f9
        L_0x0159:
            if (r8 < 0) goto L_0x0161
            r1.h(r8)
            int r3 = r3 + r8
            goto L_0x002e
        L_0x0161:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r6)
            throw r1
        L_0x0167:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r6)
            throw r1
        L_0x016d:
            java.nio.ByteOrder r2 = r0.f5600h
            r1.f(r2)
            return
        L_0x0173:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid marker:"
            r2.append(r3)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0190:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01ab:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.f(androidx.exifinterface.media.a$b, int, int):void");
    }

    private int g(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (s(bArr)) {
            return 4;
        }
        if (v(bArr)) {
            return 9;
        }
        if (r(bArr)) {
            return 12;
        }
        if (t(bArr)) {
            return 7;
        }
        if (w(bArr)) {
            return 10;
        }
        if (u(bArr)) {
            return 13;
        }
        if (A(bArr)) {
            return 14;
        }
        return 0;
    }

    private void h(f fVar) {
        int i4;
        int i5;
        k(fVar);
        c cVar = (c) this.f5598f[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f5625d);
            fVar2.f(this.f5600h);
            byte[] bArr = f5544E;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.m(0);
            byte[] bArr3 = f5545F;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.m(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.m(12);
            }
            G(fVar2, 6);
            c cVar2 = (c) this.f5598f[7].get("PreviewImageStart");
            c cVar3 = (c) this.f5598f[7].get("PreviewImageLength");
            if (!(cVar2 == null || cVar3 == null)) {
                this.f5598f[5].put("JPEGInterchangeFormat", cVar2);
                this.f5598f[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) this.f5598f[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.k(this.f5600h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i6 = iArr[2];
                int i7 = iArr[0];
                if (i6 > i7 && (i4 = iArr[3]) > (i5 = iArr[1])) {
                    int i8 = (i6 - i7) + 1;
                    int i9 = (i4 - i5) + 1;
                    if (i8 < i9) {
                        int i10 = i8 + i9;
                        i9 = i10 - i9;
                        i8 = i10 - i9;
                    }
                    c f4 = c.f(i8, this.f5600h);
                    c f5 = c.f(i9, this.f5600h);
                    this.f5598f[0].put("ImageWidth", f4);
                    this.f5598f[0].put("ImageLength", f5);
                }
            }
        }
    }

    private void i(b bVar) {
        if (f5586u) {
            StringBuilder sb = new StringBuilder();
            sb.append("getPngAttributes starting with: ");
            sb.append(bVar);
        }
        bVar.f(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f5546G;
        bVar.h(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i4 = length + 8;
                    if (i4 == 16) {
                        if (!Arrays.equals(bArr2, f5548I)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (!Arrays.equals(bArr2, f5549J)) {
                        if (Arrays.equals(bArr2, f5547H)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f5608p = i4;
                                    F(bArr3, 0);
                                    N();
                                    J(new b(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + b.a(bArr2));
                        }
                        int i5 = readInt + 4;
                        bVar.h(i5);
                        length = i4 + i5;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void j(b bVar) {
        boolean z3 = f5586u;
        if (z3) {
            StringBuilder sb = new StringBuilder();
            sb.append("getRafAttributes starting with: ");
            sb.append(bVar);
        }
        bVar.h(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i4 = ByteBuffer.wrap(bArr).getInt();
        int i5 = ByteBuffer.wrap(bArr2).getInt();
        int i6 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i5];
        bVar.h(i4 - bVar.a());
        bVar.read(bArr4);
        f(new b(bArr4), i4, 5);
        bVar.h(i6 - bVar.a());
        bVar.f(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("numberOfDirectoryEntry: ");
            sb2.append(readInt);
        }
        for (int i7 = 0; i7 < readInt; i7++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f5569d0.f5626a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c f4 = c.f(readShort, this.f5600h);
                c f5 = c.f(readShort2, this.f5600h);
                this.f5598f[0].put("ImageLength", f4);
                this.f5598f[0].put("ImageWidth", f5);
                if (f5586u) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Updated to length: ");
                    sb3.append(readShort);
                    sb3.append(", width: ");
                    sb3.append(readShort2);
                    return;
                }
                return;
            }
            bVar.h(readUnsignedShort2);
        }
    }

    private void k(f fVar) {
        c cVar;
        C(fVar);
        G(fVar, 0);
        M(fVar, 0);
        M(fVar, 5);
        M(fVar, 4);
        N();
        if (this.f5596d == 8 && (cVar = (c) this.f5598f[1].get("MakerNote")) != null) {
            f fVar2 = new f(cVar.f5625d);
            fVar2.f(this.f5600h);
            fVar2.h(6);
            G(fVar2, 9);
            c cVar2 = (c) this.f5598f[9].get("ColorSpace");
            if (cVar2 != null) {
                this.f5598f[1].put("ColorSpace", cVar2);
            }
        }
    }

    private void l(f fVar) {
        if (f5586u) {
            StringBuilder sb = new StringBuilder();
            sb.append("getRw2Attributes starting with: ");
            sb.append(fVar);
        }
        k(fVar);
        c cVar = (c) this.f5598f[0].get("JpgFromRaw");
        if (cVar != null) {
            f(new b(cVar.f5625d), (int) cVar.f5624c, 5);
        }
        c cVar2 = (c) this.f5598f[0].get("ISO");
        c cVar3 = (c) this.f5598f[1].get("PhotographicSensitivity");
        if (cVar2 != null && cVar3 == null) {
            this.f5598f[1].put("PhotographicSensitivity", cVar2);
        }
    }

    private void m(f fVar) {
        byte[] bArr = f5581p0;
        fVar.h(bArr.length);
        byte[] bArr2 = new byte[fVar.available()];
        fVar.readFully(bArr2);
        this.f5608p = bArr.length;
        F(bArr2, 0);
    }

    private void n(b bVar) {
        if (f5586u) {
            StringBuilder sb = new StringBuilder();
            sb.append("getWebpAttributes starting with: ");
            sb.append(bVar);
        }
        bVar.f(ByteOrder.LITTLE_ENDIAN);
        bVar.h(f5550K.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f5551L;
        bVar.h(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int readInt2 = bVar.readInt();
                    int i4 = length + 8;
                    if (Arrays.equals(f5552M, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (bVar.read(bArr3) == readInt2) {
                            this.f5608p = i4;
                            F(bArr3, 0);
                            J(new b(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b.a(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i4 + readInt2;
                    if (length != readInt) {
                        if (length <= readInt) {
                            bVar.h(readInt2);
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private void o(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int i4 = cVar.i(this.f5600h);
            int i5 = cVar2.i(this.f5600h);
            if (this.f5596d == 7) {
                i4 += this.f5609q;
            }
            if (i4 > 0 && i5 > 0) {
                this.f5601i = true;
                if (this.f5593a == null && this.f5595c == null && this.f5594b == null) {
                    byte[] bArr = new byte[i5];
                    bVar.skip((long) i4);
                    bVar.read(bArr);
                    this.f5606n = bArr;
                }
                this.f5604l = i4;
                this.f5605m = i5;
            }
            if (f5586u) {
                StringBuilder sb = new StringBuilder();
                sb.append("Setting thumbnail attributes with offset: ");
                sb.append(i4);
                sb.append(", length: ");
                sb.append(i5);
            }
        }
    }

    private void p(b bVar, HashMap hashMap) {
        b bVar2 = bVar;
        HashMap hashMap2 = hashMap;
        c cVar = (c) hashMap2.get("StripOffsets");
        c cVar2 = (c) hashMap2.get("StripByteCounts");
        if (cVar != null && cVar2 != null) {
            long[] b4 = b.b(cVar.k(this.f5600h));
            long[] b5 = b.b(cVar2.k(this.f5600h));
            if (b4 == null || b4.length == 0) {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            } else if (b5 == null || b5.length == 0) {
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            } else if (b4.length != b5.length) {
                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            } else {
                long j4 = 0;
                for (long j5 : b5) {
                    j4 += j5;
                }
                int i4 = (int) j4;
                byte[] bArr = new byte[i4];
                this.f5603k = true;
                this.f5602j = true;
                this.f5601i = true;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (i5 < b4.length) {
                    int i8 = (int) b4[i5];
                    int i9 = (int) b5[i5];
                    if (i5 < b4.length - 1 && ((long) (i8 + i9)) != b4[i5 + 1]) {
                        this.f5603k = false;
                    }
                    int i10 = i8 - i6;
                    if (i10 >= 0) {
                        long j6 = (long) i10;
                        if (bVar2.skip(j6) != j6) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Failed to skip ");
                            sb.append(i10);
                            sb.append(" bytes.");
                            return;
                        }
                        int i11 = i6 + i10;
                        byte[] bArr2 = new byte[i9];
                        if (bVar2.read(bArr2) != i9) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Failed to read ");
                            sb2.append(i9);
                            sb2.append(" bytes.");
                            return;
                        }
                        i6 = i11 + i9;
                        System.arraycopy(bArr2, 0, bArr, i7, i9);
                        i7 += i9;
                        i5++;
                    } else {
                        return;
                    }
                }
                this.f5606n = bArr;
                if (this.f5603k) {
                    this.f5604l = (int) b4[0];
                    this.f5605m = i4;
                }
            }
        }
    }

    private static boolean q(BufferedInputStream bufferedInputStream) {
        byte[] bArr = f5581p0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i4 = 0;
        while (true) {
            byte[] bArr3 = f5581p0;
            if (i4 >= bArr3.length) {
                return true;
            }
            if (bArr2[i4] != bArr3[i4]) {
                return false;
            }
            i4++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean r(byte[] r15) {
        /*
            r14 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.a$b r2 = new androidx.exifinterface.media.a$b     // Catch:{ Exception -> 0x0091, all -> 0x008a }
            r2.<init>((byte[]) r15)     // Catch:{ Exception -> 0x0091, all -> 0x008a }
            int r1 = r2.readInt()     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            long r3 = (long) r1     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            r1 = 4
            byte[] r5 = new byte[r1]     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            r2.read(r5)     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            byte[] r6 = f5541B     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            boolean r5 = java.util.Arrays.equals(r5, r6)     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            if (r5 != 0) goto L_0x001e
            r2.close()
            return r0
        L_0x001e:
            r5 = 1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r8 = 8
            if (r7 != 0) goto L_0x0039
            long r3 = r2.readLong()     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            r10 = 16
            int r7 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x003a
            r2.close()
            return r0
        L_0x0034:
            r15 = move-exception
            r1 = r2
            goto L_0x008b
        L_0x0037:
            r1 = r2
            goto L_0x0091
        L_0x0039:
            r10 = r8
        L_0x003a:
            int r7 = r15.length     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            long r12 = (long) r7     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            int r7 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x0042
            int r15 = r15.length     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            long r3 = (long) r15
        L_0x0042:
            long r3 = r3 - r10
            int r15 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r15 >= 0) goto L_0x004b
            r2.close()
            return r0
        L_0x004b:
            byte[] r15 = new byte[r1]     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            r7 = 0
            r9 = r0
            r10 = r9
        L_0x0051:
            r11 = 4
            long r11 = r3 / r11
            int r11 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0086
            int r11 = r2.read(r15)     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            if (r11 == r1) goto L_0x0063
            r2.close()
            return r0
        L_0x0063:
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x0068
            goto L_0x0084
        L_0x0068:
            byte[] r11 = f5542C     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            r12 = 1
            if (r11 == 0) goto L_0x0073
            r9 = r12
            goto L_0x007c
        L_0x0073:
            byte[] r11 = f5543D     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch:{ Exception -> 0x0037, all -> 0x0034 }
            if (r11 == 0) goto L_0x007c
            r10 = r12
        L_0x007c:
            if (r9 == 0) goto L_0x0084
            if (r10 == 0) goto L_0x0084
            r2.close()
            return r12
        L_0x0084:
            long r7 = r7 + r5
            goto L_0x0051
        L_0x0086:
            r2.close()
            goto L_0x0096
        L_0x008a:
            r15 = move-exception
        L_0x008b:
            if (r1 == 0) goto L_0x0090
            r1.close()
        L_0x0090:
            throw r15
        L_0x0091:
            if (r1 == 0) goto L_0x0096
            r1.close()
        L_0x0096:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.r(byte[]):boolean");
    }

    private static boolean s(byte[] bArr) {
        int i4 = 0;
        while (true) {
            byte[] bArr2 = f5540A;
            if (i4 >= bArr2.length) {
                return true;
            }
            if (bArr[i4] != bArr2[i4]) {
                return false;
            }
            i4++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean t(byte[] r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.a$b r2 = new androidx.exifinterface.media.a$b     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            r2.<init>((byte[]) r4)     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            java.nio.ByteOrder r4 = r3.E(r2)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r3.f5600h = r4     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r2.f(r4)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r1 = 20306(0x4f52, float:2.8455E-41)
            if (r4 == r1) goto L_0x001c
            r1 = 21330(0x5352, float:2.989E-41)
            if (r4 != r1) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            r2.close()
            return r0
        L_0x0021:
            r4 = move-exception
            r1 = r2
            goto L_0x0027
        L_0x0024:
            r1 = r2
            goto L_0x002d
        L_0x0026:
            r4 = move-exception
        L_0x0027:
            if (r1 == 0) goto L_0x002c
            r1.close()
        L_0x002c:
            throw r4
        L_0x002d:
            if (r1 == 0) goto L_0x0032
            r1.close()
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.t(byte[]):boolean");
    }

    private boolean u(byte[] bArr) {
        int i4 = 0;
        while (true) {
            byte[] bArr2 = f5546G;
            if (i4 >= bArr2.length) {
                return true;
            }
            if (bArr[i4] != bArr2[i4]) {
                return false;
            }
            i4++;
        }
    }

    private boolean v(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i4 = 0; i4 < bytes.length; i4++) {
            if (bArr[i4] != bytes[i4]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean w(byte[] r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.a$b r2 = new androidx.exifinterface.media.a$b     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            r2.<init>((byte[]) r4)     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            java.nio.ByteOrder r4 = r3.E(r2)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r3.f5600h = r4     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r2.f(r4)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r1 = 85
            if (r4 != r1) goto L_0x0019
            r0 = 1
        L_0x0019:
            r2.close()
            return r0
        L_0x001d:
            r4 = move-exception
            r1 = r2
            goto L_0x0023
        L_0x0020:
            r1 = r2
            goto L_0x0029
        L_0x0022:
            r4 = move-exception
        L_0x0023:
            if (r1 == 0) goto L_0x0028
            r1.close()
        L_0x0028:
            throw r4
        L_0x0029:
            if (r1 == 0) goto L_0x002e
            r1.close()
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.w(byte[]):boolean");
    }

    private static boolean x(FileDescriptor fileDescriptor) {
        try {
            b.a.c(fileDescriptor, 0, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean y(HashMap hashMap) {
        c cVar;
        c cVar2 = (c) hashMap.get("BitsPerSample");
        if (cVar2 == null) {
            return false;
        }
        int[] iArr = (int[]) cVar2.k(this.f5600h);
        int[] iArr2 = f5590x;
        if (Arrays.equals(iArr2, iArr)) {
            return true;
        }
        if (this.f5596d != 3 || (cVar = (c) hashMap.get("PhotometricInterpretation")) == null) {
            return false;
        }
        int i4 = cVar.i(this.f5600h);
        if ((i4 != 1 || !Arrays.equals(iArr, f5592z)) && (i4 != 6 || !Arrays.equals(iArr, iArr2))) {
            return false;
        }
        return true;
    }

    private boolean z(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        int i4 = cVar.i(this.f5600h);
        int i5 = cVar2.i(this.f5600h);
        if (i4 > 512 || i5 > 512) {
            return false;
        }
        return true;
    }

    public String b(String str) {
        if (str != null) {
            c d4 = d(str);
            if (d4 != null) {
                if (!f5578m0.contains(str)) {
                    return d4.j(this.f5600h);
                }
                if (str.equals("GPSTimeStamp")) {
                    int i4 = d4.f5622a;
                    if (i4 == 5 || i4 == 10) {
                        e[] eVarArr = (e[]) d4.k(this.f5600h);
                        if (eVarArr == null || eVarArr.length != 3) {
                            Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                            return null;
                        }
                        e eVar = eVarArr[0];
                        Integer valueOf = Integer.valueOf((int) (((float) eVar.f5630a) / ((float) eVar.f5631b)));
                        e eVar2 = eVarArr[1];
                        Integer valueOf2 = Integer.valueOf((int) (((float) eVar2.f5630a) / ((float) eVar2.f5631b)));
                        e eVar3 = eVarArr[2];
                        return String.format("%02d:%02d:%02d", new Object[]{valueOf, valueOf2, Integer.valueOf((int) (((float) eVar3.f5630a) / ((float) eVar3.f5631b)))});
                    }
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + d4.f5622a);
                    return null;
                }
                try {
                    return Double.toString(d4.h(this.f5600h));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public int c(String str, int i4) {
        if (str != null) {
            c d4 = d(str);
            if (d4 == null) {
                return i4;
            }
            try {
                return d4.i(this.f5600h);
            } catch (NumberFormatException unused) {
                return i4;
            }
        } else {
            throw new NullPointerException("tag shouldn't be null");
        }
    }

    private static class f extends b {
        f(byte[] bArr) {
            super(bArr);
            this.f5618a.mark(Integer.MAX_VALUE);
        }

        public void m(long j4) {
            int i4 = this.f5620c;
            if (((long) i4) > j4) {
                this.f5620c = 0;
                this.f5618a.reset();
            } else {
                j4 -= (long) i4;
            }
            h((int) j4);
        }

        f(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f5618a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    public a(InputStream inputStream, int i4) {
        d[][] dVarArr = f5574i0;
        this.f5598f = new HashMap[dVarArr.length];
        this.f5599g = new HashSet(dVarArr.length);
        this.f5600h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f5593a = null;
            if (i4 == 1) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f5581p0.length);
                if (!q(bufferedInputStream)) {
                    Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                    return;
                }
                this.f5597e = true;
                this.f5595c = null;
                this.f5594b = null;
                inputStream = bufferedInputStream;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f5595c = (AssetManager.AssetInputStream) inputStream;
                this.f5594b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (x(fileInputStream.getFD())) {
                        this.f5595c = null;
                        this.f5594b = fileInputStream.getFD();
                    }
                }
                this.f5595c = null;
                this.f5594b = null;
            }
            B(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f5626a;

        /* renamed from: b  reason: collision with root package name */
        public final String f5627b;

        /* renamed from: c  reason: collision with root package name */
        public final int f5628c;

        /* renamed from: d  reason: collision with root package name */
        public final int f5629d;

        d(String str, int i4, int i5) {
            this.f5627b = str;
            this.f5626a = i4;
            this.f5628c = i5;
            this.f5629d = -1;
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i4) {
            int i5;
            int i6 = this.f5628c;
            if (i6 == 7 || i4 == 7 || i6 == i4 || (i5 = this.f5629d) == i4) {
                return true;
            }
            if ((i6 == 4 || i5 == 4) && i4 == 3) {
                return true;
            }
            if ((i6 == 9 || i5 == 9) && i4 == 8) {
                return true;
            }
            if ((i6 == 12 || i5 == 12) && i4 == 11) {
                return true;
            }
            return false;
        }

        d(String str, int i4, int i5, int i6) {
            this.f5627b = str;
            this.f5626a = i4;
            this.f5628c = i5;
            this.f5629d = i6;
        }
    }
}
