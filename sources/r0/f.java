package r0;

import kotlin.jvm.internal.o;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final int f16027a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16028b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16029c;

    /* renamed from: d  reason: collision with root package name */
    private final String f16030d;

    public f(int i4, int i5, int i6, String str) {
        o.e(str, "wordMixedCase");
        this.f16027a = i4;
        this.f16028b = i5;
        this.f16029c = i6;
        this.f16030d = str;
    }

    public final int a() {
        return this.f16029c;
    }

    public final int b() {
        return this.f16028b;
    }

    public final int c() {
        return this.f16027a;
    }

    public final String d() {
        return this.f16030d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f16027a == fVar.f16027a && this.f16028b == fVar.f16028b && this.f16029c == fVar.f16029c && o.a(this.f16030d, fVar.f16030d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f16027a * 31) + this.f16028b) * 31) + this.f16029c) * 31) + this.f16030d.hashCode();
    }

    public String toString() {
        int i4 = this.f16027a;
        int i5 = this.f16028b;
        int i6 = this.f16029c;
        String str = this.f16030d;
        return "WordInfo(typedTitleCase=" + i4 + ", typedMixedCase=" + i5 + ", typedLowerCase=" + i6 + ", wordMixedCase=" + str + ")";
    }
}
