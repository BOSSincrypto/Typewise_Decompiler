package com.ibm.icu.util;

import Y1.q;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.impl.g;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public abstract class UResourceBundle extends ResourceBundle {

    /* renamed from: a  reason: collision with root package name */
    private static Map f13276a = new ConcurrentHashMap();

    private enum RootType {
        MISSING,
        ICU,
        JAVA
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f13278a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ibm.icu.util.UResourceBundle$RootType[] r0 = com.ibm.icu.util.UResourceBundle.RootType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13278a = r0
                com.ibm.icu.util.UResourceBundle$RootType r1 = com.ibm.icu.util.UResourceBundle.RootType.ICU     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13278a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ibm.icu.util.UResourceBundle$RootType r1 = com.ibm.icu.util.UResourceBundle.RootType.JAVA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13278a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ibm.icu.util.UResourceBundle$RootType r1 = com.ibm.icu.util.UResourceBundle.RootType.MISSING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.util.UResourceBundle.a.<clinit>():void");
        }
    }

    private Object B(String str, UResourceBundle uResourceBundle) {
        if (t() == 0) {
            return q();
        }
        UResourceBundle w3 = w(str, (HashMap) null, uResourceBundle);
        if (w3 == null) {
            return w3;
        }
        if (w3.t() == 0) {
            return w3.q();
        }
        try {
            if (w3.t() == 8) {
                return w3.y();
            }
            return w3;
        } catch (UResourceTypeMismatchException unused) {
            return w3;
        }
    }

    private static void C(String str, RootType rootType) {
        f13276a.put(str, rootType);
    }

    public static UResourceBundle e(String str) {
        if (str == null) {
            str = "com/ibm/icu/impl/data/icudt71b";
        }
        return h(str, ULocale.getDefault().getBaseName(), ICUResourceBundle.f12538e, false);
    }

    public static UResourceBundle f(String str, String str2) {
        return h(str, str2, ICUResourceBundle.f12538e, false);
    }

    public static UResourceBundle g(String str, String str2, ClassLoader classLoader) {
        return h(str, str2, classLoader, false);
    }

    protected static UResourceBundle h(String str, String str2, ClassLoader classLoader, boolean z3) {
        return z(str, str2, classLoader, z3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        Y1.q.L(r2, r0, r3, true);
        r3 = com.ibm.icu.util.UResourceBundle.RootType.JAVA;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        r3 = com.ibm.icu.util.UResourceBundle.RootType.MISSING;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0020 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.ibm.icu.util.UResourceBundle.RootType o(java.lang.String r2, java.lang.ClassLoader r3) {
        /*
            java.util.Map r0 = f13276a
            java.lang.Object r0 = r0.get(r2)
            com.ibm.icu.util.UResourceBundle$RootType r0 = (com.ibm.icu.util.UResourceBundle.RootType) r0
            if (r0 != 0) goto L_0x002e
            r0 = 46
            int r0 = r2.indexOf(r0)
            r1 = -1
            if (r0 != r1) goto L_0x0016
            java.lang.String r0 = "root"
            goto L_0x0018
        L_0x0016:
            java.lang.String r0 = ""
        L_0x0018:
            r1 = 1
            com.ibm.icu.impl.ICUResourceBundle.i0(r2, r0, r3, r1)     // Catch:{ MissingResourceException -> 0x0020 }
            com.ibm.icu.util.UResourceBundle$RootType r3 = com.ibm.icu.util.UResourceBundle.RootType.ICU     // Catch:{ MissingResourceException -> 0x0020 }
        L_0x001e:
            r0 = r3
            goto L_0x0029
        L_0x0020:
            Y1.q.L(r2, r0, r3, r1)     // Catch:{ MissingResourceException -> 0x0026 }
            com.ibm.icu.util.UResourceBundle$RootType r3 = com.ibm.icu.util.UResourceBundle.RootType.JAVA     // Catch:{ MissingResourceException -> 0x0026 }
            goto L_0x001e
        L_0x0026:
            com.ibm.icu.util.UResourceBundle$RootType r3 = com.ibm.icu.util.UResourceBundle.RootType.MISSING
            goto L_0x001e
        L_0x0029:
            java.util.Map r3 = f13276a
            r3.put(r2, r0)
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.util.UResourceBundle.o(java.lang.String, java.lang.ClassLoader):com.ibm.icu.util.UResourceBundle$RootType");
    }

    private Object x(String str, UResourceBundle uResourceBundle) {
        Object B3 = B(str, uResourceBundle);
        if (B3 == null) {
            UResourceBundle n4 = n();
            if (n4 != null) {
                B3 = n4.x(str, uResourceBundle);
            }
            if (B3 == null) {
                throw new MissingResourceException("Can't find resource for bundle " + getClass().getName() + ", key " + str, getClass().getName(), str);
            }
        }
        return B3;
    }

    protected static UResourceBundle z(String str, String str2, ClassLoader classLoader, boolean z3) {
        int i4 = a.f13278a[o(str, classLoader).ordinal()];
        if (i4 == 1) {
            return ICUResourceBundle.i0(str, str2, classLoader, z3);
        }
        if (i4 == 2) {
            return q.L(str, str2, classLoader, z3);
        }
        try {
            ICUResourceBundle i02 = ICUResourceBundle.i0(str, str2, classLoader, z3);
            C(str, RootType.ICU);
            return i02;
        } catch (MissingResourceException unused) {
            q L3 = q.L(str, str2, classLoader, z3);
            C(str, RootType.JAVA);
            return L3;
        }
    }

    /* access modifiers changed from: protected */
    public boolean A() {
        return true;
    }

    /* access modifiers changed from: protected */
    public UResourceBundle a(String str) {
        for (UResourceBundle uResourceBundle = this; uResourceBundle != null; uResourceBundle = uResourceBundle.n()) {
            UResourceBundle w3 = uResourceBundle.w(str, (HashMap) null, this);
            if (w3 != null) {
                return w3;
            }
        }
        return null;
    }

    public UResourceBundle b(int i4) {
        UResourceBundle v3 = v(i4, (HashMap) null, this);
        if (v3 == null) {
            v3 = n();
            if (v3 != null) {
                v3 = v3.b(i4);
            }
            if (v3 == null) {
                throw new MissingResourceException("Can't find resource for bundle " + getClass().getName() + ", key " + l(), getClass().getName(), l());
            }
        }
        return v3;
    }

    public UResourceBundle c(String str) {
        UResourceBundle a4 = a(str);
        if (a4 != null) {
            return a4;
        }
        String C3 = g.C(d(), m());
        throw new MissingResourceException("Can't find resource for bundle " + C3 + ", key " + str, getClass().getName(), str);
    }

    /* access modifiers changed from: protected */
    public abstract String d();

    public Enumeration getKeys() {
        return Collections.enumeration(keySet());
    }

    public Locale getLocale() {
        return u().toLocale();
    }

    /* access modifiers changed from: protected */
    public Object handleGetObject(String str) {
        return x(str, this);
    }

    /* access modifiers changed from: protected */
    public Set handleKeySet() {
        return Collections.emptySet();
    }

    public int i() {
        throw new UResourceTypeMismatchException("");
    }

    public int[] j() {
        throw new UResourceTypeMismatchException("");
    }

    public g k() {
        return new g(this);
    }

    public Set keySet() {
        Set set;
        ICUResourceBundle iCUResourceBundle;
        TreeSet treeSet;
        if (!A() || !(this instanceof ICUResourceBundle)) {
            iCUResourceBundle = null;
            set = null;
        } else {
            iCUResourceBundle = (ICUResourceBundle) this;
            set = iCUResourceBundle.q0();
        }
        if (set == null) {
            if (!A()) {
                return handleKeySet();
            }
            ResourceBundle resourceBundle = this.parent;
            if (resourceBundle == null) {
                treeSet = new TreeSet();
            } else if (resourceBundle instanceof UResourceBundle) {
                treeSet = new TreeSet(((UResourceBundle) this.parent).keySet());
            } else {
                treeSet = new TreeSet();
                Enumeration<String> keys = this.parent.getKeys();
                while (keys.hasMoreElements()) {
                    treeSet.add(keys.nextElement());
                }
            }
            treeSet.addAll(handleKeySet());
            set = Collections.unmodifiableSet(treeSet);
            if (iCUResourceBundle != null) {
                iCUResourceBundle.u0(set);
            }
        }
        return set;
    }

    public String l() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract String m();

    /* access modifiers changed from: protected */
    public abstract UResourceBundle n();

    public int p() {
        return 1;
    }

    public String q() {
        throw new UResourceTypeMismatchException("");
    }

    public String r(int i4) {
        ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) b(i4);
        if (iCUResourceBundle.t() == 0) {
            return iCUResourceBundle.q();
        }
        throw new UResourceTypeMismatchException("");
    }

    public String[] s() {
        throw new UResourceTypeMismatchException("");
    }

    public int t() {
        return -1;
    }

    public abstract ULocale u();

    /* access modifiers changed from: protected */
    public UResourceBundle v(int i4, HashMap hashMap, UResourceBundle uResourceBundle) {
        return null;
    }

    /* access modifiers changed from: protected */
    public UResourceBundle w(String str, HashMap hashMap, UResourceBundle uResourceBundle) {
        return null;
    }

    /* access modifiers changed from: protected */
    public String[] y() {
        return null;
    }
}
