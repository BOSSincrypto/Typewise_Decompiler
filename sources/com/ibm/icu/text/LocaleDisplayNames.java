package com.ibm.icu.text;

import Y1.g;
import com.ibm.icu.util.ULocale;
import java.lang.reflect.Method;

public abstract class LocaleDisplayNames {

    /* renamed from: a  reason: collision with root package name */
    private static final Method f13057a;

    /* renamed from: b  reason: collision with root package name */
    private static final Method f13058b;

    public enum DialectHandling {
        STANDARD_NAMES,
        DIALECT_NAMES
    }

    private static class b extends LocaleDisplayNames {

        /* renamed from: c  reason: collision with root package name */
        private ULocale f13060c;

        /* renamed from: d  reason: collision with root package name */
        private DisplayContext[] f13061d;

        public String c(String str) {
            return str;
        }

        public String d(String str, String str2) {
            return str2;
        }

        public String e(String str) {
            return str;
        }

        public String f(ULocale uLocale) {
            return uLocale.getName();
        }

        public String g(String str) {
            return str;
        }

        public String h(String str) {
            return str;
        }

        public String j(String str) {
            return str;
        }

        private b(ULocale uLocale, DialectHandling dialectHandling) {
            this.f13060c = uLocale;
            this.f13061d = new DisplayContext[]{dialectHandling == DialectHandling.DIALECT_NAMES ? DisplayContext.DIALECT_NAMES : DisplayContext.STANDARD_NAMES};
        }
    }

    static {
        Method method;
        Class<ULocale> cls = ULocale.class;
        Method method2 = null;
        try {
            Class<?> cls2 = Class.forName(g.b("com.ibm.icu.text.LocaleDisplayNames.impl", "com.ibm.icu.impl.LocaleDisplayNamesImpl"));
            try {
                method = cls2.getMethod("getInstance", new Class[]{cls, DialectHandling.class});
            } catch (NoSuchMethodException unused) {
                method = null;
            }
            try {
                method2 = cls2.getMethod("getInstance", new Class[]{cls, DisplayContext[].class});
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
            }
        } catch (ClassNotFoundException unused3) {
            method = null;
        }
        f13057a = method;
        f13058b = method2;
    }

    protected LocaleDisplayNames() {
    }

    public static LocaleDisplayNames a(ULocale uLocale) {
        return b(uLocale, DialectHandling.STANDARD_NAMES);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ibm.icu.text.LocaleDisplayNames b(com.ibm.icu.util.ULocale r4, com.ibm.icu.text.LocaleDisplayNames.DialectHandling r5) {
        /*
            java.lang.reflect.Method r0 = f13057a
            r1 = 0
            if (r0 == 0) goto L_0x0015
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0015 }
            r3 = 0
            r2[r3] = r4     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0015 }
            r3 = 1
            r2[r3] = r5     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0015 }
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0015 }
            com.ibm.icu.text.LocaleDisplayNames r0 = (com.ibm.icu.text.LocaleDisplayNames) r0     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0015 }
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r0 != 0) goto L_0x001d
            com.ibm.icu.text.LocaleDisplayNames$b r0 = new com.ibm.icu.text.LocaleDisplayNames$b
            r0.<init>(r4, r5)
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.text.LocaleDisplayNames.b(com.ibm.icu.util.ULocale, com.ibm.icu.text.LocaleDisplayNames$DialectHandling):com.ibm.icu.text.LocaleDisplayNames");
    }

    public abstract String c(String str);

    public abstract String d(String str, String str2);

    public abstract String e(String str);

    public abstract String f(ULocale uLocale);

    public abstract String g(String str);

    public abstract String h(String str);

    public String i(String str) {
        return h(str);
    }

    public abstract String j(String str);
}
