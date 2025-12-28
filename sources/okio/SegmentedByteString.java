package okio;

import c3.B;
import c3.C0500b;
import c3.r;
import com.silkimen.http.HttpRequest;
import d3.c;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.collections.C0713h;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\nJ\u000f\u0010\u0017\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\nJ\u0017\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010\u0014J\u001f\u0010$\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010*\u001a\u00020'2\u0006\u0010&\u001a\u00020!H\u0010¢\u0006\u0004\b(\u0010)J\u000f\u0010-\u001a\u00020!H\u0010¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020\u0003H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00106\u001a\u0002052\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b6\u00107J'\u00106\u001a\u0002052\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020!2\u0006\u0010;\u001a\u00020!H\u0010¢\u0006\u0004\b<\u0010=J/\u0010A\u001a\u00020@2\u0006\u0010:\u001a\u00020!2\u0006\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020!2\u0006\u0010;\u001a\u00020!H\u0016¢\u0006\u0004\bA\u0010BJ/\u0010A\u001a\u00020@2\u0006\u0010:\u001a\u00020!2\u0006\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020!2\u0006\u0010;\u001a\u00020!H\u0016¢\u0006\u0004\bA\u0010CJ/\u0010F\u001a\u0002052\u0006\u0010:\u001a\u00020!2\u0006\u0010D\u001a\u00020\u00032\u0006\u0010E\u001a\u00020!2\u0006\u0010;\u001a\u00020!H\u0016¢\u0006\u0004\bF\u0010GJ\u001f\u0010I\u001a\u00020!2\u0006\u0010>\u001a\u00020\u00032\u0006\u0010H\u001a\u00020!H\u0016¢\u0006\u0004\bI\u0010JJ\u001f\u0010K\u001a\u00020!2\u0006\u0010>\u001a\u00020\u00032\u0006\u0010H\u001a\u00020!H\u0016¢\u0006\u0004\bK\u0010JJ\u000f\u0010M\u001a\u00020\u0003H\u0010¢\u0006\u0004\bL\u0010/J\u001a\u0010O\u001a\u00020@2\b\u0010>\u001a\u0004\u0018\u00010NH\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020!H\u0016¢\u0006\u0004\bQ\u0010,J\u000f\u0010R\u001a\u00020\u0010H\u0016¢\u0006\u0004\bR\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z¨\u0006["}, d2 = {"Lokio/SegmentedByteString;", "Lokio/ByteString;", "", "", "segments", "", "directory", "<init>", "([[B[I)V", "a", "()Lokio/ByteString;", "Ljava/lang/Object;", "writeReplace", "()Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "charset", "", "string", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "base64", "()Ljava/lang/String;", "hex", "toAsciiLowercase", "toAsciiUppercase", "algorithm", "digest$okio", "(Ljava/lang/String;)Lokio/ByteString;", "digest", "key", "hmac$okio", "(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;", "hmac", "base64Url", "", "beginIndex", "endIndex", "substring", "(II)Lokio/ByteString;", "pos", "", "internalGet$okio", "(I)B", "internalGet", "getSize$okio", "()I", "getSize", "toByteArray", "()[B", "Ljava/nio/ByteBuffer;", "asByteBuffer", "()Ljava/nio/ByteBuffer;", "Ljava/io/OutputStream;", "out", "Ll2/q;", "write", "(Ljava/io/OutputStream;)V", "Lc3/b;", "buffer", "offset", "byteCount", "write$okio", "(Lc3/b;II)V", "other", "otherOffset", "", "rangeEquals", "(ILokio/ByteString;II)Z", "(I[BII)Z", "target", "targetOffset", "copyInto", "(I[BII)V", "fromIndex", "indexOf", "([BI)I", "lastIndexOf", "internalArray$okio", "internalArray", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "c", "[[B", "getSegments$okio", "()[[B", "d", "[I", "getDirectory$okio", "()[I", "okio"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SegmentedByteString extends ByteString {

    /* renamed from: c  reason: collision with root package name */
    private final transient byte[][] f15615c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int[] f15616d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString.EMPTY.getData$okio());
        o.e(bArr, "segments");
        o.e(iArr, "directory");
        this.f15615c = bArr;
        this.f15616d = iArr;
    }

    private final ByteString a() {
        return new ByteString(toByteArray());
    }

    private final Object writeReplace() {
        return a();
    }

    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        o.d(asReadOnlyBuffer, "wrap(toByteArray()).asReadOnlyBuffer()");
        return asReadOnlyBuffer;
    }

    public String base64() {
        return a().base64();
    }

    public String base64Url() {
        return a().base64Url();
    }

    public void copyInto(int i4, byte[] bArr, int i5, int i6) {
        int i7;
        o.e(bArr, "target");
        long j4 = (long) i6;
        B.b((long) size(), (long) i4, j4);
        B.b((long) bArr.length, (long) i5, j4);
        int i8 = i6 + i4;
        int b4 = c.b(this, i4);
        while (i4 < i8) {
            if (b4 == 0) {
                i7 = 0;
            } else {
                i7 = getDirectory$okio()[b4 - 1];
            }
            int i9 = getDirectory$okio()[getSegments$okio().length + b4];
            int min = Math.min(i8, (getDirectory$okio()[b4] - i7) + i7) - i4;
            int i10 = i9 + (i4 - i7);
            C0713h.d(getSegments$okio()[b4], bArr, i5, i10, i10 + min);
            i5 += min;
            i4 += min;
            b4++;
        }
    }

    public ByteString digest$okio(String str) {
        o.e(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        int length = getSegments$okio().length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = getDirectory$okio()[length + i4];
            int i7 = getDirectory$okio()[i4];
            instance.update(getSegments$okio()[i4], i6, i7 - i5);
            i4++;
            i5 = i7;
        }
        byte[] digest = instance.digest();
        o.d(digest, "digestBytes");
        return new ByteString(digest);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    public final int[] getDirectory$okio() {
        return this.f15616d;
    }

    public final byte[][] getSegments$okio() {
        return this.f15615c;
    }

    public int getSize$okio() {
        return getDirectory$okio()[getSegments$okio().length - 1];
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = getSegments$okio().length;
        int i4 = 0;
        int i5 = 1;
        int i6 = 0;
        while (i4 < length) {
            int i7 = getDirectory$okio()[length + i4];
            int i8 = getDirectory$okio()[i4];
            byte[] bArr = getSegments$okio()[i4];
            int i9 = (i8 - i6) + i7;
            while (i7 < i9) {
                i5 = (i5 * 31) + bArr[i7];
                i7++;
            }
            i4++;
            i6 = i8;
        }
        setHashCode$okio(i5);
        return i5;
    }

    public String hex() {
        return a().hex();
    }

    public ByteString hmac$okio(String str, ByteString byteString) {
        o.e(str, "algorithm");
        o.e(byteString, "key");
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(byteString.toByteArray(), str));
            int length = getSegments$okio().length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                int i6 = getDirectory$okio()[length + i4];
                int i7 = getDirectory$okio()[i4];
                instance.update(getSegments$okio()[i4], i6, i7 - i5);
                i4++;
                i5 = i7;
            }
            byte[] doFinal = instance.doFinal();
            o.d(doFinal, "mac.doFinal()");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public int indexOf(byte[] bArr, int i4) {
        o.e(bArr, "other");
        return a().indexOf(bArr, i4);
    }

    public byte[] internalArray$okio() {
        return toByteArray();
    }

    public byte internalGet$okio(int i4) {
        int i5;
        B.b((long) getDirectory$okio()[getSegments$okio().length - 1], (long) i4, 1);
        int b4 = c.b(this, i4);
        if (b4 == 0) {
            i5 = 0;
        } else {
            i5 = getDirectory$okio()[b4 - 1];
        }
        return getSegments$okio()[b4][(i4 - i5) + getDirectory$okio()[getSegments$okio().length + b4]];
    }

    public int lastIndexOf(byte[] bArr, int i4) {
        o.e(bArr, "other");
        return a().lastIndexOf(bArr, i4);
    }

    public boolean rangeEquals(int i4, ByteString byteString, int i5, int i6) {
        int i7;
        o.e(byteString, "other");
        if (i4 < 0 || i4 > size() - i6) {
            return false;
        }
        int i8 = i6 + i4;
        int b4 = c.b(this, i4);
        while (i4 < i8) {
            if (b4 == 0) {
                i7 = 0;
            } else {
                i7 = getDirectory$okio()[b4 - 1];
            }
            int i9 = getDirectory$okio()[getSegments$okio().length + b4];
            int min = Math.min(i8, (getDirectory$okio()[b4] - i7) + i7) - i4;
            if (!byteString.rangeEquals(i5, getSegments$okio()[b4], i9 + (i4 - i7), min)) {
                return false;
            }
            i5 += min;
            i4 += min;
            b4++;
        }
        return true;
    }

    public String string(Charset charset) {
        o.e(charset, HttpRequest.PARAM_CHARSET);
        return a().string(charset);
    }

    public ByteString substring(int i4, int i5) {
        int d4 = B.d(this, i5);
        if (i4 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i4 + " < 0").toString());
        } else if (d4 <= size()) {
            int i6 = d4 - i4;
            if (i6 < 0) {
                throw new IllegalArgumentException(("endIndex=" + d4 + " < beginIndex=" + i4).toString());
            } else if (i4 == 0 && d4 == size()) {
                return this;
            } else {
                if (i4 == d4) {
                    return ByteString.EMPTY;
                }
                int b4 = c.b(this, i4);
                int b5 = c.b(this, d4 - 1);
                byte[][] bArr = (byte[][]) C0713h.i(getSegments$okio(), b4, b5 + 1);
                int[] iArr = new int[(bArr.length * 2)];
                int i7 = 0;
                if (b4 <= b5) {
                    int i8 = b4;
                    int i9 = 0;
                    while (true) {
                        iArr[i9] = Math.min(getDirectory$okio()[i8] - i4, i6);
                        int i10 = i9 + 1;
                        iArr[i9 + bArr.length] = getDirectory$okio()[getSegments$okio().length + i8];
                        if (i8 == b5) {
                            break;
                        }
                        i8++;
                        i9 = i10;
                    }
                }
                if (b4 != 0) {
                    i7 = getDirectory$okio()[b4 - 1];
                }
                int length = bArr.length;
                iArr[length] = iArr[length] + (i4 - i7);
                return new SegmentedByteString(bArr, iArr);
            }
        } else {
            throw new IllegalArgumentException(("endIndex=" + d4 + " > length(" + size() + ')').toString());
        }
    }

    public ByteString toAsciiLowercase() {
        return a().toAsciiLowercase();
    }

    public ByteString toAsciiUppercase() {
        return a().toAsciiUppercase();
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        int length = getSegments$okio().length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            int i7 = getDirectory$okio()[length + i4];
            int i8 = getDirectory$okio()[i4];
            int i9 = i8 - i5;
            C0713h.d(getSegments$okio()[i4], bArr, i6, i7, i7 + i9);
            i6 += i9;
            i4++;
            i5 = i8;
        }
        return bArr;
    }

    public String toString() {
        return a().toString();
    }

    public void write(OutputStream outputStream) {
        o.e(outputStream, "out");
        int length = getSegments$okio().length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = getDirectory$okio()[length + i4];
            int i7 = getDirectory$okio()[i4];
            outputStream.write(getSegments$okio()[i4], i6, i7 - i5);
            i4++;
            i5 = i7;
        }
    }

    public void write$okio(C0500b bVar, int i4, int i5) {
        int i6;
        o.e(bVar, "buffer");
        int i7 = i4 + i5;
        int b4 = c.b(this, i4);
        while (i4 < i7) {
            if (b4 == 0) {
                i6 = 0;
            } else {
                i6 = getDirectory$okio()[b4 - 1];
            }
            int i8 = getDirectory$okio()[getSegments$okio().length + b4];
            int min = Math.min(i7, (getDirectory$okio()[b4] - i6) + i6) - i4;
            int i9 = i8 + (i4 - i6);
            r rVar = new r(getSegments$okio()[b4], i9, i9 + min, true, false);
            r rVar2 = bVar.f7648a;
            if (rVar2 == null) {
                rVar.f7689g = rVar;
                rVar.f7688f = rVar;
                bVar.f7648a = rVar;
            } else {
                o.b(rVar2);
                r rVar3 = rVar2.f7689g;
                o.b(rVar3);
                rVar3.c(rVar);
            }
            i4 += min;
            b4++;
        }
        bVar.v0(bVar.w0() + ((long) i5));
    }

    public boolean rangeEquals(int i4, byte[] bArr, int i5, int i6) {
        int i7;
        o.e(bArr, "other");
        if (i4 < 0 || i4 > size() - i6 || i5 < 0 || i5 > bArr.length - i6) {
            return false;
        }
        int i8 = i6 + i4;
        int b4 = c.b(this, i4);
        while (i4 < i8) {
            if (b4 == 0) {
                i7 = 0;
            } else {
                i7 = getDirectory$okio()[b4 - 1];
            }
            int i9 = getDirectory$okio()[getSegments$okio().length + b4];
            int min = Math.min(i8, (getDirectory$okio()[b4] - i7) + i7) - i4;
            if (!B.a(getSegments$okio()[b4], i9 + (i4 - i7), bArr, i5, min)) {
                return false;
            }
            i5 += min;
            i4 += min;
            b4++;
        }
        return true;
    }
}
