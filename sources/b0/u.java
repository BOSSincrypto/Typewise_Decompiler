package B0;

import java.util.List;
import kotlin.jvm.internal.o;
import r0.c;
import r0.e;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    private final c f176a;

    /* renamed from: b  reason: collision with root package name */
    private final e f177b;

    /* renamed from: c  reason: collision with root package name */
    private final String f178c;

    /* renamed from: d  reason: collision with root package name */
    private final r f179d;

    /* renamed from: e  reason: collision with root package name */
    private final List f180e;

    /* renamed from: f  reason: collision with root package name */
    private final String f181f;

    /* renamed from: g  reason: collision with root package name */
    private final String f182g;

    public u(c cVar, e eVar, String str, r rVar, List list, String str2, String str3) {
        o.e(cVar, "singleWord");
        o.e(eVar, "previousWordData");
        o.e(str, "context");
        o.e(rVar, "suggestedResult");
        o.e(list, "touchPoints");
        this.f176a = cVar;
        this.f177b = eVar;
        this.f178c = str;
        this.f179d = rVar;
        this.f180e = list;
        this.f181f = str2;
        this.f182g = str3;
    }

    public static /* synthetic */ u a(u uVar, c cVar, e eVar, String str, r rVar, List list, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            cVar = uVar.f176a;
        }
        if ((i4 & 2) != 0) {
            eVar = uVar.f177b;
        }
        e eVar2 = eVar;
        if ((i4 & 4) != 0) {
            str = uVar.f178c;
        }
        String str4 = str;
        if ((i4 & 8) != 0) {
            rVar = uVar.f179d;
        }
        r rVar2 = rVar;
        if ((i4 & 16) != 0) {
            list = uVar.f180e;
        }
        List list2 = list;
        if ((i4 & 32) != 0) {
            str2 = uVar.f181f;
        }
        String str5 = str2;
        if ((i4 & 64) != 0) {
            str3 = uVar.f182g;
        }
        return uVar.b(cVar, eVar2, str4, rVar2, list2, str5, str3);
    }

    public final u b(c cVar, e eVar, String str, r rVar, List list, String str2, String str3) {
        o.e(cVar, "singleWord");
        o.e(eVar, "previousWordData");
        o.e(str, "context");
        o.e(rVar, "suggestedResult");
        o.e(list, "touchPoints");
        return new u(cVar, eVar, str, rVar, list, str2, str3);
    }

    public final String c() {
        return this.f182g;
    }

    public final String d() {
        return this.f181f;
    }

    public final e e() {
        return this.f177b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (o.a(this.f176a, uVar.f176a) && o.a(this.f177b, uVar.f177b) && o.a(this.f178c, uVar.f178c) && o.a(this.f179d, uVar.f179d) && o.a(this.f180e, uVar.f180e) && o.a(this.f181f, uVar.f181f) && o.a(this.f182g, uVar.f182g)) {
            return true;
        }
        return false;
    }

    public final c f() {
        return this.f176a;
    }

    public final r g() {
        return this.f179d;
    }

    public final List h() {
        return this.f180e;
    }

    public int hashCode() {
        int i4;
        int hashCode = ((((((((this.f176a.hashCode() * 31) + this.f177b.hashCode()) * 31) + this.f178c.hashCode()) * 31) + this.f179d.hashCode()) * 31) + this.f180e.hashCode()) * 31;
        String str = this.f181f;
        int i5 = 0;
        if (str == null) {
            i4 = 0;
        } else {
            i4 = str.hashCode();
        }
        int i6 = (hashCode + i4) * 31;
        String str2 = this.f182g;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        return i6 + i5;
    }

    public String toString() {
        c cVar = this.f176a;
        e eVar = this.f177b;
        String str = this.f178c;
        r rVar = this.f179d;
        List list = this.f180e;
        String str2 = this.f181f;
        String str3 = this.f182g;
        return "SuggestionInput(singleWord=" + cVar + ", previousWordData=" + eVar + ", context=" + str + ", suggestedResult=" + rVar + ", touchPoints=" + list + ", originalLowerCasedWord=" + str2 + ", endStrip=" + str3 + ")";
    }
}
