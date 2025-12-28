package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.p;
import java.lang.reflect.Method;
import n.C0822a;
import n.j;

public class P implements p {

    /* renamed from: G  reason: collision with root package name */
    private static Method f3261G;

    /* renamed from: H  reason: collision with root package name */
    private static Method f3262H;

    /* renamed from: I  reason: collision with root package name */
    private static Method f3263I;

    /* renamed from: A  reason: collision with root package name */
    private Runnable f3264A;

    /* renamed from: B  reason: collision with root package name */
    final Handler f3265B;

    /* renamed from: C  reason: collision with root package name */
    private final Rect f3266C;

    /* renamed from: D  reason: collision with root package name */
    private Rect f3267D;

    /* renamed from: E  reason: collision with root package name */
    private boolean f3268E;

    /* renamed from: F  reason: collision with root package name */
    PopupWindow f3269F;

    /* renamed from: a  reason: collision with root package name */
    private Context f3270a;

    /* renamed from: b  reason: collision with root package name */
    private ListAdapter f3271b;

    /* renamed from: c  reason: collision with root package name */
    L f3272c;

    /* renamed from: d  reason: collision with root package name */
    private int f3273d;

    /* renamed from: e  reason: collision with root package name */
    private int f3274e;

    /* renamed from: f  reason: collision with root package name */
    private int f3275f;

    /* renamed from: g  reason: collision with root package name */
    private int f3276g;

    /* renamed from: h  reason: collision with root package name */
    private int f3277h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3278i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3279j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f3280k;

    /* renamed from: l  reason: collision with root package name */
    private int f3281l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f3282m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f3283n;

    /* renamed from: o  reason: collision with root package name */
    int f3284o;

    /* renamed from: p  reason: collision with root package name */
    private View f3285p;

    /* renamed from: q  reason: collision with root package name */
    private int f3286q;

    /* renamed from: r  reason: collision with root package name */
    private DataSetObserver f3287r;

    /* renamed from: s  reason: collision with root package name */
    private View f3288s;

    /* renamed from: t  reason: collision with root package name */
    private Drawable f3289t;

    /* renamed from: u  reason: collision with root package name */
    private AdapterView.OnItemClickListener f3290u;

    /* renamed from: v  reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f3291v;

    /* renamed from: w  reason: collision with root package name */
    final i f3292w;

    /* renamed from: x  reason: collision with root package name */
    private final h f3293x;

    /* renamed from: y  reason: collision with root package name */
    private final g f3294y;

