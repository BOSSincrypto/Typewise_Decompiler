package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.B;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.core.os.g;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import y.C0940b;

/* renamed from: androidx.appcompat.app.g  reason: case insensitive filesystem */
public abstract class C0373g {

    /* renamed from: a  reason: collision with root package name */
    static B.a f2610a = new B.a(new B.b());

    /* renamed from: b  reason: collision with root package name */
    private static int f2611b = -100;

    /* renamed from: c  reason: collision with root package name */
    private static g f2612c = null;

    /* renamed from: d  reason: collision with root package name */
    private static g f2613d = null;

    /* renamed from: e  reason: collision with root package name */
    private static Boolean f2614e = null;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f2615f = false;

    /* renamed from: g  reason: collision with root package name */
    private static final C0940b f2616g = new C0940b();

    /* renamed from: h  reason: collision with root package name */
    private static final Object f2617h = new Object();

    /* renamed from: i  reason: collision with root package name */
    private static final Object f2618i = new Object();

    /* renamed from: androidx.appcompat.app.g$a */
    static class a {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* renamed from: androidx.appcompat.app.g$b */
    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    C0373g() {
    }

    static void F(C0373g gVar) {
        synchronized (f2617h) {
            G(gVar);
        }
    }

    private static void G(C0373g gVar) {
        synchronized (f2617h) {
            try {
                Iterator it = f2616g.iterator();
                while (it.hasNext()) {
                    C0373g gVar2 = (C0373g) ((WeakReference) it.next()).get();
                    if (gVar2 == gVar || gVar2 == null) {
                        it.remove();
                    }
                }
            } finally {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void Q(android.content.Context r3) {
        /*
            boolean r0 = v(r3)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r0 = androidx.core.os.a.b()
            if (r0 == 0) goto L_0x001c
            boolean r0 = f2615f
            if (r0 != 0) goto L_0x0057
            androidx.appcompat.app.B$a r0 = f2610a
            androidx.appcompat.app.f r1 = new androidx.appcompat.app.f
            r1.<init>(r3)
            r0.execute(r1)
            goto L_0x0057
        L_0x001c:
            java.lang.Object r0 = f2618i
            monitor-enter(r0)
            androidx.core.os.g r1 = f2612c     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0043
            androidx.core.os.g r1 = f2613d     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0034
            java.lang.String r3 = androidx.appcompat.app.B.b(r3)     // Catch:{ all -> 0x0032 }
            androidx.core.os.g r3 = androidx.core.os.g.c(r3)     // Catch:{ all -> 0x0032 }
            f2613d = r3     // Catch:{ all -> 0x0032 }
            goto L_0x0034
        L_0x0032:
            r3 = move-exception
            goto L_0x0058
        L_0x0034:
            androidx.core.os.g r3 = f2613d     // Catch:{ all -> 0x0032 }
            boolean r3 = r3.f()     // Catch:{ all -> 0x0032 }
            if (r3 == 0) goto L_0x003e
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x003e:
            androidx.core.os.g r3 = f2613d     // Catch:{ all -> 0x0032 }
            f2612c = r3     // Catch:{ all -> 0x0032 }
            goto L_0x0056
        L_0x0043:
            androidx.core.os.g r2 = f2613d     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0056
            androidx.core.os.g r1 = f2612c     // Catch:{ all -> 0x0032 }
            f2613d = r1     // Catch:{ all -> 0x0032 }
            java.lang.String r1 = r1.h()     // Catch:{ all -> 0x0032 }
            androidx.appcompat.app.B.a(r3, r1)     // Catch:{ all -> 0x0032 }
        L_0x0056:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
        L_0x0057:
            return
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0373g.Q(android.content.Context):void");
    }

    static void d(C0373g gVar) {
        synchronized (f2617h) {
            G(gVar);
            f2616g.add(new WeakReference(gVar));
        }
    }

    public static C0373g h(Activity activity, C0371e eVar) {
        return new C0374h(activity, eVar);
    }

    public static C0373g i(Dialog dialog, C0371e eVar) {
        return new C0374h(dialog, eVar);
    }

    public static g k() {
        if (androidx.core.os.a.b()) {
            Object p4 = p();
            if (p4 != null) {
                return g.i(b.a(p4));
            }
        } else {
            g gVar = f2612c;
            if (gVar != null) {
                return gVar;
            }
        }
        return g.e();
    }

    public static int m() {
        return f2611b;
    }

    static Object p() {
        Context l4;
        Iterator it = f2616g.iterator();
        while (it.hasNext()) {
            C0373g gVar = (C0373g) ((WeakReference) it.next()).get();
            if (gVar != null && (l4 = gVar.l()) != null) {
                return l4.getSystemService("locale");
            }
        }
        return null;
    }

    static g r() {
        return f2612c;
    }

    static boolean v(Context context) {
        if (f2614e == null) {
            try {
                Bundle bundle = z.a(context).metaData;
                if (bundle != null) {
                    f2614e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f2614e = Boolean.FALSE;
            }
        }
        return f2614e.booleanValue();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void w(Context context) {
        B.c(context);
        f2615f = true;
    }

    public abstract void A(Bundle bundle);

    public abstract void B();

    public abstract void C(Bundle bundle);

    public abstract void D();

    public abstract void E();

    public abstract boolean H(int i4);

    public abstract void I(int i4);

    public abstract void J(View view);

    public abstract void K(View view, ViewGroup.LayoutParams layoutParams);

    public void L(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void M(Toolbar toolbar);

    public abstract void N(int i4);

    public abstract void O(CharSequence charSequence);

    public abstract androidx.appcompat.view.b P(b.a aVar);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public void f(Context context) {
    }

    public Context g(Context context) {
        f(context);
        return context;
    }

    public abstract View j(int i4);

    public abstract Context l();

    public abstract C0368b n();

    public abstract int o();

    public abstract MenuInflater q();

    public abstract C0367a s();

    public abstract void t();

    public abstract void u();

    public abstract void x(Configuration configuration);

    public abstract void y(Bundle bundle);

    public abstract void z();
}
