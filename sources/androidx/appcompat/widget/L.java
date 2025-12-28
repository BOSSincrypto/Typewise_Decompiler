package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.W;
import androidx.core.widget.g;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import n.C0822a;
import p.C0846c;

class L extends ListView {

    /* renamed from: a  reason: collision with root package name */
    private final Rect f3215a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    private int f3216b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f3217c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f3218d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f3219e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f3220f;

    /* renamed from: g  reason: collision with root package name */
    private d f3221g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3222h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3223i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3224j;

    /* renamed from: k  reason: collision with root package name */
    private W f3225k;

    /* renamed from: l  reason: collision with root package name */
    private g f3226l;

    /* renamed from: m  reason: collision with root package name */
    f f3227m;

    static class a {
        static void a(View view, float f4, float f5) {
            view.drawableHotspotChanged(f4, f5);
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        private static Method f3228a;

        /* renamed from: b  reason: collision with root package name */
        private static Method f3229b;

        /* renamed from: c  reason: collision with root package name */
        private static Method f3230c;

        /* renamed from: d  reason: collision with root package name */
        private static boolean f3231d = true;

        static {
            Class<AdapterView> cls = AdapterView.class;
            Class<AbsListView> cls2 = AbsListView.class;
            try {
                Class cls3 = Integer.TYPE;
                Class cls4 = Float.TYPE;
                Method declaredMethod = cls2.getDeclaredMethod("positionSelector", new Class[]{cls3, View.class, Boolean.TYPE, cls4, cls4});
                f3228a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = cls.getDeclaredMethod("setSelectedPositionInt", new Class[]{cls3});
                f3229b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = cls.getDeclaredMethod("setNextSelectedPositionInt", new Class[]{cls3});
                f3230c = declaredMethod3;
                declaredMethod3.setAccessible(true);
            } catch (NoSuchMethodException e4) {
                e4.printStackTrace();
            }
        }

        static boolean a() {
            return f3231d;
        }

        static void b(L l4, int i4, View view) {
            try {
                f3228a.invoke(l4, new Object[]{Integer.valueOf(i4), view, Boolean.FALSE, -1, -1});
                f3229b.invoke(l4, new Object[]{Integer.valueOf(i4)});
                f3230c.invoke(l4, new Object[]{Integer.valueOf(i4)});
            } catch (IllegalAccessException e4) {
                e4.printStackTrace();
            } catch (InvocationTargetException e5) {
                e5.printStackTrace();
            }
        }
    }

    static class c {
        static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        static void b(AbsListView absListView, boolean z3) {
            absListView.setSelectedChildViewEnabled(z3);
        }
    }

    private static class d extends C0846c {

        /* renamed from: b  reason: collision with root package name */
        private boolean f3232b = true;

        d(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z3) {
            this.f3232b = z3;
        }

        public void draw(Canvas canvas) {
            if (this.f3232b) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f4, float f5) {
            if (this.f3232b) {
                super.setHotspot(f4, f5);
            }
        }

        public void setHotspotBounds(int i4, int i5, int i6, int i7) {
            if (this.f3232b) {
                super.setHotspotBounds(i4, i5, i6, i7);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f3232b) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z3, boolean z4) {
            if (this.f3232b) {
                return super.setVisible(z3, z4);
            }
            return false;
        }
    }

    static class e {

        /* renamed from: a  reason: collision with root package name */
        private static final Field f3233a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                e4.printStackTrace();
            }
            f3233a = field;
        }

