package c3;

import java.util.Arrays;
import kotlin.jvm.internal.o;
import okio.ByteString;

public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f7701a;

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f7702b;

    static {
        ByteString.a aVar = ByteString.Companion;
        f7701a = aVar.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData$okio();
        f7702b = aVar.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData$okio();
    }

    public static final byte[] a(String str) {
        int i4;
        o.e(str, "<this>");
        int length = str.length();
        while (length > 0 && ((r5 = str.charAt(length - 1)) == '=' || r5 == 10 || r5 == 13 || r5 == ' ' || r5 == 9)) {
            length--;
        }
        int i5 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i5];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            char charAt = str.charAt(i9);
            if ('A' <= charAt && charAt < '[') {
                i4 = charAt - 'A';
            } else if ('a' <= charAt && charAt < '{') {
                i4 = charAt - 'G';
            } else if ('0' <= charAt && charAt < ':') {
                i4 = charAt + 4;
            } else if (charAt == '+' || charAt == '-') {
                i4 = 62;
            } else if (charAt == '/' || charAt == '_') {
                i4 = 63;
            } else {
                if (!(charAt == 10 || charAt == 13 || charAt == ' ' || charAt == 9)) {
                    return null;
                }
            }
            i7 = (i7 << 6) | i4;
            i6++;
            if (i6 % 4 == 0) {
                bArr[i8] = (byte) (i7 >> 16);
                int i10 = i8 + 2;
                bArr[i8 + 1] = (byte) (i7 >> 8);
                i8 += 3;
                bArr[i10] = (byte) i7;
            }
        }
        int i11 = i6 % 4;
        if (i11 == 1) {
            return null;
        }
        if (i11 == 2) {
            bArr[i8] = (byte) ((i7 << 12) >> 16);
            i8++;
        } else if (i11 == 3) {
            int i12 = i7 << 6;
            int i13 = i8 + 1;
            bArr[i8] = (byte) (i12 >> 16);
            i8 += 2;
            bArr[i13] = (byte) (i12 >> 8);
        }
        if (i8 == i5) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i8);
        o.d(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static final String b(byte[] bArr, byte[] bArr2) {
        o.e(bArr, "<this>");
        o.e(bArr2, "map");
        byte[] bArr3 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            byte b4 = bArr[i4];
            int i6 = i4 + 2;
            byte b5 = bArr[i4 + 1];
            i4 += 3;
            byte b6 = bArr[i6];
            bArr3[i5] = bArr2[(b4 & 255) >> 2];
            bArr3[i5 + 1] = bArr2[((b4 & 3) << 4) | ((b5 & 255) >> 4)];
            int i7 = i5 + 3;
            bArr3[i5 + 2] = bArr2[((b5 & 15) << 2) | ((b6 & 255) >> 6)];
            i5 += 4;
            bArr3[i7] = bArr2[b6 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b7 = bArr[i4];
            bArr3[i5] = bArr2[(b7 & 255) >> 2];
            bArr3[i5 + 1] = bArr2[(b7 & 3) << 4];
            byte b8 = (byte) 61;
            bArr3[i5 + 2] = b8;
            bArr3[i5 + 3] = b8;
        } else if (length2 == 2) {
            int i8 = i4 + 1;
            byte b9 = bArr[i4];
            byte b10 = bArr[i8];
            bArr3[i5] = bArr2[(b9 & 255) >> 2];
            bArr3[i5 + 1] = bArr2[((b9 & 3) << 4) | ((b10 & 255) >> 4)];
            bArr3[i5 + 2] = bArr2[(b10 & 15) << 2];
            bArr3[i5 + 3] = (byte) 61;
        }
        return A.b(bArr3);
    }

    public static /* synthetic */ String c(byte[] bArr, byte[] bArr2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            bArr2 = f7701a;
        }
        return b(bArr, bArr2);
    }

    public static final byte[] d() {
        return f7702b;
    }
}
