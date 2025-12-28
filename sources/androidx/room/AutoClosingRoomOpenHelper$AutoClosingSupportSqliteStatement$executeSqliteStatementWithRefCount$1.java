package androidx.room;

import Z.g;
import Z.k;
import androidx.room.AutoClosingRoomOpenHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import u2.l;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LZ/g;", "db", "invoke", "(LZ/g;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
final class AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeSqliteStatementWithRefCount$1 extends Lambda implements l {
    final /* synthetic */ l $block;
    final /* synthetic */ AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeSqliteStatementWithRefCount$1(AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement autoClosingSupportSqliteStatement, l lVar) {
        super(1);
        this.this$0 = autoClosingSupportSqliteStatement;
        this.$block = lVar;
    }

    public final Object invoke(g gVar) {
        o.e(gVar, "db");
        k u3 = gVar.u(this.this$0.f6718a);
        this.this$0.f(u3);
        return this.$block.invoke(u3);
    }
}
