package ch.icoaching.wrio.keyboard;

import i2.C0680a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C0718m;
import kotlin.collections.L;
import kotlin.coroutines.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.D;
import kotlinx.coroutines.flow.e;
import l2.g;

public final class DiacriticsStore {

    /* renamed from: j  reason: collision with root package name */
    public static final a f9950j = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final HashMap f9951k = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final D f9952a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C0680a f9953b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f9954c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f9955d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f9956e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f9957f = h();

    /* renamed from: g  reason: collision with root package name */
    private final Map f9958g = i();

    /* renamed from: h  reason: collision with root package name */
    private List f9959h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private List f9960i = C0718m.j();

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final String a(String str) {
            o.e(str, "word");
            StringBuilder sb = new StringBuilder();
            for (int i4 = 0; i4 < str.length(); i4++) {
                char charAt = str.charAt(i4);
                Object obj = (String) DiacriticsStore.f9951k.get(Character.valueOf(charAt));
                if (obj == null) {
                    obj = Character.valueOf(charAt);
                }
                sb.append(obj);
            }
            String sb2 = sb.toString();
            o.d(sb2, "toString(...)");
            return sb2;
        }

        private a() {
        }
    }

    public DiacriticsStore(D d4, C0680a aVar) {
        o.e(d4, "serviceScope");
        o.e(aVar, "defaultSharedPreferences");
        this.f9952a = d4;
        this.f9953b = aVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f9955d = linkedHashMap;
        this.f9956e = linkedHashMap;
        e(aVar.k0());
        n();
    }

    /* access modifiers changed from: private */
    public final void e(String str) {
        this.f9955d.clear();
        for (Character charValue : K.b(str)) {
            char lowerCase = Character.toLowerCase(charValue.charValue());
            String str2 = (String) f9951k.get(Character.valueOf(lowerCase));
            if (str2 == null) {
                str2 = String.valueOf(lowerCase);
            }
            Set set = (Set) this.f9956e.get(str2);
            if (set == null) {
                set = L.e();
            }
            Set E02 = C0718m.E0(set);
            E02.add(Character.valueOf(lowerCase));
            this.f9955d.put(str2, E02);
        }
    }

    private final void f(Map map) {
        for (List<M0.a> it : map.values()) {
            for (M0.a aVar : it) {
                String c4 = aVar.c();
                for (int i4 = 0; i4 < c4.length(); i4++) {
                    char charAt = c4.charAt(i4);
                    HashMap hashMap = f9951k;
                    if (!hashMap.containsKey(Character.valueOf(charAt))) {
                        hashMap.put(Character.valueOf(charAt), aVar.b());
                    }
                }
            }
        }
    }

    public static final String g(String str) {
        return f9950j.a(str);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0b85, code lost:
        r4 = r28;
        r11 = r31;
        r12 = r32;
        r6 = r33;
        r10 = r34;
        r9 = r39;
        r8 = r43;
        r0 = r62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0c78, code lost:
        r27 = r34;
        r22 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0cb7, code lost:
        r4 = r28;
        r11 = r31;
        r12 = r32;
        r10 = r34;
        r9 = r39;
        r0 = r62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0cc5, code lost:
        r14 = r26;
        r8.put(r12, kotlin.collections.C0718m.m(new M0.a("a", "àâæ", "ÀÂÆ"), new M0.a(r10, r5, r0), new M0.a("e", "éèêë", "ÉÈÊË"), new M0.a(r7, "ïî", "ÏÎ"), new M0.a("o", "ôœ", "ÔŒ"), new M0.a("u", "ùûü", "ÙÛÜ"), new M0.a(r14, "ÿ", "Ÿ")));
        r29 = r3;
        r6 = r8;
        r30 = r9;
        r25 = r13;
        r13 = r14;
        r11 = r28;
        r26 = r31;
        r23 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0d80, code lost:
        r26 = r7;
        r6 = r8;
        r30 = r9;
        r25 = r13;
        r13 = r14;
        r11 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0151, code lost:
        if (r14.equals("fr-ch") == false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0f5f, code lost:
        r7 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0f60, code lost:
        r3 = r63;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0fad, code lost:
        r11 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0faf, code lost:
        r13 = r63;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0154, code lost:
        r24 = r5;
        r19 = r6;
        r43 = r8;
        r34 = r10;
        r31 = r11;
        r32 = r12;
        r8 = r13;
        r12 = r14;
        r3 = r23;
        r62 = r27;
        r28 = r30;
        r5 = r39;
        r0 = r40;
        r10 = r41;
        r13 = r7;
        r39 = r9;
        r9 = r22;
        r7 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x106f, code lost:
        r8 = r43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x1071, code lost:
        r0 = r62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x1166, code lost:
        r2 = r29;
        r1 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x017d, code lost:
        if (r14.equals("fr-ca") == false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x1320, code lost:
        r0 = r62;
        r13 = r6;
        r6 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x1327, code lost:
        r43 = r0;
        r25 = r3;
        r6.put(r8, kotlin.collections.C0718m.m(new M0.a("a", "ą", "Ą"), new M0.a(r10, "ć", "Ć"), new M0.a("e", "ę", "Ę"), new M0.a(r11, "ł", "Ł"), new M0.a(r9, "ń", "Ń"), new M0.a("o", r29, r30), new M0.a(r14, "ś", "Ś"), new M0.a(r12, "żź", "ŻŹ")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x13cf, code lost:
        r8 = r43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x01af, code lost:
        r24 = r5;
        r19 = r6;
        r25 = r7;
        r43 = r8;
        r6 = r13;
        r29 = r23;
        r13 = r26;
        r62 = r27;
        r27 = r10;
        r26 = r11;
        r23 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x01cb, code lost:
        r11 = r30;
        r30 = r22;
        r22 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x026d, code lost:
        r8 = r43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x02c3, code lost:
        r24 = r5;
        r25 = r19;
        r29 = r23;
        r62 = r27;
        r19 = r6;
        r27 = r10;
        r23 = r12;
        r6 = r13;
        r13 = r26;
        r26 = r11;
        r11 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x02e0, code lost:
        r30 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x02e2, code lost:
        r22 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x02f4, code lost:
        r7 = r19;
        r1 = r22;
        r2 = r23;
        r3 = r26;
        r0 = r27;
        r4 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0300, code lost:
        r9 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0561, code lost:
        r6 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0562, code lost:
        r25 = r19;
        r29 = r23;
        r13 = r26;
        r62 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x056a, code lost:
        r11 = r28;
        r24 = r30;
        r26 = r31;
        r23 = r32;
        r19 = r33;
        r27 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x00f2, code lost:
        r1 = r22;
        r2 = r23;
        r3 = r26;
        r0 = r27;
        r4 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x05a0, code lost:
        r13 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x05a1, code lost:
        r7 = r19;
        r1 = r22;
        r2 = r23;
        r3 = r26;
        r0 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x05ab, code lost:
        r4 = r28;
        r5 = r30;
        r11 = r31;
        r12 = r32;
        r6 = r33;
        r10 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x061b, code lost:
        if (r6.equals("pt") == false) goto L_0x05a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x061e, code lost:
        r12.put(r6, kotlin.collections.C0718m.m(new M0.a("a", "ãáàâ", "ÃÁÀÂ"), new M0.a(r10, r0, r8), new M0.a("e", "éê", "ÉÊ"), new M0.a(r7, r14, r5), new M0.a("o", "õóô", "ÕÓÔ"), new M0.a("u", "úü", "ÚÜ")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x06cf, code lost:
        r13 = r12;
        r7 = r19;
        r1 = r22;
        r2 = r23;
        r3 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0705, code lost:
        r25 = r19;
        r29 = r23;
        r13 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x072b, code lost:
        if (r6.equals("nl") == false) goto L_0x06cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x072e, code lost:
        r8 = r34;
        r13 = r39;
        r12.put(r6, kotlin.collections.C0718m.m(new M0.a("e", "éë", "ÉË"), new M0.a(r7, "ï", "Ï"), new M0.a("o", "óö", "ÓÖ"), new M0.a("u", r8, r13)));
        r62 = r0;
        r27 = r8;
        r6 = r12;
        r25 = r19;
        r29 = r23;
        r11 = r28;
        r24 = r30;
        r23 = r32;
        r19 = r33;
        r30 = r22;
        r22 = r13;
        r13 = r26;
        r26 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x08d9, code lost:
        r6 = r8;
        r62 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0915, code lost:
        r13 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0a05, code lost:
        r6 = r8;
        r13 = r9;
        r62 = r10;
        r25 = r19;
        r29 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0a33, code lost:
        r13 = r8;
        r3 = r9;
        r0 = r10;
        r7 = r19;
        r1 = r22;
        r2 = r23;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Map h() {
        /*
            r68 = this;
            java.lang.String r0 = "č"
            java.lang.String r1 = "Ó"
            java.lang.String r2 = "ó"
            java.lang.String r3 = "y"
            java.lang.String r4 = "l"
            java.lang.String r5 = "Đ"
            java.lang.String r6 = "đ"
            java.lang.String r7 = "Ñ"
            java.lang.String r8 = "ñ"
            java.lang.String r9 = "Ü"
            java.lang.String r10 = "ü"
            java.lang.String r11 = "Ö"
            java.lang.String r12 = "ö"
            r16 = 1
            r17 = 0
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            java.lang.String r60 = "vi"
            java.lang.String r61 = "custom"
            java.lang.String r18 = "af"
            java.lang.String r19 = "br"
            java.lang.String r20 = "ca"
            java.lang.String r21 = "cs"
            java.lang.String r22 = "da"
            java.lang.String r23 = "de"
            java.lang.String r24 = "de-ch"
            java.lang.String r25 = "en"
            java.lang.String r26 = "en-gb"
            java.lang.String r27 = "es"
            java.lang.String r28 = "et"
            java.lang.String r29 = "eu"
            java.lang.String r30 = "fi"
            java.lang.String r31 = "fil"
            java.lang.String r32 = "fr"
            java.lang.String r33 = "fr-ca"
            java.lang.String r34 = "fr-ch"
            java.lang.String r35 = "ga"
            java.lang.String r36 = "gl"
            java.lang.String r37 = "hr"
            java.lang.String r38 = "hin-en"
            java.lang.String r39 = "hu"
            java.lang.String r40 = "id"
            java.lang.String r41 = "is"
            java.lang.String r42 = "it"
            java.lang.String r43 = "lt"
            java.lang.String r44 = "lv"
            java.lang.String r45 = "ms"
            java.lang.String r46 = "nl"
            java.lang.String r47 = "nl-be"
            java.lang.String r48 = "no"
            java.lang.String r49 = "pl"
            java.lang.String r50 = "pl-qwertz"
            java.lang.String r51 = "pt"
            java.lang.String r52 = "pt-br"
            java.lang.String r53 = "ro"
            java.lang.String r54 = "sl"
            java.lang.String r55 = "sq"
            java.lang.String r56 = "sv"
            java.lang.String r57 = "sk"
            java.lang.String r58 = "sr"
            java.lang.String r59 = "tr"
            java.lang.String[] r18 = new java.lang.String[]{r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61}
            java.util.List r18 = kotlin.collections.C0718m.o(r18)
            java.util.Iterator r18 = r18.iterator()
        L_0x0087:
            boolean r19 = r18.hasNext()
            if (r19 == 0) goto L_0x1465
            java.lang.Object r19 = r18.next()
            r14 = r19
            java.lang.String r14 = (java.lang.String) r14
            int r19 = r14.hashCode()
            java.lang.String r15 = "Á"
            r22 = r1
            java.lang.String r1 = "á"
            r23 = r2
            java.lang.String r2 = "Ç"
            r24 = r1
            java.lang.String r1 = "ç"
            r25 = r15
            java.lang.String r15 = "Í"
            r26 = r3
            java.lang.String r3 = "í"
            r27 = r0
            java.lang.String r0 = "Ž"
            r28 = r3
            java.lang.String r3 = "ž"
            r29 = r15
            java.lang.String r15 = "Š"
            r30 = r4
            java.lang.String r4 = "š"
            r31 = r0
            java.lang.String r0 = "d"
            r32 = r3
            java.lang.String r3 = "z"
            r33 = r3
            java.lang.String r3 = "n"
            r34 = r4
            java.lang.String r4 = "É"
            r35 = r15
            java.lang.String r15 = "é"
            r36 = r4
            java.lang.String r4 = "s"
            r37 = r15
            java.lang.String r15 = "c"
            r38 = r4
            java.lang.String r4 = "i"
            r39 = r1
            java.lang.String r1 = "u"
            r40 = r2
            java.lang.String r2 = "e"
            r41 = r15
            java.lang.String r15 = "o"
            r42 = r4
            java.lang.String r4 = "a"
            switch(r19) {
                case -1349088399: goto L_0x1396;
                case -990373878: goto L_0x12e5;
                case 3109: goto L_0x1253;
                case 3152: goto L_0x11c8;
                case 3166: goto L_0x1129;
                case 3184: goto L_0x1023;
                case 3197: goto L_0x0fb3;
                case 3201: goto L_0x0f27;
                case 3246: goto L_0x0e84;
                case 3247: goto L_0x0de8;
                case 3248: goto L_0x0d8c;
                case 3267: goto L_0x0d2f;
                case 3276: goto L_0x0c85;
                case 3290: goto L_0x0bf8;
                case 3301: goto L_0x0b4d;
                case 3338: goto L_0x0ab4;
                case 3341: goto L_0x0a4b;
                case 3355: goto L_0x0a0f;
                case 3370: goto L_0x095e;
                case 3371: goto L_0x08de;
                case 3464: goto L_0x0856;
                case 3466: goto L_0x0789;
                case 3518: goto L_0x070d;
                case 3521: goto L_0x06ad;
                case 3580: goto L_0x0668;
                case 3588: goto L_0x05f5;
                case 3645: goto L_0x0580;
                case 3672: goto L_0x0451;
                case 3673: goto L_0x03e2;
                case 3678: goto L_0x0378;
                case 3679: goto L_0x032d;
                case 3683: goto L_0x02e6;
                case 3710: goto L_0x0255;
                case 3763: goto L_0x01eb;
                case 101385: goto L_0x01d4;
                case 95407409: goto L_0x0181;
                case 97641727: goto L_0x0177;
                case 97641734: goto L_0x014b;
                case 104851122: goto L_0x0128;
                case 106936505: goto L_0x00fd;
                default: goto L_0x00f2;
            }
        L_0x00f2:
            r1 = r22
            r2 = r23
            r3 = r26
            r0 = r27
            r4 = r30
            goto L_0x0087
        L_0x00fd:
            java.lang.String r0 = "pt-br"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0106
            goto L_0x00f2
        L_0x0106:
            r33 = r6
            r19 = r7
            r43 = r8
            r34 = r10
            r31 = r11
            r32 = r12
            r12 = r13
            r6 = r14
            r14 = r28
            r28 = r30
            r0 = r39
            r8 = r40
            r10 = r41
            r7 = r42
            r30 = r5
            r39 = r9
            r5 = r29
            goto L_0x061e
        L_0x0128:
            java.lang.String r0 = "nl-be"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0131
            goto L_0x00f2
        L_0x0131:
            r33 = r6
            r19 = r7
            r43 = r8
            r39 = r9
            r34 = r10
            r31 = r11
            r32 = r12
            r12 = r13
            r6 = r14
            r0 = r27
            r28 = r30
            r7 = r42
            r30 = r5
            goto L_0x072e
        L_0x014b:
            java.lang.String r0 = "fr-ch"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0154
            goto L_0x00f2
        L_0x0154:
            r24 = r5
            r19 = r6
            r43 = r8
            r34 = r10
            r31 = r11
            r32 = r12
            r8 = r13
            r12 = r14
            r3 = r23
            r62 = r27
            r28 = r30
            r5 = r39
            r0 = r40
            r10 = r41
            r13 = r7
            r39 = r9
            r9 = r22
            r7 = r42
            goto L_0x0cc5
        L_0x0177:
            java.lang.String r0 = "fr-ca"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0154
            goto L_0x00f2
        L_0x0181:
            java.lang.String r0 = "de-ch"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x018b
            goto L_0x00f2
        L_0x018b:
            M0.a r0 = new M0.a
            java.lang.String r2 = "ä"
            java.lang.String r3 = "Ä"
            r0.<init>(r4, r2, r3)
            M0.a r2 = new M0.a
            r2.<init>(r15, r12, r11)
            M0.a r3 = new M0.a
            r3.<init>(r1, r10, r9)
            r1 = 3
            M0.a[] r4 = new M0.a[r1]
            r4[r17] = r0
            r4[r16] = r2
            r0 = 2
            r4[r0] = r3
            java.util.List r0 = kotlin.collections.C0718m.m(r4)
            r13.put(r14, r0)
        L_0x01af:
            r24 = r5
            r19 = r6
            r25 = r7
            r43 = r8
            r6 = r13
            r29 = r23
            r13 = r26
            r62 = r27
            r0 = 8
            r2 = 2
            r3 = 3
            r4 = 4
            r5 = 5
            r7 = 6
            r27 = r10
            r26 = r11
            r23 = r12
        L_0x01cb:
            r11 = r30
            r30 = r22
            r22 = r9
        L_0x01d1:
            r9 = 7
            goto L_0x1451
        L_0x01d4:
            java.lang.String r0 = "fil"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x01de
            goto L_0x00f2
        L_0x01de:
            M0.a r0 = new M0.a
            r0.<init>(r3, r8, r7)
            java.util.List r0 = kotlin.collections.C0718m.e(r0)
            r13.put(r14, r0)
            goto L_0x01af
        L_0x01eb:
            java.lang.String r3 = "vi"
            boolean r3 = r14.equals(r3)
            if (r3 != 0) goto L_0x01f5
            goto L_0x00f2
        L_0x01f5:
            M0.a r3 = new M0.a
            r19 = r7
            java.lang.String r7 = "ăâ"
            r43 = r8
            java.lang.String r8 = "ĂÂ"
            r3.<init>(r4, r7, r8)
            M0.a r4 = new M0.a
            java.lang.String r7 = "ê"
            java.lang.String r8 = "Ê"
            r4.<init>(r2, r7, r8)
            M0.a r2 = new M0.a
            java.lang.String r7 = "ơô"
            java.lang.String r8 = "ƠÔ"
            r2.<init>(r15, r7, r8)
            M0.a r7 = new M0.a
            java.lang.String r8 = "ư"
            java.lang.String r15 = "Ư"
            r7.<init>(r1, r8, r15)
            M0.a r1 = new M0.a
            r1.<init>(r0, r6, r5)
            r0 = 5
            M0.a[] r8 = new M0.a[r0]
            r8[r17] = r3
            r8[r16] = r4
            r0 = 2
            r8[r0] = r2
            r0 = 3
            r8[r0] = r7
            r0 = 4
            r8[r0] = r1
            java.util.List r0 = kotlin.collections.C0718m.m(r8)
            r13.put(r14, r0)
            r24 = r5
            r25 = r19
            r29 = r23
            r62 = r27
            r0 = 8
            r2 = 2
            r3 = 3
            r4 = 4
            r5 = 5
            r7 = 6
            r19 = r6
            r27 = r10
            r23 = r12
            r6 = r13
            r13 = r26
            r26 = r11
            goto L_0x01cb
        L_0x0255:
            r19 = r7
            r43 = r8
            java.lang.String r0 = "tr"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0271
            r7 = r19
            r1 = r22
            r2 = r23
            r3 = r26
            r0 = r27
            r4 = r30
        L_0x026d:
            r8 = r43
            goto L_0x0087
        L_0x0271:
            M0.a r0 = new M0.a
            r0.<init>(r15, r12, r11)
            M0.a r2 = new M0.a
            java.lang.String r3 = "ı"
            java.lang.String r4 = "İ"
            r7 = r42
            r2.<init>(r7, r3, r4)
            M0.a r3 = new M0.a
            r3.<init>(r1, r10, r9)
            M0.a r1 = new M0.a
            r4 = r39
            r8 = r40
            r7 = r41
            r1.<init>(r7, r4, r8)
            M0.a r4 = new M0.a
            java.lang.String r7 = "ğ"
            java.lang.String r8 = "Ğ"
            java.lang.String r15 = "g"
            r4.<init>(r15, r7, r8)
            M0.a r7 = new M0.a
            java.lang.String r8 = "ş"
            java.lang.String r15 = "Ş"
            r39 = r9
            r9 = r38
            r7.<init>(r9, r8, r15)
            r8 = 6
            M0.a[] r9 = new M0.a[r8]
            r9[r17] = r0
            r9[r16] = r2
            r0 = 2
            r9[r0] = r3
            r0 = 3
            r9[r0] = r1
            r0 = 4
            r9[r0] = r4
            r0 = 5
            r9[r0] = r7
            java.util.List r0 = kotlin.collections.C0718m.m(r9)
            r13.put(r14, r0)
        L_0x02c3:
            r24 = r5
            r25 = r19
            r29 = r23
            r62 = r27
            r0 = 8
            r2 = 2
            r3 = 3
            r4 = 4
            r5 = 5
            r7 = 6
            r9 = 7
            r19 = r6
            r27 = r10
            r23 = r12
            r6 = r13
            r13 = r26
            r26 = r11
            r11 = r30
        L_0x02e0:
            r30 = r22
        L_0x02e2:
            r22 = r39
            goto L_0x1451
        L_0x02e6:
            r19 = r7
            r43 = r8
            r39 = r9
            java.lang.String r0 = "sv"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0304
        L_0x02f4:
            r7 = r19
            r1 = r22
            r2 = r23
            r3 = r26
            r0 = r27
            r4 = r30
        L_0x0300:
            r9 = r39
            goto L_0x026d
        L_0x0304:
            M0.a r0 = new M0.a
            java.lang.String r1 = "äå"
            java.lang.String r3 = "ÄÅ"
            r0.<init>(r4, r1, r3)
            M0.a r1 = new M0.a
            r8 = r36
            r3 = r37
            r1.<init>(r2, r3, r8)
            M0.a r2 = new M0.a
            r2.<init>(r15, r12, r11)
            r3 = 3
            M0.a[] r4 = new M0.a[r3]
            r4[r17] = r0
            r4[r16] = r1
            r0 = 2
            r4[r0] = r2
            java.util.List r0 = kotlin.collections.C0718m.m(r4)
            r13.put(r14, r0)
            goto L_0x02c3
        L_0x032d:
            r19 = r7
            r43 = r8
            r39 = r9
            r9 = r38
            r7 = r41
            java.lang.String r1 = "sr"
            boolean r1 = r14.equals(r1)
            if (r1 != 0) goto L_0x0340
            goto L_0x02f4
        L_0x0340:
            M0.a r1 = new M0.a
            java.lang.String r2 = "čć"
            java.lang.String r3 = "ČĆ"
            r1.<init>(r7, r2, r3)
            M0.a r2 = new M0.a
            r2.<init>(r0, r6, r5)
            M0.a r0 = new M0.a
            r4 = r34
            r3 = r35
            r0.<init>(r9, r4, r3)
            M0.a r3 = new M0.a
            r8 = r31
            r15 = r32
            r4 = r33
            r3.<init>(r4, r15, r8)
            r4 = 4
            M0.a[] r7 = new M0.a[r4]
            r7[r17] = r1
            r7[r16] = r2
            r1 = 2
            r7[r1] = r0
            r0 = 3
            r7[r0] = r3
            java.util.List r0 = kotlin.collections.C0718m.m(r7)
            r13.put(r14, r0)
            goto L_0x02c3
        L_0x0378:
            r19 = r7
            r43 = r8
            r4 = r39
            r8 = r40
            r7 = r41
            r39 = r9
            java.lang.String r1 = "sq"
            boolean r1 = r14.equals(r1)
            if (r1 != 0) goto L_0x038e
            goto L_0x02f4
        L_0x038e:
            M0.a r1 = new M0.a
            java.lang.String r3 = "ë"
            java.lang.String r9 = "Ë"
            r1.<init>(r2, r3, r9)
            M0.a r2 = new M0.a
            r2.<init>(r7, r4, r8)
            M0.a r3 = new M0.a
            r3.<init>(r0, r6, r5)
            M0.a r0 = new M0.a
            java.lang.String r4 = "ɫ"
            java.lang.String r7 = "Ɫ"
            r8 = r30
            r0.<init>(r8, r4, r7)
            r4 = 4
            M0.a[] r7 = new M0.a[r4]
            r7[r17] = r1
            r7[r16] = r2
            r1 = 2
            r7[r1] = r3
            r1 = 3
            r7[r1] = r0
            java.util.List r0 = kotlin.collections.C0718m.m(r7)
            r13.put(r14, r0)
            r24 = r5
            r25 = r19
            r30 = r22
            r29 = r23
            r62 = r27
            r22 = r39
            r0 = 8
            r2 = 2
            r3 = 3
            r4 = 4
            r5 = 5
            r7 = 6
            r9 = 7
            r19 = r6
            r27 = r10
            r23 = r12
            r6 = r13
            r13 = r26
            r26 = r11
            r11 = r8
            goto L_0x1451
        L_0x03e2:
            r19 = r7
            r43 = r8
            r39 = r9
            r8 = r31
            r15 = r32
            r1 = r33
            r4 = r34
            r3 = r35
            r9 = r38
            r7 = r41
            java.lang.String r2 = "sl"
            boolean r2 = r14.equals(r2)
            if (r2 != 0) goto L_0x0400
            goto L_0x02f4
        L_0x0400:
            M0.a r2 = new M0.a
            r31 = r11
            java.lang.String r11 = "čç"
            r32 = r12
            java.lang.String r12 = "ČÇ"
            r2.<init>(r7, r11, r12)
            M0.a r7 = new M0.a
            r7.<init>(r0, r6, r5)
            M0.a r0 = new M0.a
            r0.<init>(r9, r4, r3)
            M0.a r3 = new M0.a
            r3.<init>(r1, r15, r8)
            r1 = 4
            M0.a[] r4 = new M0.a[r1]
            r4[r17] = r2
            r4[r16] = r7
            r1 = 2
            r4[r1] = r0
            r0 = 3
            r4[r0] = r3
            java.util.List r0 = kotlin.collections.C0718m.m(r4)
            r13.put(r14, r0)
            r24 = r5
            r25 = r19
            r29 = r23
            r62 = r27
            r11 = r30
            r23 = r32
            r0 = 8
            r2 = 2
            r3 = 3
            r4 = 4
            r5 = 5
            r7 = 6
            r9 = 7
            r19 = r6
            r27 = r10
            r6 = r13
            r30 = r22
            r13 = r26
            r26 = r31
            goto L_0x02e2
        L_0x0451:
            r19 = r7
            r43 = r8
            r39 = r9
            r25 = r31
            r24 = r33
            r8 = r36
            r9 = r38
            r7 = r42
            r33 = r6
            r31 = r11
            r11 = r30
            r36 = r32
            r6 = r34
            r30 = r5
            r34 = r10
            r32 = r12
            r5 = r35
            r10 = r41
            r35 = r13
            r13 = r37
            java.lang.String r12 = "sk"
            boolean r12 = r14.equals(r12)
            if (r12 != 0) goto L_0x049a
            r4 = r11
            r7 = r19
            r1 = r22
            r2 = r23
            r3 = r26
            r0 = r27
            r5 = r30
            r11 = r31
            r12 = r32
            r6 = r33
            r10 = r34
            r13 = r35
            goto L_0x0300
        L_0x049a:
            M0.a r12 = new M0.a
            r37 = r14
            java.lang.String r14 = "áä"
            r38 = r5
            java.lang.String r5 = "ÁÄ"
            r12.<init>(r4, r14, r5)
            M0.a r4 = new M0.a
            r4.<init>(r2, r13, r8)
            M0.a r2 = new M0.a
            r14 = r28
            r5 = r29
            r2.<init>(r7, r14, r5)
            M0.a r5 = new M0.a
            java.lang.String r7 = "óô"
            java.lang.String r8 = "ÓÔ"
            r5.<init>(r15, r7, r8)
            M0.a r7 = new M0.a
            java.lang.String r8 = "ú"
            java.lang.String r13 = "Ú"
            r7.<init>(r1, r8, r13)
            M0.a r1 = new M0.a
            java.lang.String r8 = "Č"
            r13 = r27
            r1.<init>(r10, r13, r8)
            M0.a r8 = new M0.a
            java.lang.String r10 = "ď"
            java.lang.String r14 = "Ď"
            r8.<init>(r0, r10, r14)
            M0.a r0 = new M0.a
            java.lang.String r10 = "ĺľ"
            java.lang.String r14 = "ĹĽ"
            r0.<init>(r11, r10, r14)
            M0.a r10 = new M0.a
            java.lang.String r14 = "ň"
            java.lang.String r15 = "Ň"
            r10.<init>(r3, r14, r15)
            M0.a r3 = new M0.a
            java.lang.String r14 = "ŕ"
            java.lang.String r15 = "Ŕ"
            java.lang.String r13 = "r"
            r3.<init>(r13, r14, r15)
            M0.a r13 = new M0.a
            r14 = r38
            r13.<init>(r9, r6, r14)
            M0.a r6 = new M0.a
            java.lang.String r9 = "ť"
            java.lang.String r14 = "Ť"
            java.lang.String r15 = "t"
            r6.<init>(r15, r9, r14)
            M0.a r9 = new M0.a
            java.lang.String r14 = "ý"
            java.lang.String r15 = "Ý"
            r28 = r11
            r11 = r26
            r9.<init>(r11, r14, r15)
            M0.a r14 = new M0.a
            r15 = r25
            r11 = r36
            r67 = r24
            r24 = r9
            r9 = r67
            r14.<init>(r9, r11, r15)
            r9 = 14
            M0.a[] r9 = new M0.a[r9]
            r9[r17] = r12
            r9[r16] = r4
            r4 = 2
            r9[r4] = r2
            r2 = 3
            r9[r2] = r5
            r2 = 4
            r9[r2] = r7
            r2 = 5
            r9[r2] = r1
            r1 = 6
            r9[r1] = r8
            r1 = 7
            r9[r1] = r0
            r0 = 8
            r9[r0] = r10
            r0 = 9
            r9[r0] = r3
            r0 = 10
            r9[r0] = r13
            r0 = 11
            r9[r0] = r6
            r0 = 12
            r9[r0] = r24
            r0 = 13
            r9[r0] = r14
            java.util.List r0 = kotlin.collections.C0718m.m(r9)
            r12 = r35
            r6 = r37
            r12.put(r6, r0)
        L_0x0561:
            r6 = r12
        L_0x0562:
            r25 = r19
            r29 = r23
            r13 = r26
            r62 = r27
        L_0x056a:
            r11 = r28
            r24 = r30
            r26 = r31
            r23 = r32
            r19 = r33
            r27 = r34
            r0 = 8
            r2 = 2
            r3 = 3
            r4 = 4
            r5 = 5
            r7 = 6
            r9 = 7
            goto L_0x02e0
        L_0x0580:
            r33 = r6
            r19 = r7
            r43 = r8
            r39 = r9
            r34 = r10
            r31 = r11
            r32 = r12
            r12 = r13
            r6 = r14
            r28 = r30
            r7 = r42
            r30 = r5
            r5 = r38
            java.lang.String r0 = "ro"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x05b9
        L_0x05a0:
            r13 = r12
        L_0x05a1:
            r7 = r19
            r1 = r22
            r2 = r23
            r3 = r26
            r0 = r27
        L_0x05ab:
            r4 = r28
            r5 = r30
            r11 = r31
            r12 = r32
            r6 = r33
            r10 = r34
            goto L_0x0300
        L_0x05b9:
            M0.a r0 = new M0.a
            java.lang.String r1 = "ăâ"
            java.lang.String r2 = "ĂÂ"
            r0.<init>(r4, r1, r2)
            M0.a r1 = new M0.a
            java.lang.String r2 = "î"
            java.lang.String r3 = "Î"
            r1.<init>(r7, r2, r3)
            M0.a r2 = new M0.a
            java.lang.String r3 = "ș"
            java.lang.String r4 = "Ș"
            r2.<init>(r5, r3, r4)
            M0.a r3 = new M0.a
            java.lang.String r4 = "ț"
            java.lang.String r5 = "Ț"
            java.lang.String r7 = "t"
            r3.<init>(r7, r4, r5)
            r4 = 4
            M0.a[] r5 = new M0.a[r4]
            r5[r17] = r0
            r5[r16] = r1
            r0 = 2
            r5[r0] = r2
            r0 = 3
            r5[r0] = r3
            java.util.List r0 = kotlin.collections.C0718m.m(r5)
            r12.put(r6, r0)
            goto L_0x0561
        L_0x05f5:
            r33 = r6
            r19 = r7
            r43 = r8
            r34 = r10
            r31 = r11
            r32 = r12
            r12 = r13
            r6 = r14
            r14 = r28
            r28 = r30
            r0 = r39
            r8 = r40
            r10 = r41
            r7 = r42
            r30 = r5
            r39 = r9
            r5 = r29
            java.lang.String r3 = "pt"
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x061e
            goto L_0x05a0
        L_0x061e:
            M0.a r3 = new M0.a
            java.lang.String r9 = "ãáàâ"
            java.lang.String r11 = "ÃÁÀÂ"
            r3.<init>(r4, r9, r11)
            M0.a r4 = new M0.a
            r4.<init>(r10, r0, r8)
            M0.a r0 = new M0.a
            java.lang.String r8 = "éê"
            java.lang.String r9 = "ÉÊ"
            r0.<init>(r2, r8, r9)
            M0.a r2 = new M0.a
            r2.<init>(r7, r14, r5)
            M0.a r5 = new M0.a
            java.lang.String r7 = "õóô"
            java.lang.String r8 = "ÕÓÔ"
            r5.<init>(r15, r7, r8)
            M0.a r7 = new M0.a
            java.lang.String r8 = "úü"
            java.lang.String r9 = "ÚÜ"
            r7.<init>(r1, r8, r9)
            r1 = 6
            M0.a[] r8 = new M0.a[r1]
            r8[r17] = r3
            r8[r16] = r4
            r1 = 2
            r8[r1] = r0
            r0 = 3
            r8[r0] = r2
            r0 = 4
            r8[r0] = r5
            r0 = 5
            r8[r0] = r7
            java.util.List r0 = kotlin.collections.C0718m.m(r8)
            r12.put(r6, r0)
            goto L_0x0561
        L_0x0668:
            r19 = r7
            r43 = r8
            r39 = r9
            r34 = r10
            r31 = r11
            r32 = r12
            r12 = r13
            r28 = r30
            r9 = r33
            r10 = r41
            r30 = r5
            r33 = r6
            r6 = r14
            r5 = r38
            java.lang.String r0 = "pl"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x068c
            goto L_0x05a0
        L_0x068c:
            r14 = r5
            r8 = r6
            r6 = r12
            r29 = r23
            r13 = r26
            r62 = r27
            r11 = r28
            r24 = r30
            r26 = r31
            r23 = r32
            r27 = r34
            r0 = r43
            r12 = r9
            r30 = r22
            r22 = r39
            r9 = r3
            r3 = r19
            r19 = r33
            goto L_0x1327
        L_0x06ad:
            r33 = r6
            r19 = r7
            r43 = r8
            r39 = r9
            r34 = r10
            r31 = r11
            r32 = r12
            r12 = r13
            r6 = r14
            r0 = r27
            r28 = r30
            r8 = r36
            r13 = r37
            r30 = r5
            java.lang.String r1 = "no"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L_0x06da
        L_0x06cf:
            r13 = r12
            r7 = r19
            r1 = r22
            r2 = r23
            r3 = r26
            goto L_0x05ab
        L_0x06da:
            M0.a r1 = new M0.a
            java.lang.String r3 = "åæ"
            java.lang.String r5 = "ÅÆ"
            r1.<init>(r4, r3, r5)
            M0.a r3 = new M0.a
            r3.<init>(r2, r13, r8)
            M0.a r2 = new M0.a
            java.lang.String r4 = "ø"
            java.lang.String r5 = "Ø"
            r2.<init>(r15, r4, r5)
            r4 = 3
            M0.a[] r5 = new M0.a[r4]
            r5[r17] = r1
            r5[r16] = r3
            r1 = 2
            r5[r1] = r2
            java.util.List r1 = kotlin.collections.C0718m.m(r5)
            r12.put(r6, r1)
            r62 = r0
            r6 = r12
        L_0x0705:
            r25 = r19
            r29 = r23
            r13 = r26
            goto L_0x056a
        L_0x070d:
            r33 = r6
            r19 = r7
            r43 = r8
            r39 = r9
            r34 = r10
            r31 = r11
            r32 = r12
            r12 = r13
            r6 = r14
            r0 = r27
            r28 = r30
            r7 = r42
            r30 = r5
            java.lang.String r3 = "nl"
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x072e
            goto L_0x06cf
        L_0x072e:
            M0.a r3 = new M0.a
            java.lang.String r4 = "éë"
            java.lang.String r5 = "ÉË"
            r3.<init>(r2, r4, r5)
            M0.a r2 = new M0.a
            java.lang.String r4 = "ï"
            java.lang.String r5 = "Ï"
            r2.<init>(r7, r4, r5)
            M0.a r4 = new M0.a
            java.lang.String r5 = "óö"
            java.lang.String r7 = "ÓÖ"
            r4.<init>(r15, r5, r7)
            M0.a r5 = new M0.a
            r8 = r34
            r13 = r39
            r5.<init>(r1, r8, r13)
            r1 = 4
            M0.a[] r7 = new M0.a[r1]
            r7[r17] = r3
            r7[r16] = r2
            r1 = 2
            r7[r1] = r4
            r1 = 3
            r7[r1] = r5
            java.util.List r1 = kotlin.collections.C0718m.m(r7)
            r12.put(r6, r1)
            r62 = r0
            r27 = r8
            r6 = r12
            r25 = r19
            r29 = r23
            r11 = r28
            r24 = r30
            r23 = r32
            r19 = r33
            r0 = 8
            r2 = 2
            r3 = 3
            r4 = 4
            r5 = 5
            r7 = 6
            r9 = 7
            r30 = r22
            r22 = r13
            r13 = r26
            r26 = r31
            goto L_0x1451
        L_0x0789:
            r19 = r7
            r43 = r8
            r39 = r9
            r8 = r14
            r0 = r27
            r28 = r30
            r15 = r31
            r9 = r33
            r14 = r35
            r7 = r42
            r30 = r5
            r33 = r6
            r31 = r11
            r11 = r32
            r6 = r34
            r5 = r38
            r34 = r10
            r32 = r12
            r12 = r13
            r10 = r41
            java.lang.String r13 = "lv"
            boolean r13 = r8.equals(r13)
            if (r13 != 0) goto L_0x07b9
            goto L_0x06cf
        L_0x07b9:
            M0.a r13 = new M0.a
            r37 = r8
            java.lang.String r8 = "ā"
            r35 = r12
            java.lang.String r12 = "Ā"
            r13.<init>(r4, r8, r12)
            M0.a r4 = new M0.a
            java.lang.String r8 = "ē"
            java.lang.String r12 = "Ē"
            r4.<init>(r2, r8, r12)
            M0.a r2 = new M0.a
            java.lang.String r8 = "ī"
            java.lang.String r12 = "Ī"
            r2.<init>(r7, r8, r12)
            M0.a r7 = new M0.a
            java.lang.String r8 = "ū"
            java.lang.String r12 = "Ū"
            r7.<init>(r1, r8, r12)
            M0.a r1 = new M0.a
            java.lang.String r8 = "Č"
            r1.<init>(r10, r0, r8)
            M0.a r8 = new M0.a
            java.lang.String r10 = "ģ"
            java.lang.String r12 = "Ģ"
            r27 = r0
            java.lang.String r0 = "g"
            r8.<init>(r0, r10, r12)
            M0.a r0 = new M0.a
            java.lang.String r10 = "ķ"
            java.lang.String r12 = "Ķ"
            r24 = r8
            java.lang.String r8 = "k"
            r0.<init>(r8, r10, r12)
            M0.a r8 = new M0.a
            java.lang.String r10 = "ļ"
            java.lang.String r12 = "Ļ"
            r25 = r0
            r0 = r28
            r8.<init>(r0, r10, r12)
            M0.a r10 = new M0.a
            java.lang.String r12 = "ņ"
            java.lang.String r0 = "Ņ"
            r10.<init>(r3, r12, r0)
            M0.a r0 = new M0.a
            r0.<init>(r5, r6, r14)
            M0.a r3 = new M0.a
            r3.<init>(r9, r11, r15)
            r5 = 11
            M0.a[] r5 = new M0.a[r5]
            r5[r17] = r13
            r5[r16] = r4
            r4 = 2
            r5[r4] = r2
            r2 = 3
            r5[r2] = r7
            r2 = 4
            r5[r2] = r1
            r1 = 5
            r5[r1] = r24
            r1 = 6
            r5[r1] = r25
            r1 = 7
            r5[r1] = r8
            r1 = 8
            r5[r1] = r10
            r1 = 9
            r5[r1] = r0
            r0 = 10
            r5[r0] = r3
            java.util.List r0 = kotlin.collections.C0718m.m(r5)
            r8 = r35
            r12 = r37
            r8.put(r12, r0)
            r6 = r8
            goto L_0x0562
        L_0x0856:
            r19 = r7
            r43 = r8
            r39 = r9
            r8 = r13
            r28 = r30
            r15 = r31
            r9 = r33
            r7 = r42
            r30 = r5
            r33 = r6
            r31 = r11
            r11 = r32
            r6 = r34
            r5 = r38
            r34 = r10
            r32 = r12
            r12 = r14
            r14 = r35
            r10 = r41
            java.lang.String r0 = "lt"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0885
            r13 = r8
            goto L_0x05a1
        L_0x0885:
            M0.a r0 = new M0.a
            java.lang.String r3 = "ą"
            java.lang.String r13 = "Ą"
            r0.<init>(r4, r3, r13)
            M0.a r3 = new M0.a
            java.lang.String r4 = "ęė"
            java.lang.String r13 = "ĘĖ"
            r3.<init>(r2, r4, r13)
            M0.a r2 = new M0.a
            java.lang.String r4 = "į"
            java.lang.String r13 = "Į"
            r2.<init>(r7, r4, r13)
            M0.a r4 = new M0.a
            java.lang.String r7 = "ųū"
            java.lang.String r13 = "ŲŪ"
            r4.<init>(r1, r7, r13)
            M0.a r1 = new M0.a
            java.lang.String r7 = "Č"
            r13 = r27
            r1.<init>(r10, r13, r7)
            M0.a r7 = new M0.a
            r7.<init>(r5, r6, r14)
            M0.a r5 = new M0.a
            r5.<init>(r9, r11, r15)
            r6 = 7
            M0.a[] r9 = new M0.a[r6]
            r9[r17] = r0
            r9[r16] = r3
            r0 = 2
            r9[r0] = r2
            r0 = 3
            r9[r0] = r4
            r0 = 4
            r9[r0] = r1
            r0 = 5
            r9[r0] = r7
            r0 = 6
            r9[r0] = r5
            java.util.List r0 = kotlin.collections.C0718m.m(r9)
            r8.put(r12, r0)
        L_0x08d9:
            r6 = r8
            r62 = r13
            goto L_0x0705
        L_0x08de:
            r33 = r6
            r19 = r7
            r43 = r8
            r39 = r9
            r34 = r10
            r31 = r11
            r32 = r12
            r8 = r13
            r12 = r14
            r13 = r27
            r28 = r30
            r7 = r42
            r30 = r5
            java.lang.String r0 = "it"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0918
            r0 = r13
            r7 = r19
            r1 = r22
            r2 = r23
            r3 = r26
            r4 = r28
            r5 = r30
            r11 = r31
            r12 = r32
            r6 = r33
            r10 = r34
            r9 = r39
        L_0x0915:
            r13 = r8
            goto L_0x026d
        L_0x0918:
            M0.a r0 = new M0.a
            java.lang.String r3 = "à"
            java.lang.String r5 = "À"
            r0.<init>(r4, r3, r5)
            M0.a r3 = new M0.a
            java.lang.String r4 = "èé"
            java.lang.String r5 = "ÈÉ"
            r3.<init>(r2, r4, r5)
            M0.a r2 = new M0.a
            java.lang.String r4 = "ìí"
            java.lang.String r5 = "ÌÍ"
            r2.<init>(r7, r4, r5)
            M0.a r4 = new M0.a
            java.lang.String r5 = "òó"
            java.lang.String r6 = "ÒÓ"
            r4.<init>(r15, r5, r6)
            M0.a r5 = new M0.a
            java.lang.String r6 = "ù"
            java.lang.String r7 = "Ù"
            r5.<init>(r1, r6, r7)
            r1 = 5
            M0.a[] r6 = new M0.a[r1]
            r6[r17] = r0
            r6[r16] = r3
            r0 = 2
            r6[r0] = r2
            r0 = 3
            r6[r0] = r4
            r0 = 4
            r6[r0] = r5
            java.util.List r0 = kotlin.collections.C0718m.m(r6)
            r8.put(r12, r0)
            goto L_0x08d9
        L_0x095e:
            r33 = r6
            r19 = r7
            r43 = r8
            r3 = r10
            r31 = r11
            r32 = r12
            r8 = r13
            r12 = r14
            r10 = r27
            r14 = r28
            r28 = r30
            r6 = r36
            r13 = r37
            r7 = r42
            r30 = r5
            r5 = r29
            java.lang.String r11 = "is"
            boolean r11 = r12.equals(r11)
            if (r11 != 0) goto L_0x099c
            r13 = r8
            r0 = r10
            r7 = r19
            r1 = r22
            r2 = r23
            r4 = r28
            r5 = r30
            r11 = r31
            r12 = r32
            r6 = r33
            r8 = r43
            r10 = r3
            r3 = r26
            goto L_0x0087
        L_0x099c:
            M0.a r11 = new M0.a
            r34 = r3
            java.lang.String r3 = "æá"
            r39 = r9
            java.lang.String r9 = "ÆÁ"
            r11.<init>(r4, r3, r9)
            M0.a r3 = new M0.a
            r3.<init>(r2, r13, r6)
            M0.a r2 = new M0.a
            r2.<init>(r7, r14, r5)
            M0.a r4 = new M0.a
            java.lang.String r5 = "öó"
            java.lang.String r6 = "ÖÓ"
            r4.<init>(r15, r5, r6)
            M0.a r5 = new M0.a
            java.lang.String r6 = "ú"
            java.lang.String r7 = "Ú"
            r5.<init>(r1, r6, r7)
            M0.a r1 = new M0.a
            java.lang.String r6 = "ý"
            java.lang.String r7 = "Ý"
            r9 = r26
            r1.<init>(r9, r6, r7)
            M0.a r6 = new M0.a
            java.lang.String r7 = "ð"
            java.lang.String r13 = "Ð"
            r6.<init>(r0, r7, r13)
            M0.a r0 = new M0.a
            java.lang.String r7 = "þ"
            java.lang.String r13 = "Þ"
            java.lang.String r14 = "t"
            r0.<init>(r14, r7, r13)
            r7 = 8
            M0.a[] r13 = new M0.a[r7]
            r13[r17] = r11
            r13[r16] = r3
            r3 = 2
            r13[r3] = r2
            r2 = 3
            r13[r2] = r4
            r2 = 4
            r13[r2] = r5
            r2 = 5
            r13[r2] = r1
            r1 = 6
            r13[r1] = r6
            r1 = 7
            r13[r1] = r0
            java.util.List r0 = kotlin.collections.C0718m.m(r13)
            r8.put(r12, r0)
        L_0x0a05:
            r6 = r8
            r13 = r9
            r62 = r10
            r25 = r19
            r29 = r23
            goto L_0x056a
        L_0x0a0f:
            r33 = r6
            r19 = r7
            r43 = r8
            r39 = r9
            r34 = r10
            r31 = r11
            r32 = r12
            r8 = r13
            r12 = r14
            r9 = r26
            r10 = r27
            r28 = r30
            r6 = r36
            r13 = r37
            r30 = r5
            java.lang.String r0 = "id"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0a3e
        L_0x0a33:
            r13 = r8
            r3 = r9
            r0 = r10
            r7 = r19
            r1 = r22
            r2 = r23
            goto L_0x05ab
        L_0x0a3e:
            M0.a r0 = new M0.a
            r0.<init>(r2, r13, r6)
            java.util.List r0 = kotlin.collections.C0718m.e(r0)
            r8.put(r12, r0)
            goto L_0x0a05
        L_0x0a4b:
            r33 = r6
            r19 = r7
            r43 = r8
            r39 = r9
            r34 = r10
            r31 = r11
            r32 = r12
            r8 = r13
            r12 = r14
            r9 = r26
            r10 = r27
            r14 = r28
            r28 = r30
            r6 = r36
            r13 = r37
            r7 = r42
            r30 = r5
            r5 = r29
            java.lang.String r0 = "hu"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0a76
            goto L_0x0a33
        L_0x0a76:
            M0.a r0 = new M0.a
            r3 = r24
            r11 = r25
            r0.<init>(r4, r3, r11)
            M0.a r3 = new M0.a
            r3.<init>(r2, r13, r6)
            M0.a r2 = new M0.a
            r2.<init>(r7, r14, r5)
            M0.a r4 = new M0.a
            java.lang.String r5 = "óöő"
            java.lang.String r6 = "ÓÖŐ"
            r4.<init>(r15, r5, r6)
            M0.a r5 = new M0.a
            java.lang.String r6 = "úüű"
            java.lang.String r7 = "ÚÜŰ"
            r5.<init>(r1, r6, r7)
            r1 = 5
            M0.a[] r6 = new M0.a[r1]
            r6[r17] = r0
            r6[r16] = r3
            r0 = 2
            r6[r0] = r2
            r0 = 3
            r6[r0] = r4
            r0 = 4
            r6[r0] = r5
            java.util.List r0 = kotlin.collections.C0718m.m(r6)
            r8.put(r12, r0)
            goto L_0x0a05
        L_0x0ab4:
            r19 = r7
            r43 = r8
            r1 = r9
            r8 = r13
            r2 = r26
            r3 = r27
            r28 = r30
            r15 = r31
            r9 = r33
            r30 = r5
            r33 = r6
            r31 = r11
            r11 = r32
            r6 = r34
            r5 = r38
            r34 = r10
            r32 = r12
            r12 = r14
            r14 = r35
            r10 = r41
            java.lang.String r4 = "hr"
            boolean r4 = r12.equals(r4)
            if (r4 != 0) goto L_0x0afb
            r9 = r1
            r0 = r3
            r13 = r8
            r7 = r19
            r1 = r22
            r4 = r28
            r5 = r30
            r11 = r31
            r12 = r32
            r6 = r33
            r10 = r34
            r8 = r43
            r3 = r2
            r2 = r23
            goto L_0x0087
        L_0x0afb:
            M0.a r4 = new M0.a
            java.lang.String r7 = "čć"
            java.lang.String r13 = "ČĆ"
            r4.<init>(r10, r7, r13)
            M0.a r7 = new M0.a
            r13 = r30
            r10 = r33
            r7.<init>(r0, r10, r13)
            M0.a r0 = new M0.a
            r0.<init>(r5, r6, r14)
            M0.a r5 = new M0.a
            r5.<init>(r9, r11, r15)
            r6 = 4
            M0.a[] r9 = new M0.a[r6]
            r9[r17] = r4
            r9[r16] = r7
            r4 = 2
            r9[r4] = r0
            r0 = 3
            r9[r0] = r5
            java.util.List r0 = kotlin.collections.C0718m.m(r9)
            r8.put(r12, r0)
            r62 = r3
            r6 = r8
            r24 = r13
            r25 = r19
            r30 = r22
            r29 = r23
            r11 = r28
            r26 = r31
            r23 = r32
            r27 = r34
            r0 = 8
            r3 = 3
            r4 = 4
            r5 = 5
            r7 = 6
            r9 = 7
            r22 = r1
            r13 = r2
            r19 = r10
            r2 = 2
            goto L_0x1451
        L_0x0b4d:
            r33 = r6
            r19 = r7
            r43 = r8
            r39 = r9
            r34 = r10
            r31 = r11
            r32 = r12
            r8 = r13
            r12 = r14
            r0 = r24
            r11 = r25
            r9 = r26
            r62 = r27
            r14 = r28
            r28 = r30
            r6 = r36
            r13 = r37
            r7 = r42
            r24 = r5
            r5 = r29
            java.lang.String r10 = "gl"
            boolean r10 = r12.equals(r10)
            if (r10 != 0) goto L_0x0b97
            r13 = r8
            r3 = r9
            r7 = r19
            r1 = r22
            r2 = r23
            r5 = r24
        L_0x0b85:
            r4 = r28
            r11 = r31
            r12 = r32
            r6 = r33
            r10 = r34
            r9 = r39
            r8 = r43
            r0 = r62
            goto L_0x0087
        L_0x0b97:
            M0.a r10 = new M0.a
            r10.<init>(r4, r0, r11)
            M0.a r0 = new M0.a
            r0.<init>(r2, r13, r6)
            M0.a r2 = new M0.a
            r2.<init>(r7, r14, r5)
            M0.a r4 = new M0.a
            r6 = r22
            r5 = r23
            r4.<init>(r15, r5, r6)
            M0.a r7 = new M0.a
            java.lang.String r11 = "úü"
            java.lang.String r13 = "ÚÜ"
            r7.<init>(r1, r11, r13)
            M0.a r1 = new M0.a
            r13 = r19
            r11 = r43
            r1.<init>(r3, r11, r13)
            r3 = 6
            M0.a[] r14 = new M0.a[r3]
            r14[r17] = r10
            r14[r16] = r0
            r0 = 2
            r14[r0] = r2
            r0 = 3
            r14[r0] = r4
            r0 = 4
            r14[r0] = r7
            r0 = 5
            r14[r0] = r1
            java.util.List r0 = kotlin.collections.C0718m.m(r14)
            r8.put(r12, r0)
            r29 = r5
            r30 = r6
            r6 = r8
            r25 = r13
            r11 = r28
            r26 = r31
            r23 = r32
            r19 = r33
            r27 = r34
            r22 = r39
            r0 = 8
            r2 = 2
            r3 = 3
            r4 = 4
            r5 = 5
            r7 = 6
            r13 = r9
            goto L_0x01d1
        L_0x0bf8:
            r33 = r6
            r19 = r7
            r43 = r8
            r39 = r9
            r34 = r10
            r31 = r11
            r32 = r12
            r8 = r13
            r12 = r14
            r9 = r22
            r3 = r23
            r0 = r24
            r11 = r25
            r62 = r27
            r14 = r28
            r28 = r30
            r6 = r36
            r13 = r37
            r7 = r42
            r24 = r5
            r5 = r29
            java.lang.String r10 = "ga"
            boolean r10 = r12.equals(r10)
            if (r10 != 0) goto L_0x0c33
            r2 = r3
            r13 = r8
            r1 = r9
            r7 = r19
            r5 = r24
            r3 = r26
            goto L_0x0b85
        L_0x0c33:
            M0.a r10 = new M0.a
            r10.<init>(r4, r0, r11)
            M0.a r0 = new M0.a
            r0.<init>(r2, r13, r6)
            M0.a r2 = new M0.a
            r2.<init>(r7, r14, r5)
            M0.a r4 = new M0.a
            r4.<init>(r15, r3, r9)
            M0.a r5 = new M0.a
            java.lang.String r6 = "ú"
            java.lang.String r7 = "Ú"
            r5.<init>(r1, r6, r7)
            r1 = 5
            M0.a[] r6 = new M0.a[r1]
            r6[r17] = r10
            r6[r16] = r0
            r0 = 2
            r6[r0] = r2
            r0 = 3
            r6[r0] = r4
            r0 = 4
            r6[r0] = r5
            java.util.List r0 = kotlin.collections.C0718m.m(r6)
            r8.put(r12, r0)
            r29 = r3
            r6 = r8
            r30 = r9
            r25 = r19
            r13 = r26
            r11 = r28
            r26 = r31
            r23 = r32
            r19 = r33
        L_0x0c78:
            r27 = r34
            r22 = r39
        L_0x0c7c:
            r0 = 8
            r2 = 2
            r3 = 3
            r4 = 4
            r5 = 5
            r7 = 6
            goto L_0x01d1
        L_0x0c85:
            r24 = r5
            r19 = r6
            r43 = r8
            r34 = r10
            r31 = r11
            r32 = r12
            r8 = r13
            r12 = r14
            r3 = r23
            r62 = r27
            r28 = r30
            r5 = r39
            r0 = r40
            r10 = r41
            r13 = r7
            r39 = r9
            r9 = r22
            r7 = r42
            java.lang.String r6 = "fr"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x0cc5
            r2 = r3
            r1 = r9
            r7 = r13
            r6 = r19
            r5 = r24
            r3 = r26
        L_0x0cb7:
            r4 = r28
            r11 = r31
            r12 = r32
            r10 = r34
            r9 = r39
            r0 = r62
            goto L_0x0915
        L_0x0cc5:
            M0.a r6 = new M0.a
            java.lang.String r11 = "àâæ"
            java.lang.String r14 = "ÀÂÆ"
            r6.<init>(r4, r11, r14)
            M0.a r4 = new M0.a
            r4.<init>(r10, r5, r0)
            M0.a r0 = new M0.a
            java.lang.String r5 = "éèêë"
            java.lang.String r10 = "ÉÈÊË"
            r0.<init>(r2, r5, r10)
            M0.a r2 = new M0.a
            java.lang.String r5 = "ïî"
            java.lang.String r10 = "ÏÎ"
            r2.<init>(r7, r5, r10)
            M0.a r5 = new M0.a
            java.lang.String r7 = "ôœ"
            java.lang.String r10 = "ÔŒ"
            r5.<init>(r15, r7, r10)
            M0.a r7 = new M0.a
            java.lang.String r10 = "ùûü"
            java.lang.String r11 = "ÙÛÜ"
            r7.<init>(r1, r10, r11)
            M0.a r1 = new M0.a
            java.lang.String r10 = "ÿ"
            java.lang.String r11 = "Ÿ"
            r14 = r26
            r1.<init>(r14, r10, r11)
            r10 = 7
            M0.a[] r11 = new M0.a[r10]
            r11[r17] = r6
            r11[r16] = r4
            r4 = 2
            r11[r4] = r0
            r0 = 3
            r11[r0] = r2
            r0 = 4
            r11[r0] = r5
            r0 = 5
            r11[r0] = r7
            r0 = 6
            r11[r0] = r1
            java.util.List r0 = kotlin.collections.C0718m.m(r11)
            r8.put(r12, r0)
            r29 = r3
            r6 = r8
            r30 = r9
            r25 = r13
            r13 = r14
            r11 = r28
            r26 = r31
            r23 = r32
            goto L_0x0c78
        L_0x0d2f:
            r24 = r5
            r19 = r6
            r43 = r8
            r39 = r9
            r34 = r10
            r31 = r11
            r32 = r12
            r8 = r13
            r12 = r14
            r9 = r22
            r3 = r23
            r14 = r26
            r62 = r27
            r28 = r30
            r13 = r7
            java.lang.String r0 = "fi"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0d5c
            r2 = r3
            r1 = r9
            r7 = r13
            r3 = r14
            r6 = r19
            r5 = r24
            goto L_0x0cb7
        L_0x0d5c:
            M0.a r0 = new M0.a
            java.lang.String r1 = "äå"
            java.lang.String r2 = "ÄÅ"
            r0.<init>(r4, r1, r2)
            M0.a r1 = new M0.a
            r7 = r31
            r2 = r32
            r1.<init>(r15, r2, r7)
            r4 = 2
            M0.a[] r5 = new M0.a[r4]
            r5[r17] = r0
            r5[r16] = r1
            java.util.List r0 = kotlin.collections.C0718m.m(r5)
            r8.put(r12, r0)
            r23 = r2
            r29 = r3
        L_0x0d80:
            r26 = r7
            r6 = r8
            r30 = r9
            r25 = r13
            r13 = r14
            r11 = r28
            goto L_0x0c78
        L_0x0d8c:
            r1 = r3
            r24 = r5
            r19 = r6
            r4 = r8
            r34 = r10
            r2 = r12
            r8 = r13
            r12 = r14
            r3 = r23
            r14 = r26
            r62 = r27
            r28 = r30
            r5 = r39
            r0 = r40
            r10 = r41
            r13 = r7
            r39 = r9
            r7 = r11
            r9 = r22
            java.lang.String r6 = "eu"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x0dc9
            r12 = r2
            r2 = r3
            r11 = r7
            r1 = r9
            r7 = r13
            r3 = r14
            r6 = r19
            r5 = r24
            r10 = r34
            r9 = r39
            r0 = r62
            r13 = r8
            r8 = r4
            r4 = r28
            goto L_0x0087
        L_0x0dc9:
            M0.a r6 = new M0.a
            r6.<init>(r1, r4, r13)
            M0.a r1 = new M0.a
            r1.<init>(r10, r5, r0)
            r0 = 2
            M0.a[] r5 = new M0.a[r0]
            r5[r17] = r6
            r5[r16] = r1
            java.util.List r0 = kotlin.collections.C0718m.m(r5)
            r8.put(r12, r0)
            r23 = r2
            r29 = r3
            r43 = r4
            goto L_0x0d80
        L_0x0de8:
            r24 = r5
            r19 = r6
            r39 = r9
            r3 = r10
            r63 = r26
            r62 = r27
            r28 = r30
            r0 = r31
            r10 = r33
            r6 = r34
            r5 = r38
            r9 = r8
            r8 = r13
            r13 = r7
            r7 = r11
            r11 = r32
            r32 = r12
            r12 = r14
            r14 = r35
            java.lang.String r2 = "et"
            boolean r2 = r12.equals(r2)
            if (r2 != 0) goto L_0x0e29
            r10 = r3
            r11 = r7
            r7 = r13
            r6 = r19
            r1 = r22
            r2 = r23
            r5 = r24
            r4 = r28
            r12 = r32
            r0 = r62
            r3 = r63
            r13 = r8
            r8 = r9
            r9 = r39
            goto L_0x0087
        L_0x0e29:
            M0.a r2 = new M0.a
            r31 = r7
            java.lang.String r7 = "ä"
            r25 = r13
            java.lang.String r13 = "Ä"
            r2.<init>(r4, r7, r13)
            M0.a r4 = new M0.a
            java.lang.String r7 = "öõ"
            java.lang.String r13 = "ÖÕ"
            r4.<init>(r15, r7, r13)
            M0.a r7 = new M0.a
            r13 = r39
            r7.<init>(r1, r3, r13)
            M0.a r1 = new M0.a
            r1.<init>(r5, r6, r14)
            M0.a r5 = new M0.a
            r5.<init>(r10, r11, r0)
            r0 = 5
            M0.a[] r6 = new M0.a[r0]
            r6[r17] = r2
            r6[r16] = r4
            r0 = 2
            r6[r0] = r7
            r0 = 3
            r6[r0] = r1
            r0 = 4
            r6[r0] = r5
            java.util.List r0 = kotlin.collections.C0718m.m(r6)
            r8.put(r12, r0)
            r27 = r3
            r6 = r8
            r43 = r9
            r30 = r22
            r29 = r23
            r11 = r28
            r26 = r31
            r23 = r32
            r0 = 8
            r2 = 2
            r3 = 3
            r4 = 4
            r5 = 5
            r7 = 6
            r9 = 7
            r22 = r13
            r13 = r63
            goto L_0x1451
        L_0x0e84:
            r19 = r6
            r65 = r9
            r34 = r10
            r64 = r11
            r32 = r12
            r35 = r13
            r12 = r14
            r0 = r24
            r11 = r25
            r63 = r26
            r62 = r27
            r14 = r28
            r28 = r30
            r6 = r36
            r13 = r37
            r10 = r3
            r24 = r5
            r3 = r7
            r9 = r8
            r5 = r29
            r7 = r42
            java.lang.String r8 = "es"
            boolean r8 = r12.equals(r8)
            if (r8 != 0) goto L_0x0ece
            r7 = r3
            r8 = r9
            r6 = r19
            r1 = r22
            r2 = r23
            r5 = r24
            r4 = r28
            r12 = r32
            r10 = r34
            r13 = r35
            r0 = r62
            r3 = r63
            r11 = r64
            r9 = r65
            goto L_0x0087
        L_0x0ece:
            M0.a r8 = new M0.a
            r8.<init>(r4, r0, r11)
            M0.a r0 = new M0.a
            r0.<init>(r2, r13, r6)
            M0.a r2 = new M0.a
            r2.<init>(r7, r14, r5)
            M0.a r4 = new M0.a
            r4.<init>(r10, r9, r3)
            M0.a r5 = new M0.a
            r10 = r22
            r7 = r23
            r5.<init>(r15, r7, r10)
            M0.a r6 = new M0.a
            java.lang.String r11 = "úü"
            java.lang.String r13 = "ÚÜ"
            r6.<init>(r1, r11, r13)
            r1 = 6
            M0.a[] r11 = new M0.a[r1]
            r11[r17] = r8
            r11[r16] = r0
            r0 = 2
            r11[r0] = r2
            r0 = 3
            r11[r0] = r4
            r0 = 4
            r11[r0] = r5
            r0 = 5
            r11[r0] = r6
            java.util.List r0 = kotlin.collections.C0718m.m(r11)
            r8 = r35
            r8.put(r12, r0)
            r25 = r3
            r29 = r7
            r6 = r8
            r43 = r9
            r30 = r10
            r11 = r28
            r23 = r32
            r27 = r34
            r13 = r63
            r26 = r64
            r22 = r65
            goto L_0x0c7c
        L_0x0f27:
            r24 = r5
            r19 = r6
            r3 = r7
            r65 = r9
            r34 = r10
            r64 = r11
            r32 = r12
            r12 = r14
            r10 = r22
            r7 = r23
            r63 = r26
            r62 = r27
            r28 = r30
            r5 = r38
            r9 = r8
            r8 = r13
            java.lang.String r0 = "de"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0f64
            r2 = r7
            r13 = r8
            r8 = r9
            r1 = r10
            r6 = r19
            r5 = r24
            r4 = r28
            r12 = r32
            r10 = r34
            r0 = r62
            r11 = r64
            r9 = r65
        L_0x0f5f:
            r7 = r3
        L_0x0f60:
            r3 = r63
            goto L_0x0087
        L_0x0f64:
            M0.a r0 = new M0.a
            java.lang.String r2 = "ß"
            java.lang.String r6 = "ẞ"
            r0.<init>(r5, r2, r6)
            M0.a r2 = new M0.a
            java.lang.String r5 = "ä"
            java.lang.String r6 = "Ä"
            r2.<init>(r4, r5, r6)
            M0.a r4 = new M0.a
            r5 = r32
            r11 = r64
            r4.<init>(r15, r5, r11)
            M0.a r6 = new M0.a
            r14 = r34
            r13 = r65
            r6.<init>(r1, r14, r13)
            r1 = 4
            M0.a[] r15 = new M0.a[r1]
            r15[r17] = r0
            r15[r16] = r2
            r0 = 2
            r15[r0] = r4
            r0 = 3
            r15[r0] = r6
            java.util.List r0 = kotlin.collections.C0718m.m(r15)
            r8.put(r12, r0)
            r25 = r3
            r23 = r5
            r29 = r7
            r6 = r8
            r43 = r9
            r30 = r10
            r26 = r11
            r22 = r13
            r27 = r14
        L_0x0fad:
            r11 = r28
        L_0x0faf:
            r13 = r63
            goto L_0x0c7c
        L_0x0fb3:
            r24 = r5
            r19 = r6
            r3 = r7
            r5 = r12
            r12 = r14
            r7 = r23
            r63 = r26
            r62 = r27
            r28 = r30
            r6 = r36
            r14 = r10
            r10 = r22
            r22 = r9
            r9 = r8
            r8 = r13
            r13 = r37
            java.lang.String r0 = "da"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0fe7
            r12 = r5
            r2 = r7
            r13 = r8
            r8 = r9
            r1 = r10
            r10 = r14
            r6 = r19
            r9 = r22
            r5 = r24
            r4 = r28
            r0 = r62
            goto L_0x0f5f
        L_0x0fe7:
            M0.a r0 = new M0.a
            java.lang.String r1 = "åæ"
            r32 = r5
            java.lang.String r5 = "ÅÆ"
            r0.<init>(r4, r1, r5)
            M0.a r1 = new M0.a
            r1.<init>(r2, r13, r6)
            M0.a r2 = new M0.a
            java.lang.String r4 = "ø"
            java.lang.String r5 = "Ø"
            r2.<init>(r15, r4, r5)
            r4 = 3
            M0.a[] r5 = new M0.a[r4]
            r5[r17] = r0
            r5[r16] = r1
            r0 = 2
            r5[r0] = r2
            java.util.List r0 = kotlin.collections.C0718m.m(r5)
            r8.put(r12, r0)
            r25 = r3
            r29 = r7
            r6 = r8
            r43 = r9
            r30 = r10
            r26 = r11
            r27 = r14
            r11 = r28
            r23 = r32
            goto L_0x0faf
        L_0x1023:
            r19 = r6
            r43 = r8
            r8 = r22
            r6 = r23
            r63 = r26
            r62 = r27
            r66 = r33
            r22 = r9
            r27 = r10
            r26 = r11
            r23 = r12
            r12 = r14
            r14 = r28
            r28 = r30
            r10 = r41
            r9 = r3
            r3 = r24
            r24 = r5
            r5 = r29
            r29 = r38
            r38 = r35
            r35 = r13
            r13 = r25
            r25 = r7
            r7 = r42
            java.lang.String r11 = "cs"
            boolean r11 = r12.equals(r11)
            if (r11 != 0) goto L_0x1075
            r2 = r6
            r1 = r8
            r6 = r19
            r9 = r22
            r12 = r23
            r5 = r24
            r7 = r25
            r11 = r26
            r10 = r27
            r4 = r28
            r13 = r35
        L_0x106f:
            r8 = r43
        L_0x1071:
            r0 = r62
            goto L_0x0f60
        L_0x1075:
            M0.a r11 = new M0.a
            r11.<init>(r4, r3, r13)
            M0.a r3 = new M0.a
            java.lang.String r4 = "ěé"
            java.lang.String r13 = "ĚÉ"
            r3.<init>(r2, r4, r13)
            M0.a r2 = new M0.a
            r2.<init>(r7, r14, r5)
            M0.a r4 = new M0.a
            r4.<init>(r15, r6, r8)
            M0.a r5 = new M0.a
            java.lang.String r7 = "ůú"
            java.lang.String r13 = "ŮÚ"
            r5.<init>(r1, r7, r13)
            M0.a r1 = new M0.a
            java.lang.String r7 = "Č"
            r14 = r62
            r1.<init>(r10, r14, r7)
            M0.a r7 = new M0.a
            java.lang.String r10 = "ď"
            java.lang.String r13 = "Ď"
            r7.<init>(r0, r10, r13)
            M0.a r0 = new M0.a
            java.lang.String r10 = "ň"
            java.lang.String r13 = "Ň"
            r0.<init>(r9, r10, r13)
            M0.a r9 = new M0.a
            java.lang.String r10 = "ř"
            java.lang.String r13 = "Ř"
            java.lang.String r15 = "r"
            r9.<init>(r15, r10, r13)
            M0.a r10 = new M0.a
            r14 = r29
            r15 = r34
            r13 = r38
            r10.<init>(r14, r15, r13)
            M0.a r13 = new M0.a
            java.lang.String r14 = "ť"
            java.lang.String r15 = "Ť"
            r29 = r6
            java.lang.String r6 = "t"
            r13.<init>(r6, r14, r15)
            M0.a r6 = new M0.a
            java.lang.String r14 = "ý"
            java.lang.String r15 = "Ý"
            r30 = r8
            r8 = r63
            r6.<init>(r8, r14, r15)
            M0.a r14 = new M0.a
            r37 = r12
            r15 = r31
            r8 = r32
            r12 = r66
            r14.<init>(r12, r8, r15)
            r8 = 13
            M0.a[] r8 = new M0.a[r8]
            r8[r17] = r11
            r8[r16] = r3
            r3 = 2
            r8[r3] = r2
            r2 = 3
            r8[r2] = r4
            r2 = 4
            r8[r2] = r5
            r2 = 5
            r8[r2] = r1
            r1 = 6
            r8[r1] = r7
            r1 = 7
            r8[r1] = r0
            r0 = 8
            r8[r0] = r9
            r0 = 9
            r8[r0] = r10
            r0 = 10
            r8[r0] = r13
            r0 = 11
            r8[r0] = r6
            r0 = 12
            r8[r0] = r14
            java.util.List r0 = kotlin.collections.C0718m.m(r8)
            r6 = r35
            r8 = r37
            r6.put(r8, r0)
            goto L_0x0fad
        L_0x1129:
            r24 = r5
            r19 = r6
            r25 = r7
            r43 = r8
            r6 = r13
            r8 = r14
            r29 = r23
            r63 = r26
            r62 = r27
            r28 = r30
            r5 = r39
            r0 = r40
            r7 = r42
            r27 = r10
            r26 = r11
            r23 = r12
            r30 = r22
            r10 = r41
            r22 = r9
            java.lang.String r3 = "ca"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L_0x116c
            r13 = r6
            r6 = r19
            r9 = r22
            r12 = r23
            r5 = r24
            r7 = r25
            r11 = r26
            r10 = r27
            r4 = r28
        L_0x1166:
            r2 = r29
            r1 = r30
            goto L_0x106f
        L_0x116c:
            M0.a r3 = new M0.a
            java.lang.String r9 = "à"
            java.lang.String r11 = "À"
            r3.<init>(r4, r9, r11)
            M0.a r4 = new M0.a
            java.lang.String r9 = "éè"
            java.lang.String r11 = "ÉÈ"
            r4.<init>(r2, r9, r11)
            M0.a r2 = new M0.a
            java.lang.String r9 = "íï"
            java.lang.String r11 = "ÍÏ"
            r2.<init>(r7, r9, r11)
            M0.a r7 = new M0.a
            java.lang.String r9 = "óò"
            java.lang.String r11 = "ÓÒ"
            r7.<init>(r15, r9, r11)
            M0.a r9 = new M0.a
            java.lang.String r11 = "úü"
            java.lang.String r12 = "ÚÜ"
            r9.<init>(r1, r11, r12)
            M0.a r1 = new M0.a
            r1.<init>(r10, r5, r0)
            M0.a r0 = new M0.a
            java.lang.String r5 = "ŀ"
            java.lang.String r10 = "Ŀ"
            r11 = r28
            r0.<init>(r11, r5, r10)
            r5 = 7
            M0.a[] r10 = new M0.a[r5]
            r10[r17] = r3
            r10[r16] = r4
            r3 = 2
            r10[r3] = r2
            r2 = 3
            r10[r2] = r7
            r2 = 4
            r10[r2] = r9
            r2 = 5
            r10[r2] = r1
            r1 = 6
            r10[r1] = r0
            java.util.List r0 = kotlin.collections.C0718m.m(r10)
            r6.put(r8, r0)
            goto L_0x0faf
        L_0x11c8:
            r24 = r5
            r19 = r6
            r25 = r7
            r43 = r8
            r6 = r13
            r8 = r14
            r29 = r23
            r63 = r26
            r62 = r27
            r7 = r42
            r27 = r10
            r26 = r11
            r23 = r12
            r11 = r30
            r30 = r22
            r22 = r9
            r9 = r3
            java.lang.String r0 = "br"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1201
            r13 = r6
            r4 = r11
            r6 = r19
            r9 = r22
            r12 = r23
            r5 = r24
            r7 = r25
            r11 = r26
            r10 = r27
            goto L_0x1166
        L_0x1201:
            M0.a r0 = new M0.a
            java.lang.String r3 = "â"
            java.lang.String r5 = "Â"
            r0.<init>(r4, r3, r5)
            M0.a r3 = new M0.a
            java.lang.String r4 = "ê"
            java.lang.String r5 = "Ê"
            r3.<init>(r2, r4, r5)
            M0.a r2 = new M0.a
            java.lang.String r4 = "î"
            java.lang.String r5 = "Î"
            r2.<init>(r7, r4, r5)
            M0.a r4 = new M0.a
            java.lang.String r5 = "ô"
            java.lang.String r7 = "Ô"
            r4.<init>(r15, r5, r7)
            M0.a r5 = new M0.a
            java.lang.String r7 = "ûùü"
            java.lang.String r10 = "ÛÙÜ"
            r5.<init>(r1, r7, r10)
            M0.a r1 = new M0.a
            r12 = r25
            r10 = r43
            r1.<init>(r9, r10, r12)
            r7 = 6
            M0.a[] r9 = new M0.a[r7]
            r9[r17] = r0
            r9[r16] = r3
            r0 = 2
            r9[r0] = r2
            r0 = 3
            r9[r0] = r4
            r0 = 4
            r9[r0] = r5
            r0 = 5
            r9[r0] = r1
            java.util.List r0 = kotlin.collections.C0718m.m(r9)
            r6.put(r8, r0)
            goto L_0x0faf
        L_0x1253:
            r19 = r6
            r6 = r13
            r29 = r23
            r3 = r24
            r13 = r25
            r63 = r26
            r62 = r27
            r24 = r5
            r27 = r10
            r26 = r11
            r23 = r12
            r11 = r30
            r12 = r7
            r10 = r8
            r8 = r14
            r30 = r22
            r7 = r42
            r22 = r9
            java.lang.String r0 = "af"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x1291
            r13 = r6
            r8 = r10
            r4 = r11
            r7 = r12
            r6 = r19
            r9 = r22
            r12 = r23
            r5 = r24
            r11 = r26
            r10 = r27
            r2 = r29
            r1 = r30
            goto L_0x1071
        L_0x1291:
            M0.a r0 = new M0.a
            r0.<init>(r4, r3, r13)
            M0.a r3 = new M0.a
            java.lang.String r4 = "éèêë"
            java.lang.String r5 = "ÉÈÊË"
            r3.<init>(r2, r4, r5)
            M0.a r2 = new M0.a
            java.lang.String r4 = "íîï"
            java.lang.String r5 = "ÍÎÏ"
            r2.<init>(r7, r4, r5)
            M0.a r4 = new M0.a
            java.lang.String r5 = "óô"
            java.lang.String r7 = "ÓÔ"
            r4.<init>(r15, r5, r7)
            M0.a r5 = new M0.a
            java.lang.String r7 = "úû"
            java.lang.String r9 = "ÚÛ"
            r5.<init>(r1, r7, r9)
            M0.a r1 = new M0.a
            java.lang.String r7 = "ý"
            java.lang.String r9 = "Ý"
            r13 = r63
            r1.<init>(r13, r7, r9)
            r7 = 6
            M0.a[] r9 = new M0.a[r7]
            r9[r17] = r0
            r9[r16] = r3
            r0 = 2
            r9[r0] = r2
            r0 = 3
            r9[r0] = r4
            r0 = 4
            r9[r0] = r5
            r0 = 5
            r9[r0] = r1
            java.util.List r0 = kotlin.collections.C0718m.m(r9)
            r6.put(r8, r0)
            r43 = r10
            r25 = r12
            goto L_0x0c7c
        L_0x12e5:
            r24 = r5
            r19 = r6
            r0 = r8
            r6 = r13
            r8 = r14
            r29 = r23
            r13 = r26
            r62 = r27
            r14 = r38
            r27 = r10
            r26 = r11
            r23 = r12
            r11 = r30
            r12 = r33
            r10 = r41
            r30 = r22
            r22 = r9
            r9 = r3
            r3 = r7
            java.lang.String r1 = "pl-qwertz"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x1327
            r8 = r0
            r7 = r3
            r4 = r11
            r3 = r13
            r9 = r22
            r12 = r23
            r5 = r24
            r11 = r26
            r10 = r27
            r2 = r29
            r1 = r30
        L_0x1320:
            r0 = r62
            r13 = r6
            r6 = r19
            goto L_0x0087
        L_0x1327:
            M0.a r1 = new M0.a
            java.lang.String r5 = "ą"
            java.lang.String r7 = "Ą"
            r1.<init>(r4, r5, r7)
            M0.a r4 = new M0.a
            java.lang.String r5 = "ć"
            java.lang.String r7 = "Ć"
            r4.<init>(r10, r5, r7)
            M0.a r5 = new M0.a
            java.lang.String r7 = "ę"
            java.lang.String r10 = "Ę"
            r5.<init>(r2, r7, r10)
            M0.a r2 = new M0.a
            java.lang.String r7 = "ł"
            java.lang.String r10 = "Ł"
            r2.<init>(r11, r7, r10)
            M0.a r7 = new M0.a
            java.lang.String r10 = "ń"
            r43 = r0
            java.lang.String r0 = "Ń"
            r7.<init>(r9, r10, r0)
            M0.a r0 = new M0.a
            r9 = r29
            r10 = r30
            r0.<init>(r15, r9, r10)
            M0.a r15 = new M0.a
            r25 = r3
            java.lang.String r3 = "ś"
            java.lang.String r9 = "Ś"
            r15.<init>(r14, r3, r9)
            M0.a r3 = new M0.a
            java.lang.String r9 = "żź"
            java.lang.String r14 = "ŻŹ"
            r3.<init>(r12, r9, r14)
            r9 = 8
            M0.a[] r12 = new M0.a[r9]
            r12[r17] = r1
            r12[r16] = r4
            r1 = 2
            r12[r1] = r5
            r1 = 3
            r12[r1] = r2
            r1 = 4
            r12[r1] = r7
            r1 = 5
            r12[r1] = r0
            r0 = 6
            r12[r0] = r15
            r0 = 7
            r12[r0] = r3
            java.util.List r0 = kotlin.collections.C0718m.m(r12)
            r6.put(r8, r0)
            goto L_0x0c7c
        L_0x1396:
            r24 = r5
            r19 = r6
            r25 = r7
            r43 = r8
            r6 = r13
            r8 = r14
            r0 = r22
            r29 = r23
            r13 = r26
            r62 = r27
            r14 = r38
            r22 = r9
            r27 = r10
            r26 = r11
            r23 = r12
            r11 = r30
            r10 = r41
            java.lang.String r2 = "custom"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x13d3
            r1 = r0
            r4 = r11
            r3 = r13
            r9 = r22
            r12 = r23
            r5 = r24
            r7 = r25
            r11 = r26
            r10 = r27
            r2 = r29
        L_0x13cf:
            r8 = r43
            goto L_0x1320
        L_0x13d3:
            M0.a r2 = new M0.a
            java.lang.String r3 = "ª"
            java.lang.String r5 = "ª"
            r2.<init>(r4, r3, r5)
            M0.a r3 = new M0.a
            java.lang.String r4 = "ĉ"
            java.lang.String r5 = "Ĉ"
            r3.<init>(r10, r4, r5)
            M0.a r4 = new M0.a
            java.lang.String r5 = "ĝ"
            java.lang.String r7 = "Ĝ"
            java.lang.String r9 = "g"
            r4.<init>(r9, r5, r7)
            M0.a r5 = new M0.a
            java.lang.String r7 = "ĥ"
            java.lang.String r9 = "Ĥ"
            java.lang.String r10 = "h"
            r5.<init>(r10, r7, r9)
            M0.a r7 = new M0.a
            java.lang.String r9 = "ĵ"
            java.lang.String r10 = "Ĵ"
            java.lang.String r12 = "j"
            r7.<init>(r12, r9, r10)
            M0.a r9 = new M0.a
            java.lang.String r10 = "ō"
            java.lang.String r12 = "Ō"
            r9.<init>(r15, r10, r12)
            M0.a r10 = new M0.a
            java.lang.String r12 = "º"
            r30 = r0
            java.lang.String r0 = "º"
            r10.<init>(r15, r12, r0)
            M0.a r0 = new M0.a
            java.lang.String r12 = "ŝ"
            java.lang.String r15 = "Ŝ"
            r0.<init>(r14, r12, r15)
            M0.a r12 = new M0.a
            java.lang.String r14 = "ŭ"
            java.lang.String r15 = "Ŭ"
            r12.<init>(r1, r14, r15)
            r1 = 9
            M0.a[] r1 = new M0.a[r1]
            r1[r17] = r2
            r1[r16] = r3
            r2 = 2
            r1[r2] = r4
            r3 = 3
            r1[r3] = r5
            r4 = 4
            r1[r4] = r7
            r5 = 5
            r1[r5] = r9
            r7 = 6
            r1[r7] = r10
            r9 = 7
            r1[r9] = r0
            r0 = 8
            r1[r0] = r12
            java.util.List r1 = kotlin.collections.C0718m.m(r1)
            r6.put(r8, r1)
        L_0x1451:
            r4 = r11
            r3 = r13
            r9 = r22
            r12 = r23
            r5 = r24
            r7 = r25
            r11 = r26
            r10 = r27
            r2 = r29
            r1 = r30
            goto L_0x13cf
        L_0x1465:
            r1 = r68
            r6 = r13
            r1.f(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.keyboard.DiacriticsStore.h():java.util.Map");
    }

    private final Map i() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new M0.a("a", "äá", "ÄÁ"));
        arrayList.add(new M0.a("n", "ñ", "Ñ"));
        return kotlin.collections.D.f(g.a("tutorial", arrayList));
    }

    private final void n() {
        e.j(e.k(new DiacriticsStore$observeCustomDiacritics$$inlined$filter$1(this.f9953b.J0()), new DiacriticsStore$observeCustomDiacritics$2(this, (c<? super DiacriticsStore$observeCustomDiacritics$2>) null)), this.f9952a);
    }

    public final List c(List list) {
        Object obj;
        o.e(list, "languages");
        if (this.f9954c) {
            List list2 = (List) this.f9958g.get("tutorial");
            if (list2 == null) {
                return C0718m.j();
            }
            return list2;
        } else if (o.a(this.f9959h, list)) {
            return this.f9960i;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                List<M0.a> list3 = (List) this.f9957f.get((String) it.next());
                if (list3 != null) {
                    for (M0.a aVar : list3) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            if (o.a(((M0.a) obj).b(), aVar.b())) {
                                break;
                            }
                        }
                        M0.a aVar2 = (M0.a) obj;
                        if (aVar2 != null) {
                            arrayList.remove(aVar2);
                            arrayList.add(aVar2.a(aVar2.b(), aVar2.c() + aVar.c(), aVar2.d() + aVar.d()));
                        } else {
                            arrayList.add(new M0.a(aVar.b(), aVar.c(), aVar.d()));
                        }
                    }
                }
            }
            this.f9959h.addAll(list);
            this.f9960i = arrayList;
            return arrayList;
        }
    }

    public final void j() {
        this.f9954c = true;
    }

    public final void k() {
        this.f9954c = false;
    }

    public final Map l() {
        return this.f9956e;
    }

    public final Map m() {
        if (this.f9954c) {
            return this.f9958g;
        }
        return this.f9957f;
    }
}
