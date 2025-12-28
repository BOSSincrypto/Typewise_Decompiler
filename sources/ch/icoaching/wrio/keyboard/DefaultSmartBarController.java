package ch.icoaching.wrio.keyboard;

import Q0.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InlineSuggestion;
import android.view.inputmethod.InlineSuggestionsRequest;
import android.widget.LinearLayout;
import android.widget.inline.InlineContentView;
import android.widget.inline.InlinePresentationSpec;
import ch.icoaching.wrio.C0553q;
import ch.icoaching.wrio.C0561z;
import ch.icoaching.wrio.ai_assistant.ui.PromptItemType;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import ch.icoaching.wrio.keyboard.view.smartbar.SmartBarView;
import ch.icoaching.wrio.keyboard.view.smartbar.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D;
import kotlinx.coroutines.g0;
import p0.C0850c;
import u.C0901a;
import u2.C0906a;
import v.C0918b;
import v.C0919c;
import v.d;
import w.C0927a;

public final class DefaultSmartBarController implements N {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9936a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final CoroutineDispatcher f9937b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final CoroutineDispatcher f9938c;

    /* renamed from: d  reason: collision with root package name */
    private final D f9939d;

    /* renamed from: e  reason: collision with root package name */
    private final a f9940e = new a(this);

    /* renamed from: f  reason: collision with root package name */
    private ThemeModel.SmartBarTheme f9941f;

    /* renamed from: g  reason: collision with root package name */
    private int f9942g = Integer.MIN_VALUE;

    /* renamed from: h  reason: collision with root package name */
    private int f9943h = Integer.MIN_VALUE;

    /* renamed from: i  reason: collision with root package name */
    private List f9944i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public SmartBarView f9945j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f9946k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f9947l = true;

    /* renamed from: m  reason: collision with root package name */
    private z f9948m;

    public static final class a implements z {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DefaultSmartBarController f9949a;

        a(DefaultSmartBarController defaultSmartBarController) {
            this.f9949a = defaultSmartBarController;
        }

        public void a(g gVar) {
            o.e(gVar, "smartBarItem");
            z E3 = this.f9949a.E();
            if (E3 != null) {
                E3.a(gVar);
            }
        }

        public void b(g gVar) {
            o.e(gVar, "smartBarItem");
            z E3 = this.f9949a.E();
            if (E3 != null) {
                E3.b(gVar);
            }
        }

        public void c(g gVar) {
            o.e(gVar, "smartBarItem");
            z E3 = this.f9949a.E();
            if (E3 != null) {
                E3.c(gVar);
            }
        }

        public void d(g gVar) {
            o.e(gVar, "smartBarItem");
            z E3 = this.f9949a.E();
            if (E3 != null) {
                E3.d(gVar);
            }
        }

        public void e(g gVar) {
            o.e(gVar, "smartBarItem");
            z E3 = this.f9949a.E();
            if (E3 != null) {
                E3.e(gVar);
            }
        }
    }

    public DefaultSmartBarController(Context context, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, D d4) {
        o.e(context, "context");
        o.e(coroutineDispatcher, "mainDispatcher");
        o.e(coroutineDispatcher2, "ioDispatcher");
        o.e(d4, "serviceScope");
        this.f9936a = context;
        this.f9937b = coroutineDispatcher;
        this.f9938c = coroutineDispatcher2;
        this.f9939d = d4;
    }

