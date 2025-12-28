package B0;

import androidx.work.c;
import kotlin.jvm.internal.o;

/* renamed from: B0.c  reason: case insensitive filesystem */
public final class C0255c {

    /* renamed from: a  reason: collision with root package name */
    private final C f87a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f88b;

    public C0255c(C c4, boolean z3) {
        o.e(c4, "inferenceResult");
        this.f87a = c4;
        this.f88b = z3;
    }

    public final C a() {
        return this.f87a;
    }

    public final boolean b() {
        return this.f88b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0255c)) {
            return false;
        }
        C0255c cVar = (C0255c) obj;
        if (o.a(this.f87a, cVar.f87a) && this.f88b == cVar.f88b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f87a.hashCode() * 31) + c.a(this.f88b);
    }

    public String toString() {
        C c4 = this.f87a;
        boolean z3 = this.f88b;
        return "RunFullInferenceProcedureResult(inferenceResult=" + c4 + ", compoundNounExit=" + z3 + ")";
    }
}
