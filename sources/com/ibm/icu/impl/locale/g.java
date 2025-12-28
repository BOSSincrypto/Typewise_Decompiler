package com.ibm.icu.impl.locale;

import Y1.w;
import Y1.x;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.util.BytesTrie;
import com.ibm.icu.util.LocaleMatcher;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.TreeMap;

public class g {

    /* renamed from: j  reason: collision with root package name */
    public static final g f12871j = new g(a.b());

    /* renamed from: a  reason: collision with root package name */
    private final BytesTrie f12872a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f12873b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f12874c;

    /* renamed from: d  reason: collision with root package name */
    private final Set f12875d;

    /* renamed from: e  reason: collision with root package name */
    private final int f12876e;

    /* renamed from: f  reason: collision with root package name */
    private final int f12877f;

    /* renamed from: g  reason: collision with root package name */
    private final int f12878g;

    /* renamed from: h  reason: collision with root package name */
    private final int f12879h;

    /* renamed from: i  reason: collision with root package name */
    private final int f12880i = e(a(new e("en", "Latn", "US", 7), new e[]{new e("en", "Latn", "GB", 7)}, 1, m(50), LocaleMatcher.FavorSubtag.LANGUAGE, LocaleMatcher.Direction.WITH_ONE_WAY));

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f12881a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f12882b;

        /* renamed from: c  reason: collision with root package name */
        public String[] f12883c;

        /* renamed from: d  reason: collision with root package name */
        public Set f12884d;

        /* renamed from: e  reason: collision with root package name */
        public int[] f12885e;

        public a(byte[] bArr, byte[] bArr2, String[] strArr, Set set, int[] iArr) {
            this.f12881a = bArr;
            this.f12882b = bArr2;
            this.f12883c = strArr;
            this.f12884d = set;
            this.f12885e = iArr;
        }

        private static x a(w wVar, String str, x xVar) {
            if (wVar.b(str, xVar)) {
                return xVar;
            }
            throw new MissingResourceException("langInfo.res missing data", "", "match/" + str);
        }

        public static a b() {
            LinkedHashSet linkedHashSet;
            x r02 = ICUResourceBundle.h0("com/ibm/icu/impl/data/icudt71b", "langInfo", ICUResourceBundle.f12538e, ICUResourceBundle.OpenType.DIRECT).r0("match");
            w f4 = r02.f();
            ByteBuffer a4 = a(f4, "trie", r02).a();
            byte[] bArr = new byte[a4.remaining()];
            a4.get(bArr);
            ByteBuffer a5 = a(f4, "regionToPartitions", r02).a();
            int remaining = a5.remaining();
            byte[] bArr2 = new byte[remaining];
            a5.get(bArr2);
            if (remaining >= 1677) {
                String[] e4 = a(f4, "partitions", r02).e();
                if (f4.b("paradigms", r02)) {
                    String[] e5 = r02.e();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(e5.length / 3);
                    for (int i4 = 0; i4 < e5.length; i4 += 3) {
                        linkedHashSet2.add(new e(e5[i4], e5[i4 + 1], e5[i4 + 2], 0));
                    }
                    linkedHashSet = linkedHashSet2;
                } else {
                    linkedHashSet = Collections.emptySet();
                }
                int[] c4 = a(f4, "distances", r02).c();
                if (c4.length >= 4) {
                    return new a(bArr, bArr2, e4, linkedHashSet, c4);
                }
                throw new MissingResourceException("langInfo.res intvector too short", "", "match/distances");
            }
            throw new MissingResourceException("langInfo.res binary data too short", "", "match/regionToPartitions");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (a.class.equals(obj.getClass())) {
                    a aVar = (a) obj;
                    if (!Arrays.equals(this.f12881a, aVar.f12881a) || !Arrays.equals(this.f12882b, aVar.f12882b) || !Arrays.equals(this.f12883c, aVar.f12883c) || !this.f12884d.equals(aVar.f12884d) || !Arrays.equals(this.f12885e, aVar.f12885e)) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return 1;
        }
    }

    private g(a aVar) {
        this.f12872a = new BytesTrie(aVar.f12881a, 0);
        this.f12873b = aVar.f12882b;
        this.f12874c = aVar.f12883c;
        this.f12875d = aVar.f12884d;
        int[] iArr = aVar.f12885e;
        this.f12876e = iArr[0];
        this.f12877f = iArr[1];
        this.f12878g = iArr[2];
        this.f12879h = iArr[3];
    }

