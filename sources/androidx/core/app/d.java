package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

abstract class d {

    /* renamed from: a  reason: collision with root package name */
    protected static final Class f4743a;

    /* renamed from: b  reason: collision with root package name */
    protected static final Field f4744b = b();

    /* renamed from: c  reason: collision with root package name */
    protected static final Field f4745c = f();

    /* renamed from: d  reason: collision with root package name */
    protected static final Method f4746d;

    /* renamed from: e  reason: collision with root package name */
    protected static final Method f4747e;

    /* renamed from: f  reason: collision with root package name */
    protected static final Method f4748f;

    /* renamed from: g  reason: collision with root package name */
    private static final Handler f4749g = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0066d f4750a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f4751b;

        a(C0066d dVar, Object obj) {
            this.f4750a = dVar;
            this.f4751b = obj;
        }

        public void run() {
            this.f4750a.f4756a = this.f4751b;
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Application f4752a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C0066d f4753b;

        b(Application application, C0066d dVar) {
            this.f4752a = application;
            this.f4753b = dVar;
        }

        public void run() {
            this.f4752a.unregisterActivityLifecycleCallbacks(this.f4753b);
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f4754a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f4755b;

        c(Object obj, Object obj2) {
            this.f4754a = obj;
            this.f4755b = obj2;
        }

        public void run() {
            try {
                Method method = d.f4746d;
                if (method != null) {
                    method.invoke(this.f4754a, new Object[]{this.f4755b, Boolean.FALSE, "AppCompat recreation"});
                    return;
                }
                d.f4747e.invoke(this.f4754a, new Object[]{this.f4755b, Boolean.FALSE});
            } catch (RuntimeException e4) {
                if (e4.getClass() == RuntimeException.class && e4.getMessage() != null && e4.getMessage().startsWith("Unable to stop")) {
                    throw e4;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.d$d  reason: collision with other inner class name */
    private static final class C0066d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        Object f4756a;

        /* renamed from: b  reason: collision with root package name */
        private Activity f4757b;

        /* renamed from: c  reason: collision with root package name */
        private final int f4758c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f4759d = false;

        /* renamed from: e  reason: collision with root package name */
        private boolean f4760e = false;

        /* renamed from: f  reason: collision with root package name */
        private boolean f4761f = false;

        C0066d(Activity activity) {
            this.f4757b = activity;
            this.f4758c = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f4757b == activity) {
                this.f4757b = null;
                this.f4760e = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f4760e && !this.f4761f && !this.f4759d && d.h(this.f4756a, this.f4758c, activity)) {
                this.f4761f = true;
                this.f4756a = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f4757b == activity) {
                this.f4759d = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class a4 = a();
        f4743a = a4;
        f4746d = d(a4);
        f4747e = c(a4);
        f4748f = e(a4);
    }

    private static Class a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class cls) {
        if (g() && cls != null) {
            try {
                Class<List> cls2 = List.class;
                Class cls3 = Boolean.TYPE;
                Class<Configuration> cls4 = Configuration.class;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, cls2, cls2, Integer.TYPE, cls3, cls4, cls4, cls3, cls3});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 == 26 || i4 == 27) {
            return true;
        }
        return false;
    }

    protected static boolean h(Object obj, int i4, Activity activity) {
        try {
            Object obj2 = f4745c.get(activity);
            if (obj2 == obj) {
                if (activity.hashCode() == i4) {
                    f4749g.postAtFrontOfQueue(new c(f4744b.get(activity), obj2));
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        Application application;
        C0066d dVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f4748f == null) {
            return false;
        } else {
            if (f4747e == null && f4746d == null) {
                return false;
            }
            try {
                Object obj2 = f4745c.get(activity);
                if (obj2 == null || (obj = f4744b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new C0066d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f4749g;
                handler.post(new a(dVar, obj2));
                if (g()) {
                    Method method = f4748f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
