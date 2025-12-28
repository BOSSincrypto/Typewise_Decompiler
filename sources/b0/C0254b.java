package B0;

import java.util.List;
import kotlin.jvm.internal.o;
import r0.g;

/* renamed from: B0.b  reason: case insensitive filesystem */
public final class C0254b {

    /* renamed from: a  reason: collision with root package name */
    private final g f85a;

    /* renamed from: b  reason: collision with root package name */
    private final List f86b;

    public C0254b(g gVar, List list) {
        o.e(gVar, "split");
        o.e(list, "bestSuggestions");
        this.f85a = gVar;
        this.f86b = list;
    }

    public final g a() {
        return this.f85a;
    }

    public final List b() {
        return this.f86b;
    }

    public final List c() {
        return this.f86b;
    }

    public final g d() {
        return this.f85a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0254b)) {
            return false;
        }
        C0254b bVar = (C0254b) obj;
        if (o.a(this.f85a, bVar.f85a) && o.a(this.f86b, bVar.f86b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f85a.hashCode() * 31) + this.f86b.hashCode();
    }

    public String toString() {
        g gVar = this.f85a;
        List list = this.f86b;
        return "AddCharsToWordResult(split=" + gVar + ", bestSuggestions=" + list + ")";
    }
}
