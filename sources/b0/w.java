package B0;

import androidx.work.c;
import java.util.List;
import kotlin.jvm.internal.o;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final t f183a;

    /* renamed from: b  reason: collision with root package name */
    private final List f184b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f185c;

    public w(t tVar, List list, boolean z3) {
        o.e(tVar, "suggestedWordsAndFeatures");
        o.e(list, "whichSplitList");
        this.f183a = tVar;
        this.f184b = list;
        this.f185c = z3;
    }

    public final t a() {
        return this.f183a;
    }

    public final List b() {
        return this.f184b;
    }

    public final boolean c() {
        return this.f185c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (o.a(this.f183a, wVar.f183a) && o.a(this.f184b, wVar.f184b) && this.f185c == wVar.f185c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f183a.hashCode() * 31) + this.f184b.hashCode()) * 31) + c.a(this.f185c);
    }

    public String toString() {
        t tVar = this.f183a;
        List list = this.f184b;
        boolean z3 = this.f185c;
        return "SuggestionsAndFeaturesResult(suggestedWordsAndFeatures=" + tVar + ", whichSplitList=" + list + ", earlyExit=" + z3 + ")";
    }
}
