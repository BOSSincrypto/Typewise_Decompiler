package ch.icoaching.wrio.ai_assistant;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import ch.icoaching.wrio.C;
import ch.icoaching.wrio.ai_assistant.network.ChatApiRepository;
import ch.icoaching.wrio.ai_assistant.network.d;
import ch.icoaching.wrio.ai_assistant.text_transformation.TonalityTextTransformation;
import ch.icoaching.wrio.ai_assistant.ui.PromptItemType;
import ch.icoaching.wrio.input.c;
import ch.icoaching.wrio.keyboard.B;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import ch.icoaching.wrio.logging.Log;
import i.C0676a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C0718m;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.C0738g;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D;
import kotlinx.coroutines.g0;
import l2.q;
import n2.C0830a;
import p0.C0850c;
import p0.e;
import q0.i;
import q0.k;
import q0.m;
import u2.p;

public final class DefaultAiAssistantController implements h {

    /* renamed from: A  reason: collision with root package name */
    private final String f9110A;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final ChatApiRepository f9111a;

    /* renamed from: b  reason: collision with root package name */
    private final m f9112b;

    /* renamed from: c  reason: collision with root package name */
    private final k f9113c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final c f9114d;

    /* renamed from: e  reason: collision with root package name */
    private final B f9115e;

    /* renamed from: f  reason: collision with root package name */
    private final ch.icoaching.wrio.data.b f9116f;

    /* renamed from: g  reason: collision with root package name */
    private final I0.b f9117g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final CoroutineDispatcher f9118h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final CoroutineDispatcher f9119i;

    /* renamed from: j  reason: collision with root package name */
    private final D f9120j;

    /* renamed from: k  reason: collision with root package name */
    private i f9121k;

    /* renamed from: l  reason: collision with root package name */
    private View f9122l;

    /* renamed from: m  reason: collision with root package name */
    private PromptItemType f9123m;

    /* renamed from: n  reason: collision with root package name */
    private final Map f9124n = new LinkedHashMap();

    /* renamed from: o  reason: collision with root package name */
    private final List f9125o = C0718m.m(PromptItemType.PROOFREAD, PromptItemType.TRANSLATE, PromptItemType.EXTEND, PromptItemType.SHORTEN, PromptItemType.TONALITY, PromptItemType.INCLUSIVE_LANGUAGE);
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public e f9126p;

    /* renamed from: q  reason: collision with root package name */
    private ThemeModel.AIAssistantTheme f9127q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public String f9128r = "";
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public g0 f9129s;

    /* renamed from: t  reason: collision with root package name */
    private final String f9130t;

    /* renamed from: u  reason: collision with root package name */
    private final String f9131u;

    /* renamed from: v  reason: collision with root package name */
    private final String f9132v;

    /* renamed from: w  reason: collision with root package name */
    private final String f9133w;

    /* renamed from: x  reason: collision with root package name */
    private final String f9134x;

    /* renamed from: y  reason: collision with root package name */
    private final String f9135y;

    /* renamed from: z  reason: collision with root package name */
    private final String f9136z;

