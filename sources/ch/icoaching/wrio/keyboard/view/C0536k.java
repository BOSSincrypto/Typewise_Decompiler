package ch.icoaching.wrio.keyboard.view;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.icoaching.wrio.C0553q;
import ch.icoaching.wrio.C0554s;
import ch.icoaching.wrio.C0559x;
import ch.icoaching.wrio.CoroutineUtilsKt;
import ch.icoaching.wrio.V;
import ch.icoaching.wrio.keyboard.E;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import ch.icoaching.wrio.keyboard.y;
import ch.icoaching.wrio.logging.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D;
import kotlinx.coroutines.L;
import kotlinx.coroutines.g0;
import l2.q;
import u2.p;
import w2.C0930a;

/* renamed from: ch.icoaching.wrio.keyboard.view.k  reason: case insensitive filesystem */
public abstract class C0536k extends FrameLayout {

    /* renamed from: A  reason: collision with root package name */
    private boolean f10360A;

    /* renamed from: B  reason: collision with root package name */
    private boolean f10361B;

    /* renamed from: C  reason: collision with root package name */
    private final Map f10362C = new LinkedHashMap();

    /* renamed from: D  reason: collision with root package name */
    private PointF f10363D;

    /* renamed from: E  reason: collision with root package name */
    private MotionEvent f10364E;

    /* renamed from: F  reason: collision with root package name */
    private g0 f10365F;

    /* renamed from: G  reason: collision with root package name */
    private g0 f10366G;

    /* renamed from: H  reason: collision with root package name */
    private g0 f10367H;

    /* renamed from: I  reason: collision with root package name */
    private float f10368I = Float.MAX_VALUE;

    /* renamed from: J  reason: collision with root package name */
    private float f10369J;

    /* renamed from: K  reason: collision with root package name */
    private g0 f10370K;

    /* renamed from: L  reason: collision with root package name */
    private long f10371L;

    /* renamed from: M  reason: collision with root package name */
    private float f10372M;

    /* renamed from: a  reason: collision with root package name */
    private boolean f10373a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f10374b = true;

    /* renamed from: c  reason: collision with root package name */
    private final List f10375c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private S0.a f10376d;

    /* renamed from: e  reason: collision with root package name */
    public ThemeModel.b f10377e;

    /* renamed from: f  reason: collision with root package name */
    private y f10378f;

    /* renamed from: g  reason: collision with root package name */
    protected ThemeModel.SpecialOverlaysTheme f10379g;

    /* renamed from: h  reason: collision with root package name */
    protected RecyclerView f10380h;

    /* renamed from: i  reason: collision with root package name */
    private final int f10381i = C0553q.a(380);

    /* renamed from: j  reason: collision with root package name */
    protected ConstraintLayout f10382j;

    /* renamed from: k  reason: collision with root package name */
    protected ImageView f10383k;

    /* renamed from: l  reason: collision with root package name */
    protected ImageView f10384l;

    /* renamed from: m  reason: collision with root package name */
    protected ImageView f10385m;

    /* renamed from: n  reason: collision with root package name */
    protected ImageView f10386n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f10387o = true;

    /* renamed from: p  reason: collision with root package name */
    private boolean f10388p;

    /* renamed from: q  reason: collision with root package name */
    private final int f10389q = C0553q.a(2);

    /* renamed from: r  reason: collision with root package name */
    private final int f10390r = C0553q.a(8);

    /* renamed from: s  reason: collision with root package name */
    private int f10391s = C0553q.a(8);

    /* renamed from: t  reason: collision with root package name */
    private int f10392t = C0553q.a(8);

    /* renamed from: u  reason: collision with root package name */
    private int f10393u = C0553q.a(16);
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public boolean f10394v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f10395w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f10396x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f10397y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f10398z;

    /* renamed from: ch.icoaching.wrio.keyboard.view.k$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final PointF f10399a;

        /* renamed from: b  reason: collision with root package name */
        private final View f10400b;

        public a(PointF pointF, View view) {
            o.e(pointF, "locationInLayout");
            o.e(view, "view");
            this.f10399a = pointF;
            this.f10400b = view;
        }

        public final PointF a() {
            return this.f10399a;
        }

