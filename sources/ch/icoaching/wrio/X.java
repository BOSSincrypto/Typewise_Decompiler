package ch.icoaching.wrio;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import c.C0489b;
import c2.C0496b;
import ch.icoaching.typewise.AILibrarySingletonProvider;
import ch.icoaching.wrio.autocorrect.DefaultAutocorrectionController;
import ch.icoaching.wrio.data.source.local.RecentSymbolsStore;
import ch.icoaching.wrio.input.DefaultInputConnectionController;
import ch.icoaching.wrio.input.c;
import ch.icoaching.wrio.input.focus.DefaultInputConnectionFocusController;
import ch.icoaching.wrio.input.focus.d;
import ch.icoaching.wrio.input.g;
import ch.icoaching.wrio.input.i;
import ch.icoaching.wrio.keyboard.B;
import ch.icoaching.wrio.keyboard.DefaultCustomCharactersProvider;
import ch.icoaching.wrio.keyboard.DefaultKeyboardController;
import ch.icoaching.wrio.keyboard.DefaultSmartBarController;
import ch.icoaching.wrio.keyboard.I;
import ch.icoaching.wrio.keyboard.N;
import ch.icoaching.wrio.keyboard.RecentEmojiStore;
import ch.icoaching.wrio.keyboard.RecentSymbolsAndEmojisUseCase;
import ch.icoaching.wrio.keyboard.u;
import ch.icoaching.wrio.keyboard.v;
import ch.icoaching.wrio.language.e;
import ch.icoaching.wrio.personalization.dictionary.DefaultSpecialInputTextHandler;
import ch.icoaching.wrio.personalization.dynamic.DefaultDynamicLayoutController;
import ch.icoaching.wrio.prediction.DefaultPredictionsController;
import ch.icoaching.wrio.theming.DefaultThemeController;
import ch.icoaching.wrio.tutorialmode.TutorialModeManager;
import h.C0658a;
import i2.C0680a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.C;
import kotlinx.coroutines.C0761z;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.D;
import kotlinx.coroutines.E;
import kotlinx.coroutines.g0;
import l2.q;
import t3.f;

public final class X {

    /* renamed from: a  reason: collision with root package name */
    public static final X f9083a = new X();

    /* renamed from: b  reason: collision with root package name */
    private static g0 f9084b;

    /* renamed from: c  reason: collision with root package name */
    private static D f9085c;

    /* renamed from: d  reason: collision with root package name */
    private static d f9086d;

    /* renamed from: e  reason: collision with root package name */
    private static c f9087e;

    /* renamed from: f  reason: collision with root package name */
    private static B f9088f;

    /* renamed from: g  reason: collision with root package name */
    private static ch.icoaching.wrio.autocorrect.c f9089g;

    /* renamed from: h  reason: collision with root package name */
    private static ch.icoaching.wrio.prediction.d f9090h;

    /* renamed from: i  reason: collision with root package name */
    private static ch.icoaching.wrio.personalization.dynamic.a f9091i;

    /* renamed from: j  reason: collision with root package name */
    private static ch.icoaching.wrio.theming.d f9092j;

    /* renamed from: k  reason: collision with root package name */
    private static N f9093k;

    /* renamed from: l  reason: collision with root package name */
    private static ch.icoaching.wrio.personalization.dictionary.c f9094l;

    /* renamed from: m  reason: collision with root package name */
    private static ch.icoaching.wrio.theming.a f9095m;

    /* renamed from: n  reason: collision with root package name */
    private static f f9096n;

    /* renamed from: o  reason: collision with root package name */
    private static t3.a f9097o;

    /* renamed from: p  reason: collision with root package name */
    private static TutorialModeManager f9098p;

    /* renamed from: q  reason: collision with root package name */
    private static ch.icoaching.wrio.tutorialmode.a f9099q;

    /* renamed from: r  reason: collision with root package name */
    private static C0658a f9100r;

    /* renamed from: s  reason: collision with root package name */
    private static v f9101s;

    /* renamed from: t  reason: collision with root package name */
    private static u f9102t;

    /* renamed from: u  reason: collision with root package name */
    private static RecentEmojiStore f9103u;

    /* renamed from: v  reason: collision with root package name */
    private static RecentSymbolsStore f9104v;

    /* renamed from: w  reason: collision with root package name */
    private static RecentSymbolsAndEmojisUseCase f9105w;

    /* renamed from: x  reason: collision with root package name */
    private static O2.a f9106x;

    /* renamed from: y  reason: collision with root package name */
    private static AILibrarySingletonProvider f9107y;

    /* renamed from: z  reason: collision with root package name */
    private static i f9108z;

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Throwable f9109a;

