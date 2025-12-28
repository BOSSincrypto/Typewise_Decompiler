package J2;

import H2.f;
import H2.m;
import H2.n;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public abstract class Y implements f {

    /* renamed from: a  reason: collision with root package name */
    private final String f678a;

    /* renamed from: b  reason: collision with root package name */
    private final f f679b;

    /* renamed from: c  reason: collision with root package name */
    private final f f680c;

    /* renamed from: d  reason: collision with root package name */
    private final int f681d;

    public /* synthetic */ Y(String str, f fVar, f fVar2, i iVar) {
        this(str, fVar, fVar2);
    }

    public int a(String str) {
        o.e(str, "name");
        Integer m4 = kotlin.text.o.m(str);
        if (m4 != null) {
            return m4.intValue();
        }
        throw new IllegalArgumentException(str + " is not a valid map index");
    }

    public String b() {
        return this.f678a;
    }

    public m c() {
        return n.c.f577a;
    }

    public int d() {
        return this.f681d;
    }

    public String e(int i4) {
        return String.valueOf(i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y3 = (Y) obj;
        if (o.a(b(), y3.b()) && o.a(this.f679b, y3.f679b) && o.a(this.f680c, y3.f680c)) {
            return true;
        }
        return false;
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
        return (((b().hashCode() * 31) + this.f679b.hashCode()) * 31) + this.f680c.hashCode();
    }

    public f i(int i4) {
        if (i4 >= 0) {
            int i5 = i4 % 2;
            if (i5 == 0) {
                return this.f679b;
            }
            if (i5 == 1) {
                return this.f680c;
            }
            throw new IllegalStateException("Unreached");
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
        return b() + '(' + this.f679b + ", " + this.f680c + ')';
    }

    private Y(String str, f fVar, f fVar2) {
        this.f678a = str;
        this.f679b = fVar;
        this.f680c = fVar2;
        this.f681d = 2;
    }
}
