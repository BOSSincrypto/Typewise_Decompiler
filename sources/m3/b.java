package m3;

import a.f;
import a.g;
import ch.icoaching.wrio.X;
import ch.icoaching.wrio.keyboard.B;
import ch.icoaching.wrio.keyboard.notifications.TypewiseKeyboardNotificationController;
import ch.icoaching.wrio.subscription.a;
import ch.icoaching.wrio.tutorialmode.TutorialModeManager;
import kotlin.jvm.internal.o;
import l2.q;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f14655a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static a f14656b;

    private b() {
    }

    public final void a() {
        f14656b = null;
    }

    public final a b() {
        if (f14656b == null) {
            synchronized (this) {
                try {
                    if (f14656b == null) {
                        X x3 = X.f9083a;
                        B k4 = x3.k();
                        TutorialModeManager x4 = x3.x();
                        f b4 = g.f2214a.b();
                        a a4 = ch.icoaching.wrio.subscription.b.f10644a.a();
                        ch.icoaching.wrio.data.f fVar = ch.icoaching.wrio.data.f.f9502a;
                        f14656b = new TypewiseKeyboardNotificationController(k4, x4, b4, a4, fVar.l(), fVar.f());
                    }
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        a aVar = f14656b;
        o.b(aVar);
        return aVar;
    }
}
