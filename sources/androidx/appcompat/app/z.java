package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ServiceInfo;
import android.os.Build;
import kotlin.uuid.Uuid;

public abstract class z extends Service {

    private static class a {
        static int a() {
            return 512;
        }
    }

    public static ServiceInfo a(Context context) {
        int i4;
        if (Build.VERSION.SDK_INT >= 24) {
            i4 = a.a() | Uuid.SIZE_BITS;
        } else {
            i4 = 640;
        }
        return context.getPackageManager().getServiceInfo(new ComponentName(context, z.class), i4);
    }
}