    @d(c = "ch.icoaching.wrio.ai_assistant.DefaultAiAssistantController$1", f = "DefaultAiAssistantController.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isAIAssistantEnabled", "Ll2/q;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.ai_assistant.DefaultAiAssistantController$1  reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ DefaultAiAssistantController this$0;

        {
            this.this$0 = r1;
        }

        public final kotlin.coroutines.c<q> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(this.this$0, cVar);
            r02.Z$0 = ((Boolean) obj).booleanValue();
            return r02;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (kotlin.coroutines.c<? super q>) (kotlin.coroutines.c) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.f();
            if (this.label == 0) {
                f.b(obj);
                if (this.Z$0) {
                    Log.d(Log.f10572a, "DefaultAiAssistantController", "observeIsAIAssistantEnabled() :: AI Assistant enabled", (Throwable) null, 4, (Object) null);
                    this.this$0.f9111a.f(f.f9144a.f());
                    return q.f14567a;
                }
                Log.d(Log.f10572a, "DefaultAiAssistantController", "observeIsAIAssistantEnabled() :: AI Assistant disabled", (Throwable) null, 4, (Object) null);
                this.this$0.f9111a.e();
                return q.f14567a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(boolean z3, kotlin.coroutines.c<? super q> cVar) {
            return ((AnonymousClass1) create(Boolean.valueOf(z3), cVar)).invokeSuspend(q.f14567a);
        }
    }

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9137a;

        static {
            /*
                ch.icoaching.wrio.ai_assistant.ui.PromptItemType[] r0 = ch.icoaching.wrio.ai_assistant.ui.PromptItemType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ch.icoaching.wrio.ai_assistant.ui.PromptItemType r1 = ch.icoaching.wrio.ai_assistant.ui.PromptItemType.PROOFREAD     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ch.icoaching.wrio.ai_assistant.ui.PromptItemType r1 = ch.icoaching.wrio.ai_assistant.ui.PromptItemType.TRANSLATE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ch.icoaching.wrio.ai_assistant.ui.PromptItemType r1 = ch.icoaching.wrio.ai_assistant.ui.PromptItemType.EXTEND     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                ch.icoaching.wrio.ai_assistant.ui.PromptItemType r1 = ch.icoaching.wrio.ai_assistant.ui.PromptItemType.SHORTEN     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                ch.icoaching.wrio.ai_assistant.ui.PromptItemType r1 = ch.icoaching.wrio.ai_assistant.ui.PromptItemType.TONALITY     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                ch.icoaching.wrio.ai_assistant.ui.PromptItemType r1 = ch.icoaching.wrio.ai_assistant.ui.PromptItemType.INCLUSIVE_LANGUAGE     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f9137a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.ai_assistant.DefaultAiAssistantController.a.<clinit>():void");
        }
    }

    public static final class b implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C0830a.a((Integer) ((Map.Entry) obj2).getValue(), (Integer) ((Map.Entry) obj).getValue());
        }
    }

    public DefaultAiAssistantController(ChatApiRepository chatApiRepository, m mVar, k kVar, c cVar, B b4, ch.icoaching.wrio.data.b bVar, I0.b bVar2, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, D d4, Context context) {
        o.e(chatApiRepository, "chatApiRepository");
        o.e(mVar, "translatePromptController");
        o.e(kVar, "tonalityPromptController");
        o.e(cVar, "inputConnectionController");
        o.e(b4, "keyboardController");
        o.e(bVar, "keyboardSettings");
        o.e(bVar2, "appnomixSharedPreferences");
        o.e(coroutineDispatcher, "ioDispatcher");
        o.e(coroutineDispatcher2, "mainDispatcher");
        o.e(d4, "serviceScope");
        o.e(context, "context");
        this.f9111a = chatApiRepository;
        this.f9112b = mVar;
        this.f9113c = kVar;
        this.f9114d = cVar;
        this.f9115e = b4;
        this.f9116f = bVar;
        this.f9117g = bVar2;
        this.f9118h = coroutineDispatcher;
        this.f9119i = coroutineDispatcher2;
        this.f9120j = d4;
        String string = context.getString(C.error_missing_api_key);
        o.d(string, "getString(...)");
        this.f9130t = string;
        String string2 = context.getString(C.error_invalid_api_key);
        o.d(string2, "getString(...)");
        this.f9131u = string2;
        String string3 = context.getString(C.error_quota_exceeded);
        o.d(string3, "getString(...)");
        this.f9132v = string3;
        String string4 = context.getString(C.error_quota_exceeded_appnomix);
        o.d(string4, "getString(...)");
        this.f9133w = string4;
        String string5 = context.getString(C.error_server_overloaded);
        o.d(string5, "getString(...)");
        this.f9134x = string5;
        String string6 = context.getString(C.error_server_processing);
        o.d(string6, "getString(...)");
        this.f9135y = string6;
        String string7 = context.getString(C.error_input_too_long);
        o.d(string7, "getString(...)");
        this.f9136z = string7;
        String string8 = context.getString(C.error_generating_response);
        o.d(string8, "getString(...)");
        this.f9110A = string8;
        kotlinx.coroutines.flow.e.j(kotlinx.coroutines.flow.e.k(bVar.G(), new AnonymousClass1(this, (kotlin.coroutines.c<? super AnonymousClass1>) null)), d4);
        if (bVar.z()) {
            chatApiRepository.f(f.f9144a.f());
        } else {
            chatApiRepository.e();
        }
    }

    /* access modifiers changed from: private */
    public static final q A(DefaultAiAssistantController defaultAiAssistantController, PromptItemType promptItemType, String str) {
        o.e(str, "it");
        defaultAiAssistantController.x(new TonalityTextTransformation(defaultAiAssistantController.f9128r, ch.icoaching.wrio.ai_assistant.text_transformation.a.b(str)));
        defaultAiAssistantController.G();
        e eVar = defaultAiAssistantController.f9126p;
        if (eVar != null) {
            eVar.I();
        }
        defaultAiAssistantController.w(promptItemType, str);
        return q.f14567a;
    }

    private final void G() {
        View view = this.f9122l;
        if (view != null) {
            this.f9115e.B(view);
            this.f9122l = null;
        }
    }

    private final void H() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map i4 = this.f9116f.i();
        for (Map.Entry entry : this.f9124n.entrySet()) {
            PromptItemType promptItemType = (PromptItemType) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            if (i4.containsKey(promptItemType)) {
                Object obj = i4.get(promptItemType);
                o.b(obj);
                linkedHashMap.put(promptItemType, Integer.valueOf(((Number) obj).intValue() + intValue));
            } else {
                linkedHashMap.put(promptItemType, Integer.valueOf(intValue));
            }
        }
        for (Map.Entry entry2 : i4.entrySet()) {
            PromptItemType promptItemType2 = (PromptItemType) entry2.getKey();
            int intValue2 = ((Number) entry2.getValue()).intValue();
            if (!linkedHashMap.containsKey(promptItemType2)) {
                linkedHashMap.put(promptItemType2, Integer.valueOf(intValue2));
            }
        }
        this.f9116f.w(linkedHashMap);
    }

    /* access modifiers changed from: private */
    public final Object m(i.e eVar, kotlin.coroutines.c cVar) {
        return C0738g.e(this.f9118h, new DefaultAiAssistantController$transformMessage$2(this, eVar, (kotlin.coroutines.c<? super DefaultAiAssistantController$transformMessage$2>) null), cVar);
    }

    /* access modifiers changed from: private */
    public final String o(ch.icoaching.wrio.ai_assistant.network.d dVar) {
        if (o.a(dVar, d.b.f9178a)) {
            return this.f9134x;
        }
        if (o.a(dVar, d.c.f9179a)) {
            return this.f9131u;
        }
        if (o.a(dVar, d.f.f9182a)) {
            return this.f9130t;
        }
        if (o.a(dVar, d.g.f9183a)) {
            if (this.f9117g.s()) {
                return this.f9133w;
            }
            return this.f9132v;
        } else if (o.a(dVar, d.h.f9184a)) {
            return this.f9135y;
        } else {
            if (o.a(dVar, d.C0150d.f9180a)) {
                return this.f9136z;
            }
            return this.f9110A;
        }
    }

    /* access modifiers changed from: private */
    public static final q p(DefaultAiAssistantController defaultAiAssistantController, Context context, PromptItemType promptItemType) {
        o.e(promptItemType, "promptItemType");
        if (defaultAiAssistantController.f9122l != null) {
            defaultAiAssistantController.G();
            if (defaultAiAssistantController.f9123m == promptItemType) {
                e eVar = defaultAiAssistantController.f9126p;
                if (eVar != null) {
                    eVar.I();
                }
                return q.f14567a;
            }
        }
        defaultAiAssistantController.f9128r = (String) defaultAiAssistantController.f9114d.e().first;
        defaultAiAssistantController.f9123m = promptItemType;
        defaultAiAssistantController.v(promptItemType);
        switch (a.f9137a[promptItemType.ordinal()]) {
            case 1:
                defaultAiAssistantController.x(new i.c(defaultAiAssistantController.f9128r));
                s(defaultAiAssistantController, promptItemType, (String) null, 2, (Object) null);
                break;
            case 2:
                i d4 = defaultAiAssistantController.f9112b.d(context);
                defaultAiAssistantController.f9112b.g(new c(defaultAiAssistantController, promptItemType));
                defaultAiAssistantController.f9115e.s(d4);
                defaultAiAssistantController.f9122l = d4;
                break;
            case 3:
                defaultAiAssistantController.x(new C0676a(defaultAiAssistantController.f9128r));
                s(defaultAiAssistantController, promptItemType, (String) null, 2, (Object) null);
                break;
            case 4:
                defaultAiAssistantController.x(new i.d(defaultAiAssistantController.f9128r));
                s(defaultAiAssistantController, promptItemType, (String) null, 2, (Object) null);
                break;
            case 5:
                i c4 = defaultAiAssistantController.f9113c.c(context);
                defaultAiAssistantController.f9113c.f(new b(defaultAiAssistantController, promptItemType));
                defaultAiAssistantController.f9115e.s(c4);
                defaultAiAssistantController.f9122l = c4;
                break;
            case 6:
                defaultAiAssistantController.x(new i.b(defaultAiAssistantController.f9128r));
                s(defaultAiAssistantController, promptItemType, (String) null, 2, (Object) null);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q q(DefaultAiAssistantController defaultAiAssistantController, PromptItemType promptItemType, String str) {
        o.e(str, "it");
        defaultAiAssistantController.x(new i.f(defaultAiAssistantController.f9128r, str));
        defaultAiAssistantController.G();
        e eVar = defaultAiAssistantController.f9126p;
        if (eVar != null) {
            eVar.I();
        }
        defaultAiAssistantController.w(promptItemType, defaultAiAssistantController.f9112b.b(str));
        return q.f14567a;
    }

    static /* synthetic */ void s(DefaultAiAssistantController defaultAiAssistantController, PromptItemType promptItemType, String str, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str = "";
        }
        defaultAiAssistantController.w(promptItemType, str);
    }

    private final void v(PromptItemType promptItemType) {
        int i4;
        Integer num = (Integer) this.f9124n.get(promptItemType);
        if (num != null) {
            i4 = num.intValue();
        } else {
            i4 = 0;
        }
        this.f9124n.put(promptItemType, Integer.valueOf(i4 + 1));
    }

    private final void w(PromptItemType promptItemType, String str) {
        this.f9116f.q(new ch.icoaching.wrio.ai_assistant.ui.a(System.currentTimeMillis(), promptItemType, str));
    }

    private final void x(i.e eVar) {
        g0 g0Var = this.f9129s;
        if (g0Var == null || !g0Var.a()) {
            this.f9129s = C0739h.d(this.f9120j, (CoroutineContext) null, (CoroutineStart) null, new DefaultAiAssistantController$applyTextTransformation$1(this, eVar, (kotlin.coroutines.c<? super DefaultAiAssistantController$applyTextTransformation$1>) null), 3, (Object) null);
        } else {
            Log.d(Log.f10572a, "DefaultAiAssistantController", "applyTextTransformation() :: already running", (Throwable) null, 4, (Object) null);
        }
    }

    private final List z(Context context) {
        List<Map.Entry> r02 = C0718m.r0(this.f9116f.i().entrySet(), new b());
        ArrayList arrayList = new ArrayList(C0718m.t(r02, 10));
        for (Map.Entry key : r02) {
            arrayList.add((PromptItemType) key.getKey());
        }
        List list = this.f9125o;
        ArrayList arrayList2 = new ArrayList();
        for (Object next : list) {
            if (!arrayList.contains((PromptItemType) next)) {
                arrayList2.add(next);
            }
        }
        List<PromptItemType> i02 = C0718m.i0(arrayList, arrayList2);
        ArrayList arrayList3 = new ArrayList(C0718m.t(i02, 10));
        for (PromptItemType b4 : i02) {
            arrayList3.add(C0850c.b(b4, context));
        }
        return arrayList3;
    }

    public i E() {
        return this.f9121k;
    }

    public void a() {
        this.f9128r = "";
        this.f9123m = null;
        View view = this.f9122l;
        if (view != null) {
            this.f9115e.B(view);
        }
        this.f9122l = null;
        H();
        this.f9124n.clear();
        e eVar = this.f9126p;
        if (eVar != null) {
            eVar.I();
        }
        this.f9112b.h();
    }

    public void b() {
        i E3 = E();
        if (E3 != null) {
            E3.d();
        }
        e eVar = this.f9126p;
        if (eVar != null) {
            eVar.G();
        }
        e eVar2 = this.f9126p;
        if (eVar2 != null) {
            eVar2.D();
        }
        g0 g0Var = this.f9129s;
        if (g0Var != null) {
            g0.a.a(g0Var, (CancellationException) null, 1, (Object) null);
        }
        this.f9129s = null;
    }

    public void d() {
        g0 unused = C0739h.d(this.f9120j, (CoroutineContext) null, (CoroutineStart) null, new DefaultAiAssistantController$undoTextTransformation$1(this, (kotlin.coroutines.c<? super DefaultAiAssistantController$undoTextTransformation$1>) null), 3, (Object) null);
    }

    public void e() {
        e eVar = this.f9126p;
        if (eVar != null) {
            eVar.D();
        }
        e eVar2 = this.f9126p;
        if (eVar2 != null) {
            eVar2.I();
        }
        this.f9123m = null;
        View view = this.f9122l;
        if (view != null) {
            this.f9115e.B(view);
        }
    }

    public void f(Context context) {
        o.e(context, "context");
        Log.d(Log.f10572a, "DefaultAiAssistantController", "initializeAiAssistantPromptsView() :: Start", (Throwable) null, 4, (Object) null);
        e eVar = this.f9126p;
        if (eVar != null) {
            eVar.F(z(context), new a(this, context));
        }
    }

    public e g(LayoutInflater layoutInflater) {
        o.e(layoutInflater, "layoutInflater");
        if (this.f9126p == null) {
            Context context = layoutInflater.getContext();
            o.b(context);
            e eVar = new e(context);
            ThemeModel.AIAssistantTheme aIAssistantTheme = this.f9127q;
            if (aIAssistantTheme != null) {
                eVar.setTheme(aIAssistantTheme.getAiAssistantBarTheme());
            }
            this.f9126p = eVar;
        }
        e eVar2 = this.f9126p;
        o.b(eVar2);
        return eVar2;
    }

    public void h(i iVar) {
        this.f9121k = iVar;
    }

    public void i(ThemeModel.AIAssistantTheme aIAssistantTheme) {
        o.e(aIAssistantTheme, "theme");
        this.f9127q = aIAssistantTheme;
        this.f9113c.e(aIAssistantTheme.getAiAssistantDropDownTheme());
        this.f9112b.f(aIAssistantTheme.getAiAssistantDropDownTheme());
        e eVar = this.f9126p;
        if (eVar != null) {
            eVar.setTheme(aIAssistantTheme.getAiAssistantBarTheme());
        }
    }

    public void c() {
        ch.icoaching.wrio.ai_assistant.ui.a y3 = this.f9116f.y();
        this.f9128r = (String) this.f9114d.e().first;
        this.f9123m = y3.c();
        v(y3.c());
        switch (a.f9137a[y3.c().ordinal()]) {
            case 1:
                x(new i.c(this.f9128r));
                return;
            case 2:
                this.f9112b.j(y3.d());
                x(new i.f(this.f9128r, y3.d()));
                return;
            case 3:
                x(new C0676a(this.f9128r));
                return;
            case 4:
                x(new i.d(this.f9128r));
                return;
            case 5:
                x(new TonalityTextTransformation(this.f9128r, ch.icoaching.wrio.ai_assistant.text_transformation.a.b(y3.d())));
                return;
            case 6:
                x(new i.b(this.f9128r));
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