    /* renamed from: z  reason: collision with root package name */
    private final e f3295z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            View t4 = P.this.t();
            if (t4 != null && t4.getWindowToken() != null) {
                P.this.d();
            }
        }
    }

    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        public void onItemSelected(AdapterView adapterView, View view, int i4, long j4) {
            L l4;
            if (i4 != -1 && (l4 = P.this.f3272c) != null) {
                l4.setListSelectionHidden(false);
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static class c {
        static int a(PopupWindow popupWindow, View view, int i4, boolean z3) {
            return popupWindow.getMaxAvailableHeight(view, i4, z3);
        }
    }

    static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z3) {
            popupWindow.setIsClippedToScreen(z3);
        }
    }

    private class e implements Runnable {
        e() {
        }

        public void run() {
            P.this.r();
        }
    }

    private class f extends DataSetObserver {
        f() {
        }

        public void onChanged() {
            if (P.this.b()) {
                P.this.d();
            }
        }

        public void onInvalidated() {
            P.this.dismiss();
        }
    }

    private class g implements AbsListView.OnScrollListener {
        g() {
        }

        public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i4) {
            if (i4 == 1 && !P.this.A() && P.this.f3269F.getContentView() != null) {
                P p4 = P.this;
                p4.f3265B.removeCallbacks(p4.f3292w);
                P.this.f3292w.run();
            }
        }
    }

    private class h implements View.OnTouchListener {
        h() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x3 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = P.this.f3269F) != null && popupWindow.isShowing() && x3 >= 0 && x3 < P.this.f3269F.getWidth() && y3 >= 0 && y3 < P.this.f3269F.getHeight()) {
                P p4 = P.this;
                p4.f3265B.postDelayed(p4.f3292w, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                P p5 = P.this;
                p5.f3265B.removeCallbacks(p5.f3292w);
                return false;
            }
        }
    }

    private class i implements Runnable {
        i() {
        }

        public void run() {
            L l4 = P.this.f3272c;
            if (l4 != null && androidx.core.view.P.R(l4) && P.this.f3272c.getCount() > P.this.f3272c.getChildCount()) {
                int childCount = P.this.f3272c.getChildCount();
                P p4 = P.this;
                if (childCount <= p4.f3284o) {
                    p4.f3269F.setInputMethodMode(2);
                    P.this.d();
                }
            }
        }
    }

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f3261G = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
            }
            try {
                f3263I = cls.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f3262H = cls.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public P(Context context) {
        this(context, (AttributeSet) null, C0822a.f14658B);
    }

    private void C() {
        View view = this.f3285p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f3285p);
            }
        }
    }

    private void O(boolean z3) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f3261G;
            if (method != null) {
                try {
                    method.invoke(this.f3269F, new Object[]{Boolean.valueOf(z3)});
                } catch (Exception unused) {
                }
            }
        } else {
            d.b(this.f3269F, z3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: androidx.appcompat.widget.L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: androidx.appcompat.widget.L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: androidx.appcompat.widget.L} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int q() {
        /*
            r12 = this;
            androidx.appcompat.widget.L r0 = r12.f3272c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00be
            android.content.Context r0 = r12.f3270a
            androidx.appcompat.widget.P$a r5 = new androidx.appcompat.widget.P$a
            r5.<init>()
            r12.f3264A = r5
            boolean r5 = r12.f3268E
            r5 = r5 ^ r3
            androidx.appcompat.widget.L r5 = r12.s(r0, r5)
            r12.f3272c = r5
            android.graphics.drawable.Drawable r6 = r12.f3289t
            if (r6 == 0) goto L_0x0022
            r5.setSelector(r6)
        L_0x0022:
            androidx.appcompat.widget.L r5 = r12.f3272c
            android.widget.ListAdapter r6 = r12.f3271b
            r5.setAdapter(r6)
            androidx.appcompat.widget.L r5 = r12.f3272c
            android.widget.AdapterView$OnItemClickListener r6 = r12.f3290u
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.L r5 = r12.f3272c
            r5.setFocusable(r3)
            androidx.appcompat.widget.L r5 = r12.f3272c
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.L r5 = r12.f3272c
            androidx.appcompat.widget.P$b r6 = new androidx.appcompat.widget.P$b
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.L r5 = r12.f3272c
            androidx.appcompat.widget.P$g r6 = r12.f3294y
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.f3291v
            if (r5 == 0) goto L_0x0054
            androidx.appcompat.widget.L r6 = r12.f3272c
            r6.setOnItemSelectedListener(r5)
        L_0x0054:
            androidx.appcompat.widget.L r5 = r12.f3272c
            android.view.View r6 = r12.f3285p
            if (r6 == 0) goto L_0x00b7
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.f3286q
            if (r8 == 0) goto L_0x008f
            if (r8 == r3) goto L_0x0088
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.f3286q
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L_0x0095
        L_0x0088:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x0095
        L_0x008f:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x0095:
            int r0 = r12.f3274e
            if (r0 < 0) goto L_0x009b
            r5 = r1
            goto L_0x009d
        L_0x009b:
            r0 = r4
            r5 = r0
        L_0x009d:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00b8
        L_0x00b7:
            r0 = r4
        L_0x00b8:
            android.widget.PopupWindow r6 = r12.f3269F
            r6.setContentView(r5)
            goto L_0x00dc
        L_0x00be:
            android.widget.PopupWindow r0 = r12.f3269F
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.f3285p
            if (r0 == 0) goto L_0x00db
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00dc
        L_0x00db:
            r0 = r4
        L_0x00dc:
            android.widget.PopupWindow r5 = r12.f3269F
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00f8
            android.graphics.Rect r6 = r12.f3266C
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.f3266C
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.f3278i
            if (r7 != 0) goto L_0x00fe
            int r6 = -r6
            r12.f3276g = r6
            goto L_0x00fe
        L_0x00f8:
            android.graphics.Rect r5 = r12.f3266C
            r5.setEmpty()
            r5 = r4
        L_0x00fe:
            android.widget.PopupWindow r6 = r12.f3269F
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0108
            goto L_0x0109
        L_0x0108:
            r3 = r4
        L_0x0109:
            android.view.View r4 = r12.t()
            int r6 = r12.f3276g
            int r3 = r12.u(r4, r6, r3)
            boolean r4 = r12.f3282m
            if (r4 != 0) goto L_0x017b
            int r4 = r12.f3273d
            if (r4 != r2) goto L_0x011c
            goto L_0x017b
        L_0x011c:
            int r4 = r12.f3274e
            r6 = -2
            if (r4 == r6) goto L_0x0144
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x012b
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
        L_0x0129:
            r7 = r1
            goto L_0x015d
        L_0x012b:
            android.content.Context r2 = r12.f3270a
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f3266C
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x0129
        L_0x0144:
            android.content.Context r2 = r12.f3270a
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f3266C
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x0129
        L_0x015d:
            androidx.appcompat.widget.L r6 = r12.f3272c
            int r10 = r3 - r0
            r11 = -1
            r8 = 0
            r9 = -1
            int r1 = r6.d(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0179
            androidx.appcompat.widget.L r2 = r12.f3272c
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.L r3 = r12.f3272c
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0179:
            int r1 = r1 + r0
            return r1
        L_0x017b:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.P.q():int");
    }

    private int u(View view, int i4, boolean z3) {
        if (Build.VERSION.SDK_INT > 23) {
            return c.a(this.f3269F, view, i4, z3);
        }
        Method method = f3262H;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f3269F, new Object[]{view, Integer.valueOf(i4), Boolean.valueOf(z3)})).intValue();
            } catch (Exception unused) {
            }
        }
        return this.f3269F.getMaxAvailableHeight(view, i4);
    }

    public boolean A() {
        if (this.f3269F.getInputMethodMode() == 2) {
            return true;
        }
        return false;
    }

    public boolean B() {
        return this.f3268E;
    }

    public void D(View view) {
        this.f3288s = view;
    }

    public void E(int i4) {
        this.f3269F.setAnimationStyle(i4);
    }

    public void F(int i4) {
        Drawable background = this.f3269F.getBackground();
        if (background != null) {
            background.getPadding(this.f3266C);
            Rect rect = this.f3266C;
            this.f3274e = rect.left + rect.right + i4;
            return;
        }
        R(i4);
    }

    public void G(int i4) {
        this.f3281l = i4;
    }

    public void H(Rect rect) {
        Rect rect2;
        if (rect != null) {
            rect2 = new Rect(rect);
        } else {
            rect2 = null;
        }
        this.f3267D = rect2;
    }

    public void I(int i4) {
        this.f3269F.setInputMethodMode(i4);
    }

    public void J(boolean z3) {
        this.f3268E = z3;
        this.f3269F.setFocusable(z3);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.f3269F.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f3290u = onItemClickListener;
    }

    public void M(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f3291v = onItemSelectedListener;
    }

    public void N(boolean z3) {
        this.f3280k = true;
        this.f3279j = z3;
    }

    public void P(int i4) {
        this.f3286q = i4;
    }

    public void Q(int i4) {
        L l4 = this.f3272c;
        if (b() && l4 != null) {
            l4.setListSelectionHidden(false);
            l4.setSelection(i4);
            if (l4.getChoiceMode() != 0) {
                l4.setItemChecked(i4, true);
            }
        }
    }

    public void R(int i4) {
        this.f3274e = i4;
    }

    public int a() {
        return this.f3275f;
    }

    public boolean b() {
        return this.f3269F.isShowing();
    }

    public void d() {
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        int q4 = q();
        boolean A3 = A();
        androidx.core.widget.i.b(this.f3269F, this.f3277h);
        boolean z4 = true;
        if (!this.f3269F.isShowing()) {
            int i8 = this.f3274e;
            if (i8 == -1) {
                i8 = -1;
            } else if (i8 == -2) {
                i8 = t().getWidth();
            }
            int i9 = this.f3273d;
            if (i9 == -1) {
                q4 = -1;
            } else if (i9 != -2) {
                q4 = i9;
            }
            this.f3269F.setWidth(i8);
            this.f3269F.setHeight(q4);
            O(true);
            PopupWindow popupWindow = this.f3269F;
            if (this.f3283n || this.f3282m) {
                z3 = false;
            } else {
                z3 = true;
            }
            popupWindow.setOutsideTouchable(z3);
            this.f3269F.setTouchInterceptor(this.f3293x);
            if (this.f3280k) {
                androidx.core.widget.i.a(this.f3269F, this.f3279j);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = f3263I;
                if (method != null) {
                    try {
                        method.invoke(this.f3269F, new Object[]{this.f3267D});
                    } catch (Exception e4) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e4);
                    }
                }
            } else {
                d.a(this.f3269F, this.f3267D);
            }
            androidx.core.widget.i.c(this.f3269F, t(), this.f3275f, this.f3276g, this.f3281l);
            this.f3272c.setSelection(-1);
            if (!this.f3268E || this.f3272c.isInTouchMode()) {
                r();
            }
            if (!this.f3268E) {
                this.f3265B.post(this.f3295z);
            }
        } else if (androidx.core.view.P.R(t())) {
            int i10 = this.f3274e;
            if (i10 == -1) {
                i10 = -1;
            } else if (i10 == -2) {
                i10 = t().getWidth();
            }
            int i11 = this.f3273d;
            if (i11 == -1) {
                if (!A3) {
                    q4 = -1;
                }
                if (A3) {
                    PopupWindow popupWindow2 = this.f3269F;
                    if (this.f3274e == -1) {
                        i7 = -1;
                    } else {
                        i7 = 0;
                    }
                    popupWindow2.setWidth(i7);
                    this.f3269F.setHeight(0);
                } else {
                    PopupWindow popupWindow3 = this.f3269F;
                    if (this.f3274e == -1) {
                        i6 = -1;
                    } else {
                        i6 = 0;
                    }
                    popupWindow3.setWidth(i6);
                    this.f3269F.setHeight(-1);
                }
            } else if (i11 != -2) {
                q4 = i11;
            }
            PopupWindow popupWindow4 = this.f3269F;
            if (this.f3283n || this.f3282m) {
                z4 = false;
            }
            popupWindow4.setOutsideTouchable(z4);
            PopupWindow popupWindow5 = this.f3269F;
            View t4 = t();
            int i12 = this.f3275f;
            int i13 = this.f3276g;
            if (i10 < 0) {
                i4 = -1;
            } else {
                i4 = i10;
            }
            if (q4 < 0) {
                i5 = -1;
            } else {
                i5 = q4;
            }
            popupWindow5.update(t4, i12, i13, i4, i5);
        }
    }

    public void dismiss() {
        this.f3269F.dismiss();
        C();
        this.f3269F.setContentView((View) null);
        this.f3272c = null;
        this.f3265B.removeCallbacks(this.f3292w);
    }

    public Drawable f() {
        return this.f3269F.getBackground();
    }

    public ListView g() {
        return this.f3272c;
    }

    public void i(Drawable drawable) {
        this.f3269F.setBackgroundDrawable(drawable);
    }

    public void j(int i4) {
        this.f3276g = i4;
        this.f3278i = true;
    }

    public void l(int i4) {
        this.f3275f = i4;
    }

    public int n() {
        if (!this.f3278i) {
            return 0;
        }
        return this.f3276g;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f3287r;
        if (dataSetObserver == null) {
            this.f3287r = new f();
        } else {
            ListAdapter listAdapter2 = this.f3271b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f3271b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f3287r);
        }
        L l4 = this.f3272c;
        if (l4 != null) {
            l4.setAdapter(this.f3271b);
        }
    }

    public void r() {
        L l4 = this.f3272c;
        if (l4 != null) {
            l4.setListSelectionHidden(true);
            l4.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public L s(Context context, boolean z3) {
        return new L(context, z3);
    }

    public View t() {
        return this.f3288s;
    }

    public Object v() {
        if (!b()) {
            return null;
        }
        return this.f3272c.getSelectedItem();
    }

    public long w() {
        if (!b()) {
            return Long.MIN_VALUE;
        }
        return this.f3272c.getSelectedItemId();
    }

    public int x() {
        if (!b()) {
            return -1;
        }
        return this.f3272c.getSelectedItemPosition();
    }

    public View y() {
        if (!b()) {
            return null;
        }
        return this.f3272c.getSelectedView();
    }

    public int z() {
        return this.f3274e;
    }

    public P(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public P(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.f3273d = -2;
        this.f3274e = -2;
        this.f3277h = 1002;
        this.f3281l = 0;
        this.f3282m = false;
        this.f3283n = false;
        this.f3284o = Integer.MAX_VALUE;
        this.f3286q = 0;
        this.f3292w = new i();
        this.f3293x = new h();
        this.f3294y = new g();
        this.f3295z = new e();
        this.f3266C = new Rect();
        this.f3270a = context;
        this.f3265B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f15000l1, i4, i5);
        this.f3275f = obtainStyledAttributes.getDimensionPixelOffset(j.f15005m1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(j.f15010n1, 0);
        this.f3276g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f3278i = true;
        }
        obtainStyledAttributes.recycle();
        C0395t tVar = new C0395t(context, attributeSet, i4, i5);
        this.f3269F = tVar;
        tVar.setInputMethodMode(1);
    }
}
