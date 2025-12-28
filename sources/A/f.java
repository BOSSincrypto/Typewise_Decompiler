package a;

import android.content.Context;
import android.view.View;
import b.c;
import b.i;
import b.j;
import b.l;
import ch.icoaching.wrio.BaseInputMethodService;
import ch.icoaching.wrio.keyboard.B;
import ch.icoaching.wrio.keyboard.N;
import ch.icoaching.wrio.logging.Log;
import ch.icoaching.wrio.onboarding.state.OnBoardingState;
import i2.C0680a;
import kotlin.collections.C0713h;
import kotlin.jvm.internal.o;
import l2.q;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final B f2202a;

    /* renamed from: b  reason: collision with root package name */
    private final C0680a f2203b;

    /* renamed from: c  reason: collision with root package name */
    private a f2204c;

    /* renamed from: d  reason: collision with root package name */
    private BaseInputMethodService f2205d;

    /* renamed from: e  reason: collision with root package name */
    private OnBoardingState f2206e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f2207f = {1, 10, 20, 50, 100};

    /* renamed from: g  reason: collision with root package name */
    private int f2208g;

    /* renamed from: h  reason: collision with root package name */
    private int f2209h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2210i;

    /* renamed from: j  reason: collision with root package name */
    private View f2211j;

    /* renamed from: k  reason: collision with root package name */
    private View f2212k;

    public interface a {
        void a();
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2213a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ch.icoaching.wrio.onboarding.state.OnBoardingState[] r0 = ch.icoaching.wrio.onboarding.state.OnBoardingState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ch.icoaching.wrio.onboarding.state.OnBoardingState r1 = ch.icoaching.wrio.onboarding.state.OnBoardingState.WELCOME     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ch.icoaching.wrio.onboarding.state.OnBoardingState r1 = ch.icoaching.wrio.onboarding.state.OnBoardingState.START_TUTORIAL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ch.icoaching.wrio.onboarding.state.OnBoardingState r1 = ch.icoaching.wrio.onboarding.state.OnBoardingState.MENU_EXPLANATION     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f2213a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a.f.b.<clinit>():void");
        }
    }

    public f(B b4, C0680a aVar) {
        o.e(b4, "keyboardController");
        o.e(aVar, "sharedPreferences");
        this.f2202a = b4;
        this.f2203b = aVar;
        String d4 = aVar.d();
        if (d4.length() == 0) {
            OnBoardingState onBoardingState = OnBoardingState.WELCOME;
            this.f2206e = onBoardingState;
            aVar.S(onBoardingState.toString());
        } else {
            this.f2206e = j.a(d4);
        }
        this.f2209h = aVar.O();
        this.f2208g = aVar.R();
    }

    /* access modifiers changed from: private */
    public static final q f(f fVar, Context context, l lVar) {
        fVar.v();
        fVar.p(context);
        fVar.f2202a.B(lVar);
        fVar.q();
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q g(f fVar, c cVar) {
        fVar.f2202a.B(cVar);
        fVar.f2210i = false;
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q h(f fVar, b.f fVar2) {
        fVar.f2203b.s0(true);
        fVar.f2202a.B(fVar2);
        fVar.q();
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q i(f fVar, i iVar) {
        N w02;
        fVar.f2202a.B(iVar);
        a aVar = fVar.f2204c;
        if (aVar != null) {
            aVar.a();
        }
        BaseInputMethodService baseInputMethodService = fVar.f2205d;
        if (!(baseInputMethodService == null || (w02 = baseInputMethodService.w0()) == null)) {
            w02.c(false);
        }
        fVar.q();
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q j(f fVar, i iVar, Context context) {
        fVar.f2202a.B(iVar);
        fVar.v();
        fVar.p(context);
        fVar.q();
        return q.f14567a;
    }

    private final void q() {
        BaseInputMethodService baseInputMethodService = this.f2205d;
        if (baseInputMethodService != null) {
            baseInputMethodService.a0();
        }
        BaseInputMethodService baseInputMethodService2 = this.f2205d;
        if (baseInputMethodService2 != null) {
            baseInputMethodService2.b0();
        }
    }

    private final boolean r() {
        return this.f2203b.d0();
    }

    private final boolean t() {
        return C0713h.s(this.f2207f, this.f2209h);
    }

    private final void v() {
        int i4 = b.f2213a[this.f2206e.ordinal()];
        if (i4 == 1) {
            this.f2206e = OnBoardingState.START_TUTORIAL;
        } else if (i4 == 2) {
            this.f2206e = OnBoardingState.MENU_EXPLANATION;
        }
        this.f2203b.S(this.f2206e.toString());
    }

    private final boolean w() {
        if (r() || this.f2210i || !t() || ((double) this.f2208g) > Math.floor(((double) this.f2209h) / 20.0d)) {
            return false;
        }
        return true;
    }

    public final void k() {
        View view = this.f2211j;
        if (view != null) {
            this.f2202a.B(view);
            this.f2210i = false;
        }
    }

    public final void l(a aVar) {
        this.f2204c = aVar;
    }

    public final void m(Context context) {
        o.e(context, "context");
        Log.d(Log.f10572a, "OnBoardingController", "correctionDone() :: Start", (Throwable) null, 4, (Object) null);
        int i4 = this.f2209h + 1;
        this.f2209h = i4;
        this.f2203b.I(i4);
        if (w()) {
            this.f2210i = true;
            c cVar = new c(context);
            cVar.setOnClose(new e(this, cVar));
            this.f2202a.s(cVar);
            this.f2211j = cVar;
            if (this.f2209h == 100) {
                this.f2203b.a0(true);
            }
        }
    }

    public final void n(BaseInputMethodService baseInputMethodService) {
        this.f2205d = baseInputMethodService;
    }

    public final void o() {
        if (!this.f2210i) {
            int i4 = this.f2208g + 1;
            this.f2208g = i4;
            this.f2203b.P(i4);
        }
    }

    public final void p(Context context) {
        N w02;
        o.e(context, "context");
        if (!this.f2203b.c()) {
            Log.d(Log.f10572a, "OnBoardingController", "startOrContinueOnBoarding() :: Start", (Throwable) null, 4, (Object) null);
            int i4 = b.f2213a[this.f2206e.ordinal()];
            if (i4 == 1) {
                l lVar = new l(context);
                lVar.setOnButtonClick(new d(this, context, lVar));
                this.f2202a.s(lVar);
                BaseInputMethodService baseInputMethodService = this.f2205d;
                if (!(baseInputMethodService == null || (w02 = baseInputMethodService.w0()) == null)) {
                    w02.c(true);
                }
                BaseInputMethodService baseInputMethodService2 = this.f2205d;
                if (baseInputMethodService2 != null) {
                    baseInputMethodService2.Y();
                }
                this.f2212k = lVar;
            } else if (i4 != 2) {
                if (i4 == 3) {
                    b.f fVar = new b.f(context);
                    fVar.setOnClick(new C0353a(this, fVar));
                    this.f2202a.s(fVar);
                    BaseInputMethodService baseInputMethodService3 = this.f2205d;
                    if (baseInputMethodService3 != null) {
                        baseInputMethodService3.Y();
                    }
                    this.f2212k = fVar;
                }
            } else if (!this.f2203b.C0()) {
                i iVar = new i(context);
                iVar.setOnButtonClick(new b(this, iVar));
                iVar.setOnCloseClick(new c(this, iVar, context));
                this.f2202a.s(iVar);
                BaseInputMethodService baseInputMethodService4 = this.f2205d;
                if (baseInputMethodService4 != null) {
                    baseInputMethodService4.Y();
                }
                this.f2212k = iVar;
            } else {
                v();
                p(context);
            }
        }
    }

    public final boolean s() {
        return this.f2203b.c();
    }

    public final void u() {
        this.f2210i = false;
        View view = this.f2212k;
        if (view != null) {
            this.f2202a.B(view);
            this.f2212k = null;
        }
    }
}
