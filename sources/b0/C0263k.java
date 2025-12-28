package B0;

import kotlin.jvm.internal.o;
import r0.g;

/* renamed from: B0.k  reason: case insensitive filesystem */
public final class C0263k {

    /* renamed from: a  reason: collision with root package name */
    private final g f122a;

    /* renamed from: b  reason: collision with root package name */
    private final n f123b;

    /* renamed from: c  reason: collision with root package name */
    private final int f124c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f125d;

    /* renamed from: e  reason: collision with root package name */
    private final String f126e;

    /* renamed from: f  reason: collision with root package name */
    private final int f127f;

    public C0263k(g gVar, n nVar, int i4, Integer num, String str, int i5) {
        o.e(gVar, "split1");
        o.e(nVar, "stringCasing");
        this.f122a = gVar;
        this.f123b = nVar;
        this.f124c = i4;
        this.f125d = num;
        this.f126e = str;
        this.f127f = i5;
    }

    public final g a() {
        return this.f122a;
    }

    public final n b() {
        return this.f123b;
    }

    public final int c() {
        return this.f124c;
    }

    public final Integer d() {
        return this.f125d;
    }

    public final String e() {
        return this.f126e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0263k)) {
            return false;
        }
        C0263k kVar = (C0263k) obj;
        if (o.a(this.f122a, kVar.f122a) && o.a(this.f123b, kVar.f123b) && this.f124c == kVar.f124c && o.a(this.f125d, kVar.f125d) && o.a(this.f126e, kVar.f126e) && this.f127f == kVar.f127f) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f127f;
    }

    public int hashCode() {
        int i4;
        int hashCode = ((((this.f122a.hashCode() * 31) + this.f123b.hashCode()) * 31) + this.f124c) * 31;
        Integer num = this.f125d;
        int i5 = 0;
        if (num == null) {
            i4 = 0;
        } else {
            i4 = num.hashCode();
        }
        int i6 = (hashCode + i4) * 31;
        String str = this.f126e;
        if (str != null) {
            i5 = str.hashCode();
        }
        return ((i6 + i5) * 31) + this.f127f;
    }

    public String toString() {
        g gVar = this.f122a;
        n nVar = this.f123b;
        int i4 = this.f124c;
        Integer num = this.f125d;
        String str = this.f126e;
        int i5 = this.f127f;
        return "SplitResult(split1=" + gVar + ", stringCasing=" + nVar + ", splitPoint1=" + i4 + ", splitPoint2=" + num + ", word2Whole=" + str + ", word2StartIndex=" + i5 + ")";
    }
}
