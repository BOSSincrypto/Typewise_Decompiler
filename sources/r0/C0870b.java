package r0;

import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

/* renamed from: r0.b  reason: case insensitive filesystem */
public final class C0870b {

    /* renamed from: h  reason: collision with root package name */
    public static final a f16001h = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private List f16002a;

    /* renamed from: b  reason: collision with root package name */
    private final List f16003b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16004c;

    /* renamed from: d  reason: collision with root package name */
    private final List f16005d;

    /* renamed from: e  reason: collision with root package name */
    private final List f16006e;

    /* renamed from: f  reason: collision with root package name */
    private final List f16007f;

    /* renamed from: g  reason: collision with root package name */
    private final String f16008g;

    /* renamed from: r0.b$a */
    public static final class a {
        private a() {
        }

        public final C0870b a() {
            return new C0870b((List) null, (List) null, "", (List) null, C0718m.e(0), C0718m.e(""), "", 11, (i) null);
        }

        public final C0870b b(String str) {
            o.e(str, "newReturnString");
            return new C0870b((List) null, (List) null, str, (List) null, C0718m.e(0), C0718m.e(""), "", 11, (i) null);
        }

        public final C0870b c(String str, String str2) {
            o.e(str, "newReturnString");
            o.e(str2, "originalWord");
            return new C0870b((List) null, (List) null, str, (List) null, (List) null, (List) null, str2, 59, (i) null);
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public C0870b(List list, List list2, String str, List list3, List list4, List list5, String str2) {
        o.e(list, "numberOfItemsToReplace");
        o.e(list2, "bestSuggestions");
        o.e(str, "newReturnString");
        o.e(list3, "bestScores");
        o.e(list4, "startIndices");
        o.e(list5, "wordsWithSpecialAndTrigger");
        o.e(str2, "originalWord");
        this.f16002a = list;
        this.f16003b = list2;
        this.f16004c = str;
        this.f16005d = list3;
        this.f16006e = list4;
        this.f16007f = list5;
        this.f16008g = str2;
    }

    public final String a() {
        String str;
        List list = this.f16003b;
        if (list.isEmpty() || list.get(0) == null) {
            str = "";
        } else {
            str = (String) list.get(0);
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final List b() {
        return this.f16003b;
    }

    public final String c() {
        return this.f16004c;
    }

    public final List d() {
        return this.f16002a;
    }

    public final String e() {
        return this.f16008g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0870b)) {
            return false;
        }
        C0870b bVar = (C0870b) obj;
        if (o.a(this.f16002a, bVar.f16002a) && o.a(this.f16003b, bVar.f16003b) && o.a(this.f16004c, bVar.f16004c) && o.a(this.f16005d, bVar.f16005d) && o.a(this.f16006e, bVar.f16006e) && o.a(this.f16007f, bVar.f16007f) && o.a(this.f16008g, bVar.f16008g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((this.f16002a.hashCode() * 31) + this.f16003b.hashCode()) * 31) + this.f16004c.hashCode()) * 31) + this.f16005d.hashCode()) * 31) + this.f16006e.hashCode()) * 31) + this.f16007f.hashCode()) * 31) + this.f16008g.hashCode();
    }

    public String toString() {
        List list = this.f16002a;
        List list2 = this.f16003b;
        String str = this.f16004c;
        List list3 = this.f16005d;
        List list4 = this.f16006e;
        List list5 = this.f16007f;
        String str2 = this.f16008g;
        return "PointCorrectionResult(numberOfItemsToReplace=" + list + ", bestSuggestions=" + list2 + ", newReturnString=" + str + ", bestScores=" + list3 + ", startIndices=" + list4 + ", wordsWithSpecialAndTrigger=" + list5 + ", originalWord=" + str2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0870b(List list, List list2, String str, List list3, List list4, List list5, String str2, int i4, i iVar) {
        this((i4 & 1) != 0 ? C0718m.e(-1) : list, (i4 & 2) != 0 ? C0718m.e("") : list2, str, (i4 & 8) != 0 ? C0718m.e(Float.valueOf(0.0f)) : list3, (i4 & 16) != 0 ? C0718m.e(Integer.valueOf(str.length() * -1)) : list4, (i4 & 32) != 0 ? C0718m.e(str) : list5, str2);
    }
}
