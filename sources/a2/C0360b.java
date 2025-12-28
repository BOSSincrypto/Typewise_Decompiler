package a2;

import Y1.i;
import Y1.l;
import a2.C0359a;
import com.ibm.icu.util.ULocale;

/* renamed from: a2.b  reason: case insensitive filesystem */
final class C0360b extends C0359a.b {

    /* renamed from: a  reason: collision with root package name */
    static final i f2263a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f2264b = {"grapheme", "word", "line", "sentence", "title"};

    /* renamed from: a2.b$a */
    private static class a extends i {

        /* renamed from: a2.b$a$a  reason: collision with other inner class name */
        class C0046a extends i.a {
            C0046a() {
            }

            /* access modifiers changed from: protected */
            public Object c(ULocale uLocale, int i4, l lVar) {
                return C0360b.c(uLocale, i4);
            }
        }

        a() {
            super("BreakIterator");
            j(new C0046a());
            i();
        }

        public String m() {
            return "";
        }
    }

    C0360b() {
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0103 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static a2.C0359a c(com.ibm.icu.util.ULocale r7, int r8) {
        /*
            java.lang.String r0 = "com/ibm/icu/impl/data/icudt71b/brkitr"
            com.ibm.icu.impl.ICUResourceBundle$OpenType r1 = com.ibm.icu.impl.ICUResourceBundle.OpenType.LOCALE_ROOT
            com.ibm.icu.impl.ICUResourceBundle r0 = com.ibm.icu.impl.ICUResourceBundle.g0(r0, r7, r1)
            r1 = 2
            java.lang.String r2 = "phrase"
            java.lang.String r3 = ""
            if (r8 != r1) goto L_0x0071
            java.lang.String r1 = "lb"
            java.lang.String r1 = r7.getKeywordValue(r1)
            java.lang.String r4 = "_"
            if (r1 == 0) goto L_0x0041
            java.lang.String r5 = "strict"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0031
            java.lang.String r5 = "normal"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0031
            java.lang.String r5 = "loose"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0041
        L_0x0031:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            goto L_0x0042
        L_0x0041:
            r1 = r3
        L_0x0042:
            java.lang.String r5 = r7.getLanguage()
            if (r5 == 0) goto L_0x0072
            java.lang.String r6 = "ja"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0072
            java.lang.String r5 = "lw"
            java.lang.String r5 = r7.getKeywordValue(r5)
            if (r5 == 0) goto L_0x0072
            boolean r6 = r5.equals(r2)
            if (r6 == 0) goto L_0x0072
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            r6.append(r4)
            r6.append(r5)
            java.lang.String r1 = r6.toString()
            goto L_0x0072
        L_0x0071:
            r1 = r3
        L_0x0072:
            boolean r4 = r1.isEmpty()     // Catch:{ Exception -> 0x007d }
            if (r4 == 0) goto L_0x0080
            java.lang.String[] r1 = f2264b     // Catch:{ Exception -> 0x007d }
            r1 = r1[r8]     // Catch:{ Exception -> 0x007d }
            goto L_0x0093
        L_0x007d:
            r7 = move-exception
            goto L_0x0104
        L_0x0080:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007d }
            r4.<init>()     // Catch:{ Exception -> 0x007d }
            java.lang.String[] r5 = f2264b     // Catch:{ Exception -> 0x007d }
            r5 = r5[r8]     // Catch:{ Exception -> 0x007d }
            r4.append(r5)     // Catch:{ Exception -> 0x007d }
            r4.append(r1)     // Catch:{ Exception -> 0x007d }
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x007d }
        L_0x0093:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007d }
            r4.<init>()     // Catch:{ Exception -> 0x007d }
            java.lang.String r5 = "boundaries/"
            r4.append(r5)     // Catch:{ Exception -> 0x007d }
            r4.append(r1)     // Catch:{ Exception -> 0x007d }
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x007d }
            java.lang.String r1 = r0.p0(r1)     // Catch:{ Exception -> 0x007d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007d }
            r4.<init>()     // Catch:{ Exception -> 0x007d }
            java.lang.String r5 = "brkitr/"
            r4.append(r5)     // Catch:{ Exception -> 0x007d }
            r4.append(r1)     // Catch:{ Exception -> 0x007d }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x007d }
            java.nio.ByteBuffer r3 = com.ibm.icu.impl.d.l(r4)     // Catch:{ Exception -> 0x007d }
            if (r1 == 0) goto L_0x00c9
            boolean r1 = r1.contains(r2)     // Catch:{ IOException -> 0x00c7 }
            if (r1 == 0) goto L_0x00c9
            r1 = 1
            goto L_0x00ca
        L_0x00c7:
            r1 = move-exception
            goto L_0x00cf
        L_0x00c9:
            r1 = 0
        L_0x00ca:
            a2.g r1 = a2.C0365g.K(r3, r1)     // Catch:{ IOException -> 0x00c7 }
            goto L_0x00d3
        L_0x00cf:
            Y1.a.b(r1)
            r1 = 0
        L_0x00d3:
            java.util.Locale r0 = r0.getLocale()
            com.ibm.icu.util.ULocale r0 = com.ibm.icu.util.ULocale.forLocale(r0)
            r1.s(r0, r0)
            r0 = 3
            if (r8 != r0) goto L_0x0103
            java.lang.String r8 = "ss"
            java.lang.String r8 = r7.getKeywordValue(r8)
            if (r8 == 0) goto L_0x0103
            java.lang.String r0 = "standard"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0103
            com.ibm.icu.util.ULocale r8 = new com.ibm.icu.util.ULocale
            java.lang.String r7 = r7.getBaseName()
            r8.<init>(r7)
            a2.d r7 = a2.C0362d.a(r8)
            a2.a r7 = r7.b(r1)
            return r7
        L_0x0103:
            return r1
        L_0x0104:
            java.util.MissingResourceException r8 = new java.util.MissingResourceException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7, r3, r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.C0360b.c(com.ibm.icu.util.ULocale, int):a2.a");
    }

    public C0359a a(ULocale uLocale, int i4) {
        i iVar = f2263a;
        if (iVar.h()) {
            return c(uLocale, i4);
        }
        ULocale[] uLocaleArr = new ULocale[1];
        C0359a aVar = (C0359a) iVar.l(uLocale, i4, uLocaleArr);
        ULocale uLocale2 = uLocaleArr[0];
        aVar.s(uLocale2, uLocale2);
        return aVar;
    }
}
