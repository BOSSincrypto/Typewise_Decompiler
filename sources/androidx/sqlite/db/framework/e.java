package androidx.sqlite.db.framework;

import Z.i;
import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.o;

public class e implements i {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteProgram f6937a;

    public e(SQLiteProgram sQLiteProgram) {
        o.e(sQLiteProgram, "delegate");
        this.f6937a = sQLiteProgram;
    }

    public void B(int i4) {
        this.f6937a.bindNull(i4);
    }

    public void E(int i4, double d4) {
        this.f6937a.bindDouble(i4, d4);
    }

    public void U(int i4, long j4) {
        this.f6937a.bindLong(i4, j4);
    }

    public void a0(int i4, byte[] bArr) {
        o.e(bArr, "value");
        this.f6937a.bindBlob(i4, bArr);
    }

    public void close() {
        this.f6937a.close();
    }

    public void q(int i4, String str) {
        o.e(str, "value");
        this.f6937a.bindString(i4, str);
    }
}
