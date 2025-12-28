package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.C0408b;
import java.util.ArrayList;
import n.C0822a;

/* renamed from: androidx.appcompat.widget.c  reason: case insensitive filesystem */
class C0379c extends androidx.appcompat.view.menu.b implements C0408b.a {

    /* renamed from: A  reason: collision with root package name */
    C0055c f3511A;

    /* renamed from: B  reason: collision with root package name */
    private b f3512B;

    /* renamed from: C  reason: collision with root package name */
    final f f3513C = new f();

    /* renamed from: D  reason: collision with root package name */
    int f3514D;

    /* renamed from: k  reason: collision with root package name */
    d f3515k;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f3516l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f3517m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f3518n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f3519o;

    /* renamed from: p  reason: collision with root package name */
    private int f3520p;

    /* renamed from: q  reason: collision with root package name */
    private int f3521q;

    /* renamed from: r  reason: collision with root package name */
    private int f3522r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f3523s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f3524t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f3525u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f3526v;

    /* renamed from: w  reason: collision with root package name */
    private int f3527w;

    /* renamed from: x  reason: collision with root package name */
    private final SparseBooleanArray f3528x = new SparseBooleanArray();

    /* renamed from: y  reason: collision with root package name */
    e f3529y;

    /* renamed from: z  reason: collision with root package name */
    a f3530z;

    /* renamed from: androidx.appcompat.widget.c$a */
    private class a extends l {
        public a(Context context, r rVar, View view) {
            super(context, rVar, view, false, C0822a.f14676i);
            if (!((i) rVar.getItem()).l()) {
                View view2 = C0379c.this.f3515k;
                f(view2 == null ? (View) C0379c.this.f2869i : view2);
            }
            j(C0379c.this.f3513C);
        }

