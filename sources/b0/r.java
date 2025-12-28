package B0;

import kotlin.jvm.internal.o;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private t f166a;

    /* renamed from: b  reason: collision with root package name */
    private int f167b;

    /* renamed from: c  reason: collision with root package name */
    private int f168c;

    public r(t tVar, int i4, int i5) {
        o.e(tVar, "suggestedWordsAndFeatures");
        this.f166a = tVar;
        this.f167b = i4;
        this.f168c = i5;
    }

    public final int a() {
        return this.f167b;
    }

    public final int b() {
        return this.f168c;
    }

    public final t c() {
        return this.f166a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (o.a(this.f166a, rVar.f166a) && this.f167b == rVar.f167b && this.f168c == rVar.f168c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f166a.hashCode() * 31) + this.f167b) * 31) + this.f168c;
    }

    public String toString() {
        t tVar = this.f166a;
        int i4 = this.f167b;
        int i5 = this.f168c;
        return "SuggestedResult(suggestedWordsAndFeatures=" + tVar + ", minDistance=" + i4 + ", numberOfWordsFound=" + i5 + ")";
    }
}
