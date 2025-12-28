package ch.icoaching.wrio.data;

import H0.b;
import ch.icoaching.wrio.J;
import ch.icoaching.wrio.K;
import ch.icoaching.wrio.keyboard.KeyboardLayoutType;
import ch.icoaching.wrio.logging.Log;
import ch.icoaching.wrio.subscription.a;
import i2.C0680a;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.D;
import kotlinx.coroutines.flow.e;
import l2.q;
import u2.p;

public final class DefaultKeyboardSettings implements b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C0680a f9366a;

    /* renamed from: b  reason: collision with root package name */
    private final b f9367b;

    /* renamed from: c  reason: collision with root package name */
    private final a f9368c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f9369d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f9370e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f9371f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f9372g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f9373h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public boolean f9374i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public boolean f9375j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public int f9376k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public int f9377l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public boolean f9378m;

    /* renamed from: n  reason: collision with root package name */
    private final Map f9379n = new LinkedHashMap();

    /* renamed from: o  reason: collision with root package name */
    private final Map f9380o = new LinkedHashMap();

    @d(c = "ch.icoaching.wrio.data.DefaultKeyboardSettings$2", f = "DefaultKeyboardSettings.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ll2/q;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.data.DefaultKeyboardSettings$2  reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements p {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DefaultKeyboardSettings this$0;

        {
            this.this$0 = r1;
        }

        public final c<q> create(Object obj, c<?> cVar) {
            AnonymousClass2 r02 = new AnonymousClass2(this.this$0, cVar);
            r02.L$0 = obj;
            return r02;
        }

        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.f();
            if (this.label == 0) {
                f.b(obj);
                String str = (String) this.L$0;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -2027574035:
                            if (str.equals("shortcuts")) {
                                this.this$0.Z();
                                break;
                            }
                            break;
                        case -1865461590:
                            if (str.equals("settings_vibration_intensity")) {
                                DefaultKeyboardSettings defaultKeyboardSettings = this.this$0;
                                defaultKeyboardSettings.f9376k = defaultKeyboardSettings.f9366a.t();
                                break;
                            }
                            break;
                        case -1864584387:
                            if (str.equals("isDeleteVisible")) {
                                DefaultKeyboardSettings defaultKeyboardSettings2 = this.this$0;
                                defaultKeyboardSettings2.f9370e = defaultKeyboardSettings2.f9366a.y();
                                break;
                            }
                            break;
                        case -1697949734:
                            if (str.equals("isShiftVisible")) {
                                DefaultKeyboardSettings defaultKeyboardSettings3 = this.this$0;
                                defaultKeyboardSettings3.f9372g = defaultKeyboardSettings3.f9366a.w0();
                                break;
                            }
                            break;
                        case -1607037224:
                            if (str.equals("numberFieldLeft")) {
                                DefaultKeyboardSettings defaultKeyboardSettings4 = this.this$0;
                                defaultKeyboardSettings4.f9374i = defaultKeyboardSettings4.f9366a.r0();
                                break;
                            }
                            break;
                        case -1533990632:
                            if (str.equals("settings_dot_shortcut")) {
                                DefaultKeyboardSettings defaultKeyboardSettings5 = this.this$0;
                                defaultKeyboardSettings5.f9373h = defaultKeyboardSettings5.f9366a.U();
                                break;
                            }
                            break;
                        case -934420091:
                            if (str.equals("settings_back_to_letters")) {
                                DefaultKeyboardSettings defaultKeyboardSettings6 = this.this$0;
                                defaultKeyboardSettings6.f9371f = defaultKeyboardSettings6.f9366a.x();
                                break;
                            }
                            break;
                        case -517380308:
                            if (str.equals("tapSound")) {
                                DefaultKeyboardSettings defaultKeyboardSettings7 = this.this$0;
                                defaultKeyboardSettings7.f9378m = defaultKeyboardSettings7.f9366a.o();
                                break;
                            }
                            break;
                        case -210660794:
                            if (str.equals("settings_smartbar")) {
                                DefaultKeyboardSettings defaultKeyboardSettings8 = this.this$0;
                                defaultKeyboardSettings8.f9375j = defaultKeyboardSettings8.f9366a.y0();
                                break;
                            }
                            break;
                        case 841198141:
                            if (str.equals("settings_vibration_duration")) {
                                DefaultKeyboardSettings defaultKeyboardSettings9 = this.this$0;
                                defaultKeyboardSettings9.f9377l = defaultKeyboardSettings9.f9366a.s();
                                break;
                            }
                            break;
                        case 1129644483:
                            if (str.equals("hexagonSpecialCharacters")) {
                                DefaultKeyboardSettings defaultKeyboardSettings10 = this.this$0;
                                defaultKeyboardSettings10.f9369d = defaultKeyboardSettings10.f9366a.Y();
                                break;
                            }
                            break;
                    }
                }
                return q.f14567a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(String str, c<? super q> cVar) {
            return ((AnonymousClass2) create(str, cVar)).invokeSuspend(q.f14567a);
        }
    }

    public DefaultKeyboardSettings(D d4, C0680a aVar, b bVar, a aVar2) {
        o.e(d4, "applicationCoroutineScope");
        o.e(aVar, "defaultSharedPreferences");
        o.e(bVar, "appnomixSharedPreferences");
        o.e(aVar2, "subscriptionChecker");
        this.f9366a = aVar;
        this.f9367b = bVar;
        this.f9368c = aVar2;
        this.f9369d = aVar.Y();
        this.f9370e = aVar.y();
        this.f9371f = aVar.x();
        this.f9372g = aVar.w0();
        this.f9373h = aVar.U();
        this.f9374i = aVar.r0();
        this.f9375j = aVar.y0();
        this.f9376k = aVar.t();
        this.f9377l = aVar.s();
        this.f9378m = aVar.o();
        Z();
        e.j(e.k(new DefaultKeyboardSettings$special$$inlined$filter$1(aVar.J0()), new AnonymousClass2(this, (c<? super AnonymousClass2>) null)), d4);
    }

    /* access modifiers changed from: private */
    public final void Z() {
        C0680a.C0192a i4 = this.f9366a.i();
        this.f9379n.clear();
        this.f9379n.putAll(i4.a());
        this.f9380o.clear();
        this.f9380o.putAll(i4.b());
    }

    public kotlinx.coroutines.flow.c A() {
        return new DefaultKeyboardSettings$observeCurrentlySelectedThemeNamesChanges$$inlined$map$1(new DefaultKeyboardSettings$observeCurrentlySelectedThemeNamesChanges$$inlined$filter$1(this.f9366a.J0()), this);
    }

    public int B() {
        return this.f9366a.V();
    }

    public KeyboardLayoutType C() {
        KeyboardLayoutType I02 = this.f9366a.I0();
        if (I02 != null) {
            return I02;
        }
        if (this.f9366a.u0()) {
            return KeyboardLayoutType.RECTANGLE;
        }
        return KeyboardLayoutType.HEXAGON_LEGACY;
    }

    public kotlinx.coroutines.flow.c D() {
        return new DefaultKeyboardSettings$observeLongClickDuration$$inlined$map$1(new DefaultKeyboardSettings$observeLongClickDuration$$inlined$filter$1(this.f9366a.J0()), this);
    }

    public KeyboardLayoutType E() {
        KeyboardLayoutType a4 = this.f9366a.a();
        if (a4 != null) {
            return a4;
        }
        return KeyboardLayoutType.HEXAGON_LEGACY;
    }

    public boolean F() {
        return this.f9366a.b0();
    }

    public kotlinx.coroutines.flow.c G() {
        return new DefaultKeyboardSettings$observeIsAIAssistantEnabled$$inlined$map$1(new DefaultKeyboardSettings$observeIsAIAssistantEnabled$$inlined$filter$1(this.f9366a.J0()), this);
    }

    public kotlinx.coroutines.flow.c H() {
        return new DefaultKeyboardSettings$observeIsInTabletModeOnUnfoldedDevices$$inlined$map$1(new DefaultKeyboardSettings$observeIsInTabletModeOnUnfoldedDevices$$inlined$filter$1(this.f9366a.J0()), this);
    }

    public boolean I() {
        if (!this.f9366a.t0() || !this.f9368c.b()) {
            return false;
        }
        return true;
    }

    public kotlinx.coroutines.flow.c J() {
        return new DefaultKeyboardSettings$observeShouldDisplayNumbersOnLongPress$$inlined$map$1(new DefaultKeyboardSettings$observeShouldDisplayNumbersOnLongPress$$inlined$filter$1(this.f9366a.J0()), this);
    }

    public kotlinx.coroutines.flow.c K() {
        return new DefaultKeyboardSettings$observeLayoutTypeChanges$$inlined$map$1(new DefaultKeyboardSettings$observeLayoutTypeChanges$$inlined$filter$1(this.f9366a.J0()), this);
    }

    public boolean L() {
        return this.f9378m;
    }

    public boolean M() {
        return this.f9375j;
    }

    public kotlinx.coroutines.flow.c N() {
        return new DefaultKeyboardSettings$observeTabletMode$$inlined$map$1(new DefaultKeyboardSettings$observeTabletMode$$inlined$filter$1(this.f9366a.J0()), this);
    }

    public void O(KeyboardLayoutType keyboardLayoutType) {
        o.e(keyboardLayoutType, "value");
        this.f9366a.C(keyboardLayoutType);
        if (keyboardLayoutType == KeyboardLayoutType.HEXAGON || keyboardLayoutType == KeyboardLayoutType.HEXAGON_LEGACY) {
            this.f9366a.K(keyboardLayoutType);
        }
    }

    public boolean P() {
        if (!this.f9374i || !this.f9368c.b()) {
            return false;
        }
        return true;
    }

    public kotlinx.coroutines.flow.c Q() {
        return new DefaultKeyboardSettings$observeSwipeMetrics$$inlined$map$1(new DefaultKeyboardSettings$observeSwipeMetrics$$inlined$filter$1(this.f9366a.J0()), this);
    }

    public kotlinx.coroutines.flow.c R() {
        return new DefaultKeyboardSettings$observeShouldDisplayCharactersPreview$$inlined$map$1(new DefaultKeyboardSettings$observeShouldDisplayCharactersPreview$$inlined$filter$1(this.f9366a.J0()), this);
    }

    public boolean S() {
        return this.f9370e;
    }

    public String[] T() {
        return new String[]{this.f9366a.h0(), this.f9366a.f0()};
    }

    public boolean U() {
        if (!this.f9366a.p() || !I()) {
            return false;
        }
        return true;
    }

    public boolean V() {
        return this.f9373h;
    }

    public boolean W() {
        return this.f9366a.N();
    }

    public float X() {
        int i4;
        if (this.f9368c.b()) {
            i4 = this.f9366a.j();
        } else {
            i4 = 2;
        }
        if (i4 >= g.f9514a.size()) {
            i4 = g.f9514a.size() - 1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        return ((Number) g.f9514a.get(i4)).floatValue();
    }

    public kotlinx.coroutines.flow.c a() {
        return new DefaultKeyboardSettings$observeLastAiAssistantPrompt$$inlined$map$1(new DefaultKeyboardSettings$observeLastAiAssistantPrompt$$inlined$filter$1(this.f9366a.J0()), this);
    }

    public String b(String str) {
        o.e(str, "key");
        String str2 = (String) this.f9380o.get(str);
        if (str2 != null) {
            return str2;
        }
        Map map = this.f9379n;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        o.d(lowerCase, "toLowerCase(...)");
        return (String) map.get(lowerCase);
    }

    public boolean c() {
        if (this.f9368c.b()) {
            return this.f9366a.H0();
        }
        return false;
    }

    public boolean d() {
        return this.f9366a.p0();
    }

    public kotlinx.coroutines.flow.c e() {
        return new DefaultKeyboardSettings$observeSpaceKeySize$$inlined$map$1(new DefaultKeyboardSettings$observeSpaceKeySize$$inlined$filter$1(this.f9366a.J0()), this);
    }

    public boolean f() {
        if (!this.f9366a.g0() || !this.f9368c.b()) {
            return false;
        }
        return true;
    }

    public kotlinx.coroutines.flow.c g() {
        return new DefaultKeyboardSettings$observeIsLanguageFlagEnabled$$inlined$map$1(new DefaultKeyboardSettings$observeIsLanguageFlagEnabled$$inlined$filter$1(this.f9366a.J0()), this);
    }

    public kotlinx.coroutines.flow.c h() {
        return new DefaultKeyboardSettings$observeIsInOfflineMode$$inlined$map$1(new DefaultKeyboardSettings$observeIsInOfflineMode$$inlined$filter$1(this.f9366a.J0()), this);
    }

    public Map i() {
        return this.f9366a.z();
    }

    public long j() {
        int i4;
        if (this.f9368c.b()) {
            i4 = this.f9366a.b();
        } else {
            i4 = 1;
        }
        return g.f9515b[i4];
    }

    public kotlinx.coroutines.flow.c k() {
        return new DefaultKeyboardSettings$observeCursorEnabledChanges$$inlined$map$1(new DefaultKeyboardSettings$observeCursorEnabledChanges$$inlined$filter$1(this.f9366a.J0()), this);
    }

    public boolean l() {
        if (this.f9368c.b()) {
            return this.f9371f;
        }
        return false;
    }

    public void m(boolean z3) {
        this.f9366a.F(z3);
    }

    public J n() {
        int i4;
        boolean b4 = this.f9368c.b();
        int i5 = 1;
        if (b4) {
            i4 = this.f9366a.m();
        } else {
            i4 = 1;
        }
        if (b4) {
            i5 = this.f9366a.n();
        }
        return new J(((Number) K.a().get(i4)).doubleValue(), ((Number) K.b().get(i5)).doubleValue());
    }

    public boolean o() {
        return this.f9366a.e0();
    }

    public boolean p() {
        return this.f9369d;
    }

    public void q(ch.icoaching.wrio.ai_assistant.ui.a aVar) {
        o.e(aVar, "lastAiAssistantPrompt");
        this.f9366a.B(aVar);
    }

    public boolean r() {
        return this.f9372g;
    }

    public int s() {
        return this.f9377l;
    }

    public void t(String str, String str2) {
        this.f9366a.L(str);
        this.f9366a.D(str2);
    }

    public boolean u() {
        return this.f9366a.j0();
    }

    public int v() {
        return this.f9376k;
    }

    public void w(Map map) {
        o.e(map, "promptUsage");
        this.f9366a.E(map);
    }

    public kotlinx.coroutines.flow.c x() {
        return new DefaultKeyboardSettings$observeShouldDisplayTinyCharacters$$inlined$map$1(new DefaultKeyboardSettings$observeShouldDisplayTinyCharacters$$inlined$filter$1(this.f9366a.J0()), this);
    }

    public ch.icoaching.wrio.ai_assistant.ui.a y() {
        return this.f9366a.Q0();
    }

    public boolean z() {
        boolean z3;
        boolean l4 = this.f9366a.l();
        boolean u3 = this.f9366a.u();
        boolean b4 = this.f9368c.b();
        boolean s4 = this.f9367b.s();
        if ((!l4 || !u3 || !this.f9368c.b()) && !s4) {
            z3 = false;
        } else {
            z3 = true;
        }
        Log log = Log.f10572a;
        Log.d(log, "DefaultKeyboardSettings", "isAIAssistantEnabled() :: [" + l4 + ", " + u3 + ", " + b4 + ", " + s4 + "] => " + z3, (Throwable) null, 4, (Object) null);
        return z3;
    }
}
