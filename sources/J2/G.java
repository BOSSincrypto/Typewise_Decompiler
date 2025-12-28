package J2;

import H2.f;
import java.util.Arrays;
import kotlin.jvm.internal.o;

public final class G extends C0326s0 {

    /* renamed from: m  reason: collision with root package name */
    private final boolean f621m = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public G(String str, F f4) {
        super(str, f4, 1);
        o.e(str, "name");
        o.e(f4, "generatedSerializer");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof G) {
            f fVar = (f) obj;
            if (o.a(b(), fVar.b())) {
                G g4 = (G) obj;
                if (g4.isInline() && Arrays.equals(u(), g4.u()) && d() == fVar.d()) {
                    int d4 = d();
                    int i4 = 0;
                    while (i4 < d4) {
                        if (o.a(i(i4).b(), fVar.i(i4).b()) && o.a(i(i4).c(), fVar.i(i4).c())) {
                            i4++;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode() * 31;
    }

    public boolean isInline() {
        return this.f621m;
    }
}
