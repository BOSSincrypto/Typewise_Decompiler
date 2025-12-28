package kotlin.jvm.internal;

public final class q implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Class f13907a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13908b;

    public q(Class cls, String str) {
        o.e(cls, "jClass");
        o.e(str, "moduleName");
        this.f13907a = cls;
        this.f13908b = str;
    }

    public Class c() {
        return this.f13907a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q) || !o.a(c(), ((q) obj).c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return c().hashCode();
    }

    public String toString() {
        return c().toString() + " (Kotlin reflection is not available)";
    }
}
