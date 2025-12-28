package Z;

import android.database.Cursor;
import android.os.Bundle;
import kotlin.jvm.internal.o;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f2133a = new e();

    private e() {
    }

    public static final void a(Cursor cursor, Bundle bundle) {
        o.e(cursor, "cursor");
        o.e(bundle, "extras");
        cursor.setExtras(bundle);
    }
}
