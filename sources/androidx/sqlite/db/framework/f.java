package androidx.sqlite.db.framework;

import Z.k;
import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.o;

public final class f extends e implements k {

    /* renamed from: b  reason: collision with root package name */
    private final SQLiteStatement f6938b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        o.e(sQLiteStatement, "delegate");
        this.f6938b = sQLiteStatement;
    }

    public long k0() {
        return this.f6938b.executeInsert();
    }

    public int t() {
        return this.f6938b.executeUpdateDelete();
    }
}
