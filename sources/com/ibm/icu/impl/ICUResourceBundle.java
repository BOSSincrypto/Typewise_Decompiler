package com.ibm.icu.impl;

import Y1.s;
import Y1.u;
import Y1.w;
import Y1.x;
import com.ibm.icu.impl.f;
import com.ibm.icu.impl.g;
import com.ibm.icu.impl.v;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Set;

public abstract class ICUResourceBundle extends UResourceBundle {

    /* renamed from: e  reason: collision with root package name */
    public static final ClassLoader f12538e = Y1.f.c(e.class);

    /* renamed from: f  reason: collision with root package name */
    private static Y1.c f12539f = new a();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f12540g = Y1.h.a("localedata");

    /* renamed from: h  reason: collision with root package name */
    private static Y1.c f12541h = new c();

    /* renamed from: b  reason: collision with root package name */
    h f12542b;

    /* renamed from: c  reason: collision with root package name */
    private ICUResourceBundle f12543c;

    /* renamed from: d  reason: collision with root package name */
    protected String f12544d;

    public enum OpenType {
        LOCALE_DEFAULT_ROOT,
        LOCALE_ROOT,
        LOCALE_ONLY,
        DIRECT
    }

    static class a extends s {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public ICUResourceBundle a(String str, g gVar) {
            return gVar.a();
        }
    }

    static class b implements PrivilegedAction {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ClassLoader f12546a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f12547b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Set f12548c;

        class a implements v.c {
            a() {
            }

            public void a(String str) {
                if (str.endsWith(".res")) {
                    b.this.f12548c.add(str.substring(0, str.length() - 4));
                }
            }
        }

        b(ClassLoader classLoader, String str, Set set) {
            this.f12546a = classLoader;
            this.f12547b = str;
            this.f12548c = set;
        }

        /* renamed from: a */
        public Void run() {
            try {
                Enumeration<URL> resources = this.f12546a.getResources(this.f12547b);
                if (resources == null) {
                    return null;
                }
                a aVar = new a();
                while (resources.hasMoreElements()) {
                    URL nextElement = resources.nextElement();
                    v b4 = v.b(nextElement);
                    if (b4 != null) {
                        b4.d(aVar, false);
                    } else if (ICUResourceBundle.f12540g) {
                        PrintStream printStream = System.out;
                        printStream.println("handler for " + nextElement + " is null");
                    }
                }
                return null;
            } catch (IOException e4) {
                if (ICUResourceBundle.f12540g) {
                    PrintStream printStream2 = System.out;
                    printStream2.println("ouch: " + e4.getMessage());
                }
            }
        }
    }

    static class c extends s {
        c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public e a(String str, ClassLoader classLoader) {
            return new e(str, classLoader);
        }
    }

    static class d extends g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f12550a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f12551b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f12552c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ClassLoader f12553d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ OpenType f12554e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f12555f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(String str, String str2, String str3, ClassLoader classLoader, OpenType openType, String str4) {
            super((a) null);
            this.f12550a = str;
            this.f12551b = str2;
            this.f12552c = str3;
            this.f12553d = classLoader;
            this.f12554e = openType;
            this.f12555f = str4;
        }

