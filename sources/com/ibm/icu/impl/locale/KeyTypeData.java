package com.ibm.icu.impl.locale;

import com.ibm.icu.util.UResourceBundle;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public abstract class KeyTypeData {

    /* renamed from: a  reason: collision with root package name */
    static Set f12807a = Collections.emptySet();

    /* renamed from: b  reason: collision with root package name */
    static Map f12808b = Collections.emptyMap();

    /* renamed from: c  reason: collision with root package name */
    static Map f12809c = Collections.emptyMap();

    /* renamed from: d  reason: collision with root package name */
    private static final Object[][] f12810d = new Object[0][];

    /* renamed from: e  reason: collision with root package name */
    private static final Map f12811e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private static Map f12812f;

    private enum KeyInfoType {
        deprecated,
        valueType
    }

    private enum SpecialType {
        CODEPOINTS(new b((a) null)),
        REORDER_CODE(new e((a) null)),
        RG_KEY_VALUE(new f((a) null)),
        SCRIPT_CODE(new g((a) null)),
        SUBDIVISION_CODE(new i((a) null)),
        PRIVATE_USE(new d((a) null));
        
        h handler;

        private SpecialType(h hVar) {
            this.handler = hVar;
        }
    }

    private enum TypeInfoType {
        deprecated
    }

    public enum ValueType {
        single,
        multiple,
        incremental,
        any
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12817a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f12818b;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|(2:1|2)|3|5|6|7|8|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0023 */
        static {
            /*
                com.ibm.icu.impl.locale.KeyTypeData$TypeInfoType[] r0 = com.ibm.icu.impl.locale.KeyTypeData.TypeInfoType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12818b = r0
                r1 = 1
                com.ibm.icu.impl.locale.KeyTypeData$TypeInfoType r2 = com.ibm.icu.impl.locale.KeyTypeData.TypeInfoType.deprecated     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                com.ibm.icu.impl.locale.KeyTypeData$KeyInfoType[] r0 = com.ibm.icu.impl.locale.KeyTypeData.KeyInfoType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12817a = r0
                com.ibm.icu.impl.locale.KeyTypeData$KeyInfoType r2 = com.ibm.icu.impl.locale.KeyTypeData.KeyInfoType.deprecated     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r0 = f12817a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ibm.icu.impl.locale.KeyTypeData$KeyInfoType r1 = com.ibm.icu.impl.locale.KeyTypeData.KeyInfoType.valueType     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.locale.KeyTypeData.a.<clinit>():void");
        }
    }

    private static class b extends h {

        /* renamed from: a  reason: collision with root package name */
        private static final Pattern f12819a = Pattern.compile("[0-9a-fA-F]{4,6}(-[0-9a-fA-F]{4,6})*");

        private b() {
            super((a) null);
        }

        /* access modifiers changed from: package-private */
        public boolean b(String str) {
            return f12819a.matcher(str).matches();
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        String f12820a;

        /* renamed from: b  reason: collision with root package name */
        String f12821b;

        /* renamed from: c  reason: collision with root package name */
        Map f12822c;

        /* renamed from: d  reason: collision with root package name */
        EnumSet f12823d;

        c(String str, String str2, Map map, EnumSet enumSet) {
            this.f12820a = str;
            this.f12821b = str2;
            this.f12822c = map;
            this.f12823d = enumSet;
        }
    }

    private static class d extends h {

        /* renamed from: a  reason: collision with root package name */
        private static final Pattern f12824a = Pattern.compile("[a-zA-Z0-9]{3,8}(-[a-zA-Z0-9]{3,8})*");

        private d() {
            super((a) null);
        }

        /* access modifiers changed from: package-private */
        public boolean b(String str) {
            return f12824a.matcher(str).matches();
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    private static class e extends h {

        /* renamed from: a  reason: collision with root package name */
        private static final Pattern f12825a = Pattern.compile("[a-zA-Z]{3,8}(-[a-zA-Z]{3,8})*");

        private e() {
            super((a) null);
        }

        /* access modifiers changed from: package-private */
        public boolean b(String str) {
            return f12825a.matcher(str).matches();
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    private static class f extends h {

        /* renamed from: a  reason: collision with root package name */
        private static final Pattern f12826a = Pattern.compile("([a-zA-Z]{2}|[0-9]{3})[zZ]{4}");

        private f() {
            super((a) null);
        }

        /* access modifiers changed from: package-private */
        public boolean b(String str) {
            return f12826a.matcher(str).matches();
        }

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    private static class g extends h {

        /* renamed from: a  reason: collision with root package name */
        private static final Pattern f12827a = Pattern.compile("[a-zA-Z]{4}(-[a-zA-Z]{4})*");

        private g() {
            super((a) null);
        }

        /* access modifiers changed from: package-private */
        public boolean b(String str) {
            return f12827a.matcher(str).matches();
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    private static abstract class h {
        private h() {
        }

        /* access modifiers changed from: package-private */
        public String a(String str) {
            return a.j(str);
        }

        /* access modifiers changed from: package-private */
        public abstract boolean b(String str);

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    private static class i extends h {

        /* renamed from: a  reason: collision with root package name */
        private static final Pattern f12828a = Pattern.compile("([a-zA-Z]{2}|[0-9]{3})");

        private i() {
            super((a) null);
        }

        /* access modifiers changed from: package-private */
        public boolean b(String str) {
            return f12828a.matcher(str).matches();
        }

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    private static class j {

        /* renamed from: a  reason: collision with root package name */
        String f12829a;

        /* renamed from: b  reason: collision with root package name */
        String f12830b;

        j(String str, String str2) {
            this.f12829a = str;
            this.f12830b = str2;
        }
    }

    static {
        c();
    }

    private static void a(UResourceBundle uResourceBundle) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        com.ibm.icu.util.g k4 = uResourceBundle.k();
        while (k4.a()) {
            UResourceBundle b4 = k4.b();
            KeyInfoType valueOf = KeyInfoType.valueOf(b4.l());
            com.ibm.icu.util.g k5 = b4.k();
            while (k5.a()) {
                UResourceBundle b5 = k5.b();
                String l4 = b5.l();
                String q4 = b5.q();
                int i4 = a.f12817a[valueOf.ordinal()];
                if (i4 == 1) {
                    linkedHashSet.add(l4);
                } else if (i4 == 2) {
                    linkedHashMap.put(l4, ValueType.valueOf(q4));
                }
            }
        }
        f12807a = Collections.unmodifiableSet(linkedHashSet);
        f12808b = Collections.unmodifiableMap(linkedHashMap);
    }

    private static void b(UResourceBundle uResourceBundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        com.ibm.icu.util.g k4 = uResourceBundle.k();
        while (k4.a()) {
            UResourceBundle b4 = k4.b();
            TypeInfoType valueOf = TypeInfoType.valueOf(b4.l());
            com.ibm.icu.util.g k5 = b4.k();
            while (k5.a()) {
                UResourceBundle b5 = k5.b();
                String l4 = b5.l();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                com.ibm.icu.util.g k6 = b5.k();
                while (k6.a()) {
                    String l5 = k6.b().l();
                    if (a.f12818b[valueOf.ordinal()] == 1) {
                        linkedHashSet.add(l5);
                    }
                }
                linkedHashMap.put(l4, Collections.unmodifiableSet(linkedHashSet));
            }
        }
        f12809c = Collections.unmodifiableMap(linkedHashMap);
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bc A[SYNTHETIC, Splitter:B:37:0x00bc] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void c() {
        /*
            java.lang.ClassLoader r0 = com.ibm.icu.impl.ICUResourceBundle.f12538e
            com.ibm.icu.impl.ICUResourceBundle$OpenType r1 = com.ibm.icu.impl.ICUResourceBundle.OpenType.DIRECT
            java.lang.String r2 = "com/ibm/icu/impl/data/icudt71b"
            java.lang.String r3 = "keyTypeData"
            com.ibm.icu.impl.ICUResourceBundle r0 = com.ibm.icu.impl.ICUResourceBundle.h0(r2, r3, r0, r1)
            java.lang.String r1 = "keyInfo"
            com.ibm.icu.util.UResourceBundle r1 = r0.c(r1)
            a(r1)
            java.lang.String r1 = "typeInfo"
            com.ibm.icu.util.UResourceBundle r1 = r0.c(r1)
            b(r1)
            java.lang.String r1 = "keyMap"
            com.ibm.icu.util.UResourceBundle r1 = r0.c(r1)
            java.lang.String r2 = "typeMap"
            com.ibm.icu.util.UResourceBundle r2 = r0.c(r2)
            java.lang.String r4 = "typeAlias"
            com.ibm.icu.util.UResourceBundle r4 = r0.c(r4)     // Catch:{ MissingResourceException -> 0x0031 }
            goto L_0x0032
        L_0x0031:
            r4 = 0
        L_0x0032:
            java.lang.String r5 = "bcpTypeAlias"
            com.ibm.icu.util.UResourceBundle r0 = r0.c(r5)     // Catch:{ MissingResourceException -> 0x0039 }
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            com.ibm.icu.util.g r1 = r1.k()
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
        L_0x0043:
            boolean r6 = r1.a()
            if (r6 == 0) goto L_0x01ef
            com.ibm.icu.util.UResourceBundle r6 = r1.b()
            java.lang.String r7 = r6.l()
            java.lang.String r6 = r6.q()
            int r8 = r6.length()
            if (r8 != 0) goto L_0x005e
            r6 = r7
            r8 = 1
            goto L_0x005f
        L_0x005e:
            r8 = 0
        L_0x005f:
            java.util.LinkedHashSet r11 = new java.util.LinkedHashSet
            r11.<init>()
            java.util.Set r12 = java.util.Collections.unmodifiableSet(r11)
            r5.put(r6, r12)
            java.lang.String r12 = "timezone"
            boolean r12 = r7.equals(r12)
            r13 = 47
            r14 = 58
            if (r4 == 0) goto L_0x00b9
            com.ibm.icu.util.UResourceBundle r15 = r4.c(r7)     // Catch:{ MissingResourceException -> 0x007c }
            goto L_0x007d
        L_0x007c:
            r15 = 0
        L_0x007d:
            if (r15 == 0) goto L_0x00b9
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            com.ibm.icu.util.g r15 = r15.k()
        L_0x0088:
            boolean r16 = r15.a()
            if (r16 == 0) goto L_0x00ba
            com.ibm.icu.util.UResourceBundle r16 = r15.b()
            java.lang.String r9 = r16.l()
            java.lang.String r10 = r16.q()
            if (r12 == 0) goto L_0x00a0
            java.lang.String r9 = r9.replace(r14, r13)
        L_0x00a0:
            java.lang.Object r16 = r3.get(r10)
            java.util.Set r16 = (java.util.Set) r16
            if (r16 != 0) goto L_0x00b1
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            r3.put(r10, r13)
            goto L_0x00b3
        L_0x00b1:
            r13 = r16
        L_0x00b3:
            r13.add(r9)
            r13 = 47
            goto L_0x0088
        L_0x00b9:
            r3 = 0
        L_0x00ba:
            if (r0 == 0) goto L_0x00f8
            com.ibm.icu.util.UResourceBundle r9 = r0.c(r6)     // Catch:{ MissingResourceException -> 0x00c1 }
            goto L_0x00c2
        L_0x00c1:
            r9 = 0
        L_0x00c2:
            if (r9 == 0) goto L_0x00f8
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            com.ibm.icu.util.g r9 = r9.k()
        L_0x00cd:
            boolean r13 = r9.a()
            if (r13 == 0) goto L_0x00f9
            com.ibm.icu.util.UResourceBundle r13 = r9.b()
            java.lang.String r15 = r13.l()
            java.lang.String r13 = r13.q()
            java.lang.Object r16 = r10.get(r13)
            java.util.Set r16 = (java.util.Set) r16
            if (r16 != 0) goto L_0x00f0
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>()
            r10.put(r13, r14)
            goto L_0x00f2
        L_0x00f0:
            r14 = r16
        L_0x00f2:
            r14.add(r15)
            r14 = 58
            goto L_0x00cd
        L_0x00f8:
            r10 = 0
        L_0x00f9:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            com.ibm.icu.util.UResourceBundle r13 = r2.c(r7)     // Catch:{ MissingResourceException -> 0x0103 }
            goto L_0x0104
        L_0x0103:
            r13 = 0
        L_0x0104:
            if (r13 == 0) goto L_0x01c9
            com.ibm.icu.util.g r13 = r13.k()
            r14 = 0
        L_0x010b:
            boolean r15 = r13.a()
            if (r15 == 0) goto L_0x01c2
            com.ibm.icu.util.UResourceBundle r15 = r13.b()
            r16 = r0
            java.lang.String r0 = r15.l()
            java.lang.String r15 = r15.q()
            r19 = r1
            r17 = r2
            r1 = 0
            char r2 = r0.charAt(r1)
            r1 = 57
            if (r1 >= r2) goto L_0x0150
            r1 = 97
            if (r2 >= r1) goto L_0x0150
            int r1 = r15.length()
            if (r1 != 0) goto L_0x0150
            if (r14 != 0) goto L_0x013f
            java.lang.Class<com.ibm.icu.impl.locale.KeyTypeData$SpecialType> r1 = com.ibm.icu.impl.locale.KeyTypeData.SpecialType.class
            java.util.EnumSet r1 = java.util.EnumSet.noneOf(r1)
            r14 = r1
        L_0x013f:
            com.ibm.icu.impl.locale.KeyTypeData$SpecialType r1 = com.ibm.icu.impl.locale.KeyTypeData.SpecialType.valueOf(r0)
            r14.add(r1)
            r11.add(r0)
        L_0x0149:
            r0 = r16
            r2 = r17
            r1 = r19
            goto L_0x010b
        L_0x0150:
            r1 = 47
            r2 = 58
            if (r12 == 0) goto L_0x015a
            java.lang.String r0 = r0.replace(r2, r1)
        L_0x015a:
            int r18 = r15.length()
            if (r18 != 0) goto L_0x0164
            r18 = 1
            r15 = r0
            goto L_0x0166
        L_0x0164:
            r18 = 0
        L_0x0166:
            r11.add(r15)
            com.ibm.icu.impl.locale.KeyTypeData$j r1 = new com.ibm.icu.impl.locale.KeyTypeData$j
            r1.<init>(r0, r15)
            java.lang.String r2 = com.ibm.icu.impl.locale.a.j(r0)
            r9.put(r2, r1)
            if (r18 != 0) goto L_0x017e
            java.lang.String r2 = com.ibm.icu.impl.locale.a.j(r15)
            r9.put(r2, r1)
        L_0x017e:
            if (r3 == 0) goto L_0x01a0
            java.lang.Object r0 = r3.get(r0)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x01a0
            java.util.Iterator r0 = r0.iterator()
        L_0x018c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x01a0
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = com.ibm.icu.impl.locale.a.j(r2)
            r9.put(r2, r1)
            goto L_0x018c
        L_0x01a0:
            if (r10 == 0) goto L_0x0149
            java.lang.Object r0 = r10.get(r15)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x0149
            java.util.Iterator r0 = r0.iterator()
        L_0x01ae:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0149
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = com.ibm.icu.impl.locale.a.j(r2)
            r9.put(r2, r1)
            goto L_0x01ae
        L_0x01c2:
            r16 = r0
            r19 = r1
            r17 = r2
            goto L_0x01d0
        L_0x01c9:
            r16 = r0
            r19 = r1
            r17 = r2
            r14 = 0
        L_0x01d0:
            com.ibm.icu.impl.locale.KeyTypeData$c r0 = new com.ibm.icu.impl.locale.KeyTypeData$c
            r0.<init>(r7, r6, r9, r14)
            java.util.Map r1 = f12811e
            java.lang.String r2 = com.ibm.icu.impl.locale.a.j(r7)
            r1.put(r2, r0)
            if (r8 != 0) goto L_0x01e7
            java.lang.String r2 = com.ibm.icu.impl.locale.a.j(r6)
            r1.put(r2, r0)
        L_0x01e7:
            r0 = r16
            r2 = r17
            r1 = r19
            goto L_0x0043
        L_0x01ef:
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r5)
            f12812f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.locale.KeyTypeData.c():void");
    }

    public static String d(String str) {
        c cVar = (c) f12811e.get(a.j(str));
        if (cVar != null) {
            return cVar.f12821b;
        }
        return null;
    }

    public static String e(String str, String str2, com.ibm.icu.util.e eVar, com.ibm.icu.util.e eVar2) {
        String j4 = a.j(str);
        String j5 = a.j(str2);
        c cVar = (c) f12811e.get(j4);
        if (cVar == null) {
            return null;
        }
        j jVar = (j) cVar.f12822c.get(j5);
        if (jVar != null) {
            return jVar.f12830b;
        }
        EnumSet enumSet = cVar.f12823d;
        if (enumSet == null) {
            return null;
        }
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            SpecialType specialType = (SpecialType) it.next();
            if (specialType.handler.b(j5)) {
                return specialType.handler.a(j5);
            }
        }
        return null;
    }

    public static String f(String str) {
        c cVar = (c) f12811e.get(a.j(str));
        if (cVar != null) {
            return cVar.f12820a;
        }
        return null;
    }

    public static String g(String str, String str2, com.ibm.icu.util.e eVar, com.ibm.icu.util.e eVar2) {
        String j4 = a.j(str);
        String j5 = a.j(str2);
        c cVar = (c) f12811e.get(j4);
        if (cVar == null) {
            return null;
        }
        j jVar = (j) cVar.f12822c.get(j5);
        if (jVar != null) {
            return jVar.f12829a;
        }
        EnumSet enumSet = cVar.f12823d;
        if (enumSet == null) {
            return null;
        }
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            SpecialType specialType = (SpecialType) it.next();
            if (specialType.handler.b(j5)) {
                return specialType.handler.a(j5);
            }
        }
        return null;
    }
}
