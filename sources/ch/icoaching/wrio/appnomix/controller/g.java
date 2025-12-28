package ch.icoaching.wrio.appnomix.controller;

import androidx.work.c;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9241a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9242b;

    public g(boolean z3, boolean z4) {
        this.f9241a = z3;
        this.f9242b = z4;
    }

    public static g a(g gVar, boolean z3, boolean z4, int i4) {
        if ((i4 & 1) != 0) {
            z3 = gVar.f9241a;
        }
        if ((i4 & 2) != 0) {
            z4 = gVar.f9242b;
        }
        gVar.getClass();
        return new g(z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f9241a == gVar.f9241a && this.f9242b == gVar.f9242b;
    }

    public final int hashCode() {
        return c.a(this.f9242b) + (c.a(this.f9241a) * 31);
    }

    public final String toString() {
        return "SearchResultState(searchSuggestionsAvailable=" + this.f9241a + ", productSuggestionsAvailable=" + this.f9242b + ')';
    }
}
