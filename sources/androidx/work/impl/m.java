package androidx.work.impl;

import W.b;
import Z.g;
import kotlin.jvm.internal.o;

public final class m extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final m f7337c = new m();

    private m() {
        super(7, 8);
    }

    public void a(g gVar) {
        o.e(gVar, "db");
        gVar.p("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
