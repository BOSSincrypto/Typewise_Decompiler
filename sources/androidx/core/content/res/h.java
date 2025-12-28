package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.util.g;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal f4931a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    private static final WeakHashMap f4932b = new WeakHashMap(0);

    /* renamed from: c  reason: collision with root package name */
    private static final Object f4933c = new Object();

    static class a {
        static Drawable a(Resources resources, int i4, Resources.Theme theme) {
            return resources.getDrawable(i4, theme);
        }

        static Drawable b(Resources resources, int i4, int i5, Resources.Theme theme) {
            return resources.getDrawableForDensity(i4, i5, theme);
        }
    }

    static class b {
        static int a(Resources resources, int i4, Resources.Theme theme) {
            return resources.getColor(i4, theme);
        }

        static ColorStateList b(Resources resources, int i4, Resources.Theme theme) {
            return resources.getColorStateList(i4, theme);
        }
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final ColorStateList f4934a;

        /* renamed from: b  reason: collision with root package name */
        final Configuration f4935b;

        /* renamed from: c  reason: collision with root package name */
        final int f4936c;

        c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            int i4;
            this.f4934a = colorStateList;
            this.f4935b = configuration;
            if (theme == null) {
                i4 = 0;
            } else {
                i4 = theme.hashCode();
            }
            this.f4936c = i4;
        }
    }

    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        final Resources f4937a;

        /* renamed from: b  reason: collision with root package name */
        final Resources.Theme f4938b;

        d(Resources resources, Resources.Theme theme) {
            this.f4937a = resources;
            this.f4938b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (!this.f4937a.equals(dVar.f4937a) || !androidx.core.util.c.a(this.f4938b, dVar.f4938b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return androidx.core.util.c.b(this.f4937a, this.f4938b);
        }
    }

    public static abstract class e {
        public static Handler e(Handler handler) {
            if (handler == null) {
                return new Handler(Looper.getMainLooper());
            }
            return handler;
        }

        public final void c(int i4, Handler handler) {
            e(handler).post(new j(this, i4));
        }

        public final void d(Typeface typeface, Handler handler) {
            e(handler).post(new i(this, typeface));
        }

        /* renamed from: h */
        public abstract void f(int i4);

        /* renamed from: i */
        public abstract void g(Typeface typeface);
    }

    public static final class f {

        static class a {

            /* renamed from: a  reason: collision with root package name */
            private static final Object f4939a = new Object();

            /* renamed from: b  reason: collision with root package name */
            private static Method f4940b;

            /* renamed from: c  reason: collision with root package name */
            private static boolean f4941c;

            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0023 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            static void a(android.content.res.Resources.Theme r5) {
                /*
                    java.lang.Object r0 = f4939a
                    monitor-enter(r0)
                    boolean r1 = f4941c     // Catch:{ all -> 0x0017 }
                    r2 = 0
                    if (r1 != 0) goto L_0x001b
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r2)     // Catch:{ NoSuchMethodException -> 0x0019 }
                    f4940b = r3     // Catch:{ NoSuchMethodException -> 0x0019 }
                    r3.setAccessible(r1)     // Catch:{ NoSuchMethodException -> 0x0019 }
                    goto L_0x0019
                L_0x0017:
                    r5 = move-exception
                    goto L_0x0027
                L_0x0019:
                    f4941c = r1     // Catch:{ all -> 0x0017 }
                L_0x001b:
                    java.lang.reflect.Method r1 = f4940b     // Catch:{ all -> 0x0017 }
                    if (r1 == 0) goto L_0x0025
                    r1.invoke(r5, r2)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0023 }
                    goto L_0x0025
                L_0x0023:
                    f4940b = r2     // Catch:{ all -> 0x0017 }
                L_0x0025:
                    monitor-exit(r0)     // Catch:{ all -> 0x0017 }
                    return
                L_0x0027:
                    monitor-exit(r0)     // Catch:{ all -> 0x0017 }
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.h.f.a.a(android.content.res.Resources$Theme):void");
            }
        }

        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    private static void a(d dVar, int i4, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f4933c) {
            try {
                WeakHashMap weakHashMap = f4932b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(dVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(dVar, sparseArray);
                }
                sparseArray.append(i4, new c(colorStateList, dVar.f4937a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        if (r2.f4936c == r5.hashCode()) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList b(androidx.core.content.res.h.d r5, int r6) {
        /*
            java.lang.Object r0 = f4933c
            monitor-enter(r0)
            java.util.WeakHashMap r1 = f4932b     // Catch:{ all -> 0x0032 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0032 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0045
            int r2 = r1.size()     // Catch:{ all -> 0x0032 }
            if (r2 <= 0) goto L_0x0045
            java.lang.Object r2 = r1.get(r6)     // Catch:{ all -> 0x0032 }
            androidx.core.content.res.h$c r2 = (androidx.core.content.res.h.c) r2     // Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x0045
            android.content.res.Configuration r3 = r2.f4935b     // Catch:{ all -> 0x0032 }
            android.content.res.Resources r4 = r5.f4937a     // Catch:{ all -> 0x0032 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0032 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0032 }
            if (r3 == 0) goto L_0x0042
            android.content.res.Resources$Theme r5 = r5.f4938b     // Catch:{ all -> 0x0032 }
            if (r5 != 0) goto L_0x0034
            int r3 = r2.f4936c     // Catch:{ all -> 0x0032 }
            if (r3 == 0) goto L_0x003e
            goto L_0x0034
        L_0x0032:
            r5 = move-exception
            goto L_0x0048
        L_0x0034:
            if (r5 == 0) goto L_0x0042
            int r3 = r2.f4936c     // Catch:{ all -> 0x0032 }
            int r5 = r5.hashCode()     // Catch:{ all -> 0x0032 }
            if (r3 != r5) goto L_0x0042
        L_0x003e:
            android.content.res.ColorStateList r5 = r2.f4934a     // Catch:{ all -> 0x0032 }
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return r5
        L_0x0042:
            r1.remove(r6)     // Catch:{ all -> 0x0032 }
        L_0x0045:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            r5 = 0
            return r5
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.h.b(androidx.core.content.res.h$d, int):android.content.res.ColorStateList");
    }

    public static Typeface c(Context context, int i4) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i4, new TypedValue(), 0, (e) null, (Handler) null, false, true);
    }

    public static ColorStateList d(Resources resources, int i4, Resources.Theme theme) {
        d dVar = new d(resources, theme);
        ColorStateList b4 = b(dVar, i4);
        if (b4 != null) {
            return b4;
        }
        ColorStateList k4 = k(resources, i4, theme);
        if (k4 == null) {
            return b.b(resources, i4, theme);
        }
        a(dVar, i4, k4, theme);
        return k4;
    }

    public static Drawable e(Resources resources, int i4, Resources.Theme theme) {
        return a.a(resources, i4, theme);
    }

    public static Drawable f(Resources resources, int i4, int i5, Resources.Theme theme) {
        return a.b(resources, i4, i5, theme);
    }

    public static Typeface g(Context context, int i4) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i4, new TypedValue(), 0, (e) null, (Handler) null, false, false);
    }

    public static Typeface h(Context context, int i4, TypedValue typedValue, int i5, e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i4, typedValue, i5, eVar, (Handler) null, true, false);
    }

    public static void i(Context context, int i4, e eVar, Handler handler) {
        g.g(eVar);
        if (context.isRestricted()) {
            eVar.c(-4, handler);
            return;
        }
        m(context, i4, new TypedValue(), 0, eVar, handler, false, false);
    }

    private static TypedValue j() {
        ThreadLocal threadLocal = f4931a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList k(Resources resources, int i4, Resources.Theme theme) {
        if (l(resources, i4)) {
            return null;
        }
        try {
            return c.a(resources, resources.getXml(i4), theme);
        } catch (Exception e4) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e4);
            return null;
        }
    }

    private static boolean l(Resources resources, int i4) {
        TypedValue j4 = j();
        resources.getValue(i4, j4, true);
        int i5 = j4.type;
        if (i5 < 28 || i5 > 31) {
            return false;
        }
        return true;
    }

    private static Typeface m(Context context, int i4, TypedValue typedValue, int i5, e eVar, Handler handler, boolean z3, boolean z4) {
        Resources resources = context.getResources();
        int i6 = i4;
        resources.getValue(i4, typedValue, true);
        Typeface n4 = n(context, resources, typedValue, i4, i5, eVar, handler, z3, z4);
        if (n4 != null || eVar != null || z4) {
            return n4;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i4) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface n(android.content.Context r16, android.content.res.Resources r17, android.util.TypedValue r18, int r19, int r20, androidx.core.content.res.h.e r21, android.os.Handler r22, boolean r23, boolean r24) {
        /*
            r0 = r17
            r1 = r18
            r4 = r19
            r11 = r21
            r12 = r22
            java.lang.String r13 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L_0x00c6
            java.lang.String r14 = r2.toString()
            java.lang.String r2 = "res/"
            boolean r2 = r14.startsWith(r2)
            r15 = 0
            r10 = -3
            if (r2 != 0) goto L_0x0024
            if (r11 == 0) goto L_0x0023
            r11.c(r10, r12)
        L_0x0023:
            return r15
        L_0x0024:
            int r2 = r1.assetCookie
            r7 = r20
            android.graphics.Typeface r2 = androidx.core.graphics.i.f(r0, r4, r14, r2, r7)
            if (r2 == 0) goto L_0x0034
            if (r11 == 0) goto L_0x0033
            r11.d(r2, r12)
        L_0x0033:
            return r2
        L_0x0034:
            if (r24 == 0) goto L_0x0037
            return r15
        L_0x0037:
            java.lang.String r2 = r14.toLowerCase()     // Catch:{ XmlPullParserException -> 0x005b, IOException -> 0x0058 }
            java.lang.String r3 = ".xml"
            boolean r2 = r2.endsWith(r3)     // Catch:{ XmlPullParserException -> 0x005b, IOException -> 0x0058 }
            if (r2 == 0) goto L_0x007a
            android.content.res.XmlResourceParser r2 = r0.getXml(r4)     // Catch:{ XmlPullParserException -> 0x005b, IOException -> 0x0058 }
            androidx.core.content.res.e$b r2 = androidx.core.content.res.e.b(r2, r0)     // Catch:{ XmlPullParserException -> 0x005b, IOException -> 0x0058 }
            if (r2 != 0) goto L_0x005f
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r13, r0)     // Catch:{ XmlPullParserException -> 0x005b, IOException -> 0x0058 }
            if (r11 == 0) goto L_0x005e
            r11.c(r10, r12)     // Catch:{ XmlPullParserException -> 0x005b, IOException -> 0x0058 }
            goto L_0x005e
        L_0x0058:
            r0 = move-exception
            r15 = r10
            goto L_0x0096
        L_0x005b:
            r0 = move-exception
            r15 = r10
            goto L_0x00ab
        L_0x005e:
            return r15
        L_0x005f:
            int r6 = r1.assetCookie     // Catch:{ XmlPullParserException -> 0x005b, IOException -> 0x0058 }
            r1 = r16
            r3 = r17
            r4 = r19
            r5 = r14
            r7 = r20
            r8 = r21
            r9 = r22
            r15 = r10
            r10 = r23
            android.graphics.Typeface r0 = androidx.core.graphics.i.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ XmlPullParserException -> 0x0078, IOException -> 0x0076 }
            return r0
        L_0x0076:
            r0 = move-exception
            goto L_0x0096
        L_0x0078:
            r0 = move-exception
            goto L_0x00ab
        L_0x007a:
            r15 = r10
            int r5 = r1.assetCookie     // Catch:{ XmlPullParserException -> 0x0078, IOException -> 0x0076 }
            r1 = r16
            r2 = r17
            r3 = r19
            r4 = r14
            r6 = r20
            android.graphics.Typeface r0 = androidx.core.graphics.i.d(r1, r2, r3, r4, r5, r6)     // Catch:{ XmlPullParserException -> 0x0078, IOException -> 0x0076 }
            if (r11 == 0) goto L_0x0095
            if (r0 == 0) goto L_0x0092
            r11.d(r0, r12)     // Catch:{ XmlPullParserException -> 0x0078, IOException -> 0x0076 }
            goto L_0x0095
        L_0x0092:
            r11.c(r15, r12)     // Catch:{ XmlPullParserException -> 0x0078, IOException -> 0x0076 }
        L_0x0095:
            return r0
        L_0x0096:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
            goto L_0x00bf
        L_0x00ab:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
        L_0x00bf:
            if (r11 == 0) goto L_0x00c4
            r11.c(r15, r12)
        L_0x00c4:
            r1 = 0
            return r1
        L_0x00c6:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r19)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.h.n(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.h$e, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
