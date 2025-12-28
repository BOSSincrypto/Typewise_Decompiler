package Z;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;
import kotlin.jvm.internal.o;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f2131a = new c();

    private c() {
    }

    public static final Uri a(Cursor cursor) {
        o.e(cursor, "cursor");
        Uri notificationUri = cursor.getNotificationUri();
        o.d(notificationUri, "cursor.notificationUri");
        return notificationUri;
    }

    public static final boolean b(ActivityManager activityManager) {
        o.e(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }
}
