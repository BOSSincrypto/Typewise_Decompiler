package O0;

import ch.icoaching.wrio.keyboard.D;
import ch.icoaching.wrio.keyboard.view.smartbar.b;
import kotlin.jvm.internal.o;

public final class a extends b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(String str, long j4) {
        super(str, j4);
        o.e(str, "smartBarText");
    }

    public ch.icoaching.wrio.keyboard.view.smartbar.o d() {
        return new ch.icoaching.wrio.keyboard.view.smartbar.o(D.wand, true);
    }
}
