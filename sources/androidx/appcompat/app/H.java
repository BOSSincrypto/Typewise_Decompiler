package androidx.appcompat.app;

class H {

    /* renamed from: d  reason: collision with root package name */
    private static H f2554d;

    /* renamed from: a  reason: collision with root package name */
    public long f2555a;

    /* renamed from: b  reason: collision with root package name */
    public long f2556b;

    /* renamed from: c  reason: collision with root package name */
    public int f2557c;

    H() {
    }

    static H b() {
        if (f2554d == null) {
            f2554d = new H();
        }
        return f2554d;
    }

    public void a(long j4, double d4, double d5) {
        float f4 = ((float) (j4 - 946728000000L)) / 8.64E7f;
        float f5 = (0.01720197f * f4) + 6.24006f;
        double d6 = (double) f5;
        double sin = (Math.sin(d6) * 0.03341960161924362d) + d6 + (Math.sin((double) (2.0f * f5)) * 3.4906598739326E-4d) + (Math.sin((double) (f5 * 3.0f)) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d7 = (-d5) / 360.0d;
        double round = ((double) (((float) Math.round(((double) (f4 - 9.0E-4f)) - d7)) + 9.0E-4f)) + d7 + (Math.sin(d6) * 0.0053d) + (Math.sin(2.0d * sin) * -0.0069d);
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d8 = 0.01745329238474369d * d4;
        double sin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d8) * Math.sin(asin))) / (Math.cos(d8) * Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.f2557c = 1;
            this.f2555a = -1;
            this.f2556b = -1;
        } else if (sin2 <= -1.0d) {
            this.f2557c = 0;
            this.f2555a = -1;
            this.f2556b = -1;
        } else {
            double acos = (double) ((float) (Math.acos(sin2) / 6.283185307179586d));
            this.f2555a = Math.round((round + acos) * 8.64E7d) + 946728000000L;
            long round2 = Math.round((round - acos) * 8.64E7d) + 946728000000L;
            this.f2556b = round2;
            if (round2 >= j4 || this.f2555a <= j4) {
                this.f2557c = 1;
            } else {
                this.f2557c = 0;
            }
        }
    }
}