        public final View b() {
            return this.f10400b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return o.a(this.f10399a, aVar.f10399a) && o.a(this.f10400b, aVar.f10400b);
        }

        public int hashCode() {
            return (this.f10399a.hashCode() * 31) + this.f10400b.hashCode();
        }

        public String toString() {
            return "PositionedClickableView(locationInLayout=" + this.f10399a + ", view=" + this.f10400b + ')';
        }
    }

    /* renamed from: ch.icoaching.wrio.keyboard.view.k$b */
    static final class b extends SuspendLambda implements p {

        /* renamed from: a  reason: collision with root package name */
        int f10401a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C0536k f10402b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C0536k kVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f10402b = kVar;
        }

        /* renamed from: a */
        public final Object invoke(q qVar, kotlin.coroutines.c cVar) {
            return ((b) create(qVar, cVar)).invokeSuspend(q.f14567a);
        }

        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new b(this.f10402b, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.f();
            if (this.f10401a == 0) {
                kotlin.f.b(obj);
                this.f10402b.f(1);
                return q.f14567a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: ch.icoaching.wrio.keyboard.view.k$c */
    static final class c extends SuspendLambda implements p {

        /* renamed from: a  reason: collision with root package name */
        int f10403a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C0536k f10404b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C0536k kVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f10404b = kVar;
        }

        /* renamed from: a */
        public final Object invoke(q qVar, kotlin.coroutines.c cVar) {
            return ((c) create(qVar, cVar)).invokeSuspend(q.f14567a);
        }

        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new c(this.f10404b, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.f();
            if (this.f10403a == 0) {
                kotlin.f.b(obj);
                this.f10404b.f(-1);
                return q.f14567a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: ch.icoaching.wrio.keyboard.view.k$d */
    static final class d extends SuspendLambda implements p {

        /* renamed from: a  reason: collision with root package name */
        int f10405a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C0536k f10406b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C0536k kVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f10406b = kVar;
        }

        /* renamed from: a */
        public final Object invoke(q qVar, kotlin.coroutines.c cVar) {
            return ((d) create(qVar, cVar)).invokeSuspend(q.f14567a);
        }

        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new d(this.f10406b, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.f();
            if (this.f10405a == 0) {
                kotlin.f.b(obj);
                this.f10406b.F(-1);
                return q.f14567a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: ch.icoaching.wrio.keyboard.view.k$e */
    static final class e extends SuspendLambda implements p {

        /* renamed from: a  reason: collision with root package name */
        int f10407a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C0536k f10408b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C0536k kVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f10408b = kVar;
        }

        /* renamed from: a */
        public final Object invoke(q qVar, kotlin.coroutines.c cVar) {
            return ((e) create(qVar, cVar)).invokeSuspend(q.f14567a);
        }

        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new e(this.f10408b, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.f();
            if (this.f10407a == 0) {
                kotlin.f.b(obj);
                this.f10408b.F(1);
                return q.f14567a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: ch.icoaching.wrio.keyboard.view.k$f */
    static final class f extends SuspendLambda implements p {

        /* renamed from: a  reason: collision with root package name */
        int f10409a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C0536k f10410b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f10411c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ PointF f10412d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f10413e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C0536k kVar, a aVar, PointF pointF, int i4, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f10410b = kVar;
            this.f10411c = aVar;
            this.f10412d = pointF;
            this.f10413e = i4;
        }

        /* renamed from: a */
        public final Object invoke(D d4, kotlin.coroutines.c cVar) {
            return ((f) create(d4, cVar)).invokeSuspend(q.f14567a);
        }

        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new f(this.f10410b, this.f10411c, this.f10412d, this.f10413e, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object f4 = kotlin.coroutines.intrinsics.a.f();
            int i4 = this.f10409a;
            if (i4 == 0) {
                kotlin.f.b(obj);
                this.f10409a = 1;
                if (L.a(500, this) == f4) {
                    return f4;
                }
            } else if (i4 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean unused = this.f10410b.i(this.f10411c, this.f10412d, this.f10413e);
            return q.f14567a;
        }
    }

    /* renamed from: ch.icoaching.wrio.keyboard.view.k$g */
    static final class g extends SuspendLambda implements p {

        /* renamed from: a  reason: collision with root package name */
        int f10414a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C0536k f10415b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C0536k kVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f10415b = kVar;
        }

        /* renamed from: a */
        public final Object invoke(q qVar, kotlin.coroutines.c cVar) {
            return ((g) create(qVar, cVar)).invokeSuspend(q.f14567a);
        }

        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new g(this.f10415b, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.f();
            if (this.f10414a == 0) {
                kotlin.f.b(obj);
                this.f10415b.f10394v = true;
                this.f10415b.C(1);
                return q.f14567a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0536k(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
    }

    private final PointF b(a aVar) {
        return new PointF(aVar.a().x + (((float) aVar.b().getWidth()) / 2.0f), aVar.a().y + (((float) aVar.b().getHeight()) / 2.0f));
    }

    private final a c(MotionEvent motionEvent, int i4) {
        int findPointerIndex = motionEvent.findPointerIndex(i4);
        PointF pointF = new PointF(motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex));
        a aVar = (a) this.f10375c.get(0);
        float a4 = C0559x.a(pointF, b(aVar));
        Iterator it = this.f10375c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            a aVar2 = (a) it.next();
            if (aVar2.a().x <= pointF.x && aVar2.a().x + ((float) aVar2.b().getWidth()) >= pointF.x && aVar2.a().y <= pointF.y && aVar2.a().y + ((float) aVar2.b().getHeight()) >= pointF.y) {
                aVar = aVar2;
                break;
            }
            float a5 = C0559x.a(pointF, b(aVar2));
            if (a5 < a4) {
                aVar = aVar2;
                a4 = a5;
            }
        }
        if (pointF.x < aVar.a().x - ((float) this.f10389q) || pointF.x > aVar.a().x + ((float) aVar.b().getWidth()) + ((float) this.f10389q) || pointF.y < aVar.a().y - ((float) this.f10389q) || pointF.y > aVar.a().y + ((float) aVar.b().getHeight()) + ((float) this.f10389q)) {
            return null;
        }
        return aVar;
    }

    /* access modifiers changed from: private */
    public static final q d(C0536k kVar, String str) {
        o.e(str, "it");
        kVar.f10394v = true;
        kVar.E(str);
        return q.f14567a;
    }

    private final void e() {
        g0 g0Var = this.f10365F;
        if (g0Var != null) {
            g0.a.a(g0Var, (CancellationException) null, 1, (Object) null);
        }
        this.f10365F = null;
        g0 g0Var2 = this.f10366G;
        if (g0Var2 != null) {
            g0.a.a(g0Var2, (CancellationException) null, 1, (Object) null);
        }
        this.f10366G = null;
        g0 g0Var3 = this.f10367H;
        if (g0Var3 != null) {
            g0.a.a(g0Var3, (CancellationException) null, 1, (Object) null);
        }
        this.f10367H = null;
        g0 g0Var4 = this.f10370K;
        if (g0Var4 != null) {
            g0.a.a(g0Var4, (CancellationException) null, 1, (Object) null);
        }
        this.f10370K = null;
        S0.a aVar = this.f10376d;
        if (aVar != null) {
            aVar.e();
        }
        this.f10376d = null;
        y yVar = this.f10378f;
        if (yVar != null) {
            yVar.b();
        }
        n();
    }

    /* access modifiers changed from: private */
    public final void f(int i4) {
        if (i4 > 0) {
            this.f10394v = true;
            C(i4);
            return;
        }
        this.f10394v = true;
        G(Math.abs(i4));
    }

    private final boolean g(float f4, MotionEvent motionEvent) {
        if (motionEvent.getEventTime() - motionEvent.getDownTime() < 300) {
            return false;
        }
        PointF pointF = this.f10363D;
        int i4 = 1;
        if (pointF == null) {
            this.f10363D = new PointF(motionEvent.getX(), motionEvent.getY());
            y yVar = this.f10378f;
            if (yVar != null) {
                yVar.a();
            }
            if (f4 <= 0.0f) {
                i4 = -1;
            }
            f(i4);
            return false;
        } else if (motionEvent.getX() < this.f10369J) {
            this.f10363D = new PointF(motionEvent.getX(), motionEvent.getY());
            if (this.f10366G == null) {
                this.f10366G = kotlinx.coroutines.flow.e.j(kotlinx.coroutines.flow.e.k(CoroutineUtilsKt.b(50, 0, 2, (Object) null), new b(this, (kotlin.coroutines.c) null)), V.a(this));
            }
            return false;
        } else if (motionEvent.getX() > this.f10368I) {
            this.f10363D = new PointF(motionEvent.getX(), motionEvent.getY());
            if (this.f10366G == null) {
                this.f10366G = kotlinx.coroutines.flow.e.j(kotlinx.coroutines.flow.e.k(CoroutineUtilsKt.b(50, 0, 2, (Object) null), new c(this, (kotlin.coroutines.c) null)), V.a(this));
            }
            return false;
        } else {
            g0 g0Var = this.f10366G;
            if (g0Var != null) {
                g0.a.a(g0Var, (CancellationException) null, 1, (Object) null);
            }
            this.f10366G = null;
            float x3 = pointF.x - motionEvent.getX();
            int abs = (int) (Math.abs(x3) / ((float) this.f10393u));
            if (abs > 0) {
                if (x3 <= 0.0f) {
                    abs *= -1;
                }
                this.f10363D = new PointF(motionEvent.getX(), motionEvent.getY());
                f(abs);
            }
            return false;
        }
    }

    private final boolean h(MotionEvent motionEvent) {
        if (!this.f10398z) {
            return getContentRecyclerView().onTouchEvent(motionEvent);
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final boolean i(a aVar, PointF pointF, int i4) {
        if (this.f10360A || this.f10361B || q()) {
            return false;
        }
        this.f10360A = true;
        int id = aVar.b().getId();
        if (id == E.iv_backspace) {
            aVar.b().performClick();
            if (this.f10365F == null) {
                this.f10365F = kotlinx.coroutines.flow.e.j(kotlinx.coroutines.flow.e.k(CoroutineUtilsKt.b(50, 0, 2, (Object) null), new g(this, (kotlin.coroutines.c) null)), V.a(this));
            }
            return false;
        } else if (id == E.iv_space) {
            if (this.f10374b) {
                aVar.b().performClick();
                this.f10396x = true;
                this.f10398z = true;
                y yVar = this.f10378f;
                if (yVar != null) {
                    yVar.a();
                }
            }
            return false;
        } else if (!this.f10362C.containsKey(Integer.valueOf(i4))) {
            return false;
        } else {
            return A(pointF, aVar);
        }
    }

    private final void n() {
        Log.d(Log.f10572a, "SpecialLayout", "clearClassFields()", (Throwable) null, 4, (Object) null);
        this.f10362C.clear();
        g0 g0Var = this.f10365F;
        if (g0Var != null) {
            g0.a.a(g0Var, (CancellationException) null, 1, (Object) null);
        }
        this.f10365F = null;
        this.f10394v = false;
        this.f10364E = null;
        this.f10363D = null;
        this.f10395w = false;
        this.f10396x = false;
        this.f10397y = false;
        this.f10398z = false;
        this.f10360A = false;
        this.f10361B = false;
    }

    private final boolean o(MotionEvent motionEvent) {
        PointF pointF = this.f10363D;
        if (pointF == null) {
            this.f10363D = new PointF(motionEvent.getX(), motionEvent.getY());
            return false;
        } else if (motionEvent.getX() < this.f10369J) {
            this.f10363D = new PointF(motionEvent.getX(), motionEvent.getY());
            if (this.f10367H == null) {
                this.f10367H = kotlinx.coroutines.flow.e.j(kotlinx.coroutines.flow.e.k(CoroutineUtilsKt.b(50, 0, 2, (Object) null), new d(this, (kotlin.coroutines.c) null)), V.a(this));
            }
            return false;
        } else if (motionEvent.getX() > this.f10368I) {
            this.f10363D = new PointF(motionEvent.getX(), motionEvent.getY());
            if (this.f10367H == null) {
                this.f10367H = kotlinx.coroutines.flow.e.j(kotlinx.coroutines.flow.e.k(CoroutineUtilsKt.b(50, 0, 2, (Object) null), new e(this, (kotlin.coroutines.c) null)), V.a(this));
            }
            return false;
        } else {
            g0 g0Var = this.f10367H;
            if (g0Var != null) {
                g0.a.a(g0Var, (CancellationException) null, 1, (Object) null);
            }
            this.f10367H = null;
            float x3 = pointF.x - motionEvent.getX();
            int abs = (int) (Math.abs(x3) / ((float) this.f10393u));
            if (abs > 0) {
                if (x3 >= 0.0f) {
                    abs *= -1;
                }
                this.f10363D = new PointF(motionEvent.getX(), motionEvent.getY());
                F(abs);
            }
            return false;
        }
    }

    private final boolean p(MotionEvent motionEvent, int i4) {
        Log log = Log.f10572a;
        Log.d(log, "SpecialLayout", "processOnDown() :: " + i4, (Throwable) null, 4, (Object) null);
        a c4 = c(motionEvent, i4);
        if (c4 == null || c4.b().getVisibility() != 0) {
            return false;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i4);
        PointF pointF = new PointF(motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex));
        this.f10362C.put(Integer.valueOf(i4), c4);
        MotionEvent motionEvent2 = this.f10364E;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.f10364E = MotionEvent.obtain(motionEvent);
        if (this.f10361B) {
            return true;
        }
        this.f10370K = C0739h.d(V.a(c4.b()), (CoroutineContext) null, (CoroutineStart) null, new f(this, c4, pointF, i4, (kotlin.coroutines.c) null), 3, (Object) null);
        return true;
    }

    private final boolean q() {
        if (getContentRecyclerView().getScrollState() != 0 || System.currentTimeMillis() - 10 < this.f10371L) {
            return true;
        }
        return false;
    }

    private final boolean r(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        MotionEvent motionEvent3 = this.f10364E;
        boolean z3 = false;
        if (motionEvent3 == null) {
            return false;
        }
        if (this.f10361B) {
            Log.d(Log.f10572a, "SpecialLayout", "preProcessOnMove() :: ...1 In multitouch", (Throwable) null, 4, (Object) null);
        } else {
            Log log = Log.f10572a;
            Log.d(log, "SpecialLayout", "preProcessOnMove() :: ...2 isInVerticalScrollGesture = " + this.f10397y, (Throwable) null, 4, (Object) null);
            if (this.f10397y) {
                z3 = h(motionEvent);
            } else {
                boolean s4 = s(motionEvent2, motionEvent2.getPointerId(motionEvent.getActionIndex()));
                if (s4 || this.f10395w || this.f10396x || this.f10376d != null) {
                    Log.d(log, "SpecialLayout", "preProcessOnMove() :: ...3.1", (Throwable) null, 4, (Object) null);
                    z3 = s4;
                } else {
                    float a4 = C0554s.a(motionEvent3, motionEvent2);
                    Log.d(log, "SpecialLayout", "preProcessOnMove() :: ...3.2 distance = " + a4, (Throwable) null, 4, (Object) null);
                    if (a4 > ((float) this.f10392t)) {
                        z3 = h(motionEvent);
                    }
                }
            }
        }
        Log log2 = Log.f10572a;
        Log.d(log2, "SpecialLayout", "preProcessOnMove() :: ...4 gestureCompleted = " + z3, (Throwable) null, 4, (Object) null);
        if (z3) {
            MotionEvent motionEvent4 = this.f10364E;
            if (motionEvent4 != null) {
                motionEvent4.recycle();
            }
            this.f10364E = MotionEvent.obtain(motionEvent);
        }
        return z3;
    }

    private final boolean s(MotionEvent motionEvent, int i4) {
        MotionEvent motionEvent2;
        Log log = Log.f10572a;
        Log.d(log, "SpecialLayout", "processOnMove() :: " + i4, (Throwable) null, 4, (Object) null);
        int findPointerIndex = motionEvent.findPointerIndex(i4);
        PointF pointF = new PointF(motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex));
        a aVar = (a) this.f10362C.get(Integer.valueOf(i4));
        if (aVar == null || (motionEvent2 = this.f10364E) == null) {
            return false;
        }
        float x3 = motionEvent2.getX() - pointF.x;
        long eventTime = motionEvent.getEventTime() - motionEvent.getDownTime();
        S0.a aVar2 = this.f10376d;
        if (aVar2 != null) {
            aVar2.l(motionEvent, new T(this));
            return false;
        } else if (this.f10398z) {
            return o(motionEvent);
        } else {
            if (this.f10396x) {
                return g(x3, motionEvent);
            }
            if (((int) Math.abs(x3)) > this.f10390r) {
                this.f10395w = true;
                if (((int) Math.abs(x3)) <= this.f10391s) {
                    return false;
                }
                g0 g0Var = this.f10370K;
                if (g0Var != null) {
                    g0.a.a(g0Var, (CancellationException) null, 1, (Object) null);
                }
                this.f10370K = null;
                this.f10396x = true;
                return g(x3, motionEvent);
            } else if (eventTime > 500) {
                return i(aVar, pointF, i4);
            } else {
                return false;
            }
        }
    }

    private final boolean t(MotionEvent motionEvent) {
        if (u(motionEvent, motionEvent.getPointerId(motionEvent.getActionIndex()))) {
            return true;
        }
        return h(motionEvent);
    }

    private final boolean u(MotionEvent motionEvent, int i4) {
        Log.d(Log.f10572a, "SpecialLayout", "processOnUp() :: " + i4, (Throwable) null, 4, (Object) null);
        int findPointerIndex = motionEvent.findPointerIndex(i4);
        PointF pointF = new PointF(motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex));
        g0 g0Var = this.f10370K;
        boolean z3 = true;
        if (g0Var != null) {
            g0.a.a(g0Var, (CancellationException) null, 1, (Object) null);
        }
        this.f10370K = null;
        S0.a aVar = this.f10376d;
        if (aVar != null) {
            aVar.e();
            this.f10376d = null;
        } else if (this.f10396x) {
            if (this.f10398z) {
                g0 g0Var2 = this.f10367H;
                if (g0Var2 != null) {
                    g0.a.a(g0Var2, (CancellationException) null, 1, (Object) null);
                }
                this.f10367H = null;
            } else {
                g0 g0Var3 = this.f10366G;
                if (g0Var3 != null) {
                    g0.a.a(g0Var3, (CancellationException) null, 1, (Object) null);
                    this.f10366G = null;
                } else if (motionEvent.getEventTime() - motionEvent.getDownTime() < 300) {
                    MotionEvent motionEvent2 = this.f10364E;
                    o.b(motionEvent2);
                    float x3 = motionEvent2.getX() - pointF.x;
                    if (((int) (Math.abs(x3) / ((float) this.f10393u))) > 0) {
                        if (x3 > 0.0f) {
                            f(1);
                        } else {
                            D();
                        }
                    }
                }
            }
        } else if (q()) {
            this.f10362C.remove(Integer.valueOf(i4));
            if (this.f10362C.isEmpty()) {
                n();
            }
            if (this.f10362C.size() <= 1) {
                z3 = false;
            }
            this.f10361B = z3;
            return false;
        } else {
            a aVar2 = (a) this.f10362C.get(Integer.valueOf(i4));
            if (aVar2 == null) {
                this.f10362C.remove(Integer.valueOf(i4));
                if (this.f10362C.isEmpty()) {
                    n();
                }
                if (this.f10362C.size() <= 1) {
                    z3 = false;
                }
                this.f10361B = z3;
                return false;
            } else if (!this.f10398z) {
                z(pointF, aVar2);
            }
        }
        g0 g0Var4 = this.f10365F;
        if (g0Var4 != null) {
            g0.a.a(g0Var4, (CancellationException) null, 1, (Object) null);
        }
        this.f10365F = null;
        if (this.f10394v) {
            H();
        }
        this.f10394v = false;
        y yVar = this.f10378f;
        if (yVar != null) {
            yVar.b();
        }
        this.f10362C.remove(Integer.valueOf(i4));
        if (this.f10362C.isEmpty()) {
            n();
        }
        return true;
    }

    public abstract boolean A(PointF pointF, a aVar);

    /* access modifiers changed from: protected */
    public final void B(boolean z3) {
        Log log = Log.f10572a;
        Log.d(log, "SpecialLayout", "onContentVerticalScrollStateChange() :: " + z3, (Throwable) null, 4, (Object) null);
        this.f10371L = System.currentTimeMillis();
        this.f10397y = z3;
    }

    /* access modifiers changed from: protected */
    public abstract void C(int i4);

    /* access modifiers changed from: protected */
    public abstract void D();

    /* access modifiers changed from: protected */
    public abstract void E(String str);

    /* access modifiers changed from: protected */
    public abstract void F(int i4);

    /* access modifiers changed from: protected */
    public abstract void G(int i4);

    /* access modifiers changed from: protected */
    public abstract void H();

    public final void I() {
        e();
    }

    public final void J(ImageView imageView, int i4) {
        o.e(imageView, "imageView");
        imageView.getLayoutParams().width = i4;
    }

    public final void K(int i4, int i5) {
        Log log = Log.f10572a;
        Log.d(log, "SpecialLayout", "setMinimumDistanceToStartScrollGestures() :: " + i4 + " | " + i5, (Throwable) null, 4, (Object) null);
        this.f10391s = i4;
    }

    /* access modifiers changed from: protected */
    public final ConstraintLayout getClIcons() {
        ConstraintLayout constraintLayout = this.f10382j;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        o.p("clIcons");
        return null;
    }

    /* access modifiers changed from: protected */
    public final RecyclerView getContentRecyclerView() {
        RecyclerView recyclerView = this.f10380h;
        if (recyclerView != null) {
            return recyclerView;
        }
        o.p("contentRecyclerView");
        return null;
    }

    /* access modifiers changed from: protected */
    public final ImageView getImgBackspace() {
        ImageView imageView = this.f10384l;
        if (imageView != null) {
            return imageView;
        }
        o.p("imgBackspace");
        return null;
    }

    /* access modifiers changed from: protected */
    public final ImageView getImgExit() {
        ImageView imageView = this.f10383k;
        if (imageView != null) {
            return imageView;
        }
        o.p("imgExit");
        return null;
    }

    /* access modifiers changed from: protected */
    public final ImageView getImgReturn() {
        ImageView imageView = this.f10386n;
        if (imageView != null) {
            return imageView;
        }
        o.p("imgReturn");
        return null;
    }

    /* access modifiers changed from: protected */
    public final ImageView getImgSpace() {
        ImageView imageView = this.f10385m;
        if (imageView != null) {
            return imageView;
        }
        o.p("imgSpace");
        return null;
    }

    public final List<a> getKeys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease() {
        return this.f10375c;
    }

    public final S0.a getLongClickMenu$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease() {
        return this.f10376d;
    }

    public final ThemeModel.b getLongClickMenuTheme$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease() {
        ThemeModel.b bVar = this.f10377e;
        if (bVar != null) {
            return bVar;
        }
        o.p("longClickMenuTheme");
        return null;
    }

    public final y getOnLongTouchListener$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease() {
        return this.f10378f;
    }

    /* access modifiers changed from: protected */
    public final int getSmallKeyboardUpperBound() {
        return this.f10381i;
    }

    /* access modifiers changed from: protected */
    public final ThemeModel.SpecialOverlaysTheme getSpecialOverlayTheme() {
        ThemeModel.SpecialOverlaysTheme specialOverlaysTheme = this.f10379g;
        if (specialOverlaysTheme != null) {
            return specialOverlaysTheme;
        }
        o.p("specialOverlayTheme");
        return null;
    }

    /* access modifiers changed from: protected */
    public final void m(int i4) {
        J(getImgExit(), i4);
        J(getImgBackspace(), i4);
        J(getImgSpace(), i4);
        J(getImgReturn(), i4);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        o.e(motionEvent, "event");
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        float measuredWidth = (float) getMeasuredWidth();
        this.f10372M = measuredWidth;
        float f4 = measuredWidth / 10.0f;
        this.f10369J = f4;
        this.f10368I = measuredWidth - f4;
        this.f10393u = C0930a.b(measuredWidth * 0.022f);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        o.e(motionEvent, "event");
        if (!this.f10373a) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                p(motionEvent, motionEvent.getPointerId(motionEvent.getActionIndex()));
                return h(motionEvent);
            case 1:
                return t(motionEvent);
            case 2:
                return r(motionEvent);
            case 3:
                return t(motionEvent);
            case 4:
                return r(motionEvent);
            case 5:
                if (this.f10361B) {
                    return false;
                }
                this.f10361B = true;
                p(motionEvent, motionEvent.getPointerId(motionEvent.getActionIndex()));
                return h(motionEvent);
            case 6:
                return t(motionEvent);
            default:
                return h(motionEvent);
        }
    }

    public final void setBackspaceButtonVisibility(boolean z3) {
        int i4;
        this.f10387o = z3;
        if (this.f10384l != null) {
            ImageView imgBackspace = getImgBackspace();
            if (z3) {
                i4 = 0;
            } else {
                i4 = 4;
            }
            imgBackspace.setVisibility(i4);
        }
    }

    /* access modifiers changed from: protected */
    public final void setBackspaceButtonVisible(boolean z3) {
        this.f10387o = z3;
    }

    /* access modifiers changed from: protected */
    public final void setClIcons(ConstraintLayout constraintLayout) {
        o.e(constraintLayout, "<set-?>");
        this.f10382j = constraintLayout;
    }

    /* access modifiers changed from: protected */
    public final void setContentRecyclerView(RecyclerView recyclerView) {
        o.e(recyclerView, "<set-?>");
        this.f10380h = recyclerView;
    }

    public final void setCursorEnabled(boolean z3) {
        this.f10374b = z3;
    }

    /* access modifiers changed from: protected */
    public final void setHexagonLandscape(boolean z3) {
        this.f10388p = z3;
    }

    /* access modifiers changed from: protected */
    public final void setImgBackspace(ImageView imageView) {
        o.e(imageView, "<set-?>");
        this.f10384l = imageView;
    }

    /* access modifiers changed from: protected */
    public final void setImgExit(ImageView imageView) {
        o.e(imageView, "<set-?>");
        this.f10383k = imageView;
    }

    /* access modifiers changed from: protected */
    public final void setImgReturn(ImageView imageView) {
        o.e(imageView, "<set-?>");
        this.f10386n = imageView;
    }

    /* access modifiers changed from: protected */
    public final void setImgSpace(ImageView imageView) {
        o.e(imageView, "<set-?>");
        this.f10385m = imageView;
    }

    public final void setKeyClickDetectionEnabled(boolean z3) {
        this.f10373a = z3;
    }

    public final void setLongClickMenu$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(S0.a aVar) {
        this.f10376d = aVar;
    }

    public final void setLongClickMenuTheme(ThemeModel.b bVar) {
        o.e(bVar, "longClickMenuTheme");
        setLongClickMenuTheme$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(bVar);
    }

    public final void setLongClickMenuTheme$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(ThemeModel.b bVar) {
        o.e(bVar, "<set-?>");
        this.f10377e = bVar;
    }

    public final void setOnLongTouchListener(y yVar) {
        this.f10378f = yVar;
    }

    public final void setOnLongTouchListener$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(y yVar) {
        this.f10378f = yVar;
    }

    /* access modifiers changed from: protected */
    public final void setSpecialOverlayTheme(ThemeModel.SpecialOverlaysTheme specialOverlaysTheme) {
        o.e(specialOverlaysTheme, "<set-?>");
        this.f10379g = specialOverlaysTheme;
    }

    public final void v(View view, int i4) {
        o.e(view, "view");
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        alphaAnimation.setDuration(100);
        alphaAnimation.start();
        view.setAnimation(alphaAnimation);
    }

    /* access modifiers changed from: protected */
    public final void w() {
        if (this.f10388p) {
            getClIcons().setVisibility(8);
        } else {
            getClIcons().setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean x() {
        return this.f10387o;
    }

    /* access modifiers changed from: protected */
    public final boolean y() {
        return this.f10388p;
    }

    public abstract void z(PointF pointF, a aVar);
}
