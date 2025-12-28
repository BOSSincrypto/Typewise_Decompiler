package ch.icoaching.wrio;

import P2.p;
import P2.w;
import a.f;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import ch.icoaching.wrio.appnomix.controller.SearchController;
import ch.icoaching.wrio.keyboard.N;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import ch.icoaching.wrio.keyboard.notifications.TypewiseKeyboardNotificationController;
import ch.icoaching.wrio.keyboard.notifications.a;
import ch.icoaching.wrio.keyboard.view.E;
import ch.icoaching.wrio.logging.Log;
import ch.icoaching.wrio.subscription.e;
import g.C0653d;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D;
import kotlinx.coroutines.g0;
import l2.q;
import u2.C0906a;

public abstract class TypewiseInputMethodService extends BaseInputMethodService {

    /* renamed from: l0  reason: collision with root package name */
    private final p f9058l0 = w.f1191a.c();

    /* renamed from: m0  reason: collision with root package name */
    private i3.c f9059m0;
    /* access modifiers changed from: private */

    /* renamed from: n0  reason: collision with root package name */
    public E f9060n0;

    /* renamed from: o0  reason: collision with root package name */
    private ThemeModel f9061o0;

    /* renamed from: p0  reason: collision with root package name */
    private H0.b f9062p0;
    /* access modifiers changed from: private */

    /* renamed from: q0  reason: collision with root package name */
    public ch.icoaching.wrio.appnomix.controller.a f9063q0;
    /* access modifiers changed from: private */

    /* renamed from: r0  reason: collision with root package name */
    public SearchController f9064r0;

    /* renamed from: s0  reason: collision with root package name */
    private ch.icoaching.wrio.appnomix.controller.d f9065s0;

    /* renamed from: t0  reason: collision with root package name */
    private final l2.f f9066t0 = kotlin.c.b(new U());
    /* access modifiers changed from: private */

    /* renamed from: u0  reason: collision with root package name */
    public g0 f9067u0;

    /* renamed from: v0  reason: collision with root package name */
    private final SearchController.a f9068v0 = new TypewiseInputMethodService$onSearchEventListenerInternal$1(this);

    /* renamed from: w0  reason: collision with root package name */
    private final C0558w f9069w0 = new h(this);

    public static final class a implements p.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TypewiseInputMethodService f9070a;

        a(TypewiseInputMethodService typewiseInputMethodService) {
            this.f9070a = typewiseInputMethodService;
        }

        public void a() {
            this.f9070a.x1();
        }

        public void b() {
            this.f9070a.u1();
        }

