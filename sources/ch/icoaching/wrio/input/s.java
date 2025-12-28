package ch.icoaching.wrio.input;

import ch.icoaching.wrio.prediction.d;
import ch.icoaching.wrio.tutorialmode.TutorialModeManager;
import h.C0658a;
import kotlin.jvm.internal.o;

public final class s implements p {

    /* renamed from: a  reason: collision with root package name */
    private final TutorialModeManager f9816a;

    /* renamed from: b  reason: collision with root package name */
    private final d f9817b;

    /* renamed from: c  reason: collision with root package name */
    private final C0658a f9818c;

    public s(TutorialModeManager tutorialModeManager, d dVar, C0658a aVar) {
        o.e(tutorialModeManager, "tutorialManager");
        o.e(dVar, "predictionsController");
        o.e(aVar, "smartBarAppearanceDecider");
        this.f9816a = tutorialModeManager;
        this.f9817b = dVar;
        this.f9818c = aVar;
    }

    public void g(String str, int i4) {
        o.e(str, "content");
        if (!this.f9816a.j() && this.f9818c.c()) {
            this.f9817b.g(str, i4);
        }
    }
}
