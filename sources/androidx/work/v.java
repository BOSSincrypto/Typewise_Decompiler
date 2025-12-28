package androidx.work;

import android.content.Context;

public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    private static final String f7446a = m.i("WorkerFactory");

    class a extends v {
        a() {
        }

        public l a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static v c() {
        return new a();
    }

    public abstract l a(Context context, String str, WorkerParameters workerParameters);

    public final l b(Context context, String str, WorkerParameters workerParameters) {
        Class<? extends U> cls;
        l a4 = a(context, str, workerParameters);
        if (a4 == null) {
            try {
                cls = Class.forName(str).asSubclass(l.class);
            } catch (Throwable th) {
                m e4 = m.e();
                String str2 = f7446a;
                e4.d(str2, "Invalid class: " + str, th);
                cls = null;
            }
            if (cls != null) {
                try {
                    a4 = (l) cls.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
                } catch (Throwable th2) {
                    m e5 = m.e();
                    String str3 = f7446a;
                    e5.d(str3, "Could not instantiate " + str, th2);
                }
            }
        }
        if (a4 == null || !a4.k()) {
            return a4;
        }
        String name = getClass().getName();
        throw new IllegalStateException("WorkerFactory (" + name + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
