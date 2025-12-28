package ch.icoaching.wrio;

import E0.p;
import K2.C0341a;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.PointF;
import android.inputmethodservice.AbstractInputMethodService;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InlineSuggestionsRequest;
import android.view.inputmethod.InlineSuggestionsResponse;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.app.F;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C0403a0;
import androidx.core.view.C0435o0;
import c.C0489b;
import c.C0490c;
import ch.icoaching.typewise.predictions.PredictionsResult;
import ch.icoaching.wrio.autocorrect.c;
import ch.icoaching.wrio.data.m;
import ch.icoaching.wrio.input.AutoSpaceOnContentChangeHandler;
import ch.icoaching.wrio.input.AutocorrectOnContentChangeHandler;
import ch.icoaching.wrio.input.BackToLettersOnContentChangeHandler;
import ch.icoaching.wrio.input.CommandProcessorOnContentChangeHandler;
import ch.icoaching.wrio.input.DeleteWordUseCase;
import ch.icoaching.wrio.input.DotShortcutOnContentChangeHandler;
import ch.icoaching.wrio.input.OnContentChangeEventFlags;
import ch.icoaching.wrio.input.ShortcutsOnContentChangeHandler;
import ch.icoaching.wrio.input.j;
import ch.icoaching.wrio.input.l;
import ch.icoaching.wrio.input.n;
import ch.icoaching.wrio.input.q;
import ch.icoaching.wrio.input.r;
import ch.icoaching.wrio.input.s;
import ch.icoaching.wrio.keyboard.B;
import ch.icoaching.wrio.keyboard.N;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import ch.icoaching.wrio.keyboard.model.config.Emoji;
import ch.icoaching.wrio.keyboard.v;
import ch.icoaching.wrio.keyboard.z;
import ch.icoaching.wrio.language.d;
import ch.icoaching.wrio.logging.Log;
import ch.icoaching.wrio.prediction.d;
import ch.icoaching.wrio.tutorialmode.TutorialModeManager;
import ch.icoaching.wrio.ui.SwipeDirection;
import h.C0658a;
import i2.C0680a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.collections.C0718m;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D;
import kotlinx.coroutines.g0;
import u2.C0906a;

public abstract class BaseInputMethodService extends InputMethodService {
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public final ch.icoaching.wrio.ai_assistant.h f8956A;

    /* renamed from: B  reason: collision with root package name */
    private final ch.icoaching.wrio.input.focus.d f8957B;

    /* renamed from: C  reason: collision with root package name */
    private final C0658a f8958C;

    /* renamed from: D  reason: collision with root package name */
    private final ch.icoaching.wrio.input.i f8959D;

    /* renamed from: E  reason: collision with root package name */
    private final TutorialModeManager f8960E;

    /* renamed from: F  reason: collision with root package name */
    private final t3.f f8961F;

    /* renamed from: G  reason: collision with root package name */
    private final ch.icoaching.wrio.language.d f8962G;

    /* renamed from: H  reason: collision with root package name */
    private final ch.icoaching.wrio.subscription.a f8963H;

    /* renamed from: I  reason: collision with root package name */
    private final t3.a f8964I;

    /* renamed from: J  reason: collision with root package name */
    public ch.icoaching.wrio.subscription.i f8965J;

    /* renamed from: K  reason: collision with root package name */
    private WeakReference f8966K;

    /* renamed from: L  reason: collision with root package name */
    private BackToLettersOnContentChangeHandler f8967L;

    /* renamed from: M  reason: collision with root package name */
    private DotShortcutOnContentChangeHandler f8968M;

    /* renamed from: N  reason: collision with root package name */
    private ShortcutsOnContentChangeHandler f8969N;

    /* renamed from: O  reason: collision with root package name */
    private AutoSpaceOnContentChangeHandler f8970O;
    /* access modifiers changed from: private */

    /* renamed from: P  reason: collision with root package name */
    public WeakReference f8971P;
    /* access modifiers changed from: private */

    /* renamed from: Q  reason: collision with root package name */
    public WeakReference f8972Q;
    /* access modifiers changed from: private */

    /* renamed from: R  reason: collision with root package name */
    public final List f8973R;

    /* renamed from: S  reason: collision with root package name */
    private String f8974S;

    /* renamed from: T  reason: collision with root package name */
    private InputConnection f8975T;
    /* access modifiers changed from: private */

    /* renamed from: U  reason: collision with root package name */
    public j f8976U;

    /* renamed from: V  reason: collision with root package name */
    private final e f8977V;

    /* renamed from: W  reason: collision with root package name */
    private ch.icoaching.wrio.keyboard.view.smartbar.b f8978W;

    /* renamed from: X  reason: collision with root package name */
    private final h f8979X;
    /* access modifiers changed from: private */

    /* renamed from: Y  reason: collision with root package name */
    public final List f8980Y;
    /* access modifiers changed from: private */

    /* renamed from: Z  reason: collision with root package name */
    public final ch.icoaching.wrio.prediction.c f8981Z;

    /* renamed from: a  reason: collision with root package name */
    private final D f8982a;

    /* renamed from: a0  reason: collision with root package name */
    private final i f8983a0;

    /* renamed from: b  reason: collision with root package name */
    private final D f8984b;

    /* renamed from: b0  reason: collision with root package name */
    private final q3.a f8985b0;

    /* renamed from: c  reason: collision with root package name */
    private final CoroutineDispatcher f8986c;

    /* renamed from: c0  reason: collision with root package name */
    private final g f8987c0;

    /* renamed from: d  reason: collision with root package name */
    private final CoroutineDispatcher f8988d;

    /* renamed from: d0  reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f8989d0;

    /* renamed from: e  reason: collision with root package name */
    private final g0 f8990e;

    /* renamed from: e0  reason: collision with root package name */
    private final d f8991e0;

    /* renamed from: f  reason: collision with root package name */
    private final C0680a f8992f;

    /* renamed from: f0  reason: collision with root package name */
    private int f8993f0;

    /* renamed from: g  reason: collision with root package name */
    private final ch.icoaching.wrio.data.c f8994g;

    /* renamed from: g0  reason: collision with root package name */
    private boolean f8995g0;

    /* renamed from: h  reason: collision with root package name */
    private final ch.icoaching.wrio.data.b f8996h;
    /* access modifiers changed from: private */

    /* renamed from: h0  reason: collision with root package name */
    public int f8997h0;

    /* renamed from: i  reason: collision with root package name */
    private final ch.icoaching.wrio.data.a f8998i;

    /* renamed from: i0  reason: collision with root package name */
    private EditorInfo f8999i0;

    /* renamed from: j  reason: collision with root package name */
    private final SharedPreferences f9000j;

    /* renamed from: j0  reason: collision with root package name */
    private String f9001j0;

    /* renamed from: k  reason: collision with root package name */
    private final ch.icoaching.wrio.data.i f9002k;

    /* renamed from: k0  reason: collision with root package name */
    private int f9003k0;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final I0.b f9004l = I0.a.f579a.b();

    /* renamed from: m  reason: collision with root package name */
    private final v f9005m;

    /* renamed from: n  reason: collision with root package name */
    private final C0489b f9006n;

    /* renamed from: o  reason: collision with root package name */
    private final C0341a f9007o;

    /* renamed from: p  reason: collision with root package name */
    private final ch.icoaching.wrio.data.d f9008p;

    /* renamed from: q  reason: collision with root package name */
    private final ch.icoaching.wrio.input.c f9009q;

    /* renamed from: r  reason: collision with root package name */
    private final m3.a f9010r;

    /* renamed from: s  reason: collision with root package name */
    private final B f9011s;

    /* renamed from: t  reason: collision with root package name */
    private final ch.icoaching.wrio.theming.a f9012t;

    /* renamed from: u  reason: collision with root package name */
    private final N f9013u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final ch.icoaching.wrio.autocorrect.c f9014v;

    /* renamed from: w  reason: collision with root package name */
    private final ch.icoaching.wrio.theming.d f9015w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public final ch.icoaching.wrio.personalization.dynamic.a f9016x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public final ch.icoaching.wrio.prediction.d f9017y;

