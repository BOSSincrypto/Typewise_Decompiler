package D0;

import kotlin.jvm.internal.o;

public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f338a;

    /* renamed from: b  reason: collision with root package name */
    private final m0 f339b;

    public l0(int i4, m0 m0Var) {
        o.e(m0Var, "sentenceDescription");
        this.f338a = i4;
        this.f339b = m0Var;
    }

    public final int a() {
        return this.f338a;
    }

    public final m0 b() {
        return this.f339b;
    }

    public final int c() {
        return this.f338a;
    }

    public final m0 d() {
        return this.f339b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f338a == l0Var.f338a && o.a(this.f339b, l0Var.f339b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f338a * 31) + this.f339b.hashCode();
    }

    public String toString() {
        int i4 = this.f338a;
        m0 m0Var = this.f339b;
        return "RunningPredictionInfo(nFoundChars=" + i4 + ", sentenceDescription=" + m0Var + ")";
    }
}
