package ch.icoaching.wrio.subscription;

import android.content.Context;
import ch.icoaching.wrio.BaseInputMethodService;
import ch.icoaching.wrio.keyboard.B;
import ch.icoaching.wrio.logging.Log;
import kotlin.jvm.internal.o;
import l2.q;

public final class e implements i {

    /* renamed from: a  reason: collision with root package name */
    private BaseInputMethodService f10650a;

    /* renamed from: b  reason: collision with root package name */
    private B f10651b;

    /* renamed from: c  reason: collision with root package name */
    private a f10652c;

    public interface a {
        void a();
    }

    /* access modifiers changed from: private */
    public static final q c(e eVar, h hVar) {
        BaseInputMethodService baseInputMethodService = eVar.f10650a;
        B b4 = null;
        if (baseInputMethodService == null) {
            o.p("inputMethodService");
            baseInputMethodService = null;
        }
        baseInputMethodService.a0();
        B b5 = eVar.f10651b;
        if (b5 == null) {
            o.p("keyboardController");
        } else {
            b4 = b5;
        }
        b4.B(hVar);
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q h(e eVar, h hVar) {
        a aVar = eVar.f10652c;
        B b4 = null;
        if (aVar == null) {
            o.p("onClickListener");
            aVar = null;
        }
        aVar.a();
        BaseInputMethodService baseInputMethodService = eVar.f10650a;
        if (baseInputMethodService == null) {
            o.p("inputMethodService");
            baseInputMethodService = null;
        }
        baseInputMethodService.a0();
        B b5 = eVar.f10651b;
        if (b5 == null) {
            o.p("keyboardController");
        } else {
            b4 = b5;
        }
        b4.B(hVar);
        return q.f14567a;
    }

    public final void d(BaseInputMethodService baseInputMethodService) {
        o.e(baseInputMethodService, "inputMethodService");
        this.f10650a = baseInputMethodService;
    }

    public final void e(B b4) {
        o.e(b4, "keyboardController");
        this.f10651b = b4;
    }

    public void f(Context context) {
        o.e(context, "context");
        Log.d(Log.f10572a, "TypewiseUnlockProFeaturesHandler", "showUnlockProFeatureScreen() :: Start", (Throwable) null, 4, (Object) null);
        h hVar = new h(context);
        hVar.setOnExitClicked(new c(this, hVar));
        hVar.setOnUnlockClick(new d(this, hVar));
        B b4 = this.f10651b;
        BaseInputMethodService baseInputMethodService = null;
        if (b4 == null) {
            o.p("keyboardController");
            b4 = null;
        }
        b4.s(hVar);
        BaseInputMethodService baseInputMethodService2 = this.f10650a;
        if (baseInputMethodService2 == null) {
            o.p("inputMethodService");
        } else {
            baseInputMethodService = baseInputMethodService2;
        }
        baseInputMethodService.Y();
    }

    public final void g(a aVar) {
        o.e(aVar, "onClickListener");
        this.f10652c = aVar;
    }
}
