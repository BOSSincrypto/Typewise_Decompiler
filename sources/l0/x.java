package l0;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.u;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import l0.v;
import y.C0939a;

public final class x implements w {

    /* renamed from: a  reason: collision with root package name */
    private final RoomDatabase f14499a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.h f14500b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.room.g f14501c;

    /* renamed from: d  reason: collision with root package name */
    private final SharedSQLiteStatement f14502d;

    /* renamed from: e  reason: collision with root package name */
    private final SharedSQLiteStatement f14503e;

    /* renamed from: f  reason: collision with root package name */
    private final SharedSQLiteStatement f14504f;

    /* renamed from: g  reason: collision with root package name */
    private final SharedSQLiteStatement f14505g;

    /* renamed from: h  reason: collision with root package name */
    private final SharedSQLiteStatement f14506h;

    /* renamed from: i  reason: collision with root package name */
    private final SharedSQLiteStatement f14507i;

    /* renamed from: j  reason: collision with root package name */
    private final SharedSQLiteStatement f14508j;

    /* renamed from: k  reason: collision with root package name */
    private final SharedSQLiteStatement f14509k;

    /* renamed from: l  reason: collision with root package name */
    private final SharedSQLiteStatement f14510l;

    /* renamed from: m  reason: collision with root package name */
    private final SharedSQLiteStatement f14511m;

    /* renamed from: n  reason: collision with root package name */
    private final SharedSQLiteStatement f14512n;

