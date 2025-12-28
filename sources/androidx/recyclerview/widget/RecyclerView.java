package androidx.recyclerview.widget;

import V.b;
import V.c;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.appcompat.app.F;
import androidx.core.view.C0402a;
import androidx.core.view.C0443x;
import androidx.core.view.C0444y;
import androidx.core.view.P;
import androidx.core.view.S;
import androidx.core.view.accessibility.A;
import androidx.core.view.accessibility.C0405b;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.v;
import androidx.recyclerview.widget.w;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.uuid.Uuid;

public class RecyclerView extends ViewGroup {

    /* renamed from: B0  reason: collision with root package name */
    static boolean f6217B0;

    /* renamed from: C0  reason: collision with root package name */
    static boolean f6218C0;

    /* renamed from: D0  reason: collision with root package name */
    private static final int[] f6219D0 = {16843830};

    /* renamed from: E0  reason: collision with root package name */
    private static final float f6220E0 = ((float) (Math.log(0.78d) / Math.log(0.9d)));

    /* renamed from: F0  reason: collision with root package name */
    static final boolean f6221F0 = false;

    /* renamed from: G0  reason: collision with root package name */
    static final boolean f6222G0 = true;

    /* renamed from: H0  reason: collision with root package name */
    static final boolean f6223H0 = true;

    /* renamed from: I0  reason: collision with root package name */
    static final boolean f6224I0 = true;

    /* renamed from: J0  reason: collision with root package name */
    private static final boolean f6225J0 = false;

    /* renamed from: K0  reason: collision with root package name */
    private static final boolean f6226K0 = false;

    /* renamed from: L0  reason: collision with root package name */
    private static final Class[] f6227L0;

    /* renamed from: M0  reason: collision with root package name */
    static final Interpolator f6228M0 = new C0465c();

    /* renamed from: N0  reason: collision with root package name */
    static final A f6229N0 = new A();

    /* renamed from: A  reason: collision with root package name */
    private int f6230A;

    /* renamed from: A0  reason: collision with root package name */
    private final w.b f6231A0;

    /* renamed from: B  reason: collision with root package name */
    boolean f6232B;

    /* renamed from: C  reason: collision with root package name */
    private final AccessibilityManager f6233C;

    /* renamed from: D  reason: collision with root package name */
    private List f6234D;

    /* renamed from: E  reason: collision with root package name */
    boolean f6235E;

    /* renamed from: F  reason: collision with root package name */
    boolean f6236F;

    /* renamed from: G  reason: collision with root package name */
    private int f6237G;

    /* renamed from: H  reason: collision with root package name */
    private int f6238H;

    /* renamed from: I  reason: collision with root package name */
    private k f6239I;

    /* renamed from: J  reason: collision with root package name */
    private EdgeEffect f6240J;

    /* renamed from: K  reason: collision with root package name */
    private EdgeEffect f6241K;

    /* renamed from: L  reason: collision with root package name */
    private EdgeEffect f6242L;

    /* renamed from: M  reason: collision with root package name */
    private EdgeEffect f6243M;

    /* renamed from: N  reason: collision with root package name */
    l f6244N;

    /* renamed from: O  reason: collision with root package name */
    private int f6245O;

    /* renamed from: P  reason: collision with root package name */
    private int f6246P;

    /* renamed from: Q  reason: collision with root package name */
    private VelocityTracker f6247Q;

    /* renamed from: R  reason: collision with root package name */
    private int f6248R;

    /* renamed from: S  reason: collision with root package name */
    private int f6249S;

    /* renamed from: T  reason: collision with root package name */
    private int f6250T;

    /* renamed from: U  reason: collision with root package name */
    private int f6251U;

    /* renamed from: V  reason: collision with root package name */
    private int f6252V;

    /* renamed from: W  reason: collision with root package name */
    private q f6253W;

    /* renamed from: a  reason: collision with root package name */
    private final float f6254a;

    /* renamed from: a0  reason: collision with root package name */
    private final int f6255a0;

    /* renamed from: b  reason: collision with root package name */
    private final w f6256b;

    /* renamed from: b0  reason: collision with root package name */
    private final int f6257b0;

    /* renamed from: c  reason: collision with root package name */
    final u f6258c;

    /* renamed from: c0  reason: collision with root package name */
    private float f6259c0;

    /* renamed from: d  reason: collision with root package name */
    x f6260d;

    /* renamed from: d0  reason: collision with root package name */
    private float f6261d0;

    /* renamed from: e  reason: collision with root package name */
    a f6262e;

    /* renamed from: e0  reason: collision with root package name */
    private boolean f6263e0;

    /* renamed from: f  reason: collision with root package name */
    f f6264f;

    /* renamed from: f0  reason: collision with root package name */
    final C f6265f0;

    /* renamed from: g  reason: collision with root package name */
    final w f6266g;

    /* renamed from: g0  reason: collision with root package name */
    j f6267g0;

    /* renamed from: h  reason: collision with root package name */
    boolean f6268h;

    /* renamed from: h0  reason: collision with root package name */
    j.b f6269h0;

    /* renamed from: i  reason: collision with root package name */
    final Runnable f6270i;

    /* renamed from: i0  reason: collision with root package name */
    final z f6271i0;

    /* renamed from: j  reason: collision with root package name */
    final Rect f6272j;

    /* renamed from: j0  reason: collision with root package name */
    private s f6273j0;

    /* renamed from: k  reason: collision with root package name */
    private final Rect f6274k;

    /* renamed from: k0  reason: collision with root package name */
    private List f6275k0;

    /* renamed from: l  reason: collision with root package name */
    final RectF f6276l;

    /* renamed from: l0  reason: collision with root package name */
    boolean f6277l0;

    /* renamed from: m  reason: collision with root package name */
    Adapter f6278m;

    /* renamed from: m0  reason: collision with root package name */
    boolean f6279m0;

    /* renamed from: n  reason: collision with root package name */
    o f6280n;

    /* renamed from: n0  reason: collision with root package name */
    private l.a f6281n0;

    /* renamed from: o  reason: collision with root package name */
    final List f6282o;

    /* renamed from: o0  reason: collision with root package name */
    boolean f6283o0;

    /* renamed from: p  reason: collision with root package name */
    final ArrayList f6284p;

    /* renamed from: p0  reason: collision with root package name */
    r f6285p0;

    /* renamed from: q  reason: collision with root package name */
    private final ArrayList f6286q;

    /* renamed from: q0  reason: collision with root package name */
    private final int[] f6287q0;

    /* renamed from: r  reason: collision with root package name */
    private r f6288r;

    /* renamed from: r0  reason: collision with root package name */
    private C0444y f6289r0;

    /* renamed from: s  reason: collision with root package name */
    boolean f6290s;

    /* renamed from: s0  reason: collision with root package name */
    private final int[] f6291s0;

    /* renamed from: t  reason: collision with root package name */
    boolean f6292t;

    /* renamed from: t0  reason: collision with root package name */
    private final int[] f6293t0;

    /* renamed from: u  reason: collision with root package name */
    boolean f6294u;

    /* renamed from: u0  reason: collision with root package name */
    final int[] f6295u0;

    /* renamed from: v  reason: collision with root package name */
    boolean f6296v;

    /* renamed from: v0  reason: collision with root package name */
    final List f6297v0;

    /* renamed from: w  reason: collision with root package name */
    private int f6298w;

    /* renamed from: w0  reason: collision with root package name */
    private Runnable f6299w0;

    /* renamed from: x  reason: collision with root package name */
    boolean f6300x;

    /* renamed from: x0  reason: collision with root package name */
    private boolean f6301x0;

    /* renamed from: y  reason: collision with root package name */
    boolean f6302y;

    /* renamed from: y0  reason: collision with root package name */
    private int f6303y0;

    /* renamed from: z  reason: collision with root package name */
    private boolean f6304z;

    /* renamed from: z0  reason: collision with root package name */
    private int f6305z0;

    static class A extends k {
        A() {
        }

        /* access modifiers changed from: protected */
        public EdgeEffect a(RecyclerView recyclerView, int i4) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class Adapter {

        /* renamed from: a  reason: collision with root package name */
        private final h f6306a = new h();

        /* renamed from: b  reason: collision with root package name */
        private boolean f6307b = false;

        /* renamed from: c  reason: collision with root package name */
        private StateRestorationPolicy f6308c = StateRestorationPolicy.ALLOW;

        public enum StateRestorationPolicy {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void a(D d4, int i4) {
            boolean z3;
            if (d4.f6336s == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                d4.f6320c = i4;
                if (h()) {
                    d4.f6322e = e(i4);
                }
                d4.F(1, 519);
                androidx.core.os.q.a("RV OnBindView");
            }
            d4.f6336s = this;
            if (RecyclerView.f6217B0) {
                if (d4.f6318a.getParent() == null && P.R(d4.f6318a) != d4.x()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + d4.x() + ", attached to window: " + P.R(d4.f6318a) + ", holder: " + d4);
                } else if (d4.f6318a.getParent() == null && P.R(d4.f6318a)) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + d4);
                }
            }
            p(d4, i4, d4.o());
            if (z3) {
                d4.d();
                ViewGroup.LayoutParams layoutParams = d4.f6318a.getLayoutParams();
                if (layoutParams instanceof p) {
                    ((p) layoutParams).f6380c = true;
                }
                androidx.core.os.q.b();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            int i4 = g.f6342a[this.f6308c.ordinal()];
            if (i4 == 1) {
                return false;
            }
            if (i4 != 2) {
                return true;
            }
            if (d() > 0) {
                return true;
            }
            return false;
        }

