package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.p;

public abstract class N implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final float f3235a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3236b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3237c;

    /* renamed from: d  reason: collision with root package name */
    final View f3238d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f3239e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f3240f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3241g;

    /* renamed from: h  reason: collision with root package name */
    private int f3242h;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f3243i = new int[2];

    private class a implements Runnable {
        a() {
        }

        public void run() {
            ViewParent parent = N.this.f3238d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        public void run() {
            N.this.e();
        }
    }

    public N(View view) {
        this.f3238d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3235a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f3236b = tapTimeout;
        this.f3237c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f3240f;
        if (runnable != null) {
            this.f3238d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f3239e;
        if (runnable2 != null) {
            this.f3238d.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        L l4;
        boolean z3;
        View view = this.f3238d;
        p b4 = b();
        if (b4 == null || !b4.b() || (l4 = (L) b4.g()) == null || !l4.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, obtainNoHistory);
        j(l4, obtainNoHistory);
        boolean e4 = l4.e(obtainNoHistory, this.f3242h);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!e4 || !z3) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f3238d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f3242h
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f3235a
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.a()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f3242h = r6
            java.lang.Runnable r6 = r5.f3239e
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.N$a r6 = new androidx.appcompat.widget.N$a
            r6.<init>()
            r5.f3239e = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f3239e
            int r1 = r5.f3236b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f3240f
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.N$b r6 = new androidx.appcompat.widget.N$b
            r6.<init>()
            r5.f3240f = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f3240f
            int r1 = r5.f3237c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.N.g(android.view.MotionEvent):boolean");
    }

    private static boolean h(View view, float f4, float f5, float f6) {
        float f7 = -f6;
        if (f4 < f7 || f5 < f7 || f4 >= ((float) (view.getRight() - view.getLeft())) + f6 || f5 >= ((float) (view.getBottom() - view.getTop())) + f6) {
            return false;
        }
        return true;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f3243i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f3243i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    public abstract p b();

    /* access modifiers changed from: protected */
    public abstract boolean c();

    /* access modifiers changed from: protected */
    public boolean d() {
        p b4 = b();
        if (b4 == null || !b4.b()) {
            return true;
        }
        b4.dismiss();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        a();
        View view = this.f3238d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f3241g = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z3;
        boolean z4 = this.f3241g;
        if (!z4) {
            if (!g(motionEvent) || !c()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f3238d.onTouchEvent(obtain);
                obtain.recycle();
            }
        } else if (f(motionEvent) || !d()) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f3241g = z3;
        if (z3 || z4) {
            return true;
        }
        return false;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f3241g = false;
        this.f3242h = -1;
        Runnable runnable = this.f3239e;
        if (runnable != null) {
            this.f3238d.removeCallbacks(runnable);
        }
    }
}
