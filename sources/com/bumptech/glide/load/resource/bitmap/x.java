package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.uuid.Uuid;

public final class x {

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f11146g;

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f11147h;

    /* renamed from: i  reason: collision with root package name */
    private static final File f11148i = new File("/proc/self/fd");

    /* renamed from: j  reason: collision with root package name */
    private static volatile x f11149j;

    /* renamed from: k  reason: collision with root package name */
    private static volatile int f11150k = -1;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f11151a = f();

    /* renamed from: b  reason: collision with root package name */
    private final int f11152b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11153c;

    /* renamed from: d  reason: collision with root package name */
    private int f11154d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11155e = true;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f11156f = new AtomicBoolean(false);

    static {
        boolean z3;
        int i4 = Build.VERSION.SDK_INT;
        boolean z4 = false;
        if (i4 < 29) {
            z3 = true;
        } else {
            z3 = false;
        }
        f11146g = z3;
        if (i4 >= 26) {
            z4 = true;
        }
        f11147h = z4;
    }

    x() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f11152b = 20000;
            this.f11153c = 0;
            return;
        }
        this.f11152b = 700;
        this.f11153c = Uuid.SIZE_BITS;
    }

    private boolean a() {
        if (!f11146g || this.f11156f.get()) {
            return false;
        }
        return true;
    }

    public static x b() {
        if (f11149j == null) {
            synchronized (x.class) {
                try {
                    if (f11149j == null) {
                        f11149j = new x();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11149j;
    }

    private int c() {
        if (f11150k != -1) {
            return f11150k;
        }
        return this.f11152b;
    }

    private synchronized boolean d() {
        try {
            boolean z3 = true;
            int i4 = this.f11154d + 1;
            this.f11154d = i4;
            if (i4 >= 50) {
                this.f11154d = 0;
                int length = f11148i.list().length;
                long c4 = (long) c();
                if (((long) length) >= c4) {
                    z3 = false;
                }
                this.f11155e = z3;
                if (!z3 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + c4);
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.f11155e;
    }

    private static boolean f() {
        if (g() || h()) {
            return false;
        }
        return true;
    }

    private static boolean g() {
        if (Build.VERSION.SDK_INT != 26) {
            return false;
        }
        for (String startsWith : Arrays.asList(new String[]{"SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play"})) {
            if (Build.MODEL.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    private static boolean h() {
        if (Build.VERSION.SDK_INT != 27) {
            return false;
        }
        return Arrays.asList(new String[]{"LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM"}).contains(Build.MODEL);
    }

    public boolean e(int i4, int i5, boolean z3, boolean z4) {
        if (!z3) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        } else if (!this.f11151a) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        } else if (!f11147h) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        } else if (a()) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        } else if (z4) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        } else {
            int i6 = this.f11153c;
            if (i4 < i6) {
                Log.isLoggable("HardwareConfig", 2);
                return false;
            } else if (i5 < i6) {
                Log.isLoggable("HardwareConfig", 2);
                return false;
            } else if (d()) {
                return true;
            } else {
                Log.isLoggable("HardwareConfig", 2);
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean i(int i4, int i5, BitmapFactory.Options options, boolean z3, boolean z4) {
        boolean e4 = e(i4, i5, z3, z4);
        if (e4) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return e4;
    }
}
