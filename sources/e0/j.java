package E0;

import kotlin.jvm.internal.o;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final String f375a;

    /* renamed from: b  reason: collision with root package name */
    private final String f376b;

    /* renamed from: c  reason: collision with root package name */
    private final int f377c;

    /* renamed from: d  reason: collision with root package name */
    private final int f378d;

    public j(String str, String str2, int i4, int i5) {
        o.e(str, "limitedBefore");
        o.e(str2, "limitedAfter");
        this.f375a = str;
        this.f376b = str2;
        this.f377c = i4;
        this.f378d = i5;
    }

    public final String a() {
        return this.f375a;
    }

    public final String b() {
        return this.f376b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (o.a(this.f375a, jVar.f375a) && o.a(this.f376b, jVar.f376b) && this.f377c == jVar.f377c && this.f378d == jVar.f378d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f375a.hashCode() * 31) + this.f376b.hashCode()) * 31) + this.f377c) * 31) + this.f378d;
    }

    public String toString() {
        String str = this.f375a;
        String str2 = this.f376b;
        int i4 = this.f377c;
        int i5 = this.f378d;
        return "LimitBeforeAndAfterResult(limitedBefore=" + str + ", limitedAfter=" + str2 + ", removedCharactersCountBefore=" + i4 + ", removedCharactersCountAfter=" + i5 + ")";
    }
}
