package a1;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final int f2237a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2238b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f2239c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2240d;

    public static final class a {

        /* renamed from: i  reason: collision with root package name */
        static final int f2241i;

        /* renamed from: a  reason: collision with root package name */
        final Context f2242a;

        /* renamed from: b  reason: collision with root package name */
        ActivityManager f2243b;

        /* renamed from: c  reason: collision with root package name */
        c f2244c;

        /* renamed from: d  reason: collision with root package name */
        float f2245d = 2.0f;

        /* renamed from: e  reason: collision with root package name */
        float f2246e = ((float) f2241i);

        /* renamed from: f  reason: collision with root package name */
        float f2247f = 0.4f;

        /* renamed from: g  reason: collision with root package name */
        float f2248g = 0.33f;

        /* renamed from: h  reason: collision with root package name */
        int f2249h = 4194304;

        static {
            int i4;
            if (Build.VERSION.SDK_INT < 26) {
                i4 = 4;
            } else {
                i4 = 1;
            }
            f2241i = i4;
        }

        public a(Context context) {
            this.f2242a = context;
            this.f2243b = (ActivityManager) context.getSystemService("activity");
            this.f2244c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && i.e(this.f2243b)) {
                this.f2246e = 0.0f;
            }
        }

        public i a() {
            return new i(this);
        }
    }

    private static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final DisplayMetrics f2250a;

        b(DisplayMetrics displayMetrics) {
            this.f2250a = displayMetrics;
        }

        public int a() {
            return this.f2250a.heightPixels;
        }

        public int b() {
            return this.f2250a.widthPixels;
        }
    }

    interface c {
        int a();

        int b();
    }

    i(a aVar) {
        int i4;
        boolean z3;
        this.f2239c = aVar.f2242a;
        if (e(aVar.f2243b)) {
            i4 = aVar.f2249h / 2;
        } else {
            i4 = aVar.f2249h;
        }
        this.f2240d = i4;
        int c4 = c(aVar.f2243b, aVar.f2247f, aVar.f2248g);
        float b4 = (float) (aVar.f2244c.b() * aVar.f2244c.a() * 4);
        int round = Math.round(aVar.f2246e * b4);
        int round2 = Math.round(b4 * aVar.f2245d);
        int i5 = c4 - i4;
        int i6 = round2 + round;
        if (i6 <= i5) {
            this.f2238b = round2;
            this.f2237a = round;
        } else {
            float f4 = (float) i5;
            float f5 = aVar.f2246e;
            float f6 = aVar.f2245d;
            float f7 = f4 / (f5 + f6);
            this.f2238b = Math.round(f6 * f7);
            this.f2237a = Math.round(f7 * aVar.f2246e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(f(this.f2238b));
            sb.append(", pool size: ");
            sb.append(f(this.f2237a));
            sb.append(", byte array size: ");
            sb.append(f(i4));
            sb.append(", memory class limited? ");
            if (i6 > c4) {
                z3 = true;
            } else {
                z3 = false;
            }
            sb.append(z3);
            sb.append(", max size: ");
            sb.append(f(c4));
            sb.append(", memoryClass: ");
            sb.append(aVar.f2243b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(e(aVar.f2243b));
        }
    }

    private static int c(ActivityManager activityManager, float f4, float f5) {
        boolean e4 = e(activityManager);
        float memoryClass = (float) (activityManager.getMemoryClass() * 1048576);
        if (e4) {
            f4 = f5;
        }
        return Math.round(memoryClass * f4);
    }

    static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String f(int i4) {
        return Formatter.formatFileSize(this.f2239c, (long) i4);
    }

    public int a() {
        return this.f2240d;
    }

    public int b() {
        return this.f2237a;
    }

    public int d() {
        return this.f2238b;
    }
}
