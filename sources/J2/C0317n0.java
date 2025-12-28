package J2;

import H2.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.serialization.MissingFieldException;

/* renamed from: J2.n0  reason: case insensitive filesystem */
public abstract class C0317n0 {
    public static final void a(int i4, int i5, f fVar) {
        o.e(fVar, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i6 = (~i4) & i5;
        for (int i7 = 0; i7 < 32; i7++) {
            if ((i6 & 1) != 0) {
                arrayList.add(fVar.e(i7));
            }
            i6 >>>= 1;
        }
        throw new MissingFieldException((List<String>) arrayList, fVar.b());
    }
}
