package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

public abstract class u extends RecyclerView.q {

    /* renamed from: a  reason: collision with root package name */
    RecyclerView f6696a;

    /* renamed from: b  reason: collision with root package name */
    private Scroller f6697b;

    /* renamed from: c  reason: collision with root package name */
    private final RecyclerView.s f6698c = new a();

    class a extends RecyclerView.s {

        /* renamed from: a  reason: collision with root package name */
        boolean f6699a = false;

        a() {
        }

        public void a(RecyclerView recyclerView, int i4) {
            super.a(recyclerView, i4);
            if (i4 == 0 && this.f6699a) {
                this.f6699a = false;
                u.this.j();
            }
        }

        public void b(RecyclerView recyclerView, int i4, int i5) {
            if (i4 != 0 || i5 != 0) {
                this.f6699a = true;
            }
        }
    }

    private void e() {
        this.f6696a.i1(this.f6698c);
        this.f6696a.setOnFlingListener((RecyclerView.q) null);
    }

    private void h() {
        if (this.f6696a.getOnFlingListener() == null) {
            this.f6696a.m(this.f6698c);
            this.f6696a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    private boolean i(RecyclerView.o oVar, int i4, int i5) {
        RecyclerView.y d4;
        int g4;
        if (!(oVar instanceof RecyclerView.y.b) || (d4 = d(oVar)) == null || (g4 = g(oVar, i4, i5)) == -1) {
            return false;
        }
        d4.p(g4);
        oVar.U1(d4);
        return true;
    }

    public boolean a(int i4, int i5) {
        RecyclerView.o layoutManager = this.f6696a.getLayoutManager();
        if (layoutManager == null || this.f6696a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f6696a.getMinFlingVelocity();
        if ((Math.abs(i5) > minFlingVelocity || Math.abs(i4) > minFlingVelocity) && i(layoutManager, i4, i5)) {
            return true;
        }
        return false;
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f6696a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                e();
            }
            this.f6696a = recyclerView;
            if (recyclerView != null) {
                h();
                this.f6697b = new Scroller(this.f6696a.getContext(), new DecelerateInterpolator());
                j();
            }
        }
    }

    public abstract int[] c(RecyclerView.o oVar, View view);

    /* access modifiers changed from: protected */
    public abstract RecyclerView.y d(RecyclerView.o oVar);

    public abstract View f(RecyclerView.o oVar);

    public abstract int g(RecyclerView.o oVar, int i4, int i5);

    /* access modifiers changed from: package-private */
    public void j() {
        RecyclerView.o layoutManager;
        View f4;
        RecyclerView recyclerView = this.f6696a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (f4 = f(layoutManager)) != null) {
            int[] c4 = c(layoutManager, f4);
            int i4 = c4[0];
            if (i4 != 0 || c4[1] != 0) {
                this.f6696a.w1(i4, c4[1]);
            }
        }
    }
}
