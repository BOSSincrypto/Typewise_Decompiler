package androidx.work.impl;

import X.b;
import X.e;
import Z.g;
import Z.h;
import androidx.room.RoomDatabase;
import androidx.room.m;
import androidx.room.t;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l0.C0782A;
import l0.C0783B;
import l0.C0785b;
import l0.C0786c;
import l0.e;
import l0.f;
import l0.j;
import l0.k;
import l0.o;
import l0.p;
import l0.r;
import l0.s;
import l0.w;
import l0.x;

public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: q  reason: collision with root package name */
    private volatile w f7226q;

    /* renamed from: r  reason: collision with root package name */
    private volatile C0785b f7227r;

    /* renamed from: s  reason: collision with root package name */
    private volatile C0782A f7228s;

    /* renamed from: t  reason: collision with root package name */
    private volatile j f7229t;

    /* renamed from: u  reason: collision with root package name */
    private volatile o f7230u;

    /* renamed from: v  reason: collision with root package name */
    private volatile r f7231v;

    /* renamed from: w  reason: collision with root package name */
    private volatile e f7232w;

    class a extends t.b {
        a(int i4) {
            super(i4);
        }

        public void a(g gVar) {
            gVar.p("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.p("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            gVar.p("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            gVar.p("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            gVar.p("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            gVar.p("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            gVar.p("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.p("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            gVar.p("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.p("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.p("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            gVar.p("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.p("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            gVar.p("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.p("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
        }

        public void b(g gVar) {
            gVar.p("DROP TABLE IF EXISTS `Dependency`");
            gVar.p("DROP TABLE IF EXISTS `WorkSpec`");
            gVar.p("DROP TABLE IF EXISTS `WorkTag`");
            gVar.p("DROP TABLE IF EXISTS `SystemIdInfo`");
            gVar.p("DROP TABLE IF EXISTS `WorkName`");
            gVar.p("DROP TABLE IF EXISTS `WorkProgress`");
            gVar.p("DROP TABLE IF EXISTS `Preference`");
            if (WorkDatabase_Impl.this.f6738h != null) {
                int size = WorkDatabase_Impl.this.f6738h.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((RoomDatabase.b) WorkDatabase_Impl.this.f6738h.get(i4)).b(gVar);
                }
            }
        }

        public void c(g gVar) {
            if (WorkDatabase_Impl.this.f6738h != null) {
                int size = WorkDatabase_Impl.this.f6738h.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((RoomDatabase.b) WorkDatabase_Impl.this.f6738h.get(i4)).a(gVar);
                }
            }
        }

        public void d(g gVar) {
            g unused = WorkDatabase_Impl.this.f6731a = gVar;
            gVar.p("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.u(gVar);
            if (WorkDatabase_Impl.this.f6738h != null) {
                int size = WorkDatabase_Impl.this.f6738h.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((RoomDatabase.b) WorkDatabase_Impl.this.f6738h.get(i4)).c(gVar);
                }
            }
        }

        public void e(g gVar) {
        }

        public void f(g gVar) {
            b.a(gVar);
        }

        public t.c g(g gVar) {
            g gVar2 = gVar;
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap.put("prerequisite_id", new e.a("prerequisite_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            hashSet.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new e.C0038e("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
            hashSet2.add(new e.C0038e("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"ASC"})));
            X.e eVar = new X.e("Dependency", hashMap, hashSet, hashSet2);
            X.e a4 = X.e.a(gVar2, "Dependency");
            if (!eVar.equals(a4)) {
                return new t.c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + a4);
            }
            HashMap hashMap2 = new HashMap(27);
            hashMap2.put("id", new e.a("id", "TEXT", true, 1, (String) null, 1));
            hashMap2.put("state", new e.a("state", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("worker_class_name", new e.a("worker_class_name", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("input_merger_class_name", new e.a("input_merger_class_name", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("input", new e.a("input", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("output", new e.a("output", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("initial_delay", new e.a("initial_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("interval_duration", new e.a("interval_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("flex_duration", new e.a("flex_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_attempt_count", new e.a("run_attempt_count", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_policy", new e.a("backoff_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_delay_duration", new e.a("backoff_delay_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("last_enqueue_time", new e.a("last_enqueue_time", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("minimum_retention_duration", new e.a("minimum_retention_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("schedule_requested_at", new e.a("schedule_requested_at", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_in_foreground", new e.a("run_in_foreground", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("out_of_quota_policy", new e.a("out_of_quota_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("period_count", new e.a("period_count", "INTEGER", true, 0, "0", 1));
            hashMap2.put("generation", new e.a("generation", "INTEGER", true, 0, "0", 1));
            hashMap2.put("required_network_type", new e.a("required_network_type", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_charging", new e.a("requires_charging", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_device_idle", new e.a("requires_device_idle", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_battery_not_low", new e.a("requires_battery_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_storage_not_low", new e.a("requires_storage_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_content_update_delay", new e.a("trigger_content_update_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_max_content_delay", new e.a("trigger_max_content_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("content_uri_triggers", new e.a("content_uri_triggers", "BLOB", true, 0, (String) null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new e.C0038e("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"}), Arrays.asList(new String[]{"ASC"})));
            hashSet4.add(new e.C0038e("index_WorkSpec_last_enqueue_time", false, Arrays.asList(new String[]{"last_enqueue_time"}), Arrays.asList(new String[]{"ASC"})));
            X.e eVar2 = new X.e("WorkSpec", hashMap2, hashSet3, hashSet4);
            X.e a5 = X.e.a(gVar2, "WorkSpec");
            if (!eVar2.equals(a5)) {
                return new t.c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + a5);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new e.a("tag", "TEXT", true, 1, (String) null, 1));
            hashMap3.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new e.C0038e("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
            X.e eVar3 = new X.e("WorkTag", hashMap3, hashSet5, hashSet6);
            X.e a6 = X.e.a(gVar2, "WorkTag");
            if (!eVar3.equals(a6)) {
                return new t.c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + a6);
            }
            HashMap hashMap4 = new HashMap(3);
            hashMap4.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap4.put("generation", new e.a("generation", "INTEGER", true, 2, "0", 1));
            hashMap4.put("system_id", new e.a("system_id", "INTEGER", true, 0, (String) null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            X.e eVar4 = new X.e("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            X.e a7 = X.e.a(gVar2, "SystemIdInfo");
            if (!eVar4.equals(a7)) {
                return new t.c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + a7);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new e.a("name", "TEXT", true, 1, (String) null, 1));
            hashMap5.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new e.C0038e("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
            X.e eVar5 = new X.e("WorkName", hashMap5, hashSet8, hashSet9);
            X.e a8 = X.e.a(gVar2, "WorkName");
            if (!eVar5.equals(a8)) {
                return new t.c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + a8);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap6.put("progress", new e.a("progress", "BLOB", true, 0, (String) null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            X.e eVar6 = new X.e("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            X.e a9 = X.e.a(gVar2, "WorkProgress");
            if (!eVar6.equals(a9)) {
                return new t.c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + a9);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new e.a("key", "TEXT", true, 1, (String) null, 1));
            hashMap7.put("long_value", new e.a("long_value", "INTEGER", false, 0, (String) null, 1));
            X.e eVar7 = new X.e("Preference", hashMap7, new HashSet(0), new HashSet(0));
            X.e a10 = X.e.a(gVar2, "Preference");
            if (eVar7.equals(a10)) {
                return new t.c(true, (String) null);
            }
            return new t.c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + a10);
        }
    }

    public C0785b E() {
        C0785b bVar;
        if (this.f7227r != null) {
            return this.f7227r;
        }
        synchronized (this) {
            try {
                if (this.f7227r == null) {
                    this.f7227r = new C0786c(this);
                }
                bVar = this.f7227r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public l0.e F() {
        l0.e eVar;
        if (this.f7232w != null) {
            return this.f7232w;
        }
        synchronized (this) {
            try {
                if (this.f7232w == null) {
                    this.f7232w = new f(this);
                }
                eVar = this.f7232w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public j G() {
        j jVar;
        if (this.f7229t != null) {
            return this.f7229t;
        }
        synchronized (this) {
            try {
                if (this.f7229t == null) {
                    this.f7229t = new k(this);
                }
                jVar = this.f7229t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public o H() {
        o oVar;
        if (this.f7230u != null) {
            return this.f7230u;
        }
        synchronized (this) {
            try {
                if (this.f7230u == null) {
                    this.f7230u = new p(this);
                }
                oVar = this.f7230u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }

    public r I() {
        r rVar;
        if (this.f7231v != null) {
            return this.f7231v;
        }
        synchronized (this) {
            try {
                if (this.f7231v == null) {
                    this.f7231v = new s(this);
                }
                rVar = this.f7231v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    public w J() {
        w wVar;
        if (this.f7226q != null) {
            return this.f7226q;
        }
        synchronized (this) {
            try {
                if (this.f7226q == null) {
                    this.f7226q = new x(this);
                }
                wVar = this.f7226q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wVar;
    }

    public C0782A K() {
        C0782A a4;
        if (this.f7228s != null) {
            return this.f7228s;
        }
        synchronized (this) {
            try {
                if (this.f7228s == null) {
                    this.f7228s = new C0783B(this);
                }
                a4 = this.f7228s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a4;
    }

    /* access modifiers changed from: protected */
    public m g() {
        return new m(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    /* access modifiers changed from: protected */
    public h h(androidx.room.e eVar) {
        return eVar.f6791c.a(h.b.a(eVar.f6789a).d(eVar.f6790b).c(new t(eVar, new a(16), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e")).b());
    }

    public List j(Map map) {
        return Arrays.asList(new W.b[]{new C(), new D()});
    }

    public Set o() {
        return new HashSet();
    }

    /* access modifiers changed from: protected */
    public Map p() {
        HashMap hashMap = new HashMap();
        hashMap.put(w.class, x.z());
        hashMap.put(C0785b.class, C0786c.e());
        hashMap.put(C0782A.class, C0783B.e());
        hashMap.put(j.class, k.h());
        hashMap.put(o.class, p.c());
        hashMap.put(r.class, s.c());
        hashMap.put(l0.e.class, f.c());
        hashMap.put(l0.g.class, l0.h.a());
        return hashMap;
    }
}
