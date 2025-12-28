package J2;

import H2.j;
import H2.l;
import H2.m;
import H2.n;
import kotlin.c;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.f;

/* renamed from: J2.y  reason: case insensitive filesystem */
public final class C0337y extends C0326s0 {

    /* renamed from: m  reason: collision with root package name */
    private final m f761m = m.b.f574a;

    /* renamed from: n  reason: collision with root package name */
    private final f f762n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0337y(String str, int i4) {
        super(str, (F) null, i4, 2, (i) null);
        o.e(str, "name");
        this.f762n = c.b(new C0335x(i4, str, this));
    }

    /* access modifiers changed from: private */
    public static final H2.f[] B(int i4, String str, C0337y yVar) {
        H2.f[] fVarArr = new H2.f[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            fVarArr[i5] = l.e(str + '.' + yVar.e(i5), n.d.f578a, new H2.f[0], (u2.l) null, 8, (Object) null);
        }
        return fVarArr;
    }

    private final H2.f[] C() {
        return (H2.f[]) this.f762n.getValue();
    }

    public m c() {
        return this.f761m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof H2.f)) {
            return false;
        }
        H2.f fVar = (H2.f) obj;
        if (fVar.c() == m.b.f574a && o.a(b(), fVar.b()) && o.a(C0315m0.a(this), C0315m0.a(fVar))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i4;
        int hashCode = b().hashCode();
        int i5 = 1;
        for (String str : j.b(this)) {
            int i6 = i5 * 31;
            if (str != null) {
                i4 = str.hashCode();
            } else {
                i4 = 0;
            }
            i5 = i6 + i4;
        }
        return (hashCode * 31) + i5;
    }

    public H2.f i(int i4) {
        return C()[i4];
    }

    public String toString() {
        Iterable b4 = j.b(this);
        return C0718m.Z(b4, ", ", b() + '(', ")", 0, (CharSequence) null, (u2.l) null, 56, (Object) null);
    }
}
