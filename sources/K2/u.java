package K2;

import H2.f;
import androidx.work.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.serialization.json.internal.P;

public final class u extends D {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f859a;

    /* renamed from: b  reason: collision with root package name */
    private final f f860b;

    /* renamed from: c  reason: collision with root package name */
    private final String f861c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj, boolean z3, f fVar, int i4, i iVar) {
        this(obj, z3, (i4 & 4) != 0 ? null : fVar);
    }

    public String b() {
        return this.f861c;
    }

    public final f c() {
        return this.f860b;
    }

    public boolean d() {
        return this.f859a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (d() == uVar.d() && o.a(b(), uVar.b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (c.a(d()) * 31) + b().hashCode();
    }

    public String toString() {
        if (!d()) {
            return b();
        }
        StringBuilder sb = new StringBuilder();
        P.c(sb, b());
        String sb2 = sb.toString();
        o.d(sb2, "toString(...)");
        return sb2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(Object obj, boolean z3, f fVar) {
        super((i) null);
        o.e(obj, "body");
        this.f859a = z3;
        this.f860b = fVar;
        this.f861c = obj.toString();
        if (fVar != null && !fVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
