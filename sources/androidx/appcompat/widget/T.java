package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p.C0844a;
import q.C0857c;
import y.C0942d;
import y.C0943e;
import y.h;

public final class T {

    /* renamed from: h  reason: collision with root package name */
    private static final PorterDuff.Mode f3382h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i  reason: collision with root package name */
    private static T f3383i;

    /* renamed from: j  reason: collision with root package name */
    private static final c f3384j = new c(6);

    /* renamed from: a  reason: collision with root package name */
    private WeakHashMap f3385a;

    /* renamed from: b  reason: collision with root package name */
    private y.g f3386b;

    /* renamed from: c  reason: collision with root package name */
    private h f3387c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakHashMap f3388d = new WeakHashMap(0);

    /* renamed from: e  reason: collision with root package name */
    private TypedValue f3389e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3390f;

    /* renamed from: g  reason: collision with root package name */
    private f f3391g;

    static class a implements e {
        a() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0844a.l(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e4) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e4);
                return null;
            }
        }
    }

    private static class b implements e {
        b() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.c.b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e4) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e4);
                return null;
            }
        }
    }

    private static class c extends C0943e {
        public c(int i4) {
            super(i4);
        }

        private static int h(int i4, PorterDuff.Mode mode) {
            return ((i4 + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter i(int i4, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) c(Integer.valueOf(h(i4, mode)));
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter j(int i4, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) d(Integer.valueOf(h(i4, mode)), porterDuffColorFilter);
        }
    }

    static class d implements e {
        d() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                    C0857c.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e4) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e4);
                }
            }
            return null;
        }
    }

    private interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface f {
        boolean a(Context context, int i4, Drawable drawable);

        PorterDuff.Mode b(int i4);

        Drawable c(T t4, Context context, int i4);

        ColorStateList d(Context context, int i4);

        boolean e(Context context, int i4, Drawable drawable);
    }

    private static class g implements e {
        g() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.h.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e4) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e4);
                return null;
            }
        }
    }

    private void a(String str, e eVar) {
        if (this.f3386b == null) {
            this.f3386b = new y.g();
        }
        this.f3386b.put(str, eVar);
    }

    private synchronized boolean b(Context context, long j4, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            C0942d dVar = (C0942d) this.f3388d.get(context);
            if (dVar == null) {
                dVar = new C0942d();
                this.f3388d.put(context, dVar);
            }
            dVar.n(j4, new WeakReference(constantState));
            return true;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    private void c(Context context, int i4, ColorStateList colorStateList) {
        if (this.f3385a == null) {
            this.f3385a = new WeakHashMap();
        }
        h hVar = (h) this.f3385a.get(context);
        if (hVar == null) {
            hVar = new h();
            this.f3385a.put(context, hVar);
        }
        hVar.b(i4, colorStateList);
    }

    private void d(Context context) {
        if (!this.f3390f) {
            this.f3390f = true;
            Drawable j4 = j(context, q.d.f15900a);
            if (j4 == null || !q(j4)) {
                this.f3390f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    private static long e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable f(Context context, int i4) {
        Drawable drawable;
        if (this.f3389e == null) {
            this.f3389e = new TypedValue();
        }
        TypedValue typedValue = this.f3389e;
        context.getResources().getValue(i4, typedValue, true);
        long e4 = e(typedValue);
        Drawable i5 = i(context, e4);
        if (i5 != null) {
            return i5;
        }
        f fVar = this.f3391g;
        if (fVar == null) {
            drawable = null;
        } else {
            drawable = fVar.c(this, context, i4);
        }
        if (drawable != null) {
            drawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e4, drawable);
        }
        return drawable;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized T h() {
        T t4;
        synchronized (T.class) {
            try {
                if (f3383i == null) {
                    T t5 = new T();
                    f3383i = t5;
                    p(t5);
                }
                t4 = f3383i;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return t4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable i(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap r0 = r3.f3388d     // Catch:{ all -> 0x0028 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0028 }
            y.d r0 = (y.C0942d) r0     // Catch:{ all -> 0x0028 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.i(r5)     // Catch:{ all -> 0x0028 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0028 }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x002a
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0028 }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x0028 }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r4 = move-exception
            goto L_0x002f
        L_0x002a:
            r0.o(r5)     // Catch:{ all -> 0x0028 }
        L_0x002d:
            monitor-exit(r3)
            return r1
        L_0x002f:
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.T.i(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public static synchronized PorterDuffColorFilter l(int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter i5;
        synchronized (T.class) {
            c cVar = f3384j;
            i5 = cVar.i(i4, mode);
            if (i5 == null) {
                i5 = new PorterDuffColorFilter(i4, mode);
                cVar.j(i4, mode, i5);
            }
        }
        return i5;
    }

    private ColorStateList n(Context context, int i4) {
        h hVar;
        WeakHashMap weakHashMap = this.f3385a;
        if (weakHashMap == null || (hVar = (h) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) hVar.i(i4);
    }

    private static void p(T t4) {
        if (Build.VERSION.SDK_INT < 24) {
            t4.a("vector", new g());
            t4.a("animated-vector", new b());
            t4.a("animated-selector", new a());
            t4.a("drawable", new d());
        }
    }

    private static boolean q(Drawable drawable) {
        if ((drawable instanceof androidx.vectordrawable.graphics.drawable.h) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009c A[Catch:{ Exception -> 0x008f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable r(android.content.Context r11, int r12) {
        /*
            r10 = this;
            y.g r0 = r10.f3386b
            r1 = 0
            if (r0 == 0) goto L_0x00b3
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b3
            y.h r0 = r10.f3387c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.i(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            y.g r3 = r10.f3386b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            y.h r0 = new y.h
            r0.<init>()
            r10.f3387c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f3389e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f3389e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f3389e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = e(r0)
            android.graphics.drawable.Drawable r6 = r10.i(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00ab
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00ab
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x008f }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x008f }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x008f }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009c
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x008f }
            y.h r8 = r10.f3387c     // Catch:{ Exception -> 0x008f }
            r8.b(r12, r3)     // Catch:{ Exception -> 0x008f }
            y.g r8 = r10.f3386b     // Catch:{ Exception -> 0x008f }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x008f }
            androidx.appcompat.widget.T$e r3 = (androidx.appcompat.widget.T.e) r3     // Catch:{ Exception -> 0x008f }
            if (r3 == 0) goto L_0x0091
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x008f }
            android.graphics.drawable.Drawable r6 = r3.a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x008f }
            goto L_0x0091
        L_0x008f:
            r11 = move-exception
            goto L_0x00a4
        L_0x0091:
            if (r6 == 0) goto L_0x00ab
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x008f }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x008f }
            r10.b(r11, r4, r6)     // Catch:{ Exception -> 0x008f }
            goto L_0x00ab
        L_0x009c:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x008f }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x008f }
            throw r11     // Catch:{ Exception -> 0x008f }
        L_0x00a4:
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00ab:
            if (r6 != 0) goto L_0x00b2
            y.h r11 = r10.f3387c
            r11.b(r12, r2)
        L_0x00b2:
            return r6
        L_0x00b3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.T.r(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    private Drawable v(Context context, int i4, boolean z3, Drawable drawable) {
        ColorStateList m4 = m(context, i4);
        if (m4 != null) {
            if (K.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r4 = androidx.core.graphics.drawable.a.r(drawable);
            androidx.core.graphics.drawable.a.o(r4, m4);
            PorterDuff.Mode o4 = o(i4);
            if (o4 == null) {
                return r4;
            }
            androidx.core.graphics.drawable.a.p(r4, o4);
            return r4;
        }
        f fVar = this.f3391g;
        if ((fVar == null || !fVar.e(context, i4, drawable)) && !x(context, i4, drawable) && z3) {
            return null;
        }
        return drawable;
    }

    static void w(Drawable drawable, a0 a0Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        int[] state = drawable.getState();
        if (!K.a(drawable) || drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z3 = a0Var.f3508d;
            if (z3 || a0Var.f3507c) {
                if (z3) {
                    colorStateList = a0Var.f3505a;
                } else {
                    colorStateList = null;
                }
                if (a0Var.f3507c) {
                    mode = a0Var.f3506b;
                } else {
                    mode = f3382h;
                }
                drawable.setColorFilter(g(colorStateList, mode, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    public synchronized Drawable j(Context context, int i4) {
        return k(context, i4, false);
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable k(Context context, int i4, boolean z3) {
        Drawable r4;
        try {
            d(context);
            r4 = r(context, i4);
            if (r4 == null) {
                r4 = f(context, i4);
            }
            if (r4 == null) {
                r4 = androidx.core.content.a.d(context, i4);
            }
            if (r4 != null) {
                r4 = v(context, i4, z3, r4);
            }
            if (r4 != null) {
                K.b(r4);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return r4;
    }

    /* access modifiers changed from: package-private */
    public synchronized ColorStateList m(Context context, int i4) {
        ColorStateList n4;
        n4 = n(context, i4);
        if (n4 == null) {
            f fVar = this.f3391g;
            if (fVar == null) {
                n4 = null;
            } else {
                n4 = fVar.d(context, i4);
            }
            if (n4 != null) {
                c(context, i4, n4);
            }
        }
        return n4;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode o(int i4) {
        f fVar = this.f3391g;
        if (fVar == null) {
            return null;
        }
        return fVar.b(i4);
    }

    public synchronized void s(Context context) {
        C0942d dVar = (C0942d) this.f3388d.get(context);
        if (dVar != null) {
            dVar.c();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable t(Context context, m0 m0Var, int i4) {
        try {
            Drawable r4 = r(context, i4);
            if (r4 == null) {
                r4 = m0Var.a(i4);
            }
            if (r4 == null) {
                return null;
            }
            return v(context, i4, false, r4);
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public synchronized void u(f fVar) {
        this.f3391g = fVar;
    }

    /* access modifiers changed from: package-private */
    public boolean x(Context context, int i4, Drawable drawable) {
        f fVar = this.f3391g;
        if (fVar == null || !fVar.a(context, i4, drawable)) {
            return false;
        }
        return true;
    }
}
