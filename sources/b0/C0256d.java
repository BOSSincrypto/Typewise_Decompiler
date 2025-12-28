package B0;

/* renamed from: B0.d  reason: case insensitive filesystem */
public final class C0256d {

    /* renamed from: a  reason: collision with root package name */
    private final float f89a;

    /* renamed from: b  reason: collision with root package name */
    private final float f90b;

    /* renamed from: c  reason: collision with root package name */
    private final int f91c;

    /* renamed from: d  reason: collision with root package name */
    private final float f92d;

    /* renamed from: e  reason: collision with root package name */
    private final float f93e;

    /* renamed from: f  reason: collision with root package name */
    private final int f94f;

    /* renamed from: g  reason: collision with root package name */
    private final float f95g;

    /* renamed from: h  reason: collision with root package name */
    private final float f96h;

    /* renamed from: i  reason: collision with root package name */
    private final int f97i;

    /* renamed from: j  reason: collision with root package name */
    private final float f98j;

    /* renamed from: k  reason: collision with root package name */
    private final int f99k;

    /* renamed from: l  reason: collision with root package name */
    private final float f100l;

    public C0256d(float f4, float f5, int i4, float f6, float f7, int i5, float f8, float f9, int i6, float f10, int i7, float f11) {
        this.f89a = f4;
        this.f90b = f5;
        this.f91c = i4;
        this.f92d = f6;
        this.f93e = f7;
        this.f94f = i5;
        this.f95g = f8;
        this.f96h = f9;
        this.f97i = i6;
        this.f98j = f10;
        this.f99k = i7;
        this.f100l = f11;
    }

    public final float a() {
        return this.f100l;
    }

    public final float b() {
        return this.f89a;
    }

    public final float c() {
        return this.f98j;
    }

    public final float d() {
        return this.f92d;
    }

    public final float e() {
        return this.f95g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0256d)) {
            return false;
        }
        C0256d dVar = (C0256d) obj;
        if (Float.compare(this.f89a, dVar.f89a) == 0 && Float.compare(this.f90b, dVar.f90b) == 0 && this.f91c == dVar.f91c && Float.compare(this.f92d, dVar.f92d) == 0 && Float.compare(this.f93e, dVar.f93e) == 0 && this.f94f == dVar.f94f && Float.compare(this.f95g, dVar.f95g) == 0 && Float.compare(this.f96h, dVar.f96h) == 0 && this.f97i == dVar.f97i && Float.compare(this.f98j, dVar.f98j) == 0 && this.f99k == dVar.f99k && Float.compare(this.f100l, dVar.f100l) == 0) {
            return true;
        }
        return false;
    }

    public final float f() {
        return this.f90b;
    }

    public final float g() {
        return this.f93e;
    }

    public final float h() {
        return this.f96h;
    }

    public int hashCode() {
        return (((((((((((((((((((((Float.floatToIntBits(this.f89a) * 31) + Float.floatToIntBits(this.f90b)) * 31) + this.f91c) * 31) + Float.floatToIntBits(this.f92d)) * 31) + Float.floatToIntBits(this.f93e)) * 31) + this.f94f) * 31) + Float.floatToIntBits(this.f95g)) * 31) + Float.floatToIntBits(this.f96h)) * 31) + this.f97i) * 31) + Float.floatToIntBits(this.f98j)) * 31) + this.f99k) * 31) + Float.floatToIntBits(this.f100l);
    }

    public final int i() {
        return this.f91c;
    }

    public final int j() {
        return this.f99k;
    }

    public final int k() {
        return this.f94f;
    }

    public final int l() {
        return this.f97i;
    }

    public String toString() {
        float f4 = this.f89a;
        float f5 = this.f90b;
        int i4 = this.f91c;
        float f6 = this.f92d;
        float f7 = this.f93e;
        int i5 = this.f94f;
        float f8 = this.f95g;
        float f9 = this.f96h;
        int i6 = this.f97i;
        float f10 = this.f98j;
        int i7 = this.f99k;
        float f11 = this.f100l;
        return "AllProbabilities(gram1ProbabilityFirstWord=" + f4 + ", gram2ProbabilityFirstWord=" + f5 + ", originalGram1CountFirstWord=" + i4 + ", gram1ProbabilitySecondWord=" + f6 + ", gram2ProbabilitySecondWord=" + f7 + ", originalGram1CountSecondWord=" + i5 + ", gram1ProbabilityThirdWord=" + f8 + ", gram2ProbabilityThirdWord=" + f9 + ", originalGram1CountThirdWord=" + i6 + ", gram1ProbabilityPreviousWord=" + f10 + ", originalGram1CountPreviousWord=" + i7 + ", averageProbability=" + f11 + ")";
    }
}
