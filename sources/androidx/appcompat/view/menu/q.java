package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.S;
import androidx.core.view.P;
import n.d;
import n.g;

final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {

    /* renamed from: v  reason: collision with root package name */
    private static final int f3017v = g.f14815m;

    /* renamed from: b  reason: collision with root package name */
    private final Context f3018b;

    /* renamed from: c  reason: collision with root package name */
    private final g f3019c;

    /* renamed from: d  reason: collision with root package name */
    private final f f3020d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f3021e;

    /* renamed from: f  reason: collision with root package name */
    private final int f3022f;

    /* renamed from: g  reason: collision with root package name */
    private final int f3023g;

    /* renamed from: h  reason: collision with root package name */
    private final int f3024h;

    /* renamed from: i  reason: collision with root package name */
    final S f3025i;

    /* renamed from: j  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f3026j = new a();

    /* renamed from: k  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f3027k = new b();

    /* renamed from: l  reason: collision with root package name */
    private PopupWindow.OnDismissListener f3028l;

    /* renamed from: m  reason: collision with root package name */
    private View f3029m;

    /* renamed from: n  reason: collision with root package name */
    View f3030n;

    /* renamed from: o  reason: collision with root package name */
    private m.a f3031o;

    /* renamed from: p  reason: collision with root package name */
    ViewTreeObserver f3032p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f3033q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f3034r;

    /* renamed from: s  reason: collision with root package name */
    private int f3035s;

    /* renamed from: t  reason: collision with root package name */
    private int f3036t = 0;

    /* renamed from: u  reason: collision with root package name */
    private boolean f3037u;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (q.this.b() && !q.this.f3025i.B()) {
                View view = q.this.f3030n;
                if (view == null || !view.isShown()) {
                    q.this.dismiss();
                } else {
                    q.this.f3025i.d();
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
            ViewTreeObserver viewTreeObserver = q.this.f3032p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.f3032p = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.f3032p.removeGlobalOnLayoutListener(qVar.f3026j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i4, int i5, boolean z3) {
        this.f3018b = context;
        this.f3019c = gVar;
        this.f3021e = z3;
        this.f3020d = new f(gVar, LayoutInflater.from(context), z3, f3017v);
        this.f3023g = i4;
        this.f3024h = i5;
        Resources resources = context.getResources();
        this.f3022f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(d.f14704b));
        this.f3029m = view;
        this.f3025i = new S(context, (AttributeSet) null, i4, i5);
        gVar.c(this, context);
    }

    private boolean z() {
        View view;
        boolean z3;
        if (b()) {
            return true;
        }
        if (this.f3033q || (view = this.f3029m) == null) {
            return false;
        }
        this.f3030n = view;
        this.f3025i.K(this);
        this.f3025i.L(this);
        this.f3025i.J(true);
        View view2 = this.f3030n;
        if (this.f3032p == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f3032p = viewTreeObserver;
        if (z3) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f3026j);
        }
        view2.addOnAttachStateChangeListener(this.f3027k);
        this.f3025i.D(view2);
        this.f3025i.G(this.f3036t);
        if (!this.f3034r) {
            this.f3035s = k.o(this.f3020d, (ViewGroup) null, this.f3018b, this.f3022f);
            this.f3034r = true;
        }
        this.f3025i.F(this.f3035s);
        this.f3025i.I(2);
        this.f3025i.H(n());
        this.f3025i.d();
        ListView g4 = this.f3025i.g();
        g4.setOnKeyListener(this);
        if (this.f3037u && this.f3019c.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f3018b).inflate(g.f14814l, g4, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f3019c.x());
            }
            frameLayout.setEnabled(false);
            g4.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f3025i.p(this.f3020d);
        this.f3025i.d();
        return true;
    }

    public void a(g gVar, boolean z3) {
        if (gVar == this.f3019c) {
            dismiss();
            m.a aVar = this.f3031o;
            if (aVar != null) {
                aVar.a(gVar, z3);
            }
        }
    }

    public boolean b() {
        if (this.f3033q || !this.f3025i.b()) {
            return false;
        }
        return true;
    }

    public void d() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public void dismiss() {
        if (b()) {
            this.f3025i.dismiss();
        }
    }

    public boolean e(r rVar) {
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.f3018b, rVar, this.f3030n, this.f3021e, this.f3023g, this.f3024h);
            lVar.j(this.f3031o);
            lVar.g(k.x(rVar));
            lVar.i(this.f3028l);
            this.f3028l = null;
            this.f3019c.e(false);
            int a4 = this.f3025i.a();
            int n4 = this.f3025i.n();
            if ((Gravity.getAbsoluteGravity(this.f3036t, P.B(this.f3029m)) & 7) == 5) {
                a4 += this.f3029m.getWidth();
            }
            if (lVar.n(a4, n4)) {
                m.a aVar = this.f3031o;
                if (aVar == null) {
                    return true;
                }
                aVar.b(rVar);
                return true;
            }
        }
        return false;
    }

    public void f(boolean z3) {
        this.f3034r = false;
        f fVar = this.f3020d;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    public ListView g() {
        return this.f3025i.g();
    }

    public boolean h() {
        return false;
    }

    public void k(m.a aVar) {
        this.f3031o = aVar;
    }

    public void l(g gVar) {
    }

    public void onDismiss() {
        this.f3033q = true;
        this.f3019c.close();
        ViewTreeObserver viewTreeObserver = this.f3032p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f3032p = this.f3030n.getViewTreeObserver();
            }
            this.f3032p.removeGlobalOnLayoutListener(this.f3026j);
            this.f3032p = null;
        }
        this.f3030n.removeOnAttachStateChangeListener(this.f3027k);
        PopupWindow.OnDismissListener onDismissListener = this.f3028l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f3029m = view;
    }

    public void r(boolean z3) {
        this.f3020d.d(z3);
    }

    public void s(int i4) {
        this.f3036t = i4;
    }

    public void t(int i4) {
        this.f3025i.l(i4);
    }

    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f3028l = onDismissListener;
    }

    public void v(boolean z3) {
        this.f3037u = z3;
    }

    public void w(int i4) {
        this.f3025i.j(i4);
    }
}
