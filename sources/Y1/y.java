package Y1;

import a2.j;
import com.ibm.icu.text.UnicodeSet;
import com.ibm.icu.util.f;
import java.util.ArrayList;

public class y {

    /* renamed from: a  reason: collision with root package name */
    private UnicodeSet f2083a;

    /* renamed from: b  reason: collision with root package name */
    private UnicodeSet f2084b;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList f2085c;

    /* renamed from: d  reason: collision with root package name */
    private short[] f2086d;

    /* renamed from: e  reason: collision with root package name */
    private final int f2087e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2088f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2089g;

    /* renamed from: h  reason: collision with root package name */
    private a f2090h;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private int[] f2091a = new int[16];

        /* renamed from: b  reason: collision with root package name */
        private int f2092b;

        /* renamed from: c  reason: collision with root package name */
        private int f2093c;

        public void a(int i4) {
            int i5 = this.f2093c + i4;
            int[] iArr = this.f2091a;
            if (i5 >= iArr.length) {
                i5 -= iArr.length;
            }
            iArr[i5] = 1;
            this.f2092b++;
        }

        public void b() {
            int length = this.f2091a.length;
            while (true) {
                int i4 = length - 1;
                if (length > 0) {
                    this.f2091a[i4] = 0;
                    length = i4;
                } else {
                    this.f2092b = 0;
                    this.f2093c = 0;
                    return;
                }
            }
        }

        public boolean c(int i4) {
            int i5 = this.f2093c + i4;
            int[] iArr = this.f2091a;
            if (i5 >= iArr.length) {
                i5 -= iArr.length;
            }
            if (iArr[i5] != 0) {
                return true;
            }
            return false;
        }

        public boolean d() {
            if (this.f2092b == 0) {
                return true;
            }
            return false;
        }

        public int e(f fVar) {
            int[] iArr;
            int i4 = this.f2093c;
            do {
                i4++;
                iArr = this.f2091a;
                if (i4 >= iArr.length) {
                    int length = iArr.length - this.f2093c;
                    int i5 = 0;
                    while (true) {
                        int[] iArr2 = this.f2091a;
                        if (iArr2[i5] == 0) {
                            i5++;
                        } else {
                            iArr2[i5] = 0;
                            this.f2092b--;
                            this.f2093c = i5;
                            return length + i5;
                        }
                    }
                }
            } while (iArr[i4] == 0);
            iArr[i4] = 0;
            this.f2092b--;
            int i6 = i4 - this.f2093c;
            this.f2093c = i4;
            return i6;
        }

        public void f(int i4) {
            if (i4 > this.f2091a.length) {
                this.f2091a = new int[i4];
            }
            b();
        }

