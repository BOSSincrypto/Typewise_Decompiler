package ch.icoaching.wrio.theming;

import K2.C0341a;
import android.content.Context;
import android.content.res.Configuration;
import ch.icoaching.wrio.data.b;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import ch.icoaching.wrio.logging.Log;
import ch.icoaching.wrio.subscription.a;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.g0;
import u2.l;

public final class DefaultThemeController implements a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineDispatcher f10658a;

    /* renamed from: b  reason: collision with root package name */
    private final D f10659b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final b f10660c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final a f10661d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C0341a f10662e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public ThemeModel f10663f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f10664g;

    /* renamed from: h  reason: collision with root package name */
    private ThemeModel f10665h;

    /* renamed from: i  reason: collision with root package name */
    private ThemeModel f10666i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public l f10667j;

    /* renamed from: k  reason: collision with root package name */
    private g0 f10668k;

    /* renamed from: l  reason: collision with root package name */
    private g0 f10669l;

    public DefaultThemeController(CoroutineDispatcher coroutineDispatcher, D d4, b bVar, a aVar, C0341a aVar2) {
        o.e(coroutineDispatcher, "ioDispatcher");
        o.e(d4, "serviceScope");
        o.e(bVar, "keyboardSettings");
        o.e(aVar, "subscriptionChecker");
        o.e(aVar2, "json");
        this.f10658a = coroutineDispatcher;
        this.f10659b = d4;
        this.f10660c = bVar;
        this.f10661d = aVar;
        this.f10662e = aVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r4 == null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r4 == null) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void f(android.content.Context r12, boolean r13) {
        /*
            r11 = this;
            ch.icoaching.wrio.data.b r0 = r11.f10660c
            java.lang.String[] r0 = r0.T()
            r1 = 0
            java.lang.String r2 = "dark"
            java.lang.String r3 = "light"
            if (r13 == 0) goto L_0x0022
            r4 = 1
            r4 = r0[r4]
            if (r4 != 0) goto L_0x0014
            r4 = r2
            goto L_0x0027
        L_0x0014:
            java.lang.String r5 = "none"
            boolean r5 = kotlin.jvm.internal.o.a(r4, r5)
            if (r5 == 0) goto L_0x0027
            r4 = r0[r1]
            if (r4 != 0) goto L_0x0027
        L_0x0020:
            r4 = r3
            goto L_0x0027
        L_0x0022:
            r4 = r0[r1]
            if (r4 != 0) goto L_0x0027
            goto L_0x0020
        L_0x0027:
            if (r13 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r2 = r3
        L_0x002b:
            android.content.res.AssetManager r13 = r12.getAssets()
            java.lang.String r0 = "getAssets(...)"
            kotlin.jvm.internal.o.d(r13, r0)
            K2.a r1 = r11.f10662e
            ch.icoaching.wrio.keyboard.model.config.ThemeConfig r13 = ch.icoaching.wrio.keyboard.view.D.c(r13, r4, r2, r1)
            ch.icoaching.wrio.keyboard.model.ThemeModel r13 = ch.icoaching.wrio.keyboard.view.D.k(r13, r12)
            boolean r1 = r13.isPremium()
            if (r1 == 0) goto L_0x006a
            ch.icoaching.wrio.subscription.a r1 = r11.f10661d
            boolean r1 = r1.b()
            if (r1 != 0) goto L_0x006a
            ch.icoaching.wrio.logging.Log r5 = ch.icoaching.wrio.logging.Log.f10572a
            r9 = 4
            r10 = 0
            java.lang.String r6 = "DefaultThemeController"
            java.lang.String r7 = "Premium theme not available, setting default"
            r8 = 0
            ch.icoaching.wrio.logging.Log.d(r5, r6, r7, r8, r9, r10)
            android.content.res.AssetManager r13 = r12.getAssets()
            kotlin.jvm.internal.o.d(r13, r0)
            K2.a r0 = r11.f10662e
            ch.icoaching.wrio.keyboard.model.config.ThemeConfig r13 = ch.icoaching.wrio.keyboard.view.D.c(r13, r2, r2, r0)
            ch.icoaching.wrio.keyboard.model.ThemeModel r13 = ch.icoaching.wrio.keyboard.view.D.k(r13, r12)
            goto L_0x0085
        L_0x006a:
            ch.icoaching.wrio.logging.Log r0 = ch.icoaching.wrio.logging.Log.f10572a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "Premium theme available, setting "
            r12.append(r1)
            r12.append(r4)
            java.lang.String r2 = r12.toString()
            r4 = 4
            r5 = 0
            java.lang.String r1 = "DefaultThemeController"
            r3 = 0
            ch.icoaching.wrio.logging.Log.d(r0, r1, r2, r3, r4, r5)
        L_0x0085:
            r11.f10663f = r13
            u2.l r12 = r11.f10667j
            if (r12 == 0) goto L_0x0096
            if (r13 != 0) goto L_0x0093
            java.lang.String r13 = "currentTheme"
            kotlin.jvm.internal.o.p(r13)
            r13 = 0
        L_0x0093:
            r12.invoke(r13)
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.theming.DefaultThemeController.f(android.content.Context, boolean):void");
    }

    private final void i(boolean z3) {
        ThemeModel themeModel;
        if (z3) {
            Log.d(Log.f10572a, "DefaultThemeController", "Applying set dark theme", (Throwable) null, 4, (Object) null);
            themeModel = this.f10666i;
            if (themeModel == null) {
                throw new IllegalArgumentException("Set dark theme must not be null!");
            }
        } else {
            Log.d(Log.f10572a, "DefaultThemeController", "Applying set light theme", (Throwable) null, 4, (Object) null);
            themeModel = this.f10665h;
            if (themeModel == null) {
                throw new IllegalArgumentException("Set light theme must not be null!");
            }
        }
        this.f10663f = themeModel;
        l lVar = this.f10667j;
        if (lVar != null) {
            lVar.invoke(themeModel);
        }
    }

    /* access modifiers changed from: private */
    public final void k(Context context, boolean z3) {
        g0 unused = C0739h.d(this.f10659b, (CoroutineContext) null, (CoroutineStart) null, new DefaultThemeController$loadThemeInBackground$1(this, z3, context, (c<? super DefaultThemeController$loadThemeInBackground$1>) null), 3, (Object) null);
    }

    public void a(l lVar) {
        o.e(lVar, "onThemeChangeCallback");
        this.f10667j = lVar;
    }

    public void b(Context context, Configuration configuration) {
        o.e(context, "context");
        o.e(configuration, "newConfig");
        if (!this.f10664g) {
            k(context, c.b(configuration));
        } else {
            i(c.b(configuration));
        }
    }

    public void c(Context context) {
        o.e(context, "context");
        if (!this.f10664g) {
            Configuration configuration = context.getResources().getConfiguration();
            o.d(configuration, "getConfiguration(...)");
            f(context, c.b(configuration));
        }
        g0 g0Var = this.f10669l;
        if (g0Var != null) {
            g0.a.a(g0Var, (CancellationException) null, 1, (Object) null);
        }
        this.f10669l = e.j(e.k(this.f10660c.A(), new DefaultThemeController$loadThemeFromAssets$1(this, context, (c<? super DefaultThemeController$loadThemeFromAssets$1>) null)), this.f10659b);
        g0 g0Var2 = this.f10668k;
        if (g0Var2 != null) {
            g0.a.a(g0Var2, (CancellationException) null, 1, (Object) null);
        }
        this.f10668k = e.j(e.k(this.f10661d.e(), new DefaultThemeController$loadThemeFromAssets$2(this, context, (c<? super DefaultThemeController$loadThemeFromAssets$2>) null)), this.f10659b);
    }

    public void e() {
        g0 g0Var = this.f10669l;
        if (g0Var != null) {
            g0.a.a(g0Var, (CancellationException) null, 1, (Object) null);
        }
        g0 g0Var2 = this.f10668k;
        if (g0Var2 != null) {
            g0.a.a(g0Var2, (CancellationException) null, 1, (Object) null);
        }
        this.f10667j = null;
    }
}
