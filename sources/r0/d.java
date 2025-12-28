package r0;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class d {

    /* renamed from: g  reason: collision with root package name */
    public static final a f16015g = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f16016a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16017b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16018c;

    /* renamed from: d  reason: collision with root package name */
    private final String f16019d;

    /* renamed from: e  reason: collision with root package name */
    private final String f16020e;

    /* renamed from: f  reason: collision with root package name */
    private final String f16021f;

    public static final class a {
        private a() {
        }

        public final d a() {
            return new d("", "", "", "", (String) null, (String) null);
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public d(String str, String str2, String str3, String str4, String str5, String str6) {
        o.e(str, "word");
        o.e(str2, "lowerCased");
        o.e(str3, "beginSpecial");
        o.e(str4, "endSpecial");
        this.f16016a = str;
        this.f16017b = str2;
        this.f16018c = str3;
        this.f16019d = str4;
        this.f16020e = str5;
        this.f16021f = str6;
    }

    public static /* synthetic */ d b(d dVar, String str, String str2, String str3, String str4, String str5, String str6, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = dVar.f16016a;
        }
        if ((i4 & 2) != 0) {
            str2 = dVar.f16017b;
        }
        String str7 = str2;
        if ((i4 & 4) != 0) {
            str3 = dVar.f16018c;
        }
        String str8 = str3;
        if ((i4 & 8) != 0) {
            str4 = dVar.f16019d;
        }
        String str9 = str4;
        if ((i4 & 16) != 0) {
            str5 = dVar.f16020e;
        }
        String str10 = str5;
        if ((i4 & 32) != 0) {
            str6 = dVar.f16021f;
        }
        return dVar.a(str, str7, str8, str9, str10, str6);
    }

    public final d a(String str, String str2, String str3, String str4, String str5, String str6) {
        o.e(str, "word");
        o.e(str2, "lowerCased");
        o.e(str3, "beginSpecial");
        o.e(str4, "endSpecial");
        return new d(str, str2, str3, str4, str5, str6);
    }

    public final String c() {
        return this.f16020e;
    }

    public final String d() {
        return this.f16018c;
    }

    public final String e() {
        return this.f16021f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (o.a(this.f16016a, dVar.f16016a) && o.a(this.f16017b, dVar.f16017b) && o.a(this.f16018c, dVar.f16018c) && o.a(this.f16019d, dVar.f16019d) && o.a(this.f16020e, dVar.f16020e) && o.a(this.f16021f, dVar.f16021f)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f16019d;
    }

    public final String g() {
        return this.f16017b;
    }

    public final String h() {
        return this.f16016a;
    }

    public int hashCode() {
        int i4;
        int hashCode = ((((((this.f16016a.hashCode() * 31) + this.f16017b.hashCode()) * 31) + this.f16018c.hashCode()) * 31) + this.f16019d.hashCode()) * 31;
        String str = this.f16020e;
        int i5 = 0;
        if (str == null) {
            i4 = 0;
        } else {
            i4 = str.hashCode();
        }
        int i6 = (hashCode + i4) * 31;
        String str2 = this.f16021f;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        return i6 + i5;
    }

    public String toString() {
        String str = this.f16016a;
        String str2 = this.f16017b;
        String str3 = this.f16018c;
        String str4 = this.f16019d;
        String str5 = this.f16020e;
        String str6 = this.f16021f;
        return "StrippedWord(word=" + str + ", lowerCased=" + str2 + ", beginSpecial=" + str3 + ", endSpecial=" + str4 + ", beginElision=" + str5 + ", endPossessive=" + str6 + ")";
    }
}
