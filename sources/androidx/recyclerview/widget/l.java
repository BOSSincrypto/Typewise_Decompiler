package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public class l extends RecyclerView.y {

    /* renamed from: i  reason: collision with root package name */
    protected final LinearInterpolator f6673i = new LinearInterpolator();

    /* renamed from: j  reason: collision with root package name */
    protected final DecelerateInterpolator f6674j = new DecelerateInterpolator();

    /* renamed from: k  reason: collision with root package name */
    protected PointF f6675k;

    /* renamed from: l  reason: collision with root package name */
    private final DisplayMetrics f6676l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f6677m = false;

    /* renamed from: n  reason: collision with root package name */
    private float f6678n;

    /* renamed from: o  reason: collision with root package name */
    protected int f6679o = 0;

    /* renamed from: p  reason: collision with root package name */
    protected int f6680p = 0;

    public l(Context context) {
        this.f6676l = context.getResources().getDisplayMetrics();
    }

    private float A() {
        if (!this.f6677m) {
            this.f6678n = v(this.f6676l);
            this.f6677m = true;
        }
        return this.f6678n;
    }

    private int y(int i4, int i5) {
        int i6 = i4 - i5;
        if (i4 * i6 <= 0) {
            return 0;
        }
        return i6;
    }

    /* access modifiers changed from: protected */
    public int B() {
        PointF pointF = this.f6675k;
        if (pointF != null) {
            float f4 = pointF.y;
            if (f4 != 0.0f) {
                if (f4 > 0.0f) {
                    return 1;
                }
                return -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void C(RecyclerView.y.a aVar) {
        PointF a4 = a(f());
        if (a4 == null || (a4.x == 0.0f && a4.y == 0.0f)) {
            aVar.b(f());
            r();
            return;
        }
        i(a4);
        this.f6675k = a4;
        this.f6679o = (int) (a4.x * 10000.0f);
        this.f6680p = (int) (a4.y * 10000.0f);
        aVar.d((int) (((float) this.f6679o) * 1.2f), (int) (((float) this.f6680p) * 1.2f), (int) (((float) x(10000)) * 1.2f), this.f6673i);
    }

    /* access modifiers changed from: protected */
    public void l(int i4, int i5, RecyclerView.z zVar, RecyclerView.y.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f6679o = y(this.f6679o, i4);
        int y3 = y(this.f6680p, i5);
        this.f6680p = y3;
        if (this.f6679o == 0 && y3 == 0) {
            C(aVar);
        }
    }

    /* access modifiers changed from: protected */
    public void m() {
    }

    /* access modifiers changed from: protected */
    public void n() {
        this.f6680p = 0;
        this.f6679o = 0;
        this.f6675k = null;
    }

    /* access modifiers changed from: protected */
    public void o(View view, RecyclerView.z zVar, RecyclerView.y.a aVar) {
        int t4 = t(view, z());
        int u3 = u(view, B());
        int w3 = w((int) Math.sqrt((double) ((t4 * t4) + (u3 * u3))));
        if (w3 > 0) {
            aVar.d(-t4, -u3, w3, this.f6674j);
        }
    }

    public int s(int i4, int i5, int i6, int i7, int i8) {
        if (i8 == -1) {
            return i6 - i4;
        }
        if (i8 == 0) {
            int i9 = i6 - i4;
            if (i9 > 0) {
                return i9;
            }
            int i10 = i7 - i5;
            if (i10 < 0) {
                return i10;
            }
            return 0;
        } else if (i8 == 1) {
            return i7 - i5;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public int t(View view, int i4) {
        RecyclerView.o e4 = e();
        if (e4 == null || !e4.x()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return s(e4.d0(view) - pVar.leftMargin, e4.g0(view) + pVar.rightMargin, e4.getPaddingLeft(), e4.x0() - e4.getPaddingRight(), i4);
    }

    public int u(View view, int i4) {
        RecyclerView.o e4 = e();
        if (e4 == null || !e4.y()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return s(e4.h0(view) - pVar.topMargin, e4.b0(view) + pVar.bottomMargin, e4.getPaddingTop(), e4.j0() - e4.getPaddingBottom(), i4);
    }

    /* access modifiers changed from: protected */
    public float v(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    public int w(int i4) {
        return (int) Math.ceil(((double) x(i4)) / 0.3356d);
    }

    /* access modifiers changed from: protected */
    public int x(int i4) {
        return (int) Math.ceil((double) (((float) Math.abs(i4)) * A()));
    }

    /* access modifiers changed from: protected */
    public int z() {
        PointF pointF = this.f6675k;
        if (pointF != null) {
            float f4 = pointF.x;
            if (f4 != 0.0f) {
                if (f4 > 0.0f) {
                    return 1;
                }
                return -1;
            }
        }
        return 0;
    }
}
