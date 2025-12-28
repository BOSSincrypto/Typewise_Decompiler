package com.ibm.icu.util;

import com.ibm.icu.util.CodePointMap;
import com.ibm.icu.util.CodePointTrie;
import java.util.Arrays;
import kotlin.uuid.Uuid;

public final class d extends CodePointMap implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private int[] f13307a = new int[4096];

    /* renamed from: b  reason: collision with root package name */
    private int f13308b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int[] f13309c = new int[16384];

    /* renamed from: d  reason: collision with root package name */
    private int f13310d;

    /* renamed from: e  reason: collision with root package name */
    private int f13311e = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f13312f;

    /* renamed from: g  reason: collision with root package name */
    private int f13313g;

    /* renamed from: h  reason: collision with root package name */
    private int f13314h;

    /* renamed from: i  reason: collision with root package name */
    private int f13315i;

    /* renamed from: j  reason: collision with root package name */
    private int f13316j;

    /* renamed from: k  reason: collision with root package name */
    private char[] f13317k;

    /* renamed from: l  reason: collision with root package name */
    private byte[] f13318l = new byte[69632];

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f13319a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ibm.icu.util.CodePointTrie$ValueWidth[] r0 = com.ibm.icu.util.CodePointTrie.ValueWidth.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13319a = r0
                com.ibm.icu.util.CodePointTrie$ValueWidth r1 = com.ibm.icu.util.CodePointTrie.ValueWidth.BITS_32     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13319a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ibm.icu.util.CodePointTrie$ValueWidth r1 = com.ibm.icu.util.CodePointTrie.ValueWidth.BITS_16     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13319a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ibm.icu.util.CodePointTrie$ValueWidth r1 = com.ibm.icu.util.CodePointTrie.ValueWidth.BITS_8     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.util.d.a.<clinit>():void");
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private int f13320a;

        /* renamed from: b  reason: collision with root package name */
        private int f13321b = -1;

        /* renamed from: c  reason: collision with root package name */
        private int[] f13322c = new int[32];

        /* renamed from: d  reason: collision with root package name */
        private int[] f13323d = new int[32];

        /* renamed from: e  reason: collision with root package name */
        private int[] f13324e = new int[32];

        b() {
        }

        /* access modifiers changed from: package-private */
        public void a(int i4, int i5, int i6) {
            int i7 = -1;
            int i8 = 69632;
            for (int i9 = 0; i9 < this.f13320a; i9++) {
                int i10 = this.f13324e[i9];
                if (i10 < i8) {
                    i7 = i9;
                    i8 = i10;
                }
            }
            this.f13321b = i7;
            this.f13322c[i7] = i4;
            this.f13323d[i7] = i6;
            this.f13324e[i7] = i5;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            if (this.f13320a == 0) {
                return -1;
            }
            int i4 = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < this.f13320a; i6++) {
                int i7 = this.f13324e[i6];
                if (i7 > i5) {
                    i4 = i6;
                    i5 = i7;
                }
            }
            return this.f13322c[i4];
        }

        /* access modifiers changed from: package-private */
        public int c(int i4, int i5, int i6) {
            int i7 = this.f13321b;
            if (i7 < 0 || this.f13323d[i7] != i6) {
                int i8 = 0;
                while (true) {
                    int i9 = this.f13320a;
                    if (i8 < i9) {
                        if (this.f13323d[i8] == i6) {
                            this.f13321b = i8;
                            int[] iArr = this.f13324e;
                            iArr[i8] = iArr[i8] + i5;
                            return this.f13322c[i8];
                        }
                        i8++;
                    } else if (i9 == 32) {
                        return -2;
                    } else {
                        this.f13321b = i9;
                        this.f13322c[i9] = i4;
                        this.f13323d[i9] = i6;
                        int[] iArr2 = this.f13324e;
                        this.f13320a = i9 + 1;
                        iArr2[i9] = i5;
                        return -1;
                    }
                }
            } else {
                int[] iArr3 = this.f13324e;
                iArr3[i7] = iArr3[i7] + i5;
                return this.f13322c[i7];
            }
        }
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        private int[] f13325a;

        /* renamed from: b  reason: collision with root package name */
        private int f13326b;

        /* renamed from: c  reason: collision with root package name */
        private int f13327c;

        /* renamed from: d  reason: collision with root package name */
        private int f13328d;

        /* renamed from: e  reason: collision with root package name */
        private int f13329e;

        private c() {
        }

        private void a(int[] iArr, char[] cArr, int i4, int i5, int i6) {
            int i7 = i(iArr, cArr, iArr, cArr, i4, i5);
            if (i7 < 0) {
                this.f13325a[~i7] = (i5 << this.f13327c) | (i6 + 1);
            }
        }

        private int h(int[] iArr, int i4, int i5) {
            int i6 = i5 << this.f13327c;
            int n4 = n(i5, this.f13326b - 1) + 1;
            int i7 = n4;
            while (true) {
                int i8 = this.f13325a[i7];
                if (i8 == 0) {
                    return ~i7;
                }
                int i9 = this.f13328d;
                if (((~i9) & i8) == i6 && d.k(iArr, (i8 & i9) - 1, this.f13329e, i4)) {
                    return i7;
                }
                i7 = o(n4, i7);
            }
        }

        private int i(int[] iArr, char[] cArr, int[] iArr2, char[] cArr2, int i4, int i5) {
            int i6 = i5 << this.f13327c;
            int n4 = n(i5, this.f13326b - 1) + 1;
            int i7 = n4;
            while (true) {
                int i8 = this.f13325a[i7];
                if (i8 == 0) {
                    return ~i7;
                }
                int i9 = this.f13328d;
                if (((~i9) & i8) == i6) {
                    int i10 = (i8 & i9) - 1;
                    if (iArr != null) {
                        if (d.x(iArr, i10, iArr2, i4, this.f13329e)) {
                            break;
                        }
                    } else if (iArr2 != null) {
                        if (d.w(cArr, i10, iArr2, i4, this.f13329e)) {
                            break;
                        }
                    } else if (d.v(cArr, i10, cArr2, i4, this.f13329e)) {
                        break;
                    }
                }
                i7 = o(n4, i7);
            }
            return i7;
        }

        private int k(int i4) {
            int i5 = i4;
            for (int i6 = 1; i6 < this.f13329e; i6++) {
                i5 = (i5 * 37) + i4;
            }
            return i5;
        }

        private int l(char[] cArr, int i4) {
            int i5 = this.f13329e + i4;
            int i6 = i4 + 1;
            int i7 = cArr[i4];
            while (true) {
                int i8 = i6 + 1;
                i7 = (i7 * 37) + cArr[i6];
                if (i8 >= i5) {
                    return i7;
                }
                i6 = i8;
            }
        }

        private int m(int[] iArr, int i4) {
            int i5 = this.f13329e + i4;
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            while (true) {
                int i8 = i6 + 1;
                i7 = (i7 * 37) + iArr[i6];
                if (i8 >= i5) {
                    return i7;
                }
                i6 = i8;
            }
        }

        private int n(int i4, int i5) {
            int i6 = i4 % i5;
            if (i6 < 0) {
                return i6 + i5;
            }
            return i6;
        }

        private int o(int i4, int i5) {
            return (i5 + i4) % this.f13326b;
        }

        /* access modifiers changed from: package-private */
        public void b(char[] cArr, int i4, int i5, int i6) {
            int i7 = this.f13329e;
            int i8 = i5 - i7;
            if (i8 >= i4) {
                i4 = i8 + 1;
            }
            int i9 = i6 - i7;
            while (i4 <= i9) {
                a((int[]) null, cArr, i4, l(cArr, i4), i4);
                i4++;
            }
        }

        /* access modifiers changed from: package-private */
        public void c(int[] iArr, int i4, int i5, int i6) {
            int i7 = this.f13329e;
            int i8 = i5 - i7;
            if (i8 >= i4) {
                i4 = i8 + 1;
            }
            int i9 = i6 - i7;
            while (i4 <= i9) {
                a(iArr, (char[]) null, i4, m(iArr, i4), i4);
                i4++;
            }
        }

        /* access modifiers changed from: package-private */
        public int d(int[] iArr, int i4) {
            int h4 = h(iArr, i4, k(i4));
            if (h4 >= 0) {
                return (this.f13325a[h4] & this.f13328d) - 1;
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public int e(char[] cArr, char[] cArr2, int i4) {
            int i5 = i((int[]) null, cArr, (int[]) null, cArr2, i4, l(cArr2, i4));
            if (i5 >= 0) {
                return (this.f13325a[i5] & this.f13328d) - 1;
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public int f(char[] cArr, int[] iArr, int i4) {
            int i5 = i((int[]) null, cArr, iArr, (char[]) null, i4, m(iArr, i4));
            if (i5 >= 0) {
                return (this.f13325a[i5] & this.f13328d) - 1;
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public int g(int[] iArr, int[] iArr2, int i4) {
            int i5 = i(iArr, (char[]) null, iArr2, (char[]) null, i4, m(iArr2, i4));
            if (i5 >= 0) {
                return (this.f13325a[i5] & this.f13328d) - 1;
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public void j(int i4, int i5) {
            int i6;
            int i7 = (i4 - i5) + 1;
            if (i7 <= 4095) {
                this.f13327c = 12;
                this.f13328d = 4095;
                i6 = 6007;
            } else if (i7 <= 32767) {
                this.f13327c = 15;
                this.f13328d = 32767;
                i6 = 50021;
            } else if (i7 <= 131071) {
                this.f13327c = 17;
                this.f13328d = 131071;
                i6 = 200003;
            } else {
                this.f13327c = 21;
                this.f13328d = 2097151;
                i6 = 1500007;
            }
            int[] iArr = this.f13325a;
            if (iArr == null || i6 > iArr.length) {
                this.f13325a = new int[i6];
            } else {
                Arrays.fill(iArr, 0, i6, 0);
            }
            this.f13326b = i6;
            this.f13329e = i5;
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    public d(int i4, int i5) {
        this.f13312f = i4;
        this.f13313g = i4;
        this.f13314h = i5;
        this.f13316j = i4;
    }

    private static int A(char[] cArr, int i4, int i5, char[] cArr2, int i6, int i7) {
        int i8 = i5 - i7;
        while (i4 <= i8) {
            if (v(cArr, i4, cArr2, i6, i7)) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    private static int C(int[] iArr, int i4, int i5, int i6) {
        int i7 = i4 - (i6 - 1);
        int i8 = i4;
        while (i7 < i8 && iArr[i8 - 1] == i5) {
            i8--;
        }
        return i4 - i8;
    }

    private int D(int i4) {
        if (this.f13318l[i4] == 1) {
            return this.f13307a[i4];
        }
        if (i4 < 4096) {
            int l4 = l(64);
            int i5 = i4 & -4;
            int i6 = i5 + 4;
            while (true) {
                L(l4, this.f13307a[i5]);
                this.f13318l[i5] = 1;
                int[] iArr = this.f13307a;
                int i7 = i5 + 1;
                iArr[i5] = l4;
                l4 += 16;
                if (i7 >= i6) {
                    return iArr[i4];
                }
                i5 = i7;
            }
        } else {
            int l5 = l(16);
            if (l5 < 0) {
                return l5;
            }
            L(l5, this.f13307a[i4]);
            this.f13318l[i4] = 1;
            this.f13307a[i4] = l5;
            return l5;
        }
    }

    private static int E(char[] cArr, int i4, char[] cArr2, int i5, int i6) {
        int i7 = i6 - 1;
        while (i7 > 0 && !v(cArr, i4 - i7, cArr2, i5, i7)) {
            i7--;
        }
        return i7;
    }

    private static int F(char[] cArr, int i4, int[] iArr, int i5, int i6) {
        int i7 = i6 - 1;
        while (i7 > 0 && !w(cArr, i4 - i7, iArr, i5, i7)) {
            i7--;
        }
        return i7;
    }

    private static int G(int[] iArr, int i4, int[] iArr2, int i5, int i6) {
        int i7 = i6 - 1;
        while (i7 > 0 && !x(iArr, i4 - i7, iArr2, i5, i7)) {
            i7--;
        }
        return i7;
    }

    private static boolean H(int i4, int[] iArr, int i5) {
        for (int i6 = 0; i6 < i5; i6 += 4) {
            if (iArr[i6] == i4) {
                return true;
            }
        }
        return false;
    }

    private void I(int i4) {
        this.f13313g &= i4;
        this.f13314h &= i4;
        this.f13316j &= i4;
        int i5 = this.f13315i >> 4;
        for (int i6 = 0; i6 < i5; i6++) {
            if (this.f13318l[i6] == 0) {
                int[] iArr = this.f13307a;
                iArr[i6] = iArr[i6] & i4;
            }
        }
        for (int i7 = 0; i7 < this.f13310d; i7++) {
            int[] iArr2 = this.f13309c;
            iArr2[i7] = iArr2[i7] & i4;
        }
    }

    private static final int J(int i4, int i5, int i6, CodePointMap.d dVar) {
        if (i4 == i5) {
            return i6;
        }
        if (dVar != null) {
            return dVar.a(i4);
        }
        return i4;
    }

    private void L(int i4, int i5) {
        Arrays.fill(this.f13309c, i4, i4 + 16, i5);
    }

    private void clear() {
        this.f13311e = -1;
        this.f13308b = -1;
        this.f13310d = 0;
        int i4 = this.f13312f;
        this.f13313g = i4;
        this.f13316j = i4;
        this.f13315i = 0;
        this.f13317k = null;
    }

    /* access modifiers changed from: private */
    public static boolean k(int[] iArr, int i4, int i5, int i6) {
        int i7 = i5 + i4;
        while (i4 < i7 && iArr[i4] == i6) {
            i4++;
        }
        if (i4 == i7) {
            return true;
        }
        return false;
    }

    private int l(int i4) {
        int i5 = this.f13310d;
        int i6 = i4 + i5;
        int[] iArr = this.f13309c;
        if (i6 > iArr.length) {
            int i7 = 131072;
            if (iArr.length >= 131072) {
                i7 = 1114112;
                if (iArr.length >= 1114112) {
                    throw new AssertionError();
                }
            }
            int[] iArr2 = new int[i7];
            for (int i8 = 0; i8 < this.f13310d; i8++) {
                iArr2[i8] = this.f13309c[i8];
            }
            this.f13309c = iArr2;
        }
        this.f13310d = i6;
        return i5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c1, code lost:
        if (r7[r5 - 2] == r13.f13316j) goto L_0x00fe;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.ibm.icu.util.CodePointTrie n(com.ibm.icu.util.CodePointTrie.Type r14, com.ibm.icu.util.CodePointTrie.ValueWidth r15) {
        /*
            r13 = this;
            int[] r0 = com.ibm.icu.util.d.a.f13319a
            int r1 = r15.ordinal()
            r0 = r0[r1]
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L_0x0023
            if (r0 == r2) goto L_0x001d
            if (r0 != r1) goto L_0x0017
            r0 = 255(0xff, float:3.57E-43)
            r13.I(r0)
            goto L_0x0023
        L_0x0017:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            r14.<init>()
            throw r14
        L_0x001d:
            r0 = 65535(0xffff, float:9.1834E-41)
            r13.I(r0)
        L_0x0023:
            com.ibm.icu.util.CodePointTrie$Type r0 = com.ibm.icu.util.CodePointTrie.Type.FAST
            if (r14 != r0) goto L_0x002a
            r0 = 65536(0x10000, float:9.18355E-41)
            goto L_0x002c
        L_0x002a:
            r0 = 4096(0x1000, float:5.74E-42)
        L_0x002c:
            int r4 = r0 >> 4
            int r4 = r13.s(r4)
            com.ibm.icu.util.CodePointTrie$ValueWidth r5 = com.ibm.icu.util.CodePointTrie.ValueWidth.BITS_32
            if (r15 != r5) goto L_0x0044
            r6 = r4 & 1
            if (r6 == 0) goto L_0x0044
            char[] r6 = r13.f13317k
            int r7 = r4 + 1
            r8 = 65518(0xffee, float:9.181E-41)
            r6[r4] = r8
            r4 = r7
        L_0x0044:
            int r6 = r4 * 2
            com.ibm.icu.util.CodePointTrie$ValueWidth r7 = com.ibm.icu.util.CodePointTrie.ValueWidth.BITS_16
            if (r15 != r7) goto L_0x007e
            int r5 = r13.f13310d
            r6 = r4 ^ r5
            r6 = r6 & r3
            if (r6 == 0) goto L_0x005b
            int[] r6 = r13.f13309c
            int r7 = r5 + 1
            r13.f13310d = r7
            int r7 = r13.f13314h
            r6[r5] = r7
        L_0x005b:
            int[] r5 = r13.f13309c
            int r6 = r13.f13310d
            int r7 = r6 + -1
            r7 = r5[r7]
            int r8 = r13.f13314h
            if (r7 != r8) goto L_0x006f
            int r7 = r6 + -2
            r7 = r5[r7]
            int r9 = r13.f13316j
            if (r7 == r9) goto L_0x00fe
        L_0x006f:
            int r7 = r6 + 1
            r13.f13310d = r7
            int r9 = r13.f13316j
            r5[r6] = r9
            int r6 = r6 + r2
            r13.f13310d = r6
            r5[r7] = r8
            goto L_0x00fe
        L_0x007e:
            if (r15 != r5) goto L_0x00ab
            int[] r5 = r13.f13309c
            int r6 = r13.f13310d
            int r7 = r6 + -1
            r7 = r5[r7]
            int r8 = r13.f13314h
            if (r7 != r8) goto L_0x0094
            int r7 = r6 + -2
            r7 = r5[r7]
            int r9 = r13.f13316j
            if (r7 == r9) goto L_0x00fe
        L_0x0094:
            int r7 = r6 + -1
            r7 = r5[r7]
            int r9 = r13.f13316j
            if (r7 == r9) goto L_0x00a2
            int r7 = r6 + 1
            r13.f13310d = r7
            r5[r6] = r9
        L_0x00a2:
            int r6 = r13.f13310d
            int r7 = r6 + 1
            r13.f13310d = r7
            r5[r6] = r8
            goto L_0x00fe
        L_0x00ab:
            int r5 = r13.f13310d
            int r6 = r6 + r5
            r6 = r6 & r1
            if (r6 != 0) goto L_0x00c4
            int[] r7 = r13.f13309c
            int r8 = r5 + -1
            r8 = r7[r8]
            int r9 = r13.f13314h
            if (r8 != r9) goto L_0x00c4
            int r8 = r5 + -2
            r7 = r7[r8]
            int r8 = r13.f13316j
            if (r7 != r8) goto L_0x00c4
            goto L_0x00fe
        L_0x00c4:
            if (r6 != r1) goto L_0x00d9
            int[] r7 = r13.f13309c
            int r8 = r5 + -1
            r8 = r7[r8]
            int r9 = r13.f13316j
            if (r8 != r9) goto L_0x00d9
            int r6 = r5 + 1
            r13.f13310d = r6
            int r6 = r13.f13314h
            r7[r5] = r6
            goto L_0x00fe
        L_0x00d9:
            if (r6 == r2) goto L_0x00eb
            int[] r5 = r13.f13309c
            int r7 = r13.f13310d
            int r8 = r7 + 1
            r13.f13310d = r8
            int r8 = r13.f13316j
            r5[r7] = r8
            int r6 = r6 + 1
            r6 = r6 & r1
            goto L_0x00d9
        L_0x00eb:
            int[] r5 = r13.f13309c
            int r6 = r13.f13310d
            int r7 = r6 + 1
            r13.f13310d = r7
            int r8 = r13.f13316j
            r5[r6] = r8
            int r6 = r6 + r2
            r13.f13310d = r6
            int r6 = r13.f13314h
            r5[r7] = r6
        L_0x00fe:
            int r5 = r13.f13315i
            r6 = 0
            if (r5 > r0) goto L_0x0117
            char[] r0 = new char[r4]
            r5 = r6
            r7 = r5
        L_0x0107:
            if (r5 >= r4) goto L_0x0115
            int[] r8 = r13.f13307a
            r8 = r8[r7]
            char r8 = (char) r8
            r0[r5] = r8
            int r7 = r7 + 4
            int r5 = r5 + 1
            goto L_0x0107
        L_0x0115:
            r8 = r0
            goto L_0x0125
        L_0x0117:
            char[] r0 = r13.f13317k
            int r5 = r0.length
            if (r4 != r5) goto L_0x0120
            r4 = 0
            r13.f13317k = r4
            goto L_0x0115
        L_0x0120:
            char[] r0 = java.util.Arrays.copyOf(r0, r4)
            goto L_0x0115
        L_0x0125:
            int[] r0 = com.ibm.icu.util.d.a.f13319a
            int r15 = r15.ordinal()
            r15 = r0[r15]
            if (r15 == r3) goto L_0x0199
            if (r15 == r2) goto L_0x0169
            if (r15 != r1) goto L_0x0163
            int r15 = r13.f13310d
            byte[] r9 = new byte[r15]
        L_0x0137:
            int r15 = r13.f13310d
            if (r6 >= r15) goto L_0x0145
            int[] r15 = r13.f13309c
            r15 = r15[r6]
            byte r15 = (byte) r15
            r9[r6] = r15
            int r6 = r6 + 1
            goto L_0x0137
        L_0x0145:
            com.ibm.icu.util.CodePointTrie$Type r15 = com.ibm.icu.util.CodePointTrie.Type.FAST
            if (r14 != r15) goto L_0x0156
            com.ibm.icu.util.CodePointTrie$h r14 = new com.ibm.icu.util.CodePointTrie$h
            int r10 = r13.f13315i
            int r11 = r13.f13308b
            int r12 = r13.f13311e
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x0162
        L_0x0156:
            com.ibm.icu.util.CodePointTrie$l r14 = new com.ibm.icu.util.CodePointTrie$l
            int r10 = r13.f13315i
            int r11 = r13.f13308b
            int r12 = r13.f13311e
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12)
        L_0x0162:
            return r14
        L_0x0163:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            r14.<init>()
            throw r14
        L_0x0169:
            int r15 = r13.f13310d
            char[] r9 = new char[r15]
        L_0x016d:
            int r15 = r13.f13310d
            if (r6 >= r15) goto L_0x017b
            int[] r15 = r13.f13309c
            r15 = r15[r6]
            char r15 = (char) r15
            r9[r6] = r15
            int r6 = r6 + 1
            goto L_0x016d
        L_0x017b:
            com.ibm.icu.util.CodePointTrie$Type r15 = com.ibm.icu.util.CodePointTrie.Type.FAST
            if (r14 != r15) goto L_0x018c
            com.ibm.icu.util.CodePointTrie$f r14 = new com.ibm.icu.util.CodePointTrie$f
            int r10 = r13.f13315i
            int r11 = r13.f13308b
            int r12 = r13.f13311e
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x0198
        L_0x018c:
            com.ibm.icu.util.CodePointTrie$j r14 = new com.ibm.icu.util.CodePointTrie$j
            int r10 = r13.f13315i
            int r11 = r13.f13308b
            int r12 = r13.f13311e
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12)
        L_0x0198:
            return r14
        L_0x0199:
            int[] r15 = r13.f13309c
            int r0 = r13.f13310d
            int[] r9 = java.util.Arrays.copyOf(r15, r0)
            com.ibm.icu.util.CodePointTrie$Type r15 = com.ibm.icu.util.CodePointTrie.Type.FAST
            if (r14 != r15) goto L_0x01b2
            com.ibm.icu.util.CodePointTrie$g r14 = new com.ibm.icu.util.CodePointTrie$g
            int r10 = r13.f13315i
            int r11 = r13.f13308b
            int r12 = r13.f13311e
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x01be
        L_0x01b2:
            com.ibm.icu.util.CodePointTrie$k r14 = new com.ibm.icu.util.CodePointTrie$k
            int r10 = r13.f13315i
            int r11 = r13.f13308b
            int r12 = r13.f13311e
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12)
        L_0x01be:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.util.d.n(com.ibm.icu.util.CodePointTrie$Type, com.ibm.icu.util.CodePointTrie$ValueWidth):com.ibm.icu.util.CodePointTrie");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int q(int r18, int[] r19, int r20, com.ibm.icu.util.d.c r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            r4 = 0
            r5 = r4
            r6 = r5
        L_0x000b:
            r7 = 128(0x80, float:1.794E-43)
            r8 = 4
            if (r5 >= r7) goto L_0x0018
            int[] r7 = r0.f13307a
            r7[r6] = r5
            int r5 = r5 + 64
            int r6 = r6 + r8
            goto L_0x000b
        L_0x0018:
            int r6 = r2.length
            r7 = 64
            r3.j(r6, r7)
            r3.c(r2, r4, r4, r5)
            int r6 = r0.f13315i
            int r6 = r6 >> r8
            r9 = 8
            r10 = r4
        L_0x0027:
            if (r9 >= r6) goto L_0x00c3
            r11 = 1
            if (r9 != r1) goto L_0x0038
            int r7 = r2.length
            r8 = 16
            r3.j(r7, r8)
            r3.c(r2, r4, r4, r5)
            r10 = r5
            r7 = r8
            r8 = r11
        L_0x0038:
            byte[] r12 = r0.f13318l
            byte r12 = r12[r9]
            if (r12 != 0) goto L_0x0080
            int[] r11 = r0.f13307a
            r11 = r11[r9]
            int r12 = r3.d(r2, r11)
        L_0x0046:
            r13 = r20
            if (r12 < 0) goto L_0x005f
            if (r9 != r13) goto L_0x005f
            if (r9 < r1) goto L_0x005f
            if (r12 >= r10) goto L_0x005f
            int[] r14 = r0.f13307a
            boolean r14 = H(r12, r14, r1)
            if (r14 == 0) goto L_0x005f
            int r12 = r12 + 1
            int r12 = y(r2, r12, r5, r11, r7)
            goto L_0x0046
        L_0x005f:
            if (r12 < 0) goto L_0x0066
            int[] r11 = r0.f13307a
            r11[r9] = r12
            goto L_0x00c0
        L_0x0066:
            int r12 = C(r2, r5, r11, r7)
            int[] r14 = r0.f13307a
            int r15 = r5 - r12
            r14[r9] = r15
            r14 = r5
        L_0x0071:
            if (r12 >= r7) goto L_0x007b
            int r15 = r14 + 1
            r2[r14] = r11
            int r12 = r12 + 1
            r14 = r15
            goto L_0x0071
        L_0x007b:
            r3.c(r2, r4, r5, r14)
        L_0x007e:
            r5 = r14
            goto L_0x00c0
        L_0x0080:
            r13 = r20
            if (r12 != r11) goto L_0x00b8
            int[] r11 = r0.f13307a
            r11 = r11[r9]
            int[] r12 = r0.f13309c
            int r12 = r3.g(r2, r12, r11)
            if (r12 < 0) goto L_0x0095
            int[] r11 = r0.f13307a
            r11[r9] = r12
            goto L_0x00c0
        L_0x0095:
            int[] r12 = r0.f13309c
            int r12 = G(r2, r5, r12, r11, r7)
            int[] r14 = r0.f13307a
            int r15 = r5 - r12
            r14[r9] = r15
            r14 = r5
        L_0x00a2:
            if (r12 >= r7) goto L_0x00b4
            int r15 = r14 + 1
            int[] r4 = r0.f13309c
            int r16 = r12 + 1
            int r12 = r12 + r11
            r4 = r4[r12]
            r2[r14] = r4
            r14 = r15
            r12 = r16
            r4 = 0
            goto L_0x00a2
        L_0x00b4:
            r3.c(r2, r4, r5, r14)
            goto L_0x007e
        L_0x00b8:
            int[] r11 = r0.f13307a
            r12 = r11[r9]
            r12 = r11[r12]
            r11[r9] = r12
        L_0x00c0:
            int r9 = r9 + r8
            goto L_0x0027
        L_0x00c3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.util.d.q(int, int[], int, com.ibm.icu.util.d$c):int");
    }

    private int r(int i4, c cVar) {
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        char[] cArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        byte b4;
        int[] iArr;
        int i18;
        int i19;
        int i20 = i4;
        c cVar2 = cVar;
        int i21 = i20 >> 2;
        if ((this.f13315i >> 6) <= i21) {
            this.f13308b = 32767;
            return i21;
        }
        char[] cArr2 = new char[i21];
        int i22 = 0;
        int i23 = -1;
        int i24 = 0;
        int i25 = 0;
        while (true) {
            z3 = true;
            if (i24 >= i20) {
                break;
            }
            int i26 = this.f13307a[i24];
            cArr2[i25] = (char) i26;
            if (i26 != this.f13311e) {
                i23 = -1;
            } else if (i23 < 0) {
                i23 = i25;
            } else if (this.f13308b < 0 && (i25 - i23) + 1 == 32) {
                this.f13308b = i23;
            }
            int i27 = i24 + 4;
            while (true) {
                i24++;
                if (i24 >= i27) {
                    break;
                }
                i26 += 16;
                this.f13307a[i24] = i26;
            }
            i25++;
        }
        cVar2.j(i21, 32);
        cVar2.b(cArr2, 0, 0, i21);
        int i28 = this.f13308b;
        int i29 = 4096;
        if (i20 < 4096) {
            i29 = 0;
        }
        int i30 = this.f13315i >> 4;
        int i31 = 0;
        boolean z4 = false;
        int i32 = i29;
        while (i32 < i30) {
            int i33 = i32 + 32;
            int i34 = 0;
            int i35 = i32;
            boolean z5 = z3;
            while (true) {
                iArr = this.f13307a;
                int i36 = iArr[i35];
                i18 = i34 | i36;
                if (i36 != this.f13311e) {
                    z5 = false;
                }
                i19 = i35 + 1;
                if (i19 >= i33) {
                    break;
                }
                i35 = i19;
                i34 = i18;
            }
            if (z5) {
                this.f13318l[i32] = 0;
                if (i28 < 0) {
                    if (i18 <= 65535) {
                        i31 += 32;
                    } else {
                        i31 += 36;
                        z4 = true;
                    }
                    i28 = 0;
                }
            } else if (i18 <= 65535) {
                int f4 = cVar2.f(cArr2, iArr, i32);
                if (f4 >= 0) {
                    this.f13318l[i32] = 1;
                    this.f13307a[i32] = f4;
                } else {
                    this.f13318l[i32] = 2;
                    i31 += 32;
                }
            } else {
                this.f13318l[i32] = 3;
                i31 += 36;
                z4 = true;
            }
            i32 = i19;
            z3 = true;
        }
        byte b5 = 3;
        int i37 = (i30 - i29) >> 5;
        int i38 = ((i37 + 31) >> 5) + i21;
        int i39 = i31 + i38 + i37 + 1;
        this.f13317k = Arrays.copyOf(cArr2, i39);
        cVar2.j(i39, 32);
        c cVar3 = null;
        int i40 = 36;
        if (z4) {
            c cVar4 = new c((a) null);
            cVar4.j(i39, 36);
            cVar3 = cVar4;
        }
        char[] cArr3 = new char[i37];
        int i41 = this.f13308b;
        int i42 = i38;
        int i43 = 0;
        while (i29 < i30) {
            byte b6 = this.f13318l[i29];
            if (b6 == 0 && i41 < 0) {
                if (this.f13311e <= 65535) {
                    b4 = 2;
                } else {
                    b4 = b5;
                }
                b6 = b4;
                i41 = i22;
            }
            if (b6 == 0) {
                i10 = this.f13308b;
            } else if (b6 == 1) {
                i10 = this.f13307a[i29];
            } else if (b6 == 2) {
                int f5 = cVar2.f(this.f13317k, this.f13307a, i29);
                if (f5 >= 0) {
                    i9 = i30;
                    i17 = f5;
                } else {
                    if (i42 == i38) {
                        i16 = 0;
                        i15 = 32;
                    } else {
                        i15 = 32;
                        i16 = F(this.f13317k, i42, this.f13307a, i29, 32);
                    }
                    i17 = i42 - i16;
                    int i44 = i42;
                    while (i16 < i15) {
                        this.f13317k[i44] = (char) this.f13307a[i16 + i29];
                        i44++;
                        i30 = i30;
                        i16++;
                        i15 = 32;
                    }
                    i9 = i30;
                    cVar2.b(this.f13317k, i38, i42, i44);
                    if (z4) {
                        cVar3.b(this.f13317k, i38, i42, i44);
                    }
                    i42 = i44;
                }
                i8 = i21;
                i7 = i29;
                i11 = 36;
                if (this.f13308b < 0 && i41 >= 0) {
                    this.f13308b = i10;
                }
                cArr3[i43] = (char) i10;
                i29 = i7 + 32;
                i43++;
                i40 = i11;
                i30 = i9;
                i21 = i8;
                i22 = 0;
                b5 = 3;
            } else {
                i9 = i30;
                int i45 = i29 + 32;
                int i46 = i29;
                int i47 = i42;
                while (true) {
                    int[] iArr2 = this.f13307a;
                    i8 = i21;
                    int i48 = iArr2[i46];
                    i7 = i29;
                    cArr = this.f13317k;
                    cArr[i47 + 1] = (char) i48;
                    int i49 = iArr2[i46 + 1];
                    int i50 = ((i48 & 196608) >> 2) | ((i49 & 196608) >> 4);
                    cArr[i47 + 2] = (char) i49;
                    int i51 = iArr2[i46 + 2];
                    cArr[i47 + 3] = (char) i51;
                    int i52 = iArr2[i46 + 3];
                    cArr[i47 + 4] = (char) i52;
                    int i53 = iArr2[i46 + 4];
                    cArr[i47 + 5] = (char) i53;
                    int i54 = iArr2[i46 + 5];
                    int i55 = i50 | ((i51 & 196608) >> 6) | ((i52 & 196608) >> 8) | ((i53 & 196608) >> 10) | ((i54 & 196608) >> 12);
                    cArr[i47 + 6] = (char) i54;
                    int i56 = i46 + 7;
                    int i57 = iArr2[i46 + 6];
                    int i58 = i55 | ((i57 & 196608) >> 14);
                    cArr[i47 + 7] = (char) i57;
                    i46 += 8;
                    int i59 = iArr2[i56];
                    int i60 = i47 + 9;
                    cArr[i47 + 8] = (char) i59;
                    cArr[i47] = (char) (i58 | ((i59 & 196608) >> 16));
                    if (i46 >= i45) {
                        break;
                    }
                    i47 = i60;
                    i21 = i8;
                    i29 = i7;
                }
                int e4 = cVar3.e(cArr, cArr, i42);
                if (e4 >= 0) {
                    i10 = e4 | 32768;
                    i11 = 36;
                } else {
                    if (i42 == i38) {
                        i12 = 0;
                        i14 = 36;
                    } else {
                        char[] cArr4 = this.f13317k;
                        i14 = 36;
                        i12 = E(cArr4, i42, cArr4, i42, 36);
                    }
                    i10 = (i42 - i12) | 32768;
                    if (i12 > 0) {
                        i13 = i42;
                        while (i12 < i11) {
                            char[] cArr5 = this.f13317k;
                            cArr5[i13] = cArr5[i12 + i42];
                            i13++;
                            i12++;
                        }
                    } else {
                        i13 = i42 + 36;
                    }
                    cVar2.b(this.f13317k, i38, i42, i13);
                    if (z4) {
                        cVar3.b(this.f13317k, i38, i42, i13);
                    }
                    i42 = i13;
                }
                this.f13308b = i10;
                cArr3[i43] = (char) i10;
                i29 = i7 + 32;
                i43++;
                i40 = i11;
                i30 = i9;
                i21 = i8;
                i22 = 0;
                b5 = 3;
            }
            i9 = i30;
            i8 = i21;
            i7 = i29;
            i11 = i40;
            this.f13308b = i10;
            cArr3[i43] = (char) i10;
            i29 = i7 + 32;
            i43++;
            i40 = i11;
            i30 = i9;
            i21 = i8;
            i22 = 0;
            b5 = 3;
        }
        int i61 = i21;
        if (this.f13308b < 0) {
            this.f13308b = 32767;
        }
        if (i42 < 32799) {
            int i62 = i61;
            int i63 = 32;
            int i64 = 0;
            while (i64 < i43) {
                int i65 = i43 - i64;
                if (i65 >= i63) {
                    i5 = cVar2.e(this.f13317k, cArr3, i64);
                } else {
                    int i66 = i65;
                    i5 = A(this.f13317k, i38, i42, cArr3, i64, i65);
                    i63 = i66;
                }
                if (i5 < 0) {
                    if (i42 == i38) {
                        i6 = 0;
                    } else {
                        i6 = E(this.f13317k, i42, cArr3, i64, i63);
                    }
                    int i67 = i42 - i6;
                    int i68 = i42;
                    while (i6 < i63) {
                        this.f13317k[i68] = cArr3[i6 + i64];
                        i68++;
                        i6++;
                    }
                    cVar2.b(this.f13317k, i38, i42, i68);
                    i5 = i67;
                    i42 = i68;
                }
                this.f13317k[i62] = (char) i5;
                i64 += i63;
                i62++;
            }
            return i42;
        }
        throw new IndexOutOfBoundsException("The trie data exceeds limitations of the data structure.");
    }

    private int s(int i4) {
        this.f13316j = B(1114111);
        int z3 = (z() + 511) & -512;
        if (z3 == 1114112) {
            this.f13316j = this.f13313g;
        }
        int i5 = i4 << 4;
        if (z3 < i5) {
            for (int i6 = z3 >> 4; i6 < i4; i6++) {
                this.f13318l[i6] = 0;
                this.f13307a[i6] = this.f13316j;
            }
            this.f13315i = i5;
        } else {
            this.f13315i = z3;
        }
        int[] iArr = new int[Uuid.SIZE_BITS];
        for (int i7 = 0; i7 < 128; i7++) {
            iArr[i7] = B(i7);
        }
        b bVar = new b();
        int[] copyOf = Arrays.copyOf(iArr, t(i4, bVar));
        int b4 = bVar.b();
        c cVar = new c((a) null);
        int q4 = q(i4, copyOf, b4, cVar);
        this.f13309c = copyOf;
        this.f13310d = q4;
        if (q4 <= 262159) {
            if (b4 >= 0) {
                int i8 = this.f13307a[b4];
                this.f13311e = i8;
                this.f13313g = copyOf[i8];
            } else {
                this.f13311e = 1048575;
            }
            int r4 = r(i4, cVar);
            this.f13315i = z3;
            return r4;
        }
        throw new IndexOutOfBoundsException("The trie data exceeds limitations of the data structure.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int t(int r14, com.ibm.icu.util.d.b r15) {
        /*
            r13 = this;
            int r0 = r13.f13315i
            r1 = 4
            int r0 = r0 >> r1
            r2 = 148(0x94, float:2.07E-43)
            r3 = 64
            r4 = 0
            r6 = r1
            r5 = r4
        L_0x000b:
            if (r5 >= r0) goto L_0x0083
            r7 = 1
            if (r5 != r14) goto L_0x0013
            r3 = 16
            r6 = r7
        L_0x0013:
            int[] r8 = r13.f13307a
            r8 = r8[r5]
            byte[] r9 = r13.f13318l
            byte r9 = r9[r5]
            if (r9 != r7) goto L_0x0037
            int[] r9 = r13.f13309c
            r10 = r9[r8]
            int r8 = r8 + 1
            int r11 = r3 + -1
            boolean r8 = k(r9, r8, r11, r10)
            if (r8 == 0) goto L_0x0035
            byte[] r8 = r13.f13318l
            r8[r5] = r4
            int[] r8 = r13.f13307a
            r8[r5] = r10
            r8 = r10
            goto L_0x0050
        L_0x0035:
            int r2 = r2 + r3
            goto L_0x0081
        L_0x0037:
            if (r6 <= r7) goto L_0x0050
            int r9 = r5 + r6
            int r10 = r5 + 1
        L_0x003d:
            if (r10 >= r9) goto L_0x0050
            int[] r11 = r13.f13307a
            r11 = r11[r10]
            if (r11 == r8) goto L_0x004d
            int r7 = r13.D(r5)
            if (r7 >= 0) goto L_0x0035
            r14 = -1
            return r14
        L_0x004d:
            int r10 = r10 + 1
            goto L_0x003d
        L_0x0050:
            int r9 = r15.c(r5, r6, r8)
            r10 = -2
            if (r9 != r10) goto L_0x0076
            r11 = r1
            r10 = r4
        L_0x0059:
            if (r10 != r5) goto L_0x005f
            r15.a(r5, r6, r8)
            goto L_0x0076
        L_0x005f:
            if (r10 != r14) goto L_0x0062
            r11 = r7
        L_0x0062:
            byte[] r12 = r13.f13318l
            byte r12 = r12[r10]
            if (r12 != 0) goto L_0x0074
            int[] r12 = r13.f13307a
            r12 = r12[r10]
            if (r12 != r8) goto L_0x0074
            int r11 = r11 + r6
            r15.a(r10, r11, r8)
            r9 = r10
            goto L_0x0076
        L_0x0074:
            int r10 = r10 + r11
            goto L_0x0059
        L_0x0076:
            if (r9 < 0) goto L_0x0035
            byte[] r7 = r13.f13318l
            r8 = 2
            r7[r5] = r8
            int[] r7 = r13.f13307a
            r7[r5] = r9
        L_0x0081:
            int r5 = r5 + r6
            goto L_0x000b
        L_0x0083:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.util.d.t(int, com.ibm.icu.util.d$b):int");
    }

    private void u(int i4) {
        int i5 = this.f13315i;
        if (i4 >= i5) {
            int i6 = (i4 + 512) & -512;
            int i7 = i5 >> 4;
            int i8 = i6 >> 4;
            if (i8 > this.f13307a.length) {
                int[] iArr = new int[69632];
                for (int i9 = 0; i9 < i7; i9++) {
                    iArr[i9] = this.f13307a[i9];
                }
                this.f13307a = iArr;
            }
            do {
                this.f13318l[i7] = 0;
                this.f13307a[i7] = this.f13313g;
                i7++;
            } while (i7 < i8);
            this.f13315i = i6;
        }
    }

    /* access modifiers changed from: private */
    public static boolean v(char[] cArr, int i4, char[] cArr2, int i5, int i6) {
        while (i6 > 0 && cArr[i4] == cArr2[i5]) {
            i4++;
            i5++;
            i6--;
        }
        if (i6 == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static boolean w(char[] cArr, int i4, int[] iArr, int i5, int i6) {
        while (i6 > 0 && cArr[i4] == iArr[i5]) {
            i4++;
            i5++;
            i6--;
        }
        if (i6 == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static boolean x(int[] iArr, int i4, int[] iArr2, int i5, int i6) {
        while (i6 > 0 && iArr[i4] == iArr2[i5]) {
            i4++;
            i5++;
            i6--;
        }
        if (i6 == 0) {
            return true;
        }
        return false;
    }

    private static int y(int[] iArr, int i4, int i5, int i6, int i7) {
        int i8 = i5 - i7;
        while (i4 <= i8) {
            if (iArr[i4] == i6) {
                int i9 = 1;
                while (i9 != i7) {
                    int i10 = i4 + i9;
                    if (iArr[i10] != i6) {
                        i4 = i10;
                    } else {
                        i9++;
                    }
                }
                return i4;
            }
            i4++;
        }
        return -1;
    }

    private int z() {
        int i4 = this.f13315i >> 4;
        loop0:
        while (true) {
            if (i4 <= 0) {
                return 0;
            }
            int i5 = i4 - 1;
            if (this.f13318l[i5] == 0) {
                if (this.f13307a[i5] != this.f13316j) {
                    break;
                }
            } else {
                int i6 = this.f13307a[i5];
                for (int i7 = 0; i7 != 16; i7++) {
                    if (this.f13309c[i6 + i7] != this.f13316j) {
                        break loop0;
                    }
                }
                continue;
            }
            i4 = i5;
        }
        return i4 << 4;
    }

    public int B(int i4) {
        if (i4 < 0 || 1114111 < i4) {
            return this.f13314h;
        }
        if (i4 >= this.f13315i) {
            return this.f13316j;
        }
        int i5 = i4 >> 4;
        if (this.f13318l[i5] == 0) {
            return this.f13307a[i5];
        }
        return this.f13309c[this.f13307a[i5] + (i4 & 15)];
    }

    public void K(int i4, int i5) {
        if (i4 < 0 || 1114111 < i4) {
            throw new IllegalArgumentException("invalid code point");
        }
        u(i4);
        this.f13309c[D(i4 >> 4) + (i4 & 15)] = i5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00a0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c(int r12, com.ibm.icu.util.CodePointMap.d r13, com.ibm.icu.util.CodePointMap.b r14) {
        /*
            r11 = this;
            r0 = 0
            if (r12 < 0) goto L_0x00ba
            r1 = 1114111(0x10ffff, float:1.561202E-39)
            if (r1 >= r12) goto L_0x000a
            goto L_0x00ba
        L_0x000a:
            int r2 = r11.f13315i
            r3 = 1
            if (r12 < r2) goto L_0x001b
            int r0 = r11.f13316j
            if (r13 == 0) goto L_0x0017
            int r0 = r13.a(r0)
        L_0x0017:
            r14.h(r12, r1, r0)
            return r3
        L_0x001b:
            int r2 = r11.f13313g
            if (r13 == 0) goto L_0x0023
            int r2 = r13.a(r2)
        L_0x0023:
            int r4 = r12 >> 4
            r7 = r12
            r5 = r0
            r6 = r4
            r4 = r5
        L_0x0029:
            byte[] r8 = r11.f13318l
            byte r8 = r8[r6]
            if (r8 != 0) goto L_0x0056
            int[] r8 = r11.f13307a
            r8 = r8[r6]
            if (r0 == 0) goto L_0x0049
            if (r8 == r4) goto L_0x0051
            if (r13 == 0) goto L_0x0044
            int r4 = r11.f13313g
            int r4 = J(r8, r4, r2, r13)
            if (r4 == r5) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r4 = r8
            goto L_0x0051
        L_0x0044:
            int r7 = r7 - r3
            r14.h(r12, r7, r5)
            return r3
        L_0x0049:
            int r0 = r11.f13313g
            int r5 = J(r8, r0, r2, r13)
            r0 = r3
            goto L_0x0042
        L_0x0051:
            int r7 = r7 + 16
            r7 = r7 & -16
            goto L_0x00a1
        L_0x0056:
            int[] r8 = r11.f13307a
            r8 = r8[r6]
            r9 = r7 & 15
            int r8 = r8 + r9
            int[] r9 = r11.f13309c
            r9 = r9[r8]
            if (r0 == 0) goto L_0x0077
            if (r9 == r4) goto L_0x007f
            if (r13 == 0) goto L_0x0072
            int r4 = r11.f13313g
            int r4 = J(r9, r4, r2, r13)
            if (r4 == r5) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r4 = r9
            goto L_0x007f
        L_0x0072:
            int r7 = r7 - r3
            r14.h(r12, r7, r5)
            return r3
        L_0x0077:
            int r0 = r11.f13313g
            int r5 = J(r9, r0, r2, r13)
            r0 = r3
            goto L_0x0070
        L_0x007f:
            int r9 = r7 + 1
            r10 = r9 & 15
            if (r10 == 0) goto L_0x00a0
            int[] r10 = r11.f13309c
            int r8 = r8 + r3
            r10 = r10[r8]
            if (r10 == r4) goto L_0x009e
            if (r13 == 0) goto L_0x009a
            int r4 = r11.f13313g
            int r4 = J(r10, r4, r2, r13)
            if (r4 == r5) goto L_0x0097
            goto L_0x009a
        L_0x0097:
            r7 = r9
            r4 = r10
            goto L_0x007f
        L_0x009a:
            r14.h(r12, r7, r5)
            return r3
        L_0x009e:
            r7 = r9
            goto L_0x007f
        L_0x00a0:
            r7 = r9
        L_0x00a1:
            int r6 = r6 + 1
            int r8 = r11.f13315i
            if (r7 < r8) goto L_0x0029
            int r0 = r11.f13316j
            int r4 = r11.f13313g
            int r13 = J(r0, r4, r2, r13)
            if (r13 == r5) goto L_0x00b6
            int r7 = r7 - r3
            r14.h(r12, r7, r5)
            goto L_0x00b9
        L_0x00b6:
            r14.h(r12, r1, r5)
        L_0x00b9:
            return r3
        L_0x00ba:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.util.d.c(int, com.ibm.icu.util.CodePointMap$d, com.ibm.icu.util.CodePointMap$b):boolean");
    }

    public CodePointTrie o(CodePointTrie.Type type, CodePointTrie.ValueWidth valueWidth) {
        if (type == null || valueWidth == null) {
            throw new IllegalArgumentException("The type and valueWidth must be specified.");
        }
        try {
            return n(type, valueWidth);
        } finally {
            clear();
        }
    }

    /* renamed from: p */
    public d clone() {
        int i4;
        try {
            d dVar = (d) super.clone();
            int i5 = this.f13315i;
            if (i5 <= 65536) {
                i4 = 4096;
            } else {
                i4 = 69632;
            }
            dVar.f13307a = new int[i4];
            dVar.f13318l = new byte[69632];
            int i6 = i5 >> 4;
            for (int i7 = 0; i7 < i6; i7++) {
                dVar.f13307a[i7] = this.f13307a[i7];
                dVar.f13318l[i7] = this.f13318l[i7];
            }
            dVar.f13308b = this.f13308b;
            dVar.f13309c = (int[]) this.f13309c.clone();
            dVar.f13310d = this.f13310d;
            dVar.f13311e = this.f13311e;
            dVar.f13312f = this.f13312f;
            dVar.f13313g = this.f13313g;
            dVar.f13314h = this.f13314h;
            dVar.f13315i = this.f13315i;
            dVar.f13316j = this.f13316j;
            return dVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }
}
