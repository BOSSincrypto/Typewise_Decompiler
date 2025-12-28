package B0;

import java.util.List;
import kotlin.jvm.internal.i;

public final class o implements Comparable {

    /* renamed from: f  reason: collision with root package name */
    public static final a f148f = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f149a;

    /* renamed from: b  reason: collision with root package name */
    private float f150b;

    /* renamed from: c  reason: collision with root package name */
    private final List f151c;

    /* renamed from: d  reason: collision with root package name */
    private String f152d;

    /* renamed from: e  reason: collision with root package name */
    private final int f153e;

    public static final class a {
        private a() {
        }

        public static /* synthetic */ o a(a aVar, String str, float f4, List list, String str2, int i4, int i5, Object obj) {
            if ((i5 & 8) != 0) {
                str2 = "";
            }
            String str3 = str2;
            if ((i5 & 16) != 0) {
                i4 = -1;
            }
            return aVar.b(str, f4, list, str3, i4);
        }

        public final o b(String str, float f4, List list, String str2, int i4) {
            String str3;
            kotlin.jvm.internal.o.e(str, "term");
            kotlin.jvm.internal.o.e(list, "wordData");
            kotlin.jvm.internal.o.e(str2, "termNoDiacritics");
            if (kotlin.jvm.internal.o.a(str2, "")) {
                str3 = str;
            } else {
                str3 = str2;
            }
            return new o(str, f4, list, str3, i4, (i) null);
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    private o(String str, float f4, List list, String str2, int i4) {
        this.f149a = str;
        this.f150b = f4;
        this.f151c = list;
        this.f152d = str2;
        this.f153e = i4;
    }

    public static /* synthetic */ o c(o oVar, String str, float f4, List list, String str2, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = oVar.f149a;
        }
        if ((i5 & 2) != 0) {
            f4 = oVar.f150b;
        }
        float f5 = f4;
        if ((i5 & 4) != 0) {
            list = oVar.f151c;
        }
        List list2 = list;
        if ((i5 & 8) != 0) {
            str2 = oVar.f152d;
        }
        String str3 = str2;
        if ((i5 & 16) != 0) {
            i4 = oVar.f153e;
        }
        return oVar.d(str, f5, list2, str3, i4);
    }

    public final float a() {
        return this.f150b;
    }

    /* renamed from: b */
    public int compareTo(o oVar) {
        kotlin.jvm.internal.o.e(oVar, "other");
        float f4 = this.f150b;
        float f5 = oVar.f150b;
        if (f4 == f5) {
            return -this.f149a.compareTo(oVar.f149a);
        }
        return Float.compare(f4, f5);
    }

    public final o d(String str, float f4, List list, String str2, int i4) {
        kotlin.jvm.internal.o.e(str, "term");
        kotlin.jvm.internal.o.e(list, "wordData");
        kotlin.jvm.internal.o.e(str2, "termNoDiacritics");
        return new o(str, f4, list, str2, i4);
    }

    public final int e() {
        return this.f153e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!kotlin.jvm.internal.o.a(this.f149a, oVar.f149a) || this.f150b != oVar.f150b || !kotlin.jvm.internal.o.a(this.f151c, oVar.f151c)) {
            return false;
        }
        return true;
    }

    public final String f() {
        return this.f149a;
    }

    public final String g() {
        return this.f152d;
    }

    public final List h() {
        return this.f151c;
    }

    public int hashCode() {
        return (((this.f149a.hashCode() * 31) + Float.floatToIntBits(this.f150b)) * 31) + this.f151c.hashCode();
    }

    public String toString() {
        String str = this.f149a;
        float f4 = this.f150b;
        List list = this.f151c;
        String str2 = this.f152d;
        int i4 = this.f153e;
        return "SuggestItem(term='" + str + "', distance=" + f4 + ", wordData=" + list + ", termNoDiacritics='" + str2 + "', spaceSplitIndex=" + i4 + ")";
    }

    public /* synthetic */ o(String str, float f4, List list, String str2, int i4, i iVar) {
        this(str, f4, list, str2, i4);
    }
}
