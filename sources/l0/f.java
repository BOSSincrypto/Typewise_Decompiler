package l0;

import X.b;
import Z.k;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import androidx.room.h;
import androidx.room.u;
import java.util.Collections;
import java.util.List;

public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final RoomDatabase f14440a;

    /* renamed from: b  reason: collision with root package name */
    private final h f14441b;

    class a extends h {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String e() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void i(k kVar, d dVar) {
            if (dVar.a() == null) {
                kVar.B(1);
            } else {
                kVar.q(1, dVar.a());
            }
            if (dVar.b() == null) {
                kVar.B(2);
            } else {
                kVar.U(2, dVar.b().longValue());
            }
        }
    }

    public f(RoomDatabase roomDatabase) {
        this.f14440a = roomDatabase;
        this.f14441b = new a(roomDatabase);
    }

    public static List c() {
        return Collections.emptyList();
    }

    public void a(d dVar) {
        this.f14440a.d();
        this.f14440a.e();
        try {
            this.f14441b.j(dVar);
            this.f14440a.B();
        } finally {
            this.f14440a.i();
        }
    }

    public Long b(String str) {
        u f4 = u.f("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            f4.B(1);
        } else {
            f4.q(1, str);
        }
        this.f14440a.d();
        Long l4 = null;
        Cursor b4 = b.b(this.f14440a, f4, false, (CancellationSignal) null);
        try {
            if (b4.moveToFirst()) {
                if (!b4.isNull(0)) {
                    l4 = Long.valueOf(b4.getLong(0));
                }
            }
            return l4;
        } finally {
            b4.close();
            f4.o();
        }
    }
}
