package J2;

import H2.f;
import H2.m;
import H2.n;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public abstract class S implements f {

    /* renamed from: a  reason: collision with root package name */
    private final f f656a;

    /* renamed from: b  reason: collision with root package name */
    private final int f657b;

    public /* synthetic */ S(f fVar, i iVar) {
        this(fVar);
    }

    public int a(String str) {
        o.e(str, "name");
        Integer m4 = kotlin.text.o.m(str);
        if (m4 != null) {
            return m4.intValue();
        }
        throw new IllegalArgumentException(str + " is not a valid list index");
    }

    public m c() {
        return n.b.f576a;
    }

    public int d() {
        return this.f657b;
    }

    public String e(int i4) {
        return String.valueOf(i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s4 = (S) obj;
        if (!o.a(this.f656a, s4.f656a) || !o.a(b(), s4.b())) {
            return false;
        }
        return true;
    }

    public boolean g() {
        return f.a.c(this);
    }

    public List getAnnotations() {
        return f.a.a(this);
    }

    public List h(int i4) {
        if (i4 >= 0) {
            return C0718m.j();
        }
        throw new IllegalArgumentException(("Illegal index " + i4 + ", " + b() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (this.f656a.hashCode() * 31) + b().hashCode();
    }

    public f i(int i4) {
        if (i4 >= 0) {
            return this.f656a;
        }
        throw new IllegalArgumentException(("Illegal index " + i4 + ", " + b() + " expects only non-negative indices").toString());
    }

    public boolean isInline() {
        return f.a.b(this);
    }

    public boolean j(int i4) {
        if (i4 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i4 + ", " + b() + " expects only non-negative indices").toString());
    }

    public String toString() {
        return b() + '(' + this.f656a + ')';
    }

    private S(f fVar) {
        this.f656a = fVar;
        this.f657b = 1;
    }
}
