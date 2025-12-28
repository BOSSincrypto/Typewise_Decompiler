package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    protected final RecyclerView.o f6685a;

    /* renamed from: b  reason: collision with root package name */
    private int f6686b;

    /* renamed from: c  reason: collision with root package name */
    final Rect f6687c;

    class a extends p {
        a(RecyclerView.o oVar) {
            super(oVar, (a) null);
        }

        public int d(View view) {
            return this.f6685a.g0(view) + ((RecyclerView.p) view.getLayoutParams()).rightMargin;
        }

        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f6685a.f0(view) + pVar.leftMargin + pVar.rightMargin;
        }

        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f6685a.e0(view) + pVar.topMargin + pVar.bottomMargin;
        }

        public int g(View view) {
            return this.f6685a.d0(view) - ((RecyclerView.p) view.getLayoutParams()).leftMargin;
        }

        public int h() {
            return this.f6685a.x0();
        }

        public int i() {
            return this.f6685a.x0() - this.f6685a.getPaddingRight();
        }

        public int j() {
            return this.f6685a.getPaddingRight();
        }

        public int k() {
            return this.f6685a.y0();
        }

        public int l() {
            return this.f6685a.k0();
        }

        public int m() {
            return this.f6685a.getPaddingLeft();
        }

        public int n() {
            return (this.f6685a.x0() - this.f6685a.getPaddingLeft()) - this.f6685a.getPaddingRight();
        }

        public int p(View view) {
            this.f6685a.w0(view, true, this.f6687c);
            return this.f6687c.right;
        }

        public int q(View view) {
            this.f6685a.w0(view, true, this.f6687c);
            return this.f6687c.left;
        }

        public void r(int i4) {
            this.f6685a.M0(i4);
        }
    }

    class b extends p {
        b(RecyclerView.o oVar) {
            super(oVar, (a) null);
        }

        public int d(View view) {
            return this.f6685a.b0(view) + ((RecyclerView.p) view.getLayoutParams()).bottomMargin;
        }

        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f6685a.e0(view) + pVar.topMargin + pVar.bottomMargin;
        }

        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f6685a.f0(view) + pVar.leftMargin + pVar.rightMargin;
        }

        public int g(View view) {
            return this.f6685a.h0(view) - ((RecyclerView.p) view.getLayoutParams()).topMargin;
        }

        public int h() {
            return this.f6685a.j0();
        }

        public int i() {
            return this.f6685a.j0() - this.f6685a.getPaddingBottom();
        }

        public int j() {
            return this.f6685a.getPaddingBottom();
        }

        public int k() {
            return this.f6685a.k0();
        }

        public int l() {
            return this.f6685a.y0();
        }

        public int m() {
            return this.f6685a.getPaddingTop();
        }

        public int n() {
            return (this.f6685a.j0() - this.f6685a.getPaddingTop()) - this.f6685a.getPaddingBottom();
        }

        public int p(View view) {
            this.f6685a.w0(view, true, this.f6687c);
            return this.f6687c.bottom;
        }

        public int q(View view) {
            this.f6685a.w0(view, true, this.f6687c);
            return this.f6687c.top;
        }

        public void r(int i4) {
            this.f6685a.N0(i4);
        }
    }

    /* synthetic */ p(RecyclerView.o oVar, a aVar) {
        this(oVar);
    }

    public static p a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static p b(RecyclerView.o oVar, int i4) {
        if (i4 == 0) {
            return a(oVar);
        }
        if (i4 == 1) {
            return c(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static p c(RecyclerView.o oVar) {
        return new b(oVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f6686b) {
            return 0;
        }
        return n() - this.f6686b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i4);

    public void s() {
        this.f6686b = n();
    }

    private p(RecyclerView.o oVar) {
        this.f6686b = Integer.MIN_VALUE;
        this.f6687c = new Rect();
        this.f6685a = oVar;
    }
}
