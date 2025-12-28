package ch.icoaching.wrio.keyboard.view.smartbar;

import android.graphics.PointF;
import android.view.MotionEvent;
import ch.icoaching.wrio.C0553q;
import ch.icoaching.wrio.logging.Log;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D;
import kotlinx.coroutines.L;
import kotlinx.coroutines.g0;
import l2.q;
import u2.C0906a;
import u2.p;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final D f10479a;

    /* renamed from: b  reason: collision with root package name */
    private final C0906a f10480b;

    /* renamed from: c  reason: collision with root package name */
    private final C0906a f10481c;

    /* renamed from: d  reason: collision with root package name */
    private final C0906a f10482d;

    /* renamed from: e  reason: collision with root package name */
    private final C0906a f10483e;

    /* renamed from: f  reason: collision with root package name */
    private final C0906a f10484f;

    /* renamed from: g  reason: collision with root package name */
    private final C0906a f10485g;

    /* renamed from: h  reason: collision with root package name */
    private final int f10486h;

    /* renamed from: i  reason: collision with root package name */
    private final int f10487i;

    /* renamed from: j  reason: collision with root package name */
    private final int f10488j;

    /* renamed from: k  reason: collision with root package name */
    private PointF f10489k;

    /* renamed from: l  reason: collision with root package name */
    private MotionEvent f10490l;

    /* renamed from: m  reason: collision with root package name */
    private g0 f10491m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f10492n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f10493o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f10494p;

    static final class a extends SuspendLambda implements p {

        /* renamed from: a  reason: collision with root package name */
        int f10495a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f10496b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, kotlin.coroutines.c cVar2) {
            super(2, cVar2);
            this.f10496b = cVar;
        }

        /* renamed from: a */
        public final Object invoke(D d4, kotlin.coroutines.c cVar) {
            return ((a) create(d4, cVar)).invokeSuspend(q.f14567a);
        }

        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new a(this.f10496b, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object f4 = kotlin.coroutines.intrinsics.a.f();
            int i4 = this.f10495a;
            if (i4 == 0) {
                f.b(obj);
                this.f10495a = 1;
                if (L.a(500, this) == f4) {
                    return f4;
                }
            } else if (i4 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean unused = this.f10496b.g();
            return q.f14567a;
        }
    }

    public c(D d4, C0906a aVar, C0906a aVar2, C0906a aVar3, C0906a aVar4, C0906a aVar5, C0906a aVar6) {
        o.e(d4, "viewScope");
        this.f10479a = d4;
        this.f10480b = aVar;
        this.f10481c = aVar2;
        this.f10482d = aVar3;
        this.f10483e = aVar4;
        this.f10484f = aVar5;
        this.f10485g = aVar6;
        this.f10486h = C0553q.a(8);
        this.f10487i = C0553q.a(8);
        this.f10488j = C0553q.a(20);
    }

    private final void a() {
        this.f10489k = null;
        this.f10490l = null;
        this.f10494p = false;
        this.f10492n = false;
        this.f10493o = false;
    }

    private final boolean b(float f4) {
        if (((int) Math.abs(f4)) <= this.f10488j) {
            return false;
        }
        Log log = Log.f10572a;
        Log.d(log, "KeyboardUIGestureDetector", "Vertical scroll", (Throwable) null, 4, (Object) null);
        if (f4 > 0.0f) {
            Log.d(log, "KeyboardUIGestureDetector", "Vertical scroll UP", (Throwable) null, 4, (Object) null);
            C0906a aVar = this.f10483e;
            if (aVar != null) {
                aVar.invoke();
            }
        } else {
            Log.d(log, "KeyboardUIGestureDetector", "Vertical scroll DOWN", (Throwable) null, 4, (Object) null);
            C0906a aVar2 = this.f10484f;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        }
        return true;
    }

    private final boolean e() {
        Log.d(Log.f10572a, "KeyboardUIGestureDetector", "Cancelling gesture", (Throwable) null, 4, (Object) null);
        g0 g0Var = this.f10491m;
        if (g0Var != null) {
            g0.a.a(g0Var, (CancellationException) null, 1, (Object) null);
        }
        this.f10491m = null;
        C0906a aVar = this.f10485g;
        if (aVar != null) {
            aVar.invoke();
        }
        a();
        return true;
    }

    private final boolean f(MotionEvent motionEvent) {
        Log log = Log.f10572a;
        Log.d(log, "KeyboardUIGestureDetector", "processOnDown() :: (" + motionEvent.getX() + ", " + motionEvent.getY() + ')', (Throwable) null, 4, (Object) null);
        this.f10489k = new PointF(motionEvent.getX(), motionEvent.getY());
        MotionEvent motionEvent2 = this.f10490l;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.f10490l = MotionEvent.obtain(motionEvent);
        this.f10491m = C0739h.d(this.f10479a, (CoroutineContext) null, (CoroutineStart) null, new a(this, (kotlin.coroutines.c) null), 3, (Object) null);
        return true;
    }

    /* access modifiers changed from: private */
    public final boolean g() {
        if (this.f10494p) {
            Log.d(Log.f10572a, "KeyboardUIGestureDetector", "Already in long click gesture", (Throwable) null, 4, (Object) null);
            return false;
        }
        Log.d(Log.f10572a, "KeyboardUIGestureDetector", "Entering long click gesture", (Throwable) null, 4, (Object) null);
        this.f10494p = true;
        C0906a aVar = this.f10481c;
        if (aVar == null) {
            return true;
        }
        aVar.invoke();
        return true;
    }

    private final boolean h(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = this.f10490l;
        boolean z3 = false;
        if (motionEvent2 == null) {
            return false;
        }
        float y3 = motionEvent2.getY() - motionEvent.getY();
        float x3 = motionEvent2.getX() - motionEvent.getX();
        long eventTime = motionEvent.getEventTime() - motionEvent.getDownTime();
        if (this.f10492n) {
            z3 = b(y3);
        } else if (Math.abs(y3) > ((float) this.f10487i)) {
            g0 g0Var = this.f10491m;
            if (g0Var != null) {
                g0.a.a(g0Var, (CancellationException) null, 1, (Object) null);
            }
            this.f10491m = null;
            this.f10492n = true;
            z3 = b(y3);
        } else if (Math.abs(x3) > ((float) this.f10486h)) {
            g0 g0Var2 = this.f10491m;
            if (g0Var2 != null) {
                g0.a.a(g0Var2, (CancellationException) null, 1, (Object) null);
            }
            this.f10491m = null;
            this.f10493o = true;
            return false;
        } else if (eventTime > 500) {
            z3 = g();
        }
        if (z3) {
            MotionEvent motionEvent3 = this.f10490l;
            if (motionEvent3 != null) {
                motionEvent3.recycle();
            }
            this.f10490l = null;
        }
        return true;
    }

    private final boolean i(MotionEvent motionEvent) {
        Log log = Log.f10572a;
        Log.d(log, "KeyboardUIGestureDetector", "processOnUp() :: (" + motionEvent.getX() + ' ' + motionEvent.getY() + ')', (Throwable) null, 4, (Object) null);
        g0 g0Var = this.f10491m;
        if (g0Var != null) {
            g0.a.a(g0Var, (CancellationException) null, 1, (Object) null);
        }
        this.f10491m = null;
        if (!this.f10492n && !this.f10493o && !this.f10494p) {
            Log.d(log, "KeyboardUIGestureDetector", "Performing click", (Throwable) null, 4, (Object) null);
            C0906a aVar = this.f10480b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
        if (this.f10494p) {
            Log.d(log, "KeyboardUIGestureDetector", "Performing long click end", (Throwable) null, 4, (Object) null);
            C0906a aVar2 = this.f10482d;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        }
        a();
        return true;
    }

    public final boolean c(MotionEvent motionEvent) {
        o.e(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action == 0) {
            return f(motionEvent);
        }
        if (action == 1) {
            return i(motionEvent);
        }
        if (action == 2) {
            return h(motionEvent);
        }
        if (action == 3) {
            return e();
        }
        if (action != 4) {
            return false;
        }
        return h(motionEvent);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ c(kotlinx.coroutines.D r8, u2.C0906a r9, u2.C0906a r10, u2.C0906a r11, u2.C0906a r12, u2.C0906a r13, u2.C0906a r14, int r15, kotlin.jvm.internal.i r16) {
        /*
            r7 = this;
            r0 = r15 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r9
        L_0x0008:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x000e
            r2 = r1
            goto L_0x000f
        L_0x000e:
            r2 = r10
        L_0x000f:
            r3 = r15 & 8
            if (r3 == 0) goto L_0x0015
            r3 = r1
            goto L_0x0016
        L_0x0015:
            r3 = r11
        L_0x0016:
            r4 = r15 & 16
            if (r4 == 0) goto L_0x001c
            r4 = r1
            goto L_0x001d
        L_0x001c:
            r4 = r12
        L_0x001d:
            r5 = r15 & 32
            if (r5 == 0) goto L_0x0023
            r5 = r1
            goto L_0x0024
        L_0x0023:
            r5 = r13
        L_0x0024:
            r6 = r15 & 64
            if (r6 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r1 = r14
        L_0x002a:
            r9 = r7
            r10 = r8
            r11 = r0
            r12 = r2
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.keyboard.view.smartbar.c.<init>(kotlinx.coroutines.D, u2.a, u2.a, u2.a, u2.a, u2.a, u2.a, int, kotlin.jvm.internal.i):void");
    }
}