        public final D c(ViewGroup viewGroup, int i4) {
            try {
                androidx.core.os.q.a("RV CreateView");
                D q4 = q(viewGroup, i4);
                if (q4.f6318a.getParent() == null) {
                    q4.f6323f = i4;
                    return q4;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                androidx.core.os.q.b();
            }
        }

        public abstract int d();

        public long e(int i4) {
            return -1;
        }

        public int f(int i4) {
            return 0;
        }

        public final boolean g() {
            return this.f6306a.a();
        }

        public final boolean h() {
            return this.f6307b;
        }

        public final void i() {
            this.f6306a.b();
        }

        public final void j(int i4, int i5) {
            this.f6306a.c(i4, i5);
        }

        public final void k(int i4, int i5, Object obj) {
            this.f6306a.d(i4, i5, obj);
        }

        public final void l(int i4, int i5) {
            this.f6306a.e(i4, i5);
        }

        public final void m(int i4, int i5) {
            this.f6306a.f(i4, i5);
        }

        public void n(RecyclerView recyclerView) {
        }

        public abstract void o(D d4, int i4);

        public void p(D d4, int i4, List list) {
            o(d4, i4);
        }

        public abstract D q(ViewGroup viewGroup, int i4);

        public void r(RecyclerView recyclerView) {
        }

        public boolean s(D d4) {
            return false;
        }

        public void t(D d4) {
        }

        public void u(D d4) {
        }

        public void v(D d4) {
        }

        public void w(i iVar) {
            this.f6306a.registerObserver(iVar);
        }

        public void x(boolean z3) {
            if (!g()) {
                this.f6307b = z3;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void y(i iVar) {
            this.f6306a.unregisterObserver(iVar);
        }
    }

    public static abstract class B {
    }

    class C implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private int f6310a;

        /* renamed from: b  reason: collision with root package name */
        private int f6311b;

        /* renamed from: c  reason: collision with root package name */
        OverScroller f6312c;

        /* renamed from: d  reason: collision with root package name */
        Interpolator f6313d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f6314e = false;

        /* renamed from: f  reason: collision with root package name */
        private boolean f6315f = false;

        C() {
            Interpolator interpolator = RecyclerView.f6228M0;
            this.f6313d = interpolator;
            this.f6312c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i4, int i5) {
            boolean z3;
            int i6;
            int abs = Math.abs(i4);
            int abs2 = Math.abs(i5);
            if (abs > abs2) {
                z3 = true;
            } else {
                z3 = false;
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (z3) {
                i6 = recyclerView.getWidth();
            } else {
                i6 = recyclerView.getHeight();
            }
            if (!z3) {
                abs = abs2;
            }
            return Math.min((int) (((((float) abs) / ((float) i6)) + 1.0f) * 300.0f), 2000);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            P.g0(RecyclerView.this, this);
        }

        public void b(int i4, int i5) {
            RecyclerView.this.setScrollState(2);
            this.f6311b = 0;
            this.f6310a = 0;
            Interpolator interpolator = this.f6313d;
            Interpolator interpolator2 = RecyclerView.f6228M0;
            if (interpolator != interpolator2) {
                this.f6313d = interpolator2;
                this.f6312c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f6312c.fling(0, 0, i4, i5, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            d();
        }

        /* access modifiers changed from: package-private */
        public void d() {
            if (this.f6314e) {
                this.f6315f = true;
            } else {
                c();
            }
        }

        public void e(int i4, int i5, int i6, Interpolator interpolator) {
            if (i6 == Integer.MIN_VALUE) {
                i6 = a(i4, i5);
            }
            int i7 = i6;
            if (interpolator == null) {
                interpolator = RecyclerView.f6228M0;
            }
            if (this.f6313d != interpolator) {
                this.f6313d = interpolator;
                this.f6312c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f6311b = 0;
            this.f6310a = 0;
            RecyclerView.this.setScrollState(2);
            this.f6312c.startScroll(0, 0, i4, i5, i7);
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f6312c.abortAnimation();
        }

        public void run() {
            int i4;
            int i5;
            boolean z3;
            boolean z4;
            boolean z5;
            int i6;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f6280n == null) {
                f();
                return;
            }
            this.f6315f = false;
            this.f6314e = true;
            recyclerView.z();
            OverScroller overScroller = this.f6312c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i7 = currX - this.f6310a;
                int i8 = currY - this.f6311b;
                this.f6310a = currX;
                this.f6311b = currY;
                int w3 = RecyclerView.this.w(i7);
                int y3 = RecyclerView.this.y(i8);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f6295u0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.K(w3, y3, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.f6295u0;
                    w3 -= iArr2[0];
                    y3 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.v(w3, y3);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f6278m != null) {
                    int[] iArr3 = recyclerView3.f6295u0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.q1(w3, y3, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f6295u0;
                    i4 = iArr4[0];
                    i5 = iArr4[1];
                    w3 -= i4;
                    y3 -= i5;
                    y yVar = recyclerView4.f6280n.f6360g;
                    if (yVar != null && !yVar.g() && yVar.h()) {
                        int b4 = RecyclerView.this.f6271i0.b();
                        if (b4 == 0) {
                            yVar.r();
                        } else if (yVar.f() >= b4) {
                            yVar.p(b4 - 1);
                            yVar.j(i4, i5);
                        } else {
                            yVar.j(i4, i5);
                        }
                    }
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (!RecyclerView.this.f6284p.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f6295u0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.L(i4, i5, w3, y3, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f6295u0;
                int i9 = w3 - iArr6[0];
                int i10 = y3 - iArr6[1];
                if (!(i4 == 0 && i5 == 0)) {
                    recyclerView6.N(i4, i5);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (overScroller.isFinished() || ((z3 || i9 != 0) && (z4 || i10 != 0))) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                y yVar2 = RecyclerView.this.f6280n.f6360g;
                if ((yVar2 == null || !yVar2.g()) && z5) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i9 < 0) {
                            i6 = -currVelocity;
                        } else if (i9 > 0) {
                            i6 = currVelocity;
                        } else {
                            i6 = 0;
                        }
                        if (i10 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i10 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i6, currVelocity);
                    }
                    if (RecyclerView.f6224I0) {
                        RecyclerView.this.f6269h0.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    j jVar = recyclerView7.f6267g0;
                    if (jVar != null) {
                        jVar.f(recyclerView7, i4, i5);
                    }
                }
            }
            y yVar3 = RecyclerView.this.f6280n.f6360g;
            if (yVar3 != null && yVar3.g()) {
                yVar3.j(0, 0);
            }
            this.f6314e = false;
            if (this.f6315f) {
                c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.F1(1);
        }
    }

    public static abstract class D {

        /* renamed from: t  reason: collision with root package name */
        private static final List f6317t = Collections.emptyList();

        /* renamed from: a  reason: collision with root package name */
        public final View f6318a;

        /* renamed from: b  reason: collision with root package name */
        WeakReference f6319b;

        /* renamed from: c  reason: collision with root package name */
        int f6320c = -1;

        /* renamed from: d  reason: collision with root package name */
        int f6321d = -1;

        /* renamed from: e  reason: collision with root package name */
        long f6322e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f6323f = -1;

        /* renamed from: g  reason: collision with root package name */
        int f6324g = -1;

        /* renamed from: h  reason: collision with root package name */
        D f6325h = null;

        /* renamed from: i  reason: collision with root package name */
        D f6326i = null;

        /* renamed from: j  reason: collision with root package name */
        int f6327j;

        /* renamed from: k  reason: collision with root package name */
        List f6328k = null;

        /* renamed from: l  reason: collision with root package name */
        List f6329l = null;

        /* renamed from: m  reason: collision with root package name */
        private int f6330m = 0;

        /* renamed from: n  reason: collision with root package name */
        u f6331n = null;

        /* renamed from: o  reason: collision with root package name */
        boolean f6332o = false;

        /* renamed from: p  reason: collision with root package name */
        private int f6333p = 0;

        /* renamed from: q  reason: collision with root package name */
        int f6334q = -1;

        /* renamed from: r  reason: collision with root package name */
        RecyclerView f6335r;

        /* renamed from: s  reason: collision with root package name */
        Adapter f6336s;

        public D(View view) {
            if (view != null) {
                this.f6318a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void g() {
            if (this.f6328k == null) {
                ArrayList arrayList = new ArrayList();
                this.f6328k = arrayList;
                this.f6329l = Collections.unmodifiableList(arrayList);
            }
        }

        /* access modifiers changed from: package-private */
        public void A(int i4, boolean z3) {
            if (this.f6321d == -1) {
                this.f6321d = this.f6320c;
            }
            if (this.f6324g == -1) {
                this.f6324g = this.f6320c;
            }
            if (z3) {
                this.f6324g += i4;
            }
            this.f6320c += i4;
            if (this.f6318a.getLayoutParams() != null) {
                ((p) this.f6318a.getLayoutParams()).f6380c = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void B(RecyclerView recyclerView) {
            int i4 = this.f6334q;
            if (i4 != -1) {
                this.f6333p = i4;
            } else {
                this.f6333p = P.z(this.f6318a);
            }
            recyclerView.t1(this, 4);
        }

        /* access modifiers changed from: package-private */
        public void C(RecyclerView recyclerView) {
            recyclerView.t1(this, this.f6333p);
            this.f6333p = 0;
        }

        /* access modifiers changed from: package-private */
        public void D() {
            if (!RecyclerView.f6217B0 || !x()) {
                this.f6327j = 0;
                this.f6320c = -1;
                this.f6321d = -1;
                this.f6322e = -1;
                this.f6324g = -1;
                this.f6330m = 0;
                this.f6325h = null;
                this.f6326i = null;
                d();
                this.f6333p = 0;
                this.f6334q = -1;
                RecyclerView.t(this);
                return;
            }
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }

        /* access modifiers changed from: package-private */
        public void E() {
            if (this.f6321d == -1) {
                this.f6321d = this.f6320c;
            }
        }

        /* access modifiers changed from: package-private */
        public void F(int i4, int i5) {
            this.f6327j = (i4 & i5) | (this.f6327j & (~i5));
        }

        public final void G(boolean z3) {
            int i4;
            int i5 = this.f6330m;
            if (z3) {
                i4 = i5 - 1;
            } else {
                i4 = i5 + 1;
            }
            this.f6330m = i4;
            if (i4 < 0) {
                this.f6330m = 0;
                if (!RecyclerView.f6217B0) {
                    Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                } else {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
            } else if (!z3 && i4 == 1) {
                this.f6327j |= 16;
            } else if (z3 && i4 == 0) {
                this.f6327j &= -17;
            }
            if (RecyclerView.f6218C0) {
                StringBuilder sb = new StringBuilder();
                sb.append("setIsRecyclable val:");
                sb.append(z3);
                sb.append(":");
                sb.append(this);
            }
        }

        /* access modifiers changed from: package-private */
        public void H(u uVar, boolean z3) {
            this.f6331n = uVar;
            this.f6332o = z3;
        }

        /* access modifiers changed from: package-private */
        public boolean I() {
            if ((this.f6327j & 16) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean J() {
            if ((this.f6327j & Uuid.SIZE_BITS) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void K() {
            this.f6331n.O(this);
        }

        /* access modifiers changed from: package-private */
        public boolean L() {
            if ((this.f6327j & 32) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f6327j) == 0) {
                g();
                this.f6328k.add(obj);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(int i4) {
            this.f6327j = i4 | this.f6327j;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f6321d = -1;
            this.f6324g = -1;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            List list = this.f6328k;
            if (list != null) {
                list.clear();
            }
            this.f6327j &= -1025;
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f6327j &= -33;
        }

        /* access modifiers changed from: package-private */
        public void f() {
            this.f6327j &= -257;
        }

        /* access modifiers changed from: package-private */
        public boolean h() {
            if ((this.f6327j & 16) != 0 || !P.P(this.f6318a)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public void i(int i4, int i5, boolean z3) {
            b(8);
            A(i5, z3);
            this.f6320c = i4;
        }

        public final int j() {
            RecyclerView recyclerView = this.f6335r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.h0(this);
        }

        public final long k() {
            return this.f6322e;
        }

        public final int l() {
            return this.f6323f;
        }

        public final int m() {
            int i4 = this.f6324g;
            if (i4 == -1) {
                return this.f6320c;
            }
            return i4;
        }

        public final int n() {
            return this.f6321d;
        }

        /* access modifiers changed from: package-private */
        public List o() {
            if ((this.f6327j & 1024) != 0) {
                return f6317t;
            }
            List list = this.f6328k;
            if (list == null || list.size() == 0) {
                return f6317t;
            }
            return this.f6329l;
        }

        /* access modifiers changed from: package-private */
        public boolean p(int i4) {
            if ((i4 & this.f6327j) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean q() {
            if ((this.f6327j & 512) != 0 || t()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean r() {
            if (this.f6318a.getParent() == null || this.f6318a.getParent() == this.f6335r) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean s() {
            if ((this.f6327j & 1) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean t() {
            if ((this.f6327j & 4) != 0) {
                return true;
            }
            return false;
        }

        public String toString() {
            String str;
            String str2;
            if (getClass().isAnonymousClass()) {
                str = "ViewHolder";
            } else {
                str = getClass().getSimpleName();
            }
            StringBuilder sb = new StringBuilder(str + "{" + Integer.toHexString(hashCode()) + " position=" + this.f6320c + " id=" + this.f6322e + ", oldPos=" + this.f6321d + ", pLpos:" + this.f6324g);
            if (w()) {
                sb.append(" scrap ");
                if (this.f6332o) {
                    str2 = "[changeScrap]";
                } else {
                    str2 = "[attachedScrap]";
                }
                sb.append(str2);
            }
            if (t()) {
                sb.append(" invalid");
            }
            if (!s()) {
                sb.append(" unbound");
            }
            if (z()) {
                sb.append(" update");
            }
            if (v()) {
                sb.append(" removed");
            }
            if (J()) {
                sb.append(" ignored");
            }
            if (x()) {
                sb.append(" tmpDetached");
            }
            if (!u()) {
                sb.append(" not recyclable(" + this.f6330m + ")");
            }
            if (q()) {
                sb.append(" undefined adapter position");
            }
            if (this.f6318a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public final boolean u() {
            if ((this.f6327j & 16) != 0 || P.P(this.f6318a)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean v() {
            if ((this.f6327j & 8) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean w() {
            if (this.f6331n != null) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean x() {
            if ((this.f6327j & 256) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean y() {
            if ((this.f6327j & 2) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean z() {
            if ((this.f6327j & 2) != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a  reason: case insensitive filesystem */
    class C0463a implements Runnable {
        C0463a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f6296v && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f6290s) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.f6302y) {
                    recyclerView2.f6300x = true;
                } else {
                    recyclerView2.z();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b  reason: case insensitive filesystem */
    class C0464b implements Runnable {
        C0464b() {
        }

        public void run() {
            l lVar = RecyclerView.this.f6244N;
            if (lVar != null) {
                lVar.u();
            }
            RecyclerView.this.f6283o0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c  reason: case insensitive filesystem */
    class C0465c implements Interpolator {
        C0465c() {
        }

        public float getInterpolation(float f4) {
            float f5 = f4 - 1.0f;
            return (f5 * f5 * f5 * f5 * f5) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d  reason: case insensitive filesystem */
    class C0466d implements w.b {
        C0466d() {
        }

        public void a(D d4) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f6280n.x1(d4.f6318a, recyclerView.f6258c);
        }

        public void b(D d4, l.b bVar, l.b bVar2) {
            RecyclerView.this.n(d4, bVar, bVar2);
        }

        public void c(D d4, l.b bVar, l.b bVar2) {
            RecyclerView.this.f6258c.O(d4);
            RecyclerView.this.p(d4, bVar, bVar2);
        }

        public void d(D d4, l.b bVar, l.b bVar2) {
            d4.G(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f6235E) {
                if (recyclerView.f6244N.b(d4, d4, bVar, bVar2)) {
                    RecyclerView.this.U0();
                }
            } else if (recyclerView.f6244N.d(d4, bVar, bVar2)) {
                RecyclerView.this.U0();
            }
        }
    }

    class e implements f.b {
        e() {
        }

        public View a(int i4) {
            return RecyclerView.this.getChildAt(i4);
        }

        public void b(View view) {
            D m02 = RecyclerView.m0(view);
            if (m02 != null) {
                m02.B(RecyclerView.this);
            }
        }

        public D c(View view) {
            return RecyclerView.m0(view);
        }

        public void d(int i4) {
            View a4 = a(i4);
            if (a4 != null) {
                D m02 = RecyclerView.m0(a4);
                if (m02 != null) {
                    if (!m02.x() || m02.J()) {
                        if (RecyclerView.f6218C0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("tmpDetach ");
                            sb.append(m02);
                        }
                        m02.b(256);
                    } else {
                        throw new IllegalArgumentException("called detach on an already detached child " + m02 + RecyclerView.this.U());
                    }
                }
            } else if (RecyclerView.f6217B0) {
                throw new IllegalArgumentException("No view at offset " + i4 + RecyclerView.this.U());
            }
            RecyclerView.this.detachViewFromParent(i4);
        }

        public void e(View view) {
            D m02 = RecyclerView.m0(view);
            if (m02 != null) {
                m02.C(RecyclerView.this);
            }
        }

        public void f(View view, int i4) {
            RecyclerView.this.addView(view, i4);
            RecyclerView.this.D(view);
        }

        public int g() {
            return RecyclerView.this.getChildCount();
        }

        public void h(int i4) {
            View childAt = RecyclerView.this.getChildAt(i4);
            if (childAt != null) {
                RecyclerView.this.E(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i4);
        }

        public void i() {
            int g4 = g();
            for (int i4 = 0; i4 < g4; i4++) {
                View a4 = a(i4);
                RecyclerView.this.E(a4);
                a4.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        public void j(View view, int i4, ViewGroup.LayoutParams layoutParams) {
            D m02 = RecyclerView.m0(view);
            if (m02 != null) {
                if (m02.x() || m02.J()) {
                    if (RecyclerView.f6218C0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("reAttach ");
                        sb.append(m02);
                    }
                    m02.f();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + m02 + RecyclerView.this.U());
                }
            } else if (RecyclerView.f6217B0) {
                throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + i4 + RecyclerView.this.U());
            }
            RecyclerView.this.attachViewToParent(view, i4, layoutParams);
        }

        public int k(View view) {
            return RecyclerView.this.indexOfChild(view);
        }
    }

    class f implements a.C0104a {
        f() {
        }

        public void a(int i4, int i5) {
            RecyclerView.this.K0(i4, i5);
            RecyclerView.this.f6277l0 = true;
        }

        public void b(a.b bVar) {
            i(bVar);
        }

        public D c(int i4) {
            D f02 = RecyclerView.this.f0(i4, true);
            if (f02 == null) {
                return null;
            }
            if (!RecyclerView.this.f6264f.n(f02.f6318a)) {
                return f02;
            }
            boolean z3 = RecyclerView.f6217B0;
            return null;
        }

        public void d(int i4, int i5) {
            RecyclerView.this.L0(i4, i5, false);
            RecyclerView.this.f6277l0 = true;
        }

        public void e(int i4, int i5) {
            RecyclerView.this.J0(i4, i5);
            RecyclerView.this.f6277l0 = true;
        }

        public void f(int i4, int i5) {
            RecyclerView.this.L0(i4, i5, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f6277l0 = true;
            recyclerView.f6271i0.f6417d += i5;
        }

        public void g(a.b bVar) {
            i(bVar);
        }

        public void h(int i4, int i5, Object obj) {
            RecyclerView.this.I1(i4, i5, obj);
            RecyclerView.this.f6279m0 = true;
        }

        /* access modifiers changed from: package-private */
        public void i(a.b bVar) {
            int i4 = bVar.f6495a;
            if (i4 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f6280n.b1(recyclerView, bVar.f6496b, bVar.f6498d);
            } else if (i4 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f6280n.e1(recyclerView2, bVar.f6496b, bVar.f6498d);
            } else if (i4 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f6280n.g1(recyclerView3, bVar.f6496b, bVar.f6498d, bVar.f6497c);
            } else if (i4 == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f6280n.d1(recyclerView4, bVar.f6496b, bVar.f6498d, 1);
            }
        }
    }

    static /* synthetic */ class g {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6342a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy[] r0 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6342a = r0
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r1 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6342a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r1 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.g.<clinit>():void");
        }
    }

    static class h extends Observable {
        h() {
        }

        public boolean a() {
            return !this.mObservers.isEmpty();
        }

        public void b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).a();
            }
        }

        public void c(int i4, int i5) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).d(i4, i5, 1);
            }
        }

        public void d(int i4, int i5, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).b(i4, i5, obj);
            }
        }

        public void e(int i4, int i5) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).c(i4, i5);
            }
        }

        public void f(int i4, int i5) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).e(i4, i5);
            }
        }
    }

    public static abstract class i {
        public abstract void a();

        public abstract void b(int i4, int i5, Object obj);

        public abstract void c(int i4, int i5);

        public abstract void d(int i4, int i5, int i6);

        public abstract void e(int i4, int i5);
    }

    public interface j {
    }

    public static class k {
        /* access modifiers changed from: protected */
        public abstract EdgeEffect a(RecyclerView recyclerView, int i4);
    }

    public static abstract class l {

        /* renamed from: a  reason: collision with root package name */
        private a f6343a = null;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList f6344b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private long f6345c = 120;

        /* renamed from: d  reason: collision with root package name */
        private long f6346d = 120;

        /* renamed from: e  reason: collision with root package name */
        private long f6347e = 250;

        /* renamed from: f  reason: collision with root package name */
        private long f6348f = 250;

        interface a {
            void a(D d4);
        }

        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public int f6349a;

            /* renamed from: b  reason: collision with root package name */
            public int f6350b;

            /* renamed from: c  reason: collision with root package name */
            public int f6351c;

            /* renamed from: d  reason: collision with root package name */
            public int f6352d;

            public b a(D d4) {
                return b(d4, 0);
            }

            public b b(D d4, int i4) {
                View view = d4.f6318a;
                this.f6349a = view.getLeft();
                this.f6350b = view.getTop();
                this.f6351c = view.getRight();
                this.f6352d = view.getBottom();
                return this;
            }
        }

        static int e(D d4) {
            int i4 = d4.f6327j;
            int i5 = i4 & 14;
            if (d4.t()) {
                return 4;
            }
            if ((i4 & 4) != 0) {
                return i5;
            }
            int n4 = d4.n();
            int j4 = d4.j();
            if (n4 == -1 || j4 == -1 || n4 == j4) {
                return i5;
            }
            return i5 | 2048;
        }

        public abstract boolean a(D d4, b bVar, b bVar2);

        public abstract boolean b(D d4, D d5, b bVar, b bVar2);

        public abstract boolean c(D d4, b bVar, b bVar2);

        public abstract boolean d(D d4, b bVar, b bVar2);

        public abstract boolean f(D d4);

        public boolean g(D d4, List list) {
            return f(d4);
        }

        public final void h(D d4) {
            r(d4);
            a aVar = this.f6343a;
            if (aVar != null) {
                aVar.a(d4);
            }
        }

        public final void i() {
            if (this.f6344b.size() <= 0) {
                this.f6344b.clear();
            } else {
                F.a(this.f6344b.get(0));
                throw null;
            }
        }

        public abstract void j(D d4);

        public abstract void k();

        public long l() {
            return this.f6345c;
        }

        public long m() {
            return this.f6348f;
        }

        public long n() {
            return this.f6347e;
        }

        public long o() {
            return this.f6346d;
        }

        public abstract boolean p();

        public b q() {
            return new b();
        }

        public void r(D d4) {
        }

        public b s(z zVar, D d4) {
            return q().a(d4);
        }

        public b t(z zVar, D d4, int i4, List list) {
            return q().a(d4);
        }

        public abstract void u();

        /* access modifiers changed from: package-private */
        public void v(a aVar) {
            this.f6343a = aVar;
        }
    }

    private class m implements l.a {
        m() {
        }

        public void a(D d4) {
            d4.G(true);
            if (d4.f6325h != null && d4.f6326i == null) {
                d4.f6325h = null;
            }
            d4.f6326i = null;
            if (!d4.I() && !RecyclerView.this.f1(d4.f6318a) && d4.x()) {
                RecyclerView.this.removeDetachedView(d4.f6318a, false);
            }
        }
    }

    public static abstract class n {
        public void d(Rect rect, int i4, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, z zVar) {
            d(rect, ((p) view.getLayoutParams()).t(), recyclerView);
        }

        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, z zVar) {
            f(canvas, recyclerView);
        }

        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, z zVar) {
            h(canvas, recyclerView);
        }
    }

    public static abstract class o {

        /* renamed from: a  reason: collision with root package name */
        f f6354a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView f6355b;

        /* renamed from: c  reason: collision with root package name */
        private final v.b f6356c;

        /* renamed from: d  reason: collision with root package name */
        private final v.b f6357d;

        /* renamed from: e  reason: collision with root package name */
        v f6358e;

        /* renamed from: f  reason: collision with root package name */
        v f6359f;

        /* renamed from: g  reason: collision with root package name */
        y f6360g;

        /* renamed from: h  reason: collision with root package name */
        boolean f6361h = false;

        /* renamed from: i  reason: collision with root package name */
        boolean f6362i = false;

        /* renamed from: j  reason: collision with root package name */
        boolean f6363j = false;

        /* renamed from: k  reason: collision with root package name */
        private boolean f6364k = true;

        /* renamed from: l  reason: collision with root package name */
        private boolean f6365l = true;

        /* renamed from: m  reason: collision with root package name */
        int f6366m;

        /* renamed from: n  reason: collision with root package name */
        boolean f6367n;

        /* renamed from: o  reason: collision with root package name */
        private int f6368o;

        /* renamed from: p  reason: collision with root package name */
        private int f6369p;

        /* renamed from: q  reason: collision with root package name */
        private int f6370q;

        /* renamed from: r  reason: collision with root package name */
        private int f6371r;

        class a implements v.b {
            a() {
            }

            public View a(int i4) {
                return o.this.V(i4);
            }

            public int b() {
                return o.this.x0() - o.this.getPaddingRight();
            }

            public int c(View view) {
                return o.this.d0(view) - ((p) view.getLayoutParams()).leftMargin;
            }

            public int d() {
                return o.this.getPaddingLeft();
            }

            public int e(View view) {
                return o.this.g0(view) + ((p) view.getLayoutParams()).rightMargin;
            }
        }

        class b implements v.b {
            b() {
            }

            public View a(int i4) {
                return o.this.V(i4);
            }

            public int b() {
                return o.this.j0() - o.this.getPaddingBottom();
            }

            public int c(View view) {
                return o.this.h0(view) - ((p) view.getLayoutParams()).topMargin;
            }

            public int d() {
                return o.this.getPaddingTop();
            }

            public int e(View view) {
                return o.this.b0(view) + ((p) view.getLayoutParams()).bottomMargin;
            }
        }

        public interface c {
            void a(int i4, int i5);
        }

        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f6374a;

            /* renamed from: b  reason: collision with root package name */
            public int f6375b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f6376c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f6377d;
        }

        public o() {
            a aVar = new a();
            this.f6356c = aVar;
            b bVar = new b();
            this.f6357d = bVar;
            this.f6358e = new v(aVar);
            this.f6359f = new v(bVar);
        }

        public static int A(int i4, int i5, int i6) {
            int mode = View.MeasureSpec.getMode(i4);
            int size = View.MeasureSpec.getSize(i4);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(size, Math.max(i5, i6));
            }
            if (mode != 1073741824) {
                return Math.max(i5, i6);
            }
            return size;
        }

        private boolean C0(RecyclerView recyclerView, int i4, int i5) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int x02 = x0() - getPaddingRight();
            int j02 = j0() - getPaddingBottom();
            Rect rect = this.f6355b.f6272j;
            c0(focusedChild, rect);
            if (rect.left - i4 >= x02 || rect.right - i4 <= paddingLeft || rect.top - i5 >= j02 || rect.bottom - i5 <= paddingTop) {
                return false;
            }
            return true;
        }

        private static boolean G0(int i4, int i5, int i6) {
            int mode = View.MeasureSpec.getMode(i5);
            int size = View.MeasureSpec.getSize(i5);
            if (i6 > 0 && i4 != i6) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode == 1073741824 && size == i4) {
                    return true;
                }
                return false;
            } else if (size >= i4) {
                return true;
            } else {
                return false;
            }
        }

        private void G1(u uVar, int i4, View view) {
            D m02 = RecyclerView.m0(view);
            if (m02.J()) {
                if (RecyclerView.f6218C0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ignoring view ");
                    sb.append(m02);
                }
            } else if (!m02.t() || m02.v() || this.f6355b.f6278m.h()) {
                K(i4);
                uVar.I(view);
                this.f6355b.f6266g.k(m02);
            } else {
                B1(i4);
                uVar.H(m02);
            }
        }

        private void L(int i4, View view) {
            this.f6354a.d(i4);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
            if (r5 == 1073741824) goto L_0x0022;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int X(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001d
                if (r7 < 0) goto L_0x0012
            L_0x0010:
                r5 = r3
                goto L_0x0030
            L_0x0012:
                if (r7 != r1) goto L_0x001a
                if (r5 == r2) goto L_0x0022
                if (r5 == 0) goto L_0x001a
                if (r5 == r3) goto L_0x0022
            L_0x001a:
                r5 = r6
                r7 = r5
                goto L_0x0030
            L_0x001d:
                if (r7 < 0) goto L_0x0020
                goto L_0x0010
            L_0x0020:
                if (r7 != r1) goto L_0x0024
            L_0x0022:
                r7 = r4
                goto L_0x0030
            L_0x0024:
                if (r7 != r0) goto L_0x001a
                if (r5 == r2) goto L_0x002e
                if (r5 != r3) goto L_0x002b
                goto L_0x002e
            L_0x002b:
                r7 = r4
                r5 = r6
                goto L_0x0030
            L_0x002e:
                r7 = r4
                r5 = r2
            L_0x0030:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.X(int, int, int, int, boolean):int");
        }

        private int[] Y(View view, Rect rect) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int x02 = x0() - getPaddingRight();
            int j02 = j0() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i4 = left - paddingLeft;
            int min = Math.min(0, i4);
            int i5 = top - paddingTop;
            int min2 = Math.min(0, i5);
            int i6 = width - x02;
            int max = Math.max(0, i6);
            int max2 = Math.max(0, height - j02);
            if (m0() != 1) {
                if (min == 0) {
                    min = Math.min(i4, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i6);
            }
            if (min2 == 0) {
                min2 = Math.min(i5, max2);
            }
            return new int[]{max, min2};
        }

        public static d r0(Context context, AttributeSet attributeSet, int i4, int i5) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, V.c.f1535a, i4, i5);
            dVar.f6374a = obtainStyledAttributes.getInt(V.c.f1536b, 1);
            dVar.f6375b = obtainStyledAttributes.getInt(V.c.f1546l, 1);
            dVar.f6376c = obtainStyledAttributes.getBoolean(V.c.f1545k, false);
            dVar.f6377d = obtainStyledAttributes.getBoolean(V.c.f1547m, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        private void s(View view, int i4, boolean z3) {
            D m02 = RecyclerView.m0(view);
            if (z3 || m02.v()) {
                this.f6355b.f6266g.b(m02);
            } else {
                this.f6355b.f6266g.p(m02);
            }
            p pVar = (p) view.getLayoutParams();
            if (m02.L() || m02.w()) {
                if (m02.w()) {
                    m02.K();
                } else {
                    m02.e();
                }
                this.f6354a.c(view, i4, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f6355b) {
                int m4 = this.f6354a.m(view);
                if (i4 == -1) {
                    i4 = this.f6354a.g();
                }
                if (m4 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f6355b.indexOfChild(view) + this.f6355b.U());
                } else if (m4 != i4) {
                    this.f6355b.f6280n.L0(m4, i4);
                }
            } else {
                this.f6354a.a(view, i4, false);
                pVar.f6380c = true;
                y yVar = this.f6360g;
                if (yVar != null && yVar.h()) {
                    this.f6360g.k(view);
                }
            }
            if (pVar.f6381d) {
                if (RecyclerView.f6218C0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("consuming pending invalidate on child ");
                    sb.append(pVar.f6378a);
                }
                m02.f6318a.invalidate();
                pVar.f6381d = false;
            }
        }

        public boolean A0() {
            return this.f6362i;
        }

        public void A1(View view) {
            this.f6354a.p(view);
        }

        public void B(int i4, int i5, z zVar, c cVar) {
        }

        public boolean B0() {
            return this.f6363j;
        }

        public void B1(int i4) {
            if (V(i4) != null) {
                this.f6354a.q(i4);
            }
        }

        public void C(int i4, c cVar) {
        }

        public boolean C1(RecyclerView recyclerView, View view, Rect rect, boolean z3) {
            return D1(recyclerView, view, rect, z3, false);
        }

        public abstract int D(z zVar);

        public final boolean D0() {
            return this.f6365l;
        }

        public boolean D1(RecyclerView recyclerView, View view, Rect rect, boolean z3, boolean z4) {
            int[] Y3 = Y(view, rect);
            int i4 = Y3[0];
            int i5 = Y3[1];
            if ((z4 && !C0(recyclerView, i4, i5)) || (i4 == 0 && i5 == 0)) {
                return false;
            }
            if (z3) {
                recyclerView.scrollBy(i4, i5);
            } else {
                recyclerView.w1(i4, i5);
            }
            return true;
        }

        public abstract int E(z zVar);

        public boolean E0(u uVar, z zVar) {
            return false;
        }

        public void E1() {
            RecyclerView recyclerView = this.f6355b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public abstract int F(z zVar);

        public boolean F0() {
            return this.f6364k;
        }

        public void F1() {
            this.f6361h = true;
        }

        public abstract int G(z zVar);

        public abstract int H(z zVar);

        public boolean H0() {
            y yVar = this.f6360g;
            if (yVar == null || !yVar.h()) {
                return false;
            }
            return true;
        }

        public abstract int H1(int i4, u uVar, z zVar);

        public abstract int I(z zVar);

        public boolean I0(View view, boolean z3, boolean z4) {
            boolean z5;
            if (!this.f6358e.b(view, 24579) || !this.f6359f.b(view, 24579)) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (z3) {
                return z5;
            }
            return !z5;
        }

        public abstract void I1(int i4);

        public void J(u uVar) {
            for (int W3 = W() - 1; W3 >= 0; W3--) {
                G1(uVar, W3, V(W3));
            }
        }

        public void J0(View view, int i4, int i5, int i6, int i7) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.f6379b;
            view.layout(i4 + rect.left + pVar.leftMargin, i5 + rect.top + pVar.topMargin, (i6 - rect.right) - pVar.rightMargin, (i7 - rect.bottom) - pVar.bottomMargin);
        }

        public abstract int J1(int i4, u uVar, z zVar);

        public void K(int i4) {
            L(i4, V(i4));
        }

        public void K0(View view, int i4, int i5) {
            p pVar = (p) view.getLayoutParams();
            Rect q02 = this.f6355b.q0(view);
            int i6 = i4 + q02.left + q02.right;
            int i7 = i5 + q02.top + q02.bottom;
            int X3 = X(x0(), y0(), getPaddingLeft() + getPaddingRight() + pVar.leftMargin + pVar.rightMargin + i6, pVar.width, x());
            int X4 = X(j0(), k0(), getPaddingTop() + getPaddingBottom() + pVar.topMargin + pVar.bottomMargin + i7, pVar.height, y());
            if (Q1(view, X3, X4, pVar)) {
                view.measure(X3, X4);
            }
        }

        /* access modifiers changed from: package-private */
        public void K1(RecyclerView recyclerView) {
            L1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public void L0(int i4, int i5) {
            View V3 = V(i4);
            if (V3 != null) {
                K(i4);
                u(V3, i5);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i4 + this.f6355b.toString());
        }

        /* access modifiers changed from: package-private */
        public void L1(int i4, int i5) {
            this.f6370q = View.MeasureSpec.getSize(i4);
            int mode = View.MeasureSpec.getMode(i4);
            this.f6368o = mode;
            if (mode == 0 && !RecyclerView.f6222G0) {
                this.f6370q = 0;
            }
            this.f6371r = View.MeasureSpec.getSize(i5);
            int mode2 = View.MeasureSpec.getMode(i5);
            this.f6369p = mode2;
            if (mode2 == 0 && !RecyclerView.f6222G0) {
                this.f6371r = 0;
            }
        }

        /* access modifiers changed from: package-private */
        public void M(RecyclerView recyclerView) {
            this.f6362i = true;
            Q0(recyclerView);
        }

        public void M0(int i4) {
            RecyclerView recyclerView = this.f6355b;
            if (recyclerView != null) {
                recyclerView.H0(i4);
            }
        }

        public void M1(int i4, int i5) {
            this.f6355b.setMeasuredDimension(i4, i5);
        }

        /* access modifiers changed from: package-private */
        public void N(RecyclerView recyclerView, u uVar) {
            this.f6362i = false;
            S0(recyclerView, uVar);
        }

        public void N0(int i4) {
            RecyclerView recyclerView = this.f6355b;
            if (recyclerView != null) {
                recyclerView.I0(i4);
            }
        }

        public void N1(Rect rect, int i4, int i5) {
            M1(A(i4, rect.width() + getPaddingLeft() + getPaddingRight(), p0()), A(i5, rect.height() + getPaddingTop() + getPaddingBottom(), o0()));
        }

        public View O(View view) {
            View X3;
            RecyclerView recyclerView = this.f6355b;
            if (recyclerView == null || (X3 = recyclerView.X(view)) == null || this.f6354a.n(X3)) {
                return null;
            }
            return X3;
        }

        public void O0(Adapter adapter, Adapter adapter2) {
        }

        /* access modifiers changed from: package-private */
        public void O1(int i4, int i5) {
            int W3 = W();
            if (W3 == 0) {
                this.f6355b.B(i4, i5);
                return;
            }
            int i6 = Integer.MIN_VALUE;
            int i7 = Integer.MAX_VALUE;
            int i8 = Integer.MIN_VALUE;
            int i9 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < W3; i10++) {
                View V3 = V(i10);
                Rect rect = this.f6355b.f6272j;
                c0(V3, rect);
                int i11 = rect.left;
                if (i11 < i9) {
                    i9 = i11;
                }
                int i12 = rect.right;
                if (i12 > i6) {
                    i6 = i12;
                }
                int i13 = rect.top;
                if (i13 < i7) {
                    i7 = i13;
                }
                int i14 = rect.bottom;
                if (i14 > i8) {
                    i8 = i14;
                }
            }
            this.f6355b.f6272j.set(i9, i7, i6, i8);
            N1(this.f6355b.f6272j, i4, i5);
        }

        public View P(int i4) {
            int W3 = W();
            for (int i5 = 0; i5 < W3; i5++) {
                View V3 = V(i5);
                D m02 = RecyclerView.m0(V3);
                if (m02 != null && m02.m() == i4 && !m02.J() && (this.f6355b.f6271i0.e() || !m02.v())) {
                    return V3;
                }
            }
            return null;
        }

        public boolean P0(RecyclerView recyclerView, ArrayList arrayList, int i4, int i5) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public void P1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f6355b = null;
                this.f6354a = null;
                this.f6370q = 0;
                this.f6371r = 0;
            } else {
                this.f6355b = recyclerView;
                this.f6354a = recyclerView.f6264f;
                this.f6370q = recyclerView.getWidth();
                this.f6371r = recyclerView.getHeight();
            }
            this.f6368o = 1073741824;
            this.f6369p = 1073741824;
        }

        public abstract p Q();

        public void Q0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        public boolean Q1(View view, int i4, int i5, p pVar) {
            if (view.isLayoutRequested() || !this.f6364k || !G0(view.getWidth(), i4, pVar.width) || !G0(view.getHeight(), i5, pVar.height)) {
                return true;
            }
            return false;
        }

        public p R(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public void R0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        public boolean R1() {
            return false;
        }

        public p S(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof p) {
                return new p((p) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new p((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new p(layoutParams);
        }

        public void S0(RecyclerView recyclerView, u uVar) {
            R0(recyclerView);
        }

        /* access modifiers changed from: package-private */
        public boolean S1(View view, int i4, int i5, p pVar) {
            if (!this.f6364k || !G0(view.getMeasuredWidth(), i4, pVar.width) || !G0(view.getMeasuredHeight(), i5, pVar.height)) {
                return true;
            }
            return false;
        }

        public int T() {
            return -1;
        }

        public View T0(View view, int i4, u uVar, z zVar) {
            return null;
        }

        public abstract void T1(RecyclerView recyclerView, z zVar, int i4);

        public int U(View view) {
            return ((p) view.getLayoutParams()).f6379b.bottom;
        }

        public void U0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f6355b;
            V0(recyclerView.f6258c, recyclerView.f6271i0, accessibilityEvent);
        }

        public void U1(y yVar) {
            y yVar2 = this.f6360g;
            if (!(yVar2 == null || yVar == yVar2 || !yVar2.h())) {
                this.f6360g.r();
            }
            this.f6360g = yVar;
            yVar.q(this.f6355b, this);
        }

        public View V(int i4) {
            f fVar = this.f6354a;
            if (fVar != null) {
                return fVar.f(i4);
            }
            return null;
        }

        public void V0(u uVar, z zVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f6355b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z3 = true;
                if (!recyclerView.canScrollVertically(1) && !this.f6355b.canScrollVertically(-1) && !this.f6355b.canScrollHorizontally(-1) && !this.f6355b.canScrollHorizontally(1)) {
                    z3 = false;
                }
                accessibilityEvent.setScrollable(z3);
                Adapter adapter = this.f6355b.f6278m;
                if (adapter != null) {
                    accessibilityEvent.setItemCount(adapter.d());
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void V1() {
            y yVar = this.f6360g;
            if (yVar != null) {
                yVar.r();
            }
        }

        public int W() {
            f fVar = this.f6354a;
            if (fVar != null) {
                return fVar.g();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public void W0(androidx.core.view.accessibility.A a4) {
            RecyclerView recyclerView = this.f6355b;
            X0(recyclerView.f6258c, recyclerView.f6271i0, a4);
        }

        public boolean W1() {
            return false;
        }

        public void X0(u uVar, z zVar, androidx.core.view.accessibility.A a4) {
            if (this.f6355b.canScrollVertically(-1) || this.f6355b.canScrollHorizontally(-1)) {
                a4.a(8192);
                a4.B0(true);
            }
            if (this.f6355b.canScrollVertically(1) || this.f6355b.canScrollHorizontally(1)) {
                a4.a(4096);
                a4.B0(true);
            }
            a4.l0(A.f.a(t0(uVar, zVar), a0(uVar, zVar), E0(uVar, zVar), u0(uVar, zVar)));
        }

        /* access modifiers changed from: package-private */
        public void Y0(View view, androidx.core.view.accessibility.A a4) {
            D m02 = RecyclerView.m0(view);
            if (m02 != null && !m02.v() && !this.f6354a.n(m02.f6318a)) {
                RecyclerView recyclerView = this.f6355b;
                Z0(recyclerView.f6258c, recyclerView.f6271i0, view, a4);
            }
        }

        public boolean Z() {
            RecyclerView recyclerView = this.f6355b;
            if (recyclerView == null || !recyclerView.f6268h) {
                return false;
            }
            return true;
        }

        public void Z0(u uVar, z zVar, View view, androidx.core.view.accessibility.A a4) {
        }

        public int a0(u uVar, z zVar) {
            return -1;
        }

        public View a1(View view, int i4) {
            return null;
        }

        public int b0(View view) {
            return view.getBottom() + U(view);
        }

        public void b1(RecyclerView recyclerView, int i4, int i5) {
        }

        public void c0(View view, Rect rect) {
            RecyclerView.n0(view, rect);
        }

        public void c1(RecyclerView recyclerView) {
        }

        public int d0(View view) {
            return view.getLeft() - n0(view);
        }

        public void d1(RecyclerView recyclerView, int i4, int i5, int i6) {
        }

        public int e0(View view) {
            Rect rect = ((p) view.getLayoutParams()).f6379b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void e1(RecyclerView recyclerView, int i4, int i5) {
        }

        public int f0(View view) {
            Rect rect = ((p) view.getLayoutParams()).f6379b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void f1(RecyclerView recyclerView, int i4, int i5) {
        }

        public int g0(View view) {
            return view.getRight() + s0(view);
        }

        public void g1(RecyclerView recyclerView, int i4, int i5, Object obj) {
            f1(recyclerView, i4, i5);
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.f6355b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.f6355b;
            if (recyclerView != null) {
                return P.F(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.f6355b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.f6355b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.f6355b;
            if (recyclerView != null) {
                return P.G(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.f6355b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int h0(View view) {
            return view.getTop() - v0(view);
        }

        public abstract void h1(u uVar, z zVar);

        public View i0() {
            View focusedChild;
            RecyclerView recyclerView = this.f6355b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f6354a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void i1(z zVar) {
        }

        public int j0() {
            return this.f6371r;
        }

        public void j1(u uVar, z zVar, int i4, int i5) {
            this.f6355b.B(i4, i5);
        }

        public int k0() {
            return this.f6369p;
        }

        public boolean k1(RecyclerView recyclerView, View view, View view2) {
            if (H0() || recyclerView.B0()) {
                return true;
            }
            return false;
        }

        public int l0() {
            Adapter adapter;
            RecyclerView recyclerView = this.f6355b;
            if (recyclerView != null) {
                adapter = recyclerView.getAdapter();
            } else {
                adapter = null;
            }
            if (adapter != null) {
                return adapter.d();
            }
            return 0;
        }

        public boolean l1(RecyclerView recyclerView, z zVar, View view, View view2) {
            return k1(recyclerView, view, view2);
        }

        public int m0() {
            return P.B(this.f6355b);
        }

        public void m1(Parcelable parcelable) {
        }

        public int n0(View view) {
            return ((p) view.getLayoutParams()).f6379b.left;
        }

        public Parcelable n1() {
            return null;
        }

        public void o(View view) {
            p(view, -1);
        }

        public int o0() {
            return P.C(this.f6355b);
        }

        public void o1(int i4) {
        }

        public void p(View view, int i4) {
            s(view, i4, true);
        }

        public int p0() {
            return P.D(this.f6355b);
        }

        /* access modifiers changed from: package-private */
        public void p1(y yVar) {
            if (this.f6360g == yVar) {
                this.f6360g = null;
            }
        }

        public void q(View view) {
            r(view, -1);
        }

        public int q0(View view) {
            return ((p) view.getLayoutParams()).t();
        }

        /* access modifiers changed from: package-private */
        public boolean q1(int i4, Bundle bundle) {
            RecyclerView recyclerView = this.f6355b;
            return r1(recyclerView.f6258c, recyclerView.f6271i0, i4, bundle);
        }

        public void r(View view, int i4) {
            s(view, i4, false);
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x0094 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean r1(androidx.recyclerview.widget.RecyclerView.u r9, androidx.recyclerview.widget.RecyclerView.z r10, int r11, android.os.Bundle r12) {
            /*
                r8 = this;
                androidx.recyclerview.widget.RecyclerView r9 = r8.f6355b
                r10 = 0
                if (r9 != 0) goto L_0x0006
                return r10
            L_0x0006:
                int r9 = r8.j0()
                int r12 = r8.x0()
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                androidx.recyclerview.widget.RecyclerView r1 = r8.f6355b
                android.graphics.Matrix r1 = r1.getMatrix()
                boolean r1 = r1.isIdentity()
                if (r1 == 0) goto L_0x002f
                androidx.recyclerview.widget.RecyclerView r1 = r8.f6355b
                boolean r1 = r1.getGlobalVisibleRect(r0)
                if (r1 == 0) goto L_0x002f
                int r9 = r0.height()
                int r12 = r0.width()
            L_0x002f:
                r0 = 4096(0x1000, float:5.74E-42)
                r1 = 1
                if (r11 == r0) goto L_0x006a
                r0 = 8192(0x2000, float:1.14794E-41)
                if (r11 == r0) goto L_0x003b
                r3 = r10
                r4 = r3
                goto L_0x0092
            L_0x003b:
                androidx.recyclerview.widget.RecyclerView r11 = r8.f6355b
                r0 = -1
                boolean r11 = r11.canScrollVertically(r0)
                if (r11 == 0) goto L_0x0050
                int r11 = r8.getPaddingTop()
                int r9 = r9 - r11
                int r11 = r8.getPaddingBottom()
                int r9 = r9 - r11
                int r9 = -r9
                goto L_0x0051
            L_0x0050:
                r9 = r10
            L_0x0051:
                androidx.recyclerview.widget.RecyclerView r11 = r8.f6355b
                boolean r11 = r11.canScrollHorizontally(r0)
                if (r11 == 0) goto L_0x0067
                int r11 = r8.getPaddingLeft()
                int r12 = r12 - r11
                int r11 = r8.getPaddingRight()
                int r12 = r12 - r11
                int r11 = -r12
            L_0x0064:
                r4 = r9
                r3 = r11
                goto L_0x0092
            L_0x0067:
                r4 = r9
                r3 = r10
                goto L_0x0092
            L_0x006a:
                androidx.recyclerview.widget.RecyclerView r11 = r8.f6355b
                boolean r11 = r11.canScrollVertically(r1)
                if (r11 == 0) goto L_0x007d
                int r11 = r8.getPaddingTop()
                int r9 = r9 - r11
                int r11 = r8.getPaddingBottom()
                int r9 = r9 - r11
                goto L_0x007e
            L_0x007d:
                r9 = r10
            L_0x007e:
                androidx.recyclerview.widget.RecyclerView r11 = r8.f6355b
                boolean r11 = r11.canScrollHorizontally(r1)
                if (r11 == 0) goto L_0x0067
                int r11 = r8.getPaddingLeft()
                int r12 = r12 - r11
                int r11 = r8.getPaddingRight()
                int r11 = r12 - r11
                goto L_0x0064
            L_0x0092:
                if (r4 != 0) goto L_0x0097
                if (r3 != 0) goto L_0x0097
                return r10
            L_0x0097:
                androidx.recyclerview.widget.RecyclerView r2 = r8.f6355b
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
                r7 = 1
                r5 = 0
                r2.z1(r3, r4, r5, r6, r7)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.r1(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z, int, android.os.Bundle):boolean");
        }

        public int s0(View view) {
            return ((p) view.getLayoutParams()).f6379b.right;
        }

        /* access modifiers changed from: package-private */
        public boolean s1(View view, int i4, Bundle bundle) {
            RecyclerView recyclerView = this.f6355b;
            return t1(recyclerView.f6258c, recyclerView.f6271i0, view, i4, bundle);
        }

        public void t(String str) {
            RecyclerView recyclerView = this.f6355b;
            if (recyclerView != null) {
                recyclerView.q(str);
            }
        }

        public int t0(u uVar, z zVar) {
            return -1;
        }

        public boolean t1(u uVar, z zVar, View view, int i4, Bundle bundle) {
            return false;
        }

        public void u(View view, int i4) {
            v(view, i4, (p) view.getLayoutParams());
        }

        public int u0(u uVar, z zVar) {
            return 0;
        }

        public void u1() {
            for (int W3 = W() - 1; W3 >= 0; W3--) {
                this.f6354a.q(W3);
            }
        }

        public void v(View view, int i4, p pVar) {
            D m02 = RecyclerView.m0(view);
            if (m02.v()) {
                this.f6355b.f6266g.b(m02);
            } else {
                this.f6355b.f6266g.p(m02);
            }
            this.f6354a.c(view, i4, pVar, m02.v());
        }

        public int v0(View view) {
            return ((p) view.getLayoutParams()).f6379b.top;
        }

        public void v1(u uVar) {
            for (int W3 = W() - 1; W3 >= 0; W3--) {
                if (!RecyclerView.m0(V(W3)).J()) {
                    y1(W3, uVar);
                }
            }
        }

        public void w(View view, Rect rect) {
            RecyclerView recyclerView = this.f6355b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.q0(view));
            }
        }

        public void w0(View view, boolean z3, Rect rect) {
            Matrix matrix;
            if (z3) {
                Rect rect2 = ((p) view.getLayoutParams()).f6379b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f6355b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f6355b.f6276l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* access modifiers changed from: package-private */
        public void w1(u uVar) {
            int j4 = uVar.j();
            for (int i4 = j4 - 1; i4 >= 0; i4--) {
                View n4 = uVar.n(i4);
                D m02 = RecyclerView.m0(n4);
                if (!m02.J()) {
                    m02.G(false);
                    if (m02.x()) {
                        this.f6355b.removeDetachedView(n4, false);
                    }
                    l lVar = this.f6355b.f6244N;
                    if (lVar != null) {
                        lVar.j(m02);
                    }
                    m02.G(true);
                    uVar.D(n4);
                }
            }
            uVar.e();
            if (j4 > 0) {
                this.f6355b.invalidate();
            }
        }

        public abstract boolean x();

        public int x0() {
            return this.f6370q;
        }

        public void x1(View view, u uVar) {
            A1(view);
            uVar.G(view);
        }

        public abstract boolean y();

        public int y0() {
            return this.f6368o;
        }

        public void y1(int i4, u uVar) {
            View V3 = V(i4);
            B1(i4);
            uVar.G(V3);
        }

        public boolean z(p pVar) {
            return pVar != null;
        }

        /* access modifiers changed from: package-private */
        public boolean z0() {
            int W3 = W();
            for (int i4 = 0; i4 < W3; i4++) {
                ViewGroup.LayoutParams layoutParams = V(i4).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean z1(Runnable runnable) {
            RecyclerView recyclerView = this.f6355b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }
    }

    public static abstract class q {
        public abstract boolean a(int i4, int i5);
    }

    public interface r {
        boolean a(RecyclerView recyclerView, MotionEvent motionEvent);

        void b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z3);
    }

    public static abstract class s {
        public void a(RecyclerView recyclerView, int i4) {
        }

        public void b(RecyclerView recyclerView, int i4, int i5) {
        }
    }

    public static class t {

        /* renamed from: a  reason: collision with root package name */
        SparseArray f6382a = new SparseArray();

        /* renamed from: b  reason: collision with root package name */
        int f6383b = 0;

        /* renamed from: c  reason: collision with root package name */
        Set f6384c = Collections.newSetFromMap(new IdentityHashMap());

        static class a {

            /* renamed from: a  reason: collision with root package name */
            final ArrayList f6385a = new ArrayList();

            /* renamed from: b  reason: collision with root package name */
            int f6386b = 5;

            /* renamed from: c  reason: collision with root package name */
            long f6387c = 0;

            /* renamed from: d  reason: collision with root package name */
            long f6388d = 0;

            a() {
            }
        }

        private a i(int i4) {
            a aVar = (a) this.f6382a.get(i4);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f6382a.put(i4, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f6383b++;
        }

        /* access modifiers changed from: package-private */
        public void b(Adapter adapter) {
            this.f6384c.add(adapter);
        }

        public void c() {
            for (int i4 = 0; i4 < this.f6382a.size(); i4++) {
                a aVar = (a) this.f6382a.valueAt(i4);
                Iterator it = aVar.f6385a.iterator();
                while (it.hasNext()) {
                    L.a.a(((D) it.next()).f6318a);
                }
                aVar.f6385a.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f6383b--;
        }

        /* access modifiers changed from: package-private */
        public void e(Adapter adapter, boolean z3) {
            this.f6384c.remove(adapter);
            if (this.f6384c.size() == 0 && !z3) {
                for (int i4 = 0; i4 < this.f6382a.size(); i4++) {
                    SparseArray sparseArray = this.f6382a;
                    ArrayList arrayList = ((a) sparseArray.get(sparseArray.keyAt(i4))).f6385a;
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        L.a.a(((D) arrayList.get(i5)).f6318a);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void f(int i4, long j4) {
            a i5 = i(i4);
            i5.f6388d = l(i5.f6388d, j4);
        }

        /* access modifiers changed from: package-private */
        public void g(int i4, long j4) {
            a i5 = i(i4);
            i5.f6387c = l(i5.f6387c, j4);
        }

        public D h(int i4) {
            a aVar = (a) this.f6382a.get(i4);
            if (aVar == null || aVar.f6385a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.f6385a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((D) arrayList.get(size)).r()) {
                    return (D) arrayList.remove(size);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void j(Adapter adapter, Adapter adapter2, boolean z3) {
            if (adapter != null) {
                d();
            }
            if (!z3 && this.f6383b == 0) {
                c();
            }
            if (adapter2 != null) {
                a();
            }
        }

        public void k(D d4) {
            int l4 = d4.l();
            ArrayList arrayList = i(l4).f6385a;
            if (((a) this.f6382a.get(l4)).f6386b <= arrayList.size()) {
                L.a.a(d4.f6318a);
            } else if (!RecyclerView.f6217B0 || !arrayList.contains(d4)) {
                d4.D();
                arrayList.add(d4);
            } else {
                throw new IllegalArgumentException("this scrap item already exists");
            }
        }

        /* access modifiers changed from: package-private */
        public long l(long j4, long j5) {
            if (j4 == 0) {
                return j5;
            }
            return ((j4 / 4) * 3) + (j5 / 4);
        }

        /* access modifiers changed from: package-private */
        public boolean m(int i4, long j4, long j5) {
            long j6 = i(i4).f6388d;
            if (j6 == 0 || j4 + j6 < j5) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean n(int i4, long j4, long j5) {
            long j6 = i(i4).f6387c;
            if (j6 == 0 || j4 + j6 < j5) {
                return true;
            }
            return false;
        }
    }

    public final class u {

        /* renamed from: a  reason: collision with root package name */
        final ArrayList f6389a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList f6390b = null;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList f6391c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private final List f6392d;

        /* renamed from: e  reason: collision with root package name */
        private int f6393e;

        /* renamed from: f  reason: collision with root package name */
        int f6394f;

        /* renamed from: g  reason: collision with root package name */
        t f6395g;

        public u() {
            ArrayList arrayList = new ArrayList();
            this.f6389a = arrayList;
            this.f6392d = Collections.unmodifiableList(arrayList);
            this.f6393e = 2;
            this.f6394f = 2;
        }

        private void B(Adapter adapter) {
            C(adapter, false);
        }

        private void C(Adapter adapter, boolean z3) {
            t tVar = this.f6395g;
            if (tVar != null) {
                tVar.e(adapter, z3);
            }
        }

        private boolean M(D d4, int i4, int i5, long j4) {
            d4.f6336s = null;
            d4.f6335r = RecyclerView.this;
            int l4 = d4.l();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z3 = false;
            if (j4 != Long.MAX_VALUE && !this.f6395g.m(l4, nanoTime, j4)) {
                return false;
            }
            if (d4.x()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(d4.f6318a, recyclerView.getChildCount(), d4.f6318a.getLayoutParams());
                z3 = true;
            }
            RecyclerView.this.f6278m.a(d4, i4);
            if (z3) {
                RecyclerView.this.detachViewFromParent(d4.f6318a);
            }
            this.f6395g.f(d4.l(), RecyclerView.this.getNanoTime() - nanoTime);
            b(d4);
            if (RecyclerView.this.f6271i0.e()) {
                d4.f6324g = i5;
            }
            return true;
        }

        private void b(D d4) {
            if (RecyclerView.this.A0()) {
                View view = d4.f6318a;
                if (P.z(view) == 0) {
                    P.y0(view, 1);
                }
                r rVar = RecyclerView.this.f6285p0;
                if (rVar != null) {
                    C0402a n4 = rVar.n();
                    if (n4 instanceof r.a) {
                        ((r.a) n4).o(view);
                    }
                    P.o0(view, n4);
                }
            }
        }

        private void q(ViewGroup viewGroup, boolean z3) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z3) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        private void r(D d4) {
            View view = d4.f6318a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        private void u() {
            if (this.f6395g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f6278m != null && recyclerView.isAttachedToWindow()) {
                    this.f6395g.b(RecyclerView.this.f6278m);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void A() {
            for (int i4 = 0; i4 < this.f6391c.size(); i4++) {
                L.a.a(((D) this.f6391c.get(i4)).f6318a);
            }
            B(RecyclerView.this.f6278m);
        }

        /* access modifiers changed from: package-private */
        public void D(View view) {
            D m02 = RecyclerView.m0(view);
            m02.f6331n = null;
            m02.f6332o = false;
            m02.e();
            H(m02);
        }

        /* access modifiers changed from: package-private */
        public void E() {
            for (int size = this.f6391c.size() - 1; size >= 0; size--) {
                F(size);
            }
            this.f6391c.clear();
            if (RecyclerView.f6224I0) {
                RecyclerView.this.f6269h0.b();
            }
        }

        /* access modifiers changed from: package-private */
        public void F(int i4) {
            if (RecyclerView.f6218C0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Recycling cached view at index ");
                sb.append(i4);
            }
            D d4 = (D) this.f6391c.get(i4);
            if (RecyclerView.f6218C0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("CachedViewHolder to be recycled: ");
                sb2.append(d4);
            }
            a(d4, true);
            this.f6391c.remove(i4);
        }

        public void G(View view) {
            D m02 = RecyclerView.m0(view);
            if (m02.x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (m02.w()) {
                m02.K();
            } else if (m02.L()) {
                m02.e();
            }
            H(m02);
            if (RecyclerView.this.f6244N != null && !m02.u()) {
                RecyclerView.this.f6244N.j(m02);
            }
        }

        /* access modifiers changed from: package-private */
        public void H(D d4) {
            boolean z3;
            boolean z4;
            boolean z5 = false;
            boolean z6 = true;
            if (d4.w() || d4.f6318a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(d4.w());
                sb.append(" isAttached:");
                if (d4.f6318a.getParent() != null) {
                    z5 = true;
                }
                sb.append(z5);
                sb.append(RecyclerView.this.U());
                throw new IllegalArgumentException(sb.toString());
            } else if (d4.x()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d4 + RecyclerView.this.U());
            } else if (!d4.J()) {
                boolean h4 = d4.h();
                Adapter adapter = RecyclerView.this.f6278m;
                if (adapter == null || !h4 || !adapter.s(d4)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!RecyclerView.f6217B0 || !this.f6391c.contains(d4)) {
                    if (z3 || d4.u()) {
                        if (this.f6394f <= 0 || d4.p(526)) {
                            z4 = false;
                        } else {
                            int size = this.f6391c.size();
                            if (size >= this.f6394f && size > 0) {
                                F(0);
                                size--;
                            }
                            if (RecyclerView.f6224I0 && size > 0 && !RecyclerView.this.f6269h0.d(d4.f6320c)) {
                                int i4 = size - 1;
                                while (i4 >= 0) {
                                    if (!RecyclerView.this.f6269h0.d(((D) this.f6391c.get(i4)).f6320c)) {
                                        break;
                                    }
                                    i4--;
                                }
                                size = i4 + 1;
                            }
                            this.f6391c.add(size, d4);
                            z4 = true;
                        }
                        if (!z4) {
                            a(d4, true);
                        } else {
                            z6 = false;
                        }
                        z5 = z4;
                    } else {
                        if (RecyclerView.f6218C0) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists");
                            sb2.append(RecyclerView.this.U());
                        }
                        z6 = false;
                    }
                    RecyclerView.this.f6266g.q(d4);
                    if (!z5 && !z6 && h4) {
                        L.a.a(d4.f6318a);
                        d4.f6336s = null;
                        d4.f6335r = null;
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("cached view received recycle internal? " + d4 + RecyclerView.this.U());
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.U());
            }
        }

        /* access modifiers changed from: package-private */
        public void I(View view) {
            D m02 = RecyclerView.m0(view);
            if (!m02.p(12) && m02.y() && !RecyclerView.this.r(m02)) {
                if (this.f6390b == null) {
                    this.f6390b = new ArrayList();
                }
                m02.H(this, true);
                this.f6390b.add(m02);
            } else if (!m02.t() || m02.v() || RecyclerView.this.f6278m.h()) {
                m02.H(this, false);
                this.f6389a.add(m02);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.U());
            }
        }

        /* access modifiers changed from: package-private */
        public void J(t tVar) {
            B(RecyclerView.this.f6278m);
            t tVar2 = this.f6395g;
            if (tVar2 != null) {
                tVar2.d();
            }
            this.f6395g = tVar;
            if (!(tVar == null || RecyclerView.this.getAdapter() == null)) {
                this.f6395g.a();
            }
            u();
        }

        /* access modifiers changed from: package-private */
        public void K(B b4) {
        }

        public void L(int i4) {
            this.f6393e = i4;
            P();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0166  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x018f  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0192  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x01ed  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x01fb  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.D N(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x021e
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r1 = r1.f6271i0
                int r1 = r1.b()
                if (r3 >= r1) goto L_0x021e
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r1 = r1.f6271i0
                boolean r1 = r1.e()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$D r1 = r16.h(r17)
                if (r1 == 0) goto L_0x0028
                r4 = r7
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = r8
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$D r1 = r16.m(r17, r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.Q(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.b(r5)
                boolean r5 = r1.w()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.f6318a
                r5.removeDetachedView(r9, r8)
                r1.K()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.L()
                if (r5 == 0) goto L_0x0057
                r1.e()
            L_0x0057:
                r6.H(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = r7
            L_0x005d:
                if (r1 != 0) goto L_0x010d
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.f6262e
                int r5 = r5.m(r3)
                if (r5 < 0) goto L_0x010f
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r9 = r9.f6278m
                int r9 = r9.d()
                if (r5 >= r9) goto L_0x010f
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r9 = r9.f6278m
                int r9 = r9.f(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r10 = r10.f6278m
                boolean r10 = r10.h()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r1 = r1.f6278m
                long r10 = r1.e(r5)
                androidx.recyclerview.widget.RecyclerView$D r1 = r6.l(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.f6320c = r5
                r4 = r7
            L_0x0096:
                if (r1 != 0) goto L_0x00c3
                boolean r0 = androidx.recyclerview.widget.RecyclerView.f6218C0
                if (r0 == 0) goto L_0x00ae
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "tryGetViewHolderForPositionByDeadline("
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = ") fetching from shared pool"
                r0.append(r1)
            L_0x00ae:
                androidx.recyclerview.widget.RecyclerView$t r0 = r16.i()
                androidx.recyclerview.widget.RecyclerView$D r0 = r0.h(r9)
                if (r0 == 0) goto L_0x00c2
                r0.D()
                boolean r1 = androidx.recyclerview.widget.RecyclerView.f6221F0
                if (r1 == 0) goto L_0x00c2
                r6.r(r0)
            L_0x00c2:
                r1 = r0
            L_0x00c3:
                if (r1 != 0) goto L_0x010d
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x00e1
                androidx.recyclerview.widget.RecyclerView$t r10 = r6.f6395g
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.n(r11, r12, r14)
                if (r5 != 0) goto L_0x00e1
                return r2
            L_0x00e1:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r5 = r2.f6278m
                androidx.recyclerview.widget.RecyclerView$D r2 = r5.c(r2, r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.f6224I0
                if (r5 == 0) goto L_0x00fc
                android.view.View r5 = r2.f6318a
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.b0(r5)
                if (r5 == 0) goto L_0x00fc
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.f6319b = r10
            L_0x00fc:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$t r5 = r6.f6395g
                long r10 = r10 - r0
                r5.g(r9, r10)
                boolean r0 = androidx.recyclerview.widget.RecyclerView.f6217B0
                r9 = r2
            L_0x010b:
                r10 = r4
                goto L_0x0147
            L_0x010d:
                r9 = r1
                goto L_0x010b
            L_0x010f:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r2 = r2.f6271i0
                int r2 = r2.b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.U()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0147:
                if (r10 == 0) goto L_0x017f
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r0 = r0.f6271i0
                boolean r0 = r0.e()
                if (r0 != 0) goto L_0x017f
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r9.p(r0)
                if (r1 == 0) goto L_0x017f
                r9.F(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r0 = r0.f6271i0
                boolean r0 = r0.f6424k
                if (r0 == 0) goto L_0x017f
                int r0 = androidx.recyclerview.widget.RecyclerView.l.e(r9)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$l r2 = r1.f6244N
                androidx.recyclerview.widget.RecyclerView$z r1 = r1.f6271i0
                java.util.List r4 = r9.o()
                androidx.recyclerview.widget.RecyclerView$l$b r0 = r2.t(r1, r9, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.Z0(r9, r0)
            L_0x017f:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r0 = r0.f6271i0
                boolean r0 = r0.e()
                if (r0 == 0) goto L_0x0192
                boolean r0 = r9.s()
                if (r0 == 0) goto L_0x0192
                r9.f6324g = r3
                goto L_0x01a5
            L_0x0192:
                boolean r0 = r9.s()
                if (r0 == 0) goto L_0x01a7
                boolean r0 = r9.z()
                if (r0 != 0) goto L_0x01a7
                boolean r0 = r9.t()
                if (r0 == 0) goto L_0x01a5
                goto L_0x01a7
            L_0x01a5:
                r0 = r8
                goto L_0x01e5
            L_0x01a7:
                boolean r0 = androidx.recyclerview.widget.RecyclerView.f6217B0
                if (r0 == 0) goto L_0x01d2
                boolean r0 = r9.v()
                if (r0 != 0) goto L_0x01b2
                goto L_0x01d2
            L_0x01b2:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Removed holder should be bound and it should come here only in pre-layout. Holder: "
                r1.append(r2)
                r1.append(r9)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.U()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x01d2:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f6262e
                int r2 = r0.m(r3)
                r0 = r16
                r1 = r9
                r3 = r17
                r4 = r19
                boolean r0 = r0.M(r1, r2, r3, r4)
            L_0x01e5:
                android.view.View r1 = r9.f6318a
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x01fb
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.p) r1
                android.view.View r2 = r9.f6318a
                r2.setLayoutParams(r1)
                goto L_0x0213
            L_0x01fb:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x0211
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.p) r1
                android.view.View r2 = r9.f6318a
                r2.setLayoutParams(r1)
                goto L_0x0213
            L_0x0211:
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.p) r1
            L_0x0213:
                r1.f6378a = r9
                if (r10 == 0) goto L_0x021a
                if (r0 == 0) goto L_0x021a
                goto L_0x021b
            L_0x021a:
                r7 = r8
            L_0x021b:
                r1.f6381d = r7
                return r9
            L_0x021e:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r2 = r2.f6271i0
                int r2 = r2.b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.U()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.u.N(int, boolean, long):androidx.recyclerview.widget.RecyclerView$D");
        }

        /* access modifiers changed from: package-private */
        public void O(D d4) {
            if (d4.f6332o) {
                this.f6390b.remove(d4);
            } else {
                this.f6389a.remove(d4);
            }
            d4.f6331n = null;
            d4.f6332o = false;
            d4.e();
        }

        /* access modifiers changed from: package-private */
        public void P() {
            int i4;
            o oVar = RecyclerView.this.f6280n;
            if (oVar != null) {
                i4 = oVar.f6366m;
            } else {
                i4 = 0;
            }
            this.f6394f = this.f6393e + i4;
            for (int size = this.f6391c.size() - 1; size >= 0 && this.f6391c.size() > this.f6394f; size--) {
                F(size);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean Q(D d4) {
            if (!d4.v()) {
                int i4 = d4.f6320c;
                if (i4 < 0 || i4 >= RecyclerView.this.f6278m.d()) {
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d4 + RecyclerView.this.U());
                } else if (!RecyclerView.this.f6271i0.e() && RecyclerView.this.f6278m.f(d4.f6320c) != d4.l()) {
                    return false;
                } else {
                    if (!RecyclerView.this.f6278m.h()) {
                        return true;
                    }
                    if (d4.k() == RecyclerView.this.f6278m.e(d4.f6320c)) {
                        return true;
                    }
                    return false;
                }
            } else if (!RecyclerView.f6217B0 || RecyclerView.this.f6271i0.e()) {
                return RecyclerView.this.f6271i0.e();
            } else {
                throw new IllegalStateException("should not receive a removed view unless it is pre layout" + RecyclerView.this.U());
            }
        }

        /* access modifiers changed from: package-private */
        public void R(int i4, int i5) {
            int i6;
            int i7 = i5 + i4;
            for (int size = this.f6391c.size() - 1; size >= 0; size--) {
                D d4 = (D) this.f6391c.get(size);
                if (d4 != null && (i6 = d4.f6320c) >= i4 && i6 < i7) {
                    d4.b(2);
                    F(size);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(D d4, boolean z3) {
            C0402a aVar;
            RecyclerView.t(d4);
            View view = d4.f6318a;
            r rVar = RecyclerView.this.f6285p0;
            if (rVar != null) {
                C0402a n4 = rVar.n();
                if (n4 instanceof r.a) {
                    aVar = ((r.a) n4).n(view);
                } else {
                    aVar = null;
                }
                P.o0(view, aVar);
            }
            if (z3) {
                g(d4);
            }
            d4.f6336s = null;
            d4.f6335r = null;
            i().k(d4);
        }

        public void c() {
            this.f6389a.clear();
            E();
        }

        /* access modifiers changed from: package-private */
        public void d() {
            int size = this.f6391c.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((D) this.f6391c.get(i4)).c();
            }
            int size2 = this.f6389a.size();
            for (int i5 = 0; i5 < size2; i5++) {
                ((D) this.f6389a.get(i5)).c();
            }
            ArrayList arrayList = this.f6390b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    ((D) this.f6390b.get(i6)).c();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f6389a.clear();
            ArrayList arrayList = this.f6390b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i4) {
            if (i4 < 0 || i4 >= RecyclerView.this.f6271i0.b()) {
                throw new IndexOutOfBoundsException("invalid position " + i4 + ". State item count is " + RecyclerView.this.f6271i0.b() + RecyclerView.this.U());
            } else if (!RecyclerView.this.f6271i0.e()) {
                return i4;
            } else {
                return RecyclerView.this.f6262e.m(i4);
            }
        }

        /* access modifiers changed from: package-private */
        public void g(D d4) {
            RecyclerView.this.getClass();
            if (RecyclerView.this.f6282o.size() <= 0) {
                Adapter adapter = RecyclerView.this.f6278m;
                if (adapter != null) {
                    adapter.v(d4);
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f6271i0 != null) {
                    recyclerView.f6266g.q(d4);
                }
                if (RecyclerView.f6218C0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("dispatchViewRecycled: ");
                    sb.append(d4);
                    return;
                }
                return;
            }
            F.a(RecyclerView.this.f6282o.get(0));
            throw null;
        }

        /* access modifiers changed from: package-private */
        public D h(int i4) {
            int size;
            int m4;
            ArrayList arrayList = this.f6390b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                int i5 = 0;
                int i6 = 0;
                while (i6 < size) {
                    D d4 = (D) this.f6390b.get(i6);
                    if (d4.L() || d4.m() != i4) {
                        i6++;
                    } else {
                        d4.b(32);
                        return d4;
                    }
                }
                if (RecyclerView.this.f6278m.h() && (m4 = RecyclerView.this.f6262e.m(i4)) > 0 && m4 < RecyclerView.this.f6278m.d()) {
                    long e4 = RecyclerView.this.f6278m.e(m4);
                    while (i5 < size) {
                        D d5 = (D) this.f6390b.get(i5);
                        if (d5.L() || d5.k() != e4) {
                            i5++;
                        } else {
                            d5.b(32);
                            return d5;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public t i() {
            if (this.f6395g == null) {
                this.f6395g = new t();
                u();
            }
            return this.f6395g;
        }

        /* access modifiers changed from: package-private */
        public int j() {
            return this.f6389a.size();
        }

        public List k() {
            return this.f6392d;
        }

        /* access modifiers changed from: package-private */
        public D l(long j4, int i4, boolean z3) {
            for (int size = this.f6389a.size() - 1; size >= 0; size--) {
                D d4 = (D) this.f6389a.get(size);
                if (d4.k() == j4 && !d4.L()) {
                    if (i4 == d4.l()) {
                        d4.b(32);
                        if (d4.v() && !RecyclerView.this.f6271i0.e()) {
                            d4.F(2, 14);
                        }
                        return d4;
                    } else if (!z3) {
                        this.f6389a.remove(size);
                        RecyclerView.this.removeDetachedView(d4.f6318a, false);
                        D(d4.f6318a);
                    }
                }
            }
            int size2 = this.f6391c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                D d5 = (D) this.f6391c.get(size2);
                if (d5.k() == j4 && !d5.r()) {
                    if (i4 == d5.l()) {
                        if (!z3) {
                            this.f6391c.remove(size2);
                        }
                        return d5;
                    } else if (!z3) {
                        F(size2);
                        return null;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public D m(int i4, boolean z3) {
            View e4;
            int size = this.f6389a.size();
            int i5 = 0;
            int i6 = 0;
            while (i6 < size) {
                D d4 = (D) this.f6389a.get(i6);
                if (d4.L() || d4.m() != i4 || d4.t() || (!RecyclerView.this.f6271i0.f6421h && d4.v())) {
                    i6++;
                } else {
                    d4.b(32);
                    return d4;
                }
            }
            if (z3 || (e4 = RecyclerView.this.f6264f.e(i4)) == null) {
                int size2 = this.f6391c.size();
                while (i5 < size2) {
                    D d5 = (D) this.f6391c.get(i5);
                    if (d5.t() || d5.m() != i4 || d5.r()) {
                        i5++;
                    } else {
                        if (!z3) {
                            this.f6391c.remove(i5);
                        }
                        if (RecyclerView.f6218C0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("getScrapOrHiddenOrCachedHolderForPosition(");
                            sb.append(i4);
                            sb.append(") found match in cache: ");
                            sb.append(d5);
                        }
                        return d5;
                    }
                }
                return null;
            }
            D m02 = RecyclerView.m0(e4);
            RecyclerView.this.f6264f.s(e4);
            int m4 = RecyclerView.this.f6264f.m(e4);
            if (m4 != -1) {
                RecyclerView.this.f6264f.d(m4);
                I(e4);
                m02.b(8224);
                return m02;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + m02 + RecyclerView.this.U());
        }

        /* access modifiers changed from: package-private */
        public View n(int i4) {
            return ((D) this.f6389a.get(i4)).f6318a;
        }

        public View o(int i4) {
            return p(i4, false);
        }

        /* access modifiers changed from: package-private */
        public View p(int i4, boolean z3) {
            return N(i4, z3, Long.MAX_VALUE).f6318a;
        }

        /* access modifiers changed from: package-private */
        public void s() {
            int size = this.f6391c.size();
            for (int i4 = 0; i4 < size; i4++) {
                p pVar = (p) ((D) this.f6391c.get(i4)).f6318a.getLayoutParams();
                if (pVar != null) {
                    pVar.f6380c = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void t() {
            int size = this.f6391c.size();
            for (int i4 = 0; i4 < size; i4++) {
                D d4 = (D) this.f6391c.get(i4);
                if (d4 != null) {
                    d4.b(6);
                    d4.a((Object) null);
                }
            }
            Adapter adapter = RecyclerView.this.f6278m;
            if (adapter == null || !adapter.h()) {
                E();
            }
        }

        /* access modifiers changed from: package-private */
        public void v(int i4, int i5) {
            int size = this.f6391c.size();
            for (int i6 = 0; i6 < size; i6++) {
                D d4 = (D) this.f6391c.get(i6);
                if (d4 != null && d4.f6320c >= i4) {
                    if (RecyclerView.f6218C0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("offsetPositionRecordsForInsert cached ");
                        sb.append(i6);
                        sb.append(" holder ");
                        sb.append(d4);
                        sb.append(" now at position ");
                        sb.append(d4.f6320c + i5);
                    }
                    d4.A(i5, false);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void w(int i4, int i5) {
            int i6;
            int i7;
            int i8;
            int i9;
            if (i4 < i5) {
                i8 = -1;
                i7 = i4;
                i6 = i5;
            } else {
                i8 = 1;
                i6 = i4;
                i7 = i5;
            }
            int size = this.f6391c.size();
            for (int i10 = 0; i10 < size; i10++) {
                D d4 = (D) this.f6391c.get(i10);
                if (d4 != null && (i9 = d4.f6320c) >= i7 && i9 <= i6) {
                    if (i9 == i4) {
                        d4.A(i5 - i4, false);
                    } else {
                        d4.A(i8, false);
                    }
                    if (RecyclerView.f6218C0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("offsetPositionRecordsForMove cached child ");
                        sb.append(i10);
                        sb.append(" holder ");
                        sb.append(d4);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void x(int i4, int i5, boolean z3) {
            int i6 = i4 + i5;
            for (int size = this.f6391c.size() - 1; size >= 0; size--) {
                D d4 = (D) this.f6391c.get(size);
                if (d4 != null) {
                    int i7 = d4.f6320c;
                    if (i7 >= i6) {
                        if (RecyclerView.f6218C0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("offsetPositionRecordsForRemove cached ");
                            sb.append(size);
                            sb.append(" holder ");
                            sb.append(d4);
                            sb.append(" now at position ");
                            sb.append(d4.f6320c - i5);
                        }
                        d4.A(-i5, z3);
                    } else if (i7 >= i4) {
                        d4.b(8);
                        F(size);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void y(Adapter adapter, Adapter adapter2, boolean z3) {
            c();
            C(adapter, true);
            i().j(adapter, adapter2, z3);
            u();
        }

        /* access modifiers changed from: package-private */
        public void z() {
            u();
        }
    }

    public interface v {
    }

    private class w extends i {
        w() {
        }

        public void a() {
            RecyclerView.this.q((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f6271i0.f6420g = true;
            recyclerView.X0(true);
            if (!RecyclerView.this.f6262e.p()) {
                RecyclerView.this.requestLayout();
            }
        }

        public void b(int i4, int i5, Object obj) {
            RecyclerView.this.q((String) null);
            if (RecyclerView.this.f6262e.r(i4, i5, obj)) {
                f();
            }
        }

        public void c(int i4, int i5) {
            RecyclerView.this.q((String) null);
            if (RecyclerView.this.f6262e.s(i4, i5)) {
                f();
            }
        }

        public void d(int i4, int i5, int i6) {
            RecyclerView.this.q((String) null);
            if (RecyclerView.this.f6262e.t(i4, i5, i6)) {
                f();
            }
        }

        public void e(int i4, int i5) {
            RecyclerView.this.q((String) null);
            if (RecyclerView.this.f6262e.u(i4, i5)) {
                f();
            }
        }

        /* access modifiers changed from: package-private */
        public void f() {
            if (RecyclerView.f6223H0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f6292t && recyclerView.f6290s) {
                    P.g0(recyclerView, recyclerView.f6270i);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f6232B = true;
            recyclerView2.requestLayout();
        }
    }

    public static abstract class y {

        /* renamed from: a  reason: collision with root package name */
        private int f6399a = -1;

        /* renamed from: b  reason: collision with root package name */
        private RecyclerView f6400b;

        /* renamed from: c  reason: collision with root package name */
        private o f6401c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f6402d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f6403e;

        /* renamed from: f  reason: collision with root package name */
        private View f6404f;

        /* renamed from: g  reason: collision with root package name */
        private final a f6405g = new a(0, 0);

        /* renamed from: h  reason: collision with root package name */
        private boolean f6406h;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private int f6407a;

            /* renamed from: b  reason: collision with root package name */
            private int f6408b;

            /* renamed from: c  reason: collision with root package name */
            private int f6409c;

            /* renamed from: d  reason: collision with root package name */
            private int f6410d;

            /* renamed from: e  reason: collision with root package name */
            private Interpolator f6411e;

            /* renamed from: f  reason: collision with root package name */
            private boolean f6412f;

            /* renamed from: g  reason: collision with root package name */
            private int f6413g;

            public a(int i4, int i5) {
                this(i4, i5, Integer.MIN_VALUE, (Interpolator) null);
            }

            private void e() {
                if (this.f6411e != null && this.f6409c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f6409c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* access modifiers changed from: package-private */
            public boolean a() {
                if (this.f6410d >= 0) {
                    return true;
                }
                return false;
            }

            public void b(int i4) {
                this.f6410d = i4;
            }

            /* access modifiers changed from: package-private */
            public void c(RecyclerView recyclerView) {
                int i4 = this.f6410d;
                if (i4 >= 0) {
                    this.f6410d = -1;
                    recyclerView.D0(i4);
                    this.f6412f = false;
                } else if (this.f6412f) {
                    e();
                    recyclerView.f6265f0.e(this.f6407a, this.f6408b, this.f6409c, this.f6411e);
                    int i5 = this.f6413g + 1;
                    this.f6413g = i5;
                    if (i5 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f6412f = false;
                } else {
                    this.f6413g = 0;
                }
            }

            public void d(int i4, int i5, int i6, Interpolator interpolator) {
                this.f6407a = i4;
                this.f6408b = i5;
                this.f6409c = i6;
                this.f6411e = interpolator;
                this.f6412f = true;
            }

            public a(int i4, int i5, int i6, Interpolator interpolator) {
                this.f6410d = -1;
                this.f6412f = false;
                this.f6413g = 0;
                this.f6407a = i4;
                this.f6408b = i5;
                this.f6409c = i6;
                this.f6411e = interpolator;
            }
        }

        public interface b {
            PointF f(int i4);
        }

        public PointF a(int i4) {
            o e4 = e();
            if (e4 instanceof b) {
                return ((b) e4).f(i4);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i4) {
            return this.f6400b.f6280n.P(i4);
        }

        public int c() {
            return this.f6400b.f6280n.W();
        }

        public int d(View view) {
            return this.f6400b.k0(view);
        }

        public o e() {
            return this.f6401c;
        }

        public int f() {
            return this.f6399a;
        }

        public boolean g() {
            return this.f6402d;
        }

        public boolean h() {
            return this.f6403e;
        }

        /* access modifiers changed from: protected */
        public void i(PointF pointF) {
            float f4 = pointF.x;
            float f5 = pointF.y;
            float sqrt = (float) Math.sqrt((double) ((f4 * f4) + (f5 * f5)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* access modifiers changed from: package-private */
        public void j(int i4, int i5) {
            PointF a4;
            RecyclerView recyclerView = this.f6400b;
            if (this.f6399a == -1 || recyclerView == null) {
                r();
            }
            if (this.f6402d && this.f6404f == null && this.f6401c != null && (a4 = a(this.f6399a)) != null) {
                float f4 = a4.x;
                if (!(f4 == 0.0f && a4.y == 0.0f)) {
                    recyclerView.q1((int) Math.signum(f4), (int) Math.signum(a4.y), (int[]) null);
                }
            }
            this.f6402d = false;
            View view = this.f6404f;
            if (view != null) {
                if (d(view) == this.f6399a) {
                    o(this.f6404f, recyclerView.f6271i0, this.f6405g);
                    this.f6405g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f6404f = null;
                }
            }
            if (this.f6403e) {
                l(i4, i5, recyclerView.f6271i0, this.f6405g);
                boolean a5 = this.f6405g.a();
                this.f6405g.c(recyclerView);
                if (a5 && this.f6403e) {
                    this.f6402d = true;
                    recyclerView.f6265f0.d();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void k(View view) {
            if (d(view) == f()) {
                this.f6404f = view;
                boolean z3 = RecyclerView.f6217B0;
            }
        }

        /* access modifiers changed from: protected */
        public abstract void l(int i4, int i5, z zVar, a aVar);

        /* access modifiers changed from: protected */
        public abstract void m();

        /* access modifiers changed from: protected */
        public abstract void n();

        /* access modifiers changed from: protected */
        public abstract void o(View view, z zVar, a aVar);

        public void p(int i4) {
            this.f6399a = i4;
        }

        /* access modifiers changed from: package-private */
        public void q(RecyclerView recyclerView, o oVar) {
            recyclerView.f6265f0.f();
            if (this.f6406h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f6400b = recyclerView;
            this.f6401c = oVar;
            int i4 = this.f6399a;
            if (i4 != -1) {
                recyclerView.f6271i0.f6414a = i4;
                this.f6403e = true;
                this.f6402d = true;
                this.f6404f = b(f());
                m();
                this.f6400b.f6265f0.d();
                this.f6406h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* access modifiers changed from: protected */
        public final void r() {
            if (this.f6403e) {
                this.f6403e = false;
                n();
                this.f6400b.f6271i0.f6414a = -1;
                this.f6404f = null;
                this.f6399a = -1;
                this.f6402d = false;
                this.f6401c.p1(this);
                this.f6401c = null;
                this.f6400b = null;
            }
        }
    }

    public static class z {

        /* renamed from: a  reason: collision with root package name */
        int f6414a = -1;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray f6415b;

        /* renamed from: c  reason: collision with root package name */
        int f6416c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f6417d = 0;

        /* renamed from: e  reason: collision with root package name */
        int f6418e = 1;

        /* renamed from: f  reason: collision with root package name */
        int f6419f = 0;

        /* renamed from: g  reason: collision with root package name */
        boolean f6420g = false;

        /* renamed from: h  reason: collision with root package name */
        boolean f6421h = false;

        /* renamed from: i  reason: collision with root package name */
        boolean f6422i = false;

        /* renamed from: j  reason: collision with root package name */
        boolean f6423j = false;

        /* renamed from: k  reason: collision with root package name */
        boolean f6424k = false;

        /* renamed from: l  reason: collision with root package name */
        boolean f6425l = false;

        /* renamed from: m  reason: collision with root package name */
        int f6426m;

        /* renamed from: n  reason: collision with root package name */
        long f6427n;

        /* renamed from: o  reason: collision with root package name */
        int f6428o;

        /* renamed from: p  reason: collision with root package name */
        int f6429p;

        /* renamed from: q  reason: collision with root package name */
        int f6430q;

        /* access modifiers changed from: package-private */
        public void a(int i4) {
            if ((this.f6418e & i4) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i4) + " but it is " + Integer.toBinaryString(this.f6418e));
            }
        }

        public int b() {
            if (this.f6421h) {
                return this.f6416c - this.f6417d;
            }
            return this.f6419f;
        }

        public int c() {
            return this.f6414a;
        }

        public boolean d() {
            if (this.f6414a != -1) {
                return true;
            }
            return false;
        }

        public boolean e() {
            return this.f6421h;
        }

        /* access modifiers changed from: package-private */
        public void f(Adapter adapter) {
            this.f6418e = 1;
            this.f6419f = adapter.d();
            this.f6421h = false;
            this.f6422i = false;
            this.f6423j = false;
        }

        public boolean g() {
            return this.f6425l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f6414a + ", mData=" + this.f6415b + ", mItemCount=" + this.f6419f + ", mIsMeasuring=" + this.f6423j + ", mPreviousLayoutItemCount=" + this.f6416c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f6417d + ", mStructureChanged=" + this.f6420g + ", mInPreLayout=" + this.f6421h + ", mRunSimpleAnimations=" + this.f6424k + ", mRunPredictiveAnimations=" + this.f6425l + '}';
        }
    }

    static {
        Class cls = Integer.TYPE;
        f6227L0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void A(Context context, String str, AttributeSet attributeSet, int i4, int i5) {
        ClassLoader classLoader;
        Object[] objArr;
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String p02 = p0(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(p02, false, classLoader).asSubclass(o.class);
                    try {
                        constructor = asSubclass.getConstructor(f6227L0);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i4), Integer.valueOf(i5)};
                    } catch (NoSuchMethodException e4) {
                        objArr = null;
                        constructor = asSubclass.getConstructor((Class[]) null);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((o) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e5) {
                    e5.initCause(e4);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + p02, e5);
                } catch (ClassNotFoundException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + p02, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + p02, e7);
                } catch (InstantiationException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + p02, e8);
                } catch (IllegalAccessException e9) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + p02, e9);
                } catch (ClassCastException e10) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + p02, e10);
                }
            }
        }
    }

    private boolean C(int i4, int i5) {
        a0(this.f6287q0);
        int[] iArr = this.f6287q0;
        if (iArr[0] == i4 && iArr[1] == i5) {
            return false;
        }
        return true;
    }

    private boolean C0(View view, View view2, int i4) {
        int i5;
        int i6;
        if (view2 == null || view2 == this || view2 == view || X(view2) == null) {
            return false;
        }
        if (view == null || X(view) == null) {
            return true;
        }
        this.f6272j.set(0, 0, view.getWidth(), view.getHeight());
        this.f6274k.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f6272j);
        offsetDescendantRectToMyCoords(view2, this.f6274k);
        char c4 = 65535;
        if (this.f6280n.m0() == 1) {
            i5 = -1;
        } else {
            i5 = 1;
        }
        Rect rect = this.f6272j;
        int i7 = rect.left;
        Rect rect2 = this.f6274k;
        int i8 = rect2.left;
        if ((i7 < i8 || rect.right <= i8) && rect.right < rect2.right) {
            i6 = 1;
        } else {
            int i9 = rect.right;
            int i10 = rect2.right;
            if ((i9 > i10 || i7 >= i10) && i7 > i8) {
                i6 = -1;
            } else {
                i6 = 0;
            }
        }
        int i11 = rect.top;
        int i12 = rect2.top;
        if ((i11 < i12 || rect.bottom <= i12) && rect.bottom < rect2.bottom) {
            c4 = 1;
        } else {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            if ((i13 <= i14 && i11 < i14) || i11 <= i12) {
                c4 = 0;
            }
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 17) {
                    if (i4 != 33) {
                        if (i4 != 66) {
                            if (i4 != 130) {
                                throw new IllegalArgumentException("Invalid direction: " + i4 + U());
                            } else if (c4 > 0) {
                                return true;
                            } else {
                                return false;
                            }
                        } else if (i6 > 0) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (c4 < 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (i6 < 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (c4 > 0 || (c4 == 0 && i6 * i5 > 0)) {
                return true;
            } else {
                return false;
            }
        } else if (c4 < 0 || (c4 == 0 && i6 * i5 < 0)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean D1(MotionEvent motionEvent) {
        boolean z3;
        EdgeEffect edgeEffect = this.f6240J;
        if (edgeEffect == null || androidx.core.widget.e.b(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z3 = false;
        } else {
            androidx.core.widget.e.d(this.f6240J, 0.0f, 1.0f - (motionEvent.getY() / ((float) getHeight())));
            z3 = true;
        }
        EdgeEffect edgeEffect2 = this.f6242L;
        if (!(edgeEffect2 == null || androidx.core.widget.e.b(edgeEffect2) == 0.0f || canScrollHorizontally(1))) {
            androidx.core.widget.e.d(this.f6242L, 0.0f, motionEvent.getY() / ((float) getHeight()));
            z3 = true;
        }
        EdgeEffect edgeEffect3 = this.f6241K;
        if (!(edgeEffect3 == null || androidx.core.widget.e.b(edgeEffect3) == 0.0f || canScrollVertically(-1))) {
            androidx.core.widget.e.d(this.f6241K, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z3 = true;
        }
        EdgeEffect edgeEffect4 = this.f6243M;
        if (edgeEffect4 == null || androidx.core.widget.e.b(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z3;
        }
        androidx.core.widget.e.d(this.f6243M, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    private void F() {
        int i4 = this.f6230A;
        this.f6230A = 0;
        if (i4 != 0 && A0()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C0405b.b(obtain, i4);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void G0(int i4, int i5, MotionEvent motionEvent, int i6) {
        boolean z3;
        float f4;
        float f5;
        int i7;
        int i8;
        int i9;
        o oVar = this.f6280n;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f6302y) {
            int[] iArr = this.f6295u0;
            int i10 = 0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean x3 = oVar.x();
            boolean y3 = this.f6280n.y();
            if (y3) {
                z3 = x3 | true;
            } else {
                z3 = x3;
            }
            if (motionEvent == null) {
                f4 = ((float) getHeight()) / 2.0f;
            } else {
                f4 = motionEvent.getY();
            }
            if (motionEvent == null) {
                f5 = ((float) getWidth()) / 2.0f;
            } else {
                f5 = motionEvent.getX();
            }
            int c12 = i4 - c1(i4, f4);
            int d12 = i5 - d1(i5, f5);
            C1(z3 ? 1 : 0, i6);
            if (x3) {
                i7 = c12;
            } else {
                i7 = 0;
            }
            if (y3) {
                i8 = d12;
            } else {
                i8 = 0;
            }
            if (K(i7, i8, this.f6295u0, this.f6291s0, i6)) {
                int[] iArr2 = this.f6295u0;
                c12 -= iArr2[0];
                d12 -= iArr2[1];
            }
            if (x3) {
                i9 = c12;
            } else {
                i9 = 0;
            }
            if (y3) {
                i10 = d12;
            }
            p1(i9, i10, motionEvent, i6);
            j jVar = this.f6267g0;
            if (!(jVar == null || (c12 == 0 && d12 == 0))) {
                jVar.f(this, c12, d12);
            }
            F1(i6);
        }
    }

    private void H() {
        boolean z3 = true;
        this.f6271i0.a(1);
        V(this.f6271i0);
        this.f6271i0.f6423j = false;
        B1();
        this.f6266g.f();
        O0();
        W0();
        n1();
        z zVar = this.f6271i0;
        if (!zVar.f6424k || !this.f6279m0) {
            z3 = false;
        }
        zVar.f6422i = z3;
        this.f6279m0 = false;
        this.f6277l0 = false;
        zVar.f6421h = zVar.f6425l;
        zVar.f6419f = this.f6278m.d();
        a0(this.f6287q0);
        if (this.f6271i0.f6424k) {
            int g4 = this.f6264f.g();
            for (int i4 = 0; i4 < g4; i4++) {
                D m02 = m0(this.f6264f.f(i4));
                if (!m02.J() && (!m02.t() || this.f6278m.h())) {
                    this.f6266g.e(m02, this.f6244N.t(this.f6271i0, m02, l.e(m02), m02.o()));
                    if (this.f6271i0.f6422i && m02.y() && !m02.v() && !m02.J() && !m02.t()) {
                        this.f6266g.c(i0(m02), m02);
                    }
                }
            }
        }
        if (this.f6271i0.f6425l) {
            o1();
            z zVar2 = this.f6271i0;
            boolean z4 = zVar2.f6420g;
            zVar2.f6420g = false;
            this.f6280n.h1(this.f6258c, zVar2);
            this.f6271i0.f6420g = z4;
            for (int i5 = 0; i5 < this.f6264f.g(); i5++) {
                D m03 = m0(this.f6264f.f(i5));
                if (!m03.J() && !this.f6266g.i(m03)) {
                    int e4 = l.e(m03);
                    boolean p4 = m03.p(8192);
                    if (!p4) {
                        e4 |= 4096;
                    }
                    l.b t4 = this.f6244N.t(this.f6271i0, m03, e4, m03.o());
                    if (p4) {
                        Z0(m03, t4);
                    } else {
                        this.f6266g.a(m03, t4);
                    }
                }
            }
            u();
        } else {
            u();
        }
        P0();
        E1(false);
        this.f6271i0.f6418e = 2;
    }

    private void H1() {
        this.f6265f0.f();
        o oVar = this.f6280n;
        if (oVar != null) {
            oVar.V1();
        }
    }

    private void I() {
        boolean z3;
        B1();
        O0();
        this.f6271i0.a(6);
        this.f6262e.j();
        this.f6271i0.f6419f = this.f6278m.d();
        this.f6271i0.f6417d = 0;
        if (this.f6260d != null && this.f6278m.b()) {
            Parcelable parcelable = this.f6260d.f6398c;
            if (parcelable != null) {
                this.f6280n.m1(parcelable);
            }
            this.f6260d = null;
        }
        z zVar = this.f6271i0;
        zVar.f6421h = false;
        this.f6280n.h1(this.f6258c, zVar);
        z zVar2 = this.f6271i0;
        zVar2.f6420g = false;
        if (!zVar2.f6424k || this.f6244N == null) {
            z3 = false;
        } else {
            z3 = true;
        }
        zVar2.f6424k = z3;
        zVar2.f6418e = 4;
        P0();
        E1(false);
    }

    private void J() {
        this.f6271i0.a(4);
        B1();
        O0();
        z zVar = this.f6271i0;
        zVar.f6418e = 1;
        if (zVar.f6424k) {
            for (int g4 = this.f6264f.g() - 1; g4 >= 0; g4--) {
                D m02 = m0(this.f6264f.f(g4));
                if (!m02.J()) {
                    long i02 = i0(m02);
                    l.b s4 = this.f6244N.s(this.f6271i0, m02);
                    D g5 = this.f6266g.g(i02);
                    if (g5 == null || g5.J()) {
                        this.f6266g.d(m02, s4);
                    } else {
                        boolean h4 = this.f6266g.h(g5);
                        boolean h5 = this.f6266g.h(m02);
                        if (!h4 || g5 != m02) {
                            l.b n4 = this.f6266g.n(g5);
                            this.f6266g.d(m02, s4);
                            l.b m4 = this.f6266g.m(m02);
                            if (n4 == null) {
                                s0(i02, m02, g5);
                            } else {
                                o(g5, m02, n4, m4, h4, h5);
                            }
                        } else {
                            this.f6266g.d(m02, s4);
                        }
                    }
                }
            }
            this.f6266g.o(this.f6231A0);
        }
        this.f6280n.w1(this.f6258c);
        z zVar2 = this.f6271i0;
        zVar2.f6416c = zVar2.f6419f;
        this.f6235E = false;
        this.f6236F = false;
        zVar2.f6424k = false;
        zVar2.f6425l = false;
        this.f6280n.f6361h = false;
        ArrayList arrayList = this.f6258c.f6390b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.f6280n;
        if (oVar.f6367n) {
            oVar.f6366m = 0;
            oVar.f6367n = false;
            this.f6258c.P();
        }
        this.f6280n.i1(this.f6271i0);
        P0();
        E1(false);
        this.f6266g.f();
        int[] iArr = this.f6287q0;
        if (C(iArr[0], iArr[1])) {
            N(0, 0);
        }
        a1();
        l1();
    }

    private boolean P(MotionEvent motionEvent) {
        r rVar = this.f6288r;
        if (rVar != null) {
            rVar.b(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f6288r = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return Z(motionEvent);
        }
    }

    private void R0(MotionEvent motionEvent) {
        int i4;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f6246P) {
            if (actionIndex == 0) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            this.f6246P = motionEvent.getPointerId(i4);
            int x3 = (int) (motionEvent.getX(i4) + 0.5f);
            this.f6250T = x3;
            this.f6248R = x3;
            int y3 = (int) (motionEvent.getY(i4) + 0.5f);
            this.f6251U = y3;
            this.f6249S = y3;
        }
    }

    private boolean V0() {
        if (this.f6244N == null || !this.f6280n.W1()) {
            return false;
        }
        return true;
    }

    private void W0() {
        boolean z3;
        boolean z4;
        boolean z5;
        if (this.f6235E) {
            this.f6262e.y();
            if (this.f6236F) {
                this.f6280n.c1(this);
            }
        }
        if (V0()) {
            this.f6262e.w();
        } else {
            this.f6262e.j();
        }
        boolean z6 = true;
        if (this.f6277l0 || this.f6279m0) {
            z3 = true;
        } else {
            z3 = false;
        }
        z zVar = this.f6271i0;
        if (!this.f6296v || this.f6244N == null || ((!(z5 = this.f6235E) && !z3 && !this.f6280n.f6361h) || (z5 && !this.f6278m.h()))) {
            z4 = false;
        } else {
            z4 = true;
        }
        zVar.f6424k = z4;
        z zVar2 = this.f6271i0;
        if (!zVar2.f6424k || !z3 || this.f6235E || !V0()) {
            z6 = false;
        }
        zVar2.f6425l = z6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Y0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L_0x0021
            r6.R()
            android.widget.EdgeEffect r1 = r6.f6240J
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            androidx.core.widget.e.d(r1, r4, r9)
        L_0x001f:
            r9 = r3
            goto L_0x003c
        L_0x0021:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x003b
            r6.S()
            android.widget.EdgeEffect r1 = r6.f6242L
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.e.d(r1, r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0056
            r6.T()
            android.widget.EdgeEffect r9 = r6.f6241K
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            androidx.core.widget.e.d(r9, r1, r7)
            goto L_0x0072
        L_0x0056:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0071
            r6.Q()
            android.widget.EdgeEffect r9 = r6.f6243M
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            androidx.core.widget.e.d(r9, r1, r2)
            goto L_0x0072
        L_0x0071:
            r3 = r9
        L_0x0072:
            if (r3 != 0) goto L_0x007c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x007f
        L_0x007c:
            androidx.core.view.P.f0(r6)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Y0(float, float, float, float):void");
    }

    private boolean Z(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f6286q.size();
        int i4 = 0;
        while (i4 < size) {
            r rVar = (r) this.f6286q.get(i4);
            if (!rVar.a(this, motionEvent) || action == 3) {
                i4++;
            } else {
                this.f6288r = rVar;
                return true;
            }
        }
        return false;
    }

    private void a0(int[] iArr) {
        int g4 = this.f6264f.g();
        if (g4 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        for (int i6 = 0; i6 < g4; i6++) {
            D m02 = m0(this.f6264f.f(i6));
            if (!m02.J()) {
                int m4 = m02.m();
                if (m4 < i4) {
                    i4 = m4;
                }
                if (m4 > i5) {
                    i5 = m4;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
    }

    private void a1() {
        D d4;
        View findViewById;
        if (this.f6263e0 && this.f6278m != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!f6226K0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.f6264f.n(focusedChild)) {
                            return;
                        }
                    } else if (this.f6264f.g() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                if (this.f6271i0.f6427n == -1 || !this.f6278m.h()) {
                    d4 = null;
                } else {
                    d4 = e0(this.f6271i0.f6427n);
                }
                if (d4 != null && !this.f6264f.n(d4.f6318a) && d4.f6318a.hasFocusable()) {
                    view = d4.f6318a;
                } else if (this.f6264f.g() > 0) {
                    view = c0();
                }
                if (view != null) {
                    int i4 = this.f6271i0.f6428o;
                    if (!(((long) i4) == -1 || (findViewById = view.findViewById(i4)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    static RecyclerView b0(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            RecyclerView b02 = b0(viewGroup.getChildAt(i4));
            if (b02 != null) {
                return b02;
            }
        }
        return null;
    }

    private void b1() {
        boolean z3;
        EdgeEffect edgeEffect = this.f6240J;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z3 = this.f6240J.isFinished();
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = this.f6241K;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z3 |= this.f6241K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f6242L;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z3 |= this.f6242L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f6243M;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z3 |= this.f6243M.isFinished();
        }
        if (z3) {
            P.f0(this);
        }
    }

    private View c0() {
        D d02;
        z zVar = this.f6271i0;
        int i4 = zVar.f6426m;
        if (i4 == -1) {
            i4 = 0;
        }
        int b4 = zVar.b();
        int i5 = i4;
        while (i5 < b4) {
            D d03 = d0(i5);
            if (d03 == null) {
                break;
            } else if (d03.f6318a.hasFocusable()) {
                return d03.f6318a;
            } else {
                i5++;
            }
        }
        int min = Math.min(b4, i4);
        while (true) {
            min--;
            if (min < 0 || (d02 = d0(min)) == null) {
                return null;
            }
            if (d02.f6318a.hasFocusable()) {
                return d02.f6318a;
            }
        }
    }

    private int c1(int i4, float f4) {
        float height = f4 / ((float) getHeight());
        float width = ((float) i4) / ((float) getWidth());
        EdgeEffect edgeEffect = this.f6240J;
        float f5 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.e.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f6242L;
            if (!(edgeEffect2 == null || androidx.core.widget.e.b(edgeEffect2) == 0.0f)) {
                if (canScrollHorizontally(1)) {
                    this.f6242L.onRelease();
                } else {
                    float d4 = androidx.core.widget.e.d(this.f6242L, width, height);
                    if (androidx.core.widget.e.b(this.f6242L) == 0.0f) {
                        this.f6242L.onRelease();
                    }
                    f5 = d4;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f6240J.onRelease();
            } else {
                float f6 = -androidx.core.widget.e.d(this.f6240J, -width, 1.0f - height);
                if (androidx.core.widget.e.b(this.f6240J) == 0.0f) {
                    this.f6240J.onRelease();
                }
                f5 = f6;
            }
            invalidate();
        }
        return Math.round(f5 * ((float) getWidth()));
    }

    private int d1(int i4, float f4) {
        float width = f4 / ((float) getWidth());
        float height = ((float) i4) / ((float) getHeight());
        EdgeEffect edgeEffect = this.f6241K;
        float f5 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.e.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f6243M;
            if (!(edgeEffect2 == null || androidx.core.widget.e.b(edgeEffect2) == 0.0f)) {
                if (canScrollVertically(1)) {
                    this.f6243M.onRelease();
                } else {
                    float d4 = androidx.core.widget.e.d(this.f6243M, height, 1.0f - width);
                    if (androidx.core.widget.e.b(this.f6243M) == 0.0f) {
                        this.f6243M.onRelease();
                    }
                    f5 = d4;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f6241K.onRelease();
            } else {
                float f6 = -androidx.core.widget.e.d(this.f6241K, -height, width);
                if (androidx.core.widget.e.b(this.f6241K) == 0.0f) {
                    this.f6241K.onRelease();
                }
                f5 = f6;
            }
            invalidate();
        }
        return Math.round(f5 * ((float) getHeight()));
    }

    private C0444y getScrollingChildHelper() {
        if (this.f6289r0 == null) {
            this.f6289r0 = new C0444y(this);
        }
        return this.f6289r0;
    }

    private void i(D d4) {
        boolean z3;
        View view = d4.f6318a;
        if (view.getParent() == this) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f6258c.O(l0(view));
        if (d4.x()) {
            this.f6264f.c(view, -1, view.getLayoutParams(), true);
        } else if (!z3) {
            this.f6264f.b(view, true);
        } else {
            this.f6264f.k(view);
        }
    }

    private void k1(View view, View view2) {
        View view3;
        boolean z3;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.f6272j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.f6380c) {
                Rect rect = pVar.f6379b;
                Rect rect2 = this.f6272j;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f6272j);
            offsetRectIntoDescendantCoords(view, this.f6272j);
        }
        o oVar = this.f6280n;
        Rect rect3 = this.f6272j;
        boolean z4 = !this.f6296v;
        if (view2 == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        oVar.D1(this, view, rect3, z4, z3);
    }

    private void l1() {
        z zVar = this.f6271i0;
        zVar.f6427n = -1;
        zVar.f6426m = -1;
        zVar.f6428o = -1;
    }

    static D m0(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).f6378a;
    }

    private void m1() {
        VelocityTracker velocityTracker = this.f6247Q;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        F1(0);
        b1();
    }

    static void n0(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.f6379b;
        rect.set((view.getLeft() - rect2.left) - pVar.leftMargin, (view.getTop() - rect2.top) - pVar.topMargin, view.getRight() + rect2.right + pVar.rightMargin, view.getBottom() + rect2.bottom + pVar.bottomMargin);
    }

    private void n1() {
        View view;
        long j4;
        int i4;
        D d4 = null;
        if (!this.f6263e0 || !hasFocus() || this.f6278m == null) {
            view = null;
        } else {
            view = getFocusedChild();
        }
        if (view != null) {
            d4 = Y(view);
        }
        if (d4 == null) {
            l1();
            return;
        }
        z zVar = this.f6271i0;
        if (this.f6278m.h()) {
            j4 = d4.k();
        } else {
            j4 = -1;
        }
        zVar.f6427n = j4;
        z zVar2 = this.f6271i0;
        if (this.f6235E) {
            i4 = -1;
        } else if (d4.v()) {
            i4 = d4.f6321d;
        } else {
            i4 = d4.j();
        }
        zVar2.f6426m = i4;
        this.f6271i0.f6428o = o0(d4.f6318a);
    }

    private void o(D d4, D d5, l.b bVar, l.b bVar2, boolean z3, boolean z4) {
        d4.G(false);
        if (z3) {
            i(d4);
        }
        if (d4 != d5) {
            if (z4) {
                i(d5);
            }
            d4.f6325h = d5;
            i(d4);
            this.f6258c.O(d4);
            d5.G(false);
            d5.f6326i = d4;
        }
        if (this.f6244N.b(d4, d5, bVar, bVar2)) {
            U0();
        }
    }

    private int o0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String p0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private float r0(int i4) {
        double log = Math.log((double) ((((float) Math.abs(i4)) * 0.35f) / (this.f6254a * 0.015f)));
        float f4 = f6220E0;
        return (float) (((double) (this.f6254a * 0.015f)) * Math.exp((((double) f4) / (((double) f4) - 1.0d)) * log));
    }

    private void s() {
        m1();
        setScrollState(0);
    }

    private void s0(long j4, D d4, D d5) {
        int g4 = this.f6264f.g();
        for (int i4 = 0; i4 < g4; i4++) {
            D m02 = m0(this.f6264f.f(i4));
            if (m02 != d4 && i0(m02) == j4) {
                Adapter adapter = this.f6278m;
                if (adapter == null || !adapter.h()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + m02 + " \n View Holder 2:" + d4 + U());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + m02 + " \n View Holder 2:" + d4 + U());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d5 + " cannot be found but it is necessary for " + d4 + U());
    }

    private void s1(Adapter adapter, boolean z3, boolean z4) {
        Adapter adapter2 = this.f6278m;
        if (adapter2 != null) {
            adapter2.y(this.f6256b);
            this.f6278m.r(this);
        }
        if (!z3 || z4) {
            e1();
        }
        this.f6262e.y();
        Adapter adapter3 = this.f6278m;
        this.f6278m = adapter;
        if (adapter != null) {
            adapter.w(this.f6256b);
            adapter.n(this);
        }
        o oVar = this.f6280n;
        if (oVar != null) {
            oVar.O0(adapter3, this.f6278m);
        }
        this.f6258c.y(adapter3, this.f6278m, z3);
        this.f6271i0.f6420g = true;
    }

    public static void setDebugAssertionsEnabled(boolean z3) {
        f6217B0 = z3;
    }

    public static void setVerboseLoggingEnabled(boolean z3) {
        f6218C0 = z3;
    }

    static void t(D d4) {
        WeakReference weakReference = d4.f6319b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != d4.f6318a) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                } else {
                    return;
                }
            }
            d4.f6319b = null;
        }
    }

    private boolean u0() {
        int g4 = this.f6264f.g();
        for (int i4 = 0; i4 < g4; i4++) {
            D m02 = m0(this.f6264f.f(i4));
            if (m02 != null && !m02.J() && m02.y()) {
                return true;
            }
        }
        return false;
    }

    private boolean u1(EdgeEffect edgeEffect, int i4, int i5) {
        if (i4 > 0) {
            return true;
        }
        if (r0(-i4) < androidx.core.widget.e.b(edgeEffect) * ((float) i5)) {
            return true;
        }
        return false;
    }

    private void w0() {
        if (P.A(this) == 0) {
            P.A0(this, 8);
        }
    }

    private int x(int i4, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i5) {
        if (i4 > 0 && edgeEffect != null && androidx.core.widget.e.b(edgeEffect) != 0.0f) {
            int round = Math.round((((float) (-i5)) / 4.0f) * androidx.core.widget.e.d(edgeEffect, (((float) (-i4)) * 4.0f) / ((float) i5), 0.5f));
            if (round != i4) {
                edgeEffect.finish();
            }
            return i4 - round;
        } else if (i4 >= 0 || edgeEffect2 == null || androidx.core.widget.e.b(edgeEffect2) == 0.0f) {
            return i4;
        } else {
            float f4 = (float) i5;
            int round2 = Math.round((f4 / 4.0f) * androidx.core.widget.e.d(edgeEffect2, (((float) i4) * 4.0f) / f4, 0.5f));
            if (round2 != i4) {
                edgeEffect2.finish();
            }
            return i4 - round2;
        }
    }

    private void x0() {
        this.f6264f = new f(new e());
    }

    /* access modifiers changed from: package-private */
    public boolean A0() {
        AccessibilityManager accessibilityManager = this.f6233C;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return false;
        }
        return true;
    }

    public void A1(int i4) {
        if (!this.f6302y) {
            o oVar = this.f6280n;
            if (oVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                oVar.T1(this, this.f6271i0, i4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void B(int i4, int i5) {
        setMeasuredDimension(o.A(i4, getPaddingLeft() + getPaddingRight(), P.D(this)), o.A(i5, getPaddingTop() + getPaddingBottom(), P.C(this)));
    }

    public boolean B0() {
        if (this.f6237G > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void B1() {
        int i4 = this.f6298w + 1;
        this.f6298w = i4;
        if (i4 == 1 && !this.f6302y) {
            this.f6300x = false;
        }
    }

    public boolean C1(int i4, int i5) {
        return getScrollingChildHelper().p(i4, i5);
    }

    /* access modifiers changed from: package-private */
    public void D(View view) {
        int size;
        D m02 = m0(view);
        M0(view);
        Adapter adapter = this.f6278m;
        if (!(adapter == null || m02 == null)) {
            adapter.t(m02);
        }
        List list = this.f6234D;
        if (list != null && list.size() - 1 >= 0) {
            F.a(this.f6234D.get(size));
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public void D0(int i4) {
        if (this.f6280n != null) {
            setScrollState(2);
            this.f6280n.I1(i4);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: package-private */
    public void E(View view) {
        int size;
        D m02 = m0(view);
        N0(view);
        Adapter adapter = this.f6278m;
        if (!(adapter == null || m02 == null)) {
            adapter.u(m02);
        }
        List list = this.f6234D;
        if (list != null && list.size() - 1 >= 0) {
            F.a(this.f6234D.get(size));
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public void E0() {
        int j4 = this.f6264f.j();
        for (int i4 = 0; i4 < j4; i4++) {
            ((p) this.f6264f.i(i4).getLayoutParams()).f6380c = true;
        }
        this.f6258c.s();
    }

    /* access modifiers changed from: package-private */
    public void E1(boolean z3) {
        if (this.f6298w < 1) {
            if (!f6217B0) {
                this.f6298w = 1;
            } else {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + U());
            }
        }
        if (!z3 && !this.f6302y) {
            this.f6300x = false;
        }
        if (this.f6298w == 1) {
            if (z3 && this.f6300x && !this.f6302y && this.f6280n != null && this.f6278m != null) {
                G();
            }
            if (!this.f6302y) {
                this.f6300x = false;
            }
        }
        this.f6298w--;
    }

    /* access modifiers changed from: package-private */
    public void F0() {
        int j4 = this.f6264f.j();
        for (int i4 = 0; i4 < j4; i4++) {
            D m02 = m0(this.f6264f.i(i4));
            if (m02 != null && !m02.J()) {
                m02.b(6);
            }
        }
        E0();
        this.f6258c.t();
    }

    public void F1(int i4) {
        getScrollingChildHelper().r(i4);
    }

    /* access modifiers changed from: package-private */
    public void G() {
        boolean z3;
        if (this.f6278m == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.f6280n == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            this.f6271i0.f6423j = false;
            if (!this.f6301x0 || (this.f6303y0 == getWidth() && this.f6305z0 == getHeight())) {
                z3 = false;
            } else {
                z3 = true;
            }
            this.f6303y0 = 0;
            this.f6305z0 = 0;
            this.f6301x0 = false;
            if (this.f6271i0.f6418e == 1) {
                H();
                this.f6280n.K1(this);
                I();
            } else if (this.f6262e.q() || z3 || this.f6280n.x0() != getWidth() || this.f6280n.j0() != getHeight()) {
                this.f6280n.K1(this);
                I();
            } else {
                this.f6280n.K1(this);
            }
            J();
        }
    }

    public void G1() {
        setScrollState(0);
        H1();
    }

    public void H0(int i4) {
        int g4 = this.f6264f.g();
        for (int i5 = 0; i5 < g4; i5++) {
            this.f6264f.f(i5).offsetLeftAndRight(i4);
        }
    }

    public void I0(int i4) {
        int g4 = this.f6264f.g();
        for (int i5 = 0; i5 < g4; i5++) {
            this.f6264f.f(i5).offsetTopAndBottom(i4);
        }
    }

    /* access modifiers changed from: package-private */
    public void I1(int i4, int i5, Object obj) {
        int i6;
        int j4 = this.f6264f.j();
        int i7 = i4 + i5;
        for (int i8 = 0; i8 < j4; i8++) {
            View i9 = this.f6264f.i(i8);
            D m02 = m0(i9);
            if (m02 != null && !m02.J() && (i6 = m02.f6320c) >= i4 && i6 < i7) {
                m02.b(2);
                m02.a(obj);
                ((p) i9.getLayoutParams()).f6380c = true;
            }
        }
        this.f6258c.R(i4, i5);
    }

    /* access modifiers changed from: package-private */
    public void J0(int i4, int i5) {
        int j4 = this.f6264f.j();
        for (int i6 = 0; i6 < j4; i6++) {
            D m02 = m0(this.f6264f.i(i6));
            if (m02 != null && !m02.J() && m02.f6320c >= i4) {
                if (f6218C0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("offsetPositionRecordsForInsert attached child ");
                    sb.append(i6);
                    sb.append(" holder ");
                    sb.append(m02);
                    sb.append(" now at position ");
                    sb.append(m02.f6320c + i5);
                }
                m02.A(i5, false);
                this.f6271i0.f6420g = true;
            }
        }
        this.f6258c.v(i4, i5);
        requestLayout();
    }

    public boolean K(int i4, int i5, int[] iArr, int[] iArr2, int i6) {
        return getScrollingChildHelper().d(i4, i5, iArr, iArr2, i6);
    }

    /* access modifiers changed from: package-private */
    public void K0(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int j4 = this.f6264f.j();
        if (i4 < i5) {
            i8 = -1;
            i7 = i4;
            i6 = i5;
        } else {
            i6 = i4;
            i7 = i5;
            i8 = 1;
        }
        for (int i10 = 0; i10 < j4; i10++) {
            D m02 = m0(this.f6264f.i(i10));
            if (m02 != null && (i9 = m02.f6320c) >= i7 && i9 <= i6) {
                if (f6218C0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("offsetPositionRecordsForMove attached child ");
                    sb.append(i10);
                    sb.append(" holder ");
                    sb.append(m02);
                }
                if (m02.f6320c == i4) {
                    m02.A(i5 - i4, false);
                } else {
                    m02.A(i8, false);
                }
                this.f6271i0.f6420g = true;
            }
        }
        this.f6258c.w(i4, i5);
        requestLayout();
    }

    public final void L(int i4, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        getScrollingChildHelper().e(i4, i5, i6, i7, iArr, i8, iArr2);
    }

    /* access modifiers changed from: package-private */
    public void L0(int i4, int i5, boolean z3) {
        int i6 = i4 + i5;
        int j4 = this.f6264f.j();
        for (int i7 = 0; i7 < j4; i7++) {
            D m02 = m0(this.f6264f.i(i7));
            if (m02 != null && !m02.J()) {
                int i8 = m02.f6320c;
                if (i8 >= i6) {
                    if (f6218C0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("offsetPositionRecordsForRemove attached child ");
                        sb.append(i7);
                        sb.append(" holder ");
                        sb.append(m02);
                        sb.append(" now at position ");
                        sb.append(m02.f6320c - i5);
                    }
                    m02.A(-i5, z3);
                    this.f6271i0.f6420g = true;
                } else if (i8 >= i4) {
                    if (f6218C0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("offsetPositionRecordsForRemove attached child ");
                        sb2.append(i7);
                        sb2.append(" holder ");
                        sb2.append(m02);
                        sb2.append(" now REMOVED");
                    }
                    m02.i(i4 - 1, -i5, z3);
                    this.f6271i0.f6420g = true;
                }
            }
        }
        this.f6258c.x(i4, i5, z3);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void M(int i4) {
        o oVar = this.f6280n;
        if (oVar != null) {
            oVar.o1(i4);
        }
        S0(i4);
        s sVar = this.f6273j0;
        if (sVar != null) {
            sVar.a(this, i4);
        }
        List list = this.f6275k0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((s) this.f6275k0.get(size)).a(this, i4);
            }
        }
    }

    public void M0(View view) {
    }

    /* access modifiers changed from: package-private */
    public void N(int i4, int i5) {
        this.f6238H++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i4, scrollY - i5);
        T0(i4, i5);
        s sVar = this.f6273j0;
        if (sVar != null) {
            sVar.b(this, i4, i5);
        }
        List list = this.f6275k0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((s) this.f6275k0.get(size)).b(this, i4, i5);
            }
        }
        this.f6238H--;
    }

    public void N0(View view) {
    }

    /* access modifiers changed from: package-private */
    public void O() {
        int i4;
        for (int size = this.f6297v0.size() - 1; size >= 0; size--) {
            D d4 = (D) this.f6297v0.get(size);
            if (d4.f6318a.getParent() == this && !d4.J() && (i4 = d4.f6334q) != -1) {
                P.y0(d4.f6318a, i4);
                d4.f6334q = -1;
            }
        }
        this.f6297v0.clear();
    }

    /* access modifiers changed from: package-private */
    public void O0() {
        this.f6237G++;
    }

    /* access modifiers changed from: package-private */
    public void P0() {
        Q0(true);
    }

    /* access modifiers changed from: package-private */
    public void Q() {
        if (this.f6243M == null) {
            EdgeEffect a4 = this.f6239I.a(this, 3);
            this.f6243M = a4;
            if (this.f6268h) {
                a4.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a4.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void Q0(boolean z3) {
        int i4 = this.f6237G - 1;
        this.f6237G = i4;
        if (i4 >= 1) {
            return;
        }
        if (!f6217B0 || i4 >= 0) {
            this.f6237G = 0;
            if (z3) {
                F();
                O();
                return;
            }
            return;
        }
        throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + U());
    }

    /* access modifiers changed from: package-private */
    public void R() {
        if (this.f6240J == null) {
            EdgeEffect a4 = this.f6239I.a(this, 0);
            this.f6240J = a4;
            if (this.f6268h) {
                a4.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a4.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void S() {
        if (this.f6242L == null) {
            EdgeEffect a4 = this.f6239I.a(this, 2);
            this.f6242L = a4;
            if (this.f6268h) {
                a4.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a4.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void S0(int i4) {
    }

    /* access modifiers changed from: package-private */
    public void T() {
        if (this.f6241K == null) {
            EdgeEffect a4 = this.f6239I.a(this, 1);
            this.f6241K = a4;
            if (this.f6268h) {
                a4.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a4.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void T0(int i4, int i5) {
    }

    /* access modifiers changed from: package-private */
    public String U() {
        return " " + super.toString() + ", adapter:" + this.f6278m + ", layout:" + this.f6280n + ", context:" + getContext();
    }

    /* access modifiers changed from: package-private */
    public void U0() {
        if (!this.f6283o0 && this.f6290s) {
            P.g0(this, this.f6299w0);
            this.f6283o0 = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void V(z zVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f6265f0.f6312c;
            zVar.f6429p = overScroller.getFinalX() - overScroller.getCurrX();
            zVar.f6430q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        zVar.f6429p = 0;
        zVar.f6430q = 0;
    }

    public View W(float f4, float f5) {
        for (int g4 = this.f6264f.g() - 1; g4 >= 0; g4--) {
            View f6 = this.f6264f.f(g4);
            float translationX = f6.getTranslationX();
            float translationY = f6.getTranslationY();
            if (f4 >= ((float) f6.getLeft()) + translationX && f4 <= ((float) f6.getRight()) + translationX && f5 >= ((float) f6.getTop()) + translationY && f5 <= ((float) f6.getBottom()) + translationY) {
                return f6;
            }
        }
        return null;
    }

    public View X(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void X0(boolean z3) {
        this.f6236F = z3 | this.f6236F;
        this.f6235E = true;
        F0();
    }

    public D Y(View view) {
        View X3 = X(view);
        if (X3 == null) {
            return null;
        }
        return l0(X3);
    }

    /* access modifiers changed from: package-private */
    public void Z0(D d4, l.b bVar) {
        d4.F(0, 8192);
        if (this.f6271i0.f6422i && d4.y() && !d4.v() && !d4.J()) {
            this.f6266g.c(i0(d4), d4);
        }
        this.f6266g.e(d4, bVar);
    }

    /* access modifiers changed from: package-private */
    public void a(int i4, int i5) {
        if (i4 < 0) {
            R();
            if (this.f6240J.isFinished()) {
                this.f6240J.onAbsorb(-i4);
            }
        } else if (i4 > 0) {
            S();
            if (this.f6242L.isFinished()) {
                this.f6242L.onAbsorb(i4);
            }
        }
        if (i5 < 0) {
            T();
            if (this.f6241K.isFinished()) {
                this.f6241K.onAbsorb(-i5);
            }
        } else if (i5 > 0) {
            Q();
            if (this.f6243M.isFinished()) {
                this.f6243M.onAbsorb(i5);
            }
        }
        if (i4 != 0 || i5 != 0) {
            P.f0(this);
        }
    }

    public void addFocusables(ArrayList arrayList, int i4, int i5) {
        o oVar = this.f6280n;
        if (oVar == null || !oVar.P0(this, arrayList, i4, i5)) {
            super.addFocusables(arrayList, i4, i5);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof p) || !this.f6280n.z((p) layoutParams)) {
            return false;
        }
        return true;
    }

    public int computeHorizontalScrollExtent() {
        o oVar = this.f6280n;
        if (oVar != null && oVar.x()) {
            return this.f6280n.D(this.f6271i0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        o oVar = this.f6280n;
        if (oVar != null && oVar.x()) {
            return this.f6280n.E(this.f6271i0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        o oVar = this.f6280n;
        if (oVar != null && oVar.x()) {
            return this.f6280n.F(this.f6271i0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        o oVar = this.f6280n;
        if (oVar != null && oVar.y()) {
            return this.f6280n.G(this.f6271i0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        o oVar = this.f6280n;
        if (oVar != null && oVar.y()) {
            return this.f6280n.H(this.f6271i0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        o oVar = this.f6280n;
        if (oVar != null && oVar.y()) {
            return this.f6280n.I(this.f6271i0);
        }
        return 0;
    }

    public D d0(int i4) {
        D d4 = null;
        if (this.f6235E) {
            return null;
        }
        int j4 = this.f6264f.j();
        for (int i5 = 0; i5 < j4; i5++) {
            D m02 = m0(this.f6264f.i(i5));
            if (m02 != null && !m02.v() && h0(m02) == i4) {
                if (!this.f6264f.n(m02.f6318a)) {
                    return m02;
                }
                d4 = m02;
            }
        }
        return d4;
    }

    public boolean dispatchNestedFling(float f4, float f5, boolean z3) {
        return getScrollingChildHelper().a(f4, f5, z3);
    }

    public boolean dispatchNestedPreFling(float f4, float f5) {
        return getScrollingChildHelper().b(f4, f5);
    }

    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i4, i5, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return getScrollingChildHelper().f(i4, i5, i6, i7, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z3;
        int i4;
        boolean z4;
        boolean z5;
        int i5;
        super.draw(canvas);
        int size = this.f6284p.size();
        boolean z6 = false;
        for (int i6 = 0; i6 < size; i6++) {
            ((n) this.f6284p.get(i6)).i(canvas, this, this.f6271i0);
        }
        EdgeEffect edgeEffect = this.f6240J;
        boolean z7 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z3 = false;
        } else {
            int save = canvas.save();
            if (this.f6268h) {
                i5 = getPaddingBottom();
            } else {
                i5 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + i5), 0.0f);
            EdgeEffect edgeEffect2 = this.f6240J;
            if (edgeEffect2 == null || !edgeEffect2.draw(canvas)) {
                z3 = false;
            } else {
                z3 = true;
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f6241K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f6268h) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f6241K;
            if (edgeEffect4 == null || !edgeEffect4.draw(canvas)) {
                z5 = false;
            } else {
                z5 = true;
            }
            z3 |= z5;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f6242L;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f6268h) {
                i4 = getPaddingTop();
            } else {
                i4 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate((float) i4, (float) (-width));
            EdgeEffect edgeEffect6 = this.f6242L;
            if (edgeEffect6 == null || !edgeEffect6.draw(canvas)) {
                z4 = false;
            } else {
                z4 = true;
            }
            z3 |= z4;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f6243M;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f6268h) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.f6243M;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z6 = true;
            }
            z3 |= z6;
            canvas.restoreToCount(save4);
        }
        if (z3 || this.f6244N == null || this.f6284p.size() <= 0 || !this.f6244N.p()) {
            z7 = z3;
        }
        if (z7) {
            P.f0(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j4) {
        return super.drawChild(canvas, view, j4);
    }

    public D e0(long j4) {
        Adapter adapter = this.f6278m;
        D d4 = null;
        if (adapter != null && adapter.h()) {
            int j5 = this.f6264f.j();
            for (int i4 = 0; i4 < j5; i4++) {
                D m02 = m0(this.f6264f.i(i4));
                if (m02 != null && !m02.v() && m02.k() == j4) {
                    if (!this.f6264f.n(m02.f6318a)) {
                        return m02;
                    }
                    d4 = m02;
                }
            }
        }
        return d4;
    }

    /* access modifiers changed from: package-private */
    public void e1() {
        l lVar = this.f6244N;
        if (lVar != null) {
            lVar.k();
        }
        o oVar = this.f6280n;
        if (oVar != null) {
            oVar.v1(this.f6258c);
            this.f6280n.w1(this.f6258c);
        }
        this.f6258c.c();
    }

    /* access modifiers changed from: package-private */
    public D f0(int i4, boolean z3) {
        int j4 = this.f6264f.j();
        D d4 = null;
        for (int i5 = 0; i5 < j4; i5++) {
            D m02 = m0(this.f6264f.i(i5));
            if (m02 != null && !m02.v()) {
                if (z3) {
                    if (m02.f6320c != i4) {
                        continue;
                    }
                } else if (m02.m() != i4) {
                    continue;
                }
                if (!this.f6264f.n(m02.f6318a)) {
                    return m02;
                }
                d4 = m02;
            }
        }
        return d4;
    }

    /* access modifiers changed from: package-private */
    public boolean f1(View view) {
        B1();
        boolean r4 = this.f6264f.r(view);
        if (r4) {
            D m02 = m0(view);
            this.f6258c.O(m02);
            this.f6258c.H(m02);
            if (f6218C0) {
                StringBuilder sb = new StringBuilder();
                sb.append("after removing animated view: ");
                sb.append(view);
                sb.append(", ");
                sb.append(this);
            }
        }
        E1(!r4);
        return r4;
    }

    public View focusSearch(View view, int i4) {
        boolean z3;
        View view2;
        boolean z4;
        boolean z5;
        boolean z6;
        int i5;
        int i6;
        View a12 = this.f6280n.a1(view, i4);
        if (a12 != null) {
            return a12;
        }
        boolean z7 = true;
        if (this.f6278m == null || this.f6280n == null || B0() || this.f6302y) {
            z3 = false;
        } else {
            z3 = true;
        }
        FocusFinder instance = FocusFinder.getInstance();
        if (!z3 || !(i4 == 2 || i4 == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i4);
            if (findNextFocus != null || !z3) {
                view2 = findNextFocus;
            } else {
                z();
                if (X(view) == null) {
                    return null;
                }
                B1();
                view2 = this.f6280n.T0(view, i4, this.f6258c, this.f6271i0);
                E1(false);
            }
        } else {
            if (this.f6280n.y()) {
                if (i4 == 2) {
                    i6 = 130;
                } else {
                    i6 = 33;
                }
                if (instance.findNextFocus(this, view, i6) == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (f6225J0) {
                    i4 = i6;
                }
            } else {
                z4 = false;
            }
            if (!z4 && this.f6280n.x()) {
                if (this.f6280n.m0() == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (i4 == 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z5 ^ z6) {
                    i5 = 66;
                } else {
                    i5 = 17;
                }
                if (instance.findNextFocus(this, view, i5) != null) {
                    z7 = false;
                }
                if (f6225J0) {
                    i4 = i5;
                }
                z4 = z7;
            }
            if (z4) {
                z();
                if (X(view) == null) {
                    return null;
                }
                B1();
                this.f6280n.T0(view, i4, this.f6258c, this.f6271i0);
                E1(false);
            }
            view2 = instance.findNextFocus(this, view, i4);
        }
        if (view2 == null || view2.hasFocusable()) {
            if (C0(view, view2, i4)) {
                return view2;
            }
            return super.focusSearch(view, i4);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i4);
        } else {
            k1(view2, (View) null);
            return view;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g0(int r8, int r9) {
        /*
            r7 = this;
            androidx.recyclerview.widget.RecyclerView$o r0 = r7.f6280n
            r1 = 0
            if (r0 != 0) goto L_0x000d
            java.lang.String r8 = "RecyclerView"
            java.lang.String r9 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r8, r9)
            return r1
        L_0x000d:
            boolean r2 = r7.f6302y
            if (r2 == 0) goto L_0x0012
            return r1
        L_0x0012:
            boolean r0 = r0.x()
            androidx.recyclerview.widget.RecyclerView$o r2 = r7.f6280n
            boolean r2 = r2.y()
            if (r0 == 0) goto L_0x0026
            int r3 = java.lang.Math.abs(r8)
            int r4 = r7.f6255a0
            if (r3 >= r4) goto L_0x0027
        L_0x0026:
            r8 = r1
        L_0x0027:
            if (r2 == 0) goto L_0x0031
            int r3 = java.lang.Math.abs(r9)
            int r4 = r7.f6255a0
            if (r3 >= r4) goto L_0x0032
        L_0x0031:
            r9 = r1
        L_0x0032:
            if (r8 != 0) goto L_0x0037
            if (r9 != 0) goto L_0x0037
            return r1
        L_0x0037:
            r3 = 0
            if (r8 == 0) goto L_0x007a
            android.widget.EdgeEffect r4 = r7.f6240J
            if (r4 == 0) goto L_0x005c
            float r4 = androidx.core.widget.e.b(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x005c
            android.widget.EdgeEffect r4 = r7.f6240J
            int r5 = -r8
            int r6 = r7.getWidth()
            boolean r4 = r7.u1(r4, r5, r6)
            if (r4 == 0) goto L_0x0059
            android.widget.EdgeEffect r8 = r7.f6240J
            r8.onAbsorb(r5)
        L_0x0058:
            r8 = r1
        L_0x0059:
            r4 = r8
            r8 = r1
            goto L_0x007b
        L_0x005c:
            android.widget.EdgeEffect r4 = r7.f6242L
            if (r4 == 0) goto L_0x007a
            float r4 = androidx.core.widget.e.b(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x007a
            android.widget.EdgeEffect r4 = r7.f6242L
            int r5 = r7.getWidth()
            boolean r4 = r7.u1(r4, r8, r5)
            if (r4 == 0) goto L_0x0059
            android.widget.EdgeEffect r4 = r7.f6242L
            r4.onAbsorb(r8)
            goto L_0x0058
        L_0x007a:
            r4 = r1
        L_0x007b:
            if (r9 == 0) goto L_0x00bc
            android.widget.EdgeEffect r5 = r7.f6241K
            if (r5 == 0) goto L_0x009e
            float r5 = androidx.core.widget.e.b(r5)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x009e
            android.widget.EdgeEffect r3 = r7.f6241K
            int r5 = -r9
            int r6 = r7.getHeight()
            boolean r3 = r7.u1(r3, r5, r6)
            if (r3 == 0) goto L_0x009c
            android.widget.EdgeEffect r9 = r7.f6241K
            r9.onAbsorb(r5)
        L_0x009b:
            r9 = r1
        L_0x009c:
            r3 = r1
            goto L_0x00be
        L_0x009e:
            android.widget.EdgeEffect r5 = r7.f6243M
            if (r5 == 0) goto L_0x00bc
            float r5 = androidx.core.widget.e.b(r5)
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x00bc
            android.widget.EdgeEffect r3 = r7.f6243M
            int r5 = r7.getHeight()
            boolean r3 = r7.u1(r3, r9, r5)
            if (r3 == 0) goto L_0x009c
            android.widget.EdgeEffect r3 = r7.f6243M
            r3.onAbsorb(r9)
            goto L_0x009b
        L_0x00bc:
            r3 = r9
            r9 = r1
        L_0x00be:
            if (r4 != 0) goto L_0x00c2
            if (r9 == 0) goto L_0x00dd
        L_0x00c2:
            int r5 = r7.f6257b0
            int r6 = -r5
            int r4 = java.lang.Math.min(r4, r5)
            int r4 = java.lang.Math.max(r6, r4)
            int r5 = r7.f6257b0
            int r6 = -r5
            int r9 = java.lang.Math.min(r9, r5)
            int r9 = java.lang.Math.max(r6, r9)
            androidx.recyclerview.widget.RecyclerView$C r5 = r7.f6265f0
            r5.b(r4, r9)
        L_0x00dd:
            r5 = 1
            if (r8 != 0) goto L_0x00e8
            if (r3 != 0) goto L_0x00e8
            if (r4 != 0) goto L_0x00e6
            if (r9 == 0) goto L_0x00e7
        L_0x00e6:
            r1 = r5
        L_0x00e7:
            return r1
        L_0x00e8:
            float r9 = (float) r8
            float r4 = (float) r3
            boolean r6 = r7.dispatchNestedPreFling(r9, r4)
            if (r6 != 0) goto L_0x012b
            if (r0 != 0) goto L_0x00f7
            if (r2 == 0) goto L_0x00f5
            goto L_0x00f7
        L_0x00f5:
            r6 = r1
            goto L_0x00f8
        L_0x00f7:
            r6 = r5
        L_0x00f8:
            r7.dispatchNestedFling(r9, r4, r6)
            androidx.recyclerview.widget.RecyclerView$q r9 = r7.f6253W
            if (r9 == 0) goto L_0x0106
            boolean r9 = r9.a(r8, r3)
            if (r9 == 0) goto L_0x0106
            return r5
        L_0x0106:
            if (r6 == 0) goto L_0x012b
            if (r2 == 0) goto L_0x010c
            r0 = r0 | 2
        L_0x010c:
            r7.C1(r0, r5)
            int r9 = r7.f6257b0
            int r0 = -r9
            int r8 = java.lang.Math.min(r8, r9)
            int r8 = java.lang.Math.max(r0, r8)
            int r9 = r7.f6257b0
            int r0 = -r9
            int r9 = java.lang.Math.min(r3, r9)
            int r9 = java.lang.Math.max(r0, r9)
            androidx.recyclerview.widget.RecyclerView$C r0 = r7.f6265f0
            r0.b(r8, r9)
            return r5
        L_0x012b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.g0(int, int):boolean");
    }

    public void g1(n nVar) {
        boolean z3;
        o oVar = this.f6280n;
        if (oVar != null) {
            oVar.t("Cannot remove item decoration during a scroll  or layout");
        }
        this.f6284p.remove(nVar);
        if (this.f6284p.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            setWillNotDraw(z3);
        }
        E0();
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.f6280n;
        if (oVar != null) {
            return oVar.Q();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + U());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.f6280n;
        if (oVar != null) {
            return oVar.R(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + U());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public Adapter getAdapter() {
        return this.f6278m;
    }

    public int getBaseline() {
        o oVar = this.f6280n;
        if (oVar != null) {
            return oVar.T();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i4, int i5) {
        return super.getChildDrawingOrder(i4, i5);
    }

    public boolean getClipToPadding() {
        return this.f6268h;
    }

    public r getCompatAccessibilityDelegate() {
        return this.f6285p0;
    }

    public k getEdgeEffectFactory() {
        return this.f6239I;
    }

    public l getItemAnimator() {
        return this.f6244N;
    }

    public int getItemDecorationCount() {
        return this.f6284p.size();
    }

    public o getLayoutManager() {
        return this.f6280n;
    }

    public int getMaxFlingVelocity() {
        return this.f6257b0;
    }

    public int getMinFlingVelocity() {
        return this.f6255a0;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f6224I0) {
            return System.nanoTime();
        }
        return 0;
    }

    public q getOnFlingListener() {
        return this.f6253W;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f6263e0;
    }

    public t getRecycledViewPool() {
        return this.f6258c.i();
    }

    public int getScrollState() {
        return this.f6245O;
    }

    /* access modifiers changed from: package-private */
    public int h0(D d4) {
        if (d4.p(524) || !d4.s()) {
            return -1;
        }
        return this.f6262e.e(d4.f6320c);
    }

    public void h1(r rVar) {
        this.f6286q.remove(rVar);
        if (this.f6288r == rVar) {
            this.f6288r = null;
        }
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    /* access modifiers changed from: package-private */
    public long i0(D d4) {
        if (this.f6278m.h()) {
            return d4.k();
        }
        return (long) d4.f6320c;
    }

    public void i1(s sVar) {
        List list = this.f6275k0;
        if (list != null) {
            list.remove(sVar);
        }
    }

    public boolean isAttachedToWindow() {
        return this.f6290s;
    }

    public final boolean isLayoutSuppressed() {
        return this.f6302y;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(n nVar) {
        k(nVar, -1);
    }

    public int j0(View view) {
        D m02 = m0(view);
        if (m02 != null) {
            return m02.j();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void j1() {
        D d4;
        int g4 = this.f6264f.g();
        for (int i4 = 0; i4 < g4; i4++) {
            View f4 = this.f6264f.f(i4);
            D l02 = l0(f4);
            if (!(l02 == null || (d4 = l02.f6326i) == null)) {
                View view = d4.f6318a;
                int left = f4.getLeft();
                int top = f4.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void k(n nVar, int i4) {
        o oVar = this.f6280n;
        if (oVar != null) {
            oVar.t("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f6284p.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i4 < 0) {
            this.f6284p.add(nVar);
        } else {
            this.f6284p.add(i4, nVar);
        }
        E0();
        requestLayout();
    }

    public int k0(View view) {
        D m02 = m0(view);
        if (m02 != null) {
            return m02.m();
        }
        return -1;
    }

    public void l(r rVar) {
        this.f6286q.add(rVar);
    }

    public D l0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public void m(s sVar) {
        if (this.f6275k0 == null) {
            this.f6275k0 = new ArrayList();
        }
        this.f6275k0.add(sVar);
    }

    /* access modifiers changed from: package-private */
    public void n(D d4, l.b bVar, l.b bVar2) {
        d4.G(false);
        if (this.f6244N.a(d4, bVar, bVar2)) {
            U0();
        }
    }

    /* access modifiers changed from: package-private */
    public void o1() {
        int j4 = this.f6264f.j();
        int i4 = 0;
        while (i4 < j4) {
            D m02 = m0(this.f6264f.i(i4));
            if (!f6217B0 || m02.f6320c != -1 || m02.v()) {
                if (!m02.J()) {
                    m02.E();
                }
                i4++;
            } else {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + U());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r1 >= 30.0f) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f6237G = r0
            r1 = 1
            r5.f6290s = r1
            boolean r2 = r5.f6296v
            if (r2 == 0) goto L_0x0014
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = r0
        L_0x0015:
            r5.f6296v = r1
            androidx.recyclerview.widget.RecyclerView$u r1 = r5.f6258c
            r1.z()
            androidx.recyclerview.widget.RecyclerView$o r1 = r5.f6280n
            if (r1 == 0) goto L_0x0023
            r1.M(r5)
        L_0x0023:
            r5.f6283o0 = r0
            boolean r0 = f6224I0
            if (r0 == 0) goto L_0x0066
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.j.f6649e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.j r1 = (androidx.recyclerview.widget.j) r1
            r5.f6267g0 = r1
            if (r1 != 0) goto L_0x0061
            androidx.recyclerview.widget.j r1 = new androidx.recyclerview.widget.j
            r1.<init>()
            r5.f6267g0 = r1
            android.view.Display r1 = androidx.core.view.P.v(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L_0x0053
            if (r1 == 0) goto L_0x0053
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r1 = 1114636288(0x42700000, float:60.0)
        L_0x0055:
            androidx.recyclerview.widget.j r2 = r5.f6267g0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f6653c = r3
            r0.set(r2)
        L_0x0061:
            androidx.recyclerview.widget.j r0 = r5.f6267g0
            r0.a(r5)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        j jVar;
        super.onDetachedFromWindow();
        l lVar = this.f6244N;
        if (lVar != null) {
            lVar.k();
        }
        G1();
        this.f6290s = false;
        o oVar = this.f6280n;
        if (oVar != null) {
            oVar.N(this, this.f6258c);
        }
        this.f6297v0.clear();
        removeCallbacks(this.f6299w0);
        this.f6266g.j();
        this.f6258c.A();
        L.a.b(this);
        if (f6224I0 && (jVar = this.f6267g0) != null) {
            jVar.j(this);
            this.f6267g0 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f6284p.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((n) this.f6284p.get(i4)).g(canvas, this, this.f6271i0);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f4;
        float f5;
        if (this.f6280n != null && !this.f6302y && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.f6280n.y()) {
                    f5 = -motionEvent.getAxisValue(9);
                } else {
                    f5 = 0.0f;
                }
                if (this.f6280n.x()) {
                    f4 = motionEvent.getAxisValue(10);
                    if (!(f5 == 0.0f && f4 == 0.0f)) {
                        G0((int) (f4 * this.f6259c0), (int) (f5 * this.f6261d0), motionEvent, 1);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f6280n.y()) {
                        f5 = -axisValue;
                    } else if (this.f6280n.x()) {
                        f4 = axisValue;
                        f5 = 0.0f;
                        G0((int) (f4 * this.f6259c0), (int) (f5 * this.f6261d0), motionEvent, 1);
                    }
                }
                f5 = 0.0f;
                f4 = 0.0f;
                G0((int) (f4 * this.f6259c0), (int) (f5 * this.f6261d0), motionEvent, 1);
            }
            f4 = 0.0f;
            G0((int) (f4 * this.f6259c0), (int) (f5 * this.f6261d0), motionEvent, 1);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        if (this.f6302y) {
            return false;
        }
        this.f6288r = null;
        if (Z(motionEvent)) {
            s();
            return true;
        }
        o oVar = this.f6280n;
        if (oVar == null) {
            return false;
        }
        boolean x3 = oVar.x();
        boolean y3 = this.f6280n.y();
        if (this.f6247Q == null) {
            this.f6247Q = VelocityTracker.obtain();
        }
        this.f6247Q.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f6304z) {
                this.f6304z = false;
            }
            this.f6246P = motionEvent.getPointerId(0);
            int x4 = (int) (motionEvent.getX() + 0.5f);
            this.f6250T = x4;
            this.f6248R = x4;
            int y4 = (int) (motionEvent.getY() + 0.5f);
            this.f6251U = y4;
            this.f6249S = y4;
            if (D1(motionEvent) || this.f6245O == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                F1(1);
            }
            int[] iArr = this.f6293t0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (y3) {
                x3 |= true;
            }
            C1(x3 ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.f6247Q.clear();
            F1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f6246P);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f6246P + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x5 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y5 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f6245O != 1) {
                int i4 = x5 - this.f6248R;
                int i5 = y5 - this.f6249S;
                if (!x3 || Math.abs(i4) <= this.f6252V) {
                    z3 = false;
                } else {
                    this.f6250T = x5;
                    z3 = true;
                }
                if (y3 && Math.abs(i5) > this.f6252V) {
                    this.f6251U = y5;
                    z3 = true;
                }
                if (z3) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            s();
        } else if (actionMasked == 5) {
            this.f6246P = motionEvent.getPointerId(actionIndex);
            int x6 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f6250T = x6;
            this.f6248R = x6;
            int y6 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f6251U = y6;
            this.f6249S = y6;
        } else if (actionMasked == 6) {
            R0(motionEvent);
        }
        if (this.f6245O == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        androidx.core.os.q.a("RV OnLayout");
        G();
        androidx.core.os.q.b();
        this.f6296v = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        o oVar = this.f6280n;
        if (oVar == null) {
            B(i4, i5);
            return;
        }
        boolean z3 = false;
        if (oVar.B0()) {
            int mode = View.MeasureSpec.getMode(i4);
            int mode2 = View.MeasureSpec.getMode(i5);
            this.f6280n.j1(this.f6258c, this.f6271i0, i4, i5);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z3 = true;
            }
            this.f6301x0 = z3;
            if (!z3 && this.f6278m != null) {
                if (this.f6271i0.f6418e == 1) {
                    H();
                }
                this.f6280n.L1(i4, i5);
                this.f6271i0.f6423j = true;
                I();
                this.f6280n.O1(i4, i5);
                if (this.f6280n.R1()) {
                    this.f6280n.L1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f6271i0.f6423j = true;
                    I();
                    this.f6280n.O1(i4, i5);
                }
                this.f6303y0 = getMeasuredWidth();
                this.f6305z0 = getMeasuredHeight();
            }
        } else if (this.f6292t) {
            this.f6280n.j1(this.f6258c, this.f6271i0, i4, i5);
        } else {
            if (this.f6232B) {
                B1();
                O0();
                W0();
                P0();
                z zVar = this.f6271i0;
                if (zVar.f6425l) {
                    zVar.f6421h = true;
                } else {
                    this.f6262e.j();
                    this.f6271i0.f6421h = false;
                }
                this.f6232B = false;
                E1(false);
            } else if (this.f6271i0.f6425l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            Adapter adapter = this.f6278m;
            if (adapter != null) {
                this.f6271i0.f6419f = adapter.d();
            } else {
                this.f6271i0.f6419f = 0;
            }
            B1();
            this.f6280n.j1(this.f6258c, this.f6271i0, i4, i5);
            E1(false);
            this.f6271i0.f6421h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i4, Rect rect) {
        if (B0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i4, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof x)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x xVar = (x) parcelable;
        this.f6260d = xVar;
        super.onRestoreInstanceState(xVar.t());
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        x xVar = new x(super.onSaveInstanceState());
        x xVar2 = this.f6260d;
        if (xVar2 != null) {
            xVar.u(xVar2);
        } else {
            o oVar = this.f6280n;
            if (oVar != null) {
                xVar.f6398c = oVar.n1();
            } else {
                xVar.f6398c = null;
            }
        }
        return xVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (i4 != i6 || i5 != i7) {
            z0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.f6302y
            r8 = 0
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r6.f6304z
            if (r0 == 0) goto L_0x000f
            goto L_0x01ef
        L_0x000f:
            boolean r0 = r17.P(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.s()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.f6280n
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.x()
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.f6280n
            boolean r11 = r0.y()
            android.view.VelocityTracker r0 = r6.f6247Q
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f6247Q = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.f6293t0
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.f6293t0
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01c5
            if (r0 == r9) goto L_0x0184
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01e6
        L_0x0066:
            r17.R0(r18)
            goto L_0x01e6
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.f6246P = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f6250T = r0
            r6.f6248R = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f6251U = r0
            r6.f6249S = r0
            goto L_0x01e6
        L_0x0087:
            r17.s()
            goto L_0x01e6
        L_0x008c:
            int r0 = r6.f6246P
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00b2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.append(r1)
            int r1 = r6.f6246P
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r8
        L_0x00b2:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.f6250T
            int r0 = r0 - r13
            int r1 = r6.f6251U
            int r1 = r1 - r14
            int r2 = r6.f6245O
            if (r2 == r9) goto L_0x00fb
            if (r10 == 0) goto L_0x00df
            if (r0 <= 0) goto L_0x00d4
            int r2 = r6.f6252V
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00db
        L_0x00d4:
            int r2 = r6.f6252V
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00db:
            if (r0 == 0) goto L_0x00df
            r2 = r9
            goto L_0x00e0
        L_0x00df:
            r2 = r8
        L_0x00e0:
            if (r11 == 0) goto L_0x00f6
            if (r1 <= 0) goto L_0x00ec
            int r3 = r6.f6252V
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00f3
        L_0x00ec:
            int r3 = r6.f6252V
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00f3:
            if (r1 == 0) goto L_0x00f6
            r2 = r9
        L_0x00f6:
            if (r2 == 0) goto L_0x00fb
            r6.setScrollState(r9)
        L_0x00fb:
            int r2 = r6.f6245O
            if (r2 != r9) goto L_0x01e6
            int[] r2 = r6.f6295u0
            r2[r8] = r8
            r2[r9] = r8
            float r2 = r18.getY()
            int r2 = r6.c1(r0, r2)
            int r15 = r0 - r2
            float r0 = r18.getX()
            int r0 = r6.d1(r1, r0)
            int r16 = r1 - r0
            if (r10 == 0) goto L_0x011d
            r1 = r15
            goto L_0x011e
        L_0x011d:
            r1 = r8
        L_0x011e:
            if (r11 == 0) goto L_0x0123
            r2 = r16
            goto L_0x0124
        L_0x0123:
            r2 = r8
        L_0x0124:
            int[] r3 = r6.f6295u0
            int[] r4 = r6.f6291s0
            r5 = 0
            r0 = r17
            boolean r0 = r0.K(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0153
            int[] r0 = r6.f6295u0
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.f6293t0
            r1 = r0[r8]
            int[] r2 = r6.f6291s0
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x0153:
            r0 = r16
            int[] r1 = r6.f6291s0
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.f6250T = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.f6251U = r14
            if (r10 == 0) goto L_0x0165
            r1 = r15
            goto L_0x0166
        L_0x0165:
            r1 = r8
        L_0x0166:
            if (r11 == 0) goto L_0x016a
            r2 = r0
            goto L_0x016b
        L_0x016a:
            r2 = r8
        L_0x016b:
            boolean r1 = r6.p1(r1, r2, r7, r8)
            if (r1 == 0) goto L_0x0178
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0178:
            androidx.recyclerview.widget.j r1 = r6.f6267g0
            if (r1 == 0) goto L_0x01e6
            if (r15 != 0) goto L_0x0180
            if (r0 == 0) goto L_0x01e6
        L_0x0180:
            r1.f(r6, r15, r0)
            goto L_0x01e6
        L_0x0184:
            android.view.VelocityTracker r0 = r6.f6247Q
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.f6247Q
            int r1 = r6.f6257b0
            float r1 = (float) r1
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r2, r1)
            r0 = 0
            if (r10 == 0) goto L_0x01a0
            android.view.VelocityTracker r1 = r6.f6247Q
            int r2 = r6.f6246P
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x01a1
        L_0x01a0:
            r1 = r0
        L_0x01a1:
            if (r11 == 0) goto L_0x01ad
            android.view.VelocityTracker r2 = r6.f6247Q
            int r3 = r6.f6246P
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x01ae
        L_0x01ad:
            r2 = r0
        L_0x01ae:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x01b6
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01be
        L_0x01b6:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.g0(r0, r1)
            if (r0 != 0) goto L_0x01c1
        L_0x01be:
            r6.setScrollState(r8)
        L_0x01c1:
            r17.m1()
            goto L_0x01eb
        L_0x01c5:
            int r0 = r7.getPointerId(r8)
            r6.f6246P = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f6250T = r0
            r6.f6248R = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f6251U = r0
            r6.f6249S = r0
            if (r11 == 0) goto L_0x01e3
            r10 = r10 | 2
        L_0x01e3:
            r6.C1(r10, r8)
        L_0x01e6:
            android.view.VelocityTracker r0 = r6.f6247Q
            r0.addMovement(r12)
        L_0x01eb:
            r12.recycle()
            return r9
        L_0x01ef:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public void p(D d4, l.b bVar, l.b bVar2) {
        i(d4);
        d4.G(false);
        if (this.f6244N.c(d4, bVar, bVar2)) {
            U0();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean p1(int i4, int i5, MotionEvent motionEvent, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z3;
        int i11 = i4;
        int i12 = i5;
        MotionEvent motionEvent2 = motionEvent;
        z();
        if (this.f6278m != null) {
            int[] iArr = this.f6295u0;
            iArr[0] = 0;
            iArr[1] = 0;
            q1(i11, i12, iArr);
            int[] iArr2 = this.f6295u0;
            int i13 = iArr2[0];
            int i14 = iArr2[1];
            i10 = i14;
            i9 = i13;
            i8 = i11 - i13;
            i7 = i12 - i14;
        } else {
            i10 = 0;
            i9 = 0;
            i8 = 0;
            i7 = 0;
        }
        if (!this.f6284p.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f6295u0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        L(i9, i10, i8, i7, this.f6291s0, i6, iArr3);
        int[] iArr4 = this.f6295u0;
        int i15 = iArr4[0];
        int i16 = i8 - i15;
        int i17 = iArr4[1];
        int i18 = i7 - i17;
        if (i15 == 0 && i17 == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        int i19 = this.f6250T;
        int[] iArr5 = this.f6291s0;
        int i20 = iArr5[0];
        this.f6250T = i19 - i20;
        int i21 = this.f6251U;
        int i22 = iArr5[1];
        this.f6251U = i21 - i22;
        int[] iArr6 = this.f6293t0;
        iArr6[0] = iArr6[0] + i20;
        iArr6[1] = iArr6[1] + i22;
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !C0443x.a(motionEvent2, 8194)) {
                Y0(motionEvent.getX(), (float) i16, motionEvent.getY(), (float) i18);
            }
            v(i4, i5);
        }
        if (!(i9 == 0 && i10 == 0)) {
            N(i9, i10);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z3 && i9 == 0 && i10 == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void q(String str) {
        if (B0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + U());
            }
            throw new IllegalStateException(str);
        } else if (this.f6238H > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + U()));
        }
    }

    /* access modifiers changed from: package-private */
    public Rect q0(View view) {
        p pVar = (p) view.getLayoutParams();
        if (!pVar.f6380c) {
            return pVar.f6379b;
        }
        if (this.f6271i0.e() && (pVar.u() || pVar.w())) {
            return pVar.f6379b;
        }
        Rect rect = pVar.f6379b;
        rect.set(0, 0, 0, 0);
        int size = this.f6284p.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f6272j.set(0, 0, 0, 0);
            ((n) this.f6284p.get(i4)).e(this.f6272j, view, this, this.f6271i0);
            int i5 = rect.left;
            Rect rect2 = this.f6272j;
            rect.left = i5 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f6380c = false;
        return rect;
    }

    /* access modifiers changed from: package-private */
    public void q1(int i4, int i5, int[] iArr) {
        int i6;
        int i7;
        B1();
        O0();
        androidx.core.os.q.a("RV Scroll");
        V(this.f6271i0);
        if (i4 != 0) {
            i6 = this.f6280n.H1(i4, this.f6258c, this.f6271i0);
        } else {
            i6 = 0;
        }
        if (i5 != 0) {
            i7 = this.f6280n.J1(i5, this.f6258c, this.f6271i0);
        } else {
            i7 = 0;
        }
        androidx.core.os.q.b();
        j1();
        P0();
        E1(false);
        if (iArr != null) {
            iArr[0] = i6;
            iArr[1] = i7;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean r(D d4) {
        l lVar = this.f6244N;
        if (lVar == null || lVar.g(d4, d4.o())) {
            return true;
        }
        return false;
    }

    public void r1(int i4) {
        if (!this.f6302y) {
            G1();
            o oVar = this.f6280n;
            if (oVar == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            oVar.I1(i4);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z3) {
        D m02 = m0(view);
        if (m02 != null) {
            if (m02.x()) {
                m02.f();
            } else if (!m02.J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + m02 + U());
            }
        } else if (f6217B0) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + U());
        }
        view.clearAnimation();
        E(view);
        super.removeDetachedView(view, z3);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f6280n.l1(this, this.f6271i0, view, view2) && view2 != null) {
            k1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        return this.f6280n.C1(this, view, rect, z3);
    }

    public void requestDisallowInterceptTouchEvent(boolean z3) {
        int size = this.f6286q.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((r) this.f6286q.get(i4)).c(z3);
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    public void requestLayout() {
        if (this.f6298w != 0 || this.f6302y) {
            this.f6300x = true;
        } else {
            super.requestLayout();
        }
    }

    public void scrollBy(int i4, int i5) {
        o oVar = this.f6280n;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f6302y) {
            boolean x3 = oVar.x();
            boolean y3 = this.f6280n.y();
            if (x3 || y3) {
                if (!x3) {
                    i4 = 0;
                }
                if (!y3) {
                    i5 = 0;
                }
                p1(i4, i5, (MotionEvent) null, 0);
            }
        }
    }

    public void scrollTo(int i4, int i5) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!v1(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(r rVar) {
        this.f6285p0 = rVar;
        P.o0(this, rVar);
    }

    public void setAdapter(Adapter adapter) {
        setLayoutFrozen(false);
        s1(adapter, false, true);
        X0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar != null) {
            setChildrenDrawingOrderEnabled(false);
        }
    }

    public void setClipToPadding(boolean z3) {
        if (z3 != this.f6268h) {
            z0();
        }
        this.f6268h = z3;
        super.setClipToPadding(z3);
        if (this.f6296v) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        androidx.core.util.g.g(kVar);
        this.f6239I = kVar;
        z0();
    }

    public void setHasFixedSize(boolean z3) {
        this.f6292t = z3;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.f6244N;
        if (lVar2 != null) {
            lVar2.k();
            this.f6244N.v((l.a) null);
        }
        this.f6244N = lVar;
        if (lVar != null) {
            lVar.v(this.f6281n0);
        }
    }

    public void setItemViewCacheSize(int i4) {
        this.f6258c.L(i4);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z3) {
        suppressLayout(z3);
    }

    public void setLayoutManager(o oVar) {
        if (oVar != this.f6280n) {
            G1();
            if (this.f6280n != null) {
                l lVar = this.f6244N;
                if (lVar != null) {
                    lVar.k();
                }
                this.f6280n.v1(this.f6258c);
                this.f6280n.w1(this.f6258c);
                this.f6258c.c();
                if (this.f6290s) {
                    this.f6280n.N(this, this.f6258c);
                }
                this.f6280n.P1((RecyclerView) null);
                this.f6280n = null;
            } else {
                this.f6258c.c();
            }
            this.f6264f.o();
            this.f6280n = oVar;
            if (oVar != null) {
                if (oVar.f6355b == null) {
                    oVar.P1(this);
                    if (this.f6290s) {
                        this.f6280n.M(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f6355b.U());
                }
            }
            this.f6258c.P();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z3) {
        getScrollingChildHelper().m(z3);
    }

    public void setOnFlingListener(q qVar) {
        this.f6253W = qVar;
    }

    @Deprecated
    public void setOnScrollListener(s sVar) {
        this.f6273j0 = sVar;
    }

    public void setPreserveFocusAfterLayout(boolean z3) {
        this.f6263e0 = z3;
    }

    public void setRecycledViewPool(t tVar) {
        this.f6258c.J(tVar);
    }

    @Deprecated
    public void setRecyclerListener(v vVar) {
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i4) {
        if (i4 != this.f6245O) {
            if (f6218C0) {
                StringBuilder sb = new StringBuilder();
                sb.append("setting scroll state to ");
                sb.append(i4);
                sb.append(" from ");
                sb.append(this.f6245O);
                new Exception();
            }
            this.f6245O = i4;
            if (i4 != 2) {
                H1();
            }
            M(i4);
        }
    }

    public void setScrollingTouchSlop(int i4) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i4 != 0) {
            if (i4 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i4 + "; using default value");
            } else {
                this.f6252V = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f6252V = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(B b4) {
        this.f6258c.K(b4);
    }

    public boolean startNestedScroll(int i4) {
        return getScrollingChildHelper().o(i4);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    public final void suppressLayout(boolean z3) {
        if (z3 != this.f6302y) {
            q("Do not suppressLayout in layout or scroll");
            if (!z3) {
                this.f6302y = false;
                if (!(!this.f6300x || this.f6280n == null || this.f6278m == null)) {
                    requestLayout();
                }
                this.f6300x = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f6302y = true;
            this.f6304z = true;
            G1();
        }
    }

    public boolean t0() {
        if (!this.f6296v || this.f6235E || this.f6262e.p()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean t1(D d4, int i4) {
        if (B0()) {
            d4.f6334q = i4;
            this.f6297v0.add(d4);
            return false;
        }
        P.y0(d4.f6318a, i4);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        int j4 = this.f6264f.j();
        for (int i4 = 0; i4 < j4; i4++) {
            D m02 = m0(this.f6264f.i(i4));
            if (!m02.J()) {
                m02.c();
            }
        }
        this.f6258c.d();
    }

    /* access modifiers changed from: package-private */
    public void v(int i4, int i5) {
        boolean z3;
        EdgeEffect edgeEffect = this.f6240J;
        if (edgeEffect == null || edgeEffect.isFinished() || i4 <= 0) {
            z3 = false;
        } else {
            this.f6240J.onRelease();
            z3 = this.f6240J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f6242L;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i4 < 0) {
            this.f6242L.onRelease();
            z3 |= this.f6242L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f6241K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i5 > 0) {
            this.f6241K.onRelease();
            z3 |= this.f6241K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f6243M;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i5 < 0) {
            this.f6243M.onRelease();
            z3 |= this.f6243M.isFinished();
        }
        if (z3) {
            P.f0(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void v0() {
        this.f6262e = new a(new f());
    }

    /* access modifiers changed from: package-private */
    public boolean v1(AccessibilityEvent accessibilityEvent) {
        int i4;
        int i5 = 0;
        if (!B0()) {
            return false;
        }
        if (accessibilityEvent != null) {
            i4 = C0405b.a(accessibilityEvent);
        } else {
            i4 = 0;
        }
        if (i4 != 0) {
            i5 = i4;
        }
        this.f6230A |= i5;
        return true;
    }

    /* access modifiers changed from: package-private */
    public int w(int i4) {
        return x(i4, this.f6240J, this.f6242L, getWidth());
    }

    public void w1(int i4, int i5) {
        x1(i4, i5, (Interpolator) null);
    }

    public void x1(int i4, int i5, Interpolator interpolator) {
        y1(i4, i5, interpolator, Integer.MIN_VALUE);
    }

    /* access modifiers changed from: package-private */
    public int y(int i4) {
        return x(i4, this.f6241K, this.f6243M, getHeight());
    }

    /* access modifiers changed from: package-private */
    public void y0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + U());
        }
        Resources resources = getContext().getResources();
        new i(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(b.fastscroll_default_thickness), resources.getDimensionPixelSize(b.fastscroll_minimum_range), resources.getDimensionPixelOffset(b.fastscroll_margin));
    }

    public void y1(int i4, int i5, Interpolator interpolator, int i6) {
        z1(i4, i5, interpolator, i6, false);
    }

    /* access modifiers changed from: package-private */
    public void z() {
        if (!this.f6296v || this.f6235E) {
            androidx.core.os.q.a("RV FullInvalidate");
            G();
            androidx.core.os.q.b();
        } else if (this.f6262e.p()) {
            if (this.f6262e.o(4) && !this.f6262e.o(11)) {
                androidx.core.os.q.a("RV PartialInvalidate");
                B1();
                O0();
                this.f6262e.w();
                if (!this.f6300x) {
                    if (u0()) {
                        G();
                    } else {
                        this.f6262e.i();
                    }
                }
                E1(true);
                P0();
                androidx.core.os.q.b();
            } else if (this.f6262e.p()) {
                androidx.core.os.q.a("RV FullInvalidate");
                G();
                androidx.core.os.q.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void z0() {
        this.f6243M = null;
        this.f6241K = null;
        this.f6242L = null;
        this.f6240J = null;
    }

    /* access modifiers changed from: package-private */
    public void z1(int i4, int i5, Interpolator interpolator, int i6, boolean z3) {
        o oVar = this.f6280n;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f6302y) {
            int i7 = 0;
            if (!oVar.x()) {
                i4 = 0;
            }
            if (!this.f6280n.y()) {
                i5 = 0;
            }
            if (i4 != 0 || i5 != 0) {
                if (i6 == Integer.MIN_VALUE || i6 > 0) {
                    if (z3) {
                        if (i4 != 0) {
                            i7 = 1;
                        }
                        if (i5 != 0) {
                            i7 |= 2;
                        }
                        C1(i7, 1);
                    }
                    this.f6265f0.e(i4, i5, i6, interpolator);
                    return;
                }
                scrollBy(i4, i5);
            }
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, V.a.recyclerViewStyle);
    }

    public static class x extends M.a {
        public static final Parcelable.Creator<x> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        Parcelable f6398c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public x createFromParcel(Parcel parcel) {
                return new x(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public x createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new x(parcel, classLoader);
            }

            /* renamed from: c */
            public x[] newArray(int i4) {
                return new x[i4];
            }
        }

        x(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6398c = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        /* access modifiers changed from: package-private */
        public void u(x xVar) {
            this.f6398c = xVar.f6398c;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeParcelable(this.f6398c, 0);
        }

        x(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i5 = i4;
        this.f6256b = new w();
        this.f6258c = new u();
        this.f6266g = new w();
        this.f6270i = new C0463a();
        this.f6272j = new Rect();
        this.f6274k = new Rect();
        this.f6276l = new RectF();
        this.f6282o = new ArrayList();
        this.f6284p = new ArrayList();
        this.f6286q = new ArrayList();
        this.f6298w = 0;
        this.f6235E = false;
        this.f6236F = false;
        this.f6237G = 0;
        this.f6238H = 0;
        this.f6239I = f6229N0;
        this.f6244N = new g();
        this.f6245O = 0;
        this.f6246P = -1;
        this.f6259c0 = Float.MIN_VALUE;
        this.f6261d0 = Float.MIN_VALUE;
        this.f6263e0 = true;
        this.f6265f0 = new C();
        this.f6269h0 = f6224I0 ? new j.b() : null;
        this.f6271i0 = new z();
        this.f6277l0 = false;
        this.f6279m0 = false;
        this.f6281n0 = new m();
        this.f6283o0 = false;
        this.f6287q0 = new int[2];
        this.f6291s0 = new int[2];
        this.f6293t0 = new int[2];
        this.f6295u0 = new int[2];
        this.f6297v0 = new ArrayList();
        this.f6299w0 = new C0464b();
        this.f6303y0 = 0;
        this.f6305z0 = 0;
        this.f6231A0 = new C0466d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f6252V = viewConfiguration.getScaledTouchSlop();
        this.f6259c0 = S.c(viewConfiguration, context2);
        this.f6261d0 = S.e(viewConfiguration, context2);
        this.f6255a0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f6257b0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f6254a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f6244N.v(this.f6281n0);
        v0();
        x0();
        w0();
        if (P.z(this) == 0) {
            P.y0(this, 1);
        }
        this.f6233C = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new r(this));
        int[] iArr = c.f1535a;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i5, 0);
        P.m0(this, context, iArr, attributeSet, obtainStyledAttributes, i4, 0);
        String string = obtainStyledAttributes.getString(c.f1544j);
        if (obtainStyledAttributes.getInt(c.f1538d, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f6268h = obtainStyledAttributes.getBoolean(c.f1537c, true);
        boolean z3 = obtainStyledAttributes.getBoolean(c.f1539e, false);
        this.f6294u = z3;
        if (z3) {
            y0((StateListDrawable) obtainStyledAttributes.getDrawable(c.f1542h), obtainStyledAttributes.getDrawable(c.f1543i), (StateListDrawable) obtainStyledAttributes.getDrawable(c.f1540f), obtainStyledAttributes.getDrawable(c.f1541g));
        }
        obtainStyledAttributes.recycle();
        A(context, string, attributeSet, i4, 0);
        int[] iArr2 = f6219D0;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i5, 0);
        P.m0(this, context, iArr2, attributeSet, obtainStyledAttributes2, i4, 0);
        boolean z4 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z4);
        L.a.d(this, true);
    }

    public static class p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        D f6378a;

        /* renamed from: b  reason: collision with root package name */
        final Rect f6379b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        boolean f6380c = true;

        /* renamed from: d  reason: collision with root package name */
        boolean f6381d = false;

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int t() {
            return this.f6378a.m();
        }

        public boolean u() {
            return this.f6378a.y();
        }

        public boolean v() {
            return this.f6378a.v();
        }

        public boolean w() {
            return this.f6378a.t();
        }

        public p(int i4, int i5) {
            super(i4, i5);
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public p(p pVar) {
            super(pVar);
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.f6280n;
        if (oVar != null) {
            return oVar.S(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + U());
    }
}