        /* access modifiers changed from: protected */
        public void e() {
            C0379c cVar = C0379c.this;
            cVar.f3530z = null;
            cVar.f3514D = 0;
            super.e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        public p a() {
            a aVar = C0379c.this.f3530z;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    private class C0055c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private e f3533a;

        public C0055c(e eVar) {
            this.f3533a = eVar;
        }

        public void run() {
            if (C0379c.this.f2863c != null) {
                C0379c.this.f2863c.d();
            }
            View view = (View) C0379c.this.f2869i;
            if (!(view == null || view.getWindowToken() == null || !this.f3533a.m())) {
                C0379c.this.f3529y = this.f3533a;
            }
            C0379c.this.f3511A = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    private class d extends r implements ActionMenuView.a {

        /* renamed from: androidx.appcompat.widget.c$d$a */
        class a extends N {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ C0379c f3536j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(View view, C0379c cVar) {
                super(view);
                this.f3536j = cVar;
            }

            public p b() {
                e eVar = C0379c.this.f3529y;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            public boolean c() {
                C0379c.this.K();
                return true;
            }

            public boolean d() {
                C0379c cVar = C0379c.this;
                if (cVar.f3511A != null) {
                    return false;
                }
                cVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, (AttributeSet) null, C0822a.f14675h);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            h0.a(this, getContentDescription());
            setOnTouchListener(new a(this, C0379c.this));
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0379c.this.K();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i4, int i5, int i6, int i7) {
            boolean frame = super.setFrame(i4, i5, i6, i7);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$e */
    private class e extends l {
        public e(Context context, g gVar, View view, boolean z3) {
            super(context, gVar, view, z3, C0822a.f14676i);
            h(8388613);
            j(C0379c.this.f3513C);
        }

        /* access modifiers changed from: protected */
        public void e() {
            if (C0379c.this.f2863c != null) {
                C0379c.this.f2863c.close();
            }
            C0379c.this.f3529y = null;
            super.e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    private class f implements m.a {
        f() {
        }

        public void a(g gVar, boolean z3) {
            if (gVar instanceof r) {
                gVar.D().e(false);
            }
            m.a m4 = C0379c.this.m();
            if (m4 != null) {
                m4.a(gVar, z3);
            }
        }

        public boolean b(g gVar) {
            if (gVar == C0379c.this.f2863c) {
                return false;
            }
            C0379c.this.f3514D = ((r) gVar).getItem().getItemId();
            m.a m4 = C0379c.this.m();
            if (m4 != null) {
                return m4.b(gVar);
            }
            return false;
        }
    }

    public C0379c(Context context) {
        super(context, n.g.f14805c, n.g.f14804b);
    }

    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f2869i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.f3515k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f3517m) {
            return this.f3516l;
        }
        return null;
    }

    public boolean B() {
        n nVar;
        C0055c cVar = this.f3511A;
        if (cVar == null || (nVar = this.f2869i) == null) {
            e eVar = this.f3529y;
            if (eVar == null) {
                return false;
            }
            eVar.b();
            return true;
        }
        ((View) nVar).removeCallbacks(cVar);
        this.f3511A = null;
        return true;
    }

    public boolean C() {
        a aVar = this.f3530z;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        if (this.f3511A != null || E()) {
            return true;
        }
        return false;
    }

    public boolean E() {
        e eVar = this.f3529y;
        if (eVar == null || !eVar.d()) {
            return false;
        }
        return true;
    }

    public void F(Configuration configuration) {
        if (!this.f3523s) {
            this.f3522r = androidx.appcompat.view.a.b(this.f2862b).d();
        }
        g gVar = this.f2863c;
        if (gVar != null) {
            gVar.K(true);
        }
    }

    public void G(boolean z3) {
        this.f3526v = z3;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f2869i = actionMenuView;
        actionMenuView.b(this.f2863c);
    }

    public void I(Drawable drawable) {
        d dVar = this.f3515k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f3517m = true;
        this.f3516l = drawable;
    }

    public void J(boolean z3) {
        this.f3518n = z3;
        this.f3519o = true;
    }

    public boolean K() {
        g gVar;
        if (!this.f3518n || E() || (gVar = this.f2863c) == null || this.f2869i == null || this.f3511A != null || gVar.z().isEmpty()) {
            return false;
        }
        C0055c cVar = new C0055c(new e(this.f2862b, this.f2863c, this.f3515k, true));
        this.f3511A = cVar;
        ((View) this.f2869i).post(cVar);
        return true;
    }

    public void a(g gVar, boolean z3) {
        y();
        super.a(gVar, z3);
    }

    public void c(Context context, g gVar) {
        super.c(context, gVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a b4 = androidx.appcompat.view.a.b(context);
        if (!this.f3519o) {
            this.f3518n = b4.f();
        }
        if (!this.f3525u) {
            this.f3520p = b4.c();
        }
        if (!this.f3523s) {
            this.f3522r = b4.d();
        }
        int i4 = this.f3520p;
        if (this.f3518n) {
            if (this.f3515k == null) {
                d dVar = new d(this.f2861a);
                this.f3515k = dVar;
                if (this.f3517m) {
                    dVar.setImageDrawable(this.f3516l);
                    this.f3516l = null;
                    this.f3517m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f3515k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.f3515k.getMeasuredWidth();
        } else {
            this.f3515k = null;
        }
        this.f3521q = i4;
        this.f3527w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public void d(i iVar, n.a aVar) {
        aVar.e(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f2869i);
        if (this.f3512B == null) {
            this.f3512B = new b();
        }
        actionMenuItemView.setPopupCallback(this.f3512B);
    }

    public boolean e(r rVar) {
        boolean z3 = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        r rVar2 = rVar;
        while (rVar2.e0() != this.f2863c) {
            rVar2 = (r) rVar2.e0();
        }
        View z4 = z(rVar2.getItem());
        if (z4 == null) {
            return false;
        }
        this.f3514D = rVar.getItem().getItemId();
        int size = rVar.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i4);
            if (item.isVisible() && item.getIcon() != null) {
                z3 = true;
                break;
            }
            i4++;
        }
        a aVar = new a(this.f2862b, rVar, z4);
        this.f3530z = aVar;
        aVar.g(z3);
        this.f3530z.k();
        super.e(rVar);
        return true;
    }

    public void f(boolean z3) {
        ArrayList arrayList;
        n nVar;
        super.f(z3);
        ((View) this.f2869i).requestLayout();
        g gVar = this.f2863c;
        boolean z4 = false;
        if (gVar != null) {
            ArrayList s4 = gVar.s();
            int size = s4.size();
            for (int i4 = 0; i4 < size; i4++) {
                C0408b b4 = ((i) s4.get(i4)).b();
                if (b4 != null) {
                    b4.h(this);
                }
            }
        }
        g gVar2 = this.f2863c;
        if (gVar2 != null) {
            arrayList = gVar2.z();
        } else {
            arrayList = null;
        }
        if (this.f3518n && arrayList != null) {
            int size2 = arrayList.size();
            if (size2 == 1) {
                z4 = !((i) arrayList.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z4 = true;
            }
        }
        if (z4) {
            if (this.f3515k == null) {
                this.f3515k = new d(this.f2861a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f3515k.getParent();
            if (viewGroup != this.f2869i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f3515k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f2869i;
                actionMenuView.addView(this.f3515k, actionMenuView.F());
            }
        } else {
            d dVar = this.f3515k;
            if (dVar != null && dVar.getParent() == (nVar = this.f2869i)) {
                ((ViewGroup) nVar).removeView(this.f3515k);
            }
        }
        ((ActionMenuView) this.f2869i).setOverflowReserved(this.f3518n);
    }

    public boolean h() {
        int i4;
        ArrayList arrayList;
        int i5;
        int i6;
        int i7;
        boolean z3;
        boolean z4;
        boolean z5;
        C0379c cVar = this;
        g gVar = cVar.f2863c;
        View view = null;
        boolean z6 = false;
        if (gVar != null) {
            arrayList = gVar.E();
            i4 = arrayList.size();
        } else {
            arrayList = null;
            i4 = 0;
        }
        int i8 = cVar.f3522r;
        int i9 = cVar.f3521q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f2869i;
        boolean z7 = false;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i4; i12++) {
            i iVar = (i) arrayList.get(i12);
            if (iVar.o()) {
                i10++;
            } else if (iVar.n()) {
                i11++;
            } else {
                z7 = true;
            }
            if (cVar.f3526v && iVar.isActionViewExpanded()) {
                i8 = 0;
            }
        }
        if (cVar.f3518n && (z7 || i11 + i10 > i8)) {
            i8--;
        }
        int i13 = i8 - i10;
        SparseBooleanArray sparseBooleanArray = cVar.f3528x;
        sparseBooleanArray.clear();
        if (cVar.f3524t) {
            int i14 = cVar.f3527w;
            i5 = i9 / i14;
            i6 = i14 + ((i9 % i14) / i5);
        } else {
            i6 = 0;
            i5 = 0;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < i4) {
            i iVar2 = (i) arrayList.get(i15);
            if (iVar2.o()) {
                View n4 = cVar.n(iVar2, view, viewGroup);
                if (cVar.f3524t) {
                    i5 -= ActionMenuView.L(n4, i6, i5, makeMeasureSpec, z6 ? 1 : 0);
                } else {
                    n4.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n4.getMeasuredWidth();
                i9 -= measuredWidth;
                if (i16 == 0) {
                    i16 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.u(true);
                z3 = z6;
                i7 = i4;
            } else if (iVar2.n()) {
                int groupId2 = iVar2.getGroupId();
                boolean z8 = sparseBooleanArray.get(groupId2);
                if ((i13 > 0 || z8) && i9 > 0 && (!cVar.f3524t || i5 > 0)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z9 = z4;
                i7 = i4;
                if (z4) {
                    View n5 = cVar.n(iVar2, (View) null, viewGroup);
                    if (cVar.f3524t) {
                        int L3 = ActionMenuView.L(n5, i6, i5, makeMeasureSpec, 0);
                        i5 -= L3;
                        if (L3 == 0) {
                            z9 = false;
                        }
                    } else {
                        n5.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z10 = z9;
                    int measuredWidth2 = n5.getMeasuredWidth();
                    i9 -= measuredWidth2;
                    if (i16 == 0) {
                        i16 = measuredWidth2;
                    }
                    if (!cVar.f3524t ? i9 + i16 <= 0 : i9 < 0) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    z4 = z10 & z5;
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z8) {
                    sparseBooleanArray.put(groupId2, false);
                    int i17 = 0;
                    while (i17 < i15) {
                        i iVar3 = (i) arrayList.get(i17);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.l()) {
                                i13++;
                            }
                            iVar3.u(false);
                        }
                        i17++;
                    }
                }
                if (z4) {
                    i13--;
                }
                iVar2.u(z4);
                z3 = false;
            } else {
                z3 = z6;
                i7 = i4;
                iVar2.u(z3);
            }
            i15++;
            z6 = z3;
            i4 = i7;
            view = null;
            cVar = this;
        }
        return true;
    }

    public boolean l(ViewGroup viewGroup, int i4) {
        if (viewGroup.getChildAt(i4) == this.f3515k) {
            return false;
        }
        return super.l(viewGroup, i4);
    }

    public View n(i iVar, View view, ViewGroup viewGroup) {
        int i4;
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.j()) {
            actionView = super.n(iVar, view, viewGroup);
        }
        if (iVar.isActionViewExpanded()) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        actionView.setVisibility(i4);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.o(layoutParams));
        }
        return actionView;
    }

    public n o(ViewGroup viewGroup) {
        n nVar = this.f2869i;
        n o4 = super.o(viewGroup);
        if (nVar != o4) {
            ((ActionMenuView) o4).setPresenter(this);
        }
        return o4;
    }

    public boolean q(int i4, i iVar) {
        return iVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}
