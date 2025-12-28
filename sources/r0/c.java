package r0;

import java.util.Locale;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class c {

    /* renamed from: f  reason: collision with root package name */
    public static final a f16009f = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f16010a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16011b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16012c;

    /* renamed from: d  reason: collision with root package name */
    private final String f16013d;

    /* renamed from: e  reason: collision with root package name */
    private final String f16014e;

    public static final class a {
        private a() {
        }

        public static /* synthetic */ c b(a aVar, String str, String str2, String str3, String str4, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                str2 = null;
            }
            if ((i4 & 4) != 0) {
                str3 = null;
            }
            if ((i4 & 8) != 0) {
                str4 = null;
            }
            return aVar.a(str, str2, str3, str4);
        }

        public final c a(String str, String str2, String str3, String str4) {
            String str5;
            String str6;
            o.e(str, "rawWord");
            if (str2 == null) {
                str2 = ch.icoaching.typewise.autocorrection.resources.a.b(str);
            }
            String str7 = str2;
            String str8 = null;
            if (str3 != null) {
                String lowerCase = str3.toLowerCase(Locale.ROOT);
                o.d(lowerCase, "toLowerCase(...)");
                str5 = lowerCase;
            } else {
                str5 = null;
            }
            if (str4 != null) {
                str8 = str4.toLowerCase(Locale.ROOT);
                o.d(str8, "toLowerCase(...)");
            }
            String str9 = str8;
            String str10 = "";
            if (str5 == null) {
                str6 = str10;
            } else {
                str6 = str5;
            }
            if (str9 != null) {
                str10 = str9;
            }
            return new c(str, str7, str5, str9, str6 + str + str10, (i) null);
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    private c(String str, String str2, String str3, String str4, String str5) {
        this.f16010a = str;
        this.f16011b = str2;
        this.f16012c = str3;
        this.f16013d = str4;
        this.f16014e = str5;
    }

    public final String a() {
        return this.f16013d;
    }

    public final String b() {
        return this.f16010a;
    }

    public final String c() {
        return this.f16012c;
    }

    public final String d() {
        return this.f16011b;
    }

    public final String e() {
        return this.f16014e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (o.a(this.f16010a, cVar.f16010a) && o.a(this.f16011b, cVar.f16011b) && o.a(this.f16012c, cVar.f16012c) && o.a(this.f16013d, cVar.f16013d) && o.a(this.f16014e, cVar.f16014e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i4;
        int hashCode = ((this.f16010a.hashCode() * 31) + this.f16011b.hashCode()) * 31;
        String str = this.f16012c;
        int i5 = 0;
        if (str == null) {
            i4 = 0;
        } else {
            i4 = str.hashCode();
        }
        int i6 = (hashCode + i4) * 31;
        String str2 = this.f16013d;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        return ((i6 + i5) * 31) + this.f16014e.hashCode();
    }

    public String toString() {
        String str = this.f16010a;
        String str2 = this.f16011b;
        String str3 = this.f16012c;
        String str4 = this.f16013d;
        String str5 = this.f16014e;
        return "SingleWord(rawWord=" + str + ", wordNoDiacritics=" + str2 + ", startElision=" + str3 + ", endPossessive=" + str4 + ", wordWithElisionAndPossessive=" + str5 + ")";
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, String str5, i iVar) {
        this(str, str2, str3, str4, str5);
    }
}