    class a extends SharedSQLiteStatement {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String e() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    class b extends SharedSQLiteStatement {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String e() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    class c extends SharedSQLiteStatement {
        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String e() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    class d extends SharedSQLiteStatement {
        d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String e() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    class e extends androidx.room.h {
        e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String e() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: k */
        public void i(Z.k kVar, v vVar) {
            String str = vVar.f14470a;
            if (str == null) {
                kVar.B(1);
            } else {
                kVar.q(1, str);
            }
            C c4 = C.f14428a;
            kVar.U(2, (long) C.j(vVar.f14471b));
            String str2 = vVar.f14472c;
            if (str2 == null) {
                kVar.B(3);
            } else {
                kVar.q(3, str2);
            }
            String str3 = vVar.f14473d;
            if (str3 == null) {
                kVar.B(4);
            } else {
                kVar.q(4, str3);
            }
            byte[] k4 = androidx.work.e.k(vVar.f14474e);
            if (k4 == null) {
                kVar.B(5);
            } else {
                kVar.a0(5, k4);
            }
            byte[] k5 = androidx.work.e.k(vVar.f14475f);
            if (k5 == null) {
                kVar.B(6);
            } else {
                kVar.a0(6, k5);
            }
            kVar.U(7, vVar.f14476g);
            kVar.U(8, vVar.f14477h);
            kVar.U(9, vVar.f14478i);
            kVar.U(10, (long) vVar.f14480k);
            kVar.U(11, (long) C.a(vVar.f14481l));
            kVar.U(12, vVar.f14482m);
            kVar.U(13, vVar.f14483n);
            kVar.U(14, vVar.f14484o);
            kVar.U(15, vVar.f14485p);
            kVar.U(16, vVar.f14486q ? 1 : 0);
            kVar.U(17, (long) C.h(vVar.f14487r));
            kVar.U(18, (long) vVar.g());
            kVar.U(19, (long) vVar.f());
            androidx.work.b bVar = vVar.f14479j;
            if (bVar != null) {
                kVar.U(20, (long) C.g(bVar.d()));
                kVar.U(21, bVar.g() ? 1 : 0);
                kVar.U(22, bVar.h() ? 1 : 0);
                kVar.U(23, bVar.f() ? 1 : 0);
                kVar.U(24, bVar.i() ? 1 : 0);
                kVar.U(25, bVar.b());
                kVar.U(26, bVar.a());
                byte[] i4 = C.i(bVar.c());
                if (i4 == null) {
                    kVar.B(27);
                } else {
                    kVar.a0(27, i4);
                }
            } else {
                kVar.B(20);
                kVar.B(21);
                kVar.B(22);
                kVar.B(23);
                kVar.B(24);
                kVar.B(25);
                kVar.B(26);
                kVar.B(27);
            }
        }
    }

    class f extends androidx.room.g {
        f(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String e() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }

        /* renamed from: k */
        public void i(Z.k kVar, v vVar) {
            String str = vVar.f14470a;
            if (str == null) {
                kVar.B(1);
            } else {
                kVar.q(1, str);
            }
            C c4 = C.f14428a;
            kVar.U(2, (long) C.j(vVar.f14471b));
            String str2 = vVar.f14472c;
            if (str2 == null) {
                kVar.B(3);
            } else {
                kVar.q(3, str2);
            }
            String str3 = vVar.f14473d;
            if (str3 == null) {
                kVar.B(4);
            } else {
                kVar.q(4, str3);
            }
            byte[] k4 = androidx.work.e.k(vVar.f14474e);
            if (k4 == null) {
                kVar.B(5);
            } else {
                kVar.a0(5, k4);
            }
            byte[] k5 = androidx.work.e.k(vVar.f14475f);
            if (k5 == null) {
                kVar.B(6);
            } else {
                kVar.a0(6, k5);
            }
            kVar.U(7, vVar.f14476g);
            kVar.U(8, vVar.f14477h);
            kVar.U(9, vVar.f14478i);
            kVar.U(10, (long) vVar.f14480k);
            kVar.U(11, (long) C.a(vVar.f14481l));
            kVar.U(12, vVar.f14482m);
            kVar.U(13, vVar.f14483n);
            kVar.U(14, vVar.f14484o);
            kVar.U(15, vVar.f14485p);
            kVar.U(16, vVar.f14486q ? 1 : 0);
            kVar.U(17, (long) C.h(vVar.f14487r));
            kVar.U(18, (long) vVar.g());
            kVar.U(19, (long) vVar.f());
            androidx.work.b bVar = vVar.f14479j;
            if (bVar != null) {
                kVar.U(20, (long) C.g(bVar.d()));
                kVar.U(21, bVar.g() ? 1 : 0);
                kVar.U(22, bVar.h() ? 1 : 0);
                kVar.U(23, bVar.f() ? 1 : 0);
                kVar.U(24, bVar.i() ? 1 : 0);
                kVar.U(25, bVar.b());
                kVar.U(26, bVar.a());
                byte[] i4 = C.i(bVar.c());
                if (i4 == null) {
                    kVar.B(27);
                } else {
                    kVar.a0(27, i4);
                }
            } else {
                kVar.B(20);
                kVar.B(21);
                kVar.B(22);
                kVar.B(23);
                kVar.B(24);
                kVar.B(25);
                kVar.B(26);
                kVar.B(27);
            }
            String str4 = vVar.f14470a;
            if (str4 == null) {
                kVar.B(28);
            } else {
                kVar.q(28, str4);
            }
        }
    }

    class g extends SharedSQLiteStatement {
        g(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String e() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    class h extends SharedSQLiteStatement {
        h(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String e() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    class i extends SharedSQLiteStatement {
        i(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String e() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    class j extends SharedSQLiteStatement {
        j(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String e() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    class k extends SharedSQLiteStatement {
        k(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String e() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    class l extends SharedSQLiteStatement {
        l(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String e() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    class m extends SharedSQLiteStatement {
        m(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String e() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public x(RoomDatabase roomDatabase) {
        this.f14499a = roomDatabase;
        this.f14500b = new e(roomDatabase);
        this.f14501c = new f(roomDatabase);
        this.f14502d = new g(roomDatabase);
        this.f14503e = new h(roomDatabase);
        this.f14504f = new i(roomDatabase);
        this.f14505g = new j(roomDatabase);
        this.f14506h = new k(roomDatabase);
        this.f14507i = new l(roomDatabase);
        this.f14508j = new m(roomDatabase);
        this.f14509k = new a(roomDatabase);
        this.f14510l = new b(roomDatabase);
        this.f14511m = new c(roomDatabase);
        this.f14512n = new d(roomDatabase);
    }

    private void x(C0939a aVar) {
        byte[] bArr;
        Set<String> keySet = aVar.keySet();
        if (!keySet.isEmpty()) {
            if (aVar.size() > 999) {
                C0939a aVar2 = new C0939a(999);
                int size = aVar.size();
                int i4 = 0;
                int i5 = 0;
                while (i4 < size) {
                    aVar2.put((String) aVar.j(i4), (ArrayList) aVar.n(i4));
                    i4++;
                    i5++;
                    if (i5 == 999) {
                        x(aVar2);
                        aVar2 = new C0939a(999);
                        i5 = 0;
                    }
                }
                if (i5 > 0) {
                    x(aVar2);
                    return;
                }
                return;
            }
            StringBuilder b4 = X.d.b();
            b4.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
            int size2 = keySet.size();
            X.d.a(b4, size2);
            b4.append(")");
            u f4 = u.f(b4.toString(), size2);
            int i6 = 1;
            for (String str : keySet) {
                if (str == null) {
                    f4.B(i6);
                } else {
                    f4.q(i6, str);
                }
                i6++;
            }
            Cursor b5 = X.b.b(this.f14499a, f4, false, (CancellationSignal) null);
            try {
                int d4 = X.a.d(b5, "work_spec_id");
                if (d4 != -1) {
                    while (b5.moveToNext()) {
                        ArrayList arrayList = (ArrayList) aVar.get(b5.getString(d4));
                        if (arrayList != null) {
                            if (b5.isNull(0)) {
                                bArr = null;
                            } else {
                                bArr = b5.getBlob(0);
                            }
                            arrayList.add(androidx.work.e.g(bArr));
                        }
                    }
                    b5.close();
                }
            } finally {
                b5.close();
            }
        }
    }

    private void y(C0939a aVar) {
        String str;
        Set<String> keySet = aVar.keySet();
        if (!keySet.isEmpty()) {
            if (aVar.size() > 999) {
                C0939a aVar2 = new C0939a(999);
                int size = aVar.size();
                int i4 = 0;
                int i5 = 0;
                while (i4 < size) {
                    aVar2.put((String) aVar.j(i4), (ArrayList) aVar.n(i4));
                    i4++;
                    i5++;
                    if (i5 == 999) {
                        y(aVar2);
                        aVar2 = new C0939a(999);
                        i5 = 0;
                    }
                }
                if (i5 > 0) {
                    y(aVar2);
                    return;
                }
                return;
            }
            StringBuilder b4 = X.d.b();
            b4.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            int size2 = keySet.size();
            X.d.a(b4, size2);
            b4.append(")");
            u f4 = u.f(b4.toString(), size2);
            int i6 = 1;
            for (String str2 : keySet) {
                if (str2 == null) {
                    f4.B(i6);
                } else {
                    f4.q(i6, str2);
                }
                i6++;
            }
            Cursor b5 = X.b.b(this.f14499a, f4, false, (CancellationSignal) null);
            try {
                int d4 = X.a.d(b5, "work_spec_id");
                if (d4 != -1) {
                    while (b5.moveToNext()) {
                        ArrayList arrayList = (ArrayList) aVar.get(b5.getString(d4));
                        if (arrayList != null) {
                            if (b5.isNull(0)) {
                                str = null;
                            } else {
                                str = b5.getString(0);
                            }
                            arrayList.add(str);
                        }
                    }
                    b5.close();
                }
            } finally {
                b5.close();
            }
        }
    }

    public static List z() {
        return Collections.emptyList();
    }

    public void a(String str) {
        this.f14499a.d();
        Z.k b4 = this.f14502d.b();
        if (str == null) {
            b4.B(1);
        } else {
            b4.q(1, str);
        }
        this.f14499a.e();
        try {
            b4.t();
            this.f14499a.B();
        } finally {
            this.f14499a.i();
            this.f14502d.h(b4);
        }
    }

    public List b() {
        u uVar;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        boolean z6;
        int i7;
        boolean z7;
        int i8;
        byte[] bArr3;
        u f4 = u.f("SELECT * FROM workspec WHERE state=1", 0);
        this.f14499a.d();
        Cursor b4 = X.b.b(this.f14499a, f4, false, (CancellationSignal) null);
        try {
            int e4 = X.a.e(b4, "id");
            int e5 = X.a.e(b4, "state");
            int e6 = X.a.e(b4, "worker_class_name");
            int e7 = X.a.e(b4, "input_merger_class_name");
            int e8 = X.a.e(b4, "input");
            int e9 = X.a.e(b4, "output");
            int e10 = X.a.e(b4, "initial_delay");
            int e11 = X.a.e(b4, "interval_duration");
            int e12 = X.a.e(b4, "flex_duration");
            int e13 = X.a.e(b4, "run_attempt_count");
            int e14 = X.a.e(b4, "backoff_policy");
            int e15 = X.a.e(b4, "backoff_delay_duration");
            int e16 = X.a.e(b4, "last_enqueue_time");
            int e17 = X.a.e(b4, "minimum_retention_duration");
            uVar = f4;
            try {
                int e18 = X.a.e(b4, "schedule_requested_at");
                int e19 = X.a.e(b4, "run_in_foreground");
                int e20 = X.a.e(b4, "out_of_quota_policy");
                int e21 = X.a.e(b4, "period_count");
                int e22 = X.a.e(b4, "generation");
                int e23 = X.a.e(b4, "required_network_type");
                int e24 = X.a.e(b4, "requires_charging");
                int e25 = X.a.e(b4, "requires_device_idle");
                int e26 = X.a.e(b4, "requires_battery_not_low");
                int e27 = X.a.e(b4, "requires_storage_not_low");
                int e28 = X.a.e(b4, "trigger_content_update_delay");
                int e29 = X.a.e(b4, "trigger_max_content_delay");
                int e30 = X.a.e(b4, "content_uri_triggers");
                int i9 = e17;
                ArrayList arrayList = new ArrayList(b4.getCount());
                while (b4.moveToNext()) {
                    if (b4.isNull(e4)) {
                        str = null;
                    } else {
                        str = b4.getString(e4);
                    }
                    WorkInfo.State f5 = C.f(b4.getInt(e5));
                    if (b4.isNull(e6)) {
                        str2 = null;
                    } else {
                        str2 = b4.getString(e6);
                    }
                    if (b4.isNull(e7)) {
                        str3 = null;
                    } else {
                        str3 = b4.getString(e7);
                    }
                    if (b4.isNull(e8)) {
                        bArr = null;
                    } else {
                        bArr = b4.getBlob(e8);
                    }
                    androidx.work.e g4 = androidx.work.e.g(bArr);
                    if (b4.isNull(e9)) {
                        bArr2 = null;
                    } else {
                        bArr2 = b4.getBlob(e9);
                    }
                    androidx.work.e g5 = androidx.work.e.g(bArr2);
                    long j4 = b4.getLong(e10);
                    long j5 = b4.getLong(e11);
                    long j6 = b4.getLong(e12);
                    int i10 = b4.getInt(e13);
                    BackoffPolicy c4 = C.c(b4.getInt(e14));
                    long j7 = b4.getLong(e15);
                    long j8 = b4.getLong(e16);
                    int i11 = i9;
                    long j9 = b4.getLong(i11);
                    int i12 = e4;
                    int i13 = e18;
                    long j10 = b4.getLong(i13);
                    e18 = i13;
                    int i14 = e19;
                    if (b4.getInt(i14) != 0) {
                        e19 = i14;
                        i4 = e20;
                        z3 = true;
                    } else {
                        e19 = i14;
                        i4 = e20;
                        z3 = false;
                    }
                    OutOfQuotaPolicy e31 = C.e(b4.getInt(i4));
                    e20 = i4;
                    int i15 = e21;
                    int i16 = b4.getInt(i15);
                    e21 = i15;
                    int i17 = e22;
                    int i18 = b4.getInt(i17);
                    e22 = i17;
                    int i19 = e23;
                    NetworkType d4 = C.d(b4.getInt(i19));
                    e23 = i19;
                    int i20 = e24;
                    if (b4.getInt(i20) != 0) {
                        e24 = i20;
                        i5 = e25;
                        z4 = true;
                    } else {
                        e24 = i20;
                        i5 = e25;
                        z4 = false;
                    }
                    if (b4.getInt(i5) != 0) {
                        e25 = i5;
                        i6 = e26;
                        z5 = true;
                    } else {
                        e25 = i5;
                        i6 = e26;
                        z5 = false;
                    }
                    if (b4.getInt(i6) != 0) {
                        e26 = i6;
                        i7 = e27;
                        z6 = true;
                    } else {
                        e26 = i6;
                        i7 = e27;
                        z6 = false;
                    }
                    if (b4.getInt(i7) != 0) {
                        e27 = i7;
                        i8 = e28;
                        z7 = true;
                    } else {
                        e27 = i7;
                        i8 = e28;
                        z7 = false;
                    }
                    long j11 = b4.getLong(i8);
                    e28 = i8;
                    int i21 = e29;
                    long j12 = b4.getLong(i21);
                    e29 = i21;
                    int i22 = e30;
                    if (b4.isNull(i22)) {
                        bArr3 = null;
                    } else {
                        bArr3 = b4.getBlob(i22);
                    }
                    e30 = i22;
                    arrayList.add(new v(str, f5, str2, str3, g4, g5, j4, j5, j6, new androidx.work.b(d4, z4, z5, z6, z7, j11, j12, C.b(bArr3)), i10, c4, j7, j8, j9, j10, z3, e31, i16, i18));
                    e4 = i12;
                    i9 = i11;
                }
                b4.close();
                uVar.o();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b4.close();
                uVar.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            uVar = f4;
            b4.close();
            uVar.o();
            throw th;
        }
    }

    public void c(String str) {
        this.f14499a.d();
        Z.k b4 = this.f14504f.b();
        if (str == null) {
            b4.B(1);
        } else {
            b4.q(1, str);
        }
        this.f14499a.e();
        try {
            b4.t();
            this.f14499a.B();
        } finally {
            this.f14499a.i();
            this.f14504f.h(b4);
        }
    }

    public boolean d() {
        boolean z3 = false;
        u f4 = u.f("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f14499a.d();
        Cursor b4 = X.b.b(this.f14499a, f4, false, (CancellationSignal) null);
        try {
            if (b4.moveToFirst() && b4.getInt(0) != 0) {
                z3 = true;
            }
            return z3;
        } finally {
            b4.close();
            f4.o();
        }
    }

    public int e(String str, long j4) {
        this.f14499a.d();
        Z.k b4 = this.f14509k.b();
        b4.U(1, j4);
        if (str == null) {
            b4.B(2);
        } else {
            b4.q(2, str);
        }
        this.f14499a.e();
        try {
            int t4 = b4.t();
            this.f14499a.B();
            return t4;
        } finally {
            this.f14499a.i();
            this.f14509k.h(b4);
        }
    }

    public List f(String str) {
        String str2;
        u f4 = u.f("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            f4.B(1);
        } else {
            f4.q(1, str);
        }
        this.f14499a.d();
        Cursor b4 = X.b.b(this.f14499a, f4, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b4.getCount());
            while (b4.moveToNext()) {
                if (b4.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = b4.getString(0);
                }
                arrayList.add(str2);
            }
            return arrayList;
        } finally {
            b4.close();
            f4.o();
        }
    }

    public List g(String str) {
        String str2;
        u f4 = u.f("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            f4.B(1);
        } else {
            f4.q(1, str);
        }
        this.f14499a.d();
        Cursor b4 = X.b.b(this.f14499a, f4, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b4.getCount());
            while (b4.moveToNext()) {
                if (b4.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = b4.getString(0);
                }
                arrayList.add(new v.b(str2, C.f(b4.getInt(1))));
            }
            return arrayList;
        } finally {
            b4.close();
            f4.o();
        }
    }

    public List h(long j4) {
        u uVar;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        boolean z6;
        int i7;
        boolean z7;
        int i8;
        byte[] bArr3;
        u f4 = u.f("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        f4.U(1, j4);
        this.f14499a.d();
        Cursor b4 = X.b.b(this.f14499a, f4, false, (CancellationSignal) null);
        try {
            int e4 = X.a.e(b4, "id");
            int e5 = X.a.e(b4, "state");
            int e6 = X.a.e(b4, "worker_class_name");
            int e7 = X.a.e(b4, "input_merger_class_name");
            int e8 = X.a.e(b4, "input");
            int e9 = X.a.e(b4, "output");
            int e10 = X.a.e(b4, "initial_delay");
            int e11 = X.a.e(b4, "interval_duration");
            int e12 = X.a.e(b4, "flex_duration");
            int e13 = X.a.e(b4, "run_attempt_count");
            int e14 = X.a.e(b4, "backoff_policy");
            int e15 = X.a.e(b4, "backoff_delay_duration");
            int e16 = X.a.e(b4, "last_enqueue_time");
            int e17 = X.a.e(b4, "minimum_retention_duration");
            uVar = f4;
            try {
                int e18 = X.a.e(b4, "schedule_requested_at");
                int e19 = X.a.e(b4, "run_in_foreground");
                int e20 = X.a.e(b4, "out_of_quota_policy");
                int e21 = X.a.e(b4, "period_count");
                int e22 = X.a.e(b4, "generation");
                int e23 = X.a.e(b4, "required_network_type");
                int e24 = X.a.e(b4, "requires_charging");
                int e25 = X.a.e(b4, "requires_device_idle");
                int e26 = X.a.e(b4, "requires_battery_not_low");
                int e27 = X.a.e(b4, "requires_storage_not_low");
                int e28 = X.a.e(b4, "trigger_content_update_delay");
                int e29 = X.a.e(b4, "trigger_max_content_delay");
                int e30 = X.a.e(b4, "content_uri_triggers");
                int i9 = e17;
                ArrayList arrayList = new ArrayList(b4.getCount());
                while (b4.moveToNext()) {
                    if (b4.isNull(e4)) {
                        str = null;
                    } else {
                        str = b4.getString(e4);
                    }
                    WorkInfo.State f5 = C.f(b4.getInt(e5));
                    if (b4.isNull(e6)) {
                        str2 = null;
                    } else {
                        str2 = b4.getString(e6);
                    }
                    if (b4.isNull(e7)) {
                        str3 = null;
                    } else {
                        str3 = b4.getString(e7);
                    }
                    if (b4.isNull(e8)) {
                        bArr = null;
                    } else {
                        bArr = b4.getBlob(e8);
                    }
                    androidx.work.e g4 = androidx.work.e.g(bArr);
                    if (b4.isNull(e9)) {
                        bArr2 = null;
                    } else {
                        bArr2 = b4.getBlob(e9);
                    }
                    androidx.work.e g5 = androidx.work.e.g(bArr2);
                    long j5 = b4.getLong(e10);
                    long j6 = b4.getLong(e11);
                    long j7 = b4.getLong(e12);
                    int i10 = b4.getInt(e13);
                    BackoffPolicy c4 = C.c(b4.getInt(e14));
                    long j8 = b4.getLong(e15);
                    long j9 = b4.getLong(e16);
                    int i11 = i9;
                    long j10 = b4.getLong(i11);
                    int i12 = e4;
                    int i13 = e18;
                    long j11 = b4.getLong(i13);
                    e18 = i13;
                    int i14 = e19;
                    if (b4.getInt(i14) != 0) {
                        e19 = i14;
                        i4 = e20;
                        z3 = true;
                    } else {
                        e19 = i14;
                        i4 = e20;
                        z3 = false;
                    }
                    OutOfQuotaPolicy e31 = C.e(b4.getInt(i4));
                    e20 = i4;
                    int i15 = e21;
                    int i16 = b4.getInt(i15);
                    e21 = i15;
                    int i17 = e22;
                    int i18 = b4.getInt(i17);
                    e22 = i17;
                    int i19 = e23;
                    NetworkType d4 = C.d(b4.getInt(i19));
                    e23 = i19;
                    int i20 = e24;
                    if (b4.getInt(i20) != 0) {
                        e24 = i20;
                        i5 = e25;
                        z4 = true;
                    } else {
                        e24 = i20;
                        i5 = e25;
                        z4 = false;
                    }
                    if (b4.getInt(i5) != 0) {
                        e25 = i5;
                        i6 = e26;
                        z5 = true;
                    } else {
                        e25 = i5;
                        i6 = e26;
                        z5 = false;
                    }
                    if (b4.getInt(i6) != 0) {
                        e26 = i6;
                        i7 = e27;
                        z6 = true;
                    } else {
                        e26 = i6;
                        i7 = e27;
                        z6 = false;
                    }
                    if (b4.getInt(i7) != 0) {
                        e27 = i7;
                        i8 = e28;
                        z7 = true;
                    } else {
                        e27 = i7;
                        i8 = e28;
                        z7 = false;
                    }
                    long j12 = b4.getLong(i8);
                    e28 = i8;
                    int i21 = e29;
                    long j13 = b4.getLong(i21);
                    e29 = i21;
                    int i22 = e30;
                    if (b4.isNull(i22)) {
                        bArr3 = null;
                    } else {
                        bArr3 = b4.getBlob(i22);
                    }
                    e30 = i22;
                    arrayList.add(new v(str, f5, str2, str3, g4, g5, j5, j6, j7, new androidx.work.b(d4, z4, z5, z6, z7, j12, j13, C.b(bArr3)), i10, c4, j8, j9, j10, j11, z3, e31, i16, i18));
                    e4 = i12;
                    i9 = i11;
                }
                b4.close();
                uVar.o();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b4.close();
                uVar.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            uVar = f4;
            b4.close();
            uVar.o();
            throw th;
        }
    }

    public WorkInfo.State i(String str) {
        Integer num;
        u f4 = u.f("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            f4.B(1);
        } else {
            f4.q(1, str);
        }
        this.f14499a.d();
        WorkInfo.State state = null;
        Cursor b4 = X.b.b(this.f14499a, f4, false, (CancellationSignal) null);
        try {
            if (b4.moveToFirst()) {
                if (b4.isNull(0)) {
                    num = null;
                } else {
                    num = Integer.valueOf(b4.getInt(0));
                }
                if (num != null) {
                    C c4 = C.f14428a;
                    state = C.f(num.intValue());
                }
            }
            return state;
        } finally {
            b4.close();
            f4.o();
        }
    }

    public void j(v vVar) {
        this.f14499a.d();
        this.f14499a.e();
        try {
            this.f14500b.j(vVar);
            this.f14499a.B();
        } finally {
            this.f14499a.i();
        }
    }

    public List k(int i4) {
        u uVar;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        boolean z6;
        int i8;
        boolean z7;
        int i9;
        byte[] bArr3;
        u f4 = u.f("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        f4.U(1, (long) i4);
        this.f14499a.d();
        Cursor b4 = X.b.b(this.f14499a, f4, false, (CancellationSignal) null);
        try {
            int e4 = X.a.e(b4, "id");
            int e5 = X.a.e(b4, "state");
            int e6 = X.a.e(b4, "worker_class_name");
            int e7 = X.a.e(b4, "input_merger_class_name");
            int e8 = X.a.e(b4, "input");
            int e9 = X.a.e(b4, "output");
            int e10 = X.a.e(b4, "initial_delay");
            int e11 = X.a.e(b4, "interval_duration");
            int e12 = X.a.e(b4, "flex_duration");
            int e13 = X.a.e(b4, "run_attempt_count");
            int e14 = X.a.e(b4, "backoff_policy");
            int e15 = X.a.e(b4, "backoff_delay_duration");
            int e16 = X.a.e(b4, "last_enqueue_time");
            int e17 = X.a.e(b4, "minimum_retention_duration");
            uVar = f4;
            try {
                int e18 = X.a.e(b4, "schedule_requested_at");
                int e19 = X.a.e(b4, "run_in_foreground");
                int e20 = X.a.e(b4, "out_of_quota_policy");
                int e21 = X.a.e(b4, "period_count");
                int e22 = X.a.e(b4, "generation");
                int e23 = X.a.e(b4, "required_network_type");
                int e24 = X.a.e(b4, "requires_charging");
                int e25 = X.a.e(b4, "requires_device_idle");
                int e26 = X.a.e(b4, "requires_battery_not_low");
                int e27 = X.a.e(b4, "requires_storage_not_low");
                int e28 = X.a.e(b4, "trigger_content_update_delay");
                int e29 = X.a.e(b4, "trigger_max_content_delay");
                int e30 = X.a.e(b4, "content_uri_triggers");
                int i10 = e17;
                ArrayList arrayList = new ArrayList(b4.getCount());
                while (b4.moveToNext()) {
                    if (b4.isNull(e4)) {
                        str = null;
                    } else {
                        str = b4.getString(e4);
                    }
                    WorkInfo.State f5 = C.f(b4.getInt(e5));
                    if (b4.isNull(e6)) {
                        str2 = null;
                    } else {
                        str2 = b4.getString(e6);
                    }
                    if (b4.isNull(e7)) {
                        str3 = null;
                    } else {
                        str3 = b4.getString(e7);
                    }
                    if (b4.isNull(e8)) {
                        bArr = null;
                    } else {
                        bArr = b4.getBlob(e8);
                    }
                    androidx.work.e g4 = androidx.work.e.g(bArr);
                    if (b4.isNull(e9)) {
                        bArr2 = null;
                    } else {
                        bArr2 = b4.getBlob(e9);
                    }
                    androidx.work.e g5 = androidx.work.e.g(bArr2);
                    long j4 = b4.getLong(e10);
                    long j5 = b4.getLong(e11);
                    long j6 = b4.getLong(e12);
                    int i11 = b4.getInt(e13);
                    BackoffPolicy c4 = C.c(b4.getInt(e14));
                    long j7 = b4.getLong(e15);
                    long j8 = b4.getLong(e16);
                    int i12 = i10;
                    long j9 = b4.getLong(i12);
                    int i13 = e4;
                    int i14 = e18;
                    long j10 = b4.getLong(i14);
                    e18 = i14;
                    int i15 = e19;
                    if (b4.getInt(i15) != 0) {
                        e19 = i15;
                        i5 = e20;
                        z3 = true;
                    } else {
                        e19 = i15;
                        i5 = e20;
                        z3 = false;
                    }
                    OutOfQuotaPolicy e31 = C.e(b4.getInt(i5));
                    e20 = i5;
                    int i16 = e21;
                    int i17 = b4.getInt(i16);
                    e21 = i16;
                    int i18 = e22;
                    int i19 = b4.getInt(i18);
                    e22 = i18;
                    int i20 = e23;
                    NetworkType d4 = C.d(b4.getInt(i20));
                    e23 = i20;
                    int i21 = e24;
                    if (b4.getInt(i21) != 0) {
                        e24 = i21;
                        i6 = e25;
                        z4 = true;
                    } else {
                        e24 = i21;
                        i6 = e25;
                        z4 = false;
                    }
                    if (b4.getInt(i6) != 0) {
                        e25 = i6;
                        i7 = e26;
                        z5 = true;
                    } else {
                        e25 = i6;
                        i7 = e26;
                        z5 = false;
                    }
                    if (b4.getInt(i7) != 0) {
                        e26 = i7;
                        i8 = e27;
                        z6 = true;
                    } else {
                        e26 = i7;
                        i8 = e27;
                        z6 = false;
                    }
                    if (b4.getInt(i8) != 0) {
                        e27 = i8;
                        i9 = e28;
                        z7 = true;
                    } else {
                        e27 = i8;
                        i9 = e28;
                        z7 = false;
                    }
                    long j11 = b4.getLong(i9);
                    e28 = i9;
                    int i22 = e29;
                    long j12 = b4.getLong(i22);
                    e29 = i22;
                    int i23 = e30;
                    if (b4.isNull(i23)) {
                        bArr3 = null;
                    } else {
                        bArr3 = b4.getBlob(i23);
                    }
                    e30 = i23;
                    arrayList.add(new v(str, f5, str2, str3, g4, g5, j4, j5, j6, new androidx.work.b(d4, z4, z5, z6, z7, j11, j12, C.b(bArr3)), i11, c4, j7, j8, j9, j10, z3, e31, i17, i19));
                    e4 = i13;
                    i10 = i12;
                }
                b4.close();
                uVar.o();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b4.close();
                uVar.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            uVar = f4;
            b4.close();
            uVar.o();
            throw th;
        }
    }

    public v l(String str) {
        u uVar;
        v vVar;
        String str2;
        String str3;
        String str4;
        byte[] bArr;
        byte[] bArr2;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        boolean z6;
        int i7;
        boolean z7;
        int i8;
        byte[] bArr3;
        String str5 = str;
        u f4 = u.f("SELECT * FROM workspec WHERE id=?", 1);
        if (str5 == null) {
            f4.B(1);
        } else {
            f4.q(1, str5);
        }
        this.f14499a.d();
        Cursor b4 = X.b.b(this.f14499a, f4, false, (CancellationSignal) null);
        try {
            int e4 = X.a.e(b4, "id");
            int e5 = X.a.e(b4, "state");
            int e6 = X.a.e(b4, "worker_class_name");
            int e7 = X.a.e(b4, "input_merger_class_name");
            int e8 = X.a.e(b4, "input");
            int e9 = X.a.e(b4, "output");
            int e10 = X.a.e(b4, "initial_delay");
            int e11 = X.a.e(b4, "interval_duration");
            int e12 = X.a.e(b4, "flex_duration");
            int e13 = X.a.e(b4, "run_attempt_count");
            int e14 = X.a.e(b4, "backoff_policy");
            int e15 = X.a.e(b4, "backoff_delay_duration");
            int e16 = X.a.e(b4, "last_enqueue_time");
            int e17 = X.a.e(b4, "minimum_retention_duration");
            uVar = f4;
            try {
                int e18 = X.a.e(b4, "schedule_requested_at");
                int e19 = X.a.e(b4, "run_in_foreground");
                int e20 = X.a.e(b4, "out_of_quota_policy");
                int e21 = X.a.e(b4, "period_count");
                int e22 = X.a.e(b4, "generation");
                int e23 = X.a.e(b4, "required_network_type");
                int e24 = X.a.e(b4, "requires_charging");
                int e25 = X.a.e(b4, "requires_device_idle");
                int e26 = X.a.e(b4, "requires_battery_not_low");
                int e27 = X.a.e(b4, "requires_storage_not_low");
                int e28 = X.a.e(b4, "trigger_content_update_delay");
                int e29 = X.a.e(b4, "trigger_max_content_delay");
                int e30 = X.a.e(b4, "content_uri_triggers");
                if (b4.moveToFirst()) {
                    if (b4.isNull(e4)) {
                        str2 = null;
                    } else {
                        str2 = b4.getString(e4);
                    }
                    WorkInfo.State f5 = C.f(b4.getInt(e5));
                    if (b4.isNull(e6)) {
                        str3 = null;
                    } else {
                        str3 = b4.getString(e6);
                    }
                    if (b4.isNull(e7)) {
                        str4 = null;
                    } else {
                        str4 = b4.getString(e7);
                    }
                    if (b4.isNull(e8)) {
                        bArr = null;
                    } else {
                        bArr = b4.getBlob(e8);
                    }
                    androidx.work.e g4 = androidx.work.e.g(bArr);
                    if (b4.isNull(e9)) {
                        bArr2 = null;
                    } else {
                        bArr2 = b4.getBlob(e9);
                    }
                    androidx.work.e g5 = androidx.work.e.g(bArr2);
                    long j4 = b4.getLong(e10);
                    long j5 = b4.getLong(e11);
                    long j6 = b4.getLong(e12);
                    int i9 = b4.getInt(e13);
                    BackoffPolicy c4 = C.c(b4.getInt(e14));
                    long j7 = b4.getLong(e15);
                    long j8 = b4.getLong(e16);
                    long j9 = b4.getLong(e17);
                    long j10 = b4.getLong(e18);
                    if (b4.getInt(e19) != 0) {
                        i4 = e20;
                        z3 = true;
                    } else {
                        i4 = e20;
                        z3 = false;
                    }
                    OutOfQuotaPolicy e31 = C.e(b4.getInt(i4));
                    int i10 = b4.getInt(e21);
                    int i11 = b4.getInt(e22);
                    NetworkType d4 = C.d(b4.getInt(e23));
                    if (b4.getInt(e24) != 0) {
                        i5 = e25;
                        z4 = true;
                    } else {
                        i5 = e25;
                        z4 = false;
                    }
                    if (b4.getInt(i5) != 0) {
                        i6 = e26;
                        z5 = true;
                    } else {
                        i6 = e26;
                        z5 = false;
                    }
                    if (b4.getInt(i6) != 0) {
                        i7 = e27;
                        z6 = true;
                    } else {
                        i7 = e27;
                        z6 = false;
                    }
                    if (b4.getInt(i7) != 0) {
                        i8 = e28;
                        z7 = true;
                    } else {
                        i8 = e28;
                        z7 = false;
                    }
                    long j11 = b4.getLong(i8);
                    long j12 = b4.getLong(e29);
                    if (b4.isNull(e30)) {
                        bArr3 = null;
                    } else {
                        bArr3 = b4.getBlob(e30);
                    }
                    vVar = new v(str2, f5, str3, str4, g4, g5, j4, j5, j6, new androidx.work.b(d4, z4, z5, z6, z7, j11, j12, C.b(bArr3)), i9, c4, j7, j8, j9, j10, z3, e31, i10, i11);
                } else {
                    vVar = null;
                }
                b4.close();
                uVar.o();
                return vVar;
            } catch (Throwable th) {
                th = th;
                b4.close();
                uVar.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            uVar = f4;
            b4.close();
            uVar.o();
            throw th;
        }
    }

    public int m(String str) {
        this.f14499a.d();
        Z.k b4 = this.f14508j.b();
        if (str == null) {
            b4.B(1);
        } else {
            b4.q(1, str);
        }
        this.f14499a.e();
        try {
            int t4 = b4.t();
            this.f14499a.B();
            return t4;
        } finally {
            this.f14499a.i();
            this.f14508j.h(b4);
        }
    }

    public void n(String str, long j4) {
        this.f14499a.d();
        Z.k b4 = this.f14506h.b();
        b4.U(1, j4);
        if (str == null) {
            b4.B(2);
        } else {
            b4.q(2, str);
        }
        this.f14499a.e();
        try {
            b4.t();
            this.f14499a.B();
        } finally {
            this.f14499a.i();
            this.f14506h.h(b4);
        }
    }

    public int o(WorkInfo.State state, String str) {
        this.f14499a.d();
        Z.k b4 = this.f14503e.b();
        b4.U(1, (long) C.j(state));
        if (str == null) {
            b4.B(2);
        } else {
            b4.q(2, str);
        }
        this.f14499a.e();
        try {
            int t4 = b4.t();
            this.f14499a.B();
            return t4;
        } finally {
            this.f14499a.i();
            this.f14503e.h(b4);
        }
    }

    public List p(String str) {
        byte[] bArr;
        u f4 = u.f("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            f4.B(1);
        } else {
            f4.q(1, str);
        }
        this.f14499a.d();
        Cursor b4 = X.b.b(this.f14499a, f4, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b4.getCount());
            while (b4.moveToNext()) {
                if (b4.isNull(0)) {
                    bArr = null;
                } else {
                    bArr = b4.getBlob(0);
                }
                arrayList.add(androidx.work.e.g(bArr));
            }
            return arrayList;
        } finally {
            b4.close();
            f4.o();
        }
    }

    public int q(String str) {
        this.f14499a.d();
        Z.k b4 = this.f14507i.b();
        if (str == null) {
            b4.B(1);
        } else {
            b4.q(1, str);
        }
        this.f14499a.e();
        try {
            int t4 = b4.t();
            this.f14499a.B();
            return t4;
        } finally {
            this.f14499a.i();
            this.f14507i.h(b4);
        }
    }

    public void r(v vVar) {
        this.f14499a.d();
        this.f14499a.e();
        try {
            this.f14501c.j(vVar);
            this.f14499a.B();
        } finally {
            this.f14499a.i();
        }
    }

    public List s() {
        u uVar;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        boolean z6;
        int i7;
        boolean z7;
        int i8;
        byte[] bArr3;
        u f4 = u.f("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f14499a.d();
        Cursor b4 = X.b.b(this.f14499a, f4, false, (CancellationSignal) null);
        try {
            int e4 = X.a.e(b4, "id");
            int e5 = X.a.e(b4, "state");
            int e6 = X.a.e(b4, "worker_class_name");
            int e7 = X.a.e(b4, "input_merger_class_name");
            int e8 = X.a.e(b4, "input");
            int e9 = X.a.e(b4, "output");
            int e10 = X.a.e(b4, "initial_delay");
            int e11 = X.a.e(b4, "interval_duration");
            int e12 = X.a.e(b4, "flex_duration");
            int e13 = X.a.e(b4, "run_attempt_count");
            int e14 = X.a.e(b4, "backoff_policy");
            int e15 = X.a.e(b4, "backoff_delay_duration");
            int e16 = X.a.e(b4, "last_enqueue_time");
            int e17 = X.a.e(b4, "minimum_retention_duration");
            uVar = f4;
            try {
                int e18 = X.a.e(b4, "schedule_requested_at");
                int e19 = X.a.e(b4, "run_in_foreground");
                int e20 = X.a.e(b4, "out_of_quota_policy");
                int e21 = X.a.e(b4, "period_count");
                int e22 = X.a.e(b4, "generation");
                int e23 = X.a.e(b4, "required_network_type");
                int e24 = X.a.e(b4, "requires_charging");
                int e25 = X.a.e(b4, "requires_device_idle");
                int e26 = X.a.e(b4, "requires_battery_not_low");
                int e27 = X.a.e(b4, "requires_storage_not_low");
                int e28 = X.a.e(b4, "trigger_content_update_delay");
                int e29 = X.a.e(b4, "trigger_max_content_delay");
                int e30 = X.a.e(b4, "content_uri_triggers");
                int i9 = e17;
                ArrayList arrayList = new ArrayList(b4.getCount());
                while (b4.moveToNext()) {
                    if (b4.isNull(e4)) {
                        str = null;
                    } else {
                        str = b4.getString(e4);
                    }
                    WorkInfo.State f5 = C.f(b4.getInt(e5));
                    if (b4.isNull(e6)) {
                        str2 = null;
                    } else {
                        str2 = b4.getString(e6);
                    }
                    if (b4.isNull(e7)) {
                        str3 = null;
                    } else {
                        str3 = b4.getString(e7);
                    }
                    if (b4.isNull(e8)) {
                        bArr = null;
                    } else {
                        bArr = b4.getBlob(e8);
                    }
                    androidx.work.e g4 = androidx.work.e.g(bArr);
                    if (b4.isNull(e9)) {
                        bArr2 = null;
                    } else {
                        bArr2 = b4.getBlob(e9);
                    }
                    androidx.work.e g5 = androidx.work.e.g(bArr2);
                    long j4 = b4.getLong(e10);
                    long j5 = b4.getLong(e11);
                    long j6 = b4.getLong(e12);
                    int i10 = b4.getInt(e13);
                    BackoffPolicy c4 = C.c(b4.getInt(e14));
                    long j7 = b4.getLong(e15);
                    long j8 = b4.getLong(e16);
                    int i11 = i9;
                    long j9 = b4.getLong(i11);
                    int i12 = e4;
                    int i13 = e18;
                    long j10 = b4.getLong(i13);
                    e18 = i13;
                    int i14 = e19;
                    if (b4.getInt(i14) != 0) {
                        e19 = i14;
                        i4 = e20;
                        z3 = true;
                    } else {
                        e19 = i14;
                        i4 = e20;
                        z3 = false;
                    }
                    OutOfQuotaPolicy e31 = C.e(b4.getInt(i4));
                    e20 = i4;
                    int i15 = e21;
                    int i16 = b4.getInt(i15);
                    e21 = i15;
                    int i17 = e22;
                    int i18 = b4.getInt(i17);
                    e22 = i17;
                    int i19 = e23;
                    NetworkType d4 = C.d(b4.getInt(i19));
                    e23 = i19;
                    int i20 = e24;
                    if (b4.getInt(i20) != 0) {
                        e24 = i20;
                        i5 = e25;
                        z4 = true;
                    } else {
                        e24 = i20;
                        i5 = e25;
                        z4 = false;
                    }
                    if (b4.getInt(i5) != 0) {
                        e25 = i5;
                        i6 = e26;
                        z5 = true;
                    } else {
                        e25 = i5;
                        i6 = e26;
                        z5 = false;
                    }
                    if (b4.getInt(i6) != 0) {
                        e26 = i6;
                        i7 = e27;
                        z6 = true;
                    } else {
                        e26 = i6;
                        i7 = e27;
                        z6 = false;
                    }
                    if (b4.getInt(i7) != 0) {
                        e27 = i7;
                        i8 = e28;
                        z7 = true;
                    } else {
                        e27 = i7;
                        i8 = e28;
                        z7 = false;
                    }
                    long j11 = b4.getLong(i8);
                    e28 = i8;
                    int i21 = e29;
                    long j12 = b4.getLong(i21);
                    e29 = i21;
                    int i22 = e30;
                    if (b4.isNull(i22)) {
                        bArr3 = null;
                    } else {
                        bArr3 = b4.getBlob(i22);
                    }
                    e30 = i22;
                    arrayList.add(new v(str, f5, str2, str3, g4, g5, j4, j5, j6, new androidx.work.b(d4, z4, z5, z6, z7, j11, j12, C.b(bArr3)), i10, c4, j7, j8, j9, j10, z3, e31, i16, i18));
                    e4 = i12;
                    i9 = i11;
                }
                b4.close();
                uVar.o();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b4.close();
                uVar.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            uVar = f4;
            b4.close();
            uVar.o();
            throw th;
        }
    }

    public List t(String str) {
        Cursor b4;
        String str2;
        byte[] bArr;
        String str3 = str;
        u f4 = u.f("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str3 == null) {
            f4.B(1);
        } else {
            f4.q(1, str3);
        }
        this.f14499a.d();
        this.f14499a.e();
        try {
            b4 = X.b.b(this.f14499a, f4, true, (CancellationSignal) null);
            C0939a aVar = new C0939a();
            C0939a aVar2 = new C0939a();
            while (b4.moveToNext()) {
                String string = b4.getString(0);
                if (((ArrayList) aVar.get(string)) == null) {
                    aVar.put(string, new ArrayList());
                }
                String string2 = b4.getString(0);
                if (((ArrayList) aVar2.get(string2)) == null) {
                    aVar2.put(string2, new ArrayList());
                }
            }
            b4.moveToPosition(-1);
            y(aVar);
            x(aVar2);
            ArrayList arrayList = new ArrayList(b4.getCount());
            while (b4.moveToNext()) {
                if (b4.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = b4.getString(0);
                }
                WorkInfo.State f5 = C.f(b4.getInt(1));
                if (b4.isNull(2)) {
                    bArr = null;
                } else {
                    bArr = b4.getBlob(2);
                }
                androidx.work.e g4 = androidx.work.e.g(bArr);
                int i4 = b4.getInt(3);
                int i5 = b4.getInt(4);
                ArrayList arrayList2 = (ArrayList) aVar.get(b4.getString(0));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                ArrayList arrayList3 = arrayList2;
                ArrayList arrayList4 = (ArrayList) aVar2.get(b4.getString(0));
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                arrayList.add(new v.c(str2, f5, g4, i4, i5, arrayList3, arrayList4));
            }
            this.f14499a.B();
            b4.close();
            f4.o();
            this.f14499a.i();
            return arrayList;
        } catch (Throwable th) {
            this.f14499a.i();
            throw th;
        }
    }

    public List u(int i4) {
        u uVar;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        boolean z6;
        int i8;
        boolean z7;
        int i9;
        byte[] bArr3;
        u f4 = u.f("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        f4.U(1, (long) i4);
        this.f14499a.d();
        Cursor b4 = X.b.b(this.f14499a, f4, false, (CancellationSignal) null);
        try {
            int e4 = X.a.e(b4, "id");
            int e5 = X.a.e(b4, "state");
            int e6 = X.a.e(b4, "worker_class_name");
            int e7 = X.a.e(b4, "input_merger_class_name");
            int e8 = X.a.e(b4, "input");
            int e9 = X.a.e(b4, "output");
            int e10 = X.a.e(b4, "initial_delay");
            int e11 = X.a.e(b4, "interval_duration");
            int e12 = X.a.e(b4, "flex_duration");
            int e13 = X.a.e(b4, "run_attempt_count");
            int e14 = X.a.e(b4, "backoff_policy");
            int e15 = X.a.e(b4, "backoff_delay_duration");
            int e16 = X.a.e(b4, "last_enqueue_time");
            int e17 = X.a.e(b4, "minimum_retention_duration");
            uVar = f4;
            try {
                int e18 = X.a.e(b4, "schedule_requested_at");
                int e19 = X.a.e(b4, "run_in_foreground");
                int e20 = X.a.e(b4, "out_of_quota_policy");
                int e21 = X.a.e(b4, "period_count");
                int e22 = X.a.e(b4, "generation");
                int e23 = X.a.e(b4, "required_network_type");
                int e24 = X.a.e(b4, "requires_charging");
                int e25 = X.a.e(b4, "requires_device_idle");
                int e26 = X.a.e(b4, "requires_battery_not_low");
                int e27 = X.a.e(b4, "requires_storage_not_low");
                int e28 = X.a.e(b4, "trigger_content_update_delay");
                int e29 = X.a.e(b4, "trigger_max_content_delay");
                int e30 = X.a.e(b4, "content_uri_triggers");
                int i10 = e17;
                ArrayList arrayList = new ArrayList(b4.getCount());
                while (b4.moveToNext()) {
                    if (b4.isNull(e4)) {
                        str = null;
                    } else {
                        str = b4.getString(e4);
                    }
                    WorkInfo.State f5 = C.f(b4.getInt(e5));
                    if (b4.isNull(e6)) {
                        str2 = null;
                    } else {
                        str2 = b4.getString(e6);
                    }
                    if (b4.isNull(e7)) {
                        str3 = null;
                    } else {
                        str3 = b4.getString(e7);
                    }
                    if (b4.isNull(e8)) {
                        bArr = null;
                    } else {
                        bArr = b4.getBlob(e8);
                    }
                    androidx.work.e g4 = androidx.work.e.g(bArr);
                    if (b4.isNull(e9)) {
                        bArr2 = null;
                    } else {
                        bArr2 = b4.getBlob(e9);
                    }
                    androidx.work.e g5 = androidx.work.e.g(bArr2);
                    long j4 = b4.getLong(e10);
                    long j5 = b4.getLong(e11);
                    long j6 = b4.getLong(e12);
                    int i11 = b4.getInt(e13);
                    BackoffPolicy c4 = C.c(b4.getInt(e14));
                    long j7 = b4.getLong(e15);
                    long j8 = b4.getLong(e16);
                    int i12 = i10;
                    long j9 = b4.getLong(i12);
                    int i13 = e4;
                    int i14 = e18;
                    long j10 = b4.getLong(i14);
                    e18 = i14;
                    int i15 = e19;
                    if (b4.getInt(i15) != 0) {
                        e19 = i15;
                        i5 = e20;
                        z3 = true;
                    } else {
                        e19 = i15;
                        i5 = e20;
                        z3 = false;
                    }
                    OutOfQuotaPolicy e31 = C.e(b4.getInt(i5));
                    e20 = i5;
                    int i16 = e21;
                    int i17 = b4.getInt(i16);
                    e21 = i16;
                    int i18 = e22;
                    int i19 = b4.getInt(i18);
                    e22 = i18;
                    int i20 = e23;
                    NetworkType d4 = C.d(b4.getInt(i20));
                    e23 = i20;
                    int i21 = e24;
                    if (b4.getInt(i21) != 0) {
                        e24 = i21;
                        i6 = e25;
                        z4 = true;
                    } else {
                        e24 = i21;
                        i6 = e25;
                        z4 = false;
                    }
                    if (b4.getInt(i6) != 0) {
                        e25 = i6;
                        i7 = e26;
                        z5 = true;
                    } else {
                        e25 = i6;
                        i7 = e26;
                        z5 = false;
                    }
                    if (b4.getInt(i7) != 0) {
                        e26 = i7;
                        i8 = e27;
                        z6 = true;
                    } else {
                        e26 = i7;
                        i8 = e27;
                        z6 = false;
                    }
                    if (b4.getInt(i8) != 0) {
                        e27 = i8;
                        i9 = e28;
                        z7 = true;
                    } else {
                        e27 = i8;
                        i9 = e28;
                        z7 = false;
                    }
                    long j11 = b4.getLong(i9);
                    e28 = i9;
                    int i22 = e29;
                    long j12 = b4.getLong(i22);
                    e29 = i22;
                    int i23 = e30;
                    if (b4.isNull(i23)) {
                        bArr3 = null;
                    } else {
                        bArr3 = b4.getBlob(i23);
                    }
                    e30 = i23;
                    arrayList.add(new v(str, f5, str2, str3, g4, g5, j4, j5, j6, new androidx.work.b(d4, z4, z5, z6, z7, j11, j12, C.b(bArr3)), i11, c4, j7, j8, j9, j10, z3, e31, i17, i19));
                    e4 = i13;
                    i10 = i12;
                }
                b4.close();
                uVar.o();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b4.close();
                uVar.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            uVar = f4;
            b4.close();
            uVar.o();
            throw th;
        }
    }

    public void v(String str, androidx.work.e eVar) {
        this.f14499a.d();
        Z.k b4 = this.f14505g.b();
        byte[] k4 = androidx.work.e.k(eVar);
        if (k4 == null) {
            b4.B(1);
        } else {
            b4.a0(1, k4);
        }
        if (str == null) {
            b4.B(2);
        } else {
            b4.q(2, str);
        }
        this.f14499a.e();
        try {
            b4.t();
            this.f14499a.B();
        } finally {
            this.f14499a.i();
            this.f14505g.h(b4);
        }
    }

    public int w() {
        this.f14499a.d();
        Z.k b4 = this.f14510l.b();
        this.f14499a.e();
        try {
            int t4 = b4.t();
            this.f14499a.B();
            return t4;
        } finally {
            this.f14499a.i();
            this.f14510l.h(b4);
        }
    }
}
