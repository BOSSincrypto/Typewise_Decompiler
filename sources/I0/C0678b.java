package i0;

/* renamed from: i0.b  reason: case insensitive filesystem */
public final class C0678b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f13664a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f13665b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f13666c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f13667d;

    public C0678b(boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f13664a = z3;
        this.f13665b = z4;
        this.f13666c = z5;
        this.f13667d = z6;
    }

    public final boolean a() {
        return this.f13664a;
    }

    public final boolean b() {
        return this.f13666c;
    }

    public final boolean c() {
        return this.f13667d;
    }

    public final boolean d() {
        return this.f13665b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0678b)) {
            return false;
        }
        C0678b bVar = (C0678b) obj;
        if (this.f13664a == bVar.f13664a && this.f13665b == bVar.f13665b && this.f13666c == bVar.f13666c && this.f13667d == bVar.f13667d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        boolean z3 = this.f13664a;
        boolean z4 = true;
        if (z3) {
            z3 = true;
        }
        int i4 = (z3 ? 1 : 0) * true;
        boolean z5 = this.f13665b;
        if (z5) {
            z5 = true;
        }
        int i5 = (i4 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f13666c;
        if (z6) {
            z6 = true;
        }
        int i6 = (i5 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.f13667d;
        if (!z7) {
            z4 = z7;
        }
        return i6 + (z4 ? 1 : 0);
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.f13664a + ", isValidated=" + this.f13665b + ", isMetered=" + this.f13666c + ", isNotRoaming=" + this.f13667d + ')';
    }
}
