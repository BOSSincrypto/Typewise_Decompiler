package D0;

import kotlin.jvm.internal.o;

public final class M {

    /* renamed from: a  reason: collision with root package name */
    private final String f242a;

    /* renamed from: b  reason: collision with root package name */
    private final String f243b;

    /* renamed from: c  reason: collision with root package name */
    private final String f244c;

    /* renamed from: d  reason: collision with root package name */
    private final String f245d;

    public M(String str, String str2, String str3, String str4) {
        o.e(str, "originalContext");
        o.e(str2, "contextForBeamSearch");
        o.e(str3, "priorForBeamSearch");
        o.e(str4, "priorForReInjection");
        this.f242a = str;
        this.f243b = str2;
        this.f244c = str3;
        this.f245d = str4;
    }

    public final String a() {
        return this.f243b;
    }

    public final String b() {
        return this.f244c;
    }

    public final String c() {
        return this.f245d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m4 = (M) obj;
        if (o.a(this.f242a, m4.f242a) && o.a(this.f243b, m4.f243b) && o.a(this.f244c, m4.f244c) && o.a(this.f245d, m4.f245d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f242a.hashCode() * 31) + this.f243b.hashCode()) * 31) + this.f244c.hashCode()) * 31) + this.f245d.hashCode();
    }

    public String toString() {
        String str = this.f242a;
        String str2 = this.f243b;
        String str3 = this.f244c;
        String str4 = this.f245d;
        return "ContextAndPriorSeparated(originalContext=" + str + ", contextForBeamSearch=" + str2 + ", priorForBeamSearch=" + str3 + ", priorForReInjection=" + str4 + ")";
    }
}
