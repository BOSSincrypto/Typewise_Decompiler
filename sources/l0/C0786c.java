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

/* renamed from: l0.c  reason: case insensitive filesystem */
public final class C0786c implements C0785b {

    /* renamed from: a  reason: collision with root package name */
    private final RoomDatabase f14435a;

    /* renamed from: b  reason: collision with root package name */
    private final h f14436b;

    /* renamed from: l0.c$a */
    class a extends h {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String e() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void i(k kVar, C0784a aVar) {
            if (aVar.b() == null) {
                kVar.B(1);
            } else {
                kVar.q(1, aVar.b());
            }
            if (aVar.a() == null) {
                kVar.B(2);
            } else {
                kVar.q(2, aVar.a());
            }
        }
    }

    public C0786c(RoomDatabase roomDatabase) {
        this.f14435a = roomDatabase;
        this.f14436b = new a(roomDatabase);
    }

    public static List e() {
        return Collections.emptyList();
    }

    public boolean a(String str) {
        boolean z3 = true;
        u f4 = u.f("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            f4.B(1);
        } else {
            f4.q(1, str);
        }
        this.f14435a.d();
        boolean z4 = false;
        Cursor b4 = b.b(this.f14435a, f4, false, (CancellationSignal) null);
        try {
            if (b4.moveToFirst()) {
                if (b4.getInt(0) == 0) {
                    z3 = false;
                }
                z4 = z3;
            }
            return z4;
        } finally {
            b4.close();
            f4.o();
        }
    }

    public void b(C0784a aVar) {
        this.f14435a.d();
        this.f14435a.e();
        try {
            this.f14436b.j(aVar);
            this.f14435a.B();
        } finally {
            this.f14435a.i();
        }
    }

    public boolean c(String str) {
        boolean z3 = true;
        u f4 = u.f("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            f4.B(1);
        } else {
            f4.q(1, str);
        }
        this.f14435a.d();
        boolean z4 = false;
        Cursor b4 = b.b(this.f14435a, f4, false, (CancellationSignal) null);
        try {
            if (b4.moveToFirst()) {
                if (b4.getInt(0) == 0) {
                    z3 = false;
                }
                z4 = z3;
            }
            return z4;
        } finally {
            b4.close();
            f4.o();
        }
    }

    public List d(String str) {
        String str2;
        u f4 = u.f("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            f4.B(1);
        } else {
            f4.q(1, str);
        }
        this.f14435a.d();
        Cursor b4 = b.b(this.f14435a, f4, false, (CancellationSignal) null);
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
