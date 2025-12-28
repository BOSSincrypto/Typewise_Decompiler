package l0;

import kotlin.jvm.internal.o;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final String f14453a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14454b;

    public m(String str, int i4) {
        o.e(str, "workSpecId");
        this.f14453a = str;
        this.f14454b = i4;
    }

    public final int a() {
        return this.f14454b;
    }

    public final String b() {
        return this.f14453a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (o.a(this.f14453a, mVar.f14453a) && this.f14454b == mVar.f14454b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f14453a.hashCode() * 31) + this.f14454b;
    }

    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f14453a + ", generation=" + this.f14454b + ')';
    }
}
