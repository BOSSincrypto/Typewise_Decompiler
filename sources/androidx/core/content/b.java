package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.e;
import androidx.core.util.c;

public abstract class b {
    public static int a(Context context, String str, int i4, int i5, String str2) {
        int i6;
        if (context.checkPermission(str, i4, i5) == -1) {
            return -1;
        }
        String c4 = e.c(str);
        if (c4 == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i5);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (myUid != i5 || !c.a(packageName, str2)) {
            i6 = e.b(context, c4, str2);
        } else {
            i6 = e.a(context, i5, c4, str2);
        }
        if (i6 == 0) {
            return 0;
        }
        return -2;
    }

    public static int b(Context context, String str) {
        return a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
