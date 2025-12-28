package com.ibm.icu.impl.locale;

import Y1.w;
import Y1.x;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.util.BytesTrie;
import com.ibm.icu.util.ULocale;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.TreeMap;

public final class m {

    /* renamed from: i  reason: collision with root package name */
    public static final m f12910i = new m(b.b());

    /* renamed from: a  reason: collision with root package name */
    private final Map f12911a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f12912b;

    /* renamed from: c  reason: collision with root package name */
    private final BytesTrie f12913c;

    /* renamed from: d  reason: collision with root package name */
    private final long f12914d;

    /* renamed from: e  reason: collision with root package name */
    private final long f12915e;

    /* renamed from: f  reason: collision with root package name */
    private final int f12916f;

    /* renamed from: g  reason: collision with root package name */
    private final long[] f12917g = new long[26];

    /* renamed from: h  reason: collision with root package name */
    private final e[] f12918h;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12919a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ibm.icu.util.BytesTrie$Result[] r0 = com.ibm.icu.util.BytesTrie.Result.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12919a = r0
                com.ibm.icu.util.BytesTrie$Result r1 = com.ibm.icu.util.BytesTrie.Result.NO_MATCH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12919a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ibm.icu.util.BytesTrie$Result r1 = com.ibm.icu.util.BytesTrie.Result.NO_VALUE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12919a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ibm.icu.util.BytesTrie$Result r1 = com.ibm.icu.util.BytesTrie.Result.INTERMEDIATE_VALUE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12919a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ibm.icu.util.BytesTrie$Result r1 = com.ibm.icu.util.BytesTrie.Result.FINAL_VALUE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.locale.m.a.<clinit>():void");
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Map f12920a;

        /* renamed from: b  reason: collision with root package name */
        public final Map f12921b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f12922c;

        /* renamed from: d  reason: collision with root package name */
        public final e[] f12923d;

        public b(Map map, Map map2, byte[] bArr, e[] eVarArr) {
            this.f12920a = map;
            this.f12921b = map2;
            this.f12922c = bArr;
            this.f12923d = eVarArr;
        }

        private static x a(w wVar, String str, x xVar) {
            if (wVar.b(str, xVar)) {
                return xVar;
            }
            throw new MissingResourceException("langInfo.res missing data", "", "likely/" + str);
        }

