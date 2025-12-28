package com.getcapacitor.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.core.content.a;
import java.util.ArrayList;
import java.util.Arrays;

public class PermissionHelper {
    public static String[] getManifestPermissions(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            if (packageInfo != null) {
                return packageInfo.requestedPermissions;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String[] getUndefinedPermissions(Context context, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        String[] manifestPermissions = getManifestPermissions(context);
        if (manifestPermissions == null || manifestPermissions.length <= 0) {
            return strArr;
        }
        ArrayList arrayList2 = new ArrayList(Arrays.asList(manifestPermissions));
        for (String str : strArr) {
            if (!arrayList2.contains(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean hasDefinedPermission(Context context, String str) {
        String[] manifestPermissions = getManifestPermissions(context);
        if (manifestPermissions == null || manifestPermissions.length <= 0 || !new ArrayList(Arrays.asList(manifestPermissions)).contains(str)) {
            return false;
        }
        return true;
    }

    public static boolean hasDefinedPermissions(Context context, String[] strArr) {
        for (String hasDefinedPermission : strArr) {
            if (!hasDefinedPermission(context, hasDefinedPermission)) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasPermissions(Context context, String[] strArr) {
        for (String a4 : strArr) {
            if (a.a(context, a4) != 0) {
                return false;
            }
        }
        return true;
    }
}
