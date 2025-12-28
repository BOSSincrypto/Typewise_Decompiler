package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.m;
import androidx.core.view.C0434o;
import androidx.core.view.P;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3003a;

    /* renamed from: b  reason: collision with root package name */
    private final g f3004b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3005c;

    /* renamed from: d  reason: collision with root package name */
    private final int f3006d;

    /* renamed from: e  reason: collision with root package name */
    private final int f3007e;

    /* renamed from: f  reason: collision with root package name */
    private View f3008f;

    /* renamed from: g  reason: collision with root package name */
    private int f3009g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3010h;

    /* renamed from: i  reason: collision with root package name */
    private m.a f3011i;

    /* renamed from: j  reason: collision with root package name */
    private k f3012j;

    /* renamed from: k  reason: collision with root package name */
    private PopupWindow.OnDismissListener f3013k;

    /* renamed from: l  reason: collision with root package name */
    private final PopupWindow.OnDismissListener f3014l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        public void onDismiss() {
            l.this.e();
        }
    }

    static class b {
        static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public l(Context context, g gVar, View view, boolean z3, int i4) {
        this(context, gVar, view, z3, i4, 0);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [androidx.appcompat.view.menu.m, androidx.appcompat.view.menu.k] */
    /* JADX WARNING: type inference failed for: r8v1, types: [androidx.appcompat.view.menu.q] */
    /* JADX WARNING: type inference failed for: r2v2, types: [androidx.appcompat.view.menu.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.appcompat.view.menu.k a() {
        /*
            r15 = this;
            android.content.Context r0 = r15.f3003a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            androidx.appcompat.view.menu.l.b.a(r0, r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r15.f3003a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = n.d.f14703a
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x003d
            androidx.appcompat.view.menu.d r0 = new androidx.appcompat.view.menu.d
            android.content.Context r3 = r15.f3003a
            android.view.View r4 = r15.f3008f
            int r5 = r15.f3006d
            int r6 = r15.f3007e
            boolean r7 = r15.f3005c
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x004f
        L_0x003d:
            androidx.appcompat.view.menu.q r0 = new androidx.appcompat.view.menu.q
            android.content.Context r9 = r15.f3003a
            androidx.appcompat.view.menu.g r10 = r15.f3004b
            android.view.View r11 = r15.f3008f
            int r12 = r15.f3006d
            int r13 = r15.f3007e
            boolean r14 = r15.f3005c
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14)
        L_0x004f:
            androidx.appcompat.view.menu.g r1 = r15.f3004b
            r0.l(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r15.f3014l
            r0.u(r1)
            android.view.View r1 = r15.f3008f
            r0.p(r1)
            androidx.appcompat.view.menu.m$a r1 = r15.f3011i
            r0.k(r1)
            boolean r1 = r15.f3010h
            r0.r(r1)
            int r1 = r15.f3009g
            r0.s(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.l.a():androidx.appcompat.view.menu.k");
    }

    private void l(int i4, int i5, boolean z3, boolean z4) {
        k c4 = c();
        c4.v(z4);
        if (z3) {
            if ((C0434o.b(this.f3009g, P.B(this.f3008f)) & 7) == 5) {
                i4 -= this.f3008f.getWidth();
            }
            c4.t(i4);
            c4.w(i5);
            int i6 = (int) ((this.f3003a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c4.q(new Rect(i4 - i6, i5 - i6, i4 + i6, i5 + i6));
        }
        c4.d();
    }

    public void b() {
        if (d()) {
            this.f3012j.dismiss();
        }
    }

    public k c() {
        if (this.f3012j == null) {
            this.f3012j = a();
        }
        return this.f3012j;
    }

    public boolean d() {
        k kVar = this.f3012j;
        if (kVar == null || !kVar.b()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void e() {
        this.f3012j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f3013k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f3008f = view;
    }

    public void g(boolean z3) {
        this.f3010h = z3;
        k kVar = this.f3012j;
        if (kVar != null) {
            kVar.r(z3);
        }
    }

    public void h(int i4) {
        this.f3009g = i4;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f3013k = onDismissListener;
    }

    public void j(m.a aVar) {
        this.f3011i = aVar;
        k kVar = this.f3012j;
        if (kVar != null) {
            kVar.k(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f3008f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i4, int i5) {
        if (d()) {
            return true;
        }
        if (this.f3008f == null) {
            return false;
        }
        l(i4, i5, true, true);
        return true;
    }

    public l(Context context, g gVar, View view, boolean z3, int i4, int i5) {
        this.f3009g = 8388611;
        this.f3014l = new a();
        this.f3003a = context;
        this.f3004b = gVar;
        this.f3008f = view;
        this.f3005c = z3;
        this.f3006d = i4;
        this.f3007e = i5;
    }
}