        public ICUResourceBundle a() {
            String str;
            String str2;
            ICUResourceBundle iCUResourceBundle;
            boolean z3;
            if (ICUResourceBundle.f12540g) {
                System.out.println("Creating " + this.f12550a);
            }
            if (this.f12551b.indexOf(46) == -1) {
                str = "root";
            } else {
                str = "";
            }
            if (this.f12552c.isEmpty()) {
                str2 = str;
            } else {
                str2 = this.f12552c;
            }
            ICUResourceBundle N3 = ICUResourceBundle.N(this.f12551b, str2, this.f12553d);
            if (ICUResourceBundle.f12540g) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append("The bundle created is: ");
                sb.append(N3);
                sb.append(" and openType=");
                sb.append(this.f12554e);
                sb.append(" and bundle.getNoFallback=");
                if (N3 == null || !N3.k0()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                sb.append(z3);
                printStream.println(sb.toString());
            }
            if (this.f12554e == OpenType.DIRECT) {
                return N3;
            }
            if (N3 != null && N3.k0()) {
                return N3;
            }
            if (N3 == null) {
                int lastIndexOf = str2.lastIndexOf(95);
                if (lastIndexOf != -1) {
                    return ICUResourceBundle.s0(this.f12551b, str2.substring(0, lastIndexOf), this.f12555f, this.f12553d, this.f12554e);
                } else if (this.f12554e == OpenType.LOCALE_DEFAULT_ROOT && !ICUResourceBundle.t0(this.f12555f, str2)) {
                    String str3 = this.f12551b;
                    String str4 = this.f12555f;
                    return ICUResourceBundle.s0(str3, str4, str4, this.f12553d, this.f12554e);
                } else if (this.f12554e == OpenType.LOCALE_ONLY || str.isEmpty()) {
                    return N3;
                } else {
                    return ICUResourceBundle.N(this.f12551b, str, this.f12553d);
                }
            } else {
                String m4 = N3.m();
                int lastIndexOf2 = m4.lastIndexOf(95);
                String z02 = ((f.g) N3).z0("%%Parent");
                if (z02 != null) {
                    iCUResourceBundle = ICUResourceBundle.s0(this.f12551b, z02, this.f12555f, this.f12553d, this.f12554e);
                } else if (lastIndexOf2 != -1) {
                    iCUResourceBundle = ICUResourceBundle.s0(this.f12551b, m4.substring(0, lastIndexOf2), this.f12555f, this.f12553d, this.f12554e);
                } else if (!m4.equals(str)) {
                    iCUResourceBundle = ICUResourceBundle.s0(this.f12551b, str, this.f12555f, this.f12553d, this.f12554e);
                } else {
                    iCUResourceBundle = null;
                }
                if (N3.equals(iCUResourceBundle)) {
                    return N3;
                }
                N3.setParent(iCUResourceBundle);
                return N3;
            }
        }
    }

    private static final class e {

        /* renamed from: a  reason: collision with root package name */
        private String f12556a;

        /* renamed from: b  reason: collision with root package name */
        private ClassLoader f12557b;

        /* renamed from: c  reason: collision with root package name */
        private volatile EnumMap f12558c;

        /* renamed from: d  reason: collision with root package name */
        private volatile Set f12559d;

        e(String str, ClassLoader classLoader) {
            this.f12556a = str;
            this.f12557b = classLoader;
        }

        /* access modifiers changed from: package-private */
        public Set a() {
            if (this.f12559d == null) {
                synchronized (this) {
                    try {
                        if (this.f12559d == null) {
                            this.f12559d = ICUResourceBundle.O(this.f12556a, this.f12557b);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f12559d;
        }

        /* access modifiers changed from: package-private */
        public ULocale[] b(ULocale.AvailableType availableType) {
            if (this.f12558c == null) {
                synchronized (this) {
                    try {
                        if (this.f12558c == null) {
                            this.f12558c = ICUResourceBundle.P(this.f12556a, this.f12557b);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return (ULocale[]) this.f12558c.get(availableType);
        }
    }

    private static final class f extends Y1.v {

        /* renamed from: a  reason: collision with root package name */
        EnumMap f12560a;

        public f(EnumMap enumMap) {
            this.f12560a = enumMap;
        }

        public void a(u uVar, x xVar, boolean z3) {
            ULocale.AvailableType availableType;
            w f4 = xVar.f();
            for (int i4 = 0; f4.c(i4, uVar, xVar); i4++) {
                if (uVar.g("InstalledLocales")) {
                    availableType = ULocale.AvailableType.DEFAULT;
                } else if (uVar.g("AliasLocales")) {
                    availableType = ULocale.AvailableType.ONLY_LEGACY_ALIASES;
                }
                w f5 = xVar.f();
                ULocale[] uLocaleArr = new ULocale[f5.a()];
                for (int i5 = 0; f5.c(i5, uVar, xVar); i5++) {
                    uLocaleArr[i5] = new ULocale(uVar.toString());
                }
                this.f12560a.put(availableType, uLocaleArr);
            }
        }
    }

    private static abstract class g {
        private g() {
        }

        /* access modifiers changed from: package-private */
        public abstract ICUResourceBundle a();

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    protected static final class h {

        /* renamed from: a  reason: collision with root package name */
        String f12561a;

        /* renamed from: b  reason: collision with root package name */
        String f12562b;

        /* renamed from: c  reason: collision with root package name */
        ULocale f12563c;

        /* renamed from: d  reason: collision with root package name */
        ClassLoader f12564d;

        /* renamed from: e  reason: collision with root package name */
        g f12565e;

        /* renamed from: f  reason: collision with root package name */
        Set f12566f;

        h(String str, String str2, ClassLoader classLoader, g gVar) {
            this.f12561a = str;
            this.f12562b = str2;
            this.f12563c = new ULocale(str2);
            this.f12564d = classLoader;
            this.f12565e = gVar;
        }
    }

    protected ICUResourceBundle(h hVar) {
        this.f12542b = hVar;
    }

    private static final void J(String str, ClassLoader classLoader, Set set) {
        AccessController.doPrivileged(new b(classLoader, str, set));
    }

    private static final void K(String str, ClassLoader classLoader, Set set) {
        try {
            com.ibm.icu.util.g k4 = ((ICUResourceBundle) ((ICUResourceBundle) UResourceBundle.z(str, "res_index", classLoader, true)).c("InstalledLocales")).k();
            k4.d();
            while (k4.a()) {
                set.add(k4.b().l());
            }
        } catch (MissingResourceException unused) {
            if (f12540g) {
                PrintStream printStream = System.out;
                printStream.println("couldn't find " + str + '/' + "res_index" + ".res");
                Thread.dumpStack();
            }
        }
    }

    private static void L(String str, ClassLoader classLoader, Set set) {
        BufferedReader bufferedReader;
        try {
            InputStream resourceAsStream = classLoader.getResourceAsStream(str + "fullLocaleNames.lst");
            if (resourceAsStream != null) {
                bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream, "ASCII"));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        bufferedReader.close();
                        return;
                    } else if (readLine.length() != 0 && !readLine.startsWith("#")) {
                        set.add(readLine);
                    }
                }
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            bufferedReader.close();
            throw th;
        }
    }

    private static int M(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        int i4 = 1;
        for (int i5 = 0; i5 < str.length(); i5++) {
            if (str.charAt(i5) == '/') {
                i4++;
            }
        }
        return i4;
    }

    public static ICUResourceBundle N(String str, String str2, ClassLoader classLoader) {
        g K3 = g.K(str, str2, classLoader);
        if (K3 == null) {
            return null;
        }
        return f0(K3, str, str2, classLoader);
    }

    /* access modifiers changed from: private */
    public static Set O(String str, ClassLoader classLoader) {
        String str2;
        String str3;
        if (str.endsWith("/")) {
            str2 = str;
        } else {
            str2 = str + "/";
        }
        HashSet hashSet = new HashSet();
        if (!Y1.g.b("com.ibm.icu.impl.ICUResourceBundle.skipRuntimeLocaleResourceScan", "false").equalsIgnoreCase("true")) {
            J(str2, classLoader, hashSet);
            if (str.startsWith("com/ibm/icu/impl/data/icudt71b")) {
                if (str.length() == 30) {
                    str3 = "";
                } else if (str.charAt(30) == '/') {
                    str3 = str.substring(31);
                } else {
                    str3 = null;
                }
                if (str3 != null) {
                    d.b(str3, ".res", hashSet);
                }
            }
            hashSet.remove("res_index");
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if ((str4.length() == 1 || str4.length() > 3) && str4.indexOf(95) < 0) {
                    it.remove();
                }
            }
        }
        if (hashSet.isEmpty()) {
            if (f12540g) {
                System.out.println("unable to enumerate data files in " + str);
            }
            L(str2, classLoader, hashSet);
        }
        if (hashSet.isEmpty()) {
            K(str, classLoader, hashSet);
        }
        hashSet.remove("root");
        hashSet.add(ULocale.ROOT.toString());
        return Collections.unmodifiableSet(hashSet);
    }

    /* access modifiers changed from: private */
    public static final EnumMap P(String str, ClassLoader classLoader) {
        EnumMap enumMap = new EnumMap(ULocale.AvailableType.class);
        ((ICUResourceBundle) UResourceBundle.z(str, "res_index", classLoader, true)).a0("", new f(enumMap));
        return enumMap;
    }

    private static final ICUResourceBundle Q(String str, UResourceBundle uResourceBundle, UResourceBundle uResourceBundle2) {
        if (str.length() == 0) {
            return null;
        }
        ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) uResourceBundle;
        int m02 = iCUResourceBundle.m0();
        int M3 = M(str);
        String[] strArr = new String[(m02 + M3)];
        n0(str, M3, strArr, m02);
        return R(strArr, m02, iCUResourceBundle, uResourceBundle2);
    }

    private static final ICUResourceBundle R(String[] strArr, int i4, ICUResourceBundle iCUResourceBundle, UResourceBundle uResourceBundle) {
        if (uResourceBundle == null) {
            uResourceBundle = iCUResourceBundle;
        }
        while (true) {
            int i5 = i4 + 1;
            ICUResourceBundle iCUResourceBundle2 = (ICUResourceBundle) iCUResourceBundle.w(strArr[i4], (HashMap) null, uResourceBundle);
            if (iCUResourceBundle2 == null) {
                ICUResourceBundle l02 = iCUResourceBundle.n();
                if (l02 == null) {
                    return null;
                }
                int m02 = iCUResourceBundle.m0();
                if (i4 != m02) {
                    String[] strArr2 = new String[((strArr.length - i4) + m02)];
                    System.arraycopy(strArr, i4, strArr2, m02, strArr.length - i4);
                    strArr = strArr2;
                }
                iCUResourceBundle.o0(strArr, m02);
                i4 = 0;
                iCUResourceBundle = l02;
            } else if (i5 == strArr.length) {
                return iCUResourceBundle2;
            } else {
                i4 = i5;
                iCUResourceBundle = iCUResourceBundle2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.String T(java.lang.String r16, com.ibm.icu.util.UResourceBundle r17, com.ibm.icu.util.UResourceBundle r18) {
        /*
            r0 = r17
            int r1 = r16.length()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            boolean r1 = r0 instanceof com.ibm.icu.impl.f.c
            if (r1 != 0) goto L_0x000f
            return r2
        L_0x000f:
            if (r18 != 0) goto L_0x0013
            r1 = r0
            goto L_0x0015
        L_0x0013:
            r1 = r18
        L_0x0015:
            com.ibm.icu.impl.ICUResourceBundle r0 = (com.ibm.icu.impl.ICUResourceBundle) r0
            com.ibm.icu.impl.ICUResourceBundle$h r3 = r0.f12542b
            com.ibm.icu.impl.g r3 = r3.f12565e
            int r4 = r0.m0()
            int r5 = M(r16)
            int r6 = r4 + r5
            java.lang.String[] r6 = new java.lang.String[r6]
            r7 = r16
            n0(r7, r5, r6, r4)
            r10 = -1
            r11 = r3
            r12 = r4
            r13 = r6
        L_0x0030:
            r3 = r10
        L_0x0031:
            if (r3 != r10) goto L_0x0044
            int r5 = r0.t()
            r6 = 2
            if (r5 == r6) goto L_0x003e
            r6 = 8
            if (r5 != r6) goto L_0x00c1
        L_0x003e:
            r3 = r0
            com.ibm.icu.impl.f$c r3 = (com.ibm.icu.impl.f.c) r3
            com.ibm.icu.impl.g$e r3 = r3.f12685j
            goto L_0x005d
        L_0x0044:
            int r5 = com.ibm.icu.impl.g.c(r3)
            boolean r6 = com.ibm.icu.impl.g.e(r5)
            if (r6 == 0) goto L_0x0053
            com.ibm.icu.impl.g$n r3 = r11.P(r3)
            goto L_0x005d
        L_0x0053:
            boolean r5 = com.ibm.icu.impl.g.d(r5)
            if (r5 == 0) goto L_0x00c0
            com.ibm.icu.impl.g$d r3 = r11.z(r3)
        L_0x005d:
            int r14 = r4 + 1
            r6 = r13[r4]
            int r15 = r3.g(r11, r6)
            if (r15 != r10) goto L_0x006a
            r3 = r15
            goto L_0x00c1
        L_0x006a:
            int r3 = com.ibm.icu.impl.g.c(r15)
            r4 = 3
            if (r3 != r4) goto L_0x007f
            r0.o0(r13, r12)
            r8 = 0
            r3 = r0
            r4 = r13
            r5 = r14
            r7 = r15
            r9 = r1
            com.ibm.icu.impl.ICUResourceBundle r3 = X(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0080
        L_0x007f:
            r3 = r2
        L_0x0080:
            int r4 = r13.length
            if (r14 != r4) goto L_0x0099
            if (r3 == 0) goto L_0x008a
            java.lang.String r0 = r3.q()
            return r0
        L_0x008a:
            java.lang.String r0 = r11.N(r15)
            if (r0 == 0) goto L_0x0091
            return r0
        L_0x0091:
            com.ibm.icu.util.UResourceTypeMismatchException r0 = new com.ibm.icu.util.UResourceTypeMismatchException
            java.lang.String r1 = ""
            r0.<init>(r1)
            throw r0
        L_0x0099:
            if (r3 == 0) goto L_0x00bc
            com.ibm.icu.impl.ICUResourceBundle$h r0 = r3.f12542b
            com.ibm.icu.impl.g r0 = r0.f12565e
            int r4 = r3.m0()
            if (r14 == r4) goto L_0x00b5
            int r5 = r13.length
            int r5 = r5 - r14
            int r5 = r5 + r4
            java.lang.String[] r5 = new java.lang.String[r5]
            int r6 = r13.length
            int r6 = r6 - r14
            java.lang.System.arraycopy(r13, r14, r5, r4, r6)
            r11 = r0
            r0 = r3
            r12 = r4
            r13 = r5
            goto L_0x0030
        L_0x00b5:
            r11 = r0
            r0 = r3
            r12 = r4
            r3 = r10
            r4 = r14
            goto L_0x0031
        L_0x00bc:
            r4 = r14
            r3 = r15
            goto L_0x0031
        L_0x00c0:
            r3 = r10
        L_0x00c1:
            com.ibm.icu.impl.ICUResourceBundle r4 = r0.n()
            if (r4 != 0) goto L_0x00c8
            return r2
        L_0x00c8:
            r0.o0(r13, r12)
            com.ibm.icu.impl.ICUResourceBundle$h r0 = r4.f12542b
            com.ibm.icu.impl.g r11 = r0.f12565e
            r12 = 0
            r0 = r4
            r4 = r12
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.ICUResourceBundle.T(java.lang.String, com.ibm.icu.util.UResourceBundle, com.ibm.icu.util.UResourceBundle):java.lang.String");
    }

    protected static ICUResourceBundle X(ICUResourceBundle iCUResourceBundle, String[] strArr, int i4, String str, int i5, HashMap hashMap, UResourceBundle uResourceBundle) {
        h hVar = iCUResourceBundle.f12542b;
        ClassLoader classLoader = hVar.f12564d;
        String y3 = hVar.f12565e.y(i5);
        String str2 = hVar.f12561a;
        int m02 = iCUResourceBundle.m0();
        String[] strArr2 = new String[(m02 + 1)];
        iCUResourceBundle.o0(strArr2, m02);
        strArr2[m02] = str;
        return Y(y3, classLoader, str2, strArr, i4, strArr2, hashMap, uResourceBundle);
    }

    protected static ICUResourceBundle Y(String str, ClassLoader classLoader, String str2, String[] strArr, int i4, String[] strArr2, HashMap hashMap, UResourceBundle uResourceBundle) {
        HashMap hashMap2;
        String str3;
        String str4;
        ClassLoader classLoader2;
        String str5;
        String[] strArr3;
        int i5;
        String str6;
        String str7;
        int indexOf;
        String str8 = str;
        String[] strArr4 = strArr2;
        UResourceBundle uResourceBundle2 = uResourceBundle;
        if (hashMap == null) {
            hashMap2 = new HashMap();
        } else {
            hashMap2 = hashMap;
        }
        if (hashMap2.get(str) == null) {
            hashMap2.put(str, "");
            int i6 = 0;
            ICUResourceBundle iCUResourceBundle = null;
            if (str.indexOf(47) == 0) {
                int indexOf2 = str.indexOf(47, 1);
                int i7 = indexOf2 + 1;
                int indexOf3 = str.indexOf(47, i7);
                String substring = str.substring(1, indexOf2);
                if (indexOf3 < 0) {
                    str5 = str.substring(i7);
                    str3 = null;
                } else {
                    String substring2 = str.substring(i7, indexOf3);
                    str3 = str.substring(indexOf3 + 1, str.length());
                    str5 = substring2;
                }
                if (substring.equals("ICUDATA")) {
                    classLoader2 = f12538e;
                    str4 = "com/ibm/icu/impl/data/icudt71b";
                } else if (substring.indexOf("ICUDATA") <= -1 || (indexOf = substring.indexOf(45)) <= -1) {
                    str4 = substring;
                    classLoader2 = classLoader;
                } else {
                    str4 = "com/ibm/icu/impl/data/icudt71b/" + substring.substring(indexOf + 1, substring.length());
                    classLoader2 = f12538e;
                }
            } else {
                int indexOf4 = str.indexOf(47);
                if (indexOf4 != -1) {
                    String substring3 = str.substring(0, indexOf4);
                    str7 = str.substring(indexOf4 + 1);
                    str6 = substring3;
                } else {
                    str6 = str8;
                    str7 = null;
                }
                classLoader2 = classLoader;
                str4 = str2;
            }
            if (str4.equals("LOCALE")) {
                String substring4 = str.substring(8, str.length());
                ICUResourceBundle iCUResourceBundle2 = (ICUResourceBundle) uResourceBundle2;
                while (true) {
                    ICUResourceBundle iCUResourceBundle3 = iCUResourceBundle2.f12543c;
                    if (iCUResourceBundle3 == null) {
                        break;
                    }
                    iCUResourceBundle2 = iCUResourceBundle3;
                }
                iCUResourceBundle = Q(substring4, iCUResourceBundle2, (UResourceBundle) null);
            } else {
                ICUResourceBundle i02 = i0(str4, str5, classLoader2, false);
                if (str3 != null) {
                    i5 = M(str3);
                    if (i5 > 0) {
                        strArr3 = new String[i5];
                        n0(str3, i5, strArr3, 0);
                    } else {
                        strArr3 = strArr;
                    }
                } else if (strArr != null) {
                    strArr3 = strArr;
                    i5 = i4;
                } else {
                    i5 = strArr4.length;
                    strArr3 = strArr4;
                }
                if (i5 > 0) {
                    iCUResourceBundle = i02;
                    while (iCUResourceBundle != null && i6 < i5) {
                        iCUResourceBundle = iCUResourceBundle.W(strArr3[i6], hashMap2, uResourceBundle2);
                        i6++;
                    }
                }
            }
            if (iCUResourceBundle != null) {
                return iCUResourceBundle;
            }
            throw new MissingResourceException(str5, str2, strArr4[strArr4.length - 1]);
        }
        throw new IllegalArgumentException("Circular references in the resource bundles");
    }

    private void Z(u uVar, g.i iVar, Y1.v vVar, UResourceBundle uResourceBundle) {
        boolean z3;
        f fVar = (f) this;
        iVar.f12716a = fVar.f12542b.f12565e;
        iVar.f12717b = fVar.w0();
        String str = this.f12544d;
        if (str == null) {
            str = "";
        }
        uVar.n(str);
        if (this.parent == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        vVar.a(uVar, iVar, z3);
        ResourceBundle resourceBundle = this.parent;
        if (resourceBundle != null) {
            ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) resourceBundle;
            int m02 = m0();
            if (m02 != 0) {
                String[] strArr = new String[m02];
                o0(strArr, m02);
                iCUResourceBundle = R(strArr, 0, iCUResourceBundle, uResourceBundle);
            }
            if (iCUResourceBundle != null) {
                iCUResourceBundle.Z(uVar, iVar, vVar, uResourceBundle);
            }
        }
    }

    private static e b0(String str, ClassLoader classLoader) {
        return (e) f12541h.b(str, classLoader);
    }

    public static final ULocale[] c0() {
        return e0("com/ibm/icu/impl/data/icudt71b", f12538e, ULocale.AvailableType.DEFAULT);
    }

    public static final ULocale[] d0(ULocale.AvailableType availableType) {
        return e0("com/ibm/icu/impl/data/icudt71b", f12538e, availableType);
    }

    public static final ULocale[] e0(String str, ClassLoader classLoader, ULocale.AvailableType availableType) {
        return b0(str, classLoader).b(availableType);
    }

    private static ICUResourceBundle f0(g gVar, String str, String str2, ClassLoader classLoader) {
        int M3 = gVar.M();
        if (g.e(g.c(M3))) {
            f.g gVar2 = new f.g(new h(str, str2, classLoader, gVar), M3);
            String z02 = gVar2.z0("%%ALIAS");
            if (z02 != null) {
                return (ICUResourceBundle) UResourceBundle.f(str, z02);
            }
            return gVar2;
        }
        throw new IllegalStateException("Invalid format error");
    }

    public static ICUResourceBundle g0(String str, ULocale uLocale, OpenType openType) {
        if (uLocale == null) {
            uLocale = ULocale.getDefault();
        }
        return h0(str, uLocale.getBaseName(), f12538e, openType);
    }

    public static ICUResourceBundle h0(String str, String str2, ClassLoader classLoader, OpenType openType) {
        ICUResourceBundle iCUResourceBundle;
        if (str == null) {
            str = "com/ibm/icu/impl/data/icudt71b";
        }
        String baseName = ULocale.getBaseName(str2);
        if (openType == OpenType.LOCALE_DEFAULT_ROOT) {
            iCUResourceBundle = s0(str, baseName, ULocale.getDefault().getBaseName(), classLoader, openType);
        } else {
            iCUResourceBundle = s0(str, baseName, (String) null, classLoader, openType);
        }
        if (iCUResourceBundle != null) {
            return iCUResourceBundle;
        }
        throw new MissingResourceException("Could not find the bundle " + str + "/" + baseName + ".res", "", "");
    }

    public static ICUResourceBundle i0(String str, String str2, ClassLoader classLoader, boolean z3) {
        OpenType openType;
        if (z3) {
            openType = OpenType.DIRECT;
        } else {
            openType = OpenType.LOCALE_DEFAULT_ROOT;
        }
        return h0(str, str2, classLoader, openType);
    }

    public static Set j0(String str, ClassLoader classLoader) {
        return b0(str, classLoader).a();
    }

    /* access modifiers changed from: private */
    public boolean k0() {
        return this.f12542b.f12565e.J();
    }

    private int m0() {
        ICUResourceBundle iCUResourceBundle = this.f12543c;
        if (iCUResourceBundle == null) {
            return 0;
        }
        return iCUResourceBundle.m0() + 1;
    }

    private static void n0(String str, int i4, String[] strArr, int i5) {
        if (i4 != 0) {
            if (i4 == 1) {
                strArr[i5] = str;
                return;
            }
            int i6 = 0;
            while (true) {
                int indexOf = str.indexOf(47, i6);
                int i7 = i5 + 1;
                strArr[i5] = str.substring(i6, indexOf);
                if (i4 == 2) {
                    strArr[i7] = str.substring(indexOf + 1);
                    return;
                }
                i6 = indexOf + 1;
                i4--;
                i5 = i7;
            }
        }
    }

    private void o0(String[] strArr, int i4) {
        ICUResourceBundle iCUResourceBundle = this;
        while (i4 > 0) {
            i4--;
            strArr[i4] = iCUResourceBundle.f12544d;
            iCUResourceBundle = iCUResourceBundle.f12543c;
        }
    }

    /* access modifiers changed from: private */
    public static ICUResourceBundle s0(String str, String str2, String str3, ClassLoader classLoader, OpenType openType) {
        StringBuilder sb;
        String C3 = g.C(str, str2);
        char ordinal = (char) (openType.ordinal() + 48);
        if (openType != OpenType.LOCALE_DEFAULT_ROOT) {
            sb = new StringBuilder();
            sb.append(C3);
            sb.append('#');
            sb.append(ordinal);
        } else {
            sb = new StringBuilder();
            sb.append(C3);
            sb.append('#');
            sb.append(ordinal);
            sb.append('#');
            sb.append(str3);
        }
        return (ICUResourceBundle) f12539f.b(sb.toString(), new d(C3, str, str2, classLoader, openType, str3));
    }

    /* access modifiers changed from: private */
    public static boolean t0(String str, String str2) {
        if (!str.startsWith(str2) || (str.length() != str2.length() && str.charAt(str2.length()) != '_')) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean A() {
        if (this.f12543c == null) {
            return true;
        }
        return false;
    }

    public String S(String str) {
        return T(str, this, (UResourceBundle) null);
    }

    /* renamed from: U */
    public ICUResourceBundle a(String str) {
        return (ICUResourceBundle) super.a(str);
    }

    public ICUResourceBundle V(String str) {
        return Q(str, this, (UResourceBundle) null);
    }

    /* access modifiers changed from: package-private */
    public ICUResourceBundle W(String str, HashMap hashMap, UResourceBundle uResourceBundle) {
        ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) w(str, hashMap, uResourceBundle);
        if (iCUResourceBundle == null) {
            iCUResourceBundle = n();
            if (iCUResourceBundle != null) {
                iCUResourceBundle = iCUResourceBundle.W(str, hashMap, uResourceBundle);
            }
            if (iCUResourceBundle == null) {
                String C3 = g.C(d(), m());
                throw new MissingResourceException("Can't find resource for bundle " + C3 + ", key " + str, getClass().getName(), str);
            }
        }
        return iCUResourceBundle;
    }

    public void a0(String str, Y1.v vVar) {
        ICUResourceBundle iCUResourceBundle;
        int M3 = M(str);
        if (M3 == 0) {
            iCUResourceBundle = this;
        } else {
            int m02 = m0();
            String[] strArr = new String[(m02 + M3)];
            n0(str, M3, strArr, m02);
            iCUResourceBundle = R(strArr, m02, this, (UResourceBundle) null);
            if (iCUResourceBundle == null) {
                throw new MissingResourceException("Can't find resource for bundle " + getClass().getName() + ", key " + t(), str, l());
            }
        }
        iCUResourceBundle.Z(new u(), new g.i(), vVar, this);
    }

    /* access modifiers changed from: protected */
    public String d() {
        return this.f12542b.f12561a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ICUResourceBundle)) {
            return false;
        }
        ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) obj;
        if (!d().equals(iCUResourceBundle.d()) || !m().equals(iCUResourceBundle.m())) {
            return false;
        }
        return true;
    }

    public Locale getLocale() {
        return u().toLocale();
    }

    public int hashCode() {
        return 42;
    }

    public String l() {
        return this.f12544d;
    }

    /* renamed from: l0 */
    public ICUResourceBundle n() {
        return (ICUResourceBundle) this.parent;
    }

    /* access modifiers changed from: protected */
    public String m() {
        return this.f12542b.f12562b;
    }

    public String p0(String str) {
        String T3 = T(str, this, (UResourceBundle) null);
        if (T3 == null) {
            throw new MissingResourceException("Can't find resource for bundle " + getClass().getName() + ", key " + t(), str, l());
        } else if (!T3.equals("∅∅∅")) {
            return T3;
        } else {
            throw new MissingResourceException("Encountered NO_INHERITANCE_MARKER", str, l());
        }
    }

    public final Set q0() {
        return this.f12542b.f12566f;
    }

    public x r0(String str) {
        ICUResourceBundle iCUResourceBundle;
        if (str.isEmpty()) {
            iCUResourceBundle = this;
        } else {
            iCUResourceBundle = Q(str, this, (UResourceBundle) null);
            if (iCUResourceBundle == null) {
                throw new MissingResourceException("Can't find resource for bundle " + getClass().getName() + ", key " + t(), str, l());
            }
        }
        g.i iVar = new g.i();
        f fVar = (f) iCUResourceBundle;
        iVar.f12716a = fVar.f12542b.f12565e;
        iVar.f12717b = fVar.w0();
        return iVar;
    }

    /* access modifiers changed from: protected */
    public void setParent(ResourceBundle resourceBundle) {
        this.parent = resourceBundle;
    }

    public ULocale u() {
        return this.f12542b.f12563c;
    }

    public final void u0(Set set) {
        this.f12542b.f12566f = set;
    }

    protected ICUResourceBundle(ICUResourceBundle iCUResourceBundle, String str) {
        this.f12544d = str;
        this.f12542b = iCUResourceBundle.f12542b;
        this.f12543c = iCUResourceBundle;
        this.parent = iCUResourceBundle.parent;
    }
}
