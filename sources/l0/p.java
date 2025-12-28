package l0;

import X.b;
import Z.k;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import androidx.room.h;
import androidx.room.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class p implements o {

    /* renamed from: a  reason: collision with root package name */
    private final RoomDatabase f14457a;

    /* renamed from: b  reason: collision with root package name */
    private final h f14458b;

    class a extends h {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String e() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void i(k kVar, n nVar) {
            if (nVar.a() == null) {
                kVar.B(1);
            } else {
                kVar.q(1, nVar.a());
            }
            if (nVar.b() == null) {
                kVar.B(2);
            } else {
                kVar.q(2, nVar.b());
            }
        }
    }

    public p(RoomDatabase roomDatabase) {
        this.f14457a = roomDatabase;
        this.f14458b = new a(roomDatabase);
    }

    public static List c() {
        return Collections.emptyList();
    }

    public void a(n nVar) {
        this.f14457a.d();
        this.f14457a.e();
        try {
            this.f14458b.j(nVar);
            this.f14457a.B();
        } finally {
            this.f14457a.i();
        }
    }

    public List b(String str) {
        String str2;
        u f4 = u.f("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            f4.B(1);
        } else {
            f4.q(1, str);
        }
        this.f14457a.d();
        Cursor b4 = b.b(this.f14457a, f4, false, (CancellationSignal) null);
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
