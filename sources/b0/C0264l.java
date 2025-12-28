package B0;

import E0.p;
import androidx.work.c;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: B0.l  reason: case insensitive filesystem */
public final class C0264l {

    /* renamed from: a  reason: collision with root package name */
    private final String f128a;

    /* renamed from: b  reason: collision with root package name */
    private final List f129b;

    /* renamed from: c  reason: collision with root package name */
    private final List f130c;

    /* renamed from: d  reason: collision with root package name */
    private final char f131d;

    /* renamed from: e  reason: collision with root package name */
    private final p f132e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f133f;

    public C0264l(String str, List list, List list2, char c4, p pVar, boolean z3) {
        o.e(str, "stringIn");
        o.e(list, "touchPoints");
        o.e(list2, "forcedCasing");
        o.e(pVar, "triggerTouchPoint");
        this.f128a = str;
        this.f129b = list;
        this.f130c = list2;
        this.f131d = c4;
        this.f132e = pVar;
        this.f133f = z3;
    }

    public final List a() {
        return this.f130c;
    }

    public final boolean b() {
        return this.f133f;
    }

    public final String c() {
        return this.f128a;
    }

    public final List d() {
        return this.f129b;
    }

    public final char e() {
        return this.f131d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0264l)) {
            return false;
        }
        C0264l lVar = (C0264l) obj;
        if (o.a(this.f128a, lVar.f128a) && o.a(this.f129b, lVar.f129b) && o.a(this.f130c, lVar.f130c) && this.f131d == lVar.f131d && o.a(this.f132e, lVar.f132e) && this.f133f == lVar.f133f) {
            return true;
        }
        return false;
    }

    public final String f() {
        String lowerCase = this.f128a.toLowerCase(Locale.ROOT);
        o.d(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public int hashCode() {
        return (((((((((this.f128a.hashCode() * 31) + this.f129b.hashCode()) * 31) + this.f130c.hashCode()) * 31) + this.f131d) * 31) + this.f132e.hashCode()) * 31) + c.a(this.f133f);
    }

    public String toString() {
        String str = this.f128a;
        List list = this.f129b;
        List list2 = this.f130c;
        char c4 = this.f131d;
        p pVar = this.f132e;
        boolean z3 = this.f133f;
        return "CleanedCorrectionInput(stringIn=" + str + ", touchPoints=" + list + ", forcedCasing=" + list2 + ", triggerChar=" + c4 + ", triggerTouchPoint=" + pVar + ", onlyCorrectCurrentWord=" + z3 + ")";
    }
}
