package B0;

import java.util.List;
import kotlin.jvm.internal.o;
import r0.e;

public final class F {

    /* renamed from: a  reason: collision with root package name */
    private List f53a;

    /* renamed from: b  reason: collision with root package name */
    private e f54b;

    public F(List list, e eVar) {
        o.e(list, "suggestItems");
        o.e(eVar, "previousWordData");
        this.f53a = list;
        this.f54b = eVar;
    }

    public final e a() {
        return this.f54b;
    }

    public final void b(List list) {
        o.e(list, "<set-?>");
        this.f53a = list;
    }

    public final List c() {
        return this.f53a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f4 = (F) obj;
        if (o.a(this.f53a, f4.f53a) && o.a(this.f54b, f4.f54b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f53a.hashCode() * 31) + this.f54b.hashCode();
    }

    public String toString() {
        List list = this.f53a;
        e eVar = this.f54b;
        return "LookupResult(suggestItems=" + list + ", previousWordData=" + eVar + ")";
    }
}
