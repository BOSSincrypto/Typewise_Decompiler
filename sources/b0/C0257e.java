package B0;

import kotlin.jvm.internal.o;

/* renamed from: B0.e  reason: case insensitive filesystem */
public final class C0257e {

    /* renamed from: a  reason: collision with root package name */
    private final String f101a;

    /* renamed from: b  reason: collision with root package name */
    private final int f102b;

    /* renamed from: c  reason: collision with root package name */
    private final float f103c;

    /* renamed from: d  reason: collision with root package name */
    private final int f104d;

    public C0257e(String str, int i4, float f4, int i5) {
        o.e(str, "bestSuggestion");
        this.f101a = str;
        this.f102b = i4;
        this.f103c = f4;
        this.f104d = i5;
    }

    public final String a() {
        return this.f101a;
    }

    public final int b() {
        return this.f102b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0257e)) {
            return false;
        }
        C0257e eVar = (C0257e) obj;
        if (o.a(this.f101a, eVar.f101a) && this.f102b == eVar.f102b && Float.compare(this.f103c, eVar.f103c) == 0 && this.f104d == eVar.f104d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f101a.hashCode() * 31) + this.f102b) * 31) + Float.floatToIntBits(this.f103c)) * 31) + this.f104d;
    }

    public String toString() {
        String str = this.f101a;
        int i4 = this.f102b;
        float f4 = this.f103c;
        int i5 = this.f104d;
        return "SingleInferenceResult(bestSuggestion=" + str + ", whichSplit=" + i4 + ", bestScore=" + f4 + ", bestSpaceSplitIndex=" + i5 + ")";
    }
}
