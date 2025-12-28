package okio;

import c3.A;
import c3.B;
import c3.C0500b;
import c3.z;
import com.silkimen.http.HttpRequest;
import d3.b;
import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.collections.C0713h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0016\u0018\u0000 x2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001nB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\r\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\r\u0010\u001c\u001a\u00020\u0000¢\u0006\u0004\b\u001c\u0010\u0019J\u0017\u0010 \u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0016¢\u0006\u0004\b$\u0010#J\u0017\u0010%\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0016¢\u0006\u0004\b%\u0010#J\u001f\u0010(\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0000H\u0010¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020\u0010H\u0016¢\u0006\u0004\b)\u0010\u0012J\u000f\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010\u0012J\u000f\u0010+\u001a\u00020\u0000H\u0016¢\u0006\u0004\b+\u0010\u0019J\u000f\u0010,\u001a\u00020\u0000H\u0016¢\u0006\u0004\b,\u0010\u0019J#\u00100\u001a\u00020\u00002\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020-H\u0017¢\u0006\u0004\b0\u00101J\u0017\u00106\u001a\u0002032\u0006\u00102\u001a\u00020-H\u0010¢\u0006\u0004\b4\u00105J\u0018\u00109\u001a\u0002032\u0006\u00107\u001a\u00020-H\u0002¢\u0006\u0004\b8\u00105J\u000f\u0010<\u001a\u00020-H\u0010¢\u0006\u0004\b:\u0010;J\u000f\u0010=\u001a\u00020\u0003H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\u00020\u0003H\u0010¢\u0006\u0004\b?\u0010>J\u000f\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\t2\u0006\u0010\r\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ'\u0010E\u001a\u00020\t2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020-2\u0006\u0010J\u001a\u00020-H\u0010¢\u0006\u0004\bK\u0010LJ/\u0010P\u001a\u00020O2\u0006\u0010I\u001a\u00020-2\u0006\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020-2\u0006\u0010J\u001a\u00020-H\u0016¢\u0006\u0004\bP\u0010QJ/\u0010P\u001a\u00020O2\u0006\u0010I\u001a\u00020-2\u0006\u0010M\u001a\u00020\u00032\u0006\u0010N\u001a\u00020-2\u0006\u0010J\u001a\u00020-H\u0016¢\u0006\u0004\bP\u0010RJ3\u0010U\u001a\u00020\t2\b\b\u0002\u0010I\u001a\u00020-2\u0006\u0010S\u001a\u00020\u00032\b\b\u0002\u0010T\u001a\u00020-2\u0006\u0010J\u001a\u00020-H\u0016¢\u0006\u0004\bU\u0010VJ\u0015\u0010X\u001a\u00020O2\u0006\u0010W\u001a\u00020\u0000¢\u0006\u0004\bX\u0010YJ\u0015\u0010X\u001a\u00020O2\u0006\u0010W\u001a\u00020\u0003¢\u0006\u0004\bX\u0010ZJ\u0015\u0010\\\u001a\u00020O2\u0006\u0010[\u001a\u00020\u0000¢\u0006\u0004\b\\\u0010YJ\u0015\u0010\\\u001a\u00020O2\u0006\u0010[\u001a\u00020\u0003¢\u0006\u0004\b\\\u0010ZJ!\u0010^\u001a\u00020-2\u0006\u0010M\u001a\u00020\u00002\b\b\u0002\u0010]\u001a\u00020-H\u0007¢\u0006\u0004\b^\u0010_J!\u0010^\u001a\u00020-2\u0006\u0010M\u001a\u00020\u00032\b\b\u0002\u0010]\u001a\u00020-H\u0017¢\u0006\u0004\b^\u0010`J!\u0010a\u001a\u00020-2\u0006\u0010M\u001a\u00020\u00002\b\b\u0002\u0010]\u001a\u00020-H\u0007¢\u0006\u0004\ba\u0010_J!\u0010a\u001a\u00020-2\u0006\u0010M\u001a\u00020\u00032\b\b\u0002\u0010]\u001a\u00020-H\u0017¢\u0006\u0004\ba\u0010`J\u001a\u0010c\u001a\u00020O2\b\u0010M\u001a\u0004\u0018\u00010bH\u0002¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020-H\u0016¢\u0006\u0004\be\u0010;J\u0018\u0010f\u001a\u00020-2\u0006\u0010M\u001a\u00020\u0000H\u0002¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020\u0010H\u0016¢\u0006\u0004\bh\u0010\u0012J\u0017\u00108\u001a\u0002032\u0006\u00107\u001a\u00020-H\u0007¢\u0006\u0004\bi\u00105J\u000f\u0010k\u001a\u00020-H\u0007¢\u0006\u0004\bj\u0010;R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\u0004\u0010l\u001a\u0004\bm\u0010>R\"\u0010e\u001a\u00020-8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010;\"\u0004\bq\u0010rR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010\u0012\"\u0004\bv\u0010wR\u0011\u0010k\u001a\u00020-8G¢\u0006\u0006\u001a\u0004\bk\u0010;¨\u0006y"}, d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", "", "data", "<init>", "([B)V", "Ljava/io/ObjectInputStream;", "in", "Ll2/q;", "readObject", "(Ljava/io/ObjectInputStream;)V", "Ljava/io/ObjectOutputStream;", "out", "writeObject", "(Ljava/io/ObjectOutputStream;)V", "", "utf8", "()Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "string", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "base64", "md5", "()Lokio/ByteString;", "sha1", "sha256", "sha512", "algorithm", "digest$okio", "(Ljava/lang/String;)Lokio/ByteString;", "digest", "key", "hmacSha1", "(Lokio/ByteString;)Lokio/ByteString;", "hmacSha256", "hmacSha512", "hmac$okio", "(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;", "hmac", "base64Url", "hex", "toAsciiLowercase", "toAsciiUppercase", "", "beginIndex", "endIndex", "substring", "(II)Lokio/ByteString;", "pos", "", "internalGet$okio", "(I)B", "internalGet", "index", "getByte", "get", "getSize$okio", "()I", "getSize", "toByteArray", "()[B", "internalArray$okio", "internalArray", "Ljava/nio/ByteBuffer;", "asByteBuffer", "()Ljava/nio/ByteBuffer;", "Ljava/io/OutputStream;", "write", "(Ljava/io/OutputStream;)V", "Lc3/b;", "buffer", "offset", "byteCount", "write$okio", "(Lc3/b;II)V", "other", "otherOffset", "", "rangeEquals", "(ILokio/ByteString;II)Z", "(I[BII)Z", "target", "targetOffset", "copyInto", "(I[BII)V", "prefix", "startsWith", "(Lokio/ByteString;)Z", "([B)Z", "suffix", "endsWith", "fromIndex", "indexOf", "(Lokio/ByteString;I)I", "([BI)I", "lastIndexOf", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "compareTo", "(Lokio/ByteString;)I", "toString", "-deprecated_getByte", "-deprecated_size", "size", "[B", "getData$okio", "a", "I", "getHashCode$okio", "setHashCode$okio", "(I)V", "b", "Ljava/lang/String;", "getUtf8$okio", "setUtf8$okio", "(Ljava/lang/String;)V", "Companion", "okio"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final a Companion = new a((i) null);
    public static final ByteString EMPTY = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;

    /* renamed from: a  reason: collision with root package name */
    private transient int f15613a;

    /* renamed from: b  reason: collision with root package name */
    private transient String f15614b;
    private final byte[] data;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public static /* synthetic */ ByteString h(a aVar, byte[] bArr, int i4, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i4 = 0;
            }
            if ((i6 & 2) != 0) {
                i5 = B.c();
            }
            return aVar.g(bArr, i4, i5);
        }

        public final ByteString a(String str) {
            o.e(str, "<this>");
            byte[] a4 = z.a(str);
            if (a4 != null) {
                return new ByteString(a4);
            }
            return null;
        }

        public final ByteString b(String str) {
            o.e(str, "<this>");
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i4 = 0; i4 < length; i4++) {
                    int i5 = i4 * 2;
                    bArr[i4] = (byte) ((b.e(str.charAt(i5)) << 4) + b.e(str.charAt(i5 + 1)));
                }
                return new ByteString(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }

        public final ByteString c(String str, Charset charset) {
            o.e(str, "<this>");
            o.e(charset, HttpRequest.PARAM_CHARSET);
            byte[] bytes = str.getBytes(charset);
            o.d(bytes, "this as java.lang.String).getBytes(charset)");
            return new ByteString(bytes);
        }

        public final ByteString d(String str) {
            o.e(str, "<this>");
            ByteString byteString = new ByteString(A.a(str));
            byteString.setUtf8$okio(str);
            return byteString;
        }

        public final ByteString e(ByteBuffer byteBuffer) {
            o.e(byteBuffer, "<this>");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new ByteString(bArr);
        }

        public final ByteString f(byte... bArr) {
            o.e(bArr, "data");
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            o.d(copyOf, "copyOf(this, size)");
            return new ByteString(copyOf);
        }

        public final ByteString g(byte[] bArr, int i4, int i5) {
            o.e(bArr, "<this>");
            int e4 = B.e(bArr, i5);
            B.b((long) bArr.length, (long) i4, (long) e4);
            return new ByteString(C0713h.h(bArr, i4, e4 + i4));
        }

        public final ByteString i(InputStream inputStream, int i4) {
            o.e(inputStream, "<this>");
            if (i4 >= 0) {
                byte[] bArr = new byte[i4];
                int i5 = 0;
                while (i5 < i4) {
                    int read = inputStream.read(bArr, i5, i4 - i5);
                    if (read != -1) {
                        i5 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return new ByteString(bArr);
            }
            throw new IllegalArgumentException(("byteCount < 0: " + i4).toString());
        }

        private a() {
        }
    }

    public ByteString(byte[] bArr) {
        o.e(bArr, "data");
        this.data = bArr;
    }

    public static /* synthetic */ void copyInto$default(ByteString byteString, int i4, byte[] bArr, int i5, int i6, int i7, Object obj) {
        if (obj == null) {
            if ((i7 & 1) != 0) {
                i4 = 0;
            }
            if ((i7 & 4) != 0) {
                i5 = 0;
            }
            byteString.copyInto(i4, bArr, i5, i6);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyInto");
    }

    public static final ByteString decodeBase64(String str) {
        return Companion.a(str);
    }

    public static final ByteString decodeHex(String str) {
        return Companion.b(str);
    }

    public static final ByteString encodeString(String str, Charset charset) {
        return Companion.c(str, charset);
    }

    public static final ByteString encodeUtf8(String str) {
        return Companion.d(str);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, ByteString byteString2, int i4, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 2) != 0) {
                i4 = 0;
            }
            return byteString.indexOf(byteString2, i4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, ByteString byteString2, int i4, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 2) != 0) {
                i4 = B.c();
            }
            return byteString.lastIndexOf(byteString2, i4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    public static final ByteString of(ByteBuffer byteBuffer) {
        return Companion.e(byteBuffer);
    }

    public static final ByteString read(InputStream inputStream, int i4) {
        return Companion.i(inputStream, i4);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        ByteString i4 = Companion.i(objectInputStream, objectInputStream.readInt());
        Field declaredField = ByteString.class.getDeclaredField("data");
        declaredField.setAccessible(true);
        declaredField.set(this, i4.data);
    }

    public static /* synthetic */ ByteString substring$default(ByteString byteString, int i4, int i5, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 1) != 0) {
                i4 = 0;
            }
            if ((i6 & 2) != 0) {
                i5 = B.c();
            }
            return byteString.substring(i4, i5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    /* renamed from: -deprecated_getByte  reason: not valid java name */
    public final byte m14deprecated_getByte(int i4) {
        return getByte(i4);
    }

    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m15deprecated_size() {
        return size();
    }

    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        o.d(asReadOnlyBuffer, "wrap(data).asReadOnlyBuffer()");
        return asReadOnlyBuffer;
    }

    public String base64() {
        return z.c(getData$okio(), (byte[]) null, 1, (Object) null);
    }

    public String base64Url() {
        return z.b(getData$okio(), z.d());
    }

    public void copyInto(int i4, byte[] bArr, int i5, int i6) {
        o.e(bArr, "target");
        C0713h.d(getData$okio(), bArr, i5, i4, i6 + i4);
    }

    public ByteString digest$okio(String str) {
        o.e(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        instance.update(this.data, 0, size());
        byte[] digest = instance.digest();
        o.d(digest, "digestBytes");
        return new ByteString(digest);
    }

    public final boolean endsWith(ByteString byteString) {
        o.e(byteString, "suffix");
        return rangeEquals(size() - byteString.size(), byteString, 0, byteString.size());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == getData$okio().length && byteString.rangeEquals(0, getData$okio(), 0, getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public final byte getByte(int i4) {
        return internalGet$okio(i4);
    }

    public final byte[] getData$okio() {
        return this.data;
    }

    public final int getHashCode$okio() {
        return this.f15613a;
    }

    public int getSize$okio() {
        return getData$okio().length;
    }

    public final String getUtf8$okio() {
        return this.f15614b;
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int hashCode = Arrays.hashCode(getData$okio());
        setHashCode$okio(hashCode);
        return hashCode;
    }

    public String hex() {
        char[] cArr = new char[(getData$okio().length * 2)];
        int i4 = 0;
        for (byte b4 : getData$okio()) {
            int i5 = i4 + 1;
            cArr[i4] = b.f()[(b4 >> 4) & 15];
            i4 += 2;
            cArr[i5] = b.f()[b4 & 15];
        }
        return kotlin.text.o.q(cArr);
    }

    public ByteString hmac$okio(String str, ByteString byteString) {
        o.e(str, "algorithm");
        o.e(byteString, "key");
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(byteString.toByteArray(), str));
            byte[] doFinal = instance.doFinal(this.data);
            o.d(doFinal, "mac.doFinal(data)");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public ByteString hmacSha1(ByteString byteString) {
        o.e(byteString, "key");
        return hmac$okio("HmacSHA1", byteString);
    }

    public ByteString hmacSha256(ByteString byteString) {
        o.e(byteString, "key");
        return hmac$okio("HmacSHA256", byteString);
    }

    public ByteString hmacSha512(ByteString byteString) {
        o.e(byteString, "key");
        return hmac$okio("HmacSHA512", byteString);
    }

    public final int indexOf(ByteString byteString) {
        o.e(byteString, "other");
        return indexOf$default(this, byteString, 0, 2, (Object) null);
    }

    public byte[] internalArray$okio() {
        return getData$okio();
    }

    public byte internalGet$okio(int i4) {
        return getData$okio()[i4];
    }

    public final int lastIndexOf(ByteString byteString) {
        o.e(byteString, "other");
        return lastIndexOf$default(this, byteString, 0, 2, (Object) null);
    }

    public final ByteString md5() {
        return digest$okio("MD5");
    }

    public boolean rangeEquals(int i4, ByteString byteString, int i5, int i6) {
        o.e(byteString, "other");
        return byteString.rangeEquals(i5, getData$okio(), i4, i6);
    }

    public final void setHashCode$okio(int i4) {
        this.f15613a = i4;
    }

    public final void setUtf8$okio(String str) {
        this.f15614b = str;
    }

    public final ByteString sha1() {
        return digest$okio("SHA-1");
    }

    public final ByteString sha256() {
        return digest$okio("SHA-256");
    }

    public final ByteString sha512() {
        return digest$okio("SHA-512");
    }

    public final int size() {
        return getSize$okio();
    }

    public final boolean startsWith(ByteString byteString) {
        o.e(byteString, "prefix");
        return rangeEquals(0, byteString, 0, byteString.size());
    }

    public String string(Charset charset) {
        o.e(charset, HttpRequest.PARAM_CHARSET);
        return new String(this.data, charset);
    }

    public final ByteString substring() {
        return substring$default(this, 0, 0, 3, (Object) null);
    }

    public ByteString toAsciiLowercase() {
        byte b4;
        int i4 = 0;
        while (i4 < getData$okio().length) {
            byte b5 = getData$okio()[i4];
            byte b6 = (byte) 65;
            if (b5 < b6 || b5 > (b4 = (byte) 90)) {
                i4++;
            } else {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                o.d(copyOf, "copyOf(this, size)");
                copyOf[i4] = (byte) (b5 + 32);
                for (int i5 = i4 + 1; i5 < copyOf.length; i5++) {
                    byte b7 = copyOf[i5];
                    if (b7 >= b6 && b7 <= b4) {
                        copyOf[i5] = (byte) (b7 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    public ByteString toAsciiUppercase() {
        byte b4;
        int i4 = 0;
        while (i4 < getData$okio().length) {
            byte b5 = getData$okio()[i4];
            byte b6 = (byte) 97;
            if (b5 < b6 || b5 > (b4 = (byte) 122)) {
                i4++;
            } else {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                o.d(copyOf, "copyOf(this, size)");
                copyOf[i4] = (byte) (b5 - 32);
                for (int i5 = i4 + 1; i5 < copyOf.length; i5++) {
                    byte b7 = copyOf[i5];
                    if (b7 >= b6 && b7 <= b4) {
                        copyOf[i5] = (byte) (b7 - 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    public byte[] toByteArray() {
        byte[] data$okio = getData$okio();
        byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
        o.d(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public String toString() {
        ByteString byteString;
        String str;
        if (getData$okio().length == 0) {
            str = "[size=0]";
        } else {
            int a4 = b.c(getData$okio(), 64);
            if (a4 != -1) {
                String utf8 = utf8();
                String substring = utf8.substring(0, a4);
                o.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String C3 = kotlin.text.o.C(kotlin.text.o.C(kotlin.text.o.C(substring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
                if (a4 < utf8.length()) {
                    return "[size=" + getData$okio().length + " text=" + C3 + "…]";
                }
                return "[text=" + C3 + ']';
            } else if (getData$okio().length <= 64) {
                str = "[hex=" + hex() + ']';
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("[size=");
                sb.append(getData$okio().length);
                sb.append(" hex=");
                int d4 = B.d(this, 64);
                if (d4 > getData$okio().length) {
                    throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
                } else if (d4 >= 0) {
                    if (d4 == getData$okio().length) {
                        byteString = this;
                    } else {
                        byteString = new ByteString(C0713h.h(getData$okio(), 0, d4));
                    }
                    sb.append(byteString.hex());
                    sb.append("…]");
                    return sb.toString();
                } else {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                }
            }
        }
        return str;
    }

    public String utf8() {
        String utf8$okio = getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String b4 = A.b(internalArray$okio());
        setUtf8$okio(b4);
        return b4;
    }

    public void write(OutputStream outputStream) {
        o.e(outputStream, "out");
        outputStream.write(this.data);
    }

    public void write$okio(C0500b bVar, int i4, int i5) {
        o.e(bVar, "buffer");
        b.d(this, bVar, i4, i5);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, byte[] bArr, int i4, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 2) != 0) {
                i4 = 0;
            }
            return byteString.indexOf(bArr, i4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static final ByteString of(byte... bArr) {
        return Companion.f(bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (r0 < r1) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r7 < r8) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(okio.ByteString r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.o.e(r10, r0)
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0013:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L_0x002e
            byte r7 = r9.getByte(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.getByte(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0028
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0028:
            if (r7 >= r8) goto L_0x002c
        L_0x002a:
            r3 = r5
            goto L_0x0034
        L_0x002c:
            r3 = r6
            goto L_0x0034
        L_0x002e:
            if (r0 != r1) goto L_0x0031
            goto L_0x0034
        L_0x0031:
            if (r0 >= r1) goto L_0x002c
            goto L_0x002a
        L_0x0034:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(okio.ByteString):int");
    }

    public final boolean endsWith(byte[] bArr) {
        o.e(bArr, "suffix");
        return rangeEquals(size() - bArr.length, bArr, 0, bArr.length);
    }

    public final int indexOf(byte[] bArr) {
        o.e(bArr, "other");
        return indexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public final int lastIndexOf(byte[] bArr) {
        o.e(bArr, "other");
        return lastIndexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public boolean rangeEquals(int i4, byte[] bArr, int i5, int i6) {
        o.e(bArr, "other");
        return i4 >= 0 && i4 <= getData$okio().length - i6 && i5 >= 0 && i5 <= bArr.length - i6 && B.a(getData$okio(), i4, bArr, i5, i6);
    }

    public final boolean startsWith(byte[] bArr) {
        o.e(bArr, "prefix");
        return rangeEquals(0, bArr, 0, bArr.length);
    }

    public final ByteString substring(int i4) {
        return substring$default(this, i4, 0, 2, (Object) null);
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, byte[] bArr, int i4, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 2) != 0) {
                i4 = B.c();
            }
            return byteString.lastIndexOf(bArr, i4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    public static final ByteString of(byte[] bArr, int i4, int i5) {
        return Companion.g(bArr, i4, i5);
    }

    public final int indexOf(ByteString byteString, int i4) {
        o.e(byteString, "other");
        return indexOf(byteString.internalArray$okio(), i4);
    }

    public final int lastIndexOf(ByteString byteString, int i4) {
        o.e(byteString, "other");
        return lastIndexOf(byteString.internalArray$okio(), i4);
    }

    public ByteString substring(int i4, int i5) {
        int d4 = B.d(this, i5);
        if (i4 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        } else if (d4 > getData$okio().length) {
            throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
        } else if (d4 - i4 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        } else if (i4 == 0 && d4 == getData$okio().length) {
            return this;
        } else {
            return new ByteString(C0713h.h(getData$okio(), i4, d4));
        }
    }

    public int indexOf(byte[] bArr, int i4) {
        o.e(bArr, "other");
        int length = getData$okio().length - bArr.length;
        int max = Math.max(i4, 0);
        if (max <= length) {
            while (!B.a(getData$okio(), max, bArr, 0, bArr.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public int lastIndexOf(byte[] bArr, int i4) {
        o.e(bArr, "other");
        for (int min = Math.min(B.d(this, i4), getData$okio().length - bArr.length); -1 < min; min--) {
            if (B.a(getData$okio(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }
}
