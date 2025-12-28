package u0;

import kotlin.jvm.internal.o;

/* renamed from: u0.a  reason: case insensitive filesystem */
public final class C0903a {

    /* renamed from: a  reason: collision with root package name */
    private final String f16379a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16380b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16381c;

    /* renamed from: d  reason: collision with root package name */
    private final int f16382d;

    /* renamed from: e  reason: collision with root package name */
    private final int f16383e;

    /* renamed from: f  reason: collision with root package name */
    private final int f16384f;

    /* renamed from: g  reason: collision with root package name */
    private final String f16385g;

    public C0903a(String str, int i4, int i5, int i6, int i7, int i8, String str2) {
        o.e(str, "word");
        o.e(str2, "wordMixedCase");
        this.f16379a = str;
        this.f16380b = i4;
        this.f16381c = i5;
        this.f16382d = i6;
        this.f16383e = i7;
        this.f16384f = i8;
        this.f16385g = str2;
    }

    public final int a() {
        return this.f16380b;
    }

    public final int b() {
        return this.f16382d;
    }

    public final int c() {
        return this.f16384f;
    }

    public final int d() {
        return this.f16383e;
    }

    public final String e() {
        return this.f16379a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0903a)) {
            return false;
        }
        C0903a aVar = (C0903a) obj;
        if (o.a(this.f16379a, aVar.f16379a) && this.f16380b == aVar.f16380b && this.f16381c == aVar.f16381c && this.f16382d == aVar.f16382d && this.f16383e == aVar.f16383e && this.f16384f == aVar.f16384f && o.a(this.f16385g, aVar.f16385g)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f16385g;
    }

    public int hashCode() {
        return (((((((((((this.f16379a.hashCode() * 31) + this.f16380b) * 31) + this.f16381c) * 31) + this.f16382d) * 31) + this.f16383e) * 31) + this.f16384f) * 31) + this.f16385g.hashCode();
    }

    public String toString() {
        String str = this.f16379a;
        int i4 = this.f16380b;
        int i5 = this.f16381c;
        int i6 = this.f16382d;
        int i7 = this.f16383e;
        int i8 = this.f16384f;
        String str2 = this.f16385g;
        return "WordProperties(word=" + str + ", frequency=" + i4 + ", timesTyped=" + i5 + ", typedLowerCase=" + i6 + ", typedTitleCase=" + i7 + ", typedMixedCase=" + i8 + ", wordMixedCase=" + str2 + ")";
    }
}
