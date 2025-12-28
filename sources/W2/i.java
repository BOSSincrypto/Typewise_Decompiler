package W2;

import c3.c;
import c3.d;
import kotlin.collections.C0713h;
import kotlin.jvm.internal.o;
import okio.ByteString;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f1893a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f1894b = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f1895c;

    /* renamed from: d  reason: collision with root package name */
    private static final a f1896d = new a();

    static {
        byte[] bArr = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
        f1895c = bArr;
        int length = bArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            f1893a.a(i4, f1894b[i4], f1895c[i4]);
        }
    }

    private i() {
    }

    private final void a(int i4, int i5, int i6) {
        a aVar = new a(i4, i6);
        a aVar2 = f1896d;
        while (i6 > 8) {
            i6 -= 8;
            int i7 = (i5 >>> i6) & 255;
            a[] a4 = aVar2.a();
            o.b(a4);
            a aVar3 = a4[i7];
            if (aVar3 == null) {
                aVar3 = new a();
                a4[i7] = aVar3;
            }
            aVar2 = aVar3;
        }
        int i8 = 8 - i6;
        int i9 = (i5 << i8) & 255;
        a[] a5 = aVar2.a();
        o.b(a5);
        C0713h.j(a5, aVar, i9, (1 << i8) + i9);
    }

    public final void b(d dVar, long j4, c cVar) {
        o.e(dVar, "source");
        o.e(cVar, "sink");
        a aVar = f1896d;
        int i4 = 0;
        long j5 = 0;
        int i5 = 0;
        while (j5 < j4) {
            j5++;
            i4 = (i4 << 8) | Q2.d.d(dVar.readByte(), 255);
            i5 += 8;
            while (i5 >= 8) {
                a[] a4 = aVar.a();
                o.b(a4);
                aVar = a4[(i4 >>> (i5 - 8)) & 255];
                o.b(aVar);
                if (aVar.a() == null) {
                    cVar.I(aVar.b());
                    i5 -= aVar.c();
                    aVar = f1896d;
                } else {
                    i5 -= 8;
                }
            }
        }
        while (i5 > 0) {
            a[] a5 = aVar.a();
            o.b(a5);
            a aVar2 = a5[(i4 << (8 - i5)) & 255];
            o.b(aVar2);
            if (aVar2.a() == null && aVar2.c() <= i5) {
                cVar.I(aVar2.b());
                i5 -= aVar2.c();
                aVar = f1896d;
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(okio.ByteString r9, c3.c r10) {
        /*
            r8 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.o.e(r9, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.o.e(r10, r0)
            int r0 = r9.size()
            r1 = 0
            r3 = 0
            r4 = r3
        L_0x0012:
            if (r3 >= r0) goto L_0x003b
            int r5 = r3 + 1
            byte r3 = r9.getByte(r3)
            r6 = 255(0xff, float:3.57E-43)
            int r3 = Q2.d.d(r3, r6)
            int[] r6 = f1894b
            r6 = r6[r3]
            byte[] r7 = f1895c
            byte r3 = r7[r3]
            long r1 = r1 << r3
            long r6 = (long) r6
            long r1 = r1 | r6
            int r4 = r4 + r3
        L_0x002c:
            r3 = 8
            if (r4 < r3) goto L_0x0039
            int r4 = r4 + -8
            long r6 = r1 >> r4
            int r3 = (int) r6
            r10.I(r3)
            goto L_0x002c
        L_0x0039:
            r3 = r5
            goto L_0x0012
        L_0x003b:
            if (r4 <= 0) goto L_0x0049
            int r9 = 8 - r4
            long r0 = r1 << r9
            r2 = 255(0xff, double:1.26E-321)
            long r2 = r2 >>> r4
            long r0 = r0 | r2
            int r9 = (int) r0
            r10.I(r9)
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W2.i.c(okio.ByteString, c3.c):void");
    }

    public final int d(ByteString byteString) {
        o.e(byteString, "bytes");
        int size = byteString.size();
        long j4 = 0;
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 1;
            j4 += (long) f1895c[Q2.d.d(byteString.getByte(i4), 255)];
            i4 = i5;
        }
        return (int) ((j4 + ((long) 7)) >> 3);
    }

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final a[] f1897a;

        /* renamed from: b  reason: collision with root package name */
        private final int f1898b;

        /* renamed from: c  reason: collision with root package name */
        private final int f1899c;

        public a() {
            this.f1897a = new a[256];
            this.f1898b = 0;
            this.f1899c = 0;
        }

        public final a[] a() {
            return this.f1897a;
        }

        public final int b() {
            return this.f1898b;
        }

        public final int c() {
            return this.f1899c;
        }

        public a(int i4, int i5) {
            this.f1897a = null;
            this.f1898b = i4;
            int i6 = i5 & 7;
            this.f1899c = i6 == 0 ? 8 : i6;
        }
    }
}
