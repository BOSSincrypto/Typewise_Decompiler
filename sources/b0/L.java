package B0;

import androidx.work.c;
import java.util.List;
import kotlin.jvm.internal.o;

public final class L {

    /* renamed from: a  reason: collision with root package name */
    private final String f77a;

    /* renamed from: b  reason: collision with root package name */
    private final List f78b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f79c;

    /* renamed from: d  reason: collision with root package name */
    private final List f80d;

    public L(String str, List list, boolean z3, List list2) {
        o.e(str, "stringForCorrection");
        o.e(list, "touchPoints");
        this.f77a = str;
        this.f78b = list;
        this.f79c = z3;
        this.f80d = list2;
    }

    public final List a() {
        return this.f80d;
    }

    public final boolean b() {
        return this.f79c;
    }

    public final String c() {
        return this.f77a;
    }

    public final List d() {
        return this.f78b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l4 = (L) obj;
        if (o.a(this.f77a, l4.f77a) && o.a(this.f78b, l4.f78b) && this.f79c == l4.f79c && o.a(this.f80d, l4.f80d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i4;
        int hashCode = ((((this.f77a.hashCode() * 31) + this.f78b.hashCode()) * 31) + c.a(this.f79c)) * 31;
        List list = this.f80d;
        if (list == null) {
            i4 = 0;
        } else {
            i4 = list.hashCode();
        }
        return hashCode + i4;
    }

    public String toString() {
        String str = this.f77a;
        List list = this.f78b;
        boolean z3 = this.f79c;
        List list2 = this.f80d;
        return "PointCorrectionInput(stringForCorrection=" + str + ", touchPoints=" + list + ", onlyCorrectCurrentWord=" + z3 + ", forcedCasing=" + list2 + ")";
    }
}
