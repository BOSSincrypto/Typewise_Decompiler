package androidx.core.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.appcompat.app.F;
import androidx.core.view.C0402a;
import androidx.core.view.C0409b0;
import androidx.core.view.C0435o0;
import androidx.core.view.accessibility.A;
import androidx.core.view.accessibility.D;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class P {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f5179a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    private static WeakHashMap f5180b = null;

    /* renamed from: c  reason: collision with root package name */
    private static Field f5181c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f5182d = false;

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f5183e = {G.c.f454b, G.c.f455c, G.c.f466n, G.c.f477y, G.c.f435B, G.c.f436C, G.c.f437D, G.c.f438E, G.c.f439F, G.c.f440G, G.c.f456d, G.c.f457e, G.c.f458f, G.c.f459g, G.c.f460h, G.c.f461i, G.c.f462j, G.c.f463k, G.c.f464l, G.c.f465m, G.c.f467o, G.c.f468p, G.c.f469q, G.c.f470r, G.c.f471s, G.c.f472t, G.c.f473u, G.c.f474v, G.c.f475w, G.c.f476x, G.c.f478z, G.c.f434A};

    /* renamed from: f  reason: collision with root package name */
    private static final E f5184f = new O();

    /* renamed from: g  reason: collision with root package name */
    private static final e f5185g = new e();

    class a extends f {
        a(int i4, Class cls, int i5) {
            super(i4, cls, i5);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(p.d(view));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            p.j(view, bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    class b extends f {
        b(int i4, Class cls, int i5, int i6) {
            super(i4, cls, i5, i6);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence d(View view) {
            return p.b(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            p.h(view, charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class c extends f {
        c(int i4, Class cls, int i5, int i6) {
            super(i4, cls, i5, i6);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence d(View view) {
            return r.b(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            r.f(view, charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class d extends f {
        d(int i4, Class cls, int i5) {
            super(i4, cls, i5);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(p.c(view));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            p.g(view, bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final WeakHashMap f5186a = new WeakHashMap();

        e() {
        }

        private void b(View view, boolean z3) {
            boolean z4;
            int i4;
            if (!view.isShown() || view.getWindowVisibility() != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z3 != z4) {
                if (z4) {
                    i4 = 16;
                } else {
                    i4 = 32;
                }
                P.X(view, i4);
                this.f5186a.put(view, Boolean.valueOf(z4));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            h.o(view.getViewTreeObserver(), this);
        }

        /* access modifiers changed from: package-private */
        public void a(View view) {
            boolean z3;
            WeakHashMap weakHashMap = this.f5186a;
            if (!view.isShown() || view.getWindowVisibility() != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            weakHashMap.put(view, Boolean.valueOf(z3));
            view.addOnAttachStateChangeListener(this);
            if (k.b(view)) {
                c(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void d(View view) {
            this.f5186a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry entry : this.f5186a.entrySet()) {
                    b((View) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        private final int f5187a;

        /* renamed from: b  reason: collision with root package name */
        private final Class f5188b;

        /* renamed from: c  reason: collision with root package name */
        private final int f5189c;

        /* renamed from: d  reason: collision with root package name */
        private final int f5190d;

        f(int i4, Class cls, int i5) {
            this(i4, cls, 0, i5);
        }

        private boolean b() {
            return true;
        }

        private boolean c() {
            if (Build.VERSION.SDK_INT >= this.f5189c) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean a(Boolean bool, Boolean bool2) {
            boolean z3;
            boolean z4;
            if (bool == null || !bool.booleanValue()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (bool2 == null || !bool2.booleanValue()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z3 == z4) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public abstract Object d(View view);

        /* access modifiers changed from: package-private */
        public abstract void e(View view, Object obj);

        /* access modifiers changed from: package-private */
        public Object f(View view) {
            if (c()) {
                return d(view);
            }
            if (!b()) {
                return null;
            }
            Object tag = view.getTag(this.f5187a);
            if (this.f5188b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void g(View view, Object obj) {
            if (c()) {
                e(view, obj);
            } else if (b() && h(f(view), obj)) {
                P.j(view);
                view.setTag(this.f5187a, obj);
                P.X(view, this.f5190d);
            }
        }

        /* access modifiers changed from: package-private */
        public abstract boolean h(Object obj, Object obj2);

        f(int i4, Class cls, int i5, int i6) {
            this.f5187a = i4;
            this.f5188b = cls;
            this.f5190d = i5;
            this.f5189c = i6;
        }
    }

    static class g {
        static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    static class h {
        static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        static int c(View view) {
            return view.getImportantForAccessibility();
        }

        static int d(View view) {
            return view.getMinimumHeight();
        }

        static int e(View view) {
            return view.getMinimumWidth();
        }

        static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        static boolean i(View view) {
            return view.hasTransientState();
        }

        static boolean j(View view, int i4, Bundle bundle) {
            return view.performAccessibilityAction(i4, bundle);
        }

        static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        static void l(View view, int i4, int i5, int i6, int i7) {
            view.postInvalidateOnAnimation(i4, i5, i6, i7);
        }

        static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        static void n(View view, Runnable runnable, long j4) {
            view.postOnAnimationDelayed(runnable, j4);
        }

        static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        static void p(View view) {
            view.requestFitSystemWindows();
        }

        static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        static void r(View view, boolean z3) {
            view.setHasTransientState(z3);
        }

        static void s(View view, int i4) {
            view.setImportantForAccessibility(i4);
        }
    }

    static class i {
        static int a() {
            return View.generateViewId();
        }

        static Display b(View view) {
            return view.getDisplay();
        }

        static int c(View view) {
            return view.getLabelFor();
        }

        static int d(View view) {
            return view.getLayoutDirection();
        }

        static int e(View view) {
            return view.getPaddingEnd();
        }

        static int f(View view) {
            return view.getPaddingStart();
        }

        static boolean g(View view) {
            return view.isPaddingRelative();
        }

        static void h(View view, int i4) {
            view.setLabelFor(i4);
        }

        static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        static void j(View view, int i4) {
            view.setLayoutDirection(i4);
        }

        static void k(View view, int i4, int i5, int i6, int i7) {
            view.setPaddingRelative(i4, i5, i6, i7);
        }
    }

    static class j {
        static Rect a(View view) {
            return view.getClipBounds();
        }

        static boolean b(View view) {
            return view.isInLayout();
        }

        static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static class k {
        static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        static boolean c(View view) {
            return view.isLaidOut();
        }

        static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        static void e(ViewParent viewParent, View view, View view2, int i4) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i4);
        }

        static void f(View view, int i4) {
            view.setAccessibilityLiveRegion(i4);
        }

        static void g(AccessibilityEvent accessibilityEvent, int i4) {
            accessibilityEvent.setContentChangeTypes(i4);
        }
    }

    static class l {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    private static class m {

        class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            C0435o0 f5191a = null;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f5192b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C f5193c;

            a(View view, C c4) {
                this.f5192b = view;
                this.f5193c = c4;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C0435o0 w3 = C0435o0.w(windowInsets, view);
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 30) {
                    m.a(windowInsets, this.f5192b);
                    if (w3.equals(this.f5191a)) {
                        return this.f5193c.a(view, w3).u();
                    }
                }
                this.f5191a = w3;
                C0435o0 a4 = this.f5193c.a(view, w3);
                if (i4 >= 30) {
                    return a4.u();
                }
                P.l0(view);
                return a4.u();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(G.c.f452S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static C0435o0 b(View view, C0435o0 o0Var, Rect rect) {
            WindowInsets u3 = o0Var.u();
            if (u3 != null) {
                return C0435o0.w(view.computeSystemWindowInsets(u3, rect), view);
            }
            rect.setEmpty();
            return o0Var;
        }

        static boolean c(View view, float f4, float f5, boolean z3) {
            return view.dispatchNestedFling(f4, f5, z3);
        }

        static boolean d(View view, float f4, float f5) {
            return view.dispatchNestedPreFling(f4, f5);
        }

        static boolean e(View view, int i4, int i5, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i4, i5, iArr, iArr2);
        }

        static boolean f(View view, int i4, int i5, int i6, int i7, int[] iArr) {
            return view.dispatchNestedScroll(i4, i5, i6, i7, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static C0435o0 j(View view) {
            return C0435o0.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f4) {
            view.setElevation(f4);
        }

        static void t(View view, boolean z3) {
            view.setNestedScrollingEnabled(z3);
        }

        static void u(View view, C c4) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(G.c.f445L, c4);
            }
            if (c4 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(G.c.f452S));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, c4));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f4) {
            view.setTranslationZ(f4);
        }

        static void x(View view, float f4) {
            view.setZ(f4);
        }

        static boolean y(View view, int i4) {
            return view.startNestedScroll(i4);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    private static class n {
        public static C0435o0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C0435o0 v3 = C0435o0.v(rootWindowInsets);
            v3.s(v3);
            v3.d(view.getRootView());
            return v3;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i4) {
            view.setScrollIndicators(i4);
        }

        static void d(View view, int i4, int i5) {
            view.setScrollIndicators(i4, i5);
        }
    }

    static class o {
        static void a(View view, Collection<View> collection, int i4) {
            view.addKeyboardNavigationClusters(collection, i4);
        }

        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        static int c(View view) {
            return view.getImportantForAutofill();
        }

        static int d(View view) {
            return view.getNextClusterForwardId();
        }

        static boolean e(View view) {
            return view.hasExplicitFocusable();
        }

        static boolean f(View view) {
            return view.isFocusedByDefault();
        }

        static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        static boolean h(View view) {
            return view.isKeyboardNavigationCluster();
        }

        static View i(View view, View view2, int i4) {
            return view.keyboardNavigationClusterSearch(view2, i4);
        }

        static boolean j(View view) {
            return view.restoreDefaultFocus();
        }

        static void k(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void l(View view, boolean z3) {
            view.setFocusedByDefault(z3);
        }

        static void m(View view, int i4) {
            view.setImportantForAutofill(i4);
        }

        static void n(View view, boolean z3) {
            view.setKeyboardNavigationCluster(z3);
        }

        static void o(View view, int i4) {
            view.setNextClusterForwardId(i4);
        }

        static void p(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    static class p {
        static void a(View view, u uVar) {
            int i4 = G.c.f451R;
            y.g gVar = (y.g) view.getTag(i4);
            if (gVar == null) {
                gVar = new y.g();
                view.setTag(i4, gVar);
            }
            Objects.requireNonNull(uVar);
            Q q4 = new Q(uVar);
            gVar.put(uVar, q4);
            view.addOnUnhandledKeyEventListener(q4);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(View view, u uVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            y.g gVar = (y.g) view.getTag(G.c.f451R);
            if (gVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.get(uVar)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        static <T> T f(View view, int i4) {
            return view.requireViewById(i4);
        }

        static void g(View view, boolean z3) {
            view.setAccessibilityHeading(z3);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, AutofillId autofillId) {
            view.setAutofillId(autofillId);
        }

        static void j(View view, boolean z3) {
            view.setScreenReaderFocusable(z3);
        }
    }

    private static class q {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i4, int i5) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i4, i5);
        }

        static void e(View view, ContentCaptureSession contentCaptureSession) {
            view.setContentCaptureSession(contentCaptureSession);
        }

        static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    private static class r {
        static int a(View view) {
            return view.getImportantForContentCapture();
        }

        static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static M0 c(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return M0.f(windowInsetsController);
            }
            return null;
        }

        static boolean d(View view) {
            return view.isImportantForContentCapture();
        }

        static void e(View view, int i4) {
            view.setImportantForContentCapture(i4);
        }

        static void f(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    private static final class s {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static C0412d b(View view, C0412d dVar) {
            ContentInfo f4 = dVar.f();
            ContentInfo performReceiveContent = view.performReceiveContent(f4);
            if (performReceiveContent == null) {
                return null;
            }
            if (performReceiveContent == f4) {
                return dVar;
            }
            return C0412d.g(performReceiveContent);
        }

        public static void c(View view, String[] strArr, D d4) {
            if (d4 == null) {
                view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
            } else {
                view.setOnReceiveContentListener(strArr, new t(d4));
            }
        }
    }

    private static final class t implements OnReceiveContentListener {

        /* renamed from: a  reason: collision with root package name */
        private final D f5194a;

        t(D d4) {
            this.f5194a = d4;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C0412d g4 = C0412d.g(contentInfo);
            C0412d a4 = this.f5194a.a(view, g4);
            if (a4 == null) {
                return null;
            }
            if (a4 == g4) {
                return contentInfo;
            }
            return a4.f();
        }
    }

    public interface u {
    }

    static class v {

        /* renamed from: d  reason: collision with root package name */
        private static final ArrayList f5195d = new ArrayList();

        /* renamed from: a  reason: collision with root package name */
        private WeakHashMap f5196a = null;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray f5197b = null;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference f5198c = null;

        v() {
        }

        static v a(View view) {
            int i4 = G.c.f450Q;
            v vVar = (v) view.getTag(i4);
            if (vVar != null) {
                return vVar;
            }
            v vVar2 = new v();
            view.setTag(i4, vVar2);
            return vVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f5196a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c4 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c4 != null) {
                            return c4;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray d() {
            if (this.f5197b == null) {
                this.f5197b = new SparseArray();
            }
            return this.f5197b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(G.c.f451R);
            if (arrayList == null || arrayList.size() - 1 < 0) {
                return false;
            }
            F.a(arrayList.get(size));
            throw null;
        }

        private void g() {
            WeakHashMap weakHashMap = this.f5196a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f5195d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    try {
                        if (this.f5196a == null) {
                            this.f5196a = new WeakHashMap();
                        }
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ArrayList arrayList2 = f5195d;
                            View view = (View) ((WeakReference) arrayList2.get(size)).get();
                            if (view == null) {
                                arrayList2.remove(size);
                            } else {
                                this.f5196a.put(view, Boolean.TRUE);
                                for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    this.f5196a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c4 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c4 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(c4));
                }
            }
            if (c4 != null) {
                return true;
            }
            return false;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.ref.WeakReference} */
        /* access modifiers changed from: package-private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean f(android.view.KeyEvent r6) {
            /*
                r5 = this;
                java.lang.ref.WeakReference r0 = r5.f5198c
                r1 = 0
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.get()
                if (r0 != r6) goto L_0x000c
                return r1
            L_0x000c:
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r6)
                r5.f5198c = r0
                android.util.SparseArray r0 = r5.d()
                int r2 = r6.getAction()
                r3 = 1
                if (r2 != r3) goto L_0x0032
                int r2 = r6.getKeyCode()
                int r2 = r0.indexOfKey(r2)
                if (r2 < 0) goto L_0x0032
                java.lang.Object r4 = r0.valueAt(r2)
                java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
                r0.removeAt(r2)
                goto L_0x0033
            L_0x0032:
                r4 = 0
            L_0x0033:
                if (r4 != 0) goto L_0x0040
                int r2 = r6.getKeyCode()
                java.lang.Object r0 = r0.get(r2)
                r4 = r0
                java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            L_0x0040:
                if (r4 == 0) goto L_0x0054
                java.lang.Object r0 = r4.get()
                android.view.View r0 = (android.view.View) r0
                if (r0 == 0) goto L_0x0053
                boolean r1 = androidx.core.view.P.R(r0)
                if (r1 == 0) goto L_0x0053
                r5.e(r0, r6)
            L_0x0053:
                return r3
            L_0x0054:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.P.v.f(android.view.KeyEvent):boolean");
        }
    }

    public static int A(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return o.c(view);
        }
        return 0;
    }

    public static void A0(View view, int i4) {
        if (Build.VERSION.SDK_INT >= 26) {
            o.m(view, i4);
        }
    }

    public static int B(View view) {
        return i.d(view);
    }

    public static void B0(View view, int i4) {
        i.h(view, i4);
    }

    public static int C(View view) {
        return h.d(view);
    }

    public static void C0(View view, C c4) {
        m.u(view, c4);
    }

    public static int D(View view) {
        return h.e(view);
    }

    public static void D0(View view, int i4, int i5, int i6, int i7) {
        i.k(view, i4, i5, i6, i7);
    }

    public static String[] E(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return s.a(view);
        }
        return (String[]) view.getTag(G.c.f447N);
    }

    public static void E0(View view, boolean z3) {
        n0().g(view, Boolean.valueOf(z3));
    }

    public static int F(View view) {
        return i.e(view);
    }

    public static void F0(View view, int i4, int i5) {
        n.d(view, i4, i5);
    }

    public static int G(View view) {
        return i.f(view);
    }

    public static void G0(View view, String str) {
        m.v(view, str);
    }

    public static C0435o0 H(View view) {
        return n.a(view);
    }

    public static void H0(View view, C0409b0.b bVar) {
        C0409b0.d(view, bVar);
    }

    public static CharSequence I(View view) {
        return (CharSequence) I0().f(view);
    }

    private static f I0() {
        return new c(G.c.f449P, CharSequence.class, 64, 30);
    }

    public static String J(View view) {
        return m.k(view);
    }

    public static void J0(View view) {
        m.z(view);
    }

    public static M0 K(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return r.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return C0403a0.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static int L(View view) {
        return h.g(view);
    }

    public static float M(View view) {
        return m.m(view);
    }

    public static boolean N(View view) {
        return g.a(view);
    }

    public static boolean O(View view) {
        return h.h(view);
    }

    public static boolean P(View view) {
        return h.i(view);
    }

    public static boolean Q(View view) {
        Boolean bool = (Boolean) b().f(view);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean R(View view) {
        return k.b(view);
    }

    public static boolean S(View view) {
        return k.c(view);
    }

    public static boolean T(View view) {
        return m.p(view);
    }

    public static boolean U(View view) {
        return i.g(view);
    }

    public static boolean V(View view) {
        Boolean bool = (Boolean) n0().f(view);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C0412d W(C0412d dVar) {
        return dVar;
    }

    static void X(View view, int i4) {
        boolean z3;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (p(view) == null || !view.isShown() || view.getWindowVisibility() != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            int i5 = 32;
            if (o(view) != 0 || z3) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z3) {
                    i5 = 2048;
                }
                obtain.setEventType(i5);
                k.g(obtain, i4);
                if (z3) {
                    obtain.getText().add(p(view));
                    z0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i4 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                k.g(obtain2, i4);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(p(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    k.e(view.getParent(), view, view, i4);
                } catch (AbstractMethodError e4) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e4);
                }
            }
        }
    }

    public static void Y(View view, int i4) {
        view.offsetLeftAndRight(i4);
    }

    public static void Z(View view, int i4) {
        view.offsetTopAndBottom(i4);
    }

    public static C0435o0 a0(View view, C0435o0 o0Var) {
        WindowInsets u3 = o0Var.u();
        if (u3 != null) {
            WindowInsets b4 = l.b(view, u3);
            if (!b4.equals(u3)) {
                return C0435o0.w(b4, view);
            }
        }
        return o0Var;
    }

    private static f b() {
        return new d(G.c.f443J, Boolean.class, 28);
    }

    public static void b0(View view, A a4) {
        view.onInitializeAccessibilityNodeInfo(a4.I0());
    }

    public static int c(View view, CharSequence charSequence, D d4) {
        int r4 = r(view, charSequence);
        if (r4 != -1) {
            d(view, new A.a(r4, charSequence, d4));
        }
        return r4;
    }

    private static f c0() {
        return new b(G.c.f444K, CharSequence.class, 8, 28);
    }

    private static void d(View view, A.a aVar) {
        j(view);
        j0(aVar.b(), view);
        q(view).add(aVar);
        X(view, 0);
    }

    public static boolean d0(View view, int i4, Bundle bundle) {
        return h.j(view, i4, bundle);
    }

    public static W e(View view) {
        if (f5180b == null) {
            f5180b = new WeakHashMap();
        }
        W w3 = (W) f5180b.get(view);
        if (w3 != null) {
            return w3;
        }
        W w4 = new W(view);
        f5180b.put(view, w4);
        return w4;
    }

    public static C0412d e0(View view, C0412d dVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("performReceiveContent: ");
            sb.append(dVar);
            sb.append(", view=");
            sb.append(view.getClass().getSimpleName());
            sb.append("[");
            sb.append(view.getId());
            sb.append("]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return s.b(view, dVar);
        }
        D d4 = (D) view.getTag(G.c.f446M);
        if (d4 == null) {
            return x(view).a(dVar);
        }
        C0412d a4 = d4.a(view, dVar);
        if (a4 == null) {
            return null;
        }
        return x(view).a(a4);
    }

    public static C0435o0 f(View view, C0435o0 o0Var, Rect rect) {
        return m.b(view, o0Var, rect);
    }

    public static void f0(View view) {
        h.k(view);
    }

    public static C0435o0 g(View view, C0435o0 o0Var) {
        WindowInsets u3 = o0Var.u();
        if (u3 != null) {
            WindowInsets a4 = l.a(view, u3);
            if (!a4.equals(u3)) {
                return C0435o0.w(a4, view);
            }
        }
        return o0Var;
    }

    public static void g0(View view, Runnable runnable) {
        h.m(view, runnable);
    }

    static boolean h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return v.a(view).b(view, keyEvent);
    }

    public static void h0(View view, Runnable runnable, long j4) {
        h.n(view, runnable, j4);
    }

    static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return v.a(view).f(keyEvent);
    }

    public static void i0(View view, int i4) {
        j0(i4, view);
        X(view, 0);
    }

    static void j(View view) {
        C0402a l4 = l(view);
        if (l4 == null) {
            l4 = new C0402a();
        }
        o0(view, l4);
    }

    private static void j0(int i4, View view) {
        List q4 = q(view);
        for (int i5 = 0; i5 < q4.size(); i5++) {
            if (((A.a) q4.get(i5)).b() == i4) {
                q4.remove(i5);
                return;
            }
        }
    }

    public static int k() {
        return i.a();
    }

    public static void k0(View view, A.a aVar, CharSequence charSequence, D d4) {
        if (d4 == null && charSequence == null) {
            i0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, d4));
        }
    }

    public static C0402a l(View view) {
        View.AccessibilityDelegate m4 = m(view);
        if (m4 == null) {
            return null;
        }
        if (m4 instanceof C0402a.C0081a) {
            return ((C0402a.C0081a) m4).f5215a;
        }
        return new C0402a(m4);
    }

    public static void l0(View view) {
        l.c(view);
    }

    private static View.AccessibilityDelegate m(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return q.a(view);
        }
        return n(view);
    }

    public static void m0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 29) {
            q.d(view, context, iArr, attributeSet, typedArray, i4, i5);
        }
    }

    private static View.AccessibilityDelegate n(View view) {
        if (f5182d) {
            return null;
        }
        if (f5181c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f5181c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f5182d = true;
                return null;
            }
        }
        try {
            Object obj = f5181c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f5182d = true;
            return null;
        }
    }

    private static f n0() {
        return new a(G.c.f448O, Boolean.class, 28);
    }

    public static int o(View view) {
        return k.a(view);
    }

    public static void o0(View view, C0402a aVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (aVar == null && (m(view) instanceof C0402a.C0081a)) {
            aVar = new C0402a();
        }
        z0(view);
        if (aVar == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = aVar.d();
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static CharSequence p(View view) {
        return (CharSequence) c0().f(view);
    }

    public static void p0(View view, boolean z3) {
        b().g(view, Boolean.valueOf(z3));
    }

    private static List q(View view) {
        int i4 = G.c.f441H;
        ArrayList arrayList = (ArrayList) view.getTag(i4);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i4, arrayList2);
        return arrayList2;
    }

    public static void q0(View view, int i4) {
        k.f(view, i4);
    }

    private static int r(View view, CharSequence charSequence) {
        boolean z3;
        List q4 = q(view);
        for (int i4 = 0; i4 < q4.size(); i4++) {
            if (TextUtils.equals(charSequence, ((A.a) q4.get(i4)).c())) {
                return ((A.a) q4.get(i4)).b();
            }
        }
        int i5 = -1;
        int i6 = 0;
        while (true) {
            int[] iArr = f5183e;
            if (i6 >= iArr.length || i5 != -1) {
                return i5;
            }
            int i7 = iArr[i6];
            boolean z4 = true;
            for (int i8 = 0; i8 < q4.size(); i8++) {
                if (((A.a) q4.get(i8)).b() != i7) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 &= z3;
            }
            if (z4) {
                i5 = i7;
            }
            i6++;
        }
        return i5;
    }

    public static void r0(View view, CharSequence charSequence) {
        c0().g(view, charSequence);
        if (charSequence != null) {
            f5185g.a(view);
        } else {
            f5185g.d(view);
        }
    }

    public static ColorStateList s(View view) {
        return m.g(view);
    }

    public static void s0(View view, Drawable drawable) {
        h.q(view, drawable);
    }

    public static PorterDuff.Mode t(View view) {
        return m.h(view);
    }

    public static void t0(View view, ColorStateList colorStateList) {
        m.q(view, colorStateList);
    }

    public static Rect u(View view) {
        return j.a(view);
    }

    public static void u0(View view, PorterDuff.Mode mode) {
        m.r(view, mode);
    }

    public static Display v(View view) {
        return i.b(view);
    }

    public static void v0(View view, Rect rect) {
        j.c(view, rect);
    }

    public static float w(View view) {
        return m.i(view);
    }

    public static void w0(View view, float f4) {
        m.s(view, f4);
    }

    private static E x(View view) {
        if (view instanceof E) {
            return (E) view;
        }
        return f5184f;
    }

    public static void x0(View view, boolean z3) {
        h.r(view, z3);
    }

    public static boolean y(View view) {
        return h.b(view);
    }

    public static void y0(View view, int i4) {
        h.s(view, i4);
    }

    public static int z(View view) {
        return h.c(view);
    }

    private static void z0(View view) {
        if (z(view) == 0) {
            y0(view, 1);
        }
    }
}
