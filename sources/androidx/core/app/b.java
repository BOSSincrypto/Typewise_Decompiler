package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;

public abstract class b extends androidx.core.content.a {

    static class a {
        static void a(Activity activity) {
            activity.finishAffinity();
        }

        static void b(Activity activity, Intent intent, int i4, Bundle bundle) {
            activity.startActivityForResult(intent, i4, bundle);
        }

        static void c(Activity activity, IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7, Bundle bundle) {
            activity.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7, bundle);
        }
    }

    /* renamed from: androidx.core.app.b$b  reason: collision with other inner class name */
    static class C0065b {
        static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    static class c {
        static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        static void b(Activity activity, String[] strArr, int i4) {
            activity.requestPermissions(strArr, i4);
        }

        static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    static class d {
        static boolean a(Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        static boolean b(Activity activity, String str) {
            try {
                PackageManager packageManager = activity.getApplication().getPackageManager();
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", new Class[]{String.class}).invoke(packageManager, new Object[]{str})).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    static class e {
        static boolean a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public interface f {
        void validateRequestPermissionsRequestCode(int i4);
    }

    public static void m(Activity activity) {
        a.a(activity);
    }

    public static void n(Activity activity) {
        C0065b.a(activity);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void o(Activity activity) {
        if (!activity.isFinishing() && !d.i(activity)) {
            activity.recreate();
        }
    }

    public static void p(Activity activity) {
        C0065b.b(activity);
    }

    public static void q(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new a(activity));
        }
    }

    public static void r(Activity activity, String[] strArr, int i4) {
        String[] strArr2;
        HashSet hashSet = new HashSet();
        int i5 = 0;
        while (i5 < strArr.length) {
            if (!TextUtils.isEmpty(strArr[i5])) {
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i5], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i5));
                }
                i5++;
            } else {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            strArr2 = new String[(strArr.length - size)];
        } else {
            strArr2 = strArr;
        }
        if (size > 0) {
            if (size != strArr.length) {
                int i6 = 0;
                for (int i7 = 0; i7 < strArr.length; i7++) {
                    if (!hashSet.contains(Integer.valueOf(i7))) {
                        strArr2[i6] = strArr[i7];
                        i6++;
                    }
                }
            } else {
                return;
            }
        }
        if (activity instanceof f) {
            ((f) activity).validateRequestPermissionsRequestCode(i4);
        }
        c.b(activity, strArr, i4);
    }

    public static void s(Activity activity, p pVar) {
        C0065b.c(activity, (SharedElementCallback) null);
    }

    public static void t(Activity activity, p pVar) {
        C0065b.d(activity, (SharedElementCallback) null);
    }

    public static boolean u(Activity activity, String str) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i4 >= 32) {
            return e.a(activity, str);
        }
        if (i4 == 31) {
            return d.b(activity, str);
        }
        return c.c(activity, str);
    }

    public static void v(Activity activity, Intent intent, int i4, Bundle bundle) {
        a.b(activity, intent, i4, bundle);
    }

    public static void w(Activity activity, IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7, Bundle bundle) {
        a.c(activity, intentSender, i4, intent, i5, i6, i7, bundle);
    }

    public static void x(Activity activity) {
        C0065b.e(activity);
    }
}