    private static final int d(BytesTrie bytesTrie, long j4, String str, String str2) {
        int i4 = 0;
        int o4 = o(bytesTrie, str, false);
        if (o4 >= 0) {
            o4 = o(bytesTrie, str2, true);
        }
        if (o4 >= 0) {
            return o4;
        }
        BytesTrie.Result p4 = bytesTrie.t(j4).p(42);
        if (!str.equals(str2)) {
            i4 = bytesTrie.l();
        }
        if (p4 == BytesTrie.Result.FINAL_VALUE) {
            return i4 | 256;
        }
        return i4;
    }

    public static final int e(int i4) {
        return (i4 & 1023) >> 3;
    }

    private static final int f(BytesTrie bytesTrie, long j4) {
        bytesTrie.t(j4).p(42);
        return bytesTrie.l();
    }

    public static final int g(int i4) {
        return i4 >> 10;
    }

    private static final int h(BytesTrie bytesTrie, long j4, String str, String str2, int i4) {
        long j5;
        int i5;
        BytesTrie bytesTrie2 = bytesTrie;
        String str3 = str;
        String str4 = str2;
        int i6 = i4;
        int length = str.length();
        int length2 = str2.length();
        if (length != 1 || length2 != 1) {
            int i7 = 0;
            boolean z3 = false;
            int i8 = 0;
            while (true) {
                int i9 = i7 + 1;
                if (bytesTrie.p(str3.charAt(i7) | 128).hasNext()) {
                    if (length2 > 1) {
                        j5 = bytesTrie.k();
                    } else {
                        j5 = 0;
                    }
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        if (bytesTrie.p(str4.charAt(i10) | 128).hasValue()) {
                            i5 = bytesTrie.l();
                        } else if (z3) {
                            i5 = 0;
                        } else {
                            i5 = f(bytesTrie, j4);
                            z3 = true;
                        }
                        if (i5 <= i6) {
                            if (i8 < i5) {
                                i8 = i5;
                            }
                            if (i11 >= length2) {
                                break;
                            }
                            bytesTrie.t(j5);
                            i10 = i11;
                        } else {
                            return i5;
                        }
                    }
                } else if (!z3) {
                    int f4 = f(bytesTrie, j4);
                    if (f4 > i6) {
                        return f4;
                    }
                    if (i8 < f4) {
                        i8 = f4;
                    }
                    z3 = true;
                }
                if (i9 >= length) {
                    return i8;
                }
                bytesTrie.t(j4);
                i7 = i9;
            }
        } else if (!bytesTrie.p(str3.charAt(0) | 128).hasNext() || !bytesTrie.p(str4.charAt(0) | 128).hasValue()) {
            return f(bytesTrie, j4);
        } else {
            return bytesTrie.l();
        }
    }

    public static final int i(int i4) {
        return i4 & 1023;
    }

    private boolean j(e eVar, e eVar2, int i4, LocaleMatcher.FavorSubtag favorSubtag) {
        if (a(eVar, new e[]{eVar2}, 1, i4, favorSubtag, (LocaleMatcher.Direction) null) >= 0) {
            return true;
        }
        return false;
    }

    private String l(e eVar) {
        return this.f12874c[this.f12873b[eVar.f12860d]];
    }

    public static final int m(int i4) {
        return i4 << 3;
    }

    private static final int o(BytesTrie bytesTrie, String str, boolean z3) {
        if (str.isEmpty()) {
            return -1;
        }
        int length = str.length() - 1;
        int i4 = 0;
        while (true) {
            char charAt = str.charAt(i4);
            if (i4 >= length) {
                BytesTrie.Result p4 = bytesTrie.p(charAt | 128);
                if (z3) {
                    if (p4.hasValue()) {
                        int l4 = bytesTrie.l();
                        if (p4 == BytesTrie.Result.FINAL_VALUE) {
                            return l4 | 256;
                        }
                        return l4;
                    }
                } else if (p4.hasNext()) {
                    return 0;
                }
                return -1;
            } else if (!bytesTrie.p(charAt).hasNext()) {
                return -1;
            } else {
                i4++;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0120, code lost:
        if (j(r13, r1, r11, r3) == false) goto L_0x0109;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(com.ibm.icu.impl.locale.e r23, com.ibm.icu.impl.locale.e[] r24, int r25, int r26, com.ibm.icu.util.LocaleMatcher.FavorSubtag r27, com.ibm.icu.util.LocaleMatcher.Direction r28) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r25
            r3 = r27
            r4 = r28
            com.ibm.icu.util.BytesTrie r11 = new com.ibm.icu.util.BytesTrie
            com.ibm.icu.util.BytesTrie r5 = r0.f12872a
            r11.<init>(r5)
            java.lang.String r5 = r1.f12857a
            r12 = 0
            int r13 = o(r11, r5, r12)
            r14 = 1
            if (r13 < 0) goto L_0x0023
            if (r2 <= r14) goto L_0x0023
            long r5 = r11.k()
        L_0x0021:
            r9 = r5
            goto L_0x0026
        L_0x0023:
            r5 = 0
            goto L_0x0021
        L_0x0026:
            r8 = r26
            r6 = r12
            r7 = -1
            r16 = -1
        L_0x002c:
            if (r6 >= r2) goto L_0x0153
            r5 = r24[r6]
            if (r13 < 0) goto L_0x003e
            if (r6 == 0) goto L_0x0037
            r11.t(r9)
        L_0x0037:
            java.lang.String r12 = r5.f12857a
            int r12 = o(r11, r12, r14)
            goto L_0x003f
        L_0x003e:
            r12 = r13
        L_0x003f:
            if (r12 < 0) goto L_0x0048
            r14 = r12 & 384(0x180, float:5.38E-43)
            r12 = r12 & -385(0xfffffffffffffe7f, float:NaN)
            r17 = 0
            goto L_0x0059
        L_0x0048:
            java.lang.String r12 = r1.f12857a
            java.lang.String r14 = r5.f12857a
            boolean r12 = r12.equals(r14)
            if (r12 == 0) goto L_0x0054
            r12 = 0
            goto L_0x0056
        L_0x0054:
            int r12 = r0.f12876e
        L_0x0056:
            r14 = 0
            r17 = 1
        L_0x0059:
            int r18 = r8 + 7
            int r15 = r18 >> 3
            com.ibm.icu.util.LocaleMatcher$FavorSubtag r2 = com.ibm.icu.util.LocaleMatcher.FavorSubtag.SCRIPT
            if (r3 != r2) goto L_0x0063
            int r12 = r12 >> 2
        L_0x0063:
            if (r12 <= r15) goto L_0x0071
            r18 = r6
            r15 = r7
        L_0x0068:
            r20 = r9
            r19 = r11
            r17 = r13
            r11 = r8
            goto L_0x0143
        L_0x0071:
            if (r17 != 0) goto L_0x0075
            if (r14 == 0) goto L_0x007a
        L_0x0075:
            r18 = r6
            r26 = r7
            goto L_0x0090
        L_0x007a:
            r2 = r6
            r26 = r7
            long r6 = r11.k()
            java.lang.String r14 = r1.f12858b
            r18 = r2
            java.lang.String r2 = r5.f12858b
            int r2 = d(r11, r6, r14, r2)
            r14 = r2 & 256(0x100, float:3.59E-43)
            r2 = r2 & -257(0xfffffffffffffeff, float:NaN)
            goto L_0x009e
        L_0x0090:
            java.lang.String r2 = r1.f12858b
            java.lang.String r6 = r5.f12858b
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x009c
            r2 = 0
            goto L_0x009e
        L_0x009c:
            int r2 = r0.f12877f
        L_0x009e:
            int r12 = r12 + r2
            if (r12 <= r15) goto L_0x00a4
        L_0x00a1:
            r15 = r26
            goto L_0x0068
        L_0x00a4:
            java.lang.String r2 = r1.f12859c
            java.lang.String r6 = r5.f12859c
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x00b7
            r20 = r9
            r19 = r11
            r17 = r13
            r13 = r5
            r11 = r8
            goto L_0x00f0
        L_0x00b7:
            if (r17 != 0) goto L_0x00bd
            r2 = r14 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x00c6
        L_0x00bd:
            r20 = r9
            r19 = r11
            r17 = r13
            r13 = r5
            r11 = r8
            goto L_0x00ed
        L_0x00c6:
            int r2 = r15 - r12
            int r6 = r0.f12879h
            if (r6 <= r2) goto L_0x00cd
            goto L_0x00a1
        L_0x00cd:
            long r6 = r11.k()
            java.lang.String r14 = r22.l(r23)
            java.lang.String r15 = r0.l(r5)
            r17 = r13
            r13 = r5
            r5 = r11
            r19 = r11
            r11 = r26
            r11 = r8
            r8 = r14
            r20 = r9
            r9 = r15
            r10 = r2
            int r2 = h(r5, r6, r8, r9, r10)
        L_0x00eb:
            int r12 = r12 + r2
            goto L_0x00f0
        L_0x00ed:
            int r2 = r0.f12878g
            goto L_0x00eb
        L_0x00f0:
            int r2 = m(r12)
            if (r2 != 0) goto L_0x0116
            int r5 = r1.f12861e
            int r6 = r13.f12861e
            r5 = r5 ^ r6
            r2 = r2 | r5
            if (r2 >= r11) goto L_0x0109
            com.ibm.icu.util.LocaleMatcher$Direction r5 = com.ibm.icu.util.LocaleMatcher.Direction.ONLY_TWO_WAY
            if (r4 != r5) goto L_0x010c
            boolean r5 = r0.j(r13, r1, r11, r3)
            if (r5 == 0) goto L_0x0109
            goto L_0x010c
        L_0x0109:
            r15 = r26
            goto L_0x0143
        L_0x010c:
            if (r2 != 0) goto L_0x0111
            int r1 = r18 << 10
            return r1
        L_0x0111:
            r8 = r2
            r16 = r18
            r7 = -1
            goto L_0x0145
        L_0x0116:
            if (r2 >= r11) goto L_0x0123
            com.ibm.icu.util.LocaleMatcher$Direction r5 = com.ibm.icu.util.LocaleMatcher.Direction.ONLY_TWO_WAY
            if (r4 != r5) goto L_0x0111
            boolean r5 = r0.j(r13, r1, r11, r3)
            if (r5 == 0) goto L_0x0109
            goto L_0x0111
        L_0x0123:
            if (r2 != r11) goto L_0x0109
            if (r16 < 0) goto L_0x0109
            com.ibm.icu.util.LocaleMatcher$Direction r2 = com.ibm.icu.util.LocaleMatcher.Direction.ONLY_TWO_WAY
            if (r4 != r2) goto L_0x0131
            boolean r2 = r0.j(r13, r1, r11, r3)
            if (r2 == 0) goto L_0x0109
        L_0x0131:
            com.ibm.icu.impl.locale.m r2 = com.ibm.icu.impl.locale.m.f12910i
            r5 = r24[r16]
            r15 = r26
            int r7 = r2.a(r13, r5, r15)
            r2 = r7 & 1
            r8 = r11
            if (r2 == 0) goto L_0x0145
            r16 = r18
            goto L_0x0145
        L_0x0143:
            r8 = r11
            r7 = r15
        L_0x0145:
            int r6 = r18 + 1
            r2 = r25
            r13 = r17
            r11 = r19
            r9 = r20
            r12 = 0
            r14 = 1
            goto L_0x002c
        L_0x0153:
            r11 = r8
            if (r16 < 0) goto L_0x015a
            int r1 = r16 << 10
            r1 = r1 | r11
            goto L_0x0162
        L_0x015a:
            r1 = 100
            int r1 = m(r1)
            r1 = r1 | -1024(0xfffffffffffffc00, float:NaN)
        L_0x0162:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.locale.g.a(com.ibm.icu.impl.locale.e, com.ibm.icu.impl.locale.e[], int, int, com.ibm.icu.util.LocaleMatcher$FavorSubtag, com.ibm.icu.util.LocaleMatcher$Direction):int");
    }

    public int b() {
        return this.f12880i;
    }

    public int c() {
        return this.f12877f;
    }

    public boolean k(e eVar) {
        for (e b4 : this.f12875d) {
            if (eVar.b(b4)) {
                return true;
            }
        }
        return false;
    }

    public Map n() {
        TreeMap treeMap = new TreeMap();
        StringBuilder sb = new StringBuilder();
        BytesTrie.c n4 = this.f12872a.iterator();
        while (n4.hasNext()) {
            BytesTrie.b bVar = (BytesTrie.b) n4.next();
            sb.setLength(0);
            int h4 = bVar.h();
            for (int i4 = 0; i4 < h4; i4++) {
                byte g4 = bVar.g(i4);
                if (g4 == 42) {
                    sb.append("*-*-");
                } else if (g4 >= 0) {
                    sb.append((char) g4);
                } else {
                    sb.append((char) (g4 & Byte.MAX_VALUE));
                    sb.append('-');
                }
            }
            sb.setLength(sb.length() - 1);
            treeMap.put(sb.toString(), Integer.valueOf(bVar.f13142a));
        }
        return treeMap;
    }

    public String toString() {
        return n().toString();
    }
}
