package l0;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.h;
import androidx.room.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l0.j;

public final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    private final RoomDatabase f14446a;

    /* renamed from: b  reason: collision with root package name */
    private final h f14447b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedSQLiteStatement f14448c;

    /* renamed from: d  reason: collision with root package name */
    private final SharedSQLiteStatement f14449d;

    class a extends h {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String e() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        /* renamed from: k */
        public void i(Z.k kVar, i iVar) {
            String str = iVar.f14443a;
            if (str == null) {
                kVar.B(1);
            } else {
                kVar.q(1, str);
            }
            kVar.U(2, (long) iVar.a());
            kVar.U(3, (long) iVar.f14445c);
        }
    }

    class b extends SharedSQLiteStatement {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    class c extends SharedSQLiteStatement {
        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public k(RoomDatabase roomDatabase) {
        this.f14446a = roomDatabase;
        this.f14447b = new a(roomDatabase);
        this.f14448c = new b(roomDatabase);
        this.f14449d = new c(roomDatabase);
    }

    public static List h() {
        return Collections.emptyList();
    }

    public void a(m mVar) {
        j.a.b(this, mVar);
    }

    public List b() {
        String str;
        u f4 = u.f("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f14446a.d();
        Cursor b4 = X.b.b(this.f14446a, f4, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b4.getCount());
            while (b4.moveToNext()) {
                if (b4.isNull(0)) {
                    str = null;
                } else {
                    str = b4.getString(0);
                }
                arrayList.add(str);
            }
            return arrayList;
        } finally {
            b4.close();
            f4.o();
        }
    }

    public i c(m mVar) {
        return j.a.a(this, mVar);
    }

    public void d(String str, int i4) {
        this.f14446a.d();
        Z.k b4 = this.f14448c.b();
        if (str == null) {
            b4.B(1);
        } else {
            b4.q(1, str);
        }
        b4.U(2, (long) i4);
        this.f14446a.e();
        try {
            b4.t();
            this.f14446a.B();
        } finally {
            this.f14446a.i();
            this.f14448c.h(b4);
        }
    }

    public void e(String str) {
        this.f14446a.d();
        Z.k b4 = this.f14449d.b();
        if (str == null) {
            b4.B(1);
        } else {
            b4.q(1, str);
        }
        this.f14446a.e();
        try {
            b4.t();
            this.f14446a.B();
        } finally {
            this.f14446a.i();
            this.f14449d.h(b4);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: l0.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l0.i f(java.lang.String r6, int r7) {
        /*
            r5 = this;
            java.lang.String r0 = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"
            r1 = 2
            androidx.room.u r0 = androidx.room.u.f(r0, r1)
            r2 = 1
            if (r6 != 0) goto L_0x000e
            r0.B(r2)
            goto L_0x0011
        L_0x000e:
            r0.q(r2, r6)
        L_0x0011:
            long r6 = (long) r7
            r0.U(r1, r6)
            androidx.room.RoomDatabase r6 = r5.f14446a
            r6.d()
            androidx.room.RoomDatabase r6 = r5.f14446a
            r7 = 0
            r1 = 0
            android.database.Cursor r6 = X.b.b(r6, r0, r7, r1)
            java.lang.String r7 = "work_spec_id"
            int r7 = X.a.e(r6, r7)     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = "generation"
            int r2 = X.a.e(r6, r2)     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = "system_id"
            int r3 = X.a.e(r6, r3)     // Catch:{ all -> 0x0054 }
            boolean r4 = r6.moveToFirst()     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x0056
            boolean r4 = r6.isNull(r7)     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x0041
            goto L_0x0045
        L_0x0041:
            java.lang.String r1 = r6.getString(r7)     // Catch:{ all -> 0x0054 }
        L_0x0045:
            int r7 = r6.getInt(r2)     // Catch:{ all -> 0x0054 }
            int r2 = r6.getInt(r3)     // Catch:{ all -> 0x0054 }
            l0.i r3 = new l0.i     // Catch:{ all -> 0x0054 }
            r3.<init>(r1, r7, r2)     // Catch:{ all -> 0x0054 }
            r1 = r3
            goto L_0x0056
        L_0x0054:
            r7 = move-exception
            goto L_0x005d
        L_0x0056:
            r6.close()
            r0.o()
            return r1
        L_0x005d:
            r6.close()
            r0.o()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.k.f(java.lang.String, int):l0.i");
    }

    public void g(i iVar) {
        this.f14446a.d();
        this.f14446a.e();
        try {
            this.f14447b.j(iVar);
            this.f14446a.B();
        } finally {
            this.f14446a.i();
        }
    }
}
