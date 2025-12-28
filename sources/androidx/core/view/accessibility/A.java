package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.app.F;
import androidx.core.view.accessibility.D;
import java.lang.ref.WeakReference;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.uuid.Uuid;

public class A {

    /* renamed from: d  reason: collision with root package name */
    private static int f5216d;

    /* renamed from: a  reason: collision with root package name */
    private final AccessibilityNodeInfo f5217a;

    /* renamed from: b  reason: collision with root package name */
    public int f5218b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f5219c = -1;

    public static class a {

        /* renamed from: A  reason: collision with root package name */
        public static final a f5220A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, (CharSequence) null, (D) null, (Class) null);

        /* renamed from: B  reason: collision with root package name */
        public static final a f5221B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, (CharSequence) null, (D) null, D.e.class);

        /* renamed from: C  reason: collision with root package name */
        public static final a f5222C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, (CharSequence) null, (D) null, (Class) null);

        /* renamed from: D  reason: collision with root package name */
        public static final a f5223D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, (CharSequence) null, (D) null, (Class) null);

        /* renamed from: E  reason: collision with root package name */
        public static final a f5224E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (CharSequence) null, (D) null, (Class) null);

        /* renamed from: F  reason: collision with root package name */
        public static final a f5225F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, (CharSequence) null, (D) null, (Class) null);

        /* renamed from: G  reason: collision with root package name */
        public static final a f5226G;

        /* renamed from: H  reason: collision with root package name */
        public static final a f5227H;

        /* renamed from: I  reason: collision with root package name */
        public static final a f5228I;

        /* renamed from: J  reason: collision with root package name */
        public static final a f5229J;

        /* renamed from: K  reason: collision with root package name */
        public static final a f5230K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, (CharSequence) null, (D) null, (Class) null);

        /* renamed from: L  reason: collision with root package name */
        public static final a f5231L;

        /* renamed from: M  reason: collision with root package name */
        public static final a f5232M;

        /* renamed from: N  reason: collision with root package name */
        public static final a f5233N;

        /* renamed from: O  reason: collision with root package name */
        public static final a f5234O;

        /* renamed from: P  reason: collision with root package name */
        public static final a f5235P;

        /* renamed from: Q  reason: collision with root package name */
        public static final a f5236Q;

        /* renamed from: R  reason: collision with root package name */
        public static final a f5237R;

        /* renamed from: S  reason: collision with root package name */
        public static final a f5238S;

        /* renamed from: T  reason: collision with root package name */
        public static final a f5239T;

        /* renamed from: U  reason: collision with root package name */
        public static final a f5240U;

        /* renamed from: V  reason: collision with root package name */
        public static final a f5241V;

        /* renamed from: e  reason: collision with root package name */
        public static final a f5242e = new a(1, (CharSequence) null);

        /* renamed from: f  reason: collision with root package name */
        public static final a f5243f = new a(2, (CharSequence) null);

        /* renamed from: g  reason: collision with root package name */
        public static final a f5244g = new a(4, (CharSequence) null);

        /* renamed from: h  reason: collision with root package name */
        public static final a f5245h = new a(8, (CharSequence) null);

        /* renamed from: i  reason: collision with root package name */
        public static final a f5246i = new a(16, (CharSequence) null);

        /* renamed from: j  reason: collision with root package name */
        public static final a f5247j = new a(32, (CharSequence) null);

        /* renamed from: k  reason: collision with root package name */
        public static final a f5248k = new a(64, (CharSequence) null);

        /* renamed from: l  reason: collision with root package name */
        public static final a f5249l = new a(Uuid.SIZE_BITS, (CharSequence) null);

        /* renamed from: m  reason: collision with root package name */
        public static final a f5250m;

        /* renamed from: n  reason: collision with root package name */
        public static final a f5251n;

        /* renamed from: o  reason: collision with root package name */
        public static final a f5252o;

        /* renamed from: p  reason: collision with root package name */
        public static final a f5253p;

        /* renamed from: q  reason: collision with root package name */
        public static final a f5254q = new a(4096, (CharSequence) null);

        /* renamed from: r  reason: collision with root package name */
        public static final a f5255r = new a(8192, (CharSequence) null);

        /* renamed from: s  reason: collision with root package name */
        public static final a f5256s = new a(16384, (CharSequence) null);

        /* renamed from: t  reason: collision with root package name */
        public static final a f5257t = new a(32768, (CharSequence) null);

        /* renamed from: u  reason: collision with root package name */
        public static final a f5258u = new a(65536, (CharSequence) null);

        /* renamed from: v  reason: collision with root package name */
        public static final a f5259v = new a(131072, (CharSequence) null, D.g.class);

        /* renamed from: w  reason: collision with root package name */
        public static final a f5260w = new a(262144, (CharSequence) null);

        /* renamed from: x  reason: collision with root package name */
        public static final a f5261x = new a(524288, (CharSequence) null);

        /* renamed from: y  reason: collision with root package name */
        public static final a f5262y = new a(1048576, (CharSequence) null);

        /* renamed from: z  reason: collision with root package name */
        public static final a f5263z = new a(2097152, (CharSequence) null, D.h.class);

        /* renamed from: a  reason: collision with root package name */
        final Object f5264a;

        /* renamed from: b  reason: collision with root package name */
        private final int f5265b;

        /* renamed from: c  reason: collision with root package name */
        private final Class f5266c;

        /* renamed from: d  reason: collision with root package name */
        protected final D f5267d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15 = null;
            Class<D.b> cls = D.b.class;
            f5250m = new a(256, (CharSequence) null, (Class) cls);
            f5251n = new a(512, (CharSequence) null, (Class) cls);
            Class<D.c> cls2 = D.c.class;
            f5252o = new a(1024, (CharSequence) null, (Class) cls2);
            f5253p = new a(2048, (CharSequence) null, (Class) cls2);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 29) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            } else {
                accessibilityAction = null;
            }
            f5226G = new a(accessibilityAction, 16908358, (CharSequence) null, (D) null, (Class) null);
            if (i4 >= 29) {
                accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            } else {
                accessibilityAction2 = null;
            }
            f5227H = new a(accessibilityAction2, 16908359, (CharSequence) null, (D) null, (Class) null);
            if (i4 >= 29) {
                accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
            } else {
                accessibilityAction3 = null;
            }
            f5228I = new a(accessibilityAction3, 16908360, (CharSequence) null, (D) null, (Class) null);
            if (i4 >= 29) {
                accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            } else {
                accessibilityAction4 = null;
            }
            f5229J = new a(accessibilityAction4, 16908361, (CharSequence) null, (D) null, (Class) null);
            if (i4 >= 24) {
                accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
            } else {
                accessibilityAction5 = null;
            }
            f5231L = new a(accessibilityAction5, 16908349, (CharSequence) null, (D) null, D.f.class);
            if (i4 >= 26) {
                accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
            } else {
                accessibilityAction6 = null;
            }
            f5232M = new a(accessibilityAction6, 16908354, (CharSequence) null, (D) null, D.d.class);
            if (i4 >= 28) {
                accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            } else {
                accessibilityAction7 = null;
            }
            f5233N = new a(accessibilityAction7, 16908356, (CharSequence) null, (D) null, (Class) null);
            if (i4 >= 28) {
                accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            } else {
                accessibilityAction8 = null;
            }
            f5234O = new a(accessibilityAction8, 16908357, (CharSequence) null, (D) null, (Class) null);
            if (i4 >= 30) {
                accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
            } else {
                accessibilityAction9 = null;
            }
            f5235P = new a(accessibilityAction9, 16908362, (CharSequence) null, (D) null, (Class) null);
            if (i4 >= 30) {
                accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            } else {
                accessibilityAction10 = null;
            }
            f5236Q = new a(accessibilityAction10, 16908372, (CharSequence) null, (D) null, (Class) null);
            if (i4 >= 32) {
                accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
            } else {
                accessibilityAction11 = null;
            }
            f5237R = new a(accessibilityAction11, 16908373, (CharSequence) null, (D) null, (Class) null);
            if (i4 >= 32) {
                accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            } else {
                accessibilityAction12 = null;
            }
            f5238S = new a(accessibilityAction12, 16908374, (CharSequence) null, (D) null, (Class) null);
            if (i4 >= 32) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            } else {
                accessibilityAction13 = null;
            }
            f5239T = new a(accessibilityAction13, 16908375, (CharSequence) null, (D) null, (Class) null);
            if (i4 >= 33) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            } else {
                accessibilityAction14 = null;
            }
            f5240U = new a(accessibilityAction14, 16908376, (CharSequence) null, (D) null, (Class) null);
            if (i4 >= 34) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
            }
            f5241V = new a(accessibilityAction15, 16908382, (CharSequence) null, (D) null, (Class) null);
        }

        public a(int i4, CharSequence charSequence) {
            this((Object) null, i4, charSequence, (D) null, (Class) null);
        }

        public a a(CharSequence charSequence, D d4) {
            return new a((Object) null, this.f5265b, charSequence, d4, this.f5266c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f5264a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f5264a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            String str;
            if (this.f5267d == null) {
                return false;
            }
            Class cls = this.f5266c;
            if (cls != null) {
                try {
                    F.a(cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null));
                    throw null;
                } catch (Exception e4) {
                    Class cls2 = this.f5266c;
                    if (cls2 == null) {
                        str = "null";
                    } else {
                        str = cls2.getName();
                    }
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + str, e4);
                }
            }
            return this.f5267d.a(view, (D.a) null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f5264a;
            if (obj2 == null) {
                if (aVar.f5264a != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(aVar.f5264a)) {
                return false;
            } else {
                return true;
            }
        }

        public int hashCode() {
            Object obj = this.f5264a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String i4 = A.i(this.f5265b);
            if (i4.equals("ACTION_UNKNOWN") && c() != null) {
                i4 = c().toString();
            }
            sb.append(i4);
            return sb.toString();
        }

        public a(int i4, CharSequence charSequence, D d4) {
            this((Object) null, i4, charSequence, d4, (Class) null);
        }

        a(Object obj) {
            this(obj, 0, (CharSequence) null, (D) null, (Class) null);
        }

        private a(int i4, CharSequence charSequence, Class cls) {
            this((Object) null, i4, charSequence, (D) null, cls);
        }

        a(Object obj, int i4, CharSequence charSequence, D d4, Class cls) {
            this.f5265b = i4;
            this.f5267d = d4;
            if (obj == null) {
                this.f5264a = new AccessibilityNodeInfo.AccessibilityAction(i4, charSequence);
            } else {
                this.f5264a = obj;
            }
            this.f5266c = cls;
        }
    }

    private static class b {
        public static g a(int i4, int i5, int i6, int i7, boolean z3) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, i5, i6, i7, z3));
        }

        public static Object b(int i4, float f4, float f5, float f6) {
            return AccessibilityNodeInfo.RangeInfo.obtain(i4, f4, f5, f6);
        }

        public static Bundle c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtras();
        }
    }

    private static class c {
        public static Object a(int i4, float f4, float f5, float f6) {
            return new AccessibilityNodeInfo.RangeInfo(i4, f4, f5, f6);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    private static class d {
        public static g a(boolean z3, int i4, int i5, int i6, int i7, boolean z4, String str, String str2) {
            return new g(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z3).setColumnIndex(i4).setRowIndex(i5).setColumnSpan(i6).setRowSpan(i7).setSelected(z4).setRowTitle(str).setColumnTitle(str2).build());
        }

        public static A b(AccessibilityNodeInfo accessibilityNodeInfo, int i4, int i5) {
            return A.K0(accessibilityNodeInfo.getChild(i4, i5));
        }

        public static String c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        public static String d(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        public static A f(AccessibilityNodeInfo accessibilityNodeInfo, int i4) {
            return A.K0(accessibilityNodeInfo.getParent(i4));
        }

        public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z3) {
            accessibilityNodeInfo.setTextSelectable(z3);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    private static class e {
        public static void a(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static long c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void f(AccessibilityNodeInfo accessibilityNodeInfo, boolean z3) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z3);
        }

        public static void g(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        public static void h(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, long j4) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j4));
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z3) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z3);
        }

        public static void k(AccessibilityNodeInfo accessibilityNodeInfo, boolean z3) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z3);
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        final Object f5268a;

        f(Object obj) {
            this.f5268a = obj;
        }

        public static f a(int i4, int i5, boolean z3, int i6) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i4, i5, z3, i6));
        }
    }

    public static class g {

        /* renamed from: a  reason: collision with root package name */
        final Object f5269a;

        g(Object obj) {
            this.f5269a = obj;
        }

        public static g a(int i4, int i5, int i6, int i7, boolean z3, boolean z4) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, i5, i6, i7, z3, z4));
        }
    }

    public A(Object obj) {
        this.f5217a = (AccessibilityNodeInfo) obj;
    }

    private boolean E() {
        return !g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int F(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i4)).get())) {
                    return sparseArray.keyAt(i4);
                }
            }
        }
        int i5 = f5216d;
        f5216d = i5 + 1;
        return i5;
    }

    public static A J0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new A(accessibilityNodeInfo);
    }

    static A K0(Object obj) {
        if (obj != null) {
            return new A(obj);
        }
        return null;
    }

    public static A X() {
        return J0(AccessibilityNodeInfo.obtain());
    }

    public static A Y(View view) {
        return J0(AccessibilityNodeInfo.obtain(view));
    }

    public static A Z(A a4) {
        return J0(AccessibilityNodeInfo.obtain(a4.f5217a));
    }

    private void c0(View view) {
        SparseArray y3 = y(view);
        if (y3 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < y3.size(); i4++) {
                if (((WeakReference) y3.valueAt(i4)).get() == null) {
                    arrayList.add(Integer.valueOf(i4));
                }
            }
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                y3.remove(((Integer) arrayList.get(i5)).intValue());
            }
        }
    }

    private void d(ClickableSpan clickableSpan, Spanned spanned, int i4) {
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i4));
    }

    private void e0(int i4, boolean z3) {
        Bundle u3 = u();
        if (u3 != null) {
            int i5 = u3.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i4);
            if (!z3) {
                i4 = 0;
            }
            u3.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i4 | i5);
        }
    }

    private void f() {
        b.c(this.f5217a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        b.c(this.f5217a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        b.c(this.f5217a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        b.c(this.f5217a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private List g(String str) {
        ArrayList<Integer> integerArrayList = b.c(this.f5217a).getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        b.c(this.f5217a).putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    static String i(int i4) {
        if (i4 == 1) {
            return "ACTION_FOCUS";
        }
        if (i4 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i4) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case Uuid.SIZE_BITS /*128*/:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908382:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i4) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i4) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i4) {
                                    case 16908372:
                                        return "ACTION_IME_ENTER";
                                    case 16908373:
                                        return "ACTION_DRAG_START";
                                    case 16908374:
                                        return "ACTION_DRAG_DROP";
                                    case 16908375:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private boolean k(int i4) {
        Bundle u3 = u();
        if (u3 != null && (u3.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i4) == i4) {
            return true;
        }
        return false;
    }

    public static ClickableSpan[] q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray w(View view) {
        SparseArray y3 = y(view);
        if (y3 != null) {
            return y3;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(G.c.f442I, sparseArray);
        return sparseArray;
    }

    private SparseArray y(View view) {
        return (SparseArray) view.getTag(G.c.f442I);
    }

    public CharSequence A() {
        if (!E()) {
            return this.f5217a.getText();
        }
        List g4 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List g5 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List g6 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List g7 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f5217a.getText(), 0, this.f5217a.getText().length()));
        for (int i4 = 0; i4 < g4.size(); i4++) {
            spannableString.setSpan(new C0404a(((Integer) g7.get(i4)).intValue(), this, u().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) g4.get(i4)).intValue(), ((Integer) g5.get(i4)).intValue(), ((Integer) g6.get(i4)).intValue());
        }
        return spannableString;
    }

    public void A0(boolean z3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f5217a.setScreenReaderFocusable(z3);
        } else {
            e0(1, z3);
        }
    }

    public CharSequence B() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f5217a.getTooltipText();
        }
        return b.c(this.f5217a).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void B0(boolean z3) {
        this.f5217a.setScrollable(z3);
    }

    public String C() {
        if (Build.VERSION.SDK_INT >= 33) {
            return d.g(this.f5217a);
        }
        return b.c(this.f5217a).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void C0(boolean z3) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f5217a.setShowingHintText(z3);
        } else {
            e0(4, z3);
        }
    }

    public String D() {
        return this.f5217a.getViewIdResourceName();
    }

    public void D0(View view, int i4) {
        this.f5219c = i4;
        this.f5217a.setSource(view, i4);
    }

    public void E0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.c(this.f5217a, charSequence);
        } else {
            b.c(this.f5217a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public void F0(CharSequence charSequence) {
        this.f5217a.setText(charSequence);
    }

    public boolean G() {
        if (Build.VERSION.SDK_INT >= 34) {
            return e.e(this.f5217a);
        }
        return k(64);
    }

    public void G0(View view) {
        this.f5217a.setTraversalAfter(view);
    }

    public boolean H() {
        return this.f5217a.isCheckable();
    }

    public void H0(boolean z3) {
        this.f5217a.setVisibleToUser(z3);
    }

    public boolean I() {
        return this.f5217a.isChecked();
    }

    public AccessibilityNodeInfo I0() {
        return this.f5217a;
    }

    public boolean J() {
        return this.f5217a.isClickable();
    }

    public boolean K() {
        return this.f5217a.isContextClickable();
    }

    public boolean L() {
        return this.f5217a.isEnabled();
    }

    public boolean M() {
        return this.f5217a.isFocusable();
    }

    public boolean N() {
        return this.f5217a.isFocused();
    }

    public boolean O() {
        return k(67108864);
    }

    public boolean P() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f5217a.isImportantForAccessibility();
        }
        return true;
    }

    public boolean Q() {
        return this.f5217a.isLongClickable();
    }

    public boolean R() {
        return this.f5217a.isPassword();
    }

    public boolean S() {
        return this.f5217a.isScrollable();
    }

    public boolean T() {
        return this.f5217a.isSelected();
    }

    public boolean U() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f5217a.isShowingHintText();
        }
        return k(4);
    }

    public boolean V() {
        if (Build.VERSION.SDK_INT >= 33) {
            return d.h(this.f5217a);
        }
        return k(8388608);
    }

    public boolean W() {
        return this.f5217a.isVisibleToUser();
    }

    public void a(int i4) {
        this.f5217a.addAction(i4);
    }

    public boolean a0(int i4, Bundle bundle) {
        return this.f5217a.performAction(i4, bundle);
    }

    public void b(a aVar) {
        this.f5217a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f5264a);
    }

    public void b0() {
    }

    public void c(View view, int i4) {
        this.f5217a.addChild(view, i4);
    }

    public void d0(boolean z3) {
        this.f5217a.setAccessibilityFocused(z3);
    }

    public void e(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            f();
            c0(view);
            ClickableSpan[] q4 = q(charSequence);
            if (q4 != null && q4.length > 0) {
                u().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", G.c.f453a);
                SparseArray w3 = w(view);
                for (int i4 = 0; i4 < q4.length; i4++) {
                    int F3 = F(q4[i4], w3);
                    w3.put(F3, new WeakReference(q4[i4]));
                    d(q4[i4], (Spanned) charSequence, F3);
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof A)) {
            return false;
        }
        A a4 = (A) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5217a;
        if (accessibilityNodeInfo == null) {
            if (a4.f5217a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(a4.f5217a)) {
            return false;
        }
        if (this.f5219c == a4.f5219c && this.f5218b == a4.f5218b) {
            return true;
        }
        return false;
    }

    public void f0(Rect rect) {
        this.f5217a.setBoundsInParent(rect);
    }

    public void g0(Rect rect) {
        this.f5217a.setBoundsInScreen(rect);
    }

    public List h() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f5217a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(new a(actionList.get(i4)));
        }
        return arrayList;
    }

    public void h0(boolean z3) {
        this.f5217a.setCheckable(z3);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5217a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i0(boolean z3) {
        this.f5217a.setChecked(z3);
    }

    public int j() {
        return this.f5217a.getActions();
    }

    public void j0(CharSequence charSequence) {
        this.f5217a.setClassName(charSequence);
    }

    public void k0(boolean z3) {
        this.f5217a.setClickable(z3);
    }

    public void l(Rect rect) {
        this.f5217a.getBoundsInParent(rect);
    }

    public void l0(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5217a;
        if (obj == null) {
            collectionInfo = null;
        } else {
            collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((f) obj).f5268a;
        }
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    public void m(Rect rect) {
        this.f5217a.getBoundsInScreen(rect);
    }

    public void m0(Object obj) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5217a;
        if (obj == null) {
            collectionItemInfo = null;
        } else {
            collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo) ((g) obj).f5269a;
        }
        accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
    }

    public void n(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.a(this.f5217a, rect);
            return;
        }
        Rect rect2 = (Rect) b.c(this.f5217a).getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void n0(CharSequence charSequence) {
        this.f5217a.setContentDescription(charSequence);
    }

    public int o() {
        return this.f5217a.getChildCount();
    }

    public void o0(boolean z3) {
        this.f5217a.setEnabled(z3);
    }

    public CharSequence p() {
        return this.f5217a.getClassName();
    }

    public void p0(CharSequence charSequence) {
        this.f5217a.setError(charSequence);
    }

    public void q0(boolean z3) {
        this.f5217a.setFocusable(z3);
    }

    public CharSequence r() {
        if (Build.VERSION.SDK_INT >= 34) {
            return e.b(this.f5217a);
        }
        return b.c(this.f5217a).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void r0(boolean z3) {
        this.f5217a.setFocused(z3);
    }

    public CharSequence s() {
        return this.f5217a.getContentDescription();
    }

    public void s0(boolean z3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f5217a.setHeading(z3);
        } else {
            e0(2, z3);
        }
    }

    public CharSequence t() {
        return this.f5217a.getError();
    }

    public void t0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f5217a.setHintText(charSequence);
        } else {
            b.c(this.f5217a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        l(rect);
        sb.append("; boundsInParent: " + rect);
        m(rect);
        sb.append("; boundsInScreen: " + rect);
        n(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(x());
        sb.append("; className: ");
        sb.append(p());
        sb.append("; text: ");
        sb.append(A());
        sb.append("; error: ");
        sb.append(t());
        sb.append("; maxTextLength: ");
        sb.append(v());
        sb.append("; stateDescription: ");
        sb.append(z());
        sb.append("; contentDescription: ");
        sb.append(s());
        sb.append("; tooltipText: ");
        sb.append(B());
        sb.append("; viewIdResName: ");
        sb.append(D());
        sb.append("; uniqueId: ");
        sb.append(C());
        sb.append("; checkable: ");
        sb.append(H());
        sb.append("; checked: ");
        sb.append(I());
        sb.append("; focusable: ");
        sb.append(M());
        sb.append("; focused: ");
        sb.append(N());
        sb.append("; selected: ");
        sb.append(T());
        sb.append("; clickable: ");
        sb.append(J());
        sb.append("; longClickable: ");
        sb.append(Q());
        sb.append("; contextClickable: ");
        sb.append(K());
        sb.append("; enabled: ");
        sb.append(L());
        sb.append("; password: ");
        sb.append(R());
        sb.append("; scrollable: " + S());
        sb.append("; containerTitle: ");
        sb.append(r());
        sb.append("; granularScrollingSupported: ");
        sb.append(O());
        sb.append("; importantForAccessibility: ");
        sb.append(P());
        sb.append("; visible: ");
        sb.append(W());
        sb.append("; isTextSelectable: ");
        sb.append(V());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(G());
        sb.append("; [");
        List h4 = h();
        for (int i4 = 0; i4 < h4.size(); i4++) {
            a aVar = (a) h4.get(i4);
            String i5 = i(aVar.b());
            if (i5.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                i5 = aVar.c().toString();
            }
            sb.append(i5);
            if (i4 != h4.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public Bundle u() {
        return b.c(this.f5217a);
    }

    public void u0(View view) {
        this.f5217a.setLabelFor(view);
    }

    public int v() {
        return this.f5217a.getMaxTextLength();
    }

    public void v0(int i4) {
        this.f5217a.setMaxTextLength(i4);
    }

    public void w0(CharSequence charSequence) {
        this.f5217a.setPackageName(charSequence);
    }

    public CharSequence x() {
        return this.f5217a.getPackageName();
    }

    public void x0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f5217a.setPaneTitle(charSequence);
        } else {
            b.c(this.f5217a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void y0(View view) {
        this.f5218b = -1;
        this.f5217a.setParent(view);
    }

    public CharSequence z() {
        if (Build.VERSION.SDK_INT >= 30) {
            return c.b(this.f5217a);
        }
        return b.c(this.f5217a).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void z0(View view, int i4) {
        this.f5218b = i4;
        this.f5217a.setParent(view, i4);
    }

    private A(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f5217a = accessibilityNodeInfo;
    }
}
