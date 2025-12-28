package kotlin.text;

import kotlin.jvm.internal.o;
import z2.c;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final String f13975a;

    /* renamed from: b  reason: collision with root package name */
    private final c f13976b;

    public j(String str, c cVar) {
        o.e(str, "value");
        o.e(cVar, "range");
        this.f13975a = str;
        this.f13976b = cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return o.a(this.f13975a, jVar.f13975a) && o.a(this.f13976b, jVar.f13976b);
    }

    public int hashCode() {
        return (this.f13975a.hashCode() * 31) + this.f13976b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f13975a + ", range=" + this.f13976b + ')';
    }
}
