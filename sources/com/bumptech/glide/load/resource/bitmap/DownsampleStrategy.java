package com.bumptech.glide.load.resource.bitmap;

public abstract class DownsampleStrategy {

    /* renamed from: a  reason: collision with root package name */
    public static final DownsampleStrategy f11081a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final DownsampleStrategy f11082b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final DownsampleStrategy f11083c = new e();

    /* renamed from: d  reason: collision with root package name */
    public static final DownsampleStrategy f11084d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final DownsampleStrategy f11085e;

    /* renamed from: f  reason: collision with root package name */
    public static final DownsampleStrategy f11086f = new f();

    /* renamed from: g  reason: collision with root package name */
    public static final DownsampleStrategy f11087g;

    /* renamed from: h  reason: collision with root package name */
    public static final X0.c f11088h;

    /* renamed from: i  reason: collision with root package name */
    static final boolean f11089i = true;

    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    private static class a extends DownsampleStrategy {
        a() {
        }

        public SampleSizeRounding a(int i4, int i5, int i6, int i7) {
            return SampleSizeRounding.QUALITY;
        }

        public float b(int i4, int i5, int i6, int i7) {
            int min = Math.min(i5 / i7, i4 / i6);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
    }

    private static class b extends DownsampleStrategy {
        b() {
        }

        public SampleSizeRounding a(int i4, int i5, int i6, int i7) {
            return SampleSizeRounding.MEMORY;
        }

        public float b(int i4, int i5, int i6, int i7) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i5) / ((float) i7), ((float) i4) / ((float) i6)));
            int i8 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i8 = 0;
            }
            return 1.0f / ((float) (max << i8));
        }
    }

    private static class c extends DownsampleStrategy {
        c() {
        }

        public SampleSizeRounding a(int i4, int i5, int i6, int i7) {
            if (b(i4, i5, i6, i7) == 1.0f) {
                return SampleSizeRounding.QUALITY;
            }
            return DownsampleStrategy.f11083c.a(i4, i5, i6, i7);
        }

        public float b(int i4, int i5, int i6, int i7) {
            return Math.min(1.0f, DownsampleStrategy.f11083c.b(i4, i5, i6, i7));
        }
    }

    private static class d extends DownsampleStrategy {
        d() {
        }

        public SampleSizeRounding a(int i4, int i5, int i6, int i7) {
            return SampleSizeRounding.QUALITY;
        }

        public float b(int i4, int i5, int i6, int i7) {
            return Math.max(((float) i6) / ((float) i4), ((float) i7) / ((float) i5));
        }
    }

    private static class e extends DownsampleStrategy {
        e() {
        }

        public SampleSizeRounding a(int i4, int i5, int i6, int i7) {
            if (DownsampleStrategy.f11089i) {
                return SampleSizeRounding.QUALITY;
            }
            return SampleSizeRounding.MEMORY;
        }

        public float b(int i4, int i5, int i6, int i7) {
            if (DownsampleStrategy.f11089i) {
                return Math.min(((float) i6) / ((float) i4), ((float) i7) / ((float) i5));
            }
            int max = Math.max(i5 / i7, i4 / i6);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    private static class f extends DownsampleStrategy {
        f() {
        }

        public SampleSizeRounding a(int i4, int i5, int i6, int i7) {
            return SampleSizeRounding.QUALITY;
        }

        public float b(int i4, int i5, int i6, int i7) {
            return 1.0f;
        }
    }

    static {
        d dVar = new d();
        f11085e = dVar;
        f11087g = dVar;
        f11088h = X0.c.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
    }

    public abstract SampleSizeRounding a(int i4, int i5, int i6, int i7);

    public abstract float b(int i4, int i5, int i6, int i7);
}
