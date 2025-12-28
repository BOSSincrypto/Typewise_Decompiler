package androidx.room;

import Z.g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
import u2.l;

@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1 extends FunctionReferenceImpl implements l {
    public static final AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1 INSTANCE = new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1();

    AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1() {
        super(1, g.class, "inTransaction", "inTransaction()Z", 0);
    }

    public final Boolean invoke(g gVar) {
        o.e(gVar, "p0");
        return Boolean.valueOf(gVar.M());
    }
}
