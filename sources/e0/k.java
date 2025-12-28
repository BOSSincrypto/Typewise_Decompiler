package E0;

import java.util.List;
import kotlin.jvm.internal.o;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final String f379a;

    /* renamed from: b  reason: collision with root package name */
    private final List f380b;

    public k(String str, List list) {
        o.e(str, "limitedText");
        o.e(list, "limitedTouchPoints");
        this.f379a = str;
        this.f380b = list;
    }

    public final String a() {
        return this.f379a;
    }

    public final List b() {
        return this.f380b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (o.a(this.f379a, kVar.f379a) && o.a(this.f380b, kVar.f380b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f379a.hashCode() * 31) + this.f380b.hashCode();
    }

    public String toString() {
        String str = this.f379a;
        List list = this.f380b;
        return "LimitInputTextAndTouchPointsResult(limitedText=" + str + ", limitedTouchPoints=" + list + ")";
    }
}
