package v0;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;

/* renamed from: v0.a  reason: case insensitive filesystem */
public final class C0920a {

    /* renamed from: a  reason: collision with root package name */
    private Set f16388a;

    /* renamed from: b  reason: collision with root package name */
    private Set f16389b;

    public C0920a(Set set, Set set2) {
        o.e(set, "stringFilters");
        o.e(set2, "regexFilters");
        this.f16388a = set;
        this.f16389b = set2;
    }

    public final Set a() {
        return this.f16389b;
    }

    public final Set b() {
        return this.f16388a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0920a.class != obj.getClass()) {
            return false;
        }
        C0920a aVar = (C0920a) obj;
        if (!o.a(this.f16388a, aVar.f16388a)) {
            return false;
        }
        Set<Regex> set = this.f16389b;
        ArrayList arrayList = new ArrayList(C0718m.t(set, 10));
        for (Regex pattern : set) {
            arrayList.add(pattern.getPattern());
        }
        Set<Regex> set2 = aVar.f16389b;
        ArrayList arrayList2 = new ArrayList(C0718m.t(set2, 10));
        for (Regex pattern2 : set2) {
            arrayList2.add(pattern2.getPattern());
        }
        if (!o.a(arrayList, arrayList2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.f16388a.hashCode() * 31;
        Set<Regex> set = this.f16389b;
        ArrayList arrayList = new ArrayList(C0718m.t(set, 10));
        for (Regex pattern : set) {
            arrayList.add(pattern.getPattern());
        }
        return hashCode + arrayList.hashCode();
    }

    public String toString() {
        Set set = this.f16388a;
        Set set2 = this.f16389b;
        return "BlockedPredictionsPerLanguage(stringFilters=" + set + ", regexFilters=" + set2 + ")";
    }
}
