package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class t extends RecyclerView.l {

    /* renamed from: g  reason: collision with root package name */
    boolean f6695g = true;

    public final void A(RecyclerView.D d4) {
        I(d4);
        h(d4);
    }

    public final void B(RecyclerView.D d4) {
        J(d4);
    }

    public final void C(RecyclerView.D d4, boolean z3) {
        K(d4, z3);
        h(d4);
    }

    public final void D(RecyclerView.D d4, boolean z3) {
        L(d4, z3);
    }

    public final void E(RecyclerView.D d4) {
        M(d4);
        h(d4);
    }

    public final void F(RecyclerView.D d4) {
        N(d4);
    }

    public final void G(RecyclerView.D d4) {
        O(d4);
        h(d4);
    }

    public final void H(RecyclerView.D d4) {
        P(d4);
    }

    public void I(RecyclerView.D d4) {
    }

    public void J(RecyclerView.D d4) {
    }

    public void K(RecyclerView.D d4, boolean z3) {
    }

    public void L(RecyclerView.D d4, boolean z3) {
    }

    public void M(RecyclerView.D d4) {
    }

    public void N(RecyclerView.D d4) {
    }

    public void O(RecyclerView.D d4) {
    }

    public void P(RecyclerView.D d4) {
    }

    public boolean a(RecyclerView.D d4, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i4;
        int i5;
        if (bVar == null || ((i4 = bVar.f6349a) == (i5 = bVar2.f6349a) && bVar.f6350b == bVar2.f6350b)) {
            return w(d4);
        }
        return y(d4, i4, bVar.f6350b, i5, bVar2.f6350b);
    }

    public boolean b(RecyclerView.D d4, RecyclerView.D d5, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i4;
        int i5;
        int i6 = bVar.f6349a;
        int i7 = bVar.f6350b;
        if (d5.J()) {
            int i8 = bVar.f6349a;
            i4 = bVar.f6350b;
            i5 = i8;
        } else {
            i5 = bVar2.f6349a;
            i4 = bVar2.f6350b;
        }
        return x(d4, d5, i6, i7, i5, i4);
    }

    public boolean c(RecyclerView.D d4, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i4;
        int i5;
        int i6 = bVar.f6349a;
        int i7 = bVar.f6350b;
        View view = d4.f6318a;
        if (bVar2 == null) {
            i4 = view.getLeft();
        } else {
            i4 = bVar2.f6349a;
        }
        int i8 = i4;
        if (bVar2 == null) {
            i5 = view.getTop();
        } else {
            i5 = bVar2.f6350b;
        }
        int i9 = i5;
        if (d4.v() || (i6 == i8 && i7 == i9)) {
            return z(d4);
        }
        view.layout(i8, i9, view.getWidth() + i8, view.getHeight() + i9);
        return y(d4, i6, i7, i8, i9);
    }

    public boolean d(RecyclerView.D d4, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i4 = bVar.f6349a;
        int i5 = bVar2.f6349a;
        if (i4 == i5 && bVar.f6350b == bVar2.f6350b) {
            E(d4);
            return false;
        }
        return y(d4, i4, bVar.f6350b, i5, bVar2.f6350b);
    }

    public boolean f(RecyclerView.D d4) {
        if (!this.f6695g || d4.t()) {
            return true;
        }
        return false;
    }

    public abstract boolean w(RecyclerView.D d4);

    public abstract boolean x(RecyclerView.D d4, RecyclerView.D d5, int i4, int i5, int i6, int i7);

    public abstract boolean y(RecyclerView.D d4, int i4, int i5, int i6, int i7);

    public abstract boolean z(RecyclerView.D d4);
}
