package androidx.work.impl;

import W.b;
import Z.g;
import kotlin.jvm.internal.o;

/* renamed from: androidx.work.impl.h  reason: case insensitive filesystem */
public final class C0474h extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final C0474h f7332c = new C0474h();

    private C0474h() {
        super(15, 16);
    }

    public void a(g gVar) {
        o.e(gVar, "db");
        gVar.p("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
        gVar.p("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
        gVar.p("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
        gVar.p("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
        gVar.p("DROP TABLE `SystemIdInfo`");
        gVar.p("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
    }
}
