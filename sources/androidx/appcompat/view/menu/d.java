package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Q;
import androidx.appcompat.widget.S;
import androidx.core.view.C0434o;
import androidx.core.view.P;
import java.util.ArrayList;
import java.util.List;
import n.g;

final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: B  reason: collision with root package name */
    private static final int f2874B = g.f14807e;

    /* renamed from: A  reason: collision with root package name */
    boolean f2875A;

    /* renamed from: b  reason: collision with root package name */
    private final Context f2876b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2877c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2878d;

    /* renamed from: e  reason: collision with root package name */
    private final int f2879e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f2880f;

    /* renamed from: g  reason: collision with root package name */
    final Handler f2881g;

    /* renamed from: h  reason: collision with root package name */
    private final List f2882h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    final List f2883i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f2884j = new a();

    /* renamed from: k  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f2885k = new b();

    /* renamed from: l  reason: collision with root package name */
    private final Q f2886l = new c();

    /* renamed from: m  reason: collision with root package name */
    private int f2887m = 0;

    /* renamed from: n  reason: collision with root package name */
    private int f2888n = 0;

    /* renamed from: o  reason: collision with root package name */
    private View f2889o;

    /* renamed from: p  reason: collision with root package name */
    View f2890p;

    /* renamed from: q  reason: collision with root package name */
    private int f2891q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f2892r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f2893s;

    /* renamed from: t  reason: collision with root package name */
    private int f2894t;

    /* renamed from: u  reason: collision with root package name */
    private int f2895u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f2896v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f2897w;

    /* renamed from: x  reason: collision with root package name */
    private m.a f2898x;

    /* renamed from: y  reason: collision with root package name */
    ViewTreeObserver f2899y;

    /* renamed from: z  reason: collision with root package name */
    private PopupWindow.OnDismissListener f2900z;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (d.this.b() && d.this.f2883i.size() > 0 && !((C0053d) d.this.f2883i.get(0)).f2908a.B()) {
                View view = d.this.f2890p;
                if (view == null || !view.isShown()) {
                    d.this.dismiss();
                    return;
                }
                for (C0053d dVar : d.this.f2883i) {
                    dVar.f2908a.d();
                }
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = d.this.f2899y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.f2899y = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.f2899y.removeGlobalOnLayoutListener(dVar.f2884j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements Q {

        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0053d f2904a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ MenuItem f2905b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ g f2906c;

            a(C0053d dVar, MenuItem menuItem, g gVar) {
                this.f2904a = dVar;
                this.f2905b = menuItem;
                this.f2906c = gVar;
            }

            public void run() {
                C0053d dVar = this.f2904a;
                if (dVar != null) {
                    d.this.f2875A = true;
                    dVar.f2909b.e(false);
                    d.this.f2875A = false;
                }
                if (this.f2905b.isEnabled() && this.f2905b.hasSubMenu()) {
                    this.f2906c.L(this.f2905b, 4);
                }
            }
        }

        c() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: androidx.appcompat.view.menu.d$d} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(androidx.appcompat.view.menu.g r6, android.view.MenuItem r7) {
            /*
                r5 = this;
                androidx.appcompat.view.menu.d r0 = androidx.appcompat.view.menu.d.this
                android.os.Handler r0 = r0.f2881g
                r1 = 0
                r0.removeCallbacksAndMessages(r1)
                androidx.appcompat.view.menu.d r0 = androidx.appcompat.view.menu.d.this
                java.util.List r0 = r0.f2883i
                int r0 = r0.size()
                r2 = 0
            L_0x0011:
                r3 = -1
                if (r2 >= r0) goto L_0x0026
                androidx.appcompat.view.menu.d r4 = androidx.appcompat.view.menu.d.this
                java.util.List r4 = r4.f2883i
                java.lang.Object r4 = r4.get(r2)
                androidx.appcompat.view.menu.d$d r4 = (androidx.appcompat.view.menu.d.C0053d) r4
                androidx.appcompat.view.menu.g r4 = r4.f2909b
                if (r6 != r4) goto L_0x0023
                goto L_0x0027
            L_0x0023:
                int r2 = r2 + 1
                goto L_0x0011
            L_0x0026:
                r2 = r3
            L_0x0027:
                if (r2 != r3) goto L_0x002a
                return
            L_0x002a:
                int r2 = r2 + 1
                androidx.appcompat.view.menu.d r0 = androidx.appcompat.view.menu.d.this
                java.util.List r0 = r0.f2883i
                int r0 = r0.size()
                if (r2 >= r0) goto L_0x0041
                androidx.appcompat.view.menu.d r0 = androidx.appcompat.view.menu.d.this
                java.util.List r0 = r0.f2883i
                java.lang.Object r0 = r0.get(r2)
                r1 = r0
                androidx.appcompat.view.menu.d$d r1 = (androidx.appcompat.view.menu.d.C0053d) r1
            L_0x0041:
                androidx.appcompat.view.menu.d$c$a r0 = new androidx.appcompat.view.menu.d$c$a
                r0.<init>(r1, r7, r6)
                long r1 = android.os.SystemClock.uptimeMillis()
                r3 = 200(0xc8, double:9.9E-322)
                long r1 = r1 + r3
                androidx.appcompat.view.menu.d r7 = androidx.appcompat.view.menu.d.this
                android.os.Handler r7 = r7.f2881g
                r7.postAtTime(r0, r6, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.d.c.c(androidx.appcompat.view.menu.g, android.view.MenuItem):void");
        }

        public void e(g gVar, MenuItem menuItem) {
            d.this.f2881g.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d  reason: collision with other inner class name */
    private static class C0053d {

        /* renamed from: a  reason: collision with root package name */
        public final S f2908a;

        /* renamed from: b  reason: collision with root package name */
        public final g f2909b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2910c;

        public C0053d(S s4, g gVar, int i4) {
            this.f2908a = s4;
            this.f2909b = gVar;
            this.f2910c = i4;
        }

        public ListView a() {
            return this.f2908a.g();
        }
    }

    public d(Context context, View view, int i4, int i5, boolean z3) {
        this.f2876b = context;
        this.f2889o = view;
        this.f2878d = i4;
        this.f2879e = i5;
        this.f2880f = z3;
        this.f2896v = false;
        this.f2891q = D();
        Resources resources = context.getResources();
        this.f2877c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(n.d.f14704b));
        this.f2881g = new Handler();
    }

    private int A(g gVar) {
        int size = this.f2883i.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (gVar == ((C0053d) this.f2883i.get(i4)).f2909b) {
                return i4;
            }
        }
        return -1;
    }

    private MenuItem B(g gVar, g gVar2) {
        int size = gVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = gVar.getItem(i4);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(C0053d dVar, g gVar) {
        int i4;
        f fVar;
        int firstVisiblePosition;
        MenuItem B3 = B(dVar.f2909b, gVar);
        if (B3 == null) {
            return null;
        }
        ListView a4 = dVar.a();
        ListAdapter adapter = a4.getAdapter();
        int i5 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i4 = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            i4 = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i5 >= count) {
                i5 = -1;
                break;
            } else if (B3 == fVar.getItem(i5)) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 != -1 && (firstVisiblePosition = (i5 + i4) - a4.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a4.getChildCount()) {
            return a4.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        if (P.B(this.f2889o) == 1) {
            return 0;
        }
        return 1;
    }

    private int E(int i4) {
        List list = this.f2883i;
        ListView a4 = ((C0053d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        a4.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f2890p.getWindowVisibleDisplayFrame(rect);
        if (this.f2891q == 1) {
            if (iArr[0] + a4.getWidth() + i4 > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i4 < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    private void F(g gVar) {
        View view;
        C0053d dVar;
        boolean z3;
        int i4;
        int i5;
        int i6;
        LayoutInflater from = LayoutInflater.from(this.f2876b);
        f fVar = new f(gVar, from, this.f2880f, f2874B);
        if (!b() && this.f2896v) {
            fVar.d(true);
        } else if (b()) {
            fVar.d(k.x(gVar));
        }
        int o4 = k.o(fVar, (ViewGroup) null, this.f2876b, this.f2877c);
        S z4 = z();
        z4.p(fVar);
        z4.F(o4);
        z4.G(this.f2888n);
        if (this.f2883i.size() > 0) {
            List list = this.f2883i;
            dVar = (C0053d) list.get(list.size() - 1);
            view = C(dVar, gVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            z4.V(false);
            z4.S((Object) null);
            int E3 = E(o4);
            if (E3 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f2891q = E3;
            if (Build.VERSION.SDK_INT >= 26) {
                z4.D(view);
                i5 = 0;
                i4 = 0;
            } else {
                int[] iArr = new int[2];
                this.f2889o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f2888n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f2889o.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i4 = iArr2[0] - iArr[0];
                i5 = iArr2[1] - iArr[1];
            }
            if ((this.f2888n & 5) != 5) {
                if (z3) {
                    o4 = view.getWidth();
                }
                i6 = i4 - o4;
                z4.l(i6);
                z4.N(true);
                z4.j(i5);
            } else if (!z3) {
                o4 = view.getWidth();
                i6 = i4 - o4;
                z4.l(i6);
                z4.N(true);
                z4.j(i5);
            }
            i6 = i4 + o4;
            z4.l(i6);
            z4.N(true);
            z4.j(i5);
        } else {
            if (this.f2892r) {
                z4.l(this.f2894t);
            }
            if (this.f2893s) {
                z4.j(this.f2895u);
            }
            z4.H(n());
        }
        this.f2883i.add(new C0053d(z4, gVar, this.f2891q));
        z4.d();
        ListView g4 = z4.g();
        g4.setOnKeyListener(this);
        if (dVar == null && this.f2897w && gVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(g.f14814l, g4, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(gVar.x());
            g4.addHeaderView(frameLayout, (Object) null, false);
            z4.d();
        }
    }

    private S z() {
        S s4 = new S(this.f2876b, (AttributeSet) null, this.f2878d, this.f2879e);
        s4.U(this.f2886l);
        s4.L(this);
        s4.K(this);
        s4.D(this.f2889o);
        s4.G(this.f2888n);
        s4.J(true);
        s4.I(2);
        return s4;
    }

    public void a(g gVar, boolean z3) {
        int A3 = A(gVar);
        if (A3 >= 0) {
            int i4 = A3 + 1;
            if (i4 < this.f2883i.size()) {
                ((C0053d) this.f2883i.get(i4)).f2909b.e(false);
            }
            C0053d dVar = (C0053d) this.f2883i.remove(A3);
            dVar.f2909b.O(this);
            if (this.f2875A) {
                dVar.f2908a.T((Object) null);
                dVar.f2908a.E(0);
            }
            dVar.f2908a.dismiss();
            int size = this.f2883i.size();
            if (size > 0) {
                this.f2891q = ((C0053d) this.f2883i.get(size - 1)).f2910c;
            } else {
                this.f2891q = D();
            }
            if (size == 0) {
                dismiss();
                m.a aVar = this.f2898x;
                if (aVar != null) {
                    aVar.a(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f2899y;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f2899y.removeGlobalOnLayoutListener(this.f2884j);
                    }
                    this.f2899y = null;
                }
                this.f2890p.removeOnAttachStateChangeListener(this.f2885k);
                this.f2900z.onDismiss();
            } else if (z3) {
                ((C0053d) this.f2883i.get(0)).f2909b.e(false);
            }
        }
    }

    public boolean b() {
        if (this.f2883i.size() <= 0 || !((C0053d) this.f2883i.get(0)).f2908a.b()) {
            return false;
        }
        return true;
    }

    public void d() {
        boolean z3;
        if (!b()) {
            for (g F3 : this.f2882h) {
                F(F3);
            }
            this.f2882h.clear();
            View view = this.f2889o;
            this.f2890p = view;
            if (view != null) {
                if (this.f2899y == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f2899y = viewTreeObserver;
                if (z3) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f2884j);
                }
                this.f2890p.addOnAttachStateChangeListener(this.f2885k);
            }
        }
    }

    public void dismiss() {
        int size = this.f2883i.size();
        if (size > 0) {
            C0053d[] dVarArr = (C0053d[]) this.f2883i.toArray(new C0053d[size]);
            for (int i4 = size - 1; i4 >= 0; i4--) {
                C0053d dVar = dVarArr[i4];
                if (dVar.f2908a.b()) {
                    dVar.f2908a.dismiss();
                }
            }
        }
    }

    public boolean e(r rVar) {
        for (C0053d dVar : this.f2883i) {
            if (rVar == dVar.f2909b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        l(rVar);
        m.a aVar = this.f2898x;
        if (aVar != null) {
            aVar.b(rVar);
        }
        return true;
    }

    public void f(boolean z3) {
        for (C0053d a4 : this.f2883i) {
            k.y(a4.a().getAdapter()).notifyDataSetChanged();
        }
    }

    public ListView g() {
        if (this.f2883i.isEmpty()) {
            return null;
        }
        List list = this.f2883i;
        return ((C0053d) list.get(list.size() - 1)).a();
    }

    public boolean h() {
        return false;
    }

    public void k(m.a aVar) {
        this.f2898x = aVar;
    }

    public void l(g gVar) {
        gVar.c(this, this.f2876b);
        if (b()) {
            F(gVar);
        } else {
            this.f2882h.add(gVar);
        }
    }

    /* access modifiers changed from: protected */
    public boolean m() {
        return false;
    }

    public void onDismiss() {
        C0053d dVar;
        int size = this.f2883i.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                dVar = null;
                break;
            }
            dVar = (C0053d) this.f2883i.get(i4);
            if (!dVar.f2908a.b()) {
                break;
            }
            i4++;
        }
        if (dVar != null) {
            dVar.f2909b.e(false);
        }
    }

    public boolean onKey(View view, int i4, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i4 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void p(View view) {
        if (this.f2889o != view) {
            this.f2889o = view;
            this.f2888n = C0434o.b(this.f2887m, P.B(view));
        }
    }

    public void r(boolean z3) {
        this.f2896v = z3;
    }

    public void s(int i4) {
        if (this.f2887m != i4) {
            this.f2887m = i4;
            this.f2888n = C0434o.b(i4, P.B(this.f2889o));
        }
    }

    public void t(int i4) {
        this.f2892r = true;
        this.f2894t = i4;
    }

    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f2900z = onDismissListener;
    }

    public void v(boolean z3) {
        this.f2897w = z3;
    }

    public void w(int i4) {
        this.f2893s = true;
        this.f2895u = i4;
    }
}
