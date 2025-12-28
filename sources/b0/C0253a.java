package B0;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.o;
import r0.e;

/* renamed from: B0.a  reason: case insensitive filesystem */
public final class C0253a {

    /* renamed from: a  reason: collision with root package name */
    private final Set f81a;

    /* renamed from: b  reason: collision with root package name */
    private final List f82b;

    /* renamed from: c  reason: collision with root package name */
    private final float f83c;

    /* renamed from: d  reason: collision with root package name */
    private final e f84d;

    public C0253a(Set set, List list, float f4, e eVar) {
        o.e(set, "consideredSuggestions");
        o.e(list, "suggestions");
        o.e(eVar, "previousWordData");
        this.f81a = set;
        this.f82b = list;
        this.f83c = f4;
        this.f84d = eVar;
    }

    public final Set a() {
        return this.f81a;
    }

    public final float b() {
        return this.f83c;
    }

    public final e c() {
        return this.f84d;
    }

    public final List d() {
        return this.f82b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0253a)) {
            return false;
        }
        C0253a aVar = (C0253a) obj;
        if (o.a(this.f81a, aVar.f81a) && o.a(this.f82b, aVar.f82b) && Float.compare(this.f83c, aVar.f83c) == 0 && o.a(this.f84d, aVar.f84d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f81a.hashCode() * 31) + this.f82b.hashCode()) * 31) + Float.floatToIntBits(this.f83c)) * 31) + this.f84d.hashCode();
    }

    public String toString() {
        Set set = this.f81a;
        List list = this.f82b;
        float f4 = this.f83c;
        e eVar = this.f84d;
        return "ProcessedSuggestions(consideredSuggestions=" + set + ", suggestions=" + list + ", maxEditDistance2=" + f4 + ", previousWordData=" + eVar + ")";
    }
}