        public void g(int i4) {
            int i5 = this.f2093c + i4;
            int[] iArr = this.f2091a;
            if (i5 >= iArr.length) {
                i5 -= iArr.length;
            }
            if (iArr[i5] != 0) {
                iArr[i5] = 0;
                this.f2092b--;
            }
            this.f2093c = i5;
        }
    }

    public y(UnicodeSet unicodeSet, ArrayList arrayList, int i4) {
        boolean z3;
        int i5;
        int i6;
        UnicodeSet unicodeSet2 = new UnicodeSet(0, 1114111);
        this.f2083a = unicodeSet2;
        this.f2085c = arrayList;
        if (i4 == 127) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f2089g = z3;
        unicodeSet2.n0(unicodeSet);
        int i7 = i4 & 1;
        if (i7 != 0) {
            this.f2084b = this.f2083a;
        }
        this.f2090h = new a();
        int size = this.f2085c.size();
        this.f2088f = false;
        int i8 = 0;
        int i9 = 0;
        while (i8 < size) {
            String str = (String) this.f2085c.get(i8);
            int length = str.length();
            if (length == 0) {
                this.f2085c.remove(i8);
                size--;
            } else {
                if (this.f2083a.r0(str, UnicodeSet.SpanCondition.CONTAINED) < length) {
                    this.f2088f = true;
                }
                i9 = length > i9 ? length : i9;
                i8++;
            }
        }
        this.f2087e = i9;
        if (this.f2088f || (i4 & 64) != 0) {
            if (this.f2089g) {
                this.f2083a.W();
            }
            boolean z4 = this.f2089g;
            if (z4) {
                i5 = size * 2;
            } else {
                i5 = size;
            }
            this.f2086d = new short[i5];
            if (z4) {
                i6 = size;
            } else {
                i6 = 0;
            }
            for (int i10 = 0; i10 < size; i10++) {
                String str2 = (String) this.f2085c.get(i10);
                int length2 = str2.length();
                UnicodeSet unicodeSet3 = this.f2083a;
                UnicodeSet.SpanCondition spanCondition = UnicodeSet.SpanCondition.CONTAINED;
                int r02 = unicodeSet3.r0(str2, spanCondition);
                if (r02 < length2) {
                    if ((i4 & 2) != 0) {
                        if ((i4 & 32) != 0) {
                            this.f2086d[i10] = c(r02);
                        }
                        if ((i4 & 16) != 0) {
                            this.f2086d[i6 + i10] = c(length2 - this.f2083a.s0(str2, length2, spanCondition));
                        }
                    } else {
                        short[] sArr = this.f2086d;
                        sArr[i6 + i10] = 0;
                        sArr[i10] = 0;
                    }
                    if (i7 != 0) {
                        if ((i4 & 32) != 0) {
                            a(str2.codePointAt(0));
                        }
                        if ((i4 & 16) != 0) {
                            a(str2.codePointBefore(length2));
                        }
                    }
                } else if (this.f2089g) {
                    short[] sArr2 = this.f2086d;
                    sArr2[i6 + i10] = 255;
                    sArr2[i10] = 255;
                } else {
                    this.f2086d[i10] = 255;
                }
            }
            if (this.f2089g) {
                this.f2084b.W();
            }
        }
    }

    private void a(int i4) {
        if (z.l(this.f2084b, (Object) null) || z.l(this.f2084b, this.f2083a)) {
            if (!this.f2083a.S(i4)) {
                this.f2084b = this.f2083a.I();
            } else {
                return;
            }
        }
        this.f2084b.l(i4);
    }

    static short c(int i4) {
        if (i4 < 254) {
            return (short) i4;
        }
        return 254;
    }

    private static boolean d(CharSequence charSequence, int i4, String str, int i5) {
        int i6 = i4 + i5;
        while (true) {
            int i7 = i5 - 1;
            if (i5 <= 0) {
                return true;
            }
            i6--;
            if (charSequence.charAt(i6) != str.charAt(i7)) {
                return false;
            }
            i5 = i7;
        }
    }

    static boolean e(CharSequence charSequence, int i4, int i5, String str, int i6) {
        int i7;
        if (!d(charSequence, i4, str, i6) || ((i4 > 0 && Character.isHighSurrogate(charSequence.charAt(i4 - 1)) && Character.isLowSurrogate(charSequence.charAt(i4))) || ((i7 = i4 + i6) < i5 && Character.isHighSurrogate(charSequence.charAt(i7 - 1)) && Character.isLowSurrogate(charSequence.charAt(i7))))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        r4 = (java.lang.String) r6.f2085c.get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int i(java.lang.CharSequence r7, int r8, com.ibm.icu.util.f r9) {
        /*
            r6 = this;
            int r9 = r7.length()
            java.util.ArrayList r0 = r6.f2085c
            int r0 = r0.size()
        L_0x000a:
            com.ibm.icu.text.UnicodeSet r1 = r6.f2084b
            com.ibm.icu.text.UnicodeSet$SpanCondition r2 = com.ibm.icu.text.UnicodeSet.SpanCondition.NOT_CONTAINED
            int r8 = r1.q0(r7, r8, r2)
            if (r8 != r9) goto L_0x0015
            return r9
        L_0x0015:
            int r1 = r9 - r8
            com.ibm.icu.text.UnicodeSet r2 = r6.f2083a
            int r2 = k(r2, r7, r8, r1)
            if (r2 <= 0) goto L_0x0020
            return r8
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r3 >= r0) goto L_0x0044
            short[] r4 = r6.f2086d
            short r4 = r4[r3]
            r5 = 255(0xff, float:3.57E-43)
            if (r4 != r5) goto L_0x002c
            goto L_0x0041
        L_0x002c:
            java.util.ArrayList r4 = r6.f2085c
            java.lang.Object r4 = r4.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r4.length()
            if (r5 > r1) goto L_0x0041
            boolean r4 = e(r7, r8, r9, r4, r5)
            if (r4 == 0) goto L_0x0041
            return r8
        L_0x0041:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x0044:
            int r8 = r8 - r2
            int r1 = r1 + r2
            if (r1 != 0) goto L_0x000a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.y.i(java.lang.CharSequence, int, com.ibm.icu.util.f):int");
    }

    private int j(CharSequence charSequence, int i4) {
        String str;
        int length;
        int size = this.f2085c.size();
        int i5 = i4;
        do {
            int s02 = this.f2084b.s0(charSequence, i5, UnicodeSet.SpanCondition.NOT_CONTAINED);
            if (s02 == 0) {
                return 0;
            }
            int l4 = l(this.f2083a, charSequence, s02);
            if (l4 > 0) {
                return s02;
            }
            for (int i6 = 0; i6 < size; i6++) {
                if (this.f2086d[i6] != 255 && (length = str.length()) <= s02 && e(charSequence, s02 - length, i4, (str = (String) this.f2085c.get(i6)), length)) {
                    return s02;
                }
            }
            i5 = s02 + l4;
        } while (i5 != 0);
        return 0;
    }

    static int k(UnicodeSet unicodeSet, CharSequence charSequence, int i4, int i5) {
        char charAt = charSequence.charAt(i4);
        if (charAt >= 55296 && charAt <= 56319 && i5 >= 2) {
            char charAt2 = charSequence.charAt(i4 + 1);
            if (j.i(charAt2)) {
                if (unicodeSet.S(Character.toCodePoint(charAt, charAt2))) {
                    return 2;
                }
                return -2;
            }
        }
        if (unicodeSet.S(charAt)) {
            return 1;
        }
        return -1;
    }

    static int l(UnicodeSet unicodeSet, CharSequence charSequence, int i4) {
        char charAt = charSequence.charAt(i4 - 1);
        if (charAt >= 56320 && charAt <= 57343 && i4 >= 2) {
            char charAt2 = charSequence.charAt(i4 - 2);
            if (j.g(charAt2)) {
                if (unicodeSet.S(Character.toCodePoint(charAt2, charAt))) {
                    return 2;
                }
                return -2;
            }
        }
        if (unicodeSet.S(charAt)) {
            return 1;
        }
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: short} */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00de, code lost:
        return r4;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized int m(java.lang.CharSequence r18, int r19, int r20, com.ibm.icu.text.UnicodeSet.SpanCondition r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r21
            monitor-enter(r17)
            com.ibm.icu.text.UnicodeSet$SpanCondition r3 = com.ibm.icu.text.UnicodeSet.SpanCondition.CONTAINED     // Catch:{ all -> 0x000e }
            if (r2 != r3) goto L_0x0011
            int r3 = r1.f2087e     // Catch:{ all -> 0x000e }
            goto L_0x0012
        L_0x000e:
            r0 = move-exception
            goto L_0x010f
        L_0x0011:
            r3 = 0
        L_0x0012:
            Y1.y$a r5 = r1.f2090h     // Catch:{ all -> 0x000e }
            r5.f(r3)     // Catch:{ all -> 0x000e }
            int r3 = r18.length()     // Catch:{ all -> 0x000e }
            int r5 = r3 - r20
            int r6 = r20 - r19
            java.util.ArrayList r7 = r1.f2085c     // Catch:{ all -> 0x000e }
            int r7 = r7.size()     // Catch:{ all -> 0x000e }
            r8 = r6
            r6 = r5
            r5 = r20
        L_0x0029:
            com.ibm.icu.text.UnicodeSet$SpanCondition r9 = com.ibm.icu.text.UnicodeSet.SpanCondition.CONTAINED     // Catch:{ all -> 0x000e }
            r10 = 254(0xfe, float:3.56E-43)
            if (r2 != r9) goto L_0x0079
            r9 = 0
        L_0x0030:
            if (r9 >= r7) goto L_0x00bd
            short[] r11 = r1.f2086d     // Catch:{ all -> 0x000e }
            short r11 = r11[r9]     // Catch:{ all -> 0x000e }
            r12 = 255(0xff, float:3.57E-43)
            if (r11 != r12) goto L_0x003b
            goto L_0x0071
        L_0x003b:
            java.util.ArrayList r12 = r1.f2085c     // Catch:{ all -> 0x000e }
            java.lang.Object r12 = r12.get(r9)     // Catch:{ all -> 0x000e }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x000e }
            int r13 = r12.length()     // Catch:{ all -> 0x000e }
            if (r11 < r10) goto L_0x004e
            r11 = -1
            int r11 = r12.offsetByCodePoints(r13, r11)     // Catch:{ all -> 0x000e }
        L_0x004e:
            if (r11 <= r8) goto L_0x0051
            r11 = r8
        L_0x0051:
            int r14 = r13 - r11
        L_0x0053:
            if (r14 <= r6) goto L_0x0056
            goto L_0x0071
        L_0x0056:
            Y1.y$a r15 = r1.f2090h     // Catch:{ all -> 0x000e }
            boolean r15 = r15.c(r14)     // Catch:{ all -> 0x000e }
            if (r15 != 0) goto L_0x006f
            int r15 = r5 - r11
            boolean r15 = e(r0, r15, r3, r12, r13)     // Catch:{ all -> 0x000e }
            if (r15 == 0) goto L_0x006f
            if (r14 != r6) goto L_0x006a
            monitor-exit(r17)
            return r3
        L_0x006a:
            Y1.y$a r15 = r1.f2090h     // Catch:{ all -> 0x000e }
            r15.a(r14)     // Catch:{ all -> 0x000e }
        L_0x006f:
            if (r11 != 0) goto L_0x0074
        L_0x0071:
            int r9 = r9 + 1
            goto L_0x0030
        L_0x0074:
            int r11 = r11 + -1
            int r14 = r14 + 1
            goto L_0x0053
        L_0x0079:
            r9 = 0
            r11 = 0
            r12 = 0
        L_0x007c:
            if (r9 >= r7) goto L_0x00b8
            short[] r13 = r1.f2086d     // Catch:{ all -> 0x000e }
            short r13 = r13[r9]     // Catch:{ all -> 0x000e }
            java.util.ArrayList r14 = r1.f2085c     // Catch:{ all -> 0x000e }
            java.lang.Object r14 = r14.get(r9)     // Catch:{ all -> 0x000e }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x000e }
            int r15 = r14.length()     // Catch:{ all -> 0x000e }
            if (r13 < r10) goto L_0x0091
            r13 = r15
        L_0x0091:
            if (r13 <= r8) goto L_0x0094
            r13 = r8
        L_0x0094:
            int r16 = r15 - r13
            r4 = r16
        L_0x0098:
            if (r4 > r6) goto L_0x00b3
            if (r13 >= r12) goto L_0x009d
            goto L_0x00b3
        L_0x009d:
            if (r13 > r12) goto L_0x00a1
            if (r4 <= r11) goto L_0x00ac
        L_0x00a1:
            int r10 = r5 - r13
            boolean r10 = e(r0, r10, r3, r14, r15)     // Catch:{ all -> 0x000e }
            if (r10 == 0) goto L_0x00ac
            r11 = r4
            r12 = r13
            goto L_0x00b3
        L_0x00ac:
            int r13 = r13 + -1
            int r4 = r4 + 1
            r10 = 254(0xfe, float:3.56E-43)
            goto L_0x0098
        L_0x00b3:
            int r9 = r9 + 1
            r10 = 254(0xfe, float:3.56E-43)
            goto L_0x007c
        L_0x00b8:
            if (r11 != 0) goto L_0x0109
            if (r12 == 0) goto L_0x00bd
            goto L_0x0109
        L_0x00bd:
            if (r8 != 0) goto L_0x00f5
            if (r5 != 0) goto L_0x00c2
            goto L_0x00f5
        L_0x00c2:
            Y1.y$a r4 = r1.f2090h     // Catch:{ all -> 0x000e }
            boolean r4 = r4.d()     // Catch:{ all -> 0x000e }
            if (r4 == 0) goto L_0x00df
            com.ibm.icu.text.UnicodeSet r4 = r1.f2083a     // Catch:{ all -> 0x000e }
            com.ibm.icu.text.UnicodeSet$SpanCondition r8 = com.ibm.icu.text.UnicodeSet.SpanCondition.CONTAINED     // Catch:{ all -> 0x000e }
            int r4 = r4.q0(r0, r5, r8)     // Catch:{ all -> 0x000e }
            int r8 = r4 - r5
            if (r8 == r6) goto L_0x00dd
            if (r8 != 0) goto L_0x00d9
            goto L_0x00dd
        L_0x00d9:
            int r5 = r5 + r8
            int r6 = r6 - r8
            goto L_0x0029
        L_0x00dd:
            monitor-exit(r17)
            return r4
        L_0x00df:
            com.ibm.icu.text.UnicodeSet r4 = r1.f2083a     // Catch:{ all -> 0x000e }
            int r4 = k(r4, r0, r5, r6)     // Catch:{ all -> 0x000e }
            if (r4 <= 0) goto L_0x00ff
            if (r4 != r6) goto L_0x00eb
            monitor-exit(r17)
            return r3
        L_0x00eb:
            int r5 = r5 + r4
            int r6 = r6 - r4
            Y1.y$a r8 = r1.f2090h     // Catch:{ all -> 0x000e }
            r8.g(r4)     // Catch:{ all -> 0x000e }
        L_0x00f2:
            r8 = 0
            goto L_0x0029
        L_0x00f5:
            Y1.y$a r4 = r1.f2090h     // Catch:{ all -> 0x000e }
            boolean r4 = r4.d()     // Catch:{ all -> 0x000e }
            if (r4 == 0) goto L_0x00ff
            monitor-exit(r17)
            return r5
        L_0x00ff:
            Y1.y$a r4 = r1.f2090h     // Catch:{ all -> 0x000e }
            r8 = 0
            int r4 = r4.e(r8)     // Catch:{ all -> 0x000e }
            int r5 = r5 + r4
            int r6 = r6 - r4
            goto L_0x00f2
        L_0x0109:
            int r5 = r5 + r11
            int r6 = r6 - r11
            if (r6 != 0) goto L_0x00f2
            monitor-exit(r17)
            return r3
        L_0x010f:
            monitor-exit(r17)     // Catch:{ all -> 0x000e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.y.m(java.lang.CharSequence, int, int, com.ibm.icu.text.UnicodeSet$SpanCondition):int");
    }

    public boolean b(int i4) {
        return this.f2083a.S(i4);
    }

    public boolean f() {
        return this.f2088f;
    }

    public int g(CharSequence charSequence, int i4, UnicodeSet.SpanCondition spanCondition) {
        if (spanCondition == UnicodeSet.SpanCondition.NOT_CONTAINED) {
            return i(charSequence, i4, (f) null);
        }
        int q02 = this.f2083a.q0(charSequence, i4, UnicodeSet.SpanCondition.CONTAINED);
        if (q02 == charSequence.length()) {
            return q02;
        }
        return m(charSequence, i4, q02, spanCondition);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00f8, code lost:
        return r6;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int h(java.lang.CharSequence r18, int r19, com.ibm.icu.text.UnicodeSet.SpanCondition r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r3 = r20
            monitor-enter(r17)
            com.ibm.icu.text.UnicodeSet$SpanCondition r4 = com.ibm.icu.text.UnicodeSet.SpanCondition.NOT_CONTAINED     // Catch:{ all -> 0x0013 }
            if (r3 != r4) goto L_0x0016
            int r0 = r17.j(r18, r19)     // Catch:{ all -> 0x0013 }
            monitor-exit(r17)
            return r0
        L_0x0013:
            r0 = move-exception
            goto L_0x012d
        L_0x0016:
            com.ibm.icu.text.UnicodeSet r4 = r1.f2083a     // Catch:{ all -> 0x0013 }
            com.ibm.icu.text.UnicodeSet$SpanCondition r5 = com.ibm.icu.text.UnicodeSet.SpanCondition.CONTAINED     // Catch:{ all -> 0x0013 }
            int r4 = r4.s0(r0, r2, r5)     // Catch:{ all -> 0x0013 }
            r6 = 0
            if (r4 != 0) goto L_0x0023
            monitor-exit(r17)
            return r6
        L_0x0023:
            int r7 = r2 - r4
            if (r3 != r5) goto L_0x002a
            int r5 = r1.f2087e     // Catch:{ all -> 0x0013 }
            goto L_0x002b
        L_0x002a:
            r5 = r6
        L_0x002b:
            Y1.y$a r8 = r1.f2090h     // Catch:{ all -> 0x0013 }
            r8.f(r5)     // Catch:{ all -> 0x0013 }
            java.util.ArrayList r5 = r1.f2085c     // Catch:{ all -> 0x0013 }
            int r5 = r5.size()     // Catch:{ all -> 0x0013 }
            boolean r8 = r1.f2089g     // Catch:{ all -> 0x0013 }
            if (r8 == 0) goto L_0x003c
            r8 = r5
            goto L_0x003d
        L_0x003c:
            r8 = r6
        L_0x003d:
            com.ibm.icu.text.UnicodeSet$SpanCondition r9 = com.ibm.icu.text.UnicodeSet.SpanCondition.CONTAINED     // Catch:{ all -> 0x0013 }
            r10 = 254(0xfe, float:3.56E-43)
            if (r3 != r9) goto L_0x0091
            r9 = r6
        L_0x0044:
            if (r9 >= r5) goto L_0x00d7
            short[] r11 = r1.f2086d     // Catch:{ all -> 0x0013 }
            int r12 = r8 + r9
            short r11 = r11[r12]     // Catch:{ all -> 0x0013 }
            r12 = 255(0xff, float:3.57E-43)
            if (r11 != r12) goto L_0x0051
            goto L_0x0089
        L_0x0051:
            java.util.ArrayList r12 = r1.f2085c     // Catch:{ all -> 0x0013 }
            java.lang.Object r12 = r12.get(r9)     // Catch:{ all -> 0x0013 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0013 }
            int r13 = r12.length()     // Catch:{ all -> 0x0013 }
            if (r11 < r10) goto L_0x0066
            r11 = 1
            int r11 = r12.offsetByCodePoints(r6, r11)     // Catch:{ all -> 0x0013 }
            int r11 = r13 - r11
        L_0x0066:
            if (r11 <= r7) goto L_0x0069
            r11 = r7
        L_0x0069:
            int r14 = r13 - r11
        L_0x006b:
            if (r14 <= r4) goto L_0x006e
            goto L_0x0089
        L_0x006e:
            Y1.y$a r15 = r1.f2090h     // Catch:{ all -> 0x0013 }
            boolean r15 = r15.c(r14)     // Catch:{ all -> 0x0013 }
            if (r15 != 0) goto L_0x0087
            int r15 = r4 - r14
            boolean r15 = e(r0, r15, r2, r12, r13)     // Catch:{ all -> 0x0013 }
            if (r15 == 0) goto L_0x0087
            if (r14 != r4) goto L_0x0082
            monitor-exit(r17)
            return r6
        L_0x0082:
            Y1.y$a r15 = r1.f2090h     // Catch:{ all -> 0x0013 }
            r15.a(r14)     // Catch:{ all -> 0x0013 }
        L_0x0087:
            if (r11 != 0) goto L_0x008c
        L_0x0089:
            int r9 = r9 + 1
            goto L_0x0044
        L_0x008c:
            int r11 = r11 + -1
            int r14 = r14 + 1
            goto L_0x006b
        L_0x0091:
            r9 = r6
            r11 = r9
            r12 = r11
        L_0x0094:
            if (r9 >= r5) goto L_0x00d2
            short[] r13 = r1.f2086d     // Catch:{ all -> 0x0013 }
            int r14 = r8 + r9
            short r13 = r13[r14]     // Catch:{ all -> 0x0013 }
            java.util.ArrayList r14 = r1.f2085c     // Catch:{ all -> 0x0013 }
            java.lang.Object r14 = r14.get(r9)     // Catch:{ all -> 0x0013 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0013 }
            int r15 = r14.length()     // Catch:{ all -> 0x0013 }
            if (r13 < r10) goto L_0x00ab
            r13 = r15
        L_0x00ab:
            if (r13 <= r7) goto L_0x00ae
            r13 = r7
        L_0x00ae:
            int r16 = r15 - r13
            r10 = r16
        L_0x00b2:
            if (r10 > r4) goto L_0x00cc
            if (r13 >= r12) goto L_0x00b7
            goto L_0x00cc
        L_0x00b7:
            if (r13 > r12) goto L_0x00bb
            if (r10 <= r11) goto L_0x00c6
        L_0x00bb:
            int r6 = r4 - r10
            boolean r6 = e(r0, r6, r2, r14, r15)     // Catch:{ all -> 0x0013 }
            if (r6 == 0) goto L_0x00c6
            r11 = r10
            r12 = r13
            goto L_0x00cc
        L_0x00c6:
            int r13 = r13 + -1
            int r10 = r10 + 1
            r6 = 0
            goto L_0x00b2
        L_0x00cc:
            int r9 = r9 + 1
            r6 = 0
            r10 = 254(0xfe, float:3.56E-43)
            goto L_0x0094
        L_0x00d2:
            if (r11 != 0) goto L_0x0123
            if (r12 == 0) goto L_0x00d7
            goto L_0x0123
        L_0x00d7:
            if (r7 != 0) goto L_0x0110
            if (r4 != r2) goto L_0x00dc
            goto L_0x0110
        L_0x00dc:
            Y1.y$a r6 = r1.f2090h     // Catch:{ all -> 0x0013 }
            boolean r6 = r6.d()     // Catch:{ all -> 0x0013 }
            if (r6 == 0) goto L_0x00f9
            com.ibm.icu.text.UnicodeSet r6 = r1.f2083a     // Catch:{ all -> 0x0013 }
            com.ibm.icu.text.UnicodeSet$SpanCondition r7 = com.ibm.icu.text.UnicodeSet.SpanCondition.CONTAINED     // Catch:{ all -> 0x0013 }
            int r6 = r6.s0(r0, r4, r7)     // Catch:{ all -> 0x0013 }
            int r7 = r4 - r6
            if (r6 == 0) goto L_0x00f7
            if (r7 != 0) goto L_0x00f3
            goto L_0x00f7
        L_0x00f3:
            r4 = r6
            r6 = 0
            goto L_0x003d
        L_0x00f7:
            monitor-exit(r17)
            return r6
        L_0x00f9:
            com.ibm.icu.text.UnicodeSet r6 = r1.f2083a     // Catch:{ all -> 0x0013 }
            int r6 = l(r6, r0, r4)     // Catch:{ all -> 0x0013 }
            if (r6 <= 0) goto L_0x011a
            if (r6 != r4) goto L_0x0106
            monitor-exit(r17)
            r0 = 0
            return r0
        L_0x0106:
            int r4 = r4 - r6
            Y1.y$a r7 = r1.f2090h     // Catch:{ all -> 0x0013 }
            r7.g(r6)     // Catch:{ all -> 0x0013 }
        L_0x010c:
            r6 = 0
            r7 = 0
            goto L_0x003d
        L_0x0110:
            Y1.y$a r6 = r1.f2090h     // Catch:{ all -> 0x0013 }
            boolean r6 = r6.d()     // Catch:{ all -> 0x0013 }
            if (r6 == 0) goto L_0x011a
            monitor-exit(r17)
            return r4
        L_0x011a:
            Y1.y$a r6 = r1.f2090h     // Catch:{ all -> 0x0013 }
            r7 = 0
            int r6 = r6.e(r7)     // Catch:{ all -> 0x0013 }
            int r4 = r4 - r6
            goto L_0x010c
        L_0x0123:
            int r4 = r4 - r11
            if (r4 != 0) goto L_0x0129
            monitor-exit(r17)
            r6 = 0
            return r6
        L_0x0129:
            r6 = 0
            r7 = r6
            goto L_0x003d
        L_0x012d:
            monitor-exit(r17)     // Catch:{ all -> 0x0013 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.y.h(java.lang.CharSequence, int, com.ibm.icu.text.UnicodeSet$SpanCondition):int");
    }
}
