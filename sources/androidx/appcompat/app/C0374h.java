package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.b;
import androidx.appcompat.view.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0387k;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.I;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.m0;
import androidx.appcompat.widget.n0;
import androidx.core.content.res.h;
import androidx.core.view.C;
import androidx.core.view.C0435o0;
import androidx.core.view.C0436p;
import androidx.core.view.C0437q;
import androidx.core.view.P;
import androidx.core.view.W;
import androidx.core.view.X;
import androidx.core.view.Y;
import androidx.lifecycle.Lifecycle;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.uuid.Uuid;
import n.C0822a;
import n.C0824c;
import o.C0836a;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.appcompat.app.h  reason: case insensitive filesystem */
class C0374h extends C0373g implements g.a, LayoutInflater.Factory2 {

    /* renamed from: j0  reason: collision with root package name */
    private static final y.g f2619j0 = new y.g();

    /* renamed from: k0  reason: collision with root package name */
    private static final boolean f2620k0 = false;

    /* renamed from: l0  reason: collision with root package name */
    private static final int[] f2621l0 = {16842836};

    /* renamed from: m0  reason: collision with root package name */
    private static final boolean f2622m0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: n0  reason: collision with root package name */
    private static final boolean f2623n0 = true;

    /* renamed from: A  reason: collision with root package name */
    private boolean f2624A;

    /* renamed from: B  reason: collision with root package name */
    ViewGroup f2625B;

    /* renamed from: C  reason: collision with root package name */
    private TextView f2626C;

    /* renamed from: D  reason: collision with root package name */
    private View f2627D;

    /* renamed from: E  reason: collision with root package name */
    private boolean f2628E;

    /* renamed from: F  reason: collision with root package name */
    private boolean f2629F;

    /* renamed from: G  reason: collision with root package name */
    boolean f2630G;

    /* renamed from: H  reason: collision with root package name */
    boolean f2631H;

    /* renamed from: I  reason: collision with root package name */
    boolean f2632I;

    /* renamed from: J  reason: collision with root package name */
    boolean f2633J;

    /* renamed from: K  reason: collision with root package name */
    boolean f2634K;

    /* renamed from: L  reason: collision with root package name */
    private boolean f2635L;

    /* renamed from: M  reason: collision with root package name */
    private u[] f2636M;

    /* renamed from: N  reason: collision with root package name */
    private u f2637N;

    /* renamed from: O  reason: collision with root package name */
    private boolean f2638O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f2639P;

    /* renamed from: Q  reason: collision with root package name */
    private boolean f2640Q;

    /* renamed from: R  reason: collision with root package name */
    boolean f2641R;

    /* renamed from: S  reason: collision with root package name */
    private Configuration f2642S;

    /* renamed from: T  reason: collision with root package name */
    private int f2643T;

    /* renamed from: U  reason: collision with root package name */
    private int f2644U;

    /* renamed from: V  reason: collision with root package name */
    private int f2645V;

    /* renamed from: W  reason: collision with root package name */
    private boolean f2646W;

    /* renamed from: X  reason: collision with root package name */
    private q f2647X;

    /* renamed from: Y  reason: collision with root package name */
    private q f2648Y;

    /* renamed from: Z  reason: collision with root package name */
    boolean f2649Z;

    /* renamed from: a0  reason: collision with root package name */
    int f2650a0;

    /* renamed from: b0  reason: collision with root package name */
    private final Runnable f2651b0;

    /* renamed from: c0  reason: collision with root package name */
    private boolean f2652c0;

    /* renamed from: d0  reason: collision with root package name */
    private Rect f2653d0;

    /* renamed from: e0  reason: collision with root package name */
    private Rect f2654e0;

    /* renamed from: f0  reason: collision with root package name */
    private y f2655f0;

    /* renamed from: g0  reason: collision with root package name */
    private C f2656g0;

    /* renamed from: h0  reason: collision with root package name */
    private OnBackInvokedDispatcher f2657h0;

    /* renamed from: i0  reason: collision with root package name */
    private OnBackInvokedCallback f2658i0;

    /* renamed from: j  reason: collision with root package name */
    final Object f2659j;

    /* renamed from: k  reason: collision with root package name */
    final Context f2660k;

    /* renamed from: l  reason: collision with root package name */
    Window f2661l;

    /* renamed from: m  reason: collision with root package name */
    private o f2662m;

    /* renamed from: n  reason: collision with root package name */
    final C0371e f2663n;

    /* renamed from: o  reason: collision with root package name */
    C0367a f2664o;

    /* renamed from: p  reason: collision with root package name */
    MenuInflater f2665p;

    /* renamed from: q  reason: collision with root package name */
    private CharSequence f2666q;

    /* renamed from: r  reason: collision with root package name */
    private I f2667r;

    /* renamed from: s  reason: collision with root package name */
    private C0052h f2668s;

    /* renamed from: t  reason: collision with root package name */
    private v f2669t;

    /* renamed from: u  reason: collision with root package name */
    androidx.appcompat.view.b f2670u;

    /* renamed from: v  reason: collision with root package name */
    ActionBarContextView f2671v;

    /* renamed from: w  reason: collision with root package name */
    PopupWindow f2672w;

    /* renamed from: x  reason: collision with root package name */
    Runnable f2673x;

    /* renamed from: y  reason: collision with root package name */
    W f2674y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f2675z;

    /* renamed from: androidx.appcompat.app.h$a */
    class a implements Runnable {
        a() {
        }

