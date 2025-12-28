package J2;

import H2.e;
import H2.f;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.o;

/* renamed from: J2.y0  reason: case insensitive filesystem */
public final class C0338y0 implements f {

    /* renamed from: a  reason: collision with root package name */
    private final String f763a;

    /* renamed from: b  reason: collision with root package name */
    private final e f764b;

    public C0338y0(String str, e eVar) {
        o.e(str, "serialName");
        o.e(eVar, "kind");
        this.f763a = str;
        this.f764b = eVar;
    }

    private final Void f() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public int a(String str) {
        o.e(str, "name");
        f();
        throw new KotlinNothingValueException();
    }

    public String b() {
        return this.f763a;
    }

    public int d() {
        return 0;
    }

    public String e(int i4) {
        f();
        throw new KotlinNothingValueException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0338y0)) {
            return false;
        }
        C0338y0 y0Var = (C0338y0) obj;
        if (!o.a(b(), y0Var.b()) || !o.a(c(), y0Var.c())) {
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
        f();
        throw new KotlinNothingValueException();
    }

    public int hashCode() {
        return b().hashCode() + (c().hashCode() * 31);
    }

    public f i(int i4) {
        f();
        throw new KotlinNothingValueException();
    }

    public boolean isInline() {
        return f.a.b(this);
    }

    public boolean j(int i4) {
        f();
        throw new KotlinNothingValueException();
    }

    /* renamed from: k */
    public e c() {
        return this.f764b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + b() + ')';
    }
}
