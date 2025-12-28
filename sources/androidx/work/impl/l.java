package androidx.work.impl;

import W.b;
import Z.g;
import kotlin.jvm.internal.o;

public final class l extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final l f7336c = new l();

    private l() {
        super(6, 7);
    }

    public void a(g gVar) {
        o.e(gVar, "db");
        gVar.p("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
