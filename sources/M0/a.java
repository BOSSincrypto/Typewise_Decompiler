package M0;

import kotlin.jvm.internal.o;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f889a;

    /* renamed from: b  reason: collision with root package name */
    private final String f890b;

    /* renamed from: c  reason: collision with root package name */
    private final String f891c;

    public a(String str, String str2, String str3) {
        o.e(str, "key");
        o.e(str2, "lowercase");
        o.e(str3, "uppercase");
        this.f889a = str;
        this.f890b = str2;
        this.f891c = str3;
    }

    public final a a(String str, String str2, String str3) {
        o.e(str, "key");
        o.e(str2, "lowercase");
        o.e(str3, "uppercase");
        return new a(str, str2, str3);
    }

    public final String b() {
        return this.f889a;
    }

    public final String c() {
        return this.f890b;
    }

    public final String d() {
        return this.f891c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (o.a(this.f889a, aVar.f889a) && o.a(this.f890b, aVar.f890b) && o.a(this.f891c, aVar.f891c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f889a.hashCode() * 31) + this.f890b.hashCode()) * 31) + this.f891c.hashCode();
    }

    public String toString() {
        return "Diacritic(key=" + this.f889a + ", lowercase=" + this.f890b + ", uppercase=" + this.f891c + ')';
    }
}
