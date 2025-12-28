package g2;

/* renamed from: g2.a  reason: case insensitive filesystem */
public final class C0657a {

    /* renamed from: a  reason: collision with root package name */
    private final char f13611a;

    /* renamed from: b  reason: collision with root package name */
    private int f13612b;

    public C0657a(char c4, int i4) {
        this.f13611a = c4;
        this.f13612b = i4;
    }

    public final char a() {
        return this.f13611a;
    }

    public final void b(int i4) {
        this.f13612b = i4;
    }

    public final int c() {
        return this.f13612b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0657a)) {
            return false;
        }
        C0657a aVar = (C0657a) obj;
        if (this.f13611a == aVar.f13611a && this.f13612b == aVar.f13612b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f13611a * 31) + this.f13612b;
    }

    public String toString() {
        return "StoredSymbolData(symbol=" + this.f13611a + ", timesTyped=" + this.f13612b + ')';
    }
}