        a(Throwable th) {
            this.f9109a = th;
        }

        public final void run() {
            throw this.f9109a;
        }
    }

    public static final class b extends kotlin.coroutines.a implements C0761z {
        public b(C0761z.a aVar) {
            super(aVar);
        }

        public void e0(CoroutineContext coroutineContext, Throwable th) {
            new Handler(Looper.getMainLooper()).post(new a(th));
        }
    }

    private X() {
    }

    public final void a() {
        f9084b = null;
        f9085c = null;
        f9086d = null;
        f9096n = null;
        f9095m = null;
        f9094l = null;
        f9101s = null;
        f9102t = null;
        f9087e = null;
        f9088f = null;
        f9089g = null;
        f9090h = null;
        f9091i = null;
        f9092j = null;
        f9093k = null;
        f9108z = null;
        f9106x = null;
        f9100r = null;
        f9103u = null;
        f9104v = null;
        f9105w = null;
        f9107y = null;
    }

    public final AILibrarySingletonProvider b() {
        if (f9107y == null) {
            synchronized (this) {
                try {
                    if (f9107y == null) {
                        Context a4 = M2.a.f941a.a();
                        D r4 = f9083a.r();
                        M2.b bVar = M2.b.f944a;
                        f9107y = new AILibrarySingletonProvider(a4, r4, bVar.c(), bVar.b());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        AILibrarySingletonProvider aILibrarySingletonProvider = f9107y;
        o.b(aILibrarySingletonProvider);
        return aILibrarySingletonProvider;
    }

    public final t3.a c() {
        if (f9097o == null) {
            synchronized (this) {
                try {
                    if (f9097o == null) {
                        f9097o = new t3.c(ch.icoaching.wrio.subscription.b.f10644a.a(), ch.icoaching.wrio.data.f.f9502a.j(), M2.a.f941a.a());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        t3.a aVar = f9097o;
        o.b(aVar);
        return aVar;
    }

    public final ch.icoaching.wrio.autocorrect.c d() {
        if (f9089g == null) {
            synchronized (this) {
                try {
                    if (f9089g == null) {
                        M2.b bVar = M2.b.f944a;
                        CoroutineDispatcher b4 = bVar.b();
                        CoroutineDispatcher c4 = bVar.c();
                        X x3 = f9083a;
                        D r4 = x3.r();
                        c h4 = x3.h();
                        ch.icoaching.wrio.language.d a4 = e.f10568a.a();
                        ch.icoaching.wrio.subscription.a a5 = ch.icoaching.wrio.subscription.b.f10644a.a();
                        i j4 = x3.j();
                        ch.icoaching.wrio.data.f fVar = ch.icoaching.wrio.data.f.f9502a;
                        f9089g = new DefaultAutocorrectionController(b4, c4, r4, h4, a4, a5, j4, fVar.k(), fVar.j(), fVar.d(), fVar.f(), fVar.e(), x3.b(), C0496b.f7632a.a());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ch.icoaching.wrio.autocorrect.c cVar = f9089g;
        o.b(cVar);
        return cVar;
    }

    public final u e() {
        if (f9102t == null) {
            synchronized (this) {
                try {
                    if (f9102t == null) {
                        X x3 = f9083a;
                        D r4 = x3.r();
                        ch.icoaching.wrio.data.f fVar = ch.icoaching.wrio.data.f.f9502a;
                        f9102t = new DefaultCustomCharactersProvider(r4, fVar.f(), ch.icoaching.wrio.subscription.b.f10644a.a(), x3.x(), fVar.k());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        u uVar = f9102t;
        o.b(uVar);
        return uVar;
    }

    public final v f() {
        if (f9101s == null) {
            synchronized (this) {
                try {
                    if (f9101s == null) {
                        ch.icoaching.wrio.data.f fVar = ch.icoaching.wrio.data.f.f9502a;
                        f9101s = new I(fVar.g(), fVar.k());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        v vVar = f9101s;
        o.b(vVar);
        return vVar;
    }

    public final ch.icoaching.wrio.personalization.dynamic.a g() {
        if (f9091i == null) {
            synchronized (this) {
                try {
                    if (f9091i == null) {
                        X x3 = f9083a;
                        B k4 = x3.k();
                        c h4 = x3.h();
                        ch.icoaching.wrio.data.f fVar = ch.icoaching.wrio.data.f.f9502a;
                        C0489b e4 = fVar.e();
                        ch.icoaching.wrio.data.b j4 = fVar.j();
                        D r4 = x3.r();
                        M2.b bVar = M2.b.f944a;
                        f9091i = new DefaultDynamicLayoutController(k4, h4, e4, j4, r4, bVar.b(), bVar.c());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ch.icoaching.wrio.personalization.dynamic.a aVar = f9091i;
        o.b(aVar);
        return aVar;
    }

    public final c h() {
        if (f9087e == null) {
            synchronized (this) {
                try {
                    if (f9087e == null) {
                        Context a4 = M2.a.f941a.a();
                        M2.b bVar = M2.b.f944a;
                        CoroutineDispatcher b4 = bVar.b();
                        CoroutineDispatcher c4 = bVar.c();
                        X x3 = f9083a;
                        D r4 = x3.r();
                        ch.icoaching.wrio.personalization.dictionary.c u3 = x3.u();
                        i j4 = x3.j();
                        ch.icoaching.wrio.data.f fVar = ch.icoaching.wrio.data.f.f9502a;
                        f9087e = new DefaultInputConnectionController(a4, b4, c4, r4, u3, j4, fVar.k(), fVar.h(), fVar.e(), x3.b());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c cVar = f9087e;
        o.b(cVar);
        return cVar;
    }

    public final d i() {
        if (f9086d == null) {
            synchronized (this) {
                try {
                    if (f9086d == null) {
                        f9086d = new DefaultInputConnectionFocusController(f9083a.r());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d dVar = f9086d;
        o.b(dVar);
        return dVar;
    }

    public final i j() {
        if (f9108z == null) {
            synchronized (this) {
                try {
                    if (f9108z == null) {
                        f9108z = new g();
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        i iVar = f9108z;
        o.b(iVar);
        return iVar;
    }

    public final B k() {
        if (f9088f == null) {
            synchronized (this) {
                try {
                    if (f9088f == null) {
                        Context a4 = M2.a.f941a.a();
                        M2.b bVar = M2.b.f944a;
                        CoroutineDispatcher c4 = bVar.c();
                        CoroutineDispatcher b4 = bVar.b();
                        X x3 = f9083a;
                        D r4 = x3.r();
                        RecentSymbolsAndEmojisUseCase o4 = x3.o();
                        ch.icoaching.wrio.data.f fVar = ch.icoaching.wrio.data.f.f9502a;
                        f9088f = new DefaultKeyboardController(a4, c4, b4, r4, o4, fVar.j(), fVar.k(), fVar.f(), fVar.i(), x3.t(), x3.e(), x3.x());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        B b5 = f9088f;
        o.b(b5);
        return b5;
    }

    public final ch.icoaching.wrio.theming.d l() {
        if (f9092j == null) {
            synchronized (this) {
                try {
                    if (f9092j == null) {
                        f9092j = new ch.icoaching.wrio.theming.b();
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ch.icoaching.wrio.theming.d dVar = f9092j;
        o.b(dVar);
        return dVar;
    }

    public final ch.icoaching.wrio.prediction.d m() {
        if (f9090h == null) {
            synchronized (this) {
                try {
                    if (f9090h == null) {
                        ch.icoaching.wrio.data.f fVar = ch.icoaching.wrio.data.f.f9502a;
                        ch.icoaching.wrio.data.c k4 = fVar.k();
                        C0680a f4 = fVar.f();
                        X x3 = f9083a;
                        AILibrarySingletonProvider b4 = x3.b();
                        ch.icoaching.wrio.tutorialmode.a w3 = x3.w();
                        M2.b bVar = M2.b.f944a;
                        f9090h = new DefaultPredictionsController(k4, f4, b4, w3, bVar.c(), bVar.b(), x3.r());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ch.icoaching.wrio.prediction.d dVar = f9090h;
        o.b(dVar);
        return dVar;
    }

    public final RecentEmojiStore n() {
        if (f9103u == null) {
            synchronized (this) {
                try {
                    if (f9103u == null) {
                        f9103u = new RecentEmojiStore(ch.icoaching.wrio.data.f.f9502a.e(), M2.b.f944a.b());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        RecentEmojiStore recentEmojiStore = f9103u;
        o.b(recentEmojiStore);
        return recentEmojiStore;
    }

    public final RecentSymbolsAndEmojisUseCase o() {
        if (f9105w == null) {
            synchronized (this) {
                try {
                    if (f9105w == null) {
                        X x3 = f9083a;
                        f9105w = new RecentSymbolsAndEmojisUseCase(x3.p(), x3.n(), x3.r());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        RecentSymbolsAndEmojisUseCase recentSymbolsAndEmojisUseCase = f9105w;
        o.b(recentSymbolsAndEmojisUseCase);
        return recentSymbolsAndEmojisUseCase;
    }

    public final RecentSymbolsStore p() {
        if (f9104v == null) {
            synchronized (this) {
                try {
                    if (f9104v == null) {
                        f9104v = new RecentSymbolsStore(ch.icoaching.wrio.data.f.f9502a.e(), M2.b.f944a.b());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        RecentSymbolsStore recentSymbolsStore = f9104v;
        o.b(recentSymbolsStore);
        return recentSymbolsStore;
    }

    public final g0 q() {
        if (f9084b == null) {
            synchronized (this) {
                try {
                    if (f9084b == null) {
                        f9084b = k0.b((g0) null, 1, (Object) null);
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        g0 g0Var = f9084b;
        o.b(g0Var);
        return g0Var;
    }

    public final D r() {
        if (f9085c == null) {
            synchronized (this) {
                try {
                    if (f9085c == null) {
                        CoroutineDispatcher c4 = M2.b.f944a.c();
                        f9085c = E.a(c4.plus(f9083a.q()).plus(new C("TypewiseInputMethodServiceCoroutineScope")).plus(new b(C0761z.f14322s)));
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        D d4 = f9085c;
        o.b(d4);
        return d4;
    }

    public final C0658a s() {
        if (f9100r == null) {
            synchronized (this) {
                try {
                    if (f9100r == null) {
                        f9100r = new C0658a(f9083a.x(), ch.icoaching.wrio.data.f.f9502a.j());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C0658a aVar = f9100r;
        o.b(aVar);
        return aVar;
    }

    public final N t() {
        if (f9093k == null) {
            synchronized (this) {
                try {
                    if (f9093k == null) {
                        Context a4 = M2.a.f941a.a();
                        M2.b bVar = M2.b.f944a;
                        f9093k = new DefaultSmartBarController(a4, bVar.c(), bVar.b(), f9083a.r());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        N n4 = f9093k;
        o.b(n4);
        return n4;
    }

    public final ch.icoaching.wrio.personalization.dictionary.c u() {
        if (f9094l == null) {
            synchronized (this) {
                try {
                    if (f9094l == null) {
                        f9094l = new DefaultSpecialInputTextHandler(M2.b.f944a.b(), f9083a.r(), ch.icoaching.wrio.data.f.f9502a.e());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ch.icoaching.wrio.personalization.dictionary.c cVar = f9094l;
        o.b(cVar);
        return cVar;
    }

    public final ch.icoaching.wrio.theming.a v() {
        if (f9095m == null) {
            synchronized (this) {
                try {
                    if (f9095m == null) {
                        CoroutineDispatcher b4 = M2.b.f944a.b();
                        D r4 = f9083a.r();
                        ch.icoaching.wrio.data.f fVar = ch.icoaching.wrio.data.f.f9502a;
                        f9095m = new DefaultThemeController(b4, r4, fVar.j(), ch.icoaching.wrio.subscription.b.f10644a.a(), fVar.i());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ch.icoaching.wrio.theming.a aVar = f9095m;
        o.b(aVar);
        return aVar;
    }

    public final ch.icoaching.wrio.tutorialmode.a w() {
        if (f9099q == null) {
            ch.icoaching.wrio.data.f fVar = ch.icoaching.wrio.data.f.f9502a;
            f9099q = new ch.icoaching.wrio.tutorialmode.a(fVar.f(), fVar.k());
        }
        ch.icoaching.wrio.tutorialmode.a aVar = f9099q;
        o.b(aVar);
        return aVar;
    }

    public final TutorialModeManager x() {
        if (f9098p == null) {
            synchronized (this) {
                try {
                    if (f9098p == null) {
                        ch.icoaching.wrio.data.f fVar = ch.icoaching.wrio.data.f.f9502a;
                        f9098p = new TutorialModeManager(fVar.g(), fVar.k(), fVar.j(), fVar.f(), f9083a.r());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        TutorialModeManager tutorialModeManager = f9098p;
        o.b(tutorialModeManager);
        return tutorialModeManager;
    }

    public final f y() {
        if (f9096n == null) {
            synchronized (this) {
                try {
                    if (f9096n == null) {
                        f9096n = new t3.e(ch.icoaching.wrio.subscription.b.f10644a.a(), ch.icoaching.wrio.data.f.f9502a.j(), M2.a.f941a.a());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        f fVar = f9096n;
        o.b(fVar);
        return fVar;
    }

    public final O2.a z() {
        if (f9106x == null) {
            synchronized (this) {
                try {
                    if (f9106x == null) {
                        f9106x = new O2.a(M2.a.f941a.a());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        O2.a aVar = f9106x;
        o.b(aVar);
        return aVar;
    }
}