        public void run() {
            C0374h hVar = C0374h.this;
            if ((hVar.f2650a0 & 1) != 0) {
                hVar.i0(0);
            }
            C0374h hVar2 = C0374h.this;
            if ((hVar2.f2650a0 & 4096) != 0) {
                hVar2.i0(108);
            }
            C0374h hVar3 = C0374h.this;
            hVar3.f2649Z = false;
            hVar3.f2650a0 = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.h$b */
    class b implements C {
        b() {
        }

        public C0435o0 a(View view, C0435o0 o0Var) {
            int k4 = o0Var.k();
            int e12 = C0374h.this.e1(o0Var, (Rect) null);
            if (k4 != e12) {
                o0Var = o0Var.p(o0Var.i(), e12, o0Var.j(), o0Var.h());
            }
            return P.a0(view, o0Var);
        }
    }

    /* renamed from: androidx.appcompat.app.h$c */
    class c implements ContentFrameLayout.a {
        c() {
        }

        public void a() {
        }

        public void onDetachedFromWindow() {
            C0374h.this.g0();
        }
    }

    /* renamed from: androidx.appcompat.app.h$d */
    class d implements Runnable {

        /* renamed from: androidx.appcompat.app.h$d$a */
        class a extends Y {
            a() {
            }

            public void b(View view) {
                C0374h.this.f2671v.setAlpha(1.0f);
                C0374h.this.f2674y.h((X) null);
                C0374h.this.f2674y = null;
            }

            public void c(View view) {
                C0374h.this.f2671v.setVisibility(0);
            }
        }

        d() {
        }

        public void run() {
            C0374h hVar = C0374h.this;
            hVar.f2672w.showAtLocation(hVar.f2671v, 55, 0, 0);
            C0374h.this.j0();
            if (C0374h.this.U0()) {
                C0374h.this.f2671v.setAlpha(0.0f);
                C0374h hVar2 = C0374h.this;
                hVar2.f2674y = P.e(hVar2.f2671v).b(1.0f);
                C0374h.this.f2674y.h(new a());
                return;
            }
            C0374h.this.f2671v.setAlpha(1.0f);
            C0374h.this.f2671v.setVisibility(0);
        }
    }

    /* renamed from: androidx.appcompat.app.h$e */
    class e extends Y {
        e() {
        }

        public void b(View view) {
            C0374h.this.f2671v.setAlpha(1.0f);
            C0374h.this.f2674y.h((X) null);
            C0374h.this.f2674y = null;
        }

        public void c(View view) {
            C0374h.this.f2671v.setVisibility(0);
            if (C0374h.this.f2671v.getParent() instanceof View) {
                P.l0((View) C0374h.this.f2671v.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.h$f */
    private class f implements C0368b {
        f() {
        }
    }

    /* renamed from: androidx.appcompat.app.h$g */
    interface g {
        boolean a(int i4);

        View onCreatePanelView(int i4);
    }

    /* renamed from: androidx.appcompat.app.h$h  reason: collision with other inner class name */
    private final class C0052h implements m.a {
        C0052h() {
        }

        public void a(androidx.appcompat.view.menu.g gVar, boolean z3) {
            C0374h.this.Z(gVar);
        }

        public boolean b(androidx.appcompat.view.menu.g gVar) {
            Window.Callback v02 = C0374h.this.v0();
            if (v02 == null) {
                return true;
            }
            v02.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.h$i */
    class i implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private b.a f2684a;

        /* renamed from: androidx.appcompat.app.h$i$a */
        class a extends Y {
            a() {
            }

            public void b(View view) {
                C0374h.this.f2671v.setVisibility(8);
                C0374h hVar = C0374h.this;
                PopupWindow popupWindow = hVar.f2672w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.f2671v.getParent() instanceof View) {
                    P.l0((View) C0374h.this.f2671v.getParent());
                }
                C0374h.this.f2671v.k();
                C0374h.this.f2674y.h((X) null);
                C0374h hVar2 = C0374h.this;
                hVar2.f2674y = null;
                P.l0(hVar2.f2625B);
            }
        }

        public i(b.a aVar) {
            this.f2684a = aVar;
        }

        public boolean a(androidx.appcompat.view.b bVar, Menu menu) {
            P.l0(C0374h.this.f2625B);
            return this.f2684a.a(bVar, menu);
        }

        public void b(androidx.appcompat.view.b bVar) {
            this.f2684a.b(bVar);
            C0374h hVar = C0374h.this;
            if (hVar.f2672w != null) {
                hVar.f2661l.getDecorView().removeCallbacks(C0374h.this.f2673x);
            }
            C0374h hVar2 = C0374h.this;
            if (hVar2.f2671v != null) {
                hVar2.j0();
                C0374h hVar3 = C0374h.this;
                hVar3.f2674y = P.e(hVar3.f2671v).b(0.0f);
                C0374h.this.f2674y.h(new a());
            }
            C0374h hVar4 = C0374h.this;
            C0371e eVar = hVar4.f2663n;
            if (eVar != null) {
                eVar.onSupportActionModeFinished(hVar4.f2670u);
            }
            C0374h hVar5 = C0374h.this;
            hVar5.f2670u = null;
            P.l0(hVar5.f2625B);
            C0374h.this.c1();
        }

        public boolean c(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f2684a.c(bVar, menuItem);
        }

        public boolean d(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f2684a.d(bVar, menu);
        }
    }

    /* renamed from: androidx.appcompat.app.h$j */
    static class j {
        static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i4 = configuration.densityDpi;
            int i5 = configuration2.densityDpi;
            if (i4 != i5) {
                configuration3.densityDpi = i5;
            }
        }

        static void c(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        static void d(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    /* renamed from: androidx.appcompat.app.h$k */
    static class k {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* renamed from: androidx.appcompat.app.h$l */
    static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList a4 = configuration.getLocales();
            LocaleList a5 = configuration2.getLocales();
            if (!a4.equals(a5)) {
                configuration3.setLocales(a5);
                configuration3.locale = configuration2.locale;
            }
        }

        static androidx.core.os.g b(Configuration configuration) {
            return androidx.core.os.g.c(configuration.getLocales().toLanguageTags());
        }

        public static void c(androidx.core.os.g gVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(gVar.h()));
        }

        static void d(Configuration configuration, androidx.core.os.g gVar) {
            configuration.setLocales(LocaleList.forLanguageTags(gVar.h()));
        }
    }

    /* renamed from: androidx.appcompat.app.h$m */
    static class m {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                configuration3.colorMode = configuration3.colorMode | (configuration2.colorMode & 3);
            }
            if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                configuration3.colorMode = configuration3.colorMode | (configuration2.colorMode & 12);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.h$n */
    static class n {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Object obj, C0374h hVar) {
            Objects.requireNonNull(hVar);
            v vVar = new v(hVar);
            r.a(obj).registerOnBackInvokedCallback(1000000, vVar);
            return vVar;
        }

        static void c(Object obj, Object obj2) {
            r.a(obj).unregisterOnBackInvokedCallback(q.a(obj2));
        }
    }

    /* renamed from: androidx.appcompat.app.h$o */
    class o extends androidx.appcompat.view.i {

        /* renamed from: b  reason: collision with root package name */
        private g f2687b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f2688c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f2689d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f2690e;

        o(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: finally extract failed */
        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f2689d = true;
                boolean dispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                this.f2689d = false;
                return dispatchKeyEvent;
            } catch (Throwable th) {
                this.f2689d = false;
                throw th;
            }
        }

        /* JADX INFO: finally extract failed */
        public void c(Window.Callback callback) {
            try {
                this.f2688c = true;
                callback.onContentChanged();
                this.f2688c = false;
            } catch (Throwable th) {
                this.f2688c = false;
                throw th;
            }
        }

        /* JADX INFO: finally extract failed */
        public void d(Window.Callback callback, int i4, Menu menu) {
            try {
                this.f2690e = true;
                callback.onPanelClosed(i4, menu);
                this.f2690e = false;
            } catch (Throwable th) {
                this.f2690e = false;
                throw th;
            }
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f2689d) {
                return a().dispatchKeyEvent(keyEvent);
            }
            if (C0374h.this.h0(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (super.dispatchKeyShortcutEvent(keyEvent) || C0374h.this.G0(keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void e(g gVar) {
            this.f2687b = gVar;
        }

        /* access modifiers changed from: package-private */
        public final ActionMode f(ActionMode.Callback callback) {
            f.a aVar = new f.a(C0374h.this.f2660k, callback);
            androidx.appcompat.view.b P3 = C0374h.this.P(aVar);
            if (P3 != null) {
                return aVar.e(P3);
            }
            return null;
        }

        public void onContentChanged() {
            if (this.f2688c) {
                a().onContentChanged();
            }
        }

        public boolean onCreatePanelMenu(int i4, Menu menu) {
            if (i4 != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i4, menu);
            }
            return false;
        }

        public View onCreatePanelView(int i4) {
            View onCreatePanelView;
            g gVar = this.f2687b;
            if (gVar == null || (onCreatePanelView = gVar.onCreatePanelView(i4)) == null) {
                return super.onCreatePanelView(i4);
            }
            return onCreatePanelView;
        }

        public boolean onMenuOpened(int i4, Menu menu) {
            super.onMenuOpened(i4, menu);
            C0374h.this.J0(i4);
            return true;
        }

        public void onPanelClosed(int i4, Menu menu) {
            if (this.f2690e) {
                a().onPanelClosed(i4, menu);
                return;
            }
            super.onPanelClosed(i4, menu);
            C0374h.this.K0(i4);
        }

        public boolean onPreparePanel(int i4, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar;
            if (menu instanceof androidx.appcompat.view.menu.g) {
                gVar = (androidx.appcompat.view.menu.g) menu;
            } else {
                gVar = null;
            }
            if (i4 == 0 && gVar == null) {
                return false;
            }
            boolean z3 = true;
            if (gVar != null) {
                gVar.a0(true);
            }
            g gVar2 = this.f2687b;
            if (gVar2 == null || !gVar2.a(i4)) {
                z3 = false;
            }
            if (!z3) {
                z3 = super.onPreparePanel(i4, view, menu);
            }
            if (gVar != null) {
                gVar.a0(false);
            }
            return z3;
        }

        public void onProvideKeyboardShortcuts(List list, Menu menu, int i4) {
            androidx.appcompat.view.menu.g gVar;
            u t02 = C0374h.this.t0(0, true);
            if (t02 == null || (gVar = t02.f2709j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i4);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i4);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i4) {
            if (!C0374h.this.B0() || i4 != 0) {
                return super.onWindowStartingActionMode(callback, i4);
            }
            return f(callback);
        }
    }

    /* renamed from: androidx.appcompat.app.h$p */
    private class p extends q {

        /* renamed from: c  reason: collision with root package name */
        private final PowerManager f2692c;

        p(Context context) {
            super();
            this.f2692c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* access modifiers changed from: package-private */
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        public int c() {
            if (k.a(this.f2692c)) {
                return 2;
            }
            return 1;
        }

        public void d() {
            C0374h.this.T();
        }
    }

    /* renamed from: androidx.appcompat.app.h$q */
    abstract class q {

        /* renamed from: a  reason: collision with root package name */
        private BroadcastReceiver f2694a;

        /* renamed from: androidx.appcompat.app.h$q$a */
        class a extends BroadcastReceiver {
            a() {
            }

            public void onReceive(Context context, Intent intent) {
                q.this.d();
            }
        }

        q() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            BroadcastReceiver broadcastReceiver = this.f2694a;
            if (broadcastReceiver != null) {
                try {
                    C0374h.this.f2660k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f2694a = null;
            }
        }

        /* access modifiers changed from: package-private */
        public abstract IntentFilter b();

        /* access modifiers changed from: package-private */
        public abstract int c();

        /* access modifiers changed from: package-private */
        public abstract void d();

        /* access modifiers changed from: package-private */
        public void e() {
            a();
            IntentFilter b4 = b();
            if (b4 != null && b4.countActions() != 0) {
                if (this.f2694a == null) {
                    this.f2694a = new a();
                }
                C0374h.this.f2660k.registerReceiver(this.f2694a, b4);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.h$r */
    private class r extends q {

        /* renamed from: c  reason: collision with root package name */
        private final I f2697c;

        r(I i4) {
            super();
            this.f2697c = i4;
        }

        /* access modifiers changed from: package-private */
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        public int c() {
            if (this.f2697c.d()) {
                return 2;
            }
            return 1;
        }

        public void d() {
            C0374h.this.T();
        }
    }

    /* renamed from: androidx.appcompat.app.h$s */
    private static class s {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* renamed from: androidx.appcompat.app.h$t */
    private class t extends ContentFrameLayout {
        public t(Context context) {
            super(context);
        }

        private boolean b(int i4, int i5) {
            if (i4 < -5 || i5 < -5 || i4 > getWidth() + 5 || i5 > getHeight() + 5) {
                return true;
            }
            return false;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (C0374h.this.h0(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            C0374h.this.b0(0);
            return true;
        }

        public void setBackgroundResource(int i4) {
            setBackgroundDrawable(C0836a.b(getContext(), i4));
        }
    }

    /* renamed from: androidx.appcompat.app.h$u */
    protected static final class u {

        /* renamed from: a  reason: collision with root package name */
        int f2700a;

        /* renamed from: b  reason: collision with root package name */
        int f2701b;

        /* renamed from: c  reason: collision with root package name */
        int f2702c;

        /* renamed from: d  reason: collision with root package name */
        int f2703d;

        /* renamed from: e  reason: collision with root package name */
        int f2704e;

        /* renamed from: f  reason: collision with root package name */
        int f2705f;

        /* renamed from: g  reason: collision with root package name */
        ViewGroup f2706g;

        /* renamed from: h  reason: collision with root package name */
        View f2707h;

        /* renamed from: i  reason: collision with root package name */
        View f2708i;

        /* renamed from: j  reason: collision with root package name */
        androidx.appcompat.view.menu.g f2709j;

        /* renamed from: k  reason: collision with root package name */
        androidx.appcompat.view.menu.e f2710k;

        /* renamed from: l  reason: collision with root package name */
        Context f2711l;

        /* renamed from: m  reason: collision with root package name */
        boolean f2712m;

        /* renamed from: n  reason: collision with root package name */
        boolean f2713n;

        /* renamed from: o  reason: collision with root package name */
        boolean f2714o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f2715p;

        /* renamed from: q  reason: collision with root package name */
        boolean f2716q = false;

        /* renamed from: r  reason: collision with root package name */
        boolean f2717r;

        /* renamed from: s  reason: collision with root package name */
        Bundle f2718s;

        u(int i4) {
            this.f2700a = i4;
        }

        /* access modifiers changed from: package-private */
        public androidx.appcompat.view.menu.n a(m.a aVar) {
            if (this.f2709j == null) {
                return null;
            }
            if (this.f2710k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.f2711l, n.g.f14812j);
                this.f2710k = eVar;
                eVar.k(aVar);
                this.f2709j.b(this.f2710k);
            }
            return this.f2710k.d(this.f2706g);
        }

        public boolean b() {
            if (this.f2707h == null) {
                return false;
            }
            if (this.f2708i != null) {
                return true;
            }
            if (this.f2710k.b().getCount() > 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void c(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.f2709j;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.O(this.f2710k);
                }
                this.f2709j = gVar;
                if (gVar != null && (eVar = this.f2710k) != null) {
                    gVar.b(eVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0822a.f14668a, typedValue, true);
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                newTheme.applyStyle(i4, true);
            }
            newTheme.resolveAttribute(C0822a.f14659C, typedValue, true);
            int i5 = typedValue.resourceId;
            if (i5 != 0) {
                newTheme.applyStyle(i5, true);
            } else {
                newTheme.applyStyle(n.i.f14836b, true);
            }
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f2711l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(n.j.f15060y0);
            this.f2701b = obtainStyledAttributes.getResourceId(n.j.f14844B0, 0);
            this.f2705f = obtainStyledAttributes.getResourceId(n.j.f14840A0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.appcompat.app.h$v */
    private final class v implements m.a {
        v() {
        }

        public void a(androidx.appcompat.view.menu.g gVar, boolean z3) {
            boolean z4;
            androidx.appcompat.view.menu.g D3 = gVar.D();
            if (D3 != gVar) {
                z4 = true;
            } else {
                z4 = false;
            }
            C0374h hVar = C0374h.this;
            if (z4) {
                gVar = D3;
            }
            u m02 = hVar.m0(gVar);
            if (m02 == null) {
                return;
            }
            if (z4) {
                C0374h.this.Y(m02.f2700a, m02, D3);
                C0374h.this.c0(m02, true);
                return;
            }
            C0374h.this.c0(m02, z3);
        }

        public boolean b(androidx.appcompat.view.menu.g gVar) {
            Window.Callback v02;
            if (gVar != gVar.D()) {
                return true;
            }
            C0374h hVar = C0374h.this;
            if (!hVar.f2630G || (v02 = hVar.v0()) == null || C0374h.this.f2641R) {
                return true;
            }
            v02.onMenuOpened(108, gVar);
            return true;
        }
    }

    C0374h(Activity activity, C0371e eVar) {
        this(activity, (Window) null, eVar, activity);
    }

    private void A0(int i4) {
        this.f2650a0 = (1 << i4) | this.f2650a0;
        if (!this.f2649Z) {
            P.g0(this.f2661l.getDecorView(), this.f2651b0);
            this.f2649Z = true;
        }
    }

    private boolean F0(int i4, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        u t02 = t0(i4, true);
        if (!t02.f2714o) {
            return P0(t02, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean I0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.view.b r0 = r4.f2670u
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.h$u r2 = r4.t0(r5, r0)
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.I r5 = r4.f2667r
            if (r5 == 0) goto L_0x0043
            boolean r5 = r5.g()
            if (r5 == 0) goto L_0x0043
            android.content.Context r5 = r4.f2660k
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.I r5 = r4.f2667r
            boolean r5 = r5.b()
            if (r5 != 0) goto L_0x003c
            boolean r5 = r4.f2641R
            if (r5 != 0) goto L_0x0062
            boolean r5 = r4.P0(r2, r6)
            if (r5 == 0) goto L_0x0062
            androidx.appcompat.widget.I r5 = r4.f2667r
            boolean r0 = r5.f()
            goto L_0x0068
        L_0x003c:
            androidx.appcompat.widget.I r5 = r4.f2667r
            boolean r0 = r5.e()
            goto L_0x0068
        L_0x0043:
            boolean r5 = r2.f2714o
            if (r5 != 0) goto L_0x0064
            boolean r3 = r2.f2713n
            if (r3 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            boolean r5 = r2.f2712m
            if (r5 == 0) goto L_0x0062
            boolean r5 = r2.f2717r
            if (r5 == 0) goto L_0x005b
            r2.f2712m = r1
            boolean r5 = r4.P0(r2, r6)
            goto L_0x005c
        L_0x005b:
            r5 = r0
        L_0x005c:
            if (r5 == 0) goto L_0x0062
            r4.M0(r2, r6)
            goto L_0x0068
        L_0x0062:
            r0 = r1
            goto L_0x0068
        L_0x0064:
            r4.c0(r2, r0)
            r0 = r5
        L_0x0068:
            if (r0 == 0) goto L_0x0085
            android.content.Context r5 = r4.f2660k
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007e
            r5.playSoundEffect(r1)
            goto L_0x0085
        L_0x007e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0374h.I0(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void M0(androidx.appcompat.app.C0374h.u r12, android.view.KeyEvent r13) {
        /*
            r11 = this;
            boolean r0 = r12.f2714o
            if (r0 != 0) goto L_0x00f3
            boolean r0 = r11.f2641R
            if (r0 == 0) goto L_0x000a
            goto L_0x00f3
        L_0x000a:
            int r0 = r12.f2700a
            if (r0 != 0) goto L_0x0020
            android.content.Context r0 = r11.f2660k
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r1 = 4
            if (r0 != r1) goto L_0x0020
            return
        L_0x0020:
            android.view.Window$Callback r0 = r11.v0()
            r1 = 1
            if (r0 == 0) goto L_0x0035
            int r2 = r12.f2700a
            androidx.appcompat.view.menu.g r3 = r12.f2709j
            boolean r0 = r0.onMenuOpened(r2, r3)
            if (r0 != 0) goto L_0x0035
            r11.c0(r12, r1)
            return
        L_0x0035:
            android.content.Context r0 = r11.f2660k
            java.lang.String r2 = "window"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L_0x0042
            return
        L_0x0042:
            boolean r13 = r11.P0(r12, r13)
            if (r13 != 0) goto L_0x0049
            return
        L_0x0049:
            android.view.ViewGroup r13 = r12.f2706g
            r2 = -2
            if (r13 == 0) goto L_0x0064
            boolean r3 = r12.f2716q
            if (r3 == 0) goto L_0x0053
            goto L_0x0064
        L_0x0053:
            android.view.View r13 = r12.f2708i
            if (r13 == 0) goto L_0x00c6
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            if (r13 == 0) goto L_0x00c6
            int r13 = r13.width
            r3 = -1
            if (r13 != r3) goto L_0x00c6
            r4 = r3
            goto L_0x00c7
        L_0x0064:
            if (r13 != 0) goto L_0x0071
            boolean r13 = r11.y0(r12)
            if (r13 == 0) goto L_0x0070
            android.view.ViewGroup r13 = r12.f2706g
            if (r13 != 0) goto L_0x0080
        L_0x0070:
            return
        L_0x0071:
            boolean r3 = r12.f2716q
            if (r3 == 0) goto L_0x0080
            int r13 = r13.getChildCount()
            if (r13 <= 0) goto L_0x0080
            android.view.ViewGroup r13 = r12.f2706g
            r13.removeAllViews()
        L_0x0080:
            boolean r13 = r11.x0(r12)
            if (r13 == 0) goto L_0x00f1
            boolean r13 = r12.b()
            if (r13 != 0) goto L_0x008d
            goto L_0x00f1
        L_0x008d:
            android.view.View r13 = r12.f2707h
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            if (r13 != 0) goto L_0x009a
            android.view.ViewGroup$LayoutParams r13 = new android.view.ViewGroup$LayoutParams
            r13.<init>(r2, r2)
        L_0x009a:
            int r3 = r12.f2701b
            android.view.ViewGroup r4 = r12.f2706g
            r4.setBackgroundResource(r3)
            android.view.View r3 = r12.f2707h
            android.view.ViewParent r3 = r3.getParent()
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x00b2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r4 = r12.f2707h
            r3.removeView(r4)
        L_0x00b2:
            android.view.ViewGroup r3 = r12.f2706g
            android.view.View r4 = r12.f2707h
            r3.addView(r4, r13)
            android.view.View r13 = r12.f2707h
            boolean r13 = r13.hasFocus()
            if (r13 != 0) goto L_0x00c6
            android.view.View r13 = r12.f2707h
            r13.requestFocus()
        L_0x00c6:
            r4 = r2
        L_0x00c7:
            r13 = 0
            r12.f2713n = r13
            android.view.WindowManager$LayoutParams r13 = new android.view.WindowManager$LayoutParams
            int r6 = r12.f2703d
            int r7 = r12.f2704e
            r9 = 8519680(0x820000, float:1.1938615E-38)
            r10 = -3
            r5 = -2
            r8 = 1002(0x3ea, float:1.404E-42)
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            int r2 = r12.f2702c
            r13.gravity = r2
            int r2 = r12.f2705f
            r13.windowAnimations = r2
            android.view.ViewGroup r2 = r12.f2706g
            r0.addView(r2, r13)
            r12.f2714o = r1
            int r12 = r12.f2700a
            if (r12 != 0) goto L_0x00f0
            r11.c1()
        L_0x00f0:
            return
        L_0x00f1:
            r12.f2716q = r1
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0374h.M0(androidx.appcompat.app.h$u, android.view.KeyEvent):void");
    }

    private boolean O0(u uVar, int i4, KeyEvent keyEvent, int i5) {
        androidx.appcompat.view.menu.g gVar;
        boolean z3 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((uVar.f2712m || P0(uVar, keyEvent)) && (gVar = uVar.f2709j) != null) {
            z3 = gVar.performShortcut(i4, keyEvent, i5);
        }
        if (z3 && (i5 & 1) == 0 && this.f2667r == null) {
            c0(uVar, true);
        }
        return z3;
    }

    private boolean P0(u uVar, KeyEvent keyEvent) {
        boolean z3;
        int i4;
        boolean z4;
        I i5;
        I i6;
        I i7;
        if (this.f2641R) {
            return false;
        }
        if (uVar.f2712m) {
            return true;
        }
        u uVar2 = this.f2637N;
        if (!(uVar2 == null || uVar2 == uVar)) {
            c0(uVar2, false);
        }
        Window.Callback v02 = v0();
        if (v02 != null) {
            uVar.f2708i = v02.onCreatePanelView(uVar.f2700a);
        }
        int i8 = uVar.f2700a;
        if (i8 == 0 || i8 == 108) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && (i7 = this.f2667r) != null) {
            i7.c();
        }
        if (uVar.f2708i == null && (!z3 || !(N0() instanceof G))) {
            androidx.appcompat.view.menu.g gVar = uVar.f2709j;
            if (gVar == null || uVar.f2717r) {
                if (gVar == null && (!z0(uVar) || uVar.f2709j == null)) {
                    return false;
                }
                if (z3 && this.f2667r != null) {
                    if (this.f2668s == null) {
                        this.f2668s = new C0052h();
                    }
                    this.f2667r.a(uVar.f2709j, this.f2668s);
                }
                uVar.f2709j.d0();
                if (!v02.onCreatePanelMenu(uVar.f2700a, uVar.f2709j)) {
                    uVar.c((androidx.appcompat.view.menu.g) null);
                    if (z3 && (i6 = this.f2667r) != null) {
                        i6.a((Menu) null, this.f2668s);
                    }
                    return false;
                }
                uVar.f2717r = false;
            }
            uVar.f2709j.d0();
            Bundle bundle = uVar.f2718s;
            if (bundle != null) {
                uVar.f2709j.P(bundle);
                uVar.f2718s = null;
            }
            if (!v02.onPreparePanel(0, uVar.f2708i, uVar.f2709j)) {
                if (z3 && (i5 = this.f2667r) != null) {
                    i5.a((Menu) null, this.f2668s);
                }
                uVar.f2709j.c0();
                return false;
            }
            if (keyEvent != null) {
                i4 = keyEvent.getDeviceId();
            } else {
                i4 = -1;
            }
            if (KeyCharacterMap.load(i4).getKeyboardType() != 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            uVar.f2715p = z4;
            uVar.f2709j.setQwertyMode(z4);
            uVar.f2709j.c0();
        }
        uVar.f2712m = true;
        uVar.f2713n = false;
        this.f2637N = uVar;
        return true;
    }

    private void Q0(boolean z3) {
        I i4 = this.f2667r;
        if (i4 == null || !i4.g() || (ViewConfiguration.get(this.f2660k).hasPermanentMenuKey() && !this.f2667r.d())) {
            u t02 = t0(0, true);
            t02.f2716q = true;
            c0(t02, false);
            M0(t02, (KeyEvent) null);
            return;
        }
        Window.Callback v02 = v0();
        if (this.f2667r.b() && z3) {
            this.f2667r.e();
            if (!this.f2641R) {
                v02.onPanelClosed(108, t0(0, true).f2709j);
            }
        } else if (v02 != null && !this.f2641R) {
            if (this.f2649Z && (this.f2650a0 & 1) != 0) {
                this.f2661l.getDecorView().removeCallbacks(this.f2651b0);
                this.f2651b0.run();
            }
            u t03 = t0(0, true);
            androidx.appcompat.view.menu.g gVar = t03.f2709j;
            if (gVar != null && !t03.f2717r && v02.onPreparePanel(0, t03.f2708i, gVar)) {
                v02.onMenuOpened(108, t03.f2709j);
                this.f2667r.f();
            }
        }
    }

    private boolean R(boolean z3) {
        return S(z3, true);
    }

    private int R0(int i4) {
        if (i4 == 8) {
            return 108;
        }
        if (i4 == 9) {
            return 109;
        }
        return i4;
    }

    private boolean S(boolean z3, boolean z4) {
        androidx.core.os.g gVar;
        if (this.f2641R) {
            return false;
        }
        int X3 = X();
        int C02 = C0(this.f2660k, X3);
        if (Build.VERSION.SDK_INT < 33) {
            gVar = W(this.f2660k);
        } else {
            gVar = null;
        }
        if (!z4 && gVar != null) {
            gVar = s0(this.f2660k.getResources().getConfiguration());
        }
        boolean b12 = b1(C02, gVar, z3);
        if (X3 == 0) {
            r0(this.f2660k).e();
        } else {
            q qVar = this.f2647X;
            if (qVar != null) {
                qVar.a();
            }
        }
        if (X3 == 3) {
            q0(this.f2660k).e();
        } else {
            q qVar2 = this.f2648Y;
            if (qVar2 != null) {
                qVar2.a();
            }
        }
        return b12;
    }

    private void U() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f2625B.findViewById(16908290);
        View decorView = this.f2661l.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f2660k.obtainStyledAttributes(n.j.f15060y0);
        obtainStyledAttributes.getValue(n.j.f14880K0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(n.j.f14884L0, contentFrameLayout.getMinWidthMinor());
        int i4 = n.j.f14872I0;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedWidthMajor());
        }
        int i5 = n.j.f14876J0;
        if (obtainStyledAttributes.hasValue(i5)) {
            obtainStyledAttributes.getValue(i5, contentFrameLayout.getFixedWidthMinor());
        }
        int i6 = n.j.f14864G0;
        if (obtainStyledAttributes.hasValue(i6)) {
            obtainStyledAttributes.getValue(i6, contentFrameLayout.getFixedHeightMajor());
        }
        int i7 = n.j.f14868H0;
        if (obtainStyledAttributes.hasValue(i7)) {
            obtainStyledAttributes.getValue(i7, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void V(Window window) {
        if (this.f2661l == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof o)) {
                o oVar = new o(callback);
                this.f2662m = oVar;
                window.setCallback(oVar);
                c0 u3 = c0.u(this.f2660k, (AttributeSet) null, f2621l0);
                Drawable h4 = u3.h(0);
                if (h4 != null) {
                    window.setBackgroundDrawable(h4);
                }
                u3.w();
                this.f2661l = window;
                if (Build.VERSION.SDK_INT >= 33 && this.f2657h0 == null) {
                    L((OnBackInvokedDispatcher) null);
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private boolean V0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f2661l.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || P.R((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int X() {
        int i4 = this.f2643T;
        if (i4 != -100) {
            return i4;
        }
        return C0373g.m();
    }

    private void Y0() {
        if (this.f2624A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private C0370d Z0() {
        Context context = this.f2660k;
        while (context != null) {
            if (!(context instanceof C0370d)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (C0370d) context;
            }
        }
        return null;
    }

    private void a0() {
        q qVar = this.f2647X;
        if (qVar != null) {
            qVar.a();
        }
        q qVar2 = this.f2648Y;
        if (qVar2 != null) {
            qVar2.a();
        }
    }

    private void a1(Configuration configuration) {
        Activity activity = (Activity) this.f2659j;
        if (activity instanceof androidx.lifecycle.m) {
            if (((androidx.lifecycle.m) activity).getLifecycle().b().isAtLeast(Lifecycle.State.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else if (this.f2640Q && !this.f2641R) {
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b1(int r9, androidx.core.os.g r10, boolean r11) {
        /*
            r8 = this;
            android.content.Context r1 = r8.f2660k
            r4 = 0
            r5 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            android.content.res.Configuration r0 = r0.d0(r1, r2, r3, r4, r5)
            android.content.Context r1 = r8.f2660k
            int r1 = r8.p0(r1)
            android.content.res.Configuration r2 = r8.f2642S
            if (r2 != 0) goto L_0x001f
            android.content.Context r2 = r8.f2660k
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L_0x001f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            androidx.core.os.g r2 = r8.s0(r2)
            r5 = 0
            if (r10 != 0) goto L_0x0030
            r0 = r5
            goto L_0x0034
        L_0x0030:
            androidx.core.os.g r0 = r8.s0(r0)
        L_0x0034:
            r6 = 0
            if (r3 == r4) goto L_0x003a
            r3 = 512(0x200, float:7.175E-43)
            goto L_0x003b
        L_0x003a:
            r3 = r6
        L_0x003b:
            if (r0 == 0) goto L_0x0045
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0045
            r3 = r3 | 8196(0x2004, float:1.1485E-41)
        L_0x0045:
            int r2 = ~r1
            r2 = r2 & r3
            r7 = 1
            if (r2 == 0) goto L_0x006f
            if (r11 == 0) goto L_0x006f
            boolean r11 = r8.f2639P
            if (r11 == 0) goto L_0x006f
            boolean r11 = f2622m0
            if (r11 != 0) goto L_0x0058
            boolean r11 = r8.f2640Q
            if (r11 == 0) goto L_0x006f
        L_0x0058:
            java.lang.Object r11 = r8.f2659j
            boolean r2 = r11 instanceof android.app.Activity
            if (r2 == 0) goto L_0x006f
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r11 = r11.isChild()
            if (r11 != 0) goto L_0x006f
            java.lang.Object r11 = r8.f2659j
            android.app.Activity r11 = (android.app.Activity) r11
            androidx.core.app.b.q(r11)
            r11 = r7
            goto L_0x0070
        L_0x006f:
            r11 = r6
        L_0x0070:
            if (r11 != 0) goto L_0x007d
            if (r3 == 0) goto L_0x007d
            r11 = r3 & r1
            if (r11 != r3) goto L_0x0079
            r6 = r7
        L_0x0079:
            r8.d1(r4, r0, r6, r5)
            goto L_0x007e
        L_0x007d:
            r7 = r11
        L_0x007e:
            if (r7 == 0) goto L_0x009a
            java.lang.Object r11 = r8.f2659j
            boolean r1 = r11 instanceof androidx.appcompat.app.C0370d
            if (r1 == 0) goto L_0x009a
            r1 = r3 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x008f
            androidx.appcompat.app.d r11 = (androidx.appcompat.app.C0370d) r11
            r11.onNightModeChanged(r9)
        L_0x008f:
            r9 = r3 & 4
            if (r9 == 0) goto L_0x009a
            java.lang.Object r9 = r8.f2659j
            androidx.appcompat.app.d r9 = (androidx.appcompat.app.C0370d) r9
            r9.onLocalesChanged(r10)
        L_0x009a:
            if (r7 == 0) goto L_0x00af
            if (r0 == 0) goto L_0x00af
            android.content.Context r9 = r8.f2660k
            android.content.res.Resources r9 = r9.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            androidx.core.os.g r9 = r8.s0(r9)
            r8.T0(r9)
        L_0x00af:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0374h.b1(int, androidx.core.os.g, boolean):boolean");
    }

    private Configuration d0(Context context, int i4, androidx.core.os.g gVar, Configuration configuration, boolean z3) {
        int i5;
        if (i4 == 1) {
            i5 = 16;
        } else if (i4 == 2) {
            i5 = 32;
        } else if (z3) {
            i5 = 0;
        } else {
            i5 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i5 | (configuration2.uiMode & -49);
        if (gVar != null) {
            S0(configuration2, gVar);
        }
        return configuration2;
    }

    private void d1(int i4, androidx.core.os.g gVar, boolean z3, Configuration configuration) {
        Resources resources = this.f2660k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i4 | (resources.getConfiguration().uiMode & -49);
        if (gVar != null) {
            S0(configuration2, gVar);
        }
        resources.updateConfiguration(configuration2, (DisplayMetrics) null);
        if (Build.VERSION.SDK_INT < 26) {
            E.a(resources);
        }
        int i5 = this.f2644U;
        if (i5 != 0) {
            this.f2660k.setTheme(i5);
            this.f2660k.getTheme().applyStyle(this.f2644U, true);
        }
        if (z3 && (this.f2659j instanceof Activity)) {
            a1(configuration2);
        }
    }

    private ViewGroup e0() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f2660k.obtainStyledAttributes(n.j.f15060y0);
        int i4 = n.j.f14852D0;
        if (obtainStyledAttributes.hasValue(i4)) {
            if (obtainStyledAttributes.getBoolean(n.j.f14888M0, false)) {
                H(1);
            } else if (obtainStyledAttributes.getBoolean(i4, false)) {
                H(108);
            }
            if (obtainStyledAttributes.getBoolean(n.j.f14856E0, false)) {
                H(109);
            }
            if (obtainStyledAttributes.getBoolean(n.j.f14860F0, false)) {
                H(10);
            }
            this.f2633J = obtainStyledAttributes.getBoolean(n.j.f15064z0, false);
            obtainStyledAttributes.recycle();
            l0();
            this.f2661l.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f2660k);
            if (this.f2634K) {
                viewGroup = this.f2632I ? (ViewGroup) from.inflate(n.g.f14817o, (ViewGroup) null) : (ViewGroup) from.inflate(n.g.f14816n, (ViewGroup) null);
            } else if (this.f2633J) {
                viewGroup = (ViewGroup) from.inflate(n.g.f14808f, (ViewGroup) null);
                this.f2631H = false;
                this.f2630G = false;
            } else if (this.f2630G) {
                TypedValue typedValue = new TypedValue();
                this.f2660k.getTheme().resolveAttribute(C0822a.f14671d, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new androidx.appcompat.view.d(this.f2660k, typedValue.resourceId);
                } else {
                    context = this.f2660k;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(n.g.f14818p, (ViewGroup) null);
                I i5 = (I) viewGroup.findViewById(n.f.f14792p);
                this.f2667r = i5;
                i5.setWindowCallback(v0());
                if (this.f2631H) {
                    this.f2667r.k(109);
                }
                if (this.f2628E) {
                    this.f2667r.k(2);
                }
                if (this.f2629F) {
                    this.f2667r.k(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                P.C0(viewGroup, new b());
                if (this.f2667r == null) {
                    this.f2626C = (TextView) viewGroup.findViewById(n.f.f14773M);
                }
                n0.c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(n.f.f14778b);
                ViewGroup viewGroup2 = (ViewGroup) this.f2661l.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f2661l.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new c());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f2630G + ", windowActionBarOverlay: " + this.f2631H + ", android:windowIsFloating: " + this.f2633J + ", windowActionModeOverlay: " + this.f2632I + ", windowNoTitle: " + this.f2634K + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void f1(View view) {
        int i4;
        if ((P.L(view) & 8192) != 0) {
            i4 = androidx.core.content.a.b(this.f2660k, C0824c.f14696b);
        } else {
            i4 = androidx.core.content.a.b(this.f2660k, C0824c.f14695a);
        }
        view.setBackgroundColor(i4);
    }

    private void k0() {
        if (!this.f2624A) {
            this.f2625B = e0();
            CharSequence u02 = u0();
            if (!TextUtils.isEmpty(u02)) {
                I i4 = this.f2667r;
                if (i4 != null) {
                    i4.setWindowTitle(u02);
                } else if (N0() != null) {
                    N0().t(u02);
                } else {
                    TextView textView = this.f2626C;
                    if (textView != null) {
                        textView.setText(u02);
                    }
                }
            }
            U();
            L0(this.f2625B);
            this.f2624A = true;
            u t02 = t0(0, false);
            if (this.f2641R) {
                return;
            }
            if (t02 == null || t02.f2709j == null) {
                A0(108);
            }
        }
    }

    private void l0() {
        if (this.f2661l == null) {
            Object obj = this.f2659j;
            if (obj instanceof Activity) {
                V(((Activity) obj).getWindow());
            }
        }
        if (this.f2661l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration n0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f4 = configuration.fontScale;
            float f5 = configuration2.fontScale;
            if (f4 != f5) {
                configuration3.fontScale = f5;
            }
            int i4 = configuration.mcc;
            int i5 = configuration2.mcc;
            if (i4 != i5) {
                configuration3.mcc = i5;
            }
            int i6 = configuration.mnc;
            int i7 = configuration2.mnc;
            if (i6 != i7) {
                configuration3.mnc = i7;
            }
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 24) {
                l.a(configuration, configuration2, configuration3);
            } else if (!androidx.core.util.c.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i9 = configuration.touchscreen;
            int i10 = configuration2.touchscreen;
            if (i9 != i10) {
                configuration3.touchscreen = i10;
            }
            int i11 = configuration.keyboard;
            int i12 = configuration2.keyboard;
            if (i11 != i12) {
                configuration3.keyboard = i12;
            }
            int i13 = configuration.keyboardHidden;
            int i14 = configuration2.keyboardHidden;
            if (i13 != i14) {
                configuration3.keyboardHidden = i14;
            }
            int i15 = configuration.navigation;
            int i16 = configuration2.navigation;
            if (i15 != i16) {
                configuration3.navigation = i16;
            }
            int i17 = configuration.navigationHidden;
            int i18 = configuration2.navigationHidden;
            if (i17 != i18) {
                configuration3.navigationHidden = i18;
            }
            int i19 = configuration.orientation;
            int i20 = configuration2.orientation;
            if (i19 != i20) {
                configuration3.orientation = i20;
            }
            int i21 = configuration.screenLayout & 15;
            int i22 = configuration2.screenLayout;
            if (i21 != (i22 & 15)) {
                configuration3.screenLayout |= i22 & 15;
            }
            int i23 = configuration.screenLayout & 192;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 192)) {
                configuration3.screenLayout |= i24 & 192;
            }
            int i25 = configuration.screenLayout & 48;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 48)) {
                configuration3.screenLayout |= i26 & 48;
            }
            int i27 = configuration.screenLayout & 768;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 768)) {
                configuration3.screenLayout |= i28 & 768;
            }
            if (i8 >= 26) {
                m.a(configuration, configuration2, configuration3);
            }
            int i29 = configuration.uiMode & 15;
            int i30 = configuration2.uiMode;
            if (i29 != (i30 & 15)) {
                configuration3.uiMode |= i30 & 15;
            }
            int i31 = configuration.uiMode & 48;
            int i32 = configuration2.uiMode;
            if (i31 != (i32 & 48)) {
                configuration3.uiMode |= i32 & 48;
            }
            int i33 = configuration.screenWidthDp;
            int i34 = configuration2.screenWidthDp;
            if (i33 != i34) {
                configuration3.screenWidthDp = i34;
            }
            int i35 = configuration.screenHeightDp;
            int i36 = configuration2.screenHeightDp;
            if (i35 != i36) {
                configuration3.screenHeightDp = i36;
            }
            int i37 = configuration.smallestScreenWidthDp;
            int i38 = configuration2.smallestScreenWidthDp;
            if (i37 != i38) {
                configuration3.smallestScreenWidthDp = i38;
            }
            j.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    private int p0(Context context) {
        int i4;
        if (!this.f2646W && (this.f2659j instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 29) {
                    i4 = 269221888;
                } else if (i5 >= 24) {
                    i4 = 786432;
                } else {
                    i4 = 0;
                }
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f2659j.getClass()), i4);
                if (activityInfo != null) {
                    this.f2645V = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                this.f2645V = 0;
            }
        }
        this.f2646W = true;
        return this.f2645V;
    }

    private q q0(Context context) {
        if (this.f2648Y == null) {
            this.f2648Y = new p(context);
        }
        return this.f2648Y;
    }

    private q r0(Context context) {
        if (this.f2647X == null) {
            this.f2647X = new r(I.a(context));
        }
        return this.f2647X;
    }

    private void w0() {
        k0();
        if (this.f2630G && this.f2664o == null) {
            Object obj = this.f2659j;
            if (obj instanceof Activity) {
                this.f2664o = new J((Activity) this.f2659j, this.f2631H);
            } else if (obj instanceof Dialog) {
                this.f2664o = new J((Dialog) this.f2659j);
            }
            C0367a aVar = this.f2664o;
            if (aVar != null) {
                aVar.r(this.f2652c0);
            }
        }
    }

    private boolean x0(u uVar) {
        View view = uVar.f2708i;
        if (view != null) {
            uVar.f2707h = view;
            return true;
        } else if (uVar.f2709j == null) {
            return false;
        } else {
            if (this.f2669t == null) {
                this.f2669t = new v();
            }
            View view2 = (View) uVar.a(this.f2669t);
            uVar.f2707h = view2;
            if (view2 != null) {
                return true;
            }
            return false;
        }
    }

    private boolean y0(u uVar) {
        uVar.d(o0());
        uVar.f2706g = new t(uVar.f2711l);
        uVar.f2702c = 81;
        return true;
    }

    private boolean z0(u uVar) {
        Resources.Theme theme;
        Context context = this.f2660k;
        int i4 = uVar.f2700a;
        if ((i4 == 0 || i4 == 108) && this.f2667r != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(C0822a.f14671d, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(C0822a.f14672e, typedValue, true);
            } else {
                theme2.resolveAttribute(C0822a.f14672e, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(theme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.R(this);
        uVar.c(gVar);
        return true;
    }

    public void A(Bundle bundle) {
        k0();
    }

    public void B() {
        C0367a s4 = s();
        if (s4 != null) {
            s4.s(true);
        }
    }

    public boolean B0() {
        return this.f2675z;
    }

    public void C(Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public int C0(Context context, int i4) {
        if (i4 == -100) {
            return -1;
        }
        if (i4 != -1) {
            if (i4 != 0) {
                if (!(i4 == 1 || i4 == 2)) {
                    if (i4 == 3) {
                        return q0(context).c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return r0(context).c();
            }
        }
        return i4;
    }

    public void D() {
        S(true, false);
    }

    /* access modifiers changed from: package-private */
    public boolean D0() {
        boolean z3 = this.f2638O;
        this.f2638O = false;
        u t02 = t0(0, false);
        if (t02 == null || !t02.f2714o) {
            androidx.appcompat.view.b bVar = this.f2670u;
            if (bVar != null) {
                bVar.c();
                return true;
            }
            C0367a s4 = s();
            if (s4 == null || !s4.h()) {
                return false;
            }
            return true;
        }
        if (!z3) {
            c0(t02, true);
        }
        return true;
    }

    public void E() {
        C0367a s4 = s();
        if (s4 != null) {
            s4.s(false);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean E0(int i4, KeyEvent keyEvent) {
        boolean z3 = true;
        if (i4 == 4) {
            if ((keyEvent.getFlags() & Uuid.SIZE_BITS) == 0) {
                z3 = false;
            }
            this.f2638O = z3;
        } else if (i4 == 82) {
            F0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean G0(int i4, KeyEvent keyEvent) {
        C0367a s4 = s();
        if (s4 != null && s4.o(i4, keyEvent)) {
            return true;
        }
        u uVar = this.f2637N;
        if (uVar == null || !O0(uVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f2637N == null) {
                u t02 = t0(0, true);
                P0(t02, keyEvent);
                boolean O02 = O0(t02, keyEvent.getKeyCode(), keyEvent, 1);
                t02.f2712m = false;
                if (O02) {
                    return true;
                }
            }
            return false;
        }
        u uVar2 = this.f2637N;
        if (uVar2 != null) {
            uVar2.f2713n = true;
        }
        return true;
    }

    public boolean H(int i4) {
        int R02 = R0(i4);
        if (this.f2634K && R02 == 108) {
            return false;
        }
        if (this.f2630G && R02 == 1) {
            this.f2630G = false;
        }
        if (R02 == 1) {
            Y0();
            this.f2634K = true;
            return true;
        } else if (R02 == 2) {
            Y0();
            this.f2628E = true;
            return true;
        } else if (R02 == 5) {
            Y0();
            this.f2629F = true;
            return true;
        } else if (R02 == 10) {
            Y0();
            this.f2632I = true;
            return true;
        } else if (R02 == 108) {
            Y0();
            this.f2630G = true;
            return true;
        } else if (R02 != 109) {
            return this.f2661l.requestFeature(R02);
        } else {
            Y0();
            this.f2631H = true;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean H0(int i4, KeyEvent keyEvent) {
        if (i4 != 4) {
            if (i4 == 82) {
                I0(0, keyEvent);
                return true;
            }
        } else if (D0()) {
            return true;
        }
        return false;
    }

    public void I(int i4) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.f2625B.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2660k).inflate(i4, viewGroup);
        this.f2662m.c(this.f2661l.getCallback());
    }

    public void J(View view) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.f2625B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2662m.c(this.f2661l.getCallback());
    }

    /* access modifiers changed from: package-private */
    public void J0(int i4) {
        C0367a s4;
        if (i4 == 108 && (s4 = s()) != null) {
            s4.i(true);
        }
    }

    public void K(View view, ViewGroup.LayoutParams layoutParams) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.f2625B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2662m.c(this.f2661l.getCallback());
    }

    /* access modifiers changed from: package-private */
    public void K0(int i4) {
        if (i4 == 108) {
            C0367a s4 = s();
            if (s4 != null) {
                s4.i(false);
            }
        } else if (i4 == 0) {
            u t02 = t0(i4, true);
            if (t02.f2714o) {
                c0(t02, false);
            }
        }
    }

    public void L(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.L(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f2657h0;
        if (!(onBackInvokedDispatcher2 == null || (onBackInvokedCallback = this.f2658i0) == null)) {
            n.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f2658i0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f2659j;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                this.f2657h0 = n.a((Activity) this.f2659j);
                c1();
            }
        }
        this.f2657h0 = onBackInvokedDispatcher;
        c1();
    }

    /* access modifiers changed from: package-private */
    public void L0(ViewGroup viewGroup) {
    }

    public void M(Toolbar toolbar) {
        if (this.f2659j instanceof Activity) {
            C0367a s4 = s();
            if (!(s4 instanceof J)) {
                this.f2665p = null;
                if (s4 != null) {
                    s4.n();
                }
                this.f2664o = null;
                if (toolbar != null) {
                    G g4 = new G(toolbar, u0(), this.f2662m);
                    this.f2664o = g4;
                    this.f2662m.e(g4.f2541c);
                    toolbar.setBackInvokedCallbackEnabled(true);
                } else {
                    this.f2662m.e((g) null);
                }
                u();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    public void N(int i4) {
        this.f2644U = i4;
    }

    /* access modifiers changed from: package-private */
    public final C0367a N0() {
        return this.f2664o;
    }

    public final void O(CharSequence charSequence) {
        this.f2666q = charSequence;
        I i4 = this.f2667r;
        if (i4 != null) {
            i4.setWindowTitle(charSequence);
        } else if (N0() != null) {
            N0().t(charSequence);
        } else {
            TextView textView = this.f2626C;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    public androidx.appcompat.view.b P(b.a aVar) {
        C0371e eVar;
        if (aVar != null) {
            androidx.appcompat.view.b bVar = this.f2670u;
            if (bVar != null) {
                bVar.c();
            }
            i iVar = new i(aVar);
            C0367a s4 = s();
            if (s4 != null) {
                androidx.appcompat.view.b u3 = s4.u(iVar);
                this.f2670u = u3;
                if (!(u3 == null || (eVar = this.f2663n) == null)) {
                    eVar.onSupportActionModeStarted(u3);
                }
            }
            if (this.f2670u == null) {
                this.f2670u = X0(iVar);
            }
            c1();
            return this.f2670u;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: package-private */
    public void S0(Configuration configuration, androidx.core.os.g gVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            l.d(configuration, gVar);
            return;
        }
        j.d(configuration, gVar.d(0));
        j.c(configuration, gVar.d(0));
    }

    public boolean T() {
        return R(true);
    }

    /* access modifiers changed from: package-private */
    public void T0(androidx.core.os.g gVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            l.c(gVar);
        } else {
            Locale.setDefault(gVar.d(0));
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean U0() {
        ViewGroup viewGroup;
        if (!this.f2624A || (viewGroup = this.f2625B) == null || !P.S(viewGroup)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public androidx.core.os.g W(Context context) {
        androidx.core.os.g r4;
        androidx.core.os.g gVar;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33 || (r4 = C0373g.r()) == null) {
            return null;
        }
        androidx.core.os.g s02 = s0(context.getApplicationContext().getResources().getConfiguration());
        if (i4 >= 24) {
            gVar = D.b(r4, s02);
        } else if (r4.f()) {
            gVar = androidx.core.os.g.e();
        } else {
            gVar = androidx.core.os.g.c(r4.d(0).toString());
        }
        if (gVar.f()) {
            return s02;
        }
        return gVar;
    }

    /* access modifiers changed from: package-private */
    public boolean W0() {
        if (this.f2657h0 == null) {
            return false;
        }
        u t02 = t0(0, false);
        if ((t02 == null || !t02.f2714o) && this.f2670u == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.appcompat.view.b X0(androidx.appcompat.view.b.a r8) {
        /*
            r7 = this;
            r7.j0()
            androidx.appcompat.view.b r0 = r7.f2670u
            if (r0 == 0) goto L_0x000a
            r0.c()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.C0374h.i
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.h$i r0 = new androidx.appcompat.app.h$i
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.e r0 = r7.f2663n
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.f2641R
            if (r2 != 0) goto L_0x0022
            androidx.appcompat.view.b r0 = r0.onWindowStartingSupportActionMode(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f2670u = r0
            goto L_0x015b
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f2671v
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.f2633J
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f2660k
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = n.C0822a.f14671d
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f2660k
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            androidx.appcompat.view.d r4 = new androidx.appcompat.view.d
            android.content.Context r6 = r7.f2660k
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f2660k
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f2671v = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = n.C0822a.f14673f
            r5.<init>(r4, r1, r6)
            r7.f2672w = r5
            r6 = 2
            androidx.core.widget.i.b(r5, r6)
            android.widget.PopupWindow r5 = r7.f2672w
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f2671v
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f2672w
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = n.C0822a.f14669b
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f2671v
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f2672w
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.h$d r0 = new androidx.appcompat.app.h$d
            r0.<init>()
            r7.f2673x = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.f2625B
            int r4 = n.f.f14784h
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.o0()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f2671v = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f2671v
            if (r0 == 0) goto L_0x015b
            r7.j0()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f2671v
            r0.k()
            androidx.appcompat.view.e r0 = new androidx.appcompat.view.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f2671v
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f2671v
            android.widget.PopupWindow r6 = r7.f2672w
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = r2
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.e()
            boolean r8 = r8.d(r0, r3)
            if (r8 == 0) goto L_0x0159
            r0.k()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f2671v
            r8.h(r0)
            r7.f2670u = r0
            boolean r8 = r7.U0()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012a
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f2671v
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f2671v
            androidx.core.view.W r8 = androidx.core.view.P.e(r8)
            androidx.core.view.W r8 = r8.b(r0)
            r7.f2674y = r8
            androidx.appcompat.app.h$e r0 = new androidx.appcompat.app.h$e
            r0.<init>()
            r8.h(r0)
            goto L_0x0149
        L_0x012a:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f2671v
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f2671v
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f2671v
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0149
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f2671v
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            androidx.core.view.P.l0(r8)
        L_0x0149:
            android.widget.PopupWindow r8 = r7.f2672w
            if (r8 == 0) goto L_0x015b
            android.view.Window r8 = r7.f2661l
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f2673x
            r8.post(r0)
            goto L_0x015b
        L_0x0159:
            r7.f2670u = r1
        L_0x015b:
            androidx.appcompat.view.b r8 = r7.f2670u
            if (r8 == 0) goto L_0x0166
            androidx.appcompat.app.e r0 = r7.f2663n
            if (r0 == 0) goto L_0x0166
            r0.onSupportActionModeStarted(r8)
        L_0x0166:
            r7.c1()
            androidx.appcompat.view.b r8 = r7.f2670u
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0374h.X0(androidx.appcompat.view.b$a):androidx.appcompat.view.b");
    }

    /* access modifiers changed from: package-private */
    public void Y(int i4, u uVar, Menu menu) {
        if (menu == null) {
            if (uVar == null && i4 >= 0) {
                u[] uVarArr = this.f2636M;
                if (i4 < uVarArr.length) {
                    uVar = uVarArr[i4];
                }
            }
            if (uVar != null) {
                menu = uVar.f2709j;
            }
        }
        if ((uVar == null || uVar.f2714o) && !this.f2641R) {
            this.f2662m.d(this.f2661l.getCallback(), i4, menu);
        }
    }

    /* access modifiers changed from: package-private */
    public void Z(androidx.appcompat.view.menu.g gVar) {
        if (!this.f2635L) {
            this.f2635L = true;
            this.f2667r.l();
            Window.Callback v02 = v0();
            if (v02 != null && !this.f2641R) {
                v02.onPanelClosed(108, gVar);
            }
            this.f2635L = false;
        }
    }

    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        u m02;
        Window.Callback v02 = v0();
        if (v02 == null || this.f2641R || (m02 = m0(gVar.D())) == null) {
            return false;
        }
        return v02.onMenuItemSelected(m02.f2700a, menuItem);
    }

    public void b(androidx.appcompat.view.menu.g gVar) {
        Q0(true);
    }

    /* access modifiers changed from: package-private */
    public void b0(int i4) {
        c0(t0(i4, true), true);
    }

    /* access modifiers changed from: package-private */
    public void c0(u uVar, boolean z3) {
        ViewGroup viewGroup;
        I i4;
        if (!z3 || uVar.f2700a != 0 || (i4 = this.f2667r) == null || !i4.b()) {
            WindowManager windowManager = (WindowManager) this.f2660k.getSystemService("window");
            if (!(windowManager == null || !uVar.f2714o || (viewGroup = uVar.f2706g) == null)) {
                windowManager.removeView(viewGroup);
                if (z3) {
                    Y(uVar.f2700a, uVar, (Menu) null);
                }
            }
            uVar.f2712m = false;
            uVar.f2713n = false;
            uVar.f2714o = false;
            uVar.f2707h = null;
            uVar.f2716q = true;
            if (this.f2637N == uVar) {
                this.f2637N = null;
            }
            if (uVar.f2700a == 0) {
                c1();
                return;
            }
            return;
        }
        Z(uVar.f2709j);
    }

    /* access modifiers changed from: package-private */
    public void c1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean W02 = W0();
            if (W02 && this.f2658i0 == null) {
                this.f2658i0 = n.b(this.f2657h0, this);
            } else if (!W02 && (onBackInvokedCallback = this.f2658i0) != null) {
                n.c(this.f2657h0, onBackInvokedCallback);
            }
        }
    }

    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        k0();
        ((ViewGroup) this.f2625B.findViewById(16908290)).addView(view, layoutParams);
        this.f2662m.c(this.f2661l.getCallback());
    }

    /* access modifiers changed from: package-private */
    public final int e1(C0435o0 o0Var, Rect rect) {
        int i4;
        boolean z3;
        int i5;
        int i6;
        boolean z4;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i7;
        int i8 = 0;
        if (o0Var != null) {
            i4 = o0Var.k();
        } else if (rect != null) {
            i4 = rect.top;
        } else {
            i4 = 0;
        }
        ActionBarContextView actionBarContextView = this.f2671v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z3 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f2671v.getLayoutParams();
            boolean z5 = true;
            if (this.f2671v.isShown()) {
                if (this.f2653d0 == null) {
                    this.f2653d0 = new Rect();
                    this.f2654e0 = new Rect();
                }
                Rect rect2 = this.f2653d0;
                Rect rect3 = this.f2654e0;
                if (o0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(o0Var.i(), o0Var.k(), o0Var.j(), o0Var.h());
                }
                n0.a(this.f2625B, rect2, rect3);
                int i9 = rect2.top;
                int i10 = rect2.left;
                int i11 = rect2.right;
                C0435o0 H3 = P.H(this.f2625B);
                if (H3 == null) {
                    i5 = 0;
                } else {
                    i5 = H3.i();
                }
                if (H3 == null) {
                    i6 = 0;
                } else {
                    i6 = H3.j();
                }
                if (marginLayoutParams2.topMargin == i9 && marginLayoutParams2.leftMargin == i10 && marginLayoutParams2.rightMargin == i11) {
                    z4 = false;
                } else {
                    marginLayoutParams2.topMargin = i9;
                    marginLayoutParams2.leftMargin = i10;
                    marginLayoutParams2.rightMargin = i11;
                    z4 = true;
                }
                if (i9 <= 0 || this.f2627D != null) {
                    View view = this.f2627D;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i7 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i5 && marginLayoutParams.rightMargin == i6))) {
                        marginLayoutParams.height = i7;
                        marginLayoutParams.leftMargin = i5;
                        marginLayoutParams.rightMargin = i6;
                        this.f2627D.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f2660k);
                    this.f2627D = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i5;
                    layoutParams.rightMargin = i6;
                    this.f2625B.addView(this.f2627D, -1, layoutParams);
                }
                View view3 = this.f2627D;
                if (view3 == null) {
                    z5 = false;
                }
                if (z5 && view3.getVisibility() != 0) {
                    f1(this.f2627D);
                }
                if (!this.f2632I && z5) {
                    i4 = 0;
                }
                z3 = z5;
                z5 = z4;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z3 = false;
            } else {
                z3 = false;
                z5 = false;
            }
            if (z5) {
                this.f2671v.setLayoutParams(marginLayoutParams2);
            }
        }
        View view4 = this.f2627D;
        if (view4 != null) {
            if (!z3) {
                i8 = 8;
            }
            view4.setVisibility(i8);
        }
        return i4;
    }

    public View f0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z3;
        if (this.f2655f0 == null) {
            String string = this.f2660k.obtainStyledAttributes(n.j.f15060y0).getString(n.j.f14848C0);
            if (string == null) {
                this.f2655f0 = new y();
            } else {
                try {
                    this.f2655f0 = (y) this.f2660k.getClassLoader().loadClass(string).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                } catch (Throwable unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate custom view inflater ");
                    sb.append(string);
                    sb.append(". Falling back to default.");
                    this.f2655f0 = new y();
                }
            }
        }
        boolean z4 = f2620k0;
        boolean z5 = false;
        if (z4) {
            if (this.f2656g0 == null) {
                this.f2656g0 = new C();
            }
            if (this.f2656g0.a(attributeSet)) {
                z3 = true;
                return this.f2655f0.r(view, str, context, attributeSet, z3, z4, true, m0.c());
            } else if (!(attributeSet instanceof XmlPullParser)) {
                z5 = V0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z5 = true;
            }
        }
        z3 = z5;
        return this.f2655f0.r(view, str, context, attributeSet, z3, z4, true, m0.c());
    }

    public Context g(Context context) {
        Configuration configuration;
        this.f2639P = true;
        int C02 = C0(context, X());
        if (C0373g.v(context)) {
            C0373g.Q(context);
        }
        androidx.core.os.g W3 = W(context);
        if (f2623n0 && (context instanceof ContextThemeWrapper)) {
            try {
                s.a((ContextThemeWrapper) context, d0(context, C02, W3, (Configuration) null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context).a(d0(context, C02, W3, (Configuration) null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f2622m0) {
            return super.g(context);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = j.a(context, configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = n0(configuration3, configuration4);
        } else {
            configuration = null;
        }
        Configuration d02 = d0(context, C02, W3, configuration, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, n.i.f14837c);
        dVar.a(d02);
        try {
            if (context.getTheme() != null) {
                h.f.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.g(dVar);
    }

    /* access modifiers changed from: package-private */
    public void g0() {
        androidx.appcompat.view.menu.g gVar;
        I i4 = this.f2667r;
        if (i4 != null) {
            i4.l();
        }
        if (this.f2672w != null) {
            this.f2661l.getDecorView().removeCallbacks(this.f2673x);
            if (this.f2672w.isShowing()) {
                try {
                    this.f2672w.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f2672w = null;
        }
        j0();
        u t02 = t0(0, false);
        if (t02 != null && (gVar = t02.f2709j) != null) {
            gVar.close();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean h0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f2659j;
        if (((obj instanceof C0436p.a) || (obj instanceof x)) && (decorView = this.f2661l.getDecorView()) != null && C0436p.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f2662m.b(this.f2661l.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            return E0(keyCode, keyEvent);
        }
        return H0(keyCode, keyEvent);
    }

    /* access modifiers changed from: package-private */
    public void i0(int i4) {
        u t02;
        u t03 = t0(i4, true);
        if (t03.f2709j != null) {
            Bundle bundle = new Bundle();
            t03.f2709j.Q(bundle);
            if (bundle.size() > 0) {
                t03.f2718s = bundle;
            }
            t03.f2709j.d0();
            t03.f2709j.clear();
        }
        t03.f2717r = true;
        t03.f2716q = true;
        if ((i4 == 108 || i4 == 0) && this.f2667r != null && (t02 = t0(0, false)) != null) {
            t02.f2712m = false;
            P0(t02, (KeyEvent) null);
        }
    }

    public View j(int i4) {
        k0();
        return this.f2661l.findViewById(i4);
    }

    /* access modifiers changed from: package-private */
    public void j0() {
        W w3 = this.f2674y;
        if (w3 != null) {
            w3.c();
        }
    }

    public Context l() {
        return this.f2660k;
    }

    /* access modifiers changed from: package-private */
    public u m0(Menu menu) {
        int i4;
        u[] uVarArr = this.f2636M;
        if (uVarArr != null) {
            i4 = uVarArr.length;
        } else {
            i4 = 0;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            u uVar = uVarArr[i5];
            if (uVar != null && uVar.f2709j == menu) {
                return uVar;
            }
        }
        return null;
    }

    public final C0368b n() {
        return new f();
    }

    public int o() {
        return this.f2643T;
    }

    /* access modifiers changed from: package-private */
    public final Context o0() {
        Context context;
        C0367a s4 = s();
        if (s4 != null) {
            context = s4.k();
        } else {
            context = null;
        }
        if (context == null) {
            return this.f2660k;
        }
        return context;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return f0(view, str, context, attributeSet);
    }

    public MenuInflater q() {
        Context context;
        if (this.f2665p == null) {
            w0();
            C0367a aVar = this.f2664o;
            if (aVar != null) {
                context = aVar.k();
            } else {
                context = this.f2660k;
            }
            this.f2665p = new androidx.appcompat.view.g(context);
        }
        return this.f2665p;
    }

    public C0367a s() {
        w0();
        return this.f2664o;
    }

    /* access modifiers changed from: package-private */
    public androidx.core.os.g s0(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return l.b(configuration);
        }
        return androidx.core.os.g.c(k.b(configuration.locale));
    }

    public void t() {
        LayoutInflater from = LayoutInflater.from(this.f2660k);
        if (from.getFactory() == null) {
            C0437q.a(from, this);
        } else {
            boolean z3 = from.getFactory2() instanceof C0374h;
        }
    }

    /* access modifiers changed from: protected */
    public u t0(int i4, boolean z3) {
        u[] uVarArr = this.f2636M;
        if (uVarArr == null || uVarArr.length <= i4) {
            u[] uVarArr2 = new u[(i4 + 1)];
            if (uVarArr != null) {
                System.arraycopy(uVarArr, 0, uVarArr2, 0, uVarArr.length);
            }
            this.f2636M = uVarArr2;
            uVarArr = uVarArr2;
        }
        u uVar = uVarArr[i4];
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(i4);
        uVarArr[i4] = uVar2;
        return uVar2;
    }

    public void u() {
        if (N0() != null && !s().l()) {
            A0(0);
        }
    }

    /* access modifiers changed from: package-private */
    public final CharSequence u0() {
        Object obj = this.f2659j;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f2666q;
    }

    /* access modifiers changed from: package-private */
    public final Window.Callback v0() {
        return this.f2661l.getCallback();
    }

    public void x(Configuration configuration) {
        C0367a s4;
        if (this.f2630G && this.f2624A && (s4 = s()) != null) {
            s4.m(configuration);
        }
        C0387k.b().g(this.f2660k);
        this.f2642S = new Configuration(this.f2660k.getResources().getConfiguration());
        S(false, false);
    }

    public void y(Bundle bundle) {
        String str;
        this.f2639P = true;
        R(false);
        l0();
        Object obj = this.f2659j;
        if (obj instanceof Activity) {
            try {
                str = androidx.core.app.h.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                C0367a N02 = N0();
                if (N02 == null) {
                    this.f2652c0 = true;
                } else {
                    N02.r(true);
                }
            }
            C0373g.d(this);
        }
        this.f2642S = new Configuration(this.f2660k.getResources().getConfiguration());
        this.f2640Q = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void z() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f2659j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            androidx.appcompat.app.C0373g.F(r3)
        L_0x0009:
            boolean r0 = r3.f2649Z
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f2661l
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f2651b0
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 1
            r3.f2641R = r0
            int r0 = r3.f2643T
            r1 = -100
            if (r0 == r1) goto L_0x0045
            java.lang.Object r0 = r3.f2659j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0045
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0045
            y.g r0 = f2619j0
            java.lang.Object r1 = r3.f2659j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f2643T
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0054
        L_0x0045:
            y.g r0 = f2619j0
            java.lang.Object r1 = r3.f2659j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0054:
            androidx.appcompat.app.a r0 = r3.f2664o
            if (r0 == 0) goto L_0x005b
            r0.n()
        L_0x005b:
            r3.a0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0374h.z():void");
    }

    C0374h(Dialog dialog, C0371e eVar) {
        this(dialog.getContext(), dialog.getWindow(), eVar, dialog);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    private C0374h(Context context, Window window, C0371e eVar, Object obj) {
        C0370d Z02;
        this.f2674y = null;
        this.f2675z = true;
        this.f2643T = -100;
        this.f2651b0 = new a();
        this.f2660k = context;
        this.f2663n = eVar;
        this.f2659j = obj;
        if (this.f2643T == -100 && (obj instanceof Dialog) && (Z02 = Z0()) != null) {
            this.f2643T = Z02.getDelegate().o();
        }
        if (this.f2643T == -100) {
            y.g gVar = f2619j0;
            Integer num = (Integer) gVar.get(obj.getClass().getName());
            if (num != null) {
                this.f2643T = num.intValue();
                gVar.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            V(window);
        }
        C0387k.h();
    }
}
