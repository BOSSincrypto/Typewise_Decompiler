package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class q extends u {

    /* renamed from: d  reason: collision with root package name */
    private p f6688d;

    /* renamed from: e  reason: collision with root package name */
    private p f6689e;

    class a extends l {
        a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public void o(View view, RecyclerView.z zVar, RecyclerView.y.a aVar) {
            q qVar = q.this;
            int[] c4 = qVar.c(qVar.f6696a.getLayoutManager(), view);
            int i4 = c4[0];
            int i5 = c4[1];
            int w3 = w(Math.max(Math.abs(i4), Math.abs(i5)));
            if (w3 > 0) {
                aVar.d(i4, i5, w3, this.f6674j);
            }
        }

        /* access modifiers changed from: protected */
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        /* access modifiers changed from: protected */
        public int x(int i4) {
            return Math.min(100, super.x(i4));
        }
    }

    private int k(View view, p pVar) {
        return (pVar.g(view) + (pVar.e(view) / 2)) - (pVar.m() + (pVar.n() / 2));
    }

    private View l(RecyclerView.o oVar, p pVar) {
        int W3 = oVar.W();
        View view = null;
        if (W3 == 0) {
            return null;
        }
        int m4 = pVar.m() + (pVar.n() / 2);
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < W3; i5++) {
            View V3 = oVar.V(i5);
            int abs = Math.abs((pVar.g(V3) + (pVar.e(V3) / 2)) - m4);
            if (abs < i4) {
                view = V3;
                i4 = abs;
            }
        }
        return view;
    }

    private p m(RecyclerView.o oVar) {
        p pVar = this.f6689e;
        if (pVar == null || pVar.f6685a != oVar) {
            this.f6689e = p.a(oVar);
        }
        return this.f6689e;
    }

    private p n(RecyclerView.o oVar) {
        if (oVar.y()) {
            return o(oVar);
        }
        if (oVar.x()) {
            return m(oVar);
        }
        return null;
    }

    private p o(RecyclerView.o oVar) {
        p pVar = this.f6688d;
        if (pVar == null || pVar.f6685a != oVar) {
            this.f6688d = p.c(oVar);
        }
        return this.f6688d;
    }

    private boolean p(RecyclerView.o oVar, int i4, int i5) {
        if (oVar.x()) {
            if (i4 > 0) {
                return true;
            }
            return false;
        } else if (i5 > 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean q(RecyclerView.o oVar) {
        PointF f4;
        int l02 = oVar.l0();
        if (!(oVar instanceof RecyclerView.y.b) || (f4 = ((RecyclerView.y.b) oVar).f(l02 - 1)) == null) {
            return false;
        }
        if (f4.x < 0.0f || f4.y < 0.0f) {
            return true;
        }
        return false;
    }

    public int[] c(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.x()) {
            iArr[0] = k(view, m(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.y()) {
            iArr[1] = k(view, o(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* access modifiers changed from: protected */
    public RecyclerView.y d(RecyclerView.o oVar) {
        if (!(oVar instanceof RecyclerView.y.b)) {
            return null;
        }
        return new a(this.f6696a.getContext());
    }

    public View f(RecyclerView.o oVar) {
        if (oVar.y()) {
            return l(oVar, o(oVar));
        }
        if (oVar.x()) {
            return l(oVar, m(oVar));
        }
        return null;
    }

    public int g(RecyclerView.o oVar, int i4, int i5) {
        p n4;
        int i6;
        int l02 = oVar.l0();
        if (l02 == 0 || (n4 = n(oVar)) == null) {
            return -1;
        }
        int W3 = oVar.W();
        View view = null;
        int i7 = Integer.MAX_VALUE;
        int i8 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i9 = 0; i9 < W3; i9++) {
            View V3 = oVar.V(i9);
            if (V3 != null) {
                int k4 = k(V3, n4);
                if (k4 <= 0 && k4 > i8) {
                    view2 = V3;
                    i8 = k4;
                }
                if (k4 >= 0 && k4 < i7) {
                    view = V3;
                    i7 = k4;
                }
            }
        }
        boolean p4 = p(oVar, i4, i5);
        if (p4 && view != null) {
            return oVar.q0(view);
        }
        if (!p4 && view2 != null) {
            return oVar.q0(view2);
        }
        if (p4) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int q02 = oVar.q0(view);
        if (q(oVar) == p4) {
            i6 = -1;
        } else {
            i6 = 1;
        }
        int i10 = q02 + i6;
        if (i10 < 0 || i10 >= l02) {
            return -1;
        }
        return i10;
    }
}
