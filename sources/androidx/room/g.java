package androidx.room;

import Z.k;
import kotlin.jvm.internal.o;

public abstract class g extends SharedSQLiteStatement {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(RoomDatabase roomDatabase) {
        super(roomDatabase);
        o.e(roomDatabase, "database");
    }

    /* access modifiers changed from: protected */
    public abstract void i(k kVar, Object obj);

    public final int j(Object obj) {
        k b4 = b();
        try {
            i(b4, obj);
            return b4.t();
        } finally {
            h(b4);
        }
    }
}
