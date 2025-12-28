package r0;

import kotlin.jvm.internal.o;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f16022a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16023b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16024c;

    /* renamed from: d  reason: collision with root package name */
    private final int f16025d;

    /* renamed from: e  reason: collision with root package name */
    private final String f16026e;

    public e(String str, int i4, int i5, int i6, String str2) {
        o.e(str, "word");
        o.e(str2, "wordWithPossessiveAndElision");
        this.f16022a = str;
        this.f16023b = i4;
        this.f16024c = i5;
        this.f16025d = i6;
        this.f16026e = str2;
    }

    public final int a() {
        return this.f16025d;
    }

    public final int b() {
        return this.f16023b;
    }

    public final int c() {
        return this.f16024c;
    }

    public final String d() {
        return this.f16022a;
    }

    public final String e() {
        return this.f16026e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (o.a(this.f16022a, eVar.f16022a) && this.f16023b == eVar.f16023b && this.f16024c == eVar.f16024c && this.f16025d == eVar.f16025d && o.a(this.f16026e, eVar.f16026e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.f16022a.hashCode() * 31) + this.f16023b) * 31) + this.f16024c) * 31) + this.f16025d) * 31) + this.f16026e.hashCode();
    }

    public String toString() {
        String str = this.f16022a;
        int i4 = this.f16023b;
        int i5 = this.f16024c;
        int i6 = this.f16025d;
        String str2 = this.f16026e;
        return "WordData(word=" + str + ", freq=" + i4 + ", timesTyped=" + i5 + ", biGramTimesTyped=" + i6 + ", wordWithPossessiveAndElision=" + str2 + ")";
    }
}
