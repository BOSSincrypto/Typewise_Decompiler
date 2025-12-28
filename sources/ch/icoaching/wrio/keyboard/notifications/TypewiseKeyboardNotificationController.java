package ch.icoaching.wrio.keyboard.notifications;

import a.f;
import android.content.Context;
import ch.icoaching.wrio.BaseInputMethodService;
import ch.icoaching.wrio.data.i;
import ch.icoaching.wrio.keyboard.B;
import ch.icoaching.wrio.keyboard.notifications.a;
import ch.icoaching.wrio.logging.Log;
import ch.icoaching.wrio.tutorialmode.TutorialModeManager;
import i2.C0680a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import m3.a;
import n3.c;
import o2.C0840a;
import o3.d;

public final class TypewiseKeyboardNotificationController implements a {

    /* renamed from: a  reason: collision with root package name */
    private final B f10098a;

    /* renamed from: b  reason: collision with root package name */
    private final TutorialModeManager f10099b;

    /* renamed from: c  reason: collision with root package name */
    private final f f10100c;

    /* renamed from: d  reason: collision with root package name */
    private BaseInputMethodService f10101d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f10102e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f10103f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lch/icoaching/wrio/keyboard/notifications/TypewiseKeyboardNotificationController$NotificationType;", "", "<init>", "(Ljava/lang/String;I)V", "RATING", "OPTIMIZE", "AUTOCORRECT_DATABASE_BUILDING", "VALIDATE_PURCHASE", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum NotificationType {
        RATING,
        OPTIMIZE,
        AUTOCORRECT_DATABASE_BUILDING,
        VALIDATE_PURCHASE;

        static {
            NotificationType[] a4;
            f10105b = kotlin.enums.a.a(a4);
        }

        public static C0840a getEntries() {
            return f10105b;
        }
    }

    public TypewiseKeyboardNotificationController(B b4, TutorialModeManager tutorialModeManager, f fVar, ch.icoaching.wrio.subscription.a aVar, i iVar, C0680a aVar2) {
        o.e(b4, "keyboardController");
        o.e(tutorialModeManager, "tutorialModeManager");
        o.e(fVar, "onBoardingController");
        o.e(aVar, "subscriptionChecker");
        o.e(iVar, "otherSettings");
        o.e(aVar2, "defaultSharedPreferences");
        this.f10098a = b4;
        this.f10099b = tutorialModeManager;
        this.f10100c = fVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f10102e = linkedHashMap;
        linkedHashMap.put(NotificationType.AUTOCORRECT_DATABASE_BUILDING, new c(aVar2));
        linkedHashMap.put(NotificationType.RATING, new d(iVar, aVar2));
        linkedHashMap.put(NotificationType.VALIDATE_PURCHASE, new p3.c(aVar));
    }

    private final void i(Context context) {
        this.f10100c.p(context);
    }

    public void a() {
        this.f10100c.u();
        for (a a4 : this.f10102e.values()) {
            a4.a();
        }
    }

    public void b() {
        this.f10100c.k();
    }

    public void c() {
        this.f10100c.o();
    }

    public void d(BaseInputMethodService baseInputMethodService) {
        this.f10100c.n(baseInputMethodService);
        this.f10101d = baseInputMethodService;
    }

    public void e(Context context, String str, String str2) {
        o.e(context, "context");
        o.e(str, "originalWord");
        o.e(str2, "correction");
        Log log = Log.f10572a;
        Log.d(log, "TypewiseKeyboardNotificationManager", "originalWord: " + str + ", correction: " + str2, (Throwable) null, 4, (Object) null);
        if (this.f10103f) {
            this.f10100c.m(context);
        }
    }

    public void f(Context context) {
        o.e(context, "context");
        if (!this.f10103f || this.f10099b.j()) {
            return;
        }
        if (!this.f10100c.s()) {
            i(context);
            return;
        }
        for (a aVar : this.f10102e.values()) {
            if (aVar.b()) {
                aVar.c(context, this.f10098a);
                return;
            }
        }
    }

    public final void g(f.a aVar) {
        this.f10100c.l(aVar);
    }

    public final void h(a.C0154a aVar) {
        o.e(aVar, "launchOptimizationCallback");
        a aVar2 = (a) this.f10102e.get(NotificationType.OPTIMIZE);
        if (aVar2 != null) {
            aVar2.d(aVar);
        }
    }

    public final void j(a.C0154a aVar) {
        o.e(aVar, "validatePurchaseCallback");
        a aVar2 = (a) this.f10102e.get(NotificationType.VALIDATE_PURCHASE);
        if (aVar2 != null) {
            aVar2.d(aVar);
        }
    }

    public final void k(a.C0154a aVar) {
        o.e(aVar, "ratingCallback");
        a aVar2 = (a) this.f10102e.get(NotificationType.RATING);
        if (aVar2 != null) {
            aVar2.d(aVar);
        }
    }

    public void c(boolean z3) {
        this.f10103f = z3;
    }
}
