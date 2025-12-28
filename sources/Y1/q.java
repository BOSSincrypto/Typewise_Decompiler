package Y1;

import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import java.io.InputStream;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public final class q extends UResourceBundle {

    /* renamed from: f  reason: collision with root package name */
    private static c f2055f = new a();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f2056g = h.a("resourceBundleWrapper");

    /* renamed from: b  reason: collision with root package name */
    private ResourceBundle f2057b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public String f2058c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public String f2059d;

    /* renamed from: e  reason: collision with root package name */
    private List f2060e;

    static class a extends s {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public q a(String str, c cVar) {
            return cVar.a();
        }
    }

    static class b extends c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f2061a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f2062b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f2063c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ClassLoader f2064d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f2065e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f2066f;

        class a implements PrivilegedAction {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f2067a;

            a(String str) {
                this.f2067a = str;
            }

            /* renamed from: a */
            public InputStream run() {
                return b.this.f2064d.getResourceAsStream(this.f2067a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str, String str2, String str3, ClassLoader classLoader, boolean z3, String str4) {
            super((a) null);
            this.f2061a = str;
            this.f2062b = str2;
            this.f2063c = str3;
            this.f2064d = classLoader;
            this.f2065e = z3;
            this.f2066f = str4;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:38|39|48|49|50|51) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x00de */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00e1 */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0059 A[SYNTHETIC, Splitter:B:11:0x0059] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0081  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0089 A[SYNTHETIC, Splitter:B:29:0x0089] */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x00e6 A[SYNTHETIC, Splitter:B:57:0x00e6] */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0135  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0139  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Y1.q a() {
            /*
                r10 = this;
                java.lang.String r0 = "failure"
                java.lang.String r1 = r10.f2061a
                r2 = 95
                int r1 = r1.lastIndexOf(r2)
                r3 = -1
                r4 = 1
                r5 = 0
                r6 = 0
                if (r1 == r3) goto L_0x0024
                java.lang.String r3 = r10.f2061a
                java.lang.String r1 = r3.substring(r6, r1)
                java.lang.String r3 = r10.f2062b
                java.lang.String r7 = r10.f2063c
                java.lang.ClassLoader r8 = r10.f2064d
                boolean r9 = r10.f2065e
                Y1.q r1 = Y1.q.N(r3, r1, r7, r8, r9)
            L_0x0022:
                r3 = r6
                goto L_0x003e
            L_0x0024:
                java.lang.String r1 = r10.f2061a
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L_0x003c
                java.lang.String r1 = r10.f2062b
                java.lang.String r3 = r10.f2063c
                java.lang.ClassLoader r7 = r10.f2064d
                boolean r8 = r10.f2065e
                java.lang.String r9 = ""
                Y1.q r1 = Y1.q.N(r1, r9, r3, r7, r8)
                r3 = r4
                goto L_0x003e
            L_0x003c:
                r1 = r5
                goto L_0x0022
            L_0x003e:
                java.lang.ClassLoader r7 = r10.f2064d     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x006e, Exception -> 0x006b }
                java.lang.String r8 = r10.f2066f     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x006e, Exception -> 0x006b }
                java.lang.Class r7 = r7.loadClass(r8)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x006e, Exception -> 0x006b }
                java.lang.Class<java.util.ResourceBundle> r8 = java.util.ResourceBundle.class
                java.lang.Class r7 = r7.asSubclass(r8)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x006e, Exception -> 0x006b }
                java.lang.Object r7 = r7.newInstance()     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x006e, Exception -> 0x006b }
                java.util.ResourceBundle r7 = (java.util.ResourceBundle) r7     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x006e, Exception -> 0x006b }
                Y1.q r8 = new Y1.q     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x006e, Exception -> 0x006b }
                r8.<init>(r7, r5)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x006e, Exception -> 0x006b }
                if (r1 == 0) goto L_0x005f
                r8.setParent(r1)     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x0087, Exception -> 0x005d }
                goto L_0x005f
            L_0x005d:
                r4 = move-exception
                goto L_0x0070
            L_0x005f:
                java.lang.String r7 = r10.f2062b     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x0087, Exception -> 0x005d }
                java.lang.String unused = r8.f2059d = r7     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x0087, Exception -> 0x005d }
                java.lang.String r7 = r10.f2061a     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x0087, Exception -> 0x005d }
                java.lang.String unused = r8.f2058c = r7     // Catch:{ ClassNotFoundException | NoClassDefFoundError -> 0x0087, Exception -> 0x005d }
            L_0x0069:
                r4 = r6
                goto L_0x0087
            L_0x006b:
                r4 = move-exception
                r8 = r5
                goto L_0x0070
            L_0x006e:
                r8 = r5
                goto L_0x0087
            L_0x0070:
                boolean r7 = Y1.q.f2056g
                if (r7 == 0) goto L_0x007b
                java.io.PrintStream r7 = java.lang.System.out
                r7.println(r0)
            L_0x007b:
                boolean r7 = Y1.q.f2056g
                if (r7 == 0) goto L_0x0069
                java.io.PrintStream r7 = java.lang.System.out
                r7.println(r4)
                goto L_0x0069
            L_0x0087:
                if (r4 == 0) goto L_0x0133
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00df }
                r4.<init>()     // Catch:{ Exception -> 0x00df }
                java.lang.String r6 = r10.f2066f     // Catch:{ Exception -> 0x00df }
                r7 = 46
                r9 = 47
                java.lang.String r6 = r6.replace(r7, r9)     // Catch:{ Exception -> 0x00df }
                r4.append(r6)     // Catch:{ Exception -> 0x00df }
                java.lang.String r6 = ".properties"
                r4.append(r6)     // Catch:{ Exception -> 0x00df }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00df }
                Y1.q$b$a r6 = new Y1.q$b$a     // Catch:{ Exception -> 0x00df }
                r6.<init>(r4)     // Catch:{ Exception -> 0x00df }
                java.lang.Object r4 = java.security.AccessController.doPrivileged(r6)     // Catch:{ Exception -> 0x00df }
                java.io.InputStream r4 = (java.io.InputStream) r4     // Catch:{ Exception -> 0x00df }
                if (r4 == 0) goto L_0x00e4
                java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00df }
                r6.<init>(r4)     // Catch:{ Exception -> 0x00df }
                Y1.q r4 = new Y1.q     // Catch:{ Exception -> 0x00e1, all -> 0x00da }
                java.util.PropertyResourceBundle r7 = new java.util.PropertyResourceBundle     // Catch:{ Exception -> 0x00e1, all -> 0x00da }
                r7.<init>(r6)     // Catch:{ Exception -> 0x00e1, all -> 0x00da }
                r4.<init>(r7, r5)     // Catch:{ Exception -> 0x00e1, all -> 0x00da }
                if (r1 == 0) goto L_0x00cb
                r4.setParent(r1)     // Catch:{ Exception -> 0x00c9, all -> 0x00c6 }
                goto L_0x00cb
            L_0x00c6:
                r1 = move-exception
                r8 = r4
                goto L_0x00db
            L_0x00c9:
                r8 = r4
                goto L_0x00e1
            L_0x00cb:
                java.lang.String r5 = r10.f2062b     // Catch:{ Exception -> 0x00c9, all -> 0x00c6 }
                java.lang.String unused = r4.f2059d = r5     // Catch:{ Exception -> 0x00c9, all -> 0x00c6 }
                java.lang.String r5 = r10.f2061a     // Catch:{ Exception -> 0x00c9, all -> 0x00c6 }
                java.lang.String unused = r4.f2058c = r5     // Catch:{ Exception -> 0x00c9, all -> 0x00c6 }
                r6.close()     // Catch:{ Exception -> 0x00d8 }
            L_0x00d8:
                r8 = r4
                goto L_0x00e4
            L_0x00da:
                r1 = move-exception
            L_0x00db:
                r6.close()     // Catch:{ Exception -> 0x00de }
            L_0x00de:
                throw r1     // Catch:{ Exception -> 0x00df }
            L_0x00df:
                r1 = move-exception
                goto L_0x011d
            L_0x00e1:
                r6.close()     // Catch:{ Exception -> 0x00e4 }
            L_0x00e4:
                if (r8 != 0) goto L_0x0111
                boolean r4 = r10.f2065e     // Catch:{ Exception -> 0x00df }
                if (r4 != 0) goto L_0x0111
                java.lang.String r4 = r10.f2061a     // Catch:{ Exception -> 0x00df }
                boolean r4 = r4.isEmpty()     // Catch:{ Exception -> 0x00df }
                if (r4 != 0) goto L_0x0111
                java.lang.String r4 = r10.f2061a     // Catch:{ Exception -> 0x00df }
                int r2 = r4.indexOf(r2)     // Catch:{ Exception -> 0x00df }
                if (r2 >= 0) goto L_0x0111
                java.lang.String r2 = r10.f2063c     // Catch:{ Exception -> 0x00df }
                java.lang.String r4 = r10.f2061a     // Catch:{ Exception -> 0x00df }
                boolean r2 = Y1.q.O(r2, r4)     // Catch:{ Exception -> 0x00df }
                if (r2 != 0) goto L_0x0111
                java.lang.String r2 = r10.f2062b     // Catch:{ Exception -> 0x00df }
                java.lang.String r4 = r10.f2063c     // Catch:{ Exception -> 0x00df }
                java.lang.ClassLoader r5 = r10.f2064d     // Catch:{ Exception -> 0x00df }
                boolean r6 = r10.f2065e     // Catch:{ Exception -> 0x00df }
                Y1.q r2 = Y1.q.N(r2, r4, r4, r5, r6)     // Catch:{ Exception -> 0x00df }
                r8 = r2
            L_0x0111:
                if (r8 != 0) goto L_0x011a
                if (r3 == 0) goto L_0x011b
                boolean r0 = r10.f2065e     // Catch:{ Exception -> 0x00df }
                if (r0 != 0) goto L_0x011a
                goto L_0x011b
            L_0x011a:
                r1 = r8
            L_0x011b:
                r8 = r1
                goto L_0x0133
            L_0x011d:
                boolean r2 = Y1.q.f2056g
                if (r2 == 0) goto L_0x0128
                java.io.PrintStream r2 = java.lang.System.out
                r2.println(r0)
            L_0x0128:
                boolean r0 = Y1.q.f2056g
                if (r0 == 0) goto L_0x0133
                java.io.PrintStream r0 = java.lang.System.out
                r0.println(r1)
            L_0x0133:
                if (r8 == 0) goto L_0x0139
                r8.M()
                goto L_0x0161
            L_0x0139:
                boolean r0 = Y1.q.f2056g
                if (r0 == 0) goto L_0x0161
                java.io.PrintStream r0 = java.lang.System.out
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Returning null for "
                r1.append(r2)
                java.lang.String r2 = r10.f2062b
                r1.append(r2)
                java.lang.String r2 = "_"
                r1.append(r2)
                java.lang.String r2 = r10.f2061a
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.println(r1)
            L_0x0161:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: Y1.q.b.a():Y1.q");
        }
    }

    private static abstract class c {
        private c() {
        }

        /* access modifiers changed from: package-private */
        public abstract q a();

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* synthetic */ q(ResourceBundle resourceBundle, a aVar) {
        this(resourceBundle);
    }

    public static q L(String str, String str2, ClassLoader classLoader, boolean z3) {
        q qVar;
        String str3;
        if (classLoader == null) {
            classLoader = f.b();
        }
        if (z3) {
            qVar = N(str, str2, (String) null, classLoader, z3);
        } else {
            qVar = N(str, str2, ULocale.getDefault().getBaseName(), classLoader, z3);
        }
        if (qVar != null) {
            return qVar;
        }
        if (str.indexOf(47) >= 0) {
            str3 = "/";
        } else {
            str3 = "_";
        }
        throw new MissingResourceException("Could not find the bundle " + str + str3 + str2, "", "");
    }

    /* access modifiers changed from: private */
    public void M() {
        this.f2060e = new ArrayList();
        for (q qVar = this; qVar != null; qVar = (q) qVar.n()) {
            Enumeration<String> keys = qVar.f2057b.getKeys();
            while (keys.hasMoreElements()) {
                String nextElement = keys.nextElement();
                if (!this.f2060e.contains(nextElement)) {
                    this.f2060e.add(nextElement);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static q N(String str, String str2, String str3, ClassLoader classLoader, boolean z3) {
        String str4;
        String str5;
        if (str2.isEmpty()) {
            str4 = str;
        } else {
            str4 = str + '_' + str2;
        }
        if (z3) {
            str5 = str4;
        } else {
            str5 = str4 + '#' + str3;
        }
        return (q) f2055f.b(str5, new b(str2, str, str3, classLoader, z3, str4));
    }

    /* access modifiers changed from: private */
    public static boolean O(String str, String str2) {
        if (!str.startsWith(str2) || (str.length() != str2.length() && str.charAt(str2.length()) != '_')) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public String d() {
        return this.f2057b.getClass().getName().replace('.', '/');
    }

    public Enumeration getKeys() {
        return Collections.enumeration(this.f2060e);
    }

    /* access modifiers changed from: protected */
    public Object handleGetObject(String str) {
        Object obj;
        q qVar = this;
        while (true) {
            if (qVar == null) {
                obj = null;
                break;
            }
            try {
                obj = qVar.f2057b.getObject(str);
                break;
            } catch (MissingResourceException unused) {
                qVar = (q) qVar.n();
            }
        }
        if (obj != null) {
            return obj;
        }
        throw new MissingResourceException("Can't find resource for bundle " + this.f2059d + ", key " + str, q.class.getName(), str);
    }

    /* access modifiers changed from: protected */
    public String m() {
        return this.f2058c;
    }

    public UResourceBundle n() {
        return (UResourceBundle) this.parent;
    }

    public ULocale u() {
        return new ULocale(this.f2058c);
    }

    private q(ResourceBundle resourceBundle) {
        this.f2058c = null;
        this.f2059d = null;
        this.f2060e = null;
        this.f2057b = resourceBundle;
    }
}