        public void c() {
            this.f9070a.y1();
        }
    }

    public static final class b implements p.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TypewiseInputMethodService f9071a;

        b(TypewiseInputMethodService typewiseInputMethodService) {
            this.f9071a = typewiseInputMethodService;
        }

        public void c(String str) {
            o.e(str, "language");
            this.f9071a.q0().c(str);
        }
    }

    public static final class c implements e.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TypewiseInputMethodService f9072a;

        c(TypewiseInputMethodService typewiseInputMethodService) {
            this.f9072a = typewiseInputMethodService;
        }

        public void a() {
            this.f9072a.z1();
        }
    }

    public static final class d implements a.C0154a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TypewiseInputMethodService f9073a;

        d(TypewiseInputMethodService typewiseInputMethodService) {
            this.f9073a = typewiseInputMethodService;
        }

        public void a() {
            this.f9073a.v1();
        }
    }

    public static final class e implements a.C0154a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TypewiseInputMethodService f9074a;

        e(TypewiseInputMethodService typewiseInputMethodService) {
            this.f9074a = typewiseInputMethodService;
        }

        public void a() {
            this.f9074a.w1();
        }
    }

    public static final class f implements f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TypewiseInputMethodService f9075a;

        f(TypewiseInputMethodService typewiseInputMethodService) {
            this.f9075a = typewiseInputMethodService;
        }

        public void a() {
            this.f9075a.y1();
        }
    }

    public static final class g implements a.C0154a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TypewiseInputMethodService f9076a;

        g(TypewiseInputMethodService typewiseInputMethodService) {
            this.f9076a = typewiseInputMethodService;
        }

        public void a() {
            this.f9076a.A1();
        }
    }

    public static final class h implements C0558w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TypewiseInputMethodService f9077a;

        h(TypewiseInputMethodService typewiseInputMethodService) {
            this.f9077a = typewiseInputMethodService;
        }

        public void a(String str) {
            o.e(str, "text");
            SearchController b12 = this.f9077a.f9064r0;
            if (b12 == null) {
                o.p("searchController");
                b12 = null;
            }
            b12.q(str);
        }
    }

    /* access modifiers changed from: private */
    public static final ch.icoaching.wrio.tutorialmode.a B1() {
        return X.f9083a.w();
    }

    private final void i1() {
        g0 unused = C0739h.d(u0(), (CoroutineContext) null, (CoroutineStart) null, new TypewiseInputMethodService$clearBanner$1(this, (kotlin.coroutines.c<? super TypewiseInputMethodService$clearBanner$1>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void j1() {
        l0().c();
        n0().j();
    }

    /* access modifiers changed from: private */
    public static final q k1(TypewiseInputMethodService typewiseInputMethodService) {
        p pVar = typewiseInputMethodService.f9058l0;
        Context context = typewiseInputMethodService.getLayoutInflater().getContext();
        o.d(context, "getContext(...)");
        pVar.z(context);
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q l1(TypewiseInputMethodService typewiseInputMethodService) {
        typewiseInputMethodService.i1();
        typewiseInputMethodService.z1();
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q m1(TypewiseInputMethodService typewiseInputMethodService) {
        typewiseInputMethodService.i1();
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q n1(TypewiseInputMethodService typewiseInputMethodService, C0653d dVar) {
        o.e(dVar, "bannerView");
        typewiseInputMethodService.r1(dVar);
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q o1(TypewiseInputMethodService typewiseInputMethodService) {
        typewiseInputMethodService.i1();
        typewiseInputMethodService.h1();
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q p1(TypewiseInputMethodService typewiseInputMethodService) {
        typewiseInputMethodService.i1();
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q q1(TypewiseInputMethodService typewiseInputMethodService, J0.c cVar) {
        o.e(cVar, "bannerView");
        typewiseInputMethodService.r1(cVar);
        return q.f14567a;
    }

    private final void r1(View view) {
        g0 unused = C0739h.d(u0(), (CoroutineContext) null, (CoroutineStart) null, new TypewiseInputMethodService$setBanner$1(this, view, (kotlin.coroutines.c<? super TypewiseInputMethodService$setBanner$1>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void s1(String str) {
        if (this.f9060n0 != null && p0().d()) {
            String C3 = kotlin.text.o.C(str, "-", "_", false, 4, (Object) null);
            if (o.a(C3, "en")) {
                C3 = "en_us";
            }
            int identifier = getResources().getIdentifier(C3, "drawable", getPackageName());
            if (identifier == 0) {
                Log log = Log.f10572a;
                log.e("TypewiseInputMethodService", "setLanguage()", new RuntimeException("There is no '" + C3 + "' flag drawable resource for '" + str + "' language."));
            }
            E e4 = this.f9060n0;
            if (e4 == null) {
                o.p("smartBarLogoView");
                e4 = null;
            }
            e4.setFlag(identifier);
        }
    }

    /* access modifiers changed from: private */
    public final void t1(View view) {
        n0().p(view);
        l0().g(view);
    }

    public abstract void A1();

    public void I0() {
        super.I0();
        Context context = getLayoutInflater().getContext();
        o.d(context, "getContext(...)");
        this.f9060n0 = new E(context);
        N w02 = w0();
        E e4 = this.f9060n0;
        E e5 = null;
        if (e4 == null) {
            o.p("smartBarLogoView");
            e4 = null;
        }
        w02.p(e4);
        w0().d(new M(this));
        E e6 = this.f9060n0;
        if (e6 == null) {
            o.p("smartBarLogoView");
            e6 = null;
        }
        e6.setLanguageFlagVisible(p0().d());
        ThemeModel themeModel = this.f9061o0;
        if (themeModel == null) {
            o.p("theme");
            themeModel = null;
        }
        Drawable icon = themeModel.getIcon();
        if (icon != null) {
            E e7 = this.f9060n0;
            if (e7 == null) {
                o.p("smartBarLogoView");
            } else {
                e5 = e7;
            }
            e5.setLogo(icon);
        }
        s1(r0().b());
    }

    public void J0(ThemeModel themeModel) {
        Drawable icon;
        o.e(themeModel, "theme");
        this.f9061o0 = themeModel;
        super.J0(themeModel);
        this.f9058l0.u(themeModel.getSmartBarTheme());
        ch.icoaching.wrio.appnomix.controller.d dVar = this.f9065s0;
        if (dVar != null) {
            dVar.h(themeModel.getSmartBarTheme().getSelectedBackgroundColor(), themeModel.getSmartBarTheme().getSelectedFontColor());
        }
        if (this.f9060n0 != null && (icon = themeModel.getIcon()) != null) {
            E e4 = this.f9060n0;
            if (e4 == null) {
                o.p("smartBarLogoView");
                e4 = null;
            }
            e4.setLogo(icon);
        }
    }

    public abstract void h1();

    public void onCreate() {
        super.onCreate();
        this.f9058l0.p(new a(this));
        this.f9058l0.q(new b(this));
        ch.icoaching.wrio.subscription.e eVar = new ch.icoaching.wrio.subscription.e();
        eVar.d(this);
        eVar.e(n0());
        eVar.g(new c(this));
        O0(eVar);
        m3.a o02 = o0();
        o.c(o02, "null cannot be cast to non-null type ch.icoaching.wrio.keyboard.notifications.TypewiseKeyboardNotificationController");
        TypewiseKeyboardNotificationController typewiseKeyboardNotificationController = (TypewiseKeyboardNotificationController) o02;
        typewiseKeyboardNotificationController.h(new d(this));
        typewiseKeyboardNotificationController.k(new e(this));
        typewiseKeyboardNotificationController.g(new f(this));
        typewiseKeyboardNotificationController.j(new g(this));
        kotlinx.coroutines.flow.e.j(kotlinx.coroutines.flow.e.k(r0().i(), new TypewiseInputMethodService$onCreate$8(this, (kotlin.coroutines.c<? super TypewiseInputMethodService$onCreate$8>) null)), u0());
        kotlinx.coroutines.flow.e.j(kotlinx.coroutines.flow.e.k(p0().g(), new TypewiseInputMethodService$onCreate$9(this, (kotlin.coroutines.c<? super TypewiseInputMethodService$onCreate$9>) null)), u0());
        Context applicationContext = getApplicationContext();
        o.d(applicationContext, "getApplicationContext(...)");
        D u02 = u0();
        M2.a aVar = M2.a.f941a;
        SearchController searchController = new SearchController(applicationContext, u02, aVar.c(), this.f9068v0, m0(), s0());
        this.f9064r0 = searchController;
        searchController.v(y0());
        P(this.f9069w0);
        this.f9063q0 = ch.icoaching.wrio.appnomix.controller.e.f9238a.a();
        Context applicationContext2 = getApplicationContext();
        o.d(applicationContext2, "getApplicationContext(...)");
        this.f9065s0 = new ch.icoaching.wrio.appnomix.controller.d(applicationContext2, aVar.c());
        this.f9062p0 = aVar.c();
        this.f9059m0 = new i3.c(t0());
    }

    public void onDestroy() {
        M2.c.f948a.a();
        super.onDestroy();
    }

    public void onFinishInputView(boolean z3) {
        SearchController searchController = null;
        p.s(this.f9058l0, (C0906a) null, 1, (Object) null);
        super.onFinishInputView(z3);
        SearchController searchController2 = this.f9064r0;
        if (searchController2 == null) {
            o.p("searchController");
            searchController2 = null;
        }
        if (searchController2.p()) {
            j1();
            SearchController searchController3 = this.f9064r0;
            if (searchController3 == null) {
                o.p("searchController");
            } else {
                searchController = searchController3;
            }
            searchController.r(true);
        }
    }

    public void onStartInputView(EditorInfo editorInfo, boolean z3) {
        i3.c cVar;
        super.onStartInputView(editorInfo, z3);
        SearchController searchController = this.f9064r0;
        if (searchController == null) {
            o.p("searchController");
            searchController = null;
        }
        String m4 = searchController.m();
        SearchController searchController2 = this.f9064r0;
        if (searchController2 == null) {
            o.p("searchController");
            searchController2 = null;
        }
        EditorInfo currentInputEditorInfo = getCurrentInputEditorInfo();
        o.d(currentInputEditorInfo, "getCurrentInputEditorInfo(...)");
        boolean w3 = searchController2.w(currentInputEditorInfo);
        if (!p0().o() && !getApplicationContext().getPackageName().equals("ch.icoaching.wrio")) {
            g0 g0Var = this.f9067u0;
            if (g0Var != null) {
                g0.a.a(g0Var, (CancellationException) null, 1, (Object) null);
            }
            this.f9067u0 = C0739h.d(u0(), (CoroutineContext) null, (CoroutineStart) null, new TypewiseInputMethodService$onStartInputView$1(this, editorInfo, w3, (kotlin.coroutines.c<? super TypewiseInputMethodService$onStartInputView$1>) null), 3, (Object) null);
        }
        SearchController searchController3 = this.f9064r0;
        if (searchController3 == null) {
            o.p("searchController");
            searchController3 = null;
        }
        boolean z4 = false;
        if (searchController3.p()) {
            j1();
            SearchController searchController4 = this.f9064r0;
            if (searchController4 == null) {
                o.p("searchController");
                searchController4 = null;
            }
            SearchController.s(searchController4, false, 1, (Object) null);
        }
        SearchController searchController5 = this.f9064r0;
        if (searchController5 == null) {
            o.p("searchController");
            searchController5 = null;
        }
        searchController5.u(i0());
        i3.c cVar2 = this.f9059m0;
        if (cVar2 == null) {
            o.p("unlockAIAssistantBannerController");
            cVar = null;
        } else {
            cVar = cVar2;
        }
        LayoutInflater layoutInflater = getLayoutInflater();
        o.d(layoutInflater, "getLayoutInflater(...)");
        boolean d4 = cVar.d(layoutInflater, new TypewiseInputMethodService$onStartInputView$bannerShown$1(x0()), new N(this), new O(this), new P(this));
        if (!d4) {
            ch.icoaching.wrio.appnomix.controller.d dVar = this.f9065s0;
            if (dVar != null) {
                LayoutInflater layoutInflater2 = getLayoutInflater();
                o.d(layoutInflater2, "getLayoutInflater(...)");
                ThemeModel themeModel = this.f9061o0;
                if (themeModel == null) {
                    o.p("theme");
                    themeModel = null;
                }
                int selectedBackgroundColor = themeModel.getSmartBarTheme().getSelectedBackgroundColor();
                ThemeModel themeModel2 = this.f9061o0;
                if (themeModel2 == null) {
                    o.p("theme");
                    themeModel2 = null;
                }
                z4 = dVar.k(layoutInflater2, selectedBackgroundColor, themeModel2.getSmartBarTheme().getSelectedFontColor(), new TypewiseInputMethodService$onStartInputView$2(x0()), new Q(this), new S(this), new T(this));
            }
        } else {
            z4 = d4;
        }
        if (!z4) {
            i1();
        }
        if (!C0551o.b(this)) {
            g0 unused = C0739h.d(u0(), (CoroutineContext) null, (CoroutineStart) null, new TypewiseInputMethodService$onStartInputView$6(this, w3, m4, (kotlin.coroutines.c<? super TypewiseInputMethodService$onStartInputView$6>) null), 3, (Object) null);
        }
    }

    public abstract void u1();

    public abstract void v1();

    public abstract void w1();

    public abstract void x1();

    public abstract void y1();

    public abstract void z1();
}
