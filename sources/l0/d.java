package l0;

import kotlin.jvm.internal.o;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final String f14438a;

    /* renamed from: b  reason: collision with root package name */
    private final Long f14439b;

    public d(String str, Long l4) {
        o.e(str, "key");
        this.f14438a = str;
        this.f14439b = l4;
    }

    public final String a() {
        return this.f14438a;
    }

    public final Long b() {
        return this.f14439b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (o.a(this.f14438a, dVar.f14438a) && o.a(this.f14439b, dVar.f14439b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i4;
        int hashCode = this.f14438a.hashCode() * 31;
        Long l4 = this.f14439b;
        if (l4 == null) {
            i4 = 0;
        } else {
            i4 = l4.hashCode();
        }
        return hashCode + i4;
    }

    public String toString() {
        return "Preference(key=" + this.f14438a + ", value=" + this.f14439b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(String str, boolean z3) {
        this(str, Long.valueOf(z3 ? 1 : 0));
        o.e(str, "key");
    }
}
