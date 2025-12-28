package b3;

import c3.C0500b;
import java.io.EOFException;
import kotlin.jvm.internal.o;
import z2.d;

public abstract class a {
    public static final boolean a(C0500b bVar) {
        o.e(bVar, "<this>");
        try {
            C0500b bVar2 = new C0500b();
            bVar.D(bVar2, 0, d.e(bVar.w0(), 64));
            int i4 = 0;
            while (i4 < 16) {
                i4++;
                if (bVar2.H()) {
                    return true;
                }
                int u02 = bVar2.u0();
                if (Character.isISOControl(u02) && !Character.isWhitespace(u02)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