    /* renamed from: z  reason: collision with root package name */
    private final ch.icoaching.wrio.dictionary.d f9018z;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9019a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f9020b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|5|6|(2:7|8)|9|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
        static {
            /*
                ch.icoaching.wrio.autocorrect.AutoCapitalizationState[] r0 = ch.icoaching.wrio.autocorrect.AutoCapitalizationState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                ch.icoaching.wrio.autocorrect.AutoCapitalizationState r2 = ch.icoaching.wrio.autocorrect.AutoCapitalizationState.OFF     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                ch.icoaching.wrio.autocorrect.AutoCapitalizationState r3 = ch.icoaching.wrio.autocorrect.AutoCapitalizationState.LIMITED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ch.icoaching.wrio.autocorrect.AutoCapitalizationState r3 = ch.icoaching.wrio.autocorrect.AutoCapitalizationState.FULL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r4 = 3
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f9019a = r0
                ch.icoaching.typewise.predictions.PredictionsResult$Candidate$Type[] r0 = ch.icoaching.typewise.predictions.PredictionsResult.Candidate.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ch.icoaching.typewise.predictions.PredictionsResult$Candidate$Type r3 = ch.icoaching.typewise.predictions.PredictionsResult.Candidate.Type.CORRECTION_SUGGESTION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                ch.icoaching.typewise.predictions.PredictionsResult$Candidate$Type r1 = ch.icoaching.typewise.predictions.PredictionsResult.Candidate.Type.SPECIAL_FIELD_PREDICTION     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f9020b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.BaseInputMethodService.a.<clinit>():void");
        }
    }

    public static final class b implements n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseInputMethodService f9021a;

        b(BaseInputMethodService baseInputMethodService) {
            this.f9021a = baseInputMethodService;
        }

        public void a(l lVar) {
            o.e(lVar, "event");
            this.f9021a.K0(lVar);
        }
    }

    public static final class c implements ch.icoaching.wrio.input.o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseInputMethodService f9022a;

        c(BaseInputMethodService baseInputMethodService) {
            this.f9022a = baseInputMethodService;
        }

        public void g(String str, int i4) {
            o.e(str, "content");
            if (this.f9022a.v0().c() && this.f9022a.g0() != null) {
                BaseInputMethodService baseInputMethodService = this.f9022a;
                baseInputMethodService.L0((ch.icoaching.wrio.keyboard.view.smartbar.b) null);
                baseInputMethodService.f8980Y.clear();
                baseInputMethodService.Q0();
            }
        }
    }

    public static final class d implements d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseInputMethodService f9024a;

        d(BaseInputMethodService baseInputMethodService) {
            this.f9024a = baseInputMethodService;
        }

        public void c(String str) {
            o.e(str, "language");
            this.f9024a.H0(str);
        }
    }

    public static final class e implements c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseInputMethodService f9025a;

        e(BaseInputMethodService baseInputMethodService) {
            this.f9025a = baseInputMethodService;
        }

        public void a(CorrectionInfo correctionInfo, ch.icoaching.wrio.autocorrect.d dVar) {
            o.e(correctionInfo, "correctionInfo");
            o.e(dVar, "correctionCandidates");
            BaseInputMethodService baseInputMethodService = this.f9025a;
            CharSequence oldText = correctionInfo.getOldText();
            o.d(oldText, "getOldText(...)");
            String valueOf = String.valueOf(ch.icoaching.wrio.util.g.b(oldText));
            int offset = correctionInfo.getOffset();
            CharSequence newText = correctionInfo.getNewText();
            o.d(newText, "getNewText(...)");
            String valueOf2 = String.valueOf(ch.icoaching.wrio.util.g.b(newText));
            CharSequence oldText2 = correctionInfo.getOldText();
            o.d(oldText2, "getOldText(...)");
            baseInputMethodService.L0(new ch.icoaching.wrio.keyboard.view.smartbar.f(valueOf, offset, valueOf2, String.valueOf(ch.icoaching.wrio.util.g.a(oldText2)), SystemClock.elapsedRealtime()));
            baseInputMethodService.Q0();
            if (!dVar.a().isEmpty()) {
                this.f9025a.A0().g(2);
                m3.a o02 = this.f9025a.o0();
                Context context = this.f9025a.getLayoutInflater().getContext();
                o.d(context, "getContext(...)");
                o02.e(context, String.valueOf(correctionInfo.getOldText()), (String) C0718m.R(dVar.a()));
            }
        }
    }

    public static final class f implements ch.icoaching.wrio.ai_assistant.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseInputMethodService f9026a;

        f(BaseInputMethodService baseInputMethodService) {
            this.f9026a = baseInputMethodService;
        }

        public void a() {
            this.f9026a.w0().j();
            this.f9026a.w0().f();
            this.f9026a.f8956A.e();
            BaseInputMethodService baseInputMethodService = this.f9026a;
            String string = baseInputMethodService.getBaseContext().getString(C.undo);
            o.d(string, "getString(...)");
            baseInputMethodService.L0(new O0.a(string, SystemClock.elapsedRealtime()));
            this.f9026a.Q0();
        }

        public void b() {
            this.f9026a.w0().m();
        }

        public void c() {
            this.f9026a.w0().j();
            this.f9026a.w0().f();
            this.f9026a.f8956A.e();
        }

        public void d() {
            this.f9026a.w0().j();
            this.f9026a.w0().f();
            this.f9026a.f8956A.e();
        }
    }

    public static final class g implements B.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseInputMethodService f9027a;

        g(BaseInputMethodService baseInputMethodService) {
            this.f9027a = baseInputMethodService;
        }

        public void a() {
            this.f9027a.e0().a();
            this.f9027a.A0().g(1);
        }

        public void b() {
            this.f9027a.k0().b();
        }

        public void c() {
            this.f9027a.k0().c();
        }

        public void e(char c4, PointF pointF, boolean z3) {
            if (z3) {
                this.f9027a.k0().n(c4, pointF);
            } else {
                this.f9027a.k0().o(c4, pointF);
            }
        }

        public void f(int i4) {
            this.f9027a.k0().f(i4);
        }

        public void g(Character ch2, PointF pointF, boolean z3) {
            if (this.f9027a.f0().c() && this.f9027a.g0() != null) {
                BaseInputMethodService baseInputMethodService = this.f9027a;
                baseInputMethodService.o0().b();
                baseInputMethodService.R0(false);
            } else if (ch2 != null) {
                if (z3) {
                    this.f9027a.k0().n(ch2.charValue(), pointF);
                } else {
                    this.f9027a.k0().o(ch2.charValue(), pointF);
                }
            }
        }

        public void h(int i4) {
            this.f9027a.k0().h(i4);
        }

        public void i(int i4) {
            this.f9027a.k0().i(i4);
        }

        public void k(PointF pointF) {
            this.f9027a.k0().k(pointF);
        }

        public void l(String str) {
            o.e(str, "emojiString");
            this.f9027a.k0().l(str);
        }

        public void m(Emoji emoji) {
            o.e(emoji, "emoji");
            this.f9027a.m(emoji.getIcon());
            this.f9027a.k0().m(emoji);
        }

        public void n(char c4, PointF pointF) {
            this.f9027a.k0().n(c4, pointF);
        }

        public void o(char c4, PointF pointF) {
            this.f9027a.m(String.valueOf(c4));
            this.f9027a.k0().o(c4, pointF);
        }
    }

    public static final class h implements d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseInputMethodService f9028a;

        h(BaseInputMethodService baseInputMethodService) {
            this.f9028a = baseInputMethodService;
        }

        public void a(int i4, String str, String str2, List list) {
            o.e(str, "prefix");
            o.e(str2, "textBeforeCursor");
            o.e(list, "predictionCandidates");
            j u3 = this.f9028a.f8976U;
            if (u3 != null) {
                this.f9028a.f8981Z.e(u3.d());
                this.f9028a.f8981Z.a();
                this.f9028a.f8980Y.clear();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ch.icoaching.wrio.keyboard.view.smartbar.e b4 = BaseInputMethodServiceKt.g((PredictionsResult.Candidate) it.next(), i4, str, str2, this.f9028a.f8981Z);
                    if (b4 != null) {
                        this.f9028a.f8980Y.add(b4);
                    }
                }
                this.f9028a.Q0();
            }
        }
    }

    public static final class i implements z {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseInputMethodService f9029a;

        i(BaseInputMethodService baseInputMethodService) {
            this.f9029a = baseInputMethodService;
        }

        public void a(ch.icoaching.wrio.keyboard.view.smartbar.g gVar) {
            o.e(gVar, "smartBarItem");
            this.f9029a.A0().g(1);
            this.f9029a.P0(gVar);
        }

        public void b(ch.icoaching.wrio.keyboard.view.smartbar.g gVar) {
            o.e(gVar, "smartBarItem");
            if (gVar instanceof ch.icoaching.wrio.keyboard.view.smartbar.b) {
                this.f9029a.L0((ch.icoaching.wrio.keyboard.view.smartbar.b) null);
                this.f9029a.Q0();
            }
        }

        public void c(ch.icoaching.wrio.keyboard.view.smartbar.g gVar) {
            o.e(gVar, "smartBarItem");
            this.f9029a.A0().g(1);
            this.f9029a.S(gVar);
        }

        public void d(ch.icoaching.wrio.keyboard.view.smartbar.g gVar) {
            o.e(gVar, "smartBarItem");
            this.f9029a.A0().g(1);
            this.f9029a.l(gVar);
        }

        public void e(ch.icoaching.wrio.keyboard.view.smartbar.g gVar) {
            o.e(gVar, "smartBarItem");
            this.f9029a.A0().g(1);
            this.f9029a.V(gVar);
        }
    }

    public BaseInputMethodService() {
        M2.b bVar = M2.b.f944a;
        this.f8982a = bVar.a();
        X x3 = X.f9083a;
        this.f8984b = x3.r();
        this.f8986c = bVar.c();
        this.f8988d = bVar.b();
        this.f8990e = x3.q();
        ch.icoaching.wrio.data.f fVar = ch.icoaching.wrio.data.f.f9502a;
        this.f8992f = fVar.f();
        this.f8994g = fVar.k();
        this.f8996h = fVar.j();
        this.f8998i = fVar.d();
        this.f9000j = fVar.m();
        this.f9002k = fVar.l();
        this.f9005m = x3.f();
        this.f9006n = fVar.e();
        this.f9007o = fVar.i();
        this.f9008p = fVar.n();
        this.f9009q = x3.h();
        this.f9010r = m3.b.f14655a.b();
        this.f9011s = x3.k();
        this.f9012t = x3.v();
        this.f9013u = x3.t();
        this.f9014v = x3.d();
        this.f9015w = x3.l();
        this.f9016x = x3.g();
        this.f9017y = x3.m();
        this.f9018z = ch.icoaching.wrio.dictionary.e.f9628a.a();
        this.f8956A = ch.icoaching.wrio.ai_assistant.f.f9144a.d();
        this.f8957B = x3.i();
        this.f8958C = x3.s();
        this.f8959D = x3.j();
        this.f8960E = x3.x();
        this.f8961F = x3.y();
        this.f8962G = ch.icoaching.wrio.language.e.f10568a.a();
        this.f8963H = ch.icoaching.wrio.subscription.b.f10644a.a();
        this.f8964I = x3.c();
        this.f8973R = new ArrayList();
        this.f8974S = "";
        this.f8977V = new e(this);
        this.f8979X = new h(this);
        this.f8980Y = new ArrayList();
        this.f8981Z = new ch.icoaching.wrio.prediction.c();
        this.f8983a0 = new i(this);
        this.f8985b0 = q3.a.f15966a.a(this);
        this.f8987c0 = new g(this);
        this.f8989d0 = new C0508h(this);
        this.f8991e0 = new d(this);
        this.f9001j0 = "";
    }

    private final void B0() {
        if (this.f8992f.G()) {
            Log.d(Log.f10572a, "BaseInputMethodService", "handleLoadingIndicator() :: Show.", (Throwable) null, 4, (Object) null);
            this.f9013u.c();
            return;
        }
        Log.d(Log.f10572a, "BaseInputMethodService", "handleLoadingIndicator() :: Hide.", (Throwable) null, 4, (Object) null);
        this.f9013u.b();
    }

    /* access modifiers changed from: private */
    public final void C0() {
        String str;
        String str2;
        boolean z3;
        String packageName = getPackageName();
        o.d(packageName, "getPackageName(...)");
        if (kotlin.text.o.L(packageName, "typewise", false, 2, (Object) null)) {
            str = "typewise";
        } else {
            String packageName2 = getPackageName();
            o.d(packageName2, "getPackageName(...)");
            str = (String) kotlin.text.o.s0(packageName2, new char[]{'.'}, false, 0, 6, (Object) null).get(1);
        }
        ch.icoaching.wrio.ai_assistant.network.e eVar = ch.icoaching.wrio.ai_assistant.network.e.f9186a;
        eVar.c(str);
        eVar.h(this.f9008p.a());
        eVar.g(this.f9001j0);
        EditorInfo editorInfo = this.f8999i0;
        if (editorInfo == null || (str2 = editorInfo.packageName) == null) {
            str2 = "";
        }
        eVar.e(str2);
        EditorInfo editorInfo2 = this.f8999i0;
        if (editorInfo2 != null) {
            z3 = ch.icoaching.wrio.util.b.b(editorInfo2);
        } else {
            z3 = false;
        }
        eVar.d(z3);
        if (this.f9004l.s()) {
            if (o.a(str, "typewise")) {
                eVar.f(true);
            } else {
                eVar.f(false);
            }
        } else if (this.f8996h.z()) {
            eVar.f(false);
        } else {
            eVar.b();
        }
    }

    /* access modifiers changed from: private */
    public final void D0() {
    }

    /* access modifiers changed from: private */
    public final void E0() {
        String a4 = C0490c.a();
        o.d(a4, "getReset(...)");
        if (kotlin.text.o.L(a4, "user_dictionary", false, 2, (Object) null)) {
            new ch.icoaching.wrio.personalization.dictionary.b(this.f9000j, this.f9006n, this.f8975T).b();
        }
    }

    /* access modifiers changed from: private */
    public final void F0() {
        String a4 = C0490c.a();
        o.d(a4, "getReset(...)");
        if (kotlin.text.o.L(a4, "dynamic_layout", false, 2, (Object) null)) {
            new ch.icoaching.wrio.personalization.dynamic.b(this.f9000j, this.f9006n, this.f8975T).b();
        }
    }

    /* access modifiers changed from: private */
    public final void G0() {
        InputConnection inputConnection;
        String a4 = C0490c.a();
        o.d(a4, "getReset(...)");
        if (kotlin.text.o.L(a4, "settings", false, 2, (Object) null)) {
            try {
                this.f8992f.L0();
                this.f8962G.d();
                inputConnection = this.f8975T;
                if (inputConnection == null) {
                    return;
                }
            } catch (Exception e4) {
                e4.printStackTrace();
                inputConnection = this.f8975T;
                if (inputConnection == null) {
                    return;
                }
            } catch (Throwable th) {
                InputConnection inputConnection2 = this.f8975T;
                if (inputConnection2 != null) {
                    inputConnection2.commitText("Reset complete", 1);
                }
                throw th;
            }
            inputConnection.commitText("Reset complete", 1);
        }
    }

    private final List Q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(this));
        arrayList.add(new q(this.f9017y, this.f8958C));
        arrayList.add(new ch.icoaching.wrio.input.d(this.f8962G));
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final l2.q R(BaseInputMethodService baseInputMethodService) {
        ch.icoaching.wrio.ai_assistant.h hVar = baseInputMethodService.f8956A;
        LayoutInflater layoutInflater = baseInputMethodService.getLayoutInflater();
        o.d(layoutInflater, "getLayoutInflater(...)");
        p0.e g4 = hVar.g(layoutInflater);
        baseInputMethodService.f8956A.c();
        if (!g4.isShown()) {
            if (g4.getParent() != null) {
                ViewParent parent = g4.getParent();
                o.c(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(g4);
            }
            g4.setLayoutParams(new ConstraintLayout.b(-1, -1));
            baseInputMethodService.f9013u.i(g4);
            baseInputMethodService.f9013u.o();
            ch.icoaching.wrio.ai_assistant.h hVar2 = baseInputMethodService.f8956A;
            Context context = baseInputMethodService.getLayoutInflater().getContext();
            o.d(context, "getContext(...)");
            hVar2.f(context);
        }
        return l2.q.f14567a;
    }

    /* access modifiers changed from: private */
    public final void S(ch.icoaching.wrio.keyboard.view.smartbar.g gVar) {
        if (gVar instanceof ch.icoaching.wrio.keyboard.view.smartbar.f) {
            this.f9010r.c();
            this.f9010r.b();
            R0(true);
        } else if (gVar instanceof ch.icoaching.wrio.keyboard.view.smartbar.e) {
            k((ch.icoaching.wrio.keyboard.view.smartbar.e) gVar, SwipeDirection.DOWN);
        }
    }

    private final List T() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c(this));
        arrayList.add(new r(this.f8958C, this.f9017y));
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final l2.q U(BaseInputMethodService baseInputMethodService) {
        ch.icoaching.wrio.ai_assistant.h hVar = baseInputMethodService.f8956A;
        LayoutInflater layoutInflater = baseInputMethodService.getLayoutInflater();
        o.d(layoutInflater, "getLayoutInflater(...)");
        p0.e g4 = hVar.g(layoutInflater);
        if (g4.isShown()) {
            baseInputMethodService.f9013u.j();
            baseInputMethodService.f8956A.e();
        } else {
            if (g4.getParent() != null) {
                ViewParent parent = g4.getParent();
                o.c(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(g4);
            }
            g4.setLayoutParams(new ConstraintLayout.b(-1, -1));
            baseInputMethodService.f9013u.i(g4);
            baseInputMethodService.f9013u.o();
            ch.icoaching.wrio.ai_assistant.h hVar2 = baseInputMethodService.f8956A;
            Context context = baseInputMethodService.getLayoutInflater().getContext();
            o.d(context, "getContext(...)");
            hVar2.f(context);
        }
        return l2.q.f14567a;
    }

    /* access modifiers changed from: private */
    public final void V(ch.icoaching.wrio.keyboard.view.smartbar.g gVar) {
        if (gVar instanceof ch.icoaching.wrio.keyboard.view.smartbar.f) {
            this.f9010r.c();
            this.f9010r.b();
            R0(true);
        } else if (gVar instanceof ch.icoaching.wrio.keyboard.view.smartbar.e) {
            k((ch.icoaching.wrio.keyboard.view.smartbar.e) gVar, SwipeDirection.UP);
        }
    }

    private final List W() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new s(this.f8960E, this.f9017y, this.f8958C));
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final l2.q X(BaseInputMethodService baseInputMethodService) {
        baseInputMethodService.f9013u.j();
        baseInputMethodService.f9013u.f();
        baseInputMethodService.f8956A.e();
        baseInputMethodService.f8956A.b();
        return l2.q.f14567a;
    }

