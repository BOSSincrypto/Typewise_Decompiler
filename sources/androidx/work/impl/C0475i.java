package androidx.work.impl;

import W.b;
import Z.g;
import kotlin.jvm.internal.o;

/* renamed from: androidx.work.impl.i  reason: case insensitive filesystem */
public final class C0475i extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final C0475i f7333c = new C0475i();

    private C0475i() {
        super(1, 2);
    }

    public void a(g gVar) {
        o.e(gVar, "db");
        gVar.p("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        gVar.p("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        gVar.p("DROP TABLE IF EXISTS alarmInfo");
        gVar.p("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
