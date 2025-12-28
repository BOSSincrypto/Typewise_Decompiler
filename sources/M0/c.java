package M0;

import java.util.List;
import kotlin.jvm.internal.o;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final float f897a;

    /* renamed from: b  reason: collision with root package name */
    private final List f898b;

    public c(float f4, List list) {
        o.e(list, "keyCenters");
        this.f897a = f4;
        this.f898b = list;
    }

    public final float a() {
        return this.f897a;
    }

    public final List b() {
        return this.f898b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Float.compare(this.f897a, cVar.f897a) == 0 && o.a(this.f898b, cVar.f898b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f897a) * 31) + this.f898b.hashCode();
    }

    public String toString() {
        return "KeyCentres(distanceBetweenAdjacentKeyCenters=" + this.f897a + ", keyCenters=" + this.f898b + ')';
    }
}
