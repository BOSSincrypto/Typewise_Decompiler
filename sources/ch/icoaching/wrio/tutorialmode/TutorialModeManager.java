package ch.icoaching.wrio.tutorialmode;

import ch.icoaching.wrio.data.b;
import ch.icoaching.wrio.data.c;
import ch.icoaching.wrio.keyboard.DiacriticsStore;
import ch.icoaching.wrio.keyboard.KeyboardLayoutType;
import ch.icoaching.wrio.logging.Log;
import i2.C0680a;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.D;
import kotlinx.coroutines.flow.e;
import l2.q;
import u2.p;

public final class TutorialModeManager {

    /* renamed from: a  reason: collision with root package name */
    private final DiacriticsStore f10673a;

    /* renamed from: b  reason: collision with root package name */
    private final c f10674b;

    /* renamed from: c  reason: collision with root package name */
    private final b f10675c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C0680a f10676d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f10677e;

    /* renamed from: f  reason: collision with root package name */
    private KeyboardLayoutType f10678f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f10679g;

    /* renamed from: h  reason: collision with root package name */
    private String[] f10680h;

    @d(c = "ch.icoaching.wrio.tutorialmode.TutorialModeManager$1", f = "TutorialModeManager.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ll2/q;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.tutorialmode.TutorialModeManager$1  reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TutorialModeManager this$0;

        {
            this.this$0 = r1;
        }

        public final kotlin.coroutines.c<q> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(this.this$0, cVar);
            r02.L$0 = obj;
            return r02;
        }

        public final Object invokeSuspend(Object obj) {
            a.f();
            if (this.label == 0) {
                f.b(obj);
                if (o.a((String) this.L$0, "tutorialMode")) {
                    TutorialModeManager tutorialModeManager = this.this$0;
                    tutorialModeManager.d(tutorialModeManager.f10676d.m0());
                }
                return q.f14567a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(String str, kotlin.coroutines.c<? super q> cVar) {
            return ((AnonymousClass1) create(str, cVar)).invokeSuspend(q.f14567a);
        }
    }

    public TutorialModeManager(DiacriticsStore diacriticsStore, c cVar, b bVar, C0680a aVar, D d4) {
        o.e(diacriticsStore, "diacriticsStore");
        o.e(cVar, "languageSettings");
        o.e(bVar, "keyboardSettings");
        o.e(aVar, "defaultSharedPreferences");
        o.e(d4, "serviceScope");
        this.f10673a = diacriticsStore;
        this.f10674b = cVar;
        this.f10675c = bVar;
        this.f10676d = aVar;
        e.j(e.k(aVar.J0(), new AnonymousClass1(this, (kotlin.coroutines.c<? super AnonymousClass1>) null)), d4);
    }

    private final void b() {
        this.f10680h = null;
        this.f10679g = null;
        this.f10678f = null;
    }

    /* access modifiers changed from: private */
    public final void d(boolean z3) {
        Log log = Log.f10572a;
        Log.d(log, "TutorialModeManager", "onTutorialModeChange() :: " + z3, (Throwable) null, 4, (Object) null);
        this.f10677e = z3;
        if (z3) {
            i();
        } else {
            h();
        }
    }

    private final void e() {
        this.f10673a.k();
    }

    private final void f() {
        this.f10673a.j();
    }

    private final KeyboardLayoutType g() {
        KeyboardLayoutType C3 = this.f10675c.C();
        KeyboardLayoutType keyboardLayoutType = KeyboardLayoutType.HEXAGON_LEGACY;
        if (C3 == keyboardLayoutType) {
            return keyboardLayoutType;
        }
        return KeyboardLayoutType.HEXAGON;
    }

    private final void h() {
        try {
            m();
        } catch (Exception e4) {
            Log.f10572a.e("TutorialModeManager", "handleEnded", e4);
        }
    }

    private final void i() {
        o();
        l();
    }

    private final void k() {
        Log.d(Log.f10572a, "TutorialModeManager", "overrideKeyboardMode()", (Throwable) null, 4, (Object) null);
        KeyboardLayoutType g4 = g();
        if (this.f10678f != g4) {
            this.f10675c.O(g4);
        }
    }

    private final void l() {
        Log.d(Log.f10572a, "TutorialModeManager", "overrideUserPreferences", (Throwable) null, 4, (Object) null);
        this.f10675c.t("light", "light");
        k();
        f();
    }

    private final void m() {
        try {
            e();
            String[] strArr = this.f10680h;
            if (strArr != null) {
                this.f10675c.t(strArr[0], strArr[1]);
            }
            n();
        } catch (Exception e4) {
            Log log = Log.f10572a;
            String message = e4.getMessage();
            if (message == null) {
                message = "Error while restoring user preferences";
            }
            Log.f(log, "TutorialModeManager", message, (Throwable) null, 4, (Object) null);
        } catch (Throwable th) {
            b();
            throw th;
        }
        b();
    }

    private final void n() {
        if (this.f10678f != g()) {
            b bVar = this.f10675c;
            KeyboardLayoutType keyboardLayoutType = this.f10678f;
            if (keyboardLayoutType == null) {
                keyboardLayoutType = KeyboardLayoutType.HEXAGON_LEGACY;
            }
            bVar.O(keyboardLayoutType);
        }
    }

    private final void o() {
        this.f10680h = this.f10675c.T();
        this.f10679g = Boolean.valueOf(e3.c.f((CharSequence) this.f10674b.e().get(0), "es"));
        this.f10678f = this.f10675c.C();
    }

    public final boolean j() {
        return this.f10677e;
    }
}
