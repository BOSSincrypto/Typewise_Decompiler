package com.bumptech.glide.load.resource.bitmap;

import X0.c;
import Z0.d;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import p1.g;
import p1.k;
import p1.l;

public final class s {

    /* renamed from: f  reason: collision with root package name */
    public static final c f11128f = c.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.DEFAULT);

    /* renamed from: g  reason: collision with root package name */
    public static final c f11129g = c.e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h  reason: collision with root package name */
    public static final c f11130h = DownsampleStrategy.f11088h;

    /* renamed from: i  reason: collision with root package name */
    public static final c f11131i;

    /* renamed from: j  reason: collision with root package name */
    public static final c f11132j;

    /* renamed from: k  reason: collision with root package name */
    private static final Set f11133k = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: l  reason: collision with root package name */
    private static final b f11134l = new a();

    /* renamed from: m  reason: collision with root package name */
    private static final Set f11135m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));

    /* renamed from: n  reason: collision with root package name */
    private static final Queue f11136n = l.e(0);

    /* renamed from: a  reason: collision with root package name */
    private final d f11137a;

    /* renamed from: b  reason: collision with root package name */
    private final DisplayMetrics f11138b;

    /* renamed from: c  reason: collision with root package name */
    private final Z0.b f11139c;

    /* renamed from: d  reason: collision with root package name */
    private final List f11140d;

    /* renamed from: e  reason: collision with root package name */
    private final x f11141e = x.b();

    class a implements b {
        a() {
        }

        public void a(d dVar, Bitmap bitmap) {
        }

        public void b() {
        }
    }

    public interface b {
        void a(d dVar, Bitmap bitmap);

        void b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f11131i = c.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f11132j = c.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
    }

    public s(List list, DisplayMetrics displayMetrics, d dVar, Z0.b bVar) {
        this.f11140d = list;
        this.f11138b = (DisplayMetrics) k.d(displayMetrics);
        this.f11137a = (d) k.d(dVar);
        this.f11139c = (Z0.b) k.d(bVar);
    }

    private static int a(double d4) {
        int l4 = l(d4);
        int x3 = x(((double) l4) * d4);
        return x((d4 / ((double) (((float) x3) / ((float) l4)))) * ((double) x3));
    }

    private void b(y yVar, DecodeFormat decodeFormat, boolean z3, boolean z4, BitmapFactory.Options options, int i4, int i5) {
        boolean z5;
        Bitmap.Config config;
        if (!this.f11141e.i(i4, i5, options, z3, z4)) {
            if (decodeFormat != DecodeFormat.PREFER_ARGB_8888) {
                try {
                    z5 = yVar.d().hasAlpha();
                } catch (IOException unused) {
                    if (Log.isLoggable("Downsampler", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cannot determine whether the image has alpha or not from header, format ");
                        sb.append(decodeFormat);
                    }
                    z5 = false;
                }
                if (z5) {
                    config = Bitmap.Config.ARGB_8888;
                } else {
                    config = Bitmap.Config.RGB_565;
                }
                options.inPreferredConfig = config;
                if (config == Bitmap.Config.RGB_565) {
                    options.inDither = true;
                    return;
                }
                return;
            }
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        }
    }

    private static void c(ImageHeaderParser.ImageType imageType, y yVar, b bVar, d dVar, DownsampleStrategy downsampleStrategy, int i4, int i5, int i6, int i7, int i8, BitmapFactory.Options options) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        double floor;
        ImageHeaderParser.ImageType imageType2 = imageType;
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        int i15 = i5;
        int i16 = i6;
        int i17 = i7;
        int i18 = i8;
        BitmapFactory.Options options2 = options;
        if (i15 <= 0 || i16 <= 0) {
            String str = "x";
            if (Log.isLoggable("Downsampler", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to determine dimensions for: ");
                sb.append(imageType2);
                sb.append(" with target [");
                sb.append(i17);
                sb.append(str);
                sb.append(i18);
                sb.append("]");
                return;
            }
            return;
        }
        if (r(i4)) {
            i9 = i15;
            i10 = i16;
        } else {
            i10 = i15;
            i9 = i16;
        }
        float b4 = downsampleStrategy2.b(i10, i9, i17, i18);
        if (b4 > 0.0f) {
            DownsampleStrategy.SampleSizeRounding a4 = downsampleStrategy2.a(i10, i9, i17, i18);
            if (a4 != null) {
                float f4 = (float) i10;
                float f5 = (float) i9;
                int x3 = i10 / x((double) (b4 * f4));
                int x4 = i9 / x((double) (b4 * f5));
                DownsampleStrategy.SampleSizeRounding sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.MEMORY;
                if (a4 == sampleSizeRounding) {
                    i11 = Math.max(x3, x4);
                } else {
                    i11 = Math.min(x3, x4);
                }
                int i19 = Build.VERSION.SDK_INT;
                String str2 = "x";
                String str3 = "Downsampler";
                if (i19 > 23 || !f11133k.contains(options2.outMimeType)) {
                    int max = Math.max(1, Integer.highestOneBit(i11));
                    if (a4 == sampleSizeRounding && ((float) max) < 1.0f / b4) {
                        max <<= 1;
                    }
                    i12 = max;
                } else {
                    i12 = 1;
                }
                options2.inSampleSize = i12;
                if (imageType2 == ImageHeaderParser.ImageType.JPEG) {
                    float min = (float) Math.min(i12, 8);
                    i13 = (int) Math.ceil((double) (f4 / min));
                    i14 = (int) Math.ceil((double) (f5 / min));
                    int i20 = i12 / 8;
                    if (i20 > 0) {
                        i13 /= i20;
                        i14 /= i20;
                    }
                } else {
                    if (imageType2 == ImageHeaderParser.ImageType.PNG || imageType2 == ImageHeaderParser.ImageType.PNG_A) {
                        float f6 = (float) i12;
                        i13 = (int) Math.floor((double) (f4 / f6));
                        floor = Math.floor((double) (f5 / f6));
                    } else if (imageType.isWebp()) {
                        if (i19 >= 24) {
                            float f7 = (float) i12;
                            i13 = Math.round(f4 / f7);
                            i14 = Math.round(f5 / f7);
                        } else {
                            float f8 = (float) i12;
                            i13 = (int) Math.floor((double) (f4 / f8));
                            floor = Math.floor((double) (f5 / f8));
                        }
                    } else if (i10 % i12 == 0 && i9 % i12 == 0) {
                        i13 = i10 / i12;
                        i14 = i9 / i12;
                    } else {
                        int[] m4 = m(yVar, options2, bVar, dVar);
                        i13 = m4[0];
                        i14 = m4[1];
                    }
                    i14 = (int) floor;
                }
                double b5 = (double) downsampleStrategy2.b(i13, i14, i17, i18);
                options2.inTargetDensity = a(b5);
                options2.inDensity = l(b5);
                if (s(options)) {
                    options2.inScaled = true;
                } else {
                    options2.inTargetDensity = 0;
                    options2.inDensity = 0;
                }
                if (Log.isLoggable(str3, 2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Calculate scaling, source: [");
                    sb2.append(i5);
                    String str4 = str2;
                    sb2.append(str4);
                    sb2.append(i6);
                    sb2.append("], degreesToRotate: ");
                    sb2.append(i4);
                    sb2.append(", target: [");
                    sb2.append(i17);
                    sb2.append(str4);
                    sb2.append(i18);
                    sb2.append("], power of two scaled: [");
                    sb2.append(i13);
                    sb2.append(str4);
                    sb2.append(i14);
                    sb2.append("], exact scale factor: ");
                    sb2.append(b4);
                    sb2.append(", power of 2 sample size: ");
                    sb2.append(i12);
                    sb2.append(", adjusted scale factor: ");
                    sb2.append(b5);
                    sb2.append(", target density: ");
                    sb2.append(options2.inTargetDensity);
                    sb2.append(", density: ");
                    sb2.append(options2.inDensity);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        int i21 = i16;
        String str5 = "x";
        int i22 = i15;
        throw new IllegalArgumentException("Cannot scale with factor: " + b4 + " from: " + downsampleStrategy2 + ", source: [" + i22 + str5 + i21 + "], target: [" + i17 + str5 + i18 + "]");
    }

    private com.bumptech.glide.load.engine.s e(y yVar, int i4, int i5, X0.d dVar, b bVar) {
        boolean z3;
        X0.d dVar2 = dVar;
        byte[] bArr = (byte[]) this.f11139c.e(65536, byte[].class);
        BitmapFactory.Options k4 = k();
        k4.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) dVar2.c(f11128f);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) dVar2.c(f11129g);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) dVar2.c(DownsampleStrategy.f11088h);
        boolean booleanValue = ((Boolean) dVar2.c(f11131i)).booleanValue();
        c cVar = f11132j;
        if (dVar2.c(cVar) == null || !((Boolean) dVar2.c(cVar)).booleanValue()) {
            z3 = false;
        } else {
            z3 = true;
        }
        try {
            return C0568g.f(h(yVar, k4, downsampleStrategy, decodeFormat, preferredColorSpace, z3, i4, i5, booleanValue, bVar), this.f11137a);
        } finally {
            v(k4);
            this.f11139c.d(bArr);
        }
    }

    private Bitmap h(y yVar, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z3, int i4, int i5, boolean z4, b bVar) {
        boolean z5;
        int i6;
        int i7;
        int i8;
        String str;
        int i9;
        ColorSpace.Named named;
        int i10;
        int i11;
        float f4;
        int i12;
        y yVar2 = yVar;
        BitmapFactory.Options options2 = options;
        PreferredColorSpace preferredColorSpace2 = preferredColorSpace;
        b bVar2 = bVar;
        long b4 = g.b();
        int[] m4 = m(yVar2, options2, bVar2, this.f11137a);
        int i13 = m4[0];
        int i14 = m4[1];
        String str2 = options2.outMimeType;
        if (i13 == -1 || i14 == -1) {
            z5 = false;
        } else {
            z5 = z3;
        }
        int c4 = yVar.c();
        int g4 = E.g(c4);
        boolean j4 = E.j(c4);
        int i15 = i4;
        if (i15 == Integer.MIN_VALUE) {
            i7 = i5;
            if (r(g4)) {
                i6 = i14;
            } else {
                i6 = i13;
            }
        } else {
            i7 = i5;
            i6 = i15;
        }
        if (i7 != Integer.MIN_VALUE) {
            i8 = i7;
        } else if (r(g4)) {
            i8 = i13;
        } else {
            i8 = i14;
        }
        ImageHeaderParser.ImageType d4 = yVar.d();
        ImageHeaderParser.ImageType imageType = d4;
        c(d4, yVar, bVar, this.f11137a, downsampleStrategy, g4, i13, i14, i6, i8, options);
        String str3 = str2;
        int i16 = i14;
        int i17 = i13;
        b bVar3 = bVar2;
        PreferredColorSpace preferredColorSpace3 = preferredColorSpace2;
        BitmapFactory.Options options3 = options2;
        int i18 = c4;
        y yVar3 = yVar2;
        b(yVar, decodeFormat, z5, j4, options, i6, i8);
        int i19 = Build.VERSION.SDK_INT;
        if (z(imageType)) {
            if (i17 < 0 || i16 < 0 || !z4) {
                if (s(options)) {
                    f4 = ((float) options3.inTargetDensity) / ((float) options3.inDensity);
                } else {
                    f4 = 1.0f;
                }
                int i20 = options3.inSampleSize;
                float f5 = (float) i20;
                int round = Math.round(((float) ((int) Math.ceil((double) (((float) i17) / f5)))) * f4);
                i10 = Math.round(((float) ((int) Math.ceil((double) (((float) i16) / f5)))) * f4);
                str = "Downsampler";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calculated target [");
                    sb.append(round);
                    sb.append("x");
                    sb.append(i10);
                    i12 = round;
                    sb.append("] for source [");
                    sb.append(i17);
                    sb.append("x");
                    sb.append(i16);
                    sb.append("], sampleSize: ");
                    sb.append(i20);
                    sb.append(", targetDensity: ");
                    sb.append(options3.inTargetDensity);
                    sb.append(", density: ");
                    sb.append(options3.inDensity);
                    sb.append(", density multiplier: ");
                    sb.append(f4);
                } else {
                    i12 = round;
                }
                i11 = i12;
            } else {
                str = "Downsampler";
                i11 = i6;
                i10 = i8;
            }
            if (i11 > 0 && i10 > 0) {
                y(options3, this.f11137a, i11, i10);
            }
        } else {
            str = "Downsampler";
        }
        if (preferredColorSpace3 != null) {
            if (i19 >= 28) {
                if (preferredColorSpace3 != PreferredColorSpace.DISPLAY_P3 || options.outColorSpace == null || !options.outColorSpace.isWideGamut()) {
                    named = ColorSpace.Named.SRGB;
                } else {
                    named = ColorSpace.Named.DISPLAY_P3;
                }
                options3.inPreferredColorSpace = ColorSpace.get(named);
            } else if (i19 >= 26) {
                options3.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap i21 = i(yVar3, options3, bVar3, this.f11137a);
        bVar3.a(this.f11137a, i21);
        if (Log.isLoggable(str, 2)) {
            i9 = i18;
            t(i17, i16, str3, options, i21, i4, i5, b4);
        } else {
            i9 = i18;
        }
        if (i21 == null) {
            return null;
        }
        i21.setDensity(this.f11138b.densityDpi);
        Bitmap k4 = E.k(this.f11137a, i21, i9);
        if (i21.equals(k4)) {
            return k4;
        }
        this.f11137a.d(i21);
        return k4;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0046 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap i(com.bumptech.glide.load.resource.bitmap.y r4, android.graphics.BitmapFactory.Options r5, com.bumptech.glide.load.resource.bitmap.s.b r6, Z0.d r7) {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto L_0x000a
            r6.b()
            r4.b()
        L_0x000a:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = com.bumptech.glide.load.resource.bitmap.E.f()
            r3.lock()
            android.graphics.Bitmap r4 = r4.a(r5)     // Catch:{ IllegalArgumentException -> 0x0025 }
            java.util.concurrent.locks.Lock r5 = com.bumptech.glide.load.resource.bitmap.E.f()
            r5.unlock()
            return r4
        L_0x0023:
            r4 = move-exception
            goto L_0x0048
        L_0x0025:
            r3 = move-exception
            java.io.IOException r0 = u(r3, r0, r1, r2, r5)     // Catch:{ all -> 0x0023 }
            java.lang.String r1 = "Downsampler"
            r2 = 3
            android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x0023 }
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0047
            r7.d(r1)     // Catch:{ IOException -> 0x0046 }
            r1 = 0
            r5.inBitmap = r1     // Catch:{ IOException -> 0x0046 }
            android.graphics.Bitmap r4 = i(r4, r5, r6, r7)     // Catch:{ IOException -> 0x0046 }
            java.util.concurrent.locks.Lock r5 = com.bumptech.glide.load.resource.bitmap.E.f()
            r5.unlock()
            return r4
        L_0x0046:
            throw r0     // Catch:{ all -> 0x0023 }
        L_0x0047:
            throw r0     // Catch:{ all -> 0x0023 }
        L_0x0048:
            java.util.concurrent.locks.Lock r5 = com.bumptech.glide.load.resource.bitmap.E.f()
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.s.i(com.bumptech.glide.load.resource.bitmap.y, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.s$b, Z0.d):android.graphics.Bitmap");
    }

    private static String j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    private static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options options;
        synchronized (s.class) {
            Queue queue = f11136n;
            synchronized (queue) {
                options = (BitmapFactory.Options) queue.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                w(options);
            }
        }
        return options;
    }

    private static int l(double d4) {
        if (d4 > 1.0d) {
            d4 = 1.0d / d4;
        }
        return (int) Math.round(d4 * 2.147483647E9d);
    }

    private static int[] m(y yVar, BitmapFactory.Options options, b bVar, d dVar) {
        options.inJustDecodeBounds = true;
        i(yVar, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    private static boolean r(int i4) {
        return i4 == 90 || i4 == 270;
    }

    private static boolean s(BitmapFactory.Options options) {
        int i4;
        int i5 = options.inTargetDensity;
        if (i5 <= 0 || (i4 = options.inDensity) <= 0 || i5 == i4) {
            return false;
        }
        return true;
    }

    private static void t(int i4, int i5, String str, BitmapFactory.Options options, Bitmap bitmap, int i6, int i7, long j4) {
        StringBuilder sb = new StringBuilder();
        sb.append("Decoded ");
        sb.append(j(bitmap));
        sb.append(" from [");
        sb.append(i4);
        sb.append("x");
        sb.append(i5);
        sb.append("] ");
        sb.append(str);
        sb.append(" with inBitmap ");
        sb.append(n(options));
        sb.append(" for [");
        sb.append(i6);
        sb.append("x");
        sb.append(i7);
        sb.append("], sample size: ");
        sb.append(options.inSampleSize);
        sb.append(", density: ");
        sb.append(options.inDensity);
        sb.append(", target density: ");
        sb.append(options.inTargetDensity);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        sb.append(", duration: ");
        sb.append(g.a(j4));
    }

    private static IOException u(IllegalArgumentException illegalArgumentException, int i4, int i5, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i4 + ", outHeight: " + i5 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    private static void v(BitmapFactory.Options options) {
        w(options);
        Queue queue = f11136n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int x(double d4) {
        return (int) (d4 + 0.5d);
    }

    private static void y(BitmapFactory.Options options, d dVar, int i4, int i5) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
            config = options.outConfig;
        } else {
            return;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = dVar.e(i4, i5, config);
    }

    private boolean z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    public com.bumptech.glide.load.engine.s d(ParcelFileDescriptor parcelFileDescriptor, int i4, int i5, X0.d dVar) {
        return e(new y.c(parcelFileDescriptor, this.f11140d, this.f11139c), i4, i5, dVar, f11134l);
    }

    public com.bumptech.glide.load.engine.s f(InputStream inputStream, int i4, int i5, X0.d dVar, b bVar) {
        return e(new y.b(inputStream, this.f11140d, this.f11139c), i4, i5, dVar, bVar);
    }

    public com.bumptech.glide.load.engine.s g(ByteBuffer byteBuffer, int i4, int i5, X0.d dVar) {
        return e(new y.a(byteBuffer, this.f11140d, this.f11139c), i4, i5, dVar, f11134l);
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.c();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }
}
