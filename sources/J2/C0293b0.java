package J2;

import H2.f;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import u2.l;

/* renamed from: J2.b0  reason: case insensitive filesystem */
public abstract class C0293b0 extends J0 {
    /* access modifiers changed from: protected */
    public abstract String e0(String str, String str2);

    /* access modifiers changed from: protected */
    public String f0(f fVar, int i4) {
        o.e(fVar, "descriptor");
        return fVar.e(i4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g0 */
    public final String Z(f fVar, int i4) {
        o.e(fVar, "<this>");
        return h0(f0(fVar, i4));
    }

    /* access modifiers changed from: protected */
    public final String h0(String str) {
        o.e(str, "nestedName");
        String str2 = (String) Y();
        if (str2 == null) {
            str2 = "";
        }
        return e0(str2, str);
    }

    /* access modifiers changed from: protected */
    public final String i0() {
        if (a0().isEmpty()) {
            return "$";
        }
        return C0718m.Z(a0(), ".", "$.", (CharSequence) null, 0, (CharSequence) null, (l) null, 60, (Object) null);
    }
}
