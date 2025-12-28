package d3;

import c3.C0500b;
import kotlin.jvm.internal.o;
import okio.ByteString;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f13559a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005c, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int c(byte[] r18, int r19) {
        /*
            r0 = r18
            r1 = r19
            int r2 = r0.length
            r3 = 0
            r4 = r3
            r5 = r4
        L_0x0008:
            if (r3 >= r2) goto L_0x0199
            byte r6 = r0[r3]
            r7 = 65533(0xfffd, float:9.1831E-41)
            r8 = 160(0xa0, float:2.24E-43)
            r9 = 127(0x7f, float:1.78E-43)
            r10 = 32
            r11 = 13
            r12 = 10
            r13 = 65536(0x10000, float:9.18355E-41)
            r16 = -1
            if (r6 < 0) goto L_0x0064
            int r17 = r5 + 1
            if (r5 != r1) goto L_0x0024
            return r4
        L_0x0024:
            if (r6 == r12) goto L_0x0032
            if (r6 == r11) goto L_0x0032
            if (r6 < 0) goto L_0x002d
            if (r6 >= r10) goto L_0x002d
            goto L_0x0034
        L_0x002d:
            if (r9 > r6) goto L_0x0032
            if (r6 >= r8) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            if (r6 != r7) goto L_0x0035
        L_0x0034:
            return r16
        L_0x0035:
            if (r6 >= r13) goto L_0x0039
            r5 = 1
            goto L_0x003a
        L_0x0039:
            r5 = 2
        L_0x003a:
            int r4 = r4 + r5
            int r3 = r3 + 1
        L_0x003d:
            r5 = r17
            if (r3 >= r2) goto L_0x0008
            byte r6 = r0[r3]
            if (r6 < 0) goto L_0x0008
            int r3 = r3 + 1
            int r17 = r5 + 1
            if (r5 != r1) goto L_0x004c
            return r4
        L_0x004c:
            if (r6 == r12) goto L_0x005a
            if (r6 == r11) goto L_0x005a
            if (r6 < 0) goto L_0x0055
            if (r6 >= r10) goto L_0x0055
            goto L_0x005c
        L_0x0055:
            if (r9 > r6) goto L_0x005a
            if (r6 >= r8) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            if (r6 != r7) goto L_0x005d
        L_0x005c:
            return r16
        L_0x005d:
            if (r6 >= r13) goto L_0x0061
            r5 = 1
            goto L_0x0062
        L_0x0061:
            r5 = 2
        L_0x0062:
            int r4 = r4 + r5
            goto L_0x003d
        L_0x0064:
            int r14 = r6 >> 5
            r15 = -2
            r13 = 128(0x80, float:1.794E-43)
            if (r14 != r15) goto L_0x00ab
            int r14 = r3 + 1
            if (r2 > r14) goto L_0x0073
            if (r5 != r1) goto L_0x0072
            return r4
        L_0x0072:
            return r16
        L_0x0073:
            byte r14 = r0[r14]
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x00a7
            r14 = r14 ^ 3968(0xf80, float:5.56E-42)
            int r6 = r6 << 6
            r6 = r6 ^ r14
            if (r6 >= r13) goto L_0x0084
            if (r5 != r1) goto L_0x0083
            return r4
        L_0x0083:
            return r16
        L_0x0084:
            int r13 = r5 + 1
            if (r5 != r1) goto L_0x0089
            return r4
        L_0x0089:
            if (r6 == r12) goto L_0x0097
            if (r6 == r11) goto L_0x0097
            if (r6 < 0) goto L_0x0092
            if (r6 >= r10) goto L_0x0092
            goto L_0x0099
        L_0x0092:
            if (r9 > r6) goto L_0x0097
            if (r6 >= r8) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            if (r6 != r7) goto L_0x009a
        L_0x0099:
            return r16
        L_0x009a:
            r5 = 65536(0x10000, float:9.18355E-41)
            if (r6 >= r5) goto L_0x00a0
            r14 = 1
            goto L_0x00a1
        L_0x00a0:
            r14 = 2
        L_0x00a1:
            int r4 = r4 + r14
            int r3 = r3 + 2
            r5 = r13
            goto L_0x0008
        L_0x00a7:
            if (r5 != r1) goto L_0x00aa
            return r4
        L_0x00aa:
            return r16
        L_0x00ab:
            int r14 = r6 >> 4
            r7 = 57344(0xe000, float:8.0356E-41)
            r8 = 55296(0xd800, float:7.7486E-41)
            if (r14 != r15) goto L_0x0117
            int r14 = r3 + 2
            if (r2 > r14) goto L_0x00bd
            if (r5 != r1) goto L_0x00bc
            return r4
        L_0x00bc:
            return r16
        L_0x00bd:
            int r15 = r3 + 1
            byte r15 = r0[r15]
            r9 = r15 & 192(0xc0, float:2.69E-43)
            if (r9 != r13) goto L_0x0113
            byte r9 = r0[r14]
            r14 = r9 & 192(0xc0, float:2.69E-43)
            if (r14 != r13) goto L_0x010f
            r13 = -123008(0xfffffffffffe1f80, float:NaN)
            r9 = r9 ^ r13
            int r13 = r15 << 6
            r9 = r9 ^ r13
            int r6 = r6 << 12
            r6 = r6 ^ r9
            r9 = 2048(0x800, float:2.87E-42)
            if (r6 >= r9) goto L_0x00dd
            if (r5 != r1) goto L_0x00dc
            return r4
        L_0x00dc:
            return r16
        L_0x00dd:
            if (r8 > r6) goto L_0x00e5
            if (r6 >= r7) goto L_0x00e5
            if (r5 != r1) goto L_0x00e4
            return r4
        L_0x00e4:
            return r16
        L_0x00e5:
            int r7 = r5 + 1
            if (r5 != r1) goto L_0x00ea
            return r4
        L_0x00ea:
            if (r6 == r12) goto L_0x00fc
            if (r6 == r11) goto L_0x00fc
            if (r6 < 0) goto L_0x00f3
            if (r6 >= r10) goto L_0x00f3
            goto L_0x0101
        L_0x00f3:
            r5 = 127(0x7f, float:1.78E-43)
            if (r5 > r6) goto L_0x00fc
            r5 = 160(0xa0, float:2.24E-43)
            if (r6 >= r5) goto L_0x00fc
            goto L_0x0101
        L_0x00fc:
            r5 = 65533(0xfffd, float:9.1831E-41)
            if (r6 != r5) goto L_0x0102
        L_0x0101:
            return r16
        L_0x0102:
            r5 = 65536(0x10000, float:9.18355E-41)
            if (r6 >= r5) goto L_0x0108
            r14 = 1
            goto L_0x0109
        L_0x0108:
            r14 = 2
        L_0x0109:
            int r4 = r4 + r14
            int r3 = r3 + 3
        L_0x010c:
            r5 = r7
            goto L_0x0008
        L_0x010f:
            if (r5 != r1) goto L_0x0112
            return r4
        L_0x0112:
            return r16
        L_0x0113:
            if (r5 != r1) goto L_0x0116
            return r4
        L_0x0116:
            return r16
        L_0x0117:
            int r9 = r6 >> 3
            if (r9 != r15) goto L_0x0195
            int r9 = r3 + 3
            if (r2 > r9) goto L_0x0123
            if (r5 != r1) goto L_0x0122
            return r4
        L_0x0122:
            return r16
        L_0x0123:
            int r14 = r3 + 1
            byte r14 = r0[r14]
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x0191
            int r15 = r3 + 2
            byte r15 = r0[r15]
            r10 = r15 & 192(0xc0, float:2.69E-43)
            if (r10 != r13) goto L_0x018d
            byte r9 = r0[r9]
            r10 = r9 & 192(0xc0, float:2.69E-43)
            if (r10 != r13) goto L_0x0189
            r10 = 3678080(0x381f80, float:5.154088E-39)
            r9 = r9 ^ r10
            int r10 = r15 << 6
            r9 = r9 ^ r10
            int r10 = r14 << 12
            r9 = r9 ^ r10
            int r6 = r6 << 18
            r6 = r6 ^ r9
            r9 = 1114111(0x10ffff, float:1.561202E-39)
            if (r6 <= r9) goto L_0x014f
            if (r5 != r1) goto L_0x014e
            return r4
        L_0x014e:
            return r16
        L_0x014f:
            if (r8 > r6) goto L_0x0157
            if (r6 >= r7) goto L_0x0157
            if (r5 != r1) goto L_0x0156
            return r4
        L_0x0156:
            return r16
        L_0x0157:
            r7 = 65536(0x10000, float:9.18355E-41)
            if (r6 >= r7) goto L_0x015f
            if (r5 != r1) goto L_0x015e
            return r4
        L_0x015e:
            return r16
        L_0x015f:
            int r7 = r5 + 1
            if (r5 != r1) goto L_0x0164
            return r4
        L_0x0164:
            if (r6 == r12) goto L_0x0178
            if (r6 == r11) goto L_0x0178
            if (r6 < 0) goto L_0x016f
            r5 = 32
            if (r6 >= r5) goto L_0x016f
            goto L_0x017d
        L_0x016f:
            r5 = 127(0x7f, float:1.78E-43)
            if (r5 > r6) goto L_0x0178
            r5 = 160(0xa0, float:2.24E-43)
            if (r6 >= r5) goto L_0x0178
            goto L_0x017d
        L_0x0178:
            r5 = 65533(0xfffd, float:9.1831E-41)
            if (r6 != r5) goto L_0x017e
        L_0x017d:
            return r16
        L_0x017e:
            r5 = 65536(0x10000, float:9.18355E-41)
            if (r6 >= r5) goto L_0x0184
            r14 = 1
            goto L_0x0185
        L_0x0184:
            r14 = 2
        L_0x0185:
            int r4 = r4 + r14
            int r3 = r3 + 4
            goto L_0x010c
        L_0x0189:
            if (r5 != r1) goto L_0x018c
            return r4
        L_0x018c:
            return r16
        L_0x018d:
            if (r5 != r1) goto L_0x0190
            return r4
        L_0x0190:
            return r16
        L_0x0191:
            if (r5 != r1) goto L_0x0194
            return r4
        L_0x0194:
            return r16
        L_0x0195:
            if (r5 != r1) goto L_0x0198
            return r4
        L_0x0198:
            return r16
        L_0x0199:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.b.c(byte[], int):int");
    }

    public static final void d(ByteString byteString, C0500b bVar, int i4, int i5) {
        o.e(byteString, "<this>");
        o.e(bVar, "buffer");
        bVar.g(byteString.getData$okio(), i4, i5);
    }

    /* access modifiers changed from: private */
    public static final int e(char c4) {
        if ('0' <= c4 && c4 < ':') {
            return c4 - '0';
        }
        if ('a' <= c4 && c4 < 'g') {
            return c4 - 'W';
        }
        if ('A' <= c4 && c4 < 'G') {
            return c4 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c4);
    }

    public static final char[] f() {
        return f13559a;
    }
}
