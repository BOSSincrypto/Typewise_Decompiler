package Z;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.o;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f2134a = new f();

    private f() {
    }

    public static final List a(Cursor cursor) {
        o.e(cursor, "cursor");
        List<Uri> notificationUris = cursor.getNotificationUris();
        o.b(notificationUris);
        return notificationUris;
    }

    public static final void b(Cursor cursor, ContentResolver contentResolver, List list) {
        o.e(cursor, "cursor");
        o.e(contentResolver, "cr");
        o.e(list, "uris");
        cursor.setNotificationUris(contentResolver, list);
    }
}
