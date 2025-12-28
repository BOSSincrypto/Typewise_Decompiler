package l0;

import kotlin.jvm.internal.o;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f14443a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14444b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14445c;

    public i(String str, int i4, int i5) {
        o.e(str, "workSpecId");
        this.f14443a = str;
        this.f14444b = i4;
        this.f14445c = i5;
    }

    public final int a() {
        return this.f14444b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (o.a(this.f14443a, iVar.f14443a) && this.f14444b == iVar.f14444b && this.f14445c == iVar.f14445c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f14443a.hashCode() * 31) + this.f14444b) * 31) + this.f14445c;
    }

    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.f14443a + ", generation=" + this.f14444b + ", systemId=" + this.f14445c + ')';
    }
}