        public static b b() {
            Map map;
            Map map2;
            x r02 = ICUResourceBundle.h0("com/ibm/icu/impl/data/icudt71b", "langInfo", ICUResourceBundle.f12538e, ICUResourceBundle.OpenType.DIRECT).r0("likely");
            w f4 = r02.f();
            if (f4.b("languageAliases", r02)) {
                String[] e4 = r02.e();
                map = new HashMap(e4.length / 2);
                for (int i4 = 0; i4 < e4.length; i4 += 2) {
                    map.put(e4[i4], e4[i4 + 1]);
                }
            } else {
                map = Collections.emptyMap();
            }
            if (f4.b("regionAliases", r02)) {
                String[] e5 = r02.e();
                map2 = new HashMap(e5.length / 2);
                for (int i5 = 0; i5 < e5.length; i5 += 2) {
                    map2.put(e5[i5], e5[i5 + 1]);
                }
            } else {
                map2 = Collections.emptyMap();
            }
            ByteBuffer a4 = a(f4, "trie", r02).a();
            byte[] bArr = new byte[a4.remaining()];
            a4.get(bArr);
            String[] e6 = a(f4, "lsrs", r02).e();
            e[] eVarArr = new e[(e6.length / 3)];
            int i6 = 0;
            int i7 = 0;
            while (i6 < e6.length) {
                eVarArr[i7] = new e(e6[i6], e6[i6 + 1], e6[i6 + 2], 0);
                i6 += 3;
                i7++;
            }
            return new b(map, map2, bArr, eVarArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (b.class.equals(obj.getClass())) {
                    b bVar = (b) obj;
                    if (!this.f12920a.equals(bVar.f12920a) || !this.f12921b.equals(bVar.f12921b) || !Arrays.equals(this.f12922c, bVar.f12922c) || !Arrays.equals(this.f12923d, bVar.f12923d)) {
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

    private m(b bVar) {
        this.f12911a = bVar.f12920a;
        this.f12912b = bVar.f12921b;
        BytesTrie bytesTrie = new BytesTrie(bVar.f12922c, 0);
        this.f12913c = bytesTrie;
        this.f12918h = bVar.f12923d;
        bytesTrie.p(42);
        this.f12914d = bytesTrie.k();
        bytesTrie.p(42);
        this.f12915e = bytesTrie.k();
        bytesTrie.p(42);
        this.f12916f = bytesTrie.l();
        bytesTrie.s();
        for (char c4 = 'a'; c4 <= 'z'; c4 = (char) (c4 + 1)) {
            if (this.f12913c.p(c4) == BytesTrie.Result.NO_VALUE) {
                this.f12917g[c4 - 'a'] = this.f12913c.k();
            }
            this.f12913c.s();
        }
    }

    private static String b(Map map, String str) {
        String str2 = (String) map.get(str);
        if (str2 == null) {
            return str;
        }
        return str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int c(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "und"
            boolean r0 = r10.equals(r0)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x000b
            r10 = r1
        L_0x000b:
            java.lang.String r0 = "Zzzz"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0014
            r11 = r1
        L_0x0014:
            com.ibm.icu.util.BytesTrie r0 = new com.ibm.icu.util.BytesTrie
            com.ibm.icu.util.BytesTrie r2 = r9.f12913c
            r0.<init>(r2)
            int r2 = r10.length()
            r3 = 2
            r4 = 1
            r5 = 0
            r7 = 0
            if (r2 < r3) goto L_0x0043
            char r2 = r10.charAt(r7)
            int r2 = r2 + -97
            if (r2 < 0) goto L_0x0043
            r3 = 25
            if (r2 > r3) goto L_0x0043
            long[] r3 = r9.f12917g
            r2 = r3[r2]
            int r8 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x0043
            com.ibm.icu.util.BytesTrie r2 = r0.t(r2)
            int r10 = h(r2, r10, r4)
            goto L_0x0047
        L_0x0043:
            int r10 = h(r0, r10, r7)
        L_0x0047:
            if (r10 < 0) goto L_0x004e
            long r2 = r0.k()
            goto L_0x0054
        L_0x004e:
            long r2 = r9.f12914d
            r0.t(r2)
            r2 = r5
        L_0x0054:
            if (r10 <= 0) goto L_0x005a
            if (r10 != r4) goto L_0x0078
            r10 = r7
            goto L_0x0078
        L_0x005a:
            int r10 = h(r0, r11, r7)
            if (r10 < 0) goto L_0x0064
            r0.k()
            goto L_0x0078
        L_0x0064:
            int r11 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x006e
            long r2 = r9.f12915e
            r0.t(r2)
            goto L_0x0078
        L_0x006e:
            r0.t(r2)
            int r10 = h(r0, r1, r7)
            r0.k()
        L_0x0078:
            if (r10 <= 0) goto L_0x007b
            goto L_0x007f
        L_0x007b:
            int r10 = h(r0, r1, r7)
        L_0x007f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.locale.m.c(java.lang.String, java.lang.String):int");
    }

    private Map d() {
        TreeMap treeMap = new TreeMap();
        StringBuilder sb = new StringBuilder();
        BytesTrie.c n4 = this.f12913c.iterator();
        while (n4.hasNext()) {
            BytesTrie.b bVar = (BytesTrie.b) n4.next();
            int i4 = 0;
            sb.setLength(0);
            int h4 = bVar.h();
            while (i4 < h4) {
                int i5 = i4 + 1;
                byte g4 = bVar.g(i4);
                if (g4 == 42) {
                    sb.append("*-");
                } else if (g4 >= 0) {
                    sb.append((char) g4);
                } else {
                    sb.append((char) (g4 & Byte.MAX_VALUE));
                    sb.append('-');
                }
                i4 = i5;
            }
            sb.setLength(sb.length() - 1);
            treeMap.put(sb.toString(), this.f12918h[bVar.f13142a]);
        }
        return treeMap;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b6, code lost:
        if (r13.equals("PSACCENT") == false) goto L_0x00a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.ibm.icu.impl.locale.e e(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            int r2 = r12.length()
            r3 = 2
            java.lang.String r4 = "'"
            java.lang.String r5 = "+"
            r6 = 7
            java.lang.String r7 = ","
            if (r2 != r3) goto L_0x008c
            char r2 = r12.charAt(r1)
            r8 = 88
            if (r2 != r8) goto L_0x008c
            char r2 = r12.charAt(r0)
            switch(r2) {
                case 65: goto L_0x0068;
                case 66: goto L_0x0044;
                case 67: goto L_0x0020;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x008c
        L_0x0020:
            com.ibm.icu.impl.locale.e r13 = new com.ibm.icu.impl.locale.e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r13.<init>(r10, r11, r12, r6)
            return r13
        L_0x0044:
            com.ibm.icu.impl.locale.e r13 = new com.ibm.icu.impl.locale.e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r13.<init>(r10, r11, r12, r6)
            return r13
        L_0x0068:
            com.ibm.icu.impl.locale.e r13 = new com.ibm.icu.impl.locale.e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r13.<init>(r10, r11, r12, r6)
            return r13
        L_0x008c:
            java.lang.String r2 = "PS"
            boolean r2 = r13.startsWith(r2)
            if (r2 == 0) goto L_0x014c
            boolean r2 = r12.isEmpty()
            if (r2 == 0) goto L_0x009b
            r6 = 6
        L_0x009b:
            r2 = -1
            int r8 = r13.hashCode()
            switch(r8) {
                case -1925944433: goto L_0x00b9;
                case 264103053: goto L_0x00b0;
                case 426453367: goto L_0x00a5;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            r0 = r2
            goto L_0x00c3
        L_0x00a5:
            java.lang.String r0 = "PSCRACK"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00ae
            goto L_0x00a3
        L_0x00ae:
            r0 = r3
            goto L_0x00c3
        L_0x00b0:
            java.lang.String r1 = "PSACCENT"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00c3
            goto L_0x00a3
        L_0x00b9:
            java.lang.String r0 = "PSBIDI"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00c2
            goto L_0x00a3
        L_0x00c2:
            r0 = r1
        L_0x00c3:
            switch(r0) {
                case 0: goto L_0x0120;
                case 1: goto L_0x00f4;
                case 2: goto L_0x00c8;
                default: goto L_0x00c6;
            }
        L_0x00c6:
            goto L_0x014c
        L_0x00c8:
            com.ibm.icu.impl.locale.e r13 = new com.ibm.icu.impl.locale.e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x00f0
            java.lang.String r12 = "XC"
        L_0x00f0:
            r13.<init>(r10, r11, r12, r6)
            return r13
        L_0x00f4:
            com.ibm.icu.impl.locale.e r13 = new com.ibm.icu.impl.locale.e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x011c
            java.lang.String r12 = "XA"
        L_0x011c:
            r13.<init>(r10, r11, r12, r6)
            return r13
        L_0x0120:
            com.ibm.icu.impl.locale.e r13 = new com.ibm.icu.impl.locale.e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x0148
            java.lang.String r12 = "XB"
        L_0x0148:
            r13.<init>(r10, r11, r12, r6)
            return r13
        L_0x014c:
            java.util.Map r13 = r9.f12911a
            java.lang.String r10 = b(r13, r10)
            java.util.Map r13 = r9.f12912b
            java.lang.String r12 = b(r13, r12)
            com.ibm.icu.impl.locale.e r10 = r9.g(r10, r11, r12)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.locale.m.e(java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.ibm.icu.impl.locale.e");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c4, code lost:
        if (r6.isEmpty() == false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d3, code lost:
        if (r6.isEmpty() == false) goto L_0x00c6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.ibm.icu.impl.locale.e g(java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
            r15 = this;
            r0 = r15
            java.lang.String r1 = "und"
            r2 = r16
            boolean r3 = r2.equals(r1)
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x000e
            r2 = r4
        L_0x000e:
            java.lang.String r3 = "Zzzz"
            r5 = r17
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0019
            r5 = r4
        L_0x0019:
            java.lang.String r3 = "ZZ"
            r6 = r18
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0024
            r6 = r4
        L_0x0024:
            boolean r3 = r5.isEmpty()
            if (r3 != 0) goto L_0x003d
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto L_0x003d
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x003d
            com.ibm.icu.impl.locale.e r1 = new com.ibm.icu.impl.locale.e
            r3 = 7
            r1.<init>(r2, r5, r6, r3)
            return r1
        L_0x003d:
            com.ibm.icu.util.BytesTrie r3 = new com.ibm.icu.util.BytesTrie
            com.ibm.icu.util.BytesTrie r7 = r0.f12913c
            r3.<init>(r7)
            int r7 = r2.length()
            r8 = 0
            r10 = 2
            r11 = 1
            r12 = 0
            if (r7 < r10) goto L_0x006c
            char r7 = r2.charAt(r12)
            int r7 = r7 + -97
            if (r7 < 0) goto L_0x006c
            r10 = 25
            if (r7 > r10) goto L_0x006c
            long[] r10 = r0.f12917g
            r13 = r10[r7]
            int r7 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x006c
            com.ibm.icu.util.BytesTrie r7 = r3.t(r13)
            int r7 = h(r7, r2, r11)
            goto L_0x0070
        L_0x006c:
            int r7 = h(r3, r2, r12)
        L_0x0070:
            r10 = 4
            if (r7 < 0) goto L_0x0080
            boolean r13 = r2.isEmpty()
            if (r13 != 0) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r10 = r12
        L_0x007b:
            long r13 = r3.k()
            goto L_0x0086
        L_0x0080:
            long r13 = r0.f12914d
            r3.t(r13)
            r13 = r8
        L_0x0086:
            if (r7 <= 0) goto L_0x0094
            if (r7 != r11) goto L_0x008b
            r7 = r12
        L_0x008b:
            boolean r11 = r5.isEmpty()
            if (r11 != 0) goto L_0x00be
            r10 = r10 | 2
            goto L_0x00be
        L_0x0094:
            int r7 = h(r3, r5, r12)
            if (r7 < 0) goto L_0x00a7
            boolean r11 = r5.isEmpty()
            if (r11 != 0) goto L_0x00a2
            r10 = r10 | 2
        L_0x00a2:
            long r13 = r3.k()
            goto L_0x00be
        L_0x00a7:
            r10 = r10 | 2
            int r11 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r11 != 0) goto L_0x00b3
            long r8 = r0.f12915e
            r3.t(r8)
            goto L_0x00be
        L_0x00b3:
            r3.t(r13)
            int r7 = h(r3, r4, r12)
            long r13 = r3.k()
        L_0x00be:
            if (r7 <= 0) goto L_0x00c9
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto L_0x00e8
        L_0x00c6:
            r10 = r10 | 1
            goto L_0x00e8
        L_0x00c9:
            int r7 = h(r3, r6, r12)
            if (r7 < 0) goto L_0x00d6
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto L_0x00e8
            goto L_0x00c6
        L_0x00d6:
            r10 = r10 | 1
            r7 = 0
            int r7 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r7 != 0) goto L_0x00e1
            int r7 = r0.f12916f
            goto L_0x00e8
        L_0x00e1:
            r3.t(r13)
            int r7 = h(r3, r4, r12)
        L_0x00e8:
            com.ibm.icu.impl.locale.e[] r3 = r0.f12918h
            r3 = r3[r7]
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L_0x00f3
            goto L_0x00f4
        L_0x00f3:
            r1 = r2
        L_0x00f4:
            if (r10 != 0) goto L_0x00f7
            return r3
        L_0x00f7:
            r2 = r10 & 4
            if (r2 != 0) goto L_0x00fd
            java.lang.String r1 = r3.f12857a
        L_0x00fd:
            r2 = r10 & 2
            if (r2 != 0) goto L_0x0103
            java.lang.String r5 = r3.f12858b
        L_0x0103:
            r2 = r10 & 1
            if (r2 != 0) goto L_0x0109
            java.lang.String r6 = r3.f12859c
        L_0x0109:
            com.ibm.icu.impl.locale.e r2 = new com.ibm.icu.impl.locale.e
            r2.<init>(r1, r5, r6, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.locale.m.g(java.lang.String, java.lang.String, java.lang.String):com.ibm.icu.impl.locale.e");
    }

    private static final int h(BytesTrie bytesTrie, String str, int i4) {
        BytesTrie.Result result;
        if (!str.isEmpty()) {
            int length = str.length() - 1;
            while (true) {
                char charAt = str.charAt(i4);
                if (i4 >= length) {
                    result = bytesTrie.p(charAt | 128);
                    break;
                } else if (!bytesTrie.p(charAt).hasNext()) {
                    return -1;
                } else {
                    i4++;
                }
            }
        } else {
            result = bytesTrie.p(42);
        }
        int i5 = a.f12919a[result.ordinal()];
        if (i5 == 2) {
            return 0;
        }
        if (i5 == 3) {
            return 1;
        }
        if (i5 != 4) {
            return -1;
        }
        return bytesTrie.l();
    }

    /* access modifiers changed from: package-private */
    public int a(e eVar, e eVar2, int i4) {
        int i5;
        int i6;
        if (!eVar.f12857a.equals(eVar2.f12857a)) {
            return -4;
        }
        if (!eVar.f12858b.equals(eVar2.f12858b)) {
            if (i4 < 0 || (i4 & 2) != 0) {
                i6 = c(eVar.f12857a, "");
                i4 = i6 << 2;
            } else {
                i6 = i4 >> 2;
            }
            if (eVar.f12858b.equals(this.f12918h[i6].f12858b)) {
                return i4 | 1;
            }
            return i4 & -2;
        } else if (eVar.f12859c.equals(eVar2.f12859c)) {
            return i4 & -2;
        } else {
            if (i4 < 0 || (i4 & 2) == 0) {
                i5 = c(eVar.f12857a, eVar.f12859c);
                i4 = (i5 << 2) | 2;
            } else {
                i5 = i4 >> 2;
            }
            if (eVar.f12859c.equals(this.f12918h[i5].f12859c)) {
                return i4 | 1;
            }
            return i4 & -2;
        }
    }

    public e f(ULocale uLocale) {
        if (uLocale.getName().startsWith("@x=")) {
            return new e(uLocale.toLanguageTag(), "", "", 7);
        }
        return e(uLocale.getLanguage(), uLocale.getScript(), uLocale.getCountry(), uLocale.getVariant());
    }

    public String toString() {
        return d().toString();
    }
}
