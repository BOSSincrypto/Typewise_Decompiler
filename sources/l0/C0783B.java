package l0;

import Z.k;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.h;
import androidx.room.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import l0.C0782A;

/* renamed from: l0.B  reason: case insensitive filesystem */
public final class C0783B implements C0782A {

    /* renamed from: a  reason: collision with root package name */
    private final RoomDatabase f14423a;

    /* renamed from: b  reason: collision with root package name */
    private final h f14424b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedSQLiteStatement f14425c;

    /* renamed from: l0.B$a */
    class a extends h {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String e() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void i(k kVar, z zVar) {
            if (zVar.a() == null) {
                kVar.B(1);
            } else {
                kVar.q(1, zVar.a());
            }
            if (zVar.b() == null) {
                kVar.B(2);
            } else {
                kVar.q(2, zVar.b());
            }
        }
    }

    /* renamed from: l0.B$b */
    class b extends SharedSQLiteStatement {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String e() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public C0783B(RoomDatabase roomDatabase) {
        this.f14423a = roomDatabase;
        this.f14424b = new a(roomDatabase);
        this.f14425c = new b(roomDatabase);
    }

    public static List e() {
        return Collections.emptyList();
    }

    public void a(z zVar) {
        this.f14423a.d();
        this.f14423a.e();
        try {
            this.f14424b.j(zVar);
            this.f14423a.B();
        } finally {
            this.f14423a.i();
        }
    }

    public void b(String str, Set set) {
        C0782A.a.a(this, str, set);
    }

    public void c(String str) {
        this.f14423a.d();
        k b4 = this.f14425c.b();
        if (str == null) {
            b4.B(1);
        } else {
            b4.q(1, str);
        }
        this.f14423a.e();
        try {
            b4.t();
            this.f14423a.B();
        } finally {
            this.f14423a.i();
            this.f14425c.h(b4);
        }
    }

    public List d(String str) {
        String str2;
        u f4 = u.f("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            f4.B(1);
        } else {
            f4.q(1, str);
        }
        this.f14423a.d();
        Cursor b4 = X.b.b(this.f14423a, f4, false, (CancellationSignal) null);
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
}
