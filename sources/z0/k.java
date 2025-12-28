package Z0;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class k implements d {

    /* renamed from: k  reason: collision with root package name */
    private static final Bitmap.Config f2164k = Bitmap.Config.ARGB_8888;

    /* renamed from: a  reason: collision with root package name */
    private final l f2165a;

    /* renamed from: b  reason: collision with root package name */
    private final Set f2166b;

    /* renamed from: c  reason: collision with root package name */
    private final long f2167c;

    /* renamed from: d  reason: collision with root package name */
    private final a f2168d;

    /* renamed from: e  reason: collision with root package name */
    private long f2169e;

    /* renamed from: f  reason: collision with root package name */
    private long f2170f;

    /* renamed from: g  reason: collision with root package name */
    private int f2171g;

    /* renamed from: h  reason: collision with root package name */
    private int f2172h;

    /* renamed from: i  reason: collision with root package name */
    private int f2173i;

    /* renamed from: j  reason: collision with root package name */
    private int f2174j;

    private interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    private static final class b implements a {
        b() {
        }

        public void a(Bitmap bitmap) {
        }

        public void b(Bitmap bitmap) {
        }
    }

    k(long j4, l lVar, Set set) {
        this.f2167c = j4;
        this.f2169e = j4;
        this.f2165a = lVar;
        this.f2166b = set;
        this.f2168d = new b();
    }

    private static void f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    private static Bitmap g(int i4, int i5, Bitmap.Config config) {
        if (config == null) {
            config = f2164k;
        }
        return Bitmap.createBitmap(i4, i5, config);
    }

    private void h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    private void i() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hits=");
        sb.append(this.f2171g);
        sb.append(", misses=");
        sb.append(this.f2172h);
        sb.append(", puts=");
        sb.append(this.f2173i);
        sb.append(", evictions=");
        sb.append(this.f2174j);
        sb.append(", currentSize=");
        sb.append(this.f2170f);
        sb.append(", maxSize=");
        sb.append(this.f2169e);
        sb.append("\nStrategy=");
        sb.append(this.f2165a);
    }

    private void j() {
        q(this.f2169e);
    }

    private static Set k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i4 = Build.VERSION.SDK_INT;
        hashSet.add((Object) null);
        if (i4 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static l l() {
        return new o();
    }

    private synchronized Bitmap m(int i4, int i5, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap c4;
        try {
            f(config);
            l lVar = this.f2165a;
            if (config != null) {
                config2 = config;
            } else {
                config2 = f2164k;
            }
            c4 = lVar.c(i4, i5, config2);
            if (c4 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Missing bitmap=");
                    sb.append(this.f2165a.a(i4, i5, config));
                }
                this.f2172h++;
            } else {
                this.f2171g++;
                this.f2170f -= (long) this.f2165a.b(c4);
                this.f2168d.a(c4);
                p(c4);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Get bitmap=");
                sb2.append(this.f2165a.a(i4, i5, config));
            }
            h();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return c4;
    }

    private static void o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        o(bitmap);
    }

    private synchronized void q(long j4) {
        while (this.f2170f > j4) {
            try {
                Bitmap removeLast = this.f2165a.removeLast();
                if (removeLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        i();
                    }
                    this.f2170f = 0;
                    return;
                }
                this.f2168d.a(removeLast);
                this.f2170f -= (long) this.f2165a.b(removeLast);
                this.f2174j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    sb.append(this.f2165a.e(removeLast));
                }
                h();
                removeLast.recycle();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public void a(int i4) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("trimMemory, level=");
            sb.append(i4);
        }
        if (i4 >= 40 || i4 >= 20) {
            b();
        } else if (i4 >= 20 || i4 == 15) {
            q(n() / 2);
        }
    }

    public void b() {
        Log.isLoggable("LruBitmapPool", 3);
        q(0);
    }

    public Bitmap c(int i4, int i5, Bitmap.Config config) {
        Bitmap m4 = m(i4, i5, config);
        if (m4 == null) {
            return g(i4, i5, config);
        }
        m4.eraseColor(0);
        return m4;
    }

    public synchronized void d(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) this.f2165a.b(bitmap)) <= this.f2169e) {
                        if (this.f2166b.contains(bitmap.getConfig())) {
                            int b4 = this.f2165a.b(bitmap);
                            this.f2165a.d(bitmap);
                            this.f2168d.b(bitmap);
                            this.f2173i++;
                            this.f2170f += (long) b4;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Put bitmap in pool=");
                                sb.append(this.f2165a.e(bitmap));
                            }
                            h();
                            j();
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Reject bitmap from pool, bitmap: ");
                        sb2.append(this.f2165a.e(bitmap));
                        sb2.append(", is mutable: ");
                        sb2.append(bitmap.isMutable());
                        sb2.append(", is allowed config: ");
                        sb2.append(this.f2166b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    public Bitmap e(int i4, int i5, Bitmap.Config config) {
        Bitmap m4 = m(i4, i5, config);
        if (m4 == null) {
            return g(i4, i5, config);
        }
        return m4;
    }

    public long n() {
        return this.f2169e;
    }

    public k(long j4) {
        this(j4, l(), k());
    }
}
