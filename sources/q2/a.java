package Q2;

import c3.C0500b;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.jvm.internal.o;

public abstract class a {
    private static final boolean a(String str) {
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 + 1;
            char charAt = str.charAt(i4);
            if (o.f(charAt, 31) <= 0 || o.f(charAt, 127) >= 0 || kotlin.text.o.U(" #%/:?@[\\]", charAt, 0, false, 6, (Object) null) != -1) {
                return true;
            }
            i4 = i5;
        }
        return false;
    }

    private static final boolean b(String str, int i4, int i5, byte[] bArr, int i6) {
        int i7 = i6;
        while (i4 < i5) {
            if (i7 == bArr.length) {
                return false;
            }
            if (i7 != i6) {
                if (str.charAt(i4) != '.') {
                    return false;
                }
                i4++;
            }
            int i8 = i4;
            int i9 = 0;
            while (i8 < i5) {
                char charAt = str.charAt(i8);
                if (o.f(charAt, 48) < 0 || o.f(charAt, 57) > 0) {
                    break;
                } else if ((i9 == 0 && i4 != i8) || (i9 = ((i9 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i8++;
                }
            }
            if (i8 - i4 == 0) {
                return false;
            }
            bArr[i7] = (byte) i9;
            i7++;
            i4 = i8;
        }
        if (i7 == i6 + 4) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0097, code lost:
        if (r13 == 16) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0099, code lost:
        if (r14 != -1) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009c, code lost:
        r0 = r13 - r14;
        java.lang.System.arraycopy(r9, r14, r9, 16 - r0, r0);
        java.util.Arrays.fill(r9, r14, (16 - r13) + r14, (byte) 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ad, code lost:
        return java.net.InetAddress.getByAddress(r9);
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0084 A[LOOP:0: B:1:0x000e->B:36:0x0084, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0096 A[EDGE_INSN: B:44:0x0096->B:37:0x0096 ?: BREAK  
    EDGE_INSN: B:50:0x0096->B:37:0x0096 ?: BREAK  , RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.net.InetAddress c(java.lang.String r18, int r19, int r20) {
        /*
            r6 = r18
            r7 = r20
            r8 = 16
            byte[] r9 = new byte[r8]
            r11 = -1
            r12 = r19
            r14 = r11
            r15 = r14
            r13 = 0
        L_0x000e:
            r16 = 0
            if (r12 >= r7) goto L_0x0097
            if (r13 != r8) goto L_0x0015
            return r16
        L_0x0015:
            int r5 = r12 + 2
            if (r5 > r7) goto L_0x0038
            r4 = 4
            r17 = 0
            java.lang.String r1 = "::"
            r3 = 0
            r0 = r18
            r2 = r12
            r10 = r5
            r5 = r17
            boolean r0 = kotlin.text.o.F(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0038
            if (r14 == r11) goto L_0x002e
            return r16
        L_0x002e:
            int r13 = r13 + 2
            if (r10 != r7) goto L_0x0035
            r14 = r13
            goto L_0x0097
        L_0x0035:
            r15 = r10
            r14 = r13
            goto L_0x0067
        L_0x0038:
            if (r13 == 0) goto L_0x004a
            r4 = 4
            r5 = 0
            java.lang.String r1 = ":"
            r3 = 0
            r0 = r18
            r2 = r12
            boolean r0 = kotlin.text.o.F(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x004c
            int r12 = r12 + 1
        L_0x004a:
            r15 = r12
            goto L_0x0067
        L_0x004c:
            r4 = 4
            r5 = 0
            java.lang.String r1 = "."
            r3 = 0
            r0 = r18
            r2 = r12
            boolean r0 = kotlin.text.o.F(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0066
            int r0 = r13 + -2
            boolean r0 = b(r6, r15, r7, r9, r0)
            if (r0 != 0) goto L_0x0063
            return r16
        L_0x0063:
            int r13 = r13 + 2
            goto L_0x0097
        L_0x0066:
            return r16
        L_0x0067:
            r12 = r15
            r0 = 0
        L_0x0069:
            if (r12 >= r7) goto L_0x007c
            char r1 = r6.charAt(r12)
            int r1 = Q2.d.H(r1)
            if (r1 != r11) goto L_0x0076
            goto L_0x007c
        L_0x0076:
            int r0 = r0 << 4
            int r0 = r0 + r1
            int r12 = r12 + 1
            goto L_0x0069
        L_0x007c:
            int r1 = r12 - r15
            if (r1 == 0) goto L_0x0096
            r2 = 4
            if (r1 <= r2) goto L_0x0084
            goto L_0x0096
        L_0x0084:
            int r1 = r13 + 1
            int r2 = r0 >>> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r9[r13] = r2
            int r13 = r13 + 2
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r9[r1] = r0
            goto L_0x000e
        L_0x0096:
            return r16
        L_0x0097:
            if (r13 == r8) goto L_0x00a9
            if (r14 != r11) goto L_0x009c
            return r16
        L_0x009c:
            int r0 = r13 - r14
            int r1 = 16 - r0
            java.lang.System.arraycopy(r9, r14, r9, r1, r0)
            int r8 = r8 - r13
            int r8 = r8 + r14
            r0 = 0
            java.util.Arrays.fill(r9, r14, r8, r0)
        L_0x00a9:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.a.c(java.lang.String, int, int):java.net.InetAddress");
    }

    private static final String d(byte[] bArr) {
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < bArr.length) {
            int i8 = i6;
            while (i8 < 16 && bArr[i8] == 0 && bArr[i8 + 1] == 0) {
                i8 += 2;
            }
            int i9 = i8 - i6;
            if (i9 > i7 && i9 >= 4) {
                i4 = i6;
                i7 = i9;
            }
            i6 = i8 + 2;
        }
        C0500b bVar = new C0500b();
        while (i5 < bArr.length) {
            if (i5 == i4) {
                bVar.I(58);
                i5 += i7;
                if (i5 == 16) {
                    bVar.I(58);
                }
            } else {
                if (i5 > 0) {
                    bVar.I(58);
                }
                bVar.k((long) ((d.d(bArr[i5], 255) << 8) | d.d(bArr[i5 + 1], 255)));
                i5 += 2;
            }
        }
        return bVar.s0();
    }

    public static final String e(String str) {
        InetAddress inetAddress;
        o.e(str, "<this>");
        if (kotlin.text.o.L(str, ":", false, 2, (Object) null)) {
            if (!kotlin.text.o.G(str, "[", false, 2, (Object) null) || !kotlin.text.o.u(str, "]", false, 2, (Object) null)) {
                inetAddress = c(str, 0, str.length());
            } else {
                inetAddress = c(str, 1, str.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                o.d(address, "address");
                return d(address);
            } else if (address.length == 4) {
                return inetAddress.getHostAddress();
            } else {
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        } else {
            try {
                String ascii = IDN.toASCII(str);
                o.d(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                o.d(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                o.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() != 0 && !a(lowerCase)) {
                    return lowerCase;
                }
                return null;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }
}
