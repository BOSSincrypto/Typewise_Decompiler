package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

public abstract class h {

    static class a {
        static Intent a(Activity activity) {
            return activity.getParentActivityIntent();
        }

        static boolean b(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        static boolean c(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    public static Intent a(Activity activity) {
        Intent a4 = a.a(activity);
        if (a4 != null) {
            return a4;
        }
        String c4 = c(activity);
        if (c4 == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, c4);
        try {
            if (d(activity, componentName) == null) {
                return Intent.makeMainActivity(componentName);
            }
            return new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + c4 + "' in manifest");
            return null;
        }
    }

    public static Intent b(Context context, ComponentName componentName) {
        String d4 = d(context, componentName);
        if (d4 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), d4);
        if (d(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String c(Activity activity) {
        try {
            return d(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static String d(Context context, ComponentName componentName) {
        int i4;
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            i4 = 269222528;
        } else if (i5 >= 24) {
            i4 = 787072;
        } else {
            i4 = 640;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i4);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static void e(Activity activity, Intent intent) {
        a.b(activity, intent);
    }

    public static boolean f(Activity activity, Intent intent) {
        return a.c(activity, intent);
    }
}
