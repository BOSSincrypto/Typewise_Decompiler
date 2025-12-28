package B0;

import java.util.List;
import kotlin.jvm.internal.o;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final List f173a;

    /* renamed from: b  reason: collision with root package name */
    private final List f174b;

    /* renamed from: c  reason: collision with root package name */
    private final List f175c;

    public t(List list, List list2, List list3) {
        o.e(list, "suggestedWords");
        o.e(list2, "features");
        o.e(list3, "spaceSplitIndices");
        this.f173a = list;
        this.f174b = list2;
        this.f175c = list3;
    }

    public final List a() {
        return this.f174b;
    }

    public final List b() {
        return this.f175c;
    }

    public final List c() {
        return this.f173a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (o.a(this.f173a, tVar.f173a) && o.a(this.f174b, tVar.f174b) && o.a(this.f175c, tVar.f175c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f173a.hashCode() * 31) + this.f174b.hashCode()) * 31) + this.f175c.hashCode();
    }

    public String toString() {
        List list = this.f173a;
        List list2 = this.f174b;
        List list3 = this.f175c;
        return "SuggestedWordsAndFeatures(suggestedWords=" + list + ", features=" + list2 + ", spaceSplitIndices=" + list3 + ")";
    }
}
