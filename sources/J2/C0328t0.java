package J2;

import H2.f;
import H2.j;
import H2.m;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: J2.t0  reason: case insensitive filesystem */
public abstract class C0328t0 {
    public static final int a(f fVar, f[] fVarArr) {
        int i4;
        o.e(fVar, "<this>");
        o.e(fVarArr, "typeParams");
        int hashCode = (fVar.b().hashCode() * 31) + Arrays.hashCode(fVarArr);
        Iterable<f> a4 = j.a(fVar);
        Iterator it = a4.iterator();
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i8 = i6 * 31;
            String b4 = ((f) it.next()).b();
            if (b4 != null) {
                i7 = b4.hashCode();
            }
            i6 = i8 + i7;
        }
        for (f c4 : a4) {
            int i9 = i5 * 31;
            m c5 = c4.c();
            if (c5 != null) {
                i4 = c5.hashCode();
            } else {
                i4 = 0;
            }
            i5 = i9 + i4;
        }
        return (((hashCode * 31) + i6) * 31) + i5;
    }
}
