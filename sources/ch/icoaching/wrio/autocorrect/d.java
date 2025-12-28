package ch.icoaching.wrio.autocorrect;

import java.util.List;
import kotlin.jvm.internal.o;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final int f9311a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9312b;

    /* renamed from: c  reason: collision with root package name */
    private final List f9313c;

    public d(int i4, String str, List list) {
        o.e(str, "original");
        o.e(list, "candidates");
        this.f9311a = i4;
        this.f9312b = str;
        this.f9313c = list;
    }

    public final List a() {
        return this.f9313c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f9311a == dVar.f9311a && o.a(this.f9312b, dVar.f9312b) && o.a(this.f9313c, dVar.f9313c);
    }

    public int hashCode() {
        return (((this.f9311a * 31) + this.f9312b.hashCode()) * 31) + this.f9313c.hashCode();
    }

    public String toString() {
        return "CorrectionCandidatesModel(offset=" + this.f9311a + ", original=" + this.f9312b + ", candidates=" + this.f9313c + ')';
    }
}
