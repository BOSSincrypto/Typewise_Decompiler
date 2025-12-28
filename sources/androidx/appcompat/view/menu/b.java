package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

public abstract class b implements m {

    /* renamed from: a  reason: collision with root package name */
    protected Context f2861a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f2862b;

    /* renamed from: c  reason: collision with root package name */
    protected g f2863c;

    /* renamed from: d  reason: collision with root package name */
    protected LayoutInflater f2864d;

    /* renamed from: e  reason: collision with root package name */
    protected LayoutInflater f2865e;

    /* renamed from: f  reason: collision with root package name */
    private m.a f2866f;

    /* renamed from: g  reason: collision with root package name */
    private int f2867g;

    /* renamed from: h  reason: collision with root package name */
    private int f2868h;

    /* renamed from: i  reason: collision with root package name */
    protected n f2869i;

    /* renamed from: j  reason: collision with root package name */
    private int f2870j;

    public b(Context context, int i4, int i5) {
        this.f2861a = context;
        this.f2864d = LayoutInflater.from(context);
        this.f2867g = i4;
        this.f2868h = i5;
    }

    public void a(g gVar, boolean z3) {
        m.a aVar = this.f2866f;
        if (aVar != null) {
            aVar.a(gVar, z3);
        }
    }

    /* access modifiers changed from: protected */
    public void b(View view, int i4) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f2869i).addView(view, i4);
    }

    public void c(Context context, g gVar) {
        this.f2862b = context;
        this.f2865e = LayoutInflater.from(context);
        this.f2863c = gVar;
    }

    public abstract void d(i iVar, n.a aVar);

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(androidx.appcompat.view.menu.r r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.m$a r0 = r1.f2866f
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.g r2 = r1.f2863c
        L_0x0009:
            boolean r2 = r0.b(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.e(androidx.appcompat.view.menu.r):boolean");
    }

    public void f(boolean z3) {
        i iVar;
        ViewGroup viewGroup = (ViewGroup) this.f2869i;
        if (viewGroup != null) {
            g gVar = this.f2863c;
            int i4 = 0;
            if (gVar != null) {
                gVar.r();
                ArrayList E3 = this.f2863c.E();
                int size = E3.size();
                int i5 = 0;
                for (int i6 = 0; i6 < size; i6++) {
                    i iVar2 = (i) E3.get(i6);
                    if (q(i5, iVar2)) {
                        View childAt = viewGroup.getChildAt(i5);
                        if (childAt instanceof n.a) {
                            iVar = ((n.a) childAt).getItemData();
                        } else {
                            iVar = null;
                        }
                        View n4 = n(iVar2, childAt, viewGroup);
                        if (iVar2 != iVar) {
                            n4.setPressed(false);
                            n4.jumpDrawablesToCurrentState();
                        }
                        if (n4 != childAt) {
                            b(n4, i5);
                        }
                        i5++;
                    }
                }
                i4 = i5;
            }
            while (i4 < viewGroup.getChildCount()) {
                if (!l(viewGroup, i4)) {
                    i4++;
                }
            }
        }
    }

    public n.a g(ViewGroup viewGroup) {
        return (n.a) this.f2864d.inflate(this.f2868h, viewGroup, false);
    }

    public boolean i(g gVar, i iVar) {
        return false;
    }

    public boolean j(g gVar, i iVar) {
        return false;
    }

    public void k(m.a aVar) {
        this.f2866f = aVar;
    }

    /* access modifiers changed from: protected */
    public boolean l(ViewGroup viewGroup, int i4) {
        viewGroup.removeViewAt(i4);
        return true;
    }

    public m.a m() {
        return this.f2866f;
    }

    public View n(i iVar, View view, ViewGroup viewGroup) {
        n.a aVar;
        if (view instanceof n.a) {
            aVar = (n.a) view;
        } else {
            aVar = g(viewGroup);
        }
        d(iVar, aVar);
        return (View) aVar;
    }

    public n o(ViewGroup viewGroup) {
        if (this.f2869i == null) {
            n nVar = (n) this.f2864d.inflate(this.f2867g, viewGroup, false);
            this.f2869i = nVar;
            nVar.b(this.f2863c);
            f(true);
        }
        return this.f2869i;
    }

    public void p(int i4) {
        this.f2870j = i4;
    }

    public abstract boolean q(int i4, i iVar);
}
