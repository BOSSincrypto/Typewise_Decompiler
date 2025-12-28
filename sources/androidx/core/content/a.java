package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.app.m;
import androidx.core.content.res.h;
import java.io.File;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f4899a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f4900b = new Object();

    /* renamed from: androidx.core.content.a$a  reason: collision with other inner class name */
    static class C0069a {
        static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    static class b {
        static File[] a(Context context) {
            return context.getExternalCacheDirs();
        }

        static File[] b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        static File[] c(Context context) {
            return context.getObbDirs();
        }
    }

    static class c {
        static File a(Context context) {
            return context.getCodeCacheDir();
        }

        static Drawable b(Context context, int i4) {
            return context.getDrawable(i4);
        }

        static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    static class d {
        static int a(Context context, int i4) {
            return context.getColor(i4);
        }

        static <T> T b(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    static class e {
        static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i4) {
            if ((i4 & 4) != 0 && str == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, a.h(context), handler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i4 & 1);
        }

        static ComponentName b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    public static int a(Context context, String str) {
        androidx.core.util.c.d(str, "permission must be non-null");
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        if (m.d(context).a()) {
            return 0;
        }
        return -1;
    }

    public static int b(Context context, int i4) {
        return d.a(context, i4);
    }

    public static ColorStateList c(Context context, int i4) {
        return h.d(context.getResources(), i4, context.getTheme());
    }

    public static Drawable d(Context context, int i4) {
        return c.b(context, i4);
    }

    public static File[] e(Context context) {
        return b.a(context);
    }

    public static File[] f(Context context, String str) {
        return b.b(context, str);
    }

    public static Object g(Context context, Class cls) {
        return d.b(context, cls);
    }

    static String h(Context context) {
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (b.b(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static boolean i(Context context, Intent[] intentArr, Bundle bundle) {
        C0069a.a(context, intentArr, bundle);
        return true;
    }

    public static void j(Context context, Intent intent, Bundle bundle) {
        C0069a.b(context, intent, bundle);
    }

    public static void k(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            e.b(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
