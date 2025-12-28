package androidx.work;

import android.util.Log;

public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f7428a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static volatile m f7429b = null;

    /* renamed from: c  reason: collision with root package name */
    private static final int f7430c = 20;

    public static class a extends m {

        /* renamed from: d  reason: collision with root package name */
        private final int f7431d;

        public a(int i4) {
            super(i4);
            this.f7431d = i4;
        }

        public void a(String str, String str2) {
        }

        public void b(String str, String str2, Throwable th) {
        }

        public void c(String str, String str2) {
            if (this.f7431d <= 6) {
                Log.e(str, str2);
            }
        }

        public void d(String str, String str2, Throwable th) {
            if (this.f7431d <= 6) {
                Log.e(str, str2, th);
            }
        }

        public void f(String str, String str2) {
        }

        public void g(String str, String str2, Throwable th) {
        }

        public void j(String str, String str2) {
        }

        public void k(String str, String str2) {
            if (this.f7431d <= 5) {
                Log.w(str, str2);
            }
        }

        public void l(String str, String str2, Throwable th) {
            if (this.f7431d <= 5) {
                Log.w(str, str2, th);
            }
        }
    }

    public m(int i4) {
    }

    public static m e() {
        m mVar;
        synchronized (f7428a) {
            try {
                if (f7429b == null) {
                    f7429b = new a(3);
                }
                mVar = f7429b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }

    public static void h(m mVar) {
        synchronized (f7428a) {
            f7429b = mVar;
        }
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i4 = f7430c;
        if (length >= i4) {
            sb.append(str.substring(0, i4));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th);

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th);

    public abstract void f(String str, String str2);

    public abstract void g(String str, String str2, Throwable th);

    public abstract void j(String str, String str2);

    public abstract void k(String str, String str2);

    public abstract void l(String str, String str2, Throwable th);
}
