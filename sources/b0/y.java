package B0;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final float f186a;

    /* renamed from: b  reason: collision with root package name */
    private final float f187b;

    /* renamed from: c  reason: collision with root package name */
    private final int f188c;

    /* renamed from: d  reason: collision with root package name */
    private final float f189d;

    /* renamed from: e  reason: collision with root package name */
    private final int f190e;

    public y(float f4, float f5, int i4, float f6, int i5) {
        this.f186a = f4;
        this.f187b = f5;
        this.f188c = i4;
        this.f189d = f6;
        this.f190e = i5;
    }

    public final int a() {
        return this.f190e;
    }

    public final float b() {
        return this.f186a;
    }

    public final float c() {
        return this.f187b;
    }

    public final int d() {
        return this.f188c;
    }

    public final float e() {
        return this.f189d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (Float.compare(this.f186a, yVar.f186a) == 0 && Float.compare(this.f187b, yVar.f187b) == 0 && this.f188c == yVar.f188c && Float.compare(this.f189d, yVar.f189d) == 0 && this.f190e == yVar.f190e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((Float.floatToIntBits(this.f186a) * 31) + Float.floatToIntBits(this.f187b)) * 31) + this.f188c) * 31) + Float.floatToIntBits(this.f189d)) * 31) + this.f190e;
    }

    public String toString() {
        float f4 = this.f186a;
        float f5 = this.f187b;
        int i4 = this.f188c;
        float f6 = this.f189d;
        int i5 = this.f190e;
        return "WordProbabilities(gram1Probability=" + f4 + ", gram2Probability=" + f5 + ", originalGram1Count=" + i4 + ", probabilitySum=" + f6 + ", divisor=" + i5 + ")";
    }
}