    /* access modifiers changed from: private */
    public static final void A(DefaultSmartBarController defaultSmartBarController, Runnable runnable) {
        g0 unused = C0739h.d(defaultSmartBarController.f9939d, (CoroutineContext) null, (CoroutineStart) null, new DefaultSmartBarController$inflateAndShowInlineSuggestions$1$1(defaultSmartBarController, runnable, (c<? super DefaultSmartBarController$inflateAndShowInlineSuggestions$1$1>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void B(List list, InlineSuggestion inlineSuggestion, int i4, DefaultSmartBarController defaultSmartBarController, InlineContentView inlineContentView) {
        if (inlineContentView != null) {
            list.add(new f(inlineContentView, inlineSuggestion.getInfo().isPinned()));
        } else {
            list.add((Object) null);
        }
        if (list.size() >= i4) {
            g0 unused = C0739h.d(defaultSmartBarController.f9939d, (CoroutineContext) null, (CoroutineStart) null, new DefaultSmartBarController$inflateAndShowInlineSuggestions$2$1(defaultSmartBarController, list, (c<? super DefaultSmartBarController$inflateAndShowInlineSuggestions$2$1>) null), 3, (Object) null);
        }
    }

    public z E() {
        return this.f9948m;
    }

    public void a() {
        SmartBarView smartBarView = this.f9945j;
        if (smartBarView != null) {
            smartBarView.Q();
        }
    }

    public void b() {
        SmartBarView smartBarView = this.f9945j;
        if (smartBarView != null) {
            smartBarView.R();
        }
    }

    public void c() {
        SmartBarView smartBarView = this.f9945j;
        if (smartBarView != null) {
            smartBarView.d0();
        }
    }

    public void d(C0906a aVar) {
        o.e(aVar, "onLogoClick");
        SmartBarView smartBarView = this.f9945j;
        if (smartBarView != null) {
            smartBarView.setOnLogoClickListener(aVar);
        }
    }

    public InlineSuggestionsRequest e() {
        Icon createWithResource = Icon.createWithResource(this.f9936a, C0561z.chip_background);
        ThemeModel.SmartBarTheme smartBarTheme = this.f9941f;
        ThemeModel.SmartBarTheme smartBarTheme2 = null;
        if (smartBarTheme == null) {
            o.p("smartBarTheme");
            smartBarTheme = null;
        }
        createWithResource.setTint(smartBarTheme.getPasswordManagerColor());
        o.d(createWithResource, "apply(...)");
        C0927a.C0247a.C0248a b4 = C0927a.a().e(((d.b) ((d.b) new d.b().b(createWithResource)).d(0, 0, 0, 0)).e()).b(((d.b) ((d.b) new d.b().b(createWithResource)).d(C0553q.a(13), 0, C0553q.a(13), 0)).e());
        C0919c.a aVar = (C0919c.a) new C0919c.a().c(C0553q.a(4), 0, C0553q.a(4), 0);
        ThemeModel.SmartBarTheme smartBarTheme3 = this.f9941f;
        if (smartBarTheme3 == null) {
            o.p("smartBarTheme");
            smartBarTheme3 = null;
        }
        C0927a.C0247a.C0248a h4 = b4.h(aVar.g(smartBarTheme3.getPasswordManagerFontColor()).h(16.0f).e());
        C0919c.a aVar2 = (C0919c.a) new C0919c.a().c(0, 0, C0553q.a(4), 0);
        ThemeModel.SmartBarTheme smartBarTheme4 = this.f9941f;
        if (smartBarTheme4 == null) {
            o.p("smartBarTheme");
            smartBarTheme4 = null;
        }
        C0927a.C0247a.C0248a g4 = h4.g(aVar2.g(smartBarTheme4.getPasswordManagerFontColor()).h(12.0f).e());
        C0918b.a aVar3 = new C0918b.a();
        ThemeModel.SmartBarTheme smartBarTheme5 = this.f9941f;
        if (smartBarTheme5 == null) {
            o.p("smartBarTheme");
            smartBarTheme5 = null;
        }
        C0927a.C0247a.C0248a f4 = g4.d(((C0918b.a) aVar3.i(ColorStateList.valueOf(smartBarTheme5.getPasswordManagerFontColor())).c(0, 0, 0, 0)).e()).f(((C0918b.a) new C0918b.a().h(0).g(0).c(0, 0, 0, 0)).e());
        C0918b.a aVar4 = new C0918b.a();
        ThemeModel.SmartBarTheme smartBarTheme6 = this.f9941f;
        if (smartBarTheme6 == null) {
            o.p("smartBarTheme");
        } else {
            smartBarTheme2 = smartBarTheme6;
        }
        C0927a.C0247a a4 = f4.c(((C0918b.a) aVar4.i(ColorStateList.valueOf(smartBarTheme2.getPasswordManagerFontColor())).c(0, 0, 0, 0)).e()).a();
        o.d(a4, "build(...)");
        Bundle b5 = C0901a.b().a(a4).b();
        o.d(b5, "build(...)");
        C0521j.a();
        InlinePresentationSpec a5 = C0517f.a(new Size(C0553q.a(48), C0553q.a(42)), new Size(C0553q.a(1000), C0553q.a(42))).setStyle(b5).build();
        o.d(a5, "build(...)");
        C0522k.a();
        InlineSuggestionsRequest a6 = C0520i.a(C0718m.e(a5)).setMaxSuggestionCount(6).build();
        o.d(a6, "build(...)");
        return a6;
    }

    public void f() {
        SmartBarView smartBarView = this.f9945j;
        if (smartBarView != null) {
            smartBarView.I();
        }
    }

    public void g(List list) {
        o.e(list, "inlineSuggestions");
        if (list.isEmpty()) {
            SmartBarView smartBarView = this.f9945j;
            if (smartBarView != null) {
                smartBarView.K();
            }
            SmartBarView smartBarView2 = this.f9945j;
            if (smartBarView2 != null) {
                smartBarView2.setIsAutofillViewVisible(false);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (Object a4 : list) {
            InlineSuggestion a5 = C0523l.a(a4);
            a5.inflate(this.f9936a, new Size(-2, -2), new r(this), new s(arrayList, a5, size, this));
        }
    }

    public void h(C0906a aVar) {
        o.e(aVar, "onAiAssistantLastPromptClick");
        SmartBarView smartBarView = this.f9945j;
        if (smartBarView != null) {
            smartBarView.setOnAiAssistantLastPromptClick(aVar);
        }
    }

    public void i(View view) {
        o.e(view, "view");
        SmartBarView smartBarView = this.f9945j;
        if (smartBarView != null) {
            smartBarView.c0(view);
        }
    }

    public void j() {
        SmartBarView smartBarView = this.f9945j;
        if (smartBarView != null) {
            smartBarView.P();
        }
    }

    public void n() {
        SmartBarView smartBarView = this.f9945j;
        if (smartBarView != null) {
            smartBarView.N();
        }
    }

    public void o() {
        SmartBarView smartBarView = this.f9945j;
        if (smartBarView != null) {
            smartBarView.J();
        }
    }

    public void p(View view) {
        o.e(view, "view");
        SmartBarView smartBarView = this.f9945j;
        if (smartBarView != null) {
            smartBarView.setSmartBarLogoView(view);
        }
    }

    public void q() {
        SmartBarView smartBarView = this.f9945j;
        if (smartBarView != null) {
            smartBarView.L();
        }
    }

    public void r(z zVar) {
        this.f9948m = zVar;
    }

    public void s(List list) {
        o.e(list, "list");
        if (!o.a(list, this.f9944i)) {
            this.f9944i = list;
            SmartBarView smartBarView = this.f9945j;
            if (smartBarView != null) {
                smartBarView.setSmartBarContent(list);
            }
        }
    }

    public void t(int i4, int i5) {
        this.f9942g = i4;
        this.f9943h = i5;
        SmartBarView smartBarView = this.f9945j;
        if (smartBarView != null) {
            smartBarView.a0(i4, i5);
        }
    }

    public void u(ThemeModel.SmartBarTheme smartBarTheme) {
        int i4;
        SmartBarView smartBarView;
        o.e(smartBarTheme, "theme");
        this.f9941f = smartBarTheme;
        SmartBarView smartBarView2 = this.f9945j;
        if (smartBarView2 != null) {
            smartBarView2.setTheme(smartBarTheme);
        }
        int i5 = this.f9942g;
        if (i5 != Integer.MIN_VALUE && (i4 = this.f9943h) != Integer.MIN_VALUE && (smartBarView = this.f9945j) != null) {
            smartBarView.a0(i5, i4);
        }
    }

    public void v(C0906a aVar) {
        o.e(aVar, "onAiAssistantCloseIconClick");
        SmartBarView smartBarView = this.f9945j;
        if (smartBarView != null) {
            smartBarView.setOnAiAssistantCloseIconClick(aVar);
        }
    }

    public void w(ch.icoaching.wrio.ai_assistant.ui.a aVar) {
        boolean z3;
        o.e(aVar, "lastAiAssistantPrompt");
        SmartBarView smartBarView = this.f9945j;
        if (smartBarView != null) {
            int a4 = C0850c.a(aVar, this.f9936a);
            if (aVar.c() != PromptItemType.TRANSLATE) {
                z3 = true;
            } else {
                z3 = false;
            }
            smartBarView.V(a4, z3);
        }
    }

    public View x(LayoutInflater layoutInflater, Integer num) {
        int i4;
        o.e(layoutInflater, "layoutInflater");
        if (this.f9945j == null) {
            Context context = layoutInflater.getContext();
            o.d(context, "getContext(...)");
            SmartBarView smartBarView = new SmartBarView(context);
            smartBarView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            ThemeModel.SmartBarTheme smartBarTheme = this.f9941f;
            if (smartBarTheme == null) {
                o.p("smartBarTheme");
                smartBarTheme = null;
            }
            smartBarView.setTheme(smartBarTheme);
            int i5 = this.f9942g;
            if (!(i5 == Integer.MIN_VALUE || (i4 = this.f9943h) == Integer.MIN_VALUE)) {
                smartBarView.a0(i5, i4);
            }
            smartBarView.setSmartBarEventListener(this.f9940e);
            smartBarView.setIntroImageResource(num);
            if (this.f9947l) {
                smartBarView.e0();
            } else {
                smartBarView.S();
            }
            this.f9945j = smartBarView;
        }
        SmartBarView smartBarView2 = this.f9945j;
        o.b(smartBarView2);
        return smartBarView2;
    }

    public void y(C0906a aVar) {
        o.e(aVar, "onAiAssistantIconClick");
        SmartBarView smartBarView = this.f9945j;
        if (smartBarView != null) {
            smartBarView.setOnAiAssistantIconClick(aVar);
        }
    }

    public void z() {
        SmartBarView smartBarView = this.f9945j;
        if (smartBarView != null) {
            smartBarView.f0();
        }
    }

    public void c(boolean z3) {
        if (!this.f9946k) {
            this.f9947l = z3;
            if (z3) {
                SmartBarView smartBarView = this.f9945j;
                if (smartBarView != null) {
                    smartBarView.e0();
                    return;
                }
                return;
            }
            SmartBarView smartBarView2 = this.f9945j;
            if (smartBarView2 != null) {
                smartBarView2.S();
            }
        }
    }

    public void f(boolean z3) {
        SmartBarView smartBarView = this.f9945j;
        if (smartBarView != null) {
            smartBarView.setAiAssistantViewVisibility(z3);
        }
    }

    public void k() {
        SmartBarView smartBarView = this.f9945j;
        if (smartBarView != null) {
            smartBarView.U();
        }
    }

    public boolean l() {
        return this.f9947l;
    }

    public void m() {
        SmartBarView smartBarView = this.f9945j;
        if (smartBarView != null) {
            smartBarView.O();
        }
    }
}