        static boolean a(AbsListView absListView) {
            Field field = f3233a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e4) {
                e4.printStackTrace();
                return false;
            }
        }

        static void b(AbsListView absListView, boolean z3) {
            Field field = f3233a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z3));
                } catch (IllegalAccessException e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    private class f implements Runnable {
        f() {
        }

        public void a() {
            L l4 = L.this;
            l4.f3227m = null;
            l4.removeCallbacks(this);
        }

        public void b() {
            L.this.post(this);
        }

        public void run() {
            L l4 = L.this;
            l4.f3227m = null;
            l4.drawableStateChanged();
        }
    }

    L(Context context, boolean z3) {
        super(context, (AttributeSet) null, C0822a.f14691x);
        this.f3223i = z3;
        setCacheColorHint(0);
    }

    private void a() {
        this.f3224j = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f3220f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        W w3 = this.f3225k;
        if (w3 != null) {
            w3.c();
            this.f3225k = null;
        }
    }

    private void b(View view, int i4) {
        performItemClick(view, i4, getItemIdAtPosition(i4));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (!this.f3215a.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f3215a);
            selector.draw(canvas);
        }
    }

    private void f(int i4, View view) {
        Rect rect = this.f3215a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f3216b;
        rect.top -= this.f3217c;
        rect.right += this.f3218d;
        rect.bottom += this.f3219e;
        boolean k4 = k();
        if (view.isEnabled() != k4) {
            l(!k4);
            if (i4 != -1) {
                refreshDrawableState();
            }
        }
    }

    private void g(int i4, View view) {
        boolean z3;
        Drawable selector = getSelector();
        boolean z4 = true;
        if (selector == null || i4 == -1) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            selector.setVisible(false, false);
        }
        f(i4, view);
        if (z3) {
            Rect rect = this.f3215a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z4 = false;
            }
            selector.setVisible(z4, false);
            androidx.core.graphics.drawable.a.k(selector, exactCenterX, exactCenterY);
        }
    }

    private void h(int i4, View view, float f4, float f5) {
        g(i4, view);
        Drawable selector = getSelector();
        if (selector != null && i4 != -1) {
            androidx.core.graphics.drawable.a.k(selector, f4, f5);
        }
    }

    private void i(View view, int i4, float f4, float f5) {
        View childAt;
        this.f3224j = true;
        a.a(this, f4, f5);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i5 = this.f3220f;
        if (!(i5 == -1 || (childAt = getChildAt(i5 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f3220f = i4;
        a.a(view, f4 - ((float) view.getLeft()), f5 - ((float) view.getTop()));
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i4, view, f4, f5);
        j(false);
        refreshDrawableState();
    }

    private void j(boolean z3) {
        d dVar = this.f3221g;
        if (dVar != null) {
            dVar.b(z3);
        }
    }

    private boolean k() {
        if (androidx.core.os.a.b()) {
            return c.a(this);
        }
        return e.a(this);
    }

    private void l(boolean z3) {
        if (androidx.core.os.a.b()) {
            c.b(this, z3);
        } else {
            e.b(this, z3);
        }
    }

    private boolean m() {
        return this.f3224j;
    }

    private void n() {
        Drawable selector = getSelector();
        if (selector != null && m() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public int d(int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i10 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        View view = null;
        while (i11 < count) {
            int itemViewType = adapter.getItemViewType(i11);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i11, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            if (i14 > 0) {
                i9 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
            } else {
                i9 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i4, i9);
            view.forceLayout();
            if (i11 > 0) {
                i10 += dividerHeight;
            }
            i10 += view.getMeasuredHeight();
            if (i10 < i7) {
                if (i8 >= 0 && i11 >= i8) {
                    i13 = i10;
                }
                i11++;
            } else if (i8 < 0 || i11 <= i8 || i13 <= 0 || i10 == i7) {
                return i7;
            } else {
                return i13;
            }
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f3227m == null) {
            super.drawableStateChanged();
            j(true);
            n();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r3 = r1
            r9 = r2
            goto L_0x0046
        L_0x0011:
            r9 = r2
            r3 = r9
            goto L_0x0046
        L_0x0014:
            r3 = r1
            goto L_0x0017
        L_0x0016:
            r3 = r2
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = r1
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.i(r3, r5, r4, r9)
            if (r0 != r1) goto L_0x000e
            r7.b(r3, r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            androidx.core.widget.g r9 = r7.f3226l
            if (r9 != 0) goto L_0x005a
            androidx.core.widget.g r9 = new androidx.core.widget.g
            r9.<init>(r7)
            r7.f3226l = r9
        L_0x005a:
            androidx.core.widget.g r9 = r7.f3226l
            r9.m(r1)
            androidx.core.widget.g r9 = r7.f3226l
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            androidx.core.widget.g r8 = r7.f3226l
            if (r8 == 0) goto L_0x006c
            r8.m(r2)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.L.e(android.view.MotionEvent, int):boolean");
    }

    public boolean hasFocus() {
        if (this.f3223i || super.hasFocus()) {
            return true;
        }
        return false;
    }

    public boolean hasWindowFocus() {
        if (this.f3223i || super.hasWindowFocus()) {
            return true;
        }
        return false;
    }

    public boolean isFocused() {
        if (this.f3223i || super.isFocused()) {
            return true;
        }
        return false;
    }

    public boolean isInTouchMode() {
        if ((!this.f3223i || !this.f3222h) && !super.isInTouchMode()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f3227m = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f3227m == null) {
            f fVar = new f();
            this.f3227m = fVar;
            fVar.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i4 < 30 || !b.a()) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        b.b(this, pointToPosition, childAt);
                    }
                }
                n();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f3220f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f3227m;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z3) {
        this.f3222h = z3;
    }

    public void setSelector(Drawable drawable) {
        d dVar;
        if (drawable != null) {
            dVar = new d(drawable);
        } else {
            dVar = null;
        }
        this.f3221g = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f3216b = rect.left;
        this.f3217c = rect.top;
        this.f3218d = rect.right;
        this.f3219e = rect.bottom;
    }
}
