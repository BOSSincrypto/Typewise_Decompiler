package W2;

import Q2.d;
import kotlin.jvm.internal.o;
import okio.ByteString;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f1731a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final ByteString f1732b = ByteString.Companion.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f1733c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f1734d = new String[64];

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f1735e;

    static {
        String[] strArr = new String[256];
        int i4 = 0;
        for (int i5 = 0; i5 < 256; i5++) {
            String binaryString = Integer.toBinaryString(i5);
            o.d(binaryString, "toBinaryString(it)");
            strArr[i5] = kotlin.text.o.B(d.t("%8s", binaryString), ' ', '0', false, 4, (Object) null);
        }
        f1735e = strArr;
        String[] strArr2 = f1734d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i6 = iArr[0];
        strArr2[i6 | 8] = o.k(strArr2[i6], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i7 = 0;
        while (i7 < 3) {
            int i8 = iArr2[i7];
            i7++;
            int i9 = iArr[0];
            String[] strArr3 = f1734d;
            int i10 = i9 | i8;
            strArr3[i10] = strArr3[i9] + '|' + strArr3[i8];
            strArr3[i10 | 8] = strArr3[i9] + '|' + strArr3[i8] + "|PADDED";
        }
        int length = f1734d.length;
        while (i4 < length) {
            int i11 = i4 + 1;
            String[] strArr4 = f1734d;
            if (strArr4[i4] == null) {
                strArr4[i4] = f1735e[i4];
            }
            i4 = i11;
        }
    }

    private c() {
    }

    public final String a(int i4, int i5) {
        String str;
        if (i5 == 0) {
            return "";
        }
        if (!(i4 == 2 || i4 == 3)) {
            if (i4 == 4 || i4 == 6) {
                if (i5 == 1) {
                    return "ACK";
                }
                return f1735e[i5];
            } else if (!(i4 == 7 || i4 == 8)) {
                String[] strArr = f1734d;
                if (i5 < strArr.length) {
                    str = strArr[i5];
                    o.b(str);
                } else {
                    str = f1735e[i5];
                }
                String str2 = str;
                if (i4 == 5 && (i5 & 4) != 0) {
                    return kotlin.text.o.C(str2, "HEADERS", "PUSH_PROMISE", false, 4, (Object) null);
                }
                if (i4 != 0 || (i5 & 32) == 0) {
                    return str2;
                }
                return kotlin.text.o.C(str2, "PRIORITY", "COMPRESSED", false, 4, (Object) null);
            }
        }
        return f1735e[i5];
    }

    public final String b(int i4) {
        String[] strArr = f1733c;
        if (i4 < strArr.length) {
            return strArr[i4];
        }
        return d.t("0x%02x", Integer.valueOf(i4));
    }

    public final String c(boolean z3, int i4, int i5, int i6, int i7) {
        String str;
        String b4 = b(i6);
        String a4 = a(i6, i7);
        if (z3) {
            str = "<<";
        } else {
            str = ">>";
        }
        return d.t("%s 0x%08x %5d %-13s %s", str, Integer.valueOf(i4), Integer.valueOf(i5), b4, a4);
    }
}