    /* access modifiers changed from: private */
    public final void Z() {
        if (Build.VERSION.SDK_INT >= 35) {
            Window window = getWindow().getWindow();
            o.b(window);
            C0403a0.b(window, false);
        }
    }

    private final void c0() {
        if (!this.f8960E.j()) {
            List e4 = m.a(this.f8994g, this.f8992f).e();
            if (!e4.isEmpty()) {
                o.a(e4.get(0), "es");
            }
        }
    }

    /* access modifiers changed from: private */
    public final int d0() {
        Window window;
        View decorView;
        Boolean bool;
        int i4 = Build.VERSION.SDK_INT;
        WindowInsets windowInsets = null;
        if (i4 >= 29) {
            Log log = Log.f10572a;
            StringBuilder sb = new StringBuilder();
            sb.append("getSystemBarBottomInset() :: isNavigationBarContrastEnforced = ");
            Window window2 = getWindow().getWindow();
            if (window2 != null) {
                bool = Boolean.valueOf(window2.isNavigationBarContrastEnforced());
            } else {
                bool = null;
            }
            sb.append(bool);
            Log.d(log, "BaseInputMethodService", sb.toString(), (Throwable) null, 4, (Object) null);
        }
        Resources resources = getResources();
        o.d(resources, "getResources(...)");
        int b4 = E.b(resources);
        Resources resources2 = getResources();
        o.d(resources2, "getResources(...)");
        int a4 = E.a(resources2);
        Log log2 = Log.f10572a;
        Log.d(log2, "BaseInputMethodService", "getSystemBarBottomInset() :: statusBarHeight = " + b4 + ", navigationBarHeight = " + a4, (Throwable) null, 4, (Object) null);
        if (i4 < 30 || i4 <= 34) {
            b4 = 0;
        } else {
            Dialog window3 = getWindow();
            if (!(window3 == null || (window = window3.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
                windowInsets = decorView.getRootWindowInsets();
            }
            Log.d(log2, "BaseInputMethodService", "getSystemBarBottomInset() :: windowInsets = " + windowInsets, (Throwable) null, 4, (Object) null);
            if (windowInsets != null) {
                Insets a5 = windowInsets.getInsets(C0435o0.m.f());
                o.d(a5, "getInsets(...)");
                b4 = a5.bottom;
            }
        }
        Log.d(log2, "BaseInputMethodService", "getSystemBarBottomInset() :: bottomInset = " + b4, (Throwable) null, 4, (Object) null);
        Log log3 = log2;
        Log.d(log3, "BaseInputMethodService", "getSystemBarBottomInset() :: deviceManufacturerModel = '" + (Build.MANUFACTURER + " - " + Build.MODEL) + "', sdkVersion = " + i4, (Throwable) null, 4, (Object) null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("getSystemBarBottomInset() :: Returning ");
        sb2.append(b4);
        sb2.append('.');
        Log.d(log3, "BaseInputMethodService", sb2.toString(), (Throwable) null, 4, (Object) null);
        return b4;
    }

    private final ch.icoaching.wrio.input.m f() {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        T autocorrectOnContentChangeHandler = new AutocorrectOnContentChangeHandler(this.f9014v, (ch.icoaching.wrio.input.m) ref$ObjectRef.element);
        ref$ObjectRef.element = autocorrectOnContentChangeHandler;
        T autoSpaceOnContentChangeHandler = new AutoSpaceOnContentChangeHandler(this.f9009q, autocorrectOnContentChangeHandler);
        ref$ObjectRef.element = autoSpaceOnContentChangeHandler;
        this.f8970O = autoSpaceOnContentChangeHandler;
        T dotShortcutOnContentChangeHandler = new DotShortcutOnContentChangeHandler(this.f9009q, this.f8996h, autoSpaceOnContentChangeHandler);
        ref$ObjectRef.element = dotShortcutOnContentChangeHandler;
        this.f8968M = dotShortcutOnContentChangeHandler;
        T shortcutsOnContentChangeHandler = new ShortcutsOnContentChangeHandler(this.f9009q, this.f8963H, this.f8996h, dotShortcutOnContentChangeHandler);
        ref$ObjectRef.element = shortcutsOnContentChangeHandler;
        this.f8969N = shortcutsOnContentChangeHandler;
        Context applicationContext = getApplicationContext();
        o.d(applicationContext, "getApplicationContext(...)");
        CommandProcessorOnContentChangeHandler commandProcessorOnContentChangeHandler = new CommandProcessorOnContentChangeHandler(applicationContext, this, this.f8984b, this.f9002k, this.f9006n, (ch.icoaching.wrio.input.m) ref$ObjectRef.element);
        ref$ObjectRef.element = commandProcessorOnContentChangeHandler;
        T backToLettersOnContentChangeHandler = new BackToLettersOnContentChangeHandler(this.f9011s, this.f8996h, commandProcessorOnContentChangeHandler);
        ref$ObjectRef.element = backToLettersOnContentChangeHandler;
        this.f8967L = backToLettersOnContentChangeHandler;
        ref$ObjectRef.element = new BaseInputMethodService$createOnContentChangeHandlers$1(ref$ObjectRef);
        T baseInputMethodService$createOnContentChangeHandlers$2 = new BaseInputMethodService$createOnContentChangeHandlers$2(ref$ObjectRef, this);
        ref$ObjectRef.element = baseInputMethodService$createOnContentChangeHandlers$2;
        return baseInputMethodService$createOnContentChangeHandlers$2;
    }

    /* access modifiers changed from: private */
    public static final l2.q g(BaseInputMethodService baseInputMethodService) {
        baseInputMethodService.Z();
        int d02 = baseInputMethodService.d0();
        baseInputMethodService.f8997h0 = d02;
        Log log = Log.f10572a;
        Log.d(log, "BaseInputMethodService", "onCreate() :: Recreate keyboard View callback called with systemBarBottomInset = " + d02, (Throwable) null, 4, (Object) null);
        B b4 = baseInputMethodService.f9011s;
        LayoutInflater layoutInflater = baseInputMethodService.getLayoutInflater();
        o.d(layoutInflater, "getLayoutInflater(...)");
        baseInputMethodService.setInputView(b4.C(layoutInflater, d02, baseInputMethodService.f8985b0.a()));
        baseInputMethodService.I0();
        return l2.q.f14567a;
    }

    /* access modifiers changed from: private */
    public final void h(M0.c cVar) {
        M0.b bVar;
        M0.b bVar2;
        if (!cVar.b().isEmpty()) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            Iterator it = cVar.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                M0.b bVar3 = (M0.b) it.next();
                if (bVar3.a() == ' ') {
                    arrayList.add(bVar3);
                } else {
                    p pVar = new p(bVar3.b().x, bVar3.b().y);
                    hashMap.put(String.valueOf(bVar3.a()), pVar);
                    for (Character charValue : this.f9005m.b(bVar3.a())) {
                        hashMap.put(String.valueOf(charValue.charValue()), pVar);
                    }
                }
            }
            if (arrayList.size() == 1) {
                M0.b bVar4 = (M0.b) arrayList.get(0);
                float d4 = ((float) bVar4.d()) / 2.0f;
                float f4 = bVar4.b().x + d4;
                float f5 = bVar4.b().y;
                hashMap.put("space_rect_l", new p(bVar4.b().x - d4, f5));
                hashMap.put("space_rect_r", new p(f4, f5));
            } else if (arrayList.size() > 1) {
                if (((M0.b) arrayList.get(0)).b().x < ((M0.b) arrayList.get(1)).b().x) {
                    bVar = (M0.b) arrayList.get(0);
                } else {
                    bVar = (M0.b) arrayList.get(1);
                }
                if (((M0.b) arrayList.get(0)).b().x < ((M0.b) arrayList.get(1)).b().x) {
                    bVar2 = (M0.b) arrayList.get(1);
                } else {
                    bVar2 = (M0.b) arrayList.get(0);
                }
                hashMap.put("spacel", new p(bVar.b().x, bVar.b().y));
                hashMap.put("spacer", new p(bVar2.b().x, bVar2.b().y));
            }
            this.f9014v.g(cVar.a(), hashMap);
            this.f9016x.e(cVar);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r3.f9003k0 != 0) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(android.view.inputmethod.EditorInfo r4, android.view.inputmethod.InputConnection r5) {
        /*
            r3 = this;
            r3.f8975T = r5
            r0 = 16384(0x4000, float:2.2959E-41)
            r3.f9003k0 = r0
            int r0 = r4.inputType
            r0 = r0 & 28672(0x7000, float:4.0178E-41)
            r3.f9003k0 = r0
            ch.icoaching.wrio.data.a r0 = r3.f8998i
            ch.icoaching.wrio.autocorrect.AutoCapitalizationState r0 = r0.a()
            int[] r1 = ch.icoaching.wrio.BaseInputMethodService.a.f9019a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L_0x002f
            r2 = 2
            if (r0 == r2) goto L_0x002a
            r2 = 3
            if (r0 != r2) goto L_0x0024
            goto L_0x002a
        L_0x0024:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L_0x002a:
            int r0 = r3.f9003k0
            if (r0 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            ch.icoaching.wrio.input.j$a r0 = new ch.icoaching.wrio.input.j$a
            r0.<init>()
            ch.icoaching.wrio.input.j$a r0 = r0.a(r4)
            ch.icoaching.wrio.data.a r2 = r3.f8998i
            boolean r2 = r2.f()
            ch.icoaching.wrio.input.j$a r0 = r0.b(r2)
            ch.icoaching.wrio.input.j$a r0 = r0.d(r1)
            ch.icoaching.wrio.input.j r0 = r0.c()
            r3.f8976U = r0
            ch.icoaching.wrio.input.BackToLettersOnContentChangeHandler r1 = r3.f8967L
            if (r1 == 0) goto L_0x0056
            int r2 = r4.inputType
            r1.c(r2)
        L_0x0056:
            ch.icoaching.wrio.input.AutoSpaceOnContentChangeHandler r1 = r3.f8970O
            if (r1 == 0) goto L_0x005d
            r1.c(r0)
        L_0x005d:
            ch.icoaching.wrio.input.DotShortcutOnContentChangeHandler r1 = r3.f8968M
            if (r1 == 0) goto L_0x0064
            r1.c(r0)
        L_0x0064:
            ch.icoaching.wrio.input.ShortcutsOnContentChangeHandler r1 = r3.f8969N
            if (r1 == 0) goto L_0x006b
            r1.c(r0)
        L_0x006b:
            ch.icoaching.wrio.keyboard.B r1 = r3.f9011s
            r1.q(r5, r4, r0)
            ch.icoaching.wrio.input.c r1 = r3.f9009q
            r1.q(r5, r4, r0)
            ch.icoaching.wrio.autocorrect.c r5 = r3.f9014v
            r5.f(r4, r0)
            ch.icoaching.wrio.prediction.d r5 = r3.f9017y
            r5.f(r4, r0)
            ch.icoaching.wrio.personalization.dynamic.a r5 = r3.f9016x
            boolean r4 = ch.icoaching.wrio.util.b.e(r4)
            r5.c(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.BaseInputMethodService.i(android.view.inputmethod.EditorInfo, android.view.inputmethod.InputConnection):void");
    }

    /* access modifiers changed from: private */
    public static final void j(BaseInputMethodService baseInputMethodService, SharedPreferences sharedPreferences, String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 102739013) {
                if (hashCode == 1935846648 && str.equals("database_building")) {
                    baseInputMethodService.B0();
                }
            } else if (str.equals("langs")) {
                baseInputMethodService.f8962G.b();
                baseInputMethodService.c0();
            }
        }
    }

    private final void k(ch.icoaching.wrio.keyboard.view.smartbar.e eVar, SwipeDirection swipeDirection) {
        String str;
        PredictionsResult.Candidate a4 = BaseInputMethodServiceKt.f(eVar);
        if (this.f8963H.b() || !a4.h()) {
            int i4 = a.f9020b[a4.g().ordinal()];
            if (i4 == 1) {
                str = BaseInputMethodServiceKt.c(eVar.l(), swipeDirection);
            } else if (i4 != 2) {
                str = BaseInputMethodServiceKt.c(eVar.l(), swipeDirection) + ' ';
            } else {
                str = BaseInputMethodServiceKt.c(eVar.l(), swipeDirection);
            }
            if (a4.g() != PredictionsResult.Candidate.Type.CORRECTION_SUGGESTION) {
                g0 unused = C0739h.d(this.f8984b, (CoroutineContext) null, (CoroutineStart) null, new BaseInputMethodService$onPredictionItemClicked$1(this, str, (kotlin.coroutines.c<? super BaseInputMethodService$onPredictionItemClicked$1>) null), 3, (Object) null);
            }
            this.f9009q.v(eVar.j(), eVar.f(), str, a4.g());
            return;
        }
        ch.icoaching.wrio.subscription.i z02 = z0();
        Context context = getLayoutInflater().getContext();
        o.d(context, "getContext(...)");
        z02.f(context);
    }

    /* access modifiers changed from: private */
    public final void l(ch.icoaching.wrio.keyboard.view.smartbar.g gVar) {
        if (gVar instanceof ch.icoaching.wrio.keyboard.view.smartbar.f) {
            g0 unused = C0739h.d(this.f8984b, (CoroutineContext) null, (CoroutineStart) null, new BaseInputMethodService$smartBarItemLongClicked$1(this, gVar, (kotlin.coroutines.c<? super BaseInputMethodService$smartBarItemLongClicked$1>) null), 3, (Object) null);
            R0(true);
        } else if (gVar instanceof ch.icoaching.wrio.keyboard.view.smartbar.e) {
            PredictionsResult.Candidate a4 = BaseInputMethodServiceKt.f((ch.icoaching.wrio.keyboard.view.smartbar.e) gVar);
            EditorInfo editorInfo = this.f8999i0;
            if (editorInfo == null || !new ch.icoaching.wrio.util.d(editorInfo).c()) {
                g0 unused2 = C0739h.d(this.f8984b, (CoroutineContext) null, (CoroutineStart) null, new BaseInputMethodService$smartBarItemLongClicked$2(this, a4, (kotlin.coroutines.c<? super BaseInputMethodService$smartBarItemLongClicked$2>) null), 3, (Object) null);
                new DeleteWordUseCase(this.f8984b, this.f8988d, this.f8986c, this.f8959D, this.f9006n).d(a4.f());
                return;
            }
            this.f9009q.c(a4.f());
        }
    }

    /* access modifiers changed from: private */
    public final void m(String str) {
        String str2 = this.f9009q.d() + str;
        if (this.f9009q.f() + str.length() == str2.length()) {
            this.f9011s.g(TextUtils.getCapsMode(str2, str2.length(), 16384));
        }
    }

    /* access modifiers changed from: private */
    public final void n(boolean z3, boolean z4) {
        boolean z5;
        if (!o.a(getPackageName(), "ch.icoaching.wrio") && z3 && !z4) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f9013u.f(z5);
        Log log = Log.f10572a;
        Log.d(log, "BaseInputMethodService", "updateAIAssistantUI() :: showAiAssistant = " + z5, (Throwable) null, 4, (Object) null);
        if (!z5) {
            this.f9013u.j();
            this.f9013u.f();
            this.f8956A.e();
        }
    }

    public final t3.f A0() {
        return this.f8961F;
    }

    public final void H0(String str) {
        o.e(str, "language");
        g0 unused = C0739h.d(this.f8984b, (CoroutineContext) null, (CoroutineStart) null, new BaseInputMethodService$onDominantLanguageChange$1(this, str, (kotlin.coroutines.c<? super BaseInputMethodService$onDominantLanguageChange$1>) null), 3, (Object) null);
    }

    public void I0() {
        B0();
        n(this.f8996h.z(), this.f8996h.o());
        kotlinx.coroutines.flow.e.j(kotlinx.coroutines.flow.e.k(this.f8996h.a(), new BaseInputMethodService$onSetupSmartBar$1(this, (kotlin.coroutines.c<? super BaseInputMethodService$onSetupSmartBar$1>) null)), this.f8984b);
        this.f9013u.h(new C0505e(this));
        this.f9013u.y(new C0506f(this));
        this.f9013u.v(new C0507g(this));
    }

    public void J0(ThemeModel themeModel) {
        o.e(themeModel, "theme");
        ThemeModel.AIAssistantTheme aiAssistantTheme = themeModel.getAiAssistantTheme();
        if (aiAssistantTheme != null) {
            this.f8956A.i(aiAssistantTheme);
            this.f9013u.t(aiAssistantTheme.getAiAssistantBarTheme().getAiPromptFontActiveColor(), aiAssistantTheme.getAiAssistantBarTheme().getAiPromptBackgroundActiveColor());
        }
        this.f9015w.o(themeModel);
        this.f9011s.o(themeModel);
        this.f9013u.u(themeModel.getSmartBarTheme());
    }

    public void K0(l lVar) {
        ch.icoaching.wrio.keyboard.view.smartbar.b bVar;
        o.e(lVar, "event");
        ch.icoaching.wrio.keyboard.view.smartbar.b bVar2 = this.f8978W;
        if (bVar2 != null && (bVar2 instanceof O0.a) && lVar.g().a() != OnContentChangeEventFlags.TriggerEventType.TEXT_REPLACEMENT_DONE) {
            this.f8978W = null;
            Q0();
        } else if (lVar.g().a() == OnContentChangeEventFlags.TriggerEventType.DELETE && (bVar = this.f8978W) != null && (bVar instanceof ch.icoaching.wrio.keyboard.view.smartbar.f)) {
            ch.icoaching.wrio.keyboard.view.smartbar.f fVar = (ch.icoaching.wrio.keyboard.view.smartbar.f) bVar;
            if (lVar.f() < fVar.g() + fVar.f().length()) {
                this.f8978W = null;
                Q0();
            }
        }
    }

    public final void L0(ch.icoaching.wrio.keyboard.view.smartbar.b bVar) {
        this.f8978W = bVar;
    }

    public final void M0(C0556u uVar) {
        WeakReference weakReference;
        if (uVar == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference(uVar);
        }
        this.f8971P = weakReference;
    }

    public final void N0(C0557v vVar) {
        WeakReference weakReference;
        if (vVar == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference(vVar);
        }
        this.f8972Q = weakReference;
    }

    public final void O0(ch.icoaching.wrio.subscription.i iVar) {
        o.e(iVar, "<set-?>");
        this.f8965J = iVar;
    }

    public final void P(C0558w wVar) {
        o.e(wVar, "listener");
        this.f8973R.add(new WeakReference(wVar));
    }

    public void P0(ch.icoaching.wrio.keyboard.view.smartbar.g gVar) {
        o.e(gVar, "smartBarItem");
        if (gVar instanceof O0.a) {
            this.f8956A.d();
        } else if (gVar instanceof ch.icoaching.wrio.keyboard.view.smartbar.f) {
            this.f9010r.b();
            R0(true);
        } else if (gVar instanceof ch.icoaching.wrio.keyboard.view.smartbar.e) {
            k((ch.icoaching.wrio.keyboard.view.smartbar.e) gVar, SwipeDirection.NONE);
        }
    }

    public final void Q0() {
        ArrayList arrayList = new ArrayList();
        ch.icoaching.wrio.keyboard.view.smartbar.b bVar = this.f8978W;
        if (bVar != null && bVar.c() > SystemClock.elapsedRealtime() - 10000) {
            arrayList.add(bVar);
        }
        arrayList.addAll(this.f8980Y);
        this.f9013u.s(arrayList);
    }

    public void R0(boolean z3) {
        ch.icoaching.wrio.keyboard.view.smartbar.b bVar = this.f8978W;
        if (bVar != null && (bVar instanceof ch.icoaching.wrio.keyboard.view.smartbar.f)) {
            ch.icoaching.wrio.keyboard.view.smartbar.f fVar = (ch.icoaching.wrio.keyboard.view.smartbar.f) bVar;
            String f4 = fVar.f();
            String h4 = fVar.h();
            this.f9014v.e(h4, true);
            g0 unused = C0739h.d(this.f8984b, (CoroutineContext) null, (CoroutineStart) null, new BaseInputMethodService$undoCorrection$1(this, bVar, f4, h4, (kotlin.coroutines.c<? super BaseInputMethodService$undoCorrection$1>) null), 3, (Object) null);
        }
        this.f8978W = null;
        Q0();
    }

    public final void Y() {
        this.f9013u.q();
        this.f9013u.z();
    }

    public final void a0() {
        this.f9013u.n();
    }

    public final void b0() {
        this.f9013u.z();
    }

    public final t3.a e0() {
        return this.f8964I;
    }

    public final ch.icoaching.wrio.data.a f0() {
        return this.f8998i;
    }

    public final ch.icoaching.wrio.keyboard.view.smartbar.b g0() {
        return this.f8978W;
    }

    /* access modifiers changed from: protected */
    public final q3.a h0() {
        return this.f8985b0;
    }

    public final String i0() {
        return this.f9001j0;
    }

    public final C0680a j0() {
        return this.f8992f;
    }

    public final ch.icoaching.wrio.input.c k0() {
        return this.f9009q;
    }

    public final ch.icoaching.wrio.input.focus.d l0() {
        return this.f8957B;
    }

    public final CoroutineDispatcher m0() {
        return this.f8988d;
    }

    public final B n0() {
        return this.f9011s;
    }

    public final m3.a o0() {
        return this.f9010r;
    }

    public void onComputeInsets(InputMethodService.Insets insets) {
        o.e(insets, "outInsets");
        super.onComputeInsets(insets);
        if (!o.a("com.google.android.keep", this.f8974S)) {
            insets.contentTopInsets = insets.visibleTopInsets;
        } else if (this.f8993f0 == 2) {
            int F3 = this.f9011s.F();
            Log log = Log.f10572a;
            Log.d(log, "BaseInputMethodService", "onComputeInsets() :: keyboardHeight = " + F3, (Throwable) null, 4, (Object) null);
            if (F3 != -1) {
                insets.contentTopInsets = F3;
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        o.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Log log = Log.f10572a;
        Log.d(log, "BaseInputMethodService", "onConfigurationChanged() :: newConfig = " + configuration, (Throwable) null, 4, (Object) null);
        this.f8985b0.onConfigurationChanged(configuration);
        this.f8993f0 = configuration.orientation;
        this.f9011s.A(configuration, this.f8985b0.a());
        this.f9013u.k();
        this.f9012t.b(this, configuration);
    }

    public void onCreate() {
        Dialog window;
        Window window2;
        View decorView;
        kotlinx.coroutines.flow.c d4;
        kotlinx.coroutines.flow.c e4;
        kotlinx.coroutines.flow.c k4;
        String str = Build.MANUFACTURER;
        if (o.a(str, "Xiaomi")) {
            Application application = getApplication();
            int i4 = D.AppTheme;
            application.setTheme(i4);
            setTheme(i4);
        }
        super.onCreate();
        Log.i(Log.f10572a, "BaseInputMethodService", "onCreate()", (Throwable) null, 4, (Object) null);
        this.f8993f0 = getResources().getConfiguration().orientation;
        B b4 = this.f9011s;
        Configuration configuration = getResources().getConfiguration();
        o.d(configuration, "getConfiguration(...)");
        b4.u(configuration);
        ch.icoaching.wrio.theming.d dVar = this.f9015w;
        Dialog window3 = getWindow();
        o.d(window3, "getWindow(...)");
        dVar.a(this, window3);
        this.f9017y.b();
        this.f9012t.a(new BaseInputMethodService$onCreate$1(this));
        this.f9012t.c(this);
        this.f9010r.d(this);
        Double[] e5 = BaseInputMethodServiceKt.e(this.f8960E, this.f8996h);
        this.f9011s.v(e5[0].doubleValue(), e5[1].doubleValue());
        this.f9011s.h(new C0504d(this));
        this.f9011s.D(this.f9005m);
        this.f9011s.x(this.f8987c0);
        g0 unused = C0739h.d(this.f8984b, (CoroutineContext) null, (CoroutineStart) null, new BaseInputMethodService$onCreate$3(this, (kotlin.coroutines.c<? super BaseInputMethodService$onCreate$3>) null), 3, (Object) null);
        this.f8957B.f(getWindow().getWindow(), new BaseInputMethodService$onCreate$4(this), new BaseInputMethodService$onCreate$5(this));
        this.f9009q.g(this.f9011s.b());
        this.f9009q.A(f());
        this.f9009q.w(Q());
        this.f9009q.s(T());
        this.f9009q.u(W());
        this.f9014v.h(this.f8977V);
        this.f9017y.d(this.f8979X);
        this.f9013u.r(this.f8983a0);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this.f8989d0);
        C0490c.b(defaultSharedPreferences);
        this.f8962G.b();
        c0();
        this.f8962G.f(this.f8991e0);
        this.f9018z.b();
        String str2 = str + ';' + Build.MODEL;
        if (!defaultSharedPreferences.contains("phone_model")) {
            SharedPreferences.Editor edit = defaultSharedPreferences.edit();
            edit.putString("phone_model", str2);
            edit.apply();
        } else if (!o.a(defaultSharedPreferences.getString("phone_model", str2), str2)) {
            g0 unused2 = C0739h.d(this.f8984b, (CoroutineContext) null, (CoroutineStart) null, new BaseInputMethodService$onCreate$6(this, (kotlin.coroutines.c<? super BaseInputMethodService$onCreate$6>) null), 3, (Object) null);
            SharedPreferences.Editor edit2 = defaultSharedPreferences.edit();
            edit2.putString("phone_model", str2);
            edit2.apply();
        }
        kotlinx.coroutines.flow.e.j(kotlinx.coroutines.flow.e.k(this.f8996h.G(), new BaseInputMethodService$onCreate$7(this, (kotlin.coroutines.c<? super BaseInputMethodService$onCreate$7>) null)), this.f8984b);
        kotlinx.coroutines.flow.e.j(kotlinx.coroutines.flow.e.k(this.f8996h.h(), new BaseInputMethodService$onCreate$8(this, (kotlin.coroutines.c<? super BaseInputMethodService$onCreate$8>) null)), this.f8984b);
        if (!(Build.VERSION.SDK_INT < 35 || (window = getWindow()) == null || (window2 = window.getWindow()) == null || (decorView = window2.getDecorView()) == null || (d4 = BaseInputMethodServiceKt.h(decorView)) == null || (e4 = kotlinx.coroutines.flow.e.e(d4, 200)) == null || (k4 = kotlinx.coroutines.flow.e.k(e4, new BaseInputMethodService$onCreate$9(this, (kotlin.coroutines.c<? super BaseInputMethodService$onCreate$9>) null))) == null)) {
            kotlinx.coroutines.flow.e.j(k4, this.f8984b);
        }
        this.f8956A.h(new f(this));
    }

    public InlineSuggestionsRequest onCreateInlineSuggestionsRequest(Bundle bundle) {
        o.e(bundle, "uiExtras");
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.d(Log.f10572a, "BaseInputMethodService", "onCreateInlineSuggestionsRequest()", (Throwable) null, 4, (Object) null);
        return this.f9013u.e();
    }

    public AbstractInputMethodService.AbstractInputMethodImpl onCreateInputMethodInterface() {
        AbstractInputMethodService.AbstractInputMethodImpl onCreateInputMethodInterface = super.onCreateInputMethodInterface();
        ch.icoaching.wrio.input.focus.d dVar = this.f8957B;
        o.b(onCreateInputMethodInterface);
        dVar.a(onCreateInputMethodInterface);
        return onCreateInputMethodInterface;
    }

    public View onCreateInputView() {
        Z();
        int d02 = d0();
        this.f8997h0 = d02;
        Log log = Log.f10572a;
        Log.i(log, "BaseInputMethodService", "onCreateInputView() :: systemBarBottomInset = " + d02, (Throwable) null, 4, (Object) null);
        B b4 = this.f9011s;
        LayoutInflater layoutInflater = getLayoutInflater();
        o.d(layoutInflater, "getLayoutInflater(...)");
        View C3 = b4.C(layoutInflater, d02, this.f8985b0.a());
        I0();
        return C3;
    }

    public void onDestroy() {
        Log.i(Log.f10572a, "BaseInputMethodService", "onDestroy()", (Throwable) null, 4, (Object) null);
        this.f9018z.e();
        this.f8957B.e();
        this.f9011s.h((C0906a) null);
        this.f9017y.e();
        this.f9012t.e();
        this.f9015w.e();
        g0.a.a(this.f8990e, (CancellationException) null, 1, (Object) null);
        try {
            this.f8962G.e();
        } catch (Exception e4) {
            Log.f10572a.c("BaseInputMethodService", "", e4);
        }
        super.onDestroy();
    }

    public void onFinishInput() {
        super.onFinishInput();
        Log.i(Log.f10572a, "BaseInputMethodService", "onFinishInput()", (Throwable) null, 4, (Object) null);
        this.f9017y.a();
        this.f9014v.a();
        this.f9009q.a();
        ShortcutsOnContentChangeHandler shortcutsOnContentChangeHandler = this.f8969N;
        if (shortcutsOnContentChangeHandler != null) {
            shortcutsOnContentChangeHandler.c((j) null);
        }
        DotShortcutOnContentChangeHandler dotShortcutOnContentChangeHandler = this.f8968M;
        if (dotShortcutOnContentChangeHandler != null) {
            dotShortcutOnContentChangeHandler.c((j) null);
        }
        AutoSpaceOnContentChangeHandler autoSpaceOnContentChangeHandler = this.f8970O;
        if (autoSpaceOnContentChangeHandler != null) {
            autoSpaceOnContentChangeHandler.c((j) null);
        }
        BackToLettersOnContentChangeHandler backToLettersOnContentChangeHandler = this.f8967L;
        if (backToLettersOnContentChangeHandler != null) {
            backToLettersOnContentChangeHandler.c(1);
        }
    }

    public void onFinishInputView(boolean z3) {
        super.onFinishInputView(z3);
        Log log = Log.f10572a;
        Log.i(log, "BaseInputMethodService", "onFinishInputView() :: " + z3, (Throwable) null, 4, (Object) null);
        this.f8981Z.b((EditorInfo) null);
        this.f9016x.a();
        this.f9011s.f(z3);
        this.f9009q.p();
        this.f8958C.a((EditorInfo) null);
        this.f8957B.p();
        this.f8956A.a();
        this.f8962G.a();
        if (z3) {
            this.f9013u.c(false);
        }
        g0 unused = C0739h.d(this.f8984b, (CoroutineContext) null, (CoroutineStart) null, new BaseInputMethodService$onFinishInputView$1(this, (kotlin.coroutines.c<? super BaseInputMethodService$onFinishInputView$1>) null), 3, (Object) null);
    }

    public boolean onInlineSuggestionsResponse(InlineSuggestionsResponse inlineSuggestionsResponse) {
        o.e(inlineSuggestionsResponse, "response");
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        Log.d(Log.f10572a, "BaseInputMethodService", "onInlineSuggestionsResponse()", (Throwable) null, 4, (Object) null);
        this.f8958C.b(true);
        this.f9013u.c(this.f8958C.c());
        N n4 = this.f9013u;
        List a4 = inlineSuggestionsResponse.getInlineSuggestions();
        o.d(a4, "getInlineSuggestions(...)");
        n4.g(a4);
        return true;
    }

    public void onStartInput(EditorInfo editorInfo, boolean z3) {
        o.e(editorInfo, "editorInfo");
        super.onStartInput(editorInfo, z3);
        this.f8974S = editorInfo.packageName;
        Log log = Log.f10572a;
        Log.d(log, "BaseInputMethodService", "onStartInput() :: " + editorInfo + " | " + z3, (Throwable) null, 4, (Object) null);
        this.f8957B.b(editorInfo, getCurrentInputConnection());
        i(editorInfo, getCurrentInputConnection());
    }

    public void onStartInputView(EditorInfo editorInfo, boolean z3) {
        super.onStartInputView(editorInfo, z3);
        Log.i(Log.f10572a, "BaseInputMethodService", "onStartInputView() :: SDK version 2.4.40", (Throwable) null, 4, (Object) null);
        this.f8999i0 = editorInfo;
        this.f8981Z.b(editorInfo);
        this.f8958C.a(editorInfo);
        this.f9009q.j();
        this.f9011s.z(editorInfo, z3);
        this.f8958C.b(false);
        this.f9001j0 = UUID.randomUUID().toString();
        C0();
        ch.icoaching.wrio.ai_assistant.ui.a y3 = this.f8996h.y();
        if (!o.a(y3, ch.icoaching.wrio.ai_assistant.ui.a.f9202d.a())) {
            if (y3.e()) {
                this.f9013u.w(y3);
            } else {
                this.f9013u.a();
            }
        }
        Double[] e4 = BaseInputMethodServiceKt.e(this.f8960E, this.f8996h);
        this.f9011s.v(e4[0].doubleValue(), e4[1].doubleValue());
        c0();
        this.f9013u.c(this.f8958C.c());
        this.f9010r.c(this.f9013u.l());
        kotlinx.coroutines.flow.e.j(kotlinx.coroutines.flow.e.i(kotlinx.coroutines.flow.e.k(this.f9011s.n(), new BaseInputMethodService$onStartInputView$1(this, (kotlin.coroutines.c<? super BaseInputMethodService$onStartInputView$1>) null)), this.f8986c), this.f8984b);
    }

    public void onUpdateSelection(int i4, int i5, int i6, int i7, int i8, int i9) {
        super.onUpdateSelection(i4, i5, i6, i7, i8, i9);
        Log log = Log.f10572a;
        StringBuilder sb = new StringBuilder();
        sb.append("onUpdateSelection() :: ");
        sb.append(i4);
        sb.append(" | ");
        sb.append(i5);
        sb.append(" | ");
        sb.append(i6);
        sb.append(" | ");
        sb.append(i7);
        sb.append(" | ");
        sb.append(i8);
        sb.append(" | ");
        int i10 = i9;
        sb.append(i10);
        Log.i(log, "BaseInputMethodService", sb.toString(), (Throwable) null, 4, (Object) null);
        int i11 = i4;
        int i12 = i5;
        int i13 = i6;
        int i14 = i7;
        int i15 = i8;
        this.f9011s.r(i11, i12, i13, i14, i15, i10);
        this.f9009q.r(i11, i12, i13, i14, i15, i10);
    }

    public void onViewClicked(boolean z3) {
        this.f8957B.d();
    }

    public void onWindowHidden() {
        super.onWindowHidden();
        Log.d(Log.f10572a, "BaseInputMethodService", "onWindowHidden()", (Throwable) null, 4, (Object) null);
        this.f8995g0 = false;
        this.f9010r.a();
        this.f9011s.w();
        WeakReference weakReference = this.f8966K;
        if (weakReference != null) {
            F.a(weakReference.get());
        }
    }

    public void onWindowShown() {
        super.onWindowShown();
        if (this.f8995g0) {
            Log.d(Log.f10572a, "BaseInputMethodService", "onWindowShown() already called", (Throwable) null, 4, (Object) null);
            return;
        }
        boolean z3 = true;
        this.f8995g0 = true;
        Log.d(Log.f10572a, "BaseInputMethodService", "onWindowShown()", (Throwable) null, 4, (Object) null);
        WeakReference weakReference = this.f8966K;
        if (weakReference != null) {
            F.a(weakReference.get());
        }
        this.f9011s.e();
        m3.a aVar = this.f9010r;
        Context context = getLayoutInflater().getContext();
        o.d(context, "getContext(...)");
        aVar.f(context);
        this.f9016x.c();
        ch.icoaching.wrio.personalization.dynamic.a aVar2 = this.f9016x;
        if (this.f8993f0 != 2) {
            z3 = false;
        }
        aVar2.f(z3);
        this.f9016x.b();
    }

    public final ch.icoaching.wrio.data.b p0() {
        return this.f8996h;
    }

    public final ch.icoaching.wrio.language.d q0() {
        return this.f8962G;
    }

    public final ch.icoaching.wrio.data.c r0() {
        return this.f8994g;
    }

    public final CoroutineDispatcher s0() {
        return this.f8986c;
    }

    public final ch.icoaching.wrio.data.i t0() {
        return this.f9002k;
    }

    public final D u0() {
        return this.f8984b;
    }

    public final C0658a v0() {
        return this.f8958C;
    }

    public final N w0() {
        return this.f9013u;
    }

    public final ch.icoaching.wrio.subscription.a x0() {
        return this.f8963H;
    }

    public final String y0() {
        return this.f9008p.a();
    }

    public final ch.icoaching.wrio.subscription.i z0() {
        ch.icoaching.wrio.subscription.i iVar = this.f8965J;
        if (iVar != null) {
            return iVar;
        }
        o.p("unlockProFeaturesHandler");
        return null;
    }
}
