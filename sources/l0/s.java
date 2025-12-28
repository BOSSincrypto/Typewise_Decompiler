package l0;

import Z.k;
import androidx.appcompat.app.F;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.h;
import java.util.Collections;
import java.util.List;

public final class s implements r {

    /* renamed from: a  reason: collision with root package name */
    private final RoomDatabase f14460a;

    /* renamed from: b  reason: collision with root package name */
    private final h f14461b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedSQLiteStatement f14462c;

    /* renamed from: d  reason: collision with root package name */
    private final SharedSQLiteStatement f14463d;

    class a extends h {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String e() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        public /* bridge */ /* synthetic */ void i(k kVar, Object obj) {
            F.a(obj);
            k(kVar, (q) null);
        }

        public void k(k kVar, q qVar) {
            throw null;
        }
    }

    class b extends SharedSQLiteStatement {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String e() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    class c extends SharedSQLiteStatement {
        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String e() {
            return "DELETE FROM WorkProgress";
        }
    }

    public s(RoomDatabase roomDatabase) {
        this.f14460a = roomDatabase;
        this.f14461b = new a(roomDatabase);
        this.f14462c = new b(roomDatabase);
        this.f14463d = new c(roomDatabase);
    }

    public static List c() {
        return Collections.emptyList();
    }

    public void a(String str) {
        this.f14460a.d();
        k b4 = this.f14462c.b();
        if (str == null) {
            b4.B(1);
        } else {
            b4.q(1, str);
        }
        this.f14460a.e();
        try {
            b4.t();
            this.f14460a.B();
        } finally {
            this.f14460a.i();
            this.f14462c.h(b4);
        }
    }

    public void b() {
        this.f14460a.d();
        k b4 = this.f14463d.b();
        this.f14460a.e();
        try {
            b4.t();
            this.f14460a.B();
        } finally {
            this.f14460a.i();
            this.f14463d.h(b4);
        }
    }
}
